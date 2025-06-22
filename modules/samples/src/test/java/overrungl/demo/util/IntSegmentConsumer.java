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

package overrungl.demo.util;

import overrungl.util.IntPtr;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;

/**
 * @author squid233
 * @since 0.1.0
 */
public interface IntSegmentConsumer {
    void accept(int n, MemorySegment segment);

    static void glDelete(int obj, IntSegmentConsumer fun) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            fun.accept(1, stack.ints(obj));
        }
    }

    static int glGen(IntSegmentConsumer fun) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            IntPtr ptr = stack.allocIntPtr();
            fun.accept(1, ptr.segment());
            return ptr.value();
        }
    }
}
