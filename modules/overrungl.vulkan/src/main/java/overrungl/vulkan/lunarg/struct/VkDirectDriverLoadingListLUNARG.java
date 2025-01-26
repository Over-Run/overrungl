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
package overrungl.vulkan.lunarg.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDirectDriverLoadingListLUNARG {
///     VkStructureType sType;
///     const void* pNext;
///     VkDirectDriverLoadingModeLUNARG mode;
///     uint32_t driverCount;
///     const VkDirectDriverLoadingInfoLUNARG* pDrivers;
/// };
/// ```
public sealed class VkDirectDriverLoadingListLUNARG extends GroupType {
    /// The struct layout of `VkDirectDriverLoadingListLUNARG`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("driverCount"),
        ValueLayout.ADDRESS.withName("pDrivers")
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
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The byte offset of `driverCount`.
    public static final long OFFSET_driverCount = LAYOUT.byteOffset(PathElement.groupElement("driverCount"));
    /// The memory layout of `driverCount`.
    public static final MemoryLayout LAYOUT_driverCount = LAYOUT.select(PathElement.groupElement("driverCount"));
    /// The [VarHandle] of `driverCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_driverCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverCount"));
    /// The byte offset of `pDrivers`.
    public static final long OFFSET_pDrivers = LAYOUT.byteOffset(PathElement.groupElement("pDrivers"));
    /// The memory layout of `pDrivers`.
    public static final MemoryLayout LAYOUT_pDrivers = LAYOUT.select(PathElement.groupElement("pDrivers"));
    /// The [VarHandle] of `pDrivers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDrivers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrivers"));

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    /// @param segment the memory segment
    public VkDirectDriverLoadingListLUNARG(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingListLUNARG ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG alloc(SegmentAllocator allocator) { return new VkDirectDriverLoadingListLUNARG(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG copyFrom(VkDirectDriverLoadingListLUNARG src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDirectDriverLoadingListLUNARG sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDirectDriverLoadingListLUNARG pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// {@return `driverCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int driverCount(MemorySegment segment, long index) { return (int) VH_driverCount.get(segment, 0L, index); }
    /// {@return `driverCount`}
    public int driverCount() { return driverCount(this.segment(), 0L); }
    /// Sets `driverCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverCount(MemorySegment segment, long index, int value) { VH_driverCount.set(segment, 0L, index, value); }
    /// Sets `driverCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG driverCount(int value) { driverCount(this.segment(), 0L, value); return this; }

    /// {@return `pDrivers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDrivers(MemorySegment segment, long index) { return (MemorySegment) VH_pDrivers.get(segment, 0L, index); }
    /// {@return `pDrivers`}
    public MemorySegment pDrivers() { return pDrivers(this.segment(), 0L); }
    /// Sets `pDrivers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDrivers(MemorySegment segment, long index, MemorySegment value) { VH_pDrivers.set(segment, 0L, index, value); }
    /// Sets `pDrivers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG pDrivers(MemorySegment value) { pDrivers(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDirectDriverLoadingListLUNARG].
    public static final class Buffer extends VkDirectDriverLoadingListLUNARG {
        private final long elementCount;

        /// Creates `VkDirectDriverLoadingListLUNARG.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDirectDriverLoadingListLUNARG`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDirectDriverLoadingListLUNARG`
        public VkDirectDriverLoadingListLUNARG asSlice(long index) { return new VkDirectDriverLoadingListLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDirectDriverLoadingListLUNARG`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDirectDriverLoadingListLUNARG`
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

        /// {@return `mode` at the given index}
        /// @param index the index of the struct buffer
        public int modeAt(long index) { return mode(this.segment(), index); }
        /// Sets `mode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

        /// {@return `driverCount` at the given index}
        /// @param index the index of the struct buffer
        public int driverCountAt(long index) { return driverCount(this.segment(), index); }
        /// Sets `driverCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer driverCountAt(long index, int value) { driverCount(this.segment(), index, value); return this; }

        /// {@return `pDrivers` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDriversAt(long index) { return pDrivers(this.segment(), index); }
        /// Sets `pDrivers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDriversAt(long index, MemorySegment value) { pDrivers(this.segment(), index, value); return this; }

    }
}
