package typings
package istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-instrument", JSImport.Namespace)
@js.native
object istanbulDashLibDashInstrumentModMembers extends js.Object {
  def createInstrumenter(): Instrumenter = js.native
  def createInstrumenter(options: stdLib.Partial[InstrumenterOptions]): Instrumenter = js.native
  def programVisitor(types: istanbulDashLibDashInstrumentLib.Anon_ArrayExpression): Visitor = js.native
  def programVisitor(types: istanbulDashLibDashInstrumentLib.Anon_ArrayExpression, sourceFilePath: java.lang.String): Visitor = js.native
  def programVisitor(
    types: istanbulDashLibDashInstrumentLib.Anon_ArrayExpression,
    sourceFilePath: java.lang.String,
    opts: stdLib.Partial[VisitorOptions]
  ): Visitor = js.native
  def readInitialCoverage(code: java.lang.String): InitialCoverage = js.native
}

