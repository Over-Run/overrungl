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
package overrungl.vulkan.struct;

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
/// ### deviceNoDynamicHostAllocations
/// [VarHandle][#VH_deviceNoDynamicHostAllocations] - [Getter][#deviceNoDynamicHostAllocations()] - [Setter][#deviceNoDynamicHostAllocations(int)]
/// ### deviceDestroyFreesMemory
/// [VarHandle][#VH_deviceDestroyFreesMemory] - [Getter][#deviceDestroyFreesMemory()] - [Setter][#deviceDestroyFreesMemory(int)]
/// ### commandPoolMultipleCommandBuffersRecording
/// [VarHandle][#VH_commandPoolMultipleCommandBuffersRecording] - [Getter][#commandPoolMultipleCommandBuffersRecording()] - [Setter][#commandPoolMultipleCommandBuffersRecording(int)]
/// ### commandPoolResetCommandBuffer
/// [VarHandle][#VH_commandPoolResetCommandBuffer] - [Getter][#commandPoolResetCommandBuffer()] - [Setter][#commandPoolResetCommandBuffer(int)]
/// ### commandBufferSimultaneousUse
/// [VarHandle][#VH_commandBufferSimultaneousUse] - [Getter][#commandBufferSimultaneousUse()] - [Setter][#commandBufferSimultaneousUse(int)]
/// ### secondaryCommandBufferNullOrImagelessFramebuffer
/// [VarHandle][#VH_secondaryCommandBufferNullOrImagelessFramebuffer] - [Getter][#secondaryCommandBufferNullOrImagelessFramebuffer()] - [Setter][#secondaryCommandBufferNullOrImagelessFramebuffer(int)]
/// ### recycleDescriptorSetMemory
/// [VarHandle][#VH_recycleDescriptorSetMemory] - [Getter][#recycleDescriptorSetMemory()] - [Setter][#recycleDescriptorSetMemory(int)]
/// ### recyclePipelineMemory
/// [VarHandle][#VH_recyclePipelineMemory] - [Getter][#recyclePipelineMemory()] - [Setter][#recyclePipelineMemory(int)]
/// ### maxRenderPassSubpasses
/// [VarHandle][#VH_maxRenderPassSubpasses] - [Getter][#maxRenderPassSubpasses()] - [Setter][#maxRenderPassSubpasses(int)]
/// ### maxRenderPassDependencies
/// [VarHandle][#VH_maxRenderPassDependencies] - [Getter][#maxRenderPassDependencies()] - [Setter][#maxRenderPassDependencies(int)]
/// ### maxSubpassInputAttachments
/// [VarHandle][#VH_maxSubpassInputAttachments] - [Getter][#maxSubpassInputAttachments()] - [Setter][#maxSubpassInputAttachments(int)]
/// ### maxSubpassPreserveAttachments
/// [VarHandle][#VH_maxSubpassPreserveAttachments] - [Getter][#maxSubpassPreserveAttachments()] - [Setter][#maxSubpassPreserveAttachments(int)]
/// ### maxFramebufferAttachments
/// [VarHandle][#VH_maxFramebufferAttachments] - [Getter][#maxFramebufferAttachments()] - [Setter][#maxFramebufferAttachments(int)]
/// ### maxDescriptorSetLayoutBindings
/// [VarHandle][#VH_maxDescriptorSetLayoutBindings] - [Getter][#maxDescriptorSetLayoutBindings()] - [Setter][#maxDescriptorSetLayoutBindings(int)]
/// ### maxQueryFaultCount
/// [VarHandle][#VH_maxQueryFaultCount] - [Getter][#maxQueryFaultCount()] - [Setter][#maxQueryFaultCount(int)]
/// ### maxCallbackFaultCount
/// [VarHandle][#VH_maxCallbackFaultCount] - [Getter][#maxCallbackFaultCount()] - [Setter][#maxCallbackFaultCount(int)]
/// ### maxCommandPoolCommandBuffers
/// [VarHandle][#VH_maxCommandPoolCommandBuffers] - [Getter][#maxCommandPoolCommandBuffers()] - [Setter][#maxCommandPoolCommandBuffers(int)]
/// ### maxCommandBufferSize
/// [VarHandle][#VH_maxCommandBufferSize] - [Getter][#maxCommandBufferSize()] - [Setter][#maxCommandBufferSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkanSC10Properties {
///     VkStructureType sType;
///     void * pNext;
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
/// } VkPhysicalDeviceVulkanSC10Properties;
/// ```
public final class VkPhysicalDeviceVulkanSC10Properties extends Struct {
    /// The struct layout of `VkPhysicalDeviceVulkanSC10Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceNoDynamicHostAllocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceNoDynamicHostAllocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceNoDynamicHostAllocations"));
    /// The [VarHandle] of `deviceDestroyFreesMemory` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceDestroyFreesMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceDestroyFreesMemory"));
    /// The [VarHandle] of `commandPoolMultipleCommandBuffersRecording` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandPoolMultipleCommandBuffersRecording = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolMultipleCommandBuffersRecording"));
    /// The [VarHandle] of `commandPoolResetCommandBuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandPoolResetCommandBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolResetCommandBuffer"));
    /// The [VarHandle] of `commandBufferSimultaneousUse` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandBufferSimultaneousUse = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferSimultaneousUse"));
    /// The [VarHandle] of `secondaryCommandBufferNullOrImagelessFramebuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_secondaryCommandBufferNullOrImagelessFramebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("secondaryCommandBufferNullOrImagelessFramebuffer"));
    /// The [VarHandle] of `recycleDescriptorSetMemory` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_recycleDescriptorSetMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("recycleDescriptorSetMemory"));
    /// The [VarHandle] of `recyclePipelineMemory` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_recyclePipelineMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("recyclePipelineMemory"));
    /// The [VarHandle] of `maxRenderPassSubpasses` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxRenderPassSubpasses = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRenderPassSubpasses"));
    /// The [VarHandle] of `maxRenderPassDependencies` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxRenderPassDependencies = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRenderPassDependencies"));
    /// The [VarHandle] of `maxSubpassInputAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSubpassInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubpassInputAttachments"));
    /// The [VarHandle] of `maxSubpassPreserveAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSubpassPreserveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubpassPreserveAttachments"));
    /// The [VarHandle] of `maxFramebufferAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFramebufferAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferAttachments"));
    /// The [VarHandle] of `maxDescriptorSetLayoutBindings` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetLayoutBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetLayoutBindings"));
    /// The [VarHandle] of `maxQueryFaultCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxQueryFaultCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQueryFaultCount"));
    /// The [VarHandle] of `maxCallbackFaultCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxCallbackFaultCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCallbackFaultCount"));
    /// The [VarHandle] of `maxCommandPoolCommandBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxCommandPoolCommandBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCommandPoolCommandBuffers"));
    /// The [VarHandle] of `maxCommandBufferSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxCommandBufferSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCommandBufferSize"));

