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
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### pipelineIdentifier
/// [Byte offset handle][#MH_pipelineIdentifier] - [Memory layout][#ML_pipelineIdentifier] - [Getter][#pipelineIdentifier(long)] - [Setter][#pipelineIdentifier(long, java.lang.foreign.MemorySegment)]
/// ### pipelineMemorySize
/// [VarHandle][#VH_pipelineMemorySize] - [Getter][#pipelineMemorySize()] - [Setter][#pipelineMemorySize(long)]
/// ### jsonSize
/// [VarHandle][#VH_jsonSize] - [Getter][#jsonSize()] - [Setter][#jsonSize(long)]
/// ### jsonOffset
/// [VarHandle][#VH_jsonOffset] - [Getter][#jsonOffset()] - [Setter][#jsonOffset(long)]
/// ### stageIndexCount
/// [VarHandle][#VH_stageIndexCount] - [Getter][#stageIndexCount()] - [Setter][#stageIndexCount(int)]
/// ### stageIndexStride
/// [VarHandle][#VH_stageIndexStride] - [Getter][#stageIndexStride()] - [Setter][#stageIndexStride(int)]
/// ### stageIndexOffset
/// [VarHandle][#VH_stageIndexOffset] - [Getter][#stageIndexOffset()] - [Setter][#stageIndexOffset(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCacheSafetyCriticalIndexEntry {
///     uint8_t[VK_UUID_SIZE] pipelineIdentifier;
///     uint64_t pipelineMemorySize;
///     uint64_t jsonSize;
///     uint64_t jsonOffset;
///     uint32_t stageIndexCount;
///     uint32_t stageIndexStride;
///     uint64_t stageIndexOffset;
/// } VkPipelineCacheSafetyCriticalIndexEntry;
/// ```
public final class VkPipelineCacheSafetyCriticalIndexEntry extends Struct {
    /// The struct layout of `VkPipelineCacheSafetyCriticalIndexEntry`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier"),
        ValueLayout.JAVA_LONG.withName("pipelineMemorySize"),
        ValueLayout.JAVA_LONG.withName("jsonSize"),
        ValueLayout.JAVA_LONG.withName("jsonOffset"),
        ValueLayout.JAVA_INT.withName("stageIndexCount"),
        ValueLayout.JAVA_INT.withName("stageIndexStride"),
        ValueLayout.JAVA_LONG.withName("stageIndexOffset")
    );
    /// The byte offset handle of `pipelineIdentifier` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_pipelineIdentifier = LAYOUT.byteOffsetHandle(PathElement.groupElement("pipelineIdentifier"), PathElement.sequenceElement());
    /// The memory layout of `pipelineIdentifier`.
    public static final MemoryLayout ML_pipelineIdentifier = LAYOUT.select(PathElement.groupElement("pipelineIdentifier"));
    /// The [VarHandle] of `pipelineMemorySize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_pipelineMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineMemorySize"));
    /// The [VarHandle] of `jsonSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_jsonSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("jsonSize"));
    /// The [VarHandle] of `jsonOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_jsonOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("jsonOffset"));
    /// The [VarHandle] of `stageIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageIndexCount"));
    /// The [VarHandle] of `stageIndexStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageIndexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageIndexStride"));
    /// The [VarHandle] of `stageIndexOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_stageIndexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageIndexOffset"));

    /// Creates `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCacheSafetyCriticalIndexEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheSafetyCriticalIndexEntry of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheSafetyCriticalIndexEntry(segment); }

    /// Creates `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheSafetyCriticalIndexEntry ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheSafetyCriticalIndexEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheSafetyCriticalIndexEntry ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheSafetyCriticalIndexEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheSafetyCriticalIndexEntry`
    public static VkPipelineCacheSafetyCriticalIndexEntry alloc(SegmentAllocator allocator) { return new VkPipelineCacheSafetyCriticalIndexEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCacheSafetyCriticalIndexEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheSafetyCriticalIndexEntry`
    public static VkPipelineCacheSafetyCriticalIndexEntry alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheSafetyCriticalIndexEntry(allocator.allocate(LAYOUT, count)); }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineIdentifier(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_pipelineIdentifier.invokeExact(0L, elementIndex), index), ML_pipelineIdentifier); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `pipelineIdentifier`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineIdentifier(MemorySegment segment, long elementIndex) { return VkPipelineCacheSafetyCriticalIndexEntry.get_pipelineIdentifier(segment, 0L, elementIndex); }
    /// {@return `pipelineIdentifier` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineIdentifierAt(long index, long elementIndex) { return VkPipelineCacheSafetyCriticalIndexEntry.get_pipelineIdentifier(this.segment(), index, elementIndex); }
    /// {@return `pipelineIdentifier`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineIdentifier(long elementIndex) { return VkPipelineCacheSafetyCriticalIndexEntry.get_pipelineIdentifier(this.segment(), elementIndex); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_pipelineIdentifier(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_pipelineIdentifier.invokeExact(0L, elementIndex), index), ML_pipelineIdentifier.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_pipelineIdentifier(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineCacheSafetyCriticalIndexEntry.set_pipelineIdentifier(segment, 0L, elementIndex, value); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineIdentifierAt(long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineCacheSafetyCriticalIndexEntry.set_pipelineIdentifier(this.segment(), index, elementIndex, value); return this; }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineIdentifier(long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineCacheSafetyCriticalIndexEntry.set_pipelineIdentifier(this.segment(), elementIndex, value); return this; }

    /// {@return `pipelineMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_pipelineMemorySize(MemorySegment segment, long index) { return (long) VH_pipelineMemorySize.get(segment, 0L, index); }
    /// {@return `pipelineMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_pipelineMemorySize(MemorySegment segment) { return VkPipelineCacheSafetyCriticalIndexEntry.get_pipelineMemorySize(segment, 0L); }
    /// {@return `pipelineMemorySize` at the given index}
    /// @param index the index
    public @CType("uint64_t") long pipelineMemorySizeAt(long index) { return VkPipelineCacheSafetyCriticalIndexEntry.get_pipelineMemorySize(this.segment(), index); }
    /// {@return `pipelineMemorySize`}
    public @CType("uint64_t") long pipelineMemorySize() { return VkPipelineCacheSafetyCriticalIndexEntry.get_pipelineMemorySize(this.segment()); }
    /// Sets `pipelineMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineMemorySize(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_pipelineMemorySize.set(segment, 0L, index, value); }
    /// Sets `pipelineMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineMemorySize(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_pipelineMemorySize(segment, 0L, value); }
    /// Sets `pipelineMemorySize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineMemorySizeAt(long index, @CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_pipelineMemorySize(this.segment(), index, value); return this; }
    /// Sets `pipelineMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry pipelineMemorySize(@CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_pipelineMemorySize(this.segment(), value); return this; }

    /// {@return `jsonSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_jsonSize(MemorySegment segment, long index) { return (long) VH_jsonSize.get(segment, 0L, index); }
    /// {@return `jsonSize`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_jsonSize(MemorySegment segment) { return VkPipelineCacheSafetyCriticalIndexEntry.get_jsonSize(segment, 0L); }
    /// {@return `jsonSize` at the given index}
    /// @param index the index
    public @CType("uint64_t") long jsonSizeAt(long index) { return VkPipelineCacheSafetyCriticalIndexEntry.get_jsonSize(this.segment(), index); }
    /// {@return `jsonSize`}
    public @CType("uint64_t") long jsonSize() { return VkPipelineCacheSafetyCriticalIndexEntry.get_jsonSize(this.segment()); }
    /// Sets `jsonSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_jsonSize(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_jsonSize.set(segment, 0L, index, value); }
    /// Sets `jsonSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_jsonSize(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_jsonSize(segment, 0L, value); }
    /// Sets `jsonSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry jsonSizeAt(long index, @CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_jsonSize(this.segment(), index, value); return this; }
    /// Sets `jsonSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry jsonSize(@CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_jsonSize(this.segment(), value); return this; }

    /// {@return `jsonOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_jsonOffset(MemorySegment segment, long index) { return (long) VH_jsonOffset.get(segment, 0L, index); }
    /// {@return `jsonOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_jsonOffset(MemorySegment segment) { return VkPipelineCacheSafetyCriticalIndexEntry.get_jsonOffset(segment, 0L); }
    /// {@return `jsonOffset` at the given index}
    /// @param index the index
    public @CType("uint64_t") long jsonOffsetAt(long index) { return VkPipelineCacheSafetyCriticalIndexEntry.get_jsonOffset(this.segment(), index); }
    /// {@return `jsonOffset`}
    public @CType("uint64_t") long jsonOffset() { return VkPipelineCacheSafetyCriticalIndexEntry.get_jsonOffset(this.segment()); }
    /// Sets `jsonOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_jsonOffset(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_jsonOffset.set(segment, 0L, index, value); }
    /// Sets `jsonOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_jsonOffset(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_jsonOffset(segment, 0L, value); }
    /// Sets `jsonOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry jsonOffsetAt(long index, @CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_jsonOffset(this.segment(), index, value); return this; }
    /// Sets `jsonOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry jsonOffset(@CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_jsonOffset(this.segment(), value); return this; }

    /// {@return `stageIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stageIndexCount(MemorySegment segment, long index) { return (int) VH_stageIndexCount.get(segment, 0L, index); }
    /// {@return `stageIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stageIndexCount(MemorySegment segment) { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexCount(segment, 0L); }
    /// {@return `stageIndexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stageIndexCountAt(long index) { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexCount(this.segment(), index); }
    /// {@return `stageIndexCount`}
    public @CType("uint32_t") int stageIndexCount() { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexCount(this.segment()); }
    /// Sets `stageIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stageIndexCount.set(segment, 0L, index, value); }
    /// Sets `stageIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexCount(segment, 0L, value); }
    /// Sets `stageIndexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexCountAt(long index, @CType("uint32_t") int value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexCount(this.segment(), index, value); return this; }
    /// Sets `stageIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexCount(@CType("uint32_t") int value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexCount(this.segment(), value); return this; }

    /// {@return `stageIndexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stageIndexStride(MemorySegment segment, long index) { return (int) VH_stageIndexStride.get(segment, 0L, index); }
    /// {@return `stageIndexStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stageIndexStride(MemorySegment segment) { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexStride(segment, 0L); }
    /// {@return `stageIndexStride` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stageIndexStrideAt(long index) { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexStride(this.segment(), index); }
    /// {@return `stageIndexStride`}
    public @CType("uint32_t") int stageIndexStride() { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexStride(this.segment()); }
    /// Sets `stageIndexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageIndexStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stageIndexStride.set(segment, 0L, index, value); }
    /// Sets `stageIndexStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageIndexStride(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexStride(segment, 0L, value); }
    /// Sets `stageIndexStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexStrideAt(long index, @CType("uint32_t") int value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexStride(this.segment(), index, value); return this; }
    /// Sets `stageIndexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexStride(@CType("uint32_t") int value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexStride(this.segment(), value); return this; }

    /// {@return `stageIndexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_stageIndexOffset(MemorySegment segment, long index) { return (long) VH_stageIndexOffset.get(segment, 0L, index); }
    /// {@return `stageIndexOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_stageIndexOffset(MemorySegment segment) { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexOffset(segment, 0L); }
    /// {@return `stageIndexOffset` at the given index}
    /// @param index the index
    public @CType("uint64_t") long stageIndexOffsetAt(long index) { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexOffset(this.segment(), index); }
    /// {@return `stageIndexOffset`}
    public @CType("uint64_t") long stageIndexOffset() { return VkPipelineCacheSafetyCriticalIndexEntry.get_stageIndexOffset(this.segment()); }
    /// Sets `stageIndexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageIndexOffset(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_stageIndexOffset.set(segment, 0L, index, value); }
    /// Sets `stageIndexOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageIndexOffset(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexOffset(segment, 0L, value); }
    /// Sets `stageIndexOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexOffsetAt(long index, @CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexOffset(this.segment(), index, value); return this; }
    /// Sets `stageIndexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheSafetyCriticalIndexEntry stageIndexOffset(@CType("uint64_t") long value) { VkPipelineCacheSafetyCriticalIndexEntry.set_stageIndexOffset(this.segment(), value); return this; }

}
