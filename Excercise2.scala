import scala.io.StdIn
object Excercise2{

  def bankingMenu():Unit={
    val menu_list = "Create a banking Menu, Option 1 Check balance, option 2 withdraw amount, option 3 Deposit, option 4 Exit"

      var continue = true
      import scala.collection.mutable
      var balance = 1000
      while (continue) {
        println(menu_list)
        val option = StdIn.readInt()

        if (option == 1){
          println(s"The bank balance is: ${balance}")
          println("Do you want to continue?")
          val choice = StdIn.readLine().toUpperCase
          continue = if(choice=="Y") true else false
        }
        else if(option ==2){
          println("Enter the amount to withDraw: ")
          val value = StdIn.readInt()
          if(balance > 0 & value <= balance & value > 0) {
            balance -= value
          }else if(value<0){
            println("Enter a valid Amount")
            continue = false
          }else{
            println("Insufficient Amount")
          }
          println(s"The available balance is: ${balance}")
          println("Do you want to continue? Y/N")
          val choice = StdIn.readLine().toUpperCase
          continue = if (choice == "Y") true else false
        }else if(option==3){
          println("Enter the amount to Deposit: ")
          val value = StdIn.readInt()
          if (value < 0) {
            println("Enter a valid Amount")
            continue = false

          }else {
            balance += value
            println(s"The available balance is: ${balance}")
          }
          println("Do you want to continue? Y/N")
          val choice = StdIn.readLine().toUpperCase
          continue = if (choice == "Y") true else false
        }else{
          println("Enter a valid option")
          continue = false
        }
      }
  }
  def main(args:Array[String]):Unit={

    bankingMenu()
  }
}