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
public final class ALCEXTThreadLocalContext {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcSetThreadContext`.
        public static final MethodHandle MH_alcSetThreadContext = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcSetThreadContext", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `alcGetThreadContext`.
        public static final MethodHandle MH_alcGetThreadContext = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcGetThreadContext", FunctionDescriptor.of(ValueLayout.ADDRESS));
    }
    //endregion

    public static @CType("ALCboolean") boolean alcSetThreadContext(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        if (Handles.MH_alcSetThreadContext != null) {
        try {
            return (boolean) Handles.MH_alcSetThreadContext.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alcSetThreadContext", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alcSetThreadContext"); }
    }

    public static @CType("ALCcontext *") java.lang.foreign.MemorySegment alcGetThreadContext() {
        if (Handles.MH_alcGetThreadContext != null) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcGetThreadContext.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in alcGetThreadContext", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alcGetThreadContext"); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCEXTThreadLocalContext() {
    }
}
