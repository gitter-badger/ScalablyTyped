package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLFieldSetElement extends HTMLElement {
  var disabled: scala.Boolean = js.native
  val elements: HTMLCollection = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | scala.Null = js.native
  var name: java.lang.String = js.native
  val `type`: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  def reportValidity(): scala.Boolean = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): scala.Unit = js.native
}

@JSGlobal("HTMLFieldSetElement")
@js.native
object HTMLFieldSetElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLFieldSetElement]

