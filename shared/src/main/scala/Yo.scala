package edu.holycross.shot.skelly


/** Minimal case class to demonstrate building
* a project with tests and documentation.
*
* @param vocative Person to address in direct form.
*/
case class Yo(vocative: String) {

  /** Create greeting String. */
  def greet : String = {
    "Yo, " + vocative
  }
}
