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

import overrun.marshal.DirectAccess;
import overrun.marshal.gen.Entrypoint;
import overrungl.opengl.ext.arb.GLARBWindowPos;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/**
 * The OpenGL 1.4 functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBWindowPos GL_ARB_window_pos}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL14 extends DirectAccess {
    @Entrypoint("glFogCoordPointer")
    default void fogCoordPointer(int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glFogCoordPointer")
    default void fogCoordPointer(SegmentAllocator allocator, int type, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glFogCoordPointer")
    default void fogCoordPointer(SegmentAllocator allocator, int type, int stride, double[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glFogCoordd")
    default void fogCoordd(double coord) {
        throw new ContextException();
    }

    @Entrypoint("glFogCoorddv")
    default void fogCoorddv(MemorySegment coord) {
        throw new ContextException();
    }

    @Entrypoint("glFogCoorddv")
    default void fogCoorddv(SegmentAllocator allocator, double[] coord) {
        throw new ContextException();
    }

    @Entrypoint("glFogCoordf")
    default void fogCoordf(float coord) {
        throw new ContextException();
    }

    @Entrypoint("glFogCoordfv")
    default void fogCoordfv(MemorySegment coord) {
        throw new ContextException();
    }

    @Entrypoint("glFogCoordfv")
    default void fogCoordfv(SegmentAllocator allocator, float[] coord) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3b")
    default void secondaryColor3b(byte red, byte green, byte blue) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3bv")
    default void secondaryColor3bv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3bv")
    default void secondaryColor3bv(SegmentAllocator allocator, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3d")
    default void secondaryColor3d(double red, double green, double blue) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3dv")
    default void secondaryColor3dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3dv")
    default void secondaryColor3dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3f")
    default void secondaryColor3f(float red, float green, float blue) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3fv")
    default void secondaryColor3fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3fv")
    default void secondaryColor3fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3i")
    default void secondaryColor3i(int red, int green, int blue) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3iv")
    default void secondaryColor3iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3iv")
    default void secondaryColor3iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3s")
    default void secondaryColor3s(short red, short green, short blue) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3sv")
    default void secondaryColor3sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3sv")
    default void secondaryColor3sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3ub")
    default void secondaryColor3ub(byte red, byte green, byte blue) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3ubv")
    default void secondaryColor3ubv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3ubv")
    default void secondaryColor3ubv(SegmentAllocator allocator, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3ui")
    default void secondaryColor3ui(int red, int green, int blue) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3uiv")
    default void secondaryColor3uiv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3uiv")
    default void secondaryColor3uiv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3us")
    default void secondaryColor3us(short red, short green, short blue) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3usv")
    default void secondaryColor3usv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColor3usv")
    default void secondaryColor3usv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColorPointer")
    default void secondaryColorPointer(int size, int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColorPointer")
    default void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, byte[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColorPointer")
    default void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColorPointer")
    default void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, int[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColorPointer")
    default void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glSecondaryColorPointer")
    default void secondaryColorPointer(SegmentAllocator allocator, int size, int type, int stride, double[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2d")
    default void windowPos2d(double x, double y) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2dv")
    default void windowPos2dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2dv")
    default void windowPos2dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2f")
    default void windowPos2f(float x, float y) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2fv")
    default void windowPos2fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2fv")
    default void windowPos2fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2i")
    default void windowPos2i(int x, int y) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2iv")
    default void windowPos2iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2iv")
    default void windowPos2iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2s")
    default void windowPos2s(short x, short y) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2sv")
    default void windowPos2sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos2sv")
    default void windowPos2sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3d")
    default void windowPos3d(double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3dv")
    default void windowPos3dv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3dv")
    default void windowPos3dv(SegmentAllocator allocator, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3f")
    default void windowPos3f(float x, float y, float z) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3fv")
    default void windowPos3fv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3fv")
    default void windowPos3fv(SegmentAllocator allocator, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3i")
    default void windowPos3i(int x, int y, int z) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3iv")
    default void windowPos3iv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3iv")
    default void windowPos3iv(SegmentAllocator allocator, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3s")
    default void windowPos3s(short x, short y, short z) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3sv")
    default void windowPos3sv(MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glWindowPos3sv")
    default void windowPos3sv(SegmentAllocator allocator, short[] v) {
        throw new ContextException();
    }
}
