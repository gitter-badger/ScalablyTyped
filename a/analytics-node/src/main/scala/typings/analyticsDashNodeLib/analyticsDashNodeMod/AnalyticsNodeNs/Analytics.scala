package typings
package analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  /* alias is how you associate one identity with another. */
  def alias(message: analyticsDashNodeLib.Anon_PreviousId): Analytics = js.native
  def alias(
    message: analyticsDashNodeLib.Anon_PreviousId,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
  /* Flush batched calls to make sure nothing is left in the queue */
  def flush(): Analytics = js.native
  def flush(callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]): Analytics = js.native
  /* Group calls can be used to associate individual users with shared
    accounts or companies. */
  def group(message: analyticsDashNodeLib.Anon_UserIdAnonymousIdGroupId): Analytics = js.native
  def group(
    message: analyticsDashNodeLib.Anon_UserIdAnonymousIdGroupId,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
  /* The identify method lets you tie a user to their actions and record
    traits about them. */
  def identify(message: analyticsDashNodeLib.Anon_UserId): Analytics = js.native
  def identify(
    message: analyticsDashNodeLib.Anon_UserId,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(message: analyticsDashNodeLib.Anon_UserIdAnonymousIdCategory): Analytics = js.native
  def page(
    message: analyticsDashNodeLib.Anon_UserIdAnonymousIdCategory,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
  /* The track method lets you record the actions your users perform. */
  def track(message: analyticsDashNodeLib.Anon_UserIdAnonymousId): Analytics = js.native
  def track(
    message: analyticsDashNodeLib.Anon_UserIdAnonymousId,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ Data, scala.Unit]
  ): Analytics = js.native
}

