package typings
package gapiDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: gapiDotUrlshortenerLib.Anon_ShortUrl): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource]
  /**
    * Creates a new short URL.
    */
  def insert(`object`: gapiDotUrlshortenerLib.Anon_Fields): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource]
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: gapiDotUrlshortenerLib.Anon_Projection): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotUrlshortenerLib.GoogleApiUrlShortenerUrlResource]
}

