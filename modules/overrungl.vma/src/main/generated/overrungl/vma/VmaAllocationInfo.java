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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VmaAllocationInfo`.
/// ## Layout
/// ```
/// struct VmaAllocationInfo {
///     uint32_t memoryType;
///     (uint64_t) VkDeviceMemory deviceMemory;
///     (uint64_t) VkDeviceSize offset;
///     (uint64_t) VkDeviceSize size;
///     void* pMappedData;
///     void* pUserData;
///     const char* pName;
/// };
/// ```
public final class VmaAllocationInfo extends GroupType {
    /// The struct layout of `VmaAllocationInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("memoryType"),
        ValueLayout.JAVA_LONG.withName("deviceMemory"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.ADDRESS.withName("pMappedData"),
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.ADDRESS.withName("pName")
    );
    /// The byte offset of `memoryType`.
    public static final long OFFSET_memoryType = LAYOUT.byteOffset(PathElement.groupElement("memoryType"));
    /// The memory layout of `memoryType`.
    public static final MemoryLayout LAYOUT_memoryType = LAYOUT.select(PathElement.groupElement("memoryType"));
    /// The [VarHandle] of `memoryType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryType"));
    /// The byte offset of `deviceMemory`.
    public static final long OFFSET_deviceMemory = LAYOUT.byteOffset(PathElement.groupElement("deviceMemory"));
    /// The memory layout of `deviceMemory`.
    public static final MemoryLayout LAYOUT_deviceMemory = LAYOUT.select(PathElement.groupElement("deviceMemory"));
    /// The [VarHandle] of `deviceMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMemory"));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `pMappedData`.
    public static final long OFFSET_pMappedData = LAYOUT.byteOffset(PathElement.groupElement("pMappedData"));
    /// The memory layout of `pMappedData`.
    public static final MemoryLayout LAYOUT_pMappedData = LAYOUT.select(PathElement.groupElement("pMappedData"));
    /// The [VarHandle] of `pMappedData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMappedData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMappedData"));
    /// The byte offset of `pUserData`.
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    /// The memory layout of `pUserData`.
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));
    /// The byte offset of `pName`.
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    /// The memory layout of `pName`.
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));

    /// Creates `VmaAllocationInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaAllocationInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaAllocationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaAllocationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaAllocationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaAllocationInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaAllocationInfo`
    public static VmaAllocationInfo alloc(SegmentAllocator allocator) { return new VmaAllocationInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaAllocationInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaAllocationInfo`
    public static VmaAllocationInfo alloc(SegmentAllocator allocator, long count) { return new VmaAllocationInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaAllocationInfo copyFrom(VmaAllocationInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaAllocationInfo reinterpret(long count) { return new VmaAllocationInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `memoryType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryType(MemorySegment segment, long index) { return (int) VH_memoryType.get(segment, 0L, index); }
    /// {@return `memoryType`}
    public int memoryType() { return memoryType(this.segment(), 0L); }
    /// Sets `memoryType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryType(MemorySegment segment, long index, int value) { VH_memoryType.set(segment, 0L, index, value); }
    /// Sets `memoryType` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo memoryType(int value) { memoryType(this.segment(), 0L, value); return this; }

    /// {@return `deviceMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long deviceMemory(MemorySegment segment, long index) { return (long) VH_deviceMemory.get(segment, 0L, index); }
    /// {@return `deviceMemory`}
    public long deviceMemory() { return deviceMemory(this.segment(), 0L); }
    /// Sets `deviceMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceMemory(MemorySegment segment, long index, long value) { VH_deviceMemory.set(segment, 0L, index, value); }
    /// Sets `deviceMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo deviceMemory(long value) { deviceMemory(this.segment(), 0L, value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    public long offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo offset(long value) { offset(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `pMappedData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMappedData(MemorySegment segment, long index) { return (MemorySegment) VH_pMappedData.get(segment, 0L, index); }
    /// {@return `pMappedData`}
    public MemorySegment pMappedData() { return pMappedData(this.segment(), 0L); }
    /// Sets `pMappedData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMappedData(MemorySegment segment, long index, MemorySegment value) { VH_pMappedData.set(segment, 0L, index, value); }
    /// Sets `pMappedData` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo pMappedData(MemorySegment value) { pMappedData(this.segment(), 0L, value); return this; }

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
    public VmaAllocationInfo pUserData(MemorySegment value) { pUserData(this.segment(), 0L, value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pName(MemorySegment segment, long index) { return (MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    public MemorySegment pName() { return pName(this.segment(), 0L); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pName(MemorySegment segment, long index, MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo pName(MemorySegment value) { pName(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaAllocationInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaAllocationInfo`
    public VmaAllocationInfo asSlice(long index) { return new VmaAllocationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaAllocationInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaAllocationInfo`
    public VmaAllocationInfo asSlice(long index, long count) { return new VmaAllocationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaAllocationInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaAllocationInfo at(long index, Consumer<VmaAllocationInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `memoryType` at the given index}
    /// @param index the index of the struct buffer
    public int memoryTypeAt(long index) { return memoryType(this.segment(), index); }
    /// Sets `memoryType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo memoryTypeAt(long index, int value) { memoryType(this.segment(), index, value); return this; }

    /// {@return `deviceMemory` at the given index}
    /// @param index the index of the struct buffer
    public long deviceMemoryAt(long index) { return deviceMemory(this.segment(), index); }
    /// Sets `deviceMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo deviceMemoryAt(long index, long value) { deviceMemory(this.segment(), index, value); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public long offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo offsetAt(long index, long value) { offset(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `pMappedData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMappedDataAt(long index) { return pMappedData(this.segment(), index); }
    /// Sets `pMappedData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo pMappedDataAt(long index, MemorySegment value) { pMappedData(this.segment(), index, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUserDataAt(long index) { return pUserData(this.segment(), index); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo pUserDataAt(long index, MemorySegment value) { pUserData(this.segment(), index, value); return this; }

    /// {@return `pName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNameAt(long index) { return pName(this.segment(), index); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationInfo pNameAt(long index, MemorySegment value) { pName(this.segment(), index, value); return this; }

}
