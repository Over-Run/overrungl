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
/// ### dependencyFlags
/// [VarHandle][#VH_dependencyFlags] - [Getter][#dependencyFlags()] - [Setter][#dependencyFlags(int)]
/// ### memoryBarrierCount
/// [VarHandle][#VH_memoryBarrierCount] - [Getter][#memoryBarrierCount()] - [Setter][#memoryBarrierCount(int)]
/// ### pMemoryBarriers
/// [VarHandle][#VH_pMemoryBarriers] - [Getter][#pMemoryBarriers()] - [Setter][#pMemoryBarriers(java.lang.foreign.MemorySegment)]
/// ### bufferMemoryBarrierCount
/// [VarHandle][#VH_bufferMemoryBarrierCount] - [Getter][#bufferMemoryBarrierCount()] - [Setter][#bufferMemoryBarrierCount(int)]
/// ### pBufferMemoryBarriers
/// [VarHandle][#VH_pBufferMemoryBarriers] - [Getter][#pBufferMemoryBarriers()] - [Setter][#pBufferMemoryBarriers(java.lang.foreign.MemorySegment)]
/// ### imageMemoryBarrierCount
/// [VarHandle][#VH_imageMemoryBarrierCount] - [Getter][#imageMemoryBarrierCount()] - [Setter][#imageMemoryBarrierCount(int)]
/// ### pImageMemoryBarriers
/// [VarHandle][#VH_pImageMemoryBarriers] - [Getter][#pImageMemoryBarriers()] - [Setter][#pImageMemoryBarriers(java.lang.foreign.MemorySegment)]
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
public final class VkDependencyInfo extends Struct {
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `dependencyFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dependencyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyFlags"));
    /// The [VarHandle] of `memoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryBarrierCount"));
    /// The [VarHandle] of `pMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMemoryBarriers"));
    /// The [VarHandle] of `bufferMemoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferMemoryBarrierCount"));
    /// The [VarHandle] of `pBufferMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBufferMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferMemoryBarriers"));
    /// The [VarHandle] of `imageMemoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMemoryBarrierCount"));
    /// The [VarHandle] of `pImageMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pImageMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageMemoryBarriers"));

