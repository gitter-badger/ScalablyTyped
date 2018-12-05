package typings
package socketclusterLib.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketCluster
  extends nodeLib.eventsMod.EventEmitter {
  val EVENT_BROKER_EXIT: socketclusterLib.socketclusterLibStrings.brokerExit = js.native
  val EVENT_BROKER_START: socketclusterLib.socketclusterLibStrings.brokerStart = js.native
  val EVENT_FAIL: socketclusterLib.socketclusterLibStrings.fail = js.native
  val EVENT_READY: socketclusterLib.socketclusterLibStrings.ready = js.native
  val EVENT_WARNING: socketclusterLib.socketclusterLibStrings.warning = js.native
  val EVENT_WORKER_CLUSTER_EXIT: socketclusterLib.socketclusterLibStrings.workerClusterExit = js.native
  val EVENT_WORKER_CLUSTER_READY: socketclusterLib.socketclusterLibStrings.workerClusterReady = js.native
  val EVENT_WORKER_CLUSTER_START: socketclusterLib.socketclusterLibStrings.workerClusterStart = js.native
  val EVENT_WORKER_EXIT: socketclusterLib.socketclusterLibStrings.workerExit = js.native
  val EVENT_WORKER_START: socketclusterLib.socketclusterLibStrings.workerStart = js.native
  var options: js.Any = js.native
  @JSName("on")
  def on_brokerExit(
    event: socketclusterLib.socketclusterLibStrings.brokerExit,
    listener: js.Function1[
      /* brokerInfo */ socketclusterLib.socketclusterMod.SocketClusterNs.BrokerExitInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_brokerStart(
    event: socketclusterLib.socketclusterLibStrings.brokerStart,
    listener: js.Function1[
      /* brokerInfo */ socketclusterLib.socketclusterMod.SocketClusterNs.BrokerStartInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fail(
    event: socketclusterLib.socketclusterLibStrings.fail,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ready(event: socketclusterLib.socketclusterLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_warning(
    event: socketclusterLib.socketclusterLibStrings.warning,
    listener: js.Function1[/* warning */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_workerClusterExit(
    event: socketclusterLib.socketclusterLibStrings.workerClusterExit,
    listener: js.Function1[/* workerClusterInfo */ WorkerClusterExitInfo, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_workerClusterReady(
    event: socketclusterLib.socketclusterLibStrings.workerClusterReady,
    listener: js.Function1[/* workerClusterInfo */ WorkerClusterReadyInfo, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_workerClusterStart(
    event: socketclusterLib.socketclusterLibStrings.workerClusterStart,
    listener: js.Function1[/* workerClusterInfo */ WorkerClusterStartInfo, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_workerExit(
    event: socketclusterLib.socketclusterLibStrings.workerExit,
    listener: js.Function1[
      /* workerInfo */ socketclusterLib.socketclusterMod.SocketClusterNs.WorkerExitInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_workerStart(
    event: socketclusterLib.socketclusterLibStrings.workerStart,
    listener: js.Function1[/* workerInfo */ WorkerStartInfo, scala.Unit]
  ): this.type = js.native
}
