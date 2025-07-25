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
/// struct VkPipelineDynamicStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineDynamicStateCreateFlags flags;
///     uint32_t dynamicStateCount;
///     const VkDynamicState* pDynamicStates;
/// };
/// ```
public final class VkPipelineDynamicStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineDynamicStateCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("dynamicStateCount"),
        ValueLayout.ADDRESS.withName("pDynamicStates")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `dynamicStateCount`.
    public static final long OFFSET_dynamicStateCount = LAYOUT.byteOffset(PathElement.groupElement("dynamicStateCount"));
    /// The memory layout of `dynamicStateCount`.
    public static final MemoryLayout LAYOUT_dynamicStateCount = LAYOUT.select(PathElement.groupElement("dynamicStateCount"));
    /// The [VarHandle] of `dynamicStateCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dynamicStateCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicStateCount"));
    /// The byte offset of `pDynamicStates`.
    public static final long OFFSET_pDynamicStates = LAYOUT.byteOffset(PathElement.groupElement("pDynamicStates"));
    /// The memory layout of `pDynamicStates`.
    public static final MemoryLayout LAYOUT_pDynamicStates = LAYOUT.select(PathElement.groupElement("pDynamicStates"));
    /// The [VarHandle] of `pDynamicStates` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDynamicStates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicStates"));

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineDynamicStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDynamicStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDynamicStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDynamicStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDynamicStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineDynamicStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDynamicStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDynamicStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineDynamicStateCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineDynamicStateCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param dynamicStateCount `dynamicStateCount`
    /// @param pDynamicStates `pDynamicStates`
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int dynamicStateCount, MemorySegment pDynamicStates) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).dynamicStateCount(dynamicStateCount).pDynamicStates(pDynamicStates);
    }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param dynamicStateCount `dynamicStateCount`
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int dynamicStateCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).dynamicStateCount(dynamicStateCount);
    }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineDynamicStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineDynamicStateCreateInfo`
    public static VkPipelineDynamicStateCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo copyFrom(VkPipelineDynamicStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineDynamicStateCreateInfo reinterpret(long count) { return new VkPipelineDynamicStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineDynamicStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineDynamicStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `dynamicStateCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicStateCount(MemorySegment segment, long index) { return (int) VH_dynamicStateCount.get(segment, 0L, index); }
    /// {@return `dynamicStateCount`}
    public int dynamicStateCount() { return dynamicStateCount(this.segment(), 0L); }
    /// Sets `dynamicStateCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicStateCount(MemorySegment segment, long index, int value) { VH_dynamicStateCount.set(segment, 0L, index, value); }
    /// Sets `dynamicStateCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo dynamicStateCount(int value) { dynamicStateCount(this.segment(), 0L, value); return this; }

    /// {@return `pDynamicStates` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDynamicStates(MemorySegment segment, long index) { return (MemorySegment) VH_pDynamicStates.get(segment, 0L, index); }
    /// {@return `pDynamicStates`}
    public MemorySegment pDynamicStates() { return pDynamicStates(this.segment(), 0L); }
    /// Sets `pDynamicStates` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDynamicStates(MemorySegment segment, long index, MemorySegment value) { VH_pDynamicStates.set(segment, 0L, index, value); }
    /// Sets `pDynamicStates` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo pDynamicStates(MemorySegment value) { pDynamicStates(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineDynamicStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineDynamicStateCreateInfo`
    public VkPipelineDynamicStateCreateInfo asSlice(long index) { return new VkPipelineDynamicStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineDynamicStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineDynamicStateCreateInfo`
    public VkPipelineDynamicStateCreateInfo asSlice(long index, long count) { return new VkPipelineDynamicStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineDynamicStateCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo at(long index, Consumer<VkPipelineDynamicStateCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `dynamicStateCount` at the given index}
    /// @param index the index of the struct buffer
    public int dynamicStateCountAt(long index) { return dynamicStateCount(this.segment(), index); }
    /// Sets `dynamicStateCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo dynamicStateCountAt(long index, int value) { dynamicStateCount(this.segment(), index, value); return this; }

    /// {@return `pDynamicStates` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDynamicStatesAt(long index) { return pDynamicStates(this.segment(), index); }
    /// Sets `pDynamicStates` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDynamicStateCreateInfo pDynamicStatesAt(long index, MemorySegment value) { pDynamicStates(this.segment(), index, value); return this; }

}
