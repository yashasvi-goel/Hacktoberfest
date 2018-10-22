import scala.util.Random._

object Bubblesort {

  def bubbleSort(array: Array[Int]): Array[Int] = {

      def go(a: Array[Int], i: Int): Array[Int] = {
          (a, i) match {
          case (a, i) if i+1 >= a.length => a
          case (a, i) if(a(i) > a(i+1)) => go(a.patch(i, Array(a(i+1), a(i)), 2), 0)
          case (a, i) => go(a, i+1)
          }
      }

      go(array, 0)
  }

  def main(args: Array[String]) = {
    println("Bubblesort in Scala")
    val testData = (for(y <- 0 to 25) yield nextInt(1000000)).toArray
    println("Unsorted:")
    println(testData.mkString(" "))
    val res = bubbleSort(testData)
    println("Sorted:")
    println(res.mkString(" "))

  }

}
