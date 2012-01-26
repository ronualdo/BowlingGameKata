package bowlinggame

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class SpareFrameTest extends WordSpec 
    with ShouldMatchers {

  "A SpareFrame" should {
    "return 10 + next frame first play as points" in {
      val spare = new SpareFrame(5, 5, Frame(3, 4))

      spare.points should equal (13)
    }

    "return 10 when theres not a next play" in {
      val spare = new SpareFrame(5, 5, null)

      spare.points should equal (10)
    }
  }

}
