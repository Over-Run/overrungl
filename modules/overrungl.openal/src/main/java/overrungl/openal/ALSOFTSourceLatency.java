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
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alSourcedSOFT`.
        public static final MethodHandle MH_alSourcedSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `alSource3dSOFT`.
        public static final MethodHandle MH_alSource3dSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        /// The method handle of `alSourcedvSOFT`.
        public static final MethodHandle MH_alSourcedvSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcedSOFT`.
        public static final MethodHandle MH_alGetSourcedSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3dSOFT`.
        public static final MethodHandle MH_alGetSource3dSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcedvSOFT`.
        public static final MethodHandle MH_alGetSourcedvSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcei64SOFT`.
        public static final MethodHandle MH_alSourcei64SOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        /// The method handle of `alSource3i64SOFT`.
        public static final MethodHandle MH_alSource3i64SOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        /// The method handle of `alSourcei64vSOFT`.
        public static final MethodHandle MH_alSourcei64vSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei64SOFT`.
        public static final MethodHandle MH_alGetSourcei64SOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3i64SOFT`.
        public static final MethodHandle MH_alGetSource3i64SOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei64vSOFT`.
        public static final MethodHandle MH_alGetSourcei64vSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The function address of `alSourcedSOFT`.
        public final MemorySegment PFN_alSourcedSOFT;
        /// The function address of `alSource3dSOFT`.
        public final MemorySegment PFN_alSource3dSOFT;
        /// The function address of `alSourcedvSOFT`.
        public final MemorySegment PFN_alSourcedvSOFT;
        /// The function address of `alGetSourcedSOFT`.
        public final MemorySegment PFN_alGetSourcedSOFT;
        /// The function address of `alGetSource3dSOFT`.
        public final MemorySegment PFN_alGetSource3dSOFT;
        /// The function address of `alGetSourcedvSOFT`.
        public final MemorySegment PFN_alGetSourcedvSOFT;
        /// The function address of `alSourcei64SOFT`.
        public final MemorySegment PFN_alSourcei64SOFT;
        /// The function address of `alSource3i64SOFT`.
        public final MemorySegment PFN_alSource3i64SOFT;
        /// The function address of `alSourcei64vSOFT`.
        public final MemorySegment PFN_alSourcei64vSOFT;
        /// The function address of `alGetSourcei64SOFT`.
        public final MemorySegment PFN_alGetSourcei64SOFT;
        /// The function address of `alGetSource3i64SOFT`.
        public final MemorySegment PFN_alGetSource3i64SOFT;
        /// The function address of `alGetSourcei64vSOFT`.
        public final MemorySegment PFN_alGetSourcei64vSOFT;
        private Handles() {
            PFN_alSourcedSOFT = ALInternal.lookup().find("alSourcedSOFT").orElse(MemorySegment.NULL);
            PFN_alSource3dSOFT = ALInternal.lookup().find("alSource3dSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcedvSOFT = ALInternal.lookup().find("alSourcedvSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSourcedSOFT = ALInternal.lookup().find("alGetSourcedSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSource3dSOFT = ALInternal.lookup().find("alGetSource3dSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSourcedvSOFT = ALInternal.lookup().find("alGetSourcedvSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcei64SOFT = ALInternal.lookup().find("alSourcei64SOFT").orElse(MemorySegment.NULL);
            PFN_alSource3i64SOFT = ALInternal.lookup().find("alSource3i64SOFT").orElse(MemorySegment.NULL);
            PFN_alSourcei64vSOFT = ALInternal.lookup().find("alSourcei64vSOFT").orElse(MemorySegment.NULL);
            PFN_alGetSourcei64SOFT = ALInternal.lookup().find("alGetSourcei64SOFT").orElse(MemorySegment.NULL);
            PFN_alGetSource3i64SOFT = ALInternal.lookup().find("alGetSource3i64SOFT").orElse(MemorySegment.NULL);
            PFN_alGetSourcei64vSOFT = ALInternal.lookup().find("alGetSourcei64vSOFT").orElse(MemorySegment.NULL);
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

    public static void alSourcedSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble") double value) {
        if (Handles.MH_alSourcedSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcedSOFT");
        try {
            Handles.MH_alSourcedSOFT.invokeExact(Handles.get().PFN_alSourcedSOFT, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcedSOFT", e); }
    }

    public static void alSource3dSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble") double value1, @CType("ALdouble") double value2, @CType("ALdouble") double value3) {
        if (Handles.MH_alSource3dSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSource3dSOFT");
        try {
            Handles.MH_alSource3dSOFT.invokeExact(Handles.get().PFN_alSource3dSOFT, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3dSOFT", e); }
    }

    public static void alSourcedvSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALdouble *") MemorySegment values) {
        if (Handles.MH_alSourcedvSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcedvSOFT");
        try {
            Handles.MH_alSourcedvSOFT.invokeExact(Handles.get().PFN_alSourcedvSOFT, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcedvSOFT", e); }
    }

    public static void alGetSourcedSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") MemorySegment value) {
        if (Handles.MH_alGetSourcedSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcedSOFT");
        try {
            Handles.MH_alGetSourcedSOFT.invokeExact(Handles.get().PFN_alGetSourcedSOFT, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcedSOFT", e); }
    }

    public static void alGetSource3dSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") MemorySegment value1, @CType("ALdouble *") MemorySegment value2, @CType("ALdouble *") MemorySegment value3) {
        if (Handles.MH_alGetSource3dSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3dSOFT");
        try {
            Handles.MH_alGetSource3dSOFT.invokeExact(Handles.get().PFN_alGetSource3dSOFT, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3dSOFT", e); }
    }

    public static void alGetSourcedvSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") MemorySegment values) {
        if (Handles.MH_alGetSourcedvSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcedvSOFT");
        try {
            Handles.MH_alGetSourcedvSOFT.invokeExact(Handles.get().PFN_alGetSourcedvSOFT, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcedvSOFT", e); }
    }

    public static void alSourcei64SOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT") long value) {
        if (Handles.MH_alSourcei64SOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcei64SOFT");
        try {
            Handles.MH_alSourcei64SOFT.invokeExact(Handles.get().PFN_alSourcei64SOFT, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei64SOFT", e); }
    }

    public static void alSource3i64SOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT") long value1, @CType("ALint64SOFT") long value2, @CType("ALint64SOFT") long value3) {
        if (Handles.MH_alSource3i64SOFT == null) throw new SymbolNotFoundError("Symbol not found: alSource3i64SOFT");
        try {
            Handles.MH_alSource3i64SOFT.invokeExact(Handles.get().PFN_alSource3i64SOFT, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3i64SOFT", e); }
    }

    public static void alSourcei64vSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint64SOFT *") MemorySegment values) {
        if (Handles.MH_alSourcei64vSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcei64vSOFT");
        try {
            Handles.MH_alSourcei64vSOFT.invokeExact(Handles.get().PFN_alSourcei64vSOFT, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei64vSOFT", e); }
    }

    public static void alGetSourcei64SOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") MemorySegment value) {
        if (Handles.MH_alGetSourcei64SOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcei64SOFT");
        try {
            Handles.MH_alGetSourcei64SOFT.invokeExact(Handles.get().PFN_alGetSourcei64SOFT, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64SOFT", e); }
    }

    public static void alGetSource3i64SOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") MemorySegment value1, @CType("ALint64SOFT *") MemorySegment value2, @CType("ALint64SOFT *") MemorySegment value3) {
        if (Handles.MH_alGetSource3i64SOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3i64SOFT");
        try {
            Handles.MH_alGetSource3i64SOFT.invokeExact(Handles.get().PFN_alGetSource3i64SOFT, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i64SOFT", e); }
    }

    public static void alGetSourcei64vSOFT(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") MemorySegment values) {
        if (Handles.MH_alGetSourcei64vSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcei64vSOFT");
        try {
            Handles.MH_alGetSourcei64vSOFT.invokeExact(Handles.get().PFN_alGetSourcei64vSOFT, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64vSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTSourceLatency() {
    }
}
