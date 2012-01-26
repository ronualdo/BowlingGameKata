package bowlinggame

class StrikeFrame(nextFrame: Frame = null) extends Frame(10, 10) {

  def points = {
    val nextFramePoints = if (nextFrame == null) {
      0
    } else {
      nextFrame.firstPlay + nextFrame.secondPlay
    }

    10 + nextFramePoints
  }

}
