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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_texture_object`
public final class GLEXTTextureObject {
    public static final int GL_TEXTURE_PRIORITY_EXT = 0x8066;
    public static final int GL_TEXTURE_RESIDENT_EXT = 0x8067;
    public static final int GL_TEXTURE_1D_BINDING_EXT = 0x8068;
    public static final int GL_TEXTURE_2D_BINDING_EXT = 0x8069;
    public static final int GL_TEXTURE_3D_BINDING_EXT = 0x806A;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glAreTexturesResidentEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindTextureEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteTexturesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenTexturesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTextureEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPrioritizeTexturesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glAreTexturesResidentEXT;
        public final MemorySegment PFN_glBindTextureEXT;
        public final MemorySegment PFN_glDeleteTexturesEXT;
        public final MemorySegment PFN_glGenTexturesEXT;
        public final MemorySegment PFN_glIsTextureEXT;
        public final MemorySegment PFN_glPrioritizeTexturesEXT;
        private Handles(GLLoadFunc func) {
            PFN_glAreTexturesResidentEXT = func.invoke("glAreTexturesResidentEXT");
            PFN_glBindTextureEXT = func.invoke("glBindTextureEXT", "glBindTexture");
            PFN_glDeleteTexturesEXT = func.invoke("glDeleteTexturesEXT");
            PFN_glGenTexturesEXT = func.invoke("glGenTexturesEXT");
            PFN_glIsTextureEXT = func.invoke("glIsTextureEXT");
            PFN_glPrioritizeTexturesEXT = func.invoke("glPrioritizeTexturesEXT", "glPrioritizeTextures");
        }
    }

    public GLEXTTextureObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glAreTexturesResidentEXT`.
    /// ```
    /// GLboolean glAreTexturesResidentEXT((int) GLsizei n, const GLuint* textures, GLboolean* residences);
    /// ```
    public boolean AreTexturesResidentEXT(int n, @NonNull MemorySegment textures, @NonNull MemorySegment residences) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAreTexturesResidentEXT)) throw new GLSymbolNotFoundError("Symbol not found: glAreTexturesResidentEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAreTexturesResidentEXT", n, textures, residences); }
        return (((byte) Handles.MH_glAreTexturesResidentEXT.invokeExact(handles.PFN_glAreTexturesResidentEXT, n, textures, residences)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in AreTexturesResidentEXT", e); }
    }

    /// Invokes `glBindTextureEXT`.
    /// ```
    /// void glBindTextureEXT((unsigned int) GLenum target, (unsigned int) GLuint texture);
    /// ```
    public void BindTextureEXT(int target, int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTextureEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindTextureEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTextureEXT", target, texture); }
        Handles.MH_glBindTextureEXT.invokeExact(handles.PFN_glBindTextureEXT, target, texture); }
        catch (Throwable e) { throw new RuntimeException("error in BindTextureEXT", e); }
    }

    /// Invokes `glDeleteTexturesEXT`.
    /// ```
    /// void glDeleteTexturesEXT((int) GLsizei n, const GLuint* textures);
    /// ```
    public void DeleteTexturesEXT(int n, @NonNull MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteTexturesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteTexturesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteTexturesEXT", n, textures); }
        Handles.MH_glDeleteTexturesEXT.invokeExact(handles.PFN_glDeleteTexturesEXT, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteTexturesEXT", e); }
    }

    /// Invokes `glGenTexturesEXT`.
    /// ```
    /// void glGenTexturesEXT((int) GLsizei n, GLuint* textures);
    /// ```
    public void GenTexturesEXT(int n, @NonNull MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenTexturesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGenTexturesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenTexturesEXT", n, textures); }
        Handles.MH_glGenTexturesEXT.invokeExact(handles.PFN_glGenTexturesEXT, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in GenTexturesEXT", e); }
    }

    /// Invokes `glIsTextureEXT`.
    /// ```
    /// GLboolean glIsTextureEXT((unsigned int) GLuint texture);
    /// ```
    public boolean IsTextureEXT(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTextureEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIsTextureEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsTextureEXT", texture); }
        return (((byte) Handles.MH_glIsTextureEXT.invokeExact(handles.PFN_glIsTextureEXT, texture)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTextureEXT", e); }
    }

    /// Invokes `glPrioritizeTexturesEXT`.
    /// ```
    /// void glPrioritizeTexturesEXT((int) GLsizei n, const GLuint* textures, const GLclampf* priorities);
    /// ```
    public void PrioritizeTexturesEXT(int n, @NonNull MemorySegment textures, @NonNull MemorySegment priorities) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPrioritizeTexturesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPrioritizeTexturesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPrioritizeTexturesEXT", n, textures, priorities); }
        Handles.MH_glPrioritizeTexturesEXT.invokeExact(handles.PFN_glPrioritizeTexturesEXT, n, textures, priorities); }
        catch (Throwable e) { throw new RuntimeException("error in PrioritizeTexturesEXT", e); }
    }

}
