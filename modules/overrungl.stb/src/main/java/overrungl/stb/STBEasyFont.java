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

/// [stb_easy_font.h](https://github.com/nothings/stb/blob/master/stb_easy_font.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBEasyFont {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `stb_easy_font_get_spacing`.
        public static final FunctionDescriptor FD_stb_easy_font_get_spacing = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `stb_easy_font_spacing`.
        public static final FunctionDescriptor FD_stb_easy_font_spacing = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `stb_easy_font_print`.
        public static final FunctionDescriptor FD_stb_easy_font_print = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stb_easy_font_width`.
        public static final FunctionDescriptor FD_stb_easy_font_width = FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `stb_easy_font_height`.
        public static final FunctionDescriptor FD_stb_easy_font_height = FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stb_easy_font_get_spacing`.
        public static final MethodHandle MH_stb_easy_font_get_spacing = RuntimeHelper.downcall(Descriptors.FD_stb_easy_font_get_spacing);
        /// The method handle of `stb_easy_font_spacing`.
        public static final MethodHandle MH_stb_easy_font_spacing = RuntimeHelper.downcall(Descriptors.FD_stb_easy_font_spacing);
        /// The method handle of `stb_easy_font_print`.
        public static final MethodHandle MH_stb_easy_font_print = RuntimeHelper.downcall(Descriptors.FD_stb_easy_font_print);
        /// The method handle of `stb_easy_font_width`.
        public static final MethodHandle MH_stb_easy_font_width = RuntimeHelper.downcall(Descriptors.FD_stb_easy_font_width);
        /// The method handle of `stb_easy_font_height`.
        public static final MethodHandle MH_stb_easy_font_height = RuntimeHelper.downcall(Descriptors.FD_stb_easy_font_height);
        /// The function address of `stb_easy_font_get_spacing`.
        public final MemorySegment PFN_stb_easy_font_get_spacing;
        /// The function address of `stb_easy_font_spacing`.
        public final MemorySegment PFN_stb_easy_font_spacing;
        /// The function address of `stb_easy_font_print`.
        public final MemorySegment PFN_stb_easy_font_print;
        /// The function address of `stb_easy_font_width`.
        public final MemorySegment PFN_stb_easy_font_width;
        /// The function address of `stb_easy_font_height`.
        public final MemorySegment PFN_stb_easy_font_height;
        private Handles() {
            PFN_stb_easy_font_get_spacing = STBInternal.lookup().findOrThrow("stb_easy_font_get_spacing");
            PFN_stb_easy_font_spacing = STBInternal.lookup().findOrThrow("stb_easy_font_spacing");
            PFN_stb_easy_font_print = STBInternal.lookup().findOrThrow("stb_easy_font_print");
            PFN_stb_easy_font_width = STBInternal.lookup().findOrThrow("stb_easy_font_width");
            PFN_stb_easy_font_height = STBInternal.lookup().findOrThrow("stb_easy_font_height");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    public static @CType("float") float stb_easy_font_get_spacing() {
        try {
            return (float) Handles.MH_stb_easy_font_get_spacing.invokeExact(Handles.get().PFN_stb_easy_font_get_spacing);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_get_spacing", e); }
    }

    public static void stb_easy_font_spacing(@CType("float") float spacing) {
        try {
            Handles.MH_stb_easy_font_spacing.invokeExact(Handles.get().PFN_stb_easy_font_spacing, spacing);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_spacing", e); }
    }

    public static @CType("int") int stb_easy_font_print(@CType("float") float x, @CType("float") float y, @CType("char *") java.lang.foreign.MemorySegment text, @CType("unsigned char[4]") java.lang.foreign.MemorySegment color, @CType("void*") java.lang.foreign.MemorySegment vertex_buffer, @CType("int") int vbuf_size) {
        try {
            return (int) Handles.MH_stb_easy_font_print.invokeExact(Handles.get().PFN_stb_easy_font_print, x, y, text, color, vertex_buffer, vbuf_size);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_print", e); }
    }

    public static @CType("int") int stb_easy_font_width(@CType("char *") java.lang.foreign.MemorySegment width) {
        try {
            return (int) Handles.MH_stb_easy_font_width.invokeExact(Handles.get().PFN_stb_easy_font_width, width);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_width", e); }
    }

    public static @CType("int") int stb_easy_font_width(java.lang.String width) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_stb_easy_font_width.invokeExact(Handles.get().PFN_stb_easy_font_width, Marshal.marshal(__overrungl_stack, width));
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_width", e); }
    }

    public static @CType("int") int stb_easy_font_height(@CType("char *") java.lang.foreign.MemorySegment height) {
        try {
            return (int) Handles.MH_stb_easy_font_height.invokeExact(Handles.get().PFN_stb_easy_font_height, height);
        } catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_height", e); }
    }

    public static @CType("int") int stb_easy_font_height(java.lang.String height) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_stb_easy_font_height.invokeExact(Handles.get().PFN_stb_easy_font_height, Marshal.marshal(__overrungl_stack, height));
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
