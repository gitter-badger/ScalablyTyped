package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /**
    * a comment on or immediately after this
    */
  var comment: scala.Null | java.lang.String
  /**
    * a comment before this
    */
  var commentBefore: scala.Null | java.lang.String
  /**
    * only available when `keepCstNodes` is set to `true`
    */
  var cstNode: js.UndefOr[yamlLib.yamlMod.cstNs.Node] = js.undefined
  /**
    * the [start, end] range of characters of the source parsed
    * into this node (undefined for pairs or if not parsed)
    */
  var range: scala.Null | (js.Tuple2[scala.Double, scala.Double])
  /**
    * a fully qualified tag, if required
    */
  var tag: scala.Null | java.lang.String
  /**
    * a plain JS representation of this node
    */
  def toJSON(): js.Any
}

