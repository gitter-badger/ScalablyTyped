package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Property object is a container for a property associated with a Device, DeviceInfo, Filter, ImageFile or Item object. See the Properties property
  * on any of these objects for details on accessing Property objects.
  */
@JSGlobal("WIA.Property")
@js.native
class Property protected () extends js.Object {
  /** Indicates whether the Property Value is read only */
  val IsReadOnly: scala.Boolean = js.native
  /** Indicates whether the Property Value is a vector */
  val IsVector: scala.Boolean = js.native
  /** Returns the Property Name */
  val Name: java.lang.String = js.native
  /** Returns the PropertyID of this Property */
  val PropertyID: scala.Double = js.native
  /** Returns the SubType of the Property, if any */
  val SubType: WiaSubType = js.native
  /** Returns the default Property Value if the SubType is not UnspecifiedSubType */
  val SubTypeDefault: js.Any = js.native
  /** Returns the maximum valid Property Value if the SubType is RangeSubType */
  val SubTypeMax: scala.Double = js.native
  /** Returns the minimum valid Property Value if the SubType is RangeSubType */
  val SubTypeMin: scala.Double = js.native
  /** Returns the step increment of Property Values if the SubType is RangeSubType */
  val SubTypeStep: scala.Double = js.native
  /** Returns a Vector of valid Property Values if the SubType is ListSubType or valid flag Values that can be ored together if the SubType is FlagSubType */
  @JSName("SubTypeValues")
  val SubTypeValues_Original: Vector[_] = js.native
  /** Returns either a WiaPropertyType or a WiaImagePropertyType */
  val Type: scala.Double = js.native
  /** Returns/Sets the Property Value */
  var Value: js.Any = js.native
  var `WIA.Property_typekey`: Property = js.native
  /** Returns the specified item in the vector by position */
  /** Returns a Vector of valid Property Values if the SubType is ListSubType or valid flag Values that can be ored together if the SubType is FlagSubType */
  def SubTypeValues(Index: scala.Double): js.Any = js.native
}

