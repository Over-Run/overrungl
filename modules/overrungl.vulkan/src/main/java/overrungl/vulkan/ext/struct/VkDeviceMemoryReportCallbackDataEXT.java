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
package overrungl.vulkan.ext.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### memoryObjectId
/// [VarHandle][#VH_memoryObjectId] - [Getter][#memoryObjectId()] - [Setter][#memoryObjectId(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### objectType
/// [VarHandle][#VH_objectType] - [Getter][#objectType()] - [Setter][#objectType(int)]
/// ### objectHandle
/// [VarHandle][#VH_objectHandle] - [Getter][#objectHandle()] - [Setter][#objectHandle(long)]
/// ### heapIndex
/// [VarHandle][#VH_heapIndex] - [Getter][#heapIndex()] - [Setter][#heapIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceMemoryReportCallbackDataEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceMemoryReportFlagsEXT flags;
///     VkDeviceMemoryReportEventTypeEXT type;
///     uint64_t memoryObjectId;
///     VkDeviceSize size;
///     VkObjectType objectType;
///     uint64_t objectHandle;
///     uint32_t heapIndex;
/// } VkDeviceMemoryReportCallbackDataEXT;
/// ```
public final class VkDeviceMemoryReportCallbackDataEXT extends Struct {
    /// The struct layout of `VkDeviceMemoryReportCallbackDataEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("memoryObjectId"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_INT.withName("heapIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `memoryObjectId` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_memoryObjectId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryObjectId"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectHandle` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_objectHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle"));
    /// The [VarHandle] of `heapIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_heapIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapIndex"));

    /// Creates `VkDeviceMemoryReportCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceMemoryReportCallbackDataEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceMemoryReportCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceMemoryReportCallbackDataEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment); }

    /// Creates `VkDeviceMemoryReportCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceMemoryReportCallbackDataEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceMemoryReportCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceMemoryReportCallbackDataEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceMemoryReportCallbackDataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceMemoryReportCallbackDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceMemoryReportCallbackDataEXT`
    public static VkDeviceMemoryReportCallbackDataEXT alloc(SegmentAllocator allocator) { return new VkDeviceMemoryReportCallbackDataEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceMemoryReportCallbackDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceMemoryReportCallbackDataEXT`
    public static VkDeviceMemoryReportCallbackDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceMemoryReportCallbackDataEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceMemoryReportCallbackDataEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceMemoryReportCallbackDataEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceMemoryReportCallbackDataEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT sType(@CType("VkStructureType") int value) { VkDeviceMemoryReportCallbackDataEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceMemoryReportCallbackDataEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceMemoryReportCallbackDataEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceMemoryReportCallbackDataEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceMemoryReportCallbackDataEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemoryReportFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemoryReportFlagsEXT") int get_flags(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkDeviceMemoryReportFlagsEXT") int flagsAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkDeviceMemoryReportFlagsEXT") int flags() { return VkDeviceMemoryReportCallbackDataEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDeviceMemoryReportFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDeviceMemoryReportFlagsEXT") int value) { VkDeviceMemoryReportCallbackDataEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT flagsAt(long index, @CType("VkDeviceMemoryReportFlagsEXT") int value) { VkDeviceMemoryReportCallbackDataEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT flags(@CType("VkDeviceMemoryReportFlagsEXT") int value) { VkDeviceMemoryReportCallbackDataEXT.set_flags(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemoryReportEventTypeEXT") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemoryReportEventTypeEXT") int get_type(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkDeviceMemoryReportEventTypeEXT") int typeAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkDeviceMemoryReportEventTypeEXT") int type() { return VkDeviceMemoryReportCallbackDataEXT.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkDeviceMemoryReportEventTypeEXT") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkDeviceMemoryReportEventTypeEXT") int value) { VkDeviceMemoryReportCallbackDataEXT.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT typeAt(long index, @CType("VkDeviceMemoryReportEventTypeEXT") int value) { VkDeviceMemoryReportCallbackDataEXT.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT type(@CType("VkDeviceMemoryReportEventTypeEXT") int value) { VkDeviceMemoryReportCallbackDataEXT.set_type(this.segment(), value); return this; }

    /// {@return `memoryObjectId` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_memoryObjectId(MemorySegment segment, long index) { return (long) VH_memoryObjectId.get(segment, 0L, index); }
    /// {@return `memoryObjectId`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_memoryObjectId(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_memoryObjectId(segment, 0L); }
    /// {@return `memoryObjectId` at the given index}
    /// @param index the index
    public @CType("uint64_t") long memoryObjectIdAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_memoryObjectId(this.segment(), index); }
    /// {@return `memoryObjectId`}
    public @CType("uint64_t") long memoryObjectId() { return VkDeviceMemoryReportCallbackDataEXT.get_memoryObjectId(this.segment()); }
    /// Sets `memoryObjectId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryObjectId(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_memoryObjectId.set(segment, 0L, index, value); }
    /// Sets `memoryObjectId` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryObjectId(MemorySegment segment, @CType("uint64_t") long value) { VkDeviceMemoryReportCallbackDataEXT.set_memoryObjectId(segment, 0L, value); }
    /// Sets `memoryObjectId` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT memoryObjectIdAt(long index, @CType("uint64_t") long value) { VkDeviceMemoryReportCallbackDataEXT.set_memoryObjectId(this.segment(), index, value); return this; }
    /// Sets `memoryObjectId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT memoryObjectId(@CType("uint64_t") long value) { VkDeviceMemoryReportCallbackDataEXT.set_memoryObjectId(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkDeviceMemoryReportCallbackDataEXT.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkDeviceMemoryReportCallbackDataEXT.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT sizeAt(long index, @CType("VkDeviceSize") long value) { VkDeviceMemoryReportCallbackDataEXT.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT size(@CType("VkDeviceSize") long value) { VkDeviceMemoryReportCallbackDataEXT.set_size(this.segment(), value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkObjectType") int get_objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    /// @param segment the segment of the struct
    public static @CType("VkObjectType") int get_objectType(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_objectType(segment, 0L); }
    /// {@return `objectType` at the given index}
    /// @param index the index
    public @CType("VkObjectType") int objectTypeAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_objectType(this.segment(), index); }
    /// {@return `objectType`}
    public @CType("VkObjectType") int objectType() { return VkDeviceMemoryReportCallbackDataEXT.get_objectType(this.segment()); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, long index, @CType("VkObjectType") int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, @CType("VkObjectType") int value) { VkDeviceMemoryReportCallbackDataEXT.set_objectType(segment, 0L, value); }
    /// Sets `objectType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT objectTypeAt(long index, @CType("VkObjectType") int value) { VkDeviceMemoryReportCallbackDataEXT.set_objectType(this.segment(), index, value); return this; }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT objectType(@CType("VkObjectType") int value) { VkDeviceMemoryReportCallbackDataEXT.set_objectType(this.segment(), value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_objectHandle(MemorySegment segment, long index) { return (long) VH_objectHandle.get(segment, 0L, index); }
    /// {@return `objectHandle`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_objectHandle(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_objectHandle(segment, 0L); }
    /// {@return `objectHandle` at the given index}
    /// @param index the index
    public @CType("uint64_t") long objectHandleAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_objectHandle(this.segment(), index); }
    /// {@return `objectHandle`}
    public @CType("uint64_t") long objectHandle() { return VkDeviceMemoryReportCallbackDataEXT.get_objectHandle(this.segment()); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectHandle(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_objectHandle.set(segment, 0L, index, value); }
    /// Sets `objectHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectHandle(MemorySegment segment, @CType("uint64_t") long value) { VkDeviceMemoryReportCallbackDataEXT.set_objectHandle(segment, 0L, value); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT objectHandleAt(long index, @CType("uint64_t") long value) { VkDeviceMemoryReportCallbackDataEXT.set_objectHandle(this.segment(), index, value); return this; }
    /// Sets `objectHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT objectHandle(@CType("uint64_t") long value) { VkDeviceMemoryReportCallbackDataEXT.set_objectHandle(this.segment(), value); return this; }

    /// {@return `heapIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_heapIndex(MemorySegment segment, long index) { return (int) VH_heapIndex.get(segment, 0L, index); }
    /// {@return `heapIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_heapIndex(MemorySegment segment) { return VkDeviceMemoryReportCallbackDataEXT.get_heapIndex(segment, 0L); }
    /// {@return `heapIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int heapIndexAt(long index) { return VkDeviceMemoryReportCallbackDataEXT.get_heapIndex(this.segment(), index); }
    /// {@return `heapIndex`}
    public @CType("uint32_t") int heapIndex() { return VkDeviceMemoryReportCallbackDataEXT.get_heapIndex(this.segment()); }
    /// Sets `heapIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_heapIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_heapIndex.set(segment, 0L, index, value); }
    /// Sets `heapIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_heapIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceMemoryReportCallbackDataEXT.set_heapIndex(segment, 0L, value); }
    /// Sets `heapIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT heapIndexAt(long index, @CType("uint32_t") int value) { VkDeviceMemoryReportCallbackDataEXT.set_heapIndex(this.segment(), index, value); return this; }
    /// Sets `heapIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceMemoryReportCallbackDataEXT heapIndex(@CType("uint32_t") int value) { VkDeviceMemoryReportCallbackDataEXT.set_heapIndex(this.segment(), value); return this; }

}
