import scala.collection.mutable

// Collections in scala Programming
object DataStructure{

  def main(args: Array[String]):Unit={
    // lists: Immutable collection of Data
    val fruits: List[String] = List("apple", "orange", "watermelon","grapes", "guava")
    println("First Element: " + fruits.head)
    println("Value excluding the first element: " + fruits.tail)
    println("Last Element: " + fruits.last)
    println("all elements"+ fruits)
    val List1 = List("Hadoop", "Spark", true, 3.141356, 2000)
    println("all items in list 1" + List1)
    println(List1.getClass) //class scala.collection.immutable.$colon$colon

    // Empty List Declaration
    val emptyList:List[Nothing] = List()

    // Array Data Type: Array is mutable fixed size collection of data structures
    // Homogenous collection,

    val arrayData: Array[String] = Array("apple", "orange", "watermelon", "grapes", "guava")

    // print element output in new line

    arrayData.foreach(println)
    println(arrayData.mkString(","))

    arrayData(0) = "banana"

    println(arrayData.mkString(","))

    // Declare an empty array
    val arr_1 = new Array[String](10)

    //Declare a 2-Dim array. can update the value even if we declared as val or var
    val arr_2 = Array.ofDim[Int](2,2)
    arr_2(0)(0)=234
    arr_2(0)(1)=135
    arr_2(1)(0)=911
    arr_2(1)(1)=102

    // Print the array
    val flattenArr: Array[Int] = arr_2.flatten

    println(flattenArr.mkString(","))

    // update in 2-d array

    arr_2(0)(1)=111
    val flattenArr2: Array[Int] = arr_2.flatten
    println(flattenArr2.mkString(","))

    // list declaration

    val List2 = 10::20::30::40::Nil

    // Create a list buffer of type mutable
    import scala.collection.mutable.ListBuffer

    var cities = new ListBuffer[String]()
    cities += "Kochi"
    cities += ("Alappuzha", "pathanamthitta")
    cities -= "Kochi"
    cities += "Thiruvananthapuram"

    println(cities)
    println(cities.last)
    println(cities.head)

    val city = cities.toList // Type casting in scala is done by toDataType() function

    println(city)

    // Set Collection: Immutable collection
    // HashSet : Mutable Collection of sets

    val set_1 : Set[String] = Set("val 1", "val 2", "val 3")
    val set_2 = Set(1,2,3,4)

    import scala.collection.mutable.Set

    val mutableSet = mutable.Set("val 1", "val 2", "val 3")
    mutableSet+="val 4"
    mutableSet-="val 1"
    println(mutableSet)

    // Tuple declaration - immutable
    // In scala tuple is a fixed size, can hold multiple data type

    val Tuple_1 = (10,20,30,40,50,60,70,80)
    // Tuple_1._1 = "String" - Update will fail as the immutable property of the Tuple
    println(Tuple_1._2) // accessing individual value, index start from 1
    println(Tuple_1)

    // Map Data collection: (key, Value) pair, Keys are unique & values could be duplicate,
    // Similar to dictionary in python
    import scala.collection.immutable.Map

    val emptyMutableMap: Map[String, Int] = Map()
    val mutableMap: Map[String, Int] = Map("val1"->1,"Val2"->2, "Val3"->3)
    println(mutableMap)
    println(mutableMap.contains("val1"))
    println(mutableMap.get("val1"))
    println(mutableMap.mkString(","))

    import scala.collection.mutable.Map

    var emptyMutableMap2: mutable.Map[String, Int] = mutable.Map()
    var mutableMap2: mutable.Map[String, Int] = mutable.Map("val1" -> 1, "Val2" -> 2, "Val3" -> 3)
    println(mutableMap2)
    println(mutableMap2.contains("val1"))
    //Access values using keys
    println(mutableMap2.get("val1"))
    // print all keys
    println(mutableMap2.keys)
    // print all values
    println(mutableMap2.values)
    // update existing key value pair
    mutableMap2("val1")=10
    // insert a new key value pair
    mutableMap2 += ("val4"->11)
    mutableMap2 -= ("Val3")
    // print all keys
    println(mutableMap2.keys)
    // print all values
    println(mutableMap2.values)
  }
}
