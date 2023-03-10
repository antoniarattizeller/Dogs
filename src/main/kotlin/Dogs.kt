class Dogs (val name: String,
            weight_param: Int,
            breed_param: String) {

    init {
        println("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.uppercase()

    init {
        println("The breed is $breed. ")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double //adds a new weightInKgs property with a custom getter
        get() = weight/2.2

    fun bark() {
        println(if(weight<20) "Yip" else "Woof")
    }

}
