/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_vdpau_interop}
 */
public final class GLNVVDPAUInterop {
    public static final int GL_SURFACE_STATE_NV = 0x86EB;
    public static final int GL_SURFACE_REGISTERED_NV = 0x86FD;
    public static final int GL_SURFACE_MAPPED_NV = 0x8700;
    public static final int GL_WRITE_DISCARD_NV = 0x88BE;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_vdpau_interop) return;
        ext.glVDPAUInitNV = load.invoke("glVDPAUInitNV", ofVoid(ADDRESS, ADDRESS));
        ext.glVDPAUFiniNV = load.invoke("glVDPAUFiniNV", ofVoid());
        ext.glVDPAURegisterVideoSurfaceNV = load.invoke("glVDPAURegisterVideoSurfaceNV", of(JAVA_LONG, ADDRESS, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVDPAURegisterOutputSurfaceNV = load.invoke("glVDPAURegisterOutputSurfaceNV", of(JAVA_LONG, ADDRESS, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVDPAUIsSurfaceNV = load.invoke("glVDPAUIsSurfaceNV", of(JAVA_BYTE, JAVA_LONG));
        ext.glVDPAUUnregisterSurfaceNV = load.invoke("glVDPAUUnregisterSurfaceNV", ofVoid(JAVA_LONG));
        ext.glVDPAUGetSurfaceivNV = load.invoke("glVDPAUGetSurfaceivNV", ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glVDPAUSurfaceAccessNV = load.invoke("glVDPAUSurfaceAccessNV", ofVoid(JAVA_LONG, JAVA_INT));
        ext.glVDPAUMapSurfacesNV = load.invoke("glVDPAUMapSurfacesNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVDPAUUnmapSurfacesNV = load.invoke("glVDPAUUnmapSurfacesNV", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glVDPAUInitNV(@NativeType("const void *") MemorySegment vdpDevice, @NativeType("const void *") MemorySegment getProcAddress) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVDPAUInitNV).invokeExact(vdpDevice, getProcAddress);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVDPAUFiniNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVDPAUFiniNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static long glVDPAURegisterVideoSurfaceNV(@NativeType("const void *") MemorySegment vdpSurface, int target, int numTextureNames, @NativeType("const GLuint *") MemorySegment textureNames) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glVDPAURegisterVideoSurfaceNV).invokeExact(vdpSurface, target, numTextureNames, textureNames);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static long glVDPAURegisterOutputSurfaceNV(@NativeType("const void *") MemorySegment vdpSurface, int target, int numTextureNames, @NativeType("const GLuint *") MemorySegment textureNames) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glVDPAURegisterOutputSurfaceNV).invokeExact(vdpSurface, target, numTextureNames, textureNames);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glVDPAUIsSurfaceNV(long surface) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glVDPAUIsSurfaceNV).invokeExact(surface);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVDPAUUnregisterSurfaceNV(long surface) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVDPAUUnregisterSurfaceNV).invokeExact(surface);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVDPAUGetSurfaceivNV(long surface, int pname, int count, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLint *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVDPAUGetSurfaceivNV).invokeExact(surface, pname, count, length, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVDPAUSurfaceAccessNV(long surface, int access) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVDPAUSurfaceAccessNV).invokeExact(surface, access);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVDPAUMapSurfacesNV(int numSurfaces, @NativeType("const GLvdpauSurfaceNV *") MemorySegment surfaces) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVDPAUMapSurfacesNV).invokeExact(numSurfaces, surfaces);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVDPAUUnmapSurfacesNV(int numSurface, @NativeType("const GLvdpauSurfaceNV *") MemorySegment surfaces) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVDPAUUnmapSurfacesNV).invokeExact(numSurface, surfaces);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
