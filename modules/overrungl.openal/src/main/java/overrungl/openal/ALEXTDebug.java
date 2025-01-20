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
package overrungl.openal;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.*;
import overrungl.util.*;
public final class ALEXTDebug {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_DONT_CARE_EXT = 0x0002;
    public static final int AL_DEBUG_OUTPUT_EXT = 0x19B2;
    public static final int AL_DEBUG_CALLBACK_FUNCTION_EXT = 0x19B3;
    public static final int AL_DEBUG_CALLBACK_USER_PARAM_EXT = 0x19B4;
    public static final int AL_DEBUG_SOURCE_API_EXT = 0x19B5;
    public static final int AL_DEBUG_SOURCE_AUDIO_SYSTEM_EXT = 0x19B6;
    public static final int AL_DEBUG_SOURCE_THIRD_PARTY_EXT = 0x19B7;
    public static final int AL_DEBUG_SOURCE_APPLICATION_EXT = 0x19B8;
    public static final int AL_DEBUG_SOURCE_OTHER_EXT = 0x19B9;
    public static final int AL_DEBUG_TYPE_ERROR_EXT = 0x19BA;
    public static final int AL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_EXT = 0x19BB;
    public static final int AL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_EXT = 0x19BC;
    public static final int AL_DEBUG_TYPE_PORTABILITY_EXT = 0x19BD;
    public static final int AL_DEBUG_TYPE_PERFORMANCE_EXT = 0x19BE;
    public static final int AL_DEBUG_TYPE_MARKER_EXT = 0x19BF;
    public static final int AL_DEBUG_TYPE_PUSH_GROUP_EXT = 0x19C0;
    public static final int AL_DEBUG_TYPE_POP_GROUP_EXT = 0x19C1;
    public static final int AL_DEBUG_TYPE_OTHER_EXT = 0x19C2;
    public static final int AL_DEBUG_SEVERITY_HIGH_EXT = 0x19C3;
    public static final int AL_DEBUG_SEVERITY_MEDIUM_EXT = 0x19C4;
    public static final int AL_DEBUG_SEVERITY_LOW_EXT = 0x19C5;
    public static final int AL_DEBUG_SEVERITY_NOTIFICATION_EXT = 0x19C6;
    public static final int AL_DEBUG_LOGGED_MESSAGES_EXT = 0x19C7;
    public static final int AL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_EXT = 0x19C8;
    public static final int AL_MAX_DEBUG_MESSAGE_LENGTH_EXT = 0x19C9;
    public static final int AL_MAX_DEBUG_LOGGED_MESSAGES_EXT = 0x19CA;
    public static final int AL_MAX_DEBUG_GROUP_STACK_DEPTH_EXT = 0x19CB;
    public static final int AL_MAX_LABEL_LENGTH_EXT = 0x19CC;
    public static final int AL_STACK_OVERFLOW_EXT = 0x19CD;
    public static final int AL_STACK_UNDERFLOW_EXT = 0x19CE;
    public static final int AL_CONTEXT_FLAGS_EXT = 0x19CF;
    public static final int AL_BUFFER_EXT = 0x1009;
    public static final int AL_SOURCE_EXT = 0x19D0;
    public static final int AL_FILTER_EXT = 0x19D1;
    public static final int AL_EFFECT_EXT = 0x19D2;
    public static final int AL_AUXILIARY_EFFECT_SLOT_EXT = 0x19D3;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alDebugMessageCallbackEXT`.
        public static final MethodHandle MH_alDebugMessageCallbackEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alDebugMessageInsertEXT`.
        public static final MethodHandle MH_alDebugMessageInsertEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `alDebugMessageControlEXT`.
        public static final MethodHandle MH_alDebugMessageControlEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `alPushDebugGroupEXT`.
        public static final MethodHandle MH_alPushDebugGroupEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `alPopDebugGroupEXT`.
        public static final MethodHandle MH_alPopDebugGroupEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        /// The method handle of `alGetDebugMessageLogEXT`.
        public static final MethodHandle MH_alGetDebugMessageLogEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alObjectLabelEXT`.
        public static final MethodHandle MH_alObjectLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `alGetObjectLabelEXT`.
        public static final MethodHandle MH_alGetObjectLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alGetPointerEXT`.
        public static final MethodHandle MH_alGetPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetPointervEXT`.
        public static final MethodHandle MH_alGetPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The function address of `alDebugMessageCallbackEXT`.
        public final MemorySegment PFN_alDebugMessageCallbackEXT;
        /// The function address of `alDebugMessageInsertEXT`.
        public final MemorySegment PFN_alDebugMessageInsertEXT;
        /// The function address of `alDebugMessageControlEXT`.
        public final MemorySegment PFN_alDebugMessageControlEXT;
        /// The function address of `alPushDebugGroupEXT`.
        public final MemorySegment PFN_alPushDebugGroupEXT;
        /// The function address of `alPopDebugGroupEXT`.
        public final MemorySegment PFN_alPopDebugGroupEXT;
        /// The function address of `alGetDebugMessageLogEXT`.
        public final MemorySegment PFN_alGetDebugMessageLogEXT;
        /// The function address of `alObjectLabelEXT`.
        public final MemorySegment PFN_alObjectLabelEXT;
        /// The function address of `alGetObjectLabelEXT`.
        public final MemorySegment PFN_alGetObjectLabelEXT;
        /// The function address of `alGetPointerEXT`.
        public final MemorySegment PFN_alGetPointerEXT;
        /// The function address of `alGetPointervEXT`.
        public final MemorySegment PFN_alGetPointervEXT;
        private Handles() {
            PFN_alDebugMessageCallbackEXT = ALInternal.lookup().find("alDebugMessageCallbackEXT").orElse(MemorySegment.NULL);
            PFN_alDebugMessageInsertEXT = ALInternal.lookup().find("alDebugMessageInsertEXT").orElse(MemorySegment.NULL);
            PFN_alDebugMessageControlEXT = ALInternal.lookup().find("alDebugMessageControlEXT").orElse(MemorySegment.NULL);
            PFN_alPushDebugGroupEXT = ALInternal.lookup().find("alPushDebugGroupEXT").orElse(MemorySegment.NULL);
            PFN_alPopDebugGroupEXT = ALInternal.lookup().find("alPopDebugGroupEXT").orElse(MemorySegment.NULL);
            PFN_alGetDebugMessageLogEXT = ALInternal.lookup().find("alGetDebugMessageLogEXT").orElse(MemorySegment.NULL);
            PFN_alObjectLabelEXT = ALInternal.lookup().find("alObjectLabelEXT").orElse(MemorySegment.NULL);
            PFN_alGetObjectLabelEXT = ALInternal.lookup().find("alGetObjectLabelEXT").orElse(MemorySegment.NULL);
            PFN_alGetPointerEXT = ALInternal.lookup().find("alGetPointerEXT").orElse(MemorySegment.NULL);
            PFN_alGetPointervEXT = ALInternal.lookup().find("alGetPointervEXT").orElse(MemorySegment.NULL);
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    public static void alDebugMessageCallbackEXT(@CType("ALDEBUGPROCEXT") MemorySegment callback, @CType("void*") MemorySegment userParam) {
        if (Handles.MH_alDebugMessageCallbackEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageCallbackEXT");
        try {
            Handles.MH_alDebugMessageCallbackEXT.invokeExact(Handles.get().PFN_alDebugMessageCallbackEXT, callback, userParam);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageCallbackEXT", e); }
    }

    public static void alDebugMessageInsertEXT(@CType("ALenum") int source, @CType("ALenum") int type, @CType("ALuint") int id, @CType("ALenum") int severity, @CType("ALsizei") int length, @CType("const ALchar*") MemorySegment message) {
        if (Handles.MH_alDebugMessageInsertEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageInsertEXT");
        try {
            Handles.MH_alDebugMessageInsertEXT.invokeExact(Handles.get().PFN_alDebugMessageInsertEXT, source, type, id, severity, length, message);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageInsertEXT", e); }
    }

    public static void alDebugMessageControlEXT(@CType("ALenum") int source, @CType("ALenum") int type, @CType("ALenum") int severity, @CType("ALsizei") int count, @CType("const ALuint *") MemorySegment ids, @CType("ALboolean") boolean enable) {
        if (Handles.MH_alDebugMessageControlEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageControlEXT");
        try {
            Handles.MH_alDebugMessageControlEXT.invokeExact(Handles.get().PFN_alDebugMessageControlEXT, source, type, severity, count, ids, enable);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageControlEXT", e); }
    }

    public static void alPushDebugGroupEXT(@CType("ALenum") int source, @CType("ALuint") int id, @CType("ALsizei") int length, @CType("const ALchar*") MemorySegment message) {
        if (Handles.MH_alPushDebugGroupEXT == null) throw new SymbolNotFoundError("Symbol not found: alPushDebugGroupEXT");
        try {
            Handles.MH_alPushDebugGroupEXT.invokeExact(Handles.get().PFN_alPushDebugGroupEXT, source, id, length, message);
        } catch (Throwable e) { throw new RuntimeException("error in alPushDebugGroupEXT", e); }
    }

    public static void alPopDebugGroupEXT() {
        if (Handles.MH_alPopDebugGroupEXT == null) throw new SymbolNotFoundError("Symbol not found: alPopDebugGroupEXT");
        try {
            Handles.MH_alPopDebugGroupEXT.invokeExact(Handles.get().PFN_alPopDebugGroupEXT);
        } catch (Throwable e) { throw new RuntimeException("error in alPopDebugGroupEXT", e); }
    }

    public static @CType("ALuint") int alGetDebugMessageLogEXT(@CType("ALuint") int count, @CType("ALsizei") int logBufSize, @CType("ALenum *") MemorySegment sources, @CType("ALenum *") MemorySegment types, @CType("ALuint *") MemorySegment ids, @CType("ALenum *") MemorySegment severities, @CType("ALsizei *") MemorySegment lengths, @CType("ALchar*") MemorySegment logBuf) {
        if (Handles.MH_alGetDebugMessageLogEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetDebugMessageLogEXT");
        try {
            return (int) Handles.MH_alGetDebugMessageLogEXT.invokeExact(Handles.get().PFN_alGetDebugMessageLogEXT, count, logBufSize, sources, types, ids, severities, lengths, logBuf);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDebugMessageLogEXT", e); }
    }

    public static void alObjectLabelEXT(@CType("ALenum") int identifier, @CType("ALuint") int name, @CType("ALsizei") int length, @CType("const ALchar*") MemorySegment label) {
        if (Handles.MH_alObjectLabelEXT == null) throw new SymbolNotFoundError("Symbol not found: alObjectLabelEXT");
        try {
            Handles.MH_alObjectLabelEXT.invokeExact(Handles.get().PFN_alObjectLabelEXT, identifier, name, length, label);
        } catch (Throwable e) { throw new RuntimeException("error in alObjectLabelEXT", e); }
    }

    public static void alGetObjectLabelEXT(@CType("ALenum") int identifier, @CType("ALuint") int name, @CType("ALsizei") int bufSize, @CType("ALsizei *") MemorySegment length, @CType("ALchar*") MemorySegment label) {
        if (Handles.MH_alGetObjectLabelEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetObjectLabelEXT");
        try {
            Handles.MH_alGetObjectLabelEXT.invokeExact(Handles.get().PFN_alGetObjectLabelEXT, identifier, name, bufSize, length, label);
        } catch (Throwable e) { throw new RuntimeException("error in alGetObjectLabelEXT", e); }
    }

    public static @CType("void*") MemorySegment alGetPointerEXT(@CType("ALenum") int pname) {
        if (Handles.MH_alGetPointerEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointerEXT");
        try {
            return (MemorySegment) Handles.MH_alGetPointerEXT.invokeExact(Handles.get().PFN_alGetPointerEXT, pname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointerEXT", e); }
    }

    public static void alGetPointervEXT(@CType("ALenum") int pname, @CType("void**") MemorySegment values) {
        if (Handles.MH_alGetPointervEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointervEXT");
        try {
            Handles.MH_alGetPointervEXT.invokeExact(Handles.get().PFN_alGetPointervEXT, pname, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointervEXT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALEXTDebug() {
    }
}
