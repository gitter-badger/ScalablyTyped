package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPackagePropertySet
  extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, js.Any] {
  var applicationListingUri: winrtLib.WindowsNs.FoundationNs.Uri
  var applicationName: java.lang.String
  var description: java.lang.String
  var fileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  var thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  var title: java.lang.String
}

