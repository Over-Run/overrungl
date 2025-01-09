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
/// ### pVersionData
/// [VarHandle][#VH_pVersionData] - [Getter][#pVersionData()] - [Setter][#pVersionData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMicromapVersionInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     const uint8_t * pVersionData;
/// } VkMicromapVersionInfoEXT;
/// ```
public final class VkMicromapVersionInfoEXT extends Struct {
    /// The struct layout of `VkMicromapVersionInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pVersionData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pVersionData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVersionData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVersionData"));

    /// Creates `VkMicromapVersionInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMicromapVersionInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMicromapVersionInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapVersionInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapVersionInfoEXT(segment); }

    /// Creates `VkMicromapVersionInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapVersionInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapVersionInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMicromapVersionInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapVersionInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapVersionInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMicromapVersionInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapVersionInfoEXT`
    public static VkMicromapVersionInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapVersionInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMicromapVersionInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapVersionInfoEXT`
    public static VkMicromapVersionInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapVersionInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMicromapVersionInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMicromapVersionInfoEXT`
    public VkMicromapVersionInfoEXT asSlice(long index) { return new VkMicromapVersionInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMicromapVersionInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMicromapVersionInfoEXT`
    public VkMicromapVersionInfoEXT asSlice(long index, long count) { return new VkMicromapVersionInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMicromapVersionInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMicromapVersionInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMicromapVersionInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMicromapVersionInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapVersionInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkMicromapVersionInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapVersionInfoEXT sType(@CType("VkStructureType") int value) { VkMicromapVersionInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMicromapVersionInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMicromapVersionInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMicromapVersionInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapVersionInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapVersionInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapVersionInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapVersionInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapVersionInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `pVersionData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint8_t *") java.lang.foreign.MemorySegment get_pVersionData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVersionData.get(segment, 0L, index); }
    /// {@return `pVersionData`}
    /// @param segment the segment of the struct
    public static @CType("const uint8_t *") java.lang.foreign.MemorySegment get_pVersionData(MemorySegment segment) { return VkMicromapVersionInfoEXT.get_pVersionData(segment, 0L); }
    /// {@return `pVersionData` at the given index}
    /// @param index the index
    public @CType("const uint8_t *") java.lang.foreign.MemorySegment pVersionDataAt(long index) { return VkMicromapVersionInfoEXT.get_pVersionData(this.segment(), index); }
    /// {@return `pVersionData`}
    public @CType("const uint8_t *") java.lang.foreign.MemorySegment pVersionData() { return VkMicromapVersionInfoEXT.get_pVersionData(this.segment()); }
    /// Sets `pVersionData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVersionData(MemorySegment segment, long index, @CType("const uint8_t *") java.lang.foreign.MemorySegment value) { VH_pVersionData.set(segment, 0L, index, value); }
    /// Sets `pVersionData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVersionData(MemorySegment segment, @CType("const uint8_t *") java.lang.foreign.MemorySegment value) { VkMicromapVersionInfoEXT.set_pVersionData(segment, 0L, value); }
    /// Sets `pVersionData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapVersionInfoEXT pVersionDataAt(long index, @CType("const uint8_t *") java.lang.foreign.MemorySegment value) { VkMicromapVersionInfoEXT.set_pVersionData(this.segment(), index, value); return this; }
    /// Sets `pVersionData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapVersionInfoEXT pVersionData(@CType("const uint8_t *") java.lang.foreign.MemorySegment value) { VkMicromapVersionInfoEXT.set_pVersionData(this.segment(), value); return this; }

}
