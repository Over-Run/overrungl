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
import overrungl.annotation.*;
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
    public static final MethodHandle MH_glDebugMessageControl = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
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
    public static final MethodHandle MH_glDebugMessageControlKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
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

    public GLKHRDebug(overrungl.opengl.GLLoadFunc func) {
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

    public void DebugMessageControl(@CType("GLenum") int source, @CType("GLenum") int type, @CType("GLenum") int severity, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment ids, @CType("GLboolean") boolean enabled) {
        if (Unmarshal.isNullPointer(PFN_glDebugMessageControl)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageControl");
        try { MH_glDebugMessageControl.invokeExact(PFN_glDebugMessageControl, source, type, severity, count, ids, enabled); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageControl", e); }
    }

    public void DebugMessageInsert(@CType("GLenum") int source, @CType("GLenum") int type, @CType("GLuint") int id, @CType("GLenum") int severity, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment buf) {
        if (Unmarshal.isNullPointer(PFN_glDebugMessageInsert)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageInsert");
        try { MH_glDebugMessageInsert.invokeExact(PFN_glDebugMessageInsert, source, type, id, severity, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageInsert", e); }
    }

    public void DebugMessageCallback(@CType("GLDEBUGPROC") java.lang.foreign.MemorySegment callback, @CType("const void *") java.lang.foreign.MemorySegment userParam) {
        if (Unmarshal.isNullPointer(PFN_glDebugMessageCallback)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageCallback");
        try { MH_glDebugMessageCallback.invokeExact(PFN_glDebugMessageCallback, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageCallback", e); }
    }

    public @CType("GLuint") int GetDebugMessageLog(@CType("GLuint") int count, @CType("GLsizei") int bufSize, @CType("GLenum *") java.lang.foreign.MemorySegment sources, @CType("GLenum *") java.lang.foreign.MemorySegment types, @CType("GLuint *") java.lang.foreign.MemorySegment ids, @CType("GLenum *") java.lang.foreign.MemorySegment severities, @CType("GLsizei *") java.lang.foreign.MemorySegment lengths, @CType("GLchar *") java.lang.foreign.MemorySegment messageLog) {
        if (Unmarshal.isNullPointer(PFN_glGetDebugMessageLog)) throw new SymbolNotFoundError("Symbol not found: glGetDebugMessageLog");
        try { return (int) MH_glGetDebugMessageLog.invokeExact(PFN_glGetDebugMessageLog, count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDebugMessageLog", e); }
    }

    public void PushDebugGroup(@CType("GLenum") int source, @CType("GLuint") int id, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment message) {
        if (Unmarshal.isNullPointer(PFN_glPushDebugGroup)) throw new SymbolNotFoundError("Symbol not found: glPushDebugGroup");
        try { MH_glPushDebugGroup.invokeExact(PFN_glPushDebugGroup, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in glPushDebugGroup", e); }
    }

    public void PopDebugGroup() {
        if (Unmarshal.isNullPointer(PFN_glPopDebugGroup)) throw new SymbolNotFoundError("Symbol not found: glPopDebugGroup");
        try { MH_glPopDebugGroup.invokeExact(PFN_glPopDebugGroup); }
        catch (Throwable e) { throw new RuntimeException("error in glPopDebugGroup", e); }
    }

    public void ObjectLabel(@CType("GLenum") int identifier, @CType("GLuint") int name, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(PFN_glObjectLabel)) throw new SymbolNotFoundError("Symbol not found: glObjectLabel");
        try { MH_glObjectLabel.invokeExact(PFN_glObjectLabel, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glObjectLabel", e); }
    }

    public void GetObjectLabel(@CType("GLenum") int identifier, @CType("GLuint") int name, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(PFN_glGetObjectLabel)) throw new SymbolNotFoundError("Symbol not found: glGetObjectLabel");
        try { MH_glGetObjectLabel.invokeExact(PFN_glGetObjectLabel, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectLabel", e); }
    }

    public void ObjectPtrLabel(@CType("const void *") java.lang.foreign.MemorySegment ptr, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(PFN_glObjectPtrLabel)) throw new SymbolNotFoundError("Symbol not found: glObjectPtrLabel");
        try { MH_glObjectPtrLabel.invokeExact(PFN_glObjectPtrLabel, ptr, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glObjectPtrLabel", e); }
    }

    public void GetObjectPtrLabel(@CType("const void *") java.lang.foreign.MemorySegment ptr, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(PFN_glGetObjectPtrLabel)) throw new SymbolNotFoundError("Symbol not found: glGetObjectPtrLabel");
        try { MH_glGetObjectPtrLabel.invokeExact(PFN_glGetObjectPtrLabel, ptr, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectPtrLabel", e); }
    }

    public void GetPointerv(@CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetPointerv)) throw new SymbolNotFoundError("Symbol not found: glGetPointerv");
        try { MH_glGetPointerv.invokeExact(PFN_glGetPointerv, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPointerv", e); }
    }

    public void DebugMessageControlKHR(@CType("GLenum") int source, @CType("GLenum") int type, @CType("GLenum") int severity, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment ids, @CType("GLboolean") boolean enabled) {
        if (Unmarshal.isNullPointer(PFN_glDebugMessageControlKHR)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageControlKHR");
        try { MH_glDebugMessageControlKHR.invokeExact(PFN_glDebugMessageControlKHR, source, type, severity, count, ids, enabled); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageControlKHR", e); }
    }

    public void DebugMessageInsertKHR(@CType("GLenum") int source, @CType("GLenum") int type, @CType("GLuint") int id, @CType("GLenum") int severity, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment buf) {
        if (Unmarshal.isNullPointer(PFN_glDebugMessageInsertKHR)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageInsertKHR");
        try { MH_glDebugMessageInsertKHR.invokeExact(PFN_glDebugMessageInsertKHR, source, type, id, severity, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageInsertKHR", e); }
    }

    public void DebugMessageCallbackKHR(@CType("GLDEBUGPROCKHR") java.lang.foreign.MemorySegment callback, @CType("const void *") java.lang.foreign.MemorySegment userParam) {
        if (Unmarshal.isNullPointer(PFN_glDebugMessageCallbackKHR)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageCallbackKHR");
        try { MH_glDebugMessageCallbackKHR.invokeExact(PFN_glDebugMessageCallbackKHR, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in glDebugMessageCallbackKHR", e); }
    }

    public @CType("GLuint") int GetDebugMessageLogKHR(@CType("GLuint") int count, @CType("GLsizei") int bufSize, @CType("GLenum *") java.lang.foreign.MemorySegment sources, @CType("GLenum *") java.lang.foreign.MemorySegment types, @CType("GLuint *") java.lang.foreign.MemorySegment ids, @CType("GLenum *") java.lang.foreign.MemorySegment severities, @CType("GLsizei *") java.lang.foreign.MemorySegment lengths, @CType("GLchar *") java.lang.foreign.MemorySegment messageLog) {
        if (Unmarshal.isNullPointer(PFN_glGetDebugMessageLogKHR)) throw new SymbolNotFoundError("Symbol not found: glGetDebugMessageLogKHR");
        try { return (int) MH_glGetDebugMessageLogKHR.invokeExact(PFN_glGetDebugMessageLogKHR, count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDebugMessageLogKHR", e); }
    }

    public void PushDebugGroupKHR(@CType("GLenum") int source, @CType("GLuint") int id, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment message) {
        if (Unmarshal.isNullPointer(PFN_glPushDebugGroupKHR)) throw new SymbolNotFoundError("Symbol not found: glPushDebugGroupKHR");
        try { MH_glPushDebugGroupKHR.invokeExact(PFN_glPushDebugGroupKHR, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in glPushDebugGroupKHR", e); }
    }

    public void PopDebugGroupKHR() {
        if (Unmarshal.isNullPointer(PFN_glPopDebugGroupKHR)) throw new SymbolNotFoundError("Symbol not found: glPopDebugGroupKHR");
        try { MH_glPopDebugGroupKHR.invokeExact(PFN_glPopDebugGroupKHR); }
        catch (Throwable e) { throw new RuntimeException("error in glPopDebugGroupKHR", e); }
    }

    public void ObjectLabelKHR(@CType("GLenum") int identifier, @CType("GLuint") int name, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(PFN_glObjectLabelKHR)) throw new SymbolNotFoundError("Symbol not found: glObjectLabelKHR");
        try { MH_glObjectLabelKHR.invokeExact(PFN_glObjectLabelKHR, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glObjectLabelKHR", e); }
    }

    public void GetObjectLabelKHR(@CType("GLenum") int identifier, @CType("GLuint") int name, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(PFN_glGetObjectLabelKHR)) throw new SymbolNotFoundError("Symbol not found: glGetObjectLabelKHR");
        try { MH_glGetObjectLabelKHR.invokeExact(PFN_glGetObjectLabelKHR, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectLabelKHR", e); }
    }

    public void ObjectPtrLabelKHR(@CType("const void *") java.lang.foreign.MemorySegment ptr, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(PFN_glObjectPtrLabelKHR)) throw new SymbolNotFoundError("Symbol not found: glObjectPtrLabelKHR");
        try { MH_glObjectPtrLabelKHR.invokeExact(PFN_glObjectPtrLabelKHR, ptr, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glObjectPtrLabelKHR", e); }
    }

    public void GetObjectPtrLabelKHR(@CType("const void *") java.lang.foreign.MemorySegment ptr, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(PFN_glGetObjectPtrLabelKHR)) throw new SymbolNotFoundError("Symbol not found: glGetObjectPtrLabelKHR");
        try { MH_glGetObjectPtrLabelKHR.invokeExact(PFN_glGetObjectPtrLabelKHR, ptr, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectPtrLabelKHR", e); }
    }

    public void GetPointervKHR(@CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetPointervKHR)) throw new SymbolNotFoundError("Symbol not found: glGetPointervKHR");
        try { MH_glGetPointervKHR.invokeExact(PFN_glGetPointervKHR, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPointervKHR", e); }
    }

}
