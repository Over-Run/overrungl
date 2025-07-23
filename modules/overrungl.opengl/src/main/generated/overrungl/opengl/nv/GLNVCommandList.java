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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

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
        public static final MethodHandle MH_glCreateStatesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteStatesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsStateNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStateCaptureNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetCommandHeaderNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetStageIndexNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawCommandsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawCommandsAddressNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawCommandsStatesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawCommandsStatesAddressNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateCommandListsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteCommandListsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsCommandListNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glListDrawCommandsStatesClientNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCommandListSegmentsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCompileCommandListNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCallCommandListNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
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
    /// void glCreateStatesNV((int) GLsizei n, GLuint* states);
    /// ```
    public void CreateStatesNV(int n, MemorySegment states) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateStatesNV)) throw new GLSymbolNotFoundError("Symbol not found: glCreateStatesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateStatesNV", n, states); }
        Handles.MH_glCreateStatesNV.invokeExact(handles.PFN_glCreateStatesNV, n, states); }
        catch (Throwable e) { throw new RuntimeException("error in CreateStatesNV", e); }
    }

    /// ```
    /// void glDeleteStatesNV((int) GLsizei n, const GLuint* states);
    /// ```
    public void DeleteStatesNV(int n, MemorySegment states) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteStatesNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteStatesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteStatesNV", n, states); }
        Handles.MH_glDeleteStatesNV.invokeExact(handles.PFN_glDeleteStatesNV, n, states); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteStatesNV", e); }
    }

    /// ```
    /// GLboolean glIsStateNV((unsigned int) GLuint state);
    /// ```
    public boolean IsStateNV(int state) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsStateNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsStateNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsStateNV", state); }
        return (((byte) Handles.MH_glIsStateNV.invokeExact(handles.PFN_glIsStateNV, state)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsStateNV", e); }
    }

    /// ```
    /// void glStateCaptureNV((unsigned int) GLuint state, (unsigned int) GLenum mode);
    /// ```
    public void StateCaptureNV(int state, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStateCaptureNV)) throw new GLSymbolNotFoundError("Symbol not found: glStateCaptureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStateCaptureNV", state, mode); }
        Handles.MH_glStateCaptureNV.invokeExact(handles.PFN_glStateCaptureNV, state, mode); }
        catch (Throwable e) { throw new RuntimeException("error in StateCaptureNV", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGetCommandHeaderNV((unsigned int) GLenum tokenID, (unsigned int) GLuint size);
    /// ```
    public int GetCommandHeaderNV(int tokenID, int size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCommandHeaderNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetCommandHeaderNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCommandHeaderNV", tokenID, size); }
        return (int) Handles.MH_glGetCommandHeaderNV.invokeExact(handles.PFN_glGetCommandHeaderNV, tokenID, size); }
        catch (Throwable e) { throw new RuntimeException("error in GetCommandHeaderNV", e); }
    }

    /// ```
    /// ((unsigned short) khronos_uint16_t) GLushort glGetStageIndexNV((unsigned int) GLenum shadertype);
    /// ```
    public short GetStageIndexNV(int shadertype) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetStageIndexNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetStageIndexNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetStageIndexNV", shadertype); }
        return (short) Handles.MH_glGetStageIndexNV.invokeExact(handles.PFN_glGetStageIndexNV, shadertype); }
        catch (Throwable e) { throw new RuntimeException("error in GetStageIndexNV", e); }
    }

    /// ```
    /// void glDrawCommandsNV((unsigned int) GLenum primitiveMode, (unsigned int) GLuint buffer, const GLintptr* indirects, const GLsizei* sizes, (unsigned int) GLuint count);
    /// ```
    public void DrawCommandsNV(int primitiveMode, int buffer, MemorySegment indirects, MemorySegment sizes, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawCommandsNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawCommandsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawCommandsNV", primitiveMode, buffer, indirects, sizes, count); }
        Handles.MH_glDrawCommandsNV.invokeExact(handles.PFN_glDrawCommandsNV, primitiveMode, buffer, indirects, sizes, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawCommandsNV", e); }
    }

    /// ```
    /// void glDrawCommandsAddressNV((unsigned int) GLenum primitiveMode, const GLuint64* indirects, const GLsizei* sizes, (unsigned int) GLuint count);
    /// ```
    public void DrawCommandsAddressNV(int primitiveMode, MemorySegment indirects, MemorySegment sizes, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawCommandsAddressNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawCommandsAddressNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawCommandsAddressNV", primitiveMode, indirects, sizes, count); }
        Handles.MH_glDrawCommandsAddressNV.invokeExact(handles.PFN_glDrawCommandsAddressNV, primitiveMode, indirects, sizes, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawCommandsAddressNV", e); }
    }

    /// ```
    /// void glDrawCommandsStatesNV((unsigned int) GLuint buffer, const GLintptr* indirects, const GLsizei* sizes, const GLuint* states, const GLuint* fbos, (unsigned int) GLuint count);
    /// ```
    public void DrawCommandsStatesNV(int buffer, MemorySegment indirects, MemorySegment sizes, MemorySegment states, MemorySegment fbos, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawCommandsStatesNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawCommandsStatesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawCommandsStatesNV", buffer, indirects, sizes, states, fbos, count); }
        Handles.MH_glDrawCommandsStatesNV.invokeExact(handles.PFN_glDrawCommandsStatesNV, buffer, indirects, sizes, states, fbos, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawCommandsStatesNV", e); }
    }

    /// ```
    /// void glDrawCommandsStatesAddressNV(const GLuint64* indirects, const GLsizei* sizes, const GLuint* states, const GLuint* fbos, (unsigned int) GLuint count);
    /// ```
    public void DrawCommandsStatesAddressNV(MemorySegment indirects, MemorySegment sizes, MemorySegment states, MemorySegment fbos, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawCommandsStatesAddressNV)) throw new GLSymbolNotFoundError("Symbol not found: glDrawCommandsStatesAddressNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawCommandsStatesAddressNV", indirects, sizes, states, fbos, count); }
        Handles.MH_glDrawCommandsStatesAddressNV.invokeExact(handles.PFN_glDrawCommandsStatesAddressNV, indirects, sizes, states, fbos, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawCommandsStatesAddressNV", e); }
    }

    /// ```
    /// void glCreateCommandListsNV((int) GLsizei n, GLuint* lists);
    /// ```
    public void CreateCommandListsNV(int n, MemorySegment lists) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateCommandListsNV)) throw new GLSymbolNotFoundError("Symbol not found: glCreateCommandListsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateCommandListsNV", n, lists); }
        Handles.MH_glCreateCommandListsNV.invokeExact(handles.PFN_glCreateCommandListsNV, n, lists); }
        catch (Throwable e) { throw new RuntimeException("error in CreateCommandListsNV", e); }
    }

    /// ```
    /// void glDeleteCommandListsNV((int) GLsizei n, const GLuint* lists);
    /// ```
    public void DeleteCommandListsNV(int n, MemorySegment lists) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteCommandListsNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteCommandListsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteCommandListsNV", n, lists); }
        Handles.MH_glDeleteCommandListsNV.invokeExact(handles.PFN_glDeleteCommandListsNV, n, lists); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteCommandListsNV", e); }
    }

    /// ```
    /// GLboolean glIsCommandListNV((unsigned int) GLuint list);
    /// ```
    public boolean IsCommandListNV(int list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsCommandListNV)) throw new GLSymbolNotFoundError("Symbol not found: glIsCommandListNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsCommandListNV", list); }
        return (((byte) Handles.MH_glIsCommandListNV.invokeExact(handles.PFN_glIsCommandListNV, list)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsCommandListNV", e); }
    }

    /// ```
    /// void glListDrawCommandsStatesClientNV((unsigned int) GLuint list, (unsigned int) GLuint segment, const void** indirects, const GLsizei* sizes, const GLuint* states, const GLuint* fbos, (unsigned int) GLuint count);
    /// ```
    public void ListDrawCommandsStatesClientNV(int list, int segment, MemorySegment indirects, MemorySegment sizes, MemorySegment states, MemorySegment fbos, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glListDrawCommandsStatesClientNV)) throw new GLSymbolNotFoundError("Symbol not found: glListDrawCommandsStatesClientNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glListDrawCommandsStatesClientNV", list, segment, indirects, sizes, states, fbos, count); }
        Handles.MH_glListDrawCommandsStatesClientNV.invokeExact(handles.PFN_glListDrawCommandsStatesClientNV, list, segment, indirects, sizes, states, fbos, count); }
        catch (Throwable e) { throw new RuntimeException("error in ListDrawCommandsStatesClientNV", e); }
    }

    /// ```
    /// void glCommandListSegmentsNV((unsigned int) GLuint list, (unsigned int) GLuint segments);
    /// ```
    public void CommandListSegmentsNV(int list, int segments) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCommandListSegmentsNV)) throw new GLSymbolNotFoundError("Symbol not found: glCommandListSegmentsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCommandListSegmentsNV", list, segments); }
        Handles.MH_glCommandListSegmentsNV.invokeExact(handles.PFN_glCommandListSegmentsNV, list, segments); }
        catch (Throwable e) { throw new RuntimeException("error in CommandListSegmentsNV", e); }
    }

    /// ```
    /// void glCompileCommandListNV((unsigned int) GLuint list);
    /// ```
    public void CompileCommandListNV(int list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompileCommandListNV)) throw new GLSymbolNotFoundError("Symbol not found: glCompileCommandListNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompileCommandListNV", list); }
        Handles.MH_glCompileCommandListNV.invokeExact(handles.PFN_glCompileCommandListNV, list); }
        catch (Throwable e) { throw new RuntimeException("error in CompileCommandListNV", e); }
    }

    /// ```
    /// void glCallCommandListNV((unsigned int) GLuint list);
    /// ```
    public void CallCommandListNV(int list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCallCommandListNV)) throw new GLSymbolNotFoundError("Symbol not found: glCallCommandListNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCallCommandListNV", list); }
        Handles.MH_glCallCommandListNV.invokeExact(handles.PFN_glCallCommandListNV, list); }
        catch (Throwable e) { throw new RuntimeException("error in CallCommandListNV", e); }
    }

}
