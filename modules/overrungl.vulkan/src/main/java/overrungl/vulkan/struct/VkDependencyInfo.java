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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### dependencyFlags
/// [VarHandle][#VH_dependencyFlags] - [Getter][#dependencyFlags()] - [Setter][#dependencyFlags(int)]
/// ### memoryBarrierCount
/// [VarHandle][#VH_memoryBarrierCount] - [Getter][#memoryBarrierCount()] - [Setter][#memoryBarrierCount(int)]
/// ### pMemoryBarriers
/// [VarHandle][#VH_pMemoryBarriers] - [Getter][#pMemoryBarriers()] - [Setter][#pMemoryBarriers(MemorySegment)]
/// ### bufferMemoryBarrierCount
/// [VarHandle][#VH_bufferMemoryBarrierCount] - [Getter][#bufferMemoryBarrierCount()] - [Setter][#bufferMemoryBarrierCount(int)]
/// ### pBufferMemoryBarriers
/// [VarHandle][#VH_pBufferMemoryBarriers] - [Getter][#pBufferMemoryBarriers()] - [Setter][#pBufferMemoryBarriers(MemorySegment)]
/// ### imageMemoryBarrierCount
/// [VarHandle][#VH_imageMemoryBarrierCount] - [Getter][#imageMemoryBarrierCount()] - [Setter][#imageMemoryBarrierCount(int)]
/// ### pImageMemoryBarriers
/// [VarHandle][#VH_pImageMemoryBarriers] - [Getter][#pImageMemoryBarriers()] - [Setter][#pImageMemoryBarriers(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDependencyInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDependencyFlags dependencyFlags;
///     uint32_t memoryBarrierCount;
///     const VkMemoryBarrier2 * pMemoryBarriers;
///     uint32_t bufferMemoryBarrierCount;
///     const VkBufferMemoryBarrier2 * pBufferMemoryBarriers;
///     uint32_t imageMemoryBarrierCount;
///     const VkImageMemoryBarrier2 * pImageMemoryBarriers;
/// } VkDependencyInfo;
/// ```
public sealed class VkDependencyInfo extends Struct {
    /// The struct layout of `VkDependencyInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dependencyFlags"),
        ValueLayout.JAVA_INT.withName("memoryBarrierCount"),
        ValueLayout.ADDRESS.withName("pMemoryBarriers"),
        ValueLayout.JAVA_INT.withName("bufferMemoryBarrierCount"),
        ValueLayout.ADDRESS.withName("pBufferMemoryBarriers"),
        ValueLayout.JAVA_INT.withName("imageMemoryBarrierCount"),
        ValueLayout.ADDRESS.withName("pImageMemoryBarriers")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `dependencyFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dependencyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyFlags"));
    /// The [VarHandle] of `memoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryBarrierCount"));
    /// The [VarHandle] of `pMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMemoryBarriers"));
    /// The [VarHandle] of `bufferMemoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferMemoryBarrierCount"));
    /// The [VarHandle] of `pBufferMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBufferMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferMemoryBarriers"));
    /// The [VarHandle] of `imageMemoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMemoryBarrierCount"));
    /// The [VarHandle] of `pImageMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImageMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageMemoryBarriers"));

