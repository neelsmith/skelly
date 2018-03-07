package edu.holycross.shot.skelly

import org.scalatest._

class JSExportsSpec extends FlatSpec {

  "The Scala export of the Yo class"  should "expose the case class and its methods" in {
    val yo = Yo("Javascript dude")
    assert (yo.greet == "Yo, Javascript dude")
  }

}
