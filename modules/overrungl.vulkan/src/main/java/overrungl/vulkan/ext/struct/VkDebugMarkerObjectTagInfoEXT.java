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
/// ### tagName
/// [VarHandle][#VH_tagName] - [Getter][#tagName()] - [Setter][#tagName(long)]
/// ### tagSize
/// [VarHandle][#VH_tagSize] - [Getter][#tagSize()] - [Setter][#tagSize(long)]
/// ### pTag
/// [VarHandle][#VH_pTag] - [Getter][#pTag()] - [Setter][#pTag(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDebugMarkerObjectTagInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDebugReportObjectTypeEXT objectType;
///     uint64_t object;
///     uint64_t tagName;
///     size_t tagSize;
///     const void * pTag;
/// } VkDebugMarkerObjectTagInfoEXT;
/// ```
public final class VkDebugMarkerObjectTagInfoEXT extends Struct {
    /// The struct layout of `VkDebugMarkerObjectTagInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("object"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        ValueLayout.JAVA_LONG.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `object` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_object = LAYOUT.arrayElementVarHandle(PathElement.groupElement("object"));
    /// The [VarHandle] of `tagName` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_tagName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagName"));
    /// The [VarHandle] of `tagSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_tagSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagSize"));
    /// The [VarHandle] of `pTag` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTag"));

    /// Creates `VkDebugMarkerObjectTagInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugMarkerObjectTagInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugMarkerObjectTagInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectTagInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerObjectTagInfoEXT(segment); }

