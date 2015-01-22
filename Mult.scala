package project.euler

object Mult {
  def main(args : Array[String]) = 
    for (i <- 1 to 10) 
      Console println mul(i)

  def mul(n : Int): Int = {
    def mulRec(a : Int, acc: Int): Int =
      if(a >= n) acc                                        
      else if (a % 3 == 0 || a % 5 == 0) mulRec(a + 1, acc + a)         
      else mulRec(a + 1, acc) 
                                      
    mulRec(1, 0)                                           
  }  
}
