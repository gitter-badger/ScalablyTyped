package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: gapiDotClientDotPlusLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Person]
  /** List all of the people in the specified collection. */
  def list(request: gapiDotClientDotPlusLib.Anon_AltCollection): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: gapiDotClientDotPlusLib.Anon_ActivityIdAltCollection): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
  /** Search all public profiles. */
  def search(request: gapiDotClientDotPlusLib.Anon_AltFieldsKeyLanguage): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
}

