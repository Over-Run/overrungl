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
/// struct VkPhysicalDeviceMaintenance6Properties {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 blockTexelViewCompatibleMultipleLayers;
///     uint32_t maxCombinedImageSamplerDescriptorCount;
///     VkBool32 fragmentShadingRateClampCombinerInputs;
/// };
/// ```
public sealed class VkPhysicalDeviceMaintenance6Properties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance6Properties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
        ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs")
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
    /// The byte offset of `blockTexelViewCompatibleMultipleLayers`.
    public static final long OFFSET_blockTexelViewCompatibleMultipleLayers = LAYOUT.byteOffset(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The memory layout of `blockTexelViewCompatibleMultipleLayers`.
    public static final MemoryLayout LAYOUT_blockTexelViewCompatibleMultipleLayers = LAYOUT.select(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The [VarHandle] of `blockTexelViewCompatibleMultipleLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blockTexelViewCompatibleMultipleLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The byte offset of `maxCombinedImageSamplerDescriptorCount`.
    public static final long OFFSET_maxCombinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The memory layout of `maxCombinedImageSamplerDescriptorCount`.
    public static final MemoryLayout LAYOUT_maxCombinedImageSamplerDescriptorCount = LAYOUT.select(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The [VarHandle] of `maxCombinedImageSamplerDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxCombinedImageSamplerDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The byte offset of `fragmentShadingRateClampCombinerInputs`.
    public static final long OFFSET_fragmentShadingRateClampCombinerInputs = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    /// The memory layout of `fragmentShadingRateClampCombinerInputs`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateClampCombinerInputs = LAYOUT.select(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    /// The [VarHandle] of `fragmentShadingRateClampCombinerInputs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateClampCombinerInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));

    /// Creates `VkPhysicalDeviceMaintenance6Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMaintenance6Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMaintenance6Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance6Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance6Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMaintenance6Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMaintenance6Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance6Properties`
    public static VkPhysicalDeviceMaintenance6Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance6Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMaintenance6Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance6Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties copyFrom(VkPhysicalDeviceMaintenance6Properties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceMaintenance6Properties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance6Properties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index) { return (int) VH_blockTexelViewCompatibleMultipleLayers.get(segment, 0L, index); }
    /// {@return `blockTexelViewCompatibleMultipleLayers`}
    public int blockTexelViewCompatibleMultipleLayers() { return blockTexelViewCompatibleMultipleLayers(this.segment(), 0L); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index, int value) { VH_blockTexelViewCompatibleMultipleLayers.set(segment, 0L, index, value); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties blockTexelViewCompatibleMultipleLayers(int value) { blockTexelViewCompatibleMultipleLayers(this.segment(), 0L, value); return this; }

    /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index) { return (int) VH_maxCombinedImageSamplerDescriptorCount.get(segment, 0L, index); }
    /// {@return `maxCombinedImageSamplerDescriptorCount`}
    public int maxCombinedImageSamplerDescriptorCount() { return maxCombinedImageSamplerDescriptorCount(this.segment(), 0L); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index, int value) { VH_maxCombinedImageSamplerDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties maxCombinedImageSamplerDescriptorCount(int value) { maxCombinedImageSamplerDescriptorCount(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateClampCombinerInputs.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateClampCombinerInputs`}
    public int fragmentShadingRateClampCombinerInputs() { return fragmentShadingRateClampCombinerInputs(this.segment(), 0L); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index, int value) { VH_fragmentShadingRateClampCombinerInputs.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties fragmentShadingRateClampCombinerInputs(int value) { fragmentShadingRateClampCombinerInputs(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceMaintenance6Properties].
    public static final class Buffer extends VkPhysicalDeviceMaintenance6Properties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMaintenance6Properties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMaintenance6Properties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMaintenance6Properties`
        public VkPhysicalDeviceMaintenance6Properties asSlice(long index) { return new VkPhysicalDeviceMaintenance6Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMaintenance6Properties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMaintenance6Properties`
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

        /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
        /// @param index the index of the struct buffer
        public int blockTexelViewCompatibleMultipleLayersAt(long index) { return blockTexelViewCompatibleMultipleLayers(this.segment(), index); }
        /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer blockTexelViewCompatibleMultipleLayersAt(long index, int value) { blockTexelViewCompatibleMultipleLayers(this.segment(), index, value); return this; }

        /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxCombinedImageSamplerDescriptorCountAt(long index) { return maxCombinedImageSamplerDescriptorCount(this.segment(), index); }
        /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxCombinedImageSamplerDescriptorCountAt(long index, int value) { maxCombinedImageSamplerDescriptorCount(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentShadingRateClampCombinerInputsAt(long index) { return fragmentShadingRateClampCombinerInputs(this.segment(), index); }
        /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateClampCombinerInputsAt(long index, int value) { fragmentShadingRateClampCombinerInputs(this.segment(), index, value); return this; }

    }
}
