package typings
package titaniumLib.TitaniumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Buffer is a mutable, resizable container for raw data.
	 */
@js.native
trait Buffer extends Proxy {
  /**
  		 * Byte order of this buffer.
  		 */
  var byteOrder: scala.Double = js.native
  /**
  		 * Length of the buffer in bytes.
  		 */
  var length: scala.Double = js.native
  /**
  		 * The type of data encoding to use with `value`.
  		 */
  var `type`: java.lang.String = js.native
  /**
  		 * Data to be encoded.
  		 */
  var value: scala.Double | java.lang.String = js.native
  /**
  		 * Appends `sourceBuffer` to the this buffer.
  		 */
  def append(sourceBuffer: Buffer): scala.Double = js.native
  def append(sourceBuffer: Buffer, sourceOffset: scala.Double): scala.Double = js.native
  def append(sourceBuffer: Buffer, sourceOffset: scala.Double, sourceLength: scala.Double): scala.Double = js.native
  /**
  		 * Clears this buffer's contents but does not change the size of the buffer.
  		 */
  def clear(): scala.Unit = js.native
  def clone(offset: scala.Double): Buffer = js.native
  def clone(offset: scala.Double, length: scala.Double): Buffer = js.native
  /**
  		 * Copies data from `sourceBuffer` into the current buffer at `offset`.
  		 */
  def copy(sourceBuffer: Buffer, offset: scala.Double): scala.Double = js.native
  def copy(sourceBuffer: Buffer, offset: scala.Double, sourceOffset: scala.Double): scala.Double = js.native
  def copy(sourceBuffer: Buffer, offset: scala.Double, sourceOffset: scala.Double, sourceLength: scala.Double): scala.Double = js.native
  /**
  		 * Fills this buffer with the specified byte value.
  		 */
  def fill(fillByte: scala.Double): scala.Unit = js.native
  def fill(fillByte: scala.Double, offset: scala.Double): scala.Unit = js.native
  def fill(fillByte: scala.Double, offset: scala.Double, length: scala.Double): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Buffer.byteOrder> property.
  		 */
  def getByteOrder(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Buffer.length> property.
  		 */
  def getLength(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Buffer.type> property.
  		 */
  def getType(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Buffer.value> property.
  		 */
  def getValue(): scala.Double | java.lang.String = js.native
  /**
  		 * Inserts data from `sourceBuffer` into this buffer at `offset`.
  		 */
  def insert(sourceBuffer: Buffer, offset: scala.Double): scala.Double = js.native
  def insert(sourceBuffer: Buffer, offset: scala.Double, sourceOffset: scala.Double): scala.Double = js.native
  def insert(sourceBuffer: Buffer, offset: scala.Double, sourceOffset: scala.Double, sourceLength: scala.Double): scala.Double = js.native
  /**
  		 * Releases the space allocated to the buffer, and sets its length to 0.
  		 */
  def release(): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.byteOrder> property.
  		 */
  def setByteOrder(byteOrder: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.length> property.
  		 */
  def setLength(length: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.type> property.
  		 */
  def setType(`type`: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.value> property.
  		 */
  def setValue(value: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.value> property.
  		 */
  def setValue(value: scala.Double): scala.Unit = js.native
  /**
  		 * Converts this buffer to a <Titanium.Blob>.
  		 */
  def toBlob(): Blob = js.native
}

