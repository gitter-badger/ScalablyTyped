package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a default implementation of the IBuffer interface and its related interfaces. */
@JSGlobal("Windows.Storage.Streams.Buffer")
@js.native
class Buffer protected () extends js.Object {
  /**
    * Initializes a new instance of the Buffer class with the specified capacity.
    * @param capacity The maximum number of bytes that the buffer can hold.
    */
  def this(capacity: scala.Double) = this()
  var byteLength: js.Any = js.native
   /* unmapped type */ /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: scala.Double = js.native
  /** Gets the number of bytes currently in use in the buffer. */
  var length: scala.Double = js.native
}

/** Provides a default implementation of the IBuffer interface and its related interfaces. */
@JSGlobal("Windows.Storage.Streams.Buffer")
@js.native
object Buffer extends js.Object {
  /**
    * Creates a new buffer containing a copy of a specified buffer.
    * @param input The buffer to be copied.
    * @return The newly created copy.
    */
  def createCopyFromMemoryBuffer(input: winrtDashUwpLib.WindowsNs.FoundationNs.IMemoryBuffer): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.Buffer = js.native
  /**
    * Creates a MemoryBuffer from an existing IBuffer .
    * @param input The input IBuffer .
    * @return The newly created MemoryBuffer .
    */
  def createMemoryBufferOverIBuffer(input: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.MemoryBuffer = js.native
}

