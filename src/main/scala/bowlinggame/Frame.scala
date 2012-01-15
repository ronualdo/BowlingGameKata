package bowlinggame

class Frame(plays: Tuple2[Int, Int]) {
  
  def points = plays._1 + plays._2

}
