package typings
package expressDashWinstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWinstonMod {
  type DynamicLevelFunction = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* err */ nodeLib.Error with stdLib.Error, 
    java.lang.String
  ]
  type DynamicMetaFunction = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* err */ nodeLib.Error with stdLib.Error, 
    js.Object
  ]
  type ErrorLoggerOptions = ErrorLoggerOptionsWithTransports | ErrorLoggerOptionsWithWinstonInstance
  type LoggerOptions = LoggerOptionsWithTransports | LoggerOptionsWithWinstonInstance
  type RequestFilter = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* propName */ java.lang.String, 
    scala.Boolean
  ]
  type ResponseFilter = js.Function2[
    /* res */ expressLib.expressMod.eNs.Response, 
    /* propName */ java.lang.String, 
    scala.Boolean
  ]
  type RouteFilter = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    scala.Boolean
  ]
}
