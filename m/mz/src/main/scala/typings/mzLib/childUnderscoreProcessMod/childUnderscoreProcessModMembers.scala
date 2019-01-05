package typings
package mzLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", JSImport.Namespace)
@js.native
object childUnderscoreProcessModMembers extends js.Object {
  def exec(command: java.lang.String): js.Promise[js.Tuple2[nodeLib.Buffer, nodeLib.Buffer]] = js.native
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingBufferEncoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingBuffer with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingBufferEncoding with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingBuffer with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      nodeLib.Buffer | (/* stdout */ java.lang.String), 
      nodeLib.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding
  ): js.Promise[js.Tuple2[nodeLib.Buffer, nodeLib.Buffer]] = js.native
  def exec(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): js.Promise[js.Tuple2[nodeLib.Buffer, nodeLib.Buffer]] = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptionsWithBufferEncoding
  ): js.Promise[js.Tuple2[nodeLib.Buffer, nodeLib.Buffer]] = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: scala.Null,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      nodeLib.Buffer | (/* stdout */ java.lang.String), 
      nodeLib.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(file: java.lang.String): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding
  ): js.Promise[js.Tuple2[nodeLib.Buffer, nodeLib.Buffer]] = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding
  ): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: scala.Null,
    callback: js.Function3[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      nodeLib.Buffer | (/* stdout */ java.lang.String), 
      nodeLib.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding
  ): js.Promise[js.Tuple2[nodeLib.Buffer, nodeLib.Buffer]] = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding
  ): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: scala.Null,
    callback: js.Function3[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      nodeLib.Buffer | (/* stdout */ java.lang.String), 
      nodeLib.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding
  ): js.Promise[js.Tuple2[nodeLib.Buffer, nodeLib.Buffer]] = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding
  ): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: scala.Null,
    callback: js.Function3[
      /* error */ nodeLib.Error with stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // no `options` definitely means stdout/stderr are `string`.
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(file: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecFileOptions): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding
  ): js.Promise[js.Tuple2[nodeLib.Buffer, nodeLib.Buffer]] = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding
  ): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      (/* error */ nodeLib.Error with stdLib.Error) | nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFileSync(command: java.lang.String): java.lang.String = js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptions
  ): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  def execFileSync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptions): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  @JSName("execFileSync")
  def execFileSync_Buffer(command: java.lang.String): nodeLib.Buffer = js.native
  @JSName("execFileSync")
  def execFileSync_String(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  @JSName("execFile")
  def execFile_ChildProcess(file: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  @JSName("execFile")
  def execFile_ChildProcess(file: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execSync(command: java.lang.String): java.lang.String = js.native
  def execSync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecSyncOptions): nodeLib.Buffer = js.native
  def execSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
  ): nodeLib.Buffer = js.native
  def execSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  @JSName("execSync")
  def execSync_Buffer(command: java.lang.String): nodeLib.Buffer = js.native
  // no `options` definitely means stdout/stderr are `string`.
  @JSName("exec")
  def exec_ChildProcess(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  @JSName("exec")
  def exec_ChildProcess(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(modulePath: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(
    modulePath: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ForkOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.SpawnOptions): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawnSync(command: java.lang.String): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptions
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptions): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
}

