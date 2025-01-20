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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### pAttributes
/// [VarHandle][#VH_pAttributes] - [Getter][#pAttributes()] - [Setter][#pAttributes(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportFenceSciSyncInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     NvSciSyncAttrList pAttributes;
/// } VkExportFenceSciSyncInfoNV;
/// ```
public sealed class VkExportFenceSciSyncInfoNV extends Struct {
    /// The struct layout of `VkExportFenceSciSyncInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pAttributes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttributes"));

    /// Creates `VkExportFenceSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkExportFenceSciSyncInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportFenceSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportFenceSciSyncInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportFenceSciSyncInfoNV(segment); }

    /// Creates `VkExportFenceSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportFenceSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportFenceSciSyncInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportFenceSciSyncInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportFenceSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExportFenceSciSyncInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportFenceSciSyncInfoNV`
    public static VkExportFenceSciSyncInfoNV alloc(SegmentAllocator allocator) { return new VkExportFenceSciSyncInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportFenceSciSyncInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportFenceSciSyncInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportFenceSciSyncInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportFenceSciSyncInfoNV`
    public static VkExportFenceSciSyncInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("NvSciSyncAttrList") MemorySegment pAttributes) { return alloc(allocator).sType(sType).pNext(pNext).pAttributes(pAttributes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportFenceSciSyncInfoNV copyFrom(VkExportFenceSciSyncInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportFenceSciSyncInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportFenceSciSyncInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportFenceSciSyncInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportFenceSciSyncInfoNV sType(@CType("VkStructureType") int value) { VkExportFenceSciSyncInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkExportFenceSciSyncInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkExportFenceSciSyncInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkExportFenceSciSyncInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportFenceSciSyncInfoNV pNext(@CType("const void *") MemorySegment value) { VkExportFenceSciSyncInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `pAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("NvSciSyncAttrList") MemorySegment get_pAttributes(MemorySegment segment, long index) { return (MemorySegment) VH_pAttributes.get(segment, 0L, index); }
    /// {@return `pAttributes`}
    /// @param segment the segment of the struct
    public static @CType("NvSciSyncAttrList") MemorySegment get_pAttributes(MemorySegment segment) { return VkExportFenceSciSyncInfoNV.get_pAttributes(segment, 0L); }
    /// {@return `pAttributes`}
    public @CType("NvSciSyncAttrList") MemorySegment pAttributes() { return VkExportFenceSciSyncInfoNV.get_pAttributes(this.segment()); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttributes(MemorySegment segment, long index, @CType("NvSciSyncAttrList") MemorySegment value) { VH_pAttributes.set(segment, 0L, index, value); }
    /// Sets `pAttributes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttributes(MemorySegment segment, @CType("NvSciSyncAttrList") MemorySegment value) { VkExportFenceSciSyncInfoNV.set_pAttributes(segment, 0L, value); }
    /// Sets `pAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportFenceSciSyncInfoNV pAttributes(@CType("NvSciSyncAttrList") MemorySegment value) { VkExportFenceSciSyncInfoNV.set_pAttributes(this.segment(), value); return this; }

    /// A buffer of [VkExportFenceSciSyncInfoNV].
    public static final class Buffer extends VkExportFenceSciSyncInfoNV {
        private final long elementCount;

        /// Creates `VkExportFenceSciSyncInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExportFenceSciSyncInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExportFenceSciSyncInfoNV`
        public VkExportFenceSciSyncInfoNV asSlice(long index) { return new VkExportFenceSciSyncInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExportFenceSciSyncInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExportFenceSciSyncInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExportFenceSciSyncInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExportFenceSciSyncInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkExportFenceSciSyncInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkExportFenceSciSyncInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pAttributes` at the given index}
        /// @param index the index
        public @CType("NvSciSyncAttrList") MemorySegment pAttributesAt(long index) { return VkExportFenceSciSyncInfoNV.get_pAttributes(this.segment(), index); }
        /// Sets `pAttributes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAttributesAt(long index, @CType("NvSciSyncAttrList") MemorySegment value) { VkExportFenceSciSyncInfoNV.set_pAttributes(this.segment(), index, value); return this; }

    }
}
