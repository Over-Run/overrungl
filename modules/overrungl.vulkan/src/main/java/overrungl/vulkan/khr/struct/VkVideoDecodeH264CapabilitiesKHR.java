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
/// ### maxLevelIdc
/// [VarHandle][#VH_maxLevelIdc] - [Getter][#maxLevelIdc()] - [Setter][#maxLevelIdc(int)]
/// ### fieldOffsetGranularity
/// [Byte offset][#OFFSET_fieldOffsetGranularity] - [Memory layout][#ML_fieldOffsetGranularity] - [Getter][#fieldOffsetGranularity()] - [Setter][#fieldOffsetGranularity(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeH264CapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     StdVideoH264LevelIdc maxLevelIdc;
///     VkOffset2D fieldOffsetGranularity;
/// } VkVideoDecodeH264CapabilitiesKHR;
/// ```
public final class VkVideoDecodeH264CapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoDecodeH264CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("fieldOffsetGranularity")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    /// The byte offset of `fieldOffsetGranularity`.
    public static final long OFFSET_fieldOffsetGranularity = LAYOUT.byteOffset(PathElement.groupElement("fieldOffsetGranularity"));
    /// The memory layout of `fieldOffsetGranularity`.
    public static final MemoryLayout ML_fieldOffsetGranularity = LAYOUT.select(PathElement.groupElement("fieldOffsetGranularity"));

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH264CapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264CapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264CapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264CapabilitiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoDecodeH264CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264CapabilitiesKHR`
    public static VkVideoDecodeH264CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264CapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH264CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH264CapabilitiesKHR`
    public static VkVideoDecodeH264CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH264CapabilitiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeH264CapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeH264CapabilitiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeH264CapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeH264CapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeH264CapabilitiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeH264CapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeH264CapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeH264CapabilitiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeH264CapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264LevelIdc") int get_maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264LevelIdc") int get_maxLevelIdc(MemorySegment segment) { return VkVideoDecodeH264CapabilitiesKHR.get_maxLevelIdc(segment, 0L); }
    /// {@return `maxLevelIdc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264LevelIdc") int maxLevelIdcAt(long index) { return VkVideoDecodeH264CapabilitiesKHR.get_maxLevelIdc(this.segment(), index); }
    /// {@return `maxLevelIdc`}
    public @CType("StdVideoH264LevelIdc") int maxLevelIdc() { return VkVideoDecodeH264CapabilitiesKHR.get_maxLevelIdc(this.segment()); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, long index, @CType("StdVideoH264LevelIdc") int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, @CType("StdVideoH264LevelIdc") int value) { VkVideoDecodeH264CapabilitiesKHR.set_maxLevelIdc(segment, 0L, value); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR maxLevelIdcAt(long index, @CType("StdVideoH264LevelIdc") int value) { VkVideoDecodeH264CapabilitiesKHR.set_maxLevelIdc(this.segment(), index, value); return this; }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR maxLevelIdc(@CType("StdVideoH264LevelIdc") int value) { VkVideoDecodeH264CapabilitiesKHR.set_maxLevelIdc(this.segment(), value); return this; }

    /// {@return `fieldOffsetGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_fieldOffsetGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fieldOffsetGranularity, index), ML_fieldOffsetGranularity); }
    /// {@return `fieldOffsetGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_fieldOffsetGranularity(MemorySegment segment) { return VkVideoDecodeH264CapabilitiesKHR.get_fieldOffsetGranularity(segment, 0L); }
    /// {@return `fieldOffsetGranularity` at the given index}
    /// @param index the index
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment fieldOffsetGranularityAt(long index) { return VkVideoDecodeH264CapabilitiesKHR.get_fieldOffsetGranularity(this.segment(), index); }
    /// {@return `fieldOffsetGranularity`}
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment fieldOffsetGranularity() { return VkVideoDecodeH264CapabilitiesKHR.get_fieldOffsetGranularity(this.segment()); }
    /// Sets `fieldOffsetGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fieldOffsetGranularity(MemorySegment segment, long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fieldOffsetGranularity, index), ML_fieldOffsetGranularity.byteSize()); }
    /// Sets `fieldOffsetGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fieldOffsetGranularity(MemorySegment segment, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_fieldOffsetGranularity(segment, 0L, value); }
    /// Sets `fieldOffsetGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularityAt(long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_fieldOffsetGranularity(this.segment(), index, value); return this; }
    /// Sets `fieldOffsetGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity(@CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_fieldOffsetGranularity(this.segment(), value); return this; }

}
