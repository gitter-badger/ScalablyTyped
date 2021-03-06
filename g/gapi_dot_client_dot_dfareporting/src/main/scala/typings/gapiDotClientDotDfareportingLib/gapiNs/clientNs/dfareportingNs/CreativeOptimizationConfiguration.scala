package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeOptimizationConfiguration extends js.Object {
  /** ID of this creative optimization config. This field is auto-generated when the campaign is inserted or updated. It can be null for existing campaigns. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this creative optimization config. This is a required field and must be less than 129 characters long. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** List of optimization activities associated with this configuration. */
  var optimizationActivitys: js.UndefOr[js.Array[OptimizationActivity]] = js.undefined
  /** Optimization model for this configuration. */
  var optimizationModel: js.UndefOr[java.lang.String] = js.undefined
}

