open class Animal(val id: Int, var name: String, var alive: Boolean = true) {
    override fun toString(): String {
        return id.toString() +" Name: "+ name+ " description: "+description+"\n"
    }
    open val description: String
        get() = "This animal is called a $name"
    open fun kill() { alive = false }
    }


open class Felidae(id: Int, name: String, alive: Boolean = true, val growlingPitch: String) : Animal(id, name, alive) {
    override fun toString(): String {
        return "ID: "+id+" "+ description+ " "+ "Alive Status: "+alive+"\n"
    }
    override val description: String
        get() = "The Felidae name is $name and it's growling pitch is $growlingPitch"
    }


class Cat(id: Int, name: String, alive: Boolean = true, growlingPitch: String,  var livesLeft: Int = 9) : Felidae(id, name, alive, growlingPitch) {


    override fun toString(): String {
        return "ID: "+id+" "+ description+"\n"
    }

    override val description: String
        get() = "This is the cat $name, who still has $livesLeft lives and it's growling pitch is $growlingPitch"

    override fun kill() {
        if (livesLeft > 0) livesLeft--
        if (livesLeft == 0) alive = false
        }
    }
class Tiger(id: Int, name: String, alive: Boolean = true, growlingPitch: String ) : Felidae(id, name, alive,growlingPitch) {
  
    override val description: String
        get() = "This is the tigers $name, it's growling pitch is $growlingPitch"+"\n"

   
    }

    
val animals = mutableListOf(
    Cat(1, "Felix",growlingPitch = "c4"),
    Tiger(2, "Rufus", growlingPitch = "C10"),
    Tiger(3, "Kvast V", growlingPitch = "D3"),
    Animal(4, "Killer"),
    Cat(5, "Pusser", livesLeft = 5,growlingPitch = "c4"),
    Cat(6, "Pelle Haleløs",growlingPitch = "c2")
)

fun main(args: Array<String>) {
    println(animals.toString())
}
