package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of comment objects that are part of the workbook.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.CommentCollection")
@js.native
class CommentCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Comment] = js.native
  /**
    *
    * Gets the number of comments in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Returns a comment identified by its ID. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param commentId The identifier for the comment.
    */
  def getItem(commentId: java.lang.String): Comment = js.native
  /**
    *
    * Gets a comment based on its position in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: scala.Double): Comment = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.CommentCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.CommentCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.CommentCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CommentCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): CommentCollection = js.native
  def load(option: java.lang.String): CommentCollection = js.native
  def load(option: js.Array[java.lang.String]): CommentCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): CommentCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CommentCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CommentCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CommentCollectionData = js.native
}

