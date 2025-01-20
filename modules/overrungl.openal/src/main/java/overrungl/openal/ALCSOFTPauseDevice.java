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
public final class ALCSOFTPauseDevice {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alcDevicePauseSOFT`.
        public static final FunctionDescriptor FD_alcDevicePauseSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// The function descriptor of `alcDeviceResumeSOFT`.
        public static final FunctionDescriptor FD_alcDeviceResumeSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alcDevicePauseSOFT,
            FD_alcDeviceResumeSOFT
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcDevicePauseSOFT`.
        public static final MethodHandle MH_alcDevicePauseSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcDevicePauseSOFT", Descriptors.FD_alcDevicePauseSOFT);
        /// The method handle of `alcDeviceResumeSOFT`.
        public static final MethodHandle MH_alcDeviceResumeSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcDeviceResumeSOFT", Descriptors.FD_alcDeviceResumeSOFT);
    }

    public static void alcDevicePauseSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        if (Handles.MH_alcDevicePauseSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcDevicePauseSOFT");
        try {
            Handles.MH_alcDevicePauseSOFT.invokeExact(device);
        } catch (Throwable e) { throw new RuntimeException("error in alcDevicePauseSOFT", e); }
    }

    public static void alcDeviceResumeSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        if (Handles.MH_alcDeviceResumeSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcDeviceResumeSOFT");
        try {
            Handles.MH_alcDeviceResumeSOFT.invokeExact(device);
        } catch (Throwable e) { throw new RuntimeException("error in alcDeviceResumeSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCSOFTPauseDevice() {
    }
}
