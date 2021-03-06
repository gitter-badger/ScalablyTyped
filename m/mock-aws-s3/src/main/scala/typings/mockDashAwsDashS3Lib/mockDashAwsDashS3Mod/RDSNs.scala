package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "RDS")
@js.native
object RDSNs extends js.Object {
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer ()
    extends awsDashSdkLib.awsDashSdkMod.RDSNs.Signer {
    def this(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions) = this()
  }
  
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class Types ()
    extends awsDashSdkLib.awsDashSdkMod.RDSNs.Types {
    def this(options: awsDashSdkLib.clientsRdsMod.RDSNs.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
  @JSName("RDS")
  @js.native
  object RDSNs extends js.Object {
    @js.native
    /**
      * A signer object can be used to generate an auth token to a database.
      */
    class Signer ()
      extends awsDashSdkLib.awsDashSdkMod.RDSNs.RDSNs.Signer {
      def this(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions) = this()
    }
    
    val TypesNs: this.type = js.native
  }
  
}

