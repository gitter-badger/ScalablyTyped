package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pinoLibStrings {
  @js.native
  sealed trait debug extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait fatal extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait `level-change` extends js.Object
  
  @js.native
  sealed trait silent extends js.Object
  
  @js.native
  sealed trait trace extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  def debug: debug = "debug".asInstanceOf[debug]
  def error: error = "error".asInstanceOf[error]
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  def info: info = "info".asInstanceOf[info]
  def `level-change`: `level-change` = "level-change".asInstanceOf[`level-change`]
  def silent: silent = "silent".asInstanceOf[silent]
  def trace: trace = "trace".asInstanceOf[trace]
  def warn: warn = "warn".asInstanceOf[warn]
}

