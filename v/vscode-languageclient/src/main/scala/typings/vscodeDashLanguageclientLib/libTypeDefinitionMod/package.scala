package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypeDefinitionMod {
  type ProvideTypeDefinitionSignature = js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDefinition | Array<VDefinitionLink>> */ js.Any
  ]
}
