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
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBufferConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkBufferCreateInfo createInfo;
///     VkFormatFeatureFlags requiredFormatFeatures;
///     VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints;
/// };
/// ```
public sealed class VkBufferConstraintsInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkBufferConstraintsInfoFUCHSIA`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkBufferCreateInfo.LAYOUT.withName("createInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints")
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
    /// The byte offset of `createInfo`.
    public static final long OFFSET_createInfo = LAYOUT.byteOffset(PathElement.groupElement("createInfo"));
    /// The memory layout of `createInfo`.
    public static final MemoryLayout LAYOUT_createInfo = LAYOUT.select(PathElement.groupElement("createInfo"));
    /// The byte offset of `requiredFormatFeatures`.
    public static final long OFFSET_requiredFormatFeatures = LAYOUT.byteOffset(PathElement.groupElement("requiredFormatFeatures"));
    /// The memory layout of `requiredFormatFeatures`.
    public static final MemoryLayout LAYOUT_requiredFormatFeatures = LAYOUT.select(PathElement.groupElement("requiredFormatFeatures"));
    /// The [VarHandle] of `requiredFormatFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_requiredFormatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredFormatFeatures"));
    /// The byte offset of `bufferCollectionConstraints`.
    public static final long OFFSET_bufferCollectionConstraints = LAYOUT.byteOffset(PathElement.groupElement("bufferCollectionConstraints"));
    /// The memory layout of `bufferCollectionConstraints`.
    public static final MemoryLayout LAYOUT_bufferCollectionConstraints = LAYOUT.select(PathElement.groupElement("bufferCollectionConstraints"));

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkBufferConstraintsInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferConstraintsInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBufferConstraintsInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferConstraintsInfoFUCHSIA`
    public static VkBufferConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferConstraintsInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferConstraintsInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA copyFrom(VkBufferConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkBufferConstraintsInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBufferConstraintsInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `createInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment createInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_createInfo, index), LAYOUT_createInfo); }
    /// {@return `createInfo`}
    public MemorySegment createInfo() { return createInfo(this.segment(), 0L); }
    /// Sets `createInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void createInfo(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_createInfo, index), LAYOUT_createInfo.byteSize()); }
    /// Sets `createInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA createInfo(MemorySegment value) { createInfo(this.segment(), 0L, value); return this; }

    /// {@return `requiredFormatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiredFormatFeatures(MemorySegment segment, long index) { return (int) VH_requiredFormatFeatures.get(segment, 0L, index); }
    /// {@return `requiredFormatFeatures`}
    public int requiredFormatFeatures() { return requiredFormatFeatures(this.segment(), 0L); }
    /// Sets `requiredFormatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiredFormatFeatures(MemorySegment segment, long index, int value) { VH_requiredFormatFeatures.set(segment, 0L, index, value); }
    /// Sets `requiredFormatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA requiredFormatFeatures(int value) { requiredFormatFeatures(this.segment(), 0L, value); return this; }

    /// {@return `bufferCollectionConstraints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment bufferCollectionConstraints(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), LAYOUT_bufferCollectionConstraints); }
    /// {@return `bufferCollectionConstraints`}
    public MemorySegment bufferCollectionConstraints() { return bufferCollectionConstraints(this.segment(), 0L); }
    /// Sets `bufferCollectionConstraints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferCollectionConstraints(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), LAYOUT_bufferCollectionConstraints.byteSize()); }
    /// Sets `bufferCollectionConstraints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints(MemorySegment value) { bufferCollectionConstraints(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBufferConstraintsInfoFUCHSIA].
    public static final class Buffer extends VkBufferConstraintsInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkBufferConstraintsInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferConstraintsInfoFUCHSIA`
        public VkBufferConstraintsInfoFUCHSIA asSlice(long index) { return new VkBufferConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferConstraintsInfoFUCHSIA`
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

        /// {@return `createInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment createInfoAt(long index) { return createInfo(this.segment(), index); }
        /// Sets `createInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer createInfoAt(long index, MemorySegment value) { createInfo(this.segment(), index, value); return this; }

        /// {@return `requiredFormatFeatures` at the given index}
        /// @param index the index of the struct buffer
        public int requiredFormatFeaturesAt(long index) { return requiredFormatFeatures(this.segment(), index); }
        /// Sets `requiredFormatFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer requiredFormatFeaturesAt(long index, int value) { requiredFormatFeatures(this.segment(), index, value); return this; }

        /// {@return `bufferCollectionConstraints` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment bufferCollectionConstraintsAt(long index) { return bufferCollectionConstraints(this.segment(), index); }
        /// Sets `bufferCollectionConstraints` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bufferCollectionConstraintsAt(long index, MemorySegment value) { bufferCollectionConstraints(this.segment(), index, value); return this; }

    }
}
