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
    public static final MethodHandle MH_glVDPAUInitNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVDPAUInitNV;
    public static final MethodHandle MH_glVDPAUFiniNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glVDPAUFiniNV;
    public static final MethodHandle MH_glVDPAURegisterVideoSurfaceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVDPAURegisterVideoSurfaceNV;
    public static final MethodHandle MH_glVDPAURegisterOutputSurfaceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVDPAURegisterOutputSurfaceNV;
    public static final MethodHandle MH_glVDPAUIsSurfaceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVDPAUIsSurfaceNV;
    public static final MethodHandle MH_glVDPAUUnregisterSurfaceNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVDPAUUnregisterSurfaceNV;
    public static final MethodHandle MH_glVDPAUGetSurfaceivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVDPAUGetSurfaceivNV;
    public static final MethodHandle MH_glVDPAUSurfaceAccessNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVDPAUSurfaceAccessNV;
    public static final MethodHandle MH_glVDPAUMapSurfacesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVDPAUMapSurfacesNV;
    public static final MethodHandle MH_glVDPAUUnmapSurfacesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVDPAUUnmapSurfacesNV;

    public GLNVVdpauInterop(overrungl.opengl.GLLoadFunc func) {
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

    public void VDPAUInitNV(@CType("const void *") java.lang.foreign.MemorySegment vdpDevice, @CType("const void *") java.lang.foreign.MemorySegment getProcAddress) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAUInitNV))
            MH_glVDPAUInitNV.invokeExact(PFN_glVDPAUInitNV, vdpDevice, getProcAddress);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUInitNV", e); }
    }

    public void VDPAUFiniNV() {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAUFiniNV))
            MH_glVDPAUFiniNV.invokeExact(PFN_glVDPAUFiniNV);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUFiniNV", e); }
    }

    public @CType("GLvdpauSurfaceNV") long VDPAURegisterVideoSurfaceNV(@CType("const void *") java.lang.foreign.MemorySegment vdpSurface, @CType("GLenum") int target, @CType("GLsizei") int numTextureNames, @CType("const GLuint *") java.lang.foreign.MemorySegment textureNames) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAURegisterVideoSurfaceNV))
            return (long) MH_glVDPAURegisterVideoSurfaceNV.invokeExact(PFN_glVDPAURegisterVideoSurfaceNV, vdpSurface, target, numTextureNames, textureNames);
            else return 0L;
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAURegisterVideoSurfaceNV", e); }
    }

    public @CType("GLvdpauSurfaceNV") long VDPAURegisterOutputSurfaceNV(@CType("const void *") java.lang.foreign.MemorySegment vdpSurface, @CType("GLenum") int target, @CType("GLsizei") int numTextureNames, @CType("const GLuint *") java.lang.foreign.MemorySegment textureNames) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAURegisterOutputSurfaceNV))
            return (long) MH_glVDPAURegisterOutputSurfaceNV.invokeExact(PFN_glVDPAURegisterOutputSurfaceNV, vdpSurface, target, numTextureNames, textureNames);
            else return 0L;
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAURegisterOutputSurfaceNV", e); }
    }

    public @CType("GLboolean") boolean VDPAUIsSurfaceNV(@CType("GLvdpauSurfaceNV") long surface) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAUIsSurfaceNV))
            return (boolean) MH_glVDPAUIsSurfaceNV.invokeExact(PFN_glVDPAUIsSurfaceNV, surface);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUIsSurfaceNV", e); }
    }

    public void VDPAUUnregisterSurfaceNV(@CType("GLvdpauSurfaceNV") long surface) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAUUnregisterSurfaceNV))
            MH_glVDPAUUnregisterSurfaceNV.invokeExact(PFN_glVDPAUUnregisterSurfaceNV, surface);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUUnregisterSurfaceNV", e); }
    }

    public void VDPAUGetSurfaceivNV(@CType("GLvdpauSurfaceNV") long surface, @CType("GLenum") int pname, @CType("GLsizei") int count, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAUGetSurfaceivNV))
            MH_glVDPAUGetSurfaceivNV.invokeExact(PFN_glVDPAUGetSurfaceivNV, surface, pname, count, length, values);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUGetSurfaceivNV", e); }
    }

    public void VDPAUSurfaceAccessNV(@CType("GLvdpauSurfaceNV") long surface, @CType("GLenum") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAUSurfaceAccessNV))
            MH_glVDPAUSurfaceAccessNV.invokeExact(PFN_glVDPAUSurfaceAccessNV, surface, access);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUSurfaceAccessNV", e); }
    }

    public void VDPAUMapSurfacesNV(@CType("GLsizei") int numSurfaces, @CType("const GLvdpauSurfaceNV *") java.lang.foreign.MemorySegment surfaces) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAUMapSurfacesNV))
            MH_glVDPAUMapSurfacesNV.invokeExact(PFN_glVDPAUMapSurfacesNV, numSurfaces, surfaces);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUMapSurfacesNV", e); }
    }

    public void VDPAUUnmapSurfacesNV(@CType("GLsizei") int numSurface, @CType("const GLvdpauSurfaceNV *") java.lang.foreign.MemorySegment surfaces) {
        try { if (!Unmarshal.isNullPointer(PFN_glVDPAUUnmapSurfacesNV))
            MH_glVDPAUUnmapSurfacesNV.invokeExact(PFN_glVDPAUUnmapSurfacesNV, numSurface, surfaces);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAUUnmapSurfacesNV", e); }
    }

}
