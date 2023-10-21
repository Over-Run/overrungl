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

package overrungl.demo.mem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import overrungl.util.CStdio;

/**
 * Tests memory util
 *
 * @author squid233
 * @since 0.1.0
 */
@BenchmarkMode(Mode.Throughput)
@State(Scope.Thread)
@OutputTimeUnit(TimeUnit.SECONDS)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@Threads(Threads.MAX)
@Fork(1)
public class MemoryUtilTest {
    @Param({"0", "1", "10", "128", "1024"})
    private long size;
    private Arena arena;

    @Setup(Level.Iteration)
    public void setup() {
        arena = Arena.ofConfined();
    }

    @Benchmark
    public MemorySegment testArenaInside() {
        try (Arena arena1 = Arena.ofConfined()) {
            return arena1.allocate(size);
        }
    }

    @Benchmark
    public MemorySegment testArenaOutside() {
        return arena.allocate(size);
    }

    @Benchmark
    public MemorySegment memoryUtilMalloc() {
        MemorySegment seg = null;
        try {
            seg = CStdio.malloc(size);
            return seg;
        } finally {
            CStdio.free(seg);
        }
    }

    @Benchmark
    public MemorySegment memoryUtilCalloc() {
        MemorySegment seg = null;
        try {
            seg = CStdio.calloc(1, size);
            return seg;
        } finally {
            CStdio.free(seg);
        }
    }

    @TearDown(Level.Iteration)
    public void dispose() {
        arena.close();
    }

    public static void main(String[] args) throws RunnerException {
        new Runner(
            new OptionsBuilder()
                .include(MemoryUtilTest.class.getSimpleName())
                .result("MemoryUtilTest.json")
                .resultFormat(ResultFormatType.JSON)
                .build()
        ).run();
    }
}
