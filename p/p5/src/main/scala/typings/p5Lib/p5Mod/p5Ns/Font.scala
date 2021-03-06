package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  /**
    *   Underlying opentype font implementation
    */
  var font: js.Any = js.native
  /**
    *   Returns a tight bounding box for the given text
    *   string using this font (currently only supports
    *   single lines)
    *   @param line a line of text
    *   @param x x-position
    *   @param y y-position
    *   @param [fontSize] font size to use (optional)
    *   @param [options] opentype options (optional)
    *   @return a rectangle object with properties: x, y,
    *   w, h
    */
  def textBounds(line: java.lang.String, x: scala.Double, y: scala.Double): js.Object = js.native
  def textBounds(line: java.lang.String, x: scala.Double, y: scala.Double, fontSize: scala.Double): js.Object = js.native
  def textBounds(
    line: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: js.Object
  ): js.Object = js.native
  /**
    *   Computes an array of points following the path for
    *   specified text
    *   @param txt a line of text
    *   @param x x-position
    *   @param y y-position
    *   @param fontSize font size to use (optional)
    *   @param [options] an (optional) object that can
    *   contain:
    *
    *
    *   sampleFactor - the ratio of path-length to number
    *   of samples (default=.25); higher values yield more
    *   points and are therefore more precise
    *
    *
    *   simplifyThreshold - if set to a non-zero value,
    *   collinear points will be be removed from the
    *   polygon; the value represents the threshold angle
    *   to use when determining whether two edges are
    *   collinear
    *   @return an array of points, each with x, y, alpha
    *   (the path angle)
    */
  def textToPoints(txt: java.lang.String, x: scala.Double, y: scala.Double, fontSize: scala.Double): js.Array[_] = js.native
  def textToPoints(
    txt: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: js.Object
  ): js.Array[_] = js.native
}

