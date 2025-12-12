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

import java.lang.foreign.MemorySegment;

/// [stb_image_resize2.h](https://github.com/nothings/stb/blob/master/stb_image_resize2.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBImageResize2 {
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

    /// Invokes `stbir_resize_uint8_srgb`.
    /// ```
    /// unsigned char* stbir_resize_uint8_srgb(const unsigned char* input_pixels, int input_w, int input_h, int input_stride_in_bytes, unsigned char* output_pixels, int output_w, int output_h, int output_stride_in_bytes, (int) stbir_pixel_layout pixel_type);
    /// ```
    public static @NonNull MemorySegment stbir_resize_uint8_srgb(@NonNull MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NonNull MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImageResize.nstbir_resize_uint8_srgb(input_pixels.address(), input_w, input_h, input_stride_in_bytes, output_pixels.address(), output_w, output_h, output_stride_in_bytes, pixel_type));
    }

    /// Invokes `stbir_resize_uint8_linear`.
    /// ```
    /// unsigned char* stbir_resize_uint8_linear(const unsigned char* input_pixels, int input_w, int input_h, int input_stride_in_bytes, unsigned char* output_pixels, int output_w, int output_h, int output_stride_in_bytes, (int) stbir_pixel_layout pixel_type);
    /// ```
    public static @NonNull MemorySegment stbir_resize_uint8_linear(@NonNull MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NonNull MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImageResize.nstbir_resize_uint8_linear(input_pixels.address(), input_w, input_h, input_stride_in_bytes, output_pixels.address(), output_w, output_h, output_stride_in_bytes, pixel_type));
    }

    /// Invokes `stbir_resize_float_linear`.
    /// ```
    /// float* stbir_resize_float_linear(const float* input_pixels, int input_w, int input_h, int input_stride_in_bytes, float* output_pixels, int output_w, int output_h, int output_stride_in_bytes, (int) stbir_pixel_layout pixel_type);
    /// ```
    public static @NonNull MemorySegment stbir_resize_float_linear(@NonNull MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NonNull MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_type) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImageResize.nstbir_resize_float_linear(input_pixels.address(), input_w, input_h, input_stride_in_bytes, output_pixels.address(), output_w, output_h, output_stride_in_bytes, pixel_type));
    }

    /// Invokes `stbir_resize`.
    /// ```
    /// void* stbir_resize(const void* input_pixels, int input_w, int input_h, int input_stride_in_bytes, void* output_pixels, int output_w, int output_h, int output_stride_in_bytes, (int) stbir_pixel_layout pixel_layout, (int) stbir_datatype data_type, (int) stbir_edge edge, (int) stbir_filter filter);
    /// ```
    public static @NonNull MemorySegment stbir_resize(@NonNull MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NonNull MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type, int edge, int filter) {
        return MemorySegment.ofAddress(org.lwjgl.stb.STBImageResize.nstbir_resize(input_pixels.address(), input_w, input_h, input_stride_in_bytes, output_pixels.address(), output_w, output_h, output_stride_in_bytes, pixel_layout, data_type, edge, filter));
    }

    /// Invokes `stbir_resize_init`.
    /// ```
    /// void stbir_resize_init(STBIR_RESIZE* resize, const void* input_pixels, int input_w, int input_h, int input_stride_in_bytes, void* output_pixels, int output_w, int output_h, int output_stride_in_bytes, (int) stbir_pixel_layout pixel_layout, (int) stbir_datatype data_type);
    /// ```
    public static void stbir_resize_init(@NonNull MemorySegment resize, @NonNull MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes, @NonNull MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes, int pixel_layout, int data_type) {
        org.lwjgl.stb.STBImageResize.nstbir_resize_init(resize.address(), input_pixels.address(), input_w, input_h, input_stride_in_bytes, output_pixels.address(), output_w, output_h, output_stride_in_bytes, pixel_layout, data_type);
    }

    /// Invokes `stbir_set_datatypes`.
    /// ```
    /// void stbir_set_datatypes(STBIR_RESIZE* resize, (int) stbir_datatype input_type, (int) stbir_datatype output_type);
    /// ```
    public static void stbir_set_datatypes(@NonNull MemorySegment resize, int input_type, int output_type) {
        org.lwjgl.stb.STBImageResize.nstbir_set_datatypes(resize.address(), input_type, output_type);
    }

    /// Invokes `stbir_set_pixel_callbacks`.
    /// ```
    /// void stbir_set_pixel_callbacks(STBIR_RESIZE* resize, stbir_input_callback* input_cb, stbir_output_callback* output_cb);
    /// ```
    public static void stbir_set_pixel_callbacks(@NonNull MemorySegment resize, @NonNull MemorySegment input_cb, @NonNull MemorySegment output_cb) {
        org.lwjgl.stb.STBImageResize.nstbir_set_pixel_callbacks(resize.address(), input_cb.address(), output_cb.address());
    }

    /// Invokes `stbir_set_user_data`.
    /// ```
    /// void stbir_set_user_data(STBIR_RESIZE* resize, void* user_data);
    /// ```
    public static void stbir_set_user_data(@NonNull MemorySegment resize, @NonNull MemorySegment user_data) {
        org.lwjgl.stb.STBImageResize.nstbir_set_user_data(resize.address(), user_data.address());
    }

    /// Invokes `stbir_set_buffer_ptrs`.
    /// ```
    /// void stbir_set_buffer_ptrs(STBIR_RESIZE* resize, const void* input_pixels, int input_stride_in_bytes, void* output_pixels, int output_stride_in_bytes);
    /// ```
    public static void stbir_set_buffer_ptrs(@NonNull MemorySegment resize, @NonNull MemorySegment input_pixels, int input_stride_in_bytes, @NonNull MemorySegment output_pixels, int output_stride_in_bytes) {
        org.lwjgl.stb.STBImageResize.nstbir_set_buffer_ptrs(resize.address(), input_pixels.address(), input_stride_in_bytes, output_pixels.address(), output_stride_in_bytes);
    }

    /// Invokes `stbir_set_pixel_layouts`.
    /// ```
    /// (int) STBbool stbir_set_pixel_layouts(STBIR_RESIZE* resize, (int) stbir_pixel_layout input_pixel_layout, (int) stbir_pixel_layout output_pixel_layout);
    /// ```
    public static boolean stbir_set_pixel_layouts(@NonNull MemorySegment resize, int input_pixel_layout, int output_pixel_layout) {
        return org.lwjgl.stb.STBImageResize.nstbir_set_pixel_layouts(resize.address(), input_pixel_layout, output_pixel_layout) != 0;
    }

    /// Invokes `stbir_set_edgemodes`.
    /// ```
    /// (int) STBbool stbir_set_edgemodes(STBIR_RESIZE* resize, (int) stbir_edge horizontal_edge, (int) stbir_edge vertical_edge);
    /// ```
    public static boolean stbir_set_edgemodes(@NonNull MemorySegment resize, int horizontal_edge, int vertical_edge) {
        return org.lwjgl.stb.STBImageResize.nstbir_set_edgemodes(resize.address(), horizontal_edge, vertical_edge) != 0;
    }

    /// Invokes `stbir_set_filters`.
    /// ```
    /// (int) STBbool stbir_set_filters(STBIR_RESIZE* resize, (int) stbir_filter horizontal_filter, (int) stbir_filter vertical_filter);
    /// ```
    public static boolean stbir_set_filters(@NonNull MemorySegment resize, int horizontal_filter, int vertical_filter) {
        return org.lwjgl.stb.STBImageResize.nstbir_set_filters(resize.address(), horizontal_filter, vertical_filter) != 0;
    }

    /// Invokes `stbir_set_filter_callbacks`.
    /// ```
    /// (int) STBbool stbir_set_filter_callbacks(STBIR_RESIZE* resize, stbir__kernel_callback* horizontal_filter, stbir__support_callback* horizontal_support, stbir__kernel_callback* vertical_filter, stbir__support_callback* vertical_support);
    /// ```
    public static boolean stbir_set_filter_callbacks(@NonNull MemorySegment resize, @NonNull MemorySegment horizontal_filter, @NonNull MemorySegment horizontal_support, @NonNull MemorySegment vertical_filter, @NonNull MemorySegment vertical_support) {
        return org.lwjgl.stb.STBImageResize.nstbir_set_filter_callbacks(resize.address(), horizontal_filter.address(), horizontal_support.address(), vertical_filter.address(), vertical_support.address()) != 0;
    }

    /// Invokes `stbir_set_pixel_subrect`.
    /// ```
    /// (int) STBbool stbir_set_pixel_subrect(STBIR_RESIZE* resize, int subx, int suby, int subw, int subh);
    /// ```
    public static boolean stbir_set_pixel_subrect(@NonNull MemorySegment resize, int subx, int suby, int subw, int subh) {
        return org.lwjgl.stb.STBImageResize.nstbir_set_pixel_subrect(resize.address(), subx, suby, subw, subh) != 0;
    }

    /// Invokes `stbir_set_input_subrect`.
    /// ```
    /// (int) STBbool stbir_set_input_subrect(STBIR_RESIZE* resize, double s0, double t0, double s1, double t1);
    /// ```
    public static boolean stbir_set_input_subrect(@NonNull MemorySegment resize, double s0, double t0, double s1, double t1) {
        return org.lwjgl.stb.STBImageResize.nstbir_set_input_subrect(resize.address(), s0, t0, s1, t1) != 0;
    }

    /// Invokes `stbir_set_output_pixel_subrect`.
    /// ```
    /// (int) STBbool stbir_set_output_pixel_subrect(STBIR_RESIZE* resize, int subx, int suby, int subw, int subh);
    /// ```
    public static boolean stbir_set_output_pixel_subrect(@NonNull MemorySegment resize, int subx, int suby, int subw, int subh) {
        return org.lwjgl.stb.STBImageResize.nstbir_set_output_pixel_subrect(resize.address(), subx, suby, subw, subh) != 0;
    }

    /// Invokes `stbir_set_non_pm_alpha_speed_over_quality`.
    /// ```
    /// (int) STBbool stbir_set_non_pm_alpha_speed_over_quality(STBIR_RESIZE* resize, int non_pma_alpha_speed_over_quality);
    /// ```
    public static boolean stbir_set_non_pm_alpha_speed_over_quality(@NonNull MemorySegment resize, int non_pma_alpha_speed_over_quality) {
        return org.lwjgl.stb.STBImageResize.nstbir_set_non_pm_alpha_speed_over_quality(resize.address(), non_pma_alpha_speed_over_quality) != 0;
    }

    /// Invokes `stbir_build_samplers`.
    /// ```
    /// (int) STBbool stbir_build_samplers(STBIR_RESIZE* resize);
    /// ```
    public static boolean stbir_build_samplers(@NonNull MemorySegment resize) {
        return org.lwjgl.stb.STBImageResize.nstbir_build_samplers(resize.address()) != 0;
    }

    /// Invokes `stbir_free_samplers`.
    /// ```
    /// void stbir_free_samplers(STBIR_RESIZE* resize);
    /// ```
    public static void stbir_free_samplers(@NonNull MemorySegment resize) {
        org.lwjgl.stb.STBImageResize.nstbir_free_samplers(resize.address());
    }

    /// Invokes `stbir_resize_extended`.
    /// ```
    /// (int) STBbool stbir_resize_extended(STBIR_RESIZE* resize);
    /// ```
    public static boolean stbir_resize_extended(@NonNull MemorySegment resize) {
        return org.lwjgl.stb.STBImageResize.nstbir_resize_extended(resize.address()) != 0;
    }

    /// Invokes `stbir_build_samplers_with_splits`.
    /// ```
    /// (int) STBbool stbir_build_samplers_with_splits(STBIR_RESIZE* resize, int try_splits);
    /// ```
    public static boolean stbir_build_samplers_with_splits(@NonNull MemorySegment resize, int try_splits) {
        return org.lwjgl.stb.STBImageResize.nstbir_build_samplers_with_splits(resize.address(), try_splits) != 0;
    }

    /// Invokes `stbir_resize_extended_split`.
    /// ```
    /// (int) STBbool stbir_resize_extended_split(STBIR_RESIZE* resize, int split_start, int split_count);
    /// ```
    public static boolean stbir_resize_extended_split(@NonNull MemorySegment resize, int split_start, int split_count) {
        return org.lwjgl.stb.STBImageResize.nstbir_resize_extended_split(resize.address(), split_start, split_count) != 0;
    }

    //@formatter:on

    private STBImageResize2() {
    }
}
