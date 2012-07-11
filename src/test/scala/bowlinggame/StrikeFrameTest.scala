package bowlinggame

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class StrikeFrameTest extends WordSpec 
    with ShouldMatchers {

  "A StrikeFrame" should {
    "return 15 when followed by a 5 pins open frame" in {
      val nextFrame = Some(Frame(2, 3))
      val strike = new StrikeFrame(nextFrame)

      strike.points should equal (15)
    }

    "return 10 when theres not a next frame" in {
      val strike = new StrikeFrame()

      strike.points should equal (10)
    }
  }
}
