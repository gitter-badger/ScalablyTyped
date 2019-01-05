package typings
package jenkinsLib.jenkinsMod.createNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsAPI extends js.Object {
  var build: jenkinsLib.Anon_Get
  var job: jenkinsLib.Anon_Build
  var node: jenkinsLib.Anon_Config
  var queue: jenkinsLib.Anon_List
  var view: jenkinsLib.Anon_ConfigName
  def info(callback: js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
}

