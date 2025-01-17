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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### linearTilingFeatures
/// [VarHandle][#VH_linearTilingFeatures] - [Getter][#linearTilingFeatures()] - [Setter][#linearTilingFeatures(int)]
/// ### optimalTilingFeatures
/// [VarHandle][#VH_optimalTilingFeatures] - [Getter][#optimalTilingFeatures()] - [Setter][#optimalTilingFeatures(int)]
/// ### bufferFeatures
/// [VarHandle][#VH_bufferFeatures] - [Getter][#bufferFeatures()] - [Setter][#bufferFeatures(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFormatProperties {
///     VkFormatFeatureFlags linearTilingFeatures;
///     VkFormatFeatureFlags optimalTilingFeatures;
///     VkFormatFeatureFlags bufferFeatures;
/// } VkFormatProperties;
/// ```
public sealed class VkFormatProperties extends Struct {
    /// The struct layout of `VkFormatProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("linearTilingFeatures"),
        ValueLayout.JAVA_INT.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_INT.withName("bufferFeatures")
    );
    /// The [VarHandle] of `linearTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_linearTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingFeatures"));
    /// The [VarHandle] of `optimalTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_optimalTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingFeatures"));
    /// The [VarHandle] of `bufferFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferFeatures"));

    /// Creates `VkFormatProperties` with the given segment.
    /// @param segment the memory segment
    public VkFormatProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFormatProperties(segment); }

    /// Creates `VkFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFormatProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFormatProperties`
    public static VkFormatProperties alloc(SegmentAllocator allocator) { return new VkFormatProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFormatProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFormatProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFormatProperties`
    public static VkFormatProperties allocInit(SegmentAllocator allocator, @CType("VkFormatFeatureFlags") int linearTilingFeatures, @CType("VkFormatFeatureFlags") int optimalTilingFeatures, @CType("VkFormatFeatureFlags") int bufferFeatures) { return alloc(allocator).linearTilingFeatures(linearTilingFeatures).optimalTilingFeatures(optimalTilingFeatures).bufferFeatures(bufferFeatures); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFormatProperties copyFrom(VkFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `linearTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags") int get_linearTilingFeatures(MemorySegment segment, long index) { return (int) VH_linearTilingFeatures.get(segment, 0L, index); }
    /// {@return `linearTilingFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags") int get_linearTilingFeatures(MemorySegment segment) { return VkFormatProperties.get_linearTilingFeatures(segment, 0L); }
    /// {@return `linearTilingFeatures`}
    public @CType("VkFormatFeatureFlags") int linearTilingFeatures() { return VkFormatProperties.get_linearTilingFeatures(this.segment()); }
    /// Sets `linearTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_linearTilingFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags") int value) { VH_linearTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `linearTilingFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_linearTilingFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_linearTilingFeatures(segment, 0L, value); }
    /// Sets `linearTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties linearTilingFeatures(@CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_linearTilingFeatures(this.segment(), value); return this; }

    /// {@return `optimalTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags") int get_optimalTilingFeatures(MemorySegment segment, long index) { return (int) VH_optimalTilingFeatures.get(segment, 0L, index); }
    /// {@return `optimalTilingFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags") int get_optimalTilingFeatures(MemorySegment segment) { return VkFormatProperties.get_optimalTilingFeatures(segment, 0L); }
    /// {@return `optimalTilingFeatures`}
    public @CType("VkFormatFeatureFlags") int optimalTilingFeatures() { return VkFormatProperties.get_optimalTilingFeatures(this.segment()); }
    /// Sets `optimalTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_optimalTilingFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags") int value) { VH_optimalTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `optimalTilingFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_optimalTilingFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_optimalTilingFeatures(segment, 0L, value); }
    /// Sets `optimalTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties optimalTilingFeatures(@CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_optimalTilingFeatures(this.segment(), value); return this; }

    /// {@return `bufferFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags") int get_bufferFeatures(MemorySegment segment, long index) { return (int) VH_bufferFeatures.get(segment, 0L, index); }
    /// {@return `bufferFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags") int get_bufferFeatures(MemorySegment segment) { return VkFormatProperties.get_bufferFeatures(segment, 0L); }
    /// {@return `bufferFeatures`}
    public @CType("VkFormatFeatureFlags") int bufferFeatures() { return VkFormatProperties.get_bufferFeatures(this.segment()); }
    /// Sets `bufferFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags") int value) { VH_bufferFeatures.set(segment, 0L, index, value); }
    /// Sets `bufferFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_bufferFeatures(segment, 0L, value); }
    /// Sets `bufferFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties bufferFeatures(@CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_bufferFeatures(this.segment(), value); return this; }

    /// A buffer of [VkFormatProperties].
    public static final class Buffer extends VkFormatProperties {
        private final long elementCount;

        /// Creates `VkFormatProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFormatProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFormatProperties`
        public VkFormatProperties asSlice(long index) { return new VkFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFormatProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFormatProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `linearTilingFeatures` at the given index}
        /// @param index the index
        public @CType("VkFormatFeatureFlags") int linearTilingFeaturesAt(long index) { return VkFormatProperties.get_linearTilingFeatures(this.segment(), index); }
        /// Sets `linearTilingFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer linearTilingFeaturesAt(long index, @CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_linearTilingFeatures(this.segment(), index, value); return this; }

        /// {@return `optimalTilingFeatures` at the given index}
        /// @param index the index
        public @CType("VkFormatFeatureFlags") int optimalTilingFeaturesAt(long index) { return VkFormatProperties.get_optimalTilingFeatures(this.segment(), index); }
        /// Sets `optimalTilingFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer optimalTilingFeaturesAt(long index, @CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_optimalTilingFeatures(this.segment(), index, value); return this; }

        /// {@return `bufferFeatures` at the given index}
        /// @param index the index
        public @CType("VkFormatFeatureFlags") int bufferFeaturesAt(long index) { return VkFormatProperties.get_bufferFeatures(this.segment(), index); }
        /// Sets `bufferFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferFeaturesAt(long index, @CType("VkFormatFeatureFlags") int value) { VkFormatProperties.set_bufferFeatures(this.segment(), index, value); return this; }

    }
}
