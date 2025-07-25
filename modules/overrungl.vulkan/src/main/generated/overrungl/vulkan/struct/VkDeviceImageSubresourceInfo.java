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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDeviceImageSubresourceInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const VkImageCreateInfo* pCreateInfo;
///     const VkImageSubresource2* pSubresource;
/// };
/// ```
public final class VkDeviceImageSubresourceInfo extends GroupType {
    /// The struct layout of `VkDeviceImageSubresourceInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pCreateInfo"),
        ValueLayout.ADDRESS.withName("pSubresource")
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
    /// The byte offset of `pCreateInfo`.
    public static final long OFFSET_pCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
    /// The memory layout of `pCreateInfo`.
    public static final MemoryLayout LAYOUT_pCreateInfo = LAYOUT.select(PathElement.groupElement("pCreateInfo"));
    /// The [VarHandle] of `pCreateInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCreateInfo"));
    /// The byte offset of `pSubresource`.
    public static final long OFFSET_pSubresource = LAYOUT.byteOffset(PathElement.groupElement("pSubresource"));
    /// The memory layout of `pSubresource`.
    public static final MemoryLayout LAYOUT_pSubresource = LAYOUT.select(PathElement.groupElement("pSubresource"));
    /// The [VarHandle] of `pSubresource` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSubresource = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubresource"));

    /// Creates `VkDeviceImageSubresourceInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceImageSubresourceInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceImageSubresourceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageSubresourceInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceImageSubresourceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageSubresourceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceImageSubresourceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageSubresourceInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceImageSubresourceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceImageSubresourceInfo`
    public static VkDeviceImageSubresourceInfo alloc(SegmentAllocator allocator) { return new VkDeviceImageSubresourceInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceImageSubresourceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceImageSubresourceInfo`
    public static VkDeviceImageSubresourceInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceImageSubresourceInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceImageSubresourceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pCreateInfo `pCreateInfo`
    /// @param pSubresource `pSubresource`
    /// @return the allocated `VkDeviceImageSubresourceInfo`
    public static VkDeviceImageSubresourceInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pCreateInfo, MemorySegment pSubresource) {
        return alloc(allocator).sType(sType).pNext(pNext).pCreateInfo(pCreateInfo).pSubresource(pSubresource);
    }

    /// Allocates a `VkDeviceImageSubresourceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pCreateInfo `pCreateInfo`
    /// @return the allocated `VkDeviceImageSubresourceInfo`
    public static VkDeviceImageSubresourceInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pCreateInfo) {
        return alloc(allocator).sType(sType).pNext(pNext).pCreateInfo(pCreateInfo);
    }

    /// Allocates a `VkDeviceImageSubresourceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDeviceImageSubresourceInfo`
    public static VkDeviceImageSubresourceInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDeviceImageSubresourceInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDeviceImageSubresourceInfo`
    public static VkDeviceImageSubresourceInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceImageSubresourceInfo copyFrom(VkDeviceImageSubresourceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceImageSubresourceInfo reinterpret(long count) { return new VkDeviceImageSubresourceInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceImageSubresourceInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceImageSubresourceInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCreateInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pCreateInfo.get(segment, 0L, index); }
    /// {@return `pCreateInfo`}
    public MemorySegment pCreateInfo() { return pCreateInfo(this.segment(), 0L); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCreateInfo(MemorySegment segment, long index, MemorySegment value) { VH_pCreateInfo.set(segment, 0L, index, value); }
    /// Sets `pCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pCreateInfo(MemorySegment value) { pCreateInfo(this.segment(), 0L, value); return this; }

    /// {@return `pSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSubresource(MemorySegment segment, long index) { return (MemorySegment) VH_pSubresource.get(segment, 0L, index); }
    /// {@return `pSubresource`}
    public MemorySegment pSubresource() { return pSubresource(this.segment(), 0L); }
    /// Sets `pSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSubresource(MemorySegment segment, long index, MemorySegment value) { VH_pSubresource.set(segment, 0L, index, value); }
    /// Sets `pSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pSubresource(MemorySegment value) { pSubresource(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceImageSubresourceInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceImageSubresourceInfo`
    public VkDeviceImageSubresourceInfo asSlice(long index) { return new VkDeviceImageSubresourceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceImageSubresourceInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceImageSubresourceInfo`
    public VkDeviceImageSubresourceInfo asSlice(long index, long count) { return new VkDeviceImageSubresourceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceImageSubresourceInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceImageSubresourceInfo at(long index, Consumer<VkDeviceImageSubresourceInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pCreateInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCreateInfoAt(long index) { return pCreateInfo(this.segment(), index); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pCreateInfoAt(long index, MemorySegment value) { pCreateInfo(this.segment(), index, value); return this; }

    /// {@return `pSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSubresourceAt(long index) { return pSubresource(this.segment(), index); }
    /// Sets `pSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceImageSubresourceInfo pSubresourceAt(long index, MemorySegment value) { pSubresource(this.segment(), index, value); return this; }

}
