package com.example.practicekotlin.Class

interface Car {
    fun mileage() : String
}

class Mercedes : Car {
    override fun mileage() : String {
        return "The mileage of Mercedes is 47 km/l"
    }
}

class Benz : Car {
    override fun mileage(): String {
        return "The mileage of Mercedes is around 16.9 km/l"
    }
}

class BMW : Car {
    override fun mileage(): String {
        return "The mileage of Mercedes is 47 km/l"
    }

}
