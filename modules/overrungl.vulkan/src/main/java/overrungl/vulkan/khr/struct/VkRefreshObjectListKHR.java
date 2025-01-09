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
package overrungl.vulkan.khr.struct;

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
/// ### objectCount
/// [VarHandle][#VH_objectCount] - [Getter][#objectCount()] - [Setter][#objectCount(int)]
/// ### pObjects
/// [VarHandle][#VH_pObjects] - [Getter][#pObjects()] - [Setter][#pObjects(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRefreshObjectListKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t objectCount;
///     const VkRefreshObjectKHR * pObjects;
/// } VkRefreshObjectListKHR;
/// ```
public final class VkRefreshObjectListKHR extends Struct {
    /// The struct layout of `VkRefreshObjectListKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectCount"),
        ValueLayout.ADDRESS.withName("pObjects")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `objectCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_objectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectCount"));
    /// The [VarHandle] of `pObjects` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjects"));

    /// Creates `VkRefreshObjectListKHR` with the given segment.
    /// @param segment the memory segment
    public VkRefreshObjectListKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRefreshObjectListKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshObjectListKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshObjectListKHR(segment); }

    /// Creates `VkRefreshObjectListKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshObjectListKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshObjectListKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRefreshObjectListKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRefreshObjectListKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRefreshObjectListKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRefreshObjectListKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRefreshObjectListKHR`
    public static VkRefreshObjectListKHR alloc(SegmentAllocator allocator) { return new VkRefreshObjectListKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRefreshObjectListKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRefreshObjectListKHR`
    public static VkRefreshObjectListKHR alloc(SegmentAllocator allocator, long count) { return new VkRefreshObjectListKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRefreshObjectListKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRefreshObjectListKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRefreshObjectListKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRefreshObjectListKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkRefreshObjectListKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR sType(@CType("VkStructureType") int value) { VkRefreshObjectListKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRefreshObjectListKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRefreshObjectListKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRefreshObjectListKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRefreshObjectListKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRefreshObjectListKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRefreshObjectListKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `objectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_objectCount(MemorySegment segment, long index) { return (int) VH_objectCount.get(segment, 0L, index); }
    /// {@return `objectCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_objectCount(MemorySegment segment) { return VkRefreshObjectListKHR.get_objectCount(segment, 0L); }
    /// {@return `objectCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int objectCountAt(long index) { return VkRefreshObjectListKHR.get_objectCount(this.segment(), index); }
    /// {@return `objectCount`}
    public @CType("uint32_t") int objectCount() { return VkRefreshObjectListKHR.get_objectCount(this.segment()); }
    /// Sets `objectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_objectCount.set(segment, 0L, index, value); }
    /// Sets `objectCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectCount(MemorySegment segment, @CType("uint32_t") int value) { VkRefreshObjectListKHR.set_objectCount(segment, 0L, value); }
    /// Sets `objectCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR objectCountAt(long index, @CType("uint32_t") int value) { VkRefreshObjectListKHR.set_objectCount(this.segment(), index, value); return this; }
    /// Sets `objectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR objectCount(@CType("uint32_t") int value) { VkRefreshObjectListKHR.set_objectCount(this.segment(), value); return this; }

    /// {@return `pObjects` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRefreshObjectKHR *") java.lang.foreign.MemorySegment get_pObjects(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pObjects.get(segment, 0L, index); }
    /// {@return `pObjects`}
    /// @param segment the segment of the struct
    public static @CType("const VkRefreshObjectKHR *") java.lang.foreign.MemorySegment get_pObjects(MemorySegment segment) { return VkRefreshObjectListKHR.get_pObjects(segment, 0L); }
    /// {@return `pObjects` at the given index}
    /// @param index the index
    public @CType("const VkRefreshObjectKHR *") java.lang.foreign.MemorySegment pObjectsAt(long index) { return VkRefreshObjectListKHR.get_pObjects(this.segment(), index); }
    /// {@return `pObjects`}
    public @CType("const VkRefreshObjectKHR *") java.lang.foreign.MemorySegment pObjects() { return VkRefreshObjectListKHR.get_pObjects(this.segment()); }
    /// Sets `pObjects` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pObjects(MemorySegment segment, long index, @CType("const VkRefreshObjectKHR *") java.lang.foreign.MemorySegment value) { VH_pObjects.set(segment, 0L, index, value); }
    /// Sets `pObjects` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pObjects(MemorySegment segment, @CType("const VkRefreshObjectKHR *") java.lang.foreign.MemorySegment value) { VkRefreshObjectListKHR.set_pObjects(segment, 0L, value); }
    /// Sets `pObjects` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR pObjectsAt(long index, @CType("const VkRefreshObjectKHR *") java.lang.foreign.MemorySegment value) { VkRefreshObjectListKHR.set_pObjects(this.segment(), index, value); return this; }
    /// Sets `pObjects` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRefreshObjectListKHR pObjects(@CType("const VkRefreshObjectKHR *") java.lang.foreign.MemorySegment value) { VkRefreshObjectListKHR.set_pObjects(this.segment(), value); return this; }

}
