package bowlinggame

class StrikeFrame(nextFrame: Frame) extends Frame(10, 10) {
 
  def points = 10 + nextFrame.firstPlay + nextFrame.secondPlay

}
