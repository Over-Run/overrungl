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
package overrungl.vulkan.amdx.struct;

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
/// ### pName
/// [VarHandle][#VH_pName] - [Getter][#pName()] - [Setter][#pName(java.lang.foreign.MemorySegment)]
/// ### index
/// [VarHandle][#VH_index] - [Getter][#index()] - [Setter][#index(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineShaderStageNodeCreateInfoAMDX {
///      VkStructureType sType;
///     const void * pNext;
///     const char * pName;
///     uint32_t index;
/// } VkPipelineShaderStageNodeCreateInfoAMDX;
/// ```
public final class VkPipelineShaderStageNodeCreateInfoAMDX extends Struct {
    /// The struct layout of `VkPipelineShaderStageNodeCreateInfoAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.JAVA_INT.withName("index")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    /// The [VarHandle] of `index` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));

    /// Creates `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment.
    /// @param segment the memory segment
    public VkPipelineShaderStageNodeCreateInfoAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageNodeCreateInfoAMDX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment); }

    /// Creates `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageNodeCreateInfoAMDX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageNodeCreateInfoAMDX ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineShaderStageNodeCreateInfoAMDX`
    public static VkPipelineShaderStageNodeCreateInfoAMDX alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageNodeCreateInfoAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineShaderStageNodeCreateInfoAMDX`
    public static VkPipelineShaderStageNodeCreateInfoAMDX alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageNodeCreateInfoAMDX(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineShaderStageNodeCreateInfoAMDX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineShaderStageNodeCreateInfoAMDX`
    public VkPipelineShaderStageNodeCreateInfoAMDX asSlice(long index) { return new VkPipelineShaderStageNodeCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineShaderStageNodeCreateInfoAMDX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineShaderStageNodeCreateInfoAMDX`
    public VkPipelineShaderStageNodeCreateInfoAMDX asSlice(long index, long count) { return new VkPipelineShaderStageNodeCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType(" VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType(" VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineShaderStageNodeCreateInfoAMDX.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType(" VkStructureType") int sTypeAt(long index) { return VkPipelineShaderStageNodeCreateInfoAMDX.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType(" VkStructureType") int sType() { return VkPipelineShaderStageNodeCreateInfoAMDX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType(" VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType(" VkStructureType") int value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX sTypeAt(long index, @CType(" VkStructureType") int value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX sType(@CType(" VkStructureType") int value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineShaderStageNodeCreateInfoAMDX.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineShaderStageNodeCreateInfoAMDX.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineShaderStageNodeCreateInfoAMDX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_pNext(this.segment(), value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pName(MemorySegment segment) { return VkPipelineShaderStageNodeCreateInfoAMDX.get_pName(segment, 0L); }
    /// {@return `pName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pNameAt(long index) { return VkPipelineShaderStageNodeCreateInfoAMDX.get_pName(this.segment(), index); }
    /// {@return `pName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pName() { return VkPipelineShaderStageNodeCreateInfoAMDX.get_pName(this.segment()); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_pName(segment, 0L, value); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX pNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_pName(this.segment(), index, value); return this; }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX pName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_pName(this.segment(), value); return this; }

    /// {@return `index` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_index(MemorySegment segment, long index) { return (int) VH_index.get(segment, 0L, index); }
    /// {@return `index`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_index(MemorySegment segment) { return VkPipelineShaderStageNodeCreateInfoAMDX.get_index(segment, 0L); }
    /// {@return `index` at the given index}
    /// @param index the index
    public @CType("uint32_t") int indexAt(long index) { return VkPipelineShaderStageNodeCreateInfoAMDX.get_index(this.segment(), index); }
    /// {@return `index`}
    public @CType("uint32_t") int index() { return VkPipelineShaderStageNodeCreateInfoAMDX.get_index(this.segment()); }
    /// Sets `index` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_index(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_index.set(segment, 0L, index, value); }
    /// Sets `index` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_index(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_index(segment, 0L, value); }
    /// Sets `index` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX indexAt(long index, @CType("uint32_t") int value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_index(this.segment(), index, value); return this; }
    /// Sets `index` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX index(@CType("uint32_t") int value) { VkPipelineShaderStageNodeCreateInfoAMDX.set_index(this.segment(), value); return this; }

}
