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

import overrungl.util.Addressable;
import overrungl.util.MemoryUtil;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemorySegment;

/// ## Group type
///
/// This class represents both C structures and unions. The subclasses should declare a [GroupLayout] instance.
///
/// @author squid233
/// @since 0.1.0
public abstract class GroupType implements Addressable {
    private final MemorySegment segment;
    private final GroupLayout layout;
    private final long elementCount;

    /// A constructor that accepts a backing segment and the layout of a `GroupType` instance.
    ///
    /// Subclasses should pass their own layout to this constructor.
    ///
    /// @param segment      the backing segment
    /// @param layout       the layout of the group type
    /// @param elementCount the element count of the group type buffer
    public GroupType(MemorySegment segment, GroupLayout layout, long elementCount) {
        this.segment = segment;
        this.layout = layout;
        this.elementCount = elementCount;
    }

    /// Estimates the element count of the struct buffer in the given segment.
    ///
    /// @param segment the segment which contains a buffer of struct
    /// @param layout  the layout of the struct
    /// @return the estimated element count of the struct buffer
    public static long estimateCount(MemorySegment segment, GroupLayout layout) {
        if (MemoryUtil.isNullPointer(segment)) {
            return 0;
        }
        return segment.byteSize() / layout.byteSize();
    }

    /// Estimates the element count of this group type buffer.
    ///
    /// @return the estimated element count of the group type buffer
    public long estimateCount() {
        return elementCount;
    }

    /// {@return the segment of this group type}
    @Override
    public MemorySegment segment() {
        return segment;
    }

    /// {@return the layout of this group type}
    public GroupLayout groupLayout() {
        return layout;
    }
}
