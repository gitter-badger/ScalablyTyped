package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EscapeId extends js.Object {
  def dateToString(date: js.Any): java.lang.String = js.native
  def dateToString(date: js.Any, timeZone: java.lang.String): java.lang.String = js.native
  def escape(value: js.Any): java.lang.String = js.native
  def escape(value: js.Any, stringifyObjects: scala.Boolean): java.lang.String = js.native
  def escape(value: js.Any, stringifyObjects: scala.Boolean, timeZone: java.lang.String): java.lang.String = js.native
  def escapeId(`val`: java.lang.String): java.lang.String = js.native
  def escapeId(`val`: java.lang.String, forbidQualified: scala.Boolean): java.lang.String = js.native
  def escapeId(`val`: js.Array[java.lang.String]): java.lang.String = js.native
  def escapeId(`val`: js.Array[java.lang.String], forbidQualified: scala.Boolean): java.lang.String = js.native
  def format(sql: java.lang.String): java.lang.String = js.native
  def format(sql: java.lang.String, values: js.Any): java.lang.String = js.native
  def format(sql: java.lang.String, values: js.Any, stringifyObjects: scala.Boolean): java.lang.String = js.native
  def format(sql: java.lang.String, values: js.Any, stringifyObjects: scala.Boolean, timeZone: java.lang.String): java.lang.String = js.native
}

