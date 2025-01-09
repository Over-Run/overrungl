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
/// ### pPipelineCreationFeedback
/// [VarHandle][#VH_pPipelineCreationFeedback] - [Getter][#pPipelineCreationFeedback()] - [Setter][#pPipelineCreationFeedback(java.lang.foreign.MemorySegment)]
/// ### pipelineStageCreationFeedbackCount
/// [VarHandle][#VH_pipelineStageCreationFeedbackCount] - [Getter][#pipelineStageCreationFeedbackCount()] - [Setter][#pipelineStageCreationFeedbackCount(int)]
/// ### pPipelineStageCreationFeedbacks
/// [VarHandle][#VH_pPipelineStageCreationFeedbacks] - [Getter][#pPipelineStageCreationFeedbacks()] - [Setter][#pPipelineStageCreationFeedbacks(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCreationFeedbackCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCreationFeedback * pPipelineCreationFeedback;
///     uint32_t pipelineStageCreationFeedbackCount;
///     VkPipelineCreationFeedback * pPipelineStageCreationFeedbacks;
/// } VkPipelineCreationFeedbackCreateInfo;
/// ```
public final class VkPipelineCreationFeedbackCreateInfo extends Struct {
    /// The struct layout of `VkPipelineCreationFeedbackCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pPipelineCreationFeedback"),
        ValueLayout.JAVA_INT.withName("pipelineStageCreationFeedbackCount"),
        ValueLayout.ADDRESS.withName("pPipelineStageCreationFeedbacks")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pPipelineCreationFeedback` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPipelineCreationFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCreationFeedback"));
    /// The [VarHandle] of `pipelineStageCreationFeedbackCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineStageCreationFeedbackCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStageCreationFeedbackCount"));
    /// The [VarHandle] of `pPipelineStageCreationFeedbacks` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPipelineStageCreationFeedbacks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineStageCreationFeedbacks"));

    /// Creates `VkPipelineCreationFeedbackCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCreationFeedbackCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCreationFeedbackCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfo(segment); }

