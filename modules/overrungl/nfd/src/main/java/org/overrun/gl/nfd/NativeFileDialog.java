/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package org.overrun.gl.nfd;

import org.overrun.gl.FunctionDescriptors;
import org.overrun.gl.RuntimeHelper;
import org.overrun.gl.os.OperatingSystem;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

/**
 * The Native File Dialog binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class NativeFileDialog {
    // TODO: 2023/6/18 rewrite
    private static final SymbolLookup LOOKUP = RuntimeHelper.load("nfd", "nfd", "0.1.0");
    private static final MethodHandle;
    public static final StructLayout PATH_SET_ENUM=MemoryLayout.structLayout(ADDRESS.withName("ptr"));

    private static MethodHandle downcall(String name, FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(LOOKUP.find(name), function);
    }

    private static MemorySegment allocateString(SegmentAllocator allocator, String str) {
        if (OperatingSystem.current().isWindows()) return RuntimeHelper.allocateUtf16String(allocator, str);
        return allocator.allocateUtf8String(str);
    }

    private static String getString(MemorySegment segment, long offset) {
        if (OperatingSystem.current().isWindows()) return RuntimeHelper.getUtf16String(segment, offset);
        return segment.getUtf8String(offset);
    }
}
