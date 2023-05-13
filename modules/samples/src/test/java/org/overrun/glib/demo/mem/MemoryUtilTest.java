/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package org.overrun.glib.demo.mem;

import org.overrun.glib.Configurations;
import org.overrun.glib.util.MemoryStack;
import org.overrun.glib.util.MemoryUtil;

import java.lang.foreign.Arena;
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
        System.out.println("Test item   Type         Elapsed time (in nanoseconds)");

        // Arena inside loop
        sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < ALLOC_COUNT; i++) {
            try (var arena = Arena.ofShared()) {
                var seg = arena.allocate(ValueLayout.JAVA_INT);
                seg.set(ValueLayout.JAVA_INT, 0, i);
                sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            }
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println(STR."Arena       inside loop  \{delta}");

        // Arena outside loop
        sb = new StringBuilder();
        start = System.nanoTime();
        try (var arena = Arena.ofShared()) {
            for (int i = 0; i < ALLOC_COUNT; i++) {
                var seg = arena.allocate(ValueLayout.JAVA_INT);
                seg.set(ValueLayout.JAVA_INT, 0, i);
                sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            }
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println(STR."Arena       outside loop \{delta}");

        // MemoryUtil malloc
        sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < ALLOC_COUNT; i++) {
            var seg = MemoryUtil.malloc(ValueLayout.JAVA_INT);
            seg.set(ValueLayout.JAVA_INT, 0, i);
            sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            MemoryUtil.free(seg);
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println(STR."MemoryUtil  malloc       \{delta}");

        // MemoryUtil calloc
        sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < ALLOC_COUNT; i++) {
            var seg = MemoryUtil.calloc(1, ValueLayout.JAVA_INT);
            seg.set(ValueLayout.JAVA_INT, 0, i);
            sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            MemoryUtil.free(seg);
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println(STR."MemoryUtil  calloc       \{delta}");

        // MemoryStack malloc
        sb = new StringBuilder();
        start = System.nanoTime();
        try (var stack = MemoryStack.stackPush()) {
            for (int i = 0; i < ALLOC_COUNT; i++) {
                var seg = stack.malloc(ValueLayout.JAVA_INT);
                seg.set(ValueLayout.JAVA_INT, 0, i);
                sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            }
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println(STR."MemoryStack malloc       \{delta}");

        // MemoryStack calloc
        sb = new StringBuilder();
        start = System.nanoTime();
        try (var stack = MemoryStack.stackPush()) {
            for (int i = 0; i < ALLOC_COUNT; i++) {
                var seg = stack.calloc(ValueLayout.JAVA_INT);
                seg.set(ValueLayout.JAVA_INT, 0, i);
                sb.append(seg.get(ValueLayout.JAVA_INT, 0));
            }
        }
        end = System.nanoTime();
        delta = end - start;
        System.out.println(STR."MemoryStack calloc       \{delta}");
    }

    public static void main(String[] args) {
        Configurations.STACK_SIZE.set((long) Math.ceilDiv(ALLOC_COUNT, 1024 / 4) * 1024 / 4);
        // Prepare
        try (Arena out = Arena.ofShared()) {
            for (int i = 0; i < 100; i++) {
                try (Arena in = Arena.ofShared()) {
                    in.allocate(1);
                }
                out.allocate(1);
                MemoryUtil.free(MemoryUtil.malloc(1));
                MemoryUtil.free(MemoryUtil.calloc(1, 1));
                try (MemoryStack stack = MemoryStack.stackPush()) {
                    stack.malloc(1);
                    stack.calloc(1);
                }
            }
        }
        new MemoryUtilTest().run();
    }
}
