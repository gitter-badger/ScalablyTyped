package typings
package zipDashWebpackDashPluginLib.zipDashWebpackDashPluginMod.ZipPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Exclude file paths or patterns. Takes precedence over include. Defaults to no excluding.
    */
  var exclude: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  /**
    * The file extension to use instead of "zip".
    * Defaults to "zip".
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * File options passed to yazl `addFile`.
    * See https://github.com/thejoshwolfe/yazl#addfilerealpath-metadatapath-options
    */
  var fileOptions: js.UndefOr[fileOptions] = js.undefined
  /**
    * Output file name.
    * Defaults to the Webpack output filename or basename of the path.
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Include file paths or patterns.
    * Defaults to including all files in the webpack output path.
    */
  var include: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  /**
    * Output path. Can be relative (to the webpack output path) or absolute.
    * Defaults to the Webpack output path.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function to map asset paths to new paths.
    */
  var pathMapper: js.UndefOr[js.Function1[/* assetPath */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * The path prefix for files included in the zip file.
    * Default to no prefix.
    */
  var pathPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * File options passed to yazl `end`.
    * See https://github.com/thejoshwolfe/yazl#endoptions-finalsizecallback
    */
  var zipOptions: js.UndefOr[zipOptions] = js.undefined
}

