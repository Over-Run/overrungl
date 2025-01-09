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
/// ### memory
/// [VarHandle][#VH_memory] - [Getter][#memory()] - [Setter][#memory(java.lang.foreign.MemorySegment)]
/// ### mtlBuffer
/// [VarHandle][#VH_mtlBuffer] - [Getter][#mtlBuffer()] - [Setter][#mtlBuffer(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportMetalBufferInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceMemory memory;
///     MTLBuffer_id mtlBuffer;
/// } VkExportMetalBufferInfoEXT;
/// ```
public final class VkExportMetalBufferInfoEXT extends Struct {
    /// The struct layout of `VkExportMetalBufferInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.ADDRESS.withName("mtlBuffer")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The [VarHandle] of `mtlBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_mtlBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlBuffer"));

    /// Creates `VkExportMetalBufferInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkExportMetalBufferInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMetalBufferInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalBufferInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalBufferInfoEXT(segment); }

    /// Creates `VkExportMetalBufferInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalBufferInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalBufferInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportMetalBufferInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalBufferInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalBufferInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExportMetalBufferInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalBufferInfoEXT`
    public static VkExportMetalBufferInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalBufferInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMetalBufferInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalBufferInfoEXT`
    public static VkExportMetalBufferInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalBufferInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkExportMetalBufferInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExportMetalBufferInfoEXT`
    public VkExportMetalBufferInfoEXT asSlice(long index) { return new VkExportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkExportMetalBufferInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExportMetalBufferInfoEXT`
    public VkExportMetalBufferInfoEXT asSlice(long index, long count) { return new VkExportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportMetalBufferInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkExportMetalBufferInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportMetalBufferInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportMetalBufferInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkExportMetalBufferInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT sType(@CType("VkStructureType") int value) { VkExportMetalBufferInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExportMetalBufferInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExportMetalBufferInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkExportMetalBufferInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment) { return VkExportMetalBufferInfoEXT.get_memory(segment, 0L); }
    /// {@return `memory` at the given index}
    /// @param index the index
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memoryAt(long index) { return VkExportMetalBufferInfoEXT.get_memory(this.segment(), index); }
    /// {@return `memory`}
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memory() { return VkExportMetalBufferInfoEXT.get_memory(this.segment()); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memory(MemorySegment segment, long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memory(MemorySegment segment, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_memory(segment, 0L, value); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT memoryAt(long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_memory(this.segment(), index, value); return this; }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT memory(@CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_memory(this.segment(), value); return this; }

    /// {@return `mtlBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLBuffer_id") java.lang.foreign.MemorySegment get_mtlBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_mtlBuffer.get(segment, 0L, index); }
    /// {@return `mtlBuffer`}
    /// @param segment the segment of the struct
    public static @CType("MTLBuffer_id") java.lang.foreign.MemorySegment get_mtlBuffer(MemorySegment segment) { return VkExportMetalBufferInfoEXT.get_mtlBuffer(segment, 0L); }
    /// {@return `mtlBuffer` at the given index}
    /// @param index the index
    public @CType("MTLBuffer_id") java.lang.foreign.MemorySegment mtlBufferAt(long index) { return VkExportMetalBufferInfoEXT.get_mtlBuffer(this.segment(), index); }
    /// {@return `mtlBuffer`}
    public @CType("MTLBuffer_id") java.lang.foreign.MemorySegment mtlBuffer() { return VkExportMetalBufferInfoEXT.get_mtlBuffer(this.segment()); }
    /// Sets `mtlBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlBuffer(MemorySegment segment, long index, @CType("MTLBuffer_id") java.lang.foreign.MemorySegment value) { VH_mtlBuffer.set(segment, 0L, index, value); }
    /// Sets `mtlBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlBuffer(MemorySegment segment, @CType("MTLBuffer_id") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_mtlBuffer(segment, 0L, value); }
    /// Sets `mtlBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT mtlBufferAt(long index, @CType("MTLBuffer_id") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_mtlBuffer(this.segment(), index, value); return this; }
    /// Sets `mtlBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalBufferInfoEXT mtlBuffer(@CType("MTLBuffer_id") java.lang.foreign.MemorySegment value) { VkExportMetalBufferInfoEXT.set_mtlBuffer(this.segment(), value); return this; }

}
