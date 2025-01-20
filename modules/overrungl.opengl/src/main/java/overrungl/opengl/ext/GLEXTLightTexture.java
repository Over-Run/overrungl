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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTLightTexture {
    public static final int GL_FRAGMENT_MATERIAL_EXT = 0x8349;
    public static final int GL_FRAGMENT_NORMAL_EXT = 0x834A;
    public static final int GL_FRAGMENT_COLOR_EXT = 0x834C;
    public static final int GL_ATTENUATION_EXT = 0x834D;
    public static final int GL_SHADOW_ATTENUATION_EXT = 0x834E;
    public static final int GL_TEXTURE_APPLICATION_MODE_EXT = 0x834F;
    public static final int GL_TEXTURE_LIGHT_EXT = 0x8350;
    public static final int GL_TEXTURE_MATERIAL_FACE_EXT = 0x8351;
    public static final int GL_TEXTURE_MATERIAL_PARAMETER_EXT = 0x8352;
    public static final int GL_FRAGMENT_DEPTH_EXT = 0x8452;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glApplyTextureEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureLightEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureMaterialEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glApplyTextureEXT = RuntimeHelper.downcall(Descriptors.FD_glApplyTextureEXT);
        public static final MethodHandle MH_glTextureLightEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureLightEXT);
        public static final MethodHandle MH_glTextureMaterialEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureMaterialEXT);
        public final MemorySegment PFN_glApplyTextureEXT;
        public final MemorySegment PFN_glTextureLightEXT;
        public final MemorySegment PFN_glTextureMaterialEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glApplyTextureEXT = func.invoke("glApplyTextureEXT");
            PFN_glTextureLightEXT = func.invoke("glTextureLightEXT");
            PFN_glTextureMaterialEXT = func.invoke("glTextureMaterialEXT");
        }
    }

    public GLEXTLightTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ApplyTextureEXT(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glApplyTextureEXT)) throw new SymbolNotFoundError("Symbol not found: glApplyTextureEXT");
        try { Handles.MH_glApplyTextureEXT.invokeExact(handles.PFN_glApplyTextureEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glApplyTextureEXT", e); }
    }

    public void TextureLightEXT(@CType("GLenum") int pname) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureLightEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureLightEXT");
        try { Handles.MH_glTextureLightEXT.invokeExact(handles.PFN_glTextureLightEXT, pname); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureLightEXT", e); }
    }

    public void TextureMaterialEXT(@CType("GLenum") int face, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureMaterialEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureMaterialEXT");
        try { Handles.MH_glTextureMaterialEXT.invokeExact(handles.PFN_glTextureMaterialEXT, face, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureMaterialEXT", e); }
    }

}
