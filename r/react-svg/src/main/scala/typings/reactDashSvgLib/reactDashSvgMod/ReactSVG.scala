package typings
package reactDashSvgLib.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSVG
  extends reactLib.reactMod.Component[
      Props with (reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.HTMLAttributes[
          (reactLib.HTMLSpanElement with stdLib.HTMLSpanElement) | (reactLib.HTMLDivElement with stdLib.HTMLDivElement)
        ], 
        (reactLib.HTMLSpanElement with stdLib.HTMLSpanElement) | (reactLib.HTMLDivElement with stdLib.HTMLDivElement)
      ]), 
      State, 
      js.Any
    ] {
  var _isMounted: scala.Boolean = js.native
  var container: js.UndefOr[
    (reactLib.HTMLSpanElement with stdLib.HTMLSpanElement) | (reactLib.HTMLDivElement with stdLib.HTMLDivElement) | scala.Null
  ] = js.native
  var initialState: reactDashSvgLib.Anon_HasError = js.native
  var refCallback: reactLib.reactMod.ReactNs.Ref[
    (reactLib.HTMLSpanElement with stdLib.HTMLSpanElement) | (reactLib.HTMLDivElement with stdLib.HTMLDivElement)
  ] = js.native
  @JSName("state")
  var state_ReactSVG: reactDashSvgLib.Anon_HasError = js.native
  var svgWrapper: js.UndefOr[
    (reactLib.HTMLSpanElement with stdLib.HTMLSpanElement) | (reactLib.HTMLDivElement with stdLib.HTMLDivElement) | scala.Null
  ] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactSVG(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactSVG(prevProps: Props): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactSVG(): scala.Unit = js.native
  def removeSVG(): scala.Unit = js.native
  def renderSVG(): scala.Unit = js.native
}

