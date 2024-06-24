object DataStructuresMethods{
  def main(args:Array[String]):Unit={
    val list_1 = List("apple","cherry","oranges","watermelon")
    val list2=List()

    val firstelement = list_1.head
    val restoflist = list_1.tail
    val lastelement = list_1.last
    val secondelement = list_1(1)

    println(secondelement)

    // check if array is empty
    val islistempty = list_1.isEmpty

    println(islistempty)

    // get the size of list
    val length = list_1.length

    println(length)

    //Adding and removing values from list

    var newList = "guava" :: list_1 // adding in the front
    println(newList)

    newList = newList:+"pinapple" // adding at the end
    println(newList)

    // concatnate with two list

    val list_3 = list_1 ::: List("guava", "pinepapple","pomgrenate")
    println(list_3)
    val list_4 = list_1 ++ List("guava", "pinepapple", "jackfruit")
    println(list_4)

    // removing or dropping values from list from list

    // drop from start of a list
    println(list_3.drop(3))

    // drop a given value

    val updated_list = list_4.filter(_ !="guava")
    println(updated_list)

    val updated_list2 = list_4.diff(List("watermelon", "pineapple"))
    println(updated_list2)

    // Transforming lists
    list_1.map(_*2)
    val list_2 = List(1,2,3,4,5,6)
    list_2.filter(_%2==0)

    val nestedList = List(List(1,2,3),List(4,5,6), List(7))
    val flatList = nestedList.flatMap(identity)
    println(flatList)
    val sum = flatList.reduce(_+_) //aggregate operation
    println(sum)

    val mul = flatList.reduce(_*_)
    println(mul)

    // slicing & subsets of List

    val firstthree = list_1.take(3)
    println(firstthree)

    val lastThree = list_1.takeRight(3)
    println(lastThree)

    val slicing = list_1.slice(1,3)
    println(list_1)
    println(slicing)// slice array from 1 to 3 and 3 not included

    val dropRight = list_1.dropRight(2)
    println(dropRight)

    // convert list to map
    val listofTuples = List(("UST1001", "Krishna"), ("UST1002","Rohit"), ("UST1003", "Adinan"))
    val map = listofTuples.toMap

    // Zipping list

    val zipped_list = list_1.zip(list_2)
    println(zipped_list)

    val newMap = zipped_list.toMap
    println(newMap)

    val (fruits, numbers) = zipped_list.unzip

    println(fruits)
    println(numbers)

    // Sets & Sets Method

    val set1 = Set(1,2,3,4,5,6,7,8)
    val set2 = Set("apple", "orange", "cherry", "watermelon", "guava")

    // check if its inside the set
    println(set1.contains(3))
    println(set1.contains(10))

    // adding and removing a value in set

    println(set1 + 9)
    println(set1 - 8)

    // set operations

    val setA = Set(10,20,30,40,50)
    val setB = Set(30,50, 60,70, 80)

    val unionSet = setA union setB

    val intersection = setA intersect setB

    val difference = setA diff setB

    print(unionSet, intersection, difference)
    // subset Check

    println(setA.subsetOf(setB))

    val valSet = setA.map(_*2)
    println(valSet)

    val reduceSet = setA.reduce(_+_)
    println(reduceSet)

    val filterSet = setA.filter(_ % 2 ==0)
    val filterSet2 = setA.filter(_  !=20)

    println(filterSet)

    setA.foreach(println)
    
    import scala.collection.mutable
    
    
  }
}
