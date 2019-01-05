package typings
package parchmentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ScopeCreate extends js.Object {
  var Attributor: Anon_AttributeClass = js.native
  var Block: Anon_BlotNameScope = js.native
  var Container: Anon_DefaultChild = js.native
  var Embed: Anon_FormatsDomNode = js.native
  var Format: Anon_Formats = js.native
  var Inline: Anon_BlotNameScopeTagName = js.native
  var Leaf: Anon_Scope = js.native
  var Scope: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Registry.Scope */ js.Any = js.native
  var Scroll: Anon_BlotName = js.native
  var Text: Anon_BlotNameScopeCreate = js.native
  @JSName("create")
  var create_Original: js.Function2[
    /* input */ stdLib.Node | java.lang.String | parchmentLib.distSrcRegistryMod.Scope, 
    /* value */ js.UndefOr[js.Any], 
    parchmentLib.distSrcBlotAbstractBlotMod.Blot
  ] = js.native
  @JSName("find")
  var find_Original: js.Function2[
    /* node */ stdLib.Node | scala.Null, 
    /* bubble */ js.UndefOr[scala.Boolean], 
    parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null
  ] = js.native
  @JSName("query")
  var query_Original: js.Function2[
    /* query */ java.lang.String | stdLib.Node | parchmentLib.distSrcRegistryMod.Scope, 
    /* scope */ js.UndefOr[parchmentLib.distSrcRegistryMod.Scope], 
    parchmentLib.distSrcAttributorAttributorMod.default | parchmentLib.distSrcRegistryMod.BlotConstructor | scala.Null
  ] = js.native
  @JSName("register")
  var register_Original: js.Function1[/* repeated */ js.Any, _] = js.native
  def create(input: java.lang.String): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: java.lang.String, value: js.Any): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: parchmentLib.distSrcRegistryMod.Scope): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: parchmentLib.distSrcRegistryMod.Scope, value: js.Any): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: stdLib.Node): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def create(input: stdLib.Node, value: js.Any): parchmentLib.distSrcBlotAbstractBlotMod.Blot = js.native
  def find(): parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null = js.native
  def find(node: scala.Null, bubble: scala.Boolean): parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null = js.native
  def find(node: stdLib.Node): parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null = js.native
  def find(node: stdLib.Node, bubble: scala.Boolean): parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null = js.native
  def query(query: java.lang.String): parchmentLib.distSrcAttributorAttributorMod.default | parchmentLib.distSrcRegistryMod.BlotConstructor | scala.Null = js.native
  def query(query: java.lang.String, scope: parchmentLib.distSrcRegistryMod.Scope): parchmentLib.distSrcAttributorAttributorMod.default | parchmentLib.distSrcRegistryMod.BlotConstructor | scala.Null = js.native
  def query(query: parchmentLib.distSrcRegistryMod.Scope): parchmentLib.distSrcAttributorAttributorMod.default | parchmentLib.distSrcRegistryMod.BlotConstructor | scala.Null = js.native
  def query(query: parchmentLib.distSrcRegistryMod.Scope, scope: parchmentLib.distSrcRegistryMod.Scope): parchmentLib.distSrcAttributorAttributorMod.default | parchmentLib.distSrcRegistryMod.BlotConstructor | scala.Null = js.native
  def query(query: stdLib.Node): parchmentLib.distSrcAttributorAttributorMod.default | parchmentLib.distSrcRegistryMod.BlotConstructor | scala.Null = js.native
  def query(query: stdLib.Node, scope: parchmentLib.distSrcRegistryMod.Scope): parchmentLib.distSrcAttributorAttributorMod.default | parchmentLib.distSrcRegistryMod.BlotConstructor | scala.Null = js.native
  def register(Definitions: js.Any*): js.Any = js.native
}

