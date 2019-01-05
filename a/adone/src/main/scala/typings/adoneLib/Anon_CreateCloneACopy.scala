package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateCloneACopy extends js.Object {
  /**
    * Returns L, D and U matrices (Lower triangular, Diagonal and Upper triangular) by factorizing the input matrix
    * @param L the lower triangular matrix
    * @param D the diagonal matrix
    * @param U the upper triangular matrix
    * @param a the input matrix to factorize
    */
  def LDU(
    L: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    D: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    U: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Adds two mat2's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Calculates the adjugate of a mat2
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def adjoint(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Creates a new mat2 initialized with values from an existing matrix
    *
    * @param a matrix to clone
    * @returns a new 2x2 matrix
    */
  def clone(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Copy the values from one mat2 to another
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def copy(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Creates a new identity mat2
    *
    * @returns a new 2x2 matrix
    */
  def create(): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Calculates the determinant of a mat2
    *
    * @param a the source matrix
    * @returns determinant of a
    */
  def determinant(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): scala.Double = js.native
  /**
    * Returns whether or not the matrices have approximately the same elements in the same position.
    *
    * @param a The first matrix.
    * @param b The second matrix.
    * @returns True if the matrices are equal, false otherwise.
    */
  def equals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): scala.Boolean = js.native
  /**
    * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
    *
    * @param a The first matrix.
    * @param b The second matrix.
    * @returns True if the matrices are equal, false otherwise.
    */
  def exactEquals(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): scala.Boolean = js.native
  /**
    * Returns Frobenius norm of a mat2
    *
    * @param a the matrix to calculate Frobenius norm of
    * @returns Frobenius norm
    */
  def frob(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): scala.Double = js.native
  /**
    * Creates a matrix from a given angle
    * This is equivalent to (but much faster than):
    *
    *     mat2.identity(dest);
    *     mat2.rotate(dest, dest, rad);
    *
    * @param out mat2 receiving operation result
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def fromRotation(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, rad: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Creates a matrix from a vector scaling
    * This is equivalent to (but much faster than):
    *
    *     mat2.identity(dest);
    *     mat2.scale(dest, dest, vec);
    *
    * @param out mat2 receiving operation result
    * @param v Scaling vector
    * @returns out
    */
  def fromScaling(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  def fromScaling(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, v: js.Array[scala.Double]): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Create a new mat2 with the given values
    *
    * @param m00 Component in column 0, row 0 position (index 0)
    * @param m01 Component in column 0, row 1 position (index 1)
    * @param m10 Component in column 1, row 0 position (index 2)
    * @param m11 Component in column 1, row 1 position (index 3)
    * @returns out A new 2x2 matrix
    */
  def fromValues(m00: scala.Double, m01: scala.Double, m10: scala.Double, m11: scala.Double): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Set a mat2 to the identity matrix
    *
    * @param out the receiving matrix
    * @returns out
    */
  def identity(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Inverts a mat2
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def invert(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 | scala.Null = js.native
  /**
    * Multiplies two mat2's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Multiplies two mat2's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Multiply each element of the matrix by a scalar.
    *
    * @param out the receiving matrix
    * @param a the matrix to scale
    * @param b amount to scale the matrix's elements by
    * @returns out
    */
  def multiplyScalar(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    b: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Adds two mat2's after multiplying each element of the second operand by a scalar value.
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b's elements by before adding
    * @returns out
    */
  def multiplyScalarAndAdd(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    scale: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Rotates a mat2 by the given angle
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotate(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    rad: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Scales the mat2 by the dimensions in the given vec2
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param v the vec2 to scale the matrix by
    * @returns out
    */
  def scale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    v: adoneLib.adoneNs.mathNs.matrixNs.INs.vec2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  def scale(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    v: js.Array[scala.Double]
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Set the components of a mat2 to the given values
    *
    * @param out the receiving matrix
    * @param m00 Component in column 0, row 0 position (index 0)
    * @param m01 Component in column 0, row 1 position (index 1)
    * @param m10 Component in column 1, row 0 position (index 2)
    * @param m11 Component in column 1, row 1 position (index 3)
    * @returns out
    */
  def set(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    m00: scala.Double,
    m01: scala.Double,
    m10: scala.Double,
    m11: scala.Double
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Returns a string representation of a mat2
    *
    * @param a matrix to represent as a string
    * @returns string representation of the matrix
    */
  def str(a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): java.lang.String = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def sub(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(
    out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2,
    b: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2
  ): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
  /**
    * Transpose the values of a mat2
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def transpose(out: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2, a: adoneLib.adoneNs.mathNs.matrixNs.INs.mat2): adoneLib.adoneNs.mathNs.matrixNs.INs.mat2 = js.native
}

