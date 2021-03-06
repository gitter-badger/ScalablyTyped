package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hl extends js.Object {
  /**
    * The hl parameter specifies the language that should be used for text values in the API response.
    */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of video category IDs for the resources that you are retrieving.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
    */
  var part: java.lang.String
  /**
    * The regionCode parameter instructs the API to return the list of video categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
}

