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

package overrungl.opengl;

import overrun.marshal.Marshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBPointParameters;
import overrungl.opengl.ext.arb.GLARBShadow;
import overrungl.opengl.ext.arb.GLARBTextureMirroredRepeat;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.ADDRESS;

/**
 * The OpenGL 1.4 forward compatible functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_imaging</li>
 *     <li>{@linkplain GLARBPointParameters GL_ARB_point_parameters}</li>
 *     <li>{@linkplain GLARBShadow GL_ARB_shadow}</li>
 *     <li>{@linkplain GLARBTextureMirroredRepeat GL_ARB_texture_mirrored_repeat}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL14C extends GL13C permits GL14, GL15C {
    int BLEND_DST_RGB = 0x80C8;
    int BLEND_SRC_RGB = 0x80C9;
    int BLEND_DST_ALPHA = 0x80CA;
    int BLEND_SRC_ALPHA = 0x80CB;
    int POINT_FADE_THRESHOLD_SIZE = 0x8128;
    int DEPTH_COMPONENT16 = 0x81A5;
    int DEPTH_COMPONENT24 = 0x81A6;
    int DEPTH_COMPONENT32 = 0x81A7;
    int MIRRORED_REPEAT = 0x8370;
    int MAX_TEXTURE_LOD_BIAS = 0x84FD;
    int TEXTURE_LOD_BIAS = 0x8501;
    int INCR_WRAP = 0x8507;
    int DECR_WRAP = 0x8508;
    int TEXTURE_DEPTH_SIZE = 0x884A;
    int TEXTURE_COMPARE_MODE = 0x884C;
    int TEXTURE_COMPARE_FUNC = 0x884D;
    int BLEND_COLOR = 0x8005;
    int BLEND_EQUATION = 0x8009;
    int CONSTANT_COLOR = 0x8001;
    int ONE_MINUS_CONSTANT_COLOR = 0x8002;
    int CONSTANT_ALPHA = 0x8003;
    int ONE_MINUS_CONSTANT_ALPHA = 0x8004;
    int FUNC_ADD = 0x8006;
    int FUNC_REVERSE_SUBTRACT = 0x800B;
    int FUNC_SUBTRACT = 0x800A;
    int MIN = 0x8007;
    int MAX = 0x8008;

    @Entrypoint("glBlendColor")
    default void blendColor(float red, float green, float blue, float alpha) {
        throw new ContextException();
    }

    @Entrypoint("glBlendEquation")
    default void blendEquation(int mode) {
        throw new ContextException();
    }

    @Entrypoint("glBlendFuncSeparate")
    default void blendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawArrays")
    default void multiDrawArrays(int mode, MemorySegment first, MemorySegment count, int drawCount) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawArrays")
    default void multiDrawArrays(SegmentAllocator allocator, int mode, int[] first, int[] count, int drawCount) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawElements")
    default void multiDrawElements(int mode, MemorySegment count, int type, MemorySegment indices, int drawCount) {
        throw new ContextException();
    }

    @Skip
    default void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, byte[][] indices, int drawCount) {
        var seg = allocator.allocate(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, Marshal.marshal(allocator, indices[i]));
        }
        multiDrawElements(mode, Marshal.marshal(allocator, count), type, seg, drawCount);
    }

    @Skip
    default void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, short[][] indices, int drawCount) {
        var seg = allocator.allocate(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, Marshal.marshal(allocator, indices[i]));
        }
        multiDrawElements(mode, Marshal.marshal(allocator, count), type, seg, drawCount);
    }

    @Skip
    default void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, int[][] indices, int drawCount) {
        var seg = allocator.allocate(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, Marshal.marshal(allocator, indices[i]));
        }
        multiDrawElements(mode, Marshal.marshal(allocator, count), type, seg, drawCount);
    }

    @Entrypoint("glPointParameterf")
    default void pointParameterf(int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glPointParameterfv")
    default void pointParameterfv(int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glPointParameterfv")
    default void pointParameterfv(SegmentAllocator allocator, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glPointParameteri")
    default void pointParameteri(int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glPointParameteriv")
    default void pointParameteriv(int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glPointParameteriv")
    default void pointParameteriv(SegmentAllocator allocator, int pname, int[] params) {
        throw new ContextException();
    }
}
