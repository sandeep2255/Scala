object DataStructuresMethods{
  def main(args:Array[String]):Unit={
    val list_1 = List("apple","cherry","oranges","watermelon")
    val list2=List()

    val firstelement = list_1.head
    val restoflist = list_1.tail
    val lastelement = list_1.last
    val secondelement = list_1(1)

    println(secondelement)
  }
}
