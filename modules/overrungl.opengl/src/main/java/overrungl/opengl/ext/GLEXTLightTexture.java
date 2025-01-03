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
    public static final MethodHandle MH_glApplyTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glApplyTextureEXT;
    public static final MethodHandle MH_glTextureLightEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureLightEXT;
    public static final MethodHandle MH_glTextureMaterialEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureMaterialEXT;

    public GLEXTLightTexture(overrungl.opengl.GLLoadFunc func) {
        PFN_glApplyTextureEXT = func.invoke("glApplyTextureEXT");
        PFN_glTextureLightEXT = func.invoke("glTextureLightEXT");
        PFN_glTextureMaterialEXT = func.invoke("glTextureMaterialEXT");
    }

    public void ApplyTextureEXT(@CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glApplyTextureEXT))
            MH_glApplyTextureEXT.invokeExact(PFN_glApplyTextureEXT, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glApplyTextureEXT", e); }
    }

    public void TextureLightEXT(@CType("GLenum") int pname) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureLightEXT))
            MH_glTextureLightEXT.invokeExact(PFN_glTextureLightEXT, pname);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureLightEXT", e); }
    }

    public void TextureMaterialEXT(@CType("GLenum") int face, @CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureMaterialEXT))
            MH_glTextureMaterialEXT.invokeExact(PFN_glTextureMaterialEXT, face, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureMaterialEXT", e); }
    }

}
