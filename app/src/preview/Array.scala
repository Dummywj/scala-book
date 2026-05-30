package preview

// Array members is mutable.
object Array_ extends App {
    val arr : Array[String] = Array("Concise", "is", "nice")
    arr(0) = "Exact"
    arr.foreach(println)
}
