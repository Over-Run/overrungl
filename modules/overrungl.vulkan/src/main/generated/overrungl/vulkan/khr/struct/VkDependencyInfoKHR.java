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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDependencyInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDependencyFlags dependencyFlags;
///     uint32_t memoryBarrierCount;
///     const VkMemoryBarrier2* pMemoryBarriers;
///     uint32_t bufferMemoryBarrierCount;
///     const VkBufferMemoryBarrier2* pBufferMemoryBarriers;
///     uint32_t imageMemoryBarrierCount;
///     const VkImageMemoryBarrier2* pImageMemoryBarriers;
/// };
/// ```
public final class VkDependencyInfoKHR extends GroupType {
    /// The struct layout of `VkDependencyInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `dependencyFlags`.
    public static final long OFFSET_dependencyFlags = LAYOUT.byteOffset(PathElement.groupElement("dependencyFlags"));
    /// The memory layout of `dependencyFlags`.
    public static final MemoryLayout LAYOUT_dependencyFlags = LAYOUT.select(PathElement.groupElement("dependencyFlags"));
    /// The [VarHandle] of `dependencyFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dependencyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyFlags"));
    /// The byte offset of `memoryBarrierCount`.
    public static final long OFFSET_memoryBarrierCount = LAYOUT.byteOffset(PathElement.groupElement("memoryBarrierCount"));
    /// The memory layout of `memoryBarrierCount`.
    public static final MemoryLayout LAYOUT_memoryBarrierCount = LAYOUT.select(PathElement.groupElement("memoryBarrierCount"));
    /// The [VarHandle] of `memoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryBarrierCount"));
    /// The byte offset of `pMemoryBarriers`.
    public static final long OFFSET_pMemoryBarriers = LAYOUT.byteOffset(PathElement.groupElement("pMemoryBarriers"));
    /// The memory layout of `pMemoryBarriers`.
    public static final MemoryLayout LAYOUT_pMemoryBarriers = LAYOUT.select(PathElement.groupElement("pMemoryBarriers"));
    /// The [VarHandle] of `pMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMemoryBarriers"));
    /// The byte offset of `bufferMemoryBarrierCount`.
    public static final long OFFSET_bufferMemoryBarrierCount = LAYOUT.byteOffset(PathElement.groupElement("bufferMemoryBarrierCount"));
    /// The memory layout of `bufferMemoryBarrierCount`.
    public static final MemoryLayout LAYOUT_bufferMemoryBarrierCount = LAYOUT.select(PathElement.groupElement("bufferMemoryBarrierCount"));
    /// The [VarHandle] of `bufferMemoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferMemoryBarrierCount"));
    /// The byte offset of `pBufferMemoryBarriers`.
    public static final long OFFSET_pBufferMemoryBarriers = LAYOUT.byteOffset(PathElement.groupElement("pBufferMemoryBarriers"));
    /// The memory layout of `pBufferMemoryBarriers`.
    public static final MemoryLayout LAYOUT_pBufferMemoryBarriers = LAYOUT.select(PathElement.groupElement("pBufferMemoryBarriers"));
    /// The [VarHandle] of `pBufferMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBufferMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferMemoryBarriers"));
    /// The byte offset of `imageMemoryBarrierCount`.
    public static final long OFFSET_imageMemoryBarrierCount = LAYOUT.byteOffset(PathElement.groupElement("imageMemoryBarrierCount"));
    /// The memory layout of `imageMemoryBarrierCount`.
    public static final MemoryLayout LAYOUT_imageMemoryBarrierCount = LAYOUT.select(PathElement.groupElement("imageMemoryBarrierCount"));
    /// The [VarHandle] of `imageMemoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMemoryBarrierCount"));
    /// The byte offset of `pImageMemoryBarriers`.
    public static final long OFFSET_pImageMemoryBarriers = LAYOUT.byteOffset(PathElement.groupElement("pImageMemoryBarriers"));
    /// The memory layout of `pImageMemoryBarriers`.
    public static final MemoryLayout LAYOUT_pImageMemoryBarriers = LAYOUT.select(PathElement.groupElement("pImageMemoryBarriers"));
    /// The [VarHandle] of `pImageMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImageMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageMemoryBarriers"));

