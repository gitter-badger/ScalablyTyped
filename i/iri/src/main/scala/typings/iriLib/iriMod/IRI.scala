package typings
package iriLib.iriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iri", "IRI")
@js.native
class IRI protected () extends js.Object {
  /**
       * The constructor takes a single argument, a URI or IRI string:
       */
  def this(iri: java.lang.String) = this()
  /**
       * Resolves the IRI against itself, having the effect of stripping the fragment and checking that the supplied IRI is valid (absolute).
       */
  def authority(): java.lang.String | scala.Null = js.native
  /**
       * Returns the IRI without the fragment component. Useful for dereferencing URLs on a network.
       */
  def defrag(): IRI = js.native
  /**
       * Returns the fragment component of the IRI.
       */
  def fragment(): java.lang.String | scala.Null = js.native
  /**
       * Returns the hier-part of the IRI, the hierarchial component: Everything between the scheme and query, including leading `//` for the host, if it exists.
       */
  def hierpart(): java.lang.String = js.native
  /**
       * Returns the host component of the URI, either a domain name or string-formatted IP address. Excludes port number and username/password.
       */
  def host(): java.lang.String = js.native
  /**
       * IRIs with a fragment are not absolute.
       */
  def isAbsolute(): scala.Boolean = js.native
  /**
       * Returns the path component of the hier-part. Does not include the authority/host, query, or fragment.
       */
  def path(): java.lang.String = js.native
  /**
       * Returns the port component of the authority as a string, or `null` if there is no port.
       */
  def port(): java.lang.String | scala.Null = js.native
  /**
       * Returns the query component of the IRI including leading "?", or `null` if there is no query component.
       */
  def query(): java.lang.String | scala.Null = js.native
  /**
       * Resolve the provided URI/IRI reference against this IRI.
       */
  def resolveReference(ref: IRI): IRI = js.native
  /**
       * Resolve the provided URI/IRI reference against this IRI.
       */
  def resolveReference(ref: java.lang.String): IRI = js.native
  /**
       * Returns the scheme of the IRI, e.g. "https", "file", or "urn".
       */
  def scheme(): java.lang.String | scala.Null = js.native
  /**
       * Resolves the IRI against itself, having the effect of stripping the fragment and checking that the supplied IRI is valid (absolute).
       */
  def toAbsolute(): IRI = js.native
  /**
       * Returns a new IRI object with URI-encoded UTF-8 characters decoded.
       */
  def toIRI(): IRI = js.native
  /**
       * Decodes URI-encoded UTF-8 characters and returns a unicode string (Strings in ECMAScript/JavaScript are UTF-16).
       */
  def toIRIString(): java.lang.String = js.native
  /**
       * Returns a URI formatted string with only 7-bit characters.
       */
  def toURIString(): java.lang.String = js.native
  /**
       * Returns the username/password component of the IRI.
       */
  def userinfo(): java.lang.String | scala.Null = js.native
}
