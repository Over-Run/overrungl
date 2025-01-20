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
public final class ALSOFTCallbackBuffer {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_BUFFER_CALLBACK_FUNCTION_SOFT = 0x19A0;
    public static final int AL_BUFFER_CALLBACK_USER_PARAM_SOFT = 0x19A1;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alBufferCallbackSOFT`.
        public static final FunctionDescriptor FD_alBufferCallbackSOFT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferPtrSOFT`.
        public static final FunctionDescriptor FD_alGetBufferPtrSOFT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBuffer3PtrSOFT`.
        public static final FunctionDescriptor FD_alGetBuffer3PtrSOFT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferPtrvSOFT`.
        public static final FunctionDescriptor FD_alGetBufferPtrvSOFT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alBufferCallbackSOFT,
            FD_alGetBufferPtrSOFT,
            FD_alGetBuffer3PtrSOFT,
            FD_alGetBufferPtrvSOFT
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alBufferCallbackSOFT`.
        public static final MethodHandle MH_alBufferCallbackSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferCallbackSOFT", Descriptors.FD_alBufferCallbackSOFT);
        /// The method handle of `alGetBufferPtrSOFT`.
        public static final MethodHandle MH_alGetBufferPtrSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferPtrSOFT", Descriptors.FD_alGetBufferPtrSOFT);
        /// The method handle of `alGetBuffer3PtrSOFT`.
        public static final MethodHandle MH_alGetBuffer3PtrSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBuffer3PtrSOFT", Descriptors.FD_alGetBuffer3PtrSOFT);
        /// The method handle of `alGetBufferPtrvSOFT`.
        public static final MethodHandle MH_alGetBufferPtrvSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferPtrvSOFT", Descriptors.FD_alGetBufferPtrvSOFT);
    }

    public static void alBufferCallbackSOFT(@CType("ALuint") int buffer, @CType("ALenum") int format, @CType("ALsizei") int freq, @CType("ALBUFFERCALLBACKTYPESOFT") java.lang.foreign.MemorySegment callback, @CType("ALvoid *") java.lang.foreign.MemorySegment userptr) {
        if (Handles.MH_alBufferCallbackSOFT == null) throw new SymbolNotFoundError("Symbol not found: alBufferCallbackSOFT");
        try {
            Handles.MH_alBufferCallbackSOFT.invokeExact(buffer, format, freq, callback, userptr);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferCallbackSOFT", e); }
    }

    public static void alGetBufferPtrSOFT(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr) {
        if (Handles.MH_alGetBufferPtrSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferPtrSOFT");
        try {
            Handles.MH_alGetBufferPtrSOFT.invokeExact(buffer, param, ptr);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrSOFT", e); }
    }

    public static void alGetBuffer3PtrSOFT(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr0, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr1, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr2) {
        if (Handles.MH_alGetBuffer3PtrSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBuffer3PtrSOFT");
        try {
            Handles.MH_alGetBuffer3PtrSOFT.invokeExact(buffer, param, ptr0, ptr1, ptr2);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3PtrSOFT", e); }
    }

    public static void alGetBufferPtrvSOFT(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr) {
        if (Handles.MH_alGetBufferPtrvSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferPtrvSOFT");
        try {
            Handles.MH_alGetBufferPtrvSOFT.invokeExact(buffer, param, ptr);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrvSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTCallbackBuffer() {
    }
}
