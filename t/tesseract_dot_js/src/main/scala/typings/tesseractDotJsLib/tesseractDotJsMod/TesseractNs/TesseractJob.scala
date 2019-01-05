package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TesseractJob extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ nodeLib.Error with stdLib.Error, TesseractJob]] = js.undefined
  def `catch`(callback: js.Function1[/* error */ nodeLib.Error with stdLib.Error, scala.Unit]): TesseractJob
  def `finally`(callback: js.Function1[/* resultOrError */ (nodeLib.Error with stdLib.Error) | Page, scala.Unit]): TesseractJob
  def progress(callback: js.Function1[/* progress */ Progress, scala.Unit]): TesseractJob
  def `then`(callback: js.Function1[/* result */ Page, scala.Unit]): TesseractJob
}

