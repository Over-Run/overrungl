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

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import overrun.marshal.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.concurrent.TimeUnit;

/**
 * Tests memory util
 *
 * @author squid233
 * @since 0.1.0
 */
@BenchmarkMode(Mode.Throughput)
@State(Scope.Thread)
@OutputTimeUnit(TimeUnit.SECONDS)
@Warmup(iterations = 5, time = 250, timeUnit = TimeUnit.MILLISECONDS, batchSize = 100)
@Measurement(iterations = 5, time = 250, timeUnit = TimeUnit.MILLISECONDS, batchSize = 100)
@Threads(Threads.MAX)
@Fork(1)
public class MemoryUtilBenchmark {
    @Param({"0", "1", "10", "128", "1024"})
    private long size;

    @Benchmark
    public void measureArena(Blackhole bh) {
        try (Arena arena = Arena.ofConfined()) {
            bh.consume(arena.allocate(size));
        }
    }

    @Benchmark
    public void measureMalloc(Blackhole bh) {
        MemorySegment segment = MemorySegment.NULL;
        try {
            segment = MemoryUtil.malloc(size);
            bh.consume(segment);
        } finally {
            MemoryUtil.free(segment);
        }
    }

    @Benchmark
    public void measureCalloc(Blackhole bh) {
        MemorySegment segment = MemorySegment.NULL;
        try {
            segment = MemoryUtil.calloc(1L, size);
            bh.consume(segment);
        } finally {
            MemoryUtil.free(segment);
        }
    }

    @Benchmark
    public void measureStackMalloc(Blackhole bh) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            bh.consume(stack.malloc(size, 1L));
        }
    }

    @Benchmark
    public void measureStackCalloc(Blackhole bh) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            bh.consume(stack.allocate(size));
        }
    }

    public static void main(String[] args) throws RunnerException {
        new Runner(
            new OptionsBuilder()
                .include(MemoryUtilBenchmark.class.getSimpleName())
                .result("MemoryUtilBenchmark.json")
                .resultFormat(ResultFormatType.JSON)
                .build()
        ).run();
    }
}
