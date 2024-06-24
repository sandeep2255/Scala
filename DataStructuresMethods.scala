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

    // Arrays



    val array1 = Array("kochi", "varkala", "thiruvananthapuram", "alappuzha")
    val array2 = Array(1,2,3,4,5,6,7,8)
    // empty array
    val emptyArray = Array[Int]()
    array2(0) = 10
    array2.length
    emptyArray.isEmpty
    // array2+=9 // adding a value to array IS NOT possible in Array data type in scala becuase its fixed size
    // to so import in array we had ArrayBuffer instead of array

    import scala.collection.mutable.ArrayBuffer

    // adding elements (Arrays are fixed size, so we use ArrayBuffer)

    val arrayBuffer = ArrayBuffer(1,2,3,4,5,6,7)

    arrayBuffer+=8
    arrayBuffer-=5

    print(arrayBuffer)

    arrayBuffer.map(_*2)
    arrayBuffer.filter(_!=2)
    arrayBuffer.foreach(println)
    val array_casted  = arrayBuffer.toArray // type casting back to Array


    // Nested Array
    val nested_array = Array(Array(1,2), Array(3,4), Array(5,6))
    val flatArray2 = nested_array.flatMap(identity)
    val flatArray3 = nested_array.flatten

    flatArray3.slice(1,5)

    val array4 = Array(30,40,10,80,60,20,50)
    array4.sorted
    array4.reverse

    println(array4.reverse.mkString(","))

    // groupBy method in scala
    val cityNames = Array("kochi", "varkala", "thiruvananthapuram", "alappuzha")
    val groupbyLen = cityNames.groupBy(_.length)
    println(groupbyLen)
    val groupbyFirstChar = cityNames.groupBy(_.charAt(0))
    val groupbyOddEven = flatArray3.groupBy(num=>if(num%2==0) "even" else "odd")

    groupbyOddEven.foreach{
      case(key,value)=>println(s"$key:${value.mkString(",")}")
    }

    val nameArray = Array("Sandeep", "Athulya", "Ram", "Earl", "Omkar", "Shiva")

    val groupByFChar = nameArray.groupBy(name=>if("AEIOUaeiou".contains(name.charAt(0))) "Vowels" else "Consonents")
    groupByFChar.foreach {
      case (key, value) => println(s"$key:${value.mkString(",")}")
    }
    // Collection - Map
    import scala.collection.immutable
    val immutableMap = immutable.Map("a"->1, "b"->2,"c"->3, "d"->4, "e"->5)


    import scala.collection.mutable
    val mutableMap = mutable.Map("a"->1, "b"->2,"c"->3, "d"->4, "e"->5)

    immutableMap.contains("a")
    println(immutableMap("a"))

    // concat two maps

    val mapA = Map("a"->1, "b"->2,"c"->3)
    val mapB = Map("d"->4, "e"->5, "b"->6)
    val mergedMap = mapA ++ mapB

    println(mergedMap)

    //Transoform the keys and transform the values

    val incrementValue = immutableMap.mapValues(_ +1)
    val transformKey = immutableMap.map{case(k,v)=>(k.toUpperCase, v)}
    println(transformKey)
    incrementValue.foreach {
      case (key, value) => println(s"$key->$value")
    }
  }
}
