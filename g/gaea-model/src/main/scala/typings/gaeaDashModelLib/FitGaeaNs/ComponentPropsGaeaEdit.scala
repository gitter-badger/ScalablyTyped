package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsGaeaEdit extends js.Object {
  /**
    * 当 editor 为 array 时的数组配置
    * 数组中的 key,和填入的值,会作为 Array<key:value> 填入到 value 中
    */
  var array: js.UndefOr[js.Array[ComponentPropsOptionsArrayValue]] = js.undefined
  /**
    * 是否可被编辑
    */
  var editable: scala.Boolean
  /**
    * 编辑器类型
    */
  var editor: java.lang.String
  /**
    * 为空时的值，默认为 null
    */
  var emptyValue: js.UndefOr[js.Any] = js.undefined
  /**
    * 对应字段名
    */
  var field: java.lang.String
  /**
    * 是否隐藏编辑工具
    */
  var hideTool: scala.Boolean
  /**
    * 枚举实例
    */
  var instance: js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[ComponentPropsOptionValue]]] = js.undefined
  /**
    * 选项名称
    */
  var label: java.lang.String
  /**
    * 控制 number 单位
    */
  var number: js.UndefOr[gaeaDashModelLib.Anon_Units] = js.undefined
  /**
    * 当 editor 为 selector 时的数组配置
    */
  var selector: js.UndefOr[js.Array[ComponentPropsOptionsSelector]] = js.undefined
  /**
    * 值类型, 默认为字符串
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

