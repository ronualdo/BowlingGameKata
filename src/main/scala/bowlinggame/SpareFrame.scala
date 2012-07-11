package bowlinggame

class SpareFrame(firstPlay: Int, secondPlay: Int, nextFrame: Option[Frame]=None) 
    extends Frame(firstPlay, secondPlay) {
  
  def points = {
    val nextPlayPoints = nextFrame.map(_.firstPlay)
    
    10 + nextPlayPoints.getOrElse(0)
  }

}
