package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysis.toJSON()". */
trait InkAnalysisData extends js.Object {
  /**
    *
    * Gets the ID of the InkAnalysis object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the parent page object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var page: js.UndefOr[PageData] = js.undefined
  /**
    *
    * Gets the ink analysis paragraphs in this page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.undefined
}

