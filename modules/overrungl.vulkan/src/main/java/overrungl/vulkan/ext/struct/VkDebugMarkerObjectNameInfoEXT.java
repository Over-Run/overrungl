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
/// ### objectType
/// [VarHandle][#VH_objectType] - [Getter][#objectType()] - [Setter][#objectType(int)]
/// ### object
/// [VarHandle][#VH_object] - [Getter][#object()] - [Setter][#object(long)]
/// ### pObjectName
/// [VarHandle][#VH_pObjectName] - [Getter][#pObjectName()] - [Setter][#pObjectName(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDebugMarkerObjectNameInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDebugReportObjectTypeEXT objectType;
///     uint64_t object;
///     const char * pObjectName;
/// } VkDebugMarkerObjectNameInfoEXT;
/// ```
public final class VkDebugMarkerObjectNameInfoEXT extends Struct {
    /// The struct layout of `VkDebugMarkerObjectNameInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("object"),
        ValueLayout.ADDRESS.withName("pObjectName")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `object` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_object = LAYOUT.arrayElementVarHandle(PathElement.groupElement("object"));
    /// The [VarHandle] of `pObjectName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pObjectName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjectName"));

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugMarkerObjectNameInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectNameInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectNameInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectNameInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDebugMarkerObjectNameInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugMarkerObjectNameInfoEXT`
    public static VkDebugMarkerObjectNameInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerObjectNameInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugMarkerObjectNameInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugMarkerObjectNameInfoEXT`
    public static VkDebugMarkerObjectNameInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugMarkerObjectNameInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDebugMarkerObjectNameInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDebugMarkerObjectNameInfoEXT`
    public VkDebugMarkerObjectNameInfoEXT asSlice(long index) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDebugMarkerObjectNameInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDebugMarkerObjectNameInfoEXT`
    public VkDebugMarkerObjectNameInfoEXT asSlice(long index, long count) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDebugMarkerObjectNameInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDebugMarkerObjectNameInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDebugMarkerObjectNameInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDebugMarkerObjectNameInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkDebugMarkerObjectNameInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT sType(@CType("VkStructureType") int value) { VkDebugMarkerObjectNameInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDebugMarkerObjectNameInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDebugMarkerObjectNameInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDebugMarkerObjectNameInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectNameInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectNameInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectNameInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDebugReportObjectTypeEXT") int get_objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    /// @param segment the segment of the struct
    public static @CType("VkDebugReportObjectTypeEXT") int get_objectType(MemorySegment segment) { return VkDebugMarkerObjectNameInfoEXT.get_objectType(segment, 0L); }
    /// {@return `objectType` at the given index}
    /// @param index the index
    public @CType("VkDebugReportObjectTypeEXT") int objectTypeAt(long index) { return VkDebugMarkerObjectNameInfoEXT.get_objectType(this.segment(), index); }
    /// {@return `objectType`}
    public @CType("VkDebugReportObjectTypeEXT") int objectType() { return VkDebugMarkerObjectNameInfoEXT.get_objectType(this.segment()); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, long index, @CType("VkDebugReportObjectTypeEXT") int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, @CType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectNameInfoEXT.set_objectType(segment, 0L, value); }
    /// Sets `objectType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT objectTypeAt(long index, @CType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectNameInfoEXT.set_objectType(this.segment(), index, value); return this; }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT objectType(@CType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectNameInfoEXT.set_objectType(this.segment(), value); return this; }

    /// {@return `object` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_object(MemorySegment segment, long index) { return (long) VH_object.get(segment, 0L, index); }
    /// {@return `object`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_object(MemorySegment segment) { return VkDebugMarkerObjectNameInfoEXT.get_object(segment, 0L); }
    /// {@return `object` at the given index}
    /// @param index the index
    public @CType("uint64_t") long objectAt(long index) { return VkDebugMarkerObjectNameInfoEXT.get_object(this.segment(), index); }
    /// {@return `object`}
    public @CType("uint64_t") long object() { return VkDebugMarkerObjectNameInfoEXT.get_object(this.segment()); }
    /// Sets `object` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_object(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_object.set(segment, 0L, index, value); }
    /// Sets `object` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_object(MemorySegment segment, @CType("uint64_t") long value) { VkDebugMarkerObjectNameInfoEXT.set_object(segment, 0L, value); }
    /// Sets `object` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT objectAt(long index, @CType("uint64_t") long value) { VkDebugMarkerObjectNameInfoEXT.set_object(this.segment(), index, value); return this; }
    /// Sets `object` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT object(@CType("uint64_t") long value) { VkDebugMarkerObjectNameInfoEXT.set_object(this.segment(), value); return this; }

    /// {@return `pObjectName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pObjectName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pObjectName.get(segment, 0L, index); }
    /// {@return `pObjectName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pObjectName(MemorySegment segment) { return VkDebugMarkerObjectNameInfoEXT.get_pObjectName(segment, 0L); }
    /// {@return `pObjectName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pObjectNameAt(long index) { return VkDebugMarkerObjectNameInfoEXT.get_pObjectName(this.segment(), index); }
    /// {@return `pObjectName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pObjectName() { return VkDebugMarkerObjectNameInfoEXT.get_pObjectName(this.segment()); }
    /// Sets `pObjectName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pObjectName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pObjectName.set(segment, 0L, index, value); }
    /// Sets `pObjectName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pObjectName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectNameInfoEXT.set_pObjectName(segment, 0L, value); }
    /// Sets `pObjectName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT pObjectNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectNameInfoEXT.set_pObjectName(this.segment(), index, value); return this; }
    /// Sets `pObjectName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT pObjectName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectNameInfoEXT.set_pObjectName(this.segment(), value); return this; }

}
