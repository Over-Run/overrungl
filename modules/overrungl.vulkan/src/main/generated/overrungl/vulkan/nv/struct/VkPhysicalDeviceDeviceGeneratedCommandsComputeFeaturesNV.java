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
/// struct VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 deviceGeneratedCompute;
///     (uint32_t) VkBool32 deviceGeneratedComputePipelines;
///     (uint32_t) VkBool32 deviceGeneratedComputeCaptureReplay;
/// };
/// ```
public sealed class VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCompute"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputePipelines"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputeCaptureReplay")
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
    /// The byte offset of `deviceGeneratedCompute`.
    public static final long OFFSET_deviceGeneratedCompute = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCompute"));
    /// The memory layout of `deviceGeneratedCompute`.
    public static final MemoryLayout LAYOUT_deviceGeneratedCompute = LAYOUT.select(PathElement.groupElement("deviceGeneratedCompute"));
    /// The [VarHandle] of `deviceGeneratedCompute` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceGeneratedCompute = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCompute"));
    /// The byte offset of `deviceGeneratedComputePipelines`.
    public static final long OFFSET_deviceGeneratedComputePipelines = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedComputePipelines"));
    /// The memory layout of `deviceGeneratedComputePipelines`.
    public static final MemoryLayout LAYOUT_deviceGeneratedComputePipelines = LAYOUT.select(PathElement.groupElement("deviceGeneratedComputePipelines"));
    /// The [VarHandle] of `deviceGeneratedComputePipelines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceGeneratedComputePipelines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedComputePipelines"));
    /// The byte offset of `deviceGeneratedComputeCaptureReplay`.
    public static final long OFFSET_deviceGeneratedComputeCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));
    /// The memory layout of `deviceGeneratedComputeCaptureReplay`.
    public static final MemoryLayout LAYOUT_deviceGeneratedComputeCaptureReplay = LAYOUT.select(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));
    /// The [VarHandle] of `deviceGeneratedComputeCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceGeneratedComputeCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedComputeCaptureReplay"));

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceGeneratedCompute `deviceGeneratedCompute`
    /// @param deviceGeneratedComputePipelines `deviceGeneratedComputePipelines`
    /// @param deviceGeneratedComputeCaptureReplay `deviceGeneratedComputeCaptureReplay`
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceGeneratedCompute, int deviceGeneratedComputePipelines, int deviceGeneratedComputeCaptureReplay) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceGeneratedCompute(deviceGeneratedCompute).deviceGeneratedComputePipelines(deviceGeneratedComputePipelines).deviceGeneratedComputeCaptureReplay(deviceGeneratedComputeCaptureReplay);
    }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceGeneratedCompute `deviceGeneratedCompute`
    /// @param deviceGeneratedComputePipelines `deviceGeneratedComputePipelines`
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceGeneratedCompute, int deviceGeneratedComputePipelines) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceGeneratedCompute(deviceGeneratedCompute).deviceGeneratedComputePipelines(deviceGeneratedComputePipelines);
    }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceGeneratedCompute `deviceGeneratedCompute`
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int deviceGeneratedCompute) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceGeneratedCompute(deviceGeneratedCompute);
    }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceGeneratedCompute` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceGeneratedCompute(MemorySegment segment, long index) { return (int) VH_deviceGeneratedCompute.get(segment, 0L, index); }
    /// {@return `deviceGeneratedCompute`}
    public int deviceGeneratedCompute() { return deviceGeneratedCompute(this.segment(), 0L); }
    /// Sets `deviceGeneratedCompute` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceGeneratedCompute(MemorySegment segment, long index, int value) { VH_deviceGeneratedCompute.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedCompute` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedCompute(int value) { deviceGeneratedCompute(this.segment(), 0L, value); return this; }

    /// {@return `deviceGeneratedComputePipelines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceGeneratedComputePipelines(MemorySegment segment, long index) { return (int) VH_deviceGeneratedComputePipelines.get(segment, 0L, index); }
    /// {@return `deviceGeneratedComputePipelines`}
    public int deviceGeneratedComputePipelines() { return deviceGeneratedComputePipelines(this.segment(), 0L); }
    /// Sets `deviceGeneratedComputePipelines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceGeneratedComputePipelines(MemorySegment segment, long index, int value) { VH_deviceGeneratedComputePipelines.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedComputePipelines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputePipelines(int value) { deviceGeneratedComputePipelines(this.segment(), 0L, value); return this; }

    /// {@return `deviceGeneratedComputeCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceGeneratedComputeCaptureReplay(MemorySegment segment, long index) { return (int) VH_deviceGeneratedComputeCaptureReplay.get(segment, 0L, index); }
    /// {@return `deviceGeneratedComputeCaptureReplay`}
    public int deviceGeneratedComputeCaptureReplay() { return deviceGeneratedComputeCaptureReplay(this.segment(), 0L); }
    /// Sets `deviceGeneratedComputeCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceGeneratedComputeCaptureReplay(MemorySegment segment, long index, int value) { VH_deviceGeneratedComputeCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedComputeCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputeCaptureReplay(int value) { deviceGeneratedComputeCaptureReplay(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV`
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

        /// {@return `deviceGeneratedCompute` at the given index}
        /// @param index the index of the struct buffer
        public int deviceGeneratedComputeAt(long index) { return deviceGeneratedCompute(this.segment(), index); }
        /// Sets `deviceGeneratedCompute` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedComputeAt(long index, int value) { deviceGeneratedCompute(this.segment(), index, value); return this; }

        /// {@return `deviceGeneratedComputePipelines` at the given index}
        /// @param index the index of the struct buffer
        public int deviceGeneratedComputePipelinesAt(long index) { return deviceGeneratedComputePipelines(this.segment(), index); }
        /// Sets `deviceGeneratedComputePipelines` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedComputePipelinesAt(long index, int value) { deviceGeneratedComputePipelines(this.segment(), index, value); return this; }

        /// {@return `deviceGeneratedComputeCaptureReplay` at the given index}
        /// @param index the index of the struct buffer
        public int deviceGeneratedComputeCaptureReplayAt(long index) { return deviceGeneratedComputeCaptureReplay(this.segment(), index); }
        /// Sets `deviceGeneratedComputeCaptureReplay` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedComputeCaptureReplayAt(long index, int value) { deviceGeneratedComputeCaptureReplay(this.segment(), index, value); return this; }

    }
}
