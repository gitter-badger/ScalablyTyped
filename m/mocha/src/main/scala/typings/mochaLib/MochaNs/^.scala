package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mocha")
@js.native
object ^ extends js.Object {
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  var after: mochaLib.MochaNs.HookFunction = js.native
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  var afterEach: mochaLib.MochaNs.HookFunction = js.native
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  var before: mochaLib.MochaNs.HookFunction = js.native
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  var beforeEach: mochaLib.MochaNs.HookFunction = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var describe: mochaLib.MochaNs.SuiteFunction = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var it: mochaLib.MochaNs.TestFunction = js.native
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  var setup: mochaLib.MochaNs.HookFunction = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var suite: mochaLib.MochaNs.SuiteFunction = js.native
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  var suiteSetup: mochaLib.MochaNs.HookFunction = js.native
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  var suiteTeardown: mochaLib.MochaNs.HookFunction = js.native
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  var teardown: mochaLib.MochaNs.HookFunction = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var test: mochaLib.MochaNs.TestFunction = js.native
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xit: mochaLib.MochaNs.PendingTestFunction = js.native
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  def run(): scala.Unit = js.native
}

