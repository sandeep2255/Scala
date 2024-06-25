// define a class

class Car (var make: String, var model:String, var Year:Int){
  def displayInfo(): Unit={
    println(s"Car Info: $Year - $make $model")
  }
}

// create an object of class car

object SimpleClass extends App{
  val car = new Car("TATA", "Tiago Nrg", 2018)

  car.displayInfo()

  // modify values of class

  car.Year = 2020
  car.displayInfo()

  car.model = "Nexon"
  car.displayInfo()
}