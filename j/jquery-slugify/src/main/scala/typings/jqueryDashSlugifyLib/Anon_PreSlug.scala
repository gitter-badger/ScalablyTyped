package typings
package jqueryDashSlugifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreSlug extends js.Object {
  var custom: js.Array[java.lang.String]
  var lang: java.lang.String | scala.Boolean
  var maintainCase: scala.Boolean
  var mark: scala.Boolean
  var separator: java.lang.String
  var symbols: scala.Boolean
  var titleCase: js.Array[java.lang.String] | scala.Boolean
  var truncate: scala.Double
  var uric: scala.Boolean
  var uricNoSlash: scala.Boolean
  def postSlug(source: java.lang.String): java.lang.String
  def preSlug(source: java.lang.String): java.lang.String
  def slugFunc(input: java.lang.String, options: js.Object): java.lang.String
}

