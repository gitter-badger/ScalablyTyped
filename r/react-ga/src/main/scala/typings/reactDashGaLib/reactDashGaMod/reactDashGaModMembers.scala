package typings
package reactDashGaLib.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-ga", JSImport.Namespace)
@js.native
object reactDashGaModMembers extends js.Object {
  val OutboundLink: reactLib.reactMod.ReactNs.ComponentClass[
    OutboundLinkProps with (reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLAnchorElement with stdLib.HTMLAnchorElement]), 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  val plugin: Plugin = js.native
  val testModeAPI: TestModeAPI = js.native
  def event(args: EventArgs): scala.Unit = js.native
  def event(args: EventArgs, trackerNames: TrackerNames): scala.Unit = js.native
  def exception(fieldsObject: FieldsObject): scala.Unit = js.native
  def exception(fieldsObject: FieldsObject, trackerNames: TrackerNames): scala.Unit = js.native
  def ga(): js.Any = js.native
  def initialize(trackers: js.Array[Tracker]): scala.Unit = js.native
  def initialize(trackers: js.Array[Tracker], options: InitializeOptions): scala.Unit = js.native
  def initialize(trackingCode: java.lang.String): scala.Unit = js.native
  def initialize(trackingCode: java.lang.String, options: InitializeOptions): scala.Unit = js.native
  def modalview(name: java.lang.String): scala.Unit = js.native
  def modalview(name: java.lang.String, trackerNames: TrackerNames): scala.Unit = js.native
  def outboundLink(args: OutboundLinkArgs, hitCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def outboundLink(args: OutboundLinkArgs, hitCallback: js.Function0[scala.Unit], trackerNames: TrackerNames): scala.Unit = js.native
  def pageview(path: java.lang.String): scala.Unit = js.native
  def pageview(path: java.lang.String, trackerNames: TrackerNames): scala.Unit = js.native
  def pageview(path: java.lang.String, trackerNames: TrackerNames, title: java.lang.String): scala.Unit = js.native
  def send(fieldsObject: FieldsObject): scala.Unit = js.native
  def send(fieldsObject: FieldsObject, trackerNames: TrackerNames): scala.Unit = js.native
  def set(fieldsObject: FieldsObject): scala.Unit = js.native
  def set(fieldsObject: FieldsObject, trackerNames: TrackerNames): scala.Unit = js.native
  def timing(args: TimingArgs): scala.Unit = js.native
  def timing(args: TimingArgs, trackerNames: TrackerNames): scala.Unit = js.native
}

