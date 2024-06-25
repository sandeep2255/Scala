
object Workflow{
  def main(args: Array[String]): Unit = {
    // 1. Map function
    // Map function transforms each element of a collection using given function
    val numbers = List(1,2,3,4,5,6,7,8)
    val changeList = numbers.map(_*2)
    println(changeList)

    val newList = numbers.map(_+" number")
    print(newList)
  }
}