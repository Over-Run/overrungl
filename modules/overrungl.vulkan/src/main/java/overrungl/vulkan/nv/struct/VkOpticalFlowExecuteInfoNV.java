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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### regionCount
/// [VarHandle][#VH_regionCount] - [Getter][#regionCount()] - [Setter][#regionCount(int)]
/// ### pRegions
/// [VarHandle][#VH_pRegions] - [Getter][#pRegions()] - [Setter][#pRegions(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkOpticalFlowExecuteInfoNV {
///     VkStructureType sType;
///     void * pNext;
///     VkOpticalFlowExecuteFlagsNV flags;
///     uint32_t regionCount;
///     const VkRect2D * pRegions;
/// } VkOpticalFlowExecuteInfoNV;
/// ```
public final class VkOpticalFlowExecuteInfoNV extends Struct {
    /// The struct layout of `VkOpticalFlowExecuteInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkOpticalFlowExecuteInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowExecuteInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowExecuteInfoNV(segment); }

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowExecuteInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowExecuteInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkOpticalFlowExecuteInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowExecuteInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowExecuteInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkOpticalFlowExecuteInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowExecuteInfoNV`
    public static VkOpticalFlowExecuteInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowExecuteInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkOpticalFlowExecuteInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOpticalFlowExecuteInfoNV`
    public static VkOpticalFlowExecuteInfoNV alloc(SegmentAllocator allocator, long count) { return new VkOpticalFlowExecuteInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkOpticalFlowExecuteInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkOpticalFlowExecuteInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkOpticalFlowExecuteInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkOpticalFlowExecuteInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV sType(@CType("VkStructureType") int value) { VkOpticalFlowExecuteInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkOpticalFlowExecuteInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkOpticalFlowExecuteInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOpticalFlowExecuteFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkOpticalFlowExecuteFlagsNV") int get_flags(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkOpticalFlowExecuteFlagsNV") int flagsAt(long index) { return VkOpticalFlowExecuteInfoNV.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkOpticalFlowExecuteFlagsNV") int flags() { return VkOpticalFlowExecuteInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkOpticalFlowExecuteFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkOpticalFlowExecuteFlagsNV") int value) { VkOpticalFlowExecuteInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV flagsAt(long index, @CType("VkOpticalFlowExecuteFlagsNV") int value) { VkOpticalFlowExecuteInfoNV.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV flags(@CType("VkOpticalFlowExecuteFlagsNV") int value) { VkOpticalFlowExecuteInfoNV.set_flags(this.segment(), value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_regionCount(segment, 0L); }
    /// {@return `regionCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int regionCountAt(long index) { return VkOpticalFlowExecuteInfoNV.get_regionCount(this.segment(), index); }
    /// {@return `regionCount`}
    public @CType("uint32_t") int regionCount() { return VkOpticalFlowExecuteInfoNV.get_regionCount(this.segment()); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, @CType("uint32_t") int value) { VkOpticalFlowExecuteInfoNV.set_regionCount(segment, 0L, value); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV regionCountAt(long index, @CType("uint32_t") int value) { VkOpticalFlowExecuteInfoNV.set_regionCount(this.segment(), index, value); return this; }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV regionCount(@CType("uint32_t") int value) { VkOpticalFlowExecuteInfoNV.set_regionCount(this.segment(), value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") java.lang.foreign.MemorySegment get_pRegions(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") java.lang.foreign.MemorySegment get_pRegions(MemorySegment segment) { return VkOpticalFlowExecuteInfoNV.get_pRegions(segment, 0L); }
    /// {@return `pRegions` at the given index}
    /// @param index the index
    public @CType("const VkRect2D *") java.lang.foreign.MemorySegment pRegionsAt(long index) { return VkOpticalFlowExecuteInfoNV.get_pRegions(this.segment(), index); }
    /// {@return `pRegions`}
    public @CType("const VkRect2D *") java.lang.foreign.MemorySegment pRegions() { return VkOpticalFlowExecuteInfoNV.get_pRegions(this.segment()); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, long index, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pRegions(segment, 0L, value); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV pRegionsAt(long index, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pRegions(this.segment(), index, value); return this; }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowExecuteInfoNV pRegions(@CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkOpticalFlowExecuteInfoNV.set_pRegions(this.segment(), value); return this; }

}
