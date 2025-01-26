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
/// struct VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 clustercullingShader;
///     (uint32_t) VkBool32 multiviewClusterCullingShader;
/// };
/// ```
public sealed class VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI extends GroupType {
    /// The struct layout of `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clustercullingShader"),
        ValueLayout.JAVA_INT.withName("multiviewClusterCullingShader")
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
    /// The byte offset of `clustercullingShader`.
    public static final long OFFSET_clustercullingShader = LAYOUT.byteOffset(PathElement.groupElement("clustercullingShader"));
    /// The memory layout of `clustercullingShader`.
    public static final MemoryLayout LAYOUT_clustercullingShader = LAYOUT.select(PathElement.groupElement("clustercullingShader"));
    /// The [VarHandle] of `clustercullingShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clustercullingShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clustercullingShader"));
    /// The byte offset of `multiviewClusterCullingShader`.
    public static final long OFFSET_multiviewClusterCullingShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewClusterCullingShader"));
    /// The memory layout of `multiviewClusterCullingShader`.
    public static final MemoryLayout LAYOUT_multiviewClusterCullingShader = LAYOUT.select(PathElement.groupElement("multiviewClusterCullingShader"));
    /// The [VarHandle] of `multiviewClusterCullingShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiviewClusterCullingShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewClusterCullingShader"));

    /// Creates `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI`
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI copyFrom(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `clustercullingShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clustercullingShader(MemorySegment segment, long index) { return (int) VH_clustercullingShader.get(segment, 0L, index); }
    /// {@return `clustercullingShader`}
    public int clustercullingShader() { return clustercullingShader(this.segment(), 0L); }
    /// Sets `clustercullingShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clustercullingShader(MemorySegment segment, long index, int value) { VH_clustercullingShader.set(segment, 0L, index, value); }
    /// Sets `clustercullingShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI clustercullingShader(int value) { clustercullingShader(this.segment(), 0L, value); return this; }

    /// {@return `multiviewClusterCullingShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiviewClusterCullingShader(MemorySegment segment, long index) { return (int) VH_multiviewClusterCullingShader.get(segment, 0L, index); }
    /// {@return `multiviewClusterCullingShader`}
    public int multiviewClusterCullingShader() { return multiviewClusterCullingShader(this.segment(), 0L); }
    /// Sets `multiviewClusterCullingShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiviewClusterCullingShader(MemorySegment segment, long index, int value) { VH_multiviewClusterCullingShader.set(segment, 0L, index, value); }
    /// Sets `multiviewClusterCullingShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI multiviewClusterCullingShader(int value) { multiviewClusterCullingShader(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI].
    public static final class Buffer extends VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI`
        public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI asSlice(long index) { return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI`
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

        /// {@return `clustercullingShader` at the given index}
        /// @param index the index of the struct buffer
        public int clustercullingShaderAt(long index) { return clustercullingShader(this.segment(), index); }
        /// Sets `clustercullingShader` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer clustercullingShaderAt(long index, int value) { clustercullingShader(this.segment(), index, value); return this; }

        /// {@return `multiviewClusterCullingShader` at the given index}
        /// @param index the index of the struct buffer
        public int multiviewClusterCullingShaderAt(long index) { return multiviewClusterCullingShader(this.segment(), index); }
        /// Sets `multiviewClusterCullingShader` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer multiviewClusterCullingShaderAt(long index, int value) { multiviewClusterCullingShader(this.segment(), index, value); return this; }

    }
}
