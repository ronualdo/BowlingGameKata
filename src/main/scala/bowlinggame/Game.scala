package bowlinggame

class Game(val frames: Seq[Frame]) {
  
  def score = {
    frames.slice(from=0, until=10).foldLeft(0) {
      (points, frame) => { points + frame.points }
    }
  }

}
