package typings
package yogDashLogLib.yogDashLogMod.yogUnderscoreLogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  def debug(info: yogDashLogLib.LogInput): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def extend(destination: js.Object, source: js.Object): js.Object = js.native
  def fatal(info: yogDashLogLib.LogInput): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def getCookie(name: java.lang.String): java.lang.String | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def getLogFile(intLevel: yogDashLogLib.LevelInt): java.lang.String = js.native
  def getLogFormat(level: yogDashLogLib.LevelName): java.lang.String | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def getLogID(req: expressLib.expressMod.eNs.Request, logIDName: java.lang.String): java.lang.String = js.native
  def getLogLevelInt(level: yogDashLogLib.LevelName): yogDashLogLib.LevelInt | yogDashLogLib.yogDashLogLibNumbers.`-1` = js.native
  def getLogPrefix(): java.lang.String = js.native
  def getLogString(format: java.lang.String): java.lang.String = js.native
  def getParams(name: java.lang.String): java.lang.String = js.native
  def log(level: java.lang.String, obj: java.lang.String): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def log(level: java.lang.String, obj: js.Object): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def md5(data: java.lang.String, len: scala.Double): java.lang.String = js.native
  def md5(data: nodeLib.Buffer, len: scala.Double): java.lang.String = js.native
  def notice(info: yogDashLogLib.LogInput): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def parseCustomLog(obj: js.Object): scala.Unit = js.native
  // 解析日志配置，生成相应的模板函数的字符串内容
  def parseFormat(format: java.lang.String): java.lang.String = js.native
  def parseReqParams(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def parseStackInfo(info: nodeLib.Error with stdLib.Error): scala.Unit = js.native
  def parseStackInfo(info: yogDashLogLib.yogDashLogMod.LogInfo): scala.Unit = js.native
  def setParams(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def trace(info: yogDashLogLib.LogInput): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def warning(info: yogDashLogLib.LogInput): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
  def writeLog(
    intLevel: yogDashLogLib.LevelInt,
    options: yogDashLogLib.yogDashLogMod.WriteLogConfig,
    log_format: java.lang.String
  ): scala.Unit | yogDashLogLib.yogDashLogLibNumbers.`false` = js.native
}

