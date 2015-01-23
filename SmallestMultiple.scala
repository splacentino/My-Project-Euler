package project.euler

import scala.annotation.tailrec

object SmallestMultiple {

  def main(args: Array[String]) = {
    if(args.length > 0 && args(0).matches("[1-9]+"))
      Console println smallestMultiple(args(0).toInt)
    else
      Console println smallestMultiple(20)
  }

  def smallestMultiple(n: Int) = {
    @tailrec def smallestRec(a: Int, dv: Int): Int =
      if (dv == n && a % dv == 0) a
      else if (a % dv != 0) smallestRec(a + 1, 1)
      else smallestRec(a, dv + 1)
    
    smallestRec(n, 2)
  }
}
