package typings
package materializeDashCssLib.materializeDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Parallax")
@js.native
class Parallax ()
  extends materializeDashCssLib.MNs.Parallax

@JSImport("materialize-css", "Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Parallax] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.ParallaxOptions]
  ): js.Array[materializeDashCssLib.MNs.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Parallax = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.ParallaxOptions]): materializeDashCssLib.MNs.Parallax = js.native
}

