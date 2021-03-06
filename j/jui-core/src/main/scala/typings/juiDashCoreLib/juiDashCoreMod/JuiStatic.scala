package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JuiStatic extends js.Object {
  /**
    * Adds a component object created
    *
    * @param ui UI instance
    */
  def add(uiIns: js.Any): scala.Unit = js.native
  /**
    * It is possible to create a component dynamically after the ready point
    *
    * @param type UI type
    */
  def create(`type`: java.lang.String, selector: js.Any): js.Any = js.native
  def create(`type`: java.lang.String, selector: js.Any, options: js.Object): js.Any = js.native
  /**
    * UI 클래스에서 사용될 클래스를 정의하고, 자유롭게 상속할 수 있는 클래스를 정의
    *
    * @param name 모듈 로드와 상속에 사용될 이름을 정한다.
    * @param depends 'define'이나 'defineUI'로 정의된 클래스나 객체를 인자로 받을 수 있다.
    * @param callback UI 클래스를 해당 콜백 함수 내에서 클래스 형태로 구현하고 리턴해야 한다.
    * @param parent 상속받을 클래스
    */
  def define(name: java.lang.String, depends: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def define(
    name: java.lang.String,
    depends: js.Array[java.lang.String],
    callback: js.Function0[scala.Unit],
    parent: java.lang.String
  ): scala.Unit = js.native
  /**
    * 사용자가 실제로 사용할 수 있는 UI 클래스를 정의
    *
    * @param name 모듈 로드와 상속에 사용될 이름을 정한다.
    * @param depends 'define'이나 'defineUI'로 정의된 클래스나 객체를 인자로 받을 수 있다.
    * @param callback UI 클래스를 해당 콜백 함수 내에서 클래스 형태로 구현하고 리턴해야 한다.
    */
  def defineUI(name: java.lang.String, depends: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def defineUI(
    name: java.lang.String,
    depends: js.Array[java.lang.String],
    callback: js.Function0[scala.Unit],
    parent: java.lang.String
  ): scala.Unit = js.native
  /**
    * Generates a custom event to an applicable component
    *
    * @param key Selector or UI type
    * @param type Event type
    * @param args Event arguments
    */
  def emit(key: java.lang.String, `type`: java.lang.String, args: js.Array[_]): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  /**
    * Gets a component currently created
    *
    * @returns UI instance
    */
  def get(key: scala.Double): js.Any = js.native
  /**
    * Gets all components currently created
    *
    * @return UI instances
    */
  def getAll(): js.Array[_] = js.native
  /**
    * define과 defineUI로 정의된 클래스 또는 객체를 가져온다.
    *
    * @param name 가져온 클래스 또는 객체의 이름
    */
  def include(name: java.lang.String): js.Any = js.native
  /**
    * define과 defineUI로 정의된 모든 클래스와 객체를 가져온다.
    */
  def includeAll(): js.Array[_] = js.native
  /**
    * ready 타임에 실행될 callback 정의
    */
  def ready(): scala.Unit = js.native
  def ready(depends: js.Array[java.lang.String]): scala.Unit = js.native
  def ready(depends: js.Array[java.lang.String], callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * UI 클래스에서 사용될 클래스를 정의하고, 자유롭게 상속할 수 있는 클래스를 정의
    *
    * @param name 모듈 로드와 상속에 사용될 이름을 정한다.
    * @param depends 'define'이나 'defineUI'로 정의된 클래스나 객체를 인자로 받을 수 있다.
    * @param callback UI 클래스를 해당 콜백 함수 내에서 클래스 형태로 구현하고 리턴해야 한다.
    * @param parent 상속받을 클래스
    */
  def redefine(name: java.lang.String, depends: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def redefine(
    name: java.lang.String,
    depends: js.Array[java.lang.String],
    callback: js.Function0[scala.Unit],
    parent: java.lang.String
  ): scala.Unit = js.native
}

