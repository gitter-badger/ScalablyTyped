package typings
package angularfireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AngularFireObjectService extends js.Object {
  @JSName("$extend")
  def $extend(ChildClass: coreDashJsLib.Object with js.Object): coreDashJsLib.Object with js.Object = js.native
  @JSName("$extend")
  def $extend(ChildClass: coreDashJsLib.Object with js.Object, methods: coreDashJsLib.Object with js.Object): coreDashJsLib.Object with js.Object = js.native
  /**
  	 * Creates a synchronized object with 2-way bindings between Angular and Firebase.
  	 *
  	 * @param {Firebase} ref
  	 * @returns {FirebaseObject}
  	 */
  def apply(firebase: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Firebase */ js.Any): AngularFireObject = js.native
}

