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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVSampleLocations {
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV = 0x933D;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV = 0x933E;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV = 0x933F;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV = 0x9340;
    public static final int GL_SAMPLE_LOCATION_NV = 0x8E50;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9341;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV = 0x9342;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV = 0x9343;
    public static final MethodHandle MH_glFramebufferSampleLocationsfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glNamedFramebufferSampleLocationsfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glResolveDepthValuesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glFramebufferSampleLocationsfvNV;
    public final MemorySegment PFN_glNamedFramebufferSampleLocationsfvNV;
    public final MemorySegment PFN_glResolveDepthValuesNV;

    public GLNVSampleLocations(overrungl.opengl.GLLoadFunc func) {
        PFN_glFramebufferSampleLocationsfvNV = func.invoke("glFramebufferSampleLocationsfvNV");
        PFN_glNamedFramebufferSampleLocationsfvNV = func.invoke("glNamedFramebufferSampleLocationsfvNV");
        PFN_glResolveDepthValuesNV = func.invoke("glResolveDepthValuesNV");
    }

    public void FramebufferSampleLocationsfvNV(@CType("GLenum") int target, @CType("GLuint") int start, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glFramebufferSampleLocationsfvNV)) throw new SymbolNotFoundError("Symbol not found: glFramebufferSampleLocationsfvNV");
        try { MH_glFramebufferSampleLocationsfvNV.invokeExact(PFN_glFramebufferSampleLocationsfvNV, target, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferSampleLocationsfvNV", e); }
    }

    public void NamedFramebufferSampleLocationsfvNV(@CType("GLuint") int framebuffer, @CType("GLuint") int start, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glNamedFramebufferSampleLocationsfvNV)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferSampleLocationsfvNV");
        try { MH_glNamedFramebufferSampleLocationsfvNV.invokeExact(PFN_glNamedFramebufferSampleLocationsfvNV, framebuffer, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferSampleLocationsfvNV", e); }
    }

    public void ResolveDepthValuesNV() {
        if (Unmarshal.isNullPointer(PFN_glResolveDepthValuesNV)) throw new SymbolNotFoundError("Symbol not found: glResolveDepthValuesNV");
        try { MH_glResolveDepthValuesNV.invokeExact(PFN_glResolveDepthValuesNV); }
        catch (Throwable e) { throw new RuntimeException("error in glResolveDepthValuesNV", e); }
    }

}
