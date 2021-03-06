package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionEvaluationResult extends js.Object {
  /**
    * Subscription evaluation job status
    */
  var evaluationJobStatus: EvaluationOperationStatus
  /**
    * Subscription evaluation events results.
    */
  var events: EventsEvaluationResult
  /**
    * The requestId which is the subscription evaluation jobId
    */
  var id: java.lang.String
  /**
    * Subscription evaluation  notification results.
    */
  var notifications: NotificationsEvaluationResult
}

