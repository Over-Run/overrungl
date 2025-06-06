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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 subsampledLoads;
///     (uint32_t) VkBool32 subsampledCoarseReconstructionEarlyAccess;
///     uint32_t maxSubsampledArrayLayers;
///     uint32_t maxDescriptorSetSubsampledSamplers;
/// };
/// ```
public sealed class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subsampledLoads"),
        ValueLayout.JAVA_INT.withName("subsampledCoarseReconstructionEarlyAccess"),
        ValueLayout.JAVA_INT.withName("maxSubsampledArrayLayers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetSubsampledSamplers")
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
    /// The byte offset of `subsampledLoads`.
    public static final long OFFSET_subsampledLoads = LAYOUT.byteOffset(PathElement.groupElement("subsampledLoads"));
    /// The memory layout of `subsampledLoads`.
    public static final MemoryLayout LAYOUT_subsampledLoads = LAYOUT.select(PathElement.groupElement("subsampledLoads"));
    /// The [VarHandle] of `subsampledLoads` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subsampledLoads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampledLoads"));
    /// The byte offset of `subsampledCoarseReconstructionEarlyAccess`.
    public static final long OFFSET_subsampledCoarseReconstructionEarlyAccess = LAYOUT.byteOffset(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
    /// The memory layout of `subsampledCoarseReconstructionEarlyAccess`.
    public static final MemoryLayout LAYOUT_subsampledCoarseReconstructionEarlyAccess = LAYOUT.select(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
    /// The [VarHandle] of `subsampledCoarseReconstructionEarlyAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subsampledCoarseReconstructionEarlyAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
    /// The byte offset of `maxSubsampledArrayLayers`.
    public static final long OFFSET_maxSubsampledArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxSubsampledArrayLayers"));
    /// The memory layout of `maxSubsampledArrayLayers`.
    public static final MemoryLayout LAYOUT_maxSubsampledArrayLayers = LAYOUT.select(PathElement.groupElement("maxSubsampledArrayLayers"));
    /// The [VarHandle] of `maxSubsampledArrayLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSubsampledArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubsampledArrayLayers"));
    /// The byte offset of `maxDescriptorSetSubsampledSamplers`.
    public static final long OFFSET_maxDescriptorSetSubsampledSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));
    /// The memory layout of `maxDescriptorSetSubsampledSamplers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetSubsampledSamplers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));
    /// The [VarHandle] of `maxDescriptorSetSubsampledSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetSubsampledSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));

    /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param subsampledLoads `subsampledLoads`
    /// @param subsampledCoarseReconstructionEarlyAccess `subsampledCoarseReconstructionEarlyAccess`
    /// @param maxSubsampledArrayLayers `maxSubsampledArrayLayers`
    /// @param maxDescriptorSetSubsampledSamplers `maxDescriptorSetSubsampledSamplers`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int subsampledLoads, int subsampledCoarseReconstructionEarlyAccess, int maxSubsampledArrayLayers, int maxDescriptorSetSubsampledSamplers) {
        return alloc(allocator).sType(sType).pNext(pNext).subsampledLoads(subsampledLoads).subsampledCoarseReconstructionEarlyAccess(subsampledCoarseReconstructionEarlyAccess).maxSubsampledArrayLayers(maxSubsampledArrayLayers).maxDescriptorSetSubsampledSamplers(maxDescriptorSetSubsampledSamplers);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param subsampledLoads `subsampledLoads`
    /// @param subsampledCoarseReconstructionEarlyAccess `subsampledCoarseReconstructionEarlyAccess`
    /// @param maxSubsampledArrayLayers `maxSubsampledArrayLayers`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int subsampledLoads, int subsampledCoarseReconstructionEarlyAccess, int maxSubsampledArrayLayers) {
        return alloc(allocator).sType(sType).pNext(pNext).subsampledLoads(subsampledLoads).subsampledCoarseReconstructionEarlyAccess(subsampledCoarseReconstructionEarlyAccess).maxSubsampledArrayLayers(maxSubsampledArrayLayers);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param subsampledLoads `subsampledLoads`
    /// @param subsampledCoarseReconstructionEarlyAccess `subsampledCoarseReconstructionEarlyAccess`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int subsampledLoads, int subsampledCoarseReconstructionEarlyAccess) {
        return alloc(allocator).sType(sType).pNext(pNext).subsampledLoads(subsampledLoads).subsampledCoarseReconstructionEarlyAccess(subsampledCoarseReconstructionEarlyAccess);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param subsampledLoads `subsampledLoads`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int subsampledLoads) {
        return alloc(allocator).sType(sType).pNext(pNext).subsampledLoads(subsampledLoads);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT copyFrom(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `subsampledLoads` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subsampledLoads(MemorySegment segment, long index) { return (int) VH_subsampledLoads.get(segment, 0L, index); }
    /// {@return `subsampledLoads`}
    public int subsampledLoads() { return subsampledLoads(this.segment(), 0L); }
    /// Sets `subsampledLoads` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subsampledLoads(MemorySegment segment, long index, int value) { VH_subsampledLoads.set(segment, 0L, index, value); }
    /// Sets `subsampledLoads` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledLoads(int value) { subsampledLoads(this.segment(), 0L, value); return this; }

    /// {@return `subsampledCoarseReconstructionEarlyAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subsampledCoarseReconstructionEarlyAccess(MemorySegment segment, long index) { return (int) VH_subsampledCoarseReconstructionEarlyAccess.get(segment, 0L, index); }
    /// {@return `subsampledCoarseReconstructionEarlyAccess`}
    public int subsampledCoarseReconstructionEarlyAccess() { return subsampledCoarseReconstructionEarlyAccess(this.segment(), 0L); }
    /// Sets `subsampledCoarseReconstructionEarlyAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subsampledCoarseReconstructionEarlyAccess(MemorySegment segment, long index, int value) { VH_subsampledCoarseReconstructionEarlyAccess.set(segment, 0L, index, value); }
    /// Sets `subsampledCoarseReconstructionEarlyAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledCoarseReconstructionEarlyAccess(int value) { subsampledCoarseReconstructionEarlyAccess(this.segment(), 0L, value); return this; }

    /// {@return `maxSubsampledArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSubsampledArrayLayers(MemorySegment segment, long index) { return (int) VH_maxSubsampledArrayLayers.get(segment, 0L, index); }
    /// {@return `maxSubsampledArrayLayers`}
    public int maxSubsampledArrayLayers() { return maxSubsampledArrayLayers(this.segment(), 0L); }
    /// Sets `maxSubsampledArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSubsampledArrayLayers(MemorySegment segment, long index, int value) { VH_maxSubsampledArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxSubsampledArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxSubsampledArrayLayers(int value) { maxSubsampledArrayLayers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetSubsampledSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetSubsampledSamplers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetSubsampledSamplers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetSubsampledSamplers`}
    public int maxDescriptorSetSubsampledSamplers() { return maxDescriptorSetSubsampledSamplers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetSubsampledSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetSubsampledSamplers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetSubsampledSamplers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetSubsampledSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxDescriptorSetSubsampledSamplers(int value) { maxDescriptorSetSubsampledSamplers(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentDensityMap2PropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
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

        /// {@return `subsampledLoads` at the given index}
        /// @param index the index of the struct buffer
        public int subsampledLoadsAt(long index) { return subsampledLoads(this.segment(), index); }
        /// Sets `subsampledLoads` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subsampledLoadsAt(long index, int value) { subsampledLoads(this.segment(), index, value); return this; }

        /// {@return `subsampledCoarseReconstructionEarlyAccess` at the given index}
        /// @param index the index of the struct buffer
        public int subsampledCoarseReconstructionEarlyAccessAt(long index) { return subsampledCoarseReconstructionEarlyAccess(this.segment(), index); }
        /// Sets `subsampledCoarseReconstructionEarlyAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subsampledCoarseReconstructionEarlyAccessAt(long index, int value) { subsampledCoarseReconstructionEarlyAccess(this.segment(), index, value); return this; }

        /// {@return `maxSubsampledArrayLayers` at the given index}
        /// @param index the index of the struct buffer
        public int maxSubsampledArrayLayersAt(long index) { return maxSubsampledArrayLayers(this.segment(), index); }
        /// Sets `maxSubsampledArrayLayers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxSubsampledArrayLayersAt(long index, int value) { maxSubsampledArrayLayers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetSubsampledSamplers` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetSubsampledSamplersAt(long index) { return maxDescriptorSetSubsampledSamplers(this.segment(), index); }
        /// Sets `maxDescriptorSetSubsampledSamplers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetSubsampledSamplersAt(long index, int value) { maxDescriptorSetSubsampledSamplers(this.segment(), index, value); return this; }

    }
}
