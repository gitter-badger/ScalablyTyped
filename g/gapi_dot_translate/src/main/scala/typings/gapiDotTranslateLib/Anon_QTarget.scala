package typings
package gapiDotTranslateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QTarget extends js.Object {
  /**
  			 * The customization id for translate
  			 */
  var cid: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  			 * Selector specifying which fields to include in a partial response.
  			 */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * This optional parameter allows you to indicate that the text to be translated is either plain-text or HTML. A value of html indicates HTML and a value of text indicates plain-text
  			 */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * If prettyprint=true, the results returned by the server will be human readable (pretty printed).
  			 */
  var prettyprint: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 *  The text to translate
  			 */
  var q: js.Array[java.lang.String]
  /**
  			 * The source language of the text
  			 */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * The target language into which the text should be translated
  			 */
  var target: java.lang.String
}

