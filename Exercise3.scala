import scala.io.Source

object Exercise3 {
  def main(args: Array[String]): Unit = {
    //1. state with heighest GDP contribution
    //2. average percapita
    //3. total gdp

    val filePath = "C:\\Users\\Administrator\\Desktop\\Training\\StatewiseGDP.csv"

    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    source.close()

    val headers = lines.head.split(",").map(_.trim)

    val data = lines.tail.map { line =>
      val values = line.split(",").map(_.trim)
      headers.zip(values).toMap

    }
    var maxGdp = data.map(_("gdp").toInt).toList.max


    val maxGdpState = data.filter(state=>state("gdp")==maxGdp.toString)
    println(s"The state with maximum GDP contribution is: ${maxGdpState.head("State")}")

    var SumPerCapita = data.map(_("per_capita").toInt).toList.sum
    var totalPerCapita = data.map(_("per_capita").toInt).toList.length

    val averagePercapita = SumPerCapita.toDouble / totalPerCapita

    println(s"Average percapita of all the states will be: $averagePercapita")

    var totalGdp = data.map(_("gdp").toInt).toList.sum

    println(s"Total gdp of India is: $totalGdp")



  }
}