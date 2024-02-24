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

import overrun.marshal.DirectAccess;
import overrun.marshal.Downcall;
import overrun.marshal.gen.Entrypoint;
import overrungl.NativeType;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;

/**
 * The STB image resizer.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBImageResize2 extends DirectAccess {
    /**
     * The instance of STBImageResize2.
     */
    STBImageResize2 INSTANCE = Downcall.load(MethodHandles.lookup(), Handles.lookup);

    //===============================================================
    //  Simple-complexity API
    //
    //    If output_pixels is NULL (0), then we will allocate the buffer and return it to you.
    //--------------------------------

    @Entrypoint("stbir_resize_uint8_srgb")
    MemorySegment resizeUint8Srgb(@NativeType("const unsigned char *") MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes,
                                  @NativeType("unsigned char *") MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes,
                                  STBIRPixelLayout pixel_type);

    @Entrypoint("stbir_resize_uint8_linear")
    @NativeType("unsigned char *")
    MemorySegment resizeUint8Linear(@NativeType("const unsigned char *") MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes,
                                    @NativeType("unsigned char *") MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes,
                                    STBIRPixelLayout pixel_type);

    @Entrypoint("stbir_resize_uint8_linear")
    @NativeType("float *")
    MemorySegment resizeFloatLinear(@NativeType("const float *") MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes,
                                    @NativeType("float *") MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes,
                                    STBIRPixelLayout pixel_type);

    //===============================================================
    // Medium-complexity API
    //
    // This extends the easy-to-use API as follows:
    //
    //     * Can specify the datatype - U8, U8_SRGB, U16, FLOAT, HALF_FLOAT
    //     * Edge wrap can selected explicitly
    //     * Filter can be selected explicitly
    //--------------------------------

    // medium api
    @Entrypoint("stbir_resize")
    @NativeType("void *")
    MemorySegment resize(@NativeType("const void *") MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes,
                         @NativeType("void *") MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes,
                         STBIRPixelLayout pixel_layout, STBIRDatatype data_type,
                         STBIREdge edge, STBIRFilter filter);

    //===============================================================
    // Extended-complexity API
    //
    // This API exposes all resize functionality.
    //
    //     * Separate filter types for each axis
    //     * Separate edge modes for each axis
    //     * Separate input and output data types
    //     * Can specify regions with subpixel correctness
    //     * Can specify alpha flags
    //     * Can specify a memory callback
    //     * Can specify a callback data type for pixel input and output
    //     * Can be threaded for a single resize
    //     * Can be used to resize many frames without recalculating the sampler info
    //
    //  Use this API as follows:
    //     1) Call the stbir_resize_init function on a local STBIR_RESIZE structure
    //     2) Call any of the stbir_set functions
    //     3) Optionally call stbir_build_samplers() if you are going to resample multiple times
    //        with the same input and output dimensions (like resizing video frames)
    //     4) Resample by calling stbir_resize_extended().
    //     5) Call stbir_free_samplers() if you called stbir_build_samplers()
    //--------------------------------

    /**
     * First off, you must ALWAYS call stbir_resize_init on your resize structure before any of the other calls!
     *
     * @param resize                 resize
     * @param input_pixels           input_pixels
     * @param input_w                input_w
     * @param input_h                input_h
     * @param input_stride_in_bytes  input_stride_in_bytes, stride can be zero
     * @param output_pixels          output_pixels
     * @param output_w               output_w
     * @param output_h               output_h
     * @param output_stride_in_bytes output_stride_in_bytes, stride can be zero
     * @param pixel_layout           pixel_layout
     * @param data_type              data_type
     */
    @Entrypoint("stbir_resize_init")
    void resizeInit(STBIRRESIZE resize,
                    @NativeType("const void *") MemorySegment input_pixels, int input_w, int input_h, int input_stride_in_bytes,
                    @NativeType("void *") MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes,
                    STBIRPixelLayout pixel_layout, STBIRDatatype data_type);

    @Entrypoint("stbir_set_datatypes")
    void setDatatypes(STBIRRESIZE resize, STBIRDatatype input_type, STBIRDatatype output_type);

    /**
     * no callbacks by default
     *
     * @param resize    resize
     * @param input_cb  input_cb
     * @param output_cb output_cb
     */
    @Entrypoint("stbir_set_pixel_callbacks")
    void setPixelCallbacks(STBIRRESIZE resize, STBIRInputCallback input_cb, STBIROutputCallback output_cb);

    /**
     * pass back STBIR_RESIZE* by default
     *
     * @param resize    resize
     * @param user_data user_data
     */
    @Entrypoint("stbir_set_user_data")
    void setUserData(STBIRRESIZE resize, @NativeType("void *") MemorySegment user_data);

    @Entrypoint("stbir_set_buffer_ptrs")
    void setBufferPtrs(STBIRRESIZE resize, @NativeType("const void *") MemorySegment input_pixels, int input_stride_in_bytes, @NativeType("void *") MemorySegment output_pixels, int output_stride_in_bytes);

    //===============================================================
    // If you call any of these functions, you will trigger a sampler rebuild!
    //--------------------------------

    /**
     * sets new buffer layouts
     *
     * @param resize              resize
     * @param input_pixel_layout  input_pixel_layout
     * @param output_pixel_layout output_pixel_layout
     * @return int
     */
    @Entrypoint("stbir_set_pixel_layouts")
    int setPixelLayouts(STBIRRESIZE resize, STBIRPixelLayout input_pixel_layout, STBIRPixelLayout output_pixel_layout);

    /**
     * CLAMP by default
     *
     * @param resize          resize
     * @param horizontal_edge horizontal_edge
     * @param vertical_edge   vertical_edge
     * @return int
     */
    @Entrypoint("stbir_set_edgemodes")
    int setEdgemodes(STBIRRESIZE resize, STBIREdge horizontal_edge, STBIREdge vertical_edge);

    /**
     * STBIR_DEFAULT_FILTER_UPSAMPLE/DOWNSAMPLE by default
     *
     * @param resize            resize
     * @param horizontal_filter horizontal_filter
     * @param vertical_filter   vertical_filter
     * @return int
     */
    @Entrypoint("stbir_set_filters")
    int setFilters(STBIRRESIZE resize, STBIRFilter horizontal_filter, STBIRFilter vertical_filter);

    @Entrypoint("stbir_set_filter_callbacks")
    int setFilterCallbacks(STBIRRESIZE resize, STBIRKernelCallback horizontal_filter, STBIRSupportCallback horizontal_support, STBIRKernelCallback vertical_filter, STBIRSupportCallback vertical_support);

    /**
     * sets both sub-regions (full regions by default)
     *
     * @param resize resize
     * @param subx   subx
     * @param suby   suby
     * @param subw   subw
     * @param subh   subh
     * @return int
     */
    @Entrypoint("stbir_set_pixel_subrect")
    int setPixelSubrect(STBIRRESIZE resize, int subx, int suby, int subw, int subh);

    /**
     * sets input sub-region (full region by default)
     *
     * @param resize resize
     * @param s0     s0
     * @param t0     t0
     * @param s1     s1
     * @param t1     t1
     * @return int
     */
    @Entrypoint("stbir_set_input_subrect")
    int setInputSubrect(STBIRRESIZE resize, double s0, double t0, double s1, double t1);

    /**
     * sets output sub-region (full region by default)
     *
     * @param resize resize
     * @param subx   subx
     * @param suby   suby
     * @param subw   subw
     * @param subh   subh
     * @return int
     */
    @Entrypoint("stbir_set_output_pixel_subrect")
    int setOutputPixelSubrect(STBIRRESIZE resize, int subx, int suby, int subw, int subh);

    /**
     * when inputting AND outputting non-premultiplied alpha pixels, we use a slower but higher quality technique
     * that fills the zero alpha pixel's RGB values with something plausible.
     * If you don't care about areas of
     * zero alpha, you can call this function to get about a 25% speed improvement for STBIR_RGBA to STBIR_RGBA
     * types of resizes.
     *
     * @param resize                           resize
     * @param non_pma_alpha_speed_over_quality non_pma_alpha_speed_over_quality
     * @return int
     */
    @Entrypoint("stbir_set_non_pm_alpha_speed_over_quality")
    int setNonPmAlphaSpeedOverQuality(STBIRRESIZE resize, int non_pma_alpha_speed_over_quality);

    //===============================================================
    // You can call build_samplers to prebuild all the internal data we need to resample.
    //   Then, if you call resize_extended many times with the same resize, you only pay the
    //   cost once.
    // If you do call build_samplers, you MUST call free_samplers eventually.
    //--------------------------------

    /**
     * This builds the samplers and does one allocation
     *
     * @param resize resize
     * @return int
     */
    @Entrypoint("stbir_build_samplers")
    int buildSamplers(STBIRRESIZE resize);

    /**
     * You MUST call this, if you call stbir_build_samplers or stbir_build_samplers_with_splits
     *
     * @param resize resize
     */
    @Entrypoint("stbir_free_samplers")
    void freeSamplers(STBIRRESIZE resize);

    /**
     * And this is the main function to perform the resize synchronously on one thread.
     *
     * @param resize resize
     * @return int
     */
    @Entrypoint("stbir_resize_extended")
    int resizeExtended(STBIRRESIZE resize);

    //===============================================================
    // Use these functions for multithreading.
    //   1) You call stbir_build_samplers_with_splits first on the main thread
    //   2) Then stbir_resize_with_split on each thread
    //   3) stbir_free_samplers when done on the main thread
    //--------------------------------

    /**
     * This will build samplers for threading.
     * You can pass in the number of threads you'd like to use (try_splits).
     * It returns the number of splits (threads) that you can call it with.
     * It might be less if the image resize can't be split up that many ways.
     *
     * @param resize     resize
     * @param try_splits the number of threads you'd like to use
     * @return the number of splits (threads) that you can call it with
     */
    @Entrypoint("stbir_build_samplers_with_splits")
    int buildSamplersWithSplits(STBIRRESIZE resize, int try_splits);

    /**
     * This function does a split of the resizing (you call this fuction for each
     * split, on multiple threads).
     * A split is a piece of the output resize pixel space.
     * <p>
     * Note that you MUST call stbir_build_samplers_with_splits before stbir_resize_extended_split!
     * <p>
     * Usually, you will always call stbir_resize_split with split_start as the thread_index
     * and "1" for the split_count.
     * But, if you have a weird situation where you MIGHT want 8 threads, but sometimes
     * only 4 threads, you can use 0,2,4,6 for the split_start's and use "2" for the
     * split_count each time to turn in into a 4 thread resize. (This is unusual).
     *
     * @param resize      resize
     * @param split_start split_start
     * @param split_count split_count
     * @return int
     */
    @Entrypoint("stbir_resize_extended_split")
    int resizeExtendedSplit(STBIRRESIZE resize, int split_start, int split_count);
}
