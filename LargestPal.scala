package project.euler

import scala.annotation.tailrec

object LargestPal {

  def main(args: Array[String]): Unit = {

    if(args.length == 1 && args(0).matches("\\d+"))
      Console println largest(args(0).toInt)
    else
      Console println largest(1)
  }

  def largest(digits: Int): BigInt = {
    /**
     * @param min The smallest number 1/10/100/...
     * @param max The biggest number 9/99/999/... 
     * @param res The resultat var
     */
    val min = BigInt(10).pow(digits-1)
    val max = BigInt(10).pow(digits)
    //var res = BigInt(0)
    /**
     *
     */
    def isPal(n: BigInt) = n.toString == n.toString.reverse

    /**
     *
     */
    @tailrec def largRec(a: BigInt, b: BigInt, res: BigInt): BigInt =
      if(a == min && b == min) res
      else if(a == min) largRec(b-1,b-1,res)
      else if(isPal(a*b) && a*b > res) largRec(a-1,b, a*b)
      else largRec(a-1,b,res)

      largRec(max, max, 0)

      /* OTHER WAY
      for(i <- min to max){
        for(j <- min to max){
          if(i*j > res && isPal(i*j)) { res = i*j }
        }
      }

      res
       */

      /* OTHER WAY
      def largRec(a: BigInt, b: BigInt, pal : List[BigInt]): BigInt = {
        if(a == min && b == min) pal.max
        else if(a == min) largRec(b - 1, b - 1, pal)
        else if(isPal(a*b)) largRec(a - 1, b, a*b :: pal)
        else largRec(a - 1, b, pal)
      }

      largRec(max, max, Nil)
       */
  }
}
