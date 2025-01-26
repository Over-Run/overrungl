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
/// struct VkOpticalFlowSessionCreatePrivateDataInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t id;
///     uint32_t size;
///     const void* pPrivateData;
/// };
/// ```
public sealed class VkOpticalFlowSessionCreatePrivateDataInfoNV extends GroupType {
    /// The struct layout of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pPrivateData")
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
    /// The byte offset of `id`.
    public static final long OFFSET_id = LAYOUT.byteOffset(PathElement.groupElement("id"));
    /// The memory layout of `id`.
    public static final MemoryLayout LAYOUT_id = LAYOUT.select(PathElement.groupElement("id"));
    /// The [VarHandle] of `id` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("id"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `pPrivateData`.
    public static final long OFFSET_pPrivateData = LAYOUT.byteOffset(PathElement.groupElement("pPrivateData"));
    /// The memory layout of `pPrivateData`.
    public static final MemoryLayout LAYOUT_pPrivateData = LAYOUT.select(PathElement.groupElement("pPrivateData"));
    /// The [VarHandle] of `pPrivateData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPrivateData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPrivateData"));

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV copyFrom(VkOpticalFlowSessionCreatePrivateDataInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `id` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int id(MemorySegment segment, long index) { return (int) VH_id.get(segment, 0L, index); }
    /// {@return `id`}
    public int id() { return id(this.segment(), 0L); }
    /// Sets `id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void id(MemorySegment segment, long index, int value) { VH_id.set(segment, 0L, index, value); }
    /// Sets `id` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV id(int value) { id(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public int size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV size(int value) { size(this.segment(), 0L, value); return this; }

    /// {@return `pPrivateData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPrivateData(MemorySegment segment, long index) { return (MemorySegment) VH_pPrivateData.get(segment, 0L, index); }
    /// {@return `pPrivateData`}
    public MemorySegment pPrivateData() { return pPrivateData(this.segment(), 0L); }
    /// Sets `pPrivateData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPrivateData(MemorySegment segment, long index, MemorySegment value) { VH_pPrivateData.set(segment, 0L, index, value); }
    /// Sets `pPrivateData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateData(MemorySegment value) { pPrivateData(this.segment(), 0L, value); return this; }

    /// A buffer of [VkOpticalFlowSessionCreatePrivateDataInfoNV].
    public static final class Buffer extends VkOpticalFlowSessionCreatePrivateDataInfoNV {
        private final long elementCount;

        /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`
        public VkOpticalFlowSessionCreatePrivateDataInfoNV asSlice(long index) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`
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

        /// {@return `id` at the given index}
        /// @param index the index of the struct buffer
        public int idAt(long index) { return id(this.segment(), index); }
        /// Sets `id` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer idAt(long index, int value) { id(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index of the struct buffer
        public int sizeAt(long index) { return size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, int value) { size(this.segment(), index, value); return this; }

        /// {@return `pPrivateData` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPrivateDataAt(long index) { return pPrivateData(this.segment(), index); }
        /// Sets `pPrivateData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPrivateDataAt(long index, MemorySegment value) { pPrivateData(this.segment(), index, value); return this; }

    }
}
