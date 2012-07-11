package bowlinggame

class StrikeFrame(nextFrame: Option[Frame] = None) extends Frame(10, 10) {

  def points = {
    val nextFramePoints = nextFrame.map{ 
      frame => frame.firstPlay + frame.secondPlay
    }

    10 + nextFramePoints.getOrElse(0)
  }

}
