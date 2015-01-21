package project.euler

object ThirdAdjProd {
  def main(args : Array[String]) =  {
    Console println thirdAdjProd("12345", 4)
  }

  def thirdAdjProd(numbers : String, digits : Int): Int = {
    def thirdAdjRec(prod : Int, max : Int, pos : Int, ptr : Int): Int = {
      Console println ("Prod = " + prod 
        + " Max = " + max 
        + " Pos = " + pos
        + " Ptr = " + ptr)
      if (pos + digits > numbers.length) max
      else if ((pos + ptr) % digits == 0)
        thirdAdjRec(
    }
    if (numbers.length > 0) 
      thirdAdjRec(numbers(0).asDigit, 0, 0, 1)
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
