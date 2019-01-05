package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Render extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ stdLib.Readonly[js.Object], /* nextContext */ js.Any, scala.Unit]
  ] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[js.Object], 
      /* nextState */ stdLib.Readonly[js.Object], 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var componentDidCatch: js.UndefOr[
    js.Function2[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* errorInfo */ reactLib.reactMod.ReactNs.ErrorInfo, 
      scala.Unit
    ]
  ] = js.native
  var componentDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ stdLib.Readonly[js.Object], 
      /* prevState */ stdLib.Readonly[js.Object], 
      /* snapshot */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ stdLib.Readonly[js.Object], /* nextContext */ js.Any, scala.Unit]
  ] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[js.Object], 
      /* nextState */ stdLib.Readonly[js.Object], 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var context: js.Any = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[
      /* prevProps */ stdLib.Readonly[js.Object], 
      /* prevState */ stdLib.Readonly[js.Object], 
      _
    ]
  ] = js.native
  var onContextMenuClose: js.UndefOr[js.Function0[scala.Unit]] = js.native
  val props: stdLib.Readonly[Anon_Children] with stdLib.Readonly[js.Object] = js.native
  var refs: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[js.Object], 
      /* nextState */ stdLib.Readonly[js.Object], 
      /* nextContext */ js.Any, 
      scala.Boolean
    ]
  ] = js.native
  var state: stdLib.Readonly[js.Object] = js.native
  def forceUpdate(): scala.Unit = js.native
  def forceUpdate(callBack: js.Function0[scala.Unit]): scala.Unit = js.native
  def render(): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def renderContextMenu(
    e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement with stdLib.HTMLElement, reactLib.NativeMouseEvent]
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ stdLib.Readonly[js.Object], 
      /* props */ stdLib.Readonly[js.Object], 
      js.Object | (stdLib.Pick[js.Object, K])
    ]
  ): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ stdLib.Readonly[js.Object], 
      /* props */ stdLib.Readonly[js.Object], 
      js.Object | (stdLib.Pick[js.Object, K])
    ],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: stdLib.Pick[js.Object, K]): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: stdLib.Pick[js.Object, K], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

