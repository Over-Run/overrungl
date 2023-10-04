/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.stb.Handles.downcall;

/**
 * The STB image resizer.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBImageResize {
    private static final MethodHandle
        stbir_resize = downcall("stbir_resize", PIIIPIIIIIIIIIIIIPI),
        stbir_resize_float = downcall("stbir_resize_float", PIIIPIIIII),
        stbir_resize_float_generic = downcall("stbir_resize_float_generic", PIIIPIIIIIIIIIPI),
        stbir_resize_region = downcall("stbir_resize_region", PIIIPIIIIIIIIIIIIPFFFFI),
        stbir_resize_subpixel = downcall("stbir_resize_subpixel", PIIIPIIIIIIIIIIIIPFFFFI),
        stbir_resize_uint16_generic = downcall("stbir_resize_uint16_generic", PIIIPIIIIIIIIIPI),
        stbir_resize_uint8 = downcall("stbir_resize_uint8", PIIIPIIIII),
        stbir_resize_uint8_generic = downcall("stbir_resize_uint8_generic", PIIIPIIIIIIIIIPI),
        stbir_resize_uint8_srgb = downcall("stbir_resize_uint8_srgb", PIIIPIIIIIII),
        stbir_resize_uint8_srgb_edgemode = downcall("stbir_resize_uint8_srgb_edgemode", PIIIPIIIIIIII);

    private STBImageResize() {
        throw new IllegalStateException("Do not construct instance");
    }

    public static boolean resizeUint8(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                      MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                      int numChannels) {
        try {
            return (int) stbir_resize_uint8.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                numChannels) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeUint8(SegmentAllocator allocator,
                                      byte[] inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                      byte[] outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                      int numChannels) {
        var seg = allocator.allocateArray(JAVA_BYTE, outputPixels.length);
        boolean b = resizeUint8(allocator.allocateArray(JAVA_BYTE, inputPixels), inputW, inputH, inputStrideInBytes,
            seg, outputW, outputH, outputStrideInBytes,
            numChannels);
        RuntimeHelper.toArray(seg, outputPixels);
        return b;
    }

    public static boolean resizeFloat(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                      MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                      int numChannels) {
        try {
            return (int) stbir_resize_float.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                numChannels) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeFloat(SegmentAllocator allocator,
                                      float[] inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                      float[] outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                      int numChannels) {
        var seg = allocator.allocateArray(JAVA_FLOAT, outputPixels.length);
        boolean b = resizeFloat(allocator.allocateArray(JAVA_FLOAT, inputPixels), inputW, inputH, inputStrideInBytes,
            seg, outputW, outputH, outputStrideInBytes,
            numChannels);
        RuntimeHelper.toArray(seg, outputPixels);
        return b;
    }

    public static boolean resizeUint8Srgb(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                          MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                          int numChannels, int alphaChannel, int flags) {
        try {
            return (int) stbir_resize_uint8_srgb.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                numChannels, alphaChannel, flags) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeUint8Srgb(SegmentAllocator allocator,
                                          byte[] inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                          byte[] outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                          int numChannels, int alphaChannel, int flags) {
        var seg = allocator.allocateArray(JAVA_BYTE, outputPixels.length);
        boolean b = resizeUint8Srgb(allocator.allocateArray(JAVA_BYTE, inputPixels), inputW, inputH, inputStrideInBytes,
            seg, outputW, outputH, outputStrideInBytes,
            numChannels, alphaChannel, flags);
        RuntimeHelper.toArray(seg, outputPixels);
        return b;
    }

    public static boolean resizeUint8SrgbEdgemode(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                                  MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                                  int numChannels, int alphaChannel, int flags,
                                                  int edgeWrapMode) {
        try {
            return (int) stbir_resize_uint8_srgb_edgemode.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                numChannels, alphaChannel, flags,
                edgeWrapMode) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeUint8SrgbEdgemode(SegmentAllocator allocator,
                                                  byte[] inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                                  byte[] outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                                  int numChannels, int alphaChannel, int flags,
                                                  STBIREdge edgeWrapMode) {
        var seg = allocator.allocateArray(JAVA_BYTE, outputPixels.length);
        boolean b = resizeUint8SrgbEdgemode(allocator.allocateArray(JAVA_BYTE, inputPixels), inputW, inputH, inputStrideInBytes,
            seg, outputW, outputH, outputStrideInBytes,
            numChannels, alphaChannel, flags,
            edgeWrapMode.getValue());
        RuntimeHelper.toArray(seg, outputPixels);
        return b;
    }

    public static boolean resizeUint8Generic(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                             MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                             int numChannels, int alphaChannel, int flags,
                                             int edgeWrapMode, int filter, int space,
                                             MemorySegment allocContext) {
        try {
            return (int) stbir_resize_uint8_generic.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                numChannels, alphaChannel, flags,
                edgeWrapMode, filter, space,
                allocContext) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeUint8Generic(SegmentAllocator allocator,
                                             byte[] inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                             byte[] outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                             int numChannels, int alphaChannel, int flags,
                                             STBIREdge edgeWrapMode, STBIRFilter filter, STBIRColorspace space,
                                             MemorySegment allocContext) {
        var seg = allocator.allocateArray(JAVA_BYTE, outputPixels.length);
        boolean b = resizeUint8Generic(allocator.allocateArray(JAVA_BYTE, inputPixels), inputW, inputH, inputStrideInBytes,
            seg, outputW, outputH, outputStrideInBytes,
            numChannels, alphaChannel, flags,
            edgeWrapMode.getValue(), filter.getValue(), space.ordinal(),
            allocContext);
        RuntimeHelper.toArray(seg, outputPixels);
        return b;
    }

    public static boolean resizeUint16Generic(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                              MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                              int numChannels, int alphaChannel, int flags,
                                              int edgeWrapMode, int filter, int space,
                                              MemorySegment allocContext) {
        try {
            return (int) stbir_resize_uint16_generic.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                numChannels, alphaChannel, flags,
                edgeWrapMode, filter, space,
                allocContext) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeUint16Generic(SegmentAllocator allocator,
                                              short[] inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                              short[] outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                              int numChannels, int alphaChannel, int flags,
                                              STBIREdge edgeWrapMode, STBIRFilter filter, STBIRColorspace space,
                                              MemorySegment allocContext) {
        var seg = allocator.allocateArray(JAVA_SHORT, outputPixels.length);
        boolean b = resizeUint16Generic(allocator.allocateArray(JAVA_SHORT, inputPixels), inputW, inputH, inputStrideInBytes,
            seg, outputW, outputH, outputStrideInBytes,
            numChannels, alphaChannel, flags,
            edgeWrapMode.getValue(), filter.getValue(), space.ordinal(),
            allocContext);
        RuntimeHelper.toArray(seg, outputPixels);
        return b;
    }

    public static boolean resizeFloatGeneric(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                             MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                             int numChannels, int alphaChannel, int flags,
                                             int edgeWrapMode, int filter, int space,
                                             MemorySegment allocContext) {
        try {
            return (int) stbir_resize_float_generic.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                numChannels, alphaChannel, flags,
                edgeWrapMode, filter, space,
                allocContext) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeFloatGeneric(SegmentAllocator allocator,
                                             float[] inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                             float[] outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                             int numChannels, int alphaChannel, int flags,
                                             STBIREdge edgeWrapMode, STBIRFilter filter, STBIRColorspace space,
                                             MemorySegment allocContext) {
        var seg = allocator.allocateArray(JAVA_FLOAT, outputPixels.length);
        boolean b = resizeFloatGeneric(allocator.allocateArray(JAVA_FLOAT, inputPixels), inputW, inputH, inputStrideInBytes,
            seg, outputW, outputH, outputStrideInBytes,
            numChannels, alphaChannel, flags,
            edgeWrapMode.getValue(), filter.getValue(), space.ordinal(),
            allocContext);
        RuntimeHelper.toArray(seg, outputPixels);
        return b;
    }

    public static boolean resize(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                 MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                 int datatype,
                                 int numChannels, int alphaChannel, int flags,
                                 int edgeModeHorizontal, int edgeModeVertical,
                                 int filterHorizontal, int filterVertical,
                                 int space, MemorySegment allocContext) {
        try {
            return (int) stbir_resize.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                datatype,
                numChannels, alphaChannel, flags,
                edgeModeHorizontal, edgeModeVertical,
                filterHorizontal, filterVertical,
                space, allocContext) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resize(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                 MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                 STBIRDatatype datatype,
                                 int numChannels, int alphaChannel, int flags,
                                 STBIREdge edgeModeHorizontal, STBIREdge edgeModeVertical,
                                 STBIRFilter filterHorizontal, STBIRFilter filterVertical,
                                 STBIRColorspace space, MemorySegment allocContext) {
        return resize(inputPixels, inputW, inputH, inputStrideInBytes,
            outputPixels, outputW, outputH, outputStrideInBytes,
            datatype.ordinal(),
            numChannels, alphaChannel, flags,
            edgeModeHorizontal.getValue(), edgeModeVertical.getValue(),
            filterHorizontal.getValue(), filterVertical.getValue(),
            space.ordinal(), allocContext);
    }

    public static boolean resizeSubpixel(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                         MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                         int datatype,
                                         int numChannels, int alphaChannel, int flags,
                                         int edgeModeHorizontal, int edgeModeVertical,
                                         int filterHorizontal, int filterVertical,
                                         int space, MemorySegment allocContext,
                                         float xScale, float yScale,
                                         float xOffset, float yOffset) {
        try {
            return (int) stbir_resize_subpixel.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                datatype,
                numChannels, alphaChannel, flags,
                edgeModeHorizontal, edgeModeVertical,
                filterHorizontal, filterVertical,
                space, allocContext,
                xScale, yScale,
                xOffset, yOffset) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeSubpixel(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                         MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                         STBIRDatatype datatype,
                                         int numChannels, int alphaChannel, int flags,
                                         STBIREdge edgeModeHorizontal, STBIREdge edgeModeVertical,
                                         STBIRFilter filterHorizontal, STBIRFilter filterVertical,
                                         STBIRColorspace space, MemorySegment allocContext,
                                         float xScale, float yScale,
                                         float xOffset, float yOffset) {
        return resizeSubpixel(inputPixels, inputW, inputH, inputStrideInBytes,
            outputPixels, outputW, outputH, outputStrideInBytes,
            datatype.ordinal(),
            numChannels, alphaChannel, flags,
            edgeModeHorizontal.getValue(), edgeModeVertical.getValue(),
            filterHorizontal.getValue(), filterVertical.getValue(),
            space.ordinal(), allocContext,
            xScale, yScale,
            xOffset, yOffset);
    }

    public static boolean resizeRegion(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                       MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                       int datatype,
                                       int numChannels, int alphaChannel, int flags,
                                       int edgeModeHorizontal, int edgeModeVertical,
                                       int filterHorizontal, int filterVertical,
                                       int space, MemorySegment allocContext,
                                       float s0, float t0, float s1, float t1) {
        try {
            return (int) stbir_resize_region.invokeExact(inputPixels, inputW, inputH, inputStrideInBytes,
                outputPixels, outputW, outputH, outputStrideInBytes,
                datatype,
                numChannels, alphaChannel, flags,
                edgeModeHorizontal, edgeModeVertical,
                filterHorizontal, filterVertical,
                space, allocContext,
                s0, t0, s1, t1) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean resizeRegion(MemorySegment inputPixels, int inputW, int inputH, int inputStrideInBytes,
                                       MemorySegment outputPixels, int outputW, int outputH, int outputStrideInBytes,
                                       STBIRDatatype datatype,
                                       int numChannels, int alphaChannel, int flags,
                                       STBIREdge edgeModeHorizontal, STBIREdge edgeModeVertical,
                                       STBIRFilter filterHorizontal, STBIRFilter filterVertical,
                                       STBIRColorspace space, MemorySegment allocContext,
                                       float s0, float t0, float s1, float t1) {
        return resizeRegion(inputPixels, inputW, inputH, inputStrideInBytes,
            outputPixels, outputW, outputH, outputStrideInBytes,
            datatype.ordinal(),
            numChannels, alphaChannel, flags,
            edgeModeHorizontal.getValue(), edgeModeVertical.getValue(),
            filterHorizontal.getValue(), filterVertical.getValue(),
            space.ordinal(), allocContext,
            s0, t0, s1, t1);
    }
}
