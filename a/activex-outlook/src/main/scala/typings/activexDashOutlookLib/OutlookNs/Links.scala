package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Links")
@js.native
class Links protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.Links_typekey`: Links = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Item: js.Any): Link = js.native
  def Item(Index: js.Any): Link = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
}

