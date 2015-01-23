package project.euler

object FiboEven {

  def main(args : Array[String]) =  
    Console println fiboEven

  /**
   *
   */
  def fiboEven(): Int = {                                
    /**
     *
     */
    def fibonacci(first: Int, next: Int, acc: Int): Int =
      if (next > 4000000) acc
      else if (next % 2 == 0) fibonacci(next, first + next, acc+next)
      else fibonacci(next, first + next, acc)  

      fibonacci(1, 2, 0)                                    
  }
}
