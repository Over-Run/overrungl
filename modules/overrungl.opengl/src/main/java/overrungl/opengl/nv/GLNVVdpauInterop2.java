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

public final class GLNVVdpauInterop2 {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glVDPAURegisterVideoSurfaceWithPictureStructureNV = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN);
    }
    public static final class Handles {
        public static final MethodHandle MH_glVDPAURegisterVideoSurfaceWithPictureStructureNV = RuntimeHelper.downcall(Descriptors.FD_glVDPAURegisterVideoSurfaceWithPictureStructureNV);
        public final MemorySegment PFN_glVDPAURegisterVideoSurfaceWithPictureStructureNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVDPAURegisterVideoSurfaceWithPictureStructureNV = func.invoke("glVDPAURegisterVideoSurfaceWithPictureStructureNV");
        }
    }

    public GLNVVdpauInterop2(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public @CType("GLvdpauSurfaceNV") long VDPAURegisterVideoSurfaceWithPictureStructureNV(@CType("const void *") java.lang.foreign.MemorySegment vdpSurface, @CType("GLenum") int target, @CType("GLsizei") int numTextureNames, @CType("const GLuint *") java.lang.foreign.MemorySegment textureNames, @CType("GLboolean") boolean isFrameStructure) {
        if (Unmarshal.isNullPointer(handles.PFN_glVDPAURegisterVideoSurfaceWithPictureStructureNV)) throw new SymbolNotFoundError("Symbol not found: glVDPAURegisterVideoSurfaceWithPictureStructureNV");
        try { return (long) Handles.MH_glVDPAURegisterVideoSurfaceWithPictureStructureNV.invokeExact(handles.PFN_glVDPAURegisterVideoSurfaceWithPictureStructureNV, vdpSurface, target, numTextureNames, textureNames, isFrameStructure); }
        catch (Throwable e) { throw new RuntimeException("error in glVDPAURegisterVideoSurfaceWithPictureStructureNV", e); }
    }

}
