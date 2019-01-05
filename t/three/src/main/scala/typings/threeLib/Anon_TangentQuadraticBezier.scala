package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TangentQuadraticBezier extends js.Object {
  def interpolate(p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double, t: scala.Double): scala.Double
  def tangentCubicBezier(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double): scala.Double
  def tangentQuadraticBezier(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double): scala.Double
  def tangentSpline(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double): scala.Double
}

