package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromisifyHostname extends js.Object {
  def `__promisify__`(hostname: java.lang.String): js.Promise[nodeLib.Anon_AddressFamily] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.LookupAllOptions): js.Promise[nodeLib.Anon_Address] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.LookupOneOptions): js.Promise[nodeLib.Anon_AddressFamily] = js.native
  def `__promisify__`(hostname: java.lang.String, options: nodeLib.dnsMod.LookupOptions): js.Promise[nodeLib.Anon_AddressFamilyString] = js.native
  def `__promisify__`(hostname: java.lang.String, options: scala.Double): js.Promise[nodeLib.Anon_AddressFamily] = js.native
}

