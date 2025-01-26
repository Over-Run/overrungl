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
/// struct VkDeviceQueueCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDeviceQueueCreateFlags flags;
///     uint32_t queueFamilyIndex;
///     uint32_t queueCount;
///     const float* pQueuePriorities;
/// };
/// ```
public sealed class VkDeviceQueueCreateInfo extends GroupType {
    /// The struct layout of `VkDeviceQueueCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.ADDRESS.withName("pQueuePriorities")
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
    /// The byte offset of `queueFamilyIndex`.
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    /// The memory layout of `queueFamilyIndex`.
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    /// The [VarHandle] of `queueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    /// The byte offset of `queueCount`.
    public static final long OFFSET_queueCount = LAYOUT.byteOffset(PathElement.groupElement("queueCount"));
    /// The memory layout of `queueCount`.
    public static final MemoryLayout LAYOUT_queueCount = LAYOUT.select(PathElement.groupElement("queueCount"));
    /// The [VarHandle] of `queueCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCount"));
    /// The byte offset of `pQueuePriorities`.
    public static final long OFFSET_pQueuePriorities = LAYOUT.byteOffset(PathElement.groupElement("pQueuePriorities"));
    /// The memory layout of `pQueuePriorities`.
    public static final MemoryLayout LAYOUT_pQueuePriorities = LAYOUT.select(PathElement.groupElement("pQueuePriorities"));
    /// The [VarHandle] of `pQueuePriorities` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pQueuePriorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueuePriorities"));

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceQueueCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceQueueCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceQueueCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceQueueCreateInfo`
    public static VkDeviceQueueCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceQueueCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceQueueCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceQueueCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceQueueCreateInfo copyFrom(VkDeviceQueueCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDeviceQueueCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceQueueCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkDeviceQueueCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueFamilyIndex(MemorySegment segment, long index) { return (int) VH_queueFamilyIndex.get(segment, 0L, index); }
    /// {@return `queueFamilyIndex`}
    public int queueFamilyIndex() { return queueFamilyIndex(this.segment(), 0L); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFamilyIndex(MemorySegment segment, long index, int value) { VH_queueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo queueFamilyIndex(int value) { queueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `queueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueCount(MemorySegment segment, long index) { return (int) VH_queueCount.get(segment, 0L, index); }
    /// {@return `queueCount`}
    public int queueCount() { return queueCount(this.segment(), 0L); }
    /// Sets `queueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueCount(MemorySegment segment, long index, int value) { VH_queueCount.set(segment, 0L, index, value); }
    /// Sets `queueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo queueCount(int value) { queueCount(this.segment(), 0L, value); return this; }

    /// {@return `pQueuePriorities` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pQueuePriorities(MemorySegment segment, long index) { return (MemorySegment) VH_pQueuePriorities.get(segment, 0L, index); }
    /// {@return `pQueuePriorities`}
    public MemorySegment pQueuePriorities() { return pQueuePriorities(this.segment(), 0L); }
    /// Sets `pQueuePriorities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pQueuePriorities(MemorySegment segment, long index, MemorySegment value) { VH_pQueuePriorities.set(segment, 0L, index, value); }
    /// Sets `pQueuePriorities` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueCreateInfo pQueuePriorities(MemorySegment value) { pQueuePriorities(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDeviceQueueCreateInfo].
    public static final class Buffer extends VkDeviceQueueCreateInfo {
        private final long elementCount;

        /// Creates `VkDeviceQueueCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceQueueCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceQueueCreateInfo`
        public VkDeviceQueueCreateInfo asSlice(long index) { return new VkDeviceQueueCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceQueueCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceQueueCreateInfo`
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

        /// {@return `queueFamilyIndex` at the given index}
        /// @param index the index of the struct buffer
        public int queueFamilyIndexAt(long index) { return queueFamilyIndex(this.segment(), index); }
        /// Sets `queueFamilyIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer queueFamilyIndexAt(long index, int value) { queueFamilyIndex(this.segment(), index, value); return this; }

        /// {@return `queueCount` at the given index}
        /// @param index the index of the struct buffer
        public int queueCountAt(long index) { return queueCount(this.segment(), index); }
        /// Sets `queueCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer queueCountAt(long index, int value) { queueCount(this.segment(), index, value); return this; }

        /// {@return `pQueuePriorities` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pQueuePrioritiesAt(long index) { return pQueuePriorities(this.segment(), index); }
        /// Sets `pQueuePriorities` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pQueuePrioritiesAt(long index, MemorySegment value) { pQueuePriorities(this.segment(), index, value); return this; }

    }
}
