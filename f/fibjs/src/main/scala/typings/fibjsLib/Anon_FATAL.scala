package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FATAL extends js.Object {
  val ALERT: /* 1 */ scala.Double = js.native
  val CRIT: /* 2 */ scala.Double = js.native
  val DEBUG: /* 7 */ scala.Double = js.native
  val ERROR: /* 3 */ scala.Double = js.native
  val FATAL: /* 0 */ scala.Double = js.native
  val INFO: /* 6 */ scala.Double = js.native
  val NOTICE: /* 5 */ scala.Double = js.native
  val NOTSET: /* 10 */ scala.Double = js.native
  val PRINT: /* 9 */ scala.Double = js.native
  val WARN: /* 4 */ scala.Double = js.native
  val consoleNs: js.Any = js.native
  val height: scala.Double = js.native
  val loglevel: scala.Double = js.native
  val width: scala.Double = js.native
  def add(cfg: js.Array[_]): scala.Unit = js.native
  def add(cfg: js.Object): scala.Unit = js.native
  def add(`type`: java.lang.String): scala.Unit = js.native
  def alert(args: js.Any*): scala.Unit = js.native
  def alert(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def assert(value: js.Any): scala.Unit = js.native
  def assert(value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clickMouse(button: java.lang.String): scala.Unit = js.native
  def clickMouse(button: java.lang.String, dbclick: scala.Boolean): scala.Unit = js.native
  def crit(args: js.Any*): scala.Unit = js.native
  def crit(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def debug(args: js.Any*): scala.Unit = js.native
  def debug(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def dir(obj: js.Any): scala.Unit = js.native
  def error(args: js.Any*): scala.Unit = js.native
  def error(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def hideCursor(): scala.Unit = js.native
  def info(args: js.Any*): scala.Unit = js.native
  def info(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def keyDown(key: java.lang.String): scala.Unit = js.native
  def keyDown(key: java.lang.String, modifier: java.lang.String): scala.Unit = js.native
  def keyDown(key: java.lang.String, modifier: js.Array[_]): scala.Unit = js.native
  def keyTap(key: java.lang.String): scala.Unit = js.native
  def keyTap(key: java.lang.String, modifier: java.lang.String): scala.Unit = js.native
  def keyTap(key: java.lang.String, modifier: js.Array[_]): scala.Unit = js.native
  def keyUp(key: java.lang.String): scala.Unit = js.native
  def keyUp(key: java.lang.String, modifier: java.lang.String): scala.Unit = js.native
  def keyUp(key: java.lang.String, modifier: js.Array[_]): scala.Unit = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def log(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def mouseDown(button: java.lang.String): scala.Unit = js.native
  def mouseUp(button: java.lang.String): scala.Unit = js.native
  def moveMouse(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(row: scala.Double, column: scala.Double): scala.Unit = js.native
  def notice(args: js.Any*): scala.Unit = js.native
  def notice(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def print(args: js.Any*): scala.Unit = js.native
  def print(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def readLine(): java.lang.String = js.native
  def readLine(msg: java.lang.String): java.lang.String = js.native
  def reset(): scala.Unit = js.native
  def showCursor(): scala.Unit = js.native
  def time(): scala.Unit = js.native
  def time(label: java.lang.String): scala.Unit = js.native
  def timeElapse(): scala.Unit = js.native
  def timeElapse(label: java.lang.String): scala.Unit = js.native
  def timeEnd(): scala.Unit = js.native
  def timeEnd(label: java.lang.String): scala.Unit = js.native
  def trace(): scala.Unit = js.native
  def trace(label: java.lang.String): scala.Unit = js.native
  def typeString(text: java.lang.String): scala.Unit = js.native
  def warn(args: js.Any*): scala.Unit = js.native
  def warn(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
}

