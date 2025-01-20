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

import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

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
        public static final MethodHandle MH_stbi_load_from_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_from_callbacks`.
        public static final MethodHandle MH_stbi_load_from_callbacks = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load`.
        public static final MethodHandle MH_stbi_load = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_gif_from_memory`.
        public static final MethodHandle MH_stbi_load_gif_from_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_16_from_memory`.
        public static final MethodHandle MH_stbi_load_16_from_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_16_from_callbacks`.
        public static final MethodHandle MH_stbi_load_16_from_callbacks = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_load_16`.
        public static final MethodHandle MH_stbi_load_16 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_loadf_from_memory`.
        public static final MethodHandle MH_stbi_loadf_from_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_loadf_from_callbacks`.
        public static final MethodHandle MH_stbi_loadf_from_callbacks = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_loadf`.
        public static final MethodHandle MH_stbi_loadf = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_hdr_to_ldr_gamma`.
        public static final MethodHandle MH_stbi_hdr_to_ldr_gamma = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbi_hdr_to_ldr_scale`.
        public static final MethodHandle MH_stbi_hdr_to_ldr_scale = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbi_ldr_to_hdr_gamma`.
        public static final MethodHandle MH_stbi_ldr_to_hdr_gamma = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbi_ldr_to_hdr_scale`.
        public static final MethodHandle MH_stbi_ldr_to_hdr_scale = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stbi_is_hdr_from_callbacks`.
        public static final MethodHandle MH_stbi_is_hdr_from_callbacks = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS));
        /// The method handle of `stbi_is_hdr_from_memory`.
        public static final MethodHandle MH_stbi_is_hdr_from_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_is_hdr`.
        public static final MethodHandle MH_stbi_is_hdr = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT));
        /// The method handle of `stbi_failure_reason`.
        public static final MethodHandle MH_stbi_failure_reason = RuntimeHelper.downcall(FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
        /// The method handle of `stbi_image_free`.
        public static final MethodHandle MH_stbi_image_free = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `stbi_info_from_memory`.
        public static final MethodHandle MH_stbi_info_from_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_info_from_callbacks`.
        public static final MethodHandle MH_stbi_info_from_callbacks = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_is_16_bit_from_memory`.
        public static final MethodHandle MH_stbi_is_16_bit_from_memory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_is_16_bit_from_callbacks`.
        public static final MethodHandle MH_stbi_is_16_bit_from_callbacks = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS));
        /// The method handle of `stbi_info`.
        public static final MethodHandle MH_stbi_info = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbi_is_16_bit`.
        public static final MethodHandle MH_stbi_is_16_bit = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT));
        /// The method handle of `stbi_set_unpremultiply_on_load`.
        public static final MethodHandle MH_stbi_set_unpremultiply_on_load = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbi_convert_iphone_png_to_rgb`.
        public static final MethodHandle MH_stbi_convert_iphone_png_to_rgb = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbi_set_flip_vertically_on_load`.
        public static final MethodHandle MH_stbi_set_flip_vertically_on_load = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `stbi_zlib_decode_malloc_guesssize`.
        public static final MethodHandle MH_stbi_zlib_decode_malloc_guesssize = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_zlib_decode_malloc_guesssize_headerflag`.
        public static final MethodHandle MH_stbi_zlib_decode_malloc_guesssize_headerflag = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_zlib_decode_malloc`.
        public static final MethodHandle MH_stbi_zlib_decode_malloc = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_zlib_decode_buffer`.
        public static final MethodHandle MH_stbi_zlib_decode_buffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_zlib_decode_noheader_malloc`.
        public static final MethodHandle MH_stbi_zlib_decode_noheader_malloc = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_zlib_decode_noheader_buffer`.
        public static final MethodHandle MH_stbi_zlib_decode_noheader_buffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The function address of `stbi_load_from_memory`.
        public final MemorySegment PFN_stbi_load_from_memory;
        /// The function address of `stbi_load_from_callbacks`.
        public final MemorySegment PFN_stbi_load_from_callbacks;
        /// The function address of `stbi_load`.
        public final MemorySegment PFN_stbi_load;
        /// The function address of `stbi_load_gif_from_memory`.
        public final MemorySegment PFN_stbi_load_gif_from_memory;
        /// The function address of `stbi_load_16_from_memory`.
        public final MemorySegment PFN_stbi_load_16_from_memory;
        /// The function address of `stbi_load_16_from_callbacks`.
        public final MemorySegment PFN_stbi_load_16_from_callbacks;
        /// The function address of `stbi_load_16`.
        public final MemorySegment PFN_stbi_load_16;
        /// The function address of `stbi_loadf_from_memory`.
        public final MemorySegment PFN_stbi_loadf_from_memory;
        /// The function address of `stbi_loadf_from_callbacks`.
        public final MemorySegment PFN_stbi_loadf_from_callbacks;
        /// The function address of `stbi_loadf`.
        public final MemorySegment PFN_stbi_loadf;
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
        /// The function address of `stbi_is_16_bit`.
        public final MemorySegment PFN_stbi_is_16_bit;
        /// The function address of `stbi_set_unpremultiply_on_load`.
        public final MemorySegment PFN_stbi_set_unpremultiply_on_load;
        /// The function address of `stbi_convert_iphone_png_to_rgb`.
        public final MemorySegment PFN_stbi_convert_iphone_png_to_rgb;
        /// The function address of `stbi_set_flip_vertically_on_load`.
        public final MemorySegment PFN_stbi_set_flip_vertically_on_load;
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
            PFN_stbi_load_from_memory = STBInternal.lookup().findOrThrow("stbi_load_from_memory");
            PFN_stbi_load_from_callbacks = STBInternal.lookup().findOrThrow("stbi_load_from_callbacks");
            PFN_stbi_load = STBInternal.lookup().findOrThrow("stbi_load");
            PFN_stbi_load_gif_from_memory = STBInternal.lookup().findOrThrow("stbi_load_gif_from_memory");
            PFN_stbi_load_16_from_memory = STBInternal.lookup().findOrThrow("stbi_load_16_from_memory");
            PFN_stbi_load_16_from_callbacks = STBInternal.lookup().findOrThrow("stbi_load_16_from_callbacks");
            PFN_stbi_load_16 = STBInternal.lookup().findOrThrow("stbi_load_16");
            PFN_stbi_loadf_from_memory = STBInternal.lookup().findOrThrow("stbi_loadf_from_memory");
            PFN_stbi_loadf_from_callbacks = STBInternal.lookup().findOrThrow("stbi_loadf_from_callbacks");
            PFN_stbi_loadf = STBInternal.lookup().findOrThrow("stbi_loadf");
            PFN_stbi_hdr_to_ldr_gamma = STBInternal.lookup().findOrThrow("stbi_hdr_to_ldr_gamma");
            PFN_stbi_hdr_to_ldr_scale = STBInternal.lookup().findOrThrow("stbi_hdr_to_ldr_scale");
            PFN_stbi_ldr_to_hdr_gamma = STBInternal.lookup().findOrThrow("stbi_ldr_to_hdr_gamma");
            PFN_stbi_ldr_to_hdr_scale = STBInternal.lookup().findOrThrow("stbi_ldr_to_hdr_scale");
            PFN_stbi_is_hdr_from_callbacks = STBInternal.lookup().findOrThrow("stbi_is_hdr_from_callbacks");
            PFN_stbi_is_hdr_from_memory = STBInternal.lookup().findOrThrow("stbi_is_hdr_from_memory");
            PFN_stbi_is_hdr = STBInternal.lookup().findOrThrow("stbi_is_hdr");
            PFN_stbi_failure_reason = STBInternal.lookup().findOrThrow("stbi_failure_reason");
            PFN_stbi_image_free = STBInternal.lookup().findOrThrow("stbi_image_free");
            PFN_stbi_info_from_memory = STBInternal.lookup().findOrThrow("stbi_info_from_memory");
            PFN_stbi_info_from_callbacks = STBInternal.lookup().findOrThrow("stbi_info_from_callbacks");
            PFN_stbi_is_16_bit_from_memory = STBInternal.lookup().findOrThrow("stbi_is_16_bit_from_memory");
            PFN_stbi_is_16_bit_from_callbacks = STBInternal.lookup().findOrThrow("stbi_is_16_bit_from_callbacks");
            PFN_stbi_info = STBInternal.lookup().findOrThrow("stbi_info");
            PFN_stbi_is_16_bit = STBInternal.lookup().findOrThrow("stbi_is_16_bit");
            PFN_stbi_set_unpremultiply_on_load = STBInternal.lookup().findOrThrow("stbi_set_unpremultiply_on_load");
            PFN_stbi_convert_iphone_png_to_rgb = STBInternal.lookup().findOrThrow("stbi_convert_iphone_png_to_rgb");
            PFN_stbi_set_flip_vertically_on_load = STBInternal.lookup().findOrThrow("stbi_set_flip_vertically_on_load");
            PFN_stbi_zlib_decode_malloc_guesssize = STBInternal.lookup().findOrThrow("stbi_zlib_decode_malloc_guesssize");
            PFN_stbi_zlib_decode_malloc_guesssize_headerflag = STBInternal.lookup().findOrThrow("stbi_zlib_decode_malloc_guesssize_headerflag");
            PFN_stbi_zlib_decode_malloc = STBInternal.lookup().findOrThrow("stbi_zlib_decode_malloc");
            PFN_stbi_zlib_decode_buffer = STBInternal.lookup().findOrThrow("stbi_zlib_decode_buffer");
            PFN_stbi_zlib_decode_noheader_malloc = STBInternal.lookup().findOrThrow("stbi_zlib_decode_noheader_malloc");
            PFN_stbi_zlib_decode_noheader_buffer = STBInternal.lookup().findOrThrow("stbi_zlib_decode_noheader_buffer");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    public static @CType("stbi_uc*") MemorySegment stbi_load_from_memory(@CType("stbi_uc const *") MemorySegment buffer, @CType("int") int len, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_load_from_memory.invokeExact(Handles.get().PFN_stbi_load_from_memory, buffer, len, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_memory", e); }
    }

    public static @CType("stbi_uc*") MemorySegment stbi_load_from_callbacks(@CType("stbi_io_callbacks const *") MemorySegment clbk, @CType("void*") MemorySegment user, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_load_from_callbacks.invokeExact(Handles.get().PFN_stbi_load_from_callbacks, clbk, user, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_callbacks", e); }
    }

    public static @CType("stbi_uc*") MemorySegment stbi_load_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") MemorySegment user, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (MemorySegment) Handles.MH_stbi_load_from_callbacks.invokeExact(Handles.get().PFN_stbi_load_from_callbacks, Marshal.marshal(clbk), user, __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_callbacks", e); }
    }

    public static @CType("stbi_uc*") MemorySegment stbi_load(@CType("const char*") MemorySegment filename, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_load.invokeExact(Handles.get().PFN_stbi_load, filename, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load", e); }
    }

    public static @CType("stbi_uc*") MemorySegment stbi_load(@CType("const char*") String filename, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (MemorySegment) Handles.MH_stbi_load.invokeExact(Handles.get().PFN_stbi_load, Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load", e); }
    }

    public static @CType("stbi_uc*") MemorySegment stbi_load_gif_from_memory(@CType("stbi_uc const *") MemorySegment buffer, @CType("int") int len, @Out @CType("int**") MemorySegment delays, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment z, @Out @CType("int*") MemorySegment comp, @CType("int") int req_comp) {
        try {
            return (MemorySegment) Handles.MH_stbi_load_gif_from_memory.invokeExact(Handles.get().PFN_stbi_load_gif_from_memory, buffer, len, delays, x, y, z, comp, req_comp);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_gif_from_memory", e); }
    }

    public static @CType("stbi_us*") MemorySegment stbi_load_16_from_memory(@CType("stbi_uc const *") MemorySegment buffer, @CType("int") int len, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_load_16_from_memory.invokeExact(Handles.get().PFN_stbi_load_16_from_memory, buffer, len, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16_from_memory", e); }
    }

    public static @CType("stbi_us*") MemorySegment stbi_load_16_from_callbacks(@CType("stbi_io_callbacks const *") MemorySegment clbk, @CType("void*") MemorySegment user, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_load_16_from_callbacks.invokeExact(Handles.get().PFN_stbi_load_16_from_callbacks, clbk, user, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16_from_callbacks", e); }
    }

    public static @CType("stbi_us*") MemorySegment stbi_load_16_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") MemorySegment user, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (MemorySegment) Handles.MH_stbi_load_16_from_callbacks.invokeExact(Handles.get().PFN_stbi_load_16_from_callbacks, Marshal.marshal(clbk), user, __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16_from_callbacks", e); }
    }

    public static @CType("stbi_us*") MemorySegment stbi_load_16(@CType("const char*") MemorySegment filename, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_load_16.invokeExact(Handles.get().PFN_stbi_load_16, filename, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16", e); }
    }

    public static @CType("stbi_us*") MemorySegment stbi_load_16(@CType("const char*") String filename, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (MemorySegment) Handles.MH_stbi_load_16.invokeExact(Handles.get().PFN_stbi_load_16, Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16", e); }
    }

    public static @CType("float*") MemorySegment stbi_loadf_from_memory(@CType("stbi_uc const *") MemorySegment buffer, @CType("int") int len, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_loadf_from_memory.invokeExact(Handles.get().PFN_stbi_loadf_from_memory, buffer, len, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_memory", e); }
    }

    public static @CType("float*") MemorySegment stbi_loadf_from_callbacks(@CType("stbi_io_callbacks const *") MemorySegment clbk, @CType("void*") MemorySegment user, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_loadf_from_callbacks.invokeExact(Handles.get().PFN_stbi_loadf_from_callbacks, clbk, user, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_callbacks", e); }
    }

    public static @CType("float*") MemorySegment stbi_loadf_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") MemorySegment user, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (MemorySegment) Handles.MH_stbi_loadf_from_callbacks.invokeExact(Handles.get().PFN_stbi_loadf_from_callbacks, Marshal.marshal(clbk), user, __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_callbacks", e); }
    }

    public static @CType("float*") MemorySegment stbi_loadf(@CType("const char*") MemorySegment filename, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (MemorySegment) Handles.MH_stbi_loadf.invokeExact(Handles.get().PFN_stbi_loadf, filename, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf", e); }
    }

    public static @CType("float*") MemorySegment stbi_loadf(@CType("const char*") String filename, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (MemorySegment) Handles.MH_stbi_loadf.invokeExact(Handles.get().PFN_stbi_loadf, Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf", e); }
    }

    public static void stbi_hdr_to_ldr_gamma(@CType("float") float gamma) {
        try {
            Handles.MH_stbi_hdr_to_ldr_gamma.invokeExact(Handles.get().PFN_stbi_hdr_to_ldr_gamma, gamma);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_hdr_to_ldr_gamma", e); }
    }

    public static void stbi_hdr_to_ldr_scale(@CType("float") float scale) {
        try {
            Handles.MH_stbi_hdr_to_ldr_scale.invokeExact(Handles.get().PFN_stbi_hdr_to_ldr_scale, scale);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_hdr_to_ldr_scale", e); }
    }

    public static void stbi_ldr_to_hdr_gamma(@CType("float") float gamma) {
        try {
            Handles.MH_stbi_ldr_to_hdr_gamma.invokeExact(Handles.get().PFN_stbi_ldr_to_hdr_gamma, gamma);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_ldr_to_hdr_gamma", e); }
    }

    public static void stbi_ldr_to_hdr_scale(@CType("float") float scale) {
        try {
            Handles.MH_stbi_ldr_to_hdr_scale.invokeExact(Handles.get().PFN_stbi_ldr_to_hdr_scale, scale);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_ldr_to_hdr_scale", e); }
    }

    public static @CType("int") boolean stbi_is_hdr_from_callbacks(@CType("stbi_io_callbacks const *") MemorySegment clbk, @CType("void*") MemorySegment user) {
        try {
            return (boolean) Handles.MH_stbi_is_hdr_from_callbacks.invokeExact(Handles.get().PFN_stbi_is_hdr_from_callbacks, clbk, user);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_callbacks", e); }
    }

    public static @CType("int") boolean stbi_is_hdr_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") MemorySegment user) {
        try {
            return (boolean) Handles.MH_stbi_is_hdr_from_callbacks.invokeExact(Handles.get().PFN_stbi_is_hdr_from_callbacks, Marshal.marshal(clbk), user);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_callbacks", e); }
    }

    public static @CType("int") boolean stbi_is_hdr_from_memory(@CType("stbi_uc const *") MemorySegment buffer, @CType("int") int len) {
        try {
            return (boolean) Handles.MH_stbi_is_hdr_from_memory.invokeExact(Handles.get().PFN_stbi_is_hdr_from_memory, buffer, len);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_memory", e); }
    }

    public static @CType("int") boolean stbi_is_hdr(@CType("const char*") MemorySegment filename) {
        try {
            return (boolean) Handles.MH_stbi_is_hdr.invokeExact(Handles.get().PFN_stbi_is_hdr, filename);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr", e); }
    }

    public static @CType("int") boolean stbi_is_hdr(@CType("const char*") String filename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_stbi_is_hdr.invokeExact(Handles.get().PFN_stbi_is_hdr, Marshal.marshal(__overrungl_stack, filename));
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr", e); }
    }

    public static @CType("const char*") MemorySegment stbi_failure_reason_() {
        try {
            return (MemorySegment) Handles.MH_stbi_failure_reason.invokeExact(Handles.get().PFN_stbi_failure_reason);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_failure_reason", e); }
    }

    public static @CType("const char*") String stbi_failure_reason() {
        try {
            return Unmarshal.unmarshalAsString((MemorySegment) Handles.MH_stbi_failure_reason.invokeExact(Handles.get().PFN_stbi_failure_reason));
        } catch (Throwable e) { throw new RuntimeException("error in stbi_failure_reason", e); }
    }

    public static void stbi_image_free(@CType("void*") MemorySegment retval_from_stbi_load) {
        try {
            Handles.MH_stbi_image_free.invokeExact(Handles.get().PFN_stbi_image_free, retval_from_stbi_load);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_image_free", e); }
    }

    public static @CType("int") boolean stbi_info_from_memory(@CType("stbi_uc const *") MemorySegment buffer, @CType("int") int len, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment comp) {
        try {
            return (boolean) Handles.MH_stbi_info_from_memory.invokeExact(Handles.get().PFN_stbi_info_from_memory, buffer, len, x, y, comp);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_memory", e); }
    }

    public static @CType("int") boolean stbi_info_from_callbacks(@CType("stbi_io_callbacks const *") MemorySegment clbk, @CType("void*") MemorySegment user, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment comp) {
        try {
            return (boolean) Handles.MH_stbi_info_from_callbacks.invokeExact(Handles.get().PFN_stbi_info_from_callbacks, clbk, user, x, y, comp);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_callbacks", e); }
    }

    public static @CType("int") boolean stbi_info_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") MemorySegment user, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] comp) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_comp = Marshal.marshal(__overrungl_stack, comp);
            var __overrungl_result = (boolean) Handles.MH_stbi_info_from_callbacks.invokeExact(Handles.get().PFN_stbi_info_from_callbacks, Marshal.marshal(clbk), user, __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_comp);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_comp, comp);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_callbacks", e); }
    }

    public static @CType("int") boolean stbi_is_16_bit_from_memory(@CType("stbi_uc const *") MemorySegment buffer, @CType("int") int len) {
        try {
            return (boolean) Handles.MH_stbi_is_16_bit_from_memory.invokeExact(Handles.get().PFN_stbi_is_16_bit_from_memory, buffer, len);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit_from_memory", e); }
    }

    public static @CType("int") boolean stbi_is_16_bit_from_callbacks(@CType("stbi_io_callbacks const *") MemorySegment clbk, @CType("void*") MemorySegment user) {
        try {
            return (boolean) Handles.MH_stbi_is_16_bit_from_callbacks.invokeExact(Handles.get().PFN_stbi_is_16_bit_from_callbacks, clbk, user);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit_from_callbacks", e); }
    }

    public static @CType("int") boolean stbi_info(@CType("const char*") MemorySegment filename, @Out @CType("int*") MemorySegment x, @Out @CType("int*") MemorySegment y, @Out @CType("int*") MemorySegment comp) {
        try {
            return (boolean) Handles.MH_stbi_info.invokeExact(Handles.get().PFN_stbi_info, filename, x, y, comp);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info", e); }
    }

    public static @CType("int") boolean stbi_info(@CType("const char*") String filename, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] comp) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_comp = Marshal.marshal(__overrungl_stack, comp);
            var __overrungl_result = (boolean) Handles.MH_stbi_info.invokeExact(Handles.get().PFN_stbi_info, Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_comp);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_comp, comp);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info", e); }
    }

    public static @CType("int") boolean stbi_is_16_bit(@CType("const char*") MemorySegment filename) {
        try {
            return (boolean) Handles.MH_stbi_is_16_bit.invokeExact(Handles.get().PFN_stbi_is_16_bit, filename);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit", e); }
    }

    public static @CType("int") boolean stbi_is_16_bit(@CType("const char*") String filename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_stbi_is_16_bit.invokeExact(Handles.get().PFN_stbi_is_16_bit, Marshal.marshal(__overrungl_stack, filename));
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit", e); }
    }

    public static void stbi_set_unpremultiply_on_load(@CType("int") boolean flag_true_if_should_unpremultiply) {
        try {
            Handles.MH_stbi_set_unpremultiply_on_load.invokeExact(Handles.get().PFN_stbi_set_unpremultiply_on_load, flag_true_if_should_unpremultiply);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_set_unpremultiply_on_load", e); }
    }

    public static void stbi_convert_iphone_png_to_rgb(@CType("int") boolean flag_true_if_should_convert) {
        try {
            Handles.MH_stbi_convert_iphone_png_to_rgb.invokeExact(Handles.get().PFN_stbi_convert_iphone_png_to_rgb, flag_true_if_should_convert);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_convert_iphone_png_to_rgb", e); }
    }

    public static void stbi_set_flip_vertically_on_load(@CType("int") boolean flag_true_if_should_flip) {
        try {
            Handles.MH_stbi_set_flip_vertically_on_load.invokeExact(Handles.get().PFN_stbi_set_flip_vertically_on_load, flag_true_if_should_flip);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_set_flip_vertically_on_load", e); }
    }

    public static void stbi_set_unpremultiply_on_load_thread(@CType("int") boolean flag_true_if_should_unpremultiply) {
        try {
            Handles.MH_stbi_set_unpremultiply_on_load.invokeExact(Handles.get().PFN_stbi_set_unpremultiply_on_load, flag_true_if_should_unpremultiply);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_set_unpremultiply_on_load", e); }
    }

    public static void stbi_convert_iphone_png_to_rgb_thread(@CType("int") boolean flag_true_if_should_convert) {
        try {
            Handles.MH_stbi_convert_iphone_png_to_rgb.invokeExact(Handles.get().PFN_stbi_convert_iphone_png_to_rgb, flag_true_if_should_convert);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_convert_iphone_png_to_rgb", e); }
    }

    public static void stbi_set_flip_vertically_on_load_thread(@CType("int") boolean flag_true_if_should_flip) {
        try {
            Handles.MH_stbi_set_flip_vertically_on_load.invokeExact(Handles.get().PFN_stbi_set_flip_vertically_on_load, flag_true_if_should_flip);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_set_flip_vertically_on_load", e); }
    }

    public static @CType("char *") MemorySegment stbi_zlib_decode_malloc_guesssize(@CType("const char *") MemorySegment buffer, @CType("int") int len, @CType("int") int initial_size, @Out @CType("int*") MemorySegment outlen) {
        try {
            return (MemorySegment) Handles.MH_stbi_zlib_decode_malloc_guesssize.invokeExact(Handles.get().PFN_stbi_zlib_decode_malloc_guesssize, buffer, len, initial_size, outlen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc_guesssize", e); }
    }

    public static @CType("char *") MemorySegment stbi_zlib_decode_malloc_guesssize_headerflag(@CType("const char *") MemorySegment buffer, @CType("int") int len, @CType("int") int initial_size, @Out @CType("int*") MemorySegment outlen, @CType("int") int parse_header) {
        try {
            return (MemorySegment) Handles.MH_stbi_zlib_decode_malloc_guesssize_headerflag.invokeExact(Handles.get().PFN_stbi_zlib_decode_malloc_guesssize_headerflag, buffer, len, initial_size, outlen, parse_header);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc_guesssize_headerflag", e); }
    }

    public static @CType("char *") MemorySegment stbi_zlib_decode_malloc(@CType("const char *") MemorySegment buffer, @CType("int") int len, @Out @CType("int*") MemorySegment outlen) {
        try {
            return (MemorySegment) Handles.MH_stbi_zlib_decode_malloc.invokeExact(Handles.get().PFN_stbi_zlib_decode_malloc, buffer, len, outlen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc", e); }
    }

    public static @CType("int") int stbi_zlib_decode_buffer(@CType("char *") MemorySegment obuffer, @CType("int") int olen, @CType("const char *") MemorySegment ibuffer, @CType("int") int ilen) {
        try {
            return (int) Handles.MH_stbi_zlib_decode_buffer.invokeExact(Handles.get().PFN_stbi_zlib_decode_buffer, obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_buffer", e); }
    }

    public static @CType("char *") MemorySegment stbi_zlib_decode_noheader_malloc(@CType("const char *") MemorySegment buffer, @CType("int") int len, @CType("int*") MemorySegment outlen) {
        try {
            return (MemorySegment) Handles.MH_stbi_zlib_decode_noheader_malloc.invokeExact(Handles.get().PFN_stbi_zlib_decode_noheader_malloc, buffer, len, outlen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_noheader_malloc", e); }
    }

    public static @CType("int") int stbi_zlib_decode_noheader_buffer(@CType("char *") MemorySegment obuffer, @CType("int") int olen, @CType("const char *") MemorySegment ibuffer, @CType("int") int ilen) {
        try {
            return (int) Handles.MH_stbi_zlib_decode_noheader_buffer.invokeExact(Handles.get().PFN_stbi_zlib_decode_noheader_buffer, obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_noheader_buffer", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBImage() {
    }

    /// Overloads [stbi_load_from_memory][#stbi_load_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment, int)]
    public static MemorySegment stbi_load_from_memory(MemorySegment buffer, @Out MemorySegment x, @Out MemorySegment y, @Out MemorySegment channels_in_file, int desired_channels) {
        return stbi_load_from_memory(buffer, Math.toIntExact(buffer.byteSize()), x, y, channels_in_file, desired_channels);
    }

    /// Overloads [stbi_load_from_memory][#stbi_load_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment, int)]
    public static MemorySegment stbi_load_from_memory(MemorySegment buffer, @Out int[] x, @Out int[] y, @Out int[] channels_in_file, int desired_channels) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var _x = Marshal.marshal(stack, x);
            var _y = Marshal.marshal(stack, y);
            var _channels_in_file = Marshal.marshal(stack, channels_in_file);
            MemorySegment result = stbi_load_from_memory(buffer, _x, _y, _channels_in_file, desired_channels);
            Unmarshal.copy(_x, x);
            Unmarshal.copy(_y, y);
            Unmarshal.copy(_channels_in_file, channels_in_file);
            return result;
        }
    }

    /// Overloads [stbi_load_gif_from_memory][#stbi_load_gif_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment, int)]
    public static MemorySegment stbi_load_gif_from_memory(MemorySegment buffer, @Out MemorySegment delays, @Out MemorySegment x, @Out MemorySegment y, @Out MemorySegment z, @Out MemorySegment comp, int req_comp) {
        return stbi_load_gif_from_memory(buffer, Math.toIntExact(buffer.byteSize()), delays, x, y, z, comp, req_comp);
    }

    /// Overloads [stbi_load_gif_from_memory][#stbi_load_gif_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment, MemorySegment, MemorySegment, int)]
    public static MemorySegment stbi_load_gif_from_memory(MemorySegment buffer, @Out int[][] delays, @Out int[] x, @Out int[] y, @Out int[] z, @Out int[] comp, int req_comp) {
        try (Arena arena = Arena.ofConfined(); MemoryStack stack = MemoryStack.pushLocal()) {
            var _delays = delays == null ? MemorySegment.NULL : arena.allocate(ValueLayout.ADDRESS);
            var _x = Marshal.marshal(stack, x);
            var _y = Marshal.marshal(stack, y);
            var _z = Marshal.marshal(stack, z);
            var _comp = Marshal.marshal(stack, comp);
            MemorySegment result = stbi_load_gif_from_memory(buffer, _delays, _x, _y, _z, _comp, req_comp);
            Unmarshal.copy(_x, x);
            Unmarshal.copy(_y, y);
            Unmarshal.copy(_z, z);
            Unmarshal.copy(_comp, comp);
            if (delays != null) {
                MemorySegment ret_delays = Unmarshal.unmarshalPointer(
                    ValueLayout.ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(
                        _z.get(ValueLayout.JAVA_INT, 0),
                        ValueLayout.JAVA_INT
                    )), _delays
                );
                delays[0] = Unmarshal.unmarshalAsIntArray(ret_delays);
            }
            return result;
        }
    }

    /// Overloads [stbi_load_16_from_memory][#stbi_load_16_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment, int)]
    public static MemorySegment stbi_load_16_from_memory(MemorySegment buffer, @Out MemorySegment x, @Out MemorySegment y, @Out MemorySegment channels_in_file, int desired_channels) {
        return stbi_load_16_from_memory(buffer, Math.toIntExact(buffer.byteSize()), x, y, channels_in_file, desired_channels);
    }

    /// Overloads [stbi_load_16_from_memory][#stbi_load_16_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment, int)]
    public static MemorySegment stbi_load_16_from_memory(MemorySegment buffer, @Out int[] x, @Out int[] y, @Out int[] channels_in_file, int desired_channels) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var _x = Marshal.marshal(stack, x);
            var _y = Marshal.marshal(stack, y);
            var _channels_in_file = Marshal.marshal(stack, channels_in_file);
            MemorySegment result = stbi_load_16_from_memory(buffer, _x, _y, _channels_in_file, desired_channels);
            Unmarshal.copy(_x, x);
            Unmarshal.copy(_y, y);
            Unmarshal.copy(_channels_in_file, channels_in_file);
            return result;
        }
    }

    /// Overloads [stbi_loadf_from_memory][#stbi_loadf_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment, int)]
    public static MemorySegment stbi_loadf_from_memory(MemorySegment buffer, @Out MemorySegment x, @Out MemorySegment y, @Out MemorySegment channels_in_file, int desired_channels) {
        return stbi_loadf_from_memory(buffer, Math.toIntExact(buffer.byteSize()), x, y, channels_in_file, desired_channels);
    }

    /// Overloads [stbi_loadf_from_memory][#stbi_loadf_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment, int)]
    public static MemorySegment stbi_loadf_from_memory(MemorySegment buffer, @Out int[] x, @Out int[] y, @Out int[] channels_in_file, int desired_channels) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var _x = Marshal.marshal(stack, x);
            var _y = Marshal.marshal(stack, y);
            var _channels_in_file = Marshal.marshal(stack, channels_in_file);
            MemorySegment result = stbi_loadf_from_memory(buffer, _x, _y, _channels_in_file, desired_channels);
            Unmarshal.copy(_x, x);
            Unmarshal.copy(_y, y);
            Unmarshal.copy(_channels_in_file, channels_in_file);
            return result;
        }
    }

    /// Overloads [stbi_is_hdr_from_memory][#stbi_is_hdr_from_memory(MemorySegment, int)]
    public static boolean stbi_is_hdr_from_memory(MemorySegment buffer) {
        return stbi_is_hdr_from_memory(buffer, Math.toIntExact(buffer.byteSize()));
    }

    /// Overloads [stbi_info_from_memory][#stbi_info_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment)]
    public static boolean stbi_info_from_memory(MemorySegment buffer, @Out MemorySegment x, @Out MemorySegment y, @Out MemorySegment comp) {
        return stbi_info_from_memory(buffer, Math.toIntExact(buffer.byteSize()), x, y, comp);
    }

    /// Overloads [stbi_info_from_memory][#stbi_info_from_memory(MemorySegment, int, MemorySegment, MemorySegment, MemorySegment)]
    public static boolean stbi_info_from_memory(MemorySegment buffer, @Out int[] x, @Out int[] y, @Out int[] comp) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var _x = Marshal.marshal(stack, x);
            var _y = Marshal.marshal(stack, y);
            var _comp = Marshal.marshal(stack, comp);
            boolean result = stbi_info_from_memory(buffer, _x, _y, _comp);
            Unmarshal.copy(_x, x);
            Unmarshal.copy(_y, y);
            Unmarshal.copy(_comp, comp);
            return result;
        }
    }

    /// Overloads [stbi_is_16_bit_from_memory][#stbi_is_16_bit_from_memory(MemorySegment, int)]
    public static boolean stbi_is_16_bit_from_memory(MemorySegment buffer) {
        return stbi_is_16_bit_from_memory(buffer, Math.toIntExact(buffer.byteSize()));
    }
}
