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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_vdpau_interop}
 */
public interface GLNVVDPAUInterop {
    int GL_SURFACE_STATE_NV = 0x86EB;
    int GL_SURFACE_REGISTERED_NV = 0x86FD;
    int GL_SURFACE_MAPPED_NV = 0x8700;
    int GL_WRITE_DISCARD_NV = 0x88BE;

    void glVDPAUInitNV(@NativeType("const void *") MemorySegment vdpDevice, @NativeType("const void *") MemorySegment getProcAddress);
    void glVDPAUFiniNV();
    long glVDPAURegisterVideoSurfaceNV(@NativeType("const void *") MemorySegment vdpSurface, int target, int numTextureNames, @NativeType("const GLuint *") MemorySegment textureNames);
    long glVDPAURegisterOutputSurfaceNV(@NativeType("const void *") MemorySegment vdpSurface, int target, int numTextureNames, @NativeType("const GLuint *") MemorySegment textureNames);
    boolean glVDPAUIsSurfaceNV(long surface);
    void glVDPAUUnregisterSurfaceNV(long surface);
    void glVDPAUGetSurfaceivNV(long surface, int pname, int count, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLint *") MemorySegment values);
    void glVDPAUSurfaceAccessNV(long surface, int access);
    void glVDPAUMapSurfacesNV(int numSurfaces, @NativeType("const GLvdpauSurfaceNV *") MemorySegment surfaces);
    void glVDPAUUnmapSurfacesNV(int numSurface, @NativeType("const GLvdpauSurfaceNV *") MemorySegment surfaces);
}
