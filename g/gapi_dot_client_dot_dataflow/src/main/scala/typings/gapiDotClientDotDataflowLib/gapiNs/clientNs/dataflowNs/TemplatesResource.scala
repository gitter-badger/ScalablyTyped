package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplatesResource extends js.Object {
  /** Creates a Cloud Dataflow job from a template. */
  def create(request: gapiDotClientDotDataflowLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKeyLocation): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. */
  def create(
    request: gapiDotClientDotDataflowLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[Job] = js.native
  /** Get the template associated with a template. */
  def get(request: gapiDotClientDotDataflowLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsGcsPath): gapiDotClientLib.gapiNs.clientNs.Request[GetTemplateResponse] = js.native
  /** Get the template associated with a template. */
  def get(
    request: gapiDotClientDotDataflowLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocation
  ): gapiDotClientLib.gapiNs.clientNs.Request[GetTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: gapiDotClientDotDataflowLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsGcsPathKey): gapiDotClientLib.gapiNs.clientNs.Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(
    request: gapiDotClientDotDataflowLib.Anon_XgafvAccesstokenAltBearertokenCallbackFieldsGcsPathKeyLocationOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[LaunchTemplateResponse] = js.native
}

