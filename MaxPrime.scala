package project.euler

import scala.annotation.tailrec

object MaxPrime {

  def main(args: Array[String]): Unit = {

    if (args.length == 1 && (args(0).matches("\\d+")))
      Console println maxPrime(BigInt(args(0)))
    else 
      Console println maxPrime(BigInt("600851475143"))

  }

  /**
   *
   */
  def maxPrime(n: BigInt): BigInt = {
    /**
     *
     */
    def maxPrimeRec(a: BigInt, big: BigInt, p: List[BigInt]): BigInt = 
      if (a*a > n) big
      else if (p.forall(x => a%x != 0) && n % a == 0 /*&& isPrime(a)*/)
        maxPrimeRec(a+1,a,a::p)
      else maxPrimeRec(a+1, big, p)

    if(n > 1) maxPrimeRec(2, n, Nil) else sys.error("Not any prime factor")                   
  }   

  /**
   *
   */
  def isPrime(n: BigInt) : Boolean = {
    /**
     *
     */
    def primeRec(a: BigInt) : Boolean = 
      if (a >= n) true
      else if (n % a == 0) false
      else primeRec(a + 1)

    (n > 1) && primeRec(2)
  }  
}
