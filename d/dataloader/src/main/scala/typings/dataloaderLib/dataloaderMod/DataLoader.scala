package typings
package dataloaderLib.dataloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLoader[K, V] extends js.Object {
  /**
    * Clears the value at `key` from the cache, if it exists. Returns itself for
    * method chaining.
    */
  def clear(key: K): DataLoader[K, V]
  /**
    * Clears the entire cache. To be used when some event results in unknown
    * invalidations across this particular `DataLoader`. Returns itself for
    * method chaining.
    */
  def clearAll(): DataLoader[K, V]
  /**
    * Loads a key, returning a `Promise` for the value represented by that key.
    */
  def load(key: K): js.Promise[V]
  /**
    * Loads multiple keys, promising an array of values:
    *
    *     var [ a, b ] = await myLoader.loadMany([ 'a', 'b' ]);
    *
    * This is equivalent to the more verbose:
    *
    *     var [ a, b ] = await Promise.all([
    *       myLoader.load('a'),
    *       myLoader.load('b')
    *     ]);
    *
    */
  def loadMany(keys: js.Array[K]): js.Promise[js.Array[V]]
  /**
    * Adds the provied key and value to the cache. If the key already exists, no
    * change is made. Returns itself for method chaining.
    */
  def prime(key: K, value: V): DataLoader[K, V]
}

