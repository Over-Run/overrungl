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
public final class ALSOFTDeferredUpdates {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_DEFERRED_UPDATES_SOFT = 0xC002;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alDeferUpdatesSOFT`.
        public static final MethodHandle MH_alDeferUpdatesSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        /// The method handle of `alProcessUpdatesSOFT`.
        public static final MethodHandle MH_alProcessUpdatesSOFT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        /// The function address of `alDeferUpdatesSOFT`.
        public final MemorySegment PFN_alDeferUpdatesSOFT;
        /// The function address of `alProcessUpdatesSOFT`.
        public final MemorySegment PFN_alProcessUpdatesSOFT;
        private Handles() {
            PFN_alDeferUpdatesSOFT = ALInternal.lookup().find("alDeferUpdatesSOFT").orElse(MemorySegment.NULL);
            PFN_alProcessUpdatesSOFT = ALInternal.lookup().find("alProcessUpdatesSOFT").orElse(MemorySegment.NULL);
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

    public static void alDeferUpdatesSOFT() {
        if (Handles.MH_alDeferUpdatesSOFT == null) throw new SymbolNotFoundError("Symbol not found: alDeferUpdatesSOFT");
        try {
            Handles.MH_alDeferUpdatesSOFT.invokeExact(Handles.get().PFN_alDeferUpdatesSOFT);
        } catch (Throwable e) { throw new RuntimeException("error in alDeferUpdatesSOFT", e); }
    }

    public static void alProcessUpdatesSOFT() {
        if (Handles.MH_alProcessUpdatesSOFT == null) throw new SymbolNotFoundError("Symbol not found: alProcessUpdatesSOFT");
        try {
            Handles.MH_alProcessUpdatesSOFT.invokeExact(Handles.get().PFN_alProcessUpdatesSOFT);
        } catch (Throwable e) { throw new RuntimeException("error in alProcessUpdatesSOFT", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTDeferredUpdates() {
    }
}
