package typings
package htmlDashToDashTextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlToTextOptions extends js.Object {
  /**
    *  By default links are translated the following
    *      <a href='link'>text</a> => becomes => text [link].
    *  If this option is set to true and link and text are the same,
    *  [link] will be hidden and only text visible.
    */
  var hideLinkHrefIfSameAsText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Ignore all document links if true.
    */
  var ignoreHref: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Ignore all document images if true.
    */
  var ignoreImage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Allows you to specify the server host for href attributes, where the links start at the root (/).
    *  For example, linkHrefBaseUrl = 'http://asdf.com' and <a href='/dir/subdir'>...</a>
    *  the link in the text will be http://asdf.com/dir/subdir.
    *  Keep in mind that linkHrefBaseUrl shouldn't end with a /.
    */
  var linkHrefBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Dont print brackets around the link if true
    */
  var noLinkBrackets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  By default, any newlines \n in a block of text will be removed.
    *  If true, these newlines will not be removed.
    */
  var preserveNewlines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  By default, paragraphs are converted with two newlines (\n\n).
    *  Set to true to convert to a single newline.
    */
  var singleNewLineParagraphs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Allows to select certain tables by the class or id attribute from the HTML
    *  document. This is necessary because the majority of HTML E-Mails uses a
    *  table based layout. Prefix your table selectors with an . for the class
    *  and with a # for the id attribute. All other tables are ignored.
    *   You can assign true to this attribute to select all tables. Default: []     
    */
  var tables: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  /**
    *  By default, headings (<h1>, <h2>, etc) are uppercased.
    *  Set to false to leave headings as they are.
    */
  var uppercaseHeadings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines after how many chars a line break should follow in p elements.
    * Set to null or false to disable word-wrapping. Default: 80
    */
  var wordwrap: js.UndefOr[
    scala.Double | htmlDashToDashTextLib.htmlDashToDashTextLibNumbers.`false` | scala.Null
  ] = js.undefined
}

