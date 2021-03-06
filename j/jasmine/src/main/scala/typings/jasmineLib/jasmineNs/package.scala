package typings
package jasmineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmineNs {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean | scala.Unit]
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
  type Expected[T] = T | ObjectContaining[T] | Any | Spy
  type PassedExpectation = CustomReportExpectation
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[Spec], scala.Unit]
  type SpyObj[T] = jasmineLib.jasmineLibStrings.SpyObj with T
  type SpyObjMethodNames[T] = js.Array[java.lang.String] | (jasmineLib.jasmineLibStrings.SpyObjMethodNames with T) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type StringPrettyPrinter = PrettyPrinter
}
