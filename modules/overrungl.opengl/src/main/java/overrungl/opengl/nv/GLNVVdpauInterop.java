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

public final class GLNVVdpauInterop {
    public static final int GL_SURFACE_STATE_NV = 0x86EB;
    public static final int GL_SURFACE_REGISTERED_NV = 0x86FD;
    public static final int GL_SURFACE_MAPPED_NV = 0x8700;
    public static final int GL_WRITE_DISCARD_NV = 0x88BE;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glVDPAUInitNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVDPAUFiniNV = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glVDPAURegisterVideoSurfaceNV = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVDPAURegisterOutputSurfaceNV = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVDPAUIsSurfaceNV = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVDPAUUnregisterSurfaceNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVDPAUGetSurfaceivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVDPAUSurfaceAccessNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVDPAUMapSurfacesNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVDPAUUnmapSurfacesNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glVDPAUInitNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAUInitNV);
        public static final MethodHandle MH_glVDPAUFiniNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAUFiniNV);
        public static final MethodHandle MH_glVDPAURegisterVideoSurfaceNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAURegisterVideoSurfaceNV);
        public static final MethodHandle MH_glVDPAURegisterOutputSurfaceNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAURegisterOutputSurfaceNV);
        public static final MethodHandle MH_glVDPAUIsSurfaceNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAUIsSurfaceNV);
        public static final MethodHandle MH_glVDPAUUnregisterSurfaceNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAUUnregisterSurfaceNV);
        public static final MethodHandle MH_glVDPAUGetSurfaceivNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAUGetSurfaceivNV);
        public static final MethodHandle MH_glVDPAUSurfaceAccessNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAUSurfaceAccessNV);
        public static final MethodHandle MH_glVDPAUMapSurfacesNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAUMapSurfacesNV);
        public static final MethodHandle MH_glVDPAUUnmapSurfacesNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAUUnmapSurfacesNV);
        public final MemorySegment PFN_glVDPAUInitNV;
        public final MemorySegment PFN_glVDPAUFiniNV;
        public final MemorySegment PFN_glVDPAURegisterVideoSurfaceNV;
        public final MemorySegment PFN_glVDPAURegisterOutputSurfaceNV;
        public final MemorySegment PFN_glVDPAUIsSurfaceNV;
        public final MemorySegment PFN_glVDPAUUnregisterSurfaceNV;
        public final MemorySegment PFN_glVDPAUGetSurfaceivNV;
        public final MemorySegment PFN_glVDPAUSurfaceAccessNV;
        public final MemorySegment PFN_glVDPAUMapSurfacesNV;
        public final MemorySegment PFN_glVDPAUUnmapSurfacesNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVDPAUInitNV = func.invoke("glVDPAUInitNV");
            PFN_glVDPAUFiniNV = func.invoke("glVDPAUFiniNV");
            PFN_glVDPAURegisterVideoSurfaceNV = func.invoke("glVDPAURegisterVideoSurfaceNV");
            PFN_glVDPAURegisterOutputSurfaceNV = func.invoke("glVDPAURegisterOutputSurfaceNV");
            PFN_glVDPAUIsSurfaceNV = func.invoke("glVDPAUIsSurfaceNV");
            PFN_glVDPAUUnregisterSurfaceNV = func.invoke("glVDPAUUnregisterSurfaceNV");
            PFN_glVDPAUGetSurfaceivNV = func.invoke("glVDPAUGetSurfaceivNV");
            PFN_glVDPAUSurfaceAccessNV = func.invoke("glVDPAUSurfaceAccessNV");
            PFN_glVDPAUMapSurfacesNV = func.invoke("glVDPAUMapSurfacesNV");
            PFN_glVDPAUUnmapSurfacesNV = func.invoke("glVDPAUUnmapSurfacesNV");
        }
    }

    public GLNVVdpauInterop(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void VDPAUInitNV(@CType("const void *") java.lang.foreign.MemorySegment vdpDevice, @CType("const void *") java.lang.foreign.MemorySegment getProcAddress) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAUInitNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUInitNV");
        try { Handles.MH_glVDPAUInitNV.invokeExact(handles.PFN_glVDPAUInitNV, vdpDevice, getProcAddress); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUInitNV", e); }
    }

    public void VDPAUFiniNV() {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAUFiniNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUFiniNV");
        try { Handles.MH_glVDPAUFiniNV.invokeExact(handles.PFN_glVDPAUFiniNV); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUFiniNV", e); }
    }

    public @CType("GLvdpauSurfaceNV") long VDPAURegisterVideoSurfaceNV(@CType("const void *") java.lang.foreign.MemorySegment vdpSurface, @CType("GLenum") int target, @CType("GLsizei") int numTextureNames, @CType("const GLuint *") java.lang.foreign.MemorySegment textureNames) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAURegisterVideoSurfaceNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAURegisterVideoSurfaceNV");
        try { return (long) Handles.MH_glVDPAURegisterVideoSurfaceNV.invokeExact(handles.PFN_glVDPAURegisterVideoSurfaceNV, vdpSurface, target, numTextureNames, textureNames); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAURegisterVideoSurfaceNV", e); }
    }

    public @CType("GLvdpauSurfaceNV") long VDPAURegisterOutputSurfaceNV(@CType("const void *") java.lang.foreign.MemorySegment vdpSurface, @CType("GLenum") int target, @CType("GLsizei") int numTextureNames, @CType("const GLuint *") java.lang.foreign.MemorySegment textureNames) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAURegisterOutputSurfaceNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAURegisterOutputSurfaceNV");
        try { return (long) Handles.MH_glVDPAURegisterOutputSurfaceNV.invokeExact(handles.PFN_glVDPAURegisterOutputSurfaceNV, vdpSurface, target, numTextureNames, textureNames); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAURegisterOutputSurfaceNV", e); }
    }

    public @CType("GLboolean") boolean VDPAUIsSurfaceNV(@CType("GLvdpauSurfaceNV") long surface) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAUIsSurfaceNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUIsSurfaceNV");
        try { return (boolean) Handles.MH_glVDPAUIsSurfaceNV.invokeExact(handles.PFN_glVDPAUIsSurfaceNV, surface); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUIsSurfaceNV", e); }
    }

    public void VDPAUUnregisterSurfaceNV(@CType("GLvdpauSurfaceNV") long surface) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAUUnregisterSurfaceNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUUnregisterSurfaceNV");
        try { Handles.MH_glVDPAUUnregisterSurfaceNV.invokeExact(handles.PFN_glVDPAUUnregisterSurfaceNV, surface); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUUnregisterSurfaceNV", e); }
    }

    public void VDPAUGetSurfaceivNV(@CType("GLvdpauSurfaceNV") long surface, @CType("GLenum") int pname, @CType("GLsizei") int count, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAUGetSurfaceivNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUGetSurfaceivNV");
        try { Handles.MH_glVDPAUGetSurfaceivNV.invokeExact(handles.PFN_glVDPAUGetSurfaceivNV, surface, pname, count, length, values); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUGetSurfaceivNV", e); }
    }

    public void VDPAUSurfaceAccessNV(@CType("GLvdpauSurfaceNV") long surface, @CType("GLenum") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAUSurfaceAccessNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUSurfaceAccessNV");
        try { Handles.MH_glVDPAUSurfaceAccessNV.invokeExact(handles.PFN_glVDPAUSurfaceAccessNV, surface, access); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUSurfaceAccessNV", e); }
    }

    public void VDPAUMapSurfacesNV(@CType("GLsizei") int numSurfaces, @CType("const GLvdpauSurfaceNV *") java.lang.foreign.MemorySegment surfaces) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAUMapSurfacesNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUMapSurfacesNV");
        try { Handles.MH_glVDPAUMapSurfacesNV.invokeExact(handles.PFN_glVDPAUMapSurfacesNV, numSurfaces, surfaces); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUMapSurfacesNV", e); }
    }

    public void VDPAUUnmapSurfacesNV(@CType("GLsizei") int numSurface, @CType("const GLvdpauSurfaceNV *") java.lang.foreign.MemorySegment surfaces) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAUUnmapSurfacesNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUUnmapSurfacesNV");
        try { Handles.MH_glVDPAUUnmapSurfacesNV.invokeExact(handles.PFN_glVDPAUUnmapSurfacesNV, numSurface, surfaces); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUUnmapSurfacesNV", e); }
    }

}
