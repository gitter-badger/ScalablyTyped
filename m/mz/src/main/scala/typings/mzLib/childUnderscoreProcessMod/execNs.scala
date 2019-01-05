package typings
package mzLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz/child_process", "exec")
@js.native
object execNs extends js.Object {
  def `__promisify__`(command: java.lang.String): js.Promise[nodeLib.Anon_Stdout] = js.native
  def `__promisify__`(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): js.Promise[nodeLib.Anon_StdoutStderrString] = js.native
  def `__promisify__`(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingBuffer with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): js.Promise[nodeLib.Anon_StdoutStderr] = js.native
  def `__promisify__`(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingBufferEncoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): js.Promise[nodeLib.Anon_Stdout] = js.native
  def `__promisify__`(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): js.Promise[nodeLib.Anon_Stdout] = js.native
}

