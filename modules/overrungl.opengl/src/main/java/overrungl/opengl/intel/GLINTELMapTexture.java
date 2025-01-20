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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.intel;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLINTELMapTexture {
    public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 0x83FF;
    public static final int GL_LAYOUT_DEFAULT_INTEL = 0;
    public static final int GL_LAYOUT_LINEAR_INTEL = 1;
    public static final int GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glSyncTextureINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUnmapTexture2DINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMapTexture2DINTEL = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glSyncTextureINTEL,
            FD_glUnmapTexture2DINTEL,
            FD_glMapTexture2DINTEL
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glSyncTextureINTEL = RuntimeHelper.downcall(Descriptors.FD_glSyncTextureINTEL);
        public static final MethodHandle MH_glUnmapTexture2DINTEL = RuntimeHelper.downcall(Descriptors.FD_glUnmapTexture2DINTEL);
        public static final MethodHandle MH_glMapTexture2DINTEL = RuntimeHelper.downcall(Descriptors.FD_glMapTexture2DINTEL);
        public final MemorySegment PFN_glSyncTextureINTEL;
        public final MemorySegment PFN_glUnmapTexture2DINTEL;
        public final MemorySegment PFN_glMapTexture2DINTEL;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSyncTextureINTEL = func.invoke("glSyncTextureINTEL");
            PFN_glUnmapTexture2DINTEL = func.invoke("glUnmapTexture2DINTEL");
            PFN_glMapTexture2DINTEL = func.invoke("glMapTexture2DINTEL");
        }
    }

    public GLINTELMapTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void SyncTextureINTEL(@CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glSyncTextureINTEL)) throw new SymbolNotFoundError("Symbol not found: glSyncTextureINTEL");
        try { Handles.MH_glSyncTextureINTEL.invokeExact(handles.PFN_glSyncTextureINTEL, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glSyncTextureINTEL", e); }
    }

    public void UnmapTexture2DINTEL(@CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glUnmapTexture2DINTEL)) throw new SymbolNotFoundError("Symbol not found: glUnmapTexture2DINTEL");
        try { Handles.MH_glUnmapTexture2DINTEL.invokeExact(handles.PFN_glUnmapTexture2DINTEL, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapTexture2DINTEL", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapTexture2DINTEL(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLbitfield") int access, @CType("GLint *") java.lang.foreign.MemorySegment stride, @CType("GLenum *") java.lang.foreign.MemorySegment layout) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapTexture2DINTEL)) throw new SymbolNotFoundError("Symbol not found: glMapTexture2DINTEL");
        try { return (java.lang.foreign.MemorySegment) Handles.MH_glMapTexture2DINTEL.invokeExact(handles.PFN_glMapTexture2DINTEL, texture, level, access, stride, layout); }
        catch (Throwable e) { throw new RuntimeException("error in glMapTexture2DINTEL", e); }
    }

}
