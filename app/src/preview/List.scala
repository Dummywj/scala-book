package preview

// List members is immutable.
object List_ extends App {
    val nums1 = List(1, 2, 3)
    val nums2 = List(4, 5, 6)
    val nums = nums1 ::: nums2
    nums.foreach(println)
}
