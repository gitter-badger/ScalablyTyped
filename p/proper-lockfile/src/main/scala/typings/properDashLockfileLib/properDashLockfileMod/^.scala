package typings
package properDashLockfileLib.properDashLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proper-lockfile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check(file: java.lang.String): js.Promise[scala.Boolean] = js.native
  def check(file: java.lang.String, options: properDashLockfileLib.properDashLockfileMod.CheckOptions): js.Promise[scala.Boolean] = js.native
  def checkSync(file: java.lang.String): scala.Boolean = js.native
  def checkSync(file: java.lang.String, options: properDashLockfileLib.properDashLockfileMod.CheckOptions): scala.Boolean = js.native
  def lock(file: java.lang.String): js.Promise[js.Function0[js.Promise[scala.Unit]]] = js.native
  def lock(file: java.lang.String, options: properDashLockfileLib.properDashLockfileMod.LockOptions): js.Promise[js.Function0[js.Promise[scala.Unit]]] = js.native
  def lockSync(file: java.lang.String): js.Function0[scala.Unit] = js.native
  def lockSync(file: java.lang.String, options: properDashLockfileLib.properDashLockfileMod.LockOptions): js.Function0[scala.Unit] = js.native
  def unlock(file: java.lang.String): js.Promise[scala.Unit] = js.native
  def unlock(file: java.lang.String, options: properDashLockfileLib.properDashLockfileMod.UnlockOptions): js.Promise[scala.Unit] = js.native
  def unlockSync(file: java.lang.String): scala.Unit = js.native
  def unlockSync(file: java.lang.String, options: properDashLockfileLib.properDashLockfileMod.UnlockOptions): scala.Unit = js.native
}

