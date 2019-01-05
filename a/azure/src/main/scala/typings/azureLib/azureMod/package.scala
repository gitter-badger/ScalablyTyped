package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object azureMod {
  type CreateTableIfNotExistsCallback = js.Function3[
    /* error */ nodeLib.Error with stdLib.Error, 
    /* created */ scala.Boolean, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type DeleteEntityCallback = js.Function3[
    /* error */ nodeLib.Error with stdLib.Error, 
    /* successful */ scala.Boolean, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type DeleteTableCallback = js.Function3[
    /* error */ nodeLib.Error with stdLib.Error, 
    /* successful */ scala.Boolean, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type ErrorCallback = js.Function1[/* error */ nodeLib.Error with stdLib.Error, scala.Unit]
  type GetBlobToTextCallback = js.Function4[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* text */ java.lang.String, 
    /* result */ BlobResult, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type ListBlobsCallback = js.Function4[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* blobs */ js.Array[BlobResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type ListContainersCallback = js.Function4[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* containers */ js.Array[ContainerResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type ListQueuesCallback = js.Function4[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* queues */ js.Array[QueueResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type ModifyEntityCallback = js.Function3[
    /* error */ nodeLib.Error with stdLib.Error, 
    /* entity */ Entity, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type QueryEntitiesCallback = js.Function4[
    /* error */ nodeLib.Error with stdLib.Error, 
    /* entities */ js.Array[Entity], 
    /* resultContinuation */ QueryEntitiesResultContinuation, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type QueryEntityCallback = js.Function3[
    /* error */ nodeLib.Error with stdLib.Error, 
    /* entity */ Entity, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type QueryTablesCallback = js.Function4[
    /* error */ nodeLib.Error with stdLib.Error, 
    /* queryTablesResult */ js.Array[TableResult], 
    /* resultsContinuation */ QueryResultContinuation, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type SimpleCallback[T] = js.Function2[/* error */ nodeLib.Error with stdLib.Error, /* result */ T, scala.Unit]
  type StorageCallback[T] = js.Function3[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* result */ T, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type StorageCallbackVoid = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* response */ WebResponse, scala.Unit]
  type StorageServicePropertiesCallback = StorageCallback[StorageServiceProperties]
  type StorageServiceStatsCallback = StorageCallback[StorageServiceStats]
  type TableRequestCallback = js.Function3[
    /* error */ nodeLib.Error with stdLib.Error, 
    /* tableResult */ azureLib.Anon_TableName, 
    /* response */ WebResponse, 
    scala.Unit
  ]
  type ValidatorFunction = js.Function1[/* userSettings */ Dictionary[js.Any], js.Any]
}
