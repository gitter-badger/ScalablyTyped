package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait PassportLocalSchema extends js.Object {
  // overload for the default mongoose plugin function
  def plugin(
    plugin: js.Function2[
      (/* schema */ this.type) | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Schema */ /* schema */ js.Any), 
      /* options */ js.UndefOr[js.Object | PassportLocalOptions], 
      scala.Unit
    ]
  ): this.type = js.native
  def plugin(
    plugin: js.Function2[/* schema */ this.type, /* options */ js.UndefOr[PassportLocalOptions], scala.Unit],
    options: PassportLocalOptions
  ): this.type = js.native
  def plugin(
    plugin: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Schema */ /* schema */ js.Any, 
      /* options */ js.UndefOr[js.Object], 
      scala.Unit
    ],
    opts: js.Object
  ): this.type = js.native
}

