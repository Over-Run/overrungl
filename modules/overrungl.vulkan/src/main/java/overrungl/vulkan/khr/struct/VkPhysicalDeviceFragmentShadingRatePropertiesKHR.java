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
package overrungl.vulkan.khr.struct;

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
/// ### minFragmentShadingRateAttachmentTexelSize
/// [Byte offset][#OFFSET_minFragmentShadingRateAttachmentTexelSize] - [Memory layout][#ML_minFragmentShadingRateAttachmentTexelSize] - [Getter][#minFragmentShadingRateAttachmentTexelSize()] - [Setter][#minFragmentShadingRateAttachmentTexelSize(java.lang.foreign.MemorySegment)]
/// ### maxFragmentShadingRateAttachmentTexelSize
/// [Byte offset][#OFFSET_maxFragmentShadingRateAttachmentTexelSize] - [Memory layout][#ML_maxFragmentShadingRateAttachmentTexelSize] - [Getter][#maxFragmentShadingRateAttachmentTexelSize()] - [Setter][#maxFragmentShadingRateAttachmentTexelSize(java.lang.foreign.MemorySegment)]
/// ### maxFragmentShadingRateAttachmentTexelSizeAspectRatio
/// [VarHandle][#VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio] - [Getter][#maxFragmentShadingRateAttachmentTexelSizeAspectRatio()] - [Setter][#maxFragmentShadingRateAttachmentTexelSizeAspectRatio(int)]
/// ### primitiveFragmentShadingRateWithMultipleViewports
/// [VarHandle][#VH_primitiveFragmentShadingRateWithMultipleViewports] - [Getter][#primitiveFragmentShadingRateWithMultipleViewports()] - [Setter][#primitiveFragmentShadingRateWithMultipleViewports(int)]
/// ### layeredShadingRateAttachments
/// [VarHandle][#VH_layeredShadingRateAttachments] - [Getter][#layeredShadingRateAttachments()] - [Setter][#layeredShadingRateAttachments(int)]
/// ### fragmentShadingRateNonTrivialCombinerOps
/// [VarHandle][#VH_fragmentShadingRateNonTrivialCombinerOps] - [Getter][#fragmentShadingRateNonTrivialCombinerOps()] - [Setter][#fragmentShadingRateNonTrivialCombinerOps(int)]
/// ### maxFragmentSize
/// [Byte offset][#OFFSET_maxFragmentSize] - [Memory layout][#ML_maxFragmentSize] - [Getter][#maxFragmentSize()] - [Setter][#maxFragmentSize(java.lang.foreign.MemorySegment)]
/// ### maxFragmentSizeAspectRatio
/// [VarHandle][#VH_maxFragmentSizeAspectRatio] - [Getter][#maxFragmentSizeAspectRatio()] - [Setter][#maxFragmentSizeAspectRatio(int)]
/// ### maxFragmentShadingRateCoverageSamples
/// [VarHandle][#VH_maxFragmentShadingRateCoverageSamples] - [Getter][#maxFragmentShadingRateCoverageSamples()] - [Setter][#maxFragmentShadingRateCoverageSamples(int)]
/// ### maxFragmentShadingRateRasterizationSamples
/// [VarHandle][#VH_maxFragmentShadingRateRasterizationSamples] - [Getter][#maxFragmentShadingRateRasterizationSamples()] - [Setter][#maxFragmentShadingRateRasterizationSamples(int)]
/// ### fragmentShadingRateWithShaderDepthStencilWrites
/// [VarHandle][#VH_fragmentShadingRateWithShaderDepthStencilWrites] - [Getter][#fragmentShadingRateWithShaderDepthStencilWrites()] - [Setter][#fragmentShadingRateWithShaderDepthStencilWrites(int)]
/// ### fragmentShadingRateWithSampleMask
/// [VarHandle][#VH_fragmentShadingRateWithSampleMask] - [Getter][#fragmentShadingRateWithSampleMask()] - [Setter][#fragmentShadingRateWithSampleMask(int)]
/// ### fragmentShadingRateWithShaderSampleMask
/// [VarHandle][#VH_fragmentShadingRateWithShaderSampleMask] - [Getter][#fragmentShadingRateWithShaderSampleMask()] - [Setter][#fragmentShadingRateWithShaderSampleMask(int)]
/// ### fragmentShadingRateWithConservativeRasterization
/// [VarHandle][#VH_fragmentShadingRateWithConservativeRasterization] - [Getter][#fragmentShadingRateWithConservativeRasterization()] - [Setter][#fragmentShadingRateWithConservativeRasterization(int)]
/// ### fragmentShadingRateWithFragmentShaderInterlock
/// [VarHandle][#VH_fragmentShadingRateWithFragmentShaderInterlock] - [Getter][#fragmentShadingRateWithFragmentShaderInterlock()] - [Setter][#fragmentShadingRateWithFragmentShaderInterlock(int)]
/// ### fragmentShadingRateWithCustomSampleLocations
/// [VarHandle][#VH_fragmentShadingRateWithCustomSampleLocations] - [Getter][#fragmentShadingRateWithCustomSampleLocations()] - [Setter][#fragmentShadingRateWithCustomSampleLocations(int)]
/// ### fragmentShadingRateStrictMultiplyCombiner
/// [VarHandle][#VH_fragmentShadingRateStrictMultiplyCombiner] - [Getter][#fragmentShadingRateStrictMultiplyCombiner()] - [Setter][#fragmentShadingRateStrictMultiplyCombiner(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D minFragmentShadingRateAttachmentTexelSize;
///     VkExtent2D maxFragmentShadingRateAttachmentTexelSize;
///     uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio;
///     VkBool32 primitiveFragmentShadingRateWithMultipleViewports;
///     VkBool32 layeredShadingRateAttachments;
///     VkBool32 fragmentShadingRateNonTrivialCombinerOps;
///     VkExtent2D maxFragmentSize;
///     uint32_t maxFragmentSizeAspectRatio;
///     uint32_t maxFragmentShadingRateCoverageSamples;
///     VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples;
///     VkBool32 fragmentShadingRateWithShaderDepthStencilWrites;
///     VkBool32 fragmentShadingRateWithSampleMask;
///     VkBool32 fragmentShadingRateWithShaderSampleMask;
///     VkBool32 fragmentShadingRateWithConservativeRasterization;
///     VkBool32 fragmentShadingRateWithFragmentShaderInterlock;
///     VkBool32 fragmentShadingRateWithCustomSampleLocations;
///     VkBool32 fragmentShadingRateStrictMultiplyCombiner;
/// } VkPhysicalDeviceFragmentShadingRatePropertiesKHR;
/// ```
public sealed class VkPhysicalDeviceFragmentShadingRatePropertiesKHR extends Struct {
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `minFragmentShadingRateAttachmentTexelSize`.
    public static final long OFFSET_minFragmentShadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"));
    /// The memory layout of `minFragmentShadingRateAttachmentTexelSize`.
    public static final MemoryLayout ML_minFragmentShadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"));
    /// The byte offset of `maxFragmentShadingRateAttachmentTexelSize`.
    public static final long OFFSET_maxFragmentShadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"));
    /// The memory layout of `maxFragmentShadingRateAttachmentTexelSize`.
    public static final MemoryLayout ML_maxFragmentShadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"));
    /// The [VarHandle] of `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
    /// The [VarHandle] of `primitiveFragmentShadingRateWithMultipleViewports` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveFragmentShadingRateWithMultipleViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
    /// The [VarHandle] of `layeredShadingRateAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layeredShadingRateAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredShadingRateAttachments"));
    /// The [VarHandle] of `fragmentShadingRateNonTrivialCombinerOps` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateNonTrivialCombinerOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
    /// The byte offset of `maxFragmentSize`.
    public static final long OFFSET_maxFragmentSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentSize"));
    /// The memory layout of `maxFragmentSize`.
    public static final MemoryLayout ML_maxFragmentSize = LAYOUT.select(PathElement.groupElement("maxFragmentSize"));
    /// The [VarHandle] of `maxFragmentSizeAspectRatio` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentSizeAspectRatio = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentSizeAspectRatio"));
    /// The [VarHandle] of `maxFragmentShadingRateCoverageSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentShadingRateCoverageSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
    /// The [VarHandle] of `maxFragmentShadingRateRasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentShadingRateRasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
    /// The [VarHandle] of `fragmentShadingRateWithShaderDepthStencilWrites` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
    /// The [VarHandle] of `fragmentShadingRateWithSampleMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateWithSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
    /// The [VarHandle] of `fragmentShadingRateWithShaderSampleMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateWithShaderSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
    /// The [VarHandle] of `fragmentShadingRateWithConservativeRasterization` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateWithConservativeRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
    /// The [VarHandle] of `fragmentShadingRateWithFragmentShaderInterlock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateWithFragmentShaderInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
    /// The [VarHandle] of `fragmentShadingRateWithCustomSampleLocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateWithCustomSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
    /// The [VarHandle] of `fragmentShadingRateStrictMultiplyCombiner` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateStrictMultiplyCombiner = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRatePropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkExtent2D") java.lang.foreign.MemorySegment minFragmentShadingRateAttachmentTexelSize, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxFragmentShadingRateAttachmentTexelSize, @CType("uint32_t") int maxFragmentShadingRateAttachmentTexelSizeAspectRatio, @CType("VkBool32") int primitiveFragmentShadingRateWithMultipleViewports, @CType("VkBool32") int layeredShadingRateAttachments, @CType("VkBool32") int fragmentShadingRateNonTrivialCombinerOps, @CType("VkExtent2D") java.lang.foreign.MemorySegment maxFragmentSize, @CType("uint32_t") int maxFragmentSizeAspectRatio, @CType("uint32_t") int maxFragmentShadingRateCoverageSamples, @CType("VkSampleCountFlagBits") int maxFragmentShadingRateRasterizationSamples, @CType("VkBool32") int fragmentShadingRateWithShaderDepthStencilWrites, @CType("VkBool32") int fragmentShadingRateWithSampleMask, @CType("VkBool32") int fragmentShadingRateWithShaderSampleMask, @CType("VkBool32") int fragmentShadingRateWithConservativeRasterization, @CType("VkBool32") int fragmentShadingRateWithFragmentShaderInterlock, @CType("VkBool32") int fragmentShadingRateWithCustomSampleLocations, @CType("VkBool32") int fragmentShadingRateStrictMultiplyCombiner) { return alloc(allocator).sType(sType).pNext(pNext).minFragmentShadingRateAttachmentTexelSize(minFragmentShadingRateAttachmentTexelSize).maxFragmentShadingRateAttachmentTexelSize(maxFragmentShadingRateAttachmentTexelSize).maxFragmentShadingRateAttachmentTexelSizeAspectRatio(maxFragmentShadingRateAttachmentTexelSizeAspectRatio).primitiveFragmentShadingRateWithMultipleViewports(primitiveFragmentShadingRateWithMultipleViewports).layeredShadingRateAttachments(layeredShadingRateAttachments).fragmentShadingRateNonTrivialCombinerOps(fragmentShadingRateNonTrivialCombinerOps).maxFragmentSize(maxFragmentSize).maxFragmentSizeAspectRatio(maxFragmentSizeAspectRatio).maxFragmentShadingRateCoverageSamples(maxFragmentShadingRateCoverageSamples).maxFragmentShadingRateRasterizationSamples(maxFragmentShadingRateRasterizationSamples).fragmentShadingRateWithShaderDepthStencilWrites(fragmentShadingRateWithShaderDepthStencilWrites).fragmentShadingRateWithSampleMask(fragmentShadingRateWithSampleMask).fragmentShadingRateWithShaderSampleMask(fragmentShadingRateWithShaderSampleMask).fragmentShadingRateWithConservativeRasterization(fragmentShadingRateWithConservativeRasterization).fragmentShadingRateWithFragmentShaderInterlock(fragmentShadingRateWithFragmentShaderInterlock).fragmentShadingRateWithCustomSampleLocations(fragmentShadingRateWithCustomSampleLocations).fragmentShadingRateStrictMultiplyCombiner(fragmentShadingRateStrictMultiplyCombiner); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR copyFrom(VkPhysicalDeviceFragmentShadingRatePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `minFragmentShadingRateAttachmentTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minFragmentShadingRateAttachmentTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minFragmentShadingRateAttachmentTexelSize, index), ML_minFragmentShadingRateAttachmentTexelSize); }
    /// {@return `minFragmentShadingRateAttachmentTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minFragmentShadingRateAttachmentTexelSize(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_minFragmentShadingRateAttachmentTexelSize(segment, 0L); }
    /// {@return `minFragmentShadingRateAttachmentTexelSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minFragmentShadingRateAttachmentTexelSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_minFragmentShadingRateAttachmentTexelSize(this.segment()); }
    /// Sets `minFragmentShadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minFragmentShadingRateAttachmentTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minFragmentShadingRateAttachmentTexelSize, index), ML_minFragmentShadingRateAttachmentTexelSize.byteSize()); }
    /// Sets `minFragmentShadingRateAttachmentTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minFragmentShadingRateAttachmentTexelSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_minFragmentShadingRateAttachmentTexelSize(segment, 0L, value); }
    /// Sets `minFragmentShadingRateAttachmentTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_minFragmentShadingRateAttachmentTexelSize(this.segment(), value); return this; }

