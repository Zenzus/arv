# arv


Inheritance
This is how you declare that a class in kotlin kan be Inheritantet from 
```open class Animal(val id: Int, var name: String, var alive: Boolean = true, var age : Int ) {
    override fun toString(): String {
        return "ID: "+id.toString() +" Name: "+ name+ " description: "+description+" Living Status: "+alive+ "\n"
    }
    open val description: String
        get() = "This animal is called a $name It's age is $age"
    open fun kill() { alive = false }
    }
```    
