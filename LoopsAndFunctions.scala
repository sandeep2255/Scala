object LoopsAndFunctions {
  def main(args: Array[String]): Unit = {
    var j = 1

    // do-while loop (new syntax) - version 3.3.3
    while {
      println(j)
      j += 1
      j <= 5
    }do()

    // for loop with range and with step size = 2

    for (i<-1 to 10 by 2){
      println(i)
    }

    // itrating over a collection
    val fruits = List("apples","cherry","oranges","pineapple", "strawberry")

    for(fruit <- fruits){
      println(fruit)
    }

    // Complex conditions
    import scala.io.StdIn
    println("Enter the temperature: ")
    val temperature = StdIn.readInt()
    println("Enter the humidity: ")
    val humidity = StdIn.readInt()

    val weatherDesc = if(temperature>30 & humidity>60){
      "Hot and Humid"
    } else if(temperature>=40 & humidity < 60){
      "Hot"
    }else if(humidity>70 & temperature < 25){
      "Humid"
    }else{
      "Pleasant"
    }
    println(weatherDesc)

    def add(a:Int, b:Int): Int={
      a+b
    }

    // Anonymous Functions like lambda
    val summation = (a:Int, b:Int)=>a+b
    println(summation(5,6))

    // problem 1: Find the Maximum element in a list
    def findMax(lst: List[Int]):Int={
      lst.max
    }

    val arr=List(1,10, 6,2,20)
    val maxNumber = findMax(arr)
    print(maxNumber)
  }
}
