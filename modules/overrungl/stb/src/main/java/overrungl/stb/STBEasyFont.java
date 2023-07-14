/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.FunctionDescriptors.*;
import static overrungl.stb.Handles.*;

/**
 * Easy-to-deploy,
 * reasonably compact,
 * extremely inefficient performance-wise,
 * crappy-looking,
 * ASCII-only,
 * bitmap font for use in 3D APIs.
 * <p>
 * Intended for when you just want to get some text displaying
 * in a 3D app as quickly as possible.
 * <p>
 * Doesn't use any textures, instead builds characters out of quads.
 *
 * <h2>Sample Code</h2>
 * Here's sample code for old OpenGL; it's a lot more complicated
 * to make work on modern APIs, and that's your problem.
 * <pre>{@code
 * static MemorySegment buffer = allocateNative(99999, SegmentScope.global());
 * void printString(float x, float y, String text, float r, float g, float b) {
 *     int numQuads = STBEasyFont.print(x, y, text, MemorySegment.NULL, buffer, (int) buffer.byteSize());
 *     GL10.color3f(r, g, b);
 *     GL11.enableClientState(GL.VERTEX_ARRAY);
 *     GL11.vertexPointer(2, GL.FLOAT, 16, buffer);
 *     GL.drawArrays(GL.QUADS, 0, numQuads * 4);
 *     GL11.disableClientState(GL.VERTEX_ARRAY);
 * }
 * }</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBEasyFont {
    private static MethodHandle
        stb_easy_font_draw_segs, stb_easy_font_get_spacing, stb_easy_font_spacing, stb_easy_font_print, stb_easy_font_width, stb_easy_font_height;

    static {
        initialize();
        create();
    }

    private STBEasyFont() {
        //no instance
    }

    private static void create() {
        stb_easy_font_draw_segs = downcall("stb_easy_font_draw_segs", FFPIIPPIII);
        stb_easy_font_get_spacing = downcallTrivial("stb_easy_font_get_spacing", F);
        stb_easy_font_spacing = downcallTrivial("stb_easy_font_spacing", FV);
        stb_easy_font_print = downcall("stb_easy_font_print", FFPPPII);
        stb_easy_font_width = downcallTrivial("stb_easy_font_width", fd_PI);
        stb_easy_font_height = downcallTrivial("stb_easy_font_height", fd_PI);
    }

    public static int ndrawSegs(float x, float y, MemorySegment segs, int numSegs, boolean vertical, MemorySegment c, MemorySegment vbuf, int vbufSize, int offset) {
        try {
            return (int) stb_easy_font_draw_segs.invokeExact(x, y, segs, numSegs, vertical ? 1 : 0, c, vbuf, vbufSize, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int drawSegs(SegmentAllocator allocator, float x, float y, byte[] segs, boolean vertical, byte[] c, MemorySegment vbuf, int vbufSize, int offset) {
        return ndrawSegs(x, y, allocator.allocateArray(ValueLayout.JAVA_BYTE, segs), segs.length, vertical, allocator.allocateArray(ValueLayout.JAVA_BYTE, c), vbuf, vbufSize, offset);
    }

    public static float getSpacing() {
        try {
            return (float) stb_easy_font_get_spacing.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setSpacing(float spacing) {
        try {
            stb_easy_font_spacing.invokeExact(spacing);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int nprint(float x, float y, MemorySegment text, MemorySegment color, MemorySegment vertexBuffer, int vbufSize) {
        try {
            return (int) stb_easy_font_print.invokeExact(x, y, text, color, vertexBuffer, vbufSize);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int print(SegmentAllocator allocator, float x, float y, String text, byte[] color, MemorySegment vertexBuffer, int vbufSize) {
        return nprint(x, y, allocator.allocateUtf8String(text), allocator.allocateArray(ValueLayout.JAVA_BYTE, color), vertexBuffer, vbufSize);
    }

    public static int nwidth(MemorySegment text) {
        try {
            return (int) stb_easy_font_width.invokeExact(text);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int width(SegmentAllocator allocator, String text) {
        return nwidth(allocator.allocateUtf8String(text));
    }

    public static int nheight(MemorySegment text) {
        try {
            return (int) stb_easy_font_height.invokeExact(text);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int height(SegmentAllocator allocator, String text) {
        return nheight(allocator.allocateUtf8String(text));
    }
}
