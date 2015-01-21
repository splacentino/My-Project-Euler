import scala.annotation.tailrec

object Fact {
  def main(args : Array[String]) = {
    if(args.length > 0 && args(0).matches("\\d+"))
      Console println factorial(args(0).toInt)
    else
      Console println factorial(3)
  }

  def factorial (n: Int) = {
    @tailrec
    def facto(a : Int, acc: Int): Int =
      if (a == 0) acc
      else facto(a - 1, a * acc)
    facto(n, 1)
  }
}
