package preview

// map 
object Map_ extends App {
    val adj = List("One", "Two", "Red", "Blue")
    val nons = adj.map(a => a + " Fish")
    println(nons)
}
