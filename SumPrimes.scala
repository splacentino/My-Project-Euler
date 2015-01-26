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
/*
    @tailrec def primesLs(a: Long, primes: List[Long]): List[Long] =
      if (a * a >= n) primes
      else if (primes.forall(x => a % x != 0)) primesLs(a + 2, a :: primes)
      else primesLs(a + 2, primes)

    @tailrec def keepPrimes(a: Long, primes: List[Long], numbers: List[Long]): List[Long] = 
      if (a >= n) primes ++ numbers
      else if (primes.forall(x => a != x && a % x != 0)) keepPrimes(a + 2, primes, a :: numbers)
      else keepPrimes(a + 2, primes, numbers)
*/
    // OR
    
    @tailrec def primesSt(a: Long, primes: Stream[Long]): Stream[Long] =
      if (a * a >= n) primes
      else if (primes.forall(x => a % x != 0)) primesSt(a + 2, Stream(a) ++ primes)
      else primesSt(a + 2, primes)
    @tailrec def select(a: Long, primes: Stream[Long], numbers: Stream[Long]) : Stream[Long] =
      if (a >= n) primes ++ numbers
      else if (primes.forall(x => a != x && a % x != 0)) select(a + 2, primes, a #:: numbers)
      else select(a + 2, primes, numbers)

    //if (n > 2) keepPrimes(3, primesLs(3, 2 :: Nil), Nil).sum
    if (n > 2) select(3, primesSt(3, Stream(2)), Stream()).sum
    else sys.error("Not any prime factor")
  }
}
