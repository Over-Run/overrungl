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
public final class ALSOFTEvents {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_EVENT_CALLBACK_FUNCTION_SOFT = 0x19A2;
    public static final int AL_EVENT_CALLBACK_USER_PARAM_SOFT = 0x19A3;
    public static final int AL_EVENT_TYPE_BUFFER_COMPLETED_SOFT = 0x19A4;
    public static final int AL_EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT = 0x19A5;
    public static final int AL_EVENT_TYPE_DISCONNECTED_SOFT = 0x19A6;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alEventControlSOFT`.
        public static final MethodHandle MH_alEventControlSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN));
        /// The method handle of `alEventCallbackSOFT`.
        public static final MethodHandle MH_alEventCallbackSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetPointerSOFT`.
        public static final MethodHandle MH_alGetPointerSOFT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetPointervSOFT`.
        public static final MethodHandle MH_alGetPointervSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The function address of `alEventControlSOFT`.
        public final MemorySegment PFN_alEventControlSOFT;
        /// The function address of `alEventCallbackSOFT`.
        public final MemorySegment PFN_alEventCallbackSOFT;
        /// The function address of `alGetPointerSOFT`.
        public final MemorySegment PFN_alGetPointerSOFT;
        /// The function address of `alGetPointervSOFT`.
        public final MemorySegment PFN_alGetPointervSOFT;
        private Handles() {
            PFN_alEventControlSOFT = ALInternal.lookup().find("alEventControlSOFT").orElse(MemorySegment.NULL);
            PFN_alEventCallbackSOFT = ALInternal.lookup().find("alEventCallbackSOFT").orElse(MemorySegment.NULL);
            PFN_alGetPointerSOFT = ALInternal.lookup().find("alGetPointerSOFT").orElse(MemorySegment.NULL);
            PFN_alGetPointervSOFT = ALInternal.lookup().find("alGetPointervSOFT").orElse(MemorySegment.NULL);
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

    public static void alEventControlSOFT(@CType("ALsizei") int count, @CType("const ALenum *") MemorySegment types, @CType("ALboolean") boolean enable) {
        if (Handles.MH_alEventControlSOFT == null) throw new SymbolNotFoundError("Symbol not found: alEventControlSOFT");
        try {
            Handles.MH_alEventControlSOFT.invokeExact(Handles.get().PFN_alEventControlSOFT, count, types, enable);
        } catch (Throwable e) { throw new RuntimeException("error in alEventControlSOFT", e); }
    }

    public static void alEventCallbackSOFT(@CType("ALEVENTPROCSOFT") MemorySegment callback, @CType("void*") MemorySegment userParam) {
        if (Handles.MH_alEventCallbackSOFT == null) throw new SymbolNotFoundError("Symbol not found: alEventCallbackSOFT");
        try {
            Handles.MH_alEventCallbackSOFT.invokeExact(Handles.get().PFN_alEventCallbackSOFT, callback, userParam);
        } catch (Throwable e) { throw new RuntimeException("error in alEventCallbackSOFT", e); }
    }

    public static @CType("void*") MemorySegment alGetPointerSOFT(@CType("ALenum") int pname) {
        if (Handles.MH_alGetPointerSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointerSOFT");
        try {
            return (MemorySegment) Handles.MH_alGetPointerSOFT.invokeExact(Handles.get().PFN_alGetPointerSOFT, pname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointerSOFT", e); }
    }

    public static void alGetPointervSOFT(@CType("ALenum") int pname, @CType("void**") MemorySegment values) {
        if (Handles.MH_alGetPointervSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointervSOFT");
        try {
            Handles.MH_alGetPointervSOFT.invokeExact(Handles.get().PFN_alGetPointervSOFT, pname, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointervSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTEvents() {
    }
}
