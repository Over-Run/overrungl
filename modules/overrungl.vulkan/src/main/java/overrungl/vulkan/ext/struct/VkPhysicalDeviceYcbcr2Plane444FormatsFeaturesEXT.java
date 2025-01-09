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
/// ### ycbcr2plane444Formats
/// [VarHandle][#VH_ycbcr2plane444Formats] - [Getter][#ycbcr2plane444Formats()] - [Setter][#ycbcr2plane444Formats(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 ycbcr2plane444Formats;
/// } VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT;
/// ```
public final class VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcr2plane444Formats")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `ycbcr2plane444Formats` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ycbcr2plane444Formats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcr2plane444Formats"));

    /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `ycbcr2plane444Formats` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_ycbcr2plane444Formats(MemorySegment segment, long index) { return (int) VH_ycbcr2plane444Formats.get(segment, 0L, index); }
    /// {@return `ycbcr2plane444Formats`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_ycbcr2plane444Formats(MemorySegment segment) { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_ycbcr2plane444Formats(segment, 0L); }
    /// {@return `ycbcr2plane444Formats` at the given index}
    /// @param index the index
    public @CType("VkBool32") int ycbcr2plane444FormatsAt(long index) { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_ycbcr2plane444Formats(this.segment(), index); }
    /// {@return `ycbcr2plane444Formats`}
    public @CType("VkBool32") int ycbcr2plane444Formats() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.get_ycbcr2plane444Formats(this.segment()); }
    /// Sets `ycbcr2plane444Formats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ycbcr2plane444Formats(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_ycbcr2plane444Formats.set(segment, 0L, index, value); }
    /// Sets `ycbcr2plane444Formats` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ycbcr2plane444Formats(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_ycbcr2plane444Formats(segment, 0L, value); }
    /// Sets `ycbcr2plane444Formats` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444FormatsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_ycbcr2plane444Formats(this.segment(), index, value); return this; }
    /// Sets `ycbcr2plane444Formats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444Formats(@CType("VkBool32") int value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.set_ycbcr2plane444Formats(this.segment(), value); return this; }

}
