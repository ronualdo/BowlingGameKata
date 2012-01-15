package bowlinggame

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class FrameTest extends WordSpec
    with ShouldMatchers {

  "A frame" should {
    "return the number of points" in {
      val firstPlay = 3
      val secondPlay = 4

      val frame = new Frame( (firstPlay, secondPlay) )

      frame.points should equal ( firstPlay+secondPlay )
    }
  }
}
