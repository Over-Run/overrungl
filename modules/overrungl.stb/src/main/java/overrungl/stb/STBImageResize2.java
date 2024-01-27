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

import overrun.marshal.Downcall;
import overrun.marshal.gen.Entrypoint;
import overrungl.NativeType;

import java.lang.foreign.MemorySegment;

/**
 * The STB image resizer.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBImageResize2 {
    /**
     * The instance of STBImageResize2.
     */
    STBImageResize2 INSTANCE = Downcall.load(Handles.lookup);

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
    MemorySegment resize(@NativeType("const void *") MemorySegment input_pixels , int input_w , int input_h, int input_stride_in_bytes,
                         @NativeType("void *") MemorySegment output_pixels, int output_w, int output_h, int output_stride_in_bytes,
                         STBIRPixelLayout pixel_layout, STBIRDatatype data_type,
                         STBIREdge edge, STBIRFilter filter );

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
}
