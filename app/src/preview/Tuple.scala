package preview

// tuples are immutable
object Tuple extends App {
    val person = ("Cherry", 18)
    println(person)
    println(person._1 + person._2)
}
