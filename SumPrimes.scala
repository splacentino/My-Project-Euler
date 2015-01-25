package project.euler

import scala.annotation.tailrec

object SumPrimes {
  def main(args : Array[String]) = {

    if (args.length > 0 && args(0).matches("\\d+"))
      Console println sumPrimes(args(0).toLong)
    else
      Console println sumPrimes(10)
  }

  def sumPrimes(n : Long) = {

    @tailrec def primesRec(a: Long, primes: List[Long]): List[Long] =
      if (a * a >= n) primes
      else if (primes.forall(x => a % x != 0)) primesRec(a + 2, a :: primes)
      else primesRec(a + 2, primes)

      @tailrec def rmPrimesRec(a: Long, primes: List[Long], numbers: List[Long]): List[Long] = 
        if (a >= n) primes ++ numbers
        else if (primes.forall(x => a != x && a % x != 0)) rmPrimesRec(a + 2, primes, a :: numbers)
        else rmPrimesRec(a + 2, primes, numbers)

      if (n > 2) rmPrimesRec(3, primesRec(3, 2 :: Nil), Nil).sum
      else sys.error("Not any prime factor")
  }
}
