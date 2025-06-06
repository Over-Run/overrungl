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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkExportMemoryWin32HandleInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const SECURITY_ATTRIBUTES* pAttributes;
///     (unsigned long) DWORD dwAccess;
///     (const wchar_t*) LPCWSTR name;
/// };
/// ```
public sealed class VkExportMemoryWin32HandleInfoKHR extends GroupType {
    /// The struct layout of `VkExportMemoryWin32HandleInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        CanonicalTypes.C_LONG.withName("dwAccess"),
        ValueLayout.ADDRESS.withName("name")
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
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));

    /// Creates `VkExportMemoryWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkExportMemoryWin32HandleInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMemoryWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMemoryWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMemoryWin32HandleInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkExportMemoryWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExportMemoryWin32HandleInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMemoryWin32HandleInfoKHR`
    public static VkExportMemoryWin32HandleInfoKHR alloc(SegmentAllocator allocator) { return new VkExportMemoryWin32HandleInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMemoryWin32HandleInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMemoryWin32HandleInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMemoryWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pAttributes `pAttributes`
    /// @param dwAccess `dwAccess`
    /// @param name `name`
    /// @return the allocated `VkExportMemoryWin32HandleInfoKHR`
    public static VkExportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pAttributes, long dwAccess, MemorySegment name) {
        return alloc(allocator).sType(sType).pNext(pNext).pAttributes(pAttributes).dwAccess(dwAccess).name(name);
    }

    /// Allocates a `VkExportMemoryWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pAttributes `pAttributes`
    /// @param dwAccess `dwAccess`
    /// @return the allocated `VkExportMemoryWin32HandleInfoKHR`
    public static VkExportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pAttributes, long dwAccess) {
        return alloc(allocator).sType(sType).pNext(pNext).pAttributes(pAttributes).dwAccess(dwAccess);
    }

    /// Allocates a `VkExportMemoryWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pAttributes `pAttributes`
    /// @return the allocated `VkExportMemoryWin32HandleInfoKHR`
    public static VkExportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pAttributes) {
        return alloc(allocator).sType(sType).pNext(pNext).pAttributes(pAttributes);
    }

    /// Allocates a `VkExportMemoryWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkExportMemoryWin32HandleInfoKHR`
    public static VkExportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkExportMemoryWin32HandleInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkExportMemoryWin32HandleInfoKHR`
    public static VkExportMemoryWin32HandleInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMemoryWin32HandleInfoKHR copyFrom(VkExportMemoryWin32HandleInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkExportMemoryWin32HandleInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExportMemoryWin32HandleInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkExportMemoryWin32HandleInfoKHR pAttributes(MemorySegment value) { pAttributes(this.segment(), 0L, value); return this; }

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
    public VkExportMemoryWin32HandleInfoKHR dwAccess(long value) { dwAccess(this.segment(), 0L, value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment name(MemorySegment segment, long index) { return (MemorySegment) VH_name.get(segment, 0L, index); }
    /// {@return `name`}
    public MemorySegment name() { return name(this.segment(), 0L); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void name(MemorySegment segment, long index, MemorySegment value) { VH_name.set(segment, 0L, index, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoKHR name(MemorySegment value) { name(this.segment(), 0L, value); return this; }

    /// A buffer of [VkExportMemoryWin32HandleInfoKHR].
    public static final class Buffer extends VkExportMemoryWin32HandleInfoKHR {
        private final long elementCount;

        /// Creates `VkExportMemoryWin32HandleInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExportMemoryWin32HandleInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExportMemoryWin32HandleInfoKHR`
        public VkExportMemoryWin32HandleInfoKHR asSlice(long index) { return new VkExportMemoryWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExportMemoryWin32HandleInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExportMemoryWin32HandleInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `pAttributes` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pAttributesAt(long index) { return pAttributes(this.segment(), index); }
        /// Sets `pAttributes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pAttributesAt(long index, MemorySegment value) { pAttributes(this.segment(), index, value); return this; }

        /// {@return `dwAccess` at the given index}
        /// @param index the index of the struct buffer
        public long dwAccessAt(long index) { return dwAccess(this.segment(), index); }
        /// Sets `dwAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dwAccessAt(long index, long value) { dwAccess(this.segment(), index, value); return this; }

        /// {@return `name` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment nameAt(long index) { return name(this.segment(), index); }
        /// Sets `name` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer nameAt(long index, MemorySegment value) { name(this.segment(), index, value); return this; }

    }
}
