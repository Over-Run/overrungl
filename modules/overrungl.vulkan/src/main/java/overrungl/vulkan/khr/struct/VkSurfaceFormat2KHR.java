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
/// ### surfaceFormat
/// [Byte offset][#OFFSET_surfaceFormat] - [Memory layout][#ML_surfaceFormat] - [Getter][#surfaceFormat()] - [Setter][#surfaceFormat(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSurfaceFormat2KHR {
///     VkStructureType sType;
///     void * pNext;
///     VkSurfaceFormatKHR surfaceFormat;
/// } VkSurfaceFormat2KHR;
/// ```
public final class VkSurfaceFormat2KHR extends Struct {
    /// The struct layout of `VkSurfaceFormat2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkSurfaceFormatKHR.LAYOUT.withName("surfaceFormat")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `surfaceFormat`.
    public static final long OFFSET_surfaceFormat = LAYOUT.byteOffset(PathElement.groupElement("surfaceFormat"));
    /// The memory layout of `surfaceFormat`.
    public static final MemoryLayout ML_surfaceFormat = LAYOUT.select(PathElement.groupElement("surfaceFormat"));

    /// Creates `VkSurfaceFormat2KHR` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceFormat2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceFormat2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormat2KHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFormat2KHR(segment); }

    /// Creates `VkSurfaceFormat2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormat2KHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFormat2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfaceFormat2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormat2KHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFormat2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSurfaceFormat2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceFormat2KHR`
    public static VkSurfaceFormat2KHR alloc(SegmentAllocator allocator) { return new VkSurfaceFormat2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceFormat2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceFormat2KHR`
    public static VkSurfaceFormat2KHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceFormat2KHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSurfaceFormat2KHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSurfaceFormat2KHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSurfaceFormat2KHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSurfaceFormat2KHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormat2KHR sTypeAt(long index, @CType("VkStructureType") int value) { VkSurfaceFormat2KHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormat2KHR sType(@CType("VkStructureType") int value) { VkSurfaceFormat2KHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSurfaceFormat2KHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSurfaceFormat2KHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSurfaceFormat2KHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceFormat2KHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormat2KHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceFormat2KHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormat2KHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceFormat2KHR.set_pNext(this.segment(), value); return this; }

    /// {@return `surfaceFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceFormatKHR") java.lang.foreign.MemorySegment get_surfaceFormat(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_surfaceFormat, index), ML_surfaceFormat); }
    /// {@return `surfaceFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceFormatKHR") java.lang.foreign.MemorySegment get_surfaceFormat(MemorySegment segment) { return VkSurfaceFormat2KHR.get_surfaceFormat(segment, 0L); }
    /// {@return `surfaceFormat` at the given index}
    /// @param index the index
    public @CType("VkSurfaceFormatKHR") java.lang.foreign.MemorySegment surfaceFormatAt(long index) { return VkSurfaceFormat2KHR.get_surfaceFormat(this.segment(), index); }
    /// {@return `surfaceFormat`}
    public @CType("VkSurfaceFormatKHR") java.lang.foreign.MemorySegment surfaceFormat() { return VkSurfaceFormat2KHR.get_surfaceFormat(this.segment()); }
    /// Sets `surfaceFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_surfaceFormat(MemorySegment segment, long index, @CType("VkSurfaceFormatKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_surfaceFormat, index), ML_surfaceFormat.byteSize()); }
    /// Sets `surfaceFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_surfaceFormat(MemorySegment segment, @CType("VkSurfaceFormatKHR") java.lang.foreign.MemorySegment value) { VkSurfaceFormat2KHR.set_surfaceFormat(segment, 0L, value); }
    /// Sets `surfaceFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormat2KHR surfaceFormatAt(long index, @CType("VkSurfaceFormatKHR") java.lang.foreign.MemorySegment value) { VkSurfaceFormat2KHR.set_surfaceFormat(this.segment(), index, value); return this; }
    /// Sets `surfaceFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormat2KHR surfaceFormat(@CType("VkSurfaceFormatKHR") java.lang.foreign.MemorySegment value) { VkSurfaceFormat2KHR.set_surfaceFormat(this.segment(), value); return this; }

}