    /// Creates `VkDependencyInfo` with the given segment.
    /// @param segment the memory segment
    public VkDependencyInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDependencyInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDependencyInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDependencyInfo(segment); }

    /// Creates `VkDependencyInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDependencyInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDependencyInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDependencyInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDependencyInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDependencyInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDependencyInfo`
    public static VkDependencyInfo alloc(SegmentAllocator allocator) { return new VkDependencyInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDependencyInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDependencyInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDependencyInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDependencyInfo`
    public static VkDependencyInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDependencyFlags") int dependencyFlags, @CType("uint32_t") int memoryBarrierCount, @CType("const VkMemoryBarrier2 *") MemorySegment pMemoryBarriers, @CType("uint32_t") int bufferMemoryBarrierCount, @CType("const VkBufferMemoryBarrier2 *") MemorySegment pBufferMemoryBarriers, @CType("uint32_t") int imageMemoryBarrierCount, @CType("const VkImageMemoryBarrier2 *") MemorySegment pImageMemoryBarriers) { return alloc(allocator).sType(sType).pNext(pNext).dependencyFlags(dependencyFlags).memoryBarrierCount(memoryBarrierCount).pMemoryBarriers(pMemoryBarriers).bufferMemoryBarrierCount(bufferMemoryBarrierCount).pBufferMemoryBarriers(pBufferMemoryBarriers).imageMemoryBarrierCount(imageMemoryBarrierCount).pImageMemoryBarriers(pImageMemoryBarriers); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDependencyInfo copyFrom(VkDependencyInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDependencyInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDependencyInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDependencyInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo sType(@CType("VkStructureType") int value) { VkDependencyInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDependencyInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDependencyInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDependencyInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pNext(@CType("const void *") MemorySegment value) { VkDependencyInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `dependencyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDependencyFlags") int get_dependencyFlags(MemorySegment segment, long index) { return (int) VH_dependencyFlags.get(segment, 0L, index); }
    /// {@return `dependencyFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkDependencyFlags") int get_dependencyFlags(MemorySegment segment) { return VkDependencyInfo.get_dependencyFlags(segment, 0L); }
    /// {@return `dependencyFlags`}
    public @CType("VkDependencyFlags") int dependencyFlags() { return VkDependencyInfo.get_dependencyFlags(this.segment()); }
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dependencyFlags(MemorySegment segment, long index, @CType("VkDependencyFlags") int value) { VH_dependencyFlags.set(segment, 0L, index, value); }
    /// Sets `dependencyFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dependencyFlags(MemorySegment segment, @CType("VkDependencyFlags") int value) { VkDependencyInfo.set_dependencyFlags(segment, 0L, value); }
    /// Sets `dependencyFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo dependencyFlags(@CType("VkDependencyFlags") int value) { VkDependencyInfo.set_dependencyFlags(this.segment(), value); return this; }

    /// {@return `memoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryBarrierCount(MemorySegment segment, long index) { return (int) VH_memoryBarrierCount.get(segment, 0L, index); }
    /// {@return `memoryBarrierCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryBarrierCount(MemorySegment segment) { return VkDependencyInfo.get_memoryBarrierCount(segment, 0L); }
    /// {@return `memoryBarrierCount`}
    public @CType("uint32_t") int memoryBarrierCount() { return VkDependencyInfo.get_memoryBarrierCount(this.segment()); }
    /// Sets `memoryBarrierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryBarrierCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryBarrierCount.set(segment, 0L, index, value); }
    /// Sets `memoryBarrierCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryBarrierCount(MemorySegment segment, @CType("uint32_t") int value) { VkDependencyInfo.set_memoryBarrierCount(segment, 0L, value); }
    /// Sets `memoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo memoryBarrierCount(@CType("uint32_t") int value) { VkDependencyInfo.set_memoryBarrierCount(this.segment(), value); return this; }

    /// {@return `pMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMemoryBarrier2 *") MemorySegment get_pMemoryBarriers(MemorySegment segment, long index) { return (MemorySegment) VH_pMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pMemoryBarriers`}
    /// @param segment the segment of the struct
    public static @CType("const VkMemoryBarrier2 *") MemorySegment get_pMemoryBarriers(MemorySegment segment) { return VkDependencyInfo.get_pMemoryBarriers(segment, 0L); }
    /// {@return `pMemoryBarriers`}
    public @CType("const VkMemoryBarrier2 *") MemorySegment pMemoryBarriers() { return VkDependencyInfo.get_pMemoryBarriers(this.segment()); }
    /// Sets `pMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMemoryBarriers(MemorySegment segment, long index, @CType("const VkMemoryBarrier2 *") MemorySegment value) { VH_pMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pMemoryBarriers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMemoryBarriers(MemorySegment segment, @CType("const VkMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pMemoryBarriers(segment, 0L, value); }
    /// Sets `pMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pMemoryBarriers(@CType("const VkMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pMemoryBarriers(this.segment(), value); return this; }

    /// {@return `bufferMemoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferMemoryBarrierCount(MemorySegment segment, long index) { return (int) VH_bufferMemoryBarrierCount.get(segment, 0L, index); }
    /// {@return `bufferMemoryBarrierCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferMemoryBarrierCount(MemorySegment segment) { return VkDependencyInfo.get_bufferMemoryBarrierCount(segment, 0L); }
    /// {@return `bufferMemoryBarrierCount`}
    public @CType("uint32_t") int bufferMemoryBarrierCount() { return VkDependencyInfo.get_bufferMemoryBarrierCount(this.segment()); }
    /// Sets `bufferMemoryBarrierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferMemoryBarrierCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bufferMemoryBarrierCount.set(segment, 0L, index, value); }
    /// Sets `bufferMemoryBarrierCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferMemoryBarrierCount(MemorySegment segment, @CType("uint32_t") int value) { VkDependencyInfo.set_bufferMemoryBarrierCount(segment, 0L, value); }
    /// Sets `bufferMemoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo bufferMemoryBarrierCount(@CType("uint32_t") int value) { VkDependencyInfo.set_bufferMemoryBarrierCount(this.segment(), value); return this; }

    /// {@return `pBufferMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkBufferMemoryBarrier2 *") MemorySegment get_pBufferMemoryBarriers(MemorySegment segment, long index) { return (MemorySegment) VH_pBufferMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pBufferMemoryBarriers`}
    /// @param segment the segment of the struct
    public static @CType("const VkBufferMemoryBarrier2 *") MemorySegment get_pBufferMemoryBarriers(MemorySegment segment) { return VkDependencyInfo.get_pBufferMemoryBarriers(segment, 0L); }
    /// {@return `pBufferMemoryBarriers`}
    public @CType("const VkBufferMemoryBarrier2 *") MemorySegment pBufferMemoryBarriers() { return VkDependencyInfo.get_pBufferMemoryBarriers(this.segment()); }
    /// Sets `pBufferMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBufferMemoryBarriers(MemorySegment segment, long index, @CType("const VkBufferMemoryBarrier2 *") MemorySegment value) { VH_pBufferMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pBufferMemoryBarriers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBufferMemoryBarriers(MemorySegment segment, @CType("const VkBufferMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pBufferMemoryBarriers(segment, 0L, value); }
    /// Sets `pBufferMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pBufferMemoryBarriers(@CType("const VkBufferMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pBufferMemoryBarriers(this.segment(), value); return this; }

    /// {@return `imageMemoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageMemoryBarrierCount(MemorySegment segment, long index) { return (int) VH_imageMemoryBarrierCount.get(segment, 0L, index); }
    /// {@return `imageMemoryBarrierCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageMemoryBarrierCount(MemorySegment segment) { return VkDependencyInfo.get_imageMemoryBarrierCount(segment, 0L); }
    /// {@return `imageMemoryBarrierCount`}
    public @CType("uint32_t") int imageMemoryBarrierCount() { return VkDependencyInfo.get_imageMemoryBarrierCount(this.segment()); }
    /// Sets `imageMemoryBarrierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageMemoryBarrierCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageMemoryBarrierCount.set(segment, 0L, index, value); }
    /// Sets `imageMemoryBarrierCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageMemoryBarrierCount(MemorySegment segment, @CType("uint32_t") int value) { VkDependencyInfo.set_imageMemoryBarrierCount(segment, 0L, value); }
    /// Sets `imageMemoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo imageMemoryBarrierCount(@CType("uint32_t") int value) { VkDependencyInfo.set_imageMemoryBarrierCount(this.segment(), value); return this; }

    /// {@return `pImageMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageMemoryBarrier2 *") MemorySegment get_pImageMemoryBarriers(MemorySegment segment, long index) { return (MemorySegment) VH_pImageMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pImageMemoryBarriers`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageMemoryBarrier2 *") MemorySegment get_pImageMemoryBarriers(MemorySegment segment) { return VkDependencyInfo.get_pImageMemoryBarriers(segment, 0L); }
    /// {@return `pImageMemoryBarriers`}
    public @CType("const VkImageMemoryBarrier2 *") MemorySegment pImageMemoryBarriers() { return VkDependencyInfo.get_pImageMemoryBarriers(this.segment()); }
    /// Sets `pImageMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImageMemoryBarriers(MemorySegment segment, long index, @CType("const VkImageMemoryBarrier2 *") MemorySegment value) { VH_pImageMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pImageMemoryBarriers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImageMemoryBarriers(MemorySegment segment, @CType("const VkImageMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pImageMemoryBarriers(segment, 0L, value); }
    /// Sets `pImageMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pImageMemoryBarriers(@CType("const VkImageMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pImageMemoryBarriers(this.segment(), value); return this; }

    /// A buffer of [VkDependencyInfo].
    public static final class Buffer extends VkDependencyInfo {
        private final long elementCount;

        /// Creates `VkDependencyInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDependencyInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDependencyInfo`
        public VkDependencyInfo asSlice(long index) { return new VkDependencyInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDependencyInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDependencyInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDependencyInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDependencyInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDependencyInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDependencyInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `dependencyFlags` at the given index}
        /// @param index the index
        public @CType("VkDependencyFlags") int dependencyFlagsAt(long index) { return VkDependencyInfo.get_dependencyFlags(this.segment(), index); }
        /// Sets `dependencyFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dependencyFlagsAt(long index, @CType("VkDependencyFlags") int value) { VkDependencyInfo.set_dependencyFlags(this.segment(), index, value); return this; }

        /// {@return `memoryBarrierCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int memoryBarrierCountAt(long index) { return VkDependencyInfo.get_memoryBarrierCount(this.segment(), index); }
        /// Sets `memoryBarrierCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryBarrierCountAt(long index, @CType("uint32_t") int value) { VkDependencyInfo.set_memoryBarrierCount(this.segment(), index, value); return this; }

        /// {@return `pMemoryBarriers` at the given index}
        /// @param index the index
        public @CType("const VkMemoryBarrier2 *") MemorySegment pMemoryBarriersAt(long index) { return VkDependencyInfo.get_pMemoryBarriers(this.segment(), index); }
        /// Sets `pMemoryBarriers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pMemoryBarriersAt(long index, @CType("const VkMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pMemoryBarriers(this.segment(), index, value); return this; }

        /// {@return `bufferMemoryBarrierCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bufferMemoryBarrierCountAt(long index) { return VkDependencyInfo.get_bufferMemoryBarrierCount(this.segment(), index); }
        /// Sets `bufferMemoryBarrierCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferMemoryBarrierCountAt(long index, @CType("uint32_t") int value) { VkDependencyInfo.set_bufferMemoryBarrierCount(this.segment(), index, value); return this; }

        /// {@return `pBufferMemoryBarriers` at the given index}
        /// @param index the index
        public @CType("const VkBufferMemoryBarrier2 *") MemorySegment pBufferMemoryBarriersAt(long index) { return VkDependencyInfo.get_pBufferMemoryBarriers(this.segment(), index); }
        /// Sets `pBufferMemoryBarriers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pBufferMemoryBarriersAt(long index, @CType("const VkBufferMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pBufferMemoryBarriers(this.segment(), index, value); return this; }

        /// {@return `imageMemoryBarrierCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int imageMemoryBarrierCountAt(long index) { return VkDependencyInfo.get_imageMemoryBarrierCount(this.segment(), index); }
        /// Sets `imageMemoryBarrierCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageMemoryBarrierCountAt(long index, @CType("uint32_t") int value) { VkDependencyInfo.set_imageMemoryBarrierCount(this.segment(), index, value); return this; }

        /// {@return `pImageMemoryBarriers` at the given index}
        /// @param index the index
        public @CType("const VkImageMemoryBarrier2 *") MemorySegment pImageMemoryBarriersAt(long index) { return VkDependencyInfo.get_pImageMemoryBarriers(this.segment(), index); }
        /// Sets `pImageMemoryBarriers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pImageMemoryBarriersAt(long index, @CType("const VkImageMemoryBarrier2 *") MemorySegment value) { VkDependencyInfo.set_pImageMemoryBarriers(this.segment(), index, value); return this; }

    }
}
