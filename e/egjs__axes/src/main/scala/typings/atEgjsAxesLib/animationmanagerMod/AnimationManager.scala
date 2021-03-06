package typings
package atEgjsAxesLib.animationmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/AnimationManager", "AnimationManager")
@js.native
class AnimationManager protected () extends js.Object {
  def this(options: atEgjsAxesLib.axesMod.AxesOption, itm: atEgjsAxesLib.interruptmanagerMod.InterruptManager, em: atEgjsAxesLib.eventmanagerMod.EventManager, axm: atEgjsAxesLib.axismanagerMod.AxisManager) = this()
  var _animateParam: js.Any = js.native
  var _raf: js.Any = js.native
  var axm: js.Any = js.native
  var em: js.Any = js.native
  var itm: js.Any = js.native
  var options: js.Any = js.native
  /* private */ def animateLoop(param: js.Any, complete: js.Any): js.Any = js.native
  def animateTo(destPos: atEgjsAxesLib.axismanagerMod.Axis, duration: scala.Double): scala.Unit = js.native
  def animateTo(destPos: atEgjsAxesLib.axismanagerMod.Axis, duration: scala.Double, inputEvent: js.Any): scala.Unit = js.native
  def animationEnd(): scala.Unit = js.native
  /* private */ def createAnimationParam(pos: js.Any, duration: js.Any): js.Any = js.native
  /* private */ def createAnimationParam(pos: js.Any, duration: js.Any, inputEvent: js.Any): js.Any = js.native
  def easing(p: js.Any): scala.Double = js.native
  /* private */ def frame(param: js.Any): js.Any = js.native
  def getDuration(depaPos: atEgjsAxesLib.axismanagerMod.Axis, destPos: atEgjsAxesLib.axismanagerMod.Axis): scala.Double = js.native
  def getDuration(
    depaPos: atEgjsAxesLib.axismanagerMod.Axis,
    destPos: atEgjsAxesLib.axismanagerMod.Axis,
    wishDuration: scala.Double
  ): scala.Double = js.native
  def getUserControll(param: AnimationParam): atEgjsAxesLib.Anon_DestPos = js.native
  def grab(axes: js.Array[java.lang.String]): scala.Unit = js.native
  def grab(axes: js.Array[java.lang.String], event: js.Any): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def restore(inputEvent: js.Any): scala.Unit = js.native
  def setBy(pos: atEgjsAxesLib.axismanagerMod.Axis): this.type = js.native
  def setBy(pos: atEgjsAxesLib.axismanagerMod.Axis, duration: scala.Double): this.type = js.native
  def setTo(pos: atEgjsAxesLib.axismanagerMod.Axis): this.type = js.native
  def setTo(pos: atEgjsAxesLib.axismanagerMod.Axis, duration: scala.Double): this.type = js.native
}

@JSImport("@egjs/axes/AnimationManager", "AnimationManager")
@js.native
object AnimationManager extends js.Object {
  def getDuration(duration: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
}

