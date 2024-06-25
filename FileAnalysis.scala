import scala.io.Source

object FileAnalysis{
  def main(args:Array[String]):Unit={
    val filePath = "C:\\Users\\Administrator\\IdeaProjects\\scala_training\\src\\main\\scala\\tourism.txt"
    // read the file from path
    val source = Source.fromFile(filePath)
    // read all lines from the files
    val lines = source.getLines().toList
    source.close()

    // count words

    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)
    val grouped_words = words.groupBy(identity)
    val word_count = grouped_words.mapValues(_.size).toSeq.sortBy(-_._2)

    //1. get most frequent word count
    word_count.take(10).foreach {
      case (key, value) => println(s"$key -> $value")
    }

    //2. Average word length

    val totalWords = words.length
    val totalChars = words.map(_.length).sum
    val avgWordLength = if(totalWords>0) totalChars.toDouble / totalWords else 0.0
    println(s"average length of words is: $avgWordLength")
  }
}