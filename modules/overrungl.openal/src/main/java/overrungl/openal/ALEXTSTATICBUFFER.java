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
public final class ALEXTSTATICBUFFER {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alBufferDataStatic`.
        public static final FunctionDescriptor FD_alBufferDataStatic = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alBufferDataStatic
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alBufferDataStatic`.
        public static final MethodHandle MH_alBufferDataStatic = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferDataStatic", Descriptors.FD_alBufferDataStatic);
    }

    public static void alBufferDataStatic(@CType("const ALuint") int buffer, @CType("ALenum") int format, @CType("ALvoid *") java.lang.foreign.MemorySegment data, @CType("ALsizei") int size, @CType("ALsizei") int freq) {
        if (Handles.MH_alBufferDataStatic == null) throw new SymbolNotFoundError("Symbol not found: alBufferDataStatic");
        try {
            Handles.MH_alBufferDataStatic.invokeExact(buffer, format, data, size, freq);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferDataStatic", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALEXTSTATICBUFFER() {
    }
}
