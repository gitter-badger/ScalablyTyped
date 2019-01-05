package typings
package ngDashTableLib.srcCoreNgTableEventsChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/ngTableEventsChannel", "NgTableEventsChannel")
@js.native
class NgTableEventsChannel protected () extends js.Object {
  def this($rootScope: angularLib.angularMod.angularNs.IRootScopeService) = this()
  @JSName("$rootScope")
  var $rootScope: js.Any = js.native
  /* private */ def addTableParamsEvent(eventName: js.Any, target: js.Any): js.Any = js.native
  /* private */ def createEventSubscriptionFn(eventName: js.Any): js.Any = js.native
  /* private */ def createPublishEventFn(eventName: js.Any): js.Any = js.native
  /**
    * Subscribe to receive notification whenever a new `NgTableParams` instance has finished being constructed.
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
    *
    * @param listener the function that will be called when the event fires
    * @param eventFilter a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onAfterCreated(listener: IAfterCreatedListener): IUnregistrationFunc = js.native
  def onAfterCreated(listener: IAfterCreatedListener, eventFilter: IEventSelectorFunc): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever a new `NgTableParams` instance has finished being constructed.
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called. Supply a
    * `scope` to have angular automatically unregister the listener when the `scope` is destroyed.
    *
    * @param listener the function that will be called when the event fires
    * @param scope the angular `$scope` that will limit the lifetime of the event subscription
    * @param eventFilter a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onAfterCreated(listener: IAfterCreatedListener, scope: angularLib.angularMod.angularNs.IScope): IUnregistrationFunc = js.native
  def onAfterCreated(
    listener: IAfterCreatedListener,
    scope: angularLib.angularMod.angularNs.IScope,
    eventFilter: IEventSelectorFunc
  ): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever a `ngTableDefaultGetData` instance filters data
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
    *
    * @param listener the function that will be called when the event fires
    * @param eventFilter either the specific `IDefaultGetData` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onAfterDataFiltered[T](listener: IAfterDataFilteredListener[T]): IUnregistrationFunc = js.native
  def onAfterDataFiltered[T](listener: IAfterDataFilteredListener[T], eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever a `ngTableDefaultGetData` instance filters data
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
    *
    * @param listener the function that will be called when the event fires
    * @param scope the angular `$scope` that will limit the lifetime of the event subscription
    * @param eventFilter either the specific `IDefaultGetData` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onAfterDataFiltered[T](listener: IAfterDataFilteredListener[T], scope: angularLib.angularMod.angularNs.IScope): IUnregistrationFunc = js.native
  def onAfterDataFiltered[T](
    listener: IAfterDataFilteredListener[T],
    scope: angularLib.angularMod.angularNs.IScope,
    eventFilter: EventSelector[T]
  ): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever a `ngTableDefaultGetData` instance orders data
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
    *
    * @param listener the function that will be called when the event fires
    * @param eventFilter either the specific `IDefaultGetData` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onAfterDataSorted[T](listener: IAfterDataSortedListener[T]): IUnregistrationFunc = js.native
  def onAfterDataSorted[T](listener: IAfterDataSortedListener[T], eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever a `ngTableDefaultGetData` instance orders data
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
    *
    * @param listener the function that will be called when the event fires
    * @param scope the angular `$scope` that will limit the lifetime of the event subscription
    * @param eventFilter either the specific `IDefaultGetData` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onAfterDataSorted[T](listener: IAfterDataSortedListener[T], scope: angularLib.angularMod.angularNs.IScope): IUnregistrationFunc = js.native
  def onAfterDataSorted[T](
    listener: IAfterDataSortedListener[T],
    scope: angularLib.angularMod.angularNs.IScope,
    eventFilter: EventSelector[T]
  ): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever the `reload` method of an `NgTableParams` instance has successfully executed
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
    *
    * @param listener the function that will be called when the event fires
    * @param eventFilter a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onAfterReloadData[T](listener: IAfterReloadDataListener[T]): IUnregistrationFunc = js.native
  def onAfterReloadData[T](listener: IAfterReloadDataListener[T], eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever the `reload` method of an `NgTableParams` instance has successfully executed
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called. Supply a
    * `scope` to have angular automatically unregister the listener when the `scope` is destroyed.
    *
    * @param listener the function that will be called when the event fires
    * @param scope the angular `$scope` that will limit the lifetime of the event subscription
    * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onAfterReloadData[T](listener: IAfterReloadDataListener[T], scope: angularLib.angularMod.angularNs.IScope): IUnregistrationFunc = js.native
  def onAfterReloadData[T](
    listener: IAfterReloadDataListener[T],
    scope: angularLib.angularMod.angularNs.IScope,
    eventFilter: EventSelector[T]
  ): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever a new data rows *array* is supplied as a `settings` value to a `NgTableParams` instance.
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
    *
    * @param listener the function that will be called when the event fires
    * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onDatasetChanged[T](listener: IDatasetChangedListener[T]): IUnregistrationFunc = js.native
  def onDatasetChanged[T](listener: IDatasetChangedListener[T], eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever a new data rows *array* is supplied as a `settings` value to a `NgTableParams` instance.
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called. Supply a
    * `scope` to have angular automatically unregister the listener when the `scope` is destroyed.
    *
    * @param listener the function that will be called when the event fires
    * @param scope the angular `$scope` that will limit the lifetime of the event subscription
    * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onDatasetChanged[T](listener: IDatasetChangedListener[T], scope: angularLib.angularMod.angularNs.IScope): IUnregistrationFunc = js.native
  def onDatasetChanged[T](
    listener: IDatasetChangedListener[T],
    scope: angularLib.angularMod.angularNs.IScope,
    eventFilter: EventSelector[T]
  ): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever the paging buttons for an `NgTableParams` instance change
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
    *
    * @param listener the function that will be called when the event fires
    * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onPagesChanged[T](listener: IPagesChangedListener): IUnregistrationFunc = js.native
  def onPagesChanged[T](listener: IPagesChangedListener, eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
  /**
    * Subscribe to receive notification whenever the paging buttons for an `NgTableParams` instance change
    * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called. Supply a
    * `scope` to have angular automatically unregister the listener when the `scope` is destroyed.
    *
    * @param listener the function that will be called when the event fires
    * @param scope the angular `$scope` that will limit the lifetime of the event subscription
    * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
    * @return a unregistration function that when called will unregister the `listener`
    */
  def onPagesChanged[T](listener: IPagesChangedListener, scope: angularLib.angularMod.angularNs.IScope): IUnregistrationFunc = js.native
  def onPagesChanged[T](
    listener: IPagesChangedListener,
    scope: angularLib.angularMod.angularNs.IScope,
    eventFilter: EventSelector[T]
  ): IUnregistrationFunc = js.native
  def publishAfterCreated[T](publisher: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T]): scala.Unit = js.native
  def publishAfterDataFiltered[T](publisher: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], newData: js.Array[T]): scala.Unit = js.native
  def publishAfterDataSorted[T](params: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], newData: js.Array[T]): scala.Unit = js.native
  def publishAfterReloadData[T](
    publisher: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T],
    newData: js.Array[T],
    oldData: js.Array[T]
  ): scala.Unit = js.native
  def publishDatasetChanged[T](
    publisher: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T],
    newDataset: js.Array[T],
    oldDataset: js.Array[T]
  ): scala.Unit = js.native
  def publishPagesChanged[T](
    publisher: ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T],
    newPages: js.Array[ngDashTableLib.srcCorePagingMod.IPageButton],
    oldPages: js.Array[ngDashTableLib.srcCorePagingMod.IPageButton]
  ): scala.Unit = js.native
}

@JSImport("ng-table/src/core/ngTableEventsChannel", "NgTableEventsChannel")
@js.native
object NgTableEventsChannel extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

