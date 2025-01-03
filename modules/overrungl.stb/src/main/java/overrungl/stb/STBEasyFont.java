/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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

import org.jetbrains.annotations.Nullable;
import overrungl.annotation.CType;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

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
 * static MemorySegment buffer = Arena.ofAuto().allocate(99999); // ~500 chars
 * void printString(GL gl, float x, float y, String text, float r, float g, float b) {
 *     int numQuads = stb_easy_font_print(x, y, text, MemorySegment.NULL, buffer, (int) buffer.byteSize());
 *     gl.Color3f(r, g, b);
 *     gl.EnableClientState(GL_VERTEX_ARRAY);
 *     gl.VertexPointer(2, GL_FLOAT, 16, buffer);
 *     gl.DrawArrays(GL_QUADS, 0, numQuads * 4);
 *     gl.DisableClientState(GL_VERTEX_ARRAY);
 * }
 *}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBEasyFont {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `stb_easy_font_get_spacing`.
        public static final MethodHandle MH_stb_easy_font_get_spacing = RuntimeHelper.downcall(STBInternal.lookup(), "stb_easy_font_get_spacing", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stb_easy_font_spacing`.
        public static final MethodHandle MH_stb_easy_font_spacing = RuntimeHelper.downcall(STBInternal.lookup(), "stb_easy_font_spacing", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `stb_easy_font_print`.
        public static final MethodHandle MH_stb_easy_font_print = RuntimeHelper.downcall(STBInternal.lookup(), "stb_easy_font_print", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stb_easy_font_width`.
        public static final MethodHandle MH_stb_easy_font_width = RuntimeHelper.downcall(STBInternal.lookup(), "stb_easy_font_width", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `stb_easy_font_height`.
        public static final MethodHandle MH_stb_easy_font_height = RuntimeHelper.downcall(STBInternal.lookup(), "stb_easy_font_height", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
    }
    //endregion

    ///{@return `stb_easy_font_spacing_val`}
    public static @CType("float") float stb_easy_font_get_spacing() {
        try {
            return (float) Handles.MH_stb_easy_font_get_spacing.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_get_spacing", e); }
    }

    ///Use positive values to expand the space between characters,
    ///and small negative values (no smaller than -1.5) to contract
    ///the space between characters.
    ///
    ///E.g. spacing = 1 adds one "pixel" of spacing between the
    ///characters. spacing = -1 is reasonable but feels a bit too
    ///compact to me; -0.5 is a reasonable compromise as long as
    ///you're scaling the font up.
    ///@param spacing value
    public static void stb_easy_font_spacing(@CType("float") float spacing) {
        try {
            Handles.MH_stb_easy_font_spacing.invokeExact(spacing);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_spacing", e); }
    }

    ///Takes a string (which can contain '\n') and fills out a
    ///vertex buffer with renderable data to draw the string.
    ///Output data assumes increasing x is rightwards, increasing y
    ///is downwards.
    ///
    ///The vertex data is divided into quads, i.e. there are four
    ///vertices in the vertex buffer for each quad.
    ///
    ///The vertices are stored in an interleaved format:
    ///
    ///- x:`float`
    ///- y:`float`
    ///- z:`float`
    ///- color:`uint8[4]`
    ///
    ///You can ignore z and color if you get them from elsewhere
    ///This format was chosen in the hopes it would make it
    ///easier for you to reuse existing vertex-buffer-drawing code.
    ///
    ///If you pass in NULL for color, it becomes 255,255,255,255.
    ///
    ///If the buffer isn't large enough, it will truncate.
    ///Expect it to use an average of ~270 bytes per character.
    ///
    ///If your API doesn't draw quads, build a reusable index
    ///list that allows you to render quads as indexed triangles.
    ///
    ///@return the number of quads.
    public static @CType("int") int stb_easy_font_print(@CType("float") float x, @CType("float") float y, @CType("char *") java.lang.foreign.MemorySegment text, @CType("unsigned char[4]") java.lang.foreign.MemorySegment color, @CType("void*") java.lang.foreign.MemorySegment vertex_buffer, @CType("int") int vbuf_size) {
        try {
            return (int) Handles.MH_stb_easy_font_print.invokeExact(x, y, text, color, vertex_buffer, vbuf_size);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_print", e); }
    }

    ///Takes a string and returns the horizontal size and the
    ///vertical size (which can vary if 'text' has newlines).
    ///@return the horizontal size
    public static @CType("int") int stb_easy_font_width(@CType("char *") java.lang.foreign.MemorySegment width) {
        try {
            return (int) Handles.MH_stb_easy_font_width.invokeExact(width);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_width", e); }
    }

    ///Takes a string and returns the horizontal size and the
    ///vertical size (which can vary if 'text' has newlines).
    ///@return the horizontal size
    public static @CType("int") int stb_easy_font_width(java.lang.String width) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_stb_easy_font_width.invokeExact(Marshal.marshal(__overrungl_stack, width));
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_width", e); }
    }

    ///Takes a string and returns the horizontal size and the
    ///vertical size (which can vary if 'text' has newlines).
    ///@return the vertical size
    public static @CType("int") int stb_easy_font_height(@CType("char *") java.lang.foreign.MemorySegment height) {
        try {
            return (int) Handles.MH_stb_easy_font_height.invokeExact(height);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_height", e); }
    }

    ///Takes a string and returns the horizontal size and the
    ///vertical size (which can vary if 'text' has newlines).
    ///@return the vertical size
    public static @CType("int") int stb_easy_font_height(java.lang.String height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_stb_easy_font_height.invokeExact(Marshal.marshal(__overrungl_stack, height));
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_height", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBEasyFont() {
    }

    /// Overloads [stb_easy_font_print][#stb_easy_font_print(float, float, MemorySegment, MemorySegment, MemorySegment, int)]
    public static int stb_easy_font_print(float x, float y, String text, byte @Nullable [] color, MemorySegment vertex_buffer) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return stb_easy_font_print(x, y, Marshal.marshal(stack, text), Marshal.marshal(stack, color), vertex_buffer, Math.toIntExact(vertex_buffer.byteSize()));
        }
    }
}
