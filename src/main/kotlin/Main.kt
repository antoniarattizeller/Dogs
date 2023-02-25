fun main(args: Array<String>) {
    //create a new dog from Dogs Class
    val myDog = Dogs("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    //using the getter weightInKgs
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2 //assigning an invalid weight to myDog
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) { //prints all items in the activities array
        println("My dog enjoys $item")
    }

    val dogs = arrayOf(Dogs("Kelpie", 20, "Westie"), Dogs("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")


}