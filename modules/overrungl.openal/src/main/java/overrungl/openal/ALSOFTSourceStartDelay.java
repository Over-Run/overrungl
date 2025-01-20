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
public final class ALSOFTSourceStartDelay {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alSourcePlayAtTimeSOFT`.
        public static final FunctionDescriptor FD_alSourcePlayAtTimeSOFT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        /// The function descriptor of `alSourcePlayAtTimevSOFT`.
        public static final FunctionDescriptor FD_alSourcePlayAtTimevSOFT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alSourcePlayAtTimeSOFT,
            FD_alSourcePlayAtTimevSOFT
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alSourcePlayAtTimeSOFT`.
        public static final MethodHandle MH_alSourcePlayAtTimeSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcePlayAtTimeSOFT", Descriptors.FD_alSourcePlayAtTimeSOFT);
        /// The method handle of `alSourcePlayAtTimevSOFT`.
        public static final MethodHandle MH_alSourcePlayAtTimevSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcePlayAtTimevSOFT", Descriptors.FD_alSourcePlayAtTimevSOFT);
    }

    public static void alSourcePlayAtTimeSOFT(@CType("ALuint") int source, @CType("ALint64SOFT") long start_time) {
        if (Handles.MH_alSourcePlayAtTimeSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayAtTimeSOFT");
        try {
            Handles.MH_alSourcePlayAtTimeSOFT.invokeExact(source, start_time);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimeSOFT", e); }
    }

    public static void alSourcePlayAtTimevSOFT(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources, @CType("ALint64SOFT") long start_time) {
        if (Handles.MH_alSourcePlayAtTimevSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayAtTimevSOFT");
        try {
            Handles.MH_alSourcePlayAtTimevSOFT.invokeExact(n, sources, start_time);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimevSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTSourceStartDelay() {
    }
}
