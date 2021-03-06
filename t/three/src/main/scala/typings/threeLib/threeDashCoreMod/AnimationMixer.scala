package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "AnimationMixer")
@js.native
class AnimationMixer protected () extends EventDispatcher {
  def this(root: js.Any) = this()
  var time: scala.Double = js.native
  var timeScale: scala.Double = js.native
  def clipAction(clip: AnimationClip): AnimationAction = js.native
  def clipAction(clip: AnimationClip, root: js.Any): AnimationAction = js.native
  def existingAction(clip: AnimationClip): AnimationAction = js.native
  def existingAction(clip: AnimationClip, root: js.Any): AnimationAction = js.native
  def getRoot(): js.Any = js.native
  def stopAllAction(): AnimationMixer = js.native
  def uncacheAction(clip: AnimationClip): scala.Unit = js.native
  def uncacheAction(clip: AnimationClip, root: js.Any): scala.Unit = js.native
  def uncacheClip(clip: AnimationClip): scala.Unit = js.native
  def uncacheRoot(root: js.Any): scala.Unit = js.native
  def update(deltaTime: scala.Double): AnimationMixer = js.native
}

