package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindReplaceRequest extends js.Object {
  /** True to find/replace over all sheets. */
  var allSheets: js.UndefOr[scala.Boolean] = js.undefined
  /** The value to search. */
  var find: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if the search should include cells with formulas.
    * False to skip cells with formulas.
    */
  var includeFormulas: js.UndefOr[scala.Boolean] = js.undefined
  /** True if the search is case sensitive. */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  /** True if the find value should match the entire cell. */
  var matchEntireCell: js.UndefOr[scala.Boolean] = js.undefined
  /** The range to find/replace over. */
  var range: js.UndefOr[GridRange] = js.undefined
  /** The value to use as the replacement. */
  var replacement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if the find value is a regex.
    * The regular expression and replacement should follow Java regex rules
    * at https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html.
    * The replacement string is allowed to refer to capturing groups.
    * For example, if one cell has the contents `"Google Sheets"` and another
    * has `"Google Docs"`, then searching for `"o.&#42; (.&#42;)"` with a replacement of
    * `"$1 Rocks"` would change the contents of the cells to
    * `"GSheets Rocks"` and `"GDocs Rocks"` respectively.
    */
  var searchByRegex: js.UndefOr[scala.Boolean] = js.undefined
  /** The sheet to find/replace over. */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

