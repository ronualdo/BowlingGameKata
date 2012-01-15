package bowlinggame

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class StrikeFrameTest extends WordSpec 
    with ShouldMatchers {

  "A StrikeFrame" should {
    "return 15 when followed by a 5 pins open frame" in {
      val strike = new StrikeFrame(nextFrame=Frame(2, 3))

      strike.points should equal (15)
    }
  }
}
