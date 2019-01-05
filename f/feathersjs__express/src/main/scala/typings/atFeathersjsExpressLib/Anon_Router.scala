package typings
package atFeathersjsExpressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Router extends js.Object {
  val eNs: js.Any = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("json")
  var json_Original: expressLib.Anon_Options = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSName("static")
  var static_Original: expressLib.Anon_Root = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("urlencoded")
  var urlencoded_Original: expressLib.Anon_OptionsOptionsUrlencoded = js.native
  def Router(): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  def Router(options: expressLib.expressMod.eNs.RouterOptions): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Router = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(options: bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsJson): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: java.lang.String): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(
    root: java.lang.String,
    options: serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions
  ): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(options: bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsUrlencoded): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
}

