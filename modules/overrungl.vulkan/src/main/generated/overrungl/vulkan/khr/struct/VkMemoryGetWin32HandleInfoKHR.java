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
/// struct VkMemoryGetWin32HandleInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceMemory memory;
///     (int) VkExternalMemoryHandleTypeFlagBits handleType;
/// };
/// ```
public final class VkMemoryGetWin32HandleInfoKHR extends GroupType {
    /// The struct layout of `VkMemoryGetWin32HandleInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("memory"),
        ValueLayout.JAVA_INT.withName("handleType")
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
    /// The byte offset of `memory`.
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    /// The memory layout of `memory`.
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The byte offset of `handleType`.
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    /// The memory layout of `handleType`.
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    /// Creates `VkMemoryGetWin32HandleInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryGetWin32HandleInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryGetWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryGetWin32HandleInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetWin32HandleInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryGetWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryGetWin32HandleInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetWin32HandleInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryGetWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryGetWin32HandleInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetWin32HandleInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryGetWin32HandleInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryGetWin32HandleInfoKHR`
    public static VkMemoryGetWin32HandleInfoKHR alloc(SegmentAllocator allocator) { return new VkMemoryGetWin32HandleInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryGetWin32HandleInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryGetWin32HandleInfoKHR`
    public static VkMemoryGetWin32HandleInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkMemoryGetWin32HandleInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryGetWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param memory `memory`
    /// @param handleType `handleType`
    /// @return the allocated `VkMemoryGetWin32HandleInfoKHR`
    public static VkMemoryGetWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long memory, int handleType) {
        return alloc(allocator).sType(sType).pNext(pNext).memory(memory).handleType(handleType);
    }

    /// Allocates a `VkMemoryGetWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param memory `memory`
    /// @return the allocated `VkMemoryGetWin32HandleInfoKHR`
    public static VkMemoryGetWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long memory) {
        return alloc(allocator).sType(sType).pNext(pNext).memory(memory);
    }

    /// Allocates a `VkMemoryGetWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkMemoryGetWin32HandleInfoKHR`
    public static VkMemoryGetWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkMemoryGetWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkMemoryGetWin32HandleInfoKHR`
    public static VkMemoryGetWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryGetWin32HandleInfoKHR copyFrom(VkMemoryGetWin32HandleInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryGetWin32HandleInfoKHR reinterpret(long count) { return new VkMemoryGetWin32HandleInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryGetWin32HandleInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryGetWin32HandleInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long memory(MemorySegment segment, long index) { return (long) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    public long memory() { return memory(this.segment(), 0L); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memory(MemorySegment segment, long index, long value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryGetWin32HandleInfoKHR memory(long value) { memory(this.segment(), 0L, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    public int handleType() { return handleType(this.segment(), 0L); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handleType(MemorySegment segment, long index, int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryGetWin32HandleInfoKHR handleType(int value) { handleType(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryGetWin32HandleInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryGetWin32HandleInfoKHR`
    public VkMemoryGetWin32HandleInfoKHR asSlice(long index) { return new VkMemoryGetWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryGetWin32HandleInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryGetWin32HandleInfoKHR`
    public VkMemoryGetWin32HandleInfoKHR asSlice(long index, long count) { return new VkMemoryGetWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryGetWin32HandleInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryGetWin32HandleInfoKHR at(long index, Consumer<VkMemoryGetWin32HandleInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryGetWin32HandleInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryGetWin32HandleInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `memory` at the given index}
    /// @param index the index of the struct buffer
    public long memoryAt(long index) { return memory(this.segment(), index); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryGetWin32HandleInfoKHR memoryAt(long index, long value) { memory(this.segment(), index, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param index the index of the struct buffer
    public int handleTypeAt(long index) { return handleType(this.segment(), index); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryGetWin32HandleInfoKHR handleTypeAt(long index, int value) { handleType(this.segment(), index, value); return this; }

}
