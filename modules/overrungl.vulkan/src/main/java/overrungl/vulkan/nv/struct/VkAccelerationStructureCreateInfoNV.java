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
package overrungl.vulkan.nv.struct;

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
/// ### compactedSize
/// [VarHandle][#VH_compactedSize] - [Getter][#compactedSize()] - [Setter][#compactedSize(long)]
/// ### info
/// [Byte offset][#OFFSET_info] - [Memory layout][#ML_info] - [Getter][#info()] - [Setter][#info(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize compactedSize;
///     VkAccelerationStructureInfoNV info;
/// } VkAccelerationStructureCreateInfoNV;
/// ```
public final class VkAccelerationStructureCreateInfoNV extends Struct {
    /// The struct layout of `VkAccelerationStructureCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("compactedSize"),
        overrungl.vulkan.nv.struct.VkAccelerationStructureInfoNV.LAYOUT.withName("info")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `compactedSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_compactedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compactedSize"));
    /// The byte offset of `info`.
    public static final long OFFSET_info = LAYOUT.byteOffset(PathElement.groupElement("info"));
    /// The memory layout of `info`.
    public static final MemoryLayout ML_info = LAYOUT.select(PathElement.groupElement("info"));

    /// Creates `VkAccelerationStructureCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment); }

    /// Creates `VkAccelerationStructureCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureCreateInfoNV`
    public static VkAccelerationStructureCreateInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureCreateInfoNV`
    public static VkAccelerationStructureCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV sType(@CType("VkStructureType") int value) { VkAccelerationStructureCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `compactedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_compactedSize(MemorySegment segment, long index) { return (long) VH_compactedSize.get(segment, 0L, index); }
    /// {@return `compactedSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_compactedSize(MemorySegment segment) { return VkAccelerationStructureCreateInfoNV.get_compactedSize(segment, 0L); }
    /// {@return `compactedSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long compactedSizeAt(long index) { return VkAccelerationStructureCreateInfoNV.get_compactedSize(this.segment(), index); }
    /// {@return `compactedSize`}
    public @CType("VkDeviceSize") long compactedSize() { return VkAccelerationStructureCreateInfoNV.get_compactedSize(this.segment()); }
    /// Sets `compactedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compactedSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_compactedSize.set(segment, 0L, index, value); }
    /// Sets `compactedSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compactedSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoNV.set_compactedSize(segment, 0L, value); }
    /// Sets `compactedSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV compactedSizeAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoNV.set_compactedSize(this.segment(), index, value); return this; }
    /// Sets `compactedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV compactedSize(@CType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoNV.set_compactedSize(this.segment(), value); return this; }

    /// {@return `info` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureInfoNV") java.lang.foreign.MemorySegment get_info(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_info, index), ML_info); }
    /// {@return `info`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureInfoNV") java.lang.foreign.MemorySegment get_info(MemorySegment segment) { return VkAccelerationStructureCreateInfoNV.get_info(segment, 0L); }
    /// {@return `info` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureInfoNV") java.lang.foreign.MemorySegment infoAt(long index) { return VkAccelerationStructureCreateInfoNV.get_info(this.segment(), index); }
    /// {@return `info`}
    public @CType("VkAccelerationStructureInfoNV") java.lang.foreign.MemorySegment info() { return VkAccelerationStructureCreateInfoNV.get_info(this.segment()); }
    /// Sets `info` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_info(MemorySegment segment, long index, @CType("VkAccelerationStructureInfoNV") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_info, index), ML_info.byteSize()); }
    /// Sets `info` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_info(MemorySegment segment, @CType("VkAccelerationStructureInfoNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoNV.set_info(segment, 0L, value); }
    /// Sets `info` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV infoAt(long index, @CType("VkAccelerationStructureInfoNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoNV.set_info(this.segment(), index, value); return this; }
    /// Sets `info` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV info(@CType("VkAccelerationStructureInfoNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureCreateInfoNV.set_info(this.segment(), value); return this; }

}
