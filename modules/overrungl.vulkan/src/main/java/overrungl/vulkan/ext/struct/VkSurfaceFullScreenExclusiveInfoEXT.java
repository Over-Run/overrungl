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
/// ### fullScreenExclusive
/// [VarHandle][#VH_fullScreenExclusive] - [Getter][#fullScreenExclusive()] - [Setter][#fullScreenExclusive(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSurfaceFullScreenExclusiveInfoEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkFullScreenExclusiveEXT fullScreenExclusive;
/// } VkSurfaceFullScreenExclusiveInfoEXT;
/// ```
public final class VkSurfaceFullScreenExclusiveInfoEXT extends Struct {
    /// The struct layout of `VkSurfaceFullScreenExclusiveInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fullScreenExclusive")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fullScreenExclusive` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fullScreenExclusive = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullScreenExclusive"));

    /// Creates `VkSurfaceFullScreenExclusiveInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceFullScreenExclusiveInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceFullScreenExclusiveInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFullScreenExclusiveInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveInfoEXT(segment); }

    /// Creates `VkSurfaceFullScreenExclusiveInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFullScreenExclusiveInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfaceFullScreenExclusiveInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFullScreenExclusiveInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceFullScreenExclusiveInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSurfaceFullScreenExclusiveInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceFullScreenExclusiveInfoEXT`
    public static VkSurfaceFullScreenExclusiveInfoEXT alloc(SegmentAllocator allocator) { return new VkSurfaceFullScreenExclusiveInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceFullScreenExclusiveInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceFullScreenExclusiveInfoEXT`
    public static VkSurfaceFullScreenExclusiveInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSurfaceFullScreenExclusiveInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSurfaceFullScreenExclusiveInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSurfaceFullScreenExclusiveInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSurfaceFullScreenExclusiveInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSurfaceFullScreenExclusiveInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkSurfaceFullScreenExclusiveInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveInfoEXT sType(@CType("VkStructureType") int value) { VkSurfaceFullScreenExclusiveInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSurfaceFullScreenExclusiveInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSurfaceFullScreenExclusiveInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSurfaceFullScreenExclusiveInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceFullScreenExclusiveInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveInfoEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceFullScreenExclusiveInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveInfoEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceFullScreenExclusiveInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `fullScreenExclusive` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFullScreenExclusiveEXT") int get_fullScreenExclusive(MemorySegment segment, long index) { return (int) VH_fullScreenExclusive.get(segment, 0L, index); }
    /// {@return `fullScreenExclusive`}
    /// @param segment the segment of the struct
    public static @CType("VkFullScreenExclusiveEXT") int get_fullScreenExclusive(MemorySegment segment) { return VkSurfaceFullScreenExclusiveInfoEXT.get_fullScreenExclusive(segment, 0L); }
    /// {@return `fullScreenExclusive` at the given index}
    /// @param index the index
    public @CType("VkFullScreenExclusiveEXT") int fullScreenExclusiveAt(long index) { return VkSurfaceFullScreenExclusiveInfoEXT.get_fullScreenExclusive(this.segment(), index); }
    /// {@return `fullScreenExclusive`}
    public @CType("VkFullScreenExclusiveEXT") int fullScreenExclusive() { return VkSurfaceFullScreenExclusiveInfoEXT.get_fullScreenExclusive(this.segment()); }
    /// Sets `fullScreenExclusive` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fullScreenExclusive(MemorySegment segment, long index, @CType("VkFullScreenExclusiveEXT") int value) { VH_fullScreenExclusive.set(segment, 0L, index, value); }
    /// Sets `fullScreenExclusive` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fullScreenExclusive(MemorySegment segment, @CType("VkFullScreenExclusiveEXT") int value) { VkSurfaceFullScreenExclusiveInfoEXT.set_fullScreenExclusive(segment, 0L, value); }
    /// Sets `fullScreenExclusive` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveInfoEXT fullScreenExclusiveAt(long index, @CType("VkFullScreenExclusiveEXT") int value) { VkSurfaceFullScreenExclusiveInfoEXT.set_fullScreenExclusive(this.segment(), index, value); return this; }
    /// Sets `fullScreenExclusive` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFullScreenExclusiveInfoEXT fullScreenExclusive(@CType("VkFullScreenExclusiveEXT") int value) { VkSurfaceFullScreenExclusiveInfoEXT.set_fullScreenExclusive(this.segment(), value); return this; }

}
