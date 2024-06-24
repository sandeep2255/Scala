object Exercise1{

  def main(arg:Array[String]):Unit={
    //Task 1 : Processing and filtering Data
    // Sample Record = (Product name, unit price, Discount, quantity)
    // 1. Filter out products that have price greater than $50
    // 2. Calculate total cost of each product
    // 3. Print the name of product that has exceeded total cost greater than $300

    var Products = List(("Onion", 10, 0.2f, 2), ("Tomato", 70, 0.1f, 5), ("Horlicks", 450, 0.1f, 3))

    val list_pro = for{
      num<-Products
      total = num(1)*num(3)
      if(total-(total*num(2))>50)
    }yield num

    println("item with total cost greater than $50: "+ list_pro)

    val list_pro2 = for {
      num <- Products
      total = num(1) * num(3)
      total_after_discount = total - (total*num(2))
    } yield total_after_discount

    println("Total cost of each product: " + list_pro2)

    val list_pro3 = for {
      num <- Products
      total = num(1) * num(3)
      if(total-(total*num(2))>300)
    } yield num

    println("item with total cost greater than $300: " + list_pro3)
  }
}