package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIAutoComplete extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_TplEvent): this.type = js.native
  def close(): scala.Unit = js.native
  /**
    * Gets filtered words subject to autofill
    *
    * @return words
    */
  def list(): js.Array[java.lang.String] = js.native
  /**
    * Updates words subject to autofill
    *
    *
    */
  def update(newWords: js.Array[java.lang.String]): scala.Unit = js.native
}

