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

package overrungl.struct;

import overrungl.util.Unmarshal;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;

/**
 * A representation of a C structure.
 *
 * @author squid233
 * @since 0.1.0
 */
public abstract class Struct {
    private final MemorySegment segment;
    private final StructLayout layout;

    public Struct(MemorySegment segment, StructLayout layout) {
        this.segment = segment;
        this.layout = layout;
    }

    public static long estimateCount(MemorySegment segment, StructLayout layout) {
        if (Unmarshal.isNullPointer(segment)) {
            return 0;
        }
        return segment.byteSize() / layout.byteSize();
    }

    public long estimateCount() {
        return estimateCount(segment, layout);
    }

    public MemorySegment segment() {
        return segment;
    }

    public StructLayout layout() {
        return layout;
    }
}
