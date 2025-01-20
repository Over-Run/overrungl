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
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alcDevicePauseSOFT`.
        public static final MethodHandle MH_alcDevicePauseSOFT = RuntimeHelper.downcall(Descriptors.FD_alcDevicePauseSOFT);
        /// The method handle of `alcDeviceResumeSOFT`.
        public static final MethodHandle MH_alcDeviceResumeSOFT = RuntimeHelper.downcall(Descriptors.FD_alcDeviceResumeSOFT);
        /// The function address of `alcDevicePauseSOFT`.
        public final MemorySegment PFN_alcDevicePauseSOFT;
        /// The function address of `alcDeviceResumeSOFT`.
        public final MemorySegment PFN_alcDeviceResumeSOFT;
        private Handles() {
            PFN_alcDevicePauseSOFT = ALInternal.lookup().find("alcDevicePauseSOFT").orElse(MemorySegment.NULL);
            PFN_alcDeviceResumeSOFT = ALInternal.lookup().find("alcDeviceResumeSOFT").orElse(MemorySegment.NULL);
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

    public static void alcDevicePauseSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        if (Handles.MH_alcDevicePauseSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcDevicePauseSOFT");
        try {
            Handles.MH_alcDevicePauseSOFT.invokeExact(Handles.get().PFN_alcDevicePauseSOFT, device);
        } catch (Throwable e) { throw new RuntimeException("error in alcDevicePauseSOFT", e); }
    }

    public static void alcDeviceResumeSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device) {
        if (Handles.MH_alcDeviceResumeSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcDeviceResumeSOFT");
        try {
            Handles.MH_alcDeviceResumeSOFT.invokeExact(Handles.get().PFN_alcDeviceResumeSOFT, device);
        } catch (Throwable e) { throw new RuntimeException("error in alcDeviceResumeSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCSOFTPauseDevice() {
    }
}
