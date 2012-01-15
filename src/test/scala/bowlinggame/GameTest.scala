package bowlinggame

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class GameTest extends WordSpec
    with ShouldMatchers {

  "A game" should {
    "have score 0 if no pins are knocked down" in {
      val frames = 1 to 12 map { _ => Frame(0, 0) }  

      val game = new Game(frames)

      game.score should equal (0)
    }

    "have score 4 if theres only one 5 pin open frame" in {
      val frames = Frame(2, 3) +: (1 to 10 map { _ => Frame(0, 0) })

      val game = new Game(frames)

      game.score should equal (5)
    }
  }


}
