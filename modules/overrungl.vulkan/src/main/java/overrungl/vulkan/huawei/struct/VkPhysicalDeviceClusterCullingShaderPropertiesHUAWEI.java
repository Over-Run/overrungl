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
package overrungl.vulkan.huawei.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxWorkGroupCount[3];
///     uint32_t maxWorkGroupSize[3];
///     uint32_t maxOutputClusterCount;
///     (uint64_t) VkDeviceSize indirectBufferOffsetAlignment;
/// };
/// ```
public sealed class VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI extends GroupType {
    /// The struct layout of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_INT).withName("maxWorkGroupCount"),
        MemoryLayout.sequenceLayout(3L, ValueLayout.JAVA_INT).withName("maxWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxOutputClusterCount"),
        ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment")
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
    /// The byte offset of `maxWorkGroupCount`.
    public static final long OFFSET_maxWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxWorkGroupCount"));
    /// The memory layout of `maxWorkGroupCount`.
    public static final MemoryLayout LAYOUT_maxWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxWorkGroupCount"));
    /// The [VarHandle] of `maxWorkGroupCount` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_maxWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWorkGroupCount"), PathElement.sequenceElement());
    /// The byte offset of `maxWorkGroupSize`.
    public static final long OFFSET_maxWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxWorkGroupSize"));
    /// The memory layout of `maxWorkGroupSize`.
    public static final MemoryLayout LAYOUT_maxWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxWorkGroupSize"));
    /// The [VarHandle] of `maxWorkGroupSize` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_maxWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWorkGroupSize"), PathElement.sequenceElement());
    /// The byte offset of `maxOutputClusterCount`.
    public static final long OFFSET_maxOutputClusterCount = LAYOUT.byteOffset(PathElement.groupElement("maxOutputClusterCount"));
    /// The memory layout of `maxOutputClusterCount`.
    public static final MemoryLayout LAYOUT_maxOutputClusterCount = LAYOUT.select(PathElement.groupElement("maxOutputClusterCount"));
    /// The [VarHandle] of `maxOutputClusterCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxOutputClusterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOutputClusterCount"));
    /// The byte offset of `indirectBufferOffsetAlignment`.
    public static final long OFFSET_indirectBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("indirectBufferOffsetAlignment"));
    /// The memory layout of `indirectBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_indirectBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("indirectBufferOffsetAlignment"));
    /// The [VarHandle] of `indirectBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectBufferOffsetAlignment"));

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI copyFrom(VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxWorkGroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxWorkGroupCount, index), LAYOUT_maxWorkGroupCount); }
    /// {@return `maxWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxWorkGroupCount(MemorySegment segment, long index, long index0) { return (int) VH_maxWorkGroupCount.get(segment, 0L, index, index0); }
    /// {@return `maxWorkGroupCount`}
    public MemorySegment maxWorkGroupCount() { return maxWorkGroupCount(this.segment(), 0L); }
    /// {@return `maxWorkGroupCount`}
    /// @param index0 the Index 0 of the array
    public int maxWorkGroupCount(long index0) { return maxWorkGroupCount(this.segment(), 0L, index0); }
    /// Sets `maxWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxWorkGroupCount(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxWorkGroupCount, index), LAYOUT_maxWorkGroupCount.byteSize()); }
    /// Sets `maxWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxWorkGroupCount(MemorySegment segment, long index, long index0, int value) { VH_maxWorkGroupCount.set(segment, 0L, index, index0, value); }
    /// Sets `maxWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupCount(MemorySegment value) { maxWorkGroupCount(this.segment(), 0L, value); return this; }
    /// Sets `maxWorkGroupCount` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupCount(long index0, int value) { maxWorkGroupCount(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxWorkGroupSize, index), LAYOUT_maxWorkGroupSize); }
    /// {@return `maxWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxWorkGroupSize(MemorySegment segment, long index, long index0) { return (int) VH_maxWorkGroupSize.get(segment, 0L, index, index0); }
    /// {@return `maxWorkGroupSize`}
    public MemorySegment maxWorkGroupSize() { return maxWorkGroupSize(this.segment(), 0L); }
    /// {@return `maxWorkGroupSize`}
    /// @param index0 the Index 0 of the array
    public int maxWorkGroupSize(long index0) { return maxWorkGroupSize(this.segment(), 0L, index0); }
    /// Sets `maxWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxWorkGroupSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxWorkGroupSize, index), LAYOUT_maxWorkGroupSize.byteSize()); }
    /// Sets `maxWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxWorkGroupSize(MemorySegment segment, long index, long index0, int value) { VH_maxWorkGroupSize.set(segment, 0L, index, index0, value); }
    /// Sets `maxWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupSize(MemorySegment value) { maxWorkGroupSize(this.segment(), 0L, value); return this; }
    /// Sets `maxWorkGroupSize` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupSize(long index0, int value) { maxWorkGroupSize(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxOutputClusterCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxOutputClusterCount(MemorySegment segment, long index) { return (int) VH_maxOutputClusterCount.get(segment, 0L, index); }
    /// {@return `maxOutputClusterCount`}
    public int maxOutputClusterCount() { return maxOutputClusterCount(this.segment(), 0L); }
    /// Sets `maxOutputClusterCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxOutputClusterCount(MemorySegment segment, long index, int value) { VH_maxOutputClusterCount.set(segment, 0L, index, value); }
    /// Sets `maxOutputClusterCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxOutputClusterCount(int value) { maxOutputClusterCount(this.segment(), 0L, value); return this; }

    /// {@return `indirectBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indirectBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_indirectBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `indirectBufferOffsetAlignment`}
    public long indirectBufferOffsetAlignment() { return indirectBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `indirectBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectBufferOffsetAlignment(MemorySegment segment, long index, long value) { VH_indirectBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `indirectBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI indirectBufferOffsetAlignment(long value) { indirectBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI].
    public static final class Buffer extends VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
        public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI asSlice(long index) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
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

        /// {@return `maxWorkGroupCount` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxWorkGroupCountAt(long index) { return maxWorkGroupCount(this.segment(), index); }
        /// {@return `maxWorkGroupCount` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int maxWorkGroupCountAt(long index, long index0) { return maxWorkGroupCount(this.segment(), index, index0); }
        /// Sets `maxWorkGroupCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxWorkGroupCountAt(long index, MemorySegment value) { maxWorkGroupCount(this.segment(), index, value); return this; }
        /// Sets `maxWorkGroupCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer maxWorkGroupCountAt(long index, long index0, int value) { maxWorkGroupCount(this.segment(), index, index0, value); return this; }

        /// {@return `maxWorkGroupSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxWorkGroupSizeAt(long index) { return maxWorkGroupSize(this.segment(), index); }
        /// {@return `maxWorkGroupSize` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int maxWorkGroupSizeAt(long index, long index0) { return maxWorkGroupSize(this.segment(), index, index0); }
        /// Sets `maxWorkGroupSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxWorkGroupSizeAt(long index, MemorySegment value) { maxWorkGroupSize(this.segment(), index, value); return this; }
        /// Sets `maxWorkGroupSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer maxWorkGroupSizeAt(long index, long index0, int value) { maxWorkGroupSize(this.segment(), index, index0, value); return this; }

        /// {@return `maxOutputClusterCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxOutputClusterCountAt(long index) { return maxOutputClusterCount(this.segment(), index); }
        /// Sets `maxOutputClusterCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxOutputClusterCountAt(long index, int value) { maxOutputClusterCount(this.segment(), index, value); return this; }

        /// {@return `indirectBufferOffsetAlignment` at the given index}
        /// @param index the index of the struct buffer
        public long indirectBufferOffsetAlignmentAt(long index) { return indirectBufferOffsetAlignment(this.segment(), index); }
        /// Sets `indirectBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer indirectBufferOffsetAlignmentAt(long index, long value) { indirectBufferOffsetAlignment(this.segment(), index, value); return this; }

    }
}