    /// Creates `VkDependencyInfo` with the given segment.
    /// @param segment the memory segment
    public VkDependencyInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDependencyInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDependencyInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDependencyInfo(segment); }

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
    public static VkDependencyInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDependencyInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDependencyInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDependencyInfo`
    public static VkDependencyInfo alloc(SegmentAllocator allocator) { return new VkDependencyInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDependencyInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDependencyInfo`
    public static VkDependencyInfo alloc(SegmentAllocator allocator, long count) { return new VkDependencyInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDependencyInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDependencyInfo.get_sType(this.segment(), index); }
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
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkDependencyInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo sType(@CType("VkStructureType") int value) { VkDependencyInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDependencyInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDependencyInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDependencyInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `dependencyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDependencyFlags") int get_dependencyFlags(MemorySegment segment, long index) { return (int) VH_dependencyFlags.get(segment, 0L, index); }
    /// {@return `dependencyFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkDependencyFlags") int get_dependencyFlags(MemorySegment segment) { return VkDependencyInfo.get_dependencyFlags(segment, 0L); }
    /// {@return `dependencyFlags` at the given index}
    /// @param index the index
    public @CType("VkDependencyFlags") int dependencyFlagsAt(long index) { return VkDependencyInfo.get_dependencyFlags(this.segment(), index); }
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
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo dependencyFlagsAt(long index, @CType("VkDependencyFlags") int value) { VkDependencyInfo.set_dependencyFlags(this.segment(), index, value); return this; }
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
    /// {@return `memoryBarrierCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryBarrierCountAt(long index) { return VkDependencyInfo.get_memoryBarrierCount(this.segment(), index); }
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
    /// Sets `memoryBarrierCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo memoryBarrierCountAt(long index, @CType("uint32_t") int value) { VkDependencyInfo.set_memoryBarrierCount(this.segment(), index, value); return this; }
    /// Sets `memoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo memoryBarrierCount(@CType("uint32_t") int value) { VkDependencyInfo.set_memoryBarrierCount(this.segment(), value); return this; }

    /// {@return `pMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMemoryBarrier2 *") java.lang.foreign.MemorySegment get_pMemoryBarriers(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pMemoryBarriers`}
    /// @param segment the segment of the struct
    public static @CType("const VkMemoryBarrier2 *") java.lang.foreign.MemorySegment get_pMemoryBarriers(MemorySegment segment) { return VkDependencyInfo.get_pMemoryBarriers(segment, 0L); }
    /// {@return `pMemoryBarriers` at the given index}
    /// @param index the index
    public @CType("const VkMemoryBarrier2 *") java.lang.foreign.MemorySegment pMemoryBarriersAt(long index) { return VkDependencyInfo.get_pMemoryBarriers(this.segment(), index); }
    /// {@return `pMemoryBarriers`}
    public @CType("const VkMemoryBarrier2 *") java.lang.foreign.MemorySegment pMemoryBarriers() { return VkDependencyInfo.get_pMemoryBarriers(this.segment()); }
    /// Sets `pMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMemoryBarriers(MemorySegment segment, long index, @CType("const VkMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VH_pMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pMemoryBarriers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMemoryBarriers(MemorySegment segment, @CType("const VkMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pMemoryBarriers(segment, 0L, value); }
    /// Sets `pMemoryBarriers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pMemoryBarriersAt(long index, @CType("const VkMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pMemoryBarriers(this.segment(), index, value); return this; }
    /// Sets `pMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pMemoryBarriers(@CType("const VkMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pMemoryBarriers(this.segment(), value); return this; }

    /// {@return `bufferMemoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferMemoryBarrierCount(MemorySegment segment, long index) { return (int) VH_bufferMemoryBarrierCount.get(segment, 0L, index); }
    /// {@return `bufferMemoryBarrierCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferMemoryBarrierCount(MemorySegment segment) { return VkDependencyInfo.get_bufferMemoryBarrierCount(segment, 0L); }
    /// {@return `bufferMemoryBarrierCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bufferMemoryBarrierCountAt(long index) { return VkDependencyInfo.get_bufferMemoryBarrierCount(this.segment(), index); }
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
    /// Sets `bufferMemoryBarrierCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo bufferMemoryBarrierCountAt(long index, @CType("uint32_t") int value) { VkDependencyInfo.set_bufferMemoryBarrierCount(this.segment(), index, value); return this; }
    /// Sets `bufferMemoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo bufferMemoryBarrierCount(@CType("uint32_t") int value) { VkDependencyInfo.set_bufferMemoryBarrierCount(this.segment(), value); return this; }

    /// {@return `pBufferMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkBufferMemoryBarrier2 *") java.lang.foreign.MemorySegment get_pBufferMemoryBarriers(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBufferMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pBufferMemoryBarriers`}
    /// @param segment the segment of the struct
    public static @CType("const VkBufferMemoryBarrier2 *") java.lang.foreign.MemorySegment get_pBufferMemoryBarriers(MemorySegment segment) { return VkDependencyInfo.get_pBufferMemoryBarriers(segment, 0L); }
    /// {@return `pBufferMemoryBarriers` at the given index}
    /// @param index the index
    public @CType("const VkBufferMemoryBarrier2 *") java.lang.foreign.MemorySegment pBufferMemoryBarriersAt(long index) { return VkDependencyInfo.get_pBufferMemoryBarriers(this.segment(), index); }
    /// {@return `pBufferMemoryBarriers`}
    public @CType("const VkBufferMemoryBarrier2 *") java.lang.foreign.MemorySegment pBufferMemoryBarriers() { return VkDependencyInfo.get_pBufferMemoryBarriers(this.segment()); }
    /// Sets `pBufferMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBufferMemoryBarriers(MemorySegment segment, long index, @CType("const VkBufferMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VH_pBufferMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pBufferMemoryBarriers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBufferMemoryBarriers(MemorySegment segment, @CType("const VkBufferMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pBufferMemoryBarriers(segment, 0L, value); }
    /// Sets `pBufferMemoryBarriers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pBufferMemoryBarriersAt(long index, @CType("const VkBufferMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pBufferMemoryBarriers(this.segment(), index, value); return this; }
    /// Sets `pBufferMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pBufferMemoryBarriers(@CType("const VkBufferMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pBufferMemoryBarriers(this.segment(), value); return this; }

    /// {@return `imageMemoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageMemoryBarrierCount(MemorySegment segment, long index) { return (int) VH_imageMemoryBarrierCount.get(segment, 0L, index); }
    /// {@return `imageMemoryBarrierCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageMemoryBarrierCount(MemorySegment segment) { return VkDependencyInfo.get_imageMemoryBarrierCount(segment, 0L); }
    /// {@return `imageMemoryBarrierCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int imageMemoryBarrierCountAt(long index) { return VkDependencyInfo.get_imageMemoryBarrierCount(this.segment(), index); }
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
    /// Sets `imageMemoryBarrierCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo imageMemoryBarrierCountAt(long index, @CType("uint32_t") int value) { VkDependencyInfo.set_imageMemoryBarrierCount(this.segment(), index, value); return this; }
    /// Sets `imageMemoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo imageMemoryBarrierCount(@CType("uint32_t") int value) { VkDependencyInfo.set_imageMemoryBarrierCount(this.segment(), value); return this; }

    /// {@return `pImageMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageMemoryBarrier2 *") java.lang.foreign.MemorySegment get_pImageMemoryBarriers(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pImageMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pImageMemoryBarriers`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageMemoryBarrier2 *") java.lang.foreign.MemorySegment get_pImageMemoryBarriers(MemorySegment segment) { return VkDependencyInfo.get_pImageMemoryBarriers(segment, 0L); }
    /// {@return `pImageMemoryBarriers` at the given index}
    /// @param index the index
    public @CType("const VkImageMemoryBarrier2 *") java.lang.foreign.MemorySegment pImageMemoryBarriersAt(long index) { return VkDependencyInfo.get_pImageMemoryBarriers(this.segment(), index); }
    /// {@return `pImageMemoryBarriers`}
    public @CType("const VkImageMemoryBarrier2 *") java.lang.foreign.MemorySegment pImageMemoryBarriers() { return VkDependencyInfo.get_pImageMemoryBarriers(this.segment()); }
    /// Sets `pImageMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImageMemoryBarriers(MemorySegment segment, long index, @CType("const VkImageMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VH_pImageMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pImageMemoryBarriers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImageMemoryBarriers(MemorySegment segment, @CType("const VkImageMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pImageMemoryBarriers(segment, 0L, value); }
    /// Sets `pImageMemoryBarriers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pImageMemoryBarriersAt(long index, @CType("const VkImageMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pImageMemoryBarriers(this.segment(), index, value); return this; }
    /// Sets `pImageMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfo pImageMemoryBarriers(@CType("const VkImageMemoryBarrier2 *") java.lang.foreign.MemorySegment value) { VkDependencyInfo.set_pImageMemoryBarriers(this.segment(), value); return this; }

}
