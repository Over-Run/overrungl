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
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VmaDeviceMemoryCallbacks {
///     (void (*VmaAllocateDeviceMemoryFunction)((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryType, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize size, void* pUserData)) PFN_vmaAllocateDeviceMemoryFunction pfnAllocate;
///     (void (*VmaFreeDeviceMemoryFunction)((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryType, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize size, void* pUserData)) PFN_vmaFreeDeviceMemoryFunction pfnFree;
///     void* pUserData;
/// };
/// ```
public final class VmaDeviceMemoryCallbacks extends GroupType {
    /// The struct layout of `VmaDeviceMemoryCallbacks`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("pfnAllocate"),
        ValueLayout.ADDRESS.withName("pfnFree"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    /// The byte offset of `pfnAllocate`.
    public static final long OFFSET_pfnAllocate = LAYOUT.byteOffset(PathElement.groupElement("pfnAllocate"));
    /// The memory layout of `pfnAllocate`.
    public static final MemoryLayout LAYOUT_pfnAllocate = LAYOUT.select(PathElement.groupElement("pfnAllocate"));
    /// The [VarHandle] of `pfnAllocate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnAllocate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnAllocate"));
    /// The byte offset of `pfnFree`.
    public static final long OFFSET_pfnFree = LAYOUT.byteOffset(PathElement.groupElement("pfnFree"));
    /// The memory layout of `pfnFree`.
    public static final MemoryLayout LAYOUT_pfnFree = LAYOUT.select(PathElement.groupElement("pfnFree"));
    /// The [VarHandle] of `pfnFree` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnFree = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnFree"));
    /// The byte offset of `pUserData`.
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    /// The memory layout of `pUserData`.
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    /// Creates `VmaDeviceMemoryCallbacks` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaDeviceMemoryCallbacks(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaDeviceMemoryCallbacks` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDeviceMemoryCallbacks of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDeviceMemoryCallbacks(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaDeviceMemoryCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDeviceMemoryCallbacks ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDeviceMemoryCallbacks(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaDeviceMemoryCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaDeviceMemoryCallbacks ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaDeviceMemoryCallbacks(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaDeviceMemoryCallbacks` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaDeviceMemoryCallbacks`
    public static VmaDeviceMemoryCallbacks alloc(SegmentAllocator allocator) { return new VmaDeviceMemoryCallbacks(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaDeviceMemoryCallbacks` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaDeviceMemoryCallbacks`
    public static VmaDeviceMemoryCallbacks alloc(SegmentAllocator allocator, long count) { return new VmaDeviceMemoryCallbacks(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaDeviceMemoryCallbacks copyFrom(VmaDeviceMemoryCallbacks src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaDeviceMemoryCallbacks reinterpret(long count) { return new VmaDeviceMemoryCallbacks(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pfnAllocate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnAllocate(MemorySegment segment, long index) { return (MemorySegment) VH_pfnAllocate.get(segment, 0L, index); }
    /// {@return `pfnAllocate`}
    public MemorySegment pfnAllocate() { return pfnAllocate(this.segment(), 0L); }
    /// Sets `pfnAllocate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnAllocate(MemorySegment segment, long index, MemorySegment value) { VH_pfnAllocate.set(segment, 0L, index, value); }
    /// Sets `pfnAllocate` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDeviceMemoryCallbacks pfnAllocate(MemorySegment value) { pfnAllocate(this.segment(), 0L, value); return this; }

    /// {@return `pfnFree` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnFree(MemorySegment segment, long index) { return (MemorySegment) VH_pfnFree.get(segment, 0L, index); }
    /// {@return `pfnFree`}
    public MemorySegment pfnFree() { return pfnFree(this.segment(), 0L); }
    /// Sets `pfnFree` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnFree(MemorySegment segment, long index, MemorySegment value) { VH_pfnFree.set(segment, 0L, index, value); }
    /// Sets `pfnFree` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDeviceMemoryCallbacks pfnFree(MemorySegment value) { pfnFree(this.segment(), 0L, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    public MemorySegment pUserData() { return pUserData(this.segment(), 0L); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUserData(MemorySegment segment, long index, MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaDeviceMemoryCallbacks pUserData(MemorySegment value) { pUserData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaDeviceMemoryCallbacks`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaDeviceMemoryCallbacks`
    public VmaDeviceMemoryCallbacks asSlice(long index) { return new VmaDeviceMemoryCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaDeviceMemoryCallbacks`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaDeviceMemoryCallbacks`
    public VmaDeviceMemoryCallbacks asSlice(long index, long count) { return new VmaDeviceMemoryCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaDeviceMemoryCallbacks` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaDeviceMemoryCallbacks at(long index, Consumer<VmaDeviceMemoryCallbacks> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pfnAllocate` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnAllocateAt(long index) { return pfnAllocate(this.segment(), index); }
    /// Sets `pfnAllocate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDeviceMemoryCallbacks pfnAllocateAt(long index, MemorySegment value) { pfnAllocate(this.segment(), index, value); return this; }

    /// {@return `pfnFree` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnFreeAt(long index) { return pfnFree(this.segment(), index); }
    /// Sets `pfnFree` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDeviceMemoryCallbacks pfnFreeAt(long index, MemorySegment value) { pfnFree(this.segment(), index, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUserDataAt(long index) { return pUserData(this.segment(), index); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaDeviceMemoryCallbacks pUserDataAt(long index, MemorySegment value) { pUserData(this.segment(), index, value); return this; }

}