    /// Creates `VkDependencyInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDependencyInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDependencyInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDependencyInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDependencyInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDependencyInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDependencyInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDependencyInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDependencyInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDependencyInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDependencyInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDependencyInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDependencyInfoKHR`
    public static VkDependencyInfoKHR alloc(SegmentAllocator allocator) { return new VkDependencyInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDependencyInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDependencyInfoKHR`
    public static VkDependencyInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDependencyInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDependencyInfoKHR copyFrom(VkDependencyInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDependencyInfoKHR reinterpret(long count) { return new VkDependencyInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDependencyInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDependencyInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dependencyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dependencyFlags(MemorySegment segment, long index) { return (int) VH_dependencyFlags.get(segment, 0L, index); }
    /// {@return `dependencyFlags`}
    public int dependencyFlags() { return dependencyFlags(this.segment(), 0L); }
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dependencyFlags(MemorySegment segment, long index, int value) { VH_dependencyFlags.set(segment, 0L, index, value); }
    /// Sets `dependencyFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR dependencyFlags(int value) { dependencyFlags(this.segment(), 0L, value); return this; }

    /// {@return `memoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryBarrierCount(MemorySegment segment, long index) { return (int) VH_memoryBarrierCount.get(segment, 0L, index); }
    /// {@return `memoryBarrierCount`}
    public int memoryBarrierCount() { return memoryBarrierCount(this.segment(), 0L); }
    /// Sets `memoryBarrierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryBarrierCount(MemorySegment segment, long index, int value) { VH_memoryBarrierCount.set(segment, 0L, index, value); }
    /// Sets `memoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR memoryBarrierCount(int value) { memoryBarrierCount(this.segment(), 0L, value); return this; }

    /// {@return `pMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMemoryBarriers(MemorySegment segment, long index) { return (MemorySegment) VH_pMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pMemoryBarriers`}
    public MemorySegment pMemoryBarriers() { return pMemoryBarriers(this.segment(), 0L); }
    /// Sets `pMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMemoryBarriers(MemorySegment segment, long index, MemorySegment value) { VH_pMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR pMemoryBarriers(MemorySegment value) { pMemoryBarriers(this.segment(), 0L, value); return this; }

    /// {@return `bufferMemoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferMemoryBarrierCount(MemorySegment segment, long index) { return (int) VH_bufferMemoryBarrierCount.get(segment, 0L, index); }
    /// {@return `bufferMemoryBarrierCount`}
    public int bufferMemoryBarrierCount() { return bufferMemoryBarrierCount(this.segment(), 0L); }
    /// Sets `bufferMemoryBarrierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferMemoryBarrierCount(MemorySegment segment, long index, int value) { VH_bufferMemoryBarrierCount.set(segment, 0L, index, value); }
    /// Sets `bufferMemoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR bufferMemoryBarrierCount(int value) { bufferMemoryBarrierCount(this.segment(), 0L, value); return this; }

    /// {@return `pBufferMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBufferMemoryBarriers(MemorySegment segment, long index) { return (MemorySegment) VH_pBufferMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pBufferMemoryBarriers`}
    public MemorySegment pBufferMemoryBarriers() { return pBufferMemoryBarriers(this.segment(), 0L); }
    /// Sets `pBufferMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBufferMemoryBarriers(MemorySegment segment, long index, MemorySegment value) { VH_pBufferMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pBufferMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR pBufferMemoryBarriers(MemorySegment value) { pBufferMemoryBarriers(this.segment(), 0L, value); return this; }

    /// {@return `imageMemoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageMemoryBarrierCount(MemorySegment segment, long index) { return (int) VH_imageMemoryBarrierCount.get(segment, 0L, index); }
    /// {@return `imageMemoryBarrierCount`}
    public int imageMemoryBarrierCount() { return imageMemoryBarrierCount(this.segment(), 0L); }
    /// Sets `imageMemoryBarrierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageMemoryBarrierCount(MemorySegment segment, long index, int value) { VH_imageMemoryBarrierCount.set(segment, 0L, index, value); }
    /// Sets `imageMemoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR imageMemoryBarrierCount(int value) { imageMemoryBarrierCount(this.segment(), 0L, value); return this; }

    /// {@return `pImageMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pImageMemoryBarriers(MemorySegment segment, long index) { return (MemorySegment) VH_pImageMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pImageMemoryBarriers`}
    public MemorySegment pImageMemoryBarriers() { return pImageMemoryBarriers(this.segment(), 0L); }
    /// Sets `pImageMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pImageMemoryBarriers(MemorySegment segment, long index, MemorySegment value) { VH_pImageMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pImageMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR pImageMemoryBarriers(MemorySegment value) { pImageMemoryBarriers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDependencyInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDependencyInfoKHR`
    public VkDependencyInfoKHR asSlice(long index) { return new VkDependencyInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDependencyInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDependencyInfoKHR`
    public VkDependencyInfoKHR asSlice(long index, long count) { return new VkDependencyInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDependencyInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDependencyInfoKHR at(long index, Consumer<VkDependencyInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dependencyFlags` at the given index}
    /// @param index the index of the struct buffer
    public int dependencyFlagsAt(long index) { return dependencyFlags(this.segment(), index); }
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR dependencyFlagsAt(long index, int value) { dependencyFlags(this.segment(), index, value); return this; }

    /// {@return `memoryBarrierCount` at the given index}
    /// @param index the index of the struct buffer
    public int memoryBarrierCountAt(long index) { return memoryBarrierCount(this.segment(), index); }
    /// Sets `memoryBarrierCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR memoryBarrierCountAt(long index, int value) { memoryBarrierCount(this.segment(), index, value); return this; }

    /// {@return `pMemoryBarriers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMemoryBarriersAt(long index) { return pMemoryBarriers(this.segment(), index); }
    /// Sets `pMemoryBarriers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR pMemoryBarriersAt(long index, MemorySegment value) { pMemoryBarriers(this.segment(), index, value); return this; }

    /// {@return `bufferMemoryBarrierCount` at the given index}
    /// @param index the index of the struct buffer
    public int bufferMemoryBarrierCountAt(long index) { return bufferMemoryBarrierCount(this.segment(), index); }
    /// Sets `bufferMemoryBarrierCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR bufferMemoryBarrierCountAt(long index, int value) { bufferMemoryBarrierCount(this.segment(), index, value); return this; }

    /// {@return `pBufferMemoryBarriers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pBufferMemoryBarriersAt(long index) { return pBufferMemoryBarriers(this.segment(), index); }
    /// Sets `pBufferMemoryBarriers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR pBufferMemoryBarriersAt(long index, MemorySegment value) { pBufferMemoryBarriers(this.segment(), index, value); return this; }

    /// {@return `imageMemoryBarrierCount` at the given index}
    /// @param index the index of the struct buffer
    public int imageMemoryBarrierCountAt(long index) { return imageMemoryBarrierCount(this.segment(), index); }
    /// Sets `imageMemoryBarrierCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR imageMemoryBarrierCountAt(long index, int value) { imageMemoryBarrierCount(this.segment(), index, value); return this; }

    /// {@return `pImageMemoryBarriers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pImageMemoryBarriersAt(long index) { return pImageMemoryBarriers(this.segment(), index); }
    /// Sets `pImageMemoryBarriers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDependencyInfoKHR pImageMemoryBarriersAt(long index, MemorySegment value) { pImageMemoryBarriers(this.segment(), index, value); return this; }

}