    /// Creates `VkDebugMarkerObjectTagInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectTagInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerObjectTagInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugMarkerObjectTagInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectTagInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerObjectTagInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDebugMarkerObjectTagInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugMarkerObjectTagInfoEXT`
    public static VkDebugMarkerObjectTagInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerObjectTagInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugMarkerObjectTagInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugMarkerObjectTagInfoEXT`
    public static VkDebugMarkerObjectTagInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugMarkerObjectTagInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDebugMarkerObjectTagInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDebugMarkerObjectTagInfoEXT`
    public VkDebugMarkerObjectTagInfoEXT asSlice(long index) { return new VkDebugMarkerObjectTagInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDebugMarkerObjectTagInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDebugMarkerObjectTagInfoEXT`
    public VkDebugMarkerObjectTagInfoEXT asSlice(long index, long count) { return new VkDebugMarkerObjectTagInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDebugMarkerObjectTagInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDebugMarkerObjectTagInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDebugMarkerObjectTagInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDebugMarkerObjectTagInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkDebugMarkerObjectTagInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT sType(@CType("VkStructureType") int value) { VkDebugMarkerObjectTagInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDebugMarkerObjectTagInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDebugMarkerObjectTagInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDebugMarkerObjectTagInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectTagInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectTagInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectTagInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDebugReportObjectTypeEXT") int get_objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    /// @param segment the segment of the struct
    public static @CType("VkDebugReportObjectTypeEXT") int get_objectType(MemorySegment segment) { return VkDebugMarkerObjectTagInfoEXT.get_objectType(segment, 0L); }
    /// {@return `objectType` at the given index}
    /// @param index the index
    public @CType("VkDebugReportObjectTypeEXT") int objectTypeAt(long index) { return VkDebugMarkerObjectTagInfoEXT.get_objectType(this.segment(), index); }
    /// {@return `objectType`}
    public @CType("VkDebugReportObjectTypeEXT") int objectType() { return VkDebugMarkerObjectTagInfoEXT.get_objectType(this.segment()); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, long index, @CType("VkDebugReportObjectTypeEXT") int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, @CType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectTagInfoEXT.set_objectType(segment, 0L, value); }
    /// Sets `objectType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT objectTypeAt(long index, @CType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectTagInfoEXT.set_objectType(this.segment(), index, value); return this; }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT objectType(@CType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectTagInfoEXT.set_objectType(this.segment(), value); return this; }

    /// {@return `object` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_object(MemorySegment segment, long index) { return (long) VH_object.get(segment, 0L, index); }
    /// {@return `object`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_object(MemorySegment segment) { return VkDebugMarkerObjectTagInfoEXT.get_object(segment, 0L); }
    /// {@return `object` at the given index}
    /// @param index the index
    public @CType("uint64_t") long objectAt(long index) { return VkDebugMarkerObjectTagInfoEXT.get_object(this.segment(), index); }
    /// {@return `object`}
    public @CType("uint64_t") long object() { return VkDebugMarkerObjectTagInfoEXT.get_object(this.segment()); }
    /// Sets `object` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_object(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_object.set(segment, 0L, index, value); }
    /// Sets `object` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_object(MemorySegment segment, @CType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_object(segment, 0L, value); }
    /// Sets `object` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT objectAt(long index, @CType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_object(this.segment(), index, value); return this; }
    /// Sets `object` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT object(@CType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_object(this.segment(), value); return this; }

    /// {@return `tagName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_tagName(MemorySegment segment, long index) { return (long) VH_tagName.get(segment, 0L, index); }
    /// {@return `tagName`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_tagName(MemorySegment segment) { return VkDebugMarkerObjectTagInfoEXT.get_tagName(segment, 0L); }
    /// {@return `tagName` at the given index}
    /// @param index the index
    public @CType("uint64_t") long tagNameAt(long index) { return VkDebugMarkerObjectTagInfoEXT.get_tagName(this.segment(), index); }
    /// {@return `tagName`}
    public @CType("uint64_t") long tagName() { return VkDebugMarkerObjectTagInfoEXT.get_tagName(this.segment()); }
    /// Sets `tagName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tagName(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_tagName.set(segment, 0L, index, value); }
    /// Sets `tagName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tagName(MemorySegment segment, @CType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_tagName(segment, 0L, value); }
    /// Sets `tagName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT tagNameAt(long index, @CType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_tagName(this.segment(), index, value); return this; }
    /// Sets `tagName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT tagName(@CType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_tagName(this.segment(), value); return this; }

    /// {@return `tagSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_tagSize(MemorySegment segment, long index) { return (long) VH_tagSize.get(segment, 0L, index); }
    /// {@return `tagSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_tagSize(MemorySegment segment) { return VkDebugMarkerObjectTagInfoEXT.get_tagSize(segment, 0L); }
    /// {@return `tagSize` at the given index}
    /// @param index the index
    public @CType("size_t") long tagSizeAt(long index) { return VkDebugMarkerObjectTagInfoEXT.get_tagSize(this.segment(), index); }
    /// {@return `tagSize`}
    public @CType("size_t") long tagSize() { return VkDebugMarkerObjectTagInfoEXT.get_tagSize(this.segment()); }
    /// Sets `tagSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tagSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_tagSize.set(segment, 0L, index, value); }
    /// Sets `tagSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tagSize(MemorySegment segment, @CType("size_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_tagSize(segment, 0L, value); }
    /// Sets `tagSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT tagSizeAt(long index, @CType("size_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_tagSize(this.segment(), index, value); return this; }
    /// Sets `tagSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT tagSize(@CType("size_t") long value) { VkDebugMarkerObjectTagInfoEXT.set_tagSize(this.segment(), value); return this; }

    /// {@return `pTag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pTag(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTag.get(segment, 0L, index); }
    /// {@return `pTag`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pTag(MemorySegment segment) { return VkDebugMarkerObjectTagInfoEXT.get_pTag(segment, 0L); }
    /// {@return `pTag` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pTagAt(long index) { return VkDebugMarkerObjectTagInfoEXT.get_pTag(this.segment(), index); }
    /// {@return `pTag`}
    public @CType("const void *") java.lang.foreign.MemorySegment pTag() { return VkDebugMarkerObjectTagInfoEXT.get_pTag(this.segment()); }
    /// Sets `pTag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTag(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pTag.set(segment, 0L, index, value); }
    /// Sets `pTag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTag(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectTagInfoEXT.set_pTag(segment, 0L, value); }
    /// Sets `pTag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT pTagAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectTagInfoEXT.set_pTag(this.segment(), index, value); return this; }
    /// Sets `pTag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectTagInfoEXT pTag(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerObjectTagInfoEXT.set_pTag(this.segment(), value); return this; }

}
