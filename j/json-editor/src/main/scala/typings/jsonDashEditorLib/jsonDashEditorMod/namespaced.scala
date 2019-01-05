package typings
package jsonDashEditorLib.jsonDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-editor", JSImport.Namespace)
@js.native
class namespaced[TValue] protected ()
  extends jsonDashEditorLib.JSONEditor[TValue] {
  def this(element: stdLib.HTMLElement, options: jsonDashEditorLib.JSONEditorOptions[TValue]) = this()
}

@JSImport("json-editor", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var defaults: jsonDashEditorLib.Anon_OptionsEditors = js.native
  var plugins: jsonDashEditorLib.Anon_Sceditor = js.native
}

