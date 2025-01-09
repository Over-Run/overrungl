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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### subpassCount
/// [VarHandle][#VH_subpassCount] - [Getter][#subpassCount()] - [Setter][#subpassCount(int)]
/// ### pViewMasks
/// [VarHandle][#VH_pViewMasks] - [Getter][#pViewMasks()] - [Setter][#pViewMasks(java.lang.foreign.MemorySegment)]
/// ### dependencyCount
/// [VarHandle][#VH_dependencyCount] - [Getter][#dependencyCount()] - [Setter][#dependencyCount(int)]
/// ### pViewOffsets
/// [VarHandle][#VH_pViewOffsets] - [Getter][#pViewOffsets()] - [Setter][#pViewOffsets(java.lang.foreign.MemorySegment)]
/// ### correlationMaskCount
/// [VarHandle][#VH_correlationMaskCount] - [Getter][#correlationMaskCount()] - [Setter][#correlationMaskCount(int)]
/// ### pCorrelationMasks
/// [VarHandle][#VH_pCorrelationMasks] - [Getter][#pCorrelationMasks()] - [Setter][#pCorrelationMasks(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassMultiviewCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t subpassCount;
///     const uint32_t * pViewMasks;
///     uint32_t dependencyCount;
///     const int32_t * pViewOffsets;
///     uint32_t correlationMaskCount;
///     const uint32_t * pCorrelationMasks;
/// } VkRenderPassMultiviewCreateInfo;
/// ```
public final class VkRenderPassMultiviewCreateInfo extends Struct {
    /// The struct layout of `VkRenderPassMultiviewCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withName("pViewMasks"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withName("pViewOffsets"),
        ValueLayout.JAVA_INT.withName("correlationMaskCount"),
        ValueLayout.ADDRESS.withName("pCorrelationMasks")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `subpassCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpassCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassCount"));
    /// The [VarHandle] of `pViewMasks` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewMasks"));
    /// The [VarHandle] of `dependencyCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dependencyCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyCount"));
    /// The [VarHandle] of `pViewOffsets` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewOffsets"));
    /// The [VarHandle] of `correlationMaskCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_correlationMaskCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("correlationMaskCount"));
    /// The [VarHandle] of `pCorrelationMasks` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCorrelationMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCorrelationMasks"));

    /// Creates `VkRenderPassMultiviewCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassMultiviewCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassMultiviewCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassMultiviewCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfo(segment); }

    /// Creates `VkRenderPassMultiviewCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassMultiviewCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassMultiviewCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassMultiviewCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassMultiviewCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderPassMultiviewCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassMultiviewCreateInfo`
    public static VkRenderPassMultiviewCreateInfo alloc(SegmentAllocator allocator) { return new VkRenderPassMultiviewCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassMultiviewCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassMultiviewCreateInfo`
    public static VkRenderPassMultiviewCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderPassMultiviewCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkRenderPassMultiviewCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassMultiviewCreateInfo`
    public VkRenderPassMultiviewCreateInfo asSlice(long index) { return new VkRenderPassMultiviewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkRenderPassMultiviewCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassMultiviewCreateInfo`
    public VkRenderPassMultiviewCreateInfo asSlice(long index, long count) { return new VkRenderPassMultiviewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassMultiviewCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassMultiviewCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassMultiviewCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassMultiviewCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassMultiviewCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo sType(@CType("VkStructureType") int value) { VkRenderPassMultiviewCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassMultiviewCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassMultiviewCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassMultiviewCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpassCount(MemorySegment segment, long index) { return (int) VH_subpassCount.get(segment, 0L, index); }
    /// {@return `subpassCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpassCount(MemorySegment segment) { return VkRenderPassMultiviewCreateInfo.get_subpassCount(segment, 0L); }
    /// {@return `subpassCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int subpassCountAt(long index) { return VkRenderPassMultiviewCreateInfo.get_subpassCount(this.segment(), index); }
    /// {@return `subpassCount`}
    public @CType("uint32_t") int subpassCount() { return VkRenderPassMultiviewCreateInfo.get_subpassCount(this.segment()); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpassCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpassCount.set(segment, 0L, index, value); }
    /// Sets `subpassCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpassCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_subpassCount(segment, 0L, value); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo subpassCountAt(long index, @CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_subpassCount(this.segment(), index, value); return this; }
    /// Sets `subpassCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo subpassCount(@CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_subpassCount(this.segment(), value); return this; }

    /// {@return `pViewMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pViewMasks(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewMasks.get(segment, 0L, index); }
    /// {@return `pViewMasks`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pViewMasks(MemorySegment segment) { return VkRenderPassMultiviewCreateInfo.get_pViewMasks(segment, 0L); }
    /// {@return `pViewMasks` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pViewMasksAt(long index) { return VkRenderPassMultiviewCreateInfo.get_pViewMasks(this.segment(), index); }
    /// {@return `pViewMasks`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pViewMasks() { return VkRenderPassMultiviewCreateInfo.get_pViewMasks(this.segment()); }
    /// Sets `pViewMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewMasks(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pViewMasks.set(segment, 0L, index, value); }
    /// Sets `pViewMasks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewMasks(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pViewMasks(segment, 0L, value); }
    /// Sets `pViewMasks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo pViewMasksAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pViewMasks(this.segment(), index, value); return this; }
    /// Sets `pViewMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo pViewMasks(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pViewMasks(this.segment(), value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dependencyCount(MemorySegment segment, long index) { return (int) VH_dependencyCount.get(segment, 0L, index); }
    /// {@return `dependencyCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dependencyCount(MemorySegment segment) { return VkRenderPassMultiviewCreateInfo.get_dependencyCount(segment, 0L); }
    /// {@return `dependencyCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dependencyCountAt(long index) { return VkRenderPassMultiviewCreateInfo.get_dependencyCount(this.segment(), index); }
    /// {@return `dependencyCount`}
    public @CType("uint32_t") int dependencyCount() { return VkRenderPassMultiviewCreateInfo.get_dependencyCount(this.segment()); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dependencyCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dependencyCount.set(segment, 0L, index, value); }
    /// Sets `dependencyCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dependencyCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_dependencyCount(segment, 0L, value); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo dependencyCountAt(long index, @CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_dependencyCount(this.segment(), index, value); return this; }
    /// Sets `dependencyCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo dependencyCount(@CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_dependencyCount(this.segment(), value); return this; }

    /// {@return `pViewOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const int32_t *") java.lang.foreign.MemorySegment get_pViewOffsets(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewOffsets.get(segment, 0L, index); }
    /// {@return `pViewOffsets`}
    /// @param segment the segment of the struct
    public static @CType("const int32_t *") java.lang.foreign.MemorySegment get_pViewOffsets(MemorySegment segment) { return VkRenderPassMultiviewCreateInfo.get_pViewOffsets(segment, 0L); }
    /// {@return `pViewOffsets` at the given index}
    /// @param index the index
    public @CType("const int32_t *") java.lang.foreign.MemorySegment pViewOffsetsAt(long index) { return VkRenderPassMultiviewCreateInfo.get_pViewOffsets(this.segment(), index); }
    /// {@return `pViewOffsets`}
    public @CType("const int32_t *") java.lang.foreign.MemorySegment pViewOffsets() { return VkRenderPassMultiviewCreateInfo.get_pViewOffsets(this.segment()); }
    /// Sets `pViewOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewOffsets(MemorySegment segment, long index, @CType("const int32_t *") java.lang.foreign.MemorySegment value) { VH_pViewOffsets.set(segment, 0L, index, value); }
    /// Sets `pViewOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewOffsets(MemorySegment segment, @CType("const int32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pViewOffsets(segment, 0L, value); }
    /// Sets `pViewOffsets` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo pViewOffsetsAt(long index, @CType("const int32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pViewOffsets(this.segment(), index, value); return this; }
    /// Sets `pViewOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo pViewOffsets(@CType("const int32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pViewOffsets(this.segment(), value); return this; }

    /// {@return `correlationMaskCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_correlationMaskCount(MemorySegment segment, long index) { return (int) VH_correlationMaskCount.get(segment, 0L, index); }
    /// {@return `correlationMaskCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_correlationMaskCount(MemorySegment segment) { return VkRenderPassMultiviewCreateInfo.get_correlationMaskCount(segment, 0L); }
    /// {@return `correlationMaskCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int correlationMaskCountAt(long index) { return VkRenderPassMultiviewCreateInfo.get_correlationMaskCount(this.segment(), index); }
    /// {@return `correlationMaskCount`}
    public @CType("uint32_t") int correlationMaskCount() { return VkRenderPassMultiviewCreateInfo.get_correlationMaskCount(this.segment()); }
    /// Sets `correlationMaskCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_correlationMaskCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_correlationMaskCount.set(segment, 0L, index, value); }
    /// Sets `correlationMaskCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_correlationMaskCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_correlationMaskCount(segment, 0L, value); }
    /// Sets `correlationMaskCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo correlationMaskCountAt(long index, @CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_correlationMaskCount(this.segment(), index, value); return this; }
    /// Sets `correlationMaskCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo correlationMaskCount(@CType("uint32_t") int value) { VkRenderPassMultiviewCreateInfo.set_correlationMaskCount(this.segment(), value); return this; }

    /// {@return `pCorrelationMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pCorrelationMasks(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCorrelationMasks.get(segment, 0L, index); }
    /// {@return `pCorrelationMasks`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pCorrelationMasks(MemorySegment segment) { return VkRenderPassMultiviewCreateInfo.get_pCorrelationMasks(segment, 0L); }
    /// {@return `pCorrelationMasks` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pCorrelationMasksAt(long index) { return VkRenderPassMultiviewCreateInfo.get_pCorrelationMasks(this.segment(), index); }
    /// {@return `pCorrelationMasks`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pCorrelationMasks() { return VkRenderPassMultiviewCreateInfo.get_pCorrelationMasks(this.segment()); }
    /// Sets `pCorrelationMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCorrelationMasks(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pCorrelationMasks.set(segment, 0L, index, value); }
    /// Sets `pCorrelationMasks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCorrelationMasks(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pCorrelationMasks(segment, 0L, value); }
    /// Sets `pCorrelationMasks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo pCorrelationMasksAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pCorrelationMasks(this.segment(), index, value); return this; }
    /// Sets `pCorrelationMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassMultiviewCreateInfo pCorrelationMasks(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassMultiviewCreateInfo.set_pCorrelationMasks(this.segment(), value); return this; }

}
