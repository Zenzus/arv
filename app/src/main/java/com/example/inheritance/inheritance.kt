package com.example.inheritance

open class Animal(val id: Int, var name: String, var alive: Boolean = true, var age : Int ) {
    override fun toString(): String {
        return "ID: "+id.toString() +" Name: "+ name+ " description: "+description+" Living Status: "+alive+ " Age:"+age + "\n"
    }
    open val description: String
        get() = "This animal is called a $name It's age is $age"
    open fun kill() { alive = false }
    }


open class Felidae(id: Int, name: String, alive: Boolean = true, val growlingPitch: String, age:Int ) : Animal(id, name, alive,age) {

    override fun toString(): String {
        return "ID: "+id+" "+ description+ " "+ "Alive Status: "+alive+"\n"
    }
    override val description: String
        get() = "The Felidae name is $name It's age is $age, and it's growling pitch is $growlingPitch"
    }


class Cat(id: Int, name: String, alive: Boolean = true, growlingPitch: String,  var livesLeft: Int = 9, age: Int) : Felidae(id, name, alive, growlingPitch,age) {


    override fun toString(): String {
        kill()
        return "ID: "+id+" "+ description+" Living Status: "+alive+"\n"
    }

    override val description: String
        get() = "This is the cat $name, who still has $livesLeft lives. It's age is $age, and it's growling pitch is $growlingPitch"

    override fun kill() {
        if (livesLeft > 0) livesLeft--
        if (livesLeft == 0) alive = false
        }
    }
class Tiger(id: Int, name: String, alive: Boolean = true, growlingPitch: String, age : Int ) : Felidae(id, name, alive,growlingPitch, age) {
  
    override val description: String
        get() = "This is the tigers $name, It's age is $age it's growling pitch is $growlingPitch"+"\n"

   
    }

    
val animals = mutableListOf(
    Cat(1, "Felix",growlingPitch = "c4",age = 1),
    Tiger(2, "Rufus", growlingPitch = "C10",age = 2),
    Tiger(3, "Kvast V", growlingPitch = "D3",age = 3),
    Animal(4, "Killer",age = 4),
    Cat(5, "Pusser", livesLeft = 5,growlingPitch = "c4",age = 5),
    Cat(6, "Pelle Haleløs",growlingPitch = "c2",age = 6) ,
    Cat(7, "Ddd", livesLeft = 0,growlingPitch = "c2",age = 7)
)

fun main(args: Array<String>) {
    println(animals.toString())
}
