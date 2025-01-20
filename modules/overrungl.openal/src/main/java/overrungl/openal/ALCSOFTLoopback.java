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
public final class ALCSOFTLoopback {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int ALC_FORMAT_CHANNELS_SOFT = 0x1990;
    public static final int ALC_FORMAT_TYPE_SOFT = 0x1991;
    public static final int ALC_BYTE_SOFT = 0x1400;
    public static final int ALC_UNSIGNED_BYTE_SOFT = 0x1401;
    public static final int ALC_SHORT_SOFT = 0x1402;
    public static final int ALC_UNSIGNED_SHORT_SOFT = 0x1403;
    public static final int ALC_INT_SOFT = 0x1404;
    public static final int ALC_UNSIGNED_INT_SOFT = 0x1405;
    public static final int ALC_FLOAT_SOFT = 0x1406;
    public static final int ALC_MONO_SOFT = 0x1500;
    public static final int ALC_STEREO_SOFT = 0x1501;
    public static final int ALC_QUAD_SOFT = 0x1503;
    public static final int ALC_5POINT1_SOFT = 0x1504;
    public static final int ALC_6POINT1_SOFT = 0x1505;
    public static final int ALC_7POINT1_SOFT = 0x1506;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alcLoopbackOpenDeviceSOFT`.
        public static final FunctionDescriptor FD_alcLoopbackOpenDeviceSOFT = FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alcIsRenderFormatSupportedSOFT`.
        public static final FunctionDescriptor FD_alcIsRenderFormatSupportedSOFT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alcRenderSamplesSOFT`.
        public static final FunctionDescriptor FD_alcRenderSamplesSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alcLoopbackOpenDeviceSOFT,
            FD_alcIsRenderFormatSupportedSOFT,
            FD_alcRenderSamplesSOFT
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcLoopbackOpenDeviceSOFT`.
        public static final MethodHandle MH_alcLoopbackOpenDeviceSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcLoopbackOpenDeviceSOFT", Descriptors.FD_alcLoopbackOpenDeviceSOFT);
        /// The method handle of `alcIsRenderFormatSupportedSOFT`.
        public static final MethodHandle MH_alcIsRenderFormatSupportedSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcIsRenderFormatSupportedSOFT", Descriptors.FD_alcIsRenderFormatSupportedSOFT);
        /// The method handle of `alcRenderSamplesSOFT`.
        public static final MethodHandle MH_alcRenderSamplesSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcRenderSamplesSOFT", Descriptors.FD_alcRenderSamplesSOFT);
    }

    public static @CType("ALCdevice *") java.lang.foreign.MemorySegment alcLoopbackOpenDeviceSOFT(@CType("const ALCchar*") java.lang.foreign.MemorySegment deviceName) {
        if (Handles.MH_alcLoopbackOpenDeviceSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcLoopbackOpenDeviceSOFT");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcLoopbackOpenDeviceSOFT.invokeExact(deviceName);
        } catch (Throwable e) { throw new RuntimeException("error in alcLoopbackOpenDeviceSOFT", e); }
    }

    public static @CType("ALCboolean") boolean alcIsRenderFormatSupportedSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCsizei") int freq, @CType("ALCenum") int channels, @CType("ALCenum") int type) {
        if (Handles.MH_alcIsRenderFormatSupportedSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcIsRenderFormatSupportedSOFT");
        try {
            return (boolean) Handles.MH_alcIsRenderFormatSupportedSOFT.invokeExact(device, freq, channels, type);
        } catch (Throwable e) { throw new RuntimeException("error in alcIsRenderFormatSupportedSOFT", e); }
    }

    public static void alcRenderSamplesSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCvoid *") java.lang.foreign.MemorySegment buffer, @CType("ALCsizei") int samples) {
        if (Handles.MH_alcRenderSamplesSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcRenderSamplesSOFT");
        try {
            Handles.MH_alcRenderSamplesSOFT.invokeExact(device, buffer, samples);
        } catch (Throwable e) { throw new RuntimeException("error in alcRenderSamplesSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCSOFTLoopback() {
    }
}
