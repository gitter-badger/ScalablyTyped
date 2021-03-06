package typings
package htmlDashMinifierLib.htmlDashMinifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // Treat attributes in case sensitive manner (useful for custom HTML tags)
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  // Omit attribute values from boolean attributes
  var collapseBooleanAttributes: js.UndefOr[scala.Boolean] = js.undefined
  // Don't leave any spaces between display:inline; elements when collapsing. Must be used in conjunction with collapseWhitespace=true
  var collapseInlineTagWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Collapse white space that contributes to text nodes in a document tree
    * @see http://perfectionkills.com/experimenting-with-html-minifier/#collapse_whitespace
    */
  var collapseWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  // Always collapse to 1 space (never remove it entirely). Must be used in conjunction with collapseWhitespace=true
  var conservativeCollapse: js.UndefOr[scala.Boolean] = js.undefined
  // Arrays of regex'es that allow to support custom attribute assign expressions (e.g. '<div flex?="{{mode != cover}}"></div>')
  var customAttrAssign: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  // Regex that specifies custom attribute to strip newlines from (e.g. /ng-class/)
  var customAttrCollapse: js.UndefOr[stdLib.RegExp] = js.undefined
  // Arrays of regex'es that allow to support custom attribute surround expressions (e.g. <input {{#if value}}checked="checked"{{/if}}>)
  var customAttrSurround: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  // Arrays of regex'es that allow to support custom event attributes for minifyJS (e.g. ng-click)
  var customEventAttributes: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  // Use direct Unicode characters whenever possible
  var decodeEntities: js.UndefOr[scala.Boolean] = js.undefined
  // Parse input according to HTML5 specifications
  var html5: js.UndefOr[scala.Boolean] = js.undefined
  // Array of regex'es that allow to ignore certain comments, when matched
  var ignoreCustomComments: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  // Array of regex'es that allow to ignore certain fragments, when matched (e.g. <?php ... ?>, {{ ... }}, etc.)
  var ignoreCustomFragments: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  // Insert tags generated by HTML parser
  var includeAutoGeneratedTags: js.UndefOr[scala.Boolean] = js.undefined
  // Keep the trailing slash on singleton elements
  var keepClosingSlash: js.UndefOr[scala.Boolean] = js.undefined
  // Specify a maximum line length. Compressed output will be split by newlines at valid HTML split-points
  var maxLineLength: js.UndefOr[scala.Double] = js.undefined
  // Minify CSS in style elements and style attributes (uses clean-css or function specified)
  var minifyCSS: js.UndefOr[
    scala.Boolean | cleanDashCssLib.cleanDashCssMod.CleanCSSNs.Options | (js.Function1[/* text */ java.lang.String, java.lang.String])
  ] = js.undefined
  // Minify JavaScript in script elements and event attributes (uses UglifyJS or function specified)
  var minifyJS: js.UndefOr[
    scala.Boolean | uglifyDashJsLib.uglifyDashJsMod.MinifyOptions | (js.Function2[/* text */ java.lang.String, /* inline */ scala.Boolean, java.lang.String])
  ] = js.undefined
  // Minify URLs in various attributes (uses relateurl or function specified)
  var minifyURLs: js.UndefOr[
    scala.Boolean | relateurlLib.relateurlMod.RelateUrlNs.Options | (js.Function1[/* text */ java.lang.String, java.lang.String])
  ] = js.undefined
  // Always collapse to 1 line break (never remove it entirely) when whitespace between tags include a line break. Must be used in conjunction with collapseWhitespace=true
  var preserveLineBreaks: js.UndefOr[scala.Boolean] = js.undefined
  // Prevents the escaping of the values of attributes
  var preventAttributesEscaping: js.UndefOr[scala.Boolean] = js.undefined
  // Process contents of conditional comments through minifier
  var processConditionalComments: js.UndefOr[scala.Boolean] = js.undefined
  // Array of strings corresponding to types of script elements to process through minifier (e.g. text/ng-template, text/x-handlebars-template, etc.)
  var processScripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Type of quote to use for attribute values (' or ")
  var quoteCharacter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Remove quotes around attributes when possible
    * @see http://perfectionkills.com/experimenting-with-html-minifier/#remove_attribute_quotes
    */
  var removeAttributeQuotes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Strip HTML comments
    * @see http://perfectionkills.com/experimenting-with-html-minifier/#remove_comments
    */
  var removeComments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove all attributes with whitespace-only values
    * @see http://perfectionkills.com/experimenting-with-html-minifier/#remove_empty_or_blank_attributes
    */
  var removeEmptyAttributes: js.UndefOr[
    scala.Boolean | (js.Function2[/* attrName */ java.lang.String, /* tag */ java.lang.String, scala.Boolean])
  ] = js.undefined
  /**
    * Remove all elements with empty contents
    * @see http://perfectionkills.com/experimenting-with-html-minifier/#remove_empty_elements
    */
  var removeEmptyElements: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove optional tags
    * @see http://perfectionkills.com/experimenting-with-html-minifier/#remove_optional_tags
    */
  var removeOptionalTags: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove attributes when value matches default.
    * @see http://perfectionkills.com/experimenting-with-html-minifier/#remove_redundant_attributes
    */
  var removeRedundantAttributes: js.UndefOr[scala.Boolean] = js.undefined
  // Remove type="text/javascript" from script tags. Other type attribute values are left intact
  var removeScriptTypeAttributes: js.UndefOr[scala.Boolean] = js.undefined
  // Remove type="text/css" from style and link tags. Other type attribute values are left intact
  var removeStyleLinkTypeAttributes: js.UndefOr[scala.Boolean] = js.undefined
  // Remove space between attributes whenever possible. Note that this will result in invalid HTML!
  var removeTagWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sort attributes by frequency
    *
    * Minifier options like sortAttributes and sortClassName won't impact the plain-text size
    * of the output. However, they form long repetitive chains of characters that should improve
    * compression ratio of gzip used in HTTP compression.
    *
    * @see https://github.com/kangax/html-minifier#sorting-attributes--style-classes
    */
  var sortAttributes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sort style classes by frequency
    *
    * Minifier options like sortAttributes and sortClassName won't impact the plain-text size
    * of the output. However, they form long repetitive chains of characters that should improve
    * compression ratio of gzip used in HTTP compression.
    *
    * @see https://github.com/kangax/html-minifier#sorting-attributes--style-classes
    */
  var sortClassName: js.UndefOr[scala.Boolean] = js.undefined
  // Trim white space around ignoreCustomFragments
  var trimCustomFragments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Replaces the doctype with the short (HTML5) doctype
    * @see http://perfectionkills.com/experimenting-with-html-minifier/#use_short_doctype
    */
  var useShortDoctype: js.UndefOr[scala.Boolean] = js.undefined
}

