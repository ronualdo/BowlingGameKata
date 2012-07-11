package bowlinggame

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class GameTest extends WordSpec
    with ShouldMatchers {

  "A game" should {
    "have score 0 if no pins are knocked down" in {
      val frames = noPinsFramesSeq(numberOfFrames=10)

      val game = new Game(frames)

      game.score should equal (0)
    }

    "have score 90 when all frames are 9 pins spare and miss" in {
      val frames = framesSeq(9, 0, 10)
      
      val game = new Game(frames)

      game.score should equal (90)
    }

    "have score 150 when all frames are 5,5 spares" in {
      val frames = framesSeq(5, 5, 11)

      val game = new Game(frames)

      game.score should equal (150)
    }

    "have score score 300 after 12 strikes" in {
      val frames = framesSeq(10, 10, 12)

      val game = new Game(frames)

      game.score should equal (300)
    }
    
  }

  private def framesSeq(firstPlay: Int, secondPlay: Int, frameLength: Int) = {
    (1 to frameLength).foldRight(Seq[Frame]()) {
      (indice, frames) => {
        val nextFrame = if (frames.isEmpty) None else Some(frames.head)
        frames :+ Frame(firstPlay, secondPlay, nextFrame)
      }
    }.reverse
  }

  private def noPinsFramesSeq(numberOfFrames: Int) = {
    1 to numberOfFrames map { _ => Frame(0, 0) }
  }


}
