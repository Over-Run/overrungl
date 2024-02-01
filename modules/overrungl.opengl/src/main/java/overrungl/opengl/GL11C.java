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
import overrun.marshal.MemoryStack;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

/**
 * The OpenGL 1.1 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL11C extends GL10C permits GL11, GL12C {
    int COLOR_LOGIC_OP = 0x0BF2;
    int POLYGON_OFFSET_UNITS = 0x2A00;
    int POLYGON_OFFSET_POINT = 0x2A01;
    int POLYGON_OFFSET_LINE = 0x2A02;
    int POLYGON_OFFSET_FILL = 0x8037;
    int POLYGON_OFFSET_FACTOR = 0x8038;
    int TEXTURE_BINDING_1D = 0x8068;
    int TEXTURE_BINDING_2D = 0x8069;
    int TEXTURE_INTERNAL_FORMAT = 0x1003;
    int TEXTURE_RED_SIZE = 0x805C;
    int TEXTURE_GREEN_SIZE = 0x805D;
    int TEXTURE_BLUE_SIZE = 0x805E;
    int TEXTURE_ALPHA_SIZE = 0x805F;
    int DOUBLE = 0x140A;
    int PROXY_TEXTURE_1D = 0x8063;
    int PROXY_TEXTURE_2D = 0x8064;
    int R3_G3_B2 = 0x2A10;
    int RGB4 = 0x804F;
    int RGB5 = 0x8050;
    int RGB8 = 0x8051;
    int RGB10 = 0x8052;
    int RGB12 = 0x8053;
    int RGB16 = 0x8054;
    int RGBA2 = 0x8055;
    int RGBA4 = 0x8056;
    int RGB5_A1 = 0x8057;
    int RGBA8 = 0x8058;
    int RGB10_A2 = 0x8059;
    int RGBA12 = 0x805A;
    int RGBA16 = 0x805B;
    int VERTEX_ARRAY = 0x8074;

    @Entrypoint("glBindTexture")
    default void bindTexture(int target, int texture) {
        throw new ContextException();
    }

    @Entrypoint("glCopyTexImage1D")
    default void copyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
        throw new ContextException();
    }

    @Entrypoint("glCopyTexImage2D")
    default void copyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
        throw new ContextException();
    }

    @Entrypoint("glCopyTexSubImage1D")
    default void copyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        throw new ContextException();
    }

    @Entrypoint("glCopyTexSubImage2D")
    default void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glDeleteTextures")
    default void deleteTextures(int n, MemorySegment textures) {
        throw new ContextException();
    }

    @Skip
    default void deleteTextures(int... textures) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            deleteTextures(textures.length, Marshal.marshal(stack, textures));
        }
    }

    @Entrypoint("glDrawArrays")
    default void drawArrays(int mode, int first, int count) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElements")
    default void drawElements(int mode, int count, int type, MemorySegment indices) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElements")
    default void drawElements(SegmentAllocator allocator, int mode, int count, int type, byte[] indices) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElements")
    default void drawElements(SegmentAllocator allocator, int mode, int count, int type, short[] indices) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElements")
    default void drawElements(SegmentAllocator allocator, int mode, int count, int type, int[] indices) {
        throw new ContextException();
    }

    @Entrypoint("glGenTextures")
    default void genTextures(int n, MemorySegment textures) {
        throw new ContextException();
    }

    @Skip
    default void genTextures(SegmentAllocator allocator, @Ref int[] textures) {
        var pTex = Marshal.marshal(allocator, textures);
        genTextures(textures.length, pTex);
        Unmarshal.copy(pTex, textures);
    }

    @Skip
    default int genTextures() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var pTex = stack.ints(0);
            genTextures(1, pTex);
            return pTex.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetPointerv")
    default void getPointerv(int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default MemorySegment getPointer(int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var pParams = stack.segments(MemorySegment.NULL);
            getPointerv(pname, pParams);
            return pParams.get(ValueLayout.ADDRESS, 0);
        }
    }

    @Entrypoint("glIsTexture")
    default boolean isTexture(int texture) {
        throw new ContextException();
    }

    @Entrypoint("glPolygonOffset")
    default void polygonOffset(float factor, float units) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage1D")
    default void texSubImage1D(int target, int level, int xoffset, int width, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage1D")
    default void texSubImage1D(SegmentAllocator allocator, int target, int level, int xoffset, int width, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage1D")
    default void texSubImage1D(SegmentAllocator allocator, int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage1D")
    default void texSubImage1D(SegmentAllocator allocator, int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage1D")
    default void texSubImage1D(SegmentAllocator allocator, int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage2D")
    default void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage2D")
    default void texSubImage2D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage2D")
    default void texSubImage2D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage2D")
    default void texSubImage2D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage2D")
    default void texSubImage2D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        throw new ContextException();
    }
}
