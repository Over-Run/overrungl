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

package overrungl.struct;

import overrungl.util.Unmarshal;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;

/// A representation of a C union. Subclasses should declare a [UnionLayout].
///
/// @author squid233
/// @since 0.1.0
public abstract class Union {
    private final MemorySegment segment;
    private final UnionLayout layout;

    /// The constructor which accepts a backing segment and the layout of a `Union` instance.
    ///
    /// Subclasses should pass their own layout to this constructor.
    ///
    /// @param segment the backing segment
    /// @param layout  the layout of the union
    public Union(MemorySegment segment, UnionLayout layout) {
        this.segment = segment;
        this.layout = layout;
    }

    /// Estimates the element count of the union buffer in the given segment.
    ///
    /// @param segment the segment which contains a buffer of union
    /// @param layout  the layout of the union
    /// @return the estimated element count of the union buffer
    public static long estimateCount(MemorySegment segment, UnionLayout layout) {
        if (Unmarshal.isNullPointer(segment)) {
            return 0;
        }
        return segment.byteSize() / layout.byteSize();
    }

    /// Estimates the element count of this union buffer.
    ///
    /// @return the estimated element count of the union buffer
    public long estimateCount() {
        return estimateCount(segment, layout);
    }

    /// {@return the segment of this union}
    public MemorySegment segment() {
        return segment;
    }

    /// {@return the layout of this union}
    public UnionLayout unionLayout() {
        return layout;
    }
}
