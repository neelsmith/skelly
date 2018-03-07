package edu.holycross.shot.skelly

/** Object demonstrating build of executable main
* function in JVM branch.
*/
object TestMain {

  /** Main function.
  *
  * @param args Arguments.
  */
  def main(args: Array[String]): Unit = {

    val yo = Yo("JVM person")
    println(yo.greet)
  }
}
