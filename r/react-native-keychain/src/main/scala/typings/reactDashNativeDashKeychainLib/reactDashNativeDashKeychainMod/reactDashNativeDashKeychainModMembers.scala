package typings
package reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-keychain", JSImport.Namespace)
@js.native
object reactDashNativeDashKeychainModMembers extends js.Object {
  def canImplyAuthentication(): js.Promise[scala.Boolean] = js.native
  def canImplyAuthentication(options: Options): js.Promise[scala.Boolean] = js.native
  def getGenericPassword(): js.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Service] = js.native
  def getGenericPassword(serviceOrOptions: java.lang.String): js.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Service] = js.native
  def getGenericPassword(serviceOrOptions: Options): js.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Service] = js.native
  def getInternetCredentials(server: java.lang.String): js.Promise[UserCredentials] = js.native
  def getSupportedBiometryType(): js.Promise[java.lang.String | scala.Null] = js.native
  def requestSharedWebCredentials(): js.Promise[SharedWebCredentials] = js.native
  def resetGenericPassword(): js.Promise[scala.Boolean] = js.native
  def resetGenericPassword(serviceOrOptions: java.lang.String): js.Promise[scala.Boolean] = js.native
  def resetGenericPassword(serviceOrOptions: Options): js.Promise[scala.Boolean] = js.native
  def resetInternetCredentials(server: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setGenericPassword(username: java.lang.String, password: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setGenericPassword(username: java.lang.String, password: java.lang.String, serviceOrOptions: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setGenericPassword(username: java.lang.String, password: java.lang.String, serviceOrOptions: Options): js.Promise[scala.Boolean] = js.native
  def setInternetCredentials(server: java.lang.String, username: java.lang.String, password: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setInternetCredentials(server: java.lang.String, username: java.lang.String, password: java.lang.String, options: Options): js.Promise[scala.Boolean] = js.native
  def setSharedWebCredentials(server: java.lang.String, username: java.lang.String, password: java.lang.String): js.Promise[scala.Boolean] = js.native
}

