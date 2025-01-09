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
public final class ALSOFTSourceLatency {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_SAMPLE_OFFSET_LATENCY_SOFT = 0x1200;
    public static final int AL_SEC_OFFSET_LATENCY_SOFT = 0x1201;
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alSourcedSOFT`.
        public static final MethodHandle MH_alSourcedSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcedSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `alSource3dSOFT`.
        public static final MethodHandle MH_alSource3dSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSource3dSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `alSourcedvSOFT`.
        public static final MethodHandle MH_alSourcedvSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcedvSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcedSOFT`.
        public static final MethodHandle MH_alGetSourcedSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcedSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3dSOFT`.
        public static final MethodHandle MH_alGetSource3dSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSource3dSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcedvSOFT`.
        public static final MethodHandle MH_alGetSourcedvSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcedvSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcei64SOFT`.
        public static final MethodHandle MH_alSourcei64SOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcei64SOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        /// The method handle of `alSource3i64SOFT`.
        public static final MethodHandle MH_alSource3i64SOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSource3i64SOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        /// The method handle of `alSourcei64vSOFT`.
        public static final MethodHandle MH_alSourcei64vSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcei64vSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei64SOFT`.
        public static final MethodHandle MH_alGetSourcei64SOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcei64SOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3i64SOFT`.
        public static final MethodHandle MH_alGetSource3i64SOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSource3i64SOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei64vSOFT`.
        public static final MethodHandle MH_alGetSourcei64vSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcei64vSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    }
    //endregion

    public static void alSourcedSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble") double value) {
        if (Handles.MH_alSourcedSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcedSOFT");
        try {
            Handles.MH_alSourcedSOFT.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcedSOFT", e); }
    }

    public static void alSource3dSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble") double value1, @CType("ALdouble") double value2, @CType("ALdouble") double value3) {
        if (Handles.MH_alSource3dSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSource3dSOFT");
        try {
            Handles.MH_alSource3dSOFT.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3dSOFT", e); }
    }

    public static void alSourcedvSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALdouble *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alSourcedvSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcedvSOFT");
        try {
            Handles.MH_alSourcedvSOFT.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcedvSOFT", e); }
    }

    public static void alGetSourcedSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetSourcedSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcedSOFT");
        try {
            Handles.MH_alGetSourcedSOFT.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcedSOFT", e); }
    }

    public static void alGetSource3dSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") java.lang.foreign.MemorySegment value1, @CType("ALdouble *") java.lang.foreign.MemorySegment value2, @CType("ALdouble *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetSource3dSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3dSOFT");
        try {
            Handles.MH_alGetSource3dSOFT.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3dSOFT", e); }
    }

    public static void alGetSourcedvSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetSourcedvSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcedvSOFT");
        try {
            Handles.MH_alGetSourcedvSOFT.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcedvSOFT", e); }
    }

    public static void alSourcei64SOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT") long value) {
        if (Handles.MH_alSourcei64SOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcei64SOFT");
        try {
            Handles.MH_alSourcei64SOFT.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei64SOFT", e); }
    }

    public static void alSource3i64SOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT") long value1, @CType("ALint64SOFT") long value2, @CType("ALint64SOFT") long value3) {
        if (Handles.MH_alSource3i64SOFT == null) throw new SymbolNotFoundError("Symbol not found: alSource3i64SOFT");
        try {
            Handles.MH_alSource3i64SOFT.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3i64SOFT", e); }
    }

    public static void alSourcei64vSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint64SOFT *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alSourcei64vSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcei64vSOFT");
        try {
            Handles.MH_alSourcei64vSOFT.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei64vSOFT", e); }
    }

    public static void alGetSourcei64SOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetSourcei64SOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcei64SOFT");
        try {
            Handles.MH_alGetSourcei64SOFT.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64SOFT", e); }
    }

    public static void alGetSource3i64SOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment value1, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment value2, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetSource3i64SOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3i64SOFT");
        try {
            Handles.MH_alGetSource3i64SOFT.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i64SOFT", e); }
    }

    public static void alGetSourcei64vSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetSourcei64vSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcei64vSOFT");
        try {
            Handles.MH_alGetSourcei64vSOFT.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64vSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTSourceLatency() {
    }
}
