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
/// ### sampleLocationsEnable
/// [VarHandle][#VH_sampleLocationsEnable] - [Getter][#sampleLocationsEnable()] - [Setter][#sampleLocationsEnable(int)]
/// ### sampleLocationsInfo
/// [Byte offset][#OFFSET_sampleLocationsInfo] - [Memory layout][#ML_sampleLocationsInfo] - [Getter][#sampleLocationsInfo()] - [Setter][#sampleLocationsInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineSampleLocationsStateCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 sampleLocationsEnable;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// } VkPipelineSampleLocationsStateCreateInfoEXT;
/// ```
public final class VkPipelineSampleLocationsStateCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineSampleLocationsStateCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsEnable"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sampleLocationsEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleLocationsEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsEnable"));
    /// The byte offset of `sampleLocationsInfo`.
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    /// The memory layout of `sampleLocationsInfo`.
    public static final MemoryLayout ML_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));

    /// Creates `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineSampleLocationsStateCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineSampleLocationsStateCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment); }

    /// Creates `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineSampleLocationsStateCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineSampleLocationsStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineSampleLocationsStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineSampleLocationsStateCreateInfoEXT`
    public static VkPipelineSampleLocationsStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineSampleLocationsStateCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineSampleLocationsStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineSampleLocationsStateCreateInfoEXT`
    public static VkPipelineSampleLocationsStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineSampleLocationsStateCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineSampleLocationsStateCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineSampleLocationsStateCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineSampleLocationsStateCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `sampleLocationsEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sampleLocationsEnable(MemorySegment segment, long index) { return (int) VH_sampleLocationsEnable.get(segment, 0L, index); }
    /// {@return `sampleLocationsEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sampleLocationsEnable(MemorySegment segment) { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sampleLocationsEnable(segment, 0L); }
    /// {@return `sampleLocationsEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sampleLocationsEnableAt(long index) { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sampleLocationsEnable(this.segment(), index); }
    /// {@return `sampleLocationsEnable`}
    public @CType("VkBool32") int sampleLocationsEnable() { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sampleLocationsEnable(this.segment()); }
    /// Sets `sampleLocationsEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationsEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sampleLocationsEnable.set(segment, 0L, index, value); }
    /// Sets `sampleLocationsEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationsEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sampleLocationsEnable(segment, 0L, value); }
    /// Sets `sampleLocationsEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnableAt(long index, @CType("VkBool32") int value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sampleLocationsEnable(this.segment(), index, value); return this; }
    /// Sets `sampleLocationsEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnable(@CType("VkBool32") int value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sampleLocationsEnable(this.segment(), value); return this; }

    /// {@return `sampleLocationsInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment get_sampleLocationsInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), ML_sampleLocationsInfo); }
    /// {@return `sampleLocationsInfo`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment get_sampleLocationsInfo(MemorySegment segment) { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sampleLocationsInfo(segment, 0L); }
    /// {@return `sampleLocationsInfo` at the given index}
    /// @param index the index
    public @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment sampleLocationsInfoAt(long index) { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sampleLocationsInfo(this.segment(), index); }
    /// {@return `sampleLocationsInfo`}
    public @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment sampleLocationsInfo() { return VkPipelineSampleLocationsStateCreateInfoEXT.get_sampleLocationsInfo(this.segment()); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationsInfo(MemorySegment segment, long index, @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationsInfo, index), ML_sampleLocationsInfo.byteSize()); }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationsInfo(MemorySegment segment, @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sampleLocationsInfo(segment, 0L, value); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfoAt(long index, @CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sampleLocationsInfo(this.segment(), index, value); return this; }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(@CType("VkSampleLocationsInfoEXT") java.lang.foreign.MemorySegment value) { VkPipelineSampleLocationsStateCreateInfoEXT.set_sampleLocationsInfo(this.segment(), value); return this; }

}
