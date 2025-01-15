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
/// ### clientType
/// [VarHandle][#VH_clientType] - [Getter][#clientType()] - [Setter][#clientType(int)]
/// ### primitiveType
/// [VarHandle][#VH_primitiveType] - [Getter][#primitiveType()] - [Setter][#primitiveType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSciSyncAttributesInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkSciSyncClientTypeNV clientType;
///     VkSciSyncPrimitiveTypeNV primitiveType;
/// } VkSciSyncAttributesInfoNV;
/// ```
public sealed class VkSciSyncAttributesInfoNV extends Struct {
    /// The struct layout of `VkSciSyncAttributesInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clientType"),
        ValueLayout.JAVA_INT.withName("primitiveType")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `clientType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_clientType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clientType"));
    /// The [VarHandle] of `primitiveType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveType"));

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkSciSyncAttributesInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSciSyncAttributesInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSciSyncAttributesInfoNV(segment); }

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSciSyncAttributesInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSciSyncAttributesInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSciSyncAttributesInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSciSyncAttributesInfoNV`
    public static VkSciSyncAttributesInfoNV alloc(SegmentAllocator allocator) { return new VkSciSyncAttributesInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSciSyncAttributesInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSciSyncAttributesInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSciSyncAttributesInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSciSyncAttributesInfoNV`
    public static VkSciSyncAttributesInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkSciSyncClientTypeNV") int clientType, @CType("VkSciSyncPrimitiveTypeNV") int primitiveType) { return alloc(allocator).sType(sType).pNext(pNext).clientType(clientType).primitiveType(primitiveType); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSciSyncAttributesInfoNV copyFrom(VkSciSyncAttributesInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSciSyncAttributesInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSciSyncAttributesInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSciSyncAttributesInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSciSyncAttributesInfoNV sType(@CType("VkStructureType") int value) { VkSciSyncAttributesInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSciSyncAttributesInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSciSyncAttributesInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSciSyncAttributesInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSciSyncAttributesInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSciSyncAttributesInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `clientType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSciSyncClientTypeNV") int get_clientType(MemorySegment segment, long index) { return (int) VH_clientType.get(segment, 0L, index); }
    /// {@return `clientType`}
    /// @param segment the segment of the struct
    public static @CType("VkSciSyncClientTypeNV") int get_clientType(MemorySegment segment) { return VkSciSyncAttributesInfoNV.get_clientType(segment, 0L); }
    /// {@return `clientType`}
    public @CType("VkSciSyncClientTypeNV") int clientType() { return VkSciSyncAttributesInfoNV.get_clientType(this.segment()); }
    /// Sets `clientType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_clientType(MemorySegment segment, long index, @CType("VkSciSyncClientTypeNV") int value) { VH_clientType.set(segment, 0L, index, value); }
    /// Sets `clientType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_clientType(MemorySegment segment, @CType("VkSciSyncClientTypeNV") int value) { VkSciSyncAttributesInfoNV.set_clientType(segment, 0L, value); }
    /// Sets `clientType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSciSyncAttributesInfoNV clientType(@CType("VkSciSyncClientTypeNV") int value) { VkSciSyncAttributesInfoNV.set_clientType(this.segment(), value); return this; }

    /// {@return `primitiveType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSciSyncPrimitiveTypeNV") int get_primitiveType(MemorySegment segment, long index) { return (int) VH_primitiveType.get(segment, 0L, index); }
    /// {@return `primitiveType`}
    /// @param segment the segment of the struct
    public static @CType("VkSciSyncPrimitiveTypeNV") int get_primitiveType(MemorySegment segment) { return VkSciSyncAttributesInfoNV.get_primitiveType(segment, 0L); }
    /// {@return `primitiveType`}
    public @CType("VkSciSyncPrimitiveTypeNV") int primitiveType() { return VkSciSyncAttributesInfoNV.get_primitiveType(this.segment()); }
    /// Sets `primitiveType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveType(MemorySegment segment, long index, @CType("VkSciSyncPrimitiveTypeNV") int value) { VH_primitiveType.set(segment, 0L, index, value); }
    /// Sets `primitiveType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveType(MemorySegment segment, @CType("VkSciSyncPrimitiveTypeNV") int value) { VkSciSyncAttributesInfoNV.set_primitiveType(segment, 0L, value); }
    /// Sets `primitiveType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSciSyncAttributesInfoNV primitiveType(@CType("VkSciSyncPrimitiveTypeNV") int value) { VkSciSyncAttributesInfoNV.set_primitiveType(this.segment(), value); return this; }

    /// A buffer of [VkSciSyncAttributesInfoNV].
    public static final class Buffer extends VkSciSyncAttributesInfoNV {
        private final long elementCount;

        /// Creates `VkSciSyncAttributesInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSciSyncAttributesInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSciSyncAttributesInfoNV`
        public VkSciSyncAttributesInfoNV asSlice(long index) { return new VkSciSyncAttributesInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSciSyncAttributesInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSciSyncAttributesInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSciSyncAttributesInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSciSyncAttributesInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSciSyncAttributesInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSciSyncAttributesInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `clientType` at the given index}
        /// @param index the index
        public @CType("VkSciSyncClientTypeNV") int clientTypeAt(long index) { return VkSciSyncAttributesInfoNV.get_clientType(this.segment(), index); }
        /// Sets `clientType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer clientTypeAt(long index, @CType("VkSciSyncClientTypeNV") int value) { VkSciSyncAttributesInfoNV.set_clientType(this.segment(), index, value); return this; }

        /// {@return `primitiveType` at the given index}
        /// @param index the index
        public @CType("VkSciSyncPrimitiveTypeNV") int primitiveTypeAt(long index) { return VkSciSyncAttributesInfoNV.get_primitiveType(this.segment(), index); }
        /// Sets `primitiveType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitiveTypeAt(long index, @CType("VkSciSyncPrimitiveTypeNV") int value) { VkSciSyncAttributesInfoNV.set_primitiveType(this.segment(), index, value); return this; }

    }
}
