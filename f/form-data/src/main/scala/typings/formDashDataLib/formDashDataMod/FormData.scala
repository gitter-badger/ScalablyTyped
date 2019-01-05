package typings
package formDashDataLib.formDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData
  extends nodeLib.streamMod.Readable {
  def append(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def append(
    key: java.lang.String,
    value: js.Any,
    options: formDashDataLib.formDashDataMod.FormDataNs.AppendOptions
  ): scala.Unit = js.native
  def append(key: java.lang.String, value: js.Any, options: java.lang.String): scala.Unit = js.native
  def getBoundary(): java.lang.String = js.native
  def getHeaders(): formDashDataLib.formDashDataMod.FormDataNs.Headers = js.native
  def getLength(
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error with stdLib.Error], 
      /* length */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getLengthSync(): scala.Double = js.native
  def hasKnownLength(): scala.Boolean = js.native
  def submit(params: formDashDataLib.formDashDataMod.FormDataNs.SubmitOptions): nodeLib.httpMod.ClientRequest = js.native
  def submit(
    params: formDashDataLib.formDashDataMod.FormDataNs.SubmitOptions,
    callback: js.Function2[
      /* error */ js.UndefOr[nodeLib.Error with stdLib.Error], 
      /* response */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): nodeLib.httpMod.ClientRequest = js.native
  def submit(params: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def submit(
    params: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[nodeLib.Error with stdLib.Error], 
      /* response */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): nodeLib.httpMod.ClientRequest = js.native
}

