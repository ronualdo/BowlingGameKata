package bowlinggame

class SpareFrame(firstPlay: Int, secondPlay: Int, nextFrame: Frame=null) 
    extends Frame(firstPlay, secondPlay) {
  
  def points = {
    val nextPlayPoints = if (nextFrame==null) 0 else nextFrame.firstPlay
    
    10 + nextPlayPoints
  }

}
