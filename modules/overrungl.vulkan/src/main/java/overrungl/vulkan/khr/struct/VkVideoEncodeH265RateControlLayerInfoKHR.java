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
/// struct VkVideoEncodeH265RateControlLayerInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 useMinQp;
///     (struct VkVideoEncodeH265QpKHR) VkVideoEncodeH265QpKHR minQp;
///     (uint32_t) VkBool32 useMaxQp;
///     (struct VkVideoEncodeH265QpKHR) VkVideoEncodeH265QpKHR maxQp;
///     (uint32_t) VkBool32 useMaxFrameSize;
///     (struct VkVideoEncodeH265FrameSizeKHR) VkVideoEncodeH265FrameSizeKHR maxFrameSize;
/// };
/// ```
public sealed class VkVideoEncodeH265RateControlLayerInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265RateControlLayerInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMinQp"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH265QpKHR.LAYOUT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("useMaxQp"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH265QpKHR.LAYOUT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("useMaxFrameSize"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH265FrameSizeKHR.LAYOUT.withName("maxFrameSize")
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
    /// The byte offset of `useMinQp`.
    public static final long OFFSET_useMinQp = LAYOUT.byteOffset(PathElement.groupElement("useMinQp"));
    /// The memory layout of `useMinQp`.
    public static final MemoryLayout LAYOUT_useMinQp = LAYOUT.select(PathElement.groupElement("useMinQp"));
    /// The [VarHandle] of `useMinQp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_useMinQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMinQp"));
    /// The byte offset of `minQp`.
    public static final long OFFSET_minQp = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
    /// The memory layout of `minQp`.
    public static final MemoryLayout LAYOUT_minQp = LAYOUT.select(PathElement.groupElement("minQp"));
    /// The byte offset of `useMaxQp`.
    public static final long OFFSET_useMaxQp = LAYOUT.byteOffset(PathElement.groupElement("useMaxQp"));
    /// The memory layout of `useMaxQp`.
    public static final MemoryLayout LAYOUT_useMaxQp = LAYOUT.select(PathElement.groupElement("useMaxQp"));
    /// The [VarHandle] of `useMaxQp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_useMaxQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxQp"));
    /// The byte offset of `maxQp`.
    public static final long OFFSET_maxQp = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
    /// The memory layout of `maxQp`.
    public static final MemoryLayout LAYOUT_maxQp = LAYOUT.select(PathElement.groupElement("maxQp"));
    /// The byte offset of `useMaxFrameSize`.
    public static final long OFFSET_useMaxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("useMaxFrameSize"));
    /// The memory layout of `useMaxFrameSize`.
    public static final MemoryLayout LAYOUT_useMaxFrameSize = LAYOUT.select(PathElement.groupElement("useMaxFrameSize"));
    /// The [VarHandle] of `useMaxFrameSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_useMaxFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxFrameSize"));
    /// The byte offset of `maxFrameSize`.
    public static final long OFFSET_maxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("maxFrameSize"));
    /// The memory layout of `maxFrameSize`.
    public static final MemoryLayout LAYOUT_maxFrameSize = LAYOUT.select(PathElement.groupElement("maxFrameSize"));

    /// Creates `VkVideoEncodeH265RateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265RateControlLayerInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265RateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265RateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265RateControlLayerInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265RateControlLayerInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeH265RateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265RateControlLayerInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265RateControlLayerInfoKHR`
    public static VkVideoEncodeH265RateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265RateControlLayerInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265RateControlLayerInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265RateControlLayerInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265RateControlLayerInfoKHR copyFrom(VkVideoEncodeH265RateControlLayerInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH265RateControlLayerInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265RateControlLayerInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `useMinQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int useMinQp(MemorySegment segment, long index) { return (int) VH_useMinQp.get(segment, 0L, index); }
    /// {@return `useMinQp`}
    public int useMinQp() { return useMinQp(this.segment(), 0L); }
    /// Sets `useMinQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void useMinQp(MemorySegment segment, long index, int value) { VH_useMinQp.set(segment, 0L, index, value); }
    /// Sets `useMinQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlLayerInfoKHR useMinQp(int value) { useMinQp(this.segment(), 0L, value); return this; }

    /// {@return `minQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minQp(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minQp, index), LAYOUT_minQp); }
    /// {@return `minQp`}
    public MemorySegment minQp() { return minQp(this.segment(), 0L); }
    /// Sets `minQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minQp(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minQp, index), LAYOUT_minQp.byteSize()); }
    /// Sets `minQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlLayerInfoKHR minQp(MemorySegment value) { minQp(this.segment(), 0L, value); return this; }

    /// {@return `useMaxQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int useMaxQp(MemorySegment segment, long index) { return (int) VH_useMaxQp.get(segment, 0L, index); }
    /// {@return `useMaxQp`}
    public int useMaxQp() { return useMaxQp(this.segment(), 0L); }
    /// Sets `useMaxQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void useMaxQp(MemorySegment segment, long index, int value) { VH_useMaxQp.set(segment, 0L, index, value); }
    /// Sets `useMaxQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlLayerInfoKHR useMaxQp(int value) { useMaxQp(this.segment(), 0L, value); return this; }

    /// {@return `maxQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxQp(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxQp, index), LAYOUT_maxQp); }
    /// {@return `maxQp`}
    public MemorySegment maxQp() { return maxQp(this.segment(), 0L); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQp(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxQp, index), LAYOUT_maxQp.byteSize()); }
    /// Sets `maxQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlLayerInfoKHR maxQp(MemorySegment value) { maxQp(this.segment(), 0L, value); return this; }

    /// {@return `useMaxFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int useMaxFrameSize(MemorySegment segment, long index) { return (int) VH_useMaxFrameSize.get(segment, 0L, index); }
    /// {@return `useMaxFrameSize`}
    public int useMaxFrameSize() { return useMaxFrameSize(this.segment(), 0L); }
    /// Sets `useMaxFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void useMaxFrameSize(MemorySegment segment, long index, int value) { VH_useMaxFrameSize.set(segment, 0L, index, value); }
    /// Sets `useMaxFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlLayerInfoKHR useMaxFrameSize(int value) { useMaxFrameSize(this.segment(), 0L, value); return this; }

    /// {@return `maxFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxFrameSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFrameSize, index), LAYOUT_maxFrameSize); }
    /// {@return `maxFrameSize`}
    public MemorySegment maxFrameSize() { return maxFrameSize(this.segment(), 0L); }
    /// Sets `maxFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFrameSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFrameSize, index), LAYOUT_maxFrameSize.byteSize()); }
    /// Sets `maxFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265RateControlLayerInfoKHR maxFrameSize(MemorySegment value) { maxFrameSize(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH265RateControlLayerInfoKHR].
    public static final class Buffer extends VkVideoEncodeH265RateControlLayerInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH265RateControlLayerInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH265RateControlLayerInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH265RateControlLayerInfoKHR`
        public VkVideoEncodeH265RateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeH265RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH265RateControlLayerInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH265RateControlLayerInfoKHR`
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

        /// {@return `useMinQp` at the given index}
        /// @param index the index of the struct buffer
        public int useMinQpAt(long index) { return useMinQp(this.segment(), index); }
        /// Sets `useMinQp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer useMinQpAt(long index, int value) { useMinQp(this.segment(), index, value); return this; }

        /// {@return `minQp` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment minQpAt(long index) { return minQp(this.segment(), index); }
        /// Sets `minQp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minQpAt(long index, MemorySegment value) { minQp(this.segment(), index, value); return this; }

        /// {@return `useMaxQp` at the given index}
        /// @param index the index of the struct buffer
        public int useMaxQpAt(long index) { return useMaxQp(this.segment(), index); }
        /// Sets `useMaxQp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer useMaxQpAt(long index, int value) { useMaxQp(this.segment(), index, value); return this; }

        /// {@return `maxQp` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxQpAt(long index) { return maxQp(this.segment(), index); }
        /// Sets `maxQp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxQpAt(long index, MemorySegment value) { maxQp(this.segment(), index, value); return this; }

        /// {@return `useMaxFrameSize` at the given index}
        /// @param index the index of the struct buffer
        public int useMaxFrameSizeAt(long index) { return useMaxFrameSize(this.segment(), index); }
        /// Sets `useMaxFrameSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer useMaxFrameSizeAt(long index, int value) { useMaxFrameSize(this.segment(), index, value); return this; }

        /// {@return `maxFrameSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxFrameSizeAt(long index) { return maxFrameSize(this.segment(), index); }
        /// Sets `maxFrameSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxFrameSizeAt(long index, MemorySegment value) { maxFrameSize(this.segment(), index, value); return this; }

    }
}
