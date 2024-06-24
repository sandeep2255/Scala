object Iterators{

  def main(arg:Array[String]):Unit={
    // Iterators in Scala Programming
    // An iterators in Scala represent a sequence of elements
    // that allows you to traverse through a collection sequentially

    val MyList = List(20,30,40,50,60,70,80,90)
    val iter = MyList.iterator

    // Method of iterator to check if there is more elements (.hasNext())
    // to remove any elements from mutable iterators- .remove()
    // to retrieve next value - .next()

    println(iter.next())
    println(iter.next())


    // lazy initialization using scala

    lazy val eval_value: Int = 100
    println(eval_value * 5)

    // lazy can't be used with var
    // lazy var eval_val: Int = 20

  }
}
