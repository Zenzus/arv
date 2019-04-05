# arv


Inheritance
This is how you declare that a class in kotlin kan be Inheritantet from with the "open" modifier
```open class Animal(val id: Int, var name: String, var alive: Boolean = true, var age : Int ) {
    override fun toString(): String {
        return "ID: "+id.toString() +" Name: "+ name+ " description: "+description+" Living Status: "+alive+ "\n"
    }
    open val description: String
        get() = "This animal is called a $name It's age is $age"
    open fun kill() { alive = false }
    }
```    

Overriding Methods
the way to override methods from the superclass is also with the open modifier as seen above. If the superclass methods does not have a open modifier the subclass can not override the given method.



Calling from the superclass
a way you can call methods from the superclass in the subclass is with the keyword "super" as seen in the code below 
```
open class Herbivore(val age:Int) {
    open fun eat(){println ("i eat plants")}

}

interface Carnivore{
    fun eat() { println("i eat meat") }

}

open class Omnivore(age:Int,name: String) : Herbivore(age), Carnivore {
    override fun eat() {
        super<Herbivore>.eat() // call to Herbivore.eat()
        super<Carnivore>.eat() // call to Carnivore.eat()
    }
}
``` 
Overriding with inheritance and interfaces
it's fine to inherit from both inheritance and a interface but the problem comes when both of them have a method with the same name this can be fixed with the useing super qualified by the supertype name in angle brackets "super<>" as seen above.
