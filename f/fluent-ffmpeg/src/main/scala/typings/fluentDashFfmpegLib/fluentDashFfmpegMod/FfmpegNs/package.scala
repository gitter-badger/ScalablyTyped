package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FfmpegNs {
  type CodecsCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* codecs */ Codecs, scala.Unit]
  type EncodersCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* encoders */ Encoders, scala.Unit]
  type FiltersCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* filters */ Filters, scala.Unit]
  type FormatsCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* formats */ Formats, scala.Unit]
  type GetPreset = js.Function1[/* command */ FfmpegCommand, java.lang.String]
}
