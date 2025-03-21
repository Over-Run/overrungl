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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkMicromapBuildSizesInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceSize micromapSize;
///     (uint64_t) VkDeviceSize buildScratchSize;
///     (uint32_t) VkBool32 discardable;
/// };
/// ```
public sealed class VkMicromapBuildSizesInfoEXT extends GroupType {
    /// The struct layout of `VkMicromapBuildSizesInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("micromapSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize"),
        ValueLayout.JAVA_INT.withName("discardable")
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
    /// The byte offset of `micromapSize`.
    public static final long OFFSET_micromapSize = LAYOUT.byteOffset(PathElement.groupElement("micromapSize"));
    /// The memory layout of `micromapSize`.
    public static final MemoryLayout LAYOUT_micromapSize = LAYOUT.select(PathElement.groupElement("micromapSize"));
    /// The [VarHandle] of `micromapSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_micromapSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapSize"));
    /// The byte offset of `buildScratchSize`.
    public static final long OFFSET_buildScratchSize = LAYOUT.byteOffset(PathElement.groupElement("buildScratchSize"));
    /// The memory layout of `buildScratchSize`.
    public static final MemoryLayout LAYOUT_buildScratchSize = LAYOUT.select(PathElement.groupElement("buildScratchSize"));
    /// The [VarHandle] of `buildScratchSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_buildScratchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buildScratchSize"));
    /// The byte offset of `discardable`.
    public static final long OFFSET_discardable = LAYOUT.byteOffset(PathElement.groupElement("discardable"));
    /// The memory layout of `discardable`.
    public static final MemoryLayout LAYOUT_discardable = LAYOUT.select(PathElement.groupElement("discardable"));
    /// The [VarHandle] of `discardable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_discardable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardable"));

    /// Creates `VkMicromapBuildSizesInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMicromapBuildSizesInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMicromapBuildSizesInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMicromapBuildSizesInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildSizesInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapBuildSizesInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkMicromapBuildSizesInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMicromapBuildSizesInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapBuildSizesInfoEXT`
    public static VkMicromapBuildSizesInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapBuildSizesInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMicromapBuildSizesInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapBuildSizesInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT copyFrom(VkMicromapBuildSizesInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkMicromapBuildSizesInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMicromapBuildSizesInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `micromapSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long micromapSize(MemorySegment segment, long index) { return (long) VH_micromapSize.get(segment, 0L, index); }
    /// {@return `micromapSize`}
    public long micromapSize() { return micromapSize(this.segment(), 0L); }
    /// Sets `micromapSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void micromapSize(MemorySegment segment, long index, long value) { VH_micromapSize.set(segment, 0L, index, value); }
    /// Sets `micromapSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT micromapSize(long value) { micromapSize(this.segment(), 0L, value); return this; }

    /// {@return `buildScratchSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long buildScratchSize(MemorySegment segment, long index) { return (long) VH_buildScratchSize.get(segment, 0L, index); }
    /// {@return `buildScratchSize`}
    public long buildScratchSize() { return buildScratchSize(this.segment(), 0L); }
    /// Sets `buildScratchSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void buildScratchSize(MemorySegment segment, long index, long value) { VH_buildScratchSize.set(segment, 0L, index, value); }
    /// Sets `buildScratchSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT buildScratchSize(long value) { buildScratchSize(this.segment(), 0L, value); return this; }

    /// {@return `discardable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int discardable(MemorySegment segment, long index) { return (int) VH_discardable.get(segment, 0L, index); }
    /// {@return `discardable`}
    public int discardable() { return discardable(this.segment(), 0L); }
    /// Sets `discardable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void discardable(MemorySegment segment, long index, int value) { VH_discardable.set(segment, 0L, index, value); }
    /// Sets `discardable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT discardable(int value) { discardable(this.segment(), 0L, value); return this; }

    /// A buffer of [VkMicromapBuildSizesInfoEXT].
    public static final class Buffer extends VkMicromapBuildSizesInfoEXT {
        private final long elementCount;

        /// Creates `VkMicromapBuildSizesInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMicromapBuildSizesInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMicromapBuildSizesInfoEXT`
        public VkMicromapBuildSizesInfoEXT asSlice(long index) { return new VkMicromapBuildSizesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMicromapBuildSizesInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMicromapBuildSizesInfoEXT`
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

        /// {@return `micromapSize` at the given index}
        /// @param index the index of the struct buffer
        public long micromapSizeAt(long index) { return micromapSize(this.segment(), index); }
        /// Sets `micromapSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer micromapSizeAt(long index, long value) { micromapSize(this.segment(), index, value); return this; }

        /// {@return `buildScratchSize` at the given index}
        /// @param index the index of the struct buffer
        public long buildScratchSizeAt(long index) { return buildScratchSize(this.segment(), index); }
        /// Sets `buildScratchSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer buildScratchSizeAt(long index, long value) { buildScratchSize(this.segment(), index, value); return this; }

        /// {@return `discardable` at the given index}
        /// @param index the index of the struct buffer
        public int discardableAt(long index) { return discardable(this.segment(), index); }
        /// Sets `discardable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer discardableAt(long index, int value) { discardable(this.segment(), index, value); return this; }

    }
}
