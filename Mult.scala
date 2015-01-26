package project.euler

import scala.annotation.tailrec

object Mult {
  def main(args : Array[String]) = 
    if (args.length > 0 && args(0).matches("\\d+")) {
      Console println mul(args(0).toInt)
      Console println mulFunc(args(0).toInt)
    }
    else {
      Console println mul(1000)
      Console println mulFunc(1000)
    }

  def mulFunc(n: Int) = (1 until n).filter(n => n % 3 == 0 || n % 5 == 0).sum
  // OR
  def mul(n: Int): Int = {
    @tailrec def mulRec(a: Int, acc: Int): Int =
      if(a >= n) acc                                        
      else if (a % 3 == 0 || a % 5 == 0) mulRec(a + 1, acc + a)         
      else mulRec(a + 1, acc) 
                                      
    mulRec(1, 0)                                           
  }  
}
