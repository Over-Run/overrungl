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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineCacheStageValidationIndexEntry {
///     uint64_t codeSize;
///     uint64_t codeOffset;
/// };
/// ```
public final class VkPipelineCacheStageValidationIndexEntry extends GroupType {
    /// The struct layout of `VkPipelineCacheStageValidationIndexEntry`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("codeSize"),
        ValueLayout.JAVA_LONG.withName("codeOffset")
    );
    /// The byte offset of `codeSize`.
    public static final long OFFSET_codeSize = LAYOUT.byteOffset(PathElement.groupElement("codeSize"));
    /// The memory layout of `codeSize`.
    public static final MemoryLayout LAYOUT_codeSize = LAYOUT.select(PathElement.groupElement("codeSize"));
    /// The [VarHandle] of `codeSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_codeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeSize"));
    /// The byte offset of `codeOffset`.
    public static final long OFFSET_codeOffset = LAYOUT.byteOffset(PathElement.groupElement("codeOffset"));
    /// The memory layout of `codeOffset`.
    public static final MemoryLayout LAYOUT_codeOffset = LAYOUT.select(PathElement.groupElement("codeOffset"));
    /// The [VarHandle] of `codeOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_codeOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeOffset"));

    /// Creates `VkPipelineCacheStageValidationIndexEntry` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCacheStageValidationIndexEntry(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCacheStageValidationIndexEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheStageValidationIndexEntry of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheStageValidationIndexEntry(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCacheStageValidationIndexEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheStageValidationIndexEntry ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheStageValidationIndexEntry(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCacheStageValidationIndexEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheStageValidationIndexEntry ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheStageValidationIndexEntry(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCacheStageValidationIndexEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheStageValidationIndexEntry`
    public static VkPipelineCacheStageValidationIndexEntry alloc(SegmentAllocator allocator) { return new VkPipelineCacheStageValidationIndexEntry(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCacheStageValidationIndexEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheStageValidationIndexEntry`
    public static VkPipelineCacheStageValidationIndexEntry alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheStageValidationIndexEntry(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineCacheStageValidationIndexEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param codeSize `codeSize`
    /// @param codeOffset `codeOffset`
    /// @return the allocated `VkPipelineCacheStageValidationIndexEntry`
    public static VkPipelineCacheStageValidationIndexEntry allocInit(SegmentAllocator allocator, long codeSize, long codeOffset) {
        return alloc(allocator).codeSize(codeSize).codeOffset(codeOffset);
    }

    /// Allocates a `VkPipelineCacheStageValidationIndexEntry` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param codeSize `codeSize`
    /// @return the allocated `VkPipelineCacheStageValidationIndexEntry`
    public static VkPipelineCacheStageValidationIndexEntry allocInit(SegmentAllocator allocator, long codeSize) {
        return alloc(allocator).codeSize(codeSize);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry copyFrom(VkPipelineCacheStageValidationIndexEntry src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCacheStageValidationIndexEntry reinterpret(long count) { return new VkPipelineCacheStageValidationIndexEntry(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `codeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long codeSize(MemorySegment segment, long index) { return (long) VH_codeSize.get(segment, 0L, index); }
    /// {@return `codeSize`}
    public long codeSize() { return codeSize(this.segment(), 0L); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void codeSize(MemorySegment segment, long index, long value) { VH_codeSize.set(segment, 0L, index, value); }
    /// Sets `codeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry codeSize(long value) { codeSize(this.segment(), 0L, value); return this; }

    /// {@return `codeOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long codeOffset(MemorySegment segment, long index) { return (long) VH_codeOffset.get(segment, 0L, index); }
    /// {@return `codeOffset`}
    public long codeOffset() { return codeOffset(this.segment(), 0L); }
    /// Sets `codeOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void codeOffset(MemorySegment segment, long index, long value) { VH_codeOffset.set(segment, 0L, index, value); }
    /// Sets `codeOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry codeOffset(long value) { codeOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineCacheStageValidationIndexEntry`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCacheStageValidationIndexEntry`
    public VkPipelineCacheStageValidationIndexEntry asSlice(long index) { return new VkPipelineCacheStageValidationIndexEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCacheStageValidationIndexEntry`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCacheStageValidationIndexEntry`
    public VkPipelineCacheStageValidationIndexEntry asSlice(long index, long count) { return new VkPipelineCacheStageValidationIndexEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCacheStageValidationIndexEntry` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry at(long index, Consumer<VkPipelineCacheStageValidationIndexEntry> func) { func.accept(asSlice(index)); return this; }

    /// {@return `codeSize` at the given index}
    /// @param index the index of the struct buffer
    public long codeSizeAt(long index) { return codeSize(this.segment(), index); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry codeSizeAt(long index, long value) { codeSize(this.segment(), index, value); return this; }

    /// {@return `codeOffset` at the given index}
    /// @param index the index of the struct buffer
    public long codeOffsetAt(long index) { return codeOffset(this.segment(), index); }
    /// Sets `codeOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry codeOffsetAt(long index, long value) { codeOffset(this.segment(), index, value); return this; }

}
