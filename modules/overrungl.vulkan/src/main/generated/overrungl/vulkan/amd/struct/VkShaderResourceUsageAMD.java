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
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkShaderResourceUsageAMD {
///     uint32_t numUsedVgprs;
///     uint32_t numUsedSgprs;
///     uint32_t ldsSizePerLocalWorkGroup;
///     size_t ldsUsageSizeInBytes;
///     size_t scratchMemUsageInBytes;
/// };
/// ```
public sealed class VkShaderResourceUsageAMD extends GroupType {
    /// The struct layout of `VkShaderResourceUsageAMD`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("numUsedVgprs"),
        ValueLayout.JAVA_INT.withName("numUsedSgprs"),
        ValueLayout.JAVA_INT.withName("ldsSizePerLocalWorkGroup"),
        CanonicalTypes.SIZE_T.withName("ldsUsageSizeInBytes"),
        CanonicalTypes.SIZE_T.withName("scratchMemUsageInBytes")
    );
    /// The byte offset of `numUsedVgprs`.
    public static final long OFFSET_numUsedVgprs = LAYOUT.byteOffset(PathElement.groupElement("numUsedVgprs"));
    /// The memory layout of `numUsedVgprs`.
    public static final MemoryLayout LAYOUT_numUsedVgprs = LAYOUT.select(PathElement.groupElement("numUsedVgprs"));
    /// The [VarHandle] of `numUsedVgprs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numUsedVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numUsedVgprs"));
    /// The byte offset of `numUsedSgprs`.
    public static final long OFFSET_numUsedSgprs = LAYOUT.byteOffset(PathElement.groupElement("numUsedSgprs"));
    /// The memory layout of `numUsedSgprs`.
    public static final MemoryLayout LAYOUT_numUsedSgprs = LAYOUT.select(PathElement.groupElement("numUsedSgprs"));
    /// The [VarHandle] of `numUsedSgprs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numUsedSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numUsedSgprs"));
    /// The byte offset of `ldsSizePerLocalWorkGroup`.
    public static final long OFFSET_ldsSizePerLocalWorkGroup = LAYOUT.byteOffset(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    /// The memory layout of `ldsSizePerLocalWorkGroup`.
    public static final MemoryLayout LAYOUT_ldsSizePerLocalWorkGroup = LAYOUT.select(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    /// The [VarHandle] of `ldsSizePerLocalWorkGroup` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ldsSizePerLocalWorkGroup = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    /// The byte offset of `ldsUsageSizeInBytes`.
    public static final long OFFSET_ldsUsageSizeInBytes = LAYOUT.byteOffset(PathElement.groupElement("ldsUsageSizeInBytes"));
    /// The memory layout of `ldsUsageSizeInBytes`.
    public static final MemoryLayout LAYOUT_ldsUsageSizeInBytes = LAYOUT.select(PathElement.groupElement("ldsUsageSizeInBytes"));
    /// The [VarHandle] of `ldsUsageSizeInBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ldsUsageSizeInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ldsUsageSizeInBytes"));
    /// The byte offset of `scratchMemUsageInBytes`.
    public static final long OFFSET_scratchMemUsageInBytes = LAYOUT.byteOffset(PathElement.groupElement("scratchMemUsageInBytes"));
    /// The memory layout of `scratchMemUsageInBytes`.
    public static final MemoryLayout LAYOUT_scratchMemUsageInBytes = LAYOUT.select(PathElement.groupElement("scratchMemUsageInBytes"));
    /// The [VarHandle] of `scratchMemUsageInBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scratchMemUsageInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchMemUsageInBytes"));

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    /// @param segment the memory segment
    public VkShaderResourceUsageAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderResourceUsageAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD alloc(SegmentAllocator allocator) { return new VkShaderResourceUsageAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param numUsedVgprs `numUsedVgprs`
    /// @param numUsedSgprs `numUsedSgprs`
    /// @param ldsSizePerLocalWorkGroup `ldsSizePerLocalWorkGroup`
    /// @param ldsUsageSizeInBytes `ldsUsageSizeInBytes`
    /// @param scratchMemUsageInBytes `scratchMemUsageInBytes`
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD allocInit(SegmentAllocator allocator, int numUsedVgprs, int numUsedSgprs, int ldsSizePerLocalWorkGroup, long ldsUsageSizeInBytes, long scratchMemUsageInBytes) {
        return alloc(allocator).numUsedVgprs(numUsedVgprs).numUsedSgprs(numUsedSgprs).ldsSizePerLocalWorkGroup(ldsSizePerLocalWorkGroup).ldsUsageSizeInBytes(ldsUsageSizeInBytes).scratchMemUsageInBytes(scratchMemUsageInBytes);
    }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param numUsedVgprs `numUsedVgprs`
    /// @param numUsedSgprs `numUsedSgprs`
    /// @param ldsSizePerLocalWorkGroup `ldsSizePerLocalWorkGroup`
    /// @param ldsUsageSizeInBytes `ldsUsageSizeInBytes`
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD allocInit(SegmentAllocator allocator, int numUsedVgprs, int numUsedSgprs, int ldsSizePerLocalWorkGroup, long ldsUsageSizeInBytes) {
        return alloc(allocator).numUsedVgprs(numUsedVgprs).numUsedSgprs(numUsedSgprs).ldsSizePerLocalWorkGroup(ldsSizePerLocalWorkGroup).ldsUsageSizeInBytes(ldsUsageSizeInBytes);
    }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param numUsedVgprs `numUsedVgprs`
    /// @param numUsedSgprs `numUsedSgprs`
    /// @param ldsSizePerLocalWorkGroup `ldsSizePerLocalWorkGroup`
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD allocInit(SegmentAllocator allocator, int numUsedVgprs, int numUsedSgprs, int ldsSizePerLocalWorkGroup) {
        return alloc(allocator).numUsedVgprs(numUsedVgprs).numUsedSgprs(numUsedSgprs).ldsSizePerLocalWorkGroup(ldsSizePerLocalWorkGroup);
    }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param numUsedVgprs `numUsedVgprs`
    /// @param numUsedSgprs `numUsedSgprs`
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD allocInit(SegmentAllocator allocator, int numUsedVgprs, int numUsedSgprs) {
        return alloc(allocator).numUsedVgprs(numUsedVgprs).numUsedSgprs(numUsedSgprs);
    }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param numUsedVgprs `numUsedVgprs`
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD allocInit(SegmentAllocator allocator, int numUsedVgprs) {
        return alloc(allocator).numUsedVgprs(numUsedVgprs);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderResourceUsageAMD copyFrom(VkShaderResourceUsageAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `numUsedVgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numUsedVgprs(MemorySegment segment, long index) { return (int) VH_numUsedVgprs.get(segment, 0L, index); }
    /// {@return `numUsedVgprs`}
    public int numUsedVgprs() { return numUsedVgprs(this.segment(), 0L); }
    /// Sets `numUsedVgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numUsedVgprs(MemorySegment segment, long index, int value) { VH_numUsedVgprs.set(segment, 0L, index, value); }
    /// Sets `numUsedVgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedVgprs(int value) { numUsedVgprs(this.segment(), 0L, value); return this; }

    /// {@return `numUsedSgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numUsedSgprs(MemorySegment segment, long index) { return (int) VH_numUsedSgprs.get(segment, 0L, index); }
    /// {@return `numUsedSgprs`}
    public int numUsedSgprs() { return numUsedSgprs(this.segment(), 0L); }
    /// Sets `numUsedSgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numUsedSgprs(MemorySegment segment, long index, int value) { VH_numUsedSgprs.set(segment, 0L, index, value); }
    /// Sets `numUsedSgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedSgprs(int value) { numUsedSgprs(this.segment(), 0L, value); return this; }

    /// {@return `ldsSizePerLocalWorkGroup` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int ldsSizePerLocalWorkGroup(MemorySegment segment, long index) { return (int) VH_ldsSizePerLocalWorkGroup.get(segment, 0L, index); }
    /// {@return `ldsSizePerLocalWorkGroup`}
    public int ldsSizePerLocalWorkGroup() { return ldsSizePerLocalWorkGroup(this.segment(), 0L); }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ldsSizePerLocalWorkGroup(MemorySegment segment, long index, int value) { VH_ldsSizePerLocalWorkGroup.set(segment, 0L, index, value); }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsSizePerLocalWorkGroup(int value) { ldsSizePerLocalWorkGroup(this.segment(), 0L, value); return this; }

    /// {@return `ldsUsageSizeInBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long ldsUsageSizeInBytes(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_ldsUsageSizeInBytes.get(segment, 0L, index)); }
    /// {@return `ldsUsageSizeInBytes`}
    public long ldsUsageSizeInBytes() { return ldsUsageSizeInBytes(this.segment(), 0L); }
    /// Sets `ldsUsageSizeInBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ldsUsageSizeInBytes(MemorySegment segment, long index, long value) { VH_ldsUsageSizeInBytes.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `ldsUsageSizeInBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsUsageSizeInBytes(long value) { ldsUsageSizeInBytes(this.segment(), 0L, value); return this; }

    /// {@return `scratchMemUsageInBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long scratchMemUsageInBytes(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_scratchMemUsageInBytes.get(segment, 0L, index)); }
    /// {@return `scratchMemUsageInBytes`}
    public long scratchMemUsageInBytes() { return scratchMemUsageInBytes(this.segment(), 0L); }
    /// Sets `scratchMemUsageInBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scratchMemUsageInBytes(MemorySegment segment, long index, long value) { VH_scratchMemUsageInBytes.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `scratchMemUsageInBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD scratchMemUsageInBytes(long value) { scratchMemUsageInBytes(this.segment(), 0L, value); return this; }

    /// A buffer of [VkShaderResourceUsageAMD].
    public static final class Buffer extends VkShaderResourceUsageAMD {
        private final long elementCount;

        /// Creates `VkShaderResourceUsageAMD.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkShaderResourceUsageAMD`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkShaderResourceUsageAMD`
        public VkShaderResourceUsageAMD asSlice(long index) { return new VkShaderResourceUsageAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkShaderResourceUsageAMD`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkShaderResourceUsageAMD`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `numUsedVgprs` at the given index}
        /// @param index the index of the struct buffer
        public int numUsedVgprsAt(long index) { return numUsedVgprs(this.segment(), index); }
        /// Sets `numUsedVgprs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer numUsedVgprsAt(long index, int value) { numUsedVgprs(this.segment(), index, value); return this; }

        /// {@return `numUsedSgprs` at the given index}
        /// @param index the index of the struct buffer
        public int numUsedSgprsAt(long index) { return numUsedSgprs(this.segment(), index); }
        /// Sets `numUsedSgprs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer numUsedSgprsAt(long index, int value) { numUsedSgprs(this.segment(), index, value); return this; }

        /// {@return `ldsSizePerLocalWorkGroup` at the given index}
        /// @param index the index of the struct buffer
        public int ldsSizePerLocalWorkGroupAt(long index) { return ldsSizePerLocalWorkGroup(this.segment(), index); }
        /// Sets `ldsSizePerLocalWorkGroup` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ldsSizePerLocalWorkGroupAt(long index, int value) { ldsSizePerLocalWorkGroup(this.segment(), index, value); return this; }

        /// {@return `ldsUsageSizeInBytes` at the given index}
        /// @param index the index of the struct buffer
        public long ldsUsageSizeInBytesAt(long index) { return ldsUsageSizeInBytes(this.segment(), index); }
        /// Sets `ldsUsageSizeInBytes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ldsUsageSizeInBytesAt(long index, long value) { ldsUsageSizeInBytes(this.segment(), index, value); return this; }

        /// {@return `scratchMemUsageInBytes` at the given index}
        /// @param index the index of the struct buffer
        public long scratchMemUsageInBytesAt(long index) { return scratchMemUsageInBytes(this.segment(), index); }
        /// Sets `scratchMemUsageInBytes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer scratchMemUsageInBytesAt(long index, long value) { scratchMemUsageInBytes(this.segment(), index, value); return this; }

    }
}
