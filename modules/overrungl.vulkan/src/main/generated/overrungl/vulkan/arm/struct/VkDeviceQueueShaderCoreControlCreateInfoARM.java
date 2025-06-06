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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDeviceQueueShaderCoreControlCreateInfoARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t shaderCoreCount;
/// };
/// ```
public sealed class VkDeviceQueueShaderCoreControlCreateInfoARM extends GroupType {
    /// The struct layout of `VkDeviceQueueShaderCoreControlCreateInfoARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreCount")
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
    /// The byte offset of `shaderCoreCount`.
    public static final long OFFSET_shaderCoreCount = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreCount"));
    /// The memory layout of `shaderCoreCount`.
    public static final MemoryLayout LAYOUT_shaderCoreCount = LAYOUT.select(PathElement.groupElement("shaderCoreCount"));
    /// The [VarHandle] of `shaderCoreCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderCoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreCount"));

    /// Creates `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    public VkDeviceQueueShaderCoreControlCreateInfoARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueShaderCoreControlCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueShaderCoreControlCreateInfoARM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceQueueShaderCoreControlCreateInfoARM`
    public static VkDeviceQueueShaderCoreControlCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDeviceQueueShaderCoreControlCreateInfoARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceQueueShaderCoreControlCreateInfoARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param shaderCoreCount `shaderCoreCount`
    /// @return the allocated `VkDeviceQueueShaderCoreControlCreateInfoARM`
    public static VkDeviceQueueShaderCoreControlCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int shaderCoreCount) {
        return alloc(allocator).sType(sType).pNext(pNext).shaderCoreCount(shaderCoreCount);
    }

    /// Allocates a `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDeviceQueueShaderCoreControlCreateInfoARM`
    public static VkDeviceQueueShaderCoreControlCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDeviceQueueShaderCoreControlCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDeviceQueueShaderCoreControlCreateInfoARM`
    public static VkDeviceQueueShaderCoreControlCreateInfoARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceQueueShaderCoreControlCreateInfoARM copyFrom(VkDeviceQueueShaderCoreControlCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDeviceQueueShaderCoreControlCreateInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceQueueShaderCoreControlCreateInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderCoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderCoreCount(MemorySegment segment, long index) { return (int) VH_shaderCoreCount.get(segment, 0L, index); }
    /// {@return `shaderCoreCount`}
    public int shaderCoreCount() { return shaderCoreCount(this.segment(), 0L); }
    /// Sets `shaderCoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCoreCount(MemorySegment segment, long index, int value) { VH_shaderCoreCount.set(segment, 0L, index, value); }
    /// Sets `shaderCoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueShaderCoreControlCreateInfoARM shaderCoreCount(int value) { shaderCoreCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDeviceQueueShaderCoreControlCreateInfoARM].
    public static final class Buffer extends VkDeviceQueueShaderCoreControlCreateInfoARM {
        private final long elementCount;

        /// Creates `VkDeviceQueueShaderCoreControlCreateInfoARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceQueueShaderCoreControlCreateInfoARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceQueueShaderCoreControlCreateInfoARM`
        public VkDeviceQueueShaderCoreControlCreateInfoARM asSlice(long index) { return new VkDeviceQueueShaderCoreControlCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceQueueShaderCoreControlCreateInfoARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceQueueShaderCoreControlCreateInfoARM`
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

        /// {@return `shaderCoreCount` at the given index}
        /// @param index the index of the struct buffer
        public int shaderCoreCountAt(long index) { return shaderCoreCount(this.segment(), index); }
        /// Sets `shaderCoreCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderCoreCountAt(long index, int value) { shaderCoreCount(this.segment(), index, value); return this; }

    }
}
