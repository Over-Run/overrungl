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
/// ### src
/// [VarHandle][#VH_src] - [Getter][#src()] - [Setter][#src(java.lang.foreign.MemorySegment)]
/// ### dst
/// [Byte offset][#OFFSET_dst] - [Memory layout][#ML_dst] - [Getter][#dst()] - [Setter][#dst(java.lang.foreign.MemorySegment)]
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyAccelerationStructureToMemoryInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccelerationStructureKHR src;
///     VkDeviceOrHostAddressKHR dst;
///     VkCopyAccelerationStructureModeKHR mode;
/// } VkCopyAccelerationStructureToMemoryInfoKHR;
/// ```
public final class VkCopyAccelerationStructureToMemoryInfoKHR extends Struct {
    /// The struct layout of `VkCopyAccelerationStructureToMemoryInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("src"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `src` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_src = LAYOUT.arrayElementVarHandle(PathElement.groupElement("src"));
    /// The byte offset of `dst`.
    public static final long OFFSET_dst = LAYOUT.byteOffset(PathElement.groupElement("dst"));
    /// The memory layout of `dst`.
    public static final MemoryLayout ML_dst = LAYOUT.select(PathElement.groupElement("dst"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkCopyAccelerationStructureToMemoryInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkCopyAccelerationStructureToMemoryInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyAccelerationStructureToMemoryInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyAccelerationStructureToMemoryInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyAccelerationStructureToMemoryInfoKHR(segment); }

    /// Creates `VkCopyAccelerationStructureToMemoryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyAccelerationStructureToMemoryInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyAccelerationStructureToMemoryInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyAccelerationStructureToMemoryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyAccelerationStructureToMemoryInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyAccelerationStructureToMemoryInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCopyAccelerationStructureToMemoryInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyAccelerationStructureToMemoryInfoKHR`
    public static VkCopyAccelerationStructureToMemoryInfoKHR alloc(SegmentAllocator allocator) { return new VkCopyAccelerationStructureToMemoryInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyAccelerationStructureToMemoryInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyAccelerationStructureToMemoryInfoKHR`
    public static VkCopyAccelerationStructureToMemoryInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkCopyAccelerationStructureToMemoryInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyAccelerationStructureToMemoryInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR sType(@CType("VkStructureType") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCopyAccelerationStructureToMemoryInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `src` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment get_src(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_src.get(segment, 0L, index); }
    /// {@return `src`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment get_src(MemorySegment segment) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_src(segment, 0L); }
    /// {@return `src` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment srcAt(long index) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_src(this.segment(), index); }
    /// {@return `src`}
    public @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment src() { return VkCopyAccelerationStructureToMemoryInfoKHR.get_src(this.segment()); }
    /// Sets `src` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_src(MemorySegment segment, long index, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VH_src.set(segment, 0L, index, value); }
    /// Sets `src` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_src(MemorySegment segment, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_src(segment, 0L, value); }
    /// Sets `src` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR srcAt(long index, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_src(this.segment(), index, value); return this; }
    /// Sets `src` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR src(@CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_src(this.segment(), value); return this; }

    /// {@return `dst` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment get_dst(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dst, index), ML_dst); }
    /// {@return `dst`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment get_dst(MemorySegment segment) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_dst(segment, 0L); }
    /// {@return `dst` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment dstAt(long index) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_dst(this.segment(), index); }
    /// {@return `dst`}
    public @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment dst() { return VkCopyAccelerationStructureToMemoryInfoKHR.get_dst(this.segment()); }
    /// Sets `dst` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dst(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dst, index), ML_dst.byteSize()); }
    /// Sets `dst` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dst(MemorySegment segment, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_dst(segment, 0L, value); }
    /// Sets `dst` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR dstAt(long index, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_dst(this.segment(), index, value); return this; }
    /// Sets `dst` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR dst(@CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_dst(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCopyAccelerationStructureModeKHR") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkCopyAccelerationStructureModeKHR") int get_mode(MemorySegment segment) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_mode(segment, 0L); }
    /// {@return `mode` at the given index}
    /// @param index the index
    public @CType("VkCopyAccelerationStructureModeKHR") int modeAt(long index) { return VkCopyAccelerationStructureToMemoryInfoKHR.get_mode(this.segment(), index); }
    /// {@return `mode`}
    public @CType("VkCopyAccelerationStructureModeKHR") int mode() { return VkCopyAccelerationStructureToMemoryInfoKHR.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkCopyAccelerationStructureModeKHR") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR modeAt(long index, @CType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_mode(this.segment(), index, value); return this; }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyAccelerationStructureToMemoryInfoKHR mode(@CType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.set_mode(this.segment(), value); return this; }

}
