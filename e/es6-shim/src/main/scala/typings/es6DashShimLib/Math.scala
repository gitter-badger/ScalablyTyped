package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  /**
    * Returns the inverse hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def acosh(x: scala.Double): scala.Double
  /**
    * Returns the inverse hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def asinh(x: scala.Double): scala.Double
  /**
    * Returns the inverse hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def atanh(x: scala.Double): scala.Double
  /**
    * Returns an implementation-dependent approximation to the cube root of number.
    * @param x A numeric expression.
    */
  def cbrt(x: scala.Double): scala.Double
  /**
    * Returns the number of leading zero bits in the 32-bit binary representation of a number.
    * @param x A numeric expression.
    */
  def clz32(x: scala.Double): scala.Double
  /**
    * Returns the hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cosh(x: scala.Double): scala.Double
  /**
    * Returns the result of (e^x - 1) of x (e raised to the power of x, where e is the base of
    * the natural logarithms).
    * @param x A numeric expression.
    */
  def expm1(x: scala.Double): scala.Double
  /**
    * Returns the nearest single precision float representation of a number.
    * @param x A numeric expression.
    */
  def fround(x: scala.Double): scala.Double
  /**
    * Returns the square root of the sum of squares of its arguments.
    * @param values Values to compute the square root for.
    *     If no arguments are passed, the result is +0.
    *     If there is only one argument, the result is the absolute value.
    *     If any argument is +Infinity or -Infinity, the result is +Infinity.
    *     If any argument is NaN, the result is NaN.
    *     If all arguments are either +0 or −0, the result is +0.
    */
  def hypot(values: scala.Double*): scala.Double
  /**
    * Returns the result of 32-bit multiplication of two numbers.
    * @param x First number
    * @param y Second number
    */
  def imul(x: scala.Double, y: scala.Double): scala.Double
  /**
    * Returns the base 10 logarithm of a number.
    * @param x A numeric expression.
    */
  def log10(x: scala.Double): scala.Double
  /**
    * Returns the natural logarithm of 1 + x.
    * @param x A numeric expression.
    */
  def log1p(x: scala.Double): scala.Double
  /**
    * Returns the base 2 logarithm of a number.
    * @param x A numeric expression.
    */
  def log2(x: scala.Double): scala.Double
  /**
    * Returns the sign of the x, indicating whether x is positive, negative or zero.
    * @param x The numeric expression to test
    */
  def sign(x: scala.Double): scala.Double
  /**
    * Returns the hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sinh(x: scala.Double): scala.Double
  /**
    * Returns the hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tanh(x: scala.Double): scala.Double
  /**
    * Returns the integral part of the a numeric expression, x, removing any fractional digits.
    * If x is already an integer, the result is x.
    * @param x A numeric expression.
    */
  def trunc(x: scala.Double): scala.Double
}

