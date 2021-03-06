package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Type HTTP header on the HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue")
@js.native
class HttpMediaTypeHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpMediaTypeHeaderValue class.
    * @param mediaType The media-type of the entity-body used in the Content-Type HTTP header.
    */
  def this(mediaType: java.lang.String) = this()
  /** Gets or sets the character set of the entity-body used in the Content-Type HTTP header. */
  var charSet: java.lang.String = js.native
  /** Gets or sets the media-type of the entity-body used in the Content-Type HTTP header. */
  var mediaType: java.lang.String = js.native
  /** Gets a set of parameters included in the Content-Type HTTP header. */
  var parameters: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[HttpNameValueHeaderValue] = js.native
}

/** Represents the value of the Content-Type HTTP header on the HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue")
@js.native
object HttpMediaTypeHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpMediaTypeHeaderValue instance.
    * @param input A string that represents the media-type and character set information used in the Content-Type HTTP header.
    * @return An HttpMediaTypeHeaderValue instance.
    */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpMediaTypeHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpMediaTypeHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_MediaTypeHeaderValue = js.native
}

