object Quicksort {

  def quickSort(l: Array[Int]): Array[Int] = {

    def swap(l: Array[Int], x: Int. y: Int): Array[Int] = {
      def loop(l: Array[Int], n: Array[Int], x: Int, y: Int, i: Int): Array[Int] = {
        if(i >= l.size) n
        else if(i == x) loop(l, n :+ l(y), x, y, i+1)
        else if(i == y) loop(l, n :+ l(x), x, y, i+1)
        else loop(l, n :+ l(i), x, y, i+1)
      }
      loop(l, Array[Int](), x, y, 0)
    }

    def go
    

  }

  def main(args: Array[String]) = {
    println("Working")
  }

}
