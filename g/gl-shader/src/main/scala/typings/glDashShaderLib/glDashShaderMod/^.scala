package typings
package glDashShaderLib.glDashShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-shader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(gl: stdLib.WebGLRenderingContext, options: glDashShaderLib.Anon_Attributes): glDashShaderLib.glDashShaderMod.Shader = js.native
  def apply(gl: stdLib.WebGLRenderingContext, vertex: java.lang.String, fragment: java.lang.String): glDashShaderLib.glDashShaderMod.Shader = js.native
  def apply(
    gl: stdLib.WebGLRenderingContext,
    vertex: java.lang.String,
    fragment: java.lang.String,
    uniforms: js.Array[glDashShaderLib.glDashShaderMod.Parameter]
  ): glDashShaderLib.glDashShaderMod.Shader = js.native
  def apply(
    gl: stdLib.WebGLRenderingContext,
    vertex: java.lang.String,
    fragment: java.lang.String,
    uniforms: js.Array[glDashShaderLib.glDashShaderMod.Parameter],
    attributes: js.Array[glDashShaderLib.glDashShaderMod.Parameter]
  ): glDashShaderLib.glDashShaderMod.Shader = js.native
}

