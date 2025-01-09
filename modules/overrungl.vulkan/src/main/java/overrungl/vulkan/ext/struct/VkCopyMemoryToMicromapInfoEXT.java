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
/// ### src
/// [Byte offset][#OFFSET_src] - [Memory layout][#ML_src] - [Getter][#src()] - [Setter][#src(java.lang.foreign.MemorySegment)]
/// ### dst
/// [VarHandle][#VH_dst] - [Getter][#dst()] - [Setter][#dst(java.lang.foreign.MemorySegment)]
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyMemoryToMicromapInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceOrHostAddressConstKHR src;
///     VkMicromapEXT dst;
///     VkCopyMicromapModeEXT mode;
/// } VkCopyMemoryToMicromapInfoEXT;
/// ```
public final class VkCopyMemoryToMicromapInfoEXT extends Struct {
    /// The struct layout of `VkCopyMemoryToMicromapInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("src"),
        ValueLayout.ADDRESS.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `src`.
    public static final long OFFSET_src = LAYOUT.byteOffset(PathElement.groupElement("src"));
    /// The memory layout of `src`.
    public static final MemoryLayout ML_src = LAYOUT.select(PathElement.groupElement("src"));
    /// The [VarHandle] of `dst` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dst = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkCopyMemoryToMicromapInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkCopyMemoryToMicromapInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyMemoryToMicromapInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToMicromapInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment); }

    /// Creates `VkCopyMemoryToMicromapInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToMicromapInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyMemoryToMicromapInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToMicromapInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT alloc(SegmentAllocator allocator) { return new VkCopyMemoryToMicromapInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryToMicromapInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyMemoryToMicromapInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyMemoryToMicromapInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyMemoryToMicromapInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyMemoryToMicromapInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyMemoryToMicromapInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT sType(@CType("VkStructureType") int value) { VkCopyMemoryToMicromapInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCopyMemoryToMicromapInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCopyMemoryToMicromapInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCopyMemoryToMicromapInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `src` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_src(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_src, index), ML_src); }
    /// {@return `src`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_src(MemorySegment segment) { return VkCopyMemoryToMicromapInfoEXT.get_src(segment, 0L); }
    /// {@return `src` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment srcAt(long index) { return VkCopyMemoryToMicromapInfoEXT.get_src(this.segment(), index); }
    /// {@return `src`}
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment src() { return VkCopyMemoryToMicromapInfoEXT.get_src(this.segment()); }
    /// Sets `src` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_src(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_src, index), ML_src.byteSize()); }
    /// Sets `src` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_src(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_src(segment, 0L, value); }
    /// Sets `src` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT srcAt(long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_src(this.segment(), index, value); return this; }
    /// Sets `src` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT src(@CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_src(this.segment(), value); return this; }

    /// {@return `dst` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_dst(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dst.get(segment, 0L, index); }
    /// {@return `dst`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_dst(MemorySegment segment) { return VkCopyMemoryToMicromapInfoEXT.get_dst(segment, 0L); }
    /// {@return `dst` at the given index}
    /// @param index the index
    public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment dstAt(long index) { return VkCopyMemoryToMicromapInfoEXT.get_dst(this.segment(), index); }
    /// {@return `dst`}
    public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment dst() { return VkCopyMemoryToMicromapInfoEXT.get_dst(this.segment()); }
    /// Sets `dst` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dst(MemorySegment segment, long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VH_dst.set(segment, 0L, index, value); }
    /// Sets `dst` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dst(MemorySegment segment, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_dst(segment, 0L, value); }
    /// Sets `dst` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT dstAt(long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_dst(this.segment(), index, value); return this; }
    /// Sets `dst` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT dst(@CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMemoryToMicromapInfoEXT.set_dst(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCopyMicromapModeEXT") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkCopyMicromapModeEXT") int get_mode(MemorySegment segment) { return VkCopyMemoryToMicromapInfoEXT.get_mode(segment, 0L); }
    /// {@return `mode` at the given index}
    /// @param index the index
    public @CType("VkCopyMicromapModeEXT") int modeAt(long index) { return VkCopyMemoryToMicromapInfoEXT.get_mode(this.segment(), index); }
    /// {@return `mode`}
    public @CType("VkCopyMicromapModeEXT") int mode() { return VkCopyMemoryToMicromapInfoEXT.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkCopyMicromapModeEXT") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkCopyMicromapModeEXT") int value) { VkCopyMemoryToMicromapInfoEXT.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT modeAt(long index, @CType("VkCopyMicromapModeEXT") int value) { VkCopyMemoryToMicromapInfoEXT.set_mode(this.segment(), index, value); return this; }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT mode(@CType("VkCopyMicromapModeEXT") int value) { VkCopyMemoryToMicromapInfoEXT.set_mode(this.segment(), value); return this; }

}
