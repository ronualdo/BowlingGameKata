package bowlinggame

class SpareFrame(firstPlay: Int, secondPlay: Int, nextFrame: Frame) {
  
  def points = 10 + nextFrame.firstPlay
}
