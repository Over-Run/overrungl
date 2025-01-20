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
public final class ALEXTFOLDBACK {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final java.lang.String AL_EXT_FOLDBACK_NAME = "AL_EXT_FOLDBACK";
    public static final int AL_FOLDBACK_EVENT_BLOCK = 0x4112;
    public static final int AL_FOLDBACK_EVENT_START = 0x4111;
    public static final int AL_FOLDBACK_EVENT_STOP = 0x4113;
    public static final int AL_FOLDBACK_MODE_MONO = 0x4101;
    public static final int AL_FOLDBACK_MODE_STEREO = 0x4102;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alRequestFoldbackStart`.
        public static final FunctionDescriptor FD_alRequestFoldbackStart = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alRequestFoldbackStop`.
        public static final FunctionDescriptor FD_alRequestFoldbackStop = FunctionDescriptor.ofVoid();
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alRequestFoldbackStart`.
        public static final MethodHandle MH_alRequestFoldbackStart = RuntimeHelper.downcall(Descriptors.FD_alRequestFoldbackStart);
        /// The method handle of `alRequestFoldbackStop`.
        public static final MethodHandle MH_alRequestFoldbackStop = RuntimeHelper.downcall(Descriptors.FD_alRequestFoldbackStop);
        /// The function address of `alRequestFoldbackStart`.
        public final MemorySegment PFN_alRequestFoldbackStart;
        /// The function address of `alRequestFoldbackStop`.
        public final MemorySegment PFN_alRequestFoldbackStop;
        private Handles() {
            PFN_alRequestFoldbackStart = ALInternal.lookup().find("alRequestFoldbackStart").orElse(MemorySegment.NULL);
            PFN_alRequestFoldbackStop = ALInternal.lookup().find("alRequestFoldbackStop").orElse(MemorySegment.NULL);
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

    public static void alRequestFoldbackStart(@CType("ALenum") int mode, @CType("ALsizei") int count, @CType("ALsizei") int length, @CType("ALfloat *") java.lang.foreign.MemorySegment mem, @CType("LPALFOLDBACKCALLBACK") java.lang.foreign.MemorySegment callback) {
        if (Handles.MH_alRequestFoldbackStart == null) throw new SymbolNotFoundError("Symbol not found: alRequestFoldbackStart");
        try {
            Handles.MH_alRequestFoldbackStart.invokeExact(Handles.get().PFN_alRequestFoldbackStart, mode, count, length, mem, callback);
        } catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStart", e); }
    }

    public static void alRequestFoldbackStop() {
        if (Handles.MH_alRequestFoldbackStop == null) throw new SymbolNotFoundError("Symbol not found: alRequestFoldbackStop");
        try {
            Handles.MH_alRequestFoldbackStop.invokeExact(Handles.get().PFN_alRequestFoldbackStop);
        } catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStop", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALEXTFOLDBACK() {
    }
}
