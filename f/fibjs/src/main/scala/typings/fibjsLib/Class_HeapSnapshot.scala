package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief HeapSnapshots记录JS堆在某个时刻的状态
	* @detail 
	*/
@JSGlobal("Class_HeapSnapshot")
@js.native
class Class_HeapSnapshot () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 堆视图节点组成的列表
  	 * 
  	 * @readonly
  	 * @type NArray
  	 */
  var nodes: js.Array[_] = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 堆视图的根节点
  	 * 
  	 * @readonly
  	 * @type HeapGraphNode
  	 */
  var root: Class_HeapGraphNode = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 时间信息
  	 * 
  	 * @readonly
  	 * @type Date
  	 */
  var time: stdLib.Date = js.native
  /**
  	 * 
  	 * @brief 和指定的堆快照进行比较
  	 * @param before 待比较的堆快照
  	 * @return 返回堆快照的比较结果
  	 * 
  	 * 
  	 * 
  	 */
  def diff(before: Class_HeapSnapshot): js.Object = js.native
  /**
  	 * 
  	 * @brief 根据ID获取堆视图节点
  	 * @param id 数字类型的节点ID
  	 * @return 返回获取到的堆视图节点
  	 * 
  	 * 
  	 * 
  	 */
  def getNodeById(id: scala.Double): Class_HeapGraphNode = js.native
  /**
  	 * 
  	 * @brief 根据指定名称保存HeapSnapshot
  	 * @param fname 快照名称
  	 * 
  	 * 
  	 * @async
  	 */
  def save(fname: java.lang.String): scala.Unit = js.native
}

