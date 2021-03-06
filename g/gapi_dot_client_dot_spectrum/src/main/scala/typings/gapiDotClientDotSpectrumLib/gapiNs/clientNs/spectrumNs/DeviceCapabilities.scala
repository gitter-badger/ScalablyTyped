package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCapabilities extends js.Object {
  /**
    * An optional list of frequency ranges supported by the device. Each element must contain start and stop frequencies in which the device can operate.
    * Channel identifiers are optional. When specified, the database should not return available spectrum that falls outside these ranges or channel IDs.
    */
  var frequencyRanges: js.UndefOr[js.Array[FrequencyRange]] = js.undefined
}

