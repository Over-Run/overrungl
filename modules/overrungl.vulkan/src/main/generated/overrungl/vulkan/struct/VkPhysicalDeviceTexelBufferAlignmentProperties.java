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
/// struct VkPhysicalDeviceTexelBufferAlignmentProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     (uint32_t) VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     (uint64_t) VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     (uint32_t) VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
/// };
/// ```
public final class VkPhysicalDeviceTexelBufferAlignmentProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTexelBufferAlignmentProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment")
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
    /// The byte offset of `storageTexelBufferOffsetAlignmentBytes`.
    public static final long OFFSET_storageTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The memory layout of `storageTexelBufferOffsetAlignmentBytes`.
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `storageTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The byte offset of `storageTexelBufferOffsetSingleTexelAlignment`.
    public static final long OFFSET_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The memory layout of `storageTexelBufferOffsetSingleTexelAlignment`.
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `storageTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The byte offset of `uniformTexelBufferOffsetAlignmentBytes`.
    public static final long OFFSET_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The memory layout of `uniformTexelBufferOffsetAlignmentBytes`.
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `uniformTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The byte offset of `uniformTexelBufferOffsetSingleTexelAlignment`.
    public static final long OFFSET_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    /// The memory layout of `uniformTexelBufferOffsetSingleTexelAlignment`.
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `uniformTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTexelBufferAlignmentProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param storageTexelBufferOffsetAlignmentBytes `storageTexelBufferOffsetAlignmentBytes`
    /// @param storageTexelBufferOffsetSingleTexelAlignment `storageTexelBufferOffsetSingleTexelAlignment`
    /// @param uniformTexelBufferOffsetAlignmentBytes `uniformTexelBufferOffsetAlignmentBytes`
    /// @param uniformTexelBufferOffsetSingleTexelAlignment `uniformTexelBufferOffsetSingleTexelAlignment`
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long storageTexelBufferOffsetAlignmentBytes, int storageTexelBufferOffsetSingleTexelAlignment, long uniformTexelBufferOffsetAlignmentBytes, int uniformTexelBufferOffsetSingleTexelAlignment) {
        return alloc(allocator).sType(sType).pNext(pNext).storageTexelBufferOffsetAlignmentBytes(storageTexelBufferOffsetAlignmentBytes).storageTexelBufferOffsetSingleTexelAlignment(storageTexelBufferOffsetSingleTexelAlignment).uniformTexelBufferOffsetAlignmentBytes(uniformTexelBufferOffsetAlignmentBytes).uniformTexelBufferOffsetSingleTexelAlignment(uniformTexelBufferOffsetSingleTexelAlignment);
    }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param storageTexelBufferOffsetAlignmentBytes `storageTexelBufferOffsetAlignmentBytes`
    /// @param storageTexelBufferOffsetSingleTexelAlignment `storageTexelBufferOffsetSingleTexelAlignment`
    /// @param uniformTexelBufferOffsetAlignmentBytes `uniformTexelBufferOffsetAlignmentBytes`
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long storageTexelBufferOffsetAlignmentBytes, int storageTexelBufferOffsetSingleTexelAlignment, long uniformTexelBufferOffsetAlignmentBytes) {
        return alloc(allocator).sType(sType).pNext(pNext).storageTexelBufferOffsetAlignmentBytes(storageTexelBufferOffsetAlignmentBytes).storageTexelBufferOffsetSingleTexelAlignment(storageTexelBufferOffsetSingleTexelAlignment).uniformTexelBufferOffsetAlignmentBytes(uniformTexelBufferOffsetAlignmentBytes);
    }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param storageTexelBufferOffsetAlignmentBytes `storageTexelBufferOffsetAlignmentBytes`
    /// @param storageTexelBufferOffsetSingleTexelAlignment `storageTexelBufferOffsetSingleTexelAlignment`
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long storageTexelBufferOffsetAlignmentBytes, int storageTexelBufferOffsetSingleTexelAlignment) {
        return alloc(allocator).sType(sType).pNext(pNext).storageTexelBufferOffsetAlignmentBytes(storageTexelBufferOffsetAlignmentBytes).storageTexelBufferOffsetSingleTexelAlignment(storageTexelBufferOffsetSingleTexelAlignment);
    }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param storageTexelBufferOffsetAlignmentBytes `storageTexelBufferOffsetAlignmentBytes`
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long storageTexelBufferOffsetAlignmentBytes) {
        return alloc(allocator).sType(sType).pNext(pNext).storageTexelBufferOffsetAlignmentBytes(storageTexelBufferOffsetAlignmentBytes);
    }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties copyFrom(VkPhysicalDeviceTexelBufferAlignmentProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTexelBufferAlignmentProperties reinterpret(long count) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTexelBufferAlignmentProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    public long storageTexelBufferOffsetAlignmentBytes() { return storageTexelBufferOffsetAlignmentBytes(this.segment(), 0L); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, long value) { VH_storageTexelBufferOffsetAlignmentBytes.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetAlignmentBytes(long value) { storageTexelBufferOffsetAlignmentBytes(this.segment(), 0L, value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    public int storageTexelBufferOffsetSingleTexelAlignment() { return storageTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetSingleTexelAlignment(int value) { storageTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L, value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    public long uniformTexelBufferOffsetAlignmentBytes() { return uniformTexelBufferOffsetAlignmentBytes(this.segment(), 0L); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, long value) { VH_uniformTexelBufferOffsetAlignmentBytes.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetAlignmentBytes(long value) { uniformTexelBufferOffsetAlignmentBytes(this.segment(), 0L, value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    public int uniformTexelBufferOffsetSingleTexelAlignment() { return uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetSingleTexelAlignment(int value) { uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTexelBufferAlignmentProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public VkPhysicalDeviceTexelBufferAlignmentProperties asSlice(long index) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTexelBufferAlignmentProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public VkPhysicalDeviceTexelBufferAlignmentProperties asSlice(long index, long count) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTexelBufferAlignmentProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties at(long index, Consumer<VkPhysicalDeviceTexelBufferAlignmentProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index of the struct buffer
    public long storageTexelBufferOffsetAlignmentBytesAt(long index) { return storageTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetAlignmentBytesAt(long index, long value) { storageTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index of the struct buffer
    public long uniformTexelBufferOffsetAlignmentBytesAt(long index) { return uniformTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetAlignmentBytesAt(long index, long value) { uniformTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }

}
