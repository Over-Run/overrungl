/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import io.github.overrun.memstack.MemoryStack;
import overrun.marshal.gen.*;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.Unmarshal;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

/**
 * The STB image reader.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBImage {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    ///only used for desired_channels
    public static final int STBI_default = 0;
    public static final int STBI_grey = 1;
    public static final int STBI_grey_alpha = 2;
    public static final int STBI_rgb = 3;
    public static final int STBI_rgb_alpha = 4;
    //region Method handles
    /// The method handle of `stbi_load_from_memory`.
    public static final MethodHandle MH_stbi_load_from_memory = RuntimeHelper.downcall(Handles.lookup, "stbi_load_from_memory", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_load_from_callbacks`.
    public static final MethodHandle MH_stbi_load_from_callbacks = RuntimeHelper.downcall(Handles.lookup, "stbi_load_from_callbacks", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_load`.
    public static final MethodHandle MH_stbi_load = RuntimeHelper.downcall(Handles.lookup, "stbi_load", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_load_gif_from_memory`.
    public static final MethodHandle MH_stbi_load_gif_from_memory = RuntimeHelper.downcall(Handles.lookup, "stbi_load_gif_from_memory", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_load_16_from_memory`.
    public static final MethodHandle MH_stbi_load_16_from_memory = RuntimeHelper.downcall(Handles.lookup, "stbi_load_16_from_memory", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_load_16_from_callbacks`.
    public static final MethodHandle MH_stbi_load_16_from_callbacks = RuntimeHelper.downcall(Handles.lookup, "stbi_load_16_from_callbacks", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_load_16`.
    public static final MethodHandle MH_stbi_load_16 = RuntimeHelper.downcall(Handles.lookup, "stbi_load_16", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_loadf_from_memory`.
    public static final MethodHandle MH_stbi_loadf_from_memory = RuntimeHelper.downcall(Handles.lookup, "stbi_loadf_from_memory", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_loadf_from_callbacks`.
    public static final MethodHandle MH_stbi_loadf_from_callbacks = RuntimeHelper.downcall(Handles.lookup, "stbi_loadf_from_callbacks", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_loadf`.
    public static final MethodHandle MH_stbi_loadf = RuntimeHelper.downcall(Handles.lookup, "stbi_loadf", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_hdr_to_ldr_gamma`.
    public static final MethodHandle MH_stbi_hdr_to_ldr_gamma = RuntimeHelper.downcall(Handles.lookup, "stbi_hdr_to_ldr_gamma", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    /// The method handle of `stbi_hdr_to_ldr_scale`.
    public static final MethodHandle MH_stbi_hdr_to_ldr_scale = RuntimeHelper.downcall(Handles.lookup, "stbi_hdr_to_ldr_scale", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    /// The method handle of `stbi_ldr_to_hdr_gamma`.
    public static final MethodHandle MH_stbi_ldr_to_hdr_gamma = RuntimeHelper.downcall(Handles.lookup, "stbi_ldr_to_hdr_gamma", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    /// The method handle of `stbi_ldr_to_hdr_scale`.
    public static final MethodHandle MH_stbi_ldr_to_hdr_scale = RuntimeHelper.downcall(Handles.lookup, "stbi_ldr_to_hdr_scale", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    /// The method handle of `stbi_is_hdr_from_callbacks`.
    public static final MethodHandle MH_stbi_is_hdr_from_callbacks = RuntimeHelper.downcall(Handles.lookup, "stbi_is_hdr_from_callbacks", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS));
    /// The method handle of `stbi_is_hdr_from_memory`.
    public static final MethodHandle MH_stbi_is_hdr_from_memory = RuntimeHelper.downcall(Handles.lookup, "stbi_is_hdr_from_memory", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_is_hdr`.
    public static final MethodHandle MH_stbi_is_hdr = RuntimeHelper.downcall(Handles.lookup, "stbi_is_hdr", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT));
    /// The method handle of `stbi_failure_reason`.
    public static final MethodHandle MH_stbi_failure_reason = RuntimeHelper.downcall(Handles.lookup, "stbi_failure_reason", FunctionDescriptor.of(Unmarshal.STR_LAYOUT));
    /// The method handle of `stbi_image_free`.
    public static final MethodHandle MH_stbi_image_free = RuntimeHelper.downcall(Handles.lookup, "stbi_image_free", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `stbi_info_from_memory`.
    public static final MethodHandle MH_stbi_info_from_memory = RuntimeHelper.downcall(Handles.lookup, "stbi_info_from_memory", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stbi_info_from_callbacks`.
    public static final MethodHandle MH_stbi_info_from_callbacks = RuntimeHelper.downcall(Handles.lookup, "stbi_info_from_callbacks", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stbi_is_16_bit_from_memory`.
    public static final MethodHandle MH_stbi_is_16_bit_from_memory = RuntimeHelper.downcall(Handles.lookup, "stbi_is_16_bit_from_memory", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_is_16_bit_from_callbacks`.
    public static final MethodHandle MH_stbi_is_16_bit_from_callbacks = RuntimeHelper.downcall(Handles.lookup, "stbi_is_16_bit_from_callbacks", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBIIOCallbacks.LAYOUT), ValueLayout.ADDRESS));
    /// The method handle of `stbi_info`.
    public static final MethodHandle MH_stbi_info = RuntimeHelper.downcall(Handles.lookup, "stbi_info", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stbi_is_16_bit`.
    public static final MethodHandle MH_stbi_is_16_bit = RuntimeHelper.downcall(Handles.lookup, "stbi_is_16_bit", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT));
    /// The method handle of `stbi_set_unpremultiply_on_load`.
    public static final MethodHandle MH_stbi_set_unpremultiply_on_load = RuntimeHelper.downcall(Handles.lookup, "stbi_set_unpremultiply_on_load", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));
    /// The method handle of `stbi_convert_iphone_png_to_rgb`.
    public static final MethodHandle MH_stbi_convert_iphone_png_to_rgb = RuntimeHelper.downcall(Handles.lookup, "stbi_convert_iphone_png_to_rgb", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));
    /// The method handle of `stbi_set_flip_vertically_on_load`.
    public static final MethodHandle MH_stbi_set_flip_vertically_on_load = RuntimeHelper.downcall(Handles.lookup, "stbi_set_flip_vertically_on_load", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));
    /// The method handle of `stbi_zlib_decode_malloc_guesssize`.
    public static final MethodHandle MH_stbi_zlib_decode_malloc_guesssize = RuntimeHelper.downcall(Handles.lookup, "stbi_zlib_decode_malloc_guesssize", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `stbi_zlib_decode_malloc_guesssize_headerflag`.
    public static final MethodHandle MH_stbi_zlib_decode_malloc_guesssize_headerflag = RuntimeHelper.downcall(Handles.lookup, "stbi_zlib_decode_malloc_guesssize_headerflag", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_zlib_decode_malloc`.
    public static final MethodHandle MH_stbi_zlib_decode_malloc = RuntimeHelper.downcall(Handles.lookup, "stbi_zlib_decode_malloc", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `stbi_zlib_decode_buffer`.
    public static final MethodHandle MH_stbi_zlib_decode_buffer = RuntimeHelper.downcall(Handles.lookup, "stbi_zlib_decode_buffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
    /// The method handle of `stbi_zlib_decode_noheader_malloc`.
    public static final MethodHandle MH_stbi_zlib_decode_noheader_malloc = RuntimeHelper.downcall(Handles.lookup, "stbi_zlib_decode_noheader_malloc", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    /// The method handle of `stbi_zlib_decode_noheader_buffer`.
    public static final MethodHandle MH_stbi_zlib_decode_noheader_buffer = RuntimeHelper.downcall(Handles.lookup, "stbi_zlib_decode_noheader_buffer", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
    //endregion

    public static @CType("stbi_uc*") java.lang.foreign.MemorySegment stbi_load_from_memory(@CType("stbi_uc const *") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_load_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_memory", e); }
    }
    public static @CType("stbi_uc*") java.lang.foreign.MemorySegment stbi_load_from_callbacks(@CType("stbi_io_callbacks const *") java.lang.foreign.MemorySegment clbk, @CType("void*") java.lang.foreign.MemorySegment user, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_load_from_callbacks.invokeExact(clbk, user, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_callbacks", e); }
    }
    public static @CType("stbi_uc*") java.lang.foreign.MemorySegment stbi_load_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") java.lang.foreign.MemorySegment user, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stbi_load_from_callbacks.invokeExact(Marshal.marshal(clbk), user, __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_from_callbacks", e); }
    }
    public static @CType("stbi_uc*") java.lang.foreign.MemorySegment stbi_load(@CType("const char*") java.lang.foreign.MemorySegment filename, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_load.invokeExact(filename, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load", e); }
    }
    public static @CType("stbi_uc*") java.lang.foreign.MemorySegment stbi_load(@CType("const char*") java.lang.String filename, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stbi_load.invokeExact(Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load", e); }
    }
    public static @CType("stbi_uc*") java.lang.foreign.MemorySegment stbi_load_gif_from_memory(@CType("stbi_uc const *") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @Out @CType("int**") java.lang.foreign.MemorySegment delays, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment z, @Out @CType("int*") java.lang.foreign.MemorySegment comp, @CType("int") int req_comp) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_load_gif_from_memory.invokeExact(buffer, len, delays, x, y, z, comp, req_comp);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_gif_from_memory", e); }
    }
    public static @CType("stbi_us*") java.lang.foreign.MemorySegment stbi_load_16_from_memory(@CType("stbi_uc const *") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_load_16_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16_from_memory", e); }
    }
    public static @CType("stbi_us*") java.lang.foreign.MemorySegment stbi_load_16_from_callbacks(@CType("stbi_io_callbacks const *") java.lang.foreign.MemorySegment clbk, @CType("void*") java.lang.foreign.MemorySegment user, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_load_16_from_callbacks.invokeExact(clbk, user, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16_from_callbacks", e); }
    }
    public static @CType("stbi_us*") java.lang.foreign.MemorySegment stbi_load_16_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") java.lang.foreign.MemorySegment user, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stbi_load_16_from_callbacks.invokeExact(Marshal.marshal(clbk), user, __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16_from_callbacks", e); }
    }
    public static @CType("stbi_us*") java.lang.foreign.MemorySegment stbi_load_16(@CType("const char*") java.lang.foreign.MemorySegment filename, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_load_16.invokeExact(filename, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16", e); }
    }
    public static @CType("stbi_us*") java.lang.foreign.MemorySegment stbi_load_16(@CType("const char*") java.lang.String filename, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stbi_load_16.invokeExact(Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_load_16", e); }
    }
    public static @CType("float*") java.lang.foreign.MemorySegment stbi_loadf_from_memory(@CType("stbi_uc const *") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_loadf_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_memory", e); }
    }
    public static @CType("float*") java.lang.foreign.MemorySegment stbi_loadf_from_callbacks(@CType("stbi_io_callbacks const *") java.lang.foreign.MemorySegment clbk, @CType("void*") java.lang.foreign.MemorySegment user, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_loadf_from_callbacks.invokeExact(clbk, user, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_callbacks", e); }
    }
    public static @CType("float*") java.lang.foreign.MemorySegment stbi_loadf_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") java.lang.foreign.MemorySegment user, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stbi_loadf_from_callbacks.invokeExact(Marshal.marshal(clbk), user, __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf_from_callbacks", e); }
    }
    public static @CType("float*") java.lang.foreign.MemorySegment stbi_loadf(@CType("const char*") java.lang.foreign.MemorySegment filename, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment channels_in_file, @CType("int") int desired_channels) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_loadf.invokeExact(filename, x, y, channels_in_file, desired_channels);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf", e); }
    }
    public static @CType("float*") java.lang.foreign.MemorySegment stbi_loadf(@CType("const char*") java.lang.String filename, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] channels_in_file, @CType("int") int desired_channels) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_channels_in_file = Marshal.marshal(__overrungl_stack, channels_in_file);
            var __overrungl_result = (java.lang.foreign.MemorySegment) MH_stbi_loadf.invokeExact(Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_channels_in_file, desired_channels);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_channels_in_file, channels_in_file);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_loadf", e); }
    }
    public static void stbi_hdr_to_ldr_gamma(@CType("float") float gamma) {
        try {
            MH_stbi_hdr_to_ldr_gamma.invokeExact(gamma);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_hdr_to_ldr_gamma", e); }
    }
    public static void stbi_hdr_to_ldr_scale(@CType("float") float scale) {
        try {
            MH_stbi_hdr_to_ldr_scale.invokeExact(scale);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_hdr_to_ldr_scale", e); }
    }
    public static void stbi_ldr_to_hdr_gamma(@CType("float") float gamma) {
        try {
            MH_stbi_ldr_to_hdr_gamma.invokeExact(gamma);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_ldr_to_hdr_gamma", e); }
    }
    public static void stbi_ldr_to_hdr_scale(@CType("float") float scale) {
        try {
            MH_stbi_ldr_to_hdr_scale.invokeExact(scale);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_ldr_to_hdr_scale", e); }
    }
    public static @CType("int") boolean stbi_is_hdr_from_callbacks(@CType("stbi_io_callbacks const *") java.lang.foreign.MemorySegment clbk, @CType("void*") java.lang.foreign.MemorySegment user) {
        try {
            return (boolean) MH_stbi_is_hdr_from_callbacks.invokeExact(clbk, user);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_callbacks", e); }
    }
    public static @CType("int") boolean stbi_is_hdr_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") java.lang.foreign.MemorySegment user) {
        try {
            return (boolean) MH_stbi_is_hdr_from_callbacks.invokeExact(Marshal.marshal(clbk), user);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_callbacks", e); }
    }
    public static @CType("int") boolean stbi_is_hdr_from_memory(@CType("stbi_uc const *") java.lang.foreign.MemorySegment buffer, @CType("int") int len) {
        try {
            return (boolean) MH_stbi_is_hdr_from_memory.invokeExact(buffer, len);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr_from_memory", e); }
    }
    public static @CType("int") boolean stbi_is_hdr(@CType("const char*") java.lang.foreign.MemorySegment filename) {
        try {
            return (boolean) MH_stbi_is_hdr.invokeExact(filename);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr", e); }
    }
    public static @CType("int") boolean stbi_is_hdr(@CType("const char*") java.lang.String filename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) MH_stbi_is_hdr.invokeExact(Marshal.marshal(__overrungl_stack, filename));
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_hdr", e); }
    }
    ///get a VERY brief reason for failure
    ///
    ///on most compilers (and ALL modern mainstream compilers) this is threadsafe
    public static @CType("const char*") java.lang.foreign.MemorySegment stbi_failure_reason_() {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_failure_reason.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in stbi_failure_reason", e); }
    }
    ///get a VERY brief reason for failure
    ///
    ///on most compilers (and ALL modern mainstream compilers) this is threadsafe
    public static @CType("const char*") java.lang.String stbi_failure_reason() {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) MH_stbi_failure_reason.invokeExact());
        } catch (Throwable e) { throw new RuntimeException("error in stbi_failure_reason", e); }
    }
    ///free the loaded image -- this is just free()
    public static void stbi_image_free(@CType("void*") java.lang.foreign.MemorySegment retval_from_stbi_load) {
        try {
            MH_stbi_image_free.invokeExact(retval_from_stbi_load);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_image_free", e); }
    }
    public static @CType("int") boolean stbi_info_from_memory(@CType("stbi_uc const *") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment comp) {
        try {
            return (boolean) MH_stbi_info_from_memory.invokeExact(buffer, len, x, y, comp);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_memory", e); }
    }
    public static @CType("int") boolean stbi_info_from_callbacks(@CType("stbi_io_callbacks const *") java.lang.foreign.MemorySegment clbk, @CType("void*") java.lang.foreign.MemorySegment user, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment comp) {
        try {
            return (boolean) MH_stbi_info_from_callbacks.invokeExact(clbk, user, x, y, comp);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_callbacks", e); }
    }
    public static @CType("int") boolean stbi_info_from_callbacks(@CType("stbi_io_callbacks const *") overrungl.stb.STBIIOCallbacks clbk, @CType("void*") java.lang.foreign.MemorySegment user, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] comp) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_comp = Marshal.marshal(__overrungl_stack, comp);
            var __overrungl_result = (boolean) MH_stbi_info_from_callbacks.invokeExact(Marshal.marshal(clbk), user, __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_comp);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_comp, comp);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info_from_callbacks", e); }
    }
    public static @CType("int") boolean stbi_is_16_bit_from_memory(@CType("stbi_uc const *") java.lang.foreign.MemorySegment buffer, @CType("int") int len) {
        try {
            return (boolean) MH_stbi_is_16_bit_from_memory.invokeExact(buffer, len);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit_from_memory", e); }
    }
    public static @CType("int") boolean stbi_is_16_bit_from_callbacks(@CType("stbi_io_callbacks const *") java.lang.foreign.MemorySegment clbk, @CType("void*") java.lang.foreign.MemorySegment user) {
        try {
            return (boolean) MH_stbi_is_16_bit_from_callbacks.invokeExact(clbk, user);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit_from_callbacks", e); }
    }
    public static @CType("int") boolean stbi_info(@CType("const char*") java.lang.foreign.MemorySegment filename, @Out @CType("int*") java.lang.foreign.MemorySegment x, @Out @CType("int*") java.lang.foreign.MemorySegment y, @Out @CType("int*") java.lang.foreign.MemorySegment comp) {
        try {
            return (boolean) MH_stbi_info.invokeExact(filename, x, y, comp);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info", e); }
    }
    public static @CType("int") boolean stbi_info(@CType("const char*") java.lang.String filename, @Out @CType("int*") int[] x, @Out @CType("int*") int[] y, @Out @CType("int*") int[] comp) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_x = Marshal.marshal(__overrungl_stack, x);
            var __overrungl_ref_y = Marshal.marshal(__overrungl_stack, y);
            var __overrungl_ref_comp = Marshal.marshal(__overrungl_stack, comp);
            var __overrungl_result = (boolean) MH_stbi_info.invokeExact(Marshal.marshal(__overrungl_stack, filename), __overrungl_ref_x, __overrungl_ref_y, __overrungl_ref_comp);
            Unmarshal.copy(__overrungl_ref_x, x);
            Unmarshal.copy(__overrungl_ref_y, y);
            Unmarshal.copy(__overrungl_ref_comp, comp);
            return __overrungl_result;
        } catch (Throwable e) { throw new RuntimeException("error in stbi_info", e); }
    }
    public static @CType("int") boolean stbi_is_16_bit(@CType("const char*") java.lang.foreign.MemorySegment filename) {
        try {
            return (boolean) MH_stbi_is_16_bit.invokeExact(filename);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit", e); }
    }
    public static @CType("int") boolean stbi_is_16_bit(@CType("const char*") java.lang.String filename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) MH_stbi_is_16_bit.invokeExact(Marshal.marshal(__overrungl_stack, filename));
        } catch (Throwable e) { throw new RuntimeException("error in stbi_is_16_bit", e); }
    }
    ///for image formats that explicitly notate that they have premultiplied alpha,
    ///we just return the colors as stored in the file. set this flag to force
    ///unpremultiplication. results are undefined if the unpremultiply overflow.
    public static void stbi_set_unpremultiply_on_load(@CType("int") boolean flag_true_if_should_unpremultiply) {
        try {
            MH_stbi_set_unpremultiply_on_load.invokeExact(flag_true_if_should_unpremultiply);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_set_unpremultiply_on_load", e); }
    }
    ///indicate whether we should process iphone images back to canonical format,
    ///or just pass them through "as-is"
    public static void stbi_convert_iphone_png_to_rgb(@CType("int") boolean flag_true_if_should_convert) {
        try {
            MH_stbi_convert_iphone_png_to_rgb.invokeExact(flag_true_if_should_convert);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_convert_iphone_png_to_rgb", e); }
    }
    ///flip the image vertically, so the first pixel in the output array is the bottom left
    public static void stbi_set_flip_vertically_on_load(@CType("int") boolean flag_true_if_should_flip) {
        try {
            MH_stbi_set_flip_vertically_on_load.invokeExact(flag_true_if_should_flip);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_set_flip_vertically_on_load", e); }
    }
    public static void stbi_set_unpremultiply_on_load_thread(@CType("int") boolean flag_true_if_should_unpremultiply) {
        try {
            MH_stbi_set_unpremultiply_on_load.invokeExact(flag_true_if_should_unpremultiply);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_set_unpremultiply_on_load", e); }
    }
    public static void stbi_convert_iphone_png_to_rgb_thread(@CType("int") boolean flag_true_if_should_convert) {
        try {
            MH_stbi_convert_iphone_png_to_rgb.invokeExact(flag_true_if_should_convert);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_convert_iphone_png_to_rgb", e); }
    }
    public static void stbi_set_flip_vertically_on_load_thread(@CType("int") boolean flag_true_if_should_flip) {
        try {
            MH_stbi_set_flip_vertically_on_load.invokeExact(flag_true_if_should_flip);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_set_flip_vertically_on_load", e); }
    }
    public static @CType("char*") java.lang.foreign.MemorySegment stbi_zlib_decode_malloc_guesssize(@CType("const char*") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @CType("int") int initial_size, @Out @CType("int*") java.lang.foreign.MemorySegment outlen) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_zlib_decode_malloc_guesssize.invokeExact(buffer, len, initial_size, outlen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc_guesssize", e); }
    }
    public static @CType("char*") java.lang.foreign.MemorySegment stbi_zlib_decode_malloc_guesssize_headerflag(@CType("const char*") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @CType("int") int initial_size, @Out @CType("int*") java.lang.foreign.MemorySegment outlen, @CType("int") int parse_header) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_zlib_decode_malloc_guesssize_headerflag.invokeExact(buffer, len, initial_size, outlen, parse_header);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc_guesssize_headerflag", e); }
    }
    public static @CType("char*") java.lang.foreign.MemorySegment stbi_zlib_decode_malloc(@CType("const char*") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @Out @CType("int*") java.lang.foreign.MemorySegment outlen) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_zlib_decode_malloc.invokeExact(buffer, len, outlen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_malloc", e); }
    }
    public static @CType("int") int stbi_zlib_decode_buffer(@CType("char*") java.lang.foreign.MemorySegment obuffer, @CType("int") int olen, @CType("const char*") java.lang.foreign.MemorySegment ibuffer, @CType("int") int ilen) {
        try {
            return (int) MH_stbi_zlib_decode_buffer.invokeExact(obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_buffer", e); }
    }
    public static @CType("char*") java.lang.foreign.MemorySegment stbi_zlib_decode_noheader_malloc(@CType("const char*") java.lang.foreign.MemorySegment buffer, @CType("int") int len, @CType("int*") java.lang.foreign.MemorySegment outlen) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbi_zlib_decode_noheader_malloc.invokeExact(buffer, len, outlen);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_zlib_decode_noheader_malloc", e); }
    }
    public static @CType("int") int stbi_zlib_decode_noheader_buffer(@CType("char*") java.lang.foreign.MemorySegment obuffer, @CType("int") int olen, @CType("const char*") java.lang.foreign.MemorySegment ibuffer, @CType("int") int ilen) {
        try {
            return (int) MH_stbi_zlib_decode_noheader_buffer.invokeExact(obuffer, olen, ibuffer, ilen);
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
