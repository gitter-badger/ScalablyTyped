package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_List extends js.Object {
  var password: Anon_Set
  var username: Anon_Request
  def list(username: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
  def remove(username: java.lang.String, attributename: java.lang.String): js.Promise[scala.Unit]
  def set(
    username: java.lang.String,
    attributes: atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced
  ): js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
}

