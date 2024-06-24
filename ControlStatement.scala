object ControlStatement{

  def main(args: Array[String]):Unit={
    // Example1 if-else
    import scala.io.StdIn

    println("Enter a Number: ")
    // Ask user to input a value and typecast into integer Datatype
    val x1 = StdIn.readLine().toInt

    if(x1>0){
      println("Value is positive")
    } else if(x1<0){
      println("Value is Negative")
    } else{
      println("Value is Zero")
    }

    // Example -2 Using if-else as an expression
    println("Enter a Number to check: ")
    val x2 = StdIn.readLine().toInt
    val output = if(x2 % 2 == 0) "Number is even" else "Number is odd"
    print(output)

    // Example -3 While loop using Scala
    println("Enter a Number to check: ")
    var x3 = StdIn.readLine().toInt
    while(x3>=0){
      println(s"The value is: $x3")
      x3-=1
    }

    // Example - 4 for loop in scala

    var list_1 = List("Kerala", "Tamil Nadu", "Karnataka", "Maharashtra")
    for (value <- list_1){
      println(value)
    }

    // Example - 5 generate a collection of even numbers

    val numbers = (1 to 50).toList // range of numbers is created
    val even = for {
      num <- numbers
      if num % 2 == 0
    }yield  num
    println(even)
    // yield is keyword in scala to generate new collection from existing one

    // Example -6 Generate a collection of Prime Numbers

    val primes = for{
      num <-2 to 100
      if(2 until (math.sqrt(num).toInt+1)).forall(x=>num%x!=0)
    }yield num

    println(primes.mkString(","))
  }
}
