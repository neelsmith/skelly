package edu.holycross.shot.skelly
import org.scalatest.FlatSpec

class YoSpec extends FlatSpec {

  "A Yo" should "be able to greet someone" in {
    val yo = Yo("Scala coder")
    assert(yo.greet == "Yo, Scala coder")
  }
}
