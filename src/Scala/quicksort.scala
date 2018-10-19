import scala.util.Random._

object Quicksort {

  def quickSort(l: Array[Int]): Array[Int] = {

    def findBig(ls: Array[Int]) = 
      for(y <- 0 to ls.size -2 if ls(y) > ls.last) yield ls(y)

    def findSmall(ls: Array[Int]) = 
      for(y <- 0 to ls.size -2 if ls(y) <= ls.last) yield ls(y)

    if(l.size <= 1) l 
    else quickSort(findSmall(l).toArray) ++ Array(l.last) ++ quickSort(findBig(l).toArray)
  }

  def main(args: Array[String]) = {
    println("QuickSort in Scala")
    val testData = (for(y <- 0 to 25) yield nextInt(1000000)).toArray
    println("Unsorted:")
    println(testData.mkString(" "))
    val res = quickSort(testData)
    println("Sorted:")
    println(res.mkString(" "))
  }

}
