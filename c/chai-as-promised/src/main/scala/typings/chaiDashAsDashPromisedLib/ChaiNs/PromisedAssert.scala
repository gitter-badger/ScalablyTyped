package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedAssert extends js.Object {
  def Throw(fn: js.Function): js.Thenable[scala.Unit] = js.native
  def Throw(fn: js.Function, errType: js.Function): js.Thenable[scala.Unit] = js.native
  def Throw(fn: js.Function, errType: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def Throw(fn: js.Function, errType: js.Function, regExp: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def Throw(fn: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def Throw(fn: js.Function, regExp: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def approximately(act: scala.Double, exp: scala.Double, delta: scala.Double): js.Thenable[scala.Unit] = js.native
  def approximately(act: scala.Double, exp: scala.Double, delta: scala.Double, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def changes(modifier: js.Function, obj: chaiLib.Object with js.Object, property: java.lang.String): js.Thenable[scala.Unit] = js.native
  def changes(
    modifier: js.Function,
    obj: chaiLib.Object with js.Object,
    property: java.lang.String,
    msg: java.lang.String
  ): js.Thenable[scala.Unit] = js.native
  def closeTo(act: scala.Double, exp: scala.Double, delta: scala.Double): js.Thenable[scala.Unit] = js.native
  def closeTo(act: scala.Double, exp: scala.Double, delta: scala.Double, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def decreases(modifier: js.Function, obj: chaiLib.Object with js.Object, property: java.lang.String): js.Thenable[scala.Unit] = js.native
  def decreases(
    modifier: js.Function,
    obj: chaiLib.Object with js.Object,
    property: java.lang.String,
    msg: java.lang.String
  ): js.Thenable[scala.Unit] = js.native
  def deepEqual(act: js.Any, exp: js.Any): js.Thenable[scala.Unit] = js.native
  def deepEqual(act: js.Any, exp: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def deepProperty(obj: chaiLib.Object with js.Object, prop: java.lang.String): js.Thenable[scala.Unit] = js.native
  def deepProperty(obj: chaiLib.Object with js.Object, prop: java.lang.String, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def deepPropertyNotVal(obj: chaiLib.Object with js.Object, prop: java.lang.String, `val`: js.Any): js.Thenable[scala.Unit] = js.native
  def deepPropertyNotVal(obj: chaiLib.Object with js.Object, prop: java.lang.String, `val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def deepPropertyVal(obj: chaiLib.Object with js.Object, prop: java.lang.String, `val`: js.Any): js.Thenable[scala.Unit] = js.native
  def deepPropertyVal(obj: chaiLib.Object with js.Object, prop: java.lang.String, `val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def doesNotChange(modifier: js.Function, obj: chaiLib.Object with js.Object, property: java.lang.String): js.Thenable[scala.Unit] = js.native
  def doesNotChange(
    modifier: js.Function,
    obj: chaiLib.Object with js.Object,
    property: java.lang.String,
    msg: java.lang.String
  ): js.Thenable[scala.Unit] = js.native
  def doesNotDecrease(modifier: js.Function, obj: chaiLib.Object with js.Object, property: java.lang.String): js.Thenable[scala.Unit] = js.native
  def doesNotDecrease(
    modifier: js.Function,
    obj: chaiLib.Object with js.Object,
    property: java.lang.String,
    msg: java.lang.String
  ): js.Thenable[scala.Unit] = js.native
  def doesNotIncrease(modifier: js.Function, obj: chaiLib.Object with js.Object, property: java.lang.String): js.Thenable[scala.Unit] = js.native
  def doesNotIncrease(
    modifier: js.Function,
    obj: chaiLib.Object with js.Object,
    property: java.lang.String,
    msg: java.lang.String
  ): js.Thenable[scala.Unit] = js.native
  def doesNotThrow(fn: js.Function): js.Thenable[scala.Unit] = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function): js.Thenable[scala.Unit] = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def doesNotThrow(fn: js.Function, errType: js.Function, regExp: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def doesNotThrow(fn: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def doesNotThrow(fn: js.Function, regExp: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def equal(act: js.Any, exp: js.Any): js.Thenable[scala.Unit] = js.native
  def equal(act: js.Any, exp: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def exists(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def exists(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def fail(): js.Thenable[scala.Unit] = js.native
  def fail(actual: js.Any): js.Thenable[scala.Unit] = js.native
  def fail(actual: js.Any, expected: js.Any): js.Thenable[scala.Unit] = js.native
  def fail(actual: js.Any, expected: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def fail(actual: js.Any, expected: js.Any, msg: java.lang.String, operator: java.lang.String): js.Thenable[scala.Unit] = js.native
  def frozen(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def frozen(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def ifError(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def ifError(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def include(exp: java.lang.String, inc: js.Any): js.Thenable[scala.Unit] = js.native
  def include(exp: java.lang.String, inc: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def include(exp: js.Array[_], inc: js.Any): js.Thenable[scala.Unit] = js.native
  def include(exp: js.Array[_], inc: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def includeDeepMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def includeDeepMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def includeDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def includeDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def includeMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def includeMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def includeOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def includeOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def increases(modifier: js.Function, obj: chaiLib.Object with js.Object, property: java.lang.String): js.Thenable[scala.Unit] = js.native
  def increases(
    modifier: js.Function,
    obj: chaiLib.Object with js.Object,
    property: java.lang.String,
    msg: java.lang.String
  ): js.Thenable[scala.Unit] = js.native
  def instanceOf(`val`: js.Any, `type`: js.Function): js.Thenable[scala.Unit] = js.native
  def instanceOf(`val`: js.Any, `type`: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isAbove(`val`: scala.Double, above: scala.Double): js.Thenable[scala.Unit] = js.native
  def isAbove(`val`: scala.Double, above: scala.Double, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isArray(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isArray(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isAtBelow(`val`: scala.Double, below: scala.Double): js.Thenable[scala.Unit] = js.native
  def isAtBelow(`val`: scala.Double, below: scala.Double, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isAtLeast(`val`: scala.Double, atLeast: scala.Double): js.Thenable[scala.Unit] = js.native
  def isAtLeast(`val`: scala.Double, atLeast: scala.Double, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isAtMost(`val`: scala.Double, atMost: scala.Double): js.Thenable[scala.Unit] = js.native
  def isAtMost(`val`: scala.Double, atMost: scala.Double, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isBoolean(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isBoolean(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isDefined(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isDefined(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isEmpty(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isEmpty(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isExtensible(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def isExtensible(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isFalse(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isFalse(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isFrozen(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def isFrozen(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isFunction(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isFunction(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNaN(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNaN(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotArray(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotArray(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotBoolean(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotBoolean(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotEmpty(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotEmpty(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotExtensible(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def isNotExtensible(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotFalse(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotFalse(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotFrozen(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def isNotFrozen(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotFunction(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotFunction(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotNaN(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotNaN(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotNull(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotNull(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotNumber(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotNumber(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotObject(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotObject(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotOk(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotOk(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotSealed(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def isNotSealed(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotString(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotString(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNotTrue(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNotTrue(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNull(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNull(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isNumber(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isNumber(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isObject(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isObject(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isOk(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isOk(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isSealed(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def isSealed(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isString(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isString(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isTrue(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isTrue(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def isUndefined(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def isUndefined(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def lengthOf(exp: js.Any, len: scala.Double): js.Thenable[scala.Unit] = js.native
  def lengthOf(exp: js.Any, len: scala.Double, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def `match`(exp: js.Any, re: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def `match`(exp: js.Any, re: stdLib.RegExp, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notDeepEqual(act: js.Any, exp: js.Any): js.Thenable[scala.Unit] = js.native
  def notDeepEqual(act: js.Any, exp: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notDeepProperty(obj: chaiLib.Object with js.Object, prop: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notDeepProperty(obj: chaiLib.Object with js.Object, prop: java.lang.String, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notEqual(act: js.Any, exp: js.Any): js.Thenable[scala.Unit] = js.native
  def notEqual(act: js.Any, exp: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notExists(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def notExists(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notFrozen(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def notFrozen(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notInclude(exp: java.lang.String, inc: js.Any): js.Thenable[scala.Unit] = js.native
  def notInclude(exp: java.lang.String, inc: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notInclude(exp: js.Array[_], inc: js.Any): js.Thenable[scala.Unit] = js.native
  def notInclude(exp: js.Array[_], inc: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notIncludeDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def notIncludeDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notIncludeOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def notIncludeOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notInstanceOf(`val`: js.Any, `type`: js.Function): js.Thenable[scala.Unit] = js.native
  def notInstanceOf(`val`: js.Any, `type`: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notMatch(exp: js.Any, re: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def notMatch(exp: js.Any, re: stdLib.RegExp, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notOk(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def notOk(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notProperty(obj: chaiLib.Object with js.Object, prop: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notProperty(obj: chaiLib.Object with js.Object, prop: java.lang.String, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notSameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def notSameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notSameOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def notSameOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notSealed(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def notSealed(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notStrictEqual(act: js.Any, exp: js.Any): js.Thenable[scala.Unit] = js.native
  def notStrictEqual(act: js.Any, exp: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notTypeOf(`val`: js.Any, `type`: java.lang.String): js.Thenable[scala.Unit] = js.native
  def notTypeOf(`val`: js.Any, `type`: java.lang.String, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def ok(`val`: js.Any): js.Thenable[scala.Unit] = js.native
  def ok(`val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def oneOf(`val`: js.Any, list: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def oneOf(`val`: js.Any, list: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def operator(`val`: js.Any, operator: java.lang.String, val2: js.Any): js.Thenable[scala.Unit] = js.native
  def operator(`val`: js.Any, operator: java.lang.String, val2: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def property(obj: chaiLib.Object with js.Object, prop: java.lang.String): js.Thenable[scala.Unit] = js.native
  def property(obj: chaiLib.Object with js.Object, prop: java.lang.String, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def propertyNotVal(obj: chaiLib.Object with js.Object, prop: java.lang.String, `val`: js.Any): js.Thenable[scala.Unit] = js.native
  def propertyNotVal(obj: chaiLib.Object with js.Object, prop: java.lang.String, `val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def propertyVal(obj: chaiLib.Object with js.Object, prop: java.lang.String, `val`: js.Any): js.Thenable[scala.Unit] = js.native
  def propertyVal(obj: chaiLib.Object with js.Object, prop: java.lang.String, `val`: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def sameDeepMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def sameDeepMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def sameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def sameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def sameMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def sameMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def sameOrderedMembers(set1: js.Array[_], set2: js.Array[_]): js.Thenable[scala.Unit] = js.native
  def sameOrderedMembers(set1: js.Array[_], set2: js.Array[_], msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def `sealed`(obj: chaiLib.Object with js.Object): js.Thenable[scala.Unit] = js.native
  def `sealed`(obj: chaiLib.Object with js.Object, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def strictEqual(act: js.Any, exp: js.Any): js.Thenable[scala.Unit] = js.native
  def strictEqual(act: js.Any, exp: js.Any, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  //alias frenzy
  def `throw`(fn: js.Function): js.Thenable[scala.Unit] = js.native
  def `throw`(fn: js.Function, errType: js.Function): js.Thenable[scala.Unit] = js.native
  def `throw`(fn: js.Function, errType: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def `throw`(fn: js.Function, errType: js.Function, regExp: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def `throw`(fn: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def `throw`(fn: js.Function, regExp: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def throws(fn: js.Function): js.Thenable[scala.Unit] = js.native
  def throws(fn: js.Function, errType: js.Function): js.Thenable[scala.Unit] = js.native
  def throws(fn: js.Function, errType: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def throws(fn: js.Function, errType: js.Function, regExp: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def throws(fn: js.Function, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
  def throws(fn: js.Function, regExp: stdLib.RegExp): js.Thenable[scala.Unit] = js.native
  def typeOf(`val`: js.Any, `type`: java.lang.String): js.Thenable[scala.Unit] = js.native
  def typeOf(`val`: js.Any, `type`: java.lang.String, msg: java.lang.String): js.Thenable[scala.Unit] = js.native
}

