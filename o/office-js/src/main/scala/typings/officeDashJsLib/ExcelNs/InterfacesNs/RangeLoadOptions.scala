package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Range represents a set of one or more contiguous cells such as a cell, a row, a column, block of cells, etc.
  *
  * [Api set: ExcelApi 1.1]
  */
trait RangeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. "Sheet1!A1:B4"). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var address: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents range reference for the specified range in the language of the user. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var addressLocal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Number of cells in the range. This API will return -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var cellCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the total number of columns in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents if all columns of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the column number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columnIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns a data validation object.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.undefined
  /**
    *
    * Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulas: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var formulasLocal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the formula in R1C1-style notation.
    When setting formulas to a range, the value argument can be either a single value (a string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulasR1C1: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents if all cells of the current range are hidden. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the hyperlink for the current range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hyperlink: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents if the current range is an entire column. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents if the current range is an entire row. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isEntireRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range.
    When setting number format to a range, the value argument can be either a single value (string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var numberFormat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range as a string in the language of the user.
    When setting number format local to a range, the value argument can be either a single value (string) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the total number of rows in the range. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents if all rows of the current range are hidden.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the row number of the first cell in the range. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rowIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the style of the current range.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var style: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the type of data of each cell. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueTypes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    When setting values to a range, the value argument can be either a single value (string, number or boolean) or a two-dimensional array. If the argument is a single value, it will be applied to all cells in the range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The worksheet containing the current range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