    /// Creates `VkPhysicalDeviceVulkanSC10Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkanSC10Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkanSC10Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanSC10Properties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanSC10Properties(segment); }

    /// Creates `VkPhysicalDeviceVulkanSC10Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanSC10Properties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanSC10Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkanSC10Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanSC10Properties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanSC10Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVulkanSC10Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkanSC10Properties`
    public static VkPhysicalDeviceVulkanSC10Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkanSC10Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkanSC10Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkanSC10Properties`
    public static VkPhysicalDeviceVulkanSC10Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkanSC10Properties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkanSC10Properties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkanSC10Properties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkanSC10Properties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkanSC10Properties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVulkanSC10Properties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkanSC10Properties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkanSC10Properties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkanSC10Properties.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceNoDynamicHostAllocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceNoDynamicHostAllocations(MemorySegment segment, long index) { return (int) VH_deviceNoDynamicHostAllocations.get(segment, 0L, index); }
    /// {@return `deviceNoDynamicHostAllocations`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceNoDynamicHostAllocations(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_deviceNoDynamicHostAllocations(segment, 0L); }
    /// {@return `deviceNoDynamicHostAllocations` at the given index}
    /// @param index the index
    public @CType("VkBool32") int deviceNoDynamicHostAllocationsAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_deviceNoDynamicHostAllocations(this.segment(), index); }
    /// {@return `deviceNoDynamicHostAllocations`}
    public @CType("VkBool32") int deviceNoDynamicHostAllocations() { return VkPhysicalDeviceVulkanSC10Properties.get_deviceNoDynamicHostAllocations(this.segment()); }
    /// Sets `deviceNoDynamicHostAllocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceNoDynamicHostAllocations(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceNoDynamicHostAllocations.set(segment, 0L, index, value); }
    /// Sets `deviceNoDynamicHostAllocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceNoDynamicHostAllocations(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_deviceNoDynamicHostAllocations(segment, 0L, value); }
    /// Sets `deviceNoDynamicHostAllocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties deviceNoDynamicHostAllocationsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_deviceNoDynamicHostAllocations(this.segment(), index, value); return this; }
    /// Sets `deviceNoDynamicHostAllocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties deviceNoDynamicHostAllocations(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_deviceNoDynamicHostAllocations(this.segment(), value); return this; }

