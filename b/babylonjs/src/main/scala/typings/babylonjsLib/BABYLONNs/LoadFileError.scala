package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ignore
  * Application error to support additional information when loading a file
  */
@JSGlobal("BABYLON.LoadFileError")
@js.native
class LoadFileError protected ()
  extends stdLib.Error {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional XHR request
    */
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, /** defines the optional XHR request */
  request: stdLib.XMLHttpRequest) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /** defines the optional XHR request */
  var request: js.UndefOr[stdLib.XMLHttpRequest] = js.native
}

/**
  * @ignore
  * Application error to support additional information when loading a file
  */
@JSGlobal("BABYLON.LoadFileError")
@js.native
object LoadFileError extends js.Object {
  var _setPrototypeOf: js.Any = js.native
}

