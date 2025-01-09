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
package overrungl.vulkan.struct;

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
/// ### dataSize
/// [VarHandle][#VH_dataSize] - [Getter][#dataSize()] - [Setter][#dataSize(int)]
/// ### pData
/// [VarHandle][#VH_pData] - [Getter][#pData()] - [Setter][#pData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWriteDescriptorSetInlineUniformBlock {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t dataSize;
///     const void * pData;
/// } VkWriteDescriptorSetInlineUniformBlock;
/// ```
public final class VkWriteDescriptorSetInlineUniformBlock extends Struct {
    /// The struct layout of `VkWriteDescriptorSetInlineUniformBlock`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkWriteDescriptorSetInlineUniformBlock` with the given segment.
    /// @param segment the memory segment
    public VkWriteDescriptorSetInlineUniformBlock(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWriteDescriptorSetInlineUniformBlock` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetInlineUniformBlock of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSetInlineUniformBlock(segment); }

    /// Creates `VkWriteDescriptorSetInlineUniformBlock` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetInlineUniformBlock ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSetInlineUniformBlock(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWriteDescriptorSetInlineUniformBlock` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetInlineUniformBlock ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSetInlineUniformBlock(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkWriteDescriptorSetInlineUniformBlock` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSetInlineUniformBlock`
    public static VkWriteDescriptorSetInlineUniformBlock alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetInlineUniformBlock(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWriteDescriptorSetInlineUniformBlock` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteDescriptorSetInlineUniformBlock`
    public static VkWriteDescriptorSetInlineUniformBlock alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSetInlineUniformBlock(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkWriteDescriptorSetInlineUniformBlock`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWriteDescriptorSetInlineUniformBlock`
    public VkWriteDescriptorSetInlineUniformBlock asSlice(long index) { return new VkWriteDescriptorSetInlineUniformBlock(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkWriteDescriptorSetInlineUniformBlock`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWriteDescriptorSetInlineUniformBlock`
    public VkWriteDescriptorSetInlineUniformBlock asSlice(long index, long count) { return new VkWriteDescriptorSetInlineUniformBlock(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWriteDescriptorSetInlineUniformBlock.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkWriteDescriptorSetInlineUniformBlock.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWriteDescriptorSetInlineUniformBlock.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWriteDescriptorSetInlineUniformBlock.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetInlineUniformBlock sTypeAt(long index, @CType("VkStructureType") int value) { VkWriteDescriptorSetInlineUniformBlock.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetInlineUniformBlock sType(@CType("VkStructureType") int value) { VkWriteDescriptorSetInlineUniformBlock.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWriteDescriptorSetInlineUniformBlock.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWriteDescriptorSetInlineUniformBlock.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWriteDescriptorSetInlineUniformBlock.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetInlineUniformBlock.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetInlineUniformBlock pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetInlineUniformBlock.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetInlineUniformBlock pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetInlineUniformBlock.set_pNext(this.segment(), value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dataSize(MemorySegment segment, long index) { return (int) VH_dataSize.get(segment, 0L, index); }
    /// {@return `dataSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dataSize(MemorySegment segment) { return VkWriteDescriptorSetInlineUniformBlock.get_dataSize(segment, 0L); }
    /// {@return `dataSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dataSizeAt(long index) { return VkWriteDescriptorSetInlineUniformBlock.get_dataSize(this.segment(), index); }
    /// {@return `dataSize`}
    public @CType("uint32_t") int dataSize() { return VkWriteDescriptorSetInlineUniformBlock.get_dataSize(this.segment()); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dataSize.set(segment, 0L, index, value); }
    /// Sets `dataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dataSize(MemorySegment segment, @CType("uint32_t") int value) { VkWriteDescriptorSetInlineUniformBlock.set_dataSize(segment, 0L, value); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetInlineUniformBlock dataSizeAt(long index, @CType("uint32_t") int value) { VkWriteDescriptorSetInlineUniformBlock.set_dataSize(this.segment(), index, value); return this; }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetInlineUniformBlock dataSize(@CType("uint32_t") int value) { VkWriteDescriptorSetInlineUniformBlock.set_dataSize(this.segment(), value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pData(MemorySegment segment) { return VkWriteDescriptorSetInlineUniformBlock.get_pData(segment, 0L); }
    /// {@return `pData` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pDataAt(long index) { return VkWriteDescriptorSetInlineUniformBlock.get_pData(this.segment(), index); }
    /// {@return `pData`}
    public @CType("const void *") java.lang.foreign.MemorySegment pData() { return VkWriteDescriptorSetInlineUniformBlock.get_pData(this.segment()); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pData(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pData(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetInlineUniformBlock.set_pData(segment, 0L, value); }
    /// Sets `pData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetInlineUniformBlock pDataAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetInlineUniformBlock.set_pData(this.segment(), index, value); return this; }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetInlineUniformBlock pData(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSetInlineUniformBlock.set_pData(this.segment(), value); return this; }

}
