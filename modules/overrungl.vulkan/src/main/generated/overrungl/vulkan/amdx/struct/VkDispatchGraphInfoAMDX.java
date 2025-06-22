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
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkDispatchGraphInfoAMDX {
///     uint32_t nodeIndex;
///     uint32_t payloadCount;
///     (union VkDeviceOrHostAddressConstAMDX) VkDeviceOrHostAddressConstAMDX payloads;
///     uint64_t payloadStride;
/// };
/// ```
public sealed class VkDispatchGraphInfoAMDX extends GroupType {
    /// The struct layout of `VkDispatchGraphInfoAMDX`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("nodeIndex"),
        ValueLayout.JAVA_INT.withName("payloadCount"),
        overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("payloads"),
        ValueLayout.JAVA_LONG.withName("payloadStride")
    );
    /// The byte offset of `nodeIndex`.
    public static final long OFFSET_nodeIndex = LAYOUT.byteOffset(PathElement.groupElement("nodeIndex"));
    /// The memory layout of `nodeIndex`.
    public static final MemoryLayout LAYOUT_nodeIndex = LAYOUT.select(PathElement.groupElement("nodeIndex"));
    /// The [VarHandle] of `nodeIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nodeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nodeIndex"));
    /// The byte offset of `payloadCount`.
    public static final long OFFSET_payloadCount = LAYOUT.byteOffset(PathElement.groupElement("payloadCount"));
    /// The memory layout of `payloadCount`.
    public static final MemoryLayout LAYOUT_payloadCount = LAYOUT.select(PathElement.groupElement("payloadCount"));
    /// The [VarHandle] of `payloadCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_payloadCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("payloadCount"));
    /// The byte offset of `payloads`.
    public static final long OFFSET_payloads = LAYOUT.byteOffset(PathElement.groupElement("payloads"));
    /// The memory layout of `payloads`.
    public static final MemoryLayout LAYOUT_payloads = LAYOUT.select(PathElement.groupElement("payloads"));
    /// The byte offset of `payloadStride`.
    public static final long OFFSET_payloadStride = LAYOUT.byteOffset(PathElement.groupElement("payloadStride"));
    /// The memory layout of `payloadStride`.
    public static final MemoryLayout LAYOUT_payloadStride = LAYOUT.select(PathElement.groupElement("payloadStride"));
    /// The [VarHandle] of `payloadStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_payloadStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("payloadStride"));

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    /// @param segment the memory segment
    public VkDispatchGraphInfoAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchGraphInfoAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchGraphInfoAMDX(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static VkDispatchGraphInfoAMDX alloc(SegmentAllocator allocator) { return new VkDispatchGraphInfoAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param nodeIndex `nodeIndex`
    /// @param payloadCount `payloadCount`
    /// @param payloads `payloads`
    /// @param payloadStride `payloadStride`
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static VkDispatchGraphInfoAMDX allocInit(SegmentAllocator allocator, int nodeIndex, int payloadCount, MemorySegment payloads, long payloadStride) {
        return alloc(allocator).nodeIndex(nodeIndex).payloadCount(payloadCount).payloads(payloads).payloadStride(payloadStride);
    }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param nodeIndex `nodeIndex`
    /// @param payloadCount `payloadCount`
    /// @param payloads `payloads`
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static VkDispatchGraphInfoAMDX allocInit(SegmentAllocator allocator, int nodeIndex, int payloadCount, MemorySegment payloads) {
        return alloc(allocator).nodeIndex(nodeIndex).payloadCount(payloadCount).payloads(payloads);
    }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param nodeIndex `nodeIndex`
    /// @param payloadCount `payloadCount`
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static VkDispatchGraphInfoAMDX allocInit(SegmentAllocator allocator, int nodeIndex, int payloadCount) {
        return alloc(allocator).nodeIndex(nodeIndex).payloadCount(payloadCount);
    }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param nodeIndex `nodeIndex`
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static VkDispatchGraphInfoAMDX allocInit(SegmentAllocator allocator, int nodeIndex) {
        return alloc(allocator).nodeIndex(nodeIndex);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDispatchGraphInfoAMDX copyFrom(VkDispatchGraphInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `nodeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nodeIndex(MemorySegment segment, long index) { return (int) VH_nodeIndex.get(segment, 0L, index); }
    /// {@return `nodeIndex`}
    public int nodeIndex() { return nodeIndex(this.segment(), 0L); }
    /// Sets `nodeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nodeIndex(MemorySegment segment, long index, int value) { VH_nodeIndex.set(segment, 0L, index, value); }
    /// Sets `nodeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphInfoAMDX nodeIndex(int value) { nodeIndex(this.segment(), 0L, value); return this; }

    /// {@return `payloadCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int payloadCount(MemorySegment segment, long index) { return (int) VH_payloadCount.get(segment, 0L, index); }
    /// {@return `payloadCount`}
    public int payloadCount() { return payloadCount(this.segment(), 0L); }
    /// Sets `payloadCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void payloadCount(MemorySegment segment, long index, int value) { VH_payloadCount.set(segment, 0L, index, value); }
    /// Sets `payloadCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphInfoAMDX payloadCount(int value) { payloadCount(this.segment(), 0L, value); return this; }

    /// {@return `payloads` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment payloads(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_payloads, index), LAYOUT_payloads); }
    /// {@return `payloads`}
    public MemorySegment payloads() { return payloads(this.segment(), 0L); }
    /// Sets `payloads` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void payloads(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_payloads, index), LAYOUT_payloads.byteSize()); }
    /// Sets `payloads` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphInfoAMDX payloads(MemorySegment value) { payloads(this.segment(), 0L, value); return this; }
    /// Accepts `payloads` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDispatchGraphInfoAMDX payloads(Consumer<overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX> func) { func.accept(overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.of(payloads())); return this; }

    /// {@return `payloadStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long payloadStride(MemorySegment segment, long index) { return (long) VH_payloadStride.get(segment, 0L, index); }
    /// {@return `payloadStride`}
    public long payloadStride() { return payloadStride(this.segment(), 0L); }
    /// Sets `payloadStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void payloadStride(MemorySegment segment, long index, long value) { VH_payloadStride.set(segment, 0L, index, value); }
    /// Sets `payloadStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphInfoAMDX payloadStride(long value) { payloadStride(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDispatchGraphInfoAMDX].
    public static final class Buffer extends VkDispatchGraphInfoAMDX {
        private final long elementCount;

        /// Creates `VkDispatchGraphInfoAMDX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDispatchGraphInfoAMDX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDispatchGraphInfoAMDX`
        public VkDispatchGraphInfoAMDX asSlice(long index) { return new VkDispatchGraphInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDispatchGraphInfoAMDX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDispatchGraphInfoAMDX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `nodeIndex` at the given index}
        /// @param index the index of the struct buffer
        public int nodeIndexAt(long index) { return nodeIndex(this.segment(), index); }
        /// Sets `nodeIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer nodeIndexAt(long index, int value) { nodeIndex(this.segment(), index, value); return this; }

        /// {@return `payloadCount` at the given index}
        /// @param index the index of the struct buffer
        public int payloadCountAt(long index) { return payloadCount(this.segment(), index); }
        /// Sets `payloadCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer payloadCountAt(long index, int value) { payloadCount(this.segment(), index, value); return this; }

        /// {@return `payloads` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment payloadsAt(long index) { return payloads(this.segment(), index); }
        /// Sets `payloads` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer payloadsAt(long index, MemorySegment value) { payloads(this.segment(), index, value); return this; }
        /// Accepts `payloads` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer payloadsAt(long index, Consumer<overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX> func) { func.accept(overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.of(payloadsAt(index))); return this; }

        /// {@return `payloadStride` at the given index}
        /// @param index the index of the struct buffer
        public long payloadStrideAt(long index) { return payloadStride(this.segment(), index); }
        /// Sets `payloadStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer payloadStrideAt(long index, long value) { payloadStride(this.segment(), index, value); return this; }

    }
}
