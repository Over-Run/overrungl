/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.stb;

import org.jspecify.annotations.NonNull;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Supplier;

import static overrungl.internal.RuntimeHelper.*;

/// [stb_vorbis.c](https://github.com/nothings/stb/blob/master/stb_vorbis.c)
///
/// @author squid233
/// @since 0.1.0
public final class STBVorbis {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int VORBIS__no_error = 0;
    public static final int VORBIS_need_more_data = 1;
    public static final int VORBIS_invalid_api_mixing = 2;
    public static final int VORBIS_outofmem = 3;
    public static final int VORBIS_feature_not_supported = 4;
    public static final int VORBIS_too_many_channels = 5;
    public static final int VORBIS_file_open_failure = 6;
    public static final int VORBIS_seek_without_length = 7;
    public static final int VORBIS_unexpected_eof = 10;
    public static final int VORBIS_seek_invalid = 11;
    public static final int VORBIS_invalid_setup = 20;
    public static final int VORBIS_invalid_stream = 21;
    public static final int VORBIS_missing_capture_pattern = 30;
    public static final int VORBIS_invalid_stream_structure_version = 31;
    public static final int VORBIS_continued_packet_flag_invalid = 32;
    public static final int VORBIS_incorrect_stream_serial_number = 33;
    public static final int VORBIS_invalid_first_page = 34;
    public static final int VORBIS_bad_packet_type = 35;
    public static final int VORBIS_cant_find_last_page = 36;
    public static final int VORBIS_seek_failed = 37;
    public static final int VORBIS_ogg_skeleton_not_supported = 38;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of [`stb_vorbis_get_info`][#stb_vorbis_get_info].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_info = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(STBVorbisInfo.LAYOUT, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_get_comment`][#stb_vorbis_get_comment].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_comment = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(STBVorbisComment.LAYOUT, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_get_error`][#stb_vorbis_get_error].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_error = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_close`][#stb_vorbis_close].
        public static final Supplier<MethodHandle> MH_stb_vorbis_close = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_get_sample_offset`][#stb_vorbis_get_sample_offset].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_sample_offset = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_get_file_offset`][#stb_vorbis_get_file_offset].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_file_offset = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_open_pushdata`][#stb_vorbis_open_pushdata].
        public static final Supplier<MethodHandle> MH_stb_vorbis_open_pushdata = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_decode_frame_pushdata`][#stb_vorbis_decode_frame_pushdata].
        public static final Supplier<MethodHandle> MH_stb_vorbis_decode_frame_pushdata = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_flush_pushdata`][#stb_vorbis_flush_pushdata].
        public static final Supplier<MethodHandle> MH_stb_vorbis_flush_pushdata = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_decode_filename`][#stb_vorbis_decode_filename].
        public static final Supplier<MethodHandle> MH_stb_vorbis_decode_filename = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_decode_memory`][#stb_vorbis_decode_memory].
        public static final Supplier<MethodHandle> MH_stb_vorbis_decode_memory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_open_memory`][#stb_vorbis_open_memory].
        public static final Supplier<MethodHandle> MH_stb_vorbis_open_memory = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_open_filename`][#stb_vorbis_open_filename].
        public static final Supplier<MethodHandle> MH_stb_vorbis_open_filename = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_open_file`][#stb_vorbis_open_file].
        public static final Supplier<MethodHandle> MH_stb_vorbis_open_file = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_open_file_section`][#stb_vorbis_open_file_section].
        public static final Supplier<MethodHandle> MH_stb_vorbis_open_file_section = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stb_vorbis_seek_frame`][#stb_vorbis_seek_frame].
        public static final Supplier<MethodHandle> MH_stb_vorbis_seek_frame = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stb_vorbis_seek`][#stb_vorbis_seek].
        public static final Supplier<MethodHandle> MH_stb_vorbis_seek = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stb_vorbis_seek_start`][#stb_vorbis_seek_start].
        public static final Supplier<MethodHandle> MH_stb_vorbis_seek_start = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_stream_length_in_samples`][#stb_vorbis_stream_length_in_samples].
        public static final Supplier<MethodHandle> MH_stb_vorbis_stream_length_in_samples = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_stream_length_in_seconds`][#stb_vorbis_stream_length_in_seconds].
        public static final Supplier<MethodHandle> MH_stb_vorbis_stream_length_in_seconds = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_get_frame_float`][#stb_vorbis_get_frame_float].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_frame_float = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        /// The method handle of [`stb_vorbis_get_frame_short_interleaved`][#stb_vorbis_get_frame_short_interleaved].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_frame_short_interleaved = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stb_vorbis_get_frame_short`][#stb_vorbis_get_frame_short].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_frame_short = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stb_vorbis_get_samples_float_interleaved`][#stb_vorbis_get_samples_float_interleaved].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_samples_float_interleaved = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stb_vorbis_get_samples_float`][#stb_vorbis_get_samples_float].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_samples_float = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stb_vorbis_get_samples_short_interleaved`][#stb_vorbis_get_samples_short_interleaved].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_samples_short_interleaved = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The method handle of [`stb_vorbis_get_samples_short`][#stb_vorbis_get_samples_short].
        public static final Supplier<MethodHandle> MH_stb_vorbis_get_samples_short = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        /// The function address of [`stb_vorbis_get_info`][#stb_vorbis_get_info].
        public final MemorySegment PFN_stb_vorbis_get_info;
        /// The function address of [`stb_vorbis_get_comment`][#stb_vorbis_get_comment].
        public final MemorySegment PFN_stb_vorbis_get_comment;
        /// The function address of [`stb_vorbis_get_error`][#stb_vorbis_get_error].
        public final MemorySegment PFN_stb_vorbis_get_error;
        /// The function address of [`stb_vorbis_close`][#stb_vorbis_close].
        public final MemorySegment PFN_stb_vorbis_close;
        /// The function address of [`stb_vorbis_get_sample_offset`][#stb_vorbis_get_sample_offset].
        public final MemorySegment PFN_stb_vorbis_get_sample_offset;
        /// The function address of [`stb_vorbis_get_file_offset`][#stb_vorbis_get_file_offset].
        public final MemorySegment PFN_stb_vorbis_get_file_offset;
        /// The function address of [`stb_vorbis_open_pushdata`][#stb_vorbis_open_pushdata].
        public final MemorySegment PFN_stb_vorbis_open_pushdata;
        /// The function address of [`stb_vorbis_decode_frame_pushdata`][#stb_vorbis_decode_frame_pushdata].
        public final MemorySegment PFN_stb_vorbis_decode_frame_pushdata;
        /// The function address of [`stb_vorbis_flush_pushdata`][#stb_vorbis_flush_pushdata].
        public final MemorySegment PFN_stb_vorbis_flush_pushdata;
        /// The function address of [`stb_vorbis_decode_filename`][#stb_vorbis_decode_filename].
        public final MemorySegment PFN_stb_vorbis_decode_filename;
        /// The function address of [`stb_vorbis_decode_memory`][#stb_vorbis_decode_memory].
        public final MemorySegment PFN_stb_vorbis_decode_memory;
        /// The function address of [`stb_vorbis_open_memory`][#stb_vorbis_open_memory].
        public final MemorySegment PFN_stb_vorbis_open_memory;
        /// The function address of [`stb_vorbis_open_filename`][#stb_vorbis_open_filename].
        public final MemorySegment PFN_stb_vorbis_open_filename;
        /// The function address of [`stb_vorbis_open_file`][#stb_vorbis_open_file].
        public final MemorySegment PFN_stb_vorbis_open_file;
        /// The function address of [`stb_vorbis_open_file_section`][#stb_vorbis_open_file_section].
        public final MemorySegment PFN_stb_vorbis_open_file_section;
        /// The function address of [`stb_vorbis_seek_frame`][#stb_vorbis_seek_frame].
        public final MemorySegment PFN_stb_vorbis_seek_frame;
        /// The function address of [`stb_vorbis_seek`][#stb_vorbis_seek].
        public final MemorySegment PFN_stb_vorbis_seek;
        /// The function address of [`stb_vorbis_seek_start`][#stb_vorbis_seek_start].
        public final MemorySegment PFN_stb_vorbis_seek_start;
        /// The function address of [`stb_vorbis_stream_length_in_samples`][#stb_vorbis_stream_length_in_samples].
        public final MemorySegment PFN_stb_vorbis_stream_length_in_samples;
        /// The function address of [`stb_vorbis_stream_length_in_seconds`][#stb_vorbis_stream_length_in_seconds].
        public final MemorySegment PFN_stb_vorbis_stream_length_in_seconds;
        /// The function address of [`stb_vorbis_get_frame_float`][#stb_vorbis_get_frame_float].
        public final MemorySegment PFN_stb_vorbis_get_frame_float;
        /// The function address of [`stb_vorbis_get_frame_short_interleaved`][#stb_vorbis_get_frame_short_interleaved].
        public final MemorySegment PFN_stb_vorbis_get_frame_short_interleaved;
        /// The function address of [`stb_vorbis_get_frame_short`][#stb_vorbis_get_frame_short].
        public final MemorySegment PFN_stb_vorbis_get_frame_short;
        /// The function address of [`stb_vorbis_get_samples_float_interleaved`][#stb_vorbis_get_samples_float_interleaved].
        public final MemorySegment PFN_stb_vorbis_get_samples_float_interleaved;
        /// The function address of [`stb_vorbis_get_samples_float`][#stb_vorbis_get_samples_float].
        public final MemorySegment PFN_stb_vorbis_get_samples_float;
        /// The function address of [`stb_vorbis_get_samples_short_interleaved`][#stb_vorbis_get_samples_short_interleaved].
        public final MemorySegment PFN_stb_vorbis_get_samples_short_interleaved;
        /// The function address of [`stb_vorbis_get_samples_short`][#stb_vorbis_get_samples_short].
        public final MemorySegment PFN_stb_vorbis_get_samples_short;

        private Handles() {
            var _lookup = STBLibrary.lookup();
            PFN_stb_vorbis_get_info = _lookup.findOrThrow("stb_vorbis_get_info");
            PFN_stb_vorbis_get_comment = _lookup.findOrThrow("stb_vorbis_get_comment");
            PFN_stb_vorbis_get_error = _lookup.findOrThrow("stb_vorbis_get_error");
            PFN_stb_vorbis_close = _lookup.findOrThrow("stb_vorbis_close");
            PFN_stb_vorbis_get_sample_offset = _lookup.findOrThrow("stb_vorbis_get_sample_offset");
            PFN_stb_vorbis_get_file_offset = _lookup.findOrThrow("stb_vorbis_get_file_offset");
            PFN_stb_vorbis_open_pushdata = _lookup.findOrThrow("stb_vorbis_open_pushdata");
            PFN_stb_vorbis_decode_frame_pushdata = _lookup.findOrThrow("stb_vorbis_decode_frame_pushdata");
            PFN_stb_vorbis_flush_pushdata = _lookup.findOrThrow("stb_vorbis_flush_pushdata");
            PFN_stb_vorbis_decode_filename = _lookup.findOrThrow("stb_vorbis_decode_filename");
            PFN_stb_vorbis_decode_memory = _lookup.findOrThrow("stb_vorbis_decode_memory");
            PFN_stb_vorbis_open_memory = _lookup.findOrThrow("stb_vorbis_open_memory");
            PFN_stb_vorbis_open_filename = _lookup.findOrThrow("stb_vorbis_open_filename");
            PFN_stb_vorbis_open_file = _lookup.findOrThrow("stb_vorbis_open_file");
            PFN_stb_vorbis_open_file_section = _lookup.findOrThrow("stb_vorbis_open_file_section");
            PFN_stb_vorbis_seek_frame = _lookup.findOrThrow("stb_vorbis_seek_frame");
            PFN_stb_vorbis_seek = _lookup.findOrThrow("stb_vorbis_seek");
            PFN_stb_vorbis_seek_start = _lookup.findOrThrow("stb_vorbis_seek_start");
            PFN_stb_vorbis_stream_length_in_samples = _lookup.findOrThrow("stb_vorbis_stream_length_in_samples");
            PFN_stb_vorbis_stream_length_in_seconds = _lookup.findOrThrow("stb_vorbis_stream_length_in_seconds");
            PFN_stb_vorbis_get_frame_float = _lookup.findOrThrow("stb_vorbis_get_frame_float");
            PFN_stb_vorbis_get_frame_short_interleaved = _lookup.findOrThrow("stb_vorbis_get_frame_short_interleaved");
            PFN_stb_vorbis_get_frame_short = _lookup.findOrThrow("stb_vorbis_get_frame_short");
            PFN_stb_vorbis_get_samples_float_interleaved = _lookup.findOrThrow("stb_vorbis_get_samples_float_interleaved");
            PFN_stb_vorbis_get_samples_float = _lookup.findOrThrow("stb_vorbis_get_samples_float");
            PFN_stb_vorbis_get_samples_short_interleaved = _lookup.findOrThrow("stb_vorbis_get_samples_short_interleaved");
            PFN_stb_vorbis_get_samples_short = _lookup.findOrThrow("stb_vorbis_get_samples_short");
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `stb_vorbis_get_info`.
    /// ```
    /// (struct STBVorbisInfo) stb_vorbis_info stb_vorbis_get_info(stb_vorbis* f);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_get_info(@NonNull SegmentAllocator __allocator, @NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_info", __allocator, f); }
        return (MemorySegment) Handles.MH_stb_vorbis_get_info.get().invokeExact(Handles.get().PFN_stb_vorbis_get_info, __allocator, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_info", e); }
    }

    /// Invokes `stb_vorbis_get_comment`.
    /// ```
    /// (struct STBVorbisComment) stb_vorbis_comment stb_vorbis_get_comment(stb_vorbis* f);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_get_comment(@NonNull SegmentAllocator __allocator, @NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_comment", __allocator, f); }
        return (MemorySegment) Handles.MH_stb_vorbis_get_comment.get().invokeExact(Handles.get().PFN_stb_vorbis_get_comment, __allocator, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_comment", e); }
    }

    /// Invokes `stb_vorbis_get_error`.
    /// ```
    /// int stb_vorbis_get_error(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_error(@NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_error", f); }
        return (int) Handles.MH_stb_vorbis_get_error.get().invokeExact(Handles.get().PFN_stb_vorbis_get_error, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_error", e); }
    }

    /// Invokes `stb_vorbis_close`.
    /// ```
    /// void stb_vorbis_close(stb_vorbis* f);
    /// ```
    public static void stb_vorbis_close(@NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_close", f); }
        Handles.MH_stb_vorbis_close.get().invokeExact(Handles.get().PFN_stb_vorbis_close, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_close", e); }
    }

    /// Invokes `stb_vorbis_get_sample_offset`.
    /// ```
    /// int stb_vorbis_get_sample_offset(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_sample_offset(@NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_sample_offset", f); }
        return (int) Handles.MH_stb_vorbis_get_sample_offset.get().invokeExact(Handles.get().PFN_stb_vorbis_get_sample_offset, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_sample_offset", e); }
    }

    /// Invokes `stb_vorbis_get_file_offset`.
    /// ```
    /// unsigned int stb_vorbis_get_file_offset(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_get_file_offset(@NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_file_offset", f); }
        return (int) Handles.MH_stb_vorbis_get_file_offset.get().invokeExact(Handles.get().PFN_stb_vorbis_get_file_offset, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_file_offset", e); }
    }

    /// Invokes `stb_vorbis_open_pushdata`.
    /// ```
    /// stb_vorbis* stb_vorbis_open_pushdata(const unsigned char* datablock, int datablock_length_in_bytes, int* datablock_memory_consumed_in_bytes, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_open_pushdata(@NonNull MemorySegment datablock, int datablock_length_in_bytes, @NonNull MemorySegment datablock_memory_consumed_in_bytes, @NonNull MemorySegment error, @NonNull MemorySegment alloc_buffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_open_pushdata", datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer); }
        return (MemorySegment) Handles.MH_stb_vorbis_open_pushdata.get().invokeExact(Handles.get().PFN_stb_vorbis_open_pushdata, datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_pushdata", e); }
    }

    /// Invokes `stb_vorbis_decode_frame_pushdata`.
    /// ```
    /// int stb_vorbis_decode_frame_pushdata(stb_vorbis* f, const unsigned char* datablock, int datablock_length_in_bytes, int* channels, float*** output, int* samples);
    /// ```
    public static int stb_vorbis_decode_frame_pushdata(@NonNull MemorySegment f, @NonNull MemorySegment datablock, int datablock_length_in_bytes, @NonNull MemorySegment channels, @NonNull MemorySegment output, @NonNull MemorySegment samples) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_decode_frame_pushdata", f, datablock, datablock_length_in_bytes, channels, output, samples); }
        return (int) Handles.MH_stb_vorbis_decode_frame_pushdata.get().invokeExact(Handles.get().PFN_stb_vorbis_decode_frame_pushdata, f, datablock, datablock_length_in_bytes, channels, output, samples); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_frame_pushdata", e); }
    }

    /// Invokes `stb_vorbis_flush_pushdata`.
    /// ```
    /// void stb_vorbis_flush_pushdata(stb_vorbis* f);
    /// ```
    public static void stb_vorbis_flush_pushdata(@NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_flush_pushdata", f); }
        Handles.MH_stb_vorbis_flush_pushdata.get().invokeExact(Handles.get().PFN_stb_vorbis_flush_pushdata, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_flush_pushdata", e); }
    }

    /// Invokes `stb_vorbis_decode_filename`.
    /// ```
    /// int stb_vorbis_decode_filename(const char* filename, int* channels, int* sample_rate, short** output);
    /// ```
    public static int stb_vorbis_decode_filename(@NonNull MemorySegment filename, @NonNull MemorySegment channels, @NonNull MemorySegment sample_rate, @NonNull MemorySegment output) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_decode_filename", filename, channels, sample_rate, output); }
        return (int) Handles.MH_stb_vorbis_decode_filename.get().invokeExact(Handles.get().PFN_stb_vorbis_decode_filename, filename, channels, sample_rate, output); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_filename", e); }
    }

    /// Invokes `stb_vorbis_decode_memory`.
    /// ```
    /// int stb_vorbis_decode_memory(const unsigned char* mem, int len, int* channels, int* sample_rate, short** output);
    /// ```
    public static int stb_vorbis_decode_memory(@NonNull MemorySegment mem, int len, @NonNull MemorySegment channels, @NonNull MemorySegment sample_rate, @NonNull MemorySegment output) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_decode_memory", mem, len, channels, sample_rate, output); }
        return (int) Handles.MH_stb_vorbis_decode_memory.get().invokeExact(Handles.get().PFN_stb_vorbis_decode_memory, mem, len, channels, sample_rate, output); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_decode_memory", e); }
    }

    /// Invokes `stb_vorbis_open_memory`.
    /// ```
    /// stb_vorbis* stb_vorbis_open_memory(const unsigned char* data, int len, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_open_memory(@NonNull MemorySegment data, int len, @NonNull MemorySegment error, @NonNull MemorySegment alloc_buffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_open_memory", data, len, error, alloc_buffer); }
        return (MemorySegment) Handles.MH_stb_vorbis_open_memory.get().invokeExact(Handles.get().PFN_stb_vorbis_open_memory, data, len, error, alloc_buffer); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_memory", e); }
    }

