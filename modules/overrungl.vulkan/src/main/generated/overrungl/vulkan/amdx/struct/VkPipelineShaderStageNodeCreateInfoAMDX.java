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
//@formatter:off
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineShaderStageNodeCreateInfoAMDX {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const char* pName;
///     uint32_t index;
/// };
/// ```
public final class VkPipelineShaderStageNodeCreateInfoAMDX extends GroupType {
    /// The struct layout of `VkPipelineShaderStageNodeCreateInfoAMDX`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.JAVA_INT.withName("index")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `pName`.
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    /// The memory layout of `pName`.
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    /// The byte offset of `index`.
    public static final long OFFSET_index = LAYOUT.byteOffset(PathElement.groupElement("index"));
    /// The memory layout of `index`.
    public static final MemoryLayout LAYOUT_index = LAYOUT.select(PathElement.groupElement("index"));
    /// The [VarHandle] of `index` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));

    /// Creates `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineShaderStageNodeCreateInfoAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageNodeCreateInfoAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageNodeCreateInfoAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageNodeCreateInfoAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineShaderStageNodeCreateInfoAMDX`
    public static VkPipelineShaderStageNodeCreateInfoAMDX alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageNodeCreateInfoAMDX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineShaderStageNodeCreateInfoAMDX`
    public static VkPipelineShaderStageNodeCreateInfoAMDX alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageNodeCreateInfoAMDX(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pName `pName`
    /// @param index `index`
    /// @return the allocated `VkPipelineShaderStageNodeCreateInfoAMDX`
    public static VkPipelineShaderStageNodeCreateInfoAMDX allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pName, int index) {
        return alloc(allocator).sType(sType).pNext(pNext).pName(pName).index(index);
    }

    /// Allocates a `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pName `pName`
    /// @return the allocated `VkPipelineShaderStageNodeCreateInfoAMDX`
    public static VkPipelineShaderStageNodeCreateInfoAMDX allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pName) {
        return alloc(allocator).sType(sType).pNext(pNext).pName(pName);
    }

    /// Allocates a `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineShaderStageNodeCreateInfoAMDX`
    public static VkPipelineShaderStageNodeCreateInfoAMDX allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineShaderStageNodeCreateInfoAMDX` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineShaderStageNodeCreateInfoAMDX`
    public static VkPipelineShaderStageNodeCreateInfoAMDX allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX copyFrom(VkPipelineShaderStageNodeCreateInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineShaderStageNodeCreateInfoAMDX reinterpret(long count) { return new VkPipelineShaderStageNodeCreateInfoAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pName(MemorySegment segment, long index) { return (MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    public MemorySegment pName() { return pName(this.segment(), 0L); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pName(MemorySegment segment, long index, MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX pName(MemorySegment value) { pName(this.segment(), 0L, value); return this; }

    /// {@return `index` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int index(MemorySegment segment, long index) { return (int) VH_index.get(segment, 0L, index); }
    /// {@return `index`}
    public int index() { return index(this.segment(), 0L); }
    /// Sets `index` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void index(MemorySegment segment, long index, int value) { VH_index.set(segment, 0L, index, value); }
    /// Sets `index` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX index(int value) { index(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineShaderStageNodeCreateInfoAMDX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineShaderStageNodeCreateInfoAMDX`
    public VkPipelineShaderStageNodeCreateInfoAMDX asSlice(long index) { return new VkPipelineShaderStageNodeCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineShaderStageNodeCreateInfoAMDX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineShaderStageNodeCreateInfoAMDX`
    public VkPipelineShaderStageNodeCreateInfoAMDX asSlice(long index, long count) { return new VkPipelineShaderStageNodeCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineShaderStageNodeCreateInfoAMDX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX at(long index, Consumer<VkPipelineShaderStageNodeCreateInfoAMDX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNameAt(long index) { return pName(this.segment(), index); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX pNameAt(long index, MemorySegment value) { pName(this.segment(), index, value); return this; }

    /// {@return `index` at the given index}
    /// @param index the index of the struct buffer
    public int indexAt(long index) { return index(this.segment(), index); }
    /// Sets `index` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageNodeCreateInfoAMDX indexAt(long index, int value) { index(this.segment(), index, value); return this; }

}
