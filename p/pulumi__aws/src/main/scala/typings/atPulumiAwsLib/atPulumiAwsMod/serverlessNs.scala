package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "serverless")
@js.native
object serverlessNs extends js.Object {
  @js.native
  class Function protected ()
    extends atPulumiAwsLib.serverlessMod.Function {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: java.lang.String, options: atPulumiAwsLib.serverlessFunctionMod.FunctionOptions) = this()
    def this(name: java.lang.String, options: atPulumiAwsLib.serverlessFunctionMod.FunctionOptions, func: atPulumiAwsLib.serverlessFunctionMod.Handler) = this()
    def this(name: java.lang.String, options: atPulumiAwsLib.serverlessFunctionMod.FunctionOptions, func: atPulumiAwsLib.serverlessFunctionMod.Handler, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
  }
  
}

