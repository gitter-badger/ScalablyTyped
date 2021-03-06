package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionScoreQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): FunctionScoreQuery
  /*
    Set the setermines how the new calculated score is combined with the
    score from the original query. Valid values are: multiply, replace, sum,
    avg, max, and min.
    */
  def boostMode(mode: java.lang.String): FunctionScoreQuery
  /*
    Set the source filter.
    */
  def filter(oFilter: Filter): FunctionScoreQuery
  /*
    Add a single score function to the list of existing functions.
    */
  //function (func: ScoreFunction): FunctionScoreQuery;
  /*
    Sets the score functions.  Replaces any existing score functions.
    */
  def functions(funcs: js.Array[ScoreFunction]): FunctionScoreQuery
  /*
    Set the source query.
    */
  def query(oQuery: Query): FunctionScoreQuery
  /*
    Set the scoring mode which specifies how the computed scores are combined.
    Valid values are: avg, max, min, sum, multiply, and first.
    */
  def scoreMode(mode: java.lang.String): FunctionScoreQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

