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
public final class ALCSOFTReopenDevice {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alcReopenDeviceSOFT`.
        public static final FunctionDescriptor FD_alcReopenDeviceSOFT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alcReopenDeviceSOFT
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcReopenDeviceSOFT`.
        public static final MethodHandle MH_alcReopenDeviceSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcReopenDeviceSOFT", Descriptors.FD_alcReopenDeviceSOFT);
    }

    public static @CType("ALCboolean") boolean alcReopenDeviceSOFT(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCchar*") java.lang.foreign.MemorySegment deviceName, @CType("const ALCint *") java.lang.foreign.MemorySegment attribs) {
        if (Handles.MH_alcReopenDeviceSOFT == null) throw new SymbolNotFoundError("Symbol not found: alcReopenDeviceSOFT");
        try {
            return (boolean) Handles.MH_alcReopenDeviceSOFT.invokeExact(device, deviceName, attribs);
        } catch (Throwable e) { throw new RuntimeException("error in alcReopenDeviceSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCSOFTReopenDevice() {
    }
}
