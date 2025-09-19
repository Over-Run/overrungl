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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan13Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan13Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 robustImageAccess;
///     (uint32_t) VkBool32 inlineUniformBlock;
///     (uint32_t) VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
///     (uint32_t) VkBool32 pipelineCreationCacheControl;
///     (uint32_t) VkBool32 privateData;
///     (uint32_t) VkBool32 shaderDemoteToHelperInvocation;
///     (uint32_t) VkBool32 shaderTerminateInvocation;
///     (uint32_t) VkBool32 subgroupSizeControl;
///     (uint32_t) VkBool32 computeFullSubgroups;
///     (uint32_t) VkBool32 synchronization2;
///     (uint32_t) VkBool32 textureCompressionASTC_HDR;
///     (uint32_t) VkBool32 shaderZeroInitializeWorkgroupMemory;
///     (uint32_t) VkBool32 dynamicRendering;
///     (uint32_t) VkBool32 shaderIntegerDotProduct;
///     (uint32_t) VkBool32 maintenance4;
/// };
/// ```
public final class VkPhysicalDeviceVulkan13Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkan13Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustImageAccess"),
        ValueLayout.JAVA_INT.withName("inlineUniformBlock"),
        ValueLayout.JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("pipelineCreationCacheControl"),
        ValueLayout.JAVA_INT.withName("privateData"),
        ValueLayout.JAVA_INT.withName("shaderDemoteToHelperInvocation"),
        ValueLayout.JAVA_INT.withName("shaderTerminateInvocation"),
        ValueLayout.JAVA_INT.withName("subgroupSizeControl"),
        ValueLayout.JAVA_INT.withName("computeFullSubgroups"),
        ValueLayout.JAVA_INT.withName("synchronization2"),
        ValueLayout.JAVA_INT.withName("textureCompressionASTC_HDR"),
        ValueLayout.JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory"),
        ValueLayout.JAVA_INT.withName("dynamicRendering"),
        ValueLayout.JAVA_INT.withName("shaderIntegerDotProduct"),
        ValueLayout.JAVA_INT.withName("maintenance4")
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
    /// The byte offset of `robustImageAccess`.
    public static final long OFFSET_robustImageAccess = LAYOUT.byteOffset(PathElement.groupElement("robustImageAccess"));
    /// The memory layout of `robustImageAccess`.
    public static final MemoryLayout LAYOUT_robustImageAccess = LAYOUT.select(PathElement.groupElement("robustImageAccess"));
    /// The [VarHandle] of `robustImageAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustImageAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustImageAccess"));
    /// The byte offset of `inlineUniformBlock`.
    public static final long OFFSET_inlineUniformBlock = LAYOUT.byteOffset(PathElement.groupElement("inlineUniformBlock"));
    /// The memory layout of `inlineUniformBlock`.
    public static final MemoryLayout LAYOUT_inlineUniformBlock = LAYOUT.select(PathElement.groupElement("inlineUniformBlock"));
    /// The [VarHandle] of `inlineUniformBlock` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inlineUniformBlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inlineUniformBlock"));
    /// The byte offset of `descriptorBindingInlineUniformBlockUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    /// The memory layout of `descriptorBindingInlineUniformBlockUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingInlineUniformBlockUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    /// The byte offset of `pipelineCreationCacheControl`.
    public static final long OFFSET_pipelineCreationCacheControl = LAYOUT.byteOffset(PathElement.groupElement("pipelineCreationCacheControl"));
    /// The memory layout of `pipelineCreationCacheControl`.
    public static final MemoryLayout LAYOUT_pipelineCreationCacheControl = LAYOUT.select(PathElement.groupElement("pipelineCreationCacheControl"));
    /// The [VarHandle] of `pipelineCreationCacheControl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineCreationCacheControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCreationCacheControl"));
    /// The byte offset of `privateData`.
    public static final long OFFSET_privateData = LAYOUT.byteOffset(PathElement.groupElement("privateData"));
    /// The memory layout of `privateData`.
    public static final MemoryLayout LAYOUT_privateData = LAYOUT.select(PathElement.groupElement("privateData"));
    /// The [VarHandle] of `privateData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_privateData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("privateData"));
    /// The byte offset of `shaderDemoteToHelperInvocation`.
    public static final long OFFSET_shaderDemoteToHelperInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    /// The memory layout of `shaderDemoteToHelperInvocation`.
    public static final MemoryLayout LAYOUT_shaderDemoteToHelperInvocation = LAYOUT.select(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    /// The [VarHandle] of `shaderDemoteToHelperInvocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDemoteToHelperInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    /// The byte offset of `shaderTerminateInvocation`.
    public static final long OFFSET_shaderTerminateInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderTerminateInvocation"));
    /// The memory layout of `shaderTerminateInvocation`.
    public static final MemoryLayout LAYOUT_shaderTerminateInvocation = LAYOUT.select(PathElement.groupElement("shaderTerminateInvocation"));
    /// The [VarHandle] of `shaderTerminateInvocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTerminateInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTerminateInvocation"));
    /// The byte offset of `subgroupSizeControl`.
    public static final long OFFSET_subgroupSizeControl = LAYOUT.byteOffset(PathElement.groupElement("subgroupSizeControl"));
    /// The memory layout of `subgroupSizeControl`.
    public static final MemoryLayout LAYOUT_subgroupSizeControl = LAYOUT.select(PathElement.groupElement("subgroupSizeControl"));
    /// The [VarHandle] of `subgroupSizeControl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subgroupSizeControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSizeControl"));
    /// The byte offset of `computeFullSubgroups`.
    public static final long OFFSET_computeFullSubgroups = LAYOUT.byteOffset(PathElement.groupElement("computeFullSubgroups"));
    /// The memory layout of `computeFullSubgroups`.
    public static final MemoryLayout LAYOUT_computeFullSubgroups = LAYOUT.select(PathElement.groupElement("computeFullSubgroups"));
    /// The [VarHandle] of `computeFullSubgroups` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_computeFullSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeFullSubgroups"));
    /// The byte offset of `synchronization2`.
    public static final long OFFSET_synchronization2 = LAYOUT.byteOffset(PathElement.groupElement("synchronization2"));
    /// The memory layout of `synchronization2`.
    public static final MemoryLayout LAYOUT_synchronization2 = LAYOUT.select(PathElement.groupElement("synchronization2"));
    /// The [VarHandle] of `synchronization2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_synchronization2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("synchronization2"));
    /// The byte offset of `textureCompressionASTC_HDR`.
    public static final long OFFSET_textureCompressionASTC_HDR = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionASTC_HDR"));
    /// The memory layout of `textureCompressionASTC_HDR`.
    public static final MemoryLayout LAYOUT_textureCompressionASTC_HDR = LAYOUT.select(PathElement.groupElement("textureCompressionASTC_HDR"));
    /// The [VarHandle] of `textureCompressionASTC_HDR` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_textureCompressionASTC_HDR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionASTC_HDR"));
    /// The byte offset of `shaderZeroInitializeWorkgroupMemory`.
    public static final long OFFSET_shaderZeroInitializeWorkgroupMemory = LAYOUT.byteOffset(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    /// The memory layout of `shaderZeroInitializeWorkgroupMemory`.
    public static final MemoryLayout LAYOUT_shaderZeroInitializeWorkgroupMemory = LAYOUT.select(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    /// The [VarHandle] of `shaderZeroInitializeWorkgroupMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderZeroInitializeWorkgroupMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    /// The byte offset of `dynamicRendering`.
    public static final long OFFSET_dynamicRendering = LAYOUT.byteOffset(PathElement.groupElement("dynamicRendering"));
    /// The memory layout of `dynamicRendering`.
    public static final MemoryLayout LAYOUT_dynamicRendering = LAYOUT.select(PathElement.groupElement("dynamicRendering"));
    /// The [VarHandle] of `dynamicRendering` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dynamicRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRendering"));
    /// The byte offset of `shaderIntegerDotProduct`.
    public static final long OFFSET_shaderIntegerDotProduct = LAYOUT.byteOffset(PathElement.groupElement("shaderIntegerDotProduct"));
    /// The memory layout of `shaderIntegerDotProduct`.
    public static final MemoryLayout LAYOUT_shaderIntegerDotProduct = LAYOUT.select(PathElement.groupElement("shaderIntegerDotProduct"));
    /// The [VarHandle] of `shaderIntegerDotProduct` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderIntegerDotProduct = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderIntegerDotProduct"));
    /// The byte offset of `maintenance4`.
    public static final long OFFSET_maintenance4 = LAYOUT.byteOffset(PathElement.groupElement("maintenance4"));
    /// The memory layout of `maintenance4`.
    public static final MemoryLayout LAYOUT_maintenance4 = LAYOUT.select(PathElement.groupElement("maintenance4"));
    /// The [VarHandle] of `maintenance4` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maintenance4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance4"));

    /// Creates `VkPhysicalDeviceVulkan13Features` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVulkan13Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVulkan13Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan13Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVulkan13Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkan13Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan13Features`
    public static VkPhysicalDeviceVulkan13Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan13Features(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVulkan13Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan13Features`
    public static VkPhysicalDeviceVulkan13Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan13Features(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features copyFrom(VkPhysicalDeviceVulkan13Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVulkan13Features reinterpret(long count) { return new VkPhysicalDeviceVulkan13Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVulkan13Features sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan13Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `robustImageAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int robustImageAccess(MemorySegment segment, long index) { return (int) VH_robustImageAccess.get(segment, 0L, index); }
    /// {@return `robustImageAccess`}
    public int robustImageAccess() { return robustImageAccess(this.segment(), 0L); }
    /// Sets `robustImageAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustImageAccess(MemorySegment segment, long index, int value) { VH_robustImageAccess.set(segment, 0L, index, value); }
    /// Sets `robustImageAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features robustImageAccess(int value) { robustImageAccess(this.segment(), 0L, value); return this; }

    /// {@return `inlineUniformBlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inlineUniformBlock(MemorySegment segment, long index) { return (int) VH_inlineUniformBlock.get(segment, 0L, index); }
    /// {@return `inlineUniformBlock`}
    public int inlineUniformBlock() { return inlineUniformBlock(this.segment(), 0L); }
    /// Sets `inlineUniformBlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inlineUniformBlock(MemorySegment segment, long index, int value) { VH_inlineUniformBlock.set(segment, 0L, index, value); }
    /// Sets `inlineUniformBlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features inlineUniformBlock(int value) { inlineUniformBlock(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingInlineUniformBlockUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind`}
    public int descriptorBindingInlineUniformBlockUpdateAfterBind() { return descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingInlineUniformBlockUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBind(int value) { descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `pipelineCreationCacheControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineCreationCacheControl(MemorySegment segment, long index) { return (int) VH_pipelineCreationCacheControl.get(segment, 0L, index); }
    /// {@return `pipelineCreationCacheControl`}
    public int pipelineCreationCacheControl() { return pipelineCreationCacheControl(this.segment(), 0L); }
    /// Sets `pipelineCreationCacheControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineCreationCacheControl(MemorySegment segment, long index, int value) { VH_pipelineCreationCacheControl.set(segment, 0L, index, value); }
    /// Sets `pipelineCreationCacheControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControl(int value) { pipelineCreationCacheControl(this.segment(), 0L, value); return this; }

    /// {@return `privateData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int privateData(MemorySegment segment, long index) { return (int) VH_privateData.get(segment, 0L, index); }
    /// {@return `privateData`}
    public int privateData() { return privateData(this.segment(), 0L); }
    /// Sets `privateData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void privateData(MemorySegment segment, long index, int value) { VH_privateData.set(segment, 0L, index, value); }
    /// Sets `privateData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features privateData(int value) { privateData(this.segment(), 0L, value); return this; }

    /// {@return `shaderDemoteToHelperInvocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDemoteToHelperInvocation(MemorySegment segment, long index) { return (int) VH_shaderDemoteToHelperInvocation.get(segment, 0L, index); }
    /// {@return `shaderDemoteToHelperInvocation`}
    public int shaderDemoteToHelperInvocation() { return shaderDemoteToHelperInvocation(this.segment(), 0L); }
    /// Sets `shaderDemoteToHelperInvocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDemoteToHelperInvocation(MemorySegment segment, long index, int value) { VH_shaderDemoteToHelperInvocation.set(segment, 0L, index, value); }
    /// Sets `shaderDemoteToHelperInvocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocation(int value) { shaderDemoteToHelperInvocation(this.segment(), 0L, value); return this; }

    /// {@return `shaderTerminateInvocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTerminateInvocation(MemorySegment segment, long index) { return (int) VH_shaderTerminateInvocation.get(segment, 0L, index); }
    /// {@return `shaderTerminateInvocation`}
    public int shaderTerminateInvocation() { return shaderTerminateInvocation(this.segment(), 0L); }
    /// Sets `shaderTerminateInvocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTerminateInvocation(MemorySegment segment, long index, int value) { VH_shaderTerminateInvocation.set(segment, 0L, index, value); }
    /// Sets `shaderTerminateInvocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocation(int value) { shaderTerminateInvocation(this.segment(), 0L, value); return this; }

    /// {@return `subgroupSizeControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subgroupSizeControl(MemorySegment segment, long index) { return (int) VH_subgroupSizeControl.get(segment, 0L, index); }
    /// {@return `subgroupSizeControl`}
    public int subgroupSizeControl() { return subgroupSizeControl(this.segment(), 0L); }
    /// Sets `subgroupSizeControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subgroupSizeControl(MemorySegment segment, long index, int value) { VH_subgroupSizeControl.set(segment, 0L, index, value); }
    /// Sets `subgroupSizeControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features subgroupSizeControl(int value) { subgroupSizeControl(this.segment(), 0L, value); return this; }

    /// {@return `computeFullSubgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeFullSubgroups(MemorySegment segment, long index) { return (int) VH_computeFullSubgroups.get(segment, 0L, index); }
    /// {@return `computeFullSubgroups`}
    public int computeFullSubgroups() { return computeFullSubgroups(this.segment(), 0L); }
    /// Sets `computeFullSubgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeFullSubgroups(MemorySegment segment, long index, int value) { VH_computeFullSubgroups.set(segment, 0L, index, value); }
    /// Sets `computeFullSubgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features computeFullSubgroups(int value) { computeFullSubgroups(this.segment(), 0L, value); return this; }

    /// {@return `synchronization2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int synchronization2(MemorySegment segment, long index) { return (int) VH_synchronization2.get(segment, 0L, index); }
    /// {@return `synchronization2`}
    public int synchronization2() { return synchronization2(this.segment(), 0L); }
    /// Sets `synchronization2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void synchronization2(MemorySegment segment, long index, int value) { VH_synchronization2.set(segment, 0L, index, value); }
    /// Sets `synchronization2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features synchronization2(int value) { synchronization2(this.segment(), 0L, value); return this; }

    /// {@return `textureCompressionASTC_HDR` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int textureCompressionASTC_HDR(MemorySegment segment, long index) { return (int) VH_textureCompressionASTC_HDR.get(segment, 0L, index); }
    /// {@return `textureCompressionASTC_HDR`}
    public int textureCompressionASTC_HDR() { return textureCompressionASTC_HDR(this.segment(), 0L); }
    /// Sets `textureCompressionASTC_HDR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void textureCompressionASTC_HDR(MemorySegment segment, long index, int value) { VH_textureCompressionASTC_HDR.set(segment, 0L, index, value); }
    /// Sets `textureCompressionASTC_HDR` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDR(int value) { textureCompressionASTC_HDR(this.segment(), 0L, value); return this; }

    /// {@return `shaderZeroInitializeWorkgroupMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderZeroInitializeWorkgroupMemory(MemorySegment segment, long index) { return (int) VH_shaderZeroInitializeWorkgroupMemory.get(segment, 0L, index); }
    /// {@return `shaderZeroInitializeWorkgroupMemory`}
    public int shaderZeroInitializeWorkgroupMemory() { return shaderZeroInitializeWorkgroupMemory(this.segment(), 0L); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderZeroInitializeWorkgroupMemory(MemorySegment segment, long index, int value) { VH_shaderZeroInitializeWorkgroupMemory.set(segment, 0L, index, value); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemory(int value) { shaderZeroInitializeWorkgroupMemory(this.segment(), 0L, value); return this; }

    /// {@return `dynamicRendering` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicRendering(MemorySegment segment, long index) { return (int) VH_dynamicRendering.get(segment, 0L, index); }
    /// {@return `dynamicRendering`}
    public int dynamicRendering() { return dynamicRendering(this.segment(), 0L); }
    /// Sets `dynamicRendering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicRendering(MemorySegment segment, long index, int value) { VH_dynamicRendering.set(segment, 0L, index, value); }
    /// Sets `dynamicRendering` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features dynamicRendering(int value) { dynamicRendering(this.segment(), 0L, value); return this; }

    /// {@return `shaderIntegerDotProduct` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderIntegerDotProduct(MemorySegment segment, long index) { return (int) VH_shaderIntegerDotProduct.get(segment, 0L, index); }
    /// {@return `shaderIntegerDotProduct`}
    public int shaderIntegerDotProduct() { return shaderIntegerDotProduct(this.segment(), 0L); }
    /// Sets `shaderIntegerDotProduct` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderIntegerDotProduct(MemorySegment segment, long index, int value) { VH_shaderIntegerDotProduct.set(segment, 0L, index, value); }
    /// Sets `shaderIntegerDotProduct` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProduct(int value) { shaderIntegerDotProduct(this.segment(), 0L, value); return this; }

    /// {@return `maintenance4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maintenance4(MemorySegment segment, long index) { return (int) VH_maintenance4.get(segment, 0L, index); }
    /// {@return `maintenance4`}
    public int maintenance4() { return maintenance4(this.segment(), 0L); }
    /// Sets `maintenance4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maintenance4(MemorySegment segment, long index, int value) { VH_maintenance4.set(segment, 0L, index, value); }
    /// Sets `maintenance4` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features maintenance4(int value) { maintenance4(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVulkan13Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkan13Features`
    public VkPhysicalDeviceVulkan13Features asSlice(long index) { return new VkPhysicalDeviceVulkan13Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVulkan13Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkan13Features`
    public VkPhysicalDeviceVulkan13Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan13Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVulkan13Features` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features at(long index, Consumer<VkPhysicalDeviceVulkan13Features> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `robustImageAccess` at the given index}
    /// @param index the index of the struct buffer
    public int robustImageAccessAt(long index) { return robustImageAccess(this.segment(), index); }
    /// Sets `robustImageAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features robustImageAccessAt(long index, int value) { robustImageAccess(this.segment(), index, value); return this; }

    /// {@return `inlineUniformBlock` at the given index}
    /// @param index the index of the struct buffer
    public int inlineUniformBlockAt(long index) { return inlineUniformBlock(this.segment(), index); }
    /// Sets `inlineUniformBlock` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features inlineUniformBlockAt(long index, int value) { inlineUniformBlock(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index) { return descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), index); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index, int value) { descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `pipelineCreationCacheControl` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineCreationCacheControlAt(long index) { return pipelineCreationCacheControl(this.segment(), index); }
    /// Sets `pipelineCreationCacheControl` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControlAt(long index, int value) { pipelineCreationCacheControl(this.segment(), index, value); return this; }

    /// {@return `privateData` at the given index}
    /// @param index the index of the struct buffer
    public int privateDataAt(long index) { return privateData(this.segment(), index); }
    /// Sets `privateData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features privateDataAt(long index, int value) { privateData(this.segment(), index, value); return this; }

    /// {@return `shaderDemoteToHelperInvocation` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDemoteToHelperInvocationAt(long index) { return shaderDemoteToHelperInvocation(this.segment(), index); }
    /// Sets `shaderDemoteToHelperInvocation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocationAt(long index, int value) { shaderDemoteToHelperInvocation(this.segment(), index, value); return this; }

    /// {@return `shaderTerminateInvocation` at the given index}
    /// @param index the index of the struct buffer
    public int shaderTerminateInvocationAt(long index) { return shaderTerminateInvocation(this.segment(), index); }
    /// Sets `shaderTerminateInvocation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocationAt(long index, int value) { shaderTerminateInvocation(this.segment(), index, value); return this; }

    /// {@return `subgroupSizeControl` at the given index}
    /// @param index the index of the struct buffer
    public int subgroupSizeControlAt(long index) { return subgroupSizeControl(this.segment(), index); }
    /// Sets `subgroupSizeControl` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features subgroupSizeControlAt(long index, int value) { subgroupSizeControl(this.segment(), index, value); return this; }

    /// {@return `computeFullSubgroups` at the given index}
    /// @param index the index of the struct buffer
    public int computeFullSubgroupsAt(long index) { return computeFullSubgroups(this.segment(), index); }
    /// Sets `computeFullSubgroups` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features computeFullSubgroupsAt(long index, int value) { computeFullSubgroups(this.segment(), index, value); return this; }

    /// {@return `synchronization2` at the given index}
    /// @param index the index of the struct buffer
    public int synchronization2At(long index) { return synchronization2(this.segment(), index); }
    /// Sets `synchronization2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features synchronization2At(long index, int value) { synchronization2(this.segment(), index, value); return this; }

    /// {@return `textureCompressionASTC_HDR` at the given index}
    /// @param index the index of the struct buffer
    public int textureCompressionASTC_HDRAt(long index) { return textureCompressionASTC_HDR(this.segment(), index); }
    /// Sets `textureCompressionASTC_HDR` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDRAt(long index, int value) { textureCompressionASTC_HDR(this.segment(), index, value); return this; }

    /// {@return `shaderZeroInitializeWorkgroupMemory` at the given index}
    /// @param index the index of the struct buffer
    public int shaderZeroInitializeWorkgroupMemoryAt(long index) { return shaderZeroInitializeWorkgroupMemory(this.segment(), index); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemoryAt(long index, int value) { shaderZeroInitializeWorkgroupMemory(this.segment(), index, value); return this; }

    /// {@return `dynamicRendering` at the given index}
    /// @param index the index of the struct buffer
    public int dynamicRenderingAt(long index) { return dynamicRendering(this.segment(), index); }
    /// Sets `dynamicRendering` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features dynamicRenderingAt(long index, int value) { dynamicRendering(this.segment(), index, value); return this; }

    /// {@return `shaderIntegerDotProduct` at the given index}
    /// @param index the index of the struct buffer
    public int shaderIntegerDotProductAt(long index) { return shaderIntegerDotProduct(this.segment(), index); }
    /// Sets `shaderIntegerDotProduct` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProductAt(long index, int value) { shaderIntegerDotProduct(this.segment(), index, value); return this; }

    /// {@return `maintenance4` at the given index}
    /// @param index the index of the struct buffer
    public int maintenance4At(long index) { return maintenance4(this.segment(), index); }
    /// Sets `maintenance4` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features maintenance4At(long index, int value) { maintenance4(this.segment(), index, value); return this; }

}
