package project.euler

import scala.annotation.tailrec

object SumPrimes {
  def main(args : Array[String]) =  
    if (args.length > 0 && args(0).matches("\\d+"))
      Console println sumPrimes(BigInt(args(0)))
    else
      Console println sumPrimes(10)

  def sumPrimes(n : BigInt) = {

    @tailrec def primesRec(a: BigInt, primes: List[BigInt]): List[BigInt] =
      if (a * a >= n) primes
      else if (primes.forall(x => a % x != 0)) primesRec(a + 1, a :: primes)
      else primesRec(a + 1, primes)

    @tailrec def rmPrimesRec(t: BigInt, b: BigInt, numbers: List[BigInt]): List[BigInt] =
      if (t * b > n) numbers
      else rmPrimesRec(t + 1, b, numbers diff List[BigInt](t * b))


  }
}
