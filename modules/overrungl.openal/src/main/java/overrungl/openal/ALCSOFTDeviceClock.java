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
public final class ALCSOFTDeviceClock {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int ALC_DEVICE_CLOCK_SOFT = 0x1600;
    public static final int ALC_DEVICE_LATENCY_SOFT = 0x1601;
    public static final int ALC_DEVICE_CLOCK_LATENCY_SOFT = 0x1602;
    public static final int AL_SAMPLE_OFFSET_CLOCK_SOFT = 0x1202;
    public static final int AL_SEC_OFFSET_CLOCK_SOFT = 0x1203;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alcGetInteger64vSOFT`.
        public static final FunctionDescriptor FD_alcGetInteger64vSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alcGetInteger64vSOFT
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcGetInteger64vSOFT`.
        public static final MethodHandle MH_alcGetInteger64vSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcGetInteger64vSOFT", Descriptors.FD_alcGetInteger64vSOFT);
    }

    public static void alcGetInteger64vSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCenum") int pname, @CType("ALsizei") int size, @CType("ALCint64SOFT *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alcGetInteger64vSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcGetInteger64vSOFT");
        try {
            Handles.MH_alcGetInteger64vSOFT.invokeExact(device, pname, size, values);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetInteger64vSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCSOFTDeviceClock() {
    }
}
