package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZone extends js.Object {
  var Barcode: scala.Boolean
  var DataType: mfilesLib.MFilesNs.MFDataType
  var DimensionUnit: mfilesLib.MFilesNs.MFOCRDimensionUnit
  val HasOCROptions: scala.Boolean
  var Height: scala.Double
  var ID: scala.Double
  var Left: scala.Double
  var Name: java.lang.String
  var OCROptions: IOCROptions
  var Top: scala.Double
  var Width: scala.Double
  def ClearOCROptions(): scala.Unit
  def Clone(): IOCRZone
  def SetOCROptions(OCROptions: IOCROptions): scala.Unit
}

