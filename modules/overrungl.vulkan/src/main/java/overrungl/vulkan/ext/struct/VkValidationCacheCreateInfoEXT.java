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
/// ### initialDataSize
/// [VarHandle][#VH_initialDataSize] - [Getter][#initialDataSize()] - [Setter][#initialDataSize(long)]
/// ### pInitialData
/// [VarHandle][#VH_pInitialData] - [Getter][#pInitialData()] - [Setter][#pInitialData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkValidationCacheCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkValidationCacheCreateFlagsEXT flags;
///     size_t initialDataSize;
///     const void * pInitialData;
/// } VkValidationCacheCreateInfoEXT;
/// ```
public final class VkValidationCacheCreateInfoEXT extends Struct {
    /// The struct layout of `VkValidationCacheCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("initialDataSize"),
        ValueLayout.ADDRESS.withName("pInitialData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `initialDataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_initialDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialDataSize"));
    /// The [VarHandle] of `pInitialData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pInitialData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInitialData"));

    /// Creates `VkValidationCacheCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkValidationCacheCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkValidationCacheCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationCacheCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkValidationCacheCreateInfoEXT(segment); }

    /// Creates `VkValidationCacheCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationCacheCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkValidationCacheCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkValidationCacheCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationCacheCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkValidationCacheCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkValidationCacheCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkValidationCacheCreateInfoEXT`
    public static VkValidationCacheCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkValidationCacheCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkValidationCacheCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkValidationCacheCreateInfoEXT`
    public static VkValidationCacheCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkValidationCacheCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkValidationCacheCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkValidationCacheCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkValidationCacheCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkValidationCacheCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkValidationCacheCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT sType(@CType("VkStructureType") int value) { VkValidationCacheCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkValidationCacheCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkValidationCacheCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkValidationCacheCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationCacheCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationCacheCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationCacheCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkValidationCacheCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkValidationCacheCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkValidationCacheCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkValidationCacheCreateFlagsEXT") int flagsAt(long index) { return VkValidationCacheCreateInfoEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkValidationCacheCreateFlagsEXT") int flags() { return VkValidationCacheCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkValidationCacheCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkValidationCacheCreateFlagsEXT") int value) { VkValidationCacheCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT flagsAt(long index, @CType("VkValidationCacheCreateFlagsEXT") int value) { VkValidationCacheCreateInfoEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT flags(@CType("VkValidationCacheCreateFlagsEXT") int value) { VkValidationCacheCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `initialDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_initialDataSize(MemorySegment segment, long index) { return (long) VH_initialDataSize.get(segment, 0L, index); }
    /// {@return `initialDataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_initialDataSize(MemorySegment segment) { return VkValidationCacheCreateInfoEXT.get_initialDataSize(segment, 0L); }
    /// {@return `initialDataSize` at the given index}
    /// @param index the index
    public @CType("size_t") long initialDataSizeAt(long index) { return VkValidationCacheCreateInfoEXT.get_initialDataSize(this.segment(), index); }
    /// {@return `initialDataSize`}
    public @CType("size_t") long initialDataSize() { return VkValidationCacheCreateInfoEXT.get_initialDataSize(this.segment()); }
    /// Sets `initialDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initialDataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_initialDataSize.set(segment, 0L, index, value); }
    /// Sets `initialDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initialDataSize(MemorySegment segment, @CType("size_t") long value) { VkValidationCacheCreateInfoEXT.set_initialDataSize(segment, 0L, value); }
    /// Sets `initialDataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT initialDataSizeAt(long index, @CType("size_t") long value) { VkValidationCacheCreateInfoEXT.set_initialDataSize(this.segment(), index, value); return this; }
    /// Sets `initialDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT initialDataSize(@CType("size_t") long value) { VkValidationCacheCreateInfoEXT.set_initialDataSize(this.segment(), value); return this; }

    /// {@return `pInitialData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pInitialData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pInitialData.get(segment, 0L, index); }
    /// {@return `pInitialData`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pInitialData(MemorySegment segment) { return VkValidationCacheCreateInfoEXT.get_pInitialData(segment, 0L); }
    /// {@return `pInitialData` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pInitialDataAt(long index) { return VkValidationCacheCreateInfoEXT.get_pInitialData(this.segment(), index); }
    /// {@return `pInitialData`}
    public @CType("const void *") java.lang.foreign.MemorySegment pInitialData() { return VkValidationCacheCreateInfoEXT.get_pInitialData(this.segment()); }
    /// Sets `pInitialData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pInitialData(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pInitialData.set(segment, 0L, index, value); }
    /// Sets `pInitialData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pInitialData(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationCacheCreateInfoEXT.set_pInitialData(segment, 0L, value); }
    /// Sets `pInitialData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT pInitialDataAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationCacheCreateInfoEXT.set_pInitialData(this.segment(), index, value); return this; }
    /// Sets `pInitialData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationCacheCreateInfoEXT pInitialData(@CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationCacheCreateInfoEXT.set_pInitialData(this.segment(), value); return this; }

}
