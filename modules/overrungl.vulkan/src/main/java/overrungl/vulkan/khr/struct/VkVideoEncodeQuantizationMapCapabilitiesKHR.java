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
/// ### maxQuantizationMapExtent
/// [Byte offset][#OFFSET_maxQuantizationMapExtent] - [Memory layout][#ML_maxQuantizationMapExtent] - [Getter][#maxQuantizationMapExtent()] - [Setter][#maxQuantizationMapExtent(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeQuantizationMapCapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D maxQuantizationMapExtent;
/// } VkVideoEncodeQuantizationMapCapabilitiesKHR;
/// ```
public final class VkVideoEncodeQuantizationMapCapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeQuantizationMapCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxQuantizationMapExtent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `maxQuantizationMapExtent`.
    public static final long OFFSET_maxQuantizationMapExtent = LAYOUT.byteOffset(PathElement.groupElement("maxQuantizationMapExtent"));
    /// The memory layout of `maxQuantizationMapExtent`.
    public static final MemoryLayout ML_maxQuantizationMapExtent = LAYOUT.select(PathElement.groupElement("maxQuantizationMapExtent"));

    /// Creates `VkVideoEncodeQuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeQuantizationMapCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeQuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment); }

    /// Creates `VkVideoEncodeQuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeQuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeQuantizationMapCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeQuantizationMapCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeQuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeQuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoEncodeQuantizationMapCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeQuantizationMapCapabilitiesKHR`
    public VkVideoEncodeQuantizationMapCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoEncodeQuantizationMapCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeQuantizationMapCapabilitiesKHR`
    public VkVideoEncodeQuantizationMapCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeQuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapCapabilitiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapCapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapCapabilitiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapCapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `maxQuantizationMapExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxQuantizationMapExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxQuantizationMapExtent, index), ML_maxQuantizationMapExtent); }
    /// {@return `maxQuantizationMapExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxQuantizationMapExtent(MemorySegment segment) { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_maxQuantizationMapExtent(segment, 0L); }
    /// {@return `maxQuantizationMapExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxQuantizationMapExtentAt(long index) { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_maxQuantizationMapExtent(this.segment(), index); }
    /// {@return `maxQuantizationMapExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxQuantizationMapExtent() { return VkVideoEncodeQuantizationMapCapabilitiesKHR.get_maxQuantizationMapExtent(this.segment()); }
    /// Sets `maxQuantizationMapExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQuantizationMapExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxQuantizationMapExtent, index), ML_maxQuantizationMapExtent.byteSize()); }
    /// Sets `maxQuantizationMapExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQuantizationMapExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_maxQuantizationMapExtent(segment, 0L, value); }
    /// Sets `maxQuantizationMapExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapCapabilitiesKHR maxQuantizationMapExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_maxQuantizationMapExtent(this.segment(), index, value); return this; }
    /// Sets `maxQuantizationMapExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapCapabilitiesKHR maxQuantizationMapExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapCapabilitiesKHR.set_maxQuantizationMapExtent(this.segment(), value); return this; }

}
