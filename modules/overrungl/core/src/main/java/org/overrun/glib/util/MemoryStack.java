/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.util;

import org.overrun.glib.Configurations;

import java.lang.foreign.MemoryAddress;

/**
 * A very small memory stack, can be used in fast one-time allocation.
 *
 * @author squid233
 * @see Configurations#STACK_SIZE
 * @since 0.1.0
 */
public final class MemoryStack implements AutoCloseable {
    private static final int SIZE = Configurations.STACK_SIZE.get();
    private final MemoryAddress[] addresses = new MemoryAddress[SIZE];
    private int actualSize = 0;

    private MemoryStack() {
    }

    public static MemoryStack pushStack() {
        return new MemoryStack();
    }

    public MemoryAddress malloc(int size) {
        var mem = MemoryUtil.malloc(size);
        if (mem != MemoryAddress.NULL) {
            addresses[actualSize++] = mem;
        }
        return mem;
    }

    public MemoryAddress calloc(int number, int size) {
        var mem = MemoryUtil.calloc(number, size);
        if (mem != MemoryAddress.NULL) {
            addresses[actualSize++] = mem;
        }
        return mem;
    }

    public void popStack() {
        for (int i = 0; i < actualSize; i++) {
            MemoryUtil.free(addresses[i]);
        }
        actualSize = 0;
    }

    @Override
    public void close() {
        popStack();
    }
}
