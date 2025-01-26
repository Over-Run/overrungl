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
/// struct VkPipelineCoverageToColorStateCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineCoverageToColorStateCreateFlagsNV flags;
///     (uint32_t) VkBool32 coverageToColorEnable;
///     uint32_t coverageToColorLocation;
/// };
/// ```
public sealed class VkPipelineCoverageToColorStateCreateInfoNV extends GroupType {
    /// The struct layout of `VkPipelineCoverageToColorStateCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageToColorEnable"),
        ValueLayout.JAVA_INT.withName("coverageToColorLocation")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `coverageToColorEnable`.
    public static final long OFFSET_coverageToColorEnable = LAYOUT.byteOffset(PathElement.groupElement("coverageToColorEnable"));
    /// The memory layout of `coverageToColorEnable`.
    public static final MemoryLayout LAYOUT_coverageToColorEnable = LAYOUT.select(PathElement.groupElement("coverageToColorEnable"));
    /// The [VarHandle] of `coverageToColorEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_coverageToColorEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageToColorEnable"));
    /// The byte offset of `coverageToColorLocation`.
    public static final long OFFSET_coverageToColorLocation = LAYOUT.byteOffset(PathElement.groupElement("coverageToColorLocation"));
    /// The memory layout of `coverageToColorLocation`.
    public static final MemoryLayout LAYOUT_coverageToColorLocation = LAYOUT.select(PathElement.groupElement("coverageToColorLocation"));
    /// The [VarHandle] of `coverageToColorLocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_coverageToColorLocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageToColorLocation"));

    /// Creates `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCoverageToColorStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageToColorStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageToColorStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCoverageToColorStateCreateInfoNV`
    public static VkPipelineCoverageToColorStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineCoverageToColorStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCoverageToColorStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCoverageToColorStateCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV copyFrom(VkPipelineCoverageToColorStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineCoverageToColorStateCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineCoverageToColorStateCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `coverageToColorEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int coverageToColorEnable(MemorySegment segment, long index) { return (int) VH_coverageToColorEnable.get(segment, 0L, index); }
    /// {@return `coverageToColorEnable`}
    public int coverageToColorEnable() { return coverageToColorEnable(this.segment(), 0L); }
    /// Sets `coverageToColorEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void coverageToColorEnable(MemorySegment segment, long index, int value) { VH_coverageToColorEnable.set(segment, 0L, index, value); }
    /// Sets `coverageToColorEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnable(int value) { coverageToColorEnable(this.segment(), 0L, value); return this; }

    /// {@return `coverageToColorLocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int coverageToColorLocation(MemorySegment segment, long index) { return (int) VH_coverageToColorLocation.get(segment, 0L, index); }
    /// {@return `coverageToColorLocation`}
    public int coverageToColorLocation() { return coverageToColorLocation(this.segment(), 0L); }
    /// Sets `coverageToColorLocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void coverageToColorLocation(MemorySegment segment, long index, int value) { VH_coverageToColorLocation.set(segment, 0L, index, value); }
    /// Sets `coverageToColorLocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocation(int value) { coverageToColorLocation(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineCoverageToColorStateCreateInfoNV].
    public static final class Buffer extends VkPipelineCoverageToColorStateCreateInfoNV {
        private final long elementCount;

        /// Creates `VkPipelineCoverageToColorStateCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineCoverageToColorStateCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineCoverageToColorStateCreateInfoNV`
        public VkPipelineCoverageToColorStateCreateInfoNV asSlice(long index) { return new VkPipelineCoverageToColorStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineCoverageToColorStateCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineCoverageToColorStateCreateInfoNV`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `coverageToColorEnable` at the given index}
        /// @param index the index of the struct buffer
        public int coverageToColorEnableAt(long index) { return coverageToColorEnable(this.segment(), index); }
        /// Sets `coverageToColorEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer coverageToColorEnableAt(long index, int value) { coverageToColorEnable(this.segment(), index, value); return this; }

        /// {@return `coverageToColorLocation` at the given index}
        /// @param index the index of the struct buffer
        public int coverageToColorLocationAt(long index) { return coverageToColorLocation(this.segment(), index); }
        /// Sets `coverageToColorLocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer coverageToColorLocationAt(long index, int value) { coverageToColorLocation(this.segment(), index, value); return this; }

    }
}
