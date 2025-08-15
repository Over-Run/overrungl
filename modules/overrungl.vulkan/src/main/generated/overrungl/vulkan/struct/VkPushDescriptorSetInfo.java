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

/// Represents `VkPushDescriptorSetInfo`.
/// ## Layout
/// ```
/// struct VkPushDescriptorSetInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkShaderStageFlags stageFlags;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t set;
///     uint32_t descriptorWriteCount;
///     const VkWriteDescriptorSet* pDescriptorWrites;
/// };
/// ```
public final class VkPushDescriptorSetInfo extends GroupType {
    /// The struct layout of `VkPushDescriptorSetInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.JAVA_INT.withName("descriptorWriteCount"),
        ValueLayout.ADDRESS.withName("pDescriptorWrites")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `stageFlags`.
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    /// The memory layout of `stageFlags`.
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The byte offset of `set`.
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    /// The memory layout of `set`.
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));
    /// The byte offset of `descriptorWriteCount`.
    public static final long OFFSET_descriptorWriteCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorWriteCount"));
    /// The memory layout of `descriptorWriteCount`.
    public static final MemoryLayout LAYOUT_descriptorWriteCount = LAYOUT.select(PathElement.groupElement("descriptorWriteCount"));
    /// The [VarHandle] of `descriptorWriteCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorWriteCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorWriteCount"));
    /// The byte offset of `pDescriptorWrites`.
    public static final long OFFSET_pDescriptorWrites = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorWrites"));
    /// The memory layout of `pDescriptorWrites`.
    public static final MemoryLayout LAYOUT_pDescriptorWrites = LAYOUT.select(PathElement.groupElement("pDescriptorWrites"));
    /// The [VarHandle] of `pDescriptorWrites` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDescriptorWrites = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorWrites"));

    /// Creates `VkPushDescriptorSetInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPushDescriptorSetInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPushDescriptorSetInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPushDescriptorSetInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPushDescriptorSetInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPushDescriptorSetInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushDescriptorSetInfo`
    public static VkPushDescriptorSetInfo alloc(SegmentAllocator allocator) { return new VkPushDescriptorSetInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPushDescriptorSetInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPushDescriptorSetInfo`
    public static VkPushDescriptorSetInfo alloc(SegmentAllocator allocator, long count) { return new VkPushDescriptorSetInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPushDescriptorSetInfo copyFrom(VkPushDescriptorSetInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPushDescriptorSetInfo reinterpret(long count) { return new VkPushDescriptorSetInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    public int stageFlags() { return stageFlags(this.segment(), 0L); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageFlags(MemorySegment segment, long index, int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo stageFlags(int value) { stageFlags(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `set` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int set(MemorySegment segment, long index) { return (int) VH_set.get(segment, 0L, index); }
    /// {@return `set`}
    public int set() { return set(this.segment(), 0L); }
    /// Sets `set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void set(MemorySegment segment, long index, int value) { VH_set.set(segment, 0L, index, value); }
    /// Sets `set` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo set(int value) { set(this.segment(), 0L, value); return this; }

    /// {@return `descriptorWriteCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorWriteCount(MemorySegment segment, long index) { return (int) VH_descriptorWriteCount.get(segment, 0L, index); }
    /// {@return `descriptorWriteCount`}
    public int descriptorWriteCount() { return descriptorWriteCount(this.segment(), 0L); }
    /// Sets `descriptorWriteCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorWriteCount(MemorySegment segment, long index, int value) { VH_descriptorWriteCount.set(segment, 0L, index, value); }
    /// Sets `descriptorWriteCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo descriptorWriteCount(int value) { descriptorWriteCount(this.segment(), 0L, value); return this; }

    /// {@return `pDescriptorWrites` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDescriptorWrites(MemorySegment segment, long index) { return (MemorySegment) VH_pDescriptorWrites.get(segment, 0L, index); }
    /// {@return `pDescriptorWrites`}
    public MemorySegment pDescriptorWrites() { return pDescriptorWrites(this.segment(), 0L); }
    /// Sets `pDescriptorWrites` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDescriptorWrites(MemorySegment segment, long index, MemorySegment value) { VH_pDescriptorWrites.set(segment, 0L, index, value); }
    /// Sets `pDescriptorWrites` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo pDescriptorWrites(MemorySegment value) { pDescriptorWrites(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPushDescriptorSetInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPushDescriptorSetInfo`
    public VkPushDescriptorSetInfo asSlice(long index) { return new VkPushDescriptorSetInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPushDescriptorSetInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPushDescriptorSetInfo`
    public VkPushDescriptorSetInfo asSlice(long index, long count) { return new VkPushDescriptorSetInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPushDescriptorSetInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPushDescriptorSetInfo at(long index, Consumer<VkPushDescriptorSetInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param index the index of the struct buffer
    public int stageFlagsAt(long index) { return stageFlags(this.segment(), index); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo stageFlagsAt(long index, int value) { stageFlags(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `set` at the given index}
    /// @param index the index of the struct buffer
    public int setAt(long index) { return set(this.segment(), index); }
    /// Sets `set` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo setAt(long index, int value) { set(this.segment(), index, value); return this; }

    /// {@return `descriptorWriteCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorWriteCountAt(long index) { return descriptorWriteCount(this.segment(), index); }
    /// Sets `descriptorWriteCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo descriptorWriteCountAt(long index, int value) { descriptorWriteCount(this.segment(), index, value); return this; }

    /// {@return `pDescriptorWrites` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDescriptorWritesAt(long index) { return pDescriptorWrites(this.segment(), index); }
    /// Sets `pDescriptorWrites` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetInfo pDescriptorWritesAt(long index, MemorySegment value) { pDescriptorWrites(this.segment(), index, value); return this; }

}
