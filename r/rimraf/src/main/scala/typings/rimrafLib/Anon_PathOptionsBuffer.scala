package typings
package rimrafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PathOptionsBuffer extends js.Object {
  def apply(path: nodeLib.fsMod.PathLike): js.Array[java.lang.String] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferWithFileTypes): js.Array[nodeLib.Buffer] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingWithFileTypes): js.Array[java.lang.String] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingWithFileTypesFalse): js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypes): js.Array[nodeLib.fsMod.Dirent] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Array[java.lang.String] = js.native
  def apply(path: nodeLib.fsMod.PathLike, options: rimrafLib.rimrafLibStrings.buffer): js.Array[nodeLib.Buffer] = js.native
}

