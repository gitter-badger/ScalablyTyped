package typings
package reduxDashObservableLib.reduxDashObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def combineEpics(epics: js.Any*): js.Any = js.native
  @JSName("combineEpics")
  def combineEpics_EE[E](epics: E*): E = js.native
  @JSName("combineEpics")
  def combineEpics_TActionOTSDEpic[T /* <: reduxLib.reduxMod.Action[_] */, O /* <: T */, S, D](epics: (reduxDashObservableLib.reduxDashObservableMod.Epic[T, O, S, D])*): reduxDashObservableLib.reduxDashObservableMod.Epic[T, O, S, D] = js.native
  def createEpicMiddleware[T /* <: reduxLib.reduxMod.Action[_] */, O /* <: T */, S, D](): reduxDashObservableLib.reduxDashObservableMod.EpicMiddleware[T, O, S, D] = js.native
  def createEpicMiddleware[T /* <: reduxLib.reduxMod.Action[_] */, O /* <: T */, S, D](options: reduxDashObservableLib.reduxDashObservableMod.Options[D]): reduxDashObservableLib.reduxDashObservableMod.EpicMiddleware[T, O, S, D] = js.native
  def ofType[T /* <: reduxLib.reduxMod.Action[_] */, R /* <: T */, K /* <: /* import warning: ImportType.apply Failed type conversion: R['type'] */ js.Any */](key: K*): js.Function1[/* source */ rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Observable[R]] = js.native
}

