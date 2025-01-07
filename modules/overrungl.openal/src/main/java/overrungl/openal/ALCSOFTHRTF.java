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
public final class ALCSOFTHRTF {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int ALC_HRTF_SOFT = 0x1992;
    public static final int ALC_DONT_CARE_SOFT = 0x0002;
    public static final int ALC_HRTF_STATUS_SOFT = 0x1993;
    public static final int ALC_HRTF_DISABLED_SOFT = 0x0000;
    public static final int ALC_HRTF_ENABLED_SOFT = 0x0001;
    public static final int ALC_HRTF_DENIED_SOFT = 0x0002;
    public static final int ALC_HRTF_REQUIRED_SOFT = 0x0003;
    public static final int ALC_HRTF_HEADPHONES_DETECTED_SOFT = 0x0004;
    public static final int ALC_HRTF_UNSUPPORTED_FORMAT_SOFT = 0x0005;
    public static final int ALC_NUM_HRTF_SPECIFIERS_SOFT = 0x1994;
    public static final int ALC_HRTF_SPECIFIER_SOFT = 0x1995;
    public static final int ALC_HRTF_ID_SOFT = 0x1996;
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcGetStringiSOFT`.
        public static final MethodHandle MH_alcGetStringiSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcGetStringiSOFT", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alcResetDeviceSOFT`.
        public static final MethodHandle MH_alcResetDeviceSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcResetDeviceSOFT", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    }
    //endregion

    public static @CType("const ALCchar*") java.lang.foreign.MemorySegment alcGetStringiSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCenum") int paramName, @CType("ALCsizei") int index) {
        if (Handles.MH_alcGetStringiSOFT != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcGetStringiSOFT.invokeExact(device, paramName, index);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetStringiSOFT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alcGetStringiSOFT"); }
    }

    public static @CType("ALCboolean") boolean alcResetDeviceSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCint *") java.lang.foreign.MemorySegment attribs) {
        if (Handles.MH_alcResetDeviceSOFT != null) {
        try {
            return (boolean) Handles.MH_alcResetDeviceSOFT.invokeExact(device, attribs);
        } catch (Throwable e) { throw new RuntimeException("error in alcResetDeviceSOFT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alcResetDeviceSOFT"); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCSOFTHRTF() {
    }
}
