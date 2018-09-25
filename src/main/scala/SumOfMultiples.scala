object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val naturals = (1 until limit).toSet

    val toSum = for {
      i <- factors
      j <- naturals
      if(j%i == 0)
    }yield j

    toSum.sum
  }
}