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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkanMemoryModelFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 vulkanMemoryModel;
///     (uint32_t) VkBool32 vulkanMemoryModelDeviceScope;
///     (uint32_t) VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
/// };
/// ```
public final class VkPhysicalDeviceVulkanMemoryModelFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`.
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

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vulkanMemoryModel `vulkanMemoryModel`
    /// @param vulkanMemoryModelDeviceScope `vulkanMemoryModelDeviceScope`
    /// @param vulkanMemoryModelAvailabilityVisibilityChains `vulkanMemoryModelAvailabilityVisibilityChains`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vulkanMemoryModel, int vulkanMemoryModelDeviceScope, int vulkanMemoryModelAvailabilityVisibilityChains) {
        return alloc(allocator).sType(sType).pNext(pNext).vulkanMemoryModel(vulkanMemoryModel).vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope).vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);
    }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vulkanMemoryModel `vulkanMemoryModel`
    /// @param vulkanMemoryModelDeviceScope `vulkanMemoryModelDeviceScope`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vulkanMemoryModel, int vulkanMemoryModelDeviceScope) {
        return alloc(allocator).sType(sType).pNext(pNext).vulkanMemoryModel(vulkanMemoryModel).vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
    }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param vulkanMemoryModel `vulkanMemoryModel`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int vulkanMemoryModel) {
        return alloc(allocator).sType(sType).pNext(pNext).vulkanMemoryModel(vulkanMemoryModel);
    }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR copyFrom(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModel(int value) { vulkanMemoryModel(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelDeviceScope(int value) { vulkanMemoryModelDeviceScope(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelAvailabilityVisibilityChains(int value) { vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVulkanMemoryModelFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR at(long index, Consumer<VkPhysicalDeviceVulkanMemoryModelFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModel` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelAt(long index) { return vulkanMemoryModel(this.segment(), index); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelAt(long index, int value) { vulkanMemoryModel(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelDeviceScopeAt(long index) { return vulkanMemoryModelDeviceScope(this.segment(), index); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelDeviceScopeAt(long index, int value) { vulkanMemoryModelDeviceScope(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, int value) { vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index, value); return this; }

}
