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
import java.util.*;
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
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alDebugMessageCallbackEXT`.
        public static final FunctionDescriptor FD_alDebugMessageCallbackEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alDebugMessageInsertEXT`.
        public static final FunctionDescriptor FD_alDebugMessageInsertEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alDebugMessageControlEXT`.
        public static final FunctionDescriptor FD_alDebugMessageControlEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN);
        /// The function descriptor of `alPushDebugGroupEXT`.
        public static final FunctionDescriptor FD_alPushDebugGroupEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alPopDebugGroupEXT`.
        public static final FunctionDescriptor FD_alPopDebugGroupEXT = FunctionDescriptor.ofVoid();
        /// The function descriptor of `alGetDebugMessageLogEXT`.
        public static final FunctionDescriptor FD_alGetDebugMessageLogEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alObjectLabelEXT`.
        public static final FunctionDescriptor FD_alObjectLabelEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alGetObjectLabelEXT`.
        public static final FunctionDescriptor FD_alGetObjectLabelEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alGetPointerEXT`.
        public static final FunctionDescriptor FD_alGetPointerEXT = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetPointervEXT`.
        public static final FunctionDescriptor FD_alGetPointervEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alDebugMessageCallbackEXT,
            FD_alDebugMessageInsertEXT,
            FD_alDebugMessageControlEXT,
            FD_alPushDebugGroupEXT,
            FD_alPopDebugGroupEXT,
            FD_alGetDebugMessageLogEXT,
            FD_alObjectLabelEXT,
            FD_alGetObjectLabelEXT,
            FD_alGetPointerEXT,
            FD_alGetPointervEXT
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alDebugMessageCallbackEXT`.
        public static final MethodHandle MH_alDebugMessageCallbackEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDebugMessageCallbackEXT", Descriptors.FD_alDebugMessageCallbackEXT);
        /// The method handle of `alDebugMessageInsertEXT`.
        public static final MethodHandle MH_alDebugMessageInsertEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDebugMessageInsertEXT", Descriptors.FD_alDebugMessageInsertEXT);
        /// The method handle of `alDebugMessageControlEXT`.
        public static final MethodHandle MH_alDebugMessageControlEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDebugMessageControlEXT", Descriptors.FD_alDebugMessageControlEXT);
        /// The method handle of `alPushDebugGroupEXT`.
        public static final MethodHandle MH_alPushDebugGroupEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alPushDebugGroupEXT", Descriptors.FD_alPushDebugGroupEXT);
        /// The method handle of `alPopDebugGroupEXT`.
        public static final MethodHandle MH_alPopDebugGroupEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alPopDebugGroupEXT", Descriptors.FD_alPopDebugGroupEXT);
        /// The method handle of `alGetDebugMessageLogEXT`.
        public static final MethodHandle MH_alGetDebugMessageLogEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetDebugMessageLogEXT", Descriptors.FD_alGetDebugMessageLogEXT);
        /// The method handle of `alObjectLabelEXT`.
        public static final MethodHandle MH_alObjectLabelEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alObjectLabelEXT", Descriptors.FD_alObjectLabelEXT);
        /// The method handle of `alGetObjectLabelEXT`.
        public static final MethodHandle MH_alGetObjectLabelEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetObjectLabelEXT", Descriptors.FD_alGetObjectLabelEXT);
        /// The method handle of `alGetPointerEXT`.
        public static final MethodHandle MH_alGetPointerEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetPointerEXT", Descriptors.FD_alGetPointerEXT);
        /// The method handle of `alGetPointervEXT`.
        public static final MethodHandle MH_alGetPointervEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetPointervEXT", Descriptors.FD_alGetPointervEXT);
    }

    public static void alDebugMessageCallbackEXT(@CType("ALDEBUGPROCEXT") java.lang.foreign.MemorySegment callback, @CType("void*") java.lang.foreign.MemorySegment userParam) {
        if (Handles.MH_alDebugMessageCallbackEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageCallbackEXT");
        try {
            Handles.MH_alDebugMessageCallbackEXT.invokeExact(callback, userParam);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageCallbackEXT", e); }
    }

    public static void alDebugMessageInsertEXT(@CType("ALenum") int source, @CType("ALenum") int type, @CType("ALuint") int id, @CType("ALenum") int severity, @CType("ALsizei") int length, @CType("const ALchar*") java.lang.foreign.MemorySegment message) {
        if (Handles.MH_alDebugMessageInsertEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageInsertEXT");
        try {
            Handles.MH_alDebugMessageInsertEXT.invokeExact(source, type, id, severity, length, message);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageInsertEXT", e); }
    }

    public static void alDebugMessageControlEXT(@CType("ALenum") int source, @CType("ALenum") int type, @CType("ALenum") int severity, @CType("ALsizei") int count, @CType("const ALuint *") java.lang.foreign.MemorySegment ids, @CType("ALboolean") boolean enable) {
        if (Handles.MH_alDebugMessageControlEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageControlEXT");
        try {
            Handles.MH_alDebugMessageControlEXT.invokeExact(source, type, severity, count, ids, enable);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageControlEXT", e); }
    }

    public static void alPushDebugGroupEXT(@CType("ALenum") int source, @CType("ALuint") int id, @CType("ALsizei") int length, @CType("const ALchar*") java.lang.foreign.MemorySegment message) {
        if (Handles.MH_alPushDebugGroupEXT == null) throw new SymbolNotFoundError("Symbol not found: alPushDebugGroupEXT");
        try {
            Handles.MH_alPushDebugGroupEXT.invokeExact(source, id, length, message);
        } catch (Throwable e) { throw new RuntimeException("error in alPushDebugGroupEXT", e); }
    }

    public static void alPopDebugGroupEXT() {
        if (Handles.MH_alPopDebugGroupEXT == null) throw new SymbolNotFoundError("Symbol not found: alPopDebugGroupEXT");
        try {
            Handles.MH_alPopDebugGroupEXT.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in alPopDebugGroupEXT", e); }
    }

    public static @CType("ALuint") int alGetDebugMessageLogEXT(@CType("ALuint") int count, @CType("ALsizei") int logBufSize, @CType("ALenum *") java.lang.foreign.MemorySegment sources, @CType("ALenum *") java.lang.foreign.MemorySegment types, @CType("ALuint *") java.lang.foreign.MemorySegment ids, @CType("ALenum *") java.lang.foreign.MemorySegment severities, @CType("ALsizei *") java.lang.foreign.MemorySegment lengths, @CType("ALchar*") java.lang.foreign.MemorySegment logBuf) {
        if (Handles.MH_alGetDebugMessageLogEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetDebugMessageLogEXT");
        try {
            return (int) Handles.MH_alGetDebugMessageLogEXT.invokeExact(count, logBufSize, sources, types, ids, severities, lengths, logBuf);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDebugMessageLogEXT", e); }
    }

    public static void alObjectLabelEXT(@CType("ALenum") int identifier, @CType("ALuint") int name, @CType("ALsizei") int length, @CType("const ALchar*") java.lang.foreign.MemorySegment label) {
        if (Handles.MH_alObjectLabelEXT == null) throw new SymbolNotFoundError("Symbol not found: alObjectLabelEXT");
        try {
            Handles.MH_alObjectLabelEXT.invokeExact(identifier, name, length, label);
        } catch (Throwable e) { throw new RuntimeException("error in alObjectLabelEXT", e); }
    }

    public static void alGetObjectLabelEXT(@CType("ALenum") int identifier, @CType("ALuint") int name, @CType("ALsizei") int bufSize, @CType("ALsizei *") java.lang.foreign.MemorySegment length, @CType("ALchar*") java.lang.foreign.MemorySegment label) {
        if (Handles.MH_alGetObjectLabelEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetObjectLabelEXT");
        try {
            Handles.MH_alGetObjectLabelEXT.invokeExact(identifier, name, bufSize, length, label);
        } catch (Throwable e) { throw new RuntimeException("error in alGetObjectLabelEXT", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment alGetPointerEXT(@CType("ALenum") int pname) {
        if (Handles.MH_alGetPointerEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointerEXT");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetPointerEXT.invokeExact(pname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointerEXT", e); }
    }

    public static void alGetPointervEXT(@CType("ALenum") int pname, @CType("void**") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetPointervEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointervEXT");
        try {
            Handles.MH_alGetPointervEXT.invokeExact(pname, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointervEXT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALEXTDebug() {
    }
}
