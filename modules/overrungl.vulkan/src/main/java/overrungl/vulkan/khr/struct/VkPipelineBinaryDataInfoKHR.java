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
/// ### pipelineBinary
/// [VarHandle][#VH_pipelineBinary] - [Getter][#pipelineBinary()] - [Setter][#pipelineBinary(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineBinaryDataInfoKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkPipelineBinaryKHR pipelineBinary;
/// } VkPipelineBinaryDataInfoKHR;
/// ```
public final class VkPipelineBinaryDataInfoKHR extends Struct {
    /// The struct layout of `VkPipelineBinaryDataInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipelineBinary")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelineBinary` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pipelineBinary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinary"));

    /// Creates `VkPipelineBinaryDataInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineBinaryDataInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineBinaryDataInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryDataInfoKHR(segment); }

    /// Creates `VkPipelineBinaryDataInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryDataInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineBinaryDataInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryDataInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineBinaryDataInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineBinaryDataInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryDataInfoKHR`
    public static VkPipelineBinaryDataInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryDataInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineBinaryDataInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryDataInfoKHR`
    public static VkPipelineBinaryDataInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryDataInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineBinaryDataInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineBinaryDataInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineBinaryDataInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineBinaryDataInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineBinaryDataInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR sType(@CType("VkStructureType") int value) { VkPipelineBinaryDataInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineBinaryDataInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineBinaryDataInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineBinaryDataInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineBinary` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineBinaryKHR") java.lang.foreign.MemorySegment get_pipelineBinary(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pipelineBinary.get(segment, 0L, index); }
    /// {@return `pipelineBinary`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineBinaryKHR") java.lang.foreign.MemorySegment get_pipelineBinary(MemorySegment segment) { return VkPipelineBinaryDataInfoKHR.get_pipelineBinary(segment, 0L); }
    /// {@return `pipelineBinary` at the given index}
    /// @param index the index
    public @CType("VkPipelineBinaryKHR") java.lang.foreign.MemorySegment pipelineBinaryAt(long index) { return VkPipelineBinaryDataInfoKHR.get_pipelineBinary(this.segment(), index); }
    /// {@return `pipelineBinary`}
    public @CType("VkPipelineBinaryKHR") java.lang.foreign.MemorySegment pipelineBinary() { return VkPipelineBinaryDataInfoKHR.get_pipelineBinary(this.segment()); }
    /// Sets `pipelineBinary` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBinary(MemorySegment segment, long index, @CType("VkPipelineBinaryKHR") java.lang.foreign.MemorySegment value) { VH_pipelineBinary.set(segment, 0L, index, value); }
    /// Sets `pipelineBinary` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBinary(MemorySegment segment, @CType("VkPipelineBinaryKHR") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataInfoKHR.set_pipelineBinary(segment, 0L, value); }
    /// Sets `pipelineBinary` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR pipelineBinaryAt(long index, @CType("VkPipelineBinaryKHR") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataInfoKHR.set_pipelineBinary(this.segment(), index, value); return this; }
    /// Sets `pipelineBinary` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryDataInfoKHR pipelineBinary(@CType("VkPipelineBinaryKHR") java.lang.foreign.MemorySegment value) { VkPipelineBinaryDataInfoKHR.set_pipelineBinary(this.segment(), value); return this; }

}
