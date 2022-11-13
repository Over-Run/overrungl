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

package org.overrun.glib.demo.mem;

import org.overrun.glib.util.MemoryUtil;

import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

/**
 * Tests memory util
 *
 * @author squid233
 * @since 0.1.0
 */
public final class MemoryUtilTest {
    private static final int ALLOC_COUNT = 100000;

    public void run() {
        StringBuilder sb;
        long start, end, delta;

        // MemorySession inside loop
        sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < ALLOC_COUNT; i++) {
            try (var session = MemorySession.openShared()) {
                var seg = session.allocate(ValueLayout.JAVA_INT);
                seg.set(ValueLayout.JAVA_INT, 0, i);
                sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            }
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println("MemorySession  in elapsed time (in nanoseconds): " + delta);

        // MemorySession outside loop
        sb = new StringBuilder();
        start = System.nanoTime();
        try (var session = MemorySession.openShared()) {
            for (int i = 0; i < ALLOC_COUNT; i++) {
                var seg = session.allocate(ValueLayout.JAVA_INT);
                seg.set(ValueLayout.JAVA_INT, 0, i);
                sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            }
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println("MemorySession out elapsed time (in nanoseconds): " + delta);

        // MemoryUtil malloc
        sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < ALLOC_COUNT; i++) {
            var seg = MemoryUtil.malloc(4);
            seg.set(ValueLayout.JAVA_INT, 0, i);
            sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            MemoryUtil.free(seg);
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println("MemoryUtil malloc elapsed time (in nanoseconds): " + delta);

        // MemoryUtil calloc
        sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < ALLOC_COUNT; i++) {
            var seg = MemoryUtil.calloc(1, 4);
            seg.set(ValueLayout.JAVA_INT, 0, i);
            sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            MemoryUtil.free(seg);
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println("MemoryUtil calloc elapsed time (in nanoseconds): " + delta);
    }

    public static void main(String[] args) {
        // Prepare
        MemoryUtil.free(MemoryUtil.malloc(1));
        new MemoryUtilTest().run();
    }
}