    /// {@return `deviceDestroyFreesMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceDestroyFreesMemory(MemorySegment segment, long index) { return (int) VH_deviceDestroyFreesMemory.get(segment, 0L, index); }
    /// {@return `deviceDestroyFreesMemory`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceDestroyFreesMemory(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_deviceDestroyFreesMemory(segment, 0L); }
    /// {@return `deviceDestroyFreesMemory` at the given index}
    /// @param index the index
    public @CType("VkBool32") int deviceDestroyFreesMemoryAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_deviceDestroyFreesMemory(this.segment(), index); }
    /// {@return `deviceDestroyFreesMemory`}
    public @CType("VkBool32") int deviceDestroyFreesMemory() { return VkPhysicalDeviceVulkanSC10Properties.get_deviceDestroyFreesMemory(this.segment()); }
    /// Sets `deviceDestroyFreesMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceDestroyFreesMemory(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceDestroyFreesMemory.set(segment, 0L, index, value); }
    /// Sets `deviceDestroyFreesMemory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceDestroyFreesMemory(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_deviceDestroyFreesMemory(segment, 0L, value); }
    /// Sets `deviceDestroyFreesMemory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties deviceDestroyFreesMemoryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_deviceDestroyFreesMemory(this.segment(), index, value); return this; }
    /// Sets `deviceDestroyFreesMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties deviceDestroyFreesMemory(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_deviceDestroyFreesMemory(this.segment(), value); return this; }

    /// {@return `commandPoolMultipleCommandBuffersRecording` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_commandPoolMultipleCommandBuffersRecording(MemorySegment segment, long index) { return (int) VH_commandPoolMultipleCommandBuffersRecording.get(segment, 0L, index); }
    /// {@return `commandPoolMultipleCommandBuffersRecording`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_commandPoolMultipleCommandBuffersRecording(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_commandPoolMultipleCommandBuffersRecording(segment, 0L); }
    /// {@return `commandPoolMultipleCommandBuffersRecording` at the given index}
    /// @param index the index
    public @CType("VkBool32") int commandPoolMultipleCommandBuffersRecordingAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_commandPoolMultipleCommandBuffersRecording(this.segment(), index); }
    /// {@return `commandPoolMultipleCommandBuffersRecording`}
    public @CType("VkBool32") int commandPoolMultipleCommandBuffersRecording() { return VkPhysicalDeviceVulkanSC10Properties.get_commandPoolMultipleCommandBuffersRecording(this.segment()); }
    /// Sets `commandPoolMultipleCommandBuffersRecording` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandPoolMultipleCommandBuffersRecording(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_commandPoolMultipleCommandBuffersRecording.set(segment, 0L, index, value); }
    /// Sets `commandPoolMultipleCommandBuffersRecording` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandPoolMultipleCommandBuffersRecording(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandPoolMultipleCommandBuffersRecording(segment, 0L, value); }
    /// Sets `commandPoolMultipleCommandBuffersRecording` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandPoolMultipleCommandBuffersRecordingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandPoolMultipleCommandBuffersRecording(this.segment(), index, value); return this; }
    /// Sets `commandPoolMultipleCommandBuffersRecording` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandPoolMultipleCommandBuffersRecording(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandPoolMultipleCommandBuffersRecording(this.segment(), value); return this; }

    /// {@return `commandPoolResetCommandBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_commandPoolResetCommandBuffer(MemorySegment segment, long index) { return (int) VH_commandPoolResetCommandBuffer.get(segment, 0L, index); }
    /// {@return `commandPoolResetCommandBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_commandPoolResetCommandBuffer(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_commandPoolResetCommandBuffer(segment, 0L); }
    /// {@return `commandPoolResetCommandBuffer` at the given index}
    /// @param index the index
    public @CType("VkBool32") int commandPoolResetCommandBufferAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_commandPoolResetCommandBuffer(this.segment(), index); }
    /// {@return `commandPoolResetCommandBuffer`}
    public @CType("VkBool32") int commandPoolResetCommandBuffer() { return VkPhysicalDeviceVulkanSC10Properties.get_commandPoolResetCommandBuffer(this.segment()); }
    /// Sets `commandPoolResetCommandBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandPoolResetCommandBuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_commandPoolResetCommandBuffer.set(segment, 0L, index, value); }
    /// Sets `commandPoolResetCommandBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandPoolResetCommandBuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandPoolResetCommandBuffer(segment, 0L, value); }
    /// Sets `commandPoolResetCommandBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandPoolResetCommandBufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandPoolResetCommandBuffer(this.segment(), index, value); return this; }
    /// Sets `commandPoolResetCommandBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandPoolResetCommandBuffer(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandPoolResetCommandBuffer(this.segment(), value); return this; }

    /// {@return `commandBufferSimultaneousUse` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_commandBufferSimultaneousUse(MemorySegment segment, long index) { return (int) VH_commandBufferSimultaneousUse.get(segment, 0L, index); }
    /// {@return `commandBufferSimultaneousUse`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_commandBufferSimultaneousUse(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_commandBufferSimultaneousUse(segment, 0L); }
    /// {@return `commandBufferSimultaneousUse` at the given index}
    /// @param index the index
    public @CType("VkBool32") int commandBufferSimultaneousUseAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_commandBufferSimultaneousUse(this.segment(), index); }
    /// {@return `commandBufferSimultaneousUse`}
    public @CType("VkBool32") int commandBufferSimultaneousUse() { return VkPhysicalDeviceVulkanSC10Properties.get_commandBufferSimultaneousUse(this.segment()); }
    /// Sets `commandBufferSimultaneousUse` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBufferSimultaneousUse(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_commandBufferSimultaneousUse.set(segment, 0L, index, value); }
    /// Sets `commandBufferSimultaneousUse` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBufferSimultaneousUse(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandBufferSimultaneousUse(segment, 0L, value); }
    /// Sets `commandBufferSimultaneousUse` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandBufferSimultaneousUseAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandBufferSimultaneousUse(this.segment(), index, value); return this; }
    /// Sets `commandBufferSimultaneousUse` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties commandBufferSimultaneousUse(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_commandBufferSimultaneousUse(this.segment(), value); return this; }

    /// {@return `secondaryCommandBufferNullOrImagelessFramebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_secondaryCommandBufferNullOrImagelessFramebuffer(MemorySegment segment, long index) { return (int) VH_secondaryCommandBufferNullOrImagelessFramebuffer.get(segment, 0L, index); }
    /// {@return `secondaryCommandBufferNullOrImagelessFramebuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_secondaryCommandBufferNullOrImagelessFramebuffer(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_secondaryCommandBufferNullOrImagelessFramebuffer(segment, 0L); }
    /// {@return `secondaryCommandBufferNullOrImagelessFramebuffer` at the given index}
    /// @param index the index
    public @CType("VkBool32") int secondaryCommandBufferNullOrImagelessFramebufferAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_secondaryCommandBufferNullOrImagelessFramebuffer(this.segment(), index); }
    /// {@return `secondaryCommandBufferNullOrImagelessFramebuffer`}
    public @CType("VkBool32") int secondaryCommandBufferNullOrImagelessFramebuffer() { return VkPhysicalDeviceVulkanSC10Properties.get_secondaryCommandBufferNullOrImagelessFramebuffer(this.segment()); }
    /// Sets `secondaryCommandBufferNullOrImagelessFramebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_secondaryCommandBufferNullOrImagelessFramebuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_secondaryCommandBufferNullOrImagelessFramebuffer.set(segment, 0L, index, value); }
    /// Sets `secondaryCommandBufferNullOrImagelessFramebuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_secondaryCommandBufferNullOrImagelessFramebuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_secondaryCommandBufferNullOrImagelessFramebuffer(segment, 0L, value); }
    /// Sets `secondaryCommandBufferNullOrImagelessFramebuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties secondaryCommandBufferNullOrImagelessFramebufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_secondaryCommandBufferNullOrImagelessFramebuffer(this.segment(), index, value); return this; }
    /// Sets `secondaryCommandBufferNullOrImagelessFramebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties secondaryCommandBufferNullOrImagelessFramebuffer(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_secondaryCommandBufferNullOrImagelessFramebuffer(this.segment(), value); return this; }

    /// {@return `recycleDescriptorSetMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_recycleDescriptorSetMemory(MemorySegment segment, long index) { return (int) VH_recycleDescriptorSetMemory.get(segment, 0L, index); }
    /// {@return `recycleDescriptorSetMemory`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_recycleDescriptorSetMemory(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_recycleDescriptorSetMemory(segment, 0L); }
    /// {@return `recycleDescriptorSetMemory` at the given index}
    /// @param index the index
    public @CType("VkBool32") int recycleDescriptorSetMemoryAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_recycleDescriptorSetMemory(this.segment(), index); }
    /// {@return `recycleDescriptorSetMemory`}
    public @CType("VkBool32") int recycleDescriptorSetMemory() { return VkPhysicalDeviceVulkanSC10Properties.get_recycleDescriptorSetMemory(this.segment()); }
    /// Sets `recycleDescriptorSetMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_recycleDescriptorSetMemory(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_recycleDescriptorSetMemory.set(segment, 0L, index, value); }
    /// Sets `recycleDescriptorSetMemory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_recycleDescriptorSetMemory(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_recycleDescriptorSetMemory(segment, 0L, value); }
    /// Sets `recycleDescriptorSetMemory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties recycleDescriptorSetMemoryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_recycleDescriptorSetMemory(this.segment(), index, value); return this; }
    /// Sets `recycleDescriptorSetMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties recycleDescriptorSetMemory(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_recycleDescriptorSetMemory(this.segment(), value); return this; }

    /// {@return `recyclePipelineMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_recyclePipelineMemory(MemorySegment segment, long index) { return (int) VH_recyclePipelineMemory.get(segment, 0L, index); }
    /// {@return `recyclePipelineMemory`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_recyclePipelineMemory(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_recyclePipelineMemory(segment, 0L); }
    /// {@return `recyclePipelineMemory` at the given index}
    /// @param index the index
    public @CType("VkBool32") int recyclePipelineMemoryAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_recyclePipelineMemory(this.segment(), index); }
    /// {@return `recyclePipelineMemory`}
    public @CType("VkBool32") int recyclePipelineMemory() { return VkPhysicalDeviceVulkanSC10Properties.get_recyclePipelineMemory(this.segment()); }
    /// Sets `recyclePipelineMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_recyclePipelineMemory(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_recyclePipelineMemory.set(segment, 0L, index, value); }
    /// Sets `recyclePipelineMemory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_recyclePipelineMemory(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_recyclePipelineMemory(segment, 0L, value); }
    /// Sets `recyclePipelineMemory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties recyclePipelineMemoryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_recyclePipelineMemory(this.segment(), index, value); return this; }
    /// Sets `recyclePipelineMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties recyclePipelineMemory(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanSC10Properties.set_recyclePipelineMemory(this.segment(), value); return this; }

    /// {@return `maxRenderPassSubpasses` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxRenderPassSubpasses(MemorySegment segment, long index) { return (int) VH_maxRenderPassSubpasses.get(segment, 0L, index); }
    /// {@return `maxRenderPassSubpasses`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxRenderPassSubpasses(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxRenderPassSubpasses(segment, 0L); }
    /// {@return `maxRenderPassSubpasses` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxRenderPassSubpassesAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxRenderPassSubpasses(this.segment(), index); }
    /// {@return `maxRenderPassSubpasses`}
    public @CType("uint32_t") int maxRenderPassSubpasses() { return VkPhysicalDeviceVulkanSC10Properties.get_maxRenderPassSubpasses(this.segment()); }
    /// Sets `maxRenderPassSubpasses` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxRenderPassSubpasses(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxRenderPassSubpasses.set(segment, 0L, index, value); }
    /// Sets `maxRenderPassSubpasses` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxRenderPassSubpasses(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxRenderPassSubpasses(segment, 0L, value); }
    /// Sets `maxRenderPassSubpasses` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxRenderPassSubpassesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxRenderPassSubpasses(this.segment(), index, value); return this; }
    /// Sets `maxRenderPassSubpasses` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxRenderPassSubpasses(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxRenderPassSubpasses(this.segment(), value); return this; }

    /// {@return `maxRenderPassDependencies` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxRenderPassDependencies(MemorySegment segment, long index) { return (int) VH_maxRenderPassDependencies.get(segment, 0L, index); }
    /// {@return `maxRenderPassDependencies`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxRenderPassDependencies(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxRenderPassDependencies(segment, 0L); }
    /// {@return `maxRenderPassDependencies` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxRenderPassDependenciesAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxRenderPassDependencies(this.segment(), index); }
    /// {@return `maxRenderPassDependencies`}
    public @CType("uint32_t") int maxRenderPassDependencies() { return VkPhysicalDeviceVulkanSC10Properties.get_maxRenderPassDependencies(this.segment()); }
    /// Sets `maxRenderPassDependencies` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxRenderPassDependencies(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxRenderPassDependencies.set(segment, 0L, index, value); }
    /// Sets `maxRenderPassDependencies` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxRenderPassDependencies(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxRenderPassDependencies(segment, 0L, value); }
    /// Sets `maxRenderPassDependencies` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxRenderPassDependenciesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxRenderPassDependencies(this.segment(), index, value); return this; }
    /// Sets `maxRenderPassDependencies` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxRenderPassDependencies(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxRenderPassDependencies(this.segment(), value); return this; }

    /// {@return `maxSubpassInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSubpassInputAttachments(MemorySegment segment, long index) { return (int) VH_maxSubpassInputAttachments.get(segment, 0L, index); }
    /// {@return `maxSubpassInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSubpassInputAttachments(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxSubpassInputAttachments(segment, 0L); }
    /// {@return `maxSubpassInputAttachments` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSubpassInputAttachmentsAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxSubpassInputAttachments(this.segment(), index); }
    /// {@return `maxSubpassInputAttachments`}
    public @CType("uint32_t") int maxSubpassInputAttachments() { return VkPhysicalDeviceVulkanSC10Properties.get_maxSubpassInputAttachments(this.segment()); }
    /// Sets `maxSubpassInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSubpassInputAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSubpassInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxSubpassInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSubpassInputAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxSubpassInputAttachments(segment, 0L, value); }
    /// Sets `maxSubpassInputAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxSubpassInputAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxSubpassInputAttachments(this.segment(), index, value); return this; }
    /// Sets `maxSubpassInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxSubpassInputAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxSubpassInputAttachments(this.segment(), value); return this; }

    /// {@return `maxSubpassPreserveAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSubpassPreserveAttachments(MemorySegment segment, long index) { return (int) VH_maxSubpassPreserveAttachments.get(segment, 0L, index); }
    /// {@return `maxSubpassPreserveAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSubpassPreserveAttachments(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxSubpassPreserveAttachments(segment, 0L); }
    /// {@return `maxSubpassPreserveAttachments` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSubpassPreserveAttachmentsAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxSubpassPreserveAttachments(this.segment(), index); }
    /// {@return `maxSubpassPreserveAttachments`}
    public @CType("uint32_t") int maxSubpassPreserveAttachments() { return VkPhysicalDeviceVulkanSC10Properties.get_maxSubpassPreserveAttachments(this.segment()); }
    /// Sets `maxSubpassPreserveAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSubpassPreserveAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSubpassPreserveAttachments.set(segment, 0L, index, value); }
    /// Sets `maxSubpassPreserveAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSubpassPreserveAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxSubpassPreserveAttachments(segment, 0L, value); }
    /// Sets `maxSubpassPreserveAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxSubpassPreserveAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxSubpassPreserveAttachments(this.segment(), index, value); return this; }
    /// Sets `maxSubpassPreserveAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxSubpassPreserveAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxSubpassPreserveAttachments(this.segment(), value); return this; }

    /// {@return `maxFramebufferAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFramebufferAttachments(MemorySegment segment, long index) { return (int) VH_maxFramebufferAttachments.get(segment, 0L, index); }
    /// {@return `maxFramebufferAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFramebufferAttachments(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxFramebufferAttachments(segment, 0L); }
    /// {@return `maxFramebufferAttachments` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxFramebufferAttachmentsAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxFramebufferAttachments(this.segment(), index); }
    /// {@return `maxFramebufferAttachments`}
    public @CType("uint32_t") int maxFramebufferAttachments() { return VkPhysicalDeviceVulkanSC10Properties.get_maxFramebufferAttachments(this.segment()); }
    /// Sets `maxFramebufferAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFramebufferAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFramebufferAttachments.set(segment, 0L, index, value); }
    /// Sets `maxFramebufferAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFramebufferAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxFramebufferAttachments(segment, 0L, value); }
    /// Sets `maxFramebufferAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxFramebufferAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxFramebufferAttachments(this.segment(), index, value); return this; }
    /// Sets `maxFramebufferAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxFramebufferAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxFramebufferAttachments(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetLayoutBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetLayoutBindings(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetLayoutBindings.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetLayoutBindings`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetLayoutBindings(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxDescriptorSetLayoutBindings(segment, 0L); }
    /// {@return `maxDescriptorSetLayoutBindings` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetLayoutBindingsAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxDescriptorSetLayoutBindings(this.segment(), index); }
    /// {@return `maxDescriptorSetLayoutBindings`}
    public @CType("uint32_t") int maxDescriptorSetLayoutBindings() { return VkPhysicalDeviceVulkanSC10Properties.get_maxDescriptorSetLayoutBindings(this.segment()); }
    /// Sets `maxDescriptorSetLayoutBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetLayoutBindings(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetLayoutBindings.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetLayoutBindings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetLayoutBindings(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxDescriptorSetLayoutBindings(segment, 0L, value); }
    /// Sets `maxDescriptorSetLayoutBindings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxDescriptorSetLayoutBindingsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxDescriptorSetLayoutBindings(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetLayoutBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxDescriptorSetLayoutBindings(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxDescriptorSetLayoutBindings(this.segment(), value); return this; }

    /// {@return `maxQueryFaultCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxQueryFaultCount(MemorySegment segment, long index) { return (int) VH_maxQueryFaultCount.get(segment, 0L, index); }
    /// {@return `maxQueryFaultCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxQueryFaultCount(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxQueryFaultCount(segment, 0L); }
    /// {@return `maxQueryFaultCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxQueryFaultCountAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxQueryFaultCount(this.segment(), index); }
    /// {@return `maxQueryFaultCount`}
    public @CType("uint32_t") int maxQueryFaultCount() { return VkPhysicalDeviceVulkanSC10Properties.get_maxQueryFaultCount(this.segment()); }
    /// Sets `maxQueryFaultCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQueryFaultCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxQueryFaultCount.set(segment, 0L, index, value); }
    /// Sets `maxQueryFaultCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQueryFaultCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxQueryFaultCount(segment, 0L, value); }
    /// Sets `maxQueryFaultCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxQueryFaultCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxQueryFaultCount(this.segment(), index, value); return this; }
    /// Sets `maxQueryFaultCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxQueryFaultCount(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxQueryFaultCount(this.segment(), value); return this; }

    /// {@return `maxCallbackFaultCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxCallbackFaultCount(MemorySegment segment, long index) { return (int) VH_maxCallbackFaultCount.get(segment, 0L, index); }
    /// {@return `maxCallbackFaultCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxCallbackFaultCount(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxCallbackFaultCount(segment, 0L); }
    /// {@return `maxCallbackFaultCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxCallbackFaultCountAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxCallbackFaultCount(this.segment(), index); }
    /// {@return `maxCallbackFaultCount`}
    public @CType("uint32_t") int maxCallbackFaultCount() { return VkPhysicalDeviceVulkanSC10Properties.get_maxCallbackFaultCount(this.segment()); }
    /// Sets `maxCallbackFaultCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCallbackFaultCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxCallbackFaultCount.set(segment, 0L, index, value); }
    /// Sets `maxCallbackFaultCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCallbackFaultCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCallbackFaultCount(segment, 0L, value); }
    /// Sets `maxCallbackFaultCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCallbackFaultCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCallbackFaultCount(this.segment(), index, value); return this; }
    /// Sets `maxCallbackFaultCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCallbackFaultCount(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCallbackFaultCount(this.segment(), value); return this; }

    /// {@return `maxCommandPoolCommandBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxCommandPoolCommandBuffers(MemorySegment segment, long index) { return (int) VH_maxCommandPoolCommandBuffers.get(segment, 0L, index); }
    /// {@return `maxCommandPoolCommandBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxCommandPoolCommandBuffers(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxCommandPoolCommandBuffers(segment, 0L); }
    /// {@return `maxCommandPoolCommandBuffers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxCommandPoolCommandBuffersAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxCommandPoolCommandBuffers(this.segment(), index); }
    /// {@return `maxCommandPoolCommandBuffers`}
    public @CType("uint32_t") int maxCommandPoolCommandBuffers() { return VkPhysicalDeviceVulkanSC10Properties.get_maxCommandPoolCommandBuffers(this.segment()); }
    /// Sets `maxCommandPoolCommandBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCommandPoolCommandBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxCommandPoolCommandBuffers.set(segment, 0L, index, value); }
    /// Sets `maxCommandPoolCommandBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCommandPoolCommandBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCommandPoolCommandBuffers(segment, 0L, value); }
    /// Sets `maxCommandPoolCommandBuffers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCommandPoolCommandBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCommandPoolCommandBuffers(this.segment(), index, value); return this; }
    /// Sets `maxCommandPoolCommandBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCommandPoolCommandBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCommandPoolCommandBuffers(this.segment(), value); return this; }

    /// {@return `maxCommandBufferSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxCommandBufferSize(MemorySegment segment, long index) { return (long) VH_maxCommandBufferSize.get(segment, 0L, index); }
    /// {@return `maxCommandBufferSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxCommandBufferSize(MemorySegment segment) { return VkPhysicalDeviceVulkanSC10Properties.get_maxCommandBufferSize(segment, 0L); }
    /// {@return `maxCommandBufferSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long maxCommandBufferSizeAt(long index) { return VkPhysicalDeviceVulkanSC10Properties.get_maxCommandBufferSize(this.segment(), index); }
    /// {@return `maxCommandBufferSize`}
    public @CType("VkDeviceSize") long maxCommandBufferSize() { return VkPhysicalDeviceVulkanSC10Properties.get_maxCommandBufferSize(this.segment()); }
    /// Sets `maxCommandBufferSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCommandBufferSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxCommandBufferSize.set(segment, 0L, index, value); }
    /// Sets `maxCommandBufferSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCommandBufferSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCommandBufferSize(segment, 0L, value); }
    /// Sets `maxCommandBufferSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCommandBufferSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCommandBufferSize(this.segment(), index, value); return this; }
    /// Sets `maxCommandBufferSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Properties maxCommandBufferSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkanSC10Properties.set_maxCommandBufferSize(this.segment(), value); return this; }

}
