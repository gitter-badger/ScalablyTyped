package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDataConfiguration extends js.Object {
  /** Try to detect schema and format options automatically. Any option specified explicitly will be honored. */
  var autodetect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Optional] Additional options if sourceFormat is set to BIGTABLE. */
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.undefined
  /**
    * [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for
    * Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
    */
  var compression: js.UndefOr[java.lang.String] = js.undefined
  /** Additional properties to set if sourceFormat is set to CSV. */
  var csvOptions: js.UndefOr[CsvOptions] = js.undefined
  /** [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS. */
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.undefined
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If
    * false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result.
    * The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that
    * don't match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This
    * setting is ignored.
    */
  var ignoreUnknownValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid
    * error is returned in the job result. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud
    * Bigtable, Google Cloud Datastore backups and Avro formats.
    */
  var maxBadRecords: js.UndefOr[scala.Double] = js.undefined
  /**
    * [Optional] The schema for the data. Schema is required for CSV and JSON formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore
    * backups, and Avro formats.
    */
  var schema: js.UndefOr[TableSchema] = js.undefined
  /**
    * [Required] The data format. For CSV files, specify "CSV". For Google sheets, specify "GOOGLE_SHEETS". For newline-delimited JSON, specify
    * "NEWLINE_DELIMITED_JSON". For Avro files, specify "AVRO". For Google Cloud Datastore backups, specify "DATASTORE_BACKUP". [Beta] For Google Cloud
    * Bigtable, specify "BIGTABLE".
    */
  var sourceFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '&#42;' wildcard
    * character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs:
    * Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore
    * backups, exactly one URI can be specified. Also, the '&#42;' wildcard character is not allowed.
    */
  var sourceUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