    /// Creates `VkPipelineCreationFeedbackCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCreationFeedbackCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCreationFeedbackCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCreationFeedbackCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineCreationFeedbackCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCreationFeedbackCreateInfo`
    public static VkPipelineCreationFeedbackCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineCreationFeedbackCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCreationFeedbackCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCreationFeedbackCreateInfo`
    public static VkPipelineCreationFeedbackCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineCreationFeedbackCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineCreationFeedbackCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCreationFeedbackCreateInfo`
    public VkPipelineCreationFeedbackCreateInfo asSlice(long index) { return new VkPipelineCreationFeedbackCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineCreationFeedbackCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCreationFeedbackCreateInfo`
    public VkPipelineCreationFeedbackCreateInfo asSlice(long index, long count) { return new VkPipelineCreationFeedbackCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineCreationFeedbackCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineCreationFeedbackCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineCreationFeedbackCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineCreationFeedbackCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineCreationFeedbackCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineCreationFeedbackCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineCreationFeedbackCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineCreationFeedbackCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineCreationFeedbackCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `pPipelineCreationFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment get_pPipelineCreationFeedback(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPipelineCreationFeedback.get(segment, 0L, index); }
    /// {@return `pPipelineCreationFeedback`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment get_pPipelineCreationFeedback(MemorySegment segment) { return VkPipelineCreationFeedbackCreateInfo.get_pPipelineCreationFeedback(segment, 0L); }
    /// {@return `pPipelineCreationFeedback` at the given index}
    /// @param index the index
    public @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment pPipelineCreationFeedbackAt(long index) { return VkPipelineCreationFeedbackCreateInfo.get_pPipelineCreationFeedback(this.segment(), index); }
    /// {@return `pPipelineCreationFeedback`}
    public @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment pPipelineCreationFeedback() { return VkPipelineCreationFeedbackCreateInfo.get_pPipelineCreationFeedback(this.segment()); }
    /// Sets `pPipelineCreationFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelineCreationFeedback(MemorySegment segment, long index, @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment value) { VH_pPipelineCreationFeedback.set(segment, 0L, index, value); }
    /// Sets `pPipelineCreationFeedback` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPipelineCreationFeedback(MemorySegment segment, @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pPipelineCreationFeedback(segment, 0L, value); }
    /// Sets `pPipelineCreationFeedback` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pPipelineCreationFeedbackAt(long index, @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pPipelineCreationFeedback(this.segment(), index, value); return this; }
    /// Sets `pPipelineCreationFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pPipelineCreationFeedback(@CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pPipelineCreationFeedback(this.segment(), value); return this; }

    /// {@return `pipelineStageCreationFeedbackCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pipelineStageCreationFeedbackCount(MemorySegment segment, long index) { return (int) VH_pipelineStageCreationFeedbackCount.get(segment, 0L, index); }
    /// {@return `pipelineStageCreationFeedbackCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pipelineStageCreationFeedbackCount(MemorySegment segment) { return VkPipelineCreationFeedbackCreateInfo.get_pipelineStageCreationFeedbackCount(segment, 0L); }
    /// {@return `pipelineStageCreationFeedbackCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pipelineStageCreationFeedbackCountAt(long index) { return VkPipelineCreationFeedbackCreateInfo.get_pipelineStageCreationFeedbackCount(this.segment(), index); }
    /// {@return `pipelineStageCreationFeedbackCount`}
    public @CType("uint32_t") int pipelineStageCreationFeedbackCount() { return VkPipelineCreationFeedbackCreateInfo.get_pipelineStageCreationFeedbackCount(this.segment()); }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineStageCreationFeedbackCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pipelineStageCreationFeedbackCount.set(segment, 0L, index, value); }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineStageCreationFeedbackCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCreationFeedbackCreateInfo.set_pipelineStageCreationFeedbackCount(segment, 0L, value); }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pipelineStageCreationFeedbackCountAt(long index, @CType("uint32_t") int value) { VkPipelineCreationFeedbackCreateInfo.set_pipelineStageCreationFeedbackCount(this.segment(), index, value); return this; }
    /// Sets `pipelineStageCreationFeedbackCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pipelineStageCreationFeedbackCount(@CType("uint32_t") int value) { VkPipelineCreationFeedbackCreateInfo.set_pipelineStageCreationFeedbackCount(this.segment(), value); return this; }

    /// {@return `pPipelineStageCreationFeedbacks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment get_pPipelineStageCreationFeedbacks(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPipelineStageCreationFeedbacks.get(segment, 0L, index); }
    /// {@return `pPipelineStageCreationFeedbacks`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment get_pPipelineStageCreationFeedbacks(MemorySegment segment) { return VkPipelineCreationFeedbackCreateInfo.get_pPipelineStageCreationFeedbacks(segment, 0L); }
    /// {@return `pPipelineStageCreationFeedbacks` at the given index}
    /// @param index the index
    public @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment pPipelineStageCreationFeedbacksAt(long index) { return VkPipelineCreationFeedbackCreateInfo.get_pPipelineStageCreationFeedbacks(this.segment(), index); }
    /// {@return `pPipelineStageCreationFeedbacks`}
    public @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment pPipelineStageCreationFeedbacks() { return VkPipelineCreationFeedbackCreateInfo.get_pPipelineStageCreationFeedbacks(this.segment()); }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelineStageCreationFeedbacks(MemorySegment segment, long index, @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment value) { VH_pPipelineStageCreationFeedbacks.set(segment, 0L, index, value); }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPipelineStageCreationFeedbacks(MemorySegment segment, @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pPipelineStageCreationFeedbacks(segment, 0L, value); }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pPipelineStageCreationFeedbacksAt(long index, @CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pPipelineStageCreationFeedbacks(this.segment(), index, value); return this; }
    /// Sets `pPipelineStageCreationFeedbacks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCreationFeedbackCreateInfo pPipelineStageCreationFeedbacks(@CType("VkPipelineCreationFeedback *") java.lang.foreign.MemorySegment value) { VkPipelineCreationFeedbackCreateInfo.set_pPipelineStageCreationFeedbacks(this.segment(), value); return this; }

}
