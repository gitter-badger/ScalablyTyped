package typings
package gandiDashLivednsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneRecord extends js.Object {
  var rrset_name: java.lang.String
  var rrset_ttl: scala.Double
  /**
    * One of A, AAA, CNAME, MX, NS, TXT, WKS, SRV, LOC, SPF, SSHFP, DNAME
    */
  var rrset_type: java.lang.String
  var rrset_values: js.Array[java.lang.String]
}

