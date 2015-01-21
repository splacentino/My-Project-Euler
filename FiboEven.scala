package project.euler

object FiboEven {

  def main(args : Array[String]): Unit = {
    Console println fiboEven()
  }
  def fiboEven(): Int = {                                
    def fibonacci(f: Int, n: Int, acc: Int): Int = {
      if (n > 4000000) acc
      else if (n % 2 == 0) fibonacci(n, f+n, acc+n)
      else fibonacci(n, f+n, acc)  
    }                                                     
    fibonacci(1, 2, 0)                                    
  }
}
