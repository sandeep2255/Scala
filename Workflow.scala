
object Workflow{
  def main(args: Array[String]): Unit = {
    // 1. Map function
    // Map function transforms each element of a collection using given function
    val numbers = List(1,2,3,4,5,6,7,8,12)
    val changeList = numbers.map(_*2)
    println(changeList)

    val newList = numbers.map(_+" number")
    println(newList)

    val words = List("Thiruvananthapuram", "Pathanamthitta","Alappuzha", "Kochi", "Idukki")
    val totalLength = words.map(_.length)
    println(totalLength)

    // 2. flatmap: This function flattens multi dimensional collection into a single collection

    val nestedList = List(List(1,2,3), List(4,5,6), List(7,8))

    val newFlatList = nestedList.flatMap(identity)
    println(newFlatList)

    val sentences = List("Hello Scala you are awsome", "Scala is powerful")

    val SentenceWords = sentences.flatMap(_.split(" ")).toList

    println(SentenceWords)

    // 3. Filter: It selects element from collection that satisfy a given condition

    val filtered_words = SentenceWords.filter(_.length >= 5)
    println(filtered_words)

    // 4.fold: This is similar to reduce function starting with an initial value.

    val sumOfUnitDigitNumbers = numbers.fold(0)(_+_)
    println(sumOfUnitDigitNumbers)

    // Reduce: This function combines the elements of collection,
    // but doesn't require any initial position

    val words2 = List("UST", "is", "best")
    val combination = words2.reduce(_+ " "+_)
    println(combination)

    //6. This applies a given procedure to each element of a function

    words.foreach(word=>println(word.toUpperCase))

    //7. Collect: The collect function applies a partial function  to the elements of
    // collection, returning a new collection.

    val number1 = List(1,2,3,4,5,6,7,8,9,10)
    val oddNumbers = number1.collect{case x if x % 2 != 0 =>x}
    println(oddNumbers)

    val words3 = List("Thiruvananthapuram", "Pathaanamthitta", "Kollam", "Alappuzha", "Goa", "Delhi")

    val largeWords = words3.collect{case x if x.length > 5 => x}

    println(largeWords)

    // 8. Partition: This function will split the collections into two part
    // based on predicate

    val (longWords, shortWords) = words3.partition(_.length>5)

    println(shortWords)
    println(longWords)

    //9. GroupBy: Groups a collection based on a given function

    val num = List(12,13,14,15,16,17,18,19)

    val evenOrOdd1 = num.groupBy(_%2 == 0)
    println(evenOrOdd1)

    val evenOrOdd = num.groupBy(num => if(num%2==0) "even" else "odd")
    println(evenOrOdd)

    //10. Scan: The scan function is similar to fold but it returns a collection
    // of successive cumulative values of binary operation or condition we
    // have implemented

    val cumulative_sum = num.scan(0)(_+_)
    println(cumulative_sum)
    
  }
}