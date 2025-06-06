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
/// struct VkPhysicalDeviceVulkanMemoryModelFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 vulkanMemoryModel;
///     (uint32_t) VkBool32 vulkanMemoryModelDeviceScope;
///     (uint32_t) VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
/// };
/// ```
public sealed class VkPhysicalDeviceVulkanMemoryModelFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkanMemoryModelFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModel"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains")
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
    /// The byte offset of `vulkanMemoryModel`.
    public static final long OFFSET_vulkanMemoryModel = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModel"));
    /// The memory layout of `vulkanMemoryModel`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModel = LAYOUT.select(PathElement.groupElement("vulkanMemoryModel"));
    /// The [VarHandle] of `vulkanMemoryModel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModel"));
    /// The byte offset of `vulkanMemoryModelDeviceScope`.
    public static final long OFFSET_vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The memory layout of `vulkanMemoryModelDeviceScope`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModelDeviceScope = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The [VarHandle] of `vulkanMemoryModelDeviceScope` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModelDeviceScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The byte offset of `vulkanMemoryModelAvailabilityVisibilityChains`.
    public static final long OFFSET_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    /// The memory layout of `vulkanMemoryModelAvailabilityVisibilityChains`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    /// The [VarHandle] of `vulkanMemoryModelAvailabilityVisibilityChains` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkanMemoryModelFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vulkanMemoryModel `vulkanMemoryModel`
    /// @param vulkanMemoryModelDeviceScope `vulkanMemoryModelDeviceScope`
    /// @param vulkanMemoryModelAvailabilityVisibilityChains `vulkanMemoryModelAvailabilityVisibilityChains`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vulkanMemoryModel, int vulkanMemoryModelDeviceScope, int vulkanMemoryModelAvailabilityVisibilityChains) {
        return alloc(allocator).sType(sType).pNext(pNext).vulkanMemoryModel(vulkanMemoryModel).vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope).vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);
    }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vulkanMemoryModel `vulkanMemoryModel`
    /// @param vulkanMemoryModelDeviceScope `vulkanMemoryModelDeviceScope`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vulkanMemoryModel, int vulkanMemoryModelDeviceScope) {
        return alloc(allocator).sType(sType).pNext(pNext).vulkanMemoryModel(vulkanMemoryModel).vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
    }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vulkanMemoryModel `vulkanMemoryModel`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vulkanMemoryModel) {
        return alloc(allocator).sType(sType).pNext(pNext).vulkanMemoryModel(vulkanMemoryModel);
    }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures copyFrom(VkPhysicalDeviceVulkanMemoryModelFeatures src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModel(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModel.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModel`}
    public int vulkanMemoryModel() { return vulkanMemoryModel(this.segment(), 0L); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModel(MemorySegment segment, long index, int value) { VH_vulkanMemoryModel.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(int value) { vulkanMemoryModel(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModelDeviceScope(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelDeviceScope.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelDeviceScope`}
    public int vulkanMemoryModelDeviceScope() { return vulkanMemoryModelDeviceScope(this.segment(), 0L); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModelDeviceScope(MemorySegment segment, long index, int value) { VH_vulkanMemoryModelDeviceScope.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(int value) { vulkanMemoryModelDeviceScope(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains`}
    public int vulkanMemoryModelAvailabilityVisibilityChains() { return vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), 0L); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index, int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChains(int value) { vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceVulkanMemoryModelFeatures].
    public static final class Buffer extends VkPhysicalDeviceVulkanMemoryModelFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVulkanMemoryModelFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVulkanMemoryModelFeatures`
        public VkPhysicalDeviceVulkanMemoryModelFeatures asSlice(long index) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVulkanMemoryModelFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVulkanMemoryModelFeatures`
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

        /// {@return `vulkanMemoryModel` at the given index}
        /// @param index the index of the struct buffer
        public int vulkanMemoryModelAt(long index) { return vulkanMemoryModel(this.segment(), index); }
        /// Sets `vulkanMemoryModel` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vulkanMemoryModelAt(long index, int value) { vulkanMemoryModel(this.segment(), index, value); return this; }

        /// {@return `vulkanMemoryModelDeviceScope` at the given index}
        /// @param index the index of the struct buffer
        public int vulkanMemoryModelDeviceScopeAt(long index) { return vulkanMemoryModelDeviceScope(this.segment(), index); }
        /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vulkanMemoryModelDeviceScopeAt(long index, int value) { vulkanMemoryModelDeviceScope(this.segment(), index, value); return this; }

        /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
        /// @param index the index of the struct buffer
        public int vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index); }
        /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, int value) { vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index, value); return this; }

    }
}
