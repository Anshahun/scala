package temp

object Test {

  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3)
    arr(0) = 2
    println(arr.mkString(","))
    val l = List(1,2,3)
    l(1) = 3
    println(l.mkString(","))
  }

}
