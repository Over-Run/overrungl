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
/// struct VkVideoDecodeH264CapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) StdVideoH264LevelIdc maxLevelIdc;
///     (struct VkOffset2D) VkOffset2D fieldOffsetGranularity;
/// };
/// ```
public sealed class VkVideoDecodeH264CapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeH264CapabilitiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("fieldOffsetGranularity")
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
    /// The byte offset of `maxLevelIdc`.
    public static final long OFFSET_maxLevelIdc = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
    /// The memory layout of `maxLevelIdc`.
    public static final MemoryLayout LAYOUT_maxLevelIdc = LAYOUT.select(PathElement.groupElement("maxLevelIdc"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    /// The byte offset of `fieldOffsetGranularity`.
    public static final long OFFSET_fieldOffsetGranularity = LAYOUT.byteOffset(PathElement.groupElement("fieldOffsetGranularity"));
    /// The memory layout of `fieldOffsetGranularity`.
    public static final MemoryLayout LAYOUT_fieldOffsetGranularity = LAYOUT.select(PathElement.groupElement("fieldOffsetGranularity"));

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH264CapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeH264CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264CapabilitiesKHR`
    public static VkVideoDecodeH264CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264CapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH264CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH264CapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR copyFrom(VkVideoDecodeH264CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoDecodeH264CapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH264CapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    public int maxLevelIdc() { return maxLevelIdc(this.segment(), 0L); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLevelIdc(MemorySegment segment, long index, int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR maxLevelIdc(int value) { maxLevelIdc(this.segment(), 0L, value); return this; }

    /// {@return `fieldOffsetGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment fieldOffsetGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fieldOffsetGranularity, index), LAYOUT_fieldOffsetGranularity); }
    /// {@return `fieldOffsetGranularity`}
    public MemorySegment fieldOffsetGranularity() { return fieldOffsetGranularity(this.segment(), 0L); }
    /// Sets `fieldOffsetGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fieldOffsetGranularity(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fieldOffsetGranularity, index), LAYOUT_fieldOffsetGranularity.byteSize()); }
    /// Sets `fieldOffsetGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity(MemorySegment value) { fieldOffsetGranularity(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoDecodeH264CapabilitiesKHR].
    public static final class Buffer extends VkVideoDecodeH264CapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeH264CapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeH264CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeH264CapabilitiesKHR`
        public VkVideoDecodeH264CapabilitiesKHR asSlice(long index) { return new VkVideoDecodeH264CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeH264CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeH264CapabilitiesKHR`
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

        /// {@return `maxLevelIdc` at the given index}
        /// @param index the index of the struct buffer
        public int maxLevelIdcAt(long index) { return maxLevelIdc(this.segment(), index); }
        /// Sets `maxLevelIdc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxLevelIdcAt(long index, int value) { maxLevelIdc(this.segment(), index, value); return this; }

        /// {@return `fieldOffsetGranularity` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment fieldOffsetGranularityAt(long index) { return fieldOffsetGranularity(this.segment(), index); }
        /// Sets `fieldOffsetGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fieldOffsetGranularityAt(long index, MemorySegment value) { fieldOffsetGranularity(this.segment(), index, value); return this; }

    }
}
