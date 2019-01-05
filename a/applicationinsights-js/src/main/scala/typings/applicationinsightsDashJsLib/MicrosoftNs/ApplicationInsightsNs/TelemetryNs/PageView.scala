package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.PageView")
@js.native
/**
  * Constructs a new instance of the PageEventTelemetry object
  */
class PageView ()
  extends applicationinsightsDashJsLib.AINs.PageViewData
     with applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ISerializable {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, url: java.lang.String) = this()
  def this(name: java.lang.String, url: java.lang.String, durationMs: scala.Double) = this()
  def this(name: java.lang.String, url: java.lang.String, durationMs: scala.Double, properties: js.Any) = this()
  def this(name: java.lang.String, url: java.lang.String, durationMs: scala.Double, properties: js.Any, measurements: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_PageView: applicationinsightsDashJsLib.Anon_VerName = js.native
}

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.PageView")
@js.native
object PageView extends js.Object {
  var dataType: java.lang.String = js.native
  var envelopeType: java.lang.String = js.native
}

