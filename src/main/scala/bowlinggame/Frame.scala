package bowlinggame

object Frame {
  
  def apply(firstPlay: Int, secondPlay: Int): Frame = {
    new OpenFrame(firstPlay, secondPlay)    
  }

}

abstract class Frame(val firstPlay: Int, val secondPlay: Int) {

  def points: Int;

}
