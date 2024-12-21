/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/**
 * The STB image resizer.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBImageResize2 {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    public static final int STBIR_1CHANNEL = 1;
    public static final int STBIR_2CHANNEL = 2;
    ///3-chan, with order specified (for channel flipping)
    public static final int STBIR_RGB = 3;
    ///3-chan, with order specified (for channel flipping)
    public static final int STBIR_BGR = 0;
    public static final int STBIR_4CHANNEL = 5;
    ///alpha formats, where alpha is NOT premultiplied into color channels
    public static final int STBIR_RGBA = 4;
    public static final int STBIR_BGRA = 6;
    public static final int STBIR_ARGB = 7;
    public static final int STBIR_ABGR = 8;
    public static final int STBIR_RA = 9;
    public static final int STBIR_AR = 10;
    ///alpha formats, where alpha is premultiplied into color channels
    public static final int STBIR_RGBA_PM = 11;
    public static final int STBIR_BGRA_PM = 12;
    public static final int STBIR_ARGB_PM = 13;
    public static final int STBIR_ABGR_PM = 14;
    public static final int STBIR_RA_PM = 15;
    public static final int STBIR_AR_PM = 16;
    ///alpha formats, where NO alpha weighting is applied at all!
    ///these are just synonyms for the _PM flags (which also do
    ///no alpha weighting). These names just make it more clear
    ///for some folks).
    public static final int STBIR_RGBA_NO_AW = 11;
    public static final int STBIR_BGRA_NO_AW = 12;
    public static final int STBIR_ARGB_NO_AW = 13;
    public static final int STBIR_ABGR_NO_AW = 14;
    public static final int STBIR_RA_NO_AW = 15;
    public static final int STBIR_AR_NO_AW = 16;
    public static final int STBIR_EDGE_CLAMP = 0;
    public static final int STBIR_EDGE_REFLECT = 1;
    ///this edge mode is slower and uses more memory
    public static final int STBIR_EDGE_WRAP = 2;
    public static final int STBIR_EDGE_ZERO = 3;
    ///use same filter type that easy-to-use API chooses
    public static final int STBIR_FILTER_DEFAULT = 0;
    ///A trapezoid w/1-pixel wide ramps, same result as box for integer scale ratios
    public static final int STBIR_FILTER_BOX = 1;
    ///On upsampling, produces same results as bilinear texture filtering
    public static final int STBIR_FILTER_TRIANGLE = 2;
    ///The cubic b-spline (aka Mitchell-Netrevalli with B=1,C=0), gaussian-esque
    public static final int STBIR_FILTER_CUBICBSPLINE = 3;
    ///An interpolating cubic spline
    public static final int STBIR_FILTER_CATMULLROM = 4;
    ///Mitchell-Netrevalli filter with B=1/3, C=1/3
    public static final int STBIR_FILTER_MITCHELL = 5;
    ///Simple point sampling
    public static final int STBIR_FILTER_POINT_SAMPLE = 6;
    ///User callback specified
    public static final int STBIR_FILTER_OTHER = 7;
    public static final int STBIR_TYPE_UINT8 = 0;
    public static final int STBIR_TYPE_UINT8_SRGB = 1;
    ///alpha channel, when present, should also be SRGB (this is very unusual)
    public static final int STBIR_TYPE_UINT8_SRGB_ALPHA = 2;
    public static final int STBIR_TYPE_UINT16 = 3;
    public static final int STBIR_TYPE_FLOAT = 4;
    public static final int STBIR_TYPE_HALF_FLOAT = 5;
    //region Method handles
    /// The method handle of `stbir_resize_uint8_srgb`.
    public static final MethodHandle MH_stbir_resize_uint8_srgb = RuntimeHelper.downcall(Handles.lookup, "stbir_resize_uint8_srgb", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_resize`.
    public static final MethodHandle MH_stbir_resize = RuntimeHelper.downcall(Handles.lookup, "stbir_resize", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_resize_init`.
    public static final MethodHandle MH_stbir_resize_init = RuntimeHelper.downcall(Handles.lookup, "stbir_resize_init", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_set_datatypes`.
    public static final MethodHandle MH_stbir_set_datatypes = RuntimeHelper.downcall(Handles.lookup, "stbir_set_datatypes", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_set_pixel_callbacks`.
    public static final MethodHandle MH_stbir_set_pixel_callbacks = RuntimeHelper.downcall(Handles.lookup, "stbir_set_pixel_callbacks", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stbir_set_user_data`.
    public static final MethodHandle MH_stbir_set_user_data = RuntimeHelper.downcall(Handles.lookup, "stbir_set_user_data", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stbir_set_buffer_ptrs`.
    public static final MethodHandle MH_stbir_set_buffer_ptrs = RuntimeHelper.downcall(Handles.lookup, "stbir_set_buffer_ptrs", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_set_pixel_layouts`.
    public static final MethodHandle MH_stbir_set_pixel_layouts = RuntimeHelper.downcall(Handles.lookup, "stbir_set_pixel_layouts", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_set_edgemodes`.
    public static final MethodHandle MH_stbir_set_edgemodes = RuntimeHelper.downcall(Handles.lookup, "stbir_set_edgemodes", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_set_filters`.
    public static final MethodHandle MH_stbir_set_filters = RuntimeHelper.downcall(Handles.lookup, "stbir_set_filters", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_set_filter_callbacks`.
    public static final MethodHandle MH_stbir_set_filter_callbacks = RuntimeHelper.downcall(Handles.lookup, "stbir_set_filter_callbacks", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    /// The method handle of `stbir_set_pixel_subrect`.
    public static final MethodHandle MH_stbir_set_pixel_subrect = RuntimeHelper.downcall(Handles.lookup, "stbir_set_pixel_subrect", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_set_input_subrect`.
    public static final MethodHandle MH_stbir_set_input_subrect = RuntimeHelper.downcall(Handles.lookup, "stbir_set_input_subrect", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    /// The method handle of `stbir_set_output_pixel_subrect`.
    public static final MethodHandle MH_stbir_set_output_pixel_subrect = RuntimeHelper.downcall(Handles.lookup, "stbir_set_output_pixel_subrect", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_set_non_pm_alpha_speed_over_quality`.
    public static final MethodHandle MH_stbir_set_non_pm_alpha_speed_over_quality = RuntimeHelper.downcall(Handles.lookup, "stbir_set_non_pm_alpha_speed_over_quality", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_build_samplers`.
    public static final MethodHandle MH_stbir_build_samplers = RuntimeHelper.downcall(Handles.lookup, "stbir_build_samplers", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    /// The method handle of `stbir_free_samplers`.
    public static final MethodHandle MH_stbir_free_samplers = RuntimeHelper.downcall(Handles.lookup, "stbir_free_samplers", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    /// The method handle of `stbir_resize_extended`.
    public static final MethodHandle MH_stbir_resize_extended = RuntimeHelper.downcall(Handles.lookup, "stbir_resize_extended", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    /// The method handle of `stbir_build_samplers_with_splits`.
    public static final MethodHandle MH_stbir_build_samplers_with_splits = RuntimeHelper.downcall(Handles.lookup, "stbir_build_samplers_with_splits", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    /// The method handle of `stbir_resize_extended_splits`.
    public static final MethodHandle MH_stbir_resize_extended_splits = RuntimeHelper.downcall(Handles.lookup, "stbir_resize_extended_splits", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    //endregion

    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbir_resize_uint8_srgb(@CType("const unsigned char *") java.lang.foreign.MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("unsigned char *") java.lang.foreign.MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_type) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbir_resize_uint8_srgb.invokeExact(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_uint8_srgb", e); }
    }
    public static @CType("unsigned char *") java.lang.foreign.MemorySegment stbir_resize_uint8_linear(@CType("const unsigned char *") java.lang.foreign.MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("unsigned char *") java.lang.foreign.MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_type) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbir_resize_uint8_srgb.invokeExact(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_uint8_srgb", e); }
    }
    public static @CType("float*") java.lang.foreign.MemorySegment stbir_resize_float_linear(@CType("const float *") java.lang.foreign.MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("float*") java.lang.foreign.MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_type) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbir_resize_uint8_srgb.invokeExact(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_uint8_srgb", e); }
    }
    public static @CType("void*") java.lang.foreign.MemorySegment stbir_resize(@CType("const void*") java.lang.foreign.MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("void*") java.lang.foreign.MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_layout, @CType("stbir_datatype") int data_type, @CType("stbir_edge") int edge, @CType("stbir_filter") int filter) {
        try {
            return (java.lang.foreign.MemorySegment) MH_stbir_resize.invokeExact(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type, edge, filter);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize", e); }
    }
    public static void stbir_resize_init(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("const void*") java.lang.foreign.MemorySegment input_pixels, @CType("int") int input_w, @CType("int") int input_h, @CType("int") int input_stride_in_bytes, @CType("void*") java.lang.foreign.MemorySegment output_pixels, @CType("int") int output_w, @CType("int") int output_h, @CType("int") int output_stride_in_bytes, @CType("stbir_pixel_layout") int pixel_layout, @CType("stbir_datatype") int data_type) {
        try {
            MH_stbir_resize_init.invokeExact(resize, input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, pixel_layout, data_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_init", e); }
    }
    public static void stbir_set_datatypes(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("stbir_datatype") int input_type, @CType("stbir_datatype") int output_type) {
        try {
            MH_stbir_set_datatypes.invokeExact(resize, input_type, output_type);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_datatypes", e); }
    }
    public static void stbir_set_pixel_callbacks(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("stbir_input_callback *") java.lang.foreign.MemorySegment input_cb, @CType("stbir_output_callback *") java.lang.foreign.MemorySegment output_cb) {
        try {
            MH_stbir_set_pixel_callbacks.invokeExact(resize, input_cb, output_cb);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_callbacks", e); }
    }
    public static void stbir_set_user_data(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("void*") java.lang.foreign.MemorySegment user_data) {
        try {
            MH_stbir_set_user_data.invokeExact(resize, user_data);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_user_data", e); }
    }
    public static void stbir_set_buffer_ptrs(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("const void*") java.lang.foreign.MemorySegment input_pixels, @CType("int") int input_stride_in_bytes, @CType("void*") java.lang.foreign.MemorySegment output_pixels, @CType("int") int output_stride_in_bytes) {
        try {
            MH_stbir_set_buffer_ptrs.invokeExact(resize, input_pixels, input_stride_in_bytes, output_pixels, output_stride_in_bytes);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_buffer_ptrs", e); }
    }
    public static @CType("int") boolean stbir_set_pixel_layouts(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("stbir_pixel_layout") int input_pixel_layout, @CType("stbir_pixel_layout") int output_pixel_layout) {
        try {
            return (boolean) MH_stbir_set_pixel_layouts.invokeExact(resize, input_pixel_layout, output_pixel_layout);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_layouts", e); }
    }
    public static @CType("int") boolean stbir_set_edgemodes(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("stbir_edge") int horizontal_edge, @CType("stbir_edge") int vertical_edge) {
        try {
            return (boolean) MH_stbir_set_edgemodes.invokeExact(resize, horizontal_edge, vertical_edge);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_edgemodes", e); }
    }
    public static @CType("int") boolean stbir_set_filters(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("stbir_filter") int horizontal_filter, @CType("stbir_filter") int vertical_filter) {
        try {
            return (boolean) MH_stbir_set_filters.invokeExact(resize, horizontal_filter, vertical_filter);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_filters", e); }
    }
    public static @CType("int") boolean stbir_set_filter_callbacks(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment horizontal_filter, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment horizontal_support, @CType("stbir__kernel_callback *") java.lang.foreign.MemorySegment vertical_filter, @CType("stbir__support_callback *") java.lang.foreign.MemorySegment vertical_support) {
        try {
            return (boolean) MH_stbir_set_filter_callbacks.invokeExact(resize, horizontal_filter, horizontal_support, vertical_filter, vertical_support);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_filter_callbacks", e); }
    }
    public static @CType("int") boolean stbir_set_pixel_subrect(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("int") int subx, @CType("int") int suby, @CType("int") int subw, @CType("int") int subh) {
        try {
            return (boolean) MH_stbir_set_pixel_subrect.invokeExact(resize, subx, suby, subw, subh);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_pixel_subrect", e); }
    }
    public static @CType("int") boolean stbir_set_input_subrect(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("double") double s0, @CType("double") double t0, @CType("double") double s1, @CType("double") double t1) {
        try {
            return (boolean) MH_stbir_set_input_subrect.invokeExact(resize, s0, t0, s1, t1);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_input_subrect", e); }
    }
    public static @CType("int") boolean stbir_set_output_pixel_subrect(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("int") int subx, @CType("int") int suby, @CType("int") int subw, @CType("int") int subh) {
        try {
            return (boolean) MH_stbir_set_output_pixel_subrect.invokeExact(resize, subx, suby, subw, subh);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_output_pixel_subrect", e); }
    }
    ///when inputting AND outputting non-premultiplied alpha pixels, we use a slower but higher quality technique
    ///that fills the zero alpha pixel's RGB values with something plausible.  If you don't care about areas of
    ///zero alpha, you can call this function to get about a 25% speed improvement for STBIR_RGBA to STBIR_RGBA
    ///types of resizes.
    public static @CType("int") boolean stbir_set_non_pm_alpha_speed_over_quality(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("int") int non_pma_alpha_speed_over_quality) {
        try {
            return (boolean) MH_stbir_set_non_pm_alpha_speed_over_quality.invokeExact(resize, non_pma_alpha_speed_over_quality);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_set_non_pm_alpha_speed_over_quality", e); }
    }
    ///This builds the samplers and does one allocation
    public static @CType("int") boolean stbir_build_samplers(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize) {
        try {
            return (boolean) MH_stbir_build_samplers.invokeExact(resize);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_build_samplers", e); }
    }
    ///You MUST call this, if you call stbir_build_samplers or stbir_build_samplers_with_splits
    public static void stbir_free_samplers(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize) {
        try {
            MH_stbir_free_samplers.invokeExact(resize);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_free_samplers", e); }
    }
    ///And this is the main function to perform the resize synchronously on one thread.
    public static @CType("int") boolean stbir_resize_extended(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize) {
        try {
            return (boolean) MH_stbir_resize_extended.invokeExact(resize);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_extended", e); }
    }
    ///This will build samplers for threading.
    ///You can pass in the number of threads you'd like to use (try_splits).
    ///It returns the number of splits (threads) that you can call it with.
    ///It might be less if the image resize can't be split up that many ways.
    public static @CType("int") boolean stbir_build_samplers_with_splits(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("int") int try_splits) {
        try {
            return (boolean) MH_stbir_build_samplers_with_splits.invokeExact(resize, try_splits);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_build_samplers_with_splits", e); }
    }
    ///This function does a split of the resizing (you call this fuction for each
    ///split, on multiple threads). A split is a piece of the output resize pixel space.
    ///
    ///Note that you MUST call stbir_build_samplers_with_splits before stbir_resize_extended_split!
    ///
    ///Usually, you will always call stbir_resize_split with split_start as the thread_index
    ///and "1" for the split_count.
    ///But, if you have a weird situation where you MIGHT want 8 threads, but sometimes
    ///only 4 threads, you can use 0,2,4,6 for the split_start's and use "2" for the
    ///split_count each time to turn in into a 4 thread resize. (This is unusual).
    public static @CType("int") boolean stbir_resize_extended_split(@CType("STBIR_RESIZE *") java.lang.foreign.MemorySegment resize, @CType("int") int split_start, @CType("int") int split_count) {
        try {
            return (boolean) MH_stbir_resize_extended_splits.invokeExact(resize, split_start, split_count);
        } catch (Throwable e) { throw new RuntimeException("error in stbir_resize_extended_splits", e); }
    }
    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBImageResize2() {
    }
}
