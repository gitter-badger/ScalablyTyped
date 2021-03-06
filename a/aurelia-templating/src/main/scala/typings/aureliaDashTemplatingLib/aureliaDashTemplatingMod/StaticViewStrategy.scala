package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "StaticViewStrategy")
@js.native
class StaticViewStrategy protected () extends js.Object {
  def this(config: IStaticViewConfig) = this()
  def this(config: java.lang.String) = this()
  def this(config: stdLib.HTMLTemplateElement) = this()
  /**@internal */
  var dependencies: js.Array[js.Function] | (js.Function0[
    js.Array[
      js.Function | (js.Promise[js.Function | (stdLib.Record[java.lang.String, js.Function])])
    ]
  ]) = js.native
  var factory: ViewFactory = js.native
  var factoryIsReady: scala.Boolean = js.native
  /**@internal */
  var template: java.lang.String | stdLib.HTMLTemplateElement = js.native
  /**
    * Loads a view factory.
    * @param viewEngine The view engine to use during the load process.
    * @param compileInstruction Additional instructions to use during compilation of the view.
    * @param loadContext The loading context used for loading all resources and dependencies.
    * @param target A class from which to extract metadata of additional resources to load.
    * @return A promise for the view factory that is produced by this strategy.
    */
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): js.Promise[ViewFactory] = js.native
}

