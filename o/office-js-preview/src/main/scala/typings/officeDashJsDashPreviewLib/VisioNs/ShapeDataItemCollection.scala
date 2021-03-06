package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeDataItemCollection for a given Shape.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ShapeDataItemCollection")
@js.native
class ShapeDataItemCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ShapeDataItem] = js.native
  /**
    *
    * Gets the number of Shape Data Items.
    *
    * [Api set:  1.1]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets the ShapeDataItem using its name.
    *
    * [Api set:  1.1]
    *
    * @param key Key is the name of the ShapeDataItem to be retrieved.
    */
  def getItem(key: java.lang.String): ShapeDataItem = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.ShapeDataItemCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.ShapeDataItemCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.ShapeDataItemCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeDataItemCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeDataItemCollectionLoadOptions with officeDashJsDashPreviewLib.VisioNs.InterfacesNs.CollectionLoadOptions
  ): ShapeDataItemCollection = js.native
  def load(option: java.lang.String): ShapeDataItemCollection = js.native
  def load(option: js.Array[java.lang.String]): ShapeDataItemCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): ShapeDataItemCollection = js.native
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeDataItemCollectionData = js.native
}

