package project.euler

import scala.annotation.tailrec

object SumSquareDiff {
  def main(args : Array[String]) = {
    if(args.length > 0 && args(0).matches("\\d+"))
      Console println sumSquare(args(0).toInt)
    else
      Console println sumSquare(1000)
  }

  def sumSquare(n : Int) = {
    @tailrec def sumSquareRec(a: Int, sq: Int, acc: Int): Int =
      if(a > n) ((acc * acc) - sq)
      else sumSquareRec(a + 1, (sq + (a * a)), acc + a)

    sumSquareRec(1, 0, 0)
  }
}
