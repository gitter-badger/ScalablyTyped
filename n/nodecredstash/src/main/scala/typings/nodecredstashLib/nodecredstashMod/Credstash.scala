package typings
package nodecredstashLib.nodecredstashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credstash extends js.Object {
  def createDdbTable(): js.Promise[scala.Unit] = js.native
  def decryptStash(stash: nodecredstashLib.Anon_Key): js.Promise[awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse] = js.native
  def decryptStash(stash: nodecredstashLib.Anon_Key, context: CredstashContext): js.Promise[awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse] = js.native
  def deleteSecret(options: nodecredstashLib.Anon_NameVersion): js.Promise[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.DeleteItemOutput] = js.native
  def deleteSecrets(options: nodecredstashLib.Anon_Name): js.Promise[
    js.Array[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.DeleteItemOutput]
  ] = js.native
  def getAllSecrets(options: nodecredstashLib.Anon_VersionContext): js.Promise[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  def getAllVersions(options: nodecredstashLib.Anon_NameContext): js.Promise[js.Array[nodecredstashLib.Anon_Version]] = js.native
  def getHighestVersion(options: nodecredstashLib.Anon_Name): js.Promise[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap] = js.native
  def getSecret(options: nodecredstashLib.Anon_NameContextVersion): js.Promise[java.lang.String] = js.native
  def incrementVersion(options: nodecredstashLib.Anon_Name): js.Promise[java.lang.String] = js.native
  def listSecrets(): js.Promise[js.Array[java.lang.String]] = js.native
  def putSecret(options: PutSecretOptions): js.Promise[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.PutItemOutput] = js.native
}

