package typings
package vscodeDashLanguageclientLib.libDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationMiddleware extends js.Object {
  var provideDeclaration: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDeclaration> */ _
    ]
  ] = js.undefined
}

