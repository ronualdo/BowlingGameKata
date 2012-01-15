package bowlinggame

class OpenFrame(firstPlay: Int, secondPlay: Int) 
    extends Frame(firstPlay, secondPlay) {
  
  def points = firstPlay + secondPlay

}
