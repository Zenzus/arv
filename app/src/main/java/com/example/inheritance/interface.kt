package com.example.inheritance


open class Herbivore(val age:Int) {
    open fun eat(){println ("i eat plants")}

}

interface Carnivore{
    fun eat() { println("i eat meat") }

}

open class Omnivore(age:Int,name: String) : Herbivore(age), Carnivore {
    override fun eat() {
        super<Herbivore>.eat() // call to A.f()
        super<Carnivore>.eat() // call to B.f()
    }
}

fun main(args: Array<String>) {
    val human = Omnivore(21,"Jonas")
    human.eat()
}


