fun main(args: Array<String>) {
    val game=Branch("You are in a dusty castle room.Passages lead to the north and south."){
        WalkNorth() leadsTo TerminalBranch("You are in a dusty castle room.Passages lead to the north and south.")
        WalkSouth() leadsTo TerminalBranch("You are in the armory.There is a room off to the south.")
        WalkEast() leadsTo Branch("""IYou are in a torch-lit hallway.There are rooms to the east and west.""")
        WalkWest() leadsTo TerminalBranxh("You are in a bedroom. A window overlooks the castle courtyard. A hallway is to the west."){
            OpenAction() leadsTo TerminalBranch("A snake pop out of the box and bite you. You die of a painful poisoning!")
            val startOfBridgeref:RefBranch=RefBranch(Branch())
            val startOfBridge=Branch("You are facing a very old bridge."){
                WalkNorth() leadsTo Branch("you are in the middle of a very old bridge"){
                    WalkSouth() leadsTo startOfBridgeref
                    WalkNorth() leadsTo Branch("You are in a dusty castle room. Passages lead to the north and south.")
                    WalkEast() leadsTo Branch("You are in a torch-lit hallway. There are rooms to the east and west.")
                }
            }
            startOfBridgeref.ref=startOfBridge // Little hack to pass a reference to a closure

            WalkNorth() leadsTo startOfBridge
        }
    }
    game.process()
}

interface Action{
    val label:String
    fun accept(input :String):Boolean
}

abstract class SimpleAction(override val label: String):Action{
    override fun accept(input: String) = label == input
}

class OpenAction:SimpleAction("OPEN")
class CloseAction:SimpleAction("CLOSE")
class HitAction:SimpleAction("HIT")

abstract class WalkAction(val direction:String):Action{
    override val label: String = "WALK $direction"
    override fun accept(input: String): Boolean {
        val (iaction,idirection)=input.replace(Regex.fromLiteral(" {2,}")," ").split(" ")
        return iaction=="WALK" && direction==idirection
    }
}

class WalkNorth:WalkAction("NORTH")
class WalkSouth:WalkAction("SOUTH")
class WalkEast:WalkAction("EAST")
class WalkWest:WalkAction("WEST")

interface IBranch {
    val description: String
    val fn: IBranch.() -> Unit
    fun process()

    infix fun Action.leadsTo(brc: IBranch)
}


open class Branch(override val description:String="", override val fn:IBranch.()->Unit={}) : IBranch {
    val actions:MutableList<Pair<Action,IBranch>> = mutableListOf()
    var visited=false
    override fun process()  {
        if (!visited) this.fn()
        visited=true

        println(description)
        print("The following are available:  \n- ${actions.map { it.first.label }.joinToString("\n- ")}\n> ")
        var input= readLine() ?: ""
        var processed  = actions.find { it.first.accept(input) }?.second?.run { process(); true }?:false
        while (!processed){
            input= readLine() ?: ""
            processed = actions.find { it.first.accept(input) }?.second?.run { process(); true }?:false
        }
    }
    override infix fun Action.leadsTo(brc:IBranch){
        actions.add(this to brc)
    }
}

class RefBranch(var ref:Branch=Branch()):IBranch {
    override val fn: IBranch.() -> Unit
        get() = ref.fn
    override val description: String
        get() = ref.description

    override fun process() {
        ref.process()
    }

    override fun Action.leadsTo(brc: IBranch) {
        ref.actions.add(this to brc)
    }

}

class TerminalBranch(val ending:String):Branch(){
    override fun process(){
        println(ending)
    }
}
