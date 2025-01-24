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
    public static final int STBIR_1CHANNEL = 1;
    public static final int STBIR_2CHANNEL = 2;
    public static final int STBIR_RGB = 3;
    public static final int STBIR_BGR = 0;
    public static final int STBIR_4CHANNEL = 5;
    public static final int STBIR_RGBA = 4;
    public static final int STBIR_BGRA = 6;
    public static final int STBIR_ARGB = 7;
    public static final int STBIR_ABGR = 8;
    public static final int STBIR_RA = 9;
    public static final int STBIR_AR = 10;
    public static final int STBIR_RGBA_PM = 11;
    public static final int STBIR_BGRA_PM = 12;
    public static final int STBIR_ARGB_PM = 13;
    public static final int STBIR_ABGR_PM = 14;
    public static final int STBIR_RA_PM = 15;
    public static final int STBIR_AR_PM = 16;
    public static final int STBIR_RGBA_NO_AW = 11;
    public static final int STBIR_BGRA_NO_AW = 12;
    public static final int STBIR_ARGB_NO_AW = 13;
    public static final int STBIR_ABGR_NO_AW = 14;
    public static final int STBIR_RA_NO_AW = 15;
    public static final int STBIR_AR_NO_AW = 16;
    public static final int STBIR_EDGE_CLAMP = 0;
    public static final int STBIR_EDGE_REFLECT = 1;
    public static final int STBIR_EDGE_WRAP = 2;
    public static final int STBIR_EDGE_ZERO = 3;
    public static final int STBIR_FILTER_DEFAULT = 0;
    public static final int STBIR_FILTER_BOX = 1;
    public static final int STBIR_FILTER_TRIANGLE = 2;
    public static final int STBIR_FILTER_CUBICBSPLINE = 3;
    public static final int STBIR_FILTER_CATMULLROM = 4;
    public static final int STBIR_FILTER_MITCHELL = 5;
    public static final int STBIR_FILTER_POINT_SAMPLE = 6;
    public static final int STBIR_FILTER_OTHER = 7;
    public static final int STBIR_TYPE_UINT8 = 0;
    public static final int STBIR_TYPE_UINT8_SRGB = 1;
    public static final int STBIR_TYPE_UINT8_SRGB_ALPHA = 2;
    public static final int STBIR_TYPE_UINT16 = 3;
    public static final int STBIR_TYPE_FLOAT = 4;
    public static final int STBIR_TYPE_HALF_FLOAT = 5;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbir_resize_uint8_srgb`.
        public static final MethodHandle MH_stbir_resize_uint8_srgb = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_resize_uint8_linear`.
        public static final MethodHandle MH_stbir_resize_uint8_linear = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_resize_float_linear`.
        public static final MethodHandle MH_stbir_resize_float_linear = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_resize`.
        public static final MethodHandle MH_stbir_resize = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_resize_init`.
        public static final MethodHandle MH_stbir_resize_init = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_set_datatypes`.
        public static final MethodHandle MH_stbir_set_datatypes = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_set_pixel_callbacks`.
        public static final MethodHandle MH_stbir_set_pixel_callbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbir_set_user_data`.
        public static final MethodHandle MH_stbir_set_user_data = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbir_set_buffer_ptrs`.
        public static final MethodHandle MH_stbir_set_buffer_ptrs = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_set_pixel_layouts`.
        public static final MethodHandle MH_stbir_set_pixel_layouts = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_set_edgemodes`.
        public static final MethodHandle MH_stbir_set_edgemodes = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_set_filters`.
        public static final MethodHandle MH_stbir_set_filters = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_set_filter_callbacks`.
        public static final MethodHandle MH_stbir_set_filter_callbacks = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `stbir_set_pixel_subrect`.
        public static final MethodHandle MH_stbir_set_pixel_subrect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_set_input_subrect`.
        public static final MethodHandle MH_stbir_set_input_subrect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `stbir_set_output_pixel_subrect`.
        public static final MethodHandle MH_stbir_set_output_pixel_subrect = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_set_non_pm_alpha_speed_over_quality`.
        public static final MethodHandle MH_stbir_set_non_pm_alpha_speed_over_quality = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_build_samplers`.
        public static final MethodHandle MH_stbir_build_samplers = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbir_free_samplers`.
        public static final MethodHandle MH_stbir_free_samplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `stbir_resize_extended`.
        public static final MethodHandle MH_stbir_resize_extended = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbir_build_samplers_with_splits`.
        public static final MethodHandle MH_stbir_build_samplers_with_splits = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbir_resize_extended_split`.
        public static final MethodHandle MH_stbir_resize_extended_split = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The function address of `stbir_resize_uint8_srgb`.
        public final MemorySegment PFN_stbir_resize_uint8_srgb;
        /// The function address of `stbir_resize_uint8_linear`.
        public final MemorySegment PFN_stbir_resize_uint8_linear;
        /// The function address of `stbir_resize_float_linear`.
        public final MemorySegment PFN_stbir_resize_float_linear;
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
        /// The function address of `stbir_resize_extended_split`.
        public final MemorySegment PFN_stbir_resize_extended_split;
        private Handles() {
            PFN_stbir_resize_uint8_srgb = STBInternal.lookup().findOrThrow("stbir_resize_uint8_srgb");
            PFN_stbir_resize_uint8_linear = STBInternal.lookup().findOrThrow("stbir_resize_uint8_linear");
            PFN_stbir_resize_float_linear = STBInternal.lookup().findOrThrow("stbir_resize_float_linear");
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
            PFN_stbir_resize_extended_split = STBInternal.lookup().findOrThrow("stbir_resize_extended_split");
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

    /// ```
    /// unsigned char* stbir_resize_uint8_srgb(const unsigned char* input_pixels, int input_w, int input_h, int input_stride_in_bytes, unsigned char* output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type);
    /// ```
    public static MemorySegment stbir_resize_uint8_srgb(MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        try { return (MemorySegment) Handles.MH_stbir_resize_uint8_srgb.invokeExact(Handles.get().PFN_stbir_resize_uint8_srgb, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_resize_uint8_srgb", e); }
    }

    /// ```
    /// unsigned char* stbir_resize_uint8_linear(const unsigned char* input_pixels, int input_w, int input_h, int input_stride_in_bytes, unsigned char* output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type);
    /// ```
    public static MemorySegment stbir_resize_uint8_linear(MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        try { return (MemorySegment) Handles.MH_stbir_resize_uint8_linear.invokeExact(Handles.get().PFN_stbir_resize_uint8_linear, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_resize_uint8_linear", e); }
    }

    /// ```
    /// float* stbir_resize_float_linear(const float* input_pixels, int input_w, int input_h, int input_stride_in_bytes, float* output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type);
    /// ```
    public static MemorySegment stbir_resize_float_linear(MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        try { return (MemorySegment) Handles.MH_stbir_resize_float_linear.invokeExact(Handles.get().PFN_stbir_resize_float_linear, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_resize_float_linear", e); }
    }

    /// ```
    /// void* stbir_resize(const void* input_pixels, int input_w, int input_h, int input_stride_in_bytes, void* output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type, int edge, int filter);
    /// ```
    public static MemorySegment stbir_resize(MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type, int edge, int filter) {
        try { return (MemorySegment) Handles.MH_stbir_resize.invokeExact(Handles.get().PFN_stbir_resize, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type, edge, filter); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_resize", e); }
    }

    /// ```
    /// void stbir_resize_init(STBIR_RESIZE* resize, const void* input_pixels, int input_w, int input_h, int input_stride_in_bytes, void* output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type);
    /// ```
    public static void stbir_resize_init(MemorySegment resize, MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type) {
        try { Handles.MH_stbir_resize_init.invokeExact(Handles.get().PFN_stbir_resize_init, resize, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_resize_init", e); }
    }

    /// ```
    /// void stbir_set_datatypes(STBIR_RESIZE* resize, int input_type, int output_type);
    /// ```
    public static void stbir_set_datatypes(MemorySegment resize, int input_type, int output_type) {
        try { Handles.MH_stbir_set_datatypes.invokeExact(Handles.get().PFN_stbir_set_datatypes, resize, input_type, output_type); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_datatypes", e); }
    }

    /// ```
    /// void stbir_set_pixel_callbacks(STBIR_RESIZE* resize, stbir_input_callback* input_cb, stbir_output_callback* output_cb);
    /// ```
    public static void stbir_set_pixel_callbacks(MemorySegment resize, MemorySegment input_cb, MemorySegment output_cb) {
        try { Handles.MH_stbir_set_pixel_callbacks.invokeExact(Handles.get().PFN_stbir_set_pixel_callbacks, resize, input_cb, output_cb); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_callbacks", e); }
    }

    /// ```
    /// void stbir_set_user_data(STBIR_RESIZE* resize, void* user_data);
    /// ```
    public static void stbir_set_user_data(MemorySegment resize, MemorySegment user_data) {
        try { Handles.MH_stbir_set_user_data.invokeExact(Handles.get().PFN_stbir_set_user_data, resize, user_data); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_user_data", e); }
    }

    /// ```
    /// void stbir_set_buffer_ptrs(STBIR_RESIZE* resize, const void* input_pixels, int input_stride_in_bytes, void* output_pixels, int output_stride_in_bytes);
    /// ```
    public static void stbir_set_buffer_ptrs(MemorySegment resize, MemorySegment input_pixels, int input_stride_in_bytes, MemorySegment output_pixels, int output_stride_in_bytes) {
        try { Handles.MH_stbir_set_buffer_ptrs.invokeExact(Handles.get().PFN_stbir_set_buffer_ptrs, resize, input_pixels, input_stride_in_bytes, output_pixels, output_stride_in_bytes); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_buffer_ptrs", e); }
    }

    /// ```
    /// int stbir_set_pixel_layouts(STBIR_RESIZE* resize, int input_pixel_layout, int output_pixel_layout);
    /// ```
    public static boolean stbir_set_pixel_layouts(MemorySegment resize, int input_pixel_layout, int output_pixel_layout) {
        try { return (((int) Handles.MH_stbir_set_pixel_layouts.invokeExact(Handles.get().PFN_stbir_set_pixel_layouts, resize, input_pixel_layout, output_pixel_layout)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_layouts", e); }
    }

    /// ```
    /// int stbir_set_edgemodes(STBIR_RESIZE* resize, int horizontal_edge, int vertical_edge);
    /// ```
    public static boolean stbir_set_edgemodes(MemorySegment resize, int horizontal_edge, int vertical_edge) {
        try { return (((int) Handles.MH_stbir_set_edgemodes.invokeExact(Handles.get().PFN_stbir_set_edgemodes, resize, horizontal_edge, vertical_edge)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_edgemodes", e); }
    }

    /// ```
    /// int stbir_set_filters(STBIR_RESIZE* resize, int horizontal_filter, int vertical_filter);
    /// ```
    public static boolean stbir_set_filters(MemorySegment resize, int horizontal_filter, int vertical_filter) {
        try { return (((int) Handles.MH_stbir_set_filters.invokeExact(Handles.get().PFN_stbir_set_filters, resize, horizontal_filter, vertical_filter)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_filters", e); }
    }

    /// ```
    /// int stbir_set_filter_callbacks(STBIR_RESIZE* resize, stbir__kernel_callback* horizontal_filter, stbir__support_callback* horizontal_support, stbir__kernel_callback* vertical_filter, stbir__support_callback* vertical_support);
    /// ```
    public static boolean stbir_set_filter_callbacks(MemorySegment resize, MemorySegment horizontal_filter, MemorySegment horizontal_support, MemorySegment vertical_filter, MemorySegment vertical_support) {
        try { return (((int) Handles.MH_stbir_set_filter_callbacks.invokeExact(Handles.get().PFN_stbir_set_filter_callbacks, resize, horizontal_filter, horizontal_support, vertical_filter, vertical_support)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_filter_callbacks", e); }
    }

    /// ```
    /// int stbir_set_pixel_subrect(STBIR_RESIZE* resize, int subx, int suby, int subw, int subh);
    /// ```
    public static boolean stbir_set_pixel_subrect(MemorySegment resize, int subx, int suby, int subw, int subh) {
        try { return (((int) Handles.MH_stbir_set_pixel_subrect.invokeExact(Handles.get().PFN_stbir_set_pixel_subrect, resize, subx, suby, subw, subh)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_subrect", e); }
    }

    /// ```
    /// int stbir_set_input_subrect(STBIR_RESIZE* resize, double s0, double t0, double s1, double t1);
    /// ```
    public static boolean stbir_set_input_subrect(MemorySegment resize, double s0, double t0, double s1, double t1) {
        try { return (((int) Handles.MH_stbir_set_input_subrect.invokeExact(Handles.get().PFN_stbir_set_input_subrect, resize, s0, t0, s1, t1)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_input_subrect", e); }
    }

    /// ```
    /// int stbir_set_output_pixel_subrect(STBIR_RESIZE* resize, int subx, int suby, int subw, int subh);
    /// ```
    public static boolean stbir_set_output_pixel_subrect(MemorySegment resize, int subx, int suby, int subw, int subh) {
        try { return (((int) Handles.MH_stbir_set_output_pixel_subrect.invokeExact(Handles.get().PFN_stbir_set_output_pixel_subrect, resize, subx, suby, subw, subh)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_output_pixel_subrect", e); }
    }

    /// ```
    /// int stbir_set_non_pm_alpha_speed_over_quality(STBIR_RESIZE* resize, int non_pma_alpha_speed_over_quality);
    /// ```
    public static boolean stbir_set_non_pm_alpha_speed_over_quality(MemorySegment resize, int non_pma_alpha_speed_over_quality) {
        try { return (((int) Handles.MH_stbir_set_non_pm_alpha_speed_over_quality.invokeExact(Handles.get().PFN_stbir_set_non_pm_alpha_speed_over_quality, resize, non_pma_alpha_speed_over_quality)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_set_non_pm_alpha_speed_over_quality", e); }
    }

    /// ```
    /// int stbir_build_samplers(STBIR_RESIZE* resize);
    /// ```
    public static boolean stbir_build_samplers(MemorySegment resize) {
        try { return (((int) Handles.MH_stbir_build_samplers.invokeExact(Handles.get().PFN_stbir_build_samplers, resize)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_build_samplers", e); }
    }

    /// ```
    /// void stbir_free_samplers(STBIR_RESIZE* resize);
    /// ```
    public static void stbir_free_samplers(MemorySegment resize) {
        try { Handles.MH_stbir_free_samplers.invokeExact(Handles.get().PFN_stbir_free_samplers, resize); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_free_samplers", e); }
    }

    /// ```
    /// int stbir_resize_extended(STBIR_RESIZE* resize);
    /// ```
    public static boolean stbir_resize_extended(MemorySegment resize) {
        try { return (((int) Handles.MH_stbir_resize_extended.invokeExact(Handles.get().PFN_stbir_resize_extended, resize)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_resize_extended", e); }
    }

    /// ```
    /// int stbir_build_samplers_with_splits(STBIR_RESIZE* resize, int try_splits);
    /// ```
    public static boolean stbir_build_samplers_with_splits(MemorySegment resize, int try_splits) {
        try { return (((int) Handles.MH_stbir_build_samplers_with_splits.invokeExact(Handles.get().PFN_stbir_build_samplers_with_splits, resize, try_splits)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_build_samplers_with_splits", e); }
    }

    /// ```
    /// int stbir_resize_extended_split(STBIR_RESIZE* resize, int split_start, int split_count);
    /// ```
    public static boolean stbir_resize_extended_split(MemorySegment resize, int split_start, int split_count) {
        try { return (((int) Handles.MH_stbir_resize_extended_split.invokeExact(Handles.get().PFN_stbir_resize_extended_split, resize, split_start, split_count)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in stbir_resize_extended_split", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBImageResize2() {
    }
}
