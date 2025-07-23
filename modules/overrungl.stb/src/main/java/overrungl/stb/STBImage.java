/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
 */

package overrungl.stb;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;

/// [stb_image.h](https://github.com/nothings/stb/blob/master/stb_image.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBImage {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int STBI_default = 0;
    public static final int STBI_grey = 1;
    public static final int STBI_grey_alpha = 2;
    public static final int STBI_rgb = 3;
    public static final int STBI_rgb_alpha = 4;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbi_load_from_memory`.
        public static final MethodHandle MH_stbi_load_from_memory = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_from_callbacks`.
        public static final MethodHandle MH_stbi_load_from_callbacks = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load`.
        public static final MethodHandle MH_stbi_load = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_from_file`.
        public static final MethodHandle MH_stbi_load_from_file = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_gif_from_memory`.
        public static final MethodHandle MH_stbi_load_gif_from_memory = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_16_from_memory`.
        public static final MethodHandle MH_stbi_load_16_from_memory = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_16_from_callbacks`.
        public static final MethodHandle MH_stbi_load_16_from_callbacks = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_16`.
        public static final MethodHandle MH_stbi_load_16 = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_from_file_16`.
        public static final MethodHandle MH_stbi_load_from_file_16 = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_loadf_from_memory`.
        public static final MethodHandle MH_stbi_loadf_from_memory = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_loadf_from_callbacks`.
        public static final MethodHandle MH_stbi_loadf_from_callbacks = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_loadf`.
        public static final MethodHandle MH_stbi_loadf = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_loadf_from_file`.
        public static final MethodHandle MH_stbi_loadf_from_file = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_hdr_to_ldr_gamma`.
        public static final MethodHandle MH_stbi_hdr_to_ldr_gamma = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbi_hdr_to_ldr_scale`.
        public static final MethodHandle MH_stbi_hdr_to_ldr_scale = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbi_ldr_to_hdr_gamma`.
        public static final MethodHandle MH_stbi_ldr_to_hdr_gamma = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbi_ldr_to_hdr_scale`.
        public static final MethodHandle MH_stbi_ldr_to_hdr_scale = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbi_is_hdr_from_callbacks`.
        public static final MethodHandle MH_stbi_is_hdr_from_callbacks = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_is_hdr_from_memory`.
        public static final MethodHandle MH_stbi_is_hdr_from_memory = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_is_hdr`.
        public static final MethodHandle MH_stbi_is_hdr = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_is_hdr_from_file`.
        public static final MethodHandle MH_stbi_is_hdr_from_file = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_failure_reason`.
        public static final MethodHandle MH_stbi_failure_reason = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The method handle of `stbi_image_free`.
        public static final MethodHandle MH_stbi_image_free = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `stbi_info_from_memory`.
        public static final MethodHandle MH_stbi_info_from_memory = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_info_from_callbacks`.
        public static final MethodHandle MH_stbi_info_from_callbacks = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_is_16_bit_from_memory`.
        public static final MethodHandle MH_stbi_is_16_bit_from_memory = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_is_16_bit_from_callbacks`.
        public static final MethodHandle MH_stbi_is_16_bit_from_callbacks = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_info`.
        public static final MethodHandle MH_stbi_info = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_info_from_file`.
        public static final MethodHandle MH_stbi_info_from_file = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_is_16_bit`.
        public static final MethodHandle MH_stbi_is_16_bit = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_is_16_bit_from_file`.
        public static final MethodHandle MH_stbi_is_16_bit_from_file = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_set_unpremultiply_on_load`.
        public static final MethodHandle MH_stbi_set_unpremultiply_on_load = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `stbi_convert_iphone_png_to_rgb`.
        public static final MethodHandle MH_stbi_convert_iphone_png_to_rgb = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `stbi_set_flip_vertically_on_load`.
        public static final MethodHandle MH_stbi_set_flip_vertically_on_load = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `stbi_set_unpremultiply_on_load_thread`.
        public static final MethodHandle MH_stbi_set_unpremultiply_on_load_thread = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `stbi_convert_iphone_png_to_rgb_thread`.
        public static final MethodHandle MH_stbi_convert_iphone_png_to_rgb_thread = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `stbi_set_flip_vertically_on_load_thread`.
        public static final MethodHandle MH_stbi_set_flip_vertically_on_load_thread = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `stbi_zlib_decode_malloc_guesssize`.
        public static final MethodHandle MH_stbi_zlib_decode_malloc_guesssize = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_zlib_decode_malloc_guesssize_headerflag`.
        public static final MethodHandle MH_stbi_zlib_decode_malloc_guesssize_headerflag = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_zlib_decode_malloc`.
        public static final MethodHandle MH_stbi_zlib_decode_malloc = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_zlib_decode_buffer`.
        public static final MethodHandle MH_stbi_zlib_decode_buffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_zlib_decode_noheader_malloc`.
        public static final MethodHandle MH_stbi_zlib_decode_noheader_malloc = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_zlib_decode_noheader_buffer`.
        public static final MethodHandle MH_stbi_zlib_decode_noheader_buffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The function address of `stbi_load_from_memory`.
        public final MemorySegment PFN_stbi_load_from_memory;
        /// The function address of `stbi_load_from_callbacks`.
        public final MemorySegment PFN_stbi_load_from_callbacks;
        /// The function address of `stbi_load`.
        public final MemorySegment PFN_stbi_load;
        /// The function address of `stbi_load_from_file`.
        public final MemorySegment PFN_stbi_load_from_file;
        /// The function address of `stbi_load_gif_from_memory`.
        public final MemorySegment PFN_stbi_load_gif_from_memory;
        /// The function address of `stbi_load_16_from_memory`.
        public final MemorySegment PFN_stbi_load_16_from_memory;
        /// The function address of `stbi_load_16_from_callbacks`.
        public final MemorySegment PFN_stbi_load_16_from_callbacks;
        /// The function address of `stbi_load_16`.
        public final MemorySegment PFN_stbi_load_16;
        /// The function address of `stbi_load_from_file_16`.
        public final MemorySegment PFN_stbi_load_from_file_16;
        /// The function address of `stbi_loadf_from_memory`.
        public final MemorySegment PFN_stbi_loadf_from_memory;
        /// The function address of `stbi_loadf_from_callbacks`.
        public final MemorySegment PFN_stbi_loadf_from_callbacks;
        /// The function address of `stbi_loadf`.
        public final MemorySegment PFN_stbi_loadf;
        /// The function address of `stbi_loadf_from_file`.
        public final MemorySegment PFN_stbi_loadf_from_file;
        /// The function address of `stbi_hdr_to_ldr_gamma`.
        public final MemorySegment PFN_stbi_hdr_to_ldr_gamma;
        /// The function address of `stbi_hdr_to_ldr_scale`.
        public final MemorySegment PFN_stbi_hdr_to_ldr_scale;
        /// The function address of `stbi_ldr_to_hdr_gamma`.
        public final MemorySegment PFN_stbi_ldr_to_hdr_gamma;
        /// The function address of `stbi_ldr_to_hdr_scale`.
        public final MemorySegment PFN_stbi_ldr_to_hdr_scale;
        /// The function address of `stbi_is_hdr_from_callbacks`.
        public final MemorySegment PFN_stbi_is_hdr_from_callbacks;
        /// The function address of `stbi_is_hdr_from_memory`.
        public final MemorySegment PFN_stbi_is_hdr_from_memory;
        /// The function address of `stbi_is_hdr`.
        public final MemorySegment PFN_stbi_is_hdr;
        /// The function address of `stbi_is_hdr_from_file`.
        public final MemorySegment PFN_stbi_is_hdr_from_file;
        /// The function address of `stbi_failure_reason`.
        public final MemorySegment PFN_stbi_failure_reason;
        /// The function address of `stbi_image_free`.
        public final MemorySegment PFN_stbi_image_free;
        /// The function address of `stbi_info_from_memory`.
        public final MemorySegment PFN_stbi_info_from_memory;
        /// The function address of `stbi_info_from_callbacks`.
        public final MemorySegment PFN_stbi_info_from_callbacks;
        /// The function address of `stbi_is_16_bit_from_memory`.
        public final MemorySegment PFN_stbi_is_16_bit_from_memory;
        /// The function address of `stbi_is_16_bit_from_callbacks`.
        public final MemorySegment PFN_stbi_is_16_bit_from_callbacks;
        /// The function address of `stbi_info`.
        public final MemorySegment PFN_stbi_info;
        /// The function address of `stbi_info_from_file`.
        public final MemorySegment PFN_stbi_info_from_file;
        /// The function address of `stbi_is_16_bit`.
        public final MemorySegment PFN_stbi_is_16_bit;
        /// The function address of `stbi_is_16_bit_from_file`.
        public final MemorySegment PFN_stbi_is_16_bit_from_file;
        /// The function address of `stbi_set_unpremultiply_on_load`.
        public final MemorySegment PFN_stbi_set_unpremultiply_on_load;
        /// The function address of `stbi_convert_iphone_png_to_rgb`.
        public final MemorySegment PFN_stbi_convert_iphone_png_to_rgb;
        /// The function address of `stbi_set_flip_vertically_on_load`.
        public final MemorySegment PFN_stbi_set_flip_vertically_on_load;
        /// The function address of `stbi_set_unpremultiply_on_load_thread`.
        public final MemorySegment PFN_stbi_set_unpremultiply_on_load_thread;
        /// The function address of `stbi_convert_iphone_png_to_rgb_thread`.
        public final MemorySegment PFN_stbi_convert_iphone_png_to_rgb_thread;
        /// The function address of `stbi_set_flip_vertically_on_load_thread`.
        public final MemorySegment PFN_stbi_set_flip_vertically_on_load_thread;
        /// The function address of `stbi_zlib_decode_malloc_guesssize`.
        public final MemorySegment PFN_stbi_zlib_decode_malloc_guesssize;
        /// The function address of `stbi_zlib_decode_malloc_guesssize_headerflag`.
        public final MemorySegment PFN_stbi_zlib_decode_malloc_guesssize_headerflag;
        /// The function address of `stbi_zlib_decode_malloc`.
        public final MemorySegment PFN_stbi_zlib_decode_malloc;
        /// The function address of `stbi_zlib_decode_buffer`.
        public final MemorySegment PFN_stbi_zlib_decode_buffer;
        /// The function address of `stbi_zlib_decode_noheader_malloc`.
        public final MemorySegment PFN_stbi_zlib_decode_noheader_malloc;
        /// The function address of `stbi_zlib_decode_noheader_buffer`.
        public final MemorySegment PFN_stbi_zlib_decode_noheader_buffer;
        private Handles() {
            var _lookup = STBLibrary.lookup();
            PFN_stbi_load_from_memory = _lookup.findOrThrow("stbi_load_from_memory");
            PFN_stbi_load_from_callbacks = _lookup.findOrThrow("stbi_load_from_callbacks");
            PFN_stbi_load = _lookup.findOrThrow("stbi_load");
            PFN_stbi_load_from_file = _lookup.findOrThrow("stbi_load_from_file");
            PFN_stbi_load_gif_from_memory = _lookup.findOrThrow("stbi_load_gif_from_memory");
            PFN_stbi_load_16_from_memory = _lookup.findOrThrow("stbi_load_16_from_memory");
            PFN_stbi_load_16_from_callbacks = _lookup.findOrThrow("stbi_load_16_from_callbacks");
            PFN_stbi_load_16 = _lookup.findOrThrow("stbi_load_16");
            PFN_stbi_load_from_file_16 = _lookup.findOrThrow("stbi_load_from_file_16");
            PFN_stbi_loadf_from_memory = _lookup.findOrThrow("stbi_loadf_from_memory");
            PFN_stbi_loadf_from_callbacks = _lookup.findOrThrow("stbi_loadf_from_callbacks");
            PFN_stbi_loadf = _lookup.findOrThrow("stbi_loadf");
            PFN_stbi_loadf_from_file = _lookup.findOrThrow("stbi_loadf_from_file");
            PFN_stbi_hdr_to_ldr_gamma = _lookup.findOrThrow("stbi_hdr_to_ldr_gamma");
            PFN_stbi_hdr_to_ldr_scale = _lookup.findOrThrow("stbi_hdr_to_ldr_scale");
            PFN_stbi_ldr_to_hdr_gamma = _lookup.findOrThrow("stbi_ldr_to_hdr_gamma");
            PFN_stbi_ldr_to_hdr_scale = _lookup.findOrThrow("stbi_ldr_to_hdr_scale");
            PFN_stbi_is_hdr_from_callbacks = _lookup.findOrThrow("stbi_is_hdr_from_callbacks");
            PFN_stbi_is_hdr_from_memory = _lookup.findOrThrow("stbi_is_hdr_from_memory");
            PFN_stbi_is_hdr = _lookup.findOrThrow("stbi_is_hdr");
            PFN_stbi_is_hdr_from_file = _lookup.findOrThrow("stbi_is_hdr_from_file");
            PFN_stbi_failure_reason = _lookup.findOrThrow("stbi_failure_reason");
            PFN_stbi_image_free = _lookup.findOrThrow("stbi_image_free");
            PFN_stbi_info_from_memory = _lookup.findOrThrow("stbi_info_from_memory");
            PFN_stbi_info_from_callbacks = _lookup.findOrThrow("stbi_info_from_callbacks");
            PFN_stbi_is_16_bit_from_memory = _lookup.findOrThrow("stbi_is_16_bit_from_memory");
            PFN_stbi_is_16_bit_from_callbacks = _lookup.findOrThrow("stbi_is_16_bit_from_callbacks");
            PFN_stbi_info = _lookup.findOrThrow("stbi_info");
            PFN_stbi_info_from_file = _lookup.findOrThrow("stbi_info_from_file");
            PFN_stbi_is_16_bit = _lookup.findOrThrow("stbi_is_16_bit");
            PFN_stbi_is_16_bit_from_file = _lookup.findOrThrow("stbi_is_16_bit_from_file");
            PFN_stbi_set_unpremultiply_on_load = _lookup.findOrThrow("stbi_set_unpremultiply_on_load");
            PFN_stbi_convert_iphone_png_to_rgb = _lookup.findOrThrow("stbi_convert_iphone_png_to_rgb");
            PFN_stbi_set_flip_vertically_on_load = _lookup.findOrThrow("stbi_set_flip_vertically_on_load");
            PFN_stbi_set_unpremultiply_on_load_thread = _lookup.findOrThrow("stbi_set_unpremultiply_on_load_thread");
            PFN_stbi_convert_iphone_png_to_rgb_thread = _lookup.findOrThrow("stbi_convert_iphone_png_to_rgb_thread");
            PFN_stbi_set_flip_vertically_on_load_thread = _lookup.findOrThrow("stbi_set_flip_vertically_on_load_thread");
            PFN_stbi_zlib_decode_malloc_guesssize = _lookup.findOrThrow("stbi_zlib_decode_malloc_guesssize");
            PFN_stbi_zlib_decode_malloc_guesssize_headerflag = _lookup.findOrThrow("stbi_zlib_decode_malloc_guesssize_headerflag");
            PFN_stbi_zlib_decode_malloc = _lookup.findOrThrow("stbi_zlib_decode_malloc");
            PFN_stbi_zlib_decode_buffer = _lookup.findOrThrow("stbi_zlib_decode_buffer");
            PFN_stbi_zlib_decode_noheader_malloc = _lookup.findOrThrow("stbi_zlib_decode_noheader_malloc");
            PFN_stbi_zlib_decode_noheader_buffer = _lookup.findOrThrow("stbi_zlib_decode_noheader_buffer");
        }
        private static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// ```
    /// stbi_uc* stbi_load_from_memory(stbi_uc const * buffer, int len, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_load_from_memory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load_from_memory", buffer, len, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_load_from_memory.invokeExact(Handles.get().PFN_stbi_load_from_memory, buffer, len, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_memory", e); }
    }

    /// ```
    /// stbi_uc* stbi_load_from_callbacks(stbi_io_callbacks const * clbk, void* user, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_load_from_callbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load_from_callbacks", clbk, user, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_load_from_callbacks.invokeExact(Handles.get().PFN_stbi_load_from_callbacks, clbk, user, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_callbacks", e); }
    }

    /// ```
    /// stbi_uc* stbi_load(char const * filename, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_load(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load", filename, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_load.invokeExact(Handles.get().PFN_stbi_load, filename, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load", e); }
    }

    /// ```
    /// stbi_uc* stbi_load_from_file(FILE* f, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_load_from_file(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load_from_file", f, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_load_from_file.invokeExact(Handles.get().PFN_stbi_load_from_file, f, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_file", e); }
    }

    /// ```
    /// stbi_uc* stbi_load_gif_from_memory(stbi_uc const * buffer, int len, int** delays, int* x, int* y, int* z, int* comp, int req_comp);
    /// ```
    public static MemorySegment stbi_load_gif_from_memory(MemorySegment buffer, int len, MemorySegment delays, MemorySegment x, MemorySegment y, MemorySegment z, MemorySegment comp, int req_comp) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load_gif_from_memory", buffer, len, delays, x, y, z, comp, req_comp); }
        return (MemorySegment) Handles.MH_stbi_load_gif_from_memory.invokeExact(Handles.get().PFN_stbi_load_gif_from_memory, buffer, len, delays, x, y, z, comp, req_comp); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load_gif_from_memory", e); }
    }

    /// ```
    /// stbi_us* stbi_load_16_from_memory(stbi_uc const * buffer, int len, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_load_16_from_memory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load_16_from_memory", buffer, len, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_load_16_from_memory.invokeExact(Handles.get().PFN_stbi_load_16_from_memory, buffer, len, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load_16_from_memory", e); }
    }

    /// ```
    /// stbi_us* stbi_load_16_from_callbacks(stbi_io_callbacks const * clbk, void* user, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_load_16_from_callbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load_16_from_callbacks", clbk, user, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_load_16_from_callbacks.invokeExact(Handles.get().PFN_stbi_load_16_from_callbacks, clbk, user, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load_16_from_callbacks", e); }
    }

    /// ```
    /// stbi_us* stbi_load_16(char const * filename, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_load_16(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load_16", filename, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_load_16.invokeExact(Handles.get().PFN_stbi_load_16, filename, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load_16", e); }
    }

    /// ```
    /// stbi_us* stbi_load_from_file_16(FILE* f, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_load_from_file_16(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_load_from_file_16", f, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_load_from_file_16.invokeExact(Handles.get().PFN_stbi_load_from_file_16, f, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_file_16", e); }
    }

    /// ```
    /// float* stbi_loadf_from_memory(stbi_uc const * buffer, int len, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_loadf_from_memory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_loadf_from_memory", buffer, len, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_loadf_from_memory.invokeExact(Handles.get().PFN_stbi_loadf_from_memory, buffer, len, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_memory", e); }
    }

    /// ```
    /// float* stbi_loadf_from_callbacks(stbi_io_callbacks const * clbk, void* user, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_loadf_from_callbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_loadf_from_callbacks", clbk, user, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_loadf_from_callbacks.invokeExact(Handles.get().PFN_stbi_loadf_from_callbacks, clbk, user, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_callbacks", e); }
    }

    /// ```
    /// float* stbi_loadf(char const * filename, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_loadf(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_loadf", filename, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_loadf.invokeExact(Handles.get().PFN_stbi_loadf, filename, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_loadf", e); }
    }

    /// ```
    /// float* stbi_loadf_from_file(FILE* f, int* x, int* y, int* channels_in_file, int desired_channels);
    /// ```
    public static MemorySegment stbi_loadf_from_file(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channels_in_file, int desired_channels) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_loadf_from_file", f, x, y, channels_in_file, desired_channels); }
        return (MemorySegment) Handles.MH_stbi_loadf_from_file.invokeExact(Handles.get().PFN_stbi_loadf_from_file, f, x, y, channels_in_file, desired_channels); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_file", e); }
    }

    /// ```
    /// void stbi_hdr_to_ldr_gamma(float gamma);
    /// ```
    public static void stbi_hdr_to_ldr_gamma(float gamma) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_hdr_to_ldr_gamma", gamma); }
        Handles.MH_stbi_hdr_to_ldr_gamma.invokeExact(Handles.get().PFN_stbi_hdr_to_ldr_gamma, gamma); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_hdr_to_ldr_gamma", e); }
    }

    /// ```
    /// void stbi_hdr_to_ldr_scale(float scale);
    /// ```
    public static void stbi_hdr_to_ldr_scale(float scale) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_hdr_to_ldr_scale", scale); }
        Handles.MH_stbi_hdr_to_ldr_scale.invokeExact(Handles.get().PFN_stbi_hdr_to_ldr_scale, scale); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_hdr_to_ldr_scale", e); }
    }

    /// ```
    /// void stbi_ldr_to_hdr_gamma(float gamma);
    /// ```
    public static void stbi_ldr_to_hdr_gamma(float gamma) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_ldr_to_hdr_gamma", gamma); }
        Handles.MH_stbi_ldr_to_hdr_gamma.invokeExact(Handles.get().PFN_stbi_ldr_to_hdr_gamma, gamma); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_ldr_to_hdr_gamma", e); }
    }

    /// ```
    /// void stbi_ldr_to_hdr_scale(float scale);
    /// ```
    public static void stbi_ldr_to_hdr_scale(float scale) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_ldr_to_hdr_scale", scale); }
        Handles.MH_stbi_ldr_to_hdr_scale.invokeExact(Handles.get().PFN_stbi_ldr_to_hdr_scale, scale); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_ldr_to_hdr_scale", e); }
    }

    /// ```
    /// (int) STBbool stbi_is_hdr_from_callbacks(stbi_io_callbacks const * clbk, void* user);
    /// ```
    public static boolean stbi_is_hdr_from_callbacks(MemorySegment clbk, MemorySegment user) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_is_hdr_from_callbacks", clbk, user); }
        return (((int) Handles.MH_stbi_is_hdr_from_callbacks.invokeExact(Handles.get().PFN_stbi_is_hdr_from_callbacks, clbk, user)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_callbacks", e); }
    }

    /// ```
    /// (int) STBbool stbi_is_hdr_from_memory(stbi_uc const * buffer, int len);
    /// ```
    public static boolean stbi_is_hdr_from_memory(MemorySegment buffer, int len) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_is_hdr_from_memory", buffer, len); }
        return (((int) Handles.MH_stbi_is_hdr_from_memory.invokeExact(Handles.get().PFN_stbi_is_hdr_from_memory, buffer, len)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_memory", e); }
    }

    /// ```
    /// (int) STBbool stbi_is_hdr(char const * filename);
    /// ```
    public static boolean stbi_is_hdr(MemorySegment filename) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_is_hdr", filename); }
        return (((int) Handles.MH_stbi_is_hdr.invokeExact(Handles.get().PFN_stbi_is_hdr, filename)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr", e); }
    }

    /// ```
    /// (int) STBbool stbi_is_hdr_from_file(FILE* f);
    /// ```
    public static boolean stbi_is_hdr_from_file(MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_is_hdr_from_file", f); }
        return (((int) Handles.MH_stbi_is_hdr_from_file.invokeExact(Handles.get().PFN_stbi_is_hdr_from_file, f)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_file", e); }
    }

    /// ```
    /// const char* stbi_failure_reason();
    /// ```
    public static MemorySegment stbi_failure_reason() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_failure_reason"); }
        return (MemorySegment) Handles.MH_stbi_failure_reason.invokeExact(Handles.get().PFN_stbi_failure_reason); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_failure_reason", e); }
    }

    /// ```
    /// void stbi_image_free(void* retval_from_stbi_load);
    /// ```
    public static void stbi_image_free(MemorySegment retval_from_stbi_load) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_image_free", retval_from_stbi_load); }
        Handles.MH_stbi_image_free.invokeExact(Handles.get().PFN_stbi_image_free, retval_from_stbi_load); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_image_free", e); }
    }

    /// ```
    /// (int) STBbool stbi_info_from_memory(stbi_uc const * buffer, int len, int* x, int* y, int* comp);
    /// ```
    public static boolean stbi_info_from_memory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment comp) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_info_from_memory", buffer, len, x, y, comp); }
        return (((int) Handles.MH_stbi_info_from_memory.invokeExact(Handles.get().PFN_stbi_info_from_memory, buffer, len, x, y, comp)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_memory", e); }
    }

    /// ```
    /// (int) STBbool stbi_info_from_callbacks(stbi_io_callbacks const * clbk, void* user, int* x, int* y, int* comp);
    /// ```
    public static boolean stbi_info_from_callbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment comp) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_info_from_callbacks", clbk, user, x, y, comp); }
        return (((int) Handles.MH_stbi_info_from_callbacks.invokeExact(Handles.get().PFN_stbi_info_from_callbacks, clbk, user, x, y, comp)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_callbacks", e); }
    }

    /// ```
    /// (int) STBbool stbi_is_16_bit_from_memory(stbi_uc const * buffer, int len);
    /// ```
    public static boolean stbi_is_16_bit_from_memory(MemorySegment buffer, int len) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_is_16_bit_from_memory", buffer, len); }
        return (((int) Handles.MH_stbi_is_16_bit_from_memory.invokeExact(Handles.get().PFN_stbi_is_16_bit_from_memory, buffer, len)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit_from_memory", e); }
    }

    /// ```
    /// (int) STBbool stbi_is_16_bit_from_callbacks(stbi_io_callbacks const * clbk, void* user);
    /// ```
    public static boolean stbi_is_16_bit_from_callbacks(MemorySegment clbk, MemorySegment user) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_is_16_bit_from_callbacks", clbk, user); }
        return (((int) Handles.MH_stbi_is_16_bit_from_callbacks.invokeExact(Handles.get().PFN_stbi_is_16_bit_from_callbacks, clbk, user)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit_from_callbacks", e); }
    }

    /// ```
    /// (int) STBbool stbi_info(char const * filename, int* x, int* y, int* comp);
    /// ```
    public static boolean stbi_info(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment comp) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_info", filename, x, y, comp); }
        return (((int) Handles.MH_stbi_info.invokeExact(Handles.get().PFN_stbi_info, filename, x, y, comp)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_info", e); }
    }

    /// ```
    /// (int) STBbool stbi_info_from_file(FILE* f, int* x, int* y, int* comp);
    /// ```
    public static boolean stbi_info_from_file(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment comp) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_info_from_file", f, x, y, comp); }
        return (((int) Handles.MH_stbi_info_from_file.invokeExact(Handles.get().PFN_stbi_info_from_file, f, x, y, comp)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_file", e); }
    }

    /// ```
    /// (int) STBbool stbi_is_16_bit(char const * filename);
    /// ```
    public static boolean stbi_is_16_bit(MemorySegment filename) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_is_16_bit", filename); }
        return (((int) Handles.MH_stbi_is_16_bit.invokeExact(Handles.get().PFN_stbi_is_16_bit, filename)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit", e); }
    }

    /// ```
    /// (int) STBbool stbi_is_16_bit_from_file(FILE* f);
    /// ```
    public static boolean stbi_is_16_bit_from_file(MemorySegment f) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_is_16_bit_from_file", f); }
        return (((int) Handles.MH_stbi_is_16_bit_from_file.invokeExact(Handles.get().PFN_stbi_is_16_bit_from_file, f)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit_from_file", e); }
    }

    /// ```
    /// void stbi_set_unpremultiply_on_load((int) STBbool flag_true_if_should_unpremultiply);
    /// ```
    public static void stbi_set_unpremultiply_on_load(boolean flag_true_if_should_unpremultiply) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_set_unpremultiply_on_load", flag_true_if_should_unpremultiply); }
        Handles.MH_stbi_set_unpremultiply_on_load.invokeExact(Handles.get().PFN_stbi_set_unpremultiply_on_load, ((flag_true_if_should_unpremultiply) ? 1 : 0)); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_set_unpremultiply_on_load", e); }
    }

    /// ```
    /// void stbi_convert_iphone_png_to_rgb((int) STBbool flag_true_if_should_convert);
    /// ```
    public static void stbi_convert_iphone_png_to_rgb(boolean flag_true_if_should_convert) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_convert_iphone_png_to_rgb", flag_true_if_should_convert); }
        Handles.MH_stbi_convert_iphone_png_to_rgb.invokeExact(Handles.get().PFN_stbi_convert_iphone_png_to_rgb, ((flag_true_if_should_convert) ? 1 : 0)); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_convert_iphone_png_to_rgb", e); }
    }

    /// ```
    /// void stbi_set_flip_vertically_on_load((int) STBbool flag_true_if_should_flip);
    /// ```
    public static void stbi_set_flip_vertically_on_load(boolean flag_true_if_should_flip) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_set_flip_vertically_on_load", flag_true_if_should_flip); }
        Handles.MH_stbi_set_flip_vertically_on_load.invokeExact(Handles.get().PFN_stbi_set_flip_vertically_on_load, ((flag_true_if_should_flip) ? 1 : 0)); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_set_flip_vertically_on_load", e); }
    }

    /// ```
    /// void stbi_set_unpremultiply_on_load_thread((int) STBbool flag_true_if_should_unpremultiply);
    /// ```
    public static void stbi_set_unpremultiply_on_load_thread(boolean flag_true_if_should_unpremultiply) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_set_unpremultiply_on_load_thread", flag_true_if_should_unpremultiply); }
        Handles.MH_stbi_set_unpremultiply_on_load_thread.invokeExact(Handles.get().PFN_stbi_set_unpremultiply_on_load_thread, ((flag_true_if_should_unpremultiply) ? 1 : 0)); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_set_unpremultiply_on_load_thread", e); }
    }

    /// ```
    /// void stbi_convert_iphone_png_to_rgb_thread((int) STBbool flag_true_if_should_convert);
    /// ```
    public static void stbi_convert_iphone_png_to_rgb_thread(boolean flag_true_if_should_convert) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_convert_iphone_png_to_rgb_thread", flag_true_if_should_convert); }
        Handles.MH_stbi_convert_iphone_png_to_rgb_thread.invokeExact(Handles.get().PFN_stbi_convert_iphone_png_to_rgb_thread, ((flag_true_if_should_convert) ? 1 : 0)); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_convert_iphone_png_to_rgb_thread", e); }
    }

    /// ```
    /// void stbi_set_flip_vertically_on_load_thread((int) STBbool flag_true_if_should_flip);
    /// ```
    public static void stbi_set_flip_vertically_on_load_thread(boolean flag_true_if_should_flip) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_set_flip_vertically_on_load_thread", flag_true_if_should_flip); }
        Handles.MH_stbi_set_flip_vertically_on_load_thread.invokeExact(Handles.get().PFN_stbi_set_flip_vertically_on_load_thread, ((flag_true_if_should_flip) ? 1 : 0)); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_set_flip_vertically_on_load_thread", e); }
    }

    /// ```
    /// char* stbi_zlib_decode_malloc_guesssize(const char* buffer, int len, int initial_size, int* outlen);
    /// ```
    public static MemorySegment stbi_zlib_decode_malloc_guesssize(MemorySegment buffer, int len, int initial_size, MemorySegment outlen) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_zlib_decode_malloc_guesssize", buffer, len, initial_size, outlen); }
        return (MemorySegment) Handles.MH_stbi_zlib_decode_malloc_guesssize.invokeExact(Handles.get().PFN_stbi_zlib_decode_malloc_guesssize, buffer, len, initial_size, outlen); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc_guesssize", e); }
    }

    /// ```
    /// char* stbi_zlib_decode_malloc_guesssize_headerflag(const char* buffer, int len, int initial_size, int* outlen, int parse_header);
    /// ```
    public static MemorySegment stbi_zlib_decode_malloc_guesssize_headerflag(MemorySegment buffer, int len, int initial_size, MemorySegment outlen, int parse_header) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_zlib_decode_malloc_guesssize_headerflag", buffer, len, initial_size, outlen, parse_header); }
        return (MemorySegment) Handles.MH_stbi_zlib_decode_malloc_guesssize_headerflag.invokeExact(Handles.get().PFN_stbi_zlib_decode_malloc_guesssize_headerflag, buffer, len, initial_size, outlen, parse_header); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc_guesssize_headerflag", e); }
    }

    /// ```
    /// char* stbi_zlib_decode_malloc(const char* buffer, int len, int* outlen);
    /// ```
    public static MemorySegment stbi_zlib_decode_malloc(MemorySegment buffer, int len, MemorySegment outlen) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_zlib_decode_malloc", buffer, len, outlen); }
        return (MemorySegment) Handles.MH_stbi_zlib_decode_malloc.invokeExact(Handles.get().PFN_stbi_zlib_decode_malloc, buffer, len, outlen); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc", e); }
    }

    /// ```
    /// int stbi_zlib_decode_buffer(char* obuffer, int olen, const char* ibuffer, int ilen);
    /// ```
    public static int stbi_zlib_decode_buffer(MemorySegment obuffer, int olen, MemorySegment ibuffer, int ilen) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_zlib_decode_buffer", obuffer, olen, ibuffer, ilen); }
        return (int) Handles.MH_stbi_zlib_decode_buffer.invokeExact(Handles.get().PFN_stbi_zlib_decode_buffer, obuffer, olen, ibuffer, ilen); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_buffer", e); }
    }

    /// ```
    /// char* stbi_zlib_decode_noheader_malloc(const char* buffer, int len, int* outlen);
    /// ```
    public static MemorySegment stbi_zlib_decode_noheader_malloc(MemorySegment buffer, int len, MemorySegment outlen) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_zlib_decode_noheader_malloc", buffer, len, outlen); }
        return (MemorySegment) Handles.MH_stbi_zlib_decode_noheader_malloc.invokeExact(Handles.get().PFN_stbi_zlib_decode_noheader_malloc, buffer, len, outlen); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_noheader_malloc", e); }
    }

    /// ```
    /// int stbi_zlib_decode_noheader_buffer(char* obuffer, int olen, const char* ibuffer, int ilen);
    /// ```
    public static int stbi_zlib_decode_noheader_buffer(MemorySegment obuffer, int olen, MemorySegment ibuffer, int ilen) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_zlib_decode_noheader_buffer", obuffer, olen, ibuffer, ilen); }
        return (int) Handles.MH_stbi_zlib_decode_noheader_buffer.invokeExact(Handles.get().PFN_stbi_zlib_decode_noheader_buffer, obuffer, olen, ibuffer, ilen); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_noheader_buffer", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBImage() {
    }
}
