package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
class LightSensor () extends ILightSensor {
  /* CompleteClass */
  override var minimumReportInterval: scala.Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: scala.Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): LightSensorReading = js.native
}

@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
object LightSensor extends js.Object {
  def getDefault(): winrtLib.WindowsNs.DevicesNs.SensorsNs.LightSensor = js.native
}

