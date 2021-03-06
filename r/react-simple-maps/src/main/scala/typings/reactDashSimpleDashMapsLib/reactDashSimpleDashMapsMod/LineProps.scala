package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends js.Object {
  var buildPath: js.UndefOr[
    js.Function3[/* start */ Point, /* end */ Point, /* line */ Line, java.lang.String]
  ] = js.undefined
  var line: js.UndefOr[Line] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.SVGPathElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseUp: js.UndefOr[
    js.Function2[
      /* line */ Line, 
      /* evt */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.SVGPathElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var preserveMarkerAspect: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashSimpleDashMapsLib.Anon_Default] = js.undefined
  var tabable: js.UndefOr[scala.Boolean] = js.undefined
}

