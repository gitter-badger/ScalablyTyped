package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList", JSImport.Namespace)
@js.native
object libComponentsDetailsListModMembers extends js.Object {
  val SELECTION_CHANGE: /* change */ java.lang.String = js.native
  def DetailsList(
    props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def DetailsRow(
    props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def DetailsRowCheck(
    props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def buildColumns(
    items: js.Array[_],
    canResizeColumns: js.UndefOr[scala.Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[
        /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement with stdLib.HTMLElement, reactLib.NativeMouseEvent], 
        /* column */ officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn, 
        _
      ]
    ],
    sortedColumnKey: js.UndefOr[java.lang.String],
    isSortedDescending: js.UndefOr[scala.Boolean],
    groupedColumnKey: js.UndefOr[java.lang.String],
    isMultiline: js.UndefOr[scala.Boolean]
  ): js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IColumn
  ] = js.native
}

