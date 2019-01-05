package typings
package ngDashTableLib.srcBrowserNgTableFilterConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfigProvider")
@js.native
class NgTableFilterConfigProvider protected ()
  extends angularLib.angularMod.angularNs.IServiceProvider {
  def this($injector: angularLib.angularMod.angularNs.autoNs.IInjectorService) = this()
  /* CompleteClass */
  @JSName("$get")
  override var $get: js.Any = js.native
  var config: js.Any = js.native
  var defaultConfig: js.Any = js.native
  @JSName("$get")
  def $get_MNgTableFilterConfigProvider(): NgTableFilterConfig = js.native
  /**
    * Reset back to factory defaults the config values that `NgTableFilterConfig` service will use
    */
  def resetConfigs(): scala.Unit = js.native
  /**
    * Set the config values used by `NgTableFilterConfig` service
    */
  def setConfig(customConfig: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IFilterConfigValues): scala.Unit = js.native
}

@JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfigProvider")
@js.native
object NgTableFilterConfigProvider extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

