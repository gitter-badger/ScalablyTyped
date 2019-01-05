package typings
package jenkinsLib.jenkinsMod.createNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsPromisifiedAPI extends js.Object {
  var build: jenkinsLib.Anon_GetName
  var job: jenkinsLib.Anon_BuildName
  var node: jenkinsLib.Anon_ConfigNameCreate
  var queue: jenkinsLib.Anon_ListItem
  var view: jenkinsLib.Anon_ConfigNameXml
  def info(): js.Promise[_]
}

