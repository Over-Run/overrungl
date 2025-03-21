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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSciSyncAttributesInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkSciSyncClientTypeNV clientType;
///     (int) VkSciSyncPrimitiveTypeNV primitiveType;
/// };
/// ```
public sealed class VkSciSyncAttributesInfoNV extends GroupType {
    /// The struct layout of `VkSciSyncAttributesInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clientType"),
        ValueLayout.JAVA_INT.withName("primitiveType")
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
    /// The byte offset of `clientType`.
    public static final long OFFSET_clientType = LAYOUT.byteOffset(PathElement.groupElement("clientType"));
    /// The memory layout of `clientType`.
    public static final MemoryLayout LAYOUT_clientType = LAYOUT.select(PathElement.groupElement("clientType"));
    /// The [VarHandle] of `clientType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clientType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clientType"));
    /// The byte offset of `primitiveType`.
    public static final long OFFSET_primitiveType = LAYOUT.byteOffset(PathElement.groupElement("primitiveType"));
    /// The memory layout of `primitiveType`.
    public static final MemoryLayout LAYOUT_primitiveType = LAYOUT.select(PathElement.groupElement("primitiveType"));
    /// The [VarHandle] of `primitiveType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveType"));

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkSciSyncAttributesInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSciSyncAttributesInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSciSyncAttributesInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSciSyncAttributesInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSciSyncAttributesInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSciSyncAttributesInfoNV`
    public static VkSciSyncAttributesInfoNV alloc(SegmentAllocator allocator) { return new VkSciSyncAttributesInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSciSyncAttributesInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSciSyncAttributesInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSciSyncAttributesInfoNV copyFrom(VkSciSyncAttributesInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkSciSyncAttributesInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSciSyncAttributesInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `clientType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clientType(MemorySegment segment, long index) { return (int) VH_clientType.get(segment, 0L, index); }
    /// {@return `clientType`}
    public int clientType() { return clientType(this.segment(), 0L); }
    /// Sets `clientType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clientType(MemorySegment segment, long index, int value) { VH_clientType.set(segment, 0L, index, value); }
    /// Sets `clientType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSciSyncAttributesInfoNV clientType(int value) { clientType(this.segment(), 0L, value); return this; }

    /// {@return `primitiveType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitiveType(MemorySegment segment, long index) { return (int) VH_primitiveType.get(segment, 0L, index); }
    /// {@return `primitiveType`}
    public int primitiveType() { return primitiveType(this.segment(), 0L); }
    /// Sets `primitiveType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveType(MemorySegment segment, long index, int value) { VH_primitiveType.set(segment, 0L, index, value); }
    /// Sets `primitiveType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSciSyncAttributesInfoNV primitiveType(int value) { primitiveType(this.segment(), 0L, value); return this; }

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

        /// {@return `clientType` at the given index}
        /// @param index the index of the struct buffer
        public int clientTypeAt(long index) { return clientType(this.segment(), index); }
        /// Sets `clientType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer clientTypeAt(long index, int value) { clientType(this.segment(), index, value); return this; }

        /// {@return `primitiveType` at the given index}
        /// @param index the index of the struct buffer
        public int primitiveTypeAt(long index) { return primitiveType(this.segment(), index); }
        /// Sets `primitiveType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primitiveTypeAt(long index, int value) { primitiveType(this.segment(), index, value); return this; }

    }
}
