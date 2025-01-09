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
package overrungl.vulkan.intel.struct;

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
/// ### pUserData
/// [VarHandle][#VH_pUserData] - [Getter][#pUserData()] - [Setter][#pUserData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkInitializePerformanceApiInfoINTEL {
///     VkStructureType sType;
///     const void * pNext;
///     void * pUserData;
/// } VkInitializePerformanceApiInfoINTEL;
/// ```
public final class VkInitializePerformanceApiInfoINTEL extends Struct {
    /// The struct layout of `VkInitializePerformanceApiInfoINTEL`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    /// Creates `VkInitializePerformanceApiInfoINTEL` with the given segment.
    /// @param segment the memory segment
    public VkInitializePerformanceApiInfoINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkInitializePerformanceApiInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInitializePerformanceApiInfoINTEL of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkInitializePerformanceApiInfoINTEL(segment); }

    /// Creates `VkInitializePerformanceApiInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInitializePerformanceApiInfoINTEL ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkInitializePerformanceApiInfoINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkInitializePerformanceApiInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInitializePerformanceApiInfoINTEL ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkInitializePerformanceApiInfoINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkInitializePerformanceApiInfoINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkInitializePerformanceApiInfoINTEL`
    public static VkInitializePerformanceApiInfoINTEL alloc(SegmentAllocator allocator) { return new VkInitializePerformanceApiInfoINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkInitializePerformanceApiInfoINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkInitializePerformanceApiInfoINTEL`
    public static VkInitializePerformanceApiInfoINTEL alloc(SegmentAllocator allocator, long count) { return new VkInitializePerformanceApiInfoINTEL(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkInitializePerformanceApiInfoINTEL`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkInitializePerformanceApiInfoINTEL`
    public VkInitializePerformanceApiInfoINTEL asSlice(long index) { return new VkInitializePerformanceApiInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkInitializePerformanceApiInfoINTEL`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkInitializePerformanceApiInfoINTEL`
    public VkInitializePerformanceApiInfoINTEL asSlice(long index, long count) { return new VkInitializePerformanceApiInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkInitializePerformanceApiInfoINTEL.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkInitializePerformanceApiInfoINTEL.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkInitializePerformanceApiInfoINTEL.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkInitializePerformanceApiInfoINTEL.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInitializePerformanceApiInfoINTEL sTypeAt(long index, @CType("VkStructureType") int value) { VkInitializePerformanceApiInfoINTEL.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInitializePerformanceApiInfoINTEL sType(@CType("VkStructureType") int value) { VkInitializePerformanceApiInfoINTEL.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkInitializePerformanceApiInfoINTEL.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkInitializePerformanceApiInfoINTEL.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkInitializePerformanceApiInfoINTEL.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkInitializePerformanceApiInfoINTEL.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInitializePerformanceApiInfoINTEL pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkInitializePerformanceApiInfoINTEL.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInitializePerformanceApiInfoINTEL pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkInitializePerformanceApiInfoINTEL.set_pNext(this.segment(), value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pUserData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pUserData(MemorySegment segment) { return VkInitializePerformanceApiInfoINTEL.get_pUserData(segment, 0L); }
    /// {@return `pUserData` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pUserDataAt(long index) { return VkInitializePerformanceApiInfoINTEL.get_pUserData(this.segment(), index); }
    /// {@return `pUserData`}
    public @CType("void *") java.lang.foreign.MemorySegment pUserData() { return VkInitializePerformanceApiInfoINTEL.get_pUserData(this.segment()); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkInitializePerformanceApiInfoINTEL.set_pUserData(segment, 0L, value); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInitializePerformanceApiInfoINTEL pUserDataAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkInitializePerformanceApiInfoINTEL.set_pUserData(this.segment(), index, value); return this; }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInitializePerformanceApiInfoINTEL pUserData(@CType("void *") java.lang.foreign.MemorySegment value) { VkInitializePerformanceApiInfoINTEL.set_pUserData(this.segment(), value); return this; }

}
