package typings
package mockDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifyPrefix extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def `__promisify__`(prefix: java.lang.String): js.Promise[java.lang.String] = js.native
  def `__promisify__`(prefix: java.lang.String, options: java.lang.String): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def `__promisify__`(prefix: java.lang.String, options: nodeLib.Anon_EncodingBufferEncodingNull): js.Promise[java.lang.String] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def `__promisify__`(prefix: java.lang.String, options: nodeLib.Anon_EncodingBuffer_1560675869): js.Promise[nodeLib.Buffer] = js.native
  def `__promisify__`(prefix: java.lang.String, options: nodeLib.Anon_EncodingString): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def `__promisify__`(prefix: java.lang.String, options: nodeLib.BufferEncoding): js.Promise[java.lang.String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(prefix: java.lang.String, options: mockDashFsLib.mockDashFsLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
}

