package bowlinggame

class Frame(plays: Tuple2[Int, Int]) {
  
  def totalPinsKnockedDown = plays._1 + plays._2

}
