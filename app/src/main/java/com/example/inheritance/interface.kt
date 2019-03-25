package com.example.inheritance

open class Herbivore (){
    open fun eat(){println ("i eat plants")
    }
}

interface Carnivore {
    fun eat() { println("i eat meat") }

}

class Omnivore() : Herbivore(), Carnivore {
    // The compiler requires f() to be overridden:
    override fun eat() {
        super<Herbivore>.eat() // call to A.f()
        super<Carnivore>.eat() // call to B.f()
    }
}


fun main(args: Array<String>) {
    val human = Omnivore()
    human.eat()


}


