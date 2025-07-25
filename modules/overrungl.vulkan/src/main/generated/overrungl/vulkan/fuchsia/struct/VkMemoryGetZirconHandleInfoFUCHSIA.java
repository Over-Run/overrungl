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
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkMemoryGetZirconHandleInfoFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceMemory memory;
///     (int) VkExternalMemoryHandleTypeFlagBits handleType;
/// };
/// ```
public final class VkMemoryGetZirconHandleInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkMemoryGetZirconHandleInfoFUCHSIA`.
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

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryGetZirconHandleInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryGetZirconHandleInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetZirconHandleInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryGetZirconHandleInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryGetZirconHandleInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryGetZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static VkMemoryGetZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkMemoryGetZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static VkMemoryGetZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkMemoryGetZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param memory `memory`
    /// @param handleType `handleType`
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static VkMemoryGetZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long memory, int handleType) {
        return alloc(allocator).sType(sType).pNext(pNext).memory(memory).handleType(handleType);
    }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param memory `memory`
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static VkMemoryGetZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long memory) {
        return alloc(allocator).sType(sType).pNext(pNext).memory(memory);
    }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static VkMemoryGetZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static VkMemoryGetZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA copyFrom(VkMemoryGetZirconHandleInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryGetZirconHandleInfoFUCHSIA reinterpret(long count) { return new VkMemoryGetZirconHandleInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryGetZirconHandleInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryGetZirconHandleInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkMemoryGetZirconHandleInfoFUCHSIA memory(long value) { memory(this.segment(), 0L, value); return this; }

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
    public VkMemoryGetZirconHandleInfoFUCHSIA handleType(int value) { handleType(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryGetZirconHandleInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryGetZirconHandleInfoFUCHSIA`
    public VkMemoryGetZirconHandleInfoFUCHSIA asSlice(long index) { return new VkMemoryGetZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryGetZirconHandleInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryGetZirconHandleInfoFUCHSIA`
    public VkMemoryGetZirconHandleInfoFUCHSIA asSlice(long index, long count) { return new VkMemoryGetZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryGetZirconHandleInfoFUCHSIA` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA at(long index, Consumer<VkMemoryGetZirconHandleInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `memory` at the given index}
    /// @param index the index of the struct buffer
    public long memoryAt(long index) { return memory(this.segment(), index); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA memoryAt(long index, long value) { memory(this.segment(), index, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param index the index of the struct buffer
    public int handleTypeAt(long index) { return handleType(this.segment(), index); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA handleTypeAt(long index, int value) { handleType(this.segment(), index, value); return this; }

}
