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
public final class ALCSOFTSystemEvents {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int ALC_PLAYBACK_DEVICE_SOFT = 0x19D4;
    public static final int ALC_CAPTURE_DEVICE_SOFT = 0x19D5;
    public static final int ALC_EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT = 0x19D6;
    public static final int ALC_EVENT_TYPE_DEVICE_ADDED_SOFT = 0x19D7;
    public static final int ALC_EVENT_TYPE_DEVICE_REMOVED_SOFT = 0x19D8;
    public static final int ALC_EVENT_SUPPORTED_SOFT = 0x19D9;
    public static final int ALC_EVENT_NOT_SUPPORTED_SOFT = 0x19DA;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alcEventIsSupportedSOFT`.
        public static final FunctionDescriptor FD_alcEventIsSupportedSOFT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alcEventControlSOFT`.
        public static final FunctionDescriptor FD_alcEventControlSOFT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN);
        /// The function descriptor of `alcEventCallbackSOFT`.
        public static final FunctionDescriptor FD_alcEventCallbackSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alcEventIsSupportedSOFT,
            FD_alcEventControlSOFT,
            FD_alcEventCallbackSOFT
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcEventIsSupportedSOFT`.
        public static final MethodHandle MH_alcEventIsSupportedSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcEventIsSupportedSOFT", Descriptors.FD_alcEventIsSupportedSOFT);
        /// The method handle of `alcEventControlSOFT`.
        public static final MethodHandle MH_alcEventControlSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcEventControlSOFT", Descriptors.FD_alcEventControlSOFT);
        /// The method handle of `alcEventCallbackSOFT`.
        public static final MethodHandle MH_alcEventCallbackSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcEventCallbackSOFT", Descriptors.FD_alcEventCallbackSOFT);
    }

    public static @CType("ALCenum") int alcEventIsSupportedSOFT(@CType("ALCenum") int eventType, @CType("ALCenum") int deviceType) {
        if (Handles.MH_alcEventIsSupportedSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcEventIsSupportedSOFT");
        try {
            return (int) Handles.MH_alcEventIsSupportedSOFT.invokeExact(eventType, deviceType);
        } catch (Throwable e) { throw new RuntimeException("error in alcEventIsSupportedSOFT", e); }
    }

    public static @CType("ALCboolean") boolean alcEventControlSOFT(@CType("ALCsizei") int count, @CType("const ALCenum *") java.lang.foreign.MemorySegment events, @CType("ALCboolean") boolean enable) {
        if (Handles.MH_alcEventControlSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcEventControlSOFT");
        try {
            return (boolean) Handles.MH_alcEventControlSOFT.invokeExact(count, events, enable);
        } catch (Throwable e) { throw new RuntimeException("error in alcEventControlSOFT", e); }
    }

    public static void alcEventCallbackSOFT(@CType("ALCEVENTPROCTYPESOFT") java.lang.foreign.MemorySegment callback, @CType("void*") java.lang.foreign.MemorySegment userParam) {
        if (Handles.MH_alcEventCallbackSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcEventCallbackSOFT");
        try {
            Handles.MH_alcEventCallbackSOFT.invokeExact(callback, userParam);
        } catch (Throwable e) { throw new RuntimeException("error in alcEventCallbackSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCSOFTSystemEvents() {
    }
}
