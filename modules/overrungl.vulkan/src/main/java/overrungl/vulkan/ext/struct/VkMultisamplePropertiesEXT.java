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
/// ### maxSampleLocationGridSize
/// [Byte offset][#OFFSET_maxSampleLocationGridSize] - [Memory layout][#ML_maxSampleLocationGridSize] - [Getter][#maxSampleLocationGridSize()] - [Setter][#maxSampleLocationGridSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMultisamplePropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D maxSampleLocationGridSize;
/// } VkMultisamplePropertiesEXT;
/// ```
public final class VkMultisamplePropertiesEXT extends Struct {
    /// The struct layout of `VkMultisamplePropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `maxSampleLocationGridSize`.
    public static final long OFFSET_maxSampleLocationGridSize = LAYOUT.byteOffset(PathElement.groupElement("maxSampleLocationGridSize"));
    /// The memory layout of `maxSampleLocationGridSize`.
    public static final MemoryLayout ML_maxSampleLocationGridSize = LAYOUT.select(PathElement.groupElement("maxSampleLocationGridSize"));

    /// Creates `VkMultisamplePropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkMultisamplePropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMultisamplePropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultisamplePropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultisamplePropertiesEXT(segment); }

    /// Creates `VkMultisamplePropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultisamplePropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultisamplePropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMultisamplePropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultisamplePropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMultisamplePropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMultisamplePropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultisamplePropertiesEXT`
    public static VkMultisamplePropertiesEXT alloc(SegmentAllocator allocator) { return new VkMultisamplePropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMultisamplePropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultisamplePropertiesEXT`
    public static VkMultisamplePropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkMultisamplePropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMultisamplePropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMultisamplePropertiesEXT`
    public VkMultisamplePropertiesEXT asSlice(long index) { return new VkMultisamplePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMultisamplePropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMultisamplePropertiesEXT`
    public VkMultisamplePropertiesEXT asSlice(long index, long count) { return new VkMultisamplePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMultisamplePropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMultisamplePropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMultisamplePropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMultisamplePropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultisamplePropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkMultisamplePropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisamplePropertiesEXT sType(@CType("VkStructureType") int value) { VkMultisamplePropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMultisamplePropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMultisamplePropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkMultisamplePropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkMultisamplePropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultisamplePropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkMultisamplePropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisamplePropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkMultisamplePropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `maxSampleLocationGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxSampleLocationGridSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxSampleLocationGridSize, index), ML_maxSampleLocationGridSize); }
    /// {@return `maxSampleLocationGridSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxSampleLocationGridSize(MemorySegment segment) { return VkMultisamplePropertiesEXT.get_maxSampleLocationGridSize(segment, 0L); }
    /// {@return `maxSampleLocationGridSize` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxSampleLocationGridSizeAt(long index) { return VkMultisamplePropertiesEXT.get_maxSampleLocationGridSize(this.segment(), index); }
    /// {@return `maxSampleLocationGridSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxSampleLocationGridSize() { return VkMultisamplePropertiesEXT.get_maxSampleLocationGridSize(this.segment()); }
    /// Sets `maxSampleLocationGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSampleLocationGridSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxSampleLocationGridSize, index), ML_maxSampleLocationGridSize.byteSize()); }
    /// Sets `maxSampleLocationGridSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSampleLocationGridSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkMultisamplePropertiesEXT.set_maxSampleLocationGridSize(segment, 0L, value); }
    /// Sets `maxSampleLocationGridSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultisamplePropertiesEXT maxSampleLocationGridSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkMultisamplePropertiesEXT.set_maxSampleLocationGridSize(this.segment(), index, value); return this; }
    /// Sets `maxSampleLocationGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisamplePropertiesEXT maxSampleLocationGridSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkMultisamplePropertiesEXT.set_maxSampleLocationGridSize(this.segment(), value); return this; }

}
