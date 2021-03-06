package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents all the shapes in the worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeCollection")
@js.native
class ShapeCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  /**
    *
    * Adds a geometric shape to worksheet. Returns a Shape object that represents the new shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param geometricShapeType Represents the geometric type of the shape. See Excel.GeometricShapeType for details.
    * @param left The distance, in points, from the left side of the shape to the left side of the worksheet.
    * @param top The distance, in points, from the top edge of the shape to the top of the worksheet.
    * @param width The width, in points, of the shape.
    * @param height The height, in points, of the shape.
    */
  def addGeometricShape(
    geometricShapeType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ java.lang.String,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Shape = js.native
  /**
    *
    * Adds a geometric shape to worksheet. Returns a Shape object that represents the new shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param geometricShapeType Represents the geometric type of the shape. See Excel.GeometricShapeType for details.
    * @param left The distance, in points, from the left side of the shape to the left side of the worksheet.
    * @param top The distance, in points, from the top edge of the shape to the top of the worksheet.
    * @param width The width, in points, of the shape.
    * @param height The height, in points, of the shape.
    */
  def addGeometricShape(
    geometricShapeType: GeometricShapeType,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Shape = js.native
  /**
    *
    * Group a subset of shapes in a worksheet. Returns a Shape object that represents the new group of shapes.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param values An array of shape ID or shape objects.
    */
  def addGroup(values: js.Array[java.lang.String | Shape]): Shape = js.native
  /**
    *
    * Creates an image from a base64 string and adds it to worksheet. Returns the Shape object that represents the new Image.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param base64ImageString A base64 encoded image in JPEG or PNG formats.
    */
  def addImage(base64ImageString: java.lang.String): Shape = js.native
  /**
    *
    * Creates an SVG from a XML string and adds it to worksheet. Returns a Shape object that represents the new Image.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xmlImageString An XML string that represents an SVG.
    */
  def addSVG(xmlImageString: java.lang.String): Shape = js.native
  /**
    *
    * Adds a textbox to worksheet by telling it's text content. Returns a Shape object that represents the new text box.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param text Represents the text that will be shown in the created text box.
    */
  def addTextBox(): Shape = js.native
  def addTextBox(text: java.lang.String): Shape = js.native
  /**
    *
    * Returns the number of shapes in the worksheet. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Returns a shape identified by the shape id. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param shapeId The identifier for the shape.
    */
  def getItem(shapeId: java.lang.String): Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ShapeCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ShapeCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ShapeCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ShapeCollection = js.native
  def load(option: java.lang.String): ShapeCollection = js.native
  def load(option: js.Array[java.lang.String]): ShapeCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): ShapeCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeCollectionData = js.native
}

