package typings
package consulLib.consulMod.ConsulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  /**
    * Creates a new token by cloning an existing token
    */
  @JSName("clone")
  var clone_Original: consulLib.Anon_IdCallbackOptsTData = js.native
  var consul: Consul = js.native
  /**
    * Creates a new token with policy
    */
  @JSName("create")
  var create_Original: consulLib.Anon_Opts = js.native
  /**
    * Destroys a given token
    */
  @JSName("destroy")
  var destroy_Original: consulLib.Anon_Id = js.native
  @JSName("get")
  var get_Original: consulLib.Anon_IdCallbackOpts = js.native
  /**
    * Queries the policy of a given token
    */
  @JSName("info")
  var info_Original: consulLib.Anon_IdCallback = js.native
  /**
    * Lists all the active tokens
    */
  @JSName("list")
  var list_Original: consulLib.Anon_OptsCallbackTData = js.native
  /**
    * Update the policy of a token
    */
  @JSName("update")
  var update_Original: consulLib.Anon_OptsCallback = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: consulLib.consulMod.ConsulNs.AclNs.CloneOptions): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: consulLib.consulMod.ConsulNs.AclNs.CloneOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](callback: Callback[TData]): scala.Unit = js.native
  def create[TData](opts: consulLib.consulMod.ConsulNs.AclNs.CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](opts: consulLib.consulMod.ConsulNs.AclNs.CreateOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: consulLib.consulMod.ConsulNs.AclNs.DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: consulLib.consulMod.ConsulNs.AclNs.DestroyOptions, callback: Callback[TData]): scala.Unit = js.native
  def get[TData](id: java.lang.String): Thenable[TData] = js.native
  def get[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  def get[TData](opts: consulLib.consulMod.ConsulNs.AclNs.GetOptions): Thenable[TData] = js.native
  def get[TData](opts: consulLib.consulMod.ConsulNs.AclNs.GetOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: java.lang.String): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: consulLib.consulMod.ConsulNs.AclNs.InfoOptions): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: consulLib.consulMod.ConsulNs.AclNs.InfoOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](callback: Callback[TData]): scala.Unit = js.native
  def list[TData](opts: consulLib.consulMod.ConsulNs.AclNs.ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](opts: consulLib.consulMod.ConsulNs.AclNs.ListOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: consulLib.consulMod.ConsulNs.AclNs.UpdateOptions): Thenable[TData] = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: consulLib.consulMod.ConsulNs.AclNs.UpdateOptions, callback: Callback[TData]): scala.Unit = js.native
}

