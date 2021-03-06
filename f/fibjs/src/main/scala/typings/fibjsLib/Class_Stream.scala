package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 流操作对象，用于二进制数据流读写
	* @detail Stream 为基础对象，用于为流处理定义标准借口，不能独立创建
	*/
@JSGlobal("Class_Stream")
@js.native
class Class_Stream () extends Class__object {
  /**
  	 * 
  	 * @brief 关闭当前流对象
  	 * 
  	 * @async
  	 */
  def close(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 复制流数据到目标流中
  	 * @param stm 目标流对象
  	 * @param bytes 复制的字节数
  	 * @return 返回复制的字节数
  	 * 
  	 * 
  	 * @async
  	 */
  def copyTo(stm: Class_Stream): scala.Double = js.native
  def copyTo(stm: Class_Stream, bytes: scala.Double): scala.Double = js.native
  /**
  	 * 
  	 * @brief 将文件缓冲区内容写入物理设备
  	 * 
  	 * @async
  	 */
  def flush(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 从流内读取指定大小的数据
  	 * @param bytes 指定要读取的数据量，缺省为读取随机大小的数据块，读出的数据尺寸取决于设备
  	 * @return 返回从流内读取的数据，若无数据可读，或者连接中断，则返回 null
  	 * 
  	 * 
  	 * @async
  	 */
  def read(): Class_Buffer = js.native
  def read(bytes: scala.Double): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 将给定的数据写入流
  	 * @param data 给定要写入的数据
  	 * 
  	 * 
  	 * @async
  	 */
  def write(data: Class_Buffer): scala.Unit = js.native
}

