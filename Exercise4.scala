object Exercise4{

  def partitionSal(SalaryOfEachEmployees:List[(String,Int)]):(List[(String,Int)], List[(String,Int)])={
    val totalSalaryOfEmployees = SalaryOfEachEmployees.collect{case x => x._2}.sum
    val tenPercentOfTotalSal = totalSalaryOfEmployees * 0.10
    SalaryOfEachEmployees.partition(_._2 >= tenPercentOfTotalSal)
  }
  def main(args:Array[String]):Unit={
    val SalaryOfEachEmployees = List(("Emp1",35000), ("Emp2",20000), ("Emp3",15000), ("Emp4",42000), ("Emp5",56000), ("Emp6",80000), ("Emp7",8000), ("Emp8",100000), ("Emp9",100000), ("Emp10",42000), ("Emp11",8000), ("Emp12",8000))
    val Sal = partitionSal(SalaryOfEachEmployees)
    println("Less salary group is: " + Sal(1).map(value=>value._1).mkString(", "))
    println("High salary group is: " + Sal(0).map(value=>value._1).mkString(", "))
  }
}
