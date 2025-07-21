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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkTileMemoryRequirementsQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize size;
///     (uint64_t) VkDeviceSize alignment;
/// };
/// ```
public final class VkTileMemoryRequirementsQCOM extends GroupType {
    /// The struct layout of `VkTileMemoryRequirementsQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("alignment")
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
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `alignment`.
    public static final long OFFSET_alignment = LAYOUT.byteOffset(PathElement.groupElement("alignment"));
    /// The memory layout of `alignment`.
    public static final MemoryLayout LAYOUT_alignment = LAYOUT.select(PathElement.groupElement("alignment"));
    /// The [VarHandle] of `alignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alignment"));

    /// Creates `VkTileMemoryRequirementsQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTileMemoryRequirementsQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTileMemoryRequirementsQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTileMemoryRequirementsQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemoryRequirementsQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTileMemoryRequirementsQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTileMemoryRequirementsQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemoryRequirementsQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTileMemoryRequirementsQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTileMemoryRequirementsQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTileMemoryRequirementsQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTileMemoryRequirementsQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTileMemoryRequirementsQCOM`
    public static VkTileMemoryRequirementsQCOM alloc(SegmentAllocator allocator) { return new VkTileMemoryRequirementsQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTileMemoryRequirementsQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTileMemoryRequirementsQCOM`
    public static VkTileMemoryRequirementsQCOM alloc(SegmentAllocator allocator, long count) { return new VkTileMemoryRequirementsQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkTileMemoryRequirementsQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param size `size`
    /// @param alignment `alignment`
    /// @return the allocated `VkTileMemoryRequirementsQCOM`
    public static VkTileMemoryRequirementsQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long size, long alignment) {
        return alloc(allocator).sType(sType).pNext(pNext).size(size).alignment(alignment);
    }

    /// Allocates a `VkTileMemoryRequirementsQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param size `size`
    /// @return the allocated `VkTileMemoryRequirementsQCOM`
    public static VkTileMemoryRequirementsQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long size) {
        return alloc(allocator).sType(sType).pNext(pNext).size(size);
    }

    /// Allocates a `VkTileMemoryRequirementsQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkTileMemoryRequirementsQCOM`
    public static VkTileMemoryRequirementsQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkTileMemoryRequirementsQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkTileMemoryRequirementsQCOM`
    public static VkTileMemoryRequirementsQCOM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTileMemoryRequirementsQCOM copyFrom(VkTileMemoryRequirementsQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTileMemoryRequirementsQCOM reinterpret(long count) { return new VkTileMemoryRequirementsQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkTileMemoryRequirementsQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTileMemoryRequirementsQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTileMemoryRequirementsQCOM size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `alignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long alignment(MemorySegment segment, long index) { return (long) VH_alignment.get(segment, 0L, index); }
    /// {@return `alignment`}
    public long alignment() { return alignment(this.segment(), 0L); }
    /// Sets `alignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alignment(MemorySegment segment, long index, long value) { VH_alignment.set(segment, 0L, index, value); }
    /// Sets `alignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTileMemoryRequirementsQCOM alignment(long value) { alignment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTileMemoryRequirementsQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTileMemoryRequirementsQCOM`
    public VkTileMemoryRequirementsQCOM asSlice(long index) { return new VkTileMemoryRequirementsQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTileMemoryRequirementsQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTileMemoryRequirementsQCOM`
    public VkTileMemoryRequirementsQCOM asSlice(long index, long count) { return new VkTileMemoryRequirementsQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTileMemoryRequirementsQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTileMemoryRequirementsQCOM at(long index, Consumer<VkTileMemoryRequirementsQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTileMemoryRequirementsQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTileMemoryRequirementsQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTileMemoryRequirementsQCOM sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `alignment` at the given index}
    /// @param index the index of the struct buffer
    public long alignmentAt(long index) { return alignment(this.segment(), index); }
    /// Sets `alignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTileMemoryRequirementsQCOM alignmentAt(long index, long value) { alignment(this.segment(), index, value); return this; }

}
