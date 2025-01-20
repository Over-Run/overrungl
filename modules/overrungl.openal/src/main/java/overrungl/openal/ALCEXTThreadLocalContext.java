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
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alcSetThreadContext`.
        public static final MethodHandle MH_alcSetThreadContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
        /// The method handle of `alcGetThreadContext`.
        public static final MethodHandle MH_alcGetThreadContext = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS));
        /// The function address of `alcSetThreadContext`.
        public final MemorySegment PFN_alcSetThreadContext;
        /// The function address of `alcGetThreadContext`.
        public final MemorySegment PFN_alcGetThreadContext;
        private Handles() {
            PFN_alcSetThreadContext = ALInternal.lookup().find("alcSetThreadContext").orElse(MemorySegment.NULL);
            PFN_alcGetThreadContext = ALInternal.lookup().find("alcGetThreadContext").orElse(MemorySegment.NULL);
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

    public static @CType("ALCboolean") boolean alcSetThreadContext(@CType("ALCcontext *") MemorySegment context) {
        if (Handles.MH_alcSetThreadContext == null) throw new SymbolNotFoundError("Symbol not found: alcSetThreadContext");
        try {
            return (boolean) Handles.MH_alcSetThreadContext.invokeExact(Handles.get().PFN_alcSetThreadContext, context);
        } catch (Throwable e) { throw new RuntimeException("error in alcSetThreadContext", e); }
    }

    public static @CType("ALCcontext *") MemorySegment alcGetThreadContext() {
        if (Handles.MH_alcGetThreadContext == null) throw new SymbolNotFoundError("Symbol not found: alcGetThreadContext");
        try {
            return (MemorySegment) Handles.MH_alcGetThreadContext.invokeExact(Handles.get().PFN_alcGetThreadContext);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetThreadContext", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALCEXTThreadLocalContext() {
    }
}
