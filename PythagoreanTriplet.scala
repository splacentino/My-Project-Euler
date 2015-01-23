package project.euler

import scala.annotation.tailrec

object PythagoreanTriplet {

  def main(args : Array[String]) = 
    if (args.length > 0 && args(0).matches("\\d+"))
      Console println triplet(args(0).toInt)
    else
      Console println triplet(1000)

  def triplet(n : Int) = {
    @tailrec def tripletRec(a: Int, b: Int, c: Int): Int = 
      if (a >= c || a + 1 == c) 0
      else if (b >= c) tripletRec(a + 1, a + 2, n - (a + 1) - (a + 2))
      else if ((a + b + c == n) && (a * a + b * b == c * c)) a * b * c
      else tripletRec(a, b + 1, c - 1)
    
    tripletRec(0, 1, n - 1)
  }
}
