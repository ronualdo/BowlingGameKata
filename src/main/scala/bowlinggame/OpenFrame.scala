package bowlinggame

class OpenFrame(plays: Tuple2[Int, Int]) extends Frame {
  
  def points = plays._1 + plays._2

}
