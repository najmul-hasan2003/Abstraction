abstract class Vehicle{
    abstract fun start()
    fun stop(){
        println("Vehicle is stopping...")
    }
}

class Car : Vehicle(){
    override fun start() {
        println("Car is starting...")
    }
}

class Bus : Vehicle(){
    override fun start() {
        println("Bus is running...")
    }
}

class Driver : Vehicle(){
    override fun start() {
        println("Drive the car and Bus ")
    }
}
fun main() {
//Objects of an abstract class cannot be created.
    val myCar = Car()
    val myBus : Bus = Bus()
    val myDriver: Driver = Driver()

    myDriver.start()
    myDriver.stop()

    myBus.start()
    myBus.stop()

    myCar.start()
    myCar.stop()
}