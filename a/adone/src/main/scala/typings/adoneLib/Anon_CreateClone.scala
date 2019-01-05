package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateClone extends js.Object {
  /**
    * Adds two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Math.ceil the components of a vec2
    *
    * @param out the receiving vector
    * @param a vector to ceil
    * @returns out
    */
  def ceil(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def ceil(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Creates a new vec2 initialized with values from an existing vector
    *
    * @param a a vector to clone
    * @returns a new 2D vector
    */
  def clone(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def clone(a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Copy the values from one vec2 to another
    *
    * @param out the receiving vector
    * @param a the source vector
    * @returns out
    */
  def copy(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def copy(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Creates a new, empty vec2
    *
    * @returns a new 2D vector
    */
  def create(): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Computes the cross product of two vec2's
    * Note that the cross product must by definition produce a 3D vector
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def cross(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def cross(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def cross(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def cross(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Calculates the euclidian distance between two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def dist(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def dist(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: js.Array[scala.Double]): scala.Double = js.native
  def dist(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def dist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the euclidian distance between two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def distance(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def distance(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: js.Array[scala.Double]): scala.Double = js.native
  def distance(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def distance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Divides two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def div(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def div(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def div(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def div(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Divides two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def divide(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def divide(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def divide(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def divide(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Calculates the dot product of two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns dot product of a and b
    */
  def dot(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def dot(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: js.Array[scala.Double]): scala.Double = js.native
  def dot(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def dot(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Returns whether or not the vectors have approximately the same elements in the same position.
    *
    * @param a The first vector.
    * @param b The second vector.
    * @returns True if the vectors are equal, false otherwise.
    */
  def equals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Boolean = js.native
  def equals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: js.Array[scala.Double]): scala.Boolean = js.native
  def equals(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Boolean = js.native
  def equals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Returns whether or not the vectors exactly have the same elements in the same position (when compared with ===)
    *
    * @param a The first vector.
    * @param b The second vector.
    * @returns True if the vectors are equal, false otherwise.
    */
  def exactEquals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Boolean = js.native
  def exactEquals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: js.Array[scala.Double]): scala.Boolean = js.native
  def exactEquals(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Boolean = js.native
  def exactEquals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Math.floor the components of a vec2
    *
    * @param out the receiving vector
    * @param a vector to floor
    * @returns out
    */
  def floor(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def floor(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Perform some operation over an array of vec2s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec2. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec2s to iterate over. If 0 iterates over entire array
    * @param fn Function to call for each vector in the array
    * @returns a
    */
  def forEach(
    a: stdLib.Float32Array,
    stride: scala.Double,
    offset: scala.Double,
    count: scala.Double,
    fn: js.Function2[
      /* a */ adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 | js.Array[scala.Double], 
      /* b */ adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 | js.Array[scala.Double], 
      scala.Unit
    ]
  ): stdLib.Float32Array = js.native
  /**
    * Perform some operation over an array of vec2s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec2. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec2s to iterate over. If 0 iterates over entire array
    * @param fn Function to call for each vector in the array
    * @param arg additional argument to pass to fn
    * @returns a
    */
  def forEach(
    a: stdLib.Float32Array,
    stride: scala.Double,
    offset: scala.Double,
    count: scala.Double,
    fn: js.Function3[
      /* a */ adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 | js.Array[scala.Double], 
      /* b */ adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 | js.Array[scala.Double], 
      /* arg */ js.Any, 
      scala.Unit
    ],
    arg: js.Any
  ): stdLib.Float32Array = js.native
  /**
    * Creates a new vec2 initialized with the given values
    *
    * @param x X component
    * @param y Y component
    * @returns a new 2D vector
    */
  def fromValues(x: scala.Double, y: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Returns the inverse of the components of a vec2
    *
    * @param out the receiving vector
    * @param a vector to invert
    * @returns out
    */
  def inverse(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def inverse(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Calculates the length of a vec2
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def len(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def len(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the length of a vec2
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def length(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def length(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Performs a linear interpolation between two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def lerp(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    t: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Returns the maximum of two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def max(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def max(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def max(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def max(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Returns the minimum of two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def min(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def min(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def min(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def min(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Multiplies two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Multiplies two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Negates the components of a vec2
    *
    * @param out the receiving vector
    * @param a vector to negate
    * @returns out
    */
  def negate(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def negate(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Normalize a vec2
    *
    * @param out the receiving vector
    * @param a vector to normalize
    * @returns out
    */
  def normalize(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def normalize(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Generates a random unit vector
    *
    * @param out the receiving vector
    * @returns out
    */
  def random(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Generates a random vector with the given scale
    *
    * @param out the receiving vector
    * @param scale Length of the resulting vector. If ommitted, a unit vector will be returned
    * @returns out
    */
  def random(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, scale: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Math.round the components of a vec2
    *
    * @param out the receiving vector
    * @param a vector to round
    * @returns out
    */
  def round(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def round(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Scales a vec2 by a scalar number
    *
    * @param out the receiving vector
    * @param a the vector to scale
    * @param b amount to scale the vector by
    * @returns out
    */
  def scale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def scale(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, a: js.Array[scala.Double], b: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Adds two vec2's after scaling the second operand by a scalar value
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b by before adding
    * @returns out
    */
  def scaleAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def scaleAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double],
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def scaleAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def scaleAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Set the components of a vec2 to the given values
    *
    * @param out the receiving vector
    * @param x X component
    * @param y Y component
    * @returns out
    */
  def set(out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, x: scala.Double, y: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Calculates the squared euclidian distance between two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def sqrDist(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def sqrDist(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: js.Array[scala.Double]): scala.Double = js.native
  def sqrDist(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def sqrDist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared length of a vec2
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def sqrLen(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def sqrLen(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared euclidian distance between two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def squaredDistance(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def squaredDistance(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2, b: js.Array[scala.Double]): scala.Double = js.native
  def squaredDistance(a: js.Array[scala.Double], b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def squaredDistance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared length of a vec2
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def squaredLength(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): scala.Double = js.native
  def squaredLength(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Returns a string representation of a vector
    *
    * @param a vector to represent as a string
    * @returns string representation of the vector
    */
  def str(a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): java.lang.String = js.native
  def str(a: js.Array[scala.Double]): java.lang.String = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Transforms the vec2 with a mat2
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat2(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def transformMat2(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Transforms the vec2 with a mat2d
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat2d(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2d
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def transformMat2d(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2d
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Transforms the vec2 with a mat3
    * 3rd vector component is implicitly '1'
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat3(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def transformMat3(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat3
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  /**
    * Transforms the vec2 with a mat4
    * 3rd vector component is implicitly '0'
    * 4th vector component is implicitly '1'
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat4(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
  def transformMat4(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2,
    a: js.Array[scala.Double],
    m: adoneLib.adoneNs.mathNs.matrixNs.INs.mat4
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.vec2 = js.native
}