    /// Invokes `stb_vorbis_open_filename`.
    /// ```
    /// stb_vorbis* stb_vorbis_open_filename(const char* filename, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_open_filename(@NonNull MemorySegment filename, @NonNull MemorySegment error, @NonNull MemorySegment alloc_buffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_open_filename", filename, error, alloc_buffer); }
        return (MemorySegment) Handles.MH_stb_vorbis_open_filename.get().invokeExact(Handles.get().PFN_stb_vorbis_open_filename, filename, error, alloc_buffer); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_filename", e); }
    }

    /// Invokes `stb_vorbis_open_file`.
    /// ```
    /// stb_vorbis* stb_vorbis_open_file(FILE* f, int close_handle_on_close, int* error, const stb_vorbis_alloc* alloc_buffer);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_open_file(@NonNull MemorySegment f, int close_handle_on_close, @NonNull MemorySegment error, @NonNull MemorySegment alloc_buffer) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_open_file", f, close_handle_on_close, error, alloc_buffer); }
        return (MemorySegment) Handles.MH_stb_vorbis_open_file.get().invokeExact(Handles.get().PFN_stb_vorbis_open_file, f, close_handle_on_close, error, alloc_buffer); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_file", e); }
    }

    /// Invokes `stb_vorbis_open_file_section`.
    /// ```
    /// stb_vorbis* stb_vorbis_open_file_section(FILE* f, int close_handle_on_close, int* error, const stb_vorbis_alloc* alloc_buffer, unsigned int len);
    /// ```
    public static @NonNull MemorySegment stb_vorbis_open_file_section(@NonNull MemorySegment f, int close_handle_on_close, @NonNull MemorySegment error, @NonNull MemorySegment alloc_buffer, int len) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_open_file_section", f, close_handle_on_close, error, alloc_buffer, len); }
        return (MemorySegment) Handles.MH_stb_vorbis_open_file_section.get().invokeExact(Handles.get().PFN_stb_vorbis_open_file_section, f, close_handle_on_close, error, alloc_buffer, len); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_open_file_section", e); }
    }

    /// Invokes `stb_vorbis_seek_frame`.
    /// ```
    /// int stb_vorbis_seek_frame(stb_vorbis* f, unsigned int sample_number);
    /// ```
    public static int stb_vorbis_seek_frame(@NonNull MemorySegment f, int sample_number) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_seek_frame", f, sample_number); }
        return (int) Handles.MH_stb_vorbis_seek_frame.get().invokeExact(Handles.get().PFN_stb_vorbis_seek_frame, f, sample_number); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_frame", e); }
    }

    /// Invokes `stb_vorbis_seek`.
    /// ```
    /// int stb_vorbis_seek(stb_vorbis* f, unsigned int sample_number);
    /// ```
    public static int stb_vorbis_seek(@NonNull MemorySegment f, int sample_number) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_seek", f, sample_number); }
        return (int) Handles.MH_stb_vorbis_seek.get().invokeExact(Handles.get().PFN_stb_vorbis_seek, f, sample_number); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek", e); }
    }

    /// Invokes `stb_vorbis_seek_start`.
    /// ```
    /// int stb_vorbis_seek_start(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_seek_start(@NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_seek_start", f); }
        return (int) Handles.MH_stb_vorbis_seek_start.get().invokeExact(Handles.get().PFN_stb_vorbis_seek_start, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_seek_start", e); }
    }

    /// Invokes `stb_vorbis_stream_length_in_samples`.
    /// ```
    /// unsigned int stb_vorbis_stream_length_in_samples(stb_vorbis* f);
    /// ```
    public static int stb_vorbis_stream_length_in_samples(@NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_stream_length_in_samples", f); }
        return (int) Handles.MH_stb_vorbis_stream_length_in_samples.get().invokeExact(Handles.get().PFN_stb_vorbis_stream_length_in_samples, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_samples", e); }
    }

    /// Invokes `stb_vorbis_stream_length_in_seconds`.
    /// ```
    /// float stb_vorbis_stream_length_in_seconds(stb_vorbis* f);
    /// ```
    public static float stb_vorbis_stream_length_in_seconds(@NonNull MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_stream_length_in_seconds", f); }
        return (float) Handles.MH_stb_vorbis_stream_length_in_seconds.get().invokeExact(Handles.get().PFN_stb_vorbis_stream_length_in_seconds, f); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_stream_length_in_seconds", e); }
    }

    /// Invokes `stb_vorbis_get_frame_float`.
    /// ```
    /// int stb_vorbis_get_frame_float(stb_vorbis* f, int* channels, float*** output);
    /// ```
    public static int stb_vorbis_get_frame_float(@NonNull MemorySegment f, @NonNull MemorySegment channels, @NonNull MemorySegment output) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_frame_float", f, channels, output); }
        return (int) Handles.MH_stb_vorbis_get_frame_float.get().invokeExact(Handles.get().PFN_stb_vorbis_get_frame_float, f, channels, output); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_float", e); }
    }

    /// Invokes `stb_vorbis_get_frame_short_interleaved`.
    /// ```
    /// int stb_vorbis_get_frame_short_interleaved(stb_vorbis* f, int num_c, short* buffer, int num_shorts);
    /// ```
    public static int stb_vorbis_get_frame_short_interleaved(@NonNull MemorySegment f, int num_c, @NonNull MemorySegment buffer, int num_shorts) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_frame_short_interleaved", f, num_c, buffer, num_shorts); }
        return (int) Handles.MH_stb_vorbis_get_frame_short_interleaved.get().invokeExact(Handles.get().PFN_stb_vorbis_get_frame_short_interleaved, f, num_c, buffer, num_shorts); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short_interleaved", e); }
    }

    /// Invokes `stb_vorbis_get_frame_short`.
    /// ```
    /// int stb_vorbis_get_frame_short(stb_vorbis* f, int num_c, short** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_frame_short(@NonNull MemorySegment f, int num_c, @NonNull MemorySegment buffer, int num_samples) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_frame_short", f, num_c, buffer, num_samples); }
        return (int) Handles.MH_stb_vorbis_get_frame_short.get().invokeExact(Handles.get().PFN_stb_vorbis_get_frame_short, f, num_c, buffer, num_samples); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_frame_short", e); }
    }

    /// Invokes `stb_vorbis_get_samples_float_interleaved`.
    /// ```
    /// int stb_vorbis_get_samples_float_interleaved(stb_vorbis* f, int channels, float* buffer, int num_floats);
    /// ```
    public static int stb_vorbis_get_samples_float_interleaved(@NonNull MemorySegment f, int channels, @NonNull MemorySegment buffer, int num_floats) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_samples_float_interleaved", f, channels, buffer, num_floats); }
        return (int) Handles.MH_stb_vorbis_get_samples_float_interleaved.get().invokeExact(Handles.get().PFN_stb_vorbis_get_samples_float_interleaved, f, channels, buffer, num_floats); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float_interleaved", e); }
    }

    /// Invokes `stb_vorbis_get_samples_float`.
    /// ```
    /// int stb_vorbis_get_samples_float(stb_vorbis* f, int channels, float** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_samples_float(@NonNull MemorySegment f, int channels, @NonNull MemorySegment buffer, int num_samples) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_samples_float", f, channels, buffer, num_samples); }
        return (int) Handles.MH_stb_vorbis_get_samples_float.get().invokeExact(Handles.get().PFN_stb_vorbis_get_samples_float, f, channels, buffer, num_samples); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_float", e); }
    }

    /// Invokes `stb_vorbis_get_samples_short_interleaved`.
    /// ```
    /// int stb_vorbis_get_samples_short_interleaved(stb_vorbis* f, int channels, short* buffer, int num_shorts);
    /// ```
    public static int stb_vorbis_get_samples_short_interleaved(@NonNull MemorySegment f, int channels, @NonNull MemorySegment buffer, int num_shorts) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_samples_short_interleaved", f, channels, buffer, num_shorts); }
        return (int) Handles.MH_stb_vorbis_get_samples_short_interleaved.get().invokeExact(Handles.get().PFN_stb_vorbis_get_samples_short_interleaved, f, channels, buffer, num_shorts); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short_interleaved", e); }
    }

    /// Invokes `stb_vorbis_get_samples_short`.
    /// ```
    /// int stb_vorbis_get_samples_short(stb_vorbis* f, int channels, short** buffer, int num_samples);
    /// ```
    public static int stb_vorbis_get_samples_short(@NonNull MemorySegment f, int channels, @NonNull MemorySegment buffer, int num_samples) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_vorbis_get_samples_short", f, channels, buffer, num_samples); }
        return (int) Handles.MH_stb_vorbis_get_samples_short.get().invokeExact(Handles.get().PFN_stb_vorbis_get_samples_short, f, channels, buffer, num_samples); }
        catch (Throwable e) { throw new RuntimeException("error in stb_vorbis_get_samples_short", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBVorbis() {
    }
}
