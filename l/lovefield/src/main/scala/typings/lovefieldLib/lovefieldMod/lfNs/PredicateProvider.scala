package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateProvider extends js.Object {
  def between(from: Binder, to: Binder): Predicate = js.native
  def between(from: Binder, to: ValueLiteral): Predicate = js.native
  def between(from: ValueLiteral, to: Binder): Predicate = js.native
  def between(from: ValueLiteral, to: ValueLiteral): Predicate = js.native
  def eq(operand: Binder): Predicate = js.native
  def eq(operand: ValueLiteral): Predicate = js.native
  def eq(operand: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column): Predicate = js.native
  def gt(operand: Binder): Predicate = js.native
  def gt(operand: ValueLiteral): Predicate = js.native
  def gt(operand: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column): Predicate = js.native
  def gte(operand: Binder): Predicate = js.native
  def gte(operand: ValueLiteral): Predicate = js.native
  def gte(operand: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column): Predicate = js.native
  def in(values: js.Array[ValueLiteral]): Predicate = js.native
  def in(values: Binder): Predicate = js.native
  def isNotNull(): Predicate = js.native
  def isNull(): Predicate = js.native
  def lt(operand: Binder): Predicate = js.native
  def lt(operand: ValueLiteral): Predicate = js.native
  def lt(operand: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column): Predicate = js.native
  def lte(operand: Binder): Predicate = js.native
  def lte(operand: ValueLiteral): Predicate = js.native
  def lte(operand: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column): Predicate = js.native
  def `match`(operand: Binder): Predicate = js.native
  def `match`(operand: stdLib.RegExp): Predicate = js.native
  def neq(operand: Binder): Predicate = js.native
  def neq(operand: ValueLiteral): Predicate = js.native
  def neq(operand: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column): Predicate = js.native
}

