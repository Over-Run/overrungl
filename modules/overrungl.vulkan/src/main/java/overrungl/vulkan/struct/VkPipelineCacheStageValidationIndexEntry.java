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
/// ### codeSize
/// [VarHandle][#VH_codeSize] - [Getter][#codeSize()] - [Setter][#codeSize(long)]
/// ### codeOffset
/// [VarHandle][#VH_codeOffset] - [Getter][#codeOffset()] - [Setter][#codeOffset(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCacheStageValidationIndexEntry {
///     uint64_t codeSize;
///     uint64_t codeOffset;
/// } VkPipelineCacheStageValidationIndexEntry;
/// ```
public final class VkPipelineCacheStageValidationIndexEntry extends Struct {
    /// The struct layout of `VkPipelineCacheStageValidationIndexEntry`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("codeSize"),
        ValueLayout.JAVA_LONG.withName("codeOffset")
    );
    /// The [VarHandle] of `codeSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_codeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeSize"));
    /// The [VarHandle] of `codeOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_codeOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeOffset"));

    /// Creates `VkPipelineCacheStageValidationIndexEntry` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCacheStageValidationIndexEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCacheStageValidationIndexEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheStageValidationIndexEntry of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheStageValidationIndexEntry(segment); }

    /// Creates `VkPipelineCacheStageValidationIndexEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheStageValidationIndexEntry ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheStageValidationIndexEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCacheStageValidationIndexEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheStageValidationIndexEntry ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheStageValidationIndexEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineCacheStageValidationIndexEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheStageValidationIndexEntry`
    public static VkPipelineCacheStageValidationIndexEntry alloc(SegmentAllocator allocator) { return new VkPipelineCacheStageValidationIndexEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCacheStageValidationIndexEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheStageValidationIndexEntry`
    public static VkPipelineCacheStageValidationIndexEntry alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheStageValidationIndexEntry(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineCacheStageValidationIndexEntry`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCacheStageValidationIndexEntry`
    public VkPipelineCacheStageValidationIndexEntry asSlice(long index) { return new VkPipelineCacheStageValidationIndexEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineCacheStageValidationIndexEntry`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCacheStageValidationIndexEntry`
    public VkPipelineCacheStageValidationIndexEntry asSlice(long index, long count) { return new VkPipelineCacheStageValidationIndexEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `codeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_codeSize(MemorySegment segment, long index) { return (long) VH_codeSize.get(segment, 0L, index); }
    /// {@return `codeSize`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_codeSize(MemorySegment segment) { return VkPipelineCacheStageValidationIndexEntry.get_codeSize(segment, 0L); }
    /// {@return `codeSize` at the given index}
    /// @param index the index
    public @CType("uint64_t") long codeSizeAt(long index) { return VkPipelineCacheStageValidationIndexEntry.get_codeSize(this.segment(), index); }
    /// {@return `codeSize`}
    public @CType("uint64_t") long codeSize() { return VkPipelineCacheStageValidationIndexEntry.get_codeSize(this.segment()); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_codeSize(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_codeSize.set(segment, 0L, index, value); }
    /// Sets `codeSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_codeSize(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineCacheStageValidationIndexEntry.set_codeSize(segment, 0L, value); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry codeSizeAt(long index, @CType("uint64_t") long value) { VkPipelineCacheStageValidationIndexEntry.set_codeSize(this.segment(), index, value); return this; }
    /// Sets `codeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry codeSize(@CType("uint64_t") long value) { VkPipelineCacheStageValidationIndexEntry.set_codeSize(this.segment(), value); return this; }

    /// {@return `codeOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_codeOffset(MemorySegment segment, long index) { return (long) VH_codeOffset.get(segment, 0L, index); }
    /// {@return `codeOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_codeOffset(MemorySegment segment) { return VkPipelineCacheStageValidationIndexEntry.get_codeOffset(segment, 0L); }
    /// {@return `codeOffset` at the given index}
    /// @param index the index
    public @CType("uint64_t") long codeOffsetAt(long index) { return VkPipelineCacheStageValidationIndexEntry.get_codeOffset(this.segment(), index); }
    /// {@return `codeOffset`}
    public @CType("uint64_t") long codeOffset() { return VkPipelineCacheStageValidationIndexEntry.get_codeOffset(this.segment()); }
    /// Sets `codeOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_codeOffset(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_codeOffset.set(segment, 0L, index, value); }
    /// Sets `codeOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_codeOffset(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineCacheStageValidationIndexEntry.set_codeOffset(segment, 0L, value); }
    /// Sets `codeOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry codeOffsetAt(long index, @CType("uint64_t") long value) { VkPipelineCacheStageValidationIndexEntry.set_codeOffset(this.segment(), index, value); return this; }
    /// Sets `codeOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheStageValidationIndexEntry codeOffset(@CType("uint64_t") long value) { VkPipelineCacheStageValidationIndexEntry.set_codeOffset(this.segment(), value); return this; }

}
