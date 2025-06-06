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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceTileShadingPropertiesQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxApronSize;
///     (uint32_t) VkBool32 preferNonCoherent;
///     (struct VkExtent2D) VkExtent2D tileGranularity;
///     (struct VkExtent2D) VkExtent2D maxTileShadingRate;
/// };
/// ```
public sealed class VkPhysicalDeviceTileShadingPropertiesQCOM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTileShadingPropertiesQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxApronSize"),
        ValueLayout.JAVA_INT.withName("preferNonCoherent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("tileGranularity"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTileShadingRate")
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
    /// The byte offset of `maxApronSize`.
    public static final long OFFSET_maxApronSize = LAYOUT.byteOffset(PathElement.groupElement("maxApronSize"));
    /// The memory layout of `maxApronSize`.
    public static final MemoryLayout LAYOUT_maxApronSize = LAYOUT.select(PathElement.groupElement("maxApronSize"));
    /// The [VarHandle] of `maxApronSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxApronSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxApronSize"));
    /// The byte offset of `preferNonCoherent`.
    public static final long OFFSET_preferNonCoherent = LAYOUT.byteOffset(PathElement.groupElement("preferNonCoherent"));
    /// The memory layout of `preferNonCoherent`.
    public static final MemoryLayout LAYOUT_preferNonCoherent = LAYOUT.select(PathElement.groupElement("preferNonCoherent"));
    /// The [VarHandle] of `preferNonCoherent` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferNonCoherent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferNonCoherent"));
    /// The byte offset of `tileGranularity`.
    public static final long OFFSET_tileGranularity = LAYOUT.byteOffset(PathElement.groupElement("tileGranularity"));
    /// The memory layout of `tileGranularity`.
    public static final MemoryLayout LAYOUT_tileGranularity = LAYOUT.select(PathElement.groupElement("tileGranularity"));
    /// The byte offset of `maxTileShadingRate`.
    public static final long OFFSET_maxTileShadingRate = LAYOUT.byteOffset(PathElement.groupElement("maxTileShadingRate"));
    /// The memory layout of `maxTileShadingRate`.
    public static final MemoryLayout LAYOUT_maxTileShadingRate = LAYOUT.select(PathElement.groupElement("maxTileShadingRate"));

    /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceTileShadingPropertiesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingPropertiesQCOM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxApronSize `maxApronSize`
    /// @param preferNonCoherent `preferNonCoherent`
    /// @param tileGranularity `tileGranularity`
    /// @param maxTileShadingRate `maxTileShadingRate`
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxApronSize, int preferNonCoherent, MemorySegment tileGranularity, MemorySegment maxTileShadingRate) {
        return alloc(allocator).sType(sType).pNext(pNext).maxApronSize(maxApronSize).preferNonCoherent(preferNonCoherent).tileGranularity(tileGranularity).maxTileShadingRate(maxTileShadingRate);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxApronSize `maxApronSize`
    /// @param preferNonCoherent `preferNonCoherent`
    /// @param tileGranularity `tileGranularity`
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxApronSize, int preferNonCoherent, MemorySegment tileGranularity) {
        return alloc(allocator).sType(sType).pNext(pNext).maxApronSize(maxApronSize).preferNonCoherent(preferNonCoherent).tileGranularity(tileGranularity);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxApronSize `maxApronSize`
    /// @param preferNonCoherent `preferNonCoherent`
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxApronSize, int preferNonCoherent) {
        return alloc(allocator).sType(sType).pNext(pNext).maxApronSize(maxApronSize).preferNonCoherent(preferNonCoherent);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxApronSize `maxApronSize`
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int maxApronSize) {
        return alloc(allocator).sType(sType).pNext(pNext).maxApronSize(maxApronSize);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM copyFrom(VkPhysicalDeviceTileShadingPropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceTileShadingPropertiesQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTileShadingPropertiesQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxApronSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxApronSize(MemorySegment segment, long index) { return (int) VH_maxApronSize.get(segment, 0L, index); }
    /// {@return `maxApronSize`}
    public int maxApronSize() { return maxApronSize(this.segment(), 0L); }
    /// Sets `maxApronSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxApronSize(MemorySegment segment, long index, int value) { VH_maxApronSize.set(segment, 0L, index, value); }
    /// Sets `maxApronSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxApronSize(int value) { maxApronSize(this.segment(), 0L, value); return this; }

    /// {@return `preferNonCoherent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferNonCoherent(MemorySegment segment, long index) { return (int) VH_preferNonCoherent.get(segment, 0L, index); }
    /// {@return `preferNonCoherent`}
    public int preferNonCoherent() { return preferNonCoherent(this.segment(), 0L); }
    /// Sets `preferNonCoherent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferNonCoherent(MemorySegment segment, long index, int value) { VH_preferNonCoherent.set(segment, 0L, index, value); }
    /// Sets `preferNonCoherent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM preferNonCoherent(int value) { preferNonCoherent(this.segment(), 0L, value); return this; }

    /// {@return `tileGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment tileGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_tileGranularity, index), LAYOUT_tileGranularity); }
    /// {@return `tileGranularity`}
    public MemorySegment tileGranularity() { return tileGranularity(this.segment(), 0L); }
    /// Sets `tileGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileGranularity(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_tileGranularity, index), LAYOUT_tileGranularity.byteSize()); }
    /// Sets `tileGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity(MemorySegment value) { tileGranularity(this.segment(), 0L, value); return this; }

    /// {@return `maxTileShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxTileShadingRate(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTileShadingRate, index), LAYOUT_maxTileShadingRate); }
    /// {@return `maxTileShadingRate`}
    public MemorySegment maxTileShadingRate() { return maxTileShadingRate(this.segment(), 0L); }
    /// Sets `maxTileShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTileShadingRate(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTileShadingRate, index), LAYOUT_maxTileShadingRate.byteSize()); }
    /// Sets `maxTileShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate(MemorySegment value) { maxTileShadingRate(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceTileShadingPropertiesQCOM].
    public static final class Buffer extends VkPhysicalDeviceTileShadingPropertiesQCOM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceTileShadingPropertiesQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceTileShadingPropertiesQCOM`
        public VkPhysicalDeviceTileShadingPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceTileShadingPropertiesQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceTileShadingPropertiesQCOM`
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

        /// {@return `maxApronSize` at the given index}
        /// @param index the index of the struct buffer
        public int maxApronSizeAt(long index) { return maxApronSize(this.segment(), index); }
        /// Sets `maxApronSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxApronSizeAt(long index, int value) { maxApronSize(this.segment(), index, value); return this; }

        /// {@return `preferNonCoherent` at the given index}
        /// @param index the index of the struct buffer
        public int preferNonCoherentAt(long index) { return preferNonCoherent(this.segment(), index); }
        /// Sets `preferNonCoherent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferNonCoherentAt(long index, int value) { preferNonCoherent(this.segment(), index, value); return this; }

        /// {@return `tileGranularity` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment tileGranularityAt(long index) { return tileGranularity(this.segment(), index); }
        /// Sets `tileGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer tileGranularityAt(long index, MemorySegment value) { tileGranularity(this.segment(), index, value); return this; }

        /// {@return `maxTileShadingRate` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxTileShadingRateAt(long index) { return maxTileShadingRate(this.segment(), index); }
        /// Sets `maxTileShadingRate` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTileShadingRateAt(long index, MemorySegment value) { maxTileShadingRate(this.segment(), index, value); return this; }

    }
}