    /// {@return `maxFragmentShadingRateAttachmentTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxFragmentShadingRateAttachmentTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFragmentShadingRateAttachmentTexelSize, index), ML_maxFragmentShadingRateAttachmentTexelSize); }
    /// {@return `maxFragmentShadingRateAttachmentTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxFragmentShadingRateAttachmentTexelSize(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateAttachmentTexelSize(segment, 0L); }
    /// {@return `maxFragmentShadingRateAttachmentTexelSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxFragmentShadingRateAttachmentTexelSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateAttachmentTexelSize(this.segment()); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentShadingRateAttachmentTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFragmentShadingRateAttachmentTexelSize, index), ML_maxFragmentShadingRateAttachmentTexelSize.byteSize()); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentShadingRateAttachmentTexelSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateAttachmentTexelSize(segment, 0L, value); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateAttachmentTexelSize(this.segment(), value); return this; }

    /// {@return `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment segment, long index) { return (int) VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio.get(segment, 0L, index); }
    /// {@return `maxFragmentShadingRateAttachmentTexelSizeAspectRatio`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(segment, 0L); }
    /// {@return `maxFragmentShadingRateAttachmentTexelSizeAspectRatio`}
    public @CType("uint32_t") int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(this.segment()); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio.set(segment, 0L, index, value); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(segment, 0L, value); }
    /// Sets `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSizeAspectRatio(@CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(this.segment(), value); return this; }

    /// {@return `primitiveFragmentShadingRateWithMultipleViewports` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitiveFragmentShadingRateWithMultipleViewports(MemorySegment segment, long index) { return (int) VH_primitiveFragmentShadingRateWithMultipleViewports.get(segment, 0L, index); }
    /// {@return `primitiveFragmentShadingRateWithMultipleViewports`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitiveFragmentShadingRateWithMultipleViewports(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_primitiveFragmentShadingRateWithMultipleViewports(segment, 0L); }
    /// {@return `primitiveFragmentShadingRateWithMultipleViewports`}
    public @CType("VkBool32") int primitiveFragmentShadingRateWithMultipleViewports() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_primitiveFragmentShadingRateWithMultipleViewports(this.segment()); }
    /// Sets `primitiveFragmentShadingRateWithMultipleViewports` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveFragmentShadingRateWithMultipleViewports(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitiveFragmentShadingRateWithMultipleViewports.set(segment, 0L, index, value); }
    /// Sets `primitiveFragmentShadingRateWithMultipleViewports` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveFragmentShadingRateWithMultipleViewports(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_primitiveFragmentShadingRateWithMultipleViewports(segment, 0L, value); }
    /// Sets `primitiveFragmentShadingRateWithMultipleViewports` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR primitiveFragmentShadingRateWithMultipleViewports(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_primitiveFragmentShadingRateWithMultipleViewports(this.segment(), value); return this; }

    /// {@return `layeredShadingRateAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_layeredShadingRateAttachments(MemorySegment segment, long index) { return (int) VH_layeredShadingRateAttachments.get(segment, 0L, index); }
    /// {@return `layeredShadingRateAttachments`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_layeredShadingRateAttachments(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_layeredShadingRateAttachments(segment, 0L); }
    /// {@return `layeredShadingRateAttachments`}
    public @CType("VkBool32") int layeredShadingRateAttachments() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_layeredShadingRateAttachments(this.segment()); }
    /// Sets `layeredShadingRateAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layeredShadingRateAttachments(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_layeredShadingRateAttachments.set(segment, 0L, index, value); }
    /// Sets `layeredShadingRateAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layeredShadingRateAttachments(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_layeredShadingRateAttachments(segment, 0L, value); }
    /// Sets `layeredShadingRateAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR layeredShadingRateAttachments(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_layeredShadingRateAttachments(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateNonTrivialCombinerOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateNonTrivialCombinerOps(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateNonTrivialCombinerOps.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateNonTrivialCombinerOps`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateNonTrivialCombinerOps(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateNonTrivialCombinerOps(segment, 0L); }
    /// {@return `fragmentShadingRateNonTrivialCombinerOps`}
    public @CType("VkBool32") int fragmentShadingRateNonTrivialCombinerOps() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateNonTrivialCombinerOps(this.segment()); }
    /// Sets `fragmentShadingRateNonTrivialCombinerOps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateNonTrivialCombinerOps(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateNonTrivialCombinerOps.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateNonTrivialCombinerOps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateNonTrivialCombinerOps(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateNonTrivialCombinerOps(segment, 0L, value); }
    /// Sets `fragmentShadingRateNonTrivialCombinerOps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateNonTrivialCombinerOps(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateNonTrivialCombinerOps(this.segment(), value); return this; }

    /// {@return `maxFragmentSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxFragmentSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFragmentSize, index), ML_maxFragmentSize); }
    /// {@return `maxFragmentSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxFragmentSize(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentSize(segment, 0L); }
    /// {@return `maxFragmentSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxFragmentSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentSize(this.segment()); }
    /// Sets `maxFragmentSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFragmentSize, index), ML_maxFragmentSize.byteSize()); }
    /// Sets `maxFragmentSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentSize(segment, 0L, value); }
    /// Sets `maxFragmentSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentSize(this.segment(), value); return this; }

    /// {@return `maxFragmentSizeAspectRatio` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFragmentSizeAspectRatio(MemorySegment segment, long index) { return (int) VH_maxFragmentSizeAspectRatio.get(segment, 0L, index); }
    /// {@return `maxFragmentSizeAspectRatio`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFragmentSizeAspectRatio(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentSizeAspectRatio(segment, 0L); }
    /// {@return `maxFragmentSizeAspectRatio`}
    public @CType("uint32_t") int maxFragmentSizeAspectRatio() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentSizeAspectRatio(this.segment()); }
    /// Sets `maxFragmentSizeAspectRatio` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentSizeAspectRatio(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFragmentSizeAspectRatio.set(segment, 0L, index, value); }
    /// Sets `maxFragmentSizeAspectRatio` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentSizeAspectRatio(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentSizeAspectRatio(segment, 0L, value); }
    /// Sets `maxFragmentSizeAspectRatio` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSizeAspectRatio(@CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentSizeAspectRatio(this.segment(), value); return this; }

    /// {@return `maxFragmentShadingRateCoverageSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFragmentShadingRateCoverageSamples(MemorySegment segment, long index) { return (int) VH_maxFragmentShadingRateCoverageSamples.get(segment, 0L, index); }
    /// {@return `maxFragmentShadingRateCoverageSamples`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFragmentShadingRateCoverageSamples(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateCoverageSamples(segment, 0L); }
    /// {@return `maxFragmentShadingRateCoverageSamples`}
    public @CType("uint32_t") int maxFragmentShadingRateCoverageSamples() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateCoverageSamples(this.segment()); }
    /// Sets `maxFragmentShadingRateCoverageSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentShadingRateCoverageSamples(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFragmentShadingRateCoverageSamples.set(segment, 0L, index, value); }
    /// Sets `maxFragmentShadingRateCoverageSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentShadingRateCoverageSamples(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateCoverageSamples(segment, 0L, value); }
    /// Sets `maxFragmentShadingRateCoverageSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateCoverageSamples(@CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateCoverageSamples(this.segment(), value); return this; }

    /// {@return `maxFragmentShadingRateRasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_maxFragmentShadingRateRasterizationSamples(MemorySegment segment, long index) { return (int) VH_maxFragmentShadingRateRasterizationSamples.get(segment, 0L, index); }
    /// {@return `maxFragmentShadingRateRasterizationSamples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_maxFragmentShadingRateRasterizationSamples(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateRasterizationSamples(segment, 0L); }
    /// {@return `maxFragmentShadingRateRasterizationSamples`}
    public @CType("VkSampleCountFlagBits") int maxFragmentShadingRateRasterizationSamples() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateRasterizationSamples(this.segment()); }
    /// Sets `maxFragmentShadingRateRasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentShadingRateRasterizationSamples(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_maxFragmentShadingRateRasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `maxFragmentShadingRateRasterizationSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentShadingRateRasterizationSamples(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateRasterizationSamples(segment, 0L, value); }
    /// Sets `maxFragmentShadingRateRasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateRasterizationSamples(@CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateRasterizationSamples(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateWithShaderDepthStencilWrites` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithShaderDepthStencilWrites.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithShaderDepthStencilWrites`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithShaderDepthStencilWrites(segment, 0L); }
    /// {@return `fragmentShadingRateWithShaderDepthStencilWrites`}
    public @CType("VkBool32") int fragmentShadingRateWithShaderDepthStencilWrites() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithShaderDepthStencilWrites(this.segment()); }
    /// Sets `fragmentShadingRateWithShaderDepthStencilWrites` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateWithShaderDepthStencilWrites.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithShaderDepthStencilWrites` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithShaderDepthStencilWrites(segment, 0L, value); }
    /// Sets `fragmentShadingRateWithShaderDepthStencilWrites` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderDepthStencilWrites(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithShaderDepthStencilWrites(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateWithSampleMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateWithSampleMask(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithSampleMask.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithSampleMask`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateWithSampleMask(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithSampleMask(segment, 0L); }
    /// {@return `fragmentShadingRateWithSampleMask`}
    public @CType("VkBool32") int fragmentShadingRateWithSampleMask() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithSampleMask(this.segment()); }
    /// Sets `fragmentShadingRateWithSampleMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateWithSampleMask(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateWithSampleMask.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithSampleMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateWithSampleMask(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithSampleMask(segment, 0L, value); }
    /// Sets `fragmentShadingRateWithSampleMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithSampleMask(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithSampleMask(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateWithShaderSampleMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateWithShaderSampleMask(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithShaderSampleMask.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithShaderSampleMask`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateWithShaderSampleMask(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithShaderSampleMask(segment, 0L); }
    /// {@return `fragmentShadingRateWithShaderSampleMask`}
    public @CType("VkBool32") int fragmentShadingRateWithShaderSampleMask() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithShaderSampleMask(this.segment()); }
    /// Sets `fragmentShadingRateWithShaderSampleMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateWithShaderSampleMask(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateWithShaderSampleMask.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithShaderSampleMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateWithShaderSampleMask(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithShaderSampleMask(segment, 0L, value); }
    /// Sets `fragmentShadingRateWithShaderSampleMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderSampleMask(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithShaderSampleMask(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateWithConservativeRasterization` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateWithConservativeRasterization(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithConservativeRasterization.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithConservativeRasterization`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateWithConservativeRasterization(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithConservativeRasterization(segment, 0L); }
    /// {@return `fragmentShadingRateWithConservativeRasterization`}
    public @CType("VkBool32") int fragmentShadingRateWithConservativeRasterization() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithConservativeRasterization(this.segment()); }
    /// Sets `fragmentShadingRateWithConservativeRasterization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateWithConservativeRasterization(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateWithConservativeRasterization.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithConservativeRasterization` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateWithConservativeRasterization(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithConservativeRasterization(segment, 0L, value); }
    /// Sets `fragmentShadingRateWithConservativeRasterization` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithConservativeRasterization(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithConservativeRasterization(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateWithFragmentShaderInterlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateWithFragmentShaderInterlock(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithFragmentShaderInterlock.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithFragmentShaderInterlock`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateWithFragmentShaderInterlock(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithFragmentShaderInterlock(segment, 0L); }
    /// {@return `fragmentShadingRateWithFragmentShaderInterlock`}
    public @CType("VkBool32") int fragmentShadingRateWithFragmentShaderInterlock() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithFragmentShaderInterlock(this.segment()); }
    /// Sets `fragmentShadingRateWithFragmentShaderInterlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateWithFragmentShaderInterlock(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateWithFragmentShaderInterlock.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithFragmentShaderInterlock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateWithFragmentShaderInterlock(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithFragmentShaderInterlock(segment, 0L, value); }
    /// Sets `fragmentShadingRateWithFragmentShaderInterlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithFragmentShaderInterlock(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithFragmentShaderInterlock(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateWithCustomSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateWithCustomSampleLocations(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateWithCustomSampleLocations.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateWithCustomSampleLocations`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateWithCustomSampleLocations(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithCustomSampleLocations(segment, 0L); }
    /// {@return `fragmentShadingRateWithCustomSampleLocations`}
    public @CType("VkBool32") int fragmentShadingRateWithCustomSampleLocations() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithCustomSampleLocations(this.segment()); }
    /// Sets `fragmentShadingRateWithCustomSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateWithCustomSampleLocations(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateWithCustomSampleLocations.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateWithCustomSampleLocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateWithCustomSampleLocations(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithCustomSampleLocations(segment, 0L, value); }
    /// Sets `fragmentShadingRateWithCustomSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithCustomSampleLocations(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithCustomSampleLocations(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateStrictMultiplyCombiner` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateStrictMultiplyCombiner(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateStrictMultiplyCombiner.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateStrictMultiplyCombiner`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateStrictMultiplyCombiner(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateStrictMultiplyCombiner(segment, 0L); }
    /// {@return `fragmentShadingRateStrictMultiplyCombiner`}
    public @CType("VkBool32") int fragmentShadingRateStrictMultiplyCombiner() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateStrictMultiplyCombiner(this.segment()); }
    /// Sets `fragmentShadingRateStrictMultiplyCombiner` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateStrictMultiplyCombiner(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateStrictMultiplyCombiner.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateStrictMultiplyCombiner` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateStrictMultiplyCombiner(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateStrictMultiplyCombiner(segment, 0L, value); }
    /// Sets `fragmentShadingRateStrictMultiplyCombiner` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateStrictMultiplyCombiner(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateStrictMultiplyCombiner(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentShadingRatePropertiesKHR].
    public static final class Buffer extends VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `minFragmentShadingRateAttachmentTexelSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment minFragmentShadingRateAttachmentTexelSizeAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_minFragmentShadingRateAttachmentTexelSize(this.segment(), index); }
        /// Sets `minFragmentShadingRateAttachmentTexelSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minFragmentShadingRateAttachmentTexelSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_minFragmentShadingRateAttachmentTexelSize(this.segment(), index, value); return this; }

        /// {@return `maxFragmentShadingRateAttachmentTexelSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxFragmentShadingRateAttachmentTexelSizeAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateAttachmentTexelSize(this.segment(), index); }
        /// Sets `maxFragmentShadingRateAttachmentTexelSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentShadingRateAttachmentTexelSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateAttachmentTexelSize(this.segment(), index, value); return this; }

        /// {@return `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(this.segment(), index); }
        /// Sets `maxFragmentShadingRateAttachmentTexelSizeAspectRatio` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateAttachmentTexelSizeAspectRatio(this.segment(), index, value); return this; }

        /// {@return `primitiveFragmentShadingRateWithMultipleViewports` at the given index}
        /// @param index the index
        public @CType("VkBool32") int primitiveFragmentShadingRateWithMultipleViewportsAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_primitiveFragmentShadingRateWithMultipleViewports(this.segment(), index); }
        /// Sets `primitiveFragmentShadingRateWithMultipleViewports` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitiveFragmentShadingRateWithMultipleViewportsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_primitiveFragmentShadingRateWithMultipleViewports(this.segment(), index, value); return this; }

        /// {@return `layeredShadingRateAttachments` at the given index}
        /// @param index the index
        public @CType("VkBool32") int layeredShadingRateAttachmentsAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_layeredShadingRateAttachments(this.segment(), index); }
        /// Sets `layeredShadingRateAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layeredShadingRateAttachmentsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_layeredShadingRateAttachments(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateNonTrivialCombinerOps` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateNonTrivialCombinerOpsAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateNonTrivialCombinerOps(this.segment(), index); }
        /// Sets `fragmentShadingRateNonTrivialCombinerOps` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateNonTrivialCombinerOpsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateNonTrivialCombinerOps(this.segment(), index, value); return this; }

        /// {@return `maxFragmentSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxFragmentSizeAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentSize(this.segment(), index); }
        /// Sets `maxFragmentSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentSize(this.segment(), index, value); return this; }

        /// {@return `maxFragmentSizeAspectRatio` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFragmentSizeAspectRatioAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentSizeAspectRatio(this.segment(), index); }
        /// Sets `maxFragmentSizeAspectRatio` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentSizeAspectRatioAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentSizeAspectRatio(this.segment(), index, value); return this; }

        /// {@return `maxFragmentShadingRateCoverageSamples` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFragmentShadingRateCoverageSamplesAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateCoverageSamples(this.segment(), index); }
        /// Sets `maxFragmentShadingRateCoverageSamples` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentShadingRateCoverageSamplesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateCoverageSamples(this.segment(), index, value); return this; }

        /// {@return `maxFragmentShadingRateRasterizationSamples` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlagBits") int maxFragmentShadingRateRasterizationSamplesAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_maxFragmentShadingRateRasterizationSamples(this.segment(), index); }
        /// Sets `maxFragmentShadingRateRasterizationSamples` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentShadingRateRasterizationSamplesAt(long index, @CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_maxFragmentShadingRateRasterizationSamples(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateWithShaderDepthStencilWrites` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateWithShaderDepthStencilWritesAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithShaderDepthStencilWrites(this.segment(), index); }
        /// Sets `fragmentShadingRateWithShaderDepthStencilWrites` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateWithShaderDepthStencilWritesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithShaderDepthStencilWrites(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateWithSampleMask` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateWithSampleMaskAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithSampleMask(this.segment(), index); }
        /// Sets `fragmentShadingRateWithSampleMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateWithSampleMaskAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithSampleMask(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateWithShaderSampleMask` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateWithShaderSampleMaskAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithShaderSampleMask(this.segment(), index); }
        /// Sets `fragmentShadingRateWithShaderSampleMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateWithShaderSampleMaskAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithShaderSampleMask(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateWithConservativeRasterization` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateWithConservativeRasterizationAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithConservativeRasterization(this.segment(), index); }
        /// Sets `fragmentShadingRateWithConservativeRasterization` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateWithConservativeRasterizationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithConservativeRasterization(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateWithFragmentShaderInterlock` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateWithFragmentShaderInterlockAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithFragmentShaderInterlock(this.segment(), index); }
        /// Sets `fragmentShadingRateWithFragmentShaderInterlock` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateWithFragmentShaderInterlockAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithFragmentShaderInterlock(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateWithCustomSampleLocations` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateWithCustomSampleLocationsAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateWithCustomSampleLocations(this.segment(), index); }
        /// Sets `fragmentShadingRateWithCustomSampleLocations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateWithCustomSampleLocationsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateWithCustomSampleLocations(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateStrictMultiplyCombiner` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateStrictMultiplyCombinerAt(long index) { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.get_fragmentShadingRateStrictMultiplyCombiner(this.segment(), index); }
        /// Sets `fragmentShadingRateStrictMultiplyCombiner` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateStrictMultiplyCombinerAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.set_fragmentShadingRateStrictMultiplyCombiner(this.segment(), index, value); return this; }

    }
}
