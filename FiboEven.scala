package project.euler

object FiboEven {

  def main(args : Array[String]) =  
    if (args.length > 0 && args(0).matches("\\d+"))
      Console println fiboEven(args(0).toInt)
    else
      Console println fiboEven(4000000)

  /**
   *
   */
  def fiboEven(n: Int): Int = {                                
    /**
     *
     */
    def fibonacci(first: Int, next: Int, acc: Int): Int =
      if (next > n) acc
      else if (next % 2 == 0) fibonacci(next, first + next, acc+next)
      else fibonacci(next, first + next, acc)  

      fibonacci(1, 2, 0)                                    
  }
}
