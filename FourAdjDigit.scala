package project.euler

object FourAdjDigit {
  def main(args : Array[String]) =  {
    Console println fourAdjDigit("12345", 4)
  }

  def fourAdjDigit(numbers : String, digits : Int): Int = {
    def fourAdjRec(prod : Int, max : Int, pos : Int, ptr : Int): Int = {
      Console println ("Prod = " + prod 
        + " Max = " + max 
        + " Pos = " + pos
        + " Ptr = " + ptr)
      if (pos + digits > numbers.length) max
      else if ((pos + ptr) % digits == 0)
        42 // fourdAdjRec()
      else 42
    }
    if (numbers.length > 0) 
      fourAdjRec(numbers(0).asDigit, 0, 0, 1)
    else throw new Error
      /* else if (ptr % digits < 1) 
        thirdAdjRec(numbers(pos + 1).asDigit, 
          if(prod > max) prod else max,
          pos + 1,
        pos + 2
        )
      else thirdAdjRec(numbers(ptr).asDigit * prod, max, pos, ptr + 1)
    }*/

    //thirdAdjRec(0, 0, -1, 0)
  }
}
