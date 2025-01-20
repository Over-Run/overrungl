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
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alBufferCallbackSOFT`.
        public static final MethodHandle MH_alBufferCallbackSOFT = RuntimeHelper.downcall(Descriptors.FD_alBufferCallbackSOFT);
        /// The method handle of `alGetBufferPtrSOFT`.
        public static final MethodHandle MH_alGetBufferPtrSOFT = RuntimeHelper.downcall(Descriptors.FD_alGetBufferPtrSOFT);
        /// The method handle of `alGetBuffer3PtrSOFT`.
        public static final MethodHandle MH_alGetBuffer3PtrSOFT = RuntimeHelper.downcall(Descriptors.FD_alGetBuffer3PtrSOFT);
        /// The method handle of `alGetBufferPtrvSOFT`.
        public static final MethodHandle MH_alGetBufferPtrvSOFT = RuntimeHelper.downcall(Descriptors.FD_alGetBufferPtrvSOFT);
        /// The function address of `alBufferCallbackSOFT`.
        public final MemorySegment PFN_alBufferCallbackSOFT;
        /// The function address of `alGetBufferPtrSOFT`.
        public final MemorySegment PFN_alGetBufferPtrSOFT;
        /// The function address of `alGetBuffer3PtrSOFT`.
        public final MemorySegment PFN_alGetBuffer3PtrSOFT;
        /// The function address of `alGetBufferPtrvSOFT`.
        public final MemorySegment PFN_alGetBufferPtrvSOFT;
        private Handles() {
            PFN_alBufferCallbackSOFT = ALInternal.lookup().find("alBufferCallbackSOFT").orElse(MemorySegment.NULL);
            PFN_alGetBufferPtrSOFT = ALInternal.lookup().find("alGetBufferPtrSOFT").orElse(MemorySegment.NULL);
            PFN_alGetBuffer3PtrSOFT = ALInternal.lookup().find("alGetBuffer3PtrSOFT").orElse(MemorySegment.NULL);
            PFN_alGetBufferPtrvSOFT = ALInternal.lookup().find("alGetBufferPtrvSOFT").orElse(MemorySegment.NULL);
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

    public static void alBufferCallbackSOFT(@CType("ALuint") int buffer, @CType("ALenum") int format, @CType("ALsizei") int freq, @CType("ALBUFFERCALLBACKTYPESOFT") MemorySegment callback, @CType("ALvoid *") MemorySegment userptr) {
        if (Handles.MH_alBufferCallbackSOFT == null) throw new SymbolNotFoundError("Symbol not found: alBufferCallbackSOFT");
        try {
            Handles.MH_alBufferCallbackSOFT.invokeExact(Handles.get().PFN_alBufferCallbackSOFT, buffer, format, freq, callback, userptr);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferCallbackSOFT", e); }
    }

    public static void alGetBufferPtrSOFT(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") MemorySegment ptr) {
        if (Handles.MH_alGetBufferPtrSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferPtrSOFT");
        try {
            Handles.MH_alGetBufferPtrSOFT.invokeExact(Handles.get().PFN_alGetBufferPtrSOFT, buffer, param, ptr);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrSOFT", e); }
    }

    public static void alGetBuffer3PtrSOFT(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") MemorySegment ptr0, @CType("ALvoid **") MemorySegment ptr1, @CType("ALvoid **") MemorySegment ptr2) {
        if (Handles.MH_alGetBuffer3PtrSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBuffer3PtrSOFT");
        try {
            Handles.MH_alGetBuffer3PtrSOFT.invokeExact(Handles.get().PFN_alGetBuffer3PtrSOFT, buffer, param, ptr0, ptr1, ptr2);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3PtrSOFT", e); }
    }

    public static void alGetBufferPtrvSOFT(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") MemorySegment ptr) {
        if (Handles.MH_alGetBufferPtrvSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferPtrvSOFT");
        try {
            Handles.MH_alGetBufferPtrvSOFT.invokeExact(Handles.get().PFN_alGetBufferPtrvSOFT, buffer, param, ptr);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrvSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTCallbackBuffer() {
    }
}
