object RecursiveFunction{
  def main(args:Array[String]): Unit={
    def factorial(num: Int):Int={
      if(num==0) 1
      else num*factorial(num-1)
    }
    val fact = factorial(6)

    print(fact)
  }
}