package bowlinggame

class Game(val frames: Seq[Frame]) {
  
  def score = {
    frames.foldLeft(0) { 
      (numberOfPins, frame) => numberOfPins + frame.points
    }
  }

}
