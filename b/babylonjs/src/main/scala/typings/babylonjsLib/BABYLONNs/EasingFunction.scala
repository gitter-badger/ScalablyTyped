package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class used for every default easing function.
  * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
  */
@JSGlobal("BABYLON.EasingFunction")
@js.native
class EasingFunction () extends IEasingFunction {
  var _easingMode: js.Any = js.native
  /**
    * Given an input gradient between 0 and 1, this returns the corrseponding value
    * of the easing function.
    * The link below provides some of the most common examples of easing functions.
    * @see https://easings.net/
    * @param gradient Defines the value between 0 and 1 we want the easing value for
    * @returns the corresponding value on the curve defined by the easing function
    */
  /* CompleteClass */
  override def ease(gradient: scala.Double): scala.Double = js.native
  /**
    * @hidden
    */
  def easeInCore(gradient: scala.Double): scala.Double = js.native
  /**
    * Gets the current easing mode.
    * @returns the easing mode
    */
  def getEasingMode(): scala.Double = js.native
  /**
    * Sets the easing mode of the current function.
    * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
    */
  def setEasingMode(easingMode: scala.Double): scala.Unit = js.native
}

/**
  * Base class used for every default easing function.
  * @see http://doc.babylonjs.com/babylon101/animations#easing-functions
  */
@JSGlobal("BABYLON.EasingFunction")
@js.native
object EasingFunction extends js.Object {
  /**
    * Interpolation follows the mathematical formula associated with the easing function.
    */
  val EASINGMODE_EASEIN: scala.Double = js.native
  /**
    * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
    */
  val EASINGMODE_EASEINOUT: scala.Double = js.native
  /**
    * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
    */
  val EASINGMODE_EASEOUT: scala.Double = js.native
}

