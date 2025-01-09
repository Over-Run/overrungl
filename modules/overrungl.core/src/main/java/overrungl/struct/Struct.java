/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

/// A representation of a C structure. Subclasses should declare a [StructLayout].
///
/// ## Non-opaque structs
/// Non-opaque structs usually declare [VarHandle][java.lang.invoke.VarHandle]s for each member.
/// For by-value-struct members, byte offsets are declared.
///
/// @author squid233
/// @since 0.1.0
public abstract class Struct {
    private final MemorySegment segment;
    private final StructLayout layout;

    /// The constructor which accepts a backing segment and the layout of a `Struct` instance.
    ///
    /// Subclasses should pass their own layout to this constructor.
    ///
    /// @param segment the backing segment
    /// @param layout  the layout of the struct
    public Struct(MemorySegment segment, StructLayout layout) {
        this.segment = segment;
        this.layout = layout;
    }

    /// Estimates the element count of the struct buffer in the given segment.
    ///
    /// @param segment the segment which contains a buffer of struct
    /// @param layout  the layout of the struct
    /// @return the estimated element count of the struct buffer
    public static long estimateCount(MemorySegment segment, StructLayout layout) {
        if (Unmarshal.isNullPointer(segment)) {
            return 0;
        }
        return segment.byteSize() / layout.byteSize();
    }

    /// Estimates the element count of this struct buffer.
    ///
    /// @return the estimated element count of the struct buffer
    public long estimateCount() {
        return estimateCount(segment, layout);
    }

    /// {@return the segment of this struct}
    public MemorySegment segment() {
        return segment;
    }

    /// {@return the layout of this struct}
    public StructLayout structLayout() {
        return layout;
    }
}
