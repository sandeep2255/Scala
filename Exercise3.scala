import scala.io.Source

object Exercise3 {
  def main(args: Array[String]): Unit = {
    //1. state with heighest GDP contribution
    //2. average percapita
    //3. total gdp

    val filePath = "C:\\Users\\Administrator\\Desktop\\Training\\percapita.csv"

    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    source.close()

    val headers = lines.head.split(",").map(_.trim)

    val data = lines.tail.map { line =>
      val values = line.split(",").map(_.trim)
      headers.zip(values).toMap

    }

    println(data.flatMap(_))
  }
}