package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// for just a few events like "window:alert" it makes sense to allow passing cy.stub() or
// a user callback function. Others probably only need a callback function.
/**
  * These events come from the application currently under test (your application).
  * These are the most useful events for you to listen to.
  * @see https://on.cypress.io/catalog-of-events#App-Events
  */
@js.native
trait Actions extends js.Object {
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`command:end`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`command:enqueued`,
    fn: js.Function1[/* command */ EnqueuedCommand, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`command:retry`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`command:start`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`log:added`,
    fn: js.Function2[/* log */ js.Any, /* interactive */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`log:changed`,
    fn: js.Function2[/* log */ js.Any, /* interactive */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`test:after:run`,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ mochaLib.MochaNs.ITest, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`test:before:run`,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ mochaLib.MochaNs.ITest, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @example
    * // likely want to do this in a support file
    * // so it's applied to all spec files
    * // cypress/support/index.js
    *
    * Cypress.on('uncaught:exception', (err, runnable) => {
    *   // returning false here prevents Cypress from
    *   // failing the test
    *   return false
    * })
    * // stub "window.alert" in a single test
    * it('shows alert', () => {
    *    const stub = cy.stub()
    *    cy.on('window:alert', stub)
    *    // trigger application code that calls alert(...)
    *    .then(() => {
    *      expect(stub).to.have.been.calledOnce
    *    })
    * })
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`uncaught:exception`,
    fn: js.Function2[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* runnable */ mochaLib.MochaNs.IRunnable, 
      cypressLib.cypressLibNumbers.`false` | scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`url:changed`,
    fn: js.Function1[/* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`viewport:changed`,
    fn: js.Function1[/* viewport */ Viewport, scala.Unit]
  ): scala.Unit = js.native
  def apply(action: cypressLib.cypressLibStrings.`window:alert`, fn: Agent[sinonLib.sinonMod.SinonNs.SinonSpy]): scala.Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    *    const stub = cy.stub()
    *    cy.on('window:alert', stub)
    *    // assume the button calls window.alert()
    *    cy.get('.my-button').click()
    *    .then(() => {
    *      expect(stub).to.have.been.calledOnce
    *    })
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`window:alert`,
    fn: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`window:before:load`,
    fn: js.Function1[/* win */ mochaLib.Window with stdLib.Window, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`window:before:unload`,
    fn: js.Function1[/* event */ stdLib.BeforeUnloadEvent, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    action: cypressLib.cypressLibStrings.`window:confirm`,
    fn: Agent[sinonLib.sinonMod.SinonNs.SinonSpy]
  ): scala.Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be cancelled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    *    cy.on('window:confirm', (str) => {
    *      console.log(str)
    *      return false // simulate "Cancel"
    *    })
    */
  def apply(
    action: cypressLib.cypressLibStrings.`window:confirm`,
    fn: js.Function1[/* text */ java.lang.String, cypressLib.cypressLibNumbers.`false` | scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`window:load`,
    fn: js.Function1[/* win */ mochaLib.Window with stdLib.Window, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.`window:unload`,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.fail,
    fn: js.Function2[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* mocha */ mochaLib.MochaNs.IRunnable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def apply(
    action: cypressLib.cypressLibStrings.scrolled,
    fn: js.Function1[/* $el */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit]
  ): scala.Unit = js.native
}

