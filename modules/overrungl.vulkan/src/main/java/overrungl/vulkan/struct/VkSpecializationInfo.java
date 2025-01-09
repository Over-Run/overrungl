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
/// ### mapEntryCount
/// [VarHandle][#VH_mapEntryCount] - [Getter][#mapEntryCount()] - [Setter][#mapEntryCount(int)]
/// ### pMapEntries
/// [VarHandle][#VH_pMapEntries] - [Getter][#pMapEntries()] - [Setter][#pMapEntries(java.lang.foreign.MemorySegment)]
/// ### dataSize
/// [VarHandle][#VH_dataSize] - [Getter][#dataSize()] - [Setter][#dataSize(long)]
/// ### pData
/// [VarHandle][#VH_pData] - [Getter][#pData()] - [Setter][#pData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSpecializationInfo {
///     uint32_t mapEntryCount;
///     const VkSpecializationMapEntry * pMapEntries;
///     size_t dataSize;
///     const void * pData;
/// } VkSpecializationInfo;
/// ```
public final class VkSpecializationInfo extends Struct {
    /// The struct layout of `VkSpecializationInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("mapEntryCount"),
        ValueLayout.ADDRESS.withName("pMapEntries"),
        ValueLayout.JAVA_LONG.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The [VarHandle] of `mapEntryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mapEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mapEntryCount"));
    /// The [VarHandle] of `pMapEntries` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMapEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMapEntries"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkSpecializationInfo` with the given segment.
    /// @param segment the memory segment
    public VkSpecializationInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSpecializationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSpecializationInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSpecializationInfo(segment); }

    /// Creates `VkSpecializationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSpecializationInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSpecializationInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSpecializationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSpecializationInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSpecializationInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSpecializationInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSpecializationInfo`
    public static VkSpecializationInfo alloc(SegmentAllocator allocator) { return new VkSpecializationInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSpecializationInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSpecializationInfo`
    public static VkSpecializationInfo alloc(SegmentAllocator allocator, long count) { return new VkSpecializationInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSpecializationInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSpecializationInfo`
    public VkSpecializationInfo asSlice(long index) { return new VkSpecializationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSpecializationInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSpecializationInfo`
    public VkSpecializationInfo asSlice(long index, long count) { return new VkSpecializationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `mapEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mapEntryCount(MemorySegment segment, long index) { return (int) VH_mapEntryCount.get(segment, 0L, index); }
    /// {@return `mapEntryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mapEntryCount(MemorySegment segment) { return VkSpecializationInfo.get_mapEntryCount(segment, 0L); }
    /// {@return `mapEntryCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int mapEntryCountAt(long index) { return VkSpecializationInfo.get_mapEntryCount(this.segment(), index); }
    /// {@return `mapEntryCount`}
    public @CType("uint32_t") int mapEntryCount() { return VkSpecializationInfo.get_mapEntryCount(this.segment()); }
    /// Sets `mapEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mapEntryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mapEntryCount.set(segment, 0L, index, value); }
    /// Sets `mapEntryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mapEntryCount(MemorySegment segment, @CType("uint32_t") int value) { VkSpecializationInfo.set_mapEntryCount(segment, 0L, value); }
    /// Sets `mapEntryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo mapEntryCountAt(long index, @CType("uint32_t") int value) { VkSpecializationInfo.set_mapEntryCount(this.segment(), index, value); return this; }
    /// Sets `mapEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo mapEntryCount(@CType("uint32_t") int value) { VkSpecializationInfo.set_mapEntryCount(this.segment(), value); return this; }

    /// {@return `pMapEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSpecializationMapEntry *") java.lang.foreign.MemorySegment get_pMapEntries(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMapEntries.get(segment, 0L, index); }
    /// {@return `pMapEntries`}
    /// @param segment the segment of the struct
    public static @CType("const VkSpecializationMapEntry *") java.lang.foreign.MemorySegment get_pMapEntries(MemorySegment segment) { return VkSpecializationInfo.get_pMapEntries(segment, 0L); }
    /// {@return `pMapEntries` at the given index}
    /// @param index the index
    public @CType("const VkSpecializationMapEntry *") java.lang.foreign.MemorySegment pMapEntriesAt(long index) { return VkSpecializationInfo.get_pMapEntries(this.segment(), index); }
    /// {@return `pMapEntries`}
    public @CType("const VkSpecializationMapEntry *") java.lang.foreign.MemorySegment pMapEntries() { return VkSpecializationInfo.get_pMapEntries(this.segment()); }
    /// Sets `pMapEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMapEntries(MemorySegment segment, long index, @CType("const VkSpecializationMapEntry *") java.lang.foreign.MemorySegment value) { VH_pMapEntries.set(segment, 0L, index, value); }
    /// Sets `pMapEntries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMapEntries(MemorySegment segment, @CType("const VkSpecializationMapEntry *") java.lang.foreign.MemorySegment value) { VkSpecializationInfo.set_pMapEntries(segment, 0L, value); }
    /// Sets `pMapEntries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo pMapEntriesAt(long index, @CType("const VkSpecializationMapEntry *") java.lang.foreign.MemorySegment value) { VkSpecializationInfo.set_pMapEntries(this.segment(), index, value); return this; }
    /// Sets `pMapEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo pMapEntries(@CType("const VkSpecializationMapEntry *") java.lang.foreign.MemorySegment value) { VkSpecializationInfo.set_pMapEntries(this.segment(), value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_dataSize(MemorySegment segment, long index) { return (long) VH_dataSize.get(segment, 0L, index); }
    /// {@return `dataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_dataSize(MemorySegment segment) { return VkSpecializationInfo.get_dataSize(segment, 0L); }
    /// {@return `dataSize` at the given index}
    /// @param index the index
    public @CType("size_t") long dataSizeAt(long index) { return VkSpecializationInfo.get_dataSize(this.segment(), index); }
    /// {@return `dataSize`}
    public @CType("size_t") long dataSize() { return VkSpecializationInfo.get_dataSize(this.segment()); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_dataSize.set(segment, 0L, index, value); }
    /// Sets `dataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, @CType("size_t") long value) { VkSpecializationInfo.set_dataSize(segment, 0L, value); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo dataSizeAt(long index, @CType("size_t") long value) { VkSpecializationInfo.set_dataSize(this.segment(), index, value); return this; }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo dataSize(@CType("size_t") long value) { VkSpecializationInfo.set_dataSize(this.segment(), value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pData(MemorySegment segment) { return VkSpecializationInfo.get_pData(segment, 0L); }
    /// {@return `pData` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pDataAt(long index) { return VkSpecializationInfo.get_pData(this.segment(), index); }
    /// {@return `pData`}
    public @CType("const void *") java.lang.foreign.MemorySegment pData() { return VkSpecializationInfo.get_pData(this.segment()); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pData(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pData(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSpecializationInfo.set_pData(segment, 0L, value); }
    /// Sets `pData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo pDataAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSpecializationInfo.set_pData(this.segment(), index, value); return this; }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo pData(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSpecializationInfo.set_pData(this.segment(), value); return this; }

}
