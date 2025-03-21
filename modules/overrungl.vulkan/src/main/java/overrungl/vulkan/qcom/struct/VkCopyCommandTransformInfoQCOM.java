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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkCopyCommandTransformInfoQCOM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkSurfaceTransformFlagBitsKHR transform;
/// };
/// ```
public sealed class VkCopyCommandTransformInfoQCOM extends GroupType {
    /// The struct layout of `VkCopyCommandTransformInfoQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transform")
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
    /// The byte offset of `transform`.
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    /// The memory layout of `transform`.
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    /// The [VarHandle] of `transform` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));

    /// Creates `VkCopyCommandTransformInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkCopyCommandTransformInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyCommandTransformInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyCommandTransformInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyCommandTransformInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyCommandTransformInfoQCOM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkCopyCommandTransformInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyCommandTransformInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyCommandTransformInfoQCOM`
    public static VkCopyCommandTransformInfoQCOM alloc(SegmentAllocator allocator) { return new VkCopyCommandTransformInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyCommandTransformInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyCommandTransformInfoQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyCommandTransformInfoQCOM copyFrom(VkCopyCommandTransformInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkCopyCommandTransformInfoQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCopyCommandTransformInfoQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `transform` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transform(MemorySegment segment, long index) { return (int) VH_transform.get(segment, 0L, index); }
    /// {@return `transform`}
    public int transform() { return transform(this.segment(), 0L); }
    /// Sets `transform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transform(MemorySegment segment, long index, int value) { VH_transform.set(segment, 0L, index, value); }
    /// Sets `transform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyCommandTransformInfoQCOM transform(int value) { transform(this.segment(), 0L, value); return this; }

    /// A buffer of [VkCopyCommandTransformInfoQCOM].
    public static final class Buffer extends VkCopyCommandTransformInfoQCOM {
        private final long elementCount;

        /// Creates `VkCopyCommandTransformInfoQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCopyCommandTransformInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCopyCommandTransformInfoQCOM`
        public VkCopyCommandTransformInfoQCOM asSlice(long index) { return new VkCopyCommandTransformInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCopyCommandTransformInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCopyCommandTransformInfoQCOM`
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

        /// {@return `transform` at the given index}
        /// @param index the index of the struct buffer
        public int transformAt(long index) { return transform(this.segment(), index); }
        /// Sets `transform` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer transformAt(long index, int value) { transform(this.segment(), index, value); return this; }

    }
}
