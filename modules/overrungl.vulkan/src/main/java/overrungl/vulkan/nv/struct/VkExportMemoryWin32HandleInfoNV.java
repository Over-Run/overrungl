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
package overrungl.vulkan.nv.struct;

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
/// ### pAttributes
/// [VarHandle][#VH_pAttributes] - [Getter][#pAttributes()] - [Setter][#pAttributes(java.lang.foreign.MemorySegment)]
/// ### dwAccess
/// [VarHandle][#VH_dwAccess] - [Getter][#dwAccess()] - [Setter][#dwAccess(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportMemoryWin32HandleInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     const SECURITY_ATTRIBUTES * pAttributes;
///     DWORD dwAccess;
/// } VkExportMemoryWin32HandleInfoNV;
/// ```
public sealed class VkExportMemoryWin32HandleInfoNV extends Struct {
    /// The struct layout of `VkExportMemoryWin32HandleInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        ValueLayout.JAVA_INT.withName("dwAccess")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pAttributes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttributes"));
    /// The [VarHandle] of `dwAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dwAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dwAccess"));

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkExportMemoryWin32HandleInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMemoryWin32HandleInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoNV(segment); }

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMemoryWin32HandleInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMemoryWin32HandleInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportMemoryWin32HandleInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static VkExportMemoryWin32HandleInfoNV alloc(SegmentAllocator allocator) { return new VkExportMemoryWin32HandleInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMemoryWin32HandleInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMemoryWin32HandleInfoNV`
    public static VkExportMemoryWin32HandleInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment pAttributes, @CType("DWORD") int dwAccess) { return alloc(allocator).sType(sType).pNext(pNext).pAttributes(pAttributes).dwAccess(dwAccess); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV copyFrom(VkExportMemoryWin32HandleInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportMemoryWin32HandleInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportMemoryWin32HandleInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportMemoryWin32HandleInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV sType(@CType("VkStructureType") int value) { VkExportMemoryWin32HandleInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExportMemoryWin32HandleInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkExportMemoryWin32HandleInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMemoryWin32HandleInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMemoryWin32HandleInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `pAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment get_pAttributes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAttributes.get(segment, 0L, index); }
    /// {@return `pAttributes`}
    /// @param segment the segment of the struct
    public static @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment get_pAttributes(MemorySegment segment) { return VkExportMemoryWin32HandleInfoNV.get_pAttributes(segment, 0L); }
    /// {@return `pAttributes`}
    public @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment pAttributes() { return VkExportMemoryWin32HandleInfoNV.get_pAttributes(this.segment()); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttributes(MemorySegment segment, long index, @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment value) { VH_pAttributes.set(segment, 0L, index, value); }
    /// Sets `pAttributes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttributes(MemorySegment segment, @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment value) { VkExportMemoryWin32HandleInfoNV.set_pAttributes(segment, 0L, value); }
    /// Sets `pAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV pAttributes(@CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment value) { VkExportMemoryWin32HandleInfoNV.set_pAttributes(this.segment(), value); return this; }

    /// {@return `dwAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("DWORD") int get_dwAccess(MemorySegment segment, long index) { return (int) VH_dwAccess.get(segment, 0L, index); }
    /// {@return `dwAccess`}
    /// @param segment the segment of the struct
    public static @CType("DWORD") int get_dwAccess(MemorySegment segment) { return VkExportMemoryWin32HandleInfoNV.get_dwAccess(segment, 0L); }
    /// {@return `dwAccess`}
    public @CType("DWORD") int dwAccess() { return VkExportMemoryWin32HandleInfoNV.get_dwAccess(this.segment()); }
    /// Sets `dwAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dwAccess(MemorySegment segment, long index, @CType("DWORD") int value) { VH_dwAccess.set(segment, 0L, index, value); }
    /// Sets `dwAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dwAccess(MemorySegment segment, @CType("DWORD") int value) { VkExportMemoryWin32HandleInfoNV.set_dwAccess(segment, 0L, value); }
    /// Sets `dwAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMemoryWin32HandleInfoNV dwAccess(@CType("DWORD") int value) { VkExportMemoryWin32HandleInfoNV.set_dwAccess(this.segment(), value); return this; }

    /// A buffer of [VkExportMemoryWin32HandleInfoNV].
    public static final class Buffer extends VkExportMemoryWin32HandleInfoNV {
        private final long elementCount;

        /// Creates `VkExportMemoryWin32HandleInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExportMemoryWin32HandleInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExportMemoryWin32HandleInfoNV`
        public VkExportMemoryWin32HandleInfoNV asSlice(long index) { return new VkExportMemoryWin32HandleInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExportMemoryWin32HandleInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExportMemoryWin32HandleInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExportMemoryWin32HandleInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExportMemoryWin32HandleInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExportMemoryWin32HandleInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMemoryWin32HandleInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pAttributes` at the given index}
        /// @param index the index
        public @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment pAttributesAt(long index) { return VkExportMemoryWin32HandleInfoNV.get_pAttributes(this.segment(), index); }
        /// Sets `pAttributes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAttributesAt(long index, @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment value) { VkExportMemoryWin32HandleInfoNV.set_pAttributes(this.segment(), index, value); return this; }

        /// {@return `dwAccess` at the given index}
        /// @param index the index
        public @CType("DWORD") int dwAccessAt(long index) { return VkExportMemoryWin32HandleInfoNV.get_dwAccess(this.segment(), index); }
        /// Sets `dwAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dwAccessAt(long index, @CType("DWORD") int value) { VkExportMemoryWin32HandleInfoNV.set_dwAccess(this.segment(), index, value); return this; }

    }
}
