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
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alDeferUpdatesSOFT`.
        public static final MethodHandle MH_alDeferUpdatesSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDeferUpdatesSOFT", FunctionDescriptor.ofVoid());
        /// The method handle of `alProcessUpdatesSOFT`.
        public static final MethodHandle MH_alProcessUpdatesSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alProcessUpdatesSOFT", FunctionDescriptor.ofVoid());
    }
    //endregion

    public static void alDeferUpdatesSOFT() {
        if (Handles.MH_alDeferUpdatesSOFT != null) {
        try {
            Handles.MH_alDeferUpdatesSOFT.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in alDeferUpdatesSOFT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alDeferUpdatesSOFT"); }
    }

    public static void alProcessUpdatesSOFT() {
        if (Handles.MH_alProcessUpdatesSOFT != null) {
        try {
            Handles.MH_alProcessUpdatesSOFT.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in alProcessUpdatesSOFT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alProcessUpdatesSOFT"); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTDeferredUpdates() {
    }
}
