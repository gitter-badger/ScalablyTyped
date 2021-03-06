package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ixMonad")
@js.native
object ixMonadNs extends js.Object {
  def iapplyFirst[F](ixmonad: fpDashTsLib.libIxMonadMod.IxMonad[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    fpDashTsLib.libHKTMod.HKT3[F, _, _, _]
  ] = js.native
  def iapplyFirst[F /* <: fpDashTsLib.libHKTMod.URIS3 */](ixmonad: fpDashTsLib.libIxMonadMod.IxMonad3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def iapplySecond[F](ixmonad: fpDashTsLib.libIxMonadMod.IxMonad[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.HKT3[F, _, _, _], 
    fpDashTsLib.libHKTMod.HKT3[F, _, _, _]
  ] = js.native
  def iapplySecond[F /* <: fpDashTsLib.libHKTMod.URIS3 */](ixmonad: fpDashTsLib.libIxMonadMod.IxMonad3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
}

