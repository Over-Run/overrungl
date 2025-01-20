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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTTexturePerturbNormal {
    public static final int GL_PERTURB_EXT = 0x85AE;
    public static final int GL_TEXTURE_NORMAL_EXT = 0x85AF;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTextureNormalEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glTextureNormalEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glTextureNormalEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureNormalEXT);
        public final MemorySegment PFN_glTextureNormalEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTextureNormalEXT = func.invoke("glTextureNormalEXT");
        }
    }

    public GLEXTTexturePerturbNormal(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TextureNormalEXT(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureNormalEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureNormalEXT");
        try { Handles.MH_glTextureNormalEXT.invokeExact(handles.PFN_glTextureNormalEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureNormalEXT", e); }
    }

}
