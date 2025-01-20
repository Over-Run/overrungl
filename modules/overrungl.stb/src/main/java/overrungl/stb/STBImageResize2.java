/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/// [stb_image_resize2.h](https://github.com/nothings/stb/blob/master/stb_image_resize2.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBImageResize2 {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int
        STBIR_1CHANNEL = 1,
        STBIR_2CHANNEL = 2,
        STBIR_RGB = 3,
        STBIR_BGR = 0,
        STBIR_4CHANNEL = 5,
        STBIR_RGBA = 4,
        STBIR_BGRA = 6,
        STBIR_ARGB = 7,
        STBIR_ABGR = 8,
        STBIR_RA = 9,
        STBIR_AR = 10,
        STBIR_RGBA_PM = 11,
        STBIR_BGRA_PM = 12,
        STBIR_ARGB_PM = 13,
        STBIR_ABGR_PM = 14,
        STBIR_RA_PM = 15,
        STBIR_AR_PM = 16,
        STBIR_RGBA_NO_AW = 11,
        STBIR_BGRA_NO_AW = 12,
        STBIR_ARGB_NO_AW = 13,
        STBIR_ABGR_NO_AW = 14,
        STBIR_RA_NO_AW = 15,
        STBIR_AR_NO_AW = 16;
    public static final int
        STBIR_EDGE_CLAMP = 0,
        STBIR_EDGE_REFLECT = 1,
        STBIR_EDGE_WRAP = 2,
        STBIR_EDGE_ZERO = 3;
    public static final int
        STBIR_FILTER_DEFAULT = 0,
        STBIR_FILTER_BOX = 1,
        STBIR_FILTER_TRIANGLE = 2,
        STBIR_FILTER_CUBICBSPLINE = 3,
        STBIR_FILTER_CATMULLROM = 4,
        STBIR_FILTER_MITCHELL = 5,
        STBIR_FILTER_POINT_SAMPLE = 6,
        STBIR_FILTER_OTHER = 7;
    public static final int
        STBIR_TYPE_UINT8 = 0,
        STBIR_TYPE_UINT8_SRGB = 1,
        STBIR_TYPE_UINT8_SRGB_ALPHA = 2,
        STBIR_TYPE_UINT16 = 3,
        STBIR_TYPE_FLOAT = 4,
        STBIR_TYPE_HALF_FLOAT = 5;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `stbir_resize_uint8_srgb`.
        public static final FunctionDescriptor FD_stbir_resize_uint8_srgb = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_resize`.
        public static final FunctionDescriptor FD_stbir_resize = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_resize_init`.
        public static final FunctionDescriptor FD_stbir_resize_init = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_set_datatypes`.
        public static final FunctionDescriptor FD_stbir_set_datatypes = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_set_pixel_callbacks`.
        public static final FunctionDescriptor FD_stbir_set_pixel_callbacks = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `stbir_set_user_data`.
        public static final FunctionDescriptor FD_stbir_set_user_data = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `stbir_set_buffer_ptrs`.
        public static final FunctionDescriptor FD_stbir_set_buffer_ptrs = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_set_pixel_layouts`.
        public static final FunctionDescriptor FD_stbir_set_pixel_layouts = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_set_edgemodes`.
        public static final FunctionDescriptor FD_stbir_set_edgemodes = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_set_filters`.
        public static final FunctionDescriptor FD_stbir_set_filters = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_set_filter_callbacks`.
        public static final FunctionDescriptor FD_stbir_set_filter_callbacks = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `stbir_set_pixel_subrect`.
        public static final FunctionDescriptor FD_stbir_set_pixel_subrect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_set_input_subrect`.
        public static final FunctionDescriptor FD_stbir_set_input_subrect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        /// The function descriptor of `stbir_set_output_pixel_subrect`.
        public static final FunctionDescriptor FD_stbir_set_output_pixel_subrect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_set_non_pm_alpha_speed_over_quality`.
        public static final FunctionDescriptor FD_stbir_set_non_pm_alpha_speed_over_quality = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_build_samplers`.
        public static final FunctionDescriptor FD_stbir_build_samplers = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        /// The function descriptor of `stbir_free_samplers`.
        public static final FunctionDescriptor FD_stbir_free_samplers = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// The function descriptor of `stbir_resize_extended`.
        public static final FunctionDescriptor FD_stbir_resize_extended = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        /// The function descriptor of `stbir_build_samplers_with_splits`.
        public static final FunctionDescriptor FD_stbir_build_samplers_with_splits = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbir_resize_extended_splits`.
        public static final FunctionDescriptor FD_stbir_resize_extended_splits = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbir_resize_uint8_srgb`.
        public static final MethodHandle MH_stbir_resize_uint8_srgb = RuntimeHelper.downcall(Descriptors.FD_stbir_resize_uint8_srgb);
        /// The method handle of `stbir_resize`.
        public static final MethodHandle MH_stbir_resize = RuntimeHelper.downcall(Descriptors.FD_stbir_resize);
        /// The method handle of `stbir_resize_init`.
        public static final MethodHandle MH_stbir_resize_init = RuntimeHelper.downcall(Descriptors.FD_stbir_resize_init);
        /// The method handle of `stbir_set_datatypes`.
        public static final MethodHandle MH_stbir_set_datatypes = RuntimeHelper.downcall(Descriptors.FD_stbir_set_datatypes);
        /// The method handle of `stbir_set_pixel_callbacks`.
        public static final MethodHandle MH_stbir_set_pixel_callbacks = RuntimeHelper.downcall(Descriptors.FD_stbir_set_pixel_callbacks);
        /// The method handle of `stbir_set_user_data`.
        public static final MethodHandle MH_stbir_set_user_data = RuntimeHelper.downcall(Descriptors.FD_stbir_set_user_data);
        /// The method handle of `stbir_set_buffer_ptrs`.
        public static final MethodHandle MH_stbir_set_buffer_ptrs = RuntimeHelper.downcall(Descriptors.FD_stbir_set_buffer_ptrs);
        /// The method handle of `stbir_set_pixel_layouts`.
        public static final MethodHandle MH_stbir_set_pixel_layouts = RuntimeHelper.downcall(Descriptors.FD_stbir_set_pixel_layouts);
        /// The method handle of `stbir_set_edgemodes`.
        public static final MethodHandle MH_stbir_set_edgemodes = RuntimeHelper.downcall(Descriptors.FD_stbir_set_edgemodes);
        /// The method handle of `stbir_set_filters`.
        public static final MethodHandle MH_stbir_set_filters = RuntimeHelper.downcall(Descriptors.FD_stbir_set_filters);
        /// The method handle of `stbir_set_filter_callbacks`.
        public static final MethodHandle MH_stbir_set_filter_callbacks = RuntimeHelper.downcall(Descriptors.FD_stbir_set_filter_callbacks);
        /// The method handle of `stbir_set_pixel_subrect`.
        public static final MethodHandle MH_stbir_set_pixel_subrect = RuntimeHelper.downcall(Descriptors.FD_stbir_set_pixel_subrect);
        /// The method handle of `stbir_set_input_subrect`.
        public static final MethodHandle MH_stbir_set_input_subrect = RuntimeHelper.downcall(Descriptors.FD_stbir_set_input_subrect);
        /// The method handle of `stbir_set_output_pixel_subrect`.
        public static final MethodHandle MH_stbir_set_output_pixel_subrect = RuntimeHelper.downcall(Descriptors.FD_stbir_set_output_pixel_subrect);
        /// The method handle of `stbir_set_non_pm_alpha_speed_over_quality`.
        public static final MethodHandle MH_stbir_set_non_pm_alpha_speed_over_quality = RuntimeHelper.downcall(Descriptors.FD_stbir_set_non_pm_alpha_speed_over_quality);
        /// The method handle of `stbir_build_samplers`.
        public static final MethodHandle MH_stbir_build_samplers = RuntimeHelper.downcall(Descriptors.FD_stbir_build_samplers);
        /// The method handle of `stbir_free_samplers`.
        public static final MethodHandle MH_stbir_free_samplers = RuntimeHelper.downcall(Descriptors.FD_stbir_free_samplers);
        /// The method handle of `stbir_resize_extended`.
        public static final MethodHandle MH_stbir_resize_extended = RuntimeHelper.downcall(Descriptors.FD_stbir_resize_extended);
        /// The method handle of `stbir_build_samplers_with_splits`.
        public static final MethodHandle MH_stbir_build_samplers_with_splits = RuntimeHelper.downcall(Descriptors.FD_stbir_build_samplers_with_splits);
        /// The method handle of `stbir_resize_extended_splits`.
        public static final MethodHandle MH_stbir_resize_extended_splits = RuntimeHelper.downcall(Descriptors.FD_stbir_resize_extended_splits);
        /// The function address of `stbir_resize_uint8_srgb`.
        public final MemorySegment PFN_stbir_resize_uint8_srgb;
        /// The function address of `stbir_resize`.
        public final MemorySegment PFN_stbir_resize;
        /// The function address of `stbir_resize_init`.
        public final MemorySegment PFN_stbir_resize_init;
        /// The function address of `stbir_set_datatypes`.
        public final MemorySegment PFN_stbir_set_datatypes;
        /// The function address of `stbir_set_pixel_callbacks`.
        public final MemorySegment PFN_stbir_set_pixel_callbacks;
        /// The function address of `stbir_set_user_data`.
        public final MemorySegment PFN_stbir_set_user_data;
        /// The function address of `stbir_set_buffer_ptrs`.
        public final MemorySegment PFN_stbir_set_buffer_ptrs;
        /// The function address of `stbir_set_pixel_layouts`.
        public final MemorySegment PFN_stbir_set_pixel_layouts;
        /// The function address of `stbir_set_edgemodes`.
        public final MemorySegment PFN_stbir_set_edgemodes;
        /// The function address of `stbir_set_filters`.
        public final MemorySegment PFN_stbir_set_filters;
        /// The function address of `stbir_set_filter_callbacks`.
        public final MemorySegment PFN_stbir_set_filter_callbacks;
        /// The function address of `stbir_set_pixel_subrect`.
        public final MemorySegment PFN_stbir_set_pixel_subrect;
        /// The function address of `stbir_set_input_subrect`.
        public final MemorySegment PFN_stbir_set_input_subrect;
        /// The function address of `stbir_set_output_pixel_subrect`.
        public final MemorySegment PFN_stbir_set_output_pixel_subrect;
        /// The function address of `stbir_set_non_pm_alpha_speed_over_quality`.
        public final MemorySegment PFN_stbir_set_non_pm_alpha_speed_over_quality;
        /// The function address of `stbir_build_samplers`.
        public final MemorySegment PFN_stbir_build_samplers;
        /// The function address of `stbir_free_samplers`.
        public final MemorySegment PFN_stbir_free_samplers;
        /// The function address of `stbir_resize_extended`.
        public final MemorySegment PFN_stbir_resize_extended;
        /// The function address of `stbir_build_samplers_with_splits`.
        public final MemorySegment PFN_stbir_build_samplers_with_splits;
        /// The function address of `stbir_resize_extended_splits`.
        public final MemorySegment PFN_stbir_resize_extended_splits;
        private Handles() {
            PFN_stbir_resize_uint8_srgb = STBInternal.lookup().findOrThrow("stbir_resize_uint8_srgb");
            PFN_stbir_resize = STBInternal.lookup().findOrThrow("stbir_resize");
            PFN_stbir_resize_init = STBInternal.lookup().findOrThrow("stbir_resize_init");
            PFN_stbir_set_datatypes = STBInternal.lookup().findOrThrow("stbir_set_datatypes");
            PFN_stbir_set_pixel_callbacks = STBInternal.lookup().findOrThrow("stbir_set_pixel_callbacks");
            PFN_stbir_set_user_data = STBInternal.lookup().findOrThrow("stbir_set_user_data");
            PFN_stbir_set_buffer_ptrs = STBInternal.lookup().findOrThrow("stbir_set_buffer_ptrs");
            PFN_stbir_set_pixel_layouts = STBInternal.lookup().findOrThrow("stbir_set_pixel_layouts");
            PFN_stbir_set_edgemodes = STBInternal.lookup().findOrThrow("stbir_set_edgemodes");
            PFN_stbir_set_filters = STBInternal.lookup().findOrThrow("stbir_set_filters");
            PFN_stbir_set_filter_callbacks = STBInternal.lookup().findOrThrow("stbir_set_filter_callbacks");
            PFN_stbir_set_pixel_subrect = STBInternal.lookup().findOrThrow("stbir_set_pixel_subrect");
            PFN_stbir_set_input_subrect = STBInternal.lookup().findOrThrow("stbir_set_input_subrect");
            PFN_stbir_set_output_pixel_subrect = STBInternal.lookup().findOrThrow("stbir_set_output_pixel_subrect");
            PFN_stbir_set_non_pm_alpha_speed_over_quality = STBInternal.lookup().findOrThrow("stbir_set_non_pm_alpha_speed_over_quality");
            PFN_stbir_build_samplers = STBInternal.lookup().findOrThrow("stbir_build_samplers");
            PFN_stbir_free_samplers = STBInternal.lookup().findOrThrow("stbir_free_samplers");
            PFN_stbir_resize_extended = STBInternal.lookup().findOrThrow("stbir_resize_extended");
            PFN_stbir_build_samplers_with_splits = STBInternal.lookup().findOrThrow("stbir_build_samplers_with_splits");
            PFN_stbir_resize_extended_splits = STBInternal.lookup().findOrThrow("stbir_resize_extended_splits");
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

    public static @CType("unsigned char *") MemorySegment stbir_resize_uint8_srgb(@CType("const unsigned char *") MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("unsigned char *") MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_type) {
        try {
            return (MemorySegment) Handles.MH_stbir_resize_uint8_srgb.invokeExact(Handles.get().PFN_stbir_resize_uint8_srgb, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_uint8_srgb", e); }
    }

    public static @CType("unsigned char *") MemorySegment stbir_resize_uint8_linear(@CType("const unsigned char *") MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("unsigned char *") MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_type) {
        try {
            return (MemorySegment) Handles.MH_stbir_resize_uint8_srgb.invokeExact(Handles.get().PFN_stbir_resize_uint8_srgb, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_uint8_srgb", e); }
    }

    public static @CType("float*") MemorySegment stbir_resize_float_linear(@CType("const float *") MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("float*") MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_type) {
        try {
            return (MemorySegment) Handles.MH_stbir_resize_uint8_srgb.invokeExact(Handles.get().PFN_stbir_resize_uint8_srgb, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_uint8_srgb", e); }
    }

    public static @CType("void*") MemorySegment stbir_resize(@CType("const void*") MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("void*") MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_layout, @CType("stbir_datatype") int data_type, @CType("stbir_edge") int edge, @CType("stbir_filter") int filter) {
        try {
            return (MemorySegment) Handles.MH_stbir_resize.invokeExact(Handles.get().PFN_stbir_resize, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type, edge, filter);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize", e); }
    }

    public static void stbir_resize_init(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("const void*") MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("void*") MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_layout, @CType("stbir_datatype") int data_type) {
        try {
            Handles.MH_stbir_resize_init.invokeExact(Handles.get().PFN_stbir_resize_init, resize, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_init", e); }
    }

    public static void stbir_set_datatypes(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("stbir_datatype") int input_type, @CType("stbir_datatype") int output_type) {
        try {
            Handles.MH_stbir_set_datatypes.invokeExact(Handles.get().PFN_stbir_set_datatypes, resize, input_type, output_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_datatypes", e); }
    }

    public static void stbir_set_pixel_callbacks(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("stbir_input_callback *") MemorySegment input_cb, @CType("stbir_output_callback *") MemorySegment output_cb) {
        try {
            Handles.MH_stbir_set_pixel_callbacks.invokeExact(Handles.get().PFN_stbir_set_pixel_callbacks, resize, input_cb, output_cb);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_callbacks", e); }
    }

    public static void stbir_set_user_data(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("void*") MemorySegment user_data) {
        try {
            Handles.MH_stbir_set_user_data.invokeExact(Handles.get().PFN_stbir_set_user_data, resize, user_data);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_user_data", e); }
    }

    public static void stbir_set_buffer_ptrs(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("const void*") MemorySegment input_pixels, @CType("int") int input_stride_in_bytes, @CType("void*") MemorySegment output_pixels, @CType("int") int output_stride_in_bytes) {
        try {
            Handles.MH_stbir_set_buffer_ptrs.invokeExact(Handles.get().PFN_stbir_set_buffer_ptrs, resize, input_pixels, input_stride_in_bytes, output_pixels, output_stride_in_bytes);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_buffer_ptrs", e); }
    }

    public static @CType("int") boolean stbir_set_pixel_layouts(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("stbir_pixel_layout") int input_pixel_layout, @CType("stbir_pixel_layout") int output_pixel_layout) {
        try {
            return (boolean) Handles.MH_stbir_set_pixel_layouts.invokeExact(Handles.get().PFN_stbir_set_pixel_layouts, resize, input_pixel_layout, output_pixel_layout);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_layouts", e); }
    }

    public static @CType("int") boolean stbir_set_edgemodes(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("stbir_edge") int horizontal_edge, @CType("stbir_edge") int vertical_edge) {
        try {
            return (boolean) Handles.MH_stbir_set_edgemodes.invokeExact(Handles.get().PFN_stbir_set_edgemodes, resize, horizontal_edge, vertical_edge);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_edgemodes", e); }
    }

    public static @CType("int") boolean stbir_set_filters(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("stbir_filter") int horizontal_filter, @CType("stbir_filter") int vertical_filter) {
        try {
            return (boolean) Handles.MH_stbir_set_filters.invokeExact(Handles.get().PFN_stbir_set_filters, resize, horizontal_filter, vertical_filter);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_filters", e); }
    }

    public static @CType("int") boolean stbir_set_filter_callbacks(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("stbir__kernel_callback *") MemorySegment horizontal_filter, @CType("stbir__support_callback *") MemorySegment horizontal_support, @CType("stbir__kernel_callback *") MemorySegment vertical_filter, @CType("stbir__support_callback *") MemorySegment vertical_support) {
        try {
            return (boolean) Handles.MH_stbir_set_filter_callbacks.invokeExact(Handles.get().PFN_stbir_set_filter_callbacks, resize, horizontal_filter, horizontal_support, vertical_filter, vertical_support);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_filter_callbacks", e); }
    }

    public static @CType("int") boolean stbir_set_pixel_subrect(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("int") int subx, @CType("int") int suby, @CType("int") int subw, @CType("int") int subh) {
        try {
            return (boolean) Handles.MH_stbir_set_pixel_subrect.invokeExact(Handles.get().PFN_stbir_set_pixel_subrect, resize, subx, suby, subw, subh);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_subrect", e); }
    }

    public static @CType("int") boolean stbir_set_input_subrect(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("double") double s0, @CType("double") double t0, @CType("double") double s1, @CType("double") double t1) {
        try {
            return (boolean) Handles.MH_stbir_set_input_subrect.invokeExact(Handles.get().PFN_stbir_set_input_subrect, resize, s0, t0, s1, t1);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_input_subrect", e); }
    }

    public static @CType("int") boolean stbir_set_output_pixel_subrect(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("int") int subx, @CType("int") int suby, @CType("int") int subw, @CType("int") int subh) {
        try {
            return (boolean) Handles.MH_stbir_set_output_pixel_subrect.invokeExact(Handles.get().PFN_stbir_set_output_pixel_subrect, resize, subx, suby, subw, subh);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_output_pixel_subrect", e); }
    }

    public static @CType("int") boolean stbir_set_non_pm_alpha_speed_over_quality(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("int") int non_pma_alpha_speed_over_quality) {
        try {
            return (boolean) Handles.MH_stbir_set_non_pm_alpha_speed_over_quality.invokeExact(Handles.get().PFN_stbir_set_non_pm_alpha_speed_over_quality, resize, non_pma_alpha_speed_over_quality);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_non_pm_alpha_speed_over_quality", e); }
    }

    public static @CType("int") boolean stbir_build_samplers(@CType("STBIR_RESIZE *") MemorySegment resize) {
        try {
            return (boolean) Handles.MH_stbir_build_samplers.invokeExact(Handles.get().PFN_stbir_build_samplers, resize);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_build_samplers", e); }
    }

    public static void stbir_free_samplers(@CType("STBIR_RESIZE *") MemorySegment resize) {
        try {
            Handles.MH_stbir_free_samplers.invokeExact(Handles.get().PFN_stbir_free_samplers, resize);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_free_samplers", e); }
    }

    public static @CType("int") boolean stbir_resize_extended(@CType("STBIR_RESIZE *") MemorySegment resize) {
        try {
            return (boolean) Handles.MH_stbir_resize_extended.invokeExact(Handles.get().PFN_stbir_resize_extended, resize);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_extended", e); }
    }

    public static @CType("int") boolean stbir_build_samplers_with_splits(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("int") int try_splits) {
        try {
            return (boolean) Handles.MH_stbir_build_samplers_with_splits.invokeExact(Handles.get().PFN_stbir_build_samplers_with_splits, resize, try_splits);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_build_samplers_with_splits", e); }
    }

    public static @CType("int") boolean stbir_resize_extended_split(@CType("STBIR_RESIZE *") MemorySegment resize, @CType("int") int split_start, @CType("int") int split_count) {
        try {
            return (boolean) Handles.MH_stbir_resize_extended_splits.invokeExact(Handles.get().PFN_stbir_resize_extended_splits, resize, split_start, split_count);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_extended_splits", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBImageResize2() {
    }
}
