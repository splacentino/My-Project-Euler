package project.euler

object Pascal {

  def main(args: Array[String]) {

    println(valPas(0,0))
    println(valPas(0,2))
    println(valPas(1,2))
    println(valPas(1,3))
  }

  def valPas(c: Int, r: Int): Int = (c, r) match {
    case(0,_) => 1
    case(_,r) => 1
    case(_,_) => valPas(c-1, r-1).+(valPas(c, r-1))
  }
}
