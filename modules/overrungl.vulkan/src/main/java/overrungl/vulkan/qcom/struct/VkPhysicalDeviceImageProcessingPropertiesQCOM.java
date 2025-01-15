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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### maxWeightFilterPhases
/// [VarHandle][#VH_maxWeightFilterPhases] - [Getter][#maxWeightFilterPhases()] - [Setter][#maxWeightFilterPhases(int)]
/// ### maxWeightFilterDimension
/// [Byte offset][#OFFSET_maxWeightFilterDimension] - [Memory layout][#ML_maxWeightFilterDimension] - [Getter][#maxWeightFilterDimension()] - [Setter][#maxWeightFilterDimension(java.lang.foreign.MemorySegment)]
/// ### maxBlockMatchRegion
/// [Byte offset][#OFFSET_maxBlockMatchRegion] - [Memory layout][#ML_maxBlockMatchRegion] - [Getter][#maxBlockMatchRegion()] - [Setter][#maxBlockMatchRegion(java.lang.foreign.MemorySegment)]
/// ### maxBoxFilterBlockSize
/// [Byte offset][#OFFSET_maxBoxFilterBlockSize] - [Memory layout][#ML_maxBoxFilterBlockSize] - [Getter][#maxBoxFilterBlockSize()] - [Setter][#maxBoxFilterBlockSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceImageProcessingPropertiesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxWeightFilterPhases;
///     VkExtent2D maxWeightFilterDimension;
///     VkExtent2D maxBlockMatchRegion;
///     VkExtent2D maxBoxFilterBlockSize;
/// } VkPhysicalDeviceImageProcessingPropertiesQCOM;
/// ```
public sealed class VkPhysicalDeviceImageProcessingPropertiesQCOM extends Struct {
    /// The struct layout of `VkPhysicalDeviceImageProcessingPropertiesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxWeightFilterPhases"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxWeightFilterDimension"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBlockMatchRegion"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBoxFilterBlockSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxWeightFilterPhases` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxWeightFilterPhases = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWeightFilterPhases"));
    /// The byte offset of `maxWeightFilterDimension`.
    public static final long OFFSET_maxWeightFilterDimension = LAYOUT.byteOffset(PathElement.groupElement("maxWeightFilterDimension"));
    /// The memory layout of `maxWeightFilterDimension`.
    public static final MemoryLayout ML_maxWeightFilterDimension = LAYOUT.select(PathElement.groupElement("maxWeightFilterDimension"));
    /// The byte offset of `maxBlockMatchRegion`.
    public static final long OFFSET_maxBlockMatchRegion = LAYOUT.byteOffset(PathElement.groupElement("maxBlockMatchRegion"));
    /// The memory layout of `maxBlockMatchRegion`.
    public static final MemoryLayout ML_maxBlockMatchRegion = LAYOUT.select(PathElement.groupElement("maxBlockMatchRegion"));
    /// The byte offset of `maxBoxFilterBlockSize`.
    public static final long OFFSET_maxBoxFilterBlockSize = LAYOUT.byteOffset(PathElement.groupElement("maxBoxFilterBlockSize"));
    /// The memory layout of `maxBoxFilterBlockSize`.
    public static final MemoryLayout ML_maxBoxFilterBlockSize = LAYOUT.select(PathElement.groupElement("maxBoxFilterBlockSize"));

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImageProcessingPropertiesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment); }

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessingPropertiesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageProcessingPropertiesQCOM`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageProcessingPropertiesQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceImageProcessingPropertiesQCOM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageProcessingPropertiesQCOM`
    public static VkPhysicalDeviceImageProcessingPropertiesQCOM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int maxWeightFilterPhases, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxWeightFilterDimension, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxBlockMatchRegion, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxBoxFilterBlockSize) { return alloc(allocator).sType(sType).pNext(pNext).maxWeightFilterPhases(maxWeightFilterPhases).maxWeightFilterDimension(maxWeightFilterDimension).maxBlockMatchRegion(maxBlockMatchRegion).maxBoxFilterBlockSize(maxBoxFilterBlockSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM copyFrom(VkPhysicalDeviceImageProcessingPropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `maxWeightFilterPhases` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxWeightFilterPhases(MemorySegment segment, long index) { return (int) VH_maxWeightFilterPhases.get(segment, 0L, index); }
    /// {@return `maxWeightFilterPhases`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxWeightFilterPhases(MemorySegment segment) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxWeightFilterPhases(segment, 0L); }
    /// {@return `maxWeightFilterPhases`}
    public @CType("uint32_t") int maxWeightFilterPhases() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxWeightFilterPhases(this.segment()); }
    /// Sets `maxWeightFilterPhases` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxWeightFilterPhases(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxWeightFilterPhases.set(segment, 0L, index, value); }
    /// Sets `maxWeightFilterPhases` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxWeightFilterPhases(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxWeightFilterPhases(segment, 0L, value); }
    /// Sets `maxWeightFilterPhases` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterPhases(@CType("uint32_t") int value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxWeightFilterPhases(this.segment(), value); return this; }

    /// {@return `maxWeightFilterDimension` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxWeightFilterDimension(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxWeightFilterDimension, index), ML_maxWeightFilterDimension); }
    /// {@return `maxWeightFilterDimension`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxWeightFilterDimension(MemorySegment segment) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxWeightFilterDimension(segment, 0L); }
    /// {@return `maxWeightFilterDimension`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxWeightFilterDimension() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxWeightFilterDimension(this.segment()); }
    /// Sets `maxWeightFilterDimension` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxWeightFilterDimension(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxWeightFilterDimension, index), ML_maxWeightFilterDimension.byteSize()); }
    /// Sets `maxWeightFilterDimension` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxWeightFilterDimension(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxWeightFilterDimension(segment, 0L, value); }
    /// Sets `maxWeightFilterDimension` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxWeightFilterDimension(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxWeightFilterDimension(this.segment(), value); return this; }

    /// {@return `maxBlockMatchRegion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxBlockMatchRegion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxBlockMatchRegion, index), ML_maxBlockMatchRegion); }
    /// {@return `maxBlockMatchRegion`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxBlockMatchRegion(MemorySegment segment) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxBlockMatchRegion(segment, 0L); }
    /// {@return `maxBlockMatchRegion`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxBlockMatchRegion() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxBlockMatchRegion(this.segment()); }
    /// Sets `maxBlockMatchRegion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBlockMatchRegion(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxBlockMatchRegion, index), ML_maxBlockMatchRegion.byteSize()); }
    /// Sets `maxBlockMatchRegion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBlockMatchRegion(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxBlockMatchRegion(segment, 0L, value); }
    /// Sets `maxBlockMatchRegion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBlockMatchRegion(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxBlockMatchRegion(this.segment(), value); return this; }

    /// {@return `maxBoxFilterBlockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxBoxFilterBlockSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxBoxFilterBlockSize, index), ML_maxBoxFilterBlockSize); }
    /// {@return `maxBoxFilterBlockSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxBoxFilterBlockSize(MemorySegment segment) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxBoxFilterBlockSize(segment, 0L); }
    /// {@return `maxBoxFilterBlockSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxBoxFilterBlockSize() { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxBoxFilterBlockSize(this.segment()); }
    /// Sets `maxBoxFilterBlockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBoxFilterBlockSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxBoxFilterBlockSize, index), ML_maxBoxFilterBlockSize.byteSize()); }
    /// Sets `maxBoxFilterBlockSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBoxFilterBlockSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxBoxFilterBlockSize(segment, 0L, value); }
    /// Sets `maxBoxFilterBlockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessingPropertiesQCOM maxBoxFilterBlockSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxBoxFilterBlockSize(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceImageProcessingPropertiesQCOM].
    public static final class Buffer extends VkPhysicalDeviceImageProcessingPropertiesQCOM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceImageProcessingPropertiesQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceImageProcessingPropertiesQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceImageProcessingPropertiesQCOM`
        public VkPhysicalDeviceImageProcessingPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceImageProcessingPropertiesQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceImageProcessingPropertiesQCOM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxWeightFilterPhases` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxWeightFilterPhasesAt(long index) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxWeightFilterPhases(this.segment(), index); }
        /// Sets `maxWeightFilterPhases` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxWeightFilterPhasesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxWeightFilterPhases(this.segment(), index, value); return this; }

        /// {@return `maxWeightFilterDimension` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxWeightFilterDimensionAt(long index) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxWeightFilterDimension(this.segment(), index); }
        /// Sets `maxWeightFilterDimension` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxWeightFilterDimensionAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxWeightFilterDimension(this.segment(), index, value); return this; }

        /// {@return `maxBlockMatchRegion` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxBlockMatchRegionAt(long index) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxBlockMatchRegion(this.segment(), index); }
        /// Sets `maxBlockMatchRegion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxBlockMatchRegionAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxBlockMatchRegion(this.segment(), index, value); return this; }

        /// {@return `maxBoxFilterBlockSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxBoxFilterBlockSizeAt(long index) { return VkPhysicalDeviceImageProcessingPropertiesQCOM.get_maxBoxFilterBlockSize(this.segment(), index); }
        /// Sets `maxBoxFilterBlockSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxBoxFilterBlockSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessingPropertiesQCOM.set_maxBoxFilterBlockSize(this.segment(), index, value); return this; }

    }
}
