package preview

object Foreach extends App {
    val str : String = "Concise is nice."
    val arr : Array[String] = Array("Concise", "is", "nice")
    str.foreach(i => println(i))
    arr.foreach(i => println(i))
    arr.foreach(println)
}
