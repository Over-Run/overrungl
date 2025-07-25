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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBTextureView {
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 0x82DB;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 0x82DC;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER = 0x82DD;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 0x82DE;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTextureView = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTextureView;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTextureView = func.invoke("glTextureView");
        }
    }

    public GLARBTextureView(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glTextureView((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLuint origtexture, (unsigned int) GLenum internalformat, (unsigned int) GLuint minlevel, (unsigned int) GLuint numlevels, (unsigned int) GLuint minlayer, (unsigned int) GLuint numlayers);
    /// ```
    public void TextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureView)) throw new GLSymbolNotFoundError("Symbol not found: glTextureView");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureView", texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers); }
        Handles.MH_glTextureView.invokeExact(handles.PFN_glTextureView, texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers); }
        catch (Throwable e) { throw new RuntimeException("error in TextureView", e); }
    }

}
