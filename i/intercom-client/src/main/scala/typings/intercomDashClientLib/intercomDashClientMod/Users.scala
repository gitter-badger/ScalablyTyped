package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Users")
@js.native
class Users () extends js.Object {
  var scroll: intercomDashClientLib.scrollMod.Scroll[intercomDashClientLib.userMod.User] = js.native
  def archive(identifier: intercomDashClientLib.userMod.UserIdentifier): js.Promise[ApiResponse[intercomDashClientLib.userMod.User]] = js.native
  def archive(
    identifier: intercomDashClientLib.userMod.UserIdentifier,
    cb: callback[ApiResponse[intercomDashClientLib.userMod.User]]
  ): scala.Unit = js.native
  def create(user: stdLib.Partial[intercomDashClientLib.userMod.User]): js.Promise[ApiResponse[intercomDashClientLib.userMod.User]] = js.native
  def create(
    user: stdLib.Partial[intercomDashClientLib.userMod.User],
    cb: callback[ApiResponse[intercomDashClientLib.userMod.User]]
  ): scala.Unit = js.native
  def find(identifier: intercomDashClientLib.userMod.UserIdentifier): js.Promise[ApiResponse[intercomDashClientLib.userMod.User]] = js.native
  def find(
    identifier: intercomDashClientLib.userMod.UserIdentifier,
    cb: callback[ApiResponse[intercomDashClientLib.userMod.User]]
  ): scala.Unit = js.native
  def list(): js.Promise[ApiResponse[intercomDashClientLib.userMod.List]] = js.native
  def list(cb: callback[ApiResponse[intercomDashClientLib.userMod.List]]): scala.Unit = js.native
  def listBy(params: intercomDashClientLib.Anon_Tagid): js.Promise[ApiResponse[intercomDashClientLib.userMod.List]] = js.native
  def listBy(
    params: intercomDashClientLib.Anon_Tagid,
    cb: callback[ApiResponse[intercomDashClientLib.userMod.List]]
  ): scala.Unit = js.native
  def requestPermanentDeletion(id: java.lang.String): js.Promise[intercomDashClientLib.Anon_IdNumber] = js.native
  def requestPermanentDeletion(id: java.lang.String, cb: callback[intercomDashClientLib.Anon_IdNumber]): scala.Unit = js.native
  def requestPermanentDeletionByParams(identifier: intercomDashClientLib.userMod.UserIdentifier): js.Promise[intercomDashClientLib.Anon_IdNumber] = js.native
  def requestPermanentDeletionByParams(
    identifier: intercomDashClientLib.userMod.UserIdentifier,
    cb: callback[intercomDashClientLib.Anon_IdNumber]
  ): scala.Unit = js.native
  def update(
    user: intercomDashClientLib.userMod.UserIdentifier with stdLib.Partial[intercomDashClientLib.userMod.User]
  ): js.Promise[ApiResponse[intercomDashClientLib.userMod.User]] = js.native
  def update(
    user: intercomDashClientLib.userMod.UserIdentifier with stdLib.Partial[intercomDashClientLib.userMod.User],
    cb: callback[ApiResponse[intercomDashClientLib.userMod.User]]
  ): scala.Unit = js.native
}

