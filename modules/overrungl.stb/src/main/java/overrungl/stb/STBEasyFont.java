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

import org.jspecify.annotations.NonNull;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;

/// [stb_easy_font.h](https://github.com/nothings/stb/blob/master/stb_easy_font.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBEasyFont {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of [`stb_easy_font_get_spacing`][#stb_easy_font_get_spacing].
        public static final MethodHandle MH_stb_easy_font_get_spacing = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT));
        /// The method handle of [`stb_easy_font_spacing`][#stb_easy_font_spacing].
        public static final MethodHandle MH_stb_easy_font_spacing = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of [`stb_easy_font_print`][#stb_easy_font_print].
        public static final MethodHandle MH_stb_easy_font_print = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of [`stb_easy_font_width`][#stb_easy_font_width].
        public static final MethodHandle MH_stb_easy_font_width = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of [`stb_easy_font_height`][#stb_easy_font_height].
        public static final MethodHandle MH_stb_easy_font_height = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The function address of [`stb_easy_font_get_spacing`][#stb_easy_font_get_spacing].
        public final MemorySegment PFN_stb_easy_font_get_spacing;
        /// The function address of [`stb_easy_font_spacing`][#stb_easy_font_spacing].
        public final MemorySegment PFN_stb_easy_font_spacing;
        /// The function address of [`stb_easy_font_print`][#stb_easy_font_print].
        public final MemorySegment PFN_stb_easy_font_print;
        /// The function address of [`stb_easy_font_width`][#stb_easy_font_width].
        public final MemorySegment PFN_stb_easy_font_width;
        /// The function address of [`stb_easy_font_height`][#stb_easy_font_height].
        public final MemorySegment PFN_stb_easy_font_height;

        private Handles() {
            var _lookup = STBLibrary.lookup();
            PFN_stb_easy_font_get_spacing = _lookup.findOrThrow("stb_easy_font_get_spacing");
            PFN_stb_easy_font_spacing = _lookup.findOrThrow("stb_easy_font_spacing");
            PFN_stb_easy_font_print = _lookup.findOrThrow("stb_easy_font_print");
            PFN_stb_easy_font_width = _lookup.findOrThrow("stb_easy_font_width");
            PFN_stb_easy_font_height = _lookup.findOrThrow("stb_easy_font_height");
        }

        /// {@return this}
        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// Invokes `stb_easy_font_get_spacing`.
    /// ```
    /// float stb_easy_font_get_spacing();
    /// ```
    public static float stb_easy_font_get_spacing() {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_easy_font_get_spacing"); }
        return (float) Handles.MH_stb_easy_font_get_spacing.invokeExact(Handles.get().PFN_stb_easy_font_get_spacing); }
        catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_get_spacing", e); }
    }

    /// Invokes `stb_easy_font_spacing`.
    /// ```
    /// void stb_easy_font_spacing(float spacing);
    /// ```
    public static void stb_easy_font_spacing(float spacing) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_easy_font_spacing", spacing); }
        Handles.MH_stb_easy_font_spacing.invokeExact(Handles.get().PFN_stb_easy_font_spacing, spacing); }
        catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_spacing", e); }
    }

    /// Invokes `stb_easy_font_print`.
    /// ```
    /// int stb_easy_font_print(float x, float y, char* text, unsigned char color[4], void* vertex_buffer, int vbuf_size);
    /// ```
    public static int stb_easy_font_print(float x, float y, @NonNull MemorySegment text, @NonNull MemorySegment color, @NonNull MemorySegment vertex_buffer, int vbuf_size) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_easy_font_print", x, y, text, color, vertex_buffer, vbuf_size); }
        return (int) Handles.MH_stb_easy_font_print.invokeExact(Handles.get().PFN_stb_easy_font_print, x, y, text, color, vertex_buffer, vbuf_size); }
        catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_print", e); }
    }

    /// Invokes `stb_easy_font_width`.
    /// ```
    /// int stb_easy_font_width(char* text);
    /// ```
    public static int stb_easy_font_width(@NonNull MemorySegment text) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_easy_font_width", text); }
        return (int) Handles.MH_stb_easy_font_width.invokeExact(Handles.get().PFN_stb_easy_font_width, text); }
        catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_width", e); }
    }

    /// Invokes `stb_easy_font_height`.
    /// ```
    /// int stb_easy_font_height(char* text);
    /// ```
    public static int stb_easy_font_height(@NonNull MemorySegment text) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_easy_font_height", text); }
        return (int) Handles.MH_stb_easy_font_height.invokeExact(Handles.get().PFN_stb_easy_font_height, text); }
        catch (Throwable e) { throw new RuntimeException("error in stb_easy_font_height", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBEasyFont() {
    }
}
