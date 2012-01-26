package bowlinggame

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class FrameTest extends WordSpec 
    with ShouldMatchers {

  "A Frame" should {
    "be open when the sum of pins knocked down is < 10" in {
      val openFrame = Frame(3, 2)

      openFrame.isInstanceOf[OpenFrame] should be (true)
    }

    "be a spare when the sum of pins knocked down is == 10" in {
      val spareFrame = Frame(6, 4)

      spareFrame.isInstanceOf[SpareFrame] should be (true)
    }

    "be a strike when the first play knocks all pins" in {
      val strikeFrame = Frame(10, 0)

      strikeFrame.isInstanceOf[StrikeFrame] should be (true)
    }
  }
}
