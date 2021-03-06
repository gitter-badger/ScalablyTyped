package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageOpts extends js.Object {
  /**
    * The friendly name for the field. I.e. 'Email address', 'Password Confirmation', etc.
    */
  var friendlyName: java.lang.String
  /**
    * The property name from the model. I.e. 'emailAddress', 'username', etc.
    */
  var property: java.lang.String
  /**
    * The current value of the field at the time the validation error was generated.
    */
  var value: java.lang.String
}

