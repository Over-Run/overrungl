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
package overrungl.opengl.khr;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLKHRDebug {
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;
    public static final int GL_DEBUG_SOURCE_API = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER = 0x8251;
    public static final int GL_DEBUG_TYPE_MARKER = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = 0x826D;
    public static final int GL_BUFFER = 0x82E0;
    public static final int GL_SHADER = 0x82E1;
    public static final int GL_PROGRAM = 0x82E2;
    public static final int GL_VERTEX_ARRAY = 0x8074;
    public static final int GL_QUERY = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE = 0x82E4;
    public static final int GL_SAMPLER = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH = 0x82E8;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW = 0x9148;
    public static final int GL_DEBUG_OUTPUT = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
    public static final int GL_STACK_OVERFLOW = 0x0503;
    public static final int GL_STACK_UNDERFLOW = 0x0504;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_KHR = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_KHR = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION_KHR = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM_KHR = 0x8245;
    public static final int GL_DEBUG_SOURCE_API_KHR = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_KHR = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_KHR = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY_KHR = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION_KHR = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER_KHR = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR_KHR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_KHR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_KHR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY_KHR = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE_KHR = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER_KHR = 0x8251;
    public static final int GL_DEBUG_TYPE_MARKER_KHR = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP_KHR = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP_KHR = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION_KHR = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH_KHR = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH_KHR = 0x826D;
    public static final int GL_BUFFER_KHR = 0x82E0;
    public static final int GL_SHADER_KHR = 0x82E1;
    public static final int GL_PROGRAM_KHR = 0x82E2;
    public static final int GL_VERTEX_ARRAY_KHR = 0x8074;
    public static final int GL_QUERY_KHR = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE_KHR = 0x82E4;
    public static final int GL_SAMPLER_KHR = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH_KHR = 0x82E8;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_KHR = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_KHR = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES_KHR = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH_KHR = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_KHR = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW_KHR = 0x9148;
    public static final int GL_DEBUG_OUTPUT_KHR = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT_KHR = 0x00000002;
    public static final int GL_STACK_OVERFLOW_KHR = 0x0503;
    public static final int GL_STACK_UNDERFLOW_KHR = 0x0504;
    public static final int GL_DISPLAY_LIST = 0x82E7;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDebugMessageControl = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glDebugMessageInsert = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDebugMessageCallback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDebugMessageLog = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPushDebugGroup = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPopDebugGroup = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glObjectLabel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectLabel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glObjectPtrLabel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectPtrLabel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPointerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDebugMessageControlKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glDebugMessageInsertKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDebugMessageCallbackKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDebugMessageLogKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPushDebugGroupKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPopDebugGroupKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glObjectLabelKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectLabelKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glObjectPtrLabelKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectPtrLabelKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPointervKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDebugMessageControl;
        public final MemorySegment PFN_glDebugMessageInsert;
        public final MemorySegment PFN_glDebugMessageCallback;
        public final MemorySegment PFN_glGetDebugMessageLog;
        public final MemorySegment PFN_glPushDebugGroup;
        public final MemorySegment PFN_glPopDebugGroup;
        public final MemorySegment PFN_glObjectLabel;
        public final MemorySegment PFN_glGetObjectLabel;
        public final MemorySegment PFN_glObjectPtrLabel;
        public final MemorySegment PFN_glGetObjectPtrLabel;
        public final MemorySegment PFN_glGetPointerv;
        public final MemorySegment PFN_glDebugMessageControlKHR;
        public final MemorySegment PFN_glDebugMessageInsertKHR;
        public final MemorySegment PFN_glDebugMessageCallbackKHR;
        public final MemorySegment PFN_glGetDebugMessageLogKHR;
        public final MemorySegment PFN_glPushDebugGroupKHR;
        public final MemorySegment PFN_glPopDebugGroupKHR;
        public final MemorySegment PFN_glObjectLabelKHR;
        public final MemorySegment PFN_glGetObjectLabelKHR;
        public final MemorySegment PFN_glObjectPtrLabelKHR;
        public final MemorySegment PFN_glGetObjectPtrLabelKHR;
        public final MemorySegment PFN_glGetPointervKHR;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDebugMessageControl = func.invoke("glDebugMessageControl");
            PFN_glDebugMessageInsert = func.invoke("glDebugMessageInsert");
            PFN_glDebugMessageCallback = func.invoke("glDebugMessageCallback");
            PFN_glGetDebugMessageLog = func.invoke("glGetDebugMessageLog");
            PFN_glPushDebugGroup = func.invoke("glPushDebugGroup");
            PFN_glPopDebugGroup = func.invoke("glPopDebugGroup");
            PFN_glObjectLabel = func.invoke("glObjectLabel");
            PFN_glGetObjectLabel = func.invoke("glGetObjectLabel");
            PFN_glObjectPtrLabel = func.invoke("glObjectPtrLabel");
            PFN_glGetObjectPtrLabel = func.invoke("glGetObjectPtrLabel");
            PFN_glGetPointerv = func.invoke("glGetPointerv");PFN_glDebugMessageControlKHR = func.invoke("glDebugMessageControlKHR", "glDebugMessageControl");
            PFN_glDebugMessageInsertKHR = func.invoke("glDebugMessageInsertKHR", "glDebugMessageInsert");
            PFN_glDebugMessageCallbackKHR = func.invoke("glDebugMessageCallbackKHR", "glDebugMessageCallback");
            PFN_glGetDebugMessageLogKHR = func.invoke("glGetDebugMessageLogKHR", "glGetDebugMessageLog");
            PFN_glPushDebugGroupKHR = func.invoke("glPushDebugGroupKHR", "glPushDebugGroup");
            PFN_glPopDebugGroupKHR = func.invoke("glPopDebugGroupKHR", "glPopDebugGroup");
            PFN_glObjectLabelKHR = func.invoke("glObjectLabelKHR", "glObjectLabel");
            PFN_glGetObjectLabelKHR = func.invoke("glGetObjectLabelKHR", "glGetObjectLabel");
            PFN_glObjectPtrLabelKHR = func.invoke("glObjectPtrLabelKHR", "glObjectPtrLabel");
            PFN_glGetObjectPtrLabelKHR = func.invoke("glGetObjectPtrLabelKHR", "glGetObjectPtrLabel");
            PFN_glGetPointervKHR = func.invoke("glGetPointervKHR", "glGetPointerv");
        }
    }

    public GLKHRDebug(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDebugMessageControl((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLenum severity, (int) GLsizei count, const GLuint* ids, GLboolean enabled);
    /// ```
    public void DebugMessageControl(int source, int type, int severity, int count, MemorySegment ids, boolean enabled) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageControl)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageControl");
        try { Handles.MH_glDebugMessageControl.invokeExact(handles.PFN_glDebugMessageControl, source, type, severity, count, ids, ((enabled) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageControl", e); }
    }

    /// ```
    /// void glDebugMessageInsert((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* buf);
    /// ```
    public void DebugMessageInsert(int source, int type, int id, int severity, int length, MemorySegment buf) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageInsert)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageInsert");
        try { Handles.MH_glDebugMessageInsert.invokeExact(handles.PFN_glDebugMessageInsert, source, type, id, severity, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageInsert", e); }
    }

    /// ```
    /// void glDebugMessageCallback((void (*GLDebugProc)((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* message, const void* userParam)) GLDEBUGPROC callback, const void* userParam);
    /// ```
    public void DebugMessageCallback(MemorySegment callback, MemorySegment userParam) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageCallback)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageCallback");
        try { Handles.MH_glDebugMessageCallback.invokeExact(handles.PFN_glDebugMessageCallback, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageCallback", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGetDebugMessageLog((unsigned int) GLuint count, (int) GLsizei bufSize, GLenum* sources, GLenum* types, GLuint* ids, GLenum* severities, GLsizei* lengths, GLchar* messageLog);
    /// ```
    public int GetDebugMessageLog(int count, int bufSize, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDebugMessageLog)) throw new SymbolNotFoundError("Symbol not found: glGetDebugMessageLog");
        try { return (int) Handles.MH_glGetDebugMessageLog.invokeExact(handles.PFN_glGetDebugMessageLog, count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetDebugMessageLog", e); }
    }

    /// ```
    /// void glPushDebugGroup((unsigned int) GLenum source, (unsigned int) GLuint id, (int) GLsizei length, const GLchar* message);
    /// ```
    public void PushDebugGroup(int source, int id, int length, MemorySegment message) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPushDebugGroup)) throw new SymbolNotFoundError("Symbol not found: glPushDebugGroup");
        try { Handles.MH_glPushDebugGroup.invokeExact(handles.PFN_glPushDebugGroup, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in PushDebugGroup", e); }
    }

    /// ```
    /// void glPopDebugGroup();
    /// ```
    public void PopDebugGroup() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPopDebugGroup)) throw new SymbolNotFoundError("Symbol not found: glPopDebugGroup");
        try { Handles.MH_glPopDebugGroup.invokeExact(handles.PFN_glPopDebugGroup); }
        catch (Throwable e) { throw new RuntimeException("error in PopDebugGroup", e); }
    }

    /// ```
    /// void glObjectLabel((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectLabel(int identifier, int name, int length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectLabel)) throw new SymbolNotFoundError("Symbol not found: glObjectLabel");
        try { Handles.MH_glObjectLabel.invokeExact(handles.PFN_glObjectLabel, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectLabel", e); }
    }

    /// ```
    /// void glGetObjectLabel((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectLabel(int identifier, int name, int bufSize, MemorySegment length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectLabel)) throw new SymbolNotFoundError("Symbol not found: glGetObjectLabel");
        try { Handles.MH_glGetObjectLabel.invokeExact(handles.PFN_glGetObjectLabel, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectLabel", e); }
    }

    /// ```
    /// void glObjectPtrLabel(const void* ptr, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectPtrLabel(MemorySegment ptr, int length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectPtrLabel)) throw new SymbolNotFoundError("Symbol not found: glObjectPtrLabel");
        try { Handles.MH_glObjectPtrLabel.invokeExact(handles.PFN_glObjectPtrLabel, ptr, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectPtrLabel", e); }
    }

    /// ```
    /// void glGetObjectPtrLabel(const void* ptr, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectPtrLabel(MemorySegment ptr, int bufSize, MemorySegment length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectPtrLabel)) throw new SymbolNotFoundError("Symbol not found: glGetObjectPtrLabel");
        try { Handles.MH_glGetObjectPtrLabel.invokeExact(handles.PFN_glGetObjectPtrLabel, ptr, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectPtrLabel", e); }
    }

    /// ```
    /// void glGetPointerv((unsigned int) GLenum pname, void** params);
    /// ```
    public void GetPointerv(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointerv)) throw new SymbolNotFoundError("Symbol not found: glGetPointerv");
        try { Handles.MH_glGetPointerv.invokeExact(handles.PFN_glGetPointerv, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointerv", e); }
    }

    /// ```
    /// void glDebugMessageControlKHR((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLenum severity, (int) GLsizei count, const GLuint* ids, GLboolean enabled);
    /// ```
    public void DebugMessageControlKHR(int source, int type, int severity, int count, MemorySegment ids, boolean enabled) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageControlKHR)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageControlKHR");
        try { Handles.MH_glDebugMessageControlKHR.invokeExact(handles.PFN_glDebugMessageControlKHR, source, type, severity, count, ids, ((enabled) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageControlKHR", e); }
    }

    /// ```
    /// void glDebugMessageInsertKHR((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* buf);
    /// ```
    public void DebugMessageInsertKHR(int source, int type, int id, int severity, int length, MemorySegment buf) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageInsertKHR)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageInsertKHR");
        try { Handles.MH_glDebugMessageInsertKHR.invokeExact(handles.PFN_glDebugMessageInsertKHR, source, type, id, severity, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageInsertKHR", e); }
    }

    /// ```
    /// void glDebugMessageCallbackKHR(((void (*GLDebugProc)((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* message, const void* userParam)) GLDEBUGPROC) GLDEBUGPROCKHR callback, const void* userParam);
    /// ```
    public void DebugMessageCallbackKHR(MemorySegment callback, MemorySegment userParam) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageCallbackKHR)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageCallbackKHR");
        try { Handles.MH_glDebugMessageCallbackKHR.invokeExact(handles.PFN_glDebugMessageCallbackKHR, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageCallbackKHR", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGetDebugMessageLogKHR((unsigned int) GLuint count, (int) GLsizei bufSize, GLenum* sources, GLenum* types, GLuint* ids, GLenum* severities, GLsizei* lengths, GLchar* messageLog);
    /// ```
    public int GetDebugMessageLogKHR(int count, int bufSize, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDebugMessageLogKHR)) throw new SymbolNotFoundError("Symbol not found: glGetDebugMessageLogKHR");
        try { return (int) Handles.MH_glGetDebugMessageLogKHR.invokeExact(handles.PFN_glGetDebugMessageLogKHR, count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetDebugMessageLogKHR", e); }
    }

    /// ```
    /// void glPushDebugGroupKHR((unsigned int) GLenum source, (unsigned int) GLuint id, (int) GLsizei length, const GLchar* message);
    /// ```
    public void PushDebugGroupKHR(int source, int id, int length, MemorySegment message) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPushDebugGroupKHR)) throw new SymbolNotFoundError("Symbol not found: glPushDebugGroupKHR");
        try { Handles.MH_glPushDebugGroupKHR.invokeExact(handles.PFN_glPushDebugGroupKHR, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in PushDebugGroupKHR", e); }
    }

    /// ```
    /// void glPopDebugGroupKHR();
    /// ```
    public void PopDebugGroupKHR() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPopDebugGroupKHR)) throw new SymbolNotFoundError("Symbol not found: glPopDebugGroupKHR");
        try { Handles.MH_glPopDebugGroupKHR.invokeExact(handles.PFN_glPopDebugGroupKHR); }
        catch (Throwable e) { throw new RuntimeException("error in PopDebugGroupKHR", e); }
    }

    /// ```
    /// void glObjectLabelKHR((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectLabelKHR(int identifier, int name, int length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectLabelKHR)) throw new SymbolNotFoundError("Symbol not found: glObjectLabelKHR");
        try { Handles.MH_glObjectLabelKHR.invokeExact(handles.PFN_glObjectLabelKHR, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectLabelKHR", e); }
    }

    /// ```
    /// void glGetObjectLabelKHR((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectLabelKHR(int identifier, int name, int bufSize, MemorySegment length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectLabelKHR)) throw new SymbolNotFoundError("Symbol not found: glGetObjectLabelKHR");
        try { Handles.MH_glGetObjectLabelKHR.invokeExact(handles.PFN_glGetObjectLabelKHR, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectLabelKHR", e); }
    }

    /// ```
    /// void glObjectPtrLabelKHR(const void* ptr, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectPtrLabelKHR(MemorySegment ptr, int length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectPtrLabelKHR)) throw new SymbolNotFoundError("Symbol not found: glObjectPtrLabelKHR");
        try { Handles.MH_glObjectPtrLabelKHR.invokeExact(handles.PFN_glObjectPtrLabelKHR, ptr, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectPtrLabelKHR", e); }
    }

    /// ```
    /// void glGetObjectPtrLabelKHR(const void* ptr, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectPtrLabelKHR(MemorySegment ptr, int bufSize, MemorySegment length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectPtrLabelKHR)) throw new SymbolNotFoundError("Symbol not found: glGetObjectPtrLabelKHR");
        try { Handles.MH_glGetObjectPtrLabelKHR.invokeExact(handles.PFN_glGetObjectPtrLabelKHR, ptr, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectPtrLabelKHR", e); }
    }

    /// ```
    /// void glGetPointervKHR((unsigned int) GLenum pname, void** params);
    /// ```
    public void GetPointervKHR(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointervKHR)) throw new SymbolNotFoundError("Symbol not found: glGetPointervKHR");
        try { Handles.MH_glGetPointervKHR.invokeExact(handles.PFN_glGetPointervKHR, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointervKHR", e); }
    }

}
