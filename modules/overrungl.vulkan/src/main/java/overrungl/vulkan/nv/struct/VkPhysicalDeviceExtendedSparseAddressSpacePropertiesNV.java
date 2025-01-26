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
/// struct VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize extendedSparseAddressSpaceSize;
///     ((uint32_t) VkFlags) VkImageUsageFlags extendedSparseImageUsageFlags;
///     ((uint32_t) VkFlags) VkBufferUsageFlags extendedSparseBufferUsageFlags;
/// };
/// ```
public sealed class VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("extendedSparseAddressSpaceSize"),
        ValueLayout.JAVA_INT.withName("extendedSparseImageUsageFlags"),
        ValueLayout.JAVA_INT.withName("extendedSparseBufferUsageFlags")
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
    /// The byte offset of `extendedSparseAddressSpaceSize`.
    public static final long OFFSET_extendedSparseAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseAddressSpaceSize"));
    /// The memory layout of `extendedSparseAddressSpaceSize`.
    public static final MemoryLayout LAYOUT_extendedSparseAddressSpaceSize = LAYOUT.select(PathElement.groupElement("extendedSparseAddressSpaceSize"));
    /// The [VarHandle] of `extendedSparseAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedSparseAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseAddressSpaceSize"));
    /// The byte offset of `extendedSparseImageUsageFlags`.
    public static final long OFFSET_extendedSparseImageUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseImageUsageFlags"));
    /// The memory layout of `extendedSparseImageUsageFlags`.
    public static final MemoryLayout LAYOUT_extendedSparseImageUsageFlags = LAYOUT.select(PathElement.groupElement("extendedSparseImageUsageFlags"));
    /// The [VarHandle] of `extendedSparseImageUsageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedSparseImageUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseImageUsageFlags"));
    /// The byte offset of `extendedSparseBufferUsageFlags`.
    public static final long OFFSET_extendedSparseBufferUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseBufferUsageFlags"));
    /// The memory layout of `extendedSparseBufferUsageFlags`.
    public static final MemoryLayout LAYOUT_extendedSparseBufferUsageFlags = LAYOUT.select(PathElement.groupElement("extendedSparseBufferUsageFlags"));
    /// The [VarHandle] of `extendedSparseBufferUsageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedSparseBufferUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseBufferUsageFlags"));

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV copyFrom(VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `extendedSparseAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long extendedSparseAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_extendedSparseAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `extendedSparseAddressSpaceSize`}
    public long extendedSparseAddressSpaceSize() { return extendedSparseAddressSpaceSize(this.segment(), 0L); }
    /// Sets `extendedSparseAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedSparseAddressSpaceSize(MemorySegment segment, long index, long value) { VH_extendedSparseAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `extendedSparseAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseAddressSpaceSize(long value) { extendedSparseAddressSpaceSize(this.segment(), 0L, value); return this; }

    /// {@return `extendedSparseImageUsageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedSparseImageUsageFlags(MemorySegment segment, long index) { return (int) VH_extendedSparseImageUsageFlags.get(segment, 0L, index); }
    /// {@return `extendedSparseImageUsageFlags`}
    public int extendedSparseImageUsageFlags() { return extendedSparseImageUsageFlags(this.segment(), 0L); }
    /// Sets `extendedSparseImageUsageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedSparseImageUsageFlags(MemorySegment segment, long index, int value) { VH_extendedSparseImageUsageFlags.set(segment, 0L, index, value); }
    /// Sets `extendedSparseImageUsageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseImageUsageFlags(int value) { extendedSparseImageUsageFlags(this.segment(), 0L, value); return this; }

    /// {@return `extendedSparseBufferUsageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedSparseBufferUsageFlags(MemorySegment segment, long index) { return (int) VH_extendedSparseBufferUsageFlags.get(segment, 0L, index); }
    /// {@return `extendedSparseBufferUsageFlags`}
    public int extendedSparseBufferUsageFlags() { return extendedSparseBufferUsageFlags(this.segment(), 0L); }
    /// Sets `extendedSparseBufferUsageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedSparseBufferUsageFlags(MemorySegment segment, long index, int value) { VH_extendedSparseBufferUsageFlags.set(segment, 0L, index, value); }
    /// Sets `extendedSparseBufferUsageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseBufferUsageFlags(int value) { extendedSparseBufferUsageFlags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
        public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV asSlice(long index) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
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

        /// {@return `extendedSparseAddressSpaceSize` at the given index}
        /// @param index the index of the struct buffer
        public long extendedSparseAddressSpaceSizeAt(long index) { return extendedSparseAddressSpaceSize(this.segment(), index); }
        /// Sets `extendedSparseAddressSpaceSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extendedSparseAddressSpaceSizeAt(long index, long value) { extendedSparseAddressSpaceSize(this.segment(), index, value); return this; }

        /// {@return `extendedSparseImageUsageFlags` at the given index}
        /// @param index the index of the struct buffer
        public int extendedSparseImageUsageFlagsAt(long index) { return extendedSparseImageUsageFlags(this.segment(), index); }
        /// Sets `extendedSparseImageUsageFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extendedSparseImageUsageFlagsAt(long index, int value) { extendedSparseImageUsageFlags(this.segment(), index, value); return this; }

        /// {@return `extendedSparseBufferUsageFlags` at the given index}
        /// @param index the index of the struct buffer
        public int extendedSparseBufferUsageFlagsAt(long index) { return extendedSparseBufferUsageFlags(this.segment(), index); }
        /// Sets `extendedSparseBufferUsageFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extendedSparseBufferUsageFlagsAt(long index, int value) { extendedSparseBufferUsageFlags(this.segment(), index, value); return this; }

    }
}
