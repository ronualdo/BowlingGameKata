package bowlinggame

object Frame {
  
  def apply(firstPlay: Int, secondPlay: Int): Frame = {
    new OpenFrame(firstPlay, secondPlay)    
  }

}

trait Frame {
  
  def points: Int;

}
