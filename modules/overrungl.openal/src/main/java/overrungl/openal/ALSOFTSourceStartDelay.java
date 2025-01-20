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
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alSourcePlayAtTimeSOFT`.
        public static final MethodHandle MH_alSourcePlayAtTimeSOFT = RuntimeHelper.downcall(Descriptors.FD_alSourcePlayAtTimeSOFT);
        /// The method handle of `alSourcePlayAtTimevSOFT`.
        public static final MethodHandle MH_alSourcePlayAtTimevSOFT = RuntimeHelper.downcall(Descriptors.FD_alSourcePlayAtTimevSOFT);
        /// The function address of `alSourcePlayAtTimeSOFT`.
        public final MemorySegment PFN_alSourcePlayAtTimeSOFT;
        /// The function address of `alSourcePlayAtTimevSOFT`.
        public final MemorySegment PFN_alSourcePlayAtTimevSOFT;
        private Handles() {
            PFN_alSourcePlayAtTimeSOFT = ALInternal.lookup().find("alSourcePlayAtTimeSOFT").orElse(MemorySegment.NULL);
            PFN_alSourcePlayAtTimevSOFT = ALInternal.lookup().find("alSourcePlayAtTimevSOFT").orElse(MemorySegment.NULL);
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

    public static void alSourcePlayAtTimeSOFT(@CType("ALuint") int source, @CType("ALint64SOFT") long start_time) {
        if (Handles.MH_alSourcePlayAtTimeSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayAtTimeSOFT");
        try {
            Handles.MH_alSourcePlayAtTimeSOFT.invokeExact(Handles.get().PFN_alSourcePlayAtTimeSOFT, source, start_time);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimeSOFT", e); }
    }

    public static void alSourcePlayAtTimevSOFT(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources, @CType("ALint64SOFT") long start_time) {
        if (Handles.MH_alSourcePlayAtTimevSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayAtTimevSOFT");
        try {
            Handles.MH_alSourcePlayAtTimevSOFT.invokeExact(Handles.get().PFN_alSourcePlayAtTimevSOFT, n, sources, start_time);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimevSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTSourceStartDelay() {
    }
}
