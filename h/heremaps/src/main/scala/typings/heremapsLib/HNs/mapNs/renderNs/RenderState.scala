package typings
package heremapsLib.HNs.mapNs.renderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderState extends js.Object

/**
  * The rendering states of the layer.
  */
@JSGlobal("H.map.render.RenderState")
@js.native
object RenderState extends js.Object {
  /** Data rendering or animation is in progress. */
  @js.native
  sealed trait ACTIVE
    extends heremapsLib.HNs.mapNs.renderNs.RenderState
  
  /** Data rendering or animation is done. */
  @js.native
  sealed trait DONE
    extends heremapsLib.HNs.mapNs.renderNs.RenderState
  
  /**
    * Data loading/processing is still in progress, but there is nothing to render. In this state rendering engine might go to sleep mode after
    * certain amount of time to prevent draining of battery on the user device.
    */
  @js.native
  sealed trait PENDING
    extends heremapsLib.HNs.mapNs.renderNs.RenderState
  
  val ACTIVE: ACTIVE with java.lang.String = js.native
  val DONE: DONE with java.lang.String = js.native
  val PENDING: PENDING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.mapNs.renderNs.RenderState with java.lang.String] = js.native
}

