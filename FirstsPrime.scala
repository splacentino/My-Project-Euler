package project.euler

object FirstsPrime {

  def main(args : Array[String]) =  {

    if (args.length > 0 && args(0).matches("\\d+"))
      Console println firstsPrime(args(0).toInt)
    else 
      Console println firstsPrime(10001)
  }

  /**
   *
   */
  def firstsPrime(n : Int): Int = {
    /**
     *
     */
    def firstsPrimeRec(a : Int, primes : List[Int]): Int = 
      if(primes.length == n) primes.head
      else if(primes.forall(x => a % x != 0)) firstsPrimeRec(a + 1, a :: primes)
      else firstsPrimeRec(a + 1, primes)
    
    if(n > 0) firstsPrimeRec(2, Nil) else throw new Exception
  }
}
