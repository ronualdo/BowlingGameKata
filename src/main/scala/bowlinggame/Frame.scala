package bowlinggame

object Frame {
  
  def apply(firstPlay: Int, secondPlay: Int, nextFrame: Option[Frame]=None) = {
    if (firstPlay == 10) {
      new StrikeFrame(nextFrame)
    } else if (firstPlay+secondPlay == 10) {
      new SpareFrame(firstPlay, secondPlay, nextFrame)
    } else {
      new OpenFrame(firstPlay, secondPlay)
    }  
  }

}

abstract class Frame(val firstPlay: Int, val secondPlay: Int) {

  def points: Int;
  
  override def toString = "(%d,%d)" format (firstPlay, secondPlay)
}
