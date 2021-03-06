package typings
package fpDashTsLib.libApplyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def ap[A, B](fab: fpDashTsLib.libHKTMod.HKT[F, js.Function1[/* a */ A, B]], fa: fpDashTsLib.libHKTMod.HKT[F, A]): fpDashTsLib.libHKTMod.HKT[F, B]
}

