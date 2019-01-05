package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jssMod {
  type Classes[Name /* <: java.lang.String */] = stdLib.Record[Name, java.lang.String]
  type CreateStyleSheetOptions[Name /* <: java.lang.String */] = stdLib.Partial[jssLib.Anon_Media[Name]]
  type GenerateClassName[Name /* <: java.lang.String */] = js.Function2[/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[Name]], java.lang.String]
  type Styles[Name /* <: java.lang.String */] = stdLib.Record[Name, jssLib.cssMod.Style]
}
