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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVCommandList {
    public static final int GL_TERMINATE_SEQUENCE_COMMAND_NV = 0x0000;
    public static final int GL_NOP_COMMAND_NV = 0x0001;
    public static final int GL_DRAW_ELEMENTS_COMMAND_NV = 0x0002;
    public static final int GL_DRAW_ARRAYS_COMMAND_NV = 0x0003;
    public static final int GL_DRAW_ELEMENTS_STRIP_COMMAND_NV = 0x0004;
    public static final int GL_DRAW_ARRAYS_STRIP_COMMAND_NV = 0x0005;
    public static final int GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 0x0006;
    public static final int GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV = 0x0007;
    public static final int GL_ELEMENT_ADDRESS_COMMAND_NV = 0x0008;
    public static final int GL_ATTRIBUTE_ADDRESS_COMMAND_NV = 0x0009;
    public static final int GL_UNIFORM_ADDRESS_COMMAND_NV = 0x000A;
    public static final int GL_BLEND_COLOR_COMMAND_NV = 0x000B;
    public static final int GL_STENCIL_REF_COMMAND_NV = 0x000C;
    public static final int GL_LINE_WIDTH_COMMAND_NV = 0x000D;
    public static final int GL_POLYGON_OFFSET_COMMAND_NV = 0x000E;
    public static final int GL_ALPHA_REF_COMMAND_NV = 0x000F;
    public static final int GL_VIEWPORT_COMMAND_NV = 0x0010;
    public static final int GL_SCISSOR_COMMAND_NV = 0x0011;
    public static final int GL_FRONT_FACE_COMMAND_NV = 0x0012;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCreateStatesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteStatesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsStateNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStateCaptureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetCommandHeaderNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetStageIndexNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawCommandsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawCommandsAddressNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawCommandsStatesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawCommandsStatesAddressNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateCommandListsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteCommandListsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsCommandListNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glListDrawCommandsStatesClientNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCommandListSegmentsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCompileCommandListNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCallCommandListNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glCreateStatesNV;
        public final MemorySegment PFN_glDeleteStatesNV;
        public final MemorySegment PFN_glIsStateNV;
        public final MemorySegment PFN_glStateCaptureNV;
        public final MemorySegment PFN_glGetCommandHeaderNV;
        public final MemorySegment PFN_glGetStageIndexNV;
        public final MemorySegment PFN_glDrawCommandsNV;
        public final MemorySegment PFN_glDrawCommandsAddressNV;
        public final MemorySegment PFN_glDrawCommandsStatesNV;
        public final MemorySegment PFN_glDrawCommandsStatesAddressNV;
        public final MemorySegment PFN_glCreateCommandListsNV;
        public final MemorySegment PFN_glDeleteCommandListsNV;
        public final MemorySegment PFN_glIsCommandListNV;
        public final MemorySegment PFN_glListDrawCommandsStatesClientNV;
        public final MemorySegment PFN_glCommandListSegmentsNV;
        public final MemorySegment PFN_glCompileCommandListNV;
        public final MemorySegment PFN_glCallCommandListNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCreateStatesNV = func.invoke("glCreateStatesNV");
            PFN_glDeleteStatesNV = func.invoke("glDeleteStatesNV");
            PFN_glIsStateNV = func.invoke("glIsStateNV");
            PFN_glStateCaptureNV = func.invoke("glStateCaptureNV");
            PFN_glGetCommandHeaderNV = func.invoke("glGetCommandHeaderNV");
            PFN_glGetStageIndexNV = func.invoke("glGetStageIndexNV");
            PFN_glDrawCommandsNV = func.invoke("glDrawCommandsNV");
            PFN_glDrawCommandsAddressNV = func.invoke("glDrawCommandsAddressNV");
            PFN_glDrawCommandsStatesNV = func.invoke("glDrawCommandsStatesNV");
            PFN_glDrawCommandsStatesAddressNV = func.invoke("glDrawCommandsStatesAddressNV");
            PFN_glCreateCommandListsNV = func.invoke("glCreateCommandListsNV");
            PFN_glDeleteCommandListsNV = func.invoke("glDeleteCommandListsNV");
            PFN_glIsCommandListNV = func.invoke("glIsCommandListNV");
            PFN_glListDrawCommandsStatesClientNV = func.invoke("glListDrawCommandsStatesClientNV");
            PFN_glCommandListSegmentsNV = func.invoke("glCommandListSegmentsNV");
            PFN_glCompileCommandListNV = func.invoke("glCompileCommandListNV");
            PFN_glCallCommandListNV = func.invoke("glCallCommandListNV");
        }
    }

    public GLNVCommandList(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glCreateStatesNV(GLsizei n, GLuint* states);
    /// ```
    public void CreateStatesNV(int n, MemorySegment states) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateStatesNV)) throw new SymbolNotFoundError("Symbol not found: glCreateStatesNV");
        try { Handles.MH_glCreateStatesNV.invokeExact(handles.PFN_glCreateStatesNV, n, states); }
        catch (Throwable e) { throw new RuntimeException("error in CreateStatesNV", e); }
    }

    /// ```
    /// void glDeleteStatesNV(GLsizei n, const GLuint* states);
    /// ```
    public void DeleteStatesNV(int n, MemorySegment states) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteStatesNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteStatesNV");
        try { Handles.MH_glDeleteStatesNV.invokeExact(handles.PFN_glDeleteStatesNV, n, states); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteStatesNV", e); }
    }

    /// ```
    /// GLboolean glIsStateNV(GLuint state);
    /// ```
    public boolean IsStateNV(int state) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsStateNV)) throw new SymbolNotFoundError("Symbol not found: glIsStateNV");
        try { return (((byte) Handles.MH_glIsStateNV.invokeExact(handles.PFN_glIsStateNV, state)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsStateNV", e); }
    }

    /// ```
    /// void glStateCaptureNV(GLuint state, GLenum mode);
    /// ```
    public void StateCaptureNV(int state, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStateCaptureNV)) throw new SymbolNotFoundError("Symbol not found: glStateCaptureNV");
        try { Handles.MH_glStateCaptureNV.invokeExact(handles.PFN_glStateCaptureNV, state, mode); }
        catch (Throwable e) { throw new RuntimeException("error in StateCaptureNV", e); }
    }

    /// ```
    /// GLuint glGetCommandHeaderNV(GLenum tokenID, GLuint size);
    /// ```
    public int GetCommandHeaderNV(int tokenID, int size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCommandHeaderNV)) throw new SymbolNotFoundError("Symbol not found: glGetCommandHeaderNV");
        try { return (int) Handles.MH_glGetCommandHeaderNV.invokeExact(handles.PFN_glGetCommandHeaderNV, tokenID, size); }
        catch (Throwable e) { throw new RuntimeException("error in GetCommandHeaderNV", e); }
    }

    /// ```
    /// GLushort glGetStageIndexNV(GLenum shadertype);
    /// ```
    public short GetStageIndexNV(int shadertype) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetStageIndexNV)) throw new SymbolNotFoundError("Symbol not found: glGetStageIndexNV");
        try { return (short) Handles.MH_glGetStageIndexNV.invokeExact(handles.PFN_glGetStageIndexNV, shadertype); }
        catch (Throwable e) { throw new RuntimeException("error in GetStageIndexNV", e); }
    }

    /// ```
    /// void glDrawCommandsNV(GLenum primitiveMode, GLuint buffer, const GLintptr* indirects, const GLsizei* sizes, GLuint count);
    /// ```
    public void DrawCommandsNV(int primitiveMode, int buffer, MemorySegment indirects, MemorySegment sizes, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawCommandsNV)) throw new SymbolNotFoundError("Symbol not found: glDrawCommandsNV");
        try { Handles.MH_glDrawCommandsNV.invokeExact(handles.PFN_glDrawCommandsNV, primitiveMode, buffer, indirects, sizes, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawCommandsNV", e); }
    }

    /// ```
    /// void glDrawCommandsAddressNV(GLenum primitiveMode, const GLuint64* indirects, const GLsizei* sizes, GLuint count);
    /// ```
    public void DrawCommandsAddressNV(int primitiveMode, MemorySegment indirects, MemorySegment sizes, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawCommandsAddressNV)) throw new SymbolNotFoundError("Symbol not found: glDrawCommandsAddressNV");
        try { Handles.MH_glDrawCommandsAddressNV.invokeExact(handles.PFN_glDrawCommandsAddressNV, primitiveMode, indirects, sizes, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawCommandsAddressNV", e); }
    }

    /// ```
    /// void glDrawCommandsStatesNV(GLuint buffer, const GLintptr* indirects, const GLsizei* sizes, const GLuint* states, const GLuint* fbos, GLuint count);
    /// ```
    public void DrawCommandsStatesNV(int buffer, MemorySegment indirects, MemorySegment sizes, MemorySegment states, MemorySegment fbos, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawCommandsStatesNV)) throw new SymbolNotFoundError("Symbol not found: glDrawCommandsStatesNV");
        try { Handles.MH_glDrawCommandsStatesNV.invokeExact(handles.PFN_glDrawCommandsStatesNV, buffer, indirects, sizes, states, fbos, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawCommandsStatesNV", e); }
    }

    /// ```
    /// void glDrawCommandsStatesAddressNV(const GLuint64* indirects, const GLsizei* sizes, const GLuint* states, const GLuint* fbos, GLuint count);
    /// ```
    public void DrawCommandsStatesAddressNV(MemorySegment indirects, MemorySegment sizes, MemorySegment states, MemorySegment fbos, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawCommandsStatesAddressNV)) throw new SymbolNotFoundError("Symbol not found: glDrawCommandsStatesAddressNV");
        try { Handles.MH_glDrawCommandsStatesAddressNV.invokeExact(handles.PFN_glDrawCommandsStatesAddressNV, indirects, sizes, states, fbos, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawCommandsStatesAddressNV", e); }
    }

    /// ```
    /// void glCreateCommandListsNV(GLsizei n, GLuint* lists);
    /// ```
    public void CreateCommandListsNV(int n, MemorySegment lists) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateCommandListsNV)) throw new SymbolNotFoundError("Symbol not found: glCreateCommandListsNV");
        try { Handles.MH_glCreateCommandListsNV.invokeExact(handles.PFN_glCreateCommandListsNV, n, lists); }
        catch (Throwable e) { throw new RuntimeException("error in CreateCommandListsNV", e); }
    }

    /// ```
    /// void glDeleteCommandListsNV(GLsizei n, const GLuint* lists);
    /// ```
    public void DeleteCommandListsNV(int n, MemorySegment lists) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteCommandListsNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteCommandListsNV");
        try { Handles.MH_glDeleteCommandListsNV.invokeExact(handles.PFN_glDeleteCommandListsNV, n, lists); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteCommandListsNV", e); }
    }

    /// ```
    /// GLboolean glIsCommandListNV(GLuint list);
    /// ```
    public boolean IsCommandListNV(int list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsCommandListNV)) throw new SymbolNotFoundError("Symbol not found: glIsCommandListNV");
        try { return (((byte) Handles.MH_glIsCommandListNV.invokeExact(handles.PFN_glIsCommandListNV, list)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsCommandListNV", e); }
    }

    /// ```
    /// void glListDrawCommandsStatesClientNV(GLuint list, GLuint segment, const void** indirects, const GLsizei* sizes, const GLuint* states, const GLuint* fbos, GLuint count);
    /// ```
    public void ListDrawCommandsStatesClientNV(int list, int segment, MemorySegment indirects, MemorySegment sizes, MemorySegment states, MemorySegment fbos, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListDrawCommandsStatesClientNV)) throw new SymbolNotFoundError("Symbol not found: glListDrawCommandsStatesClientNV");
        try { Handles.MH_glListDrawCommandsStatesClientNV.invokeExact(handles.PFN_glListDrawCommandsStatesClientNV, list, segment, indirects, sizes, states, fbos, count); }
        catch (Throwable e) { throw new RuntimeException("error in ListDrawCommandsStatesClientNV", e); }
    }

    /// ```
    /// void glCommandListSegmentsNV(GLuint list, GLuint segments);
    /// ```
    public void CommandListSegmentsNV(int list, int segments) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCommandListSegmentsNV)) throw new SymbolNotFoundError("Symbol not found: glCommandListSegmentsNV");
        try { Handles.MH_glCommandListSegmentsNV.invokeExact(handles.PFN_glCommandListSegmentsNV, list, segments); }
        catch (Throwable e) { throw new RuntimeException("error in CommandListSegmentsNV", e); }
    }

    /// ```
    /// void glCompileCommandListNV(GLuint list);
    /// ```
    public void CompileCommandListNV(int list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompileCommandListNV)) throw new SymbolNotFoundError("Symbol not found: glCompileCommandListNV");
        try { Handles.MH_glCompileCommandListNV.invokeExact(handles.PFN_glCompileCommandListNV, list); }
        catch (Throwable e) { throw new RuntimeException("error in CompileCommandListNV", e); }
    }

    /// ```
    /// void glCallCommandListNV(GLuint list);
    /// ```
    public void CallCommandListNV(int list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCallCommandListNV)) throw new SymbolNotFoundError("Symbol not found: glCallCommandListNV");
        try { Handles.MH_glCallCommandListNV.invokeExact(handles.PFN_glCallCommandListNV, list); }
        catch (Throwable e) { throw new RuntimeException("error in CallCommandListNV", e); }
    }

}
