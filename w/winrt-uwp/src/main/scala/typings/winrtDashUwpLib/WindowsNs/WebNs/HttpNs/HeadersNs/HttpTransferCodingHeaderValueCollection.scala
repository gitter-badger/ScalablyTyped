package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Transfer-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpTransferCodingHeaderValueCollection")
@js.native
abstract class HttpTransferCodingHeaderValueCollection ()
  extends stdLib.Array[HttpTransferCodingHeaderValue] {
  /** Gets the number of HttpTransferCodingHeaderValue objects in the collection. */
  var size: scala.Double = js.native
  /**
    * Adds a new HttpTransferCodingHeaderValue item to the end of the collection.
    * @param value The new item to add.
    */
  def append(value: HttpTransferCodingHeaderValue): scala.Unit = js.native
  /** Removes all objects from the collection. */
  def clear(): scala.Unit = js.native
  /**
    * Retrieves an iterator to the first HttpTransferCodingHeaderValue item in the collection.
    * @return An object that can be used to enumerate the HttpTransferCodingHeaderValue items in the collection. The iterator points to the first HttpTransferCodingHeaderValue item in the HttpTransferCodingHeaderValueCollection .
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[HttpTransferCodingHeaderValue] = js.native
  /**
    * Returns the HttpTransferCodingHeaderValue at the specified index in the collection.
    * @param index The zero-based index of a specified item in the collection.
    * @return The HttpTransferCodingHeaderValue at the specified index in the HttpTransferCodingHeaderValueCollection .
    */
  def getAt(index: scala.Double): HttpTransferCodingHeaderValue = js.native
  /**
    * Retrieves the HttpTransferCodingHeaderValue items that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the HttpTransferCodingHeaderValue items in the HttpTransferCodingHeaderValueCollection .
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueHttpTransferCodingHeaderValue = js.native
  /**
    * Returns an immutable view of the HttpTransferCodingHeaderValueCollection .
    * @return The view of the HttpTransferCodingHeaderValueCollection .
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HttpTransferCodingHeaderValue] = js.native
  def indexOf(value: HttpTransferCodingHeaderValue, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Retrieves the index of an HttpTransferCodingHeaderValue in the collection.
    * @param value The HttpTransferCodingHeaderValue to find in the HttpTransferCodingHeaderValueCollection .
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: HttpTransferCodingHeaderValue): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Determines whether an element is in the collection.
    * @param item The item to find in the collection.
    * @return true if the item was found in the collection; otherwise, false.
    */
  @JSName("indexOf")
  def indexOf_Boolean(item: HttpTransferCodingHeaderValue): scala.Boolean = js.native
  /**
    * Inserts an HttpTransferCodingHeaderValue into the collection at the specified index.
    * @param index The zero-based index at which value should be inserted.
    * @param value The object to insert into the collection.
    */
  def insertAt(index: scala.Double, value: HttpTransferCodingHeaderValue): scala.Unit = js.native
  /**
    * Parses and adds an entry to the HttpTransferCodingHeaderValueCollection .
    * @param input The entry to add.
    */
  def parseAdd(input: java.lang.String): scala.Unit = js.native
  /**
    * Removes the entry at the specified index from the HttpTransferCodingHeaderValueCollection .
    * @param index The index of the entry to remove.
    */
  def removeAt(index: scala.Double): scala.Unit = js.native
  /** Removes the last HttpTransferCodingHeaderValue item from the collection. */
  def removeAtEnd(): scala.Unit = js.native
  /**
    * Replaces all the HttpTransferCodingHeaderValue items in the collection with the specified HttpTransferCodingHeaderValue items.
    * @param items The HttpTransferCodingHeaderValue items to add to the collection.
    */
  def replaceAll(items: HttpTransferCodingHeaderValue): scala.Unit = js.native
  /**
    * Sets the HttpTransferCodingHeaderValue at the specified index in the collection.
    * @param index The zero-based index at which to set the HttpTransferCodingHeaderValue .
    * @param value The item to set.
    */
  def setAt(index: scala.Double, value: HttpTransferCodingHeaderValue): scala.Unit = js.native
  /**
    * Tries to parse and add the specified item to the HttpTransferCodingHeaderValueCollection .
    * @param input The item to parse and add.
    * @return true if the item successfully parsed and was added; otherwise false.
    */
  def tryParseAdd(input: java.lang.String): scala.Boolean = js.native
}

