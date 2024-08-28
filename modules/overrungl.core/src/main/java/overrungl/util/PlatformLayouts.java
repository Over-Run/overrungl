/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

import overrungl.internal.RuntimeHelper;

import java.lang.foreign.MemoryLayout;

/**
 * Platform-specific value layouts.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class PlatformLayouts {
    /**
     * {@code long} type in C
     */
    public static final MemoryLayout LONG = RuntimeHelper.LONG;
    /**
     * {@code size_t} type in C
     */
    public static final MemoryLayout SIZE_T = RuntimeHelper.SIZE_T;
    /**
     * {@code wchar_t} type in C
     */
    public static final MemoryLayout WCHAR_T = RuntimeHelper.WCHAR_T;

    private PlatformLayouts() {
    }
}
