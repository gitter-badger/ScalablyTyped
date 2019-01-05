package typings
package atLoadableServerLib.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/server", "ChunkExtractor")
@js.native
class ChunkExtractor protected () extends js.Object {
  def this(options: ChunkExtractorOptions) = this()
  /**
  	 * Wrap your application in a `ChunkExtractorManager`
  	 */
  def collectChunks(
    /**
  		 * JSX element that will be wrapped in `ChunkExtractorManager`
  		 */
  element: reactLib.reactMod.Global.JSXNs.Element
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
  	 * Get "prefetch" and "preload" links as an array of React `<link>` elements
  	 */
  def getLinkElements(): js.Array[reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.native
  /**
  	 * Get "prefetch" and "preload" links as a string of `<link>` tags
  	 */
  def getLinkTags(): js.Array[java.lang.String] = js.native
  /**
  	 * Get scripts as an array of React `<script>` elements.
  	 */
  def getScriptElements(): js.Array[reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.native
  /**
  	 * Get scripts as a string of `<script>` tags
  	 */
  def getScriptTags(): js.Array[java.lang.String] = js.native
  /**
  	 * Get style links as an array of React `<link>` elements
  	 */
  def getStyleElements(): js.Array[reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.native
  /**
  	 * Get style links as a string of `<link>` tags
  	 */
  def getStyleTags(): js.Array[java.lang.String] = js.native
  /**
  	 * Require the entrypoint of your application as a commonjs module.
  	 */
  def requireEntrypoint(): atLoadableServerLib.Anon_Default = js.native
  def requireEntrypoint(name: java.lang.String): atLoadableServerLib.Anon_Default = js.native
}

