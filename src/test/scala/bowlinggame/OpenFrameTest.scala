package bowlinggame

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class OpenFrameTest extends WordSpec
    with ShouldMatchers {

  "A OpenFrame" should {
    "return the sum of the plays as points" in {
      val firstPlay = 3
      val secondPlay = 4

      val frame = new OpenFrame( (firstPlay, secondPlay) )

      frame.points should equal ( firstPlay+secondPlay )
    }
  }
}
