package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildSettings extends js.Object {
  /**
    * The number of days to keep records of deleted builds.
    */
  var daysToKeepDeletedBuildsBeforeDestroy: scala.Double
  /**
    * The default retention policy.
    */
  var defaultRetentionPolicy: RetentionPolicy
  /**
    * The maximum retention policy.
    */
  var maximumRetentionPolicy: RetentionPolicy
}

