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
/// ### pMarkerName
/// [VarHandle][#VH_pMarkerName] - [Getter][#pMarkerName()] - [Setter][#pMarkerName(java.lang.foreign.MemorySegment)]
/// ### color
/// [Byte offset handle][#MH_color] - [Memory layout][#ML_color] - [Getter][#color(long)] - [Setter][#color(long, java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDebugMarkerMarkerInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     const char * pMarkerName;
///     float[4] color;
/// } VkDebugMarkerMarkerInfoEXT;
/// ```
public final class VkDebugMarkerMarkerInfoEXT extends Struct {
    /// The struct layout of `VkDebugMarkerMarkerInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pMarkerName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pMarkerName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMarkerName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMarkerName"));
    /// The byte offset handle of `color` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_color = LAYOUT.byteOffsetHandle(PathElement.groupElement("color"), PathElement.sequenceElement());
    /// The memory layout of `color`.
    public static final MemoryLayout ML_color = LAYOUT.select(PathElement.groupElement("color"));

    /// Creates `VkDebugMarkerMarkerInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugMarkerMarkerInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugMarkerMarkerInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerMarkerInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerMarkerInfoEXT(segment); }

    /// Creates `VkDebugMarkerMarkerInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerMarkerInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerMarkerInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugMarkerMarkerInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerMarkerInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugMarkerMarkerInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDebugMarkerMarkerInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugMarkerMarkerInfoEXT`
    public static VkDebugMarkerMarkerInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerMarkerInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugMarkerMarkerInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugMarkerMarkerInfoEXT`
    public static VkDebugMarkerMarkerInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugMarkerMarkerInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDebugMarkerMarkerInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDebugMarkerMarkerInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDebugMarkerMarkerInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDebugMarkerMarkerInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkDebugMarkerMarkerInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT sType(@CType("VkStructureType") int value) { VkDebugMarkerMarkerInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDebugMarkerMarkerInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDebugMarkerMarkerInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDebugMarkerMarkerInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `pMarkerName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pMarkerName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMarkerName.get(segment, 0L, index); }
    /// {@return `pMarkerName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pMarkerName(MemorySegment segment) { return VkDebugMarkerMarkerInfoEXT.get_pMarkerName(segment, 0L); }
    /// {@return `pMarkerName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pMarkerNameAt(long index) { return VkDebugMarkerMarkerInfoEXT.get_pMarkerName(this.segment(), index); }
    /// {@return `pMarkerName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pMarkerName() { return VkDebugMarkerMarkerInfoEXT.get_pMarkerName(this.segment()); }
    /// Sets `pMarkerName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMarkerName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pMarkerName.set(segment, 0L, index, value); }
    /// Sets `pMarkerName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMarkerName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_pMarkerName(segment, 0L, value); }
    /// Sets `pMarkerName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT pMarkerNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_pMarkerName(this.segment(), index, value); return this; }
    /// Sets `pMarkerName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT pMarkerName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_pMarkerName(this.segment(), value); return this; }

    /// {@return `color` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("float[4]") java.lang.foreign.MemorySegment get_color(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_color.invokeExact(0L, elementIndex), index), ML_color); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `color`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("float[4]") java.lang.foreign.MemorySegment get_color(MemorySegment segment, long elementIndex) { return VkDebugMarkerMarkerInfoEXT.get_color(segment, 0L, elementIndex); }
    /// {@return `color` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("float[4]") java.lang.foreign.MemorySegment colorAt(long index, long elementIndex) { return VkDebugMarkerMarkerInfoEXT.get_color(this.segment(), index, elementIndex); }
    /// {@return `color`}
    /// @param elementIndex the index of the element
    public @CType("float[4]") java.lang.foreign.MemorySegment color(long elementIndex) { return VkDebugMarkerMarkerInfoEXT.get_color(this.segment(), elementIndex); }
    /// Sets `color` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_color(MemorySegment segment, long index, long elementIndex, @CType("float[4]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_color.invokeExact(0L, elementIndex), index), ML_color.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `color` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_color(MemorySegment segment, long elementIndex, @CType("float[4]") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_color(segment, 0L, elementIndex, value); }
    /// Sets `color` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT colorAt(long index, long elementIndex, @CType("float[4]") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_color(this.segment(), index, elementIndex, value); return this; }
    /// Sets `color` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkDebugMarkerMarkerInfoEXT color(long elementIndex, @CType("float[4]") java.lang.foreign.MemorySegment value) { VkDebugMarkerMarkerInfoEXT.set_color(this.segment(), elementIndex, value); return this; }

}
