/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDisplayModePropertiesKHR {
///     VkDisplayModeKHR displayMode;
///     VkDisplayModeParametersKHR parameters;
/// };
/// ```
public sealed class VkDisplayModePropertiesKHR extends GroupType {
    /// The struct layout of `VkDisplayModePropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("displayMode"),
        overrungl.vulkan.khr.struct.VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );
    /// The byte offset of `displayMode`.
    public static final long OFFSET_displayMode = LAYOUT.byteOffset(PathElement.groupElement("displayMode"));
    /// The memory layout of `displayMode`.
    public static final MemoryLayout LAYOUT_displayMode = LAYOUT.select(PathElement.groupElement("displayMode"));
    /// The [VarHandle] of `displayMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displayMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayMode"));
    /// The byte offset of `parameters`.
    public static final long OFFSET_parameters = LAYOUT.byteOffset(PathElement.groupElement("parameters"));
    /// The memory layout of `parameters`.
    public static final MemoryLayout LAYOUT_parameters = LAYOUT.select(PathElement.groupElement("parameters"));

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayModePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayModePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDisplayModePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModePropertiesKHR`
    public static VkDisplayModePropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayModePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayModePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModePropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayModePropertiesKHR copyFrom(VkDisplayModePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `displayMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long displayMode(MemorySegment segment, long index) { return (long) VH_displayMode.get(segment, 0L, index); }
    /// {@return `displayMode`}
    public long displayMode() { return displayMode(this.segment(), 0L); }
    /// Sets `displayMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayMode(MemorySegment segment, long index, long value) { VH_displayMode.set(segment, 0L, index, value); }
    /// Sets `displayMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR displayMode(long value) { displayMode(this.segment(), 0L, value); return this; }

    /// {@return `parameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment parameters(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_parameters, index), LAYOUT_parameters); }
    /// {@return `parameters`}
    public MemorySegment parameters() { return parameters(this.segment(), 0L); }
    /// Sets `parameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void parameters(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_parameters, index), LAYOUT_parameters.byteSize()); }
    /// Sets `parameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModePropertiesKHR parameters(MemorySegment value) { parameters(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDisplayModePropertiesKHR].
    public static final class Buffer extends VkDisplayModePropertiesKHR {
        private final long elementCount;

        /// Creates `VkDisplayModePropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayModePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayModePropertiesKHR`
        public VkDisplayModePropertiesKHR asSlice(long index) { return new VkDisplayModePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayModePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayModePropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `displayMode` at the given index}
        /// @param index the index of the struct buffer
        public long displayModeAt(long index) { return displayMode(this.segment(), index); }
        /// Sets `displayMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displayModeAt(long index, long value) { displayMode(this.segment(), index, value); return this; }

        /// {@return `parameters` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment parametersAt(long index) { return parameters(this.segment(), index); }
        /// Sets `parameters` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer parametersAt(long index, MemorySegment value) { parameters(this.segment(), index, value); return this; }

    }
}
