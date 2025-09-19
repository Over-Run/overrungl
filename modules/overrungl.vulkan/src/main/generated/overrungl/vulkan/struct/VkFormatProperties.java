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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFormatProperties`.
/// ## Layout
/// ```
/// struct VkFormatProperties {
///     ((uint32_t) VkFlags) VkFormatFeatureFlags linearTilingFeatures;
///     ((uint32_t) VkFlags) VkFormatFeatureFlags optimalTilingFeatures;
///     ((uint32_t) VkFlags) VkFormatFeatureFlags bufferFeatures;
/// };
/// ```
public final class VkFormatProperties extends GroupType {
    /// The struct layout of `VkFormatProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("linearTilingFeatures"),
        ValueLayout.JAVA_INT.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_INT.withName("bufferFeatures")
    );
    /// The byte offset of `linearTilingFeatures`.
    public static final long OFFSET_linearTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("linearTilingFeatures"));
    /// The memory layout of `linearTilingFeatures`.
    public static final MemoryLayout LAYOUT_linearTilingFeatures = LAYOUT.select(PathElement.groupElement("linearTilingFeatures"));
    /// The [VarHandle] of `linearTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_linearTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingFeatures"));
    /// The byte offset of `optimalTilingFeatures`.
    public static final long OFFSET_optimalTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingFeatures"));
    /// The memory layout of `optimalTilingFeatures`.
    public static final MemoryLayout LAYOUT_optimalTilingFeatures = LAYOUT.select(PathElement.groupElement("optimalTilingFeatures"));
    /// The [VarHandle] of `optimalTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_optimalTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingFeatures"));
    /// The byte offset of `bufferFeatures`.
    public static final long OFFSET_bufferFeatures = LAYOUT.byteOffset(PathElement.groupElement("bufferFeatures"));
    /// The memory layout of `bufferFeatures`.
    public static final MemoryLayout LAYOUT_bufferFeatures = LAYOUT.select(PathElement.groupElement("bufferFeatures"));
    /// The [VarHandle] of `bufferFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferFeatures"));

    /// Creates `VkFormatProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFormatProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFormatProperties`
    public static VkFormatProperties alloc(SegmentAllocator allocator) { return new VkFormatProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFormatProperties`
    public static VkFormatProperties alloc(SegmentAllocator allocator, long count) { return new VkFormatProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFormatProperties copyFrom(VkFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFormatProperties reinterpret(long count) { return new VkFormatProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `linearTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int linearTilingFeatures(MemorySegment segment, long index) { return (int) VH_linearTilingFeatures.get(segment, 0L, index); }
    /// {@return `linearTilingFeatures`}
    public int linearTilingFeatures() { return linearTilingFeatures(this.segment(), 0L); }
    /// Sets `linearTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void linearTilingFeatures(MemorySegment segment, long index, int value) { VH_linearTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `linearTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties linearTilingFeatures(int value) { linearTilingFeatures(this.segment(), 0L, value); return this; }

    /// {@return `optimalTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int optimalTilingFeatures(MemorySegment segment, long index) { return (int) VH_optimalTilingFeatures.get(segment, 0L, index); }
    /// {@return `optimalTilingFeatures`}
    public int optimalTilingFeatures() { return optimalTilingFeatures(this.segment(), 0L); }
    /// Sets `optimalTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalTilingFeatures(MemorySegment segment, long index, int value) { VH_optimalTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `optimalTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties optimalTilingFeatures(int value) { optimalTilingFeatures(this.segment(), 0L, value); return this; }

    /// {@return `bufferFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferFeatures(MemorySegment segment, long index) { return (int) VH_bufferFeatures.get(segment, 0L, index); }
    /// {@return `bufferFeatures`}
    public int bufferFeatures() { return bufferFeatures(this.segment(), 0L); }
    /// Sets `bufferFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferFeatures(MemorySegment segment, long index, int value) { VH_bufferFeatures.set(segment, 0L, index, value); }
    /// Sets `bufferFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties bufferFeatures(int value) { bufferFeatures(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkFormatProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFormatProperties`
    public VkFormatProperties asSlice(long index) { return new VkFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFormatProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFormatProperties`
    public VkFormatProperties asSlice(long index, long count) { return new VkFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFormatProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFormatProperties at(long index, Consumer<VkFormatProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `linearTilingFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int linearTilingFeaturesAt(long index) { return linearTilingFeatures(this.segment(), index); }
    /// Sets `linearTilingFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties linearTilingFeaturesAt(long index, int value) { linearTilingFeatures(this.segment(), index, value); return this; }

    /// {@return `optimalTilingFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int optimalTilingFeaturesAt(long index) { return optimalTilingFeatures(this.segment(), index); }
    /// Sets `optimalTilingFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties optimalTilingFeaturesAt(long index, int value) { optimalTilingFeatures(this.segment(), index, value); return this; }

    /// {@return `bufferFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int bufferFeaturesAt(long index) { return bufferFeatures(this.segment(), index); }
    /// Sets `bufferFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties bufferFeaturesAt(long index, int value) { bufferFeatures(this.segment(), index, value); return this; }

}
