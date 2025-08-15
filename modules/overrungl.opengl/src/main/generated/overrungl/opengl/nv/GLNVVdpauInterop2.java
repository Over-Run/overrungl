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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_vdpau_interop2`
public final class GLNVVdpauInterop2 {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVDPAURegisterVideoSurfaceWithPictureStructureNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        public final MemorySegment PFN_glVDPAURegisterVideoSurfaceWithPictureStructureNV;
        private Handles(GLLoadFunc func) {
            PFN_glVDPAURegisterVideoSurfaceWithPictureStructureNV = func.invoke("glVDPAURegisterVideoSurfaceWithPictureStructureNV");
        }
    }

    public GLNVVdpauInterop2(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVDPAURegisterVideoSurfaceWithPictureStructureNV`.
    /// ```
    /// (((signed long long) khronos_intptr_t) GLintptr) GLvdpauSurfaceNV glVDPAURegisterVideoSurfaceWithPictureStructureNV(const void* vdpSurface, (unsigned int) GLenum target, (int) GLsizei numTextureNames, const GLuint* textureNames, GLboolean isFrameStructure);
    /// ```
    public long VDPAURegisterVideoSurfaceWithPictureStructureNV(@NonNull MemorySegment vdpSurface, int target, int numTextureNames, @NonNull MemorySegment textureNames, boolean isFrameStructure) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAURegisterVideoSurfaceWithPictureStructureNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAURegisterVideoSurfaceWithPictureStructureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAURegisterVideoSurfaceWithPictureStructureNV", vdpSurface, target, numTextureNames, textureNames, isFrameStructure); }
        return (long) Handles.MH_glVDPAURegisterVideoSurfaceWithPictureStructureNV.invokeExact(handles.PFN_glVDPAURegisterVideoSurfaceWithPictureStructureNV, vdpSurface, target, numTextureNames, textureNames, ((isFrameStructure) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAURegisterVideoSurfaceWithPictureStructureNV", e); }
    }

}
