package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifyCommand extends js.Object {
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

