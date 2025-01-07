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
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alRequestFoldbackStart`.
        public static final MethodHandle MH_alRequestFoldbackStart = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alRequestFoldbackStart", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alRequestFoldbackStop`.
        public static final MethodHandle MH_alRequestFoldbackStop = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alRequestFoldbackStop", FunctionDescriptor.ofVoid());
    }
    //endregion

    public static void alRequestFoldbackStart(@CType("ALenum") int mode, @CType("ALsizei") int count, @CType("ALsizei") int length, @CType("ALfloat *") java.lang.foreign.MemorySegment mem, @CType("LPALFOLDBACKCALLBACK") java.lang.foreign.MemorySegment callback) {
        if (Handles.MH_alRequestFoldbackStart != null) {
        try {
            Handles.MH_alRequestFoldbackStart.invokeExact(mode, count, length, mem, callback);
        } catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStart", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alRequestFoldbackStart"); }
    }

    public static void alRequestFoldbackStop() {
        if (Handles.MH_alRequestFoldbackStop != null) {
        try {
            Handles.MH_alRequestFoldbackStop.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStop", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alRequestFoldbackStop"); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALEXTFOLDBACK() {
    }
}
