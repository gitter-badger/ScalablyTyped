package typings
package typesettableLib.buildSrcWritersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/writers", "Writer")
@js.native
class Writer protected ()
  extends typesettableLib.buildSrcWritersWriterMod.Writer {
  def this(_measurer: typesettableLib.buildSrcMeasurersMod.AbstractMeasurer, _penFactory: typesettableLib.buildSrcContextsMod.IPenFactoryContext[_]) = this()
  def this(_measurer: typesettableLib.buildSrcMeasurersMod.AbstractMeasurer, _penFactory: typesettableLib.buildSrcContextsMod.IPenFactoryContext[_], _wrapper: typesettableLib.buildSrcWrappersMod.Wrapper) = this()
}

@JSImport("typesettable/build/src/writers", "Writer")
@js.native
object Writer extends js.Object {
  var SupportedRotation: js.Any = js.native
  var XOffsetFactor: typesettableLib.typesettableLibStrings.Writer with js.Any = js.native
  var YOffsetFactor: typesettableLib.typesettableLibStrings.Writer with js.Any = js.native
}

