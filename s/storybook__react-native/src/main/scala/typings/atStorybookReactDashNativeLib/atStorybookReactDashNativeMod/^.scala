package typings
package atStorybookReactDashNativeLib.atStorybookReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDecorator(decorator: atStorybookReactLib.atStorybookReactMod.StoryDecorator): scala.Unit = js.native
  def addParameters(parameters: atStorybookReactLib.atStorybookReactMod.DecoratorParameters): scala.Unit = js.native
  def clearDecorators(): scala.Unit = js.native
  def configure(fn: js.Function0[scala.Unit], module: nodeLib.NodeModule): scala.Unit = js.native
  def forceReRender(): scala.Unit = js.native
  def getStorybook(): js.Array[atStorybookReactLib.atStorybookReactMod.StoryBucket] = js.native
  def getStorybookUI(options: atStorybookReactDashNativeLib.atStorybookReactDashNativeMod.StorybookUIOptions): reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = js.native
  def setAddon(addon: js.Object): scala.Unit = js.native
  def storiesOf(name: java.lang.String, module: nodeLib.NodeModule): atStorybookReactLib.atStorybookReactMod.Story = js.native
  @JSName("storiesOf")
  def `storiesOf_T<intersection>`[T](name: java.lang.String, module: nodeLib.NodeModule): atStorybookReactLib.atStorybookReactMod.Story with T = js.native
}

