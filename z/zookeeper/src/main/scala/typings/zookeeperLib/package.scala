package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zookeeperLib {
  type ACL = scala.Double | Anon_Auth
  type Callback[T] = js.Function3[/* rc */ scala.Double, /* error */ java.lang.String, /* value */ T, scala.Unit]
  type acl_callback = js.Function4[
    /* rc */ scala.Double, 
    /* error */ java.lang.String, 
    /* acl */ js.Array[ACL], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Stat */ /* stat */ js.Any, 
    scala.Unit
  ]
  type child2_callback = js.Function4[
    /* rc */ scala.Double, 
    /* error */ java.lang.String, 
    /* children */ js.Array[java.lang.String], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Stat */ /* stat */ js.Any, 
    scala.Unit
  ]
  type watch_callback = js.Function3[
    /* type */ scala.Double, 
    /* state */ scala.Double, 
    /* path */ java.lang.String, 
    scala.Unit
  ]
}
