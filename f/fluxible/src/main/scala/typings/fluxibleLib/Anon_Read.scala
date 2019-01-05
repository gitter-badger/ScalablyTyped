package typings
package fluxibleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Read extends js.Object {
  /**
    * POST request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def create(
    resource: java.lang.String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def delete(
    resource: java.lang.String,
    params: js.Any,
    callback: js.Function2[/* error */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit
  /**
    * GET request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def read(
    resource: java.lang.String,
    params: js.Any,
    callback: js.Function2[/* error */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def update(
    resource: java.lang.String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ nodeLib.Error with stdLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit
}

