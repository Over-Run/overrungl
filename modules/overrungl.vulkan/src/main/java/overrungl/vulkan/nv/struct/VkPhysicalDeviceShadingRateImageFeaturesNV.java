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
/// struct VkPhysicalDeviceShadingRateImageFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shadingRateImage;
///     VkBool32 shadingRateCoarseSampleOrder;
/// };
/// ```
public sealed class VkPhysicalDeviceShadingRateImageFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImage"),
        ValueLayout.JAVA_INT.withName("shadingRateCoarseSampleOrder")
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
    /// The byte offset of `shadingRateImage`.
    public static final long OFFSET_shadingRateImage = LAYOUT.byteOffset(PathElement.groupElement("shadingRateImage"));
    /// The memory layout of `shadingRateImage`.
    public static final MemoryLayout LAYOUT_shadingRateImage = LAYOUT.select(PathElement.groupElement("shadingRateImage"));
    /// The [VarHandle] of `shadingRateImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRateImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateImage"));
    /// The byte offset of `shadingRateCoarseSampleOrder`.
    public static final long OFFSET_shadingRateCoarseSampleOrder = LAYOUT.byteOffset(PathElement.groupElement("shadingRateCoarseSampleOrder"));
    /// The memory layout of `shadingRateCoarseSampleOrder`.
    public static final MemoryLayout LAYOUT_shadingRateCoarseSampleOrder = LAYOUT.select(PathElement.groupElement("shadingRateCoarseSampleOrder"));
    /// The [VarHandle] of `shadingRateCoarseSampleOrder` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRateCoarseSampleOrder = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateCoarseSampleOrder"));

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV copyFrom(VkPhysicalDeviceShadingRateImageFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRateImage(MemorySegment segment, long index) { return (int) VH_shadingRateImage.get(segment, 0L, index); }
    /// {@return `shadingRateImage`}
    public int shadingRateImage() { return shadingRateImage(this.segment(), 0L); }
    /// Sets `shadingRateImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateImage(MemorySegment segment, long index, int value) { VH_shadingRateImage.set(segment, 0L, index, value); }
    /// Sets `shadingRateImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(int value) { shadingRateImage(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateCoarseSampleOrder` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRateCoarseSampleOrder(MemorySegment segment, long index) { return (int) VH_shadingRateCoarseSampleOrder.get(segment, 0L, index); }
    /// {@return `shadingRateCoarseSampleOrder`}
    public int shadingRateCoarseSampleOrder() { return shadingRateCoarseSampleOrder(this.segment(), 0L); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateCoarseSampleOrder(MemorySegment segment, long index, int value) { VH_shadingRateCoarseSampleOrder.set(segment, 0L, index, value); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(int value) { shadingRateCoarseSampleOrder(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShadingRateImageFeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceShadingRateImageFeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`
        public VkPhysicalDeviceShadingRateImageFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`
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

        /// {@return `shadingRateImage` at the given index}
        /// @param index the index of the struct buffer
        public int shadingRateImageAt(long index) { return shadingRateImage(this.segment(), index); }
        /// Sets `shadingRateImage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateImageAt(long index, int value) { shadingRateImage(this.segment(), index, value); return this; }

        /// {@return `shadingRateCoarseSampleOrder` at the given index}
        /// @param index the index of the struct buffer
        public int shadingRateCoarseSampleOrderAt(long index) { return shadingRateCoarseSampleOrder(this.segment(), index); }
        /// Sets `shadingRateCoarseSampleOrder` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateCoarseSampleOrderAt(long index, int value) { shadingRateCoarseSampleOrder(this.segment(), index, value); return this; }

    }
}
