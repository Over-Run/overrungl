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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVVdpauInterop {
    public static final int GL_SURFACE_STATE_NV = 0x86EB;
    public static final int GL_SURFACE_REGISTERED_NV = 0x86FD;
    public static final int GL_SURFACE_MAPPED_NV = 0x8700;
    public static final int GL_WRITE_DISCARD_NV = 0x88BE;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVDPAUInitNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAUFiniNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glVDPAURegisterVideoSurfaceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAURegisterOutputSurfaceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAUIsSurfaceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVDPAUUnregisterSurfaceNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVDPAUGetSurfaceivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAUSurfaceAccessNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVDPAUMapSurfacesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAUUnmapSurfacesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    /// ```
    /// void glVDPAUInitNV(const void* vdpDevice, const void* getProcAddress);
    /// ```
    public void VDPAUInitNV(MemorySegment vdpDevice, MemorySegment getProcAddress) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUInitNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUInitNV");
        try { Handles.MH_glVDPAUInitNV.invokeExact(handles.PFN_glVDPAUInitNV, vdpDevice, getProcAddress); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUInitNV", e); }
    }

    /// ```
    /// void glVDPAUFiniNV();
    /// ```
    public void VDPAUFiniNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUFiniNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUFiniNV");
        try { Handles.MH_glVDPAUFiniNV.invokeExact(handles.PFN_glVDPAUFiniNV); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUFiniNV", e); }
    }

    /// ```
    /// GLvdpauSurfaceNV glVDPAURegisterVideoSurfaceNV(const void* vdpSurface, GLenum target, GLsizei numTextureNames, const GLuint* textureNames);
    /// ```
    public long VDPAURegisterVideoSurfaceNV(MemorySegment vdpSurface, int target, int numTextureNames, MemorySegment textureNames) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAURegisterVideoSurfaceNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAURegisterVideoSurfaceNV");
        try { return (long) Handles.MH_glVDPAURegisterVideoSurfaceNV.invokeExact(handles.PFN_glVDPAURegisterVideoSurfaceNV, vdpSurface, target, numTextureNames, textureNames); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAURegisterVideoSurfaceNV", e); }
    }

    /// ```
    /// GLvdpauSurfaceNV glVDPAURegisterOutputSurfaceNV(const void* vdpSurface, GLenum target, GLsizei numTextureNames, const GLuint* textureNames);
    /// ```
    public long VDPAURegisterOutputSurfaceNV(MemorySegment vdpSurface, int target, int numTextureNames, MemorySegment textureNames) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAURegisterOutputSurfaceNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAURegisterOutputSurfaceNV");
        try { return (long) Handles.MH_glVDPAURegisterOutputSurfaceNV.invokeExact(handles.PFN_glVDPAURegisterOutputSurfaceNV, vdpSurface, target, numTextureNames, textureNames); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAURegisterOutputSurfaceNV", e); }
    }

    /// ```
    /// GLboolean glVDPAUIsSurfaceNV(GLvdpauSurfaceNV surface);
    /// ```
    public boolean VDPAUIsSurfaceNV(long surface) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUIsSurfaceNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUIsSurfaceNV");
        try { return (((byte) Handles.MH_glVDPAUIsSurfaceNV.invokeExact(handles.PFN_glVDPAUIsSurfaceNV, surface)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUIsSurfaceNV", e); }
    }

    /// ```
    /// void glVDPAUUnregisterSurfaceNV(GLvdpauSurfaceNV surface);
    /// ```
    public void VDPAUUnregisterSurfaceNV(long surface) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUUnregisterSurfaceNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUUnregisterSurfaceNV");
        try { Handles.MH_glVDPAUUnregisterSurfaceNV.invokeExact(handles.PFN_glVDPAUUnregisterSurfaceNV, surface); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUUnregisterSurfaceNV", e); }
    }

    /// ```
    /// void glVDPAUGetSurfaceivNV(GLvdpauSurfaceNV surface, GLenum pname, GLsizei count, GLsizei* length, GLint* values);
    /// ```
    public void VDPAUGetSurfaceivNV(long surface, int pname, int count, MemorySegment length, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUGetSurfaceivNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUGetSurfaceivNV");
        try { Handles.MH_glVDPAUGetSurfaceivNV.invokeExact(handles.PFN_glVDPAUGetSurfaceivNV, surface, pname, count, length, values); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUGetSurfaceivNV", e); }
    }

    /// ```
    /// void glVDPAUSurfaceAccessNV(GLvdpauSurfaceNV surface, GLenum access);
    /// ```
    public void VDPAUSurfaceAccessNV(long surface, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUSurfaceAccessNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUSurfaceAccessNV");
        try { Handles.MH_glVDPAUSurfaceAccessNV.invokeExact(handles.PFN_glVDPAUSurfaceAccessNV, surface, access); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUSurfaceAccessNV", e); }
    }

    /// ```
    /// void glVDPAUMapSurfacesNV(GLsizei numSurfaces, const GLvdpauSurfaceNV* surfaces);
    /// ```
    public void VDPAUMapSurfacesNV(int numSurfaces, MemorySegment surfaces) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUMapSurfacesNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUMapSurfacesNV");
        try { Handles.MH_glVDPAUMapSurfacesNV.invokeExact(handles.PFN_glVDPAUMapSurfacesNV, numSurfaces, surfaces); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUMapSurfacesNV", e); }
    }

    /// ```
    /// void glVDPAUUnmapSurfacesNV(GLsizei numSurface, const GLvdpauSurfaceNV* surfaces);
    /// ```
    public void VDPAUUnmapSurfacesNV(int numSurface, MemorySegment surfaces) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUUnmapSurfacesNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAUUnmapSurfacesNV");
        try { Handles.MH_glVDPAUUnmapSurfacesNV.invokeExact(handles.PFN_glVDPAUUnmapSurfacesNV, numSurface, surfaces); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUUnmapSurfacesNV", e); }
    }

}
