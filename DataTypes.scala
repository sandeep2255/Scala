// object is singleton instance that is lazily initialized when it is first accessed.
// it is similar to class but for this only on instance is created automatically that's why
// it is called singleton instance.
object DataTypes{
  // main is the entry gate for any scala application.
  // Unit defines the return data type of 'main' indicating that it returns nothing
  def main(args: Array[String]):Unit={
    // integer data type declaration
    val intNum: Int = 20
    val longNum: Long = 1234567890L
    val shortNum: Short = 32756
    val byteNum: Byte = 127

    //Floating Datatypes
    val FloatingNum: Float = 3.14f
    val doubleNum: Double = 3.14159364729

    // String Datatype
    val stringVariable: String = "Hello Scala"

    //character Datatype
    val charVariable: Char = 'A'

    // Unit Datatype
    val unitVariable: Unit = ()

    // print values
    println("Integer : "+ intNum)
    println(s"Integer : $intNum")
    println(s"Long : $longNum")
    println(s"Short : $shortNum")
    println(s"Byte : $byteNum")
    println(s"Float: $FloatingNum")
    println(s"Double: $doubleNum")
    println(s"String: $stringVariable")
    println(s"char: $charVariable")
    println(s"Unit: $unitVariable")

    // mutable Data types
    // Boolean Data types
    var boolVar: Boolean = true
    var intVar: Int = 1234
    print("Boolean: "+boolVar)
    println()
    print("Integer Variable: " + intVar)
    println()
    // update item in mutable variable
    intVar = intVar + 1000
    println("Updated Value of Integer: " + intVar)

  }
}