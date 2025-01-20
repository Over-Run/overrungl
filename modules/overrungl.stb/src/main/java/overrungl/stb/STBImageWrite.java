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

import overrungl.annotation.CType;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

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
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `stbi_write_png`.
        public static final FunctionDescriptor FD_stbi_write_png = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbi_write_bmp`.
        public static final FunctionDescriptor FD_stbi_write_bmp = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stbi_write_tga`.
        public static final FunctionDescriptor FD_stbi_write_tga = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stbi_write_hdr`.
        public static final FunctionDescriptor FD_stbi_write_hdr = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stbi_write_jpg`.
        public static final FunctionDescriptor FD_stbi_write_jpg = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbi_write_png_to_func`.
        public static final FunctionDescriptor FD_stbi_write_png_to_func = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbi_write_bmp_to_func`.
        public static final FunctionDescriptor FD_stbi_write_bmp_to_func = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stbi_write_tga_to_func`.
        public static final FunctionDescriptor FD_stbi_write_tga_to_func = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stbi_write_hdr_to_func`.
        public static final FunctionDescriptor FD_stbi_write_hdr_to_func = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `stbi_write_jpg_to_func`.
        public static final FunctionDescriptor FD_stbi_write_jpg_to_func = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `stbi_flip_vertically_on_write`.
        public static final FunctionDescriptor FD_stbi_flip_vertically_on_write = FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN);
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbi_write_png`.
        public static final MethodHandle MH_stbi_write_png = RuntimeHelper.downcall(Descriptors.FD_stbi_write_png);
        /// The method handle of `stbi_write_bmp`.
        public static final MethodHandle MH_stbi_write_bmp = RuntimeHelper.downcall(Descriptors.FD_stbi_write_bmp);
        /// The method handle of `stbi_write_tga`.
        public static final MethodHandle MH_stbi_write_tga = RuntimeHelper.downcall(Descriptors.FD_stbi_write_tga);
        /// The method handle of `stbi_write_hdr`.
        public static final MethodHandle MH_stbi_write_hdr = RuntimeHelper.downcall(Descriptors.FD_stbi_write_hdr);
        /// The method handle of `stbi_write_jpg`.
        public static final MethodHandle MH_stbi_write_jpg = RuntimeHelper.downcall(Descriptors.FD_stbi_write_jpg);
        /// The method handle of `stbi_write_png_to_func`.
        public static final MethodHandle MH_stbi_write_png_to_func = RuntimeHelper.downcall(Descriptors.FD_stbi_write_png_to_func);
        /// The method handle of `stbi_write_bmp_to_func`.
        public static final MethodHandle MH_stbi_write_bmp_to_func = RuntimeHelper.downcall(Descriptors.FD_stbi_write_bmp_to_func);
        /// The method handle of `stbi_write_tga_to_func`.
        public static final MethodHandle MH_stbi_write_tga_to_func = RuntimeHelper.downcall(Descriptors.FD_stbi_write_tga_to_func);
        /// The method handle of `stbi_write_hdr_to_func`.
        public static final MethodHandle MH_stbi_write_hdr_to_func = RuntimeHelper.downcall(Descriptors.FD_stbi_write_hdr_to_func);
        /// The method handle of `stbi_write_jpg_to_func`.
        public static final MethodHandle MH_stbi_write_jpg_to_func = RuntimeHelper.downcall(Descriptors.FD_stbi_write_jpg_to_func);
        /// The method handle of `stbi_flip_vertically_on_write`.
        public static final MethodHandle MH_stbi_flip_vertically_on_write = RuntimeHelper.downcall(Descriptors.FD_stbi_flip_vertically_on_write);
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

    public static @CType("int") boolean stbi_write_png(@CType("const char*") java.lang.foreign.MemorySegment filename, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data, @CType("int") int stride_in_bytes) {
        try {
            return (boolean) Handles.MH_stbi_write_png.invokeExact(Handles.get().PFN_stbi_write_png, filename, w, h, comp, data, stride_in_bytes);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_png", e); }
    }

    public static @CType("int") boolean stbi_write_png(@CType("const char*") java.lang.String filename, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data, @CType("int") int stride_in_bytes) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_stbi_write_png.invokeExact(Handles.get().PFN_stbi_write_png, Marshal.marshal(__overrungl_stack, filename), w, h, comp, data, stride_in_bytes);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_png", e); }
    }

    public static @CType("int") boolean stbi_write_bmp(@CType("const char*") java.lang.foreign.MemorySegment filename, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_bmp.invokeExact(Handles.get().PFN_stbi_write_bmp, filename, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_bmp", e); }
    }

    public static @CType("int") boolean stbi_write_bmp(@CType("const char*") java.lang.String filename, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_stbi_write_bmp.invokeExact(Handles.get().PFN_stbi_write_bmp, Marshal.marshal(__overrungl_stack, filename), w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_bmp", e); }
    }

    public static @CType("int") boolean stbi_write_tga(@CType("const char*") java.lang.foreign.MemorySegment filename, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_tga.invokeExact(Handles.get().PFN_stbi_write_tga, filename, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_tga", e); }
    }

    public static @CType("int") boolean stbi_write_tga(@CType("const char*") java.lang.String filename, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_stbi_write_tga.invokeExact(Handles.get().PFN_stbi_write_tga, Marshal.marshal(__overrungl_stack, filename), w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_tga", e); }
    }

    public static @CType("int") boolean stbi_write_hdr(@CType("const char*") java.lang.foreign.MemorySegment filename, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_hdr.invokeExact(Handles.get().PFN_stbi_write_hdr, filename, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_hdr", e); }
    }

    public static @CType("int") boolean stbi_write_hdr(@CType("const char*") java.lang.String filename, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_stbi_write_hdr.invokeExact(Handles.get().PFN_stbi_write_hdr, Marshal.marshal(__overrungl_stack, filename), w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_hdr", e); }
    }

    public static @CType("int") boolean stbi_write_jpg(@CType("const char*") java.lang.foreign.MemorySegment filename, @CType("int") int x, @CType("int") int y, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data, @CType("int") int quality) {
        try {
            return (boolean) Handles.MH_stbi_write_jpg.invokeExact(Handles.get().PFN_stbi_write_jpg, filename, x, y, comp, data, quality);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_jpg", e); }
    }

    public static @CType("int") boolean stbi_write_jpg(@CType("const char*") java.lang.String filename, @CType("int") int x, @CType("int") int y, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data, @CType("int") int quality) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_stbi_write_jpg.invokeExact(Handles.get().PFN_stbi_write_jpg, Marshal.marshal(__overrungl_stack, filename), x, y, comp, data, quality);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_jpg", e); }
    }

    public static @CType("int") boolean stbi_write_png_to_func(@CType("stbi_write_func *") java.lang.foreign.MemorySegment func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data, @CType("int") int stride_in_bytes) {
        try {
            return (boolean) Handles.MH_stbi_write_png_to_func.invokeExact(Handles.get().PFN_stbi_write_png_to_func, func, context, w, h, comp, data, stride_in_bytes);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_png_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_png_to_func(java.lang.foreign.Arena arena, @CType("stbi_write_func *") overrungl.stb.STBIWriteFunc func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data, @CType("int") int stride_in_bytes) {
        try {
            return (boolean) Handles.MH_stbi_write_png_to_func.invokeExact(Handles.get().PFN_stbi_write_png_to_func, arena, Marshal.marshal(arena, func), context, w, h, comp, data, stride_in_bytes);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_png_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_bmp_to_func(@CType("stbi_write_func *") java.lang.foreign.MemorySegment func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_bmp_to_func.invokeExact(Handles.get().PFN_stbi_write_bmp_to_func, func, context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_bmp_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_bmp_to_func(java.lang.foreign.Arena arena, @CType("stbi_write_func *") overrungl.stb.STBIWriteFunc func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_bmp_to_func.invokeExact(Handles.get().PFN_stbi_write_bmp_to_func, arena, Marshal.marshal(arena, func), context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_bmp_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_tga_to_func(@CType("stbi_write_func *") java.lang.foreign.MemorySegment func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_tga_to_func.invokeExact(Handles.get().PFN_stbi_write_tga_to_func, func, context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_tga_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_tga_to_func(java.lang.foreign.Arena arena, @CType("stbi_write_func *") overrungl.stb.STBIWriteFunc func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_tga_to_func.invokeExact(Handles.get().PFN_stbi_write_tga_to_func, arena, Marshal.marshal(arena, func), context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_tga_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_hdr_to_func(@CType("stbi_write_func *") java.lang.foreign.MemorySegment func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_hdr_to_func.invokeExact(Handles.get().PFN_stbi_write_hdr_to_func, func, context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_hdr_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_hdr_to_func(java.lang.foreign.Arena arena, @CType("stbi_write_func *") overrungl.stb.STBIWriteFunc func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int w, @CType("int") int h, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data) {
        try {
            return (boolean) Handles.MH_stbi_write_hdr_to_func.invokeExact(Handles.get().PFN_stbi_write_hdr_to_func, arena, Marshal.marshal(arena, func), context, w, h, comp, data);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_hdr_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_jpg_to_func(@CType("stbi_write_func *") java.lang.foreign.MemorySegment func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int x, @CType("int") int y, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data, @CType("int") int quality) {
        try {
            return (boolean) Handles.MH_stbi_write_jpg_to_func.invokeExact(Handles.get().PFN_stbi_write_jpg_to_func, func, context, x, y, comp, data, quality);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_jpg_to_func", e); }
    }

    public static @CType("int") boolean stbi_write_jpg_to_func(java.lang.foreign.Arena arena, @CType("stbi_write_func *") overrungl.stb.STBIWriteFunc func, @CType("void*") java.lang.foreign.MemorySegment context, @CType("int") int x, @CType("int") int y, @CType("int") int comp, @CType("const void*") java.lang.foreign.MemorySegment data, @CType("int") int quality) {
        try {
            return (boolean) Handles.MH_stbi_write_jpg_to_func.invokeExact(Handles.get().PFN_stbi_write_jpg_to_func, arena, Marshal.marshal(arena, func), context, x, y, comp, data, quality);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_write_jpg_to_func", e); }
    }

    public static void stbi_flip_vertically_on_write(@CType("int") boolean flip_boolean) {
        try {
            Handles.MH_stbi_flip_vertically_on_write.invokeExact(Handles.get().PFN_stbi_flip_vertically_on_write, flip_boolean);
        } catch (Throwable e) { throw new RuntimeException("error in stbi_flip_vertically_on_write", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBImageWrite() {
    }

    @CType("int")
    public static MemorySegment stbi_write_tga_with_rle() {
        return GlobalVariables.stbi_write_tga_with_rle;
    }

    @CType("int")
    public static MemorySegment stbi_write_png_compression_level() {
        return GlobalVariables.stbi_write_png_compression_level;
    }

    @CType("int")
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
