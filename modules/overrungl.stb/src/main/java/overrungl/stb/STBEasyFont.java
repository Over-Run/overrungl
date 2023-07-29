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

import overrungl.NativeType;
import overrungl.internal.Checks;
import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
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
 * <h2>Sample Code</h2>
 * Here's sample code for old OpenGL; it's a lot more complicated
 * to make work on modern APIs, and that's your problem.
 * {@snippet lang = java:
 * import java.lang.foreign.Arena;
 * static MemorySegment buffer = Arena.ofAuto().allocate(99999);
 * void printString(float x, float y, String text, float r, float g, float b) {
 *     int numQuads = STBEasyFont.print(x, y, text, MemorySegment.NULL, buffer, (int) buffer.byteSize());
 *     GL10.color3f(r, g, b);
 *     GL11.enableClientState(GL.VERTEX_ARRAY);
 *     GL11.vertexPointer(2, GL.FLOAT, 16, buffer);
 *     GL.drawArrays(GL.QUADS, 0, numQuads * 4);
 *     GL11.disableClientState(GL.VERTEX_ARRAY);
 * }
 * }
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBEasyFont {
    private static MethodHandle
        stb_easy_font_get_spacing, stb_easy_font_spacing, stb_easy_font_print, stb_easy_font_width, stb_easy_font_height;

    static {
        initialize();
        create();
    }

    private STBEasyFont() {
        //no instance
    }

    private static void create() {
        stb_easy_font_get_spacing = downcallTrivial("stb_easy_font_get_spacing", F);
        stb_easy_font_spacing = downcallTrivial("stb_easy_font_spacing", FV);
        stb_easy_font_print = downcall("stb_easy_font_print", FFPPPII);
        stb_easy_font_width = downcallTrivial("stb_easy_font_width", fd_PI);
        stb_easy_font_height = downcallTrivial("stb_easy_font_height", fd_PI);
    }

    /**
     * {@return spacing}
     *
     * @see #setSpacing(float)
     */
    public static float getSpacing() {
        try {
            return (float) stb_easy_font_get_spacing.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Use positive values to expand the space between characters,
     * and small negative values (no smaller than -1.5) to contract
     * the space between characters.
     * <p>
     * E.g. spacing = 1 adds one "pixel" of spacing between the
     * characters.
     * spacing = -1 is reasonable but feels a bit too
     * compact to me; -0.5 is a reasonable compromise as long as
     * you're scaling the font up.
     *
     * @param spacing spacing
     */
    public static void setSpacing(float spacing) {
        try {
            stb_easy_font_spacing.invokeExact(spacing);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Takes a string (which can contain '\n') and fills out a
     * vertex buffer with renderable data to draw the string.
     * Output data assumes increasing x is rightwards, increasing y
     * is downwards.
     * <p>
     * The vertex data is divided into quads, i.e. there are four
     * vertices in the vertex buffer for each quad.
     * <p>
     * The vertices are stored in an interleaved format:
     * <ol>
     *     <li>x:float</li>
     *     <li>y:float</li>
     *     <li>z:float</li>
     *     <li>color:uint8[4]</li>
     * </ol>
     * <p>
     * You can ignore z and color if you get them from elsewhere.
     * This format was chosen in the hopes it would make it
     * easier for you to reuse existing vertex-buffer-drawing code.
     * <p>
     * If the buffer isn't large enough, it will truncate.
     * Expect it to use an average of ~270 bytes per character.
     * <p>
     * If your API doesn't draw quads, build a reusable index
     * list that allows you to render quads as indexed triangles.
     *
     * @param x            x
     * @param y            y
     * @param text         text
     * @param color        If you pass in NULL for color, it becomes 255,255,255,255.
     * @param vertexBuffer vertex buffer
     * @param vbufSize     buffer size
     * @return the number of quads.
     */
    public static int nprint(float x, float y, @NativeType("char*") MemorySegment text, @NativeType("unsigned char[4]") MemorySegment color, @NativeType("void*") MemorySegment vertexBuffer, int vbufSize) {
        try {
            return (int) stb_easy_font_print.invokeExact(x, y, text, color, vertexBuffer, vbufSize);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Takes a string (which can contain '\n') and fills out a
     * vertex buffer with renderable data to draw the string.
     *
     * @param x            x
     * @param y            y
     * @param text         text
     * @param color        If you pass in NULL for color, it becomes 255,255,255,255.
     * @param vertexBuffer vertex buffer
     * @param vbufSize     buffer size
     * @return the number of quads.
     * @see #nprint(float, float, MemorySegment, MemorySegment, MemorySegment, int) nprint
     */
    public static int print(float x, float y, String text, byte[] color, @NativeType("void*") MemorySegment vertexBuffer, int vbufSize) {
        if (color != null && RuntimeHelper.CHECKS) {
            Checks.arraySize(color, 4);
        }
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return nprint(x, y, stack.allocateUtf8String(text), color == null ? MemorySegment.NULL : stack.bytes(color), vertexBuffer, vbufSize);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Takes a string and returns the horizontal size (which can vary if 'text' has newlines).
     *
     * @param text the text.
     * @return the size.
     */
    public static int nwidth(@NativeType("char*") MemorySegment text) {
        try {
            return (int) stb_easy_font_width.invokeExact(text);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Takes a string and returns the horizontal size (which can vary if 'text' has newlines).
     *
     * @param text the text.
     * @return the size.
     * @see #nwidth(MemorySegment) nwidth
     */
    public static int width(String text) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return nwidth(stack.allocateUtf8String(text));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Takes a string and returns the vertical size (which can vary if 'text' has newlines).
     *
     * @param text the text.
     * @return the size.
     */
    public static int nheight(@NativeType("char*") MemorySegment text) {
        try {
            return (int) stb_easy_font_height.invokeExact(text);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Takes a string and returns the vertical size (which can vary if 'text' has newlines).
     *
     * @param text the text.
     * @return the size.
     * @see #nheight(MemorySegment) nheight
     */
    public static int height(String text) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return nheight(stack.allocateUtf8String(text));
        } finally {
            stack.setPointer(stackPointer);
        }
    }
}
