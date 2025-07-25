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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDataGraphPipelineIdentifierCreateInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t identifierSize;
///     const uint8_t* pIdentifier;
/// };
/// ```
public final class VkDataGraphPipelineIdentifierCreateInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineIdentifierCreateInfoARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        ValueLayout.ADDRESS.withName("pIdentifier")
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
    /// The byte offset of `identifierSize`.
    public static final long OFFSET_identifierSize = LAYOUT.byteOffset(PathElement.groupElement("identifierSize"));
    /// The memory layout of `identifierSize`.
    public static final MemoryLayout LAYOUT_identifierSize = LAYOUT.select(PathElement.groupElement("identifierSize"));
    /// The [VarHandle] of `identifierSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_identifierSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifierSize"));
    /// The byte offset of `pIdentifier`.
    public static final long OFFSET_pIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pIdentifier"));
    /// The memory layout of `pIdentifier`.
    public static final MemoryLayout LAYOUT_pIdentifier = LAYOUT.select(PathElement.groupElement("pIdentifier"));
    /// The [VarHandle] of `pIdentifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIdentifier"));

    /// Creates `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineIdentifierCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineIdentifierCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineIdentifierCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineIdentifierCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineIdentifierCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineIdentifierCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineIdentifierCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineIdentifierCreateInfoARM`
    public static VkDataGraphPipelineIdentifierCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineIdentifierCreateInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineIdentifierCreateInfoARM`
    public static VkDataGraphPipelineIdentifierCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineIdentifierCreateInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param identifierSize `identifierSize`
    /// @param pIdentifier `pIdentifier`
    /// @return the allocated `VkDataGraphPipelineIdentifierCreateInfoARM`
    public static VkDataGraphPipelineIdentifierCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int identifierSize, MemorySegment pIdentifier) {
        return alloc(allocator).sType(sType).pNext(pNext).identifierSize(identifierSize).pIdentifier(pIdentifier);
    }

    /// Allocates a `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param identifierSize `identifierSize`
    /// @return the allocated `VkDataGraphPipelineIdentifierCreateInfoARM`
    public static VkDataGraphPipelineIdentifierCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int identifierSize) {
        return alloc(allocator).sType(sType).pNext(pNext).identifierSize(identifierSize);
    }

    /// Allocates a `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDataGraphPipelineIdentifierCreateInfoARM`
    public static VkDataGraphPipelineIdentifierCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDataGraphPipelineIdentifierCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDataGraphPipelineIdentifierCreateInfoARM`
    public static VkDataGraphPipelineIdentifierCreateInfoARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineIdentifierCreateInfoARM copyFrom(VkDataGraphPipelineIdentifierCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineIdentifierCreateInfoARM reinterpret(long count) { return new VkDataGraphPipelineIdentifierCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineIdentifierCreateInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineIdentifierCreateInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `identifierSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int identifierSize(MemorySegment segment, long index) { return (int) VH_identifierSize.get(segment, 0L, index); }
    /// {@return `identifierSize`}
    public int identifierSize() { return identifierSize(this.segment(), 0L); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void identifierSize(MemorySegment segment, long index, int value) { VH_identifierSize.set(segment, 0L, index, value); }
    /// Sets `identifierSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineIdentifierCreateInfoARM identifierSize(int value) { identifierSize(this.segment(), 0L, value); return this; }

    /// {@return `pIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pIdentifier(MemorySegment segment, long index) { return (MemorySegment) VH_pIdentifier.get(segment, 0L, index); }
    /// {@return `pIdentifier`}
    public MemorySegment pIdentifier() { return pIdentifier(this.segment(), 0L); }
    /// Sets `pIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pIdentifier(MemorySegment segment, long index, MemorySegment value) { VH_pIdentifier.set(segment, 0L, index, value); }
    /// Sets `pIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineIdentifierCreateInfoARM pIdentifier(MemorySegment value) { pIdentifier(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineIdentifierCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineIdentifierCreateInfoARM`
    public VkDataGraphPipelineIdentifierCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineIdentifierCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineIdentifierCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineIdentifierCreateInfoARM`
    public VkDataGraphPipelineIdentifierCreateInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineIdentifierCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineIdentifierCreateInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineIdentifierCreateInfoARM at(long index, Consumer<VkDataGraphPipelineIdentifierCreateInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineIdentifierCreateInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineIdentifierCreateInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `identifierSize` at the given index}
    /// @param index the index of the struct buffer
    public int identifierSizeAt(long index) { return identifierSize(this.segment(), index); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineIdentifierCreateInfoARM identifierSizeAt(long index, int value) { identifierSize(this.segment(), index, value); return this; }

    /// {@return `pIdentifier` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pIdentifierAt(long index) { return pIdentifier(this.segment(), index); }
    /// Sets `pIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineIdentifierCreateInfoARM pIdentifierAt(long index, MemorySegment value) { pIdentifier(this.segment(), index, value); return this; }

}
