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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTTextureObject {
    public static final int GL_TEXTURE_PRIORITY_EXT = 0x8066;
    public static final int GL_TEXTURE_RESIDENT_EXT = 0x8067;
    public static final int GL_TEXTURE_1D_BINDING_EXT = 0x8068;
    public static final int GL_TEXTURE_2D_BINDING_EXT = 0x8069;
    public static final int GL_TEXTURE_3D_BINDING_EXT = 0x806A;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glAreTexturesResidentEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteTexturesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenTexturesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPrioritizeTexturesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glAreTexturesResidentEXT;
        public final MemorySegment PFN_glBindTextureEXT;
        public final MemorySegment PFN_glDeleteTexturesEXT;
        public final MemorySegment PFN_glGenTexturesEXT;
        public final MemorySegment PFN_glIsTextureEXT;
        public final MemorySegment PFN_glPrioritizeTexturesEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glAreTexturesResidentEXT = func.invoke("glAreTexturesResidentEXT");
            PFN_glBindTextureEXT = func.invoke("glBindTextureEXT", "glBindTexture");
            PFN_glDeleteTexturesEXT = func.invoke("glDeleteTexturesEXT");
            PFN_glGenTexturesEXT = func.invoke("glGenTexturesEXT");
            PFN_glIsTextureEXT = func.invoke("glIsTextureEXT");
            PFN_glPrioritizeTexturesEXT = func.invoke("glPrioritizeTexturesEXT", "glPrioritizeTextures");
        }
    }

    public GLEXTTextureObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// GLboolean glAreTexturesResidentEXT(GLsizei n, const GLuint* textures, GLboolean* residences);
    /// ```
    public boolean AreTexturesResidentEXT(int n, MemorySegment textures, MemorySegment residences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAreTexturesResidentEXT)) throw new SymbolNotFoundError("Symbol not found: glAreTexturesResidentEXT");
        try { return (((byte) Handles.MH_glAreTexturesResidentEXT.invokeExact(handles.PFN_glAreTexturesResidentEXT, n, textures, residences)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in AreTexturesResidentEXT", e); }
    }

    /// ```
    /// void glBindTextureEXT(GLenum target, GLuint texture);
    /// ```
    public void BindTextureEXT(int target, int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTextureEXT)) throw new SymbolNotFoundError("Symbol not found: glBindTextureEXT");
        try { Handles.MH_glBindTextureEXT.invokeExact(handles.PFN_glBindTextureEXT, target, texture); }
        catch (Throwable e) { throw new RuntimeException("error in BindTextureEXT", e); }
    }

    /// ```
    /// void glDeleteTexturesEXT(GLsizei n, const GLuint* textures);
    /// ```
    public void DeleteTexturesEXT(int n, MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteTexturesEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteTexturesEXT");
        try { Handles.MH_glDeleteTexturesEXT.invokeExact(handles.PFN_glDeleteTexturesEXT, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteTexturesEXT", e); }
    }

    /// ```
    /// void glGenTexturesEXT(GLsizei n, GLuint* textures);
    /// ```
    public void GenTexturesEXT(int n, MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenTexturesEXT)) throw new SymbolNotFoundError("Symbol not found: glGenTexturesEXT");
        try { Handles.MH_glGenTexturesEXT.invokeExact(handles.PFN_glGenTexturesEXT, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in GenTexturesEXT", e); }
    }

    /// ```
    /// GLboolean glIsTextureEXT(GLuint texture);
    /// ```
    public boolean IsTextureEXT(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTextureEXT)) throw new SymbolNotFoundError("Symbol not found: glIsTextureEXT");
        try { return (((byte) Handles.MH_glIsTextureEXT.invokeExact(handles.PFN_glIsTextureEXT, texture)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTextureEXT", e); }
    }

    /// ```
    /// void glPrioritizeTexturesEXT(GLsizei n, const GLuint* textures, const GLclampf* priorities);
    /// ```
    public void PrioritizeTexturesEXT(int n, MemorySegment textures, MemorySegment priorities) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPrioritizeTexturesEXT)) throw new SymbolNotFoundError("Symbol not found: glPrioritizeTexturesEXT");
        try { Handles.MH_glPrioritizeTexturesEXT.invokeExact(handles.PFN_glPrioritizeTexturesEXT, n, textures, priorities); }
        catch (Throwable e) { throw new RuntimeException("error in PrioritizeTexturesEXT", e); }
    }

}
