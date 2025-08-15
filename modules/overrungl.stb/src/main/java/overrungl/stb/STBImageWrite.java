/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;

/// [stb_image_write.h](https://github.com/nothings/stb/blob/master/stb_image_write.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBImageWrite {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbi_write_png`.
        public static final MethodHandle MH_stbi_write_png = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_write_bmp`.
        public static final MethodHandle MH_stbi_write_bmp = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_tga`.
        public static final MethodHandle MH_stbi_write_tga = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_hdr`.
        public static final MethodHandle MH_stbi_write_hdr = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_jpg`.
        public static final MethodHandle MH_stbi_write_jpg = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_write_png_to_func`.
        public static final MethodHandle MH_stbi_write_png_to_func = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_write_bmp_to_func`.
        public static final MethodHandle MH_stbi_write_bmp_to_func = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_tga_to_func`.
        public static final MethodHandle MH_stbi_write_tga_to_func = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_hdr_to_func`.
        public static final MethodHandle MH_stbi_write_hdr_to_func = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_jpg_to_func`.
        public static final MethodHandle MH_stbi_write_jpg_to_func = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_flip_vertically_on_write`.
        public static final MethodHandle MH_stbi_flip_vertically_on_write = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The function address of `stbi_write_png`.
        public final MemorySegment PFN_stbi_write_png;
        /// The function address of `stbi_write_bmp`.
        public final MemorySegment PFN_stbi_write_bmp;
        /// The function address of `stbi_write_tga`.
        public final MemorySegment PFN_stbi_write_tga;
        /// The function address of `stbi_write_hdr`.
        public final MemorySegment PFN_stbi_write_hdr;
        /// The function address of `stbi_write_jpg`.
        public final MemorySegment PFN_stbi_write_jpg;
        /// The function address of `stbi_write_png_to_func`.
        public final MemorySegment PFN_stbi_write_png_to_func;
        /// The function address of `stbi_write_bmp_to_func`.
        public final MemorySegment PFN_stbi_write_bmp_to_func;
        /// The function address of `stbi_write_tga_to_func`.
        public final MemorySegment PFN_stbi_write_tga_to_func;
        /// The function address of `stbi_write_hdr_to_func`.
        public final MemorySegment PFN_stbi_write_hdr_to_func;
        /// The function address of `stbi_write_jpg_to_func`.
        public final MemorySegment PFN_stbi_write_jpg_to_func;
        /// The function address of `stbi_flip_vertically_on_write`.
        public final MemorySegment PFN_stbi_flip_vertically_on_write;

        private Handles() {
            var _lookup = STBLibrary.lookup();
            PFN_stbi_write_png = _lookup.findOrThrow("stbi_write_png");
            PFN_stbi_write_bmp = _lookup.findOrThrow("stbi_write_bmp");
            PFN_stbi_write_tga = _lookup.findOrThrow("stbi_write_tga");
            PFN_stbi_write_hdr = _lookup.findOrThrow("stbi_write_hdr");
            PFN_stbi_write_jpg = _lookup.findOrThrow("stbi_write_jpg");
            PFN_stbi_write_png_to_func = _lookup.findOrThrow("stbi_write_png_to_func");
            PFN_stbi_write_bmp_to_func = _lookup.findOrThrow("stbi_write_bmp_to_func");
            PFN_stbi_write_tga_to_func = _lookup.findOrThrow("stbi_write_tga_to_func");
            PFN_stbi_write_hdr_to_func = _lookup.findOrThrow("stbi_write_hdr_to_func");
            PFN_stbi_write_jpg_to_func = _lookup.findOrThrow("stbi_write_jpg_to_func");
            PFN_stbi_flip_vertically_on_write = _lookup.findOrThrow("stbi_flip_vertically_on_write");
        }

        public static Handles get() {
            final class Holder {
                static final Handles instance = new Handles();
            }
            return Holder.instance;
        }
    }

    /// ```
    /// int stbi_write_png(char const * filename, int w, int h, int comp, const void* data, int stride_in_bytes);
    /// ```
    public static int stbi_write_png(MemorySegment filename, int w, int h, int comp, MemorySegment data, int stride_in_bytes) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_png", filename, w, h, comp, data, stride_in_bytes); }
        return (int) Handles.MH_stbi_write_png.invokeExact(Handles.get().PFN_stbi_write_png, filename, w, h, comp, data, stride_in_bytes); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_png", e); }
    }

    /// ```
    /// int stbi_write_bmp(char const * filename, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_bmp(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_bmp", filename, w, h, comp, data); }
        return (int) Handles.MH_stbi_write_bmp.invokeExact(Handles.get().PFN_stbi_write_bmp, filename, w, h, comp, data); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_bmp", e); }
    }

    /// ```
    /// int stbi_write_tga(char const * filename, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_tga(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_tga", filename, w, h, comp, data); }
        return (int) Handles.MH_stbi_write_tga.invokeExact(Handles.get().PFN_stbi_write_tga, filename, w, h, comp, data); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_tga", e); }
    }

    /// ```
    /// int stbi_write_hdr(char const * filename, int w, int h, int comp, const float* data);
    /// ```
    public static int stbi_write_hdr(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_hdr", filename, w, h, comp, data); }
        return (int) Handles.MH_stbi_write_hdr.invokeExact(Handles.get().PFN_stbi_write_hdr, filename, w, h, comp, data); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_hdr", e); }
    }

    /// ```
    /// int stbi_write_jpg(char const * filename, int x, int y, int comp, const void* data, int quality);
    /// ```
    public static int stbi_write_jpg(MemorySegment filename, int x, int y, int comp, MemorySegment data, int quality) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_jpg", filename, x, y, comp, data, quality); }
        return (int) Handles.MH_stbi_write_jpg.invokeExact(Handles.get().PFN_stbi_write_jpg, filename, x, y, comp, data, quality); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_jpg", e); }
    }

    /// ```
    /// int stbi_write_png_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data, int stride_in_bytes);
    /// ```
    public static int stbi_write_png_to_func(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data, int stride_in_bytes) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_png_to_func", func, context, w, h, comp, data, stride_in_bytes); }
        return (int) Handles.MH_stbi_write_png_to_func.invokeExact(Handles.get().PFN_stbi_write_png_to_func, func, context, w, h, comp, data, stride_in_bytes); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_png_to_func", e); }
    }

    /// ```
    /// int stbi_write_bmp_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_bmp_to_func(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_bmp_to_func", func, context, w, h, comp, data); }
        return (int) Handles.MH_stbi_write_bmp_to_func.invokeExact(Handles.get().PFN_stbi_write_bmp_to_func, func, context, w, h, comp, data); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_bmp_to_func", e); }
    }

    /// ```
    /// int stbi_write_tga_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_tga_to_func(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_tga_to_func", func, context, w, h, comp, data); }
        return (int) Handles.MH_stbi_write_tga_to_func.invokeExact(Handles.get().PFN_stbi_write_tga_to_func, func, context, w, h, comp, data); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_tga_to_func", e); }
    }

    /// ```
    /// int stbi_write_hdr_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const float* data);
    /// ```
    public static int stbi_write_hdr_to_func(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_hdr_to_func", func, context, w, h, comp, data); }
        return (int) Handles.MH_stbi_write_hdr_to_func.invokeExact(Handles.get().PFN_stbi_write_hdr_to_func, func, context, w, h, comp, data); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_hdr_to_func", e); }
    }

    /// ```
    /// int stbi_write_jpg_to_func(stbi_write_func* func, void* context, int x, int y, int comp, const void* data, int quality);
    /// ```
    public static int stbi_write_jpg_to_func(MemorySegment func, MemorySegment context, int x, int y, int comp, MemorySegment data, int quality) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_write_jpg_to_func", func, context, x, y, comp, data, quality); }
        return (int) Handles.MH_stbi_write_jpg_to_func.invokeExact(Handles.get().PFN_stbi_write_jpg_to_func, func, context, x, y, comp, data, quality); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_write_jpg_to_func", e); }
    }

    /// ```
    /// void stbi_flip_vertically_on_write(int flip_boolean);
    /// ```
    public static void stbi_flip_vertically_on_write(int flip_boolean) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stbi_flip_vertically_on_write", flip_boolean); }
        Handles.MH_stbi_flip_vertically_on_write.invokeExact(Handles.get().PFN_stbi_flip_vertically_on_write, flip_boolean); }
        catch (Throwable e) { throw new RuntimeException("error in stbi_flip_vertically_on_write", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBImageWrite() {
    }

    public static MemorySegment stbi_write_tga_with_rle() {
        return GlobalVariables.stbi_write_tga_with_rle;
    }

    public static MemorySegment stbi_write_png_compression_level() {
        return GlobalVariables.stbi_write_png_compression_level;
    }

    public static MemorySegment stbi_write_force_png_filter() {
        return GlobalVariables.stbi_write_force_png_filter;
    }

    static final class GlobalVariables {
        static final MemorySegment stbi_write_tga_with_rle,
            stbi_write_png_compression_level,
            stbi_write_force_png_filter;

        static {
            stbi_write_tga_with_rle = STBInternal.findIntOrThrow("stbi_write_tga_with_rle");
            stbi_write_png_compression_level = STBInternal.findIntOrThrow("stbi_write_png_compression_level");
            stbi_write_force_png_filter = STBInternal.findIntOrThrow("stbi_write_force_png_filter");
        }
    }
}
