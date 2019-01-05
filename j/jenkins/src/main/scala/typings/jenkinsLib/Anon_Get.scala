package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Get extends js.Object {
  def get(
    name: java.lang.String,
    n: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def log(
    name: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def log(
    name: java.lang.String,
    n: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def log(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def logStream(name: java.lang.String, n: scala.Double): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("logStream")
  def logStream_html(name: java.lang.String, n: scala.Double, `type`: jenkinsLib.jenkinsLibStrings.html): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("logStream")
  def logStream_html(
    name: java.lang.String,
    n: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.html,
    delay: scala.Double
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("logStream")
  def logStream_text(name: java.lang.String, n: scala.Double, `type`: jenkinsLib.jenkinsLibStrings.text): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("logStream")
  def logStream_text(
    name: java.lang.String,
    n: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.text,
    delay: scala.Double
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("log")
  def log_html(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.html,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("log")
  def log_html(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.html,
    meta: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("log")
  def log_text(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.text,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("log")
  def log_text(
    name: java.lang.String,
    n: scala.Double,
    start: scala.Double,
    `type`: jenkinsLib.jenkinsLibStrings.text,
    meta: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def stop(
    name: java.lang.String,
    n: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error with stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def term(
    name: java.lang.String,
    n: scala.Double,
    callback: js.Function1[/* err */ nodeLib.Error with stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

