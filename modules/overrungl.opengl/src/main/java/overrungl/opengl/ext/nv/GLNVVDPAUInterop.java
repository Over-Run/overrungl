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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_vdpau_interop}
 */
public interface GLNVVDPAUInterop {
    int GL_SURFACE_STATE_NV = 0x86EB;
    int GL_SURFACE_REGISTERED_NV = 0x86FD;
    int GL_SURFACE_MAPPED_NV = 0x8700;
    int GL_WRITE_DISCARD_NV = 0x88BE;

    default void glVDPAUInitNV(@NativeType("const void *") MemorySegment vdpDevice, @NativeType("const void *") MemorySegment getProcAddress) {
        throw new ContextException();
    }

    default void glVDPAUFiniNV() {
        throw new ContextException();
    }

    default long glVDPAURegisterVideoSurfaceNV(@NativeType("const void *") MemorySegment vdpSurface, int target, int numTextureNames, @NativeType("const GLuint *") MemorySegment textureNames) {
        throw new ContextException();
    }

    default long glVDPAURegisterOutputSurfaceNV(@NativeType("const void *") MemorySegment vdpSurface, int target, int numTextureNames, @NativeType("const GLuint *") MemorySegment textureNames) {
        throw new ContextException();
    }

    default boolean glVDPAUIsSurfaceNV(long surface) {
        throw new ContextException();
    }

    default void glVDPAUUnregisterSurfaceNV(long surface) {
        throw new ContextException();
    }

    default void glVDPAUGetSurfaceivNV(long surface, int pname, int count, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLint *") MemorySegment values) {
        throw new ContextException();
    }

    default void glVDPAUSurfaceAccessNV(long surface, int access) {
        throw new ContextException();
    }

    default void glVDPAUMapSurfacesNV(int numSurfaces, @NativeType("const GLvdpauSurfaceNV *") MemorySegment surfaces) {
        throw new ContextException();
    }

    default void glVDPAUUnmapSurfacesNV(int numSurface, @NativeType("const GLvdpauSurfaceNV *") MemorySegment surfaces) {
        throw new ContextException();
    }

}
