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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkExportMemoryWin32HandleInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const SECURITY_ATTRIBUTES* pAttributes;
///     (unsigned long) DWORD dwAccess;
/// };
/// ```
public final class VkExportMemoryWin32HandleInfoNV extends GroupType {
    /// The struct layout of `VkExportMemoryWin32HandleInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        CanonicalTypes.C_LONG.withName("dwAccess")
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
    /// The byte offset of `pAttributes`.
    public static final long OFFSET_pAttributes = LAYOUT.byteOffset(PathElement.groupElement("pAttributes"));
    /// The memory layout of `pAttributes`.
    public static final MemoryLayout LAYOUT_pAttributes = LAYOUT.select(PathElement.groupElement("pAttributes"));
    /// The [VarHandle] of `pAttributes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttributes"));
    /// The byte offset of `dwAccess`.
    public static final long OFFSET_dwAccess = LAYOUT.byteOffset(PathElement.groupElement("dwAccess"));
    /// The memory layout of `dwAccess`.
    public static final MemoryLayout LAYOUT_dwAccess = LAYOUT.select(PathElement.groupElement("dwAccess"));
    /// The [VarHandle] of `dwAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dwAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dwAccess"));

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExportMemoryWin32HandleInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMemoryWin32HandleInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMemoryWin32HandleInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMemoryWin32HandleInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static VkExportMemoryWin32HandleInfoNV alloc(SegmentAllocator allocator) { return new VkExportMemoryWin32HandleInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static VkExportMemoryWin32HandleInfoNV alloc(SegmentAllocator allocator, long count) { return new VkExportMemoryWin32HandleInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pAttributes `pAttributes`
    /// @param dwAccess `dwAccess`
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static VkExportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pAttributes, long dwAccess) {
        return alloc(allocator).sType(sType).pNext(pNext).pAttributes(pAttributes).dwAccess(dwAccess);
    }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pAttributes `pAttributes`
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static VkExportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pAttributes) {
        return alloc(allocator).sType(sType).pNext(pNext).pAttributes(pAttributes);
    }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static VkExportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static VkExportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV copyFrom(VkExportMemoryWin32HandleInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExportMemoryWin32HandleInfoNV reinterpret(long count) { return new VkExportMemoryWin32HandleInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExportMemoryWin32HandleInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExportMemoryWin32HandleInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttributes(MemorySegment segment, long index) { return (MemorySegment) VH_pAttributes.get(segment, 0L, index); }
    /// {@return `pAttributes`}
    public MemorySegment pAttributes() { return pAttributes(this.segment(), 0L); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttributes(MemorySegment segment, long index, MemorySegment value) { VH_pAttributes.set(segment, 0L, index, value); }
    /// Sets `pAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV pAttributes(MemorySegment value) { pAttributes(this.segment(), 0L, value); return this; }

    /// {@return `dwAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dwAccess(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, VH_dwAccess.get(segment, 0L, index)); }
    /// {@return `dwAccess`}
    public long dwAccess() { return dwAccess(this.segment(), 0L); }
    /// Sets `dwAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dwAccess(MemorySegment segment, long index, long value) { VH_dwAccess.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.C_LONG, value)); }
    /// Sets `dwAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV dwAccess(long value) { dwAccess(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExportMemoryWin32HandleInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExportMemoryWin32HandleInfoNV`
    public VkExportMemoryWin32HandleInfoNV asSlice(long index) { return new VkExportMemoryWin32HandleInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExportMemoryWin32HandleInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExportMemoryWin32HandleInfoNV`
    public VkExportMemoryWin32HandleInfoNV asSlice(long index, long count) { return new VkExportMemoryWin32HandleInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExportMemoryWin32HandleInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV at(long index, Consumer<VkExportMemoryWin32HandleInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pAttributes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAttributesAt(long index) { return pAttributes(this.segment(), index); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV pAttributesAt(long index, MemorySegment value) { pAttributes(this.segment(), index, value); return this; }

    /// {@return `dwAccess` at the given index}
    /// @param index the index of the struct buffer
    public long dwAccessAt(long index) { return dwAccess(this.segment(), index); }
    /// Sets `dwAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV dwAccessAt(long index, long value) { dwAccess(this.segment(), index, value); return this; }

}
