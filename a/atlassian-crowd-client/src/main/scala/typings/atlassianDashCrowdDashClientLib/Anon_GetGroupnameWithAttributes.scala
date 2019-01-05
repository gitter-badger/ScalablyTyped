package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetGroupnameWithAttributes extends js.Object {
  var attributes: Anon_ListGroupname = js.native
  var children: Anon_Get = js.native
  var parents: Anon_GetGroupnameParentname = js.native
  var users: Anon_GetGroupname = js.native
  def create(group: atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced): js.Promise[atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced] = js.native
  def get(groupname: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced] = js.native
  def get(groupname: java.lang.String, withAttributes: scala.Boolean): js.Promise[atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced] = js.native
  def membership(): js.Promise[java.lang.String] = js.native
  def remove(groupname: java.lang.String): js.Promise[scala.Unit] = js.native
  def update(groupname: java.lang.String, group: atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced): js.Promise[atlassianDashCrowdDashClientLib.libModelsGroupMod.namespaced] = js.native
}

