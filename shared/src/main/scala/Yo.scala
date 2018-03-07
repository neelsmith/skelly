package edu.holycross.shot.skelly
import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Minimal case class to demonstrate building
* a project with tests and documentation.
*
* @param vocative Person to address in direct form.
*/
@JSExportAll  case class Yo(vocative: String) {

  /** Create greeting String. */
  def greet : String = {
    "Yo, " + vocative
  }
}
