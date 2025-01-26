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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 rayTracingMaintenance1;
///     (uint32_t) VkBool32 rayTracingPipelineTraceRaysIndirect2;
/// };
/// ```
public sealed class VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMaintenance1"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2")
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
    /// The byte offset of `rayTracingMaintenance1`.
    public static final long OFFSET_rayTracingMaintenance1 = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMaintenance1"));
    /// The memory layout of `rayTracingMaintenance1`.
    public static final MemoryLayout LAYOUT_rayTracingMaintenance1 = LAYOUT.select(PathElement.groupElement("rayTracingMaintenance1"));
    /// The [VarHandle] of `rayTracingMaintenance1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTracingMaintenance1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingMaintenance1"));
    /// The byte offset of `rayTracingPipelineTraceRaysIndirect2`.
    public static final long OFFSET_rayTracingPipelineTraceRaysIndirect2 = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));
    /// The memory layout of `rayTracingPipelineTraceRaysIndirect2`.
    public static final MemoryLayout LAYOUT_rayTracingPipelineTraceRaysIndirect2 = LAYOUT.select(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));
    /// The [VarHandle] of `rayTracingPipelineTraceRaysIndirect2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTracingPipelineTraceRaysIndirect2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR copyFrom(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `rayTracingMaintenance1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTracingMaintenance1(MemorySegment segment, long index) { return (int) VH_rayTracingMaintenance1.get(segment, 0L, index); }
    /// {@return `rayTracingMaintenance1`}
    public int rayTracingMaintenance1() { return rayTracingMaintenance1(this.segment(), 0L); }
    /// Sets `rayTracingMaintenance1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTracingMaintenance1(MemorySegment segment, long index, int value) { VH_rayTracingMaintenance1.set(segment, 0L, index, value); }
    /// Sets `rayTracingMaintenance1` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingMaintenance1(int value) { rayTracingMaintenance1(this.segment(), 0L, value); return this; }

    /// {@return `rayTracingPipelineTraceRaysIndirect2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTracingPipelineTraceRaysIndirect2(MemorySegment segment, long index) { return (int) VH_rayTracingPipelineTraceRaysIndirect2.get(segment, 0L, index); }
    /// {@return `rayTracingPipelineTraceRaysIndirect2`}
    public int rayTracingPipelineTraceRaysIndirect2() { return rayTracingPipelineTraceRaysIndirect2(this.segment(), 0L); }
    /// Sets `rayTracingPipelineTraceRaysIndirect2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTracingPipelineTraceRaysIndirect2(MemorySegment segment, long index, int value) { VH_rayTracingPipelineTraceRaysIndirect2.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipelineTraceRaysIndirect2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingPipelineTraceRaysIndirect2(int value) { rayTracingPipelineTraceRaysIndirect2(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
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

        /// {@return `rayTracingMaintenance1` at the given index}
        /// @param index the index of the struct buffer
        public int rayTracingMaintenance1At(long index) { return rayTracingMaintenance1(this.segment(), index); }
        /// Sets `rayTracingMaintenance1` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rayTracingMaintenance1At(long index, int value) { rayTracingMaintenance1(this.segment(), index, value); return this; }

        /// {@return `rayTracingPipelineTraceRaysIndirect2` at the given index}
        /// @param index the index of the struct buffer
        public int rayTracingPipelineTraceRaysIndirect2At(long index) { return rayTracingPipelineTraceRaysIndirect2(this.segment(), index); }
        /// Sets `rayTracingPipelineTraceRaysIndirect2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rayTracingPipelineTraceRaysIndirect2At(long index, int value) { rayTracingPipelineTraceRaysIndirect2(this.segment(), index, value); return this; }

    }
}
