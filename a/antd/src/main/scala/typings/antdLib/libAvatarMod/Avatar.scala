package typings
package antdLib.libAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar
  extends reactLib.reactMod.Component[AvatarProps, AvatarState, js.Any] {
  var avatarChildren: js.Any = js.native
  @JSName("state")
  var state_Avatar: antdLib.Anon_Scale = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAvatar(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAvatar(prevProps: AvatarProps, prevState: AvatarState): scala.Unit = js.native
  def handleImgLoadError(): scala.Unit = js.native
  def setScale(): scala.Unit = js.native
}

