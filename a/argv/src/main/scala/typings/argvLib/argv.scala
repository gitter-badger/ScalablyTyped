package typings
package argvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait argv extends js.Object {
  // Cleans out current options
  def clear(): js.Object = js.native
  // Prints out the help doc
  def help(): js.Object = js.native
  def help(mod: java.lang.String): js.Object = js.native
  // Description setup
  def info(mod: java.lang.String): js.Object = js.native
  def info(mod: java.lang.String, description: module): js.Object = js.native
  // Creating module
  def mod(`object`: module): js.Object = js.native
  def mod(`object`: js.Array[module]): js.Object = js.native
  // Adding options to definitions list
  def option(mod: helpOption): js.Object = js.native
  def option(mod: js.Array[helpOption]): js.Object = js.native
  // Runs the arguments parser
  def run(): args = js.native
  def run(argv: js.Array[java.lang.String]): args = js.native
  // Creates custom type function
  def `type`(name: java.lang.String): js.Any = js.native
  def `type`(name: java.lang.String, callback: typeFunction): js.Any = js.native
  def `type`(name: org.scalablytyped.runtime.StringDictionary[typeFunction]): js.Any = js.native
  def `type`(name: org.scalablytyped.runtime.StringDictionary[typeFunction], callback: typeFunction): js.Any = js.native
  // Setting version number, and auto setting version option
  def version(v: java.lang.String): js.Object = js.native
}

