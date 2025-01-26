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
/// struct VkPhysicalDeviceVulkanSC10Properties {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 deviceNoDynamicHostAllocations;
///     VkBool32 deviceDestroyFreesMemory;
///     VkBool32 commandPoolMultipleCommandBuffersRecording;
///     VkBool32 commandPoolResetCommandBuffer;
///     VkBool32 commandBufferSimultaneousUse;
///     VkBool32 secondaryCommandBufferNullOrImagelessFramebuffer;
///     VkBool32 recycleDescriptorSetMemory;
///     VkBool32 recyclePipelineMemory;
///     uint32_t maxRenderPassSubpasses;
///     uint32_t maxRenderPassDependencies;
///     uint32_t maxSubpassInputAttachments;
///     uint32_t maxSubpassPreserveAttachments;
///     uint32_t maxFramebufferAttachments;
///     uint32_t maxDescriptorSetLayoutBindings;
///     uint32_t maxQueryFaultCount;
///     uint32_t maxCallbackFaultCount;
///     uint32_t maxCommandPoolCommandBuffers;
///     VkDeviceSize maxCommandBufferSize;
/// };
/// ```
public sealed class VkPhysicalDeviceVulkanSC10Properties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkanSC10Properties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceNoDynamicHostAllocations"),
        ValueLayout.JAVA_INT.withName("deviceDestroyFreesMemory"),
        ValueLayout.JAVA_INT.withName("commandPoolMultipleCommandBuffersRecording"),
        ValueLayout.JAVA_INT.withName("commandPoolResetCommandBuffer"),
        ValueLayout.JAVA_INT.withName("commandBufferSimultaneousUse"),
        ValueLayout.JAVA_INT.withName("secondaryCommandBufferNullOrImagelessFramebuffer"),
        ValueLayout.JAVA_INT.withName("recycleDescriptorSetMemory"),
        ValueLayout.JAVA_INT.withName("recyclePipelineMemory"),
        ValueLayout.JAVA_INT.withName("maxRenderPassSubpasses"),
        ValueLayout.JAVA_INT.withName("maxRenderPassDependencies"),
        ValueLayout.JAVA_INT.withName("maxSubpassInputAttachments"),
        ValueLayout.JAVA_INT.withName("maxSubpassPreserveAttachments"),
        ValueLayout.JAVA_INT.withName("maxFramebufferAttachments"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetLayoutBindings"),
        ValueLayout.JAVA_INT.withName("maxQueryFaultCount"),
        ValueLayout.JAVA_INT.withName("maxCallbackFaultCount"),
        ValueLayout.JAVA_INT.withName("maxCommandPoolCommandBuffers"),
        ValueLayout.JAVA_LONG.withName("maxCommandBufferSize")
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
    /// The byte offset of `deviceNoDynamicHostAllocations`.
    public static final long OFFSET_deviceNoDynamicHostAllocations = LAYOUT.byteOffset(PathElement.groupElement("deviceNoDynamicHostAllocations"));
    /// The memory layout of `deviceNoDynamicHostAllocations`.
    public static final MemoryLayout LAYOUT_deviceNoDynamicHostAllocations = LAYOUT.select(PathElement.groupElement("deviceNoDynamicHostAllocations"));
    /// The [VarHandle] of `deviceNoDynamicHostAllocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceNoDynamicHostAllocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceNoDynamicHostAllocations"));
    /// The byte offset of `deviceDestroyFreesMemory`.
    public static final long OFFSET_deviceDestroyFreesMemory = LAYOUT.byteOffset(PathElement.groupElement("deviceDestroyFreesMemory"));
    /// The memory layout of `deviceDestroyFreesMemory`.
    public static final MemoryLayout LAYOUT_deviceDestroyFreesMemory = LAYOUT.select(PathElement.groupElement("deviceDestroyFreesMemory"));
    /// The [VarHandle] of `deviceDestroyFreesMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceDestroyFreesMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceDestroyFreesMemory"));
    /// The byte offset of `commandPoolMultipleCommandBuffersRecording`.
    public static final long OFFSET_commandPoolMultipleCommandBuffersRecording = LAYOUT.byteOffset(PathElement.groupElement("commandPoolMultipleCommandBuffersRecording"));
    /// The memory layout of `commandPoolMultipleCommandBuffersRecording`.
    public static final MemoryLayout LAYOUT_commandPoolMultipleCommandBuffersRecording = LAYOUT.select(PathElement.groupElement("commandPoolMultipleCommandBuffersRecording"));
    /// The [VarHandle] of `commandPoolMultipleCommandBuffersRecording` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandPoolMultipleCommandBuffersRecording = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolMultipleCommandBuffersRecording"));
    /// The byte offset of `commandPoolResetCommandBuffer`.
    public static final long OFFSET_commandPoolResetCommandBuffer = LAYOUT.byteOffset(PathElement.groupElement("commandPoolResetCommandBuffer"));
    /// The memory layout of `commandPoolResetCommandBuffer`.
    public static final MemoryLayout LAYOUT_commandPoolResetCommandBuffer = LAYOUT.select(PathElement.groupElement("commandPoolResetCommandBuffer"));
    /// The [VarHandle] of `commandPoolResetCommandBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandPoolResetCommandBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolResetCommandBuffer"));
    /// The byte offset of `commandBufferSimultaneousUse`.
    public static final long OFFSET_commandBufferSimultaneousUse = LAYOUT.byteOffset(PathElement.groupElement("commandBufferSimultaneousUse"));
    /// The memory layout of `commandBufferSimultaneousUse`.
    public static final MemoryLayout LAYOUT_commandBufferSimultaneousUse = LAYOUT.select(PathElement.groupElement("commandBufferSimultaneousUse"));
    /// The [VarHandle] of `commandBufferSimultaneousUse` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBufferSimultaneousUse = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferSimultaneousUse"));
    /// The byte offset of `secondaryCommandBufferNullOrImagelessFramebuffer`.
    public static final long OFFSET_secondaryCommandBufferNullOrImagelessFramebuffer = LAYOUT.byteOffset(PathElement.groupElement("secondaryCommandBufferNullOrImagelessFramebuffer"));
    /// The memory layout of `secondaryCommandBufferNullOrImagelessFramebuffer`.
    public static final MemoryLayout LAYOUT_secondaryCommandBufferNullOrImagelessFramebuffer = LAYOUT.select(PathElement.groupElement("secondaryCommandBufferNullOrImagelessFramebuffer"));
    /// The [VarHandle] of `secondaryCommandBufferNullOrImagelessFramebuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_secondaryCommandBufferNullOrImagelessFramebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("secondaryCommandBufferNullOrImagelessFramebuffer"));
    /// The byte offset of `recycleDescriptorSetMemory`.
    public static final long OFFSET_recycleDescriptorSetMemory = LAYOUT.byteOffset(PathElement.groupElement("recycleDescriptorSetMemory"));
    /// The memory layout of `recycleDescriptorSetMemory`.
    public static final MemoryLayout LAYOUT_recycleDescriptorSetMemory = LAYOUT.select(PathElement.groupElement("recycleDescriptorSetMemory"));
    /// The [VarHandle] of `recycleDescriptorSetMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_recycleDescriptorSetMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("recycleDescriptorSetMemory"));
    /// The byte offset of `recyclePipelineMemory`.
    public static final long OFFSET_recyclePipelineMemory = LAYOUT.byteOffset(PathElement.groupElement("recyclePipelineMemory"));
    /// The memory layout of `recyclePipelineMemory`.
    public static final MemoryLayout LAYOUT_recyclePipelineMemory = LAYOUT.select(PathElement.groupElement("recyclePipelineMemory"));
    /// The [VarHandle] of `recyclePipelineMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_recyclePipelineMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("recyclePipelineMemory"));
    /// The byte offset of `maxRenderPassSubpasses`.
    public static final long OFFSET_maxRenderPassSubpasses = LAYOUT.byteOffset(PathElement.groupElement("maxRenderPassSubpasses"));
    /// The memory layout of `maxRenderPassSubpasses`.
    public static final MemoryLayout LAYOUT_maxRenderPassSubpasses = LAYOUT.select(PathElement.groupElement("maxRenderPassSubpasses"));
    /// The [VarHandle] of `maxRenderPassSubpasses` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxRenderPassSubpasses = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRenderPassSubpasses"));
    /// The byte offset of `maxRenderPassDependencies`.
    public static final long OFFSET_maxRenderPassDependencies = LAYOUT.byteOffset(PathElement.groupElement("maxRenderPassDependencies"));
    /// The memory layout of `maxRenderPassDependencies`.
    public static final MemoryLayout LAYOUT_maxRenderPassDependencies = LAYOUT.select(PathElement.groupElement("maxRenderPassDependencies"));
    /// The [VarHandle] of `maxRenderPassDependencies` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxRenderPassDependencies = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRenderPassDependencies"));
    /// The byte offset of `maxSubpassInputAttachments`.
    public static final long OFFSET_maxSubpassInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxSubpassInputAttachments"));
    /// The memory layout of `maxSubpassInputAttachments`.
    public static final MemoryLayout LAYOUT_maxSubpassInputAttachments = LAYOUT.select(PathElement.groupElement("maxSubpassInputAttachments"));
    /// The [VarHandle] of `maxSubpassInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSubpassInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubpassInputAttachments"));
    /// The byte offset of `maxSubpassPreserveAttachments`.
    public static final long OFFSET_maxSubpassPreserveAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxSubpassPreserveAttachments"));
    /// The memory layout of `maxSubpassPreserveAttachments`.
    public static final MemoryLayout LAYOUT_maxSubpassPreserveAttachments = LAYOUT.select(PathElement.groupElement("maxSubpassPreserveAttachments"));
    /// The [VarHandle] of `maxSubpassPreserveAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSubpassPreserveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubpassPreserveAttachments"));
    /// The byte offset of `maxFramebufferAttachments`.
    public static final long OFFSET_maxFramebufferAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferAttachments"));
    /// The memory layout of `maxFramebufferAttachments`.
    public static final MemoryLayout LAYOUT_maxFramebufferAttachments = LAYOUT.select(PathElement.groupElement("maxFramebufferAttachments"));
    /// The [VarHandle] of `maxFramebufferAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxFramebufferAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferAttachments"));
    /// The byte offset of `maxDescriptorSetLayoutBindings`.
    public static final long OFFSET_maxDescriptorSetLayoutBindings = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetLayoutBindings"));
    /// The memory layout of `maxDescriptorSetLayoutBindings`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetLayoutBindings = LAYOUT.select(PathElement.groupElement("maxDescriptorSetLayoutBindings"));
    /// The [VarHandle] of `maxDescriptorSetLayoutBindings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetLayoutBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetLayoutBindings"));
    /// The byte offset of `maxQueryFaultCount`.
    public static final long OFFSET_maxQueryFaultCount = LAYOUT.byteOffset(PathElement.groupElement("maxQueryFaultCount"));
    /// The memory layout of `maxQueryFaultCount`.
    public static final MemoryLayout LAYOUT_maxQueryFaultCount = LAYOUT.select(PathElement.groupElement("maxQueryFaultCount"));
    /// The [VarHandle] of `maxQueryFaultCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxQueryFaultCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQueryFaultCount"));
    /// The byte offset of `maxCallbackFaultCount`.
    public static final long OFFSET_maxCallbackFaultCount = LAYOUT.byteOffset(PathElement.groupElement("maxCallbackFaultCount"));
    /// The memory layout of `maxCallbackFaultCount`.
    public static final MemoryLayout LAYOUT_maxCallbackFaultCount = LAYOUT.select(PathElement.groupElement("maxCallbackFaultCount"));
    /// The [VarHandle] of `maxCallbackFaultCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxCallbackFaultCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCallbackFaultCount"));
    /// The byte offset of `maxCommandPoolCommandBuffers`.
    public static final long OFFSET_maxCommandPoolCommandBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxCommandPoolCommandBuffers"));
    /// The memory layout of `maxCommandPoolCommandBuffers`.
    public static final MemoryLayout LAYOUT_maxCommandPoolCommandBuffers = LAYOUT.select(PathElement.groupElement("maxCommandPoolCommandBuffers"));
    /// The [VarHandle] of `maxCommandPoolCommandBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxCommandPoolCommandBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCommandPoolCommandBuffers"));
    /// The byte offset of `maxCommandBufferSize`.
    public static final long OFFSET_maxCommandBufferSize = LAYOUT.byteOffset(PathElement.groupElement("maxCommandBufferSize"));
    /// The memory layout of `maxCommandBufferSize`.
    public static final MemoryLayout LAYOUT_maxCommandBufferSize = LAYOUT.select(PathElement.groupElement("maxCommandBufferSize"));
    /// The [VarHandle] of `maxCommandBufferSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxCommandBufferSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCommandBufferSize"));

    /// Creates `VkPhysicalDeviceVulkanSC10Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkanSC10Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkanSC10Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkanSC10Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanSC10Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanSC10Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkanSC10Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVulkanSC10Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkanSC10Properties`
    public static VkPhysicalDeviceVulkanSC10Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkanSC10Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkanSC10Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkanSC10Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties copyFrom(VkPhysicalDeviceVulkanSC10Properties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceVulkanSC10Properties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkanSC10Properties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceNoDynamicHostAllocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceNoDynamicHostAllocations(MemorySegment segment, long index) { return (int) VH_deviceNoDynamicHostAllocations.get(segment, 0L, index); }
    /// {@return `deviceNoDynamicHostAllocations`}
    public int deviceNoDynamicHostAllocations() { return deviceNoDynamicHostAllocations(this.segment(), 0L); }
    /// Sets `deviceNoDynamicHostAllocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceNoDynamicHostAllocations(MemorySegment segment, long index, int value) { VH_deviceNoDynamicHostAllocations.set(segment, 0L, index, value); }
    /// Sets `deviceNoDynamicHostAllocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties deviceNoDynamicHostAllocations(int value) { deviceNoDynamicHostAllocations(this.segment(), 0L, value); return this; }

    /// {@return `deviceDestroyFreesMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceDestroyFreesMemory(MemorySegment segment, long index) { return (int) VH_deviceDestroyFreesMemory.get(segment, 0L, index); }
    /// {@return `deviceDestroyFreesMemory`}
    public int deviceDestroyFreesMemory() { return deviceDestroyFreesMemory(this.segment(), 0L); }
    /// Sets `deviceDestroyFreesMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceDestroyFreesMemory(MemorySegment segment, long index, int value) { VH_deviceDestroyFreesMemory.set(segment, 0L, index, value); }
    /// Sets `deviceDestroyFreesMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties deviceDestroyFreesMemory(int value) { deviceDestroyFreesMemory(this.segment(), 0L, value); return this; }

    /// {@return `commandPoolMultipleCommandBuffersRecording` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandPoolMultipleCommandBuffersRecording(MemorySegment segment, long index) { return (int) VH_commandPoolMultipleCommandBuffersRecording.get(segment, 0L, index); }
    /// {@return `commandPoolMultipleCommandBuffersRecording`}
    public int commandPoolMultipleCommandBuffersRecording() { return commandPoolMultipleCommandBuffersRecording(this.segment(), 0L); }
    /// Sets `commandPoolMultipleCommandBuffersRecording` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandPoolMultipleCommandBuffersRecording(MemorySegment segment, long index, int value) { VH_commandPoolMultipleCommandBuffersRecording.set(segment, 0L, index, value); }
    /// Sets `commandPoolMultipleCommandBuffersRecording` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandPoolMultipleCommandBuffersRecording(int value) { commandPoolMultipleCommandBuffersRecording(this.segment(), 0L, value); return this; }

    /// {@return `commandPoolResetCommandBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandPoolResetCommandBuffer(MemorySegment segment, long index) { return (int) VH_commandPoolResetCommandBuffer.get(segment, 0L, index); }
    /// {@return `commandPoolResetCommandBuffer`}
    public int commandPoolResetCommandBuffer() { return commandPoolResetCommandBuffer(this.segment(), 0L); }
    /// Sets `commandPoolResetCommandBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandPoolResetCommandBuffer(MemorySegment segment, long index, int value) { VH_commandPoolResetCommandBuffer.set(segment, 0L, index, value); }
    /// Sets `commandPoolResetCommandBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandPoolResetCommandBuffer(int value) { commandPoolResetCommandBuffer(this.segment(), 0L, value); return this; }

    /// {@return `commandBufferSimultaneousUse` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandBufferSimultaneousUse(MemorySegment segment, long index) { return (int) VH_commandBufferSimultaneousUse.get(segment, 0L, index); }
    /// {@return `commandBufferSimultaneousUse`}
    public int commandBufferSimultaneousUse() { return commandBufferSimultaneousUse(this.segment(), 0L); }
    /// Sets `commandBufferSimultaneousUse` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandBufferSimultaneousUse(MemorySegment segment, long index, int value) { VH_commandBufferSimultaneousUse.set(segment, 0L, index, value); }
    /// Sets `commandBufferSimultaneousUse` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandBufferSimultaneousUse(int value) { commandBufferSimultaneousUse(this.segment(), 0L, value); return this; }

    /// {@return `secondaryCommandBufferNullOrImagelessFramebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int secondaryCommandBufferNullOrImagelessFramebuffer(MemorySegment segment, long index) { return (int) VH_secondaryCommandBufferNullOrImagelessFramebuffer.get(segment, 0L, index); }
    /// {@return `secondaryCommandBufferNullOrImagelessFramebuffer`}
    public int secondaryCommandBufferNullOrImagelessFramebuffer() { return secondaryCommandBufferNullOrImagelessFramebuffer(this.segment(), 0L); }
    /// Sets `secondaryCommandBufferNullOrImagelessFramebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void secondaryCommandBufferNullOrImagelessFramebuffer(MemorySegment segment, long index, int value) { VH_secondaryCommandBufferNullOrImagelessFramebuffer.set(segment, 0L, index, value); }
    /// Sets `secondaryCommandBufferNullOrImagelessFramebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties secondaryCommandBufferNullOrImagelessFramebuffer(int value) { secondaryCommandBufferNullOrImagelessFramebuffer(this.segment(), 0L, value); return this; }

    /// {@return `recycleDescriptorSetMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int recycleDescriptorSetMemory(MemorySegment segment, long index) { return (int) VH_recycleDescriptorSetMemory.get(segment, 0L, index); }
    /// {@return `recycleDescriptorSetMemory`}
    public int recycleDescriptorSetMemory() { return recycleDescriptorSetMemory(this.segment(), 0L); }
    /// Sets `recycleDescriptorSetMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void recycleDescriptorSetMemory(MemorySegment segment, long index, int value) { VH_recycleDescriptorSetMemory.set(segment, 0L, index, value); }
    /// Sets `recycleDescriptorSetMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties recycleDescriptorSetMemory(int value) { recycleDescriptorSetMemory(this.segment(), 0L, value); return this; }

    /// {@return `recyclePipelineMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int recyclePipelineMemory(MemorySegment segment, long index) { return (int) VH_recyclePipelineMemory.get(segment, 0L, index); }
    /// {@return `recyclePipelineMemory`}
    public int recyclePipelineMemory() { return recyclePipelineMemory(this.segment(), 0L); }
    /// Sets `recyclePipelineMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void recyclePipelineMemory(MemorySegment segment, long index, int value) { VH_recyclePipelineMemory.set(segment, 0L, index, value); }
    /// Sets `recyclePipelineMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties recyclePipelineMemory(int value) { recyclePipelineMemory(this.segment(), 0L, value); return this; }

    /// {@return `maxRenderPassSubpasses` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxRenderPassSubpasses(MemorySegment segment, long index) { return (int) VH_maxRenderPassSubpasses.get(segment, 0L, index); }
    /// {@return `maxRenderPassSubpasses`}
    public int maxRenderPassSubpasses() { return maxRenderPassSubpasses(this.segment(), 0L); }
    /// Sets `maxRenderPassSubpasses` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxRenderPassSubpasses(MemorySegment segment, long index, int value) { VH_maxRenderPassSubpasses.set(segment, 0L, index, value); }
    /// Sets `maxRenderPassSubpasses` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxRenderPassSubpasses(int value) { maxRenderPassSubpasses(this.segment(), 0L, value); return this; }

    /// {@return `maxRenderPassDependencies` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxRenderPassDependencies(MemorySegment segment, long index) { return (int) VH_maxRenderPassDependencies.get(segment, 0L, index); }
    /// {@return `maxRenderPassDependencies`}
    public int maxRenderPassDependencies() { return maxRenderPassDependencies(this.segment(), 0L); }
    /// Sets `maxRenderPassDependencies` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxRenderPassDependencies(MemorySegment segment, long index, int value) { VH_maxRenderPassDependencies.set(segment, 0L, index, value); }
    /// Sets `maxRenderPassDependencies` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxRenderPassDependencies(int value) { maxRenderPassDependencies(this.segment(), 0L, value); return this; }

    /// {@return `maxSubpassInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSubpassInputAttachments(MemorySegment segment, long index) { return (int) VH_maxSubpassInputAttachments.get(segment, 0L, index); }
    /// {@return `maxSubpassInputAttachments`}
    public int maxSubpassInputAttachments() { return maxSubpassInputAttachments(this.segment(), 0L); }
    /// Sets `maxSubpassInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSubpassInputAttachments(MemorySegment segment, long index, int value) { VH_maxSubpassInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxSubpassInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxSubpassInputAttachments(int value) { maxSubpassInputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxSubpassPreserveAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSubpassPreserveAttachments(MemorySegment segment, long index) { return (int) VH_maxSubpassPreserveAttachments.get(segment, 0L, index); }
    /// {@return `maxSubpassPreserveAttachments`}
    public int maxSubpassPreserveAttachments() { return maxSubpassPreserveAttachments(this.segment(), 0L); }
    /// Sets `maxSubpassPreserveAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSubpassPreserveAttachments(MemorySegment segment, long index, int value) { VH_maxSubpassPreserveAttachments.set(segment, 0L, index, value); }
    /// Sets `maxSubpassPreserveAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxSubpassPreserveAttachments(int value) { maxSubpassPreserveAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxFramebufferAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFramebufferAttachments(MemorySegment segment, long index) { return (int) VH_maxFramebufferAttachments.get(segment, 0L, index); }
    /// {@return `maxFramebufferAttachments`}
    public int maxFramebufferAttachments() { return maxFramebufferAttachments(this.segment(), 0L); }
    /// Sets `maxFramebufferAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFramebufferAttachments(MemorySegment segment, long index, int value) { VH_maxFramebufferAttachments.set(segment, 0L, index, value); }
    /// Sets `maxFramebufferAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxFramebufferAttachments(int value) { maxFramebufferAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetLayoutBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetLayoutBindings(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetLayoutBindings.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetLayoutBindings`}
    public int maxDescriptorSetLayoutBindings() { return maxDescriptorSetLayoutBindings(this.segment(), 0L); }
    /// Sets `maxDescriptorSetLayoutBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetLayoutBindings(MemorySegment segment, long index, int value) { VH_maxDescriptorSetLayoutBindings.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetLayoutBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxDescriptorSetLayoutBindings(int value) { maxDescriptorSetLayoutBindings(this.segment(), 0L, value); return this; }

    /// {@return `maxQueryFaultCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxQueryFaultCount(MemorySegment segment, long index) { return (int) VH_maxQueryFaultCount.get(segment, 0L, index); }
    /// {@return `maxQueryFaultCount`}
    public int maxQueryFaultCount() { return maxQueryFaultCount(this.segment(), 0L); }
    /// Sets `maxQueryFaultCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQueryFaultCount(MemorySegment segment, long index, int value) { VH_maxQueryFaultCount.set(segment, 0L, index, value); }
    /// Sets `maxQueryFaultCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxQueryFaultCount(int value) { maxQueryFaultCount(this.segment(), 0L, value); return this; }

    /// {@return `maxCallbackFaultCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCallbackFaultCount(MemorySegment segment, long index) { return (int) VH_maxCallbackFaultCount.get(segment, 0L, index); }
    /// {@return `maxCallbackFaultCount`}
    public int maxCallbackFaultCount() { return maxCallbackFaultCount(this.segment(), 0L); }
    /// Sets `maxCallbackFaultCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCallbackFaultCount(MemorySegment segment, long index, int value) { VH_maxCallbackFaultCount.set(segment, 0L, index, value); }
    /// Sets `maxCallbackFaultCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCallbackFaultCount(int value) { maxCallbackFaultCount(this.segment(), 0L, value); return this; }

    /// {@return `maxCommandPoolCommandBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCommandPoolCommandBuffers(MemorySegment segment, long index) { return (int) VH_maxCommandPoolCommandBuffers.get(segment, 0L, index); }
    /// {@return `maxCommandPoolCommandBuffers`}
    public int maxCommandPoolCommandBuffers() { return maxCommandPoolCommandBuffers(this.segment(), 0L); }
    /// Sets `maxCommandPoolCommandBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCommandPoolCommandBuffers(MemorySegment segment, long index, int value) { VH_maxCommandPoolCommandBuffers.set(segment, 0L, index, value); }
    /// Sets `maxCommandPoolCommandBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCommandPoolCommandBuffers(int value) { maxCommandPoolCommandBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxCommandBufferSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxCommandBufferSize(MemorySegment segment, long index) { return (long) VH_maxCommandBufferSize.get(segment, 0L, index); }
    /// {@return `maxCommandBufferSize`}
    public long maxCommandBufferSize() { return maxCommandBufferSize(this.segment(), 0L); }
    /// Sets `maxCommandBufferSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCommandBufferSize(MemorySegment segment, long index, long value) { VH_maxCommandBufferSize.set(segment, 0L, index, value); }
    /// Sets `maxCommandBufferSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCommandBufferSize(long value) { maxCommandBufferSize(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceVulkanSC10Properties].
    public static final class Buffer extends VkPhysicalDeviceVulkanSC10Properties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVulkanSC10Properties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVulkanSC10Properties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVulkanSC10Properties`
        public VkPhysicalDeviceVulkanSC10Properties asSlice(long index) { return new VkPhysicalDeviceVulkanSC10Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVulkanSC10Properties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVulkanSC10Properties`
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

        /// {@return `deviceNoDynamicHostAllocations` at the given index}
        /// @param index the index of the struct buffer
        public int deviceNoDynamicHostAllocationsAt(long index) { return deviceNoDynamicHostAllocations(this.segment(), index); }
        /// Sets `deviceNoDynamicHostAllocations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceNoDynamicHostAllocationsAt(long index, int value) { deviceNoDynamicHostAllocations(this.segment(), index, value); return this; }

        /// {@return `deviceDestroyFreesMemory` at the given index}
        /// @param index the index of the struct buffer
        public int deviceDestroyFreesMemoryAt(long index) { return deviceDestroyFreesMemory(this.segment(), index); }
        /// Sets `deviceDestroyFreesMemory` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceDestroyFreesMemoryAt(long index, int value) { deviceDestroyFreesMemory(this.segment(), index, value); return this; }

        /// {@return `commandPoolMultipleCommandBuffersRecording` at the given index}
        /// @param index the index of the struct buffer
        public int commandPoolMultipleCommandBuffersRecordingAt(long index) { return commandPoolMultipleCommandBuffersRecording(this.segment(), index); }
        /// Sets `commandPoolMultipleCommandBuffersRecording` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer commandPoolMultipleCommandBuffersRecordingAt(long index, int value) { commandPoolMultipleCommandBuffersRecording(this.segment(), index, value); return this; }

        /// {@return `commandPoolResetCommandBuffer` at the given index}
        /// @param index the index of the struct buffer
        public int commandPoolResetCommandBufferAt(long index) { return commandPoolResetCommandBuffer(this.segment(), index); }
        /// Sets `commandPoolResetCommandBuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer commandPoolResetCommandBufferAt(long index, int value) { commandPoolResetCommandBuffer(this.segment(), index, value); return this; }

        /// {@return `commandBufferSimultaneousUse` at the given index}
        /// @param index the index of the struct buffer
        public int commandBufferSimultaneousUseAt(long index) { return commandBufferSimultaneousUse(this.segment(), index); }
        /// Sets `commandBufferSimultaneousUse` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer commandBufferSimultaneousUseAt(long index, int value) { commandBufferSimultaneousUse(this.segment(), index, value); return this; }

        /// {@return `secondaryCommandBufferNullOrImagelessFramebuffer` at the given index}
        /// @param index the index of the struct buffer
        public int secondaryCommandBufferNullOrImagelessFramebufferAt(long index) { return secondaryCommandBufferNullOrImagelessFramebuffer(this.segment(), index); }
        /// Sets `secondaryCommandBufferNullOrImagelessFramebuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer secondaryCommandBufferNullOrImagelessFramebufferAt(long index, int value) { secondaryCommandBufferNullOrImagelessFramebuffer(this.segment(), index, value); return this; }

        /// {@return `recycleDescriptorSetMemory` at the given index}
        /// @param index the index of the struct buffer
        public int recycleDescriptorSetMemoryAt(long index) { return recycleDescriptorSetMemory(this.segment(), index); }
        /// Sets `recycleDescriptorSetMemory` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer recycleDescriptorSetMemoryAt(long index, int value) { recycleDescriptorSetMemory(this.segment(), index, value); return this; }

        /// {@return `recyclePipelineMemory` at the given index}
        /// @param index the index of the struct buffer
        public int recyclePipelineMemoryAt(long index) { return recyclePipelineMemory(this.segment(), index); }
        /// Sets `recyclePipelineMemory` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer recyclePipelineMemoryAt(long index, int value) { recyclePipelineMemory(this.segment(), index, value); return this; }

        /// {@return `maxRenderPassSubpasses` at the given index}
        /// @param index the index of the struct buffer
        public int maxRenderPassSubpassesAt(long index) { return maxRenderPassSubpasses(this.segment(), index); }
        /// Sets `maxRenderPassSubpasses` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxRenderPassSubpassesAt(long index, int value) { maxRenderPassSubpasses(this.segment(), index, value); return this; }

        /// {@return `maxRenderPassDependencies` at the given index}
        /// @param index the index of the struct buffer
        public int maxRenderPassDependenciesAt(long index) { return maxRenderPassDependencies(this.segment(), index); }
        /// Sets `maxRenderPassDependencies` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxRenderPassDependenciesAt(long index, int value) { maxRenderPassDependencies(this.segment(), index, value); return this; }

        /// {@return `maxSubpassInputAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int maxSubpassInputAttachmentsAt(long index) { return maxSubpassInputAttachments(this.segment(), index); }
        /// Sets `maxSubpassInputAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxSubpassInputAttachmentsAt(long index, int value) { maxSubpassInputAttachments(this.segment(), index, value); return this; }

        /// {@return `maxSubpassPreserveAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int maxSubpassPreserveAttachmentsAt(long index) { return maxSubpassPreserveAttachments(this.segment(), index); }
        /// Sets `maxSubpassPreserveAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxSubpassPreserveAttachmentsAt(long index, int value) { maxSubpassPreserveAttachments(this.segment(), index, value); return this; }

        /// {@return `maxFramebufferAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int maxFramebufferAttachmentsAt(long index) { return maxFramebufferAttachments(this.segment(), index); }
        /// Sets `maxFramebufferAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxFramebufferAttachmentsAt(long index, int value) { maxFramebufferAttachments(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetLayoutBindings` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetLayoutBindingsAt(long index) { return maxDescriptorSetLayoutBindings(this.segment(), index); }
        /// Sets `maxDescriptorSetLayoutBindings` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetLayoutBindingsAt(long index, int value) { maxDescriptorSetLayoutBindings(this.segment(), index, value); return this; }

        /// {@return `maxQueryFaultCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxQueryFaultCountAt(long index) { return maxQueryFaultCount(this.segment(), index); }
        /// Sets `maxQueryFaultCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxQueryFaultCountAt(long index, int value) { maxQueryFaultCount(this.segment(), index, value); return this; }

        /// {@return `maxCallbackFaultCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxCallbackFaultCountAt(long index) { return maxCallbackFaultCount(this.segment(), index); }
        /// Sets `maxCallbackFaultCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxCallbackFaultCountAt(long index, int value) { maxCallbackFaultCount(this.segment(), index, value); return this; }

        /// {@return `maxCommandPoolCommandBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxCommandPoolCommandBuffersAt(long index) { return maxCommandPoolCommandBuffers(this.segment(), index); }
        /// Sets `maxCommandPoolCommandBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxCommandPoolCommandBuffersAt(long index, int value) { maxCommandPoolCommandBuffers(this.segment(), index, value); return this; }

        /// {@return `maxCommandBufferSize` at the given index}
        /// @param index the index of the struct buffer
        public long maxCommandBufferSizeAt(long index) { return maxCommandBufferSize(this.segment(), index); }
        /// Sets `maxCommandBufferSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxCommandBufferSizeAt(long index, long value) { maxCommandBufferSize(this.segment(), index, value); return this; }

    }
}
