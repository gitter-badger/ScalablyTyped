package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulterGridfsStorage
  extends nodeLib.eventsMod.EventEmitter
     with multerLib.multerMod.multerNs.StorageEngine {
  var cacheIndex: js.Object = js.native
  var cacheName: java.lang.String = js.native
  var caching: scala.Boolean = js.native
  var client: mongodbLib.mongodbMod.MongoClient = js.native
  var configuration: multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.MulterGridfsStorageNs.UrlStorageOptions | multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.MulterGridfsStorageNs.DbStorageOptions = js.native
  var connected: scala.Boolean = js.native
  var connecting: scala.Boolean = js.native
  var db: mongodbLib.mongodbMod.Db = js.native
  var error: nodeLib.Error with stdLib.Error = js.native
}

