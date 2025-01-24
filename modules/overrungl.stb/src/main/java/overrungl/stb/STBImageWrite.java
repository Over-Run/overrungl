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

import overrungl.internal.RuntimeHelper;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

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
        public static final MethodHandle MH_stbi_write_png = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_write_bmp`.
        public static final MethodHandle MH_stbi_write_bmp = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_tga`.
        public static final MethodHandle MH_stbi_write_tga = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_hdr`.
        public static final MethodHandle MH_stbi_write_hdr = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_jpg`.
        public static final MethodHandle MH_stbi_write_jpg = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_write_png_to_func`.
        public static final MethodHandle MH_stbi_write_png_to_func = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_write_bmp_to_func`.
        public static final MethodHandle MH_stbi_write_bmp_to_func = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_tga_to_func`.
        public static final MethodHandle MH_stbi_write_tga_to_func = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_hdr_to_func`.
        public static final MethodHandle MH_stbi_write_hdr_to_func = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `stbi_write_jpg_to_func`.
        public static final MethodHandle MH_stbi_write_jpg_to_func = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `stbi_flip_vertically_on_write`.
        public static final MethodHandle MH_stbi_flip_vertically_on_write = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
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
            PFN_stbi_write_png = STBInternal.lookup().findOrThrow("stbi_write_png");
            PFN_stbi_write_bmp = STBInternal.lookup().findOrThrow("stbi_write_bmp");
            PFN_stbi_write_tga = STBInternal.lookup().findOrThrow("stbi_write_tga");
            PFN_stbi_write_hdr = STBInternal.lookup().findOrThrow("stbi_write_hdr");
            PFN_stbi_write_jpg = STBInternal.lookup().findOrThrow("stbi_write_jpg");
            PFN_stbi_write_png_to_func = STBInternal.lookup().findOrThrow("stbi_write_png_to_func");
            PFN_stbi_write_bmp_to_func = STBInternal.lookup().findOrThrow("stbi_write_bmp_to_func");
            PFN_stbi_write_tga_to_func = STBInternal.lookup().findOrThrow("stbi_write_tga_to_func");
            PFN_stbi_write_hdr_to_func = STBInternal.lookup().findOrThrow("stbi_write_hdr_to_func");
            PFN_stbi_write_jpg_to_func = STBInternal.lookup().findOrThrow("stbi_write_jpg_to_func");
            PFN_stbi_flip_vertically_on_write = STBInternal.lookup().findOrThrow("stbi_flip_vertically_on_write");
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

    /// ```
    /// int stbi_write_png(char const * filename, int w, int h, int comp, const void* data, int stride_in_bytes);
    /// ```
    public static int stbi_write_png(MemorySegment filename, int w, int h, int comp, MemorySegment data, int stride_in_bytes) {
        try {
            return (int) Handles.MH_stbi_write_png.invokeExact(Handles.get().PFN_stbi_write_png, filename, w, h, comp, data, stride_in_bytes);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_png", e); }
    }

    /// ```
    /// int stbi_write_bmp(char const * filename, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_bmp(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) Handles.MH_stbi_write_bmp.invokeExact(Handles.get().PFN_stbi_write_bmp, filename, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_bmp", e); }
    }

    /// ```
    /// int stbi_write_tga(char const * filename, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_tga(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) Handles.MH_stbi_write_tga.invokeExact(Handles.get().PFN_stbi_write_tga, filename, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_tga", e); }
    }

    /// ```
    /// int stbi_write_hdr(char const * filename, int w, int h, int comp, const float* data);
    /// ```
    public static int stbi_write_hdr(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) Handles.MH_stbi_write_hdr.invokeExact(Handles.get().PFN_stbi_write_hdr, filename, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_hdr", e); }
    }

    /// ```
    /// int stbi_write_jpg(char const * filename, int x, int y, int comp, const void* data, int quality);
    /// ```
    public static int stbi_write_jpg(MemorySegment filename, int x, int y, int comp, MemorySegment data, int quality) {
        try {
            return (int) Handles.MH_stbi_write_jpg.invokeExact(Handles.get().PFN_stbi_write_jpg, filename, x, y, comp, data, quality);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_jpg", e); }
    }

    /// ```
    /// int stbi_write_png_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data, int stride_in_bytes);
    /// ```
    public static int stbi_write_png_to_func(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data, int stride_in_bytes) {
        try {
            return (int) Handles.MH_stbi_write_png_to_func.invokeExact(Handles.get().PFN_stbi_write_png_to_func, func, context, w, h, comp, data, stride_in_bytes);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_png_to_func", e); }
    }

    /// ```
    /// int stbi_write_bmp_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_bmp_to_func(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) Handles.MH_stbi_write_bmp_to_func.invokeExact(Handles.get().PFN_stbi_write_bmp_to_func, func, context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_bmp_to_func", e); }
    }

    /// ```
    /// int stbi_write_tga_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const void* data);
    /// ```
    public static int stbi_write_tga_to_func(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) Handles.MH_stbi_write_tga_to_func.invokeExact(Handles.get().PFN_stbi_write_tga_to_func, func, context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_tga_to_func", e); }
    }

    /// ```
    /// int stbi_write_hdr_to_func(stbi_write_func* func, void* context, int w, int h, int comp, const float* data);
    /// ```
    public static int stbi_write_hdr_to_func(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) Handles.MH_stbi_write_hdr_to_func.invokeExact(Handles.get().PFN_stbi_write_hdr_to_func, func, context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_hdr_to_func", e); }
    }

    /// ```
    /// int stbi_write_jpg_to_func(stbi_write_func* func, void* context, int x, int y, int comp, const void* data, int quality);
    /// ```
    public static int stbi_write_jpg_to_func(MemorySegment func, MemorySegment context, int x, int y, int comp, MemorySegment data, int quality) {
        try {
            return (int) Handles.MH_stbi_write_jpg_to_func.invokeExact(Handles.get().PFN_stbi_write_jpg_to_func, func, context, x, y, comp, data, quality);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_jpg_to_func", e); }
    }

    /// ```
    /// void stbi_flip_vertically_on_write(int flip_boolean);
    /// ```
    public static void stbi_flip_vertically_on_write(int flip_boolean) {
        try {
            Handles.MH_stbi_flip_vertically_on_write.invokeExact(Handles.get().PFN_stbi_flip_vertically_on_write, flip_boolean);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_flip_vertically_on_write", e); }
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
