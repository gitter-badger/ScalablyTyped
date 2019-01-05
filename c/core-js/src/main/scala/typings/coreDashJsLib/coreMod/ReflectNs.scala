package typings
package coreDashJsLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/core", "Reflect")
@js.native
object ReflectNs extends js.Object {
  @JSName("apply")
  def apply(target: coreDashJsLib.Function, thisArgument: js.Any, argumentsList: stdLib.ArrayLike[_]): js.Any = js.native
  def construct(target: coreDashJsLib.Function, argumentsList: stdLib.ArrayLike[_]): js.Any = js.native
  /**
    * Define a unique metadata entry on the target.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param metadataValue A value that contains attached metadata.
    * @param target The target object on which to define metadata.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  Reflect.defineMetadata("custom:annotation", options, Example);
    *
    *  // decorator factory as metadata-producing annotation.
    *  function MyAnnotation(options): ClassDecorator {
    *      return target => Reflect.defineMetadata("custom:annotation", options, target);
    *  }
    * ```
    */
  def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: coreDashJsLib.Object): scala.Unit = js.native
  def defineMetadata(
    metadataKey: js.Any,
    metadataValue: js.Any,
    target: coreDashJsLib.Object,
    targetKey: java.lang.String
  ): scala.Unit = js.native
  def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: coreDashJsLib.Object, targetKey: js.Symbol): scala.Unit = js.native
  def defineProperty(target: js.Any, propertyKey: stdLib.PropertyKey, attributes: stdLib.PropertyDescriptor): scala.Boolean = js.native
  /**
    * Deletes the metadata entry from the target object with the provided key.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata entry was found and deleted; otherwise, false.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.deleteMetadata("custom:annotation", Example);
    * ```
    */
  def deleteMetadata(metadataKey: js.Any, target: coreDashJsLib.Object): scala.Boolean = js.native
  def deleteMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: java.lang.String): scala.Boolean = js.native
  def deleteMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: js.Symbol): scala.Boolean = js.native
  def deleteProperty(target: js.Any, propertyKey: stdLib.PropertyKey): scala.Boolean = js.native
  def enumerate(target: js.Any): nodeLib.IterableIterator[_] with stdLib.IterableIterator[_] = js.native
  def get(target: js.Any, propertyKey: stdLib.PropertyKey): js.Any = js.native
  def get(target: js.Any, propertyKey: stdLib.PropertyKey, receiver: js.Any): js.Any = js.native
  /**
    * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getMetadata("custom:annotation", Example);
    * ```
    */
  def getMetadata(metadataKey: js.Any, target: coreDashJsLib.Object): js.Any = js.native
  def getMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: java.lang.String): js.Any = js.native
  def getMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: js.Symbol): js.Any = js.native
  /**
    * Gets the metadata keys defined on the target object or its prototype chain.
    * @param target The target object on which the metadata is defined.
    * @returns An array of unique metadata keys.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getMetadataKeys(Example);
    * ```
    */
  def getMetadataKeys(target: coreDashJsLib.Object): coreDashJsLib.Array[_] = js.native
  def getMetadataKeys(target: coreDashJsLib.Object, targetKey: java.lang.String): coreDashJsLib.Array[_] = js.native
  def getMetadataKeys(target: coreDashJsLib.Object, targetKey: js.Symbol): coreDashJsLib.Array[_] = js.native
  /**
    * Gets the metadata value for the provided metadata key on the target object.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getOwnMetadata("custom:annotation", Example);
    * ```
    */
  def getOwnMetadata(metadataKey: js.Any, target: coreDashJsLib.Object): js.Any = js.native
  def getOwnMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: java.lang.String): js.Any = js.native
  def getOwnMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: js.Symbol): js.Any = js.native
  /**
    * Gets the unique metadata keys defined on the target object.
    * @param target The target object on which the metadata is defined.
    * @returns An array of unique metadata keys.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getOwnMetadataKeys(Example);
    * ```
    */
  def getOwnMetadataKeys(target: coreDashJsLib.Object): coreDashJsLib.Array[_] = js.native
  def getOwnMetadataKeys(target: coreDashJsLib.Object, targetKey: java.lang.String): coreDashJsLib.Array[_] = js.native
  def getOwnMetadataKeys(target: coreDashJsLib.Object, targetKey: js.Symbol): coreDashJsLib.Array[_] = js.native
  def getOwnPropertyDescriptor(target: js.Any, propertyKey: stdLib.PropertyKey): stdLib.PropertyDescriptor = js.native
  def getPrototypeOf(target: js.Any): js.Any = js.native
  def has(target: js.Any, propertyKey: java.lang.String): scala.Boolean = js.native
  def has(target: js.Any, propertyKey: js.Symbol): scala.Boolean = js.native
  /**
    * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.hasMetadata("custom:annotation", Example);
    * ```
    */
  def hasMetadata(metadataKey: js.Any, target: coreDashJsLib.Object): scala.Boolean = js.native
  def hasMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: java.lang.String): scala.Boolean = js.native
  def hasMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: js.Symbol): scala.Boolean = js.native
  /**
    * Gets a value indicating whether the target object has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.hasOwnMetadata("custom:annotation", Example);
    * ```
    */
  def hasOwnMetadata(metadataKey: js.Any, target: coreDashJsLib.Object): scala.Boolean = js.native
  def hasOwnMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: java.lang.String): scala.Boolean = js.native
  def hasOwnMetadata(metadataKey: js.Any, target: coreDashJsLib.Object, targetKey: js.Symbol): scala.Boolean = js.native
  def isExtensible(target: js.Any): scala.Boolean = js.native
  /**
    * A default metadata decorator factory that can be used on a class, class member, or parameter.
    * @param metadataKey The key for the metadata entry.
    * @param metadataValue The value for the metadata entry.
    * @returns A decorator function.
    * @remarks
    * If `metadataKey` is already defined for the target and target key, the
    * metadataValue for that key will be overwritten.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  // constructor
    *  @Reflect.metadata(key, value)
    *  class Example {
    *  }
    *
    *  // property (on constructor, TypeScript only)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      static staticProperty;
    *  }
    *
    *  // property (on prototype, TypeScript only)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      property;
    *  }
    *
    *  // method (on constructor)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      static staticMethod() { }
    *  }
    *
    *  // method (on prototype)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      method() { }
    *  }
    * ```
    */
  def metadata(metadataKey: js.Any, metadataValue: js.Any): coreDashJsLib.Anon_Target = js.native
  def ownKeys(target: js.Any): coreDashJsLib.Array[stdLib.PropertyKey] = js.native
  def preventExtensions(target: js.Any): scala.Boolean = js.native
  def set(target: js.Any, propertyKey: stdLib.PropertyKey, value: js.Any): scala.Boolean = js.native
  def set(target: js.Any, propertyKey: stdLib.PropertyKey, value: js.Any, receiver: js.Any): scala.Boolean = js.native
  def setPrototypeOf(target: js.Any, proto: js.Any): scala.Boolean = js.native
}

