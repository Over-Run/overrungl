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
public final class ALSOFTSourceResampler {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_NUM_RESAMPLERS_SOFT = 0x1210;
    public static final int AL_DEFAULT_RESAMPLER_SOFT = 0x1211;
    public static final int AL_SOURCE_RESAMPLER_SOFT = 0x1212;
    public static final int AL_RESAMPLER_NAME_SOFT = 0x1213;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alGetStringiSOFT`.
        public static final FunctionDescriptor FD_alGetStringiSOFT = FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alGetStringiSOFT`.
        public static final MethodHandle MH_alGetStringiSOFT = RuntimeHelper.downcall(Descriptors.FD_alGetStringiSOFT);
        /// The function address of `alGetStringiSOFT`.
        public final MemorySegment PFN_alGetStringiSOFT;
        private Handles() {
            PFN_alGetStringiSOFT = ALInternal.lookup().find("alGetStringiSOFT").orElse(MemorySegment.NULL);
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

    public static @CType("const ALchar*") java.lang.foreign.MemorySegment alGetStringiSOFT(@CType("ALenum") int pname, @CType("ALsizei") int index) {
        if (Handles.MH_alGetStringiSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetStringiSOFT");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetStringiSOFT.invokeExact(Handles.get().PFN_alGetStringiSOFT, pname, index);
        } catch (Throwable e) { throw new RuntimeException("error in alGetStringiSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTSourceResampler() {
    }
}
