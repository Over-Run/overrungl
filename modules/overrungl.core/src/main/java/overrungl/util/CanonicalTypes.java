/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.util;

import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;

/**
 * Memory layouts of C builtin type got from {@link Linker#canonicalLayouts()}.
 * @author squid233
 * @since 0.1.0
 */
public final class CanonicalTypes {
    private static final Linker LINKER = Linker.nativeLinker();
    /// `long`
    public static final MemoryLayout C_LONG;
    /// `size_t`
    public static final MemoryLayout SIZE_T;
    /// `wchar_t`
    public static final MemoryLayout WCHAR_T;

    static {
        var map = LINKER.canonicalLayouts();
        C_LONG = map.get("long");
        SIZE_T = map.get("size_t");
        WCHAR_T = map.get("wchar_t");
    }

    private CanonicalTypes() {
    }
}
