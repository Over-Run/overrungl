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
public final class ALSOFTBufferSubData {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_BYTE_RW_OFFSETS_SOFT = 0x1031;
    public static final int AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alBufferSubDataSOFT`.
        public static final FunctionDescriptor FD_alBufferSubDataSOFT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alBufferSubDataSOFT`.
        public static final MethodHandle MH_alBufferSubDataSOFT = RuntimeHelper.downcall(Descriptors.FD_alBufferSubDataSOFT);
        /// The function address of `alBufferSubDataSOFT`.
        public final MemorySegment PFN_alBufferSubDataSOFT;
        private Handles() {
            PFN_alBufferSubDataSOFT = ALInternal.lookup().find("alBufferSubDataSOFT").orElse(MemorySegment.NULL);
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

    public static void alBufferSubDataSOFT(@CType("ALuint") int buffer, @CType("ALenum") int format, @CType("const ALvoid *") java.lang.foreign.MemorySegment data, @CType("ALsizei") int offset, @CType("ALsizei") int length) {
        if (Handles.MH_alBufferSubDataSOFT == null) throw new SymbolNotFoundError("Symbol not found: alBufferSubDataSOFT");
        try {
            Handles.MH_alBufferSubDataSOFT.invokeExact(Handles.get().PFN_alBufferSubDataSOFT, buffer, format, data, offset, length);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferSubDataSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTBufferSubData() {
    }
}
