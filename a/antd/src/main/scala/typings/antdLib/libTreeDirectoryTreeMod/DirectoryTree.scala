package typings
package antdLib.libTreeDirectoryTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends reactLib.reactMod.Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.native
  var lastSelectedKey: js.UndefOr[java.lang.String] = js.native
  @JSName("state")
  var state_DirectoryTree: DirectoryTreeState = js.native
  var tree: antdLib.libTreeTreeMod.default = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDirectoryTree(nextProps: DirectoryTreeProps): scala.Unit = js.native
  def expandFolderNode(
    event: reactLib.reactMod.ReactNs.MouseEvent[
      reactLib.HTMLElement with stdLib.HTMLElement, 
      reactLib.MouseEvent with stdLib.MouseEvent
    ],
    node: antdLib.libTreeTreeMod.AntTreeNode
  ): scala.Unit = js.native
  def onClick(
    event: reactLib.reactMod.ReactNs.MouseEvent[
      reactLib.HTMLElement with stdLib.HTMLElement, 
      reactLib.MouseEvent with stdLib.MouseEvent
    ],
    node: antdLib.libTreeTreeMod.AntTreeNode
  ): scala.Unit = js.native
  def onDebounceExpand(
    event: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement with stdLib.HTMLElement, reactLib.NativeMouseEvent],
    node: antdLib.libTreeTreeMod.AntTreeNode
  ): scala.Unit = js.native
  def onDoubleClick(
    event: reactLib.reactMod.ReactNs.MouseEvent[
      reactLib.HTMLElement with stdLib.HTMLElement, 
      reactLib.MouseEvent with stdLib.MouseEvent
    ],
    node: antdLib.libTreeTreeMod.AntTreeNode
  ): scala.Unit = js.native
  def onExpand(expandedKeys: js.Array[java.lang.String], info: antdLib.libTreeTreeMod.AntTreeNodeExpandedEvent): scala.Unit | js.Thenable[_] = js.native
  def onSelect(keys: js.Array[java.lang.String], event: antdLib.libTreeTreeMod.AntTreeNodeSelectedEvent): scala.Unit = js.native
  def setTreeRef(node: antdLib.libTreeTreeMod.default): scala.Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): scala.Unit = js.native
}

