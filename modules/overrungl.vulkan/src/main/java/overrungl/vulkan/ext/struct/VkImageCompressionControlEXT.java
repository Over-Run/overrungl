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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### compressionControlPlaneCount
/// [VarHandle][#VH_compressionControlPlaneCount] - [Getter][#compressionControlPlaneCount()] - [Setter][#compressionControlPlaneCount(int)]
/// ### pFixedRateFlags
/// [VarHandle][#VH_pFixedRateFlags] - [Getter][#pFixedRateFlags()] - [Setter][#pFixedRateFlags(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageCompressionControlEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageCompressionFlagsEXT flags;
///     uint32_t compressionControlPlaneCount;
///     VkImageCompressionFixedRateFlagsEXT * pFixedRateFlags;
/// } VkImageCompressionControlEXT;
/// ```
public final class VkImageCompressionControlEXT extends Struct {
    /// The struct layout of `VkImageCompressionControlEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("compressionControlPlaneCount"),
        ValueLayout.ADDRESS.withName("pFixedRateFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `compressionControlPlaneCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compressionControlPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressionControlPlaneCount"));
    /// The [VarHandle] of `pFixedRateFlags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pFixedRateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFixedRateFlags"));

    /// Creates `VkImageCompressionControlEXT` with the given segment.
    /// @param segment the memory segment
    public VkImageCompressionControlEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageCompressionControlEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionControlEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment); }

    /// Creates `VkImageCompressionControlEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionControlEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageCompressionControlEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionControlEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageCompressionControlEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageCompressionControlEXT`
    public static VkImageCompressionControlEXT alloc(SegmentAllocator allocator) { return new VkImageCompressionControlEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageCompressionControlEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageCompressionControlEXT`
    public static VkImageCompressionControlEXT alloc(SegmentAllocator allocator, long count) { return new VkImageCompressionControlEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkImageCompressionControlEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageCompressionControlEXT`
    public VkImageCompressionControlEXT asSlice(long index) { return new VkImageCompressionControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkImageCompressionControlEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageCompressionControlEXT`
    public VkImageCompressionControlEXT asSlice(long index, long count) { return new VkImageCompressionControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageCompressionControlEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageCompressionControlEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageCompressionControlEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageCompressionControlEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkImageCompressionControlEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT sType(@CType("VkStructureType") int value) { VkImageCompressionControlEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageCompressionControlEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageCompressionControlEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageCompressionControlEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageCompressionControlEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageCompressionControlEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageCompressionControlEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCompressionFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCompressionFlagsEXT") int get_flags(MemorySegment segment) { return VkImageCompressionControlEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkImageCompressionFlagsEXT") int flagsAt(long index) { return VkImageCompressionControlEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkImageCompressionFlagsEXT") int flags() { return VkImageCompressionControlEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkImageCompressionFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkImageCompressionFlagsEXT") int value) { VkImageCompressionControlEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT flagsAt(long index, @CType("VkImageCompressionFlagsEXT") int value) { VkImageCompressionControlEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT flags(@CType("VkImageCompressionFlagsEXT") int value) { VkImageCompressionControlEXT.set_flags(this.segment(), value); return this; }

    /// {@return `compressionControlPlaneCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_compressionControlPlaneCount(MemorySegment segment, long index) { return (int) VH_compressionControlPlaneCount.get(segment, 0L, index); }
    /// {@return `compressionControlPlaneCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_compressionControlPlaneCount(MemorySegment segment) { return VkImageCompressionControlEXT.get_compressionControlPlaneCount(segment, 0L); }
    /// {@return `compressionControlPlaneCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int compressionControlPlaneCountAt(long index) { return VkImageCompressionControlEXT.get_compressionControlPlaneCount(this.segment(), index); }
    /// {@return `compressionControlPlaneCount`}
    public @CType("uint32_t") int compressionControlPlaneCount() { return VkImageCompressionControlEXT.get_compressionControlPlaneCount(this.segment()); }
    /// Sets `compressionControlPlaneCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compressionControlPlaneCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_compressionControlPlaneCount.set(segment, 0L, index, value); }
    /// Sets `compressionControlPlaneCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compressionControlPlaneCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageCompressionControlEXT.set_compressionControlPlaneCount(segment, 0L, value); }
    /// Sets `compressionControlPlaneCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT compressionControlPlaneCountAt(long index, @CType("uint32_t") int value) { VkImageCompressionControlEXT.set_compressionControlPlaneCount(this.segment(), index, value); return this; }
    /// Sets `compressionControlPlaneCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT compressionControlPlaneCount(@CType("uint32_t") int value) { VkImageCompressionControlEXT.set_compressionControlPlaneCount(this.segment(), value); return this; }

    /// {@return `pFixedRateFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCompressionFixedRateFlagsEXT *") java.lang.foreign.MemorySegment get_pFixedRateFlags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pFixedRateFlags.get(segment, 0L, index); }
    /// {@return `pFixedRateFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCompressionFixedRateFlagsEXT *") java.lang.foreign.MemorySegment get_pFixedRateFlags(MemorySegment segment) { return VkImageCompressionControlEXT.get_pFixedRateFlags(segment, 0L); }
    /// {@return `pFixedRateFlags` at the given index}
    /// @param index the index
    public @CType("VkImageCompressionFixedRateFlagsEXT *") java.lang.foreign.MemorySegment pFixedRateFlagsAt(long index) { return VkImageCompressionControlEXT.get_pFixedRateFlags(this.segment(), index); }
    /// {@return `pFixedRateFlags`}
    public @CType("VkImageCompressionFixedRateFlagsEXT *") java.lang.foreign.MemorySegment pFixedRateFlags() { return VkImageCompressionControlEXT.get_pFixedRateFlags(this.segment()); }
    /// Sets `pFixedRateFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pFixedRateFlags(MemorySegment segment, long index, @CType("VkImageCompressionFixedRateFlagsEXT *") java.lang.foreign.MemorySegment value) { VH_pFixedRateFlags.set(segment, 0L, index, value); }
    /// Sets `pFixedRateFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pFixedRateFlags(MemorySegment segment, @CType("VkImageCompressionFixedRateFlagsEXT *") java.lang.foreign.MemorySegment value) { VkImageCompressionControlEXT.set_pFixedRateFlags(segment, 0L, value); }
    /// Sets `pFixedRateFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT pFixedRateFlagsAt(long index, @CType("VkImageCompressionFixedRateFlagsEXT *") java.lang.foreign.MemorySegment value) { VkImageCompressionControlEXT.set_pFixedRateFlags(this.segment(), index, value); return this; }
    /// Sets `pFixedRateFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT pFixedRateFlags(@CType("VkImageCompressionFixedRateFlagsEXT *") java.lang.foreign.MemorySegment value) { VkImageCompressionControlEXT.set_pFixedRateFlags(this.segment(), value); return this; }

}
