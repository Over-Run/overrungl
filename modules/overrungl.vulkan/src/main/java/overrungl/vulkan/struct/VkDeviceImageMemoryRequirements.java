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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDeviceImageMemoryRequirements {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const VkImageCreateInfo* pCreateInfo;
///     (int) VkImageAspectFlagBits planeAspect;
/// };
/// ```
public sealed class VkDeviceImageMemoryRequirements extends GroupType {
    /// The struct layout of `VkDeviceImageMemoryRequirements`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pCreateInfo"),
        ValueLayout.JAVA_INT.withName("planeAspect")
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
    /// The byte offset of `pCreateInfo`.
    public static final long OFFSET_pCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
    /// The memory layout of `pCreateInfo`.
    public static final MemoryLayout LAYOUT_pCreateInfo = LAYOUT.select(PathElement.groupElement("pCreateInfo"));
    /// The [VarHandle] of `pCreateInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCreateInfo"));
    /// The byte offset of `planeAspect`.
    public static final long OFFSET_planeAspect = LAYOUT.byteOffset(PathElement.groupElement("planeAspect"));
    /// The memory layout of `planeAspect`.
    public static final MemoryLayout LAYOUT_planeAspect = LAYOUT.select(PathElement.groupElement("planeAspect"));
    /// The [VarHandle] of `planeAspect` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_planeAspect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeAspect"));

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    public VkDeviceImageMemoryRequirements(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageMemoryRequirements ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceImageMemoryRequirements(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceImageMemoryRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceImageMemoryRequirements`
    public static VkDeviceImageMemoryRequirements alloc(SegmentAllocator allocator) { return new VkDeviceImageMemoryRequirements(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceImageMemoryRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceImageMemoryRequirements`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceImageMemoryRequirements copyFrom(VkDeviceImageMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDeviceImageMemoryRequirements sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceImageMemoryRequirements pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCreateInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pCreateInfo.get(segment, 0L, index); }
    /// {@return `pCreateInfo`}
    public MemorySegment pCreateInfo() { return pCreateInfo(this.segment(), 0L); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCreateInfo(MemorySegment segment, long index, MemorySegment value) { VH_pCreateInfo.set(segment, 0L, index, value); }
    /// Sets `pCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageMemoryRequirements pCreateInfo(MemorySegment value) { pCreateInfo(this.segment(), 0L, value); return this; }

    /// {@return `planeAspect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int planeAspect(MemorySegment segment, long index) { return (int) VH_planeAspect.get(segment, 0L, index); }
    /// {@return `planeAspect`}
    public int planeAspect() { return planeAspect(this.segment(), 0L); }
    /// Sets `planeAspect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void planeAspect(MemorySegment segment, long index, int value) { VH_planeAspect.set(segment, 0L, index, value); }
    /// Sets `planeAspect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageMemoryRequirements planeAspect(int value) { planeAspect(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDeviceImageMemoryRequirements].
    public static final class Buffer extends VkDeviceImageMemoryRequirements {
        private final long elementCount;

        /// Creates `VkDeviceImageMemoryRequirements.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceImageMemoryRequirements`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceImageMemoryRequirements`
        public VkDeviceImageMemoryRequirements asSlice(long index) { return new VkDeviceImageMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceImageMemoryRequirements`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceImageMemoryRequirements`
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

        /// {@return `pCreateInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pCreateInfoAt(long index) { return pCreateInfo(this.segment(), index); }
        /// Sets `pCreateInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pCreateInfoAt(long index, MemorySegment value) { pCreateInfo(this.segment(), index, value); return this; }

        /// {@return `planeAspect` at the given index}
        /// @param index the index of the struct buffer
        public int planeAspectAt(long index) { return planeAspect(this.segment(), index); }
        /// Sets `planeAspect` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer planeAspectAt(long index, int value) { planeAspect(this.segment(), index, value); return this; }

    }
}
