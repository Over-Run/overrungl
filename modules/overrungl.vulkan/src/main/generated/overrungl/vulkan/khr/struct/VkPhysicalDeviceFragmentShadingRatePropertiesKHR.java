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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkExtent2D) VkExtent2D minFragmentShadingRateAttachmentTexelSize;
///     (struct VkExtent2D) VkExtent2D maxFragmentShadingRateAttachmentTexelSize;
///     uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio;
///     (uint32_t) VkBool32 primitiveFragmentShadingRateWithMultipleViewports;
///     (uint32_t) VkBool32 layeredShadingRateAttachments;
///     (uint32_t) VkBool32 fragmentShadingRateNonTrivialCombinerOps;
///     (struct VkExtent2D) VkExtent2D maxFragmentSize;
///     uint32_t maxFragmentSizeAspectRatio;
///     uint32_t maxFragmentShadingRateCoverageSamples;
///     (int) VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples;
///     (uint32_t) VkBool32 fragmentShadingRateWithShaderDepthStencilWrites;
///     (uint32_t) VkBool32 fragmentShadingRateWithSampleMask;
///     (uint32_t) VkBool32 fragmentShadingRateWithShaderSampleMask;
///     (uint32_t) VkBool32 fragmentShadingRateWithConservativeRasterization;
///     (uint32_t) VkBool32 fragmentShadingRateWithFragmentShaderInterlock;
///     (uint32_t) VkBool32 fragmentShadingRateWithCustomSampleLocations;
///     (uint32_t) VkBool32 fragmentShadingRateStrictMultiplyCombiner;
/// };
/// ```
public final class VkPhysicalDeviceFragmentShadingRatePropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minFragmentShadingRateAttachmentTexelSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxFragmentShadingRateAttachmentTexelSize"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateWithMultipleViewports"),
        ValueLayout.JAVA_INT.withName("layeredShadingRateAttachments"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateNonTrivialCombinerOps"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxFragmentSize"),
        ValueLayout.JAVA_INT.withName("maxFragmentSizeAspectRatio"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateCoverageSamples"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateRasterizationSamples"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithShaderDepthStencilWrites"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithSampleMask"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithShaderSampleMask"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithConservativeRasterization"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithFragmentShaderInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithCustomSampleLocations"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateStrictMultiplyCombiner")
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
    /// The byte offset of `minFragmentShadingRateAttachmentTexelSize`.
    public static final long OFFSET_minFragmentShadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"));
    /// The memory layout of `minFragmentShadingRateAttachmentTexelSize`.
    public static final MemoryLayout LAYOUT_minFragmentShadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"));
    /// The byte offset of `maxFragmentShadingRateAttachmentTexelSize`.
    public static final long OFFSET_maxFragmentShadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"));
    /// The memory layout of `maxFragmentShadingRateAttachmentTexelSize`.
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"));
    /// The byte offset of `maxFragmentShadingRateAttachmentTexelSizeAspectRatio`.
    public static final long OFFSET_maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
    /// The memory layout of `maxFragmentShadingRateAttachmentTexelSizeAspectRatio`.
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
    /// The [VarHandle] of `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
    /// The byte offset of `primitiveFragmentShadingRateWithMultipleViewports`.
    public static final long OFFSET_primitiveFragmentShadingRateWithMultipleViewports = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
    /// The memory layout of `primitiveFragmentShadingRateWithMultipleViewports`.
    public static final MemoryLayout LAYOUT_primitiveFragmentShadingRateWithMultipleViewports = LAYOUT.select(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
    /// The [VarHandle] of `primitiveFragmentShadingRateWithMultipleViewports` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveFragmentShadingRateWithMultipleViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
    /// The byte offset of `layeredShadingRateAttachments`.
    public static final long OFFSET_layeredShadingRateAttachments = LAYOUT.byteOffset(PathElement.groupElement("layeredShadingRateAttachments"));
    /// The memory layout of `layeredShadingRateAttachments`.
    public static final MemoryLayout LAYOUT_layeredShadingRateAttachments = LAYOUT.select(PathElement.groupElement("layeredShadingRateAttachments"));
    /// The [VarHandle] of `layeredShadingRateAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layeredShadingRateAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredShadingRateAttachments"));
    /// The byte offset of `fragmentShadingRateNonTrivialCombinerOps`.
    public static final long OFFSET_fragmentShadingRateNonTrivialCombinerOps = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
    /// The memory layout of `fragmentShadingRateNonTrivialCombinerOps`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateNonTrivialCombinerOps = LAYOUT.select(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
    /// The [VarHandle] of `fragmentShadingRateNonTrivialCombinerOps` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateNonTrivialCombinerOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
    /// The byte offset of `maxFragmentSize`.
    public static final long OFFSET_maxFragmentSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentSize"));
    /// The memory layout of `maxFragmentSize`.
    public static final MemoryLayout LAYOUT_maxFragmentSize = LAYOUT.select(PathElement.groupElement("maxFragmentSize"));
    /// The byte offset of `maxFragmentSizeAspectRatio`.
    public static final long OFFSET_maxFragmentSizeAspectRatio = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentSizeAspectRatio"));
    /// The memory layout of `maxFragmentSizeAspectRatio`.
    public static final MemoryLayout LAYOUT_maxFragmentSizeAspectRatio = LAYOUT.select(PathElement.groupElement("maxFragmentSizeAspectRatio"));
    /// The [VarHandle] of `maxFragmentSizeAspectRatio` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxFragmentSizeAspectRatio = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentSizeAspectRatio"));
    /// The byte offset of `maxFragmentShadingRateCoverageSamples`.
    public static final long OFFSET_maxFragmentShadingRateCoverageSamples = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
    /// The memory layout of `maxFragmentShadingRateCoverageSamples`.
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateCoverageSamples = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
    /// The [VarHandle] of `maxFragmentShadingRateCoverageSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxFragmentShadingRateCoverageSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
    /// The byte offset of `maxFragmentShadingRateRasterizationSamples`.
    public static final long OFFSET_maxFragmentShadingRateRasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
    /// The memory layout of `maxFragmentShadingRateRasterizationSamples`.
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateRasterizationSamples = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
    /// The [VarHandle] of `maxFragmentShadingRateRasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxFragmentShadingRateRasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
    /// The byte offset of `fragmentShadingRateWithShaderDepthStencilWrites`.
    public static final long OFFSET_fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
    /// The memory layout of `fragmentShadingRateWithShaderDepthStencilWrites`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
    /// The [VarHandle] of `fragmentShadingRateWithShaderDepthStencilWrites` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
    /// The byte offset of `fragmentShadingRateWithSampleMask`.
    public static final long OFFSET_fragmentShadingRateWithSampleMask = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
    /// The memory layout of `fragmentShadingRateWithSampleMask`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithSampleMask = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
    /// The [VarHandle] of `fragmentShadingRateWithSampleMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateWithSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
    /// The byte offset of `fragmentShadingRateWithShaderSampleMask`.
    public static final long OFFSET_fragmentShadingRateWithShaderSampleMask = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
    /// The memory layout of `fragmentShadingRateWithShaderSampleMask`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithShaderSampleMask = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
    /// The [VarHandle] of `fragmentShadingRateWithShaderSampleMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateWithShaderSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
    /// The byte offset of `fragmentShadingRateWithConservativeRasterization`.
    public static final long OFFSET_fragmentShadingRateWithConservativeRasterization = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
    /// The memory layout of `fragmentShadingRateWithConservativeRasterization`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithConservativeRasterization = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
    /// The [VarHandle] of `fragmentShadingRateWithConservativeRasterization` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateWithConservativeRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
    /// The byte offset of `fragmentShadingRateWithFragmentShaderInterlock`.
    public static final long OFFSET_fragmentShadingRateWithFragmentShaderInterlock = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
    /// The memory layout of `fragmentShadingRateWithFragmentShaderInterlock`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithFragmentShaderInterlock = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
    /// The [VarHandle] of `fragmentShadingRateWithFragmentShaderInterlock` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateWithFragmentShaderInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
    /// The byte offset of `fragmentShadingRateWithCustomSampleLocations`.
    public static final long OFFSET_fragmentShadingRateWithCustomSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
    /// The memory layout of `fragmentShadingRateWithCustomSampleLocations`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithCustomSampleLocations = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
    /// The [VarHandle] of `fragmentShadingRateWithCustomSampleLocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateWithCustomSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
    /// The byte offset of `fragmentShadingRateStrictMultiplyCombiner`.
    public static final long OFFSET_fragmentShadingRateStrictMultiplyCombiner = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));
    /// The memory layout of `fragmentShadingRateStrictMultiplyCombiner`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateStrictMultiplyCombiner = LAYOUT.select(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));
    /// The [VarHandle] of `fragmentShadingRateStrictMultiplyCombiner` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateStrictMultiplyCombiner = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR copyFrom(VkPhysicalDeviceFragmentShadingRatePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minFragmentShadingRateAttachmentTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minFragmentShadingRateAttachmentTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minFragmentShadingRateAttachmentTexelSize, index), LAYOUT_minFragmentShadingRateAttachmentTexelSize); }
    /// {@return `minFragmentShadingRateAttachmentTexelSize`}
    public MemorySegment minFragmentShadingRateAttachmentTexelSize() { return minFragmentShadingRateAttachmentTexelSize(this.segment(), 0L); }
    /// Sets `minFragmentShadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minFragmentShadingRateAttachmentTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minFragmentShadingRateAttachmentTexelSize, index), LAYOUT_minFragmentShadingRateAttachmentTexelSize.byteSize()); }
    /// Sets `minFragmentShadingRateAttachmentTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize(MemorySegment value) { minFragmentShadingRateAttachmentTexelSize(this.segment(), 0L, value); return this; }
    /// Accepts `minFragmentShadingRateAttachmentTexelSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minFragmentShadingRateAttachmentTexelSize())); return this; }

    /// {@return `maxFragmentShadingRateAttachmentTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxFragmentShadingRateAttachmentTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFragmentShadingRateAttachmentTexelSize, index), LAYOUT_maxFragmentShadingRateAttachmentTexelSize); }
    /// {@return `maxFragmentShadingRateAttachmentTexelSize`}
    public MemorySegment maxFragmentShadingRateAttachmentTexelSize() { return maxFragmentShadingRateAttachmentTexelSize(this.segment(), 0L); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentShadingRateAttachmentTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFragmentShadingRateAttachmentTexelSize, index), LAYOUT_maxFragmentShadingRateAttachmentTexelSize.byteSize()); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize(MemorySegment value) { maxFragmentShadingRateAttachmentTexelSize(this.segment(), 0L, value); return this; }
    /// Accepts `maxFragmentShadingRateAttachmentTexelSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxFragmentShadingRateAttachmentTexelSize())); return this; }

    /// {@return `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment segment, long index) { return (int) VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio.get(segment, 0L, index); }
    /// {@return `maxFragmentShadingRateAttachmentTexelSizeAspectRatio`}
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() { return maxFragmentShadingRateAttachmentTexelSizeAspectRatio(this.segment(), 0L); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment segment, long index, int value) { VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio.set(segment, 0L, index, value); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSizeAspectRatio(int value) { maxFragmentShadingRateAttachmentTexelSizeAspectRatio(this.segment(), 0L, value); return this; }

    /// {@return `primitiveFragmentShadingRateWithMultipleViewports` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitiveFragmentShadingRateWithMultipleViewports(MemorySegment segment, long index) { return (int) VH_primitiveFragmentShadingRateWithMultipleViewports.get(segment, 0L, index); }
    /// {@return `primitiveFragmentShadingRateWithMultipleViewports`}
    public int primitiveFragmentShadingRateWithMultipleViewports() { return primitiveFragmentShadingRateWithMultipleViewports(this.segment(), 0L); }
    /// Sets `primitiveFragmentShadingRateWithMultipleViewports` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveFragmentShadingRateWithMultipleViewports(MemorySegment segment, long index, int value) { VH_primitiveFragmentShadingRateWithMultipleViewports.set(segment, 0L, index, value); }
    /// Sets `primitiveFragmentShadingRateWithMultipleViewports` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR primitiveFragmentShadingRateWithMultipleViewports(int value) { primitiveFragmentShadingRateWithMultipleViewports(this.segment(), 0L, value); return this; }

    /// {@return `layeredShadingRateAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layeredShadingRateAttachments(MemorySegment segment, long index) { return (int) VH_layeredShadingRateAttachments.get(segment, 0L, index); }
    /// {@return `layeredShadingRateAttachments`}
    public int layeredShadingRateAttachments() { return layeredShadingRateAttachments(this.segment(), 0L); }
    /// Sets `layeredShadingRateAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layeredShadingRateAttachments(MemorySegment segment, long index, int value) { VH_layeredShadingRateAttachments.set(segment, 0L, index, value); }
    /// Sets `layeredShadingRateAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR layeredShadingRateAttachments(int value) { layeredShadingRateAttachments(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateNonTrivialCombinerOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateNonTrivialCombinerOps(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateNonTrivialCombinerOps.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateNonTrivialCombinerOps`}
    public int fragmentShadingRateNonTrivialCombinerOps() { return fragmentShadingRateNonTrivialCombinerOps(this.segment(), 0L); }
    /// Sets `fragmentShadingRateNonTrivialCombinerOps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateNonTrivialCombinerOps(MemorySegment segment, long index, int value) { VH_fragmentShadingRateNonTrivialCombinerOps.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateNonTrivialCombinerOps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateNonTrivialCombinerOps(int value) { fragmentShadingRateNonTrivialCombinerOps(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxFragmentSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFragmentSize, index), LAYOUT_maxFragmentSize); }
    /// {@return `maxFragmentSize`}
    public MemorySegment maxFragmentSize() { return maxFragmentSize(this.segment(), 0L); }
    /// Sets `maxFragmentSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFragmentSize, index), LAYOUT_maxFragmentSize.byteSize()); }
    /// Sets `maxFragmentSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize(MemorySegment value) { maxFragmentSize(this.segment(), 0L, value); return this; }
    /// Accepts `maxFragmentSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxFragmentSize())); return this; }

    /// {@return `maxFragmentSizeAspectRatio` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentSizeAspectRatio(MemorySegment segment, long index) { return (int) VH_maxFragmentSizeAspectRatio.get(segment, 0L, index); }
    /// {@return `maxFragmentSizeAspectRatio`}
    public int maxFragmentSizeAspectRatio() { return maxFragmentSizeAspectRatio(this.segment(), 0L); }
    /// Sets `maxFragmentSizeAspectRatio` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentSizeAspectRatio(MemorySegment segment, long index, int value) { VH_maxFragmentSizeAspectRatio.set(segment, 0L, index, value); }
    /// Sets `maxFragmentSizeAspectRatio` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSizeAspectRatio(int value) { maxFragmentSizeAspectRatio(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentShadingRateCoverageSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentShadingRateCoverageSamples(MemorySegment segment, long index) { return (int) VH_maxFragmentShadingRateCoverageSamples.get(segment, 0L, index); }
    /// {@return `maxFragmentShadingRateCoverageSamples`}
    public int maxFragmentShadingRateCoverageSamples() { return maxFragmentShadingRateCoverageSamples(this.segment(), 0L); }
    /// Sets `maxFragmentShadingRateCoverageSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentShadingRateCoverageSamples(MemorySegment segment, long index, int value) { VH_maxFragmentShadingRateCoverageSamples.set(segment, 0L, index, value); }
    /// Sets `maxFragmentShadingRateCoverageSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateCoverageSamples(int value) { maxFragmentShadingRateCoverageSamples(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentShadingRateRasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentShadingRateRasterizationSamples(MemorySegment segment, long index) { return (int) VH_maxFragmentShadingRateRasterizationSamples.get(segment, 0L, index); }
    /// {@return `maxFragmentShadingRateRasterizationSamples`}
    public int maxFragmentShadingRateRasterizationSamples() { return maxFragmentShadingRateRasterizationSamples(this.segment(), 0L); }
    /// Sets `maxFragmentShadingRateRasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentShadingRateRasterizationSamples(MemorySegment segment, long index, int value) { VH_maxFragmentShadingRateRasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `maxFragmentShadingRateRasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateRasterizationSamples(int value) { maxFragmentShadingRateRasterizationSamples(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateWithShaderDepthStencilWrites` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithShaderDepthStencilWrites.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithShaderDepthStencilWrites`}
    public int fragmentShadingRateWithShaderDepthStencilWrites() { return fragmentShadingRateWithShaderDepthStencilWrites(this.segment(), 0L); }
    /// Sets `fragmentShadingRateWithShaderDepthStencilWrites` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment segment, long index, int value) { VH_fragmentShadingRateWithShaderDepthStencilWrites.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithShaderDepthStencilWrites` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderDepthStencilWrites(int value) { fragmentShadingRateWithShaderDepthStencilWrites(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateWithSampleMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateWithSampleMask(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithSampleMask.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithSampleMask`}
    public int fragmentShadingRateWithSampleMask() { return fragmentShadingRateWithSampleMask(this.segment(), 0L); }
    /// Sets `fragmentShadingRateWithSampleMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateWithSampleMask(MemorySegment segment, long index, int value) { VH_fragmentShadingRateWithSampleMask.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithSampleMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithSampleMask(int value) { fragmentShadingRateWithSampleMask(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateWithShaderSampleMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateWithShaderSampleMask(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithShaderSampleMask.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithShaderSampleMask`}
    public int fragmentShadingRateWithShaderSampleMask() { return fragmentShadingRateWithShaderSampleMask(this.segment(), 0L); }
    /// Sets `fragmentShadingRateWithShaderSampleMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateWithShaderSampleMask(MemorySegment segment, long index, int value) { VH_fragmentShadingRateWithShaderSampleMask.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithShaderSampleMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderSampleMask(int value) { fragmentShadingRateWithShaderSampleMask(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateWithConservativeRasterization` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateWithConservativeRasterization(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithConservativeRasterization.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithConservativeRasterization`}
    public int fragmentShadingRateWithConservativeRasterization() { return fragmentShadingRateWithConservativeRasterization(this.segment(), 0L); }
    /// Sets `fragmentShadingRateWithConservativeRasterization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateWithConservativeRasterization(MemorySegment segment, long index, int value) { VH_fragmentShadingRateWithConservativeRasterization.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithConservativeRasterization` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithConservativeRasterization(int value) { fragmentShadingRateWithConservativeRasterization(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateWithFragmentShaderInterlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateWithFragmentShaderInterlock(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithFragmentShaderInterlock.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithFragmentShaderInterlock`}
    public int fragmentShadingRateWithFragmentShaderInterlock() { return fragmentShadingRateWithFragmentShaderInterlock(this.segment(), 0L); }
    /// Sets `fragmentShadingRateWithFragmentShaderInterlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateWithFragmentShaderInterlock(MemorySegment segment, long index, int value) { VH_fragmentShadingRateWithFragmentShaderInterlock.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithFragmentShaderInterlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithFragmentShaderInterlock(int value) { fragmentShadingRateWithFragmentShaderInterlock(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateWithCustomSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateWithCustomSampleLocations(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithCustomSampleLocations.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithCustomSampleLocations`}
    public int fragmentShadingRateWithCustomSampleLocations() { return fragmentShadingRateWithCustomSampleLocations(this.segment(), 0L); }
    /// Sets `fragmentShadingRateWithCustomSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateWithCustomSampleLocations(MemorySegment segment, long index, int value) { VH_fragmentShadingRateWithCustomSampleLocations.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithCustomSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithCustomSampleLocations(int value) { fragmentShadingRateWithCustomSampleLocations(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateStrictMultiplyCombiner` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateStrictMultiplyCombiner(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateStrictMultiplyCombiner.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateStrictMultiplyCombiner`}
    public int fragmentShadingRateStrictMultiplyCombiner() { return fragmentShadingRateStrictMultiplyCombiner(this.segment(), 0L); }
    /// Sets `fragmentShadingRateStrictMultiplyCombiner` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateStrictMultiplyCombiner(MemorySegment segment, long index, int value) { VH_fragmentShadingRateStrictMultiplyCombiner.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateStrictMultiplyCombiner` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateStrictMultiplyCombiner(int value) { fragmentShadingRateStrictMultiplyCombiner(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR at(long index, Consumer<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `minFragmentShadingRateAttachmentTexelSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minFragmentShadingRateAttachmentTexelSizeAt(long index) { return minFragmentShadingRateAttachmentTexelSize(this.segment(), index); }
    /// Sets `minFragmentShadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSizeAt(long index, MemorySegment value) { minFragmentShadingRateAttachmentTexelSize(this.segment(), index, value); return this; }
    /// Accepts `minFragmentShadingRateAttachmentTexelSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minFragmentShadingRateAttachmentTexelSizeAt(index))); return this; }

    /// {@return `maxFragmentShadingRateAttachmentTexelSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxFragmentShadingRateAttachmentTexelSizeAt(long index) { return maxFragmentShadingRateAttachmentTexelSize(this.segment(), index); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSizeAt(long index, MemorySegment value) { maxFragmentShadingRateAttachmentTexelSize(this.segment(), index, value); return this; }
    /// Accepts `maxFragmentShadingRateAttachmentTexelSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxFragmentShadingRateAttachmentTexelSizeAt(index))); return this; }

    /// {@return `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(long index) { return maxFragmentShadingRateAttachmentTexelSizeAspectRatio(this.segment(), index); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(long index, int value) { maxFragmentShadingRateAttachmentTexelSizeAspectRatio(this.segment(), index, value); return this; }

    /// {@return `primitiveFragmentShadingRateWithMultipleViewports` at the given index}
    /// @param index the index of the struct buffer
    public int primitiveFragmentShadingRateWithMultipleViewportsAt(long index) { return primitiveFragmentShadingRateWithMultipleViewports(this.segment(), index); }
    /// Sets `primitiveFragmentShadingRateWithMultipleViewports` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR primitiveFragmentShadingRateWithMultipleViewportsAt(long index, int value) { primitiveFragmentShadingRateWithMultipleViewports(this.segment(), index, value); return this; }

    /// {@return `layeredShadingRateAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int layeredShadingRateAttachmentsAt(long index) { return layeredShadingRateAttachments(this.segment(), index); }
    /// Sets `layeredShadingRateAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR layeredShadingRateAttachmentsAt(long index, int value) { layeredShadingRateAttachments(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateNonTrivialCombinerOps` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateNonTrivialCombinerOpsAt(long index) { return fragmentShadingRateNonTrivialCombinerOps(this.segment(), index); }
    /// Sets `fragmentShadingRateNonTrivialCombinerOps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateNonTrivialCombinerOpsAt(long index, int value) { fragmentShadingRateNonTrivialCombinerOps(this.segment(), index, value); return this; }

    /// {@return `maxFragmentSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxFragmentSizeAt(long index) { return maxFragmentSize(this.segment(), index); }
    /// Sets `maxFragmentSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSizeAt(long index, MemorySegment value) { maxFragmentSize(this.segment(), index, value); return this; }
    /// Accepts `maxFragmentSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxFragmentSizeAt(index))); return this; }

    /// {@return `maxFragmentSizeAspectRatio` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentSizeAspectRatioAt(long index) { return maxFragmentSizeAspectRatio(this.segment(), index); }
    /// Sets `maxFragmentSizeAspectRatio` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSizeAspectRatioAt(long index, int value) { maxFragmentSizeAspectRatio(this.segment(), index, value); return this; }

    /// {@return `maxFragmentShadingRateCoverageSamples` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentShadingRateCoverageSamplesAt(long index) { return maxFragmentShadingRateCoverageSamples(this.segment(), index); }
    /// Sets `maxFragmentShadingRateCoverageSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateCoverageSamplesAt(long index, int value) { maxFragmentShadingRateCoverageSamples(this.segment(), index, value); return this; }

    /// {@return `maxFragmentShadingRateRasterizationSamples` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentShadingRateRasterizationSamplesAt(long index) { return maxFragmentShadingRateRasterizationSamples(this.segment(), index); }
    /// Sets `maxFragmentShadingRateRasterizationSamples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateRasterizationSamplesAt(long index, int value) { maxFragmentShadingRateRasterizationSamples(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateWithShaderDepthStencilWrites` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateWithShaderDepthStencilWritesAt(long index) { return fragmentShadingRateWithShaderDepthStencilWrites(this.segment(), index); }
    /// Sets `fragmentShadingRateWithShaderDepthStencilWrites` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderDepthStencilWritesAt(long index, int value) { fragmentShadingRateWithShaderDepthStencilWrites(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateWithSampleMask` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateWithSampleMaskAt(long index) { return fragmentShadingRateWithSampleMask(this.segment(), index); }
    /// Sets `fragmentShadingRateWithSampleMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithSampleMaskAt(long index, int value) { fragmentShadingRateWithSampleMask(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateWithShaderSampleMask` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateWithShaderSampleMaskAt(long index) { return fragmentShadingRateWithShaderSampleMask(this.segment(), index); }
    /// Sets `fragmentShadingRateWithShaderSampleMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderSampleMaskAt(long index, int value) { fragmentShadingRateWithShaderSampleMask(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateWithConservativeRasterization` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateWithConservativeRasterizationAt(long index) { return fragmentShadingRateWithConservativeRasterization(this.segment(), index); }
    /// Sets `fragmentShadingRateWithConservativeRasterization` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithConservativeRasterizationAt(long index, int value) { fragmentShadingRateWithConservativeRasterization(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateWithFragmentShaderInterlock` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateWithFragmentShaderInterlockAt(long index) { return fragmentShadingRateWithFragmentShaderInterlock(this.segment(), index); }
    /// Sets `fragmentShadingRateWithFragmentShaderInterlock` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithFragmentShaderInterlockAt(long index, int value) { fragmentShadingRateWithFragmentShaderInterlock(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateWithCustomSampleLocations` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateWithCustomSampleLocationsAt(long index) { return fragmentShadingRateWithCustomSampleLocations(this.segment(), index); }
    /// Sets `fragmentShadingRateWithCustomSampleLocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithCustomSampleLocationsAt(long index, int value) { fragmentShadingRateWithCustomSampleLocations(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateStrictMultiplyCombiner` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateStrictMultiplyCombinerAt(long index) { return fragmentShadingRateStrictMultiplyCombiner(this.segment(), index); }
    /// Sets `fragmentShadingRateStrictMultiplyCombiner` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateStrictMultiplyCombinerAt(long index, int value) { fragmentShadingRateStrictMultiplyCombiner(this.segment(), index, value); return this; }

}
