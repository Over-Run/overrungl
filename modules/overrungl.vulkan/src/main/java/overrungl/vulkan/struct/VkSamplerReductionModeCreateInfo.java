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
/// ### reductionMode
/// [VarHandle][#VH_reductionMode] - [Getter][#reductionMode()] - [Setter][#reductionMode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerReductionModeCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkSamplerReductionMode reductionMode;
/// } VkSamplerReductionModeCreateInfo;
/// ```
public sealed class VkSamplerReductionModeCreateInfo extends Struct {
    /// The struct layout of `VkSamplerReductionModeCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("reductionMode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `reductionMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reductionMode"));

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkSamplerReductionModeCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerReductionModeCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerReductionModeCreateInfo(segment); }

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerReductionModeCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerReductionModeCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSamplerReductionModeCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerReductionModeCreateInfo`
    public static VkSamplerReductionModeCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerReductionModeCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerReductionModeCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerReductionModeCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerReductionModeCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerReductionModeCreateInfo`
    public static VkSamplerReductionModeCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkSamplerReductionMode") int reductionMode) { return alloc(allocator).sType(sType).pNext(pNext).reductionMode(reductionMode); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerReductionModeCreateInfo copyFrom(VkSamplerReductionModeCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerReductionModeCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerReductionModeCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerReductionModeCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerReductionModeCreateInfo sType(@CType("VkStructureType") int value) { VkSamplerReductionModeCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSamplerReductionModeCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSamplerReductionModeCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerReductionModeCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerReductionModeCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerReductionModeCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `reductionMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerReductionMode") int get_reductionMode(MemorySegment segment, long index) { return (int) VH_reductionMode.get(segment, 0L, index); }
    /// {@return `reductionMode`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerReductionMode") int get_reductionMode(MemorySegment segment) { return VkSamplerReductionModeCreateInfo.get_reductionMode(segment, 0L); }
    /// {@return `reductionMode`}
    public @CType("VkSamplerReductionMode") int reductionMode() { return VkSamplerReductionModeCreateInfo.get_reductionMode(this.segment()); }
    /// Sets `reductionMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reductionMode(MemorySegment segment, long index, @CType("VkSamplerReductionMode") int value) { VH_reductionMode.set(segment, 0L, index, value); }
    /// Sets `reductionMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reductionMode(MemorySegment segment, @CType("VkSamplerReductionMode") int value) { VkSamplerReductionModeCreateInfo.set_reductionMode(segment, 0L, value); }
    /// Sets `reductionMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerReductionModeCreateInfo reductionMode(@CType("VkSamplerReductionMode") int value) { VkSamplerReductionModeCreateInfo.set_reductionMode(this.segment(), value); return this; }

    /// A buffer of [VkSamplerReductionModeCreateInfo].
    public static final class Buffer extends VkSamplerReductionModeCreateInfo {
        private final long elementCount;

        /// Creates `VkSamplerReductionModeCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSamplerReductionModeCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSamplerReductionModeCreateInfo`
        public VkSamplerReductionModeCreateInfo asSlice(long index) { return new VkSamplerReductionModeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSamplerReductionModeCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSamplerReductionModeCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerReductionModeCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerReductionModeCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSamplerReductionModeCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerReductionModeCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `reductionMode` at the given index}
        /// @param index the index
        public @CType("VkSamplerReductionMode") int reductionModeAt(long index) { return VkSamplerReductionModeCreateInfo.get_reductionMode(this.segment(), index); }
        /// Sets `reductionMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer reductionModeAt(long index, @CType("VkSamplerReductionMode") int value) { VkSamplerReductionModeCreateInfo.set_reductionMode(this.segment(), index, value); return this; }

    }
}
