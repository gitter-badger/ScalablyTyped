package typings
package vscodeDashJsonrpcLib.libMessageWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageWriter", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends AbstractMessageWriter
     with MessageWriter {
  def this(writable: nodeLib.NodeJSNs.WritableStream) = this()
  def this(writable: nodeLib.NodeJSNs.WritableStream, encoding: java.lang.String) = this()
  var encoding: js.Any = js.native
  var errorCount: js.Any = js.native
  var writable: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /**
    *
    * @param listener The listener function will be call when the event happens.
    * @param thisArgs The 'this' which will be used when calling the event listener.
    * @param disposables An array to which a {{IDisposable}} will be added. The
    * @return
    */
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ scala.Unit, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ scala.Unit, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(
    listener: js.Function1[/* e */ scala.Unit, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /**
    *
    * @param listener The listener function will be call when the event happens.
    * @param thisArgs The 'this' which will be used when calling the event listener.
    * @param disposables An array to which a {{IDisposable}} will be added. The
    * @return
    */
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error with stdLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error with stdLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* InferMemberOverrides */
  override def onError(
    listener: js.Function1[
      /* e */ js.Tuple3[
        nodeLib.Error with stdLib.Error, 
        js.UndefOr[vscodeDashJsonrpcLib.libMessagesMod.Message], 
        js.UndefOr[scala.Double]
      ], 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}

