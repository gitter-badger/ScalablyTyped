package typings
package through2Lib.through2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("through2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): nodeLib.streamMod.Transform = js.native
  def apply(opts: nodeLib.streamMod.internalNs.DuplexOptions): nodeLib.streamMod.Transform = js.native
  def apply(
    opts: nodeLib.streamMod.internalNs.DuplexOptions,
    transform: through2Lib.through2Mod.through2Ns.TransformFunction
  ): nodeLib.streamMod.Transform = js.native
  def apply(
    opts: nodeLib.streamMod.internalNs.DuplexOptions,
    transform: through2Lib.through2Mod.through2Ns.TransformFunction,
    flush: through2Lib.through2Mod.through2Ns.FlushCallback
  ): nodeLib.streamMod.Transform = js.native
  def apply(transform: through2Lib.through2Mod.through2Ns.TransformFunction): nodeLib.streamMod.Transform = js.native
  def apply(
    transform: through2Lib.through2Mod.through2Ns.TransformFunction,
    flush: through2Lib.through2Mod.through2Ns.FlushCallback
  ): nodeLib.streamMod.Transform = js.native
  /**
  	 * Creates a constructor for a custom Transform. This is useful when you
  	 * want to use the same transform logic in multiple instances.
  	 */
  def ctor(): through2Lib.through2Mod.through2Ns.Through2Constructor = js.native
  def ctor(opts: nodeLib.streamMod.internalNs.DuplexOptions): through2Lib.through2Mod.through2Ns.Through2Constructor = js.native
  def ctor(
    opts: nodeLib.streamMod.internalNs.DuplexOptions,
    transform: through2Lib.through2Mod.through2Ns.TransformFunction
  ): through2Lib.through2Mod.through2Ns.Through2Constructor = js.native
  def ctor(
    opts: nodeLib.streamMod.internalNs.DuplexOptions,
    transform: through2Lib.through2Mod.through2Ns.TransformFunction,
    flush: through2Lib.through2Mod.through2Ns.FlushCallback
  ): through2Lib.through2Mod.through2Ns.Through2Constructor = js.native
  def ctor(transform: through2Lib.through2Mod.through2Ns.TransformFunction): through2Lib.through2Mod.through2Ns.Through2Constructor = js.native
  def ctor(
    transform: through2Lib.through2Mod.through2Ns.TransformFunction,
    flush: through2Lib.through2Mod.through2Ns.FlushCallback
  ): through2Lib.through2Mod.through2Ns.Through2Constructor = js.native
  /**
  	 * Convenvience method for creating object streams
  	 */
  def obj(): nodeLib.streamMod.Transform = js.native
  def obj(transform: through2Lib.through2Mod.through2Ns.TransformFunction): nodeLib.streamMod.Transform = js.native
  def obj(
    transform: through2Lib.through2Mod.through2Ns.TransformFunction,
    flush: through2Lib.through2Mod.through2Ns.FlushCallback
  ): nodeLib.streamMod.Transform = js.native
}

