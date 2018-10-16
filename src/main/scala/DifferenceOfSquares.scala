object DifferenceOfSquares{

  def sumOfSquares(n: Int): Int = {
    //The Numbers
    val naturals = ( 1 to n).toSet

    //Square each
    val squares = for {
      j <- naturals
    } yield {j*j}

    //Sum
    squares.sum
  }

  def squareOfSum(n: Int): Int = {
    //Numbers
    val naturals=(1 to n).toSet

    //Sum
    val summed = naturals.sum

    //Square
    summed * summed
  }

  def differenceOfSquares(n: Int):Int = {
    squareOfSum(n)-sumOfSquares(n)
  }
}
