package typings
package rawDashBodyLib.rawDashBodyMod.getRawBodyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The encoding to use to decode the body into a string. By default, a
    * `Buffer` instance will be returned when no encoding is specified. Most
    * likely, you want `utf-8`, so setting encoding to `true` will decode as
    * `utf-8`. You can use any type of encoding supported by `iconv-lite`.
    */
  var encoding: js.UndefOr[Encoding | scala.Null] = js.undefined
  /**
    * The expected length of the stream.
    */
  var length: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var limit: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
}

