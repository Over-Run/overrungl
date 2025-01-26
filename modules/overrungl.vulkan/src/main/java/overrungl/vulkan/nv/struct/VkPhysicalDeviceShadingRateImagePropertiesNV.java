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
/// struct VkPhysicalDeviceShadingRateImagePropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D shadingRateTexelSize;
///     uint32_t shadingRatePaletteSize;
///     uint32_t shadingRateMaxCoarseSamples;
/// };
/// ```
public sealed class VkPhysicalDeviceShadingRateImagePropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShadingRateImagePropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateTexelSize"),
        ValueLayout.JAVA_INT.withName("shadingRatePaletteSize"),
        ValueLayout.JAVA_INT.withName("shadingRateMaxCoarseSamples")
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
    /// The byte offset of `shadingRateTexelSize`.
    public static final long OFFSET_shadingRateTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateTexelSize"));
    /// The memory layout of `shadingRateTexelSize`.
    public static final MemoryLayout LAYOUT_shadingRateTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateTexelSize"));
    /// The byte offset of `shadingRatePaletteSize`.
    public static final long OFFSET_shadingRatePaletteSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRatePaletteSize"));
    /// The memory layout of `shadingRatePaletteSize`.
    public static final MemoryLayout LAYOUT_shadingRatePaletteSize = LAYOUT.select(PathElement.groupElement("shadingRatePaletteSize"));
    /// The [VarHandle] of `shadingRatePaletteSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRatePaletteSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRatePaletteSize"));
    /// The byte offset of `shadingRateMaxCoarseSamples`.
    public static final long OFFSET_shadingRateMaxCoarseSamples = LAYOUT.byteOffset(PathElement.groupElement("shadingRateMaxCoarseSamples"));
    /// The memory layout of `shadingRateMaxCoarseSamples`.
    public static final MemoryLayout LAYOUT_shadingRateMaxCoarseSamples = LAYOUT.select(PathElement.groupElement("shadingRateMaxCoarseSamples"));
    /// The [VarHandle] of `shadingRateMaxCoarseSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRateMaxCoarseSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateMaxCoarseSamples"));

    /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShadingRateImagePropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImagePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImagePropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShadingRateImagePropertiesNV`
    public static VkPhysicalDeviceShadingRateImagePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShadingRateImagePropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShadingRateImagePropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV copyFrom(VkPhysicalDeviceShadingRateImagePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceShadingRateImagePropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShadingRateImagePropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment shadingRateTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shadingRateTexelSize, index), LAYOUT_shadingRateTexelSize); }
    /// {@return `shadingRateTexelSize`}
    public MemorySegment shadingRateTexelSize() { return shadingRateTexelSize(this.segment(), 0L); }
    /// Sets `shadingRateTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shadingRateTexelSize, index), LAYOUT_shadingRateTexelSize.byteSize()); }
    /// Sets `shadingRateTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize(MemorySegment value) { shadingRateTexelSize(this.segment(), 0L, value); return this; }

    /// {@return `shadingRatePaletteSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRatePaletteSize(MemorySegment segment, long index) { return (int) VH_shadingRatePaletteSize.get(segment, 0L, index); }
    /// {@return `shadingRatePaletteSize`}
    public int shadingRatePaletteSize() { return shadingRatePaletteSize(this.segment(), 0L); }
    /// Sets `shadingRatePaletteSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRatePaletteSize(MemorySegment segment, long index, int value) { VH_shadingRatePaletteSize.set(segment, 0L, index, value); }
    /// Sets `shadingRatePaletteSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRatePaletteSize(int value) { shadingRatePaletteSize(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateMaxCoarseSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRateMaxCoarseSamples(MemorySegment segment, long index) { return (int) VH_shadingRateMaxCoarseSamples.get(segment, 0L, index); }
    /// {@return `shadingRateMaxCoarseSamples`}
    public int shadingRateMaxCoarseSamples() { return shadingRateMaxCoarseSamples(this.segment(), 0L); }
    /// Sets `shadingRateMaxCoarseSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateMaxCoarseSamples(MemorySegment segment, long index, int value) { VH_shadingRateMaxCoarseSamples.set(segment, 0L, index, value); }
    /// Sets `shadingRateMaxCoarseSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateMaxCoarseSamples(int value) { shadingRateMaxCoarseSamples(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShadingRateImagePropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceShadingRateImagePropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShadingRateImagePropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShadingRateImagePropertiesNV`
        public VkPhysicalDeviceShadingRateImagePropertiesNV asSlice(long index) { return new VkPhysicalDeviceShadingRateImagePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShadingRateImagePropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShadingRateImagePropertiesNV`
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

        /// {@return `shadingRateTexelSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment shadingRateTexelSizeAt(long index) { return shadingRateTexelSize(this.segment(), index); }
        /// Sets `shadingRateTexelSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateTexelSizeAt(long index, MemorySegment value) { shadingRateTexelSize(this.segment(), index, value); return this; }

        /// {@return `shadingRatePaletteSize` at the given index}
        /// @param index the index of the struct buffer
        public int shadingRatePaletteSizeAt(long index) { return shadingRatePaletteSize(this.segment(), index); }
        /// Sets `shadingRatePaletteSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shadingRatePaletteSizeAt(long index, int value) { shadingRatePaletteSize(this.segment(), index, value); return this; }

        /// {@return `shadingRateMaxCoarseSamples` at the given index}
        /// @param index the index of the struct buffer
        public int shadingRateMaxCoarseSamplesAt(long index) { return shadingRateMaxCoarseSamples(this.segment(), index); }
        /// Sets `shadingRateMaxCoarseSamples` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateMaxCoarseSamplesAt(long index, int value) { shadingRateMaxCoarseSamples(this.segment(), index, value); return this; }

    }
}
