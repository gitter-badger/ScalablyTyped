package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Loader extends js.Object {
  /**
    * Represents a YAML exception
    */
  var Exception: org.scalablytyped.runtime.Instantiable2[
    /* reason */ java.lang.String, 
    /* mark */ adoneLib.adoneNs.dataNs.yamlNs.Mark, 
    adoneLib.adoneNs.dataNs.yamlNs.Exception
  ] = js.native
  /**
    * Represetns a mark that is used in exceptions to define the error's location
    */
  var Mark: org.scalablytyped.runtime.Instantiable5[
    /* name */ java.lang.String, 
    /* buffer */ java.lang.String, 
    /* position */ scala.Double, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    adoneLib.adoneNs.dataNs.yamlNs.Mark
  ] = js.native
  /**
    * YAML dumpers
    */
  val dumperNs: Anon_IDump = js.native
  /**
    * YAML loaders
    */
  val loaderNs: Anon_ILoadAll = js.native
  /**
    * YAML schemas
    */
  val schemaNs: Anon_Schema = js.native
  /**
    * YAML types for custom schemas
    */
  val typeNs: Anon_IType = js.native
  /**
    * Decodes the given string/buffer using DEFAULT_SAFE scheme by default
    */
  def decode(buf: java.lang.String): js.Any = js.native
  def decode(buf: java.lang.String, options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  def decode(buf: nodeLib.Buffer): js.Any = js.native
  def decode(buf: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.yamlNs.loaderNs.INs.Options): js.Any = js.native
  /**
    * Encodes the given object using DEFAULT_SAFE scheme by default
    */
  def encode(obj: js.Any): nodeLib.Buffer = js.native
  def encode(obj: js.Any, options: adoneLib.adoneNs.dataNs.yamlNs.dumperNs.INs.Options): nodeLib.Buffer = js.native
}

