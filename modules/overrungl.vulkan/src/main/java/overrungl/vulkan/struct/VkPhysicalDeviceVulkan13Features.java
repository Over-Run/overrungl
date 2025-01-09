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
/// ### robustImageAccess
/// [VarHandle][#VH_robustImageAccess] - [Getter][#robustImageAccess()] - [Setter][#robustImageAccess(int)]
/// ### inlineUniformBlock
/// [VarHandle][#VH_inlineUniformBlock] - [Getter][#inlineUniformBlock()] - [Setter][#inlineUniformBlock(int)]
/// ### descriptorBindingInlineUniformBlockUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingInlineUniformBlockUpdateAfterBind] - [Getter][#descriptorBindingInlineUniformBlockUpdateAfterBind()] - [Setter][#descriptorBindingInlineUniformBlockUpdateAfterBind(int)]
/// ### pipelineCreationCacheControl
/// [VarHandle][#VH_pipelineCreationCacheControl] - [Getter][#pipelineCreationCacheControl()] - [Setter][#pipelineCreationCacheControl(int)]
/// ### privateData
/// [VarHandle][#VH_privateData] - [Getter][#privateData()] - [Setter][#privateData(int)]
/// ### shaderDemoteToHelperInvocation
/// [VarHandle][#VH_shaderDemoteToHelperInvocation] - [Getter][#shaderDemoteToHelperInvocation()] - [Setter][#shaderDemoteToHelperInvocation(int)]
/// ### shaderTerminateInvocation
/// [VarHandle][#VH_shaderTerminateInvocation] - [Getter][#shaderTerminateInvocation()] - [Setter][#shaderTerminateInvocation(int)]
/// ### subgroupSizeControl
/// [VarHandle][#VH_subgroupSizeControl] - [Getter][#subgroupSizeControl()] - [Setter][#subgroupSizeControl(int)]
/// ### computeFullSubgroups
/// [VarHandle][#VH_computeFullSubgroups] - [Getter][#computeFullSubgroups()] - [Setter][#computeFullSubgroups(int)]
/// ### synchronization2
/// [VarHandle][#VH_synchronization2] - [Getter][#synchronization2()] - [Setter][#synchronization2(int)]
/// ### textureCompressionASTC_HDR
/// [VarHandle][#VH_textureCompressionASTC_HDR] - [Getter][#textureCompressionASTC_HDR()] - [Setter][#textureCompressionASTC_HDR(int)]
/// ### shaderZeroInitializeWorkgroupMemory
/// [VarHandle][#VH_shaderZeroInitializeWorkgroupMemory] - [Getter][#shaderZeroInitializeWorkgroupMemory()] - [Setter][#shaderZeroInitializeWorkgroupMemory(int)]
/// ### dynamicRendering
/// [VarHandle][#VH_dynamicRendering] - [Getter][#dynamicRendering()] - [Setter][#dynamicRendering(int)]
/// ### shaderIntegerDotProduct
/// [VarHandle][#VH_shaderIntegerDotProduct] - [Getter][#shaderIntegerDotProduct()] - [Setter][#shaderIntegerDotProduct(int)]
/// ### maintenance4
/// [VarHandle][#VH_maintenance4] - [Getter][#maintenance4()] - [Setter][#maintenance4(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkan13Features {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 robustImageAccess;
///     VkBool32 inlineUniformBlock;
///     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
///     VkBool32 pipelineCreationCacheControl;
///     VkBool32 privateData;
///     VkBool32 shaderDemoteToHelperInvocation;
///     VkBool32 shaderTerminateInvocation;
///     VkBool32 subgroupSizeControl;
///     VkBool32 computeFullSubgroups;
///     VkBool32 synchronization2;
///     VkBool32 textureCompressionASTC_HDR;
///     VkBool32 shaderZeroInitializeWorkgroupMemory;
///     VkBool32 dynamicRendering;
///     VkBool32 shaderIntegerDotProduct;
///     VkBool32 maintenance4;
/// } VkPhysicalDeviceVulkan13Features;
/// ```
public final class VkPhysicalDeviceVulkan13Features extends Struct {
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `robustImageAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_robustImageAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustImageAccess"));
    /// The [VarHandle] of `inlineUniformBlock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inlineUniformBlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inlineUniformBlock"));
    /// The [VarHandle] of `descriptorBindingInlineUniformBlockUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
    /// The [VarHandle] of `pipelineCreationCacheControl` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineCreationCacheControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCreationCacheControl"));
    /// The [VarHandle] of `privateData` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_privateData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("privateData"));
    /// The [VarHandle] of `shaderDemoteToHelperInvocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDemoteToHelperInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDemoteToHelperInvocation"));
    /// The [VarHandle] of `shaderTerminateInvocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderTerminateInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTerminateInvocation"));
    /// The [VarHandle] of `subgroupSizeControl` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupSizeControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSizeControl"));
    /// The [VarHandle] of `computeFullSubgroups` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_computeFullSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeFullSubgroups"));
    /// The [VarHandle] of `synchronization2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_synchronization2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("synchronization2"));
    /// The [VarHandle] of `textureCompressionASTC_HDR` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_textureCompressionASTC_HDR = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureCompressionASTC_HDR"));
    /// The [VarHandle] of `shaderZeroInitializeWorkgroupMemory` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderZeroInitializeWorkgroupMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
    /// The [VarHandle] of `dynamicRendering` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dynamicRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRendering"));
    /// The [VarHandle] of `shaderIntegerDotProduct` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderIntegerDotProduct = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderIntegerDotProduct"));
    /// The [VarHandle] of `maintenance4` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maintenance4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance4"));

    /// Creates `VkPhysicalDeviceVulkan13Features` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan13Features(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan13Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Features of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment); }

    /// Creates `VkPhysicalDeviceVulkan13Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Features ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan13Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Features ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVulkan13Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan13Features`
    public static VkPhysicalDeviceVulkan13Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan13Features(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan13Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan13Features`
    public static VkPhysicalDeviceVulkan13Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan13Features(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkan13Features.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkan13Features.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Features.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Features.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Features.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkan13Features.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVulkan13Features.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan13Features.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan13Features.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan13Features.set_pNext(this.segment(), value); return this; }

    /// {@return `robustImageAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_robustImageAccess(MemorySegment segment, long index) { return (int) VH_robustImageAccess.get(segment, 0L, index); }
    /// {@return `robustImageAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_robustImageAccess(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_robustImageAccess(segment, 0L); }
    /// {@return `robustImageAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int robustImageAccessAt(long index) { return VkPhysicalDeviceVulkan13Features.get_robustImageAccess(this.segment(), index); }
    /// {@return `robustImageAccess`}
    public @CType("VkBool32") int robustImageAccess() { return VkPhysicalDeviceVulkan13Features.get_robustImageAccess(this.segment()); }
    /// Sets `robustImageAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustImageAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_robustImageAccess.set(segment, 0L, index, value); }
    /// Sets `robustImageAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustImageAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_robustImageAccess(segment, 0L, value); }
    /// Sets `robustImageAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features robustImageAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_robustImageAccess(this.segment(), index, value); return this; }
    /// Sets `robustImageAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features robustImageAccess(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_robustImageAccess(this.segment(), value); return this; }

    /// {@return `inlineUniformBlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_inlineUniformBlock(MemorySegment segment, long index) { return (int) VH_inlineUniformBlock.get(segment, 0L, index); }
    /// {@return `inlineUniformBlock`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_inlineUniformBlock(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_inlineUniformBlock(segment, 0L); }
    /// {@return `inlineUniformBlock` at the given index}
    /// @param index the index
    public @CType("VkBool32") int inlineUniformBlockAt(long index) { return VkPhysicalDeviceVulkan13Features.get_inlineUniformBlock(this.segment(), index); }
    /// {@return `inlineUniformBlock`}
    public @CType("VkBool32") int inlineUniformBlock() { return VkPhysicalDeviceVulkan13Features.get_inlineUniformBlock(this.segment()); }
    /// Sets `inlineUniformBlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inlineUniformBlock(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_inlineUniformBlock.set(segment, 0L, index, value); }
    /// Sets `inlineUniformBlock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inlineUniformBlock(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_inlineUniformBlock(segment, 0L, value); }
    /// Sets `inlineUniformBlock` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features inlineUniformBlockAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_inlineUniformBlock(this.segment(), index, value); return this; }
    /// Sets `inlineUniformBlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features inlineUniformBlock(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_inlineUniformBlock(this.segment(), value); return this; }

    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingInlineUniformBlockUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_descriptorBindingInlineUniformBlockUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind` at the given index}
    /// @param index the index
    public @CType("VkBool32") int descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index) { return VkPhysicalDeviceVulkan13Features.get_descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), index); }
    /// {@return `descriptorBindingInlineUniformBlockUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingInlineUniformBlockUpdateAfterBind() { return VkPhysicalDeviceVulkan13Features.get_descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingInlineUniformBlockUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_descriptorBindingInlineUniformBlockUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), index, value); return this; }
    /// Sets `descriptorBindingInlineUniformBlockUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_descriptorBindingInlineUniformBlockUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `pipelineCreationCacheControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineCreationCacheControl(MemorySegment segment, long index) { return (int) VH_pipelineCreationCacheControl.get(segment, 0L, index); }
    /// {@return `pipelineCreationCacheControl`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineCreationCacheControl(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_pipelineCreationCacheControl(segment, 0L); }
    /// {@return `pipelineCreationCacheControl` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineCreationCacheControlAt(long index) { return VkPhysicalDeviceVulkan13Features.get_pipelineCreationCacheControl(this.segment(), index); }
    /// {@return `pipelineCreationCacheControl`}
    public @CType("VkBool32") int pipelineCreationCacheControl() { return VkPhysicalDeviceVulkan13Features.get_pipelineCreationCacheControl(this.segment()); }
    /// Sets `pipelineCreationCacheControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineCreationCacheControl(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineCreationCacheControl.set(segment, 0L, index, value); }
    /// Sets `pipelineCreationCacheControl` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineCreationCacheControl(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_pipelineCreationCacheControl(segment, 0L, value); }
    /// Sets `pipelineCreationCacheControl` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControlAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_pipelineCreationCacheControl(this.segment(), index, value); return this; }
    /// Sets `pipelineCreationCacheControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControl(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_pipelineCreationCacheControl(this.segment(), value); return this; }

    /// {@return `privateData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_privateData(MemorySegment segment, long index) { return (int) VH_privateData.get(segment, 0L, index); }
    /// {@return `privateData`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_privateData(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_privateData(segment, 0L); }
    /// {@return `privateData` at the given index}
    /// @param index the index
    public @CType("VkBool32") int privateDataAt(long index) { return VkPhysicalDeviceVulkan13Features.get_privateData(this.segment(), index); }
    /// {@return `privateData`}
    public @CType("VkBool32") int privateData() { return VkPhysicalDeviceVulkan13Features.get_privateData(this.segment()); }
    /// Sets `privateData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_privateData(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_privateData.set(segment, 0L, index, value); }
    /// Sets `privateData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_privateData(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_privateData(segment, 0L, value); }
    /// Sets `privateData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features privateDataAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_privateData(this.segment(), index, value); return this; }
    /// Sets `privateData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features privateData(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_privateData(this.segment(), value); return this; }

    /// {@return `shaderDemoteToHelperInvocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDemoteToHelperInvocation(MemorySegment segment, long index) { return (int) VH_shaderDemoteToHelperInvocation.get(segment, 0L, index); }
    /// {@return `shaderDemoteToHelperInvocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDemoteToHelperInvocation(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_shaderDemoteToHelperInvocation(segment, 0L); }
    /// {@return `shaderDemoteToHelperInvocation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderDemoteToHelperInvocationAt(long index) { return VkPhysicalDeviceVulkan13Features.get_shaderDemoteToHelperInvocation(this.segment(), index); }
    /// {@return `shaderDemoteToHelperInvocation`}
    public @CType("VkBool32") int shaderDemoteToHelperInvocation() { return VkPhysicalDeviceVulkan13Features.get_shaderDemoteToHelperInvocation(this.segment()); }
    /// Sets `shaderDemoteToHelperInvocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDemoteToHelperInvocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDemoteToHelperInvocation.set(segment, 0L, index, value); }
    /// Sets `shaderDemoteToHelperInvocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDemoteToHelperInvocation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderDemoteToHelperInvocation(segment, 0L, value); }
    /// Sets `shaderDemoteToHelperInvocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderDemoteToHelperInvocation(this.segment(), index, value); return this; }
    /// Sets `shaderDemoteToHelperInvocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocation(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderDemoteToHelperInvocation(this.segment(), value); return this; }

    /// {@return `shaderTerminateInvocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderTerminateInvocation(MemorySegment segment, long index) { return (int) VH_shaderTerminateInvocation.get(segment, 0L, index); }
    /// {@return `shaderTerminateInvocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderTerminateInvocation(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_shaderTerminateInvocation(segment, 0L); }
    /// {@return `shaderTerminateInvocation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderTerminateInvocationAt(long index) { return VkPhysicalDeviceVulkan13Features.get_shaderTerminateInvocation(this.segment(), index); }
    /// {@return `shaderTerminateInvocation`}
    public @CType("VkBool32") int shaderTerminateInvocation() { return VkPhysicalDeviceVulkan13Features.get_shaderTerminateInvocation(this.segment()); }
    /// Sets `shaderTerminateInvocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderTerminateInvocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderTerminateInvocation.set(segment, 0L, index, value); }
    /// Sets `shaderTerminateInvocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderTerminateInvocation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderTerminateInvocation(segment, 0L, value); }
    /// Sets `shaderTerminateInvocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderTerminateInvocation(this.segment(), index, value); return this; }
    /// Sets `shaderTerminateInvocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocation(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderTerminateInvocation(this.segment(), value); return this; }

    /// {@return `subgroupSizeControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_subgroupSizeControl(MemorySegment segment, long index) { return (int) VH_subgroupSizeControl.get(segment, 0L, index); }
    /// {@return `subgroupSizeControl`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_subgroupSizeControl(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_subgroupSizeControl(segment, 0L); }
    /// {@return `subgroupSizeControl` at the given index}
    /// @param index the index
    public @CType("VkBool32") int subgroupSizeControlAt(long index) { return VkPhysicalDeviceVulkan13Features.get_subgroupSizeControl(this.segment(), index); }
    /// {@return `subgroupSizeControl`}
    public @CType("VkBool32") int subgroupSizeControl() { return VkPhysicalDeviceVulkan13Features.get_subgroupSizeControl(this.segment()); }
    /// Sets `subgroupSizeControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupSizeControl(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_subgroupSizeControl.set(segment, 0L, index, value); }
    /// Sets `subgroupSizeControl` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupSizeControl(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_subgroupSizeControl(segment, 0L, value); }
    /// Sets `subgroupSizeControl` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features subgroupSizeControlAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_subgroupSizeControl(this.segment(), index, value); return this; }
    /// Sets `subgroupSizeControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features subgroupSizeControl(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_subgroupSizeControl(this.segment(), value); return this; }

    /// {@return `computeFullSubgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_computeFullSubgroups(MemorySegment segment, long index) { return (int) VH_computeFullSubgroups.get(segment, 0L, index); }
    /// {@return `computeFullSubgroups`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_computeFullSubgroups(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_computeFullSubgroups(segment, 0L); }
    /// {@return `computeFullSubgroups` at the given index}
    /// @param index the index
    public @CType("VkBool32") int computeFullSubgroupsAt(long index) { return VkPhysicalDeviceVulkan13Features.get_computeFullSubgroups(this.segment(), index); }
    /// {@return `computeFullSubgroups`}
    public @CType("VkBool32") int computeFullSubgroups() { return VkPhysicalDeviceVulkan13Features.get_computeFullSubgroups(this.segment()); }
    /// Sets `computeFullSubgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computeFullSubgroups(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_computeFullSubgroups.set(segment, 0L, index, value); }
    /// Sets `computeFullSubgroups` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computeFullSubgroups(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_computeFullSubgroups(segment, 0L, value); }
    /// Sets `computeFullSubgroups` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features computeFullSubgroupsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_computeFullSubgroups(this.segment(), index, value); return this; }
    /// Sets `computeFullSubgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features computeFullSubgroups(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_computeFullSubgroups(this.segment(), value); return this; }

    /// {@return `synchronization2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_synchronization2(MemorySegment segment, long index) { return (int) VH_synchronization2.get(segment, 0L, index); }
    /// {@return `synchronization2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_synchronization2(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_synchronization2(segment, 0L); }
    /// {@return `synchronization2` at the given index}
    /// @param index the index
    public @CType("VkBool32") int synchronization2At(long index) { return VkPhysicalDeviceVulkan13Features.get_synchronization2(this.segment(), index); }
    /// {@return `synchronization2`}
    public @CType("VkBool32") int synchronization2() { return VkPhysicalDeviceVulkan13Features.get_synchronization2(this.segment()); }
    /// Sets `synchronization2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_synchronization2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_synchronization2.set(segment, 0L, index, value); }
    /// Sets `synchronization2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_synchronization2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_synchronization2(segment, 0L, value); }
    /// Sets `synchronization2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features synchronization2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_synchronization2(this.segment(), index, value); return this; }
    /// Sets `synchronization2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features synchronization2(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_synchronization2(this.segment(), value); return this; }

    /// {@return `textureCompressionASTC_HDR` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_textureCompressionASTC_HDR(MemorySegment segment, long index) { return (int) VH_textureCompressionASTC_HDR.get(segment, 0L, index); }
    /// {@return `textureCompressionASTC_HDR`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_textureCompressionASTC_HDR(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_textureCompressionASTC_HDR(segment, 0L); }
    /// {@return `textureCompressionASTC_HDR` at the given index}
    /// @param index the index
    public @CType("VkBool32") int textureCompressionASTC_HDRAt(long index) { return VkPhysicalDeviceVulkan13Features.get_textureCompressionASTC_HDR(this.segment(), index); }
    /// {@return `textureCompressionASTC_HDR`}
    public @CType("VkBool32") int textureCompressionASTC_HDR() { return VkPhysicalDeviceVulkan13Features.get_textureCompressionASTC_HDR(this.segment()); }
    /// Sets `textureCompressionASTC_HDR` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_textureCompressionASTC_HDR(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_textureCompressionASTC_HDR.set(segment, 0L, index, value); }
    /// Sets `textureCompressionASTC_HDR` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_textureCompressionASTC_HDR(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_textureCompressionASTC_HDR(segment, 0L, value); }
    /// Sets `textureCompressionASTC_HDR` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDRAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_textureCompressionASTC_HDR(this.segment(), index, value); return this; }
    /// Sets `textureCompressionASTC_HDR` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDR(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_textureCompressionASTC_HDR(this.segment(), value); return this; }

    /// {@return `shaderZeroInitializeWorkgroupMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderZeroInitializeWorkgroupMemory(MemorySegment segment, long index) { return (int) VH_shaderZeroInitializeWorkgroupMemory.get(segment, 0L, index); }
    /// {@return `shaderZeroInitializeWorkgroupMemory`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderZeroInitializeWorkgroupMemory(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_shaderZeroInitializeWorkgroupMemory(segment, 0L); }
    /// {@return `shaderZeroInitializeWorkgroupMemory` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderZeroInitializeWorkgroupMemoryAt(long index) { return VkPhysicalDeviceVulkan13Features.get_shaderZeroInitializeWorkgroupMemory(this.segment(), index); }
    /// {@return `shaderZeroInitializeWorkgroupMemory`}
    public @CType("VkBool32") int shaderZeroInitializeWorkgroupMemory() { return VkPhysicalDeviceVulkan13Features.get_shaderZeroInitializeWorkgroupMemory(this.segment()); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderZeroInitializeWorkgroupMemory(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderZeroInitializeWorkgroupMemory.set(segment, 0L, index, value); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderZeroInitializeWorkgroupMemory(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderZeroInitializeWorkgroupMemory(segment, 0L, value); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemoryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderZeroInitializeWorkgroupMemory(this.segment(), index, value); return this; }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemory(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderZeroInitializeWorkgroupMemory(this.segment(), value); return this; }

    /// {@return `dynamicRendering` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dynamicRendering(MemorySegment segment, long index) { return (int) VH_dynamicRendering.get(segment, 0L, index); }
    /// {@return `dynamicRendering`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dynamicRendering(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_dynamicRendering(segment, 0L); }
    /// {@return `dynamicRendering` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dynamicRenderingAt(long index) { return VkPhysicalDeviceVulkan13Features.get_dynamicRendering(this.segment(), index); }
    /// {@return `dynamicRendering`}
    public @CType("VkBool32") int dynamicRendering() { return VkPhysicalDeviceVulkan13Features.get_dynamicRendering(this.segment()); }
    /// Sets `dynamicRendering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicRendering(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dynamicRendering.set(segment, 0L, index, value); }
    /// Sets `dynamicRendering` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicRendering(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_dynamicRendering(segment, 0L, value); }
    /// Sets `dynamicRendering` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features dynamicRenderingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_dynamicRendering(this.segment(), index, value); return this; }
    /// Sets `dynamicRendering` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features dynamicRendering(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_dynamicRendering(this.segment(), value); return this; }

    /// {@return `shaderIntegerDotProduct` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderIntegerDotProduct(MemorySegment segment, long index) { return (int) VH_shaderIntegerDotProduct.get(segment, 0L, index); }
    /// {@return `shaderIntegerDotProduct`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderIntegerDotProduct(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_shaderIntegerDotProduct(segment, 0L); }
    /// {@return `shaderIntegerDotProduct` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderIntegerDotProductAt(long index) { return VkPhysicalDeviceVulkan13Features.get_shaderIntegerDotProduct(this.segment(), index); }
    /// {@return `shaderIntegerDotProduct`}
    public @CType("VkBool32") int shaderIntegerDotProduct() { return VkPhysicalDeviceVulkan13Features.get_shaderIntegerDotProduct(this.segment()); }
    /// Sets `shaderIntegerDotProduct` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderIntegerDotProduct(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderIntegerDotProduct.set(segment, 0L, index, value); }
    /// Sets `shaderIntegerDotProduct` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderIntegerDotProduct(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderIntegerDotProduct(segment, 0L, value); }
    /// Sets `shaderIntegerDotProduct` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProductAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderIntegerDotProduct(this.segment(), index, value); return this; }
    /// Sets `shaderIntegerDotProduct` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProduct(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_shaderIntegerDotProduct(this.segment(), value); return this; }

    /// {@return `maintenance4` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_maintenance4(MemorySegment segment, long index) { return (int) VH_maintenance4.get(segment, 0L, index); }
    /// {@return `maintenance4`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_maintenance4(MemorySegment segment) { return VkPhysicalDeviceVulkan13Features.get_maintenance4(segment, 0L); }
    /// {@return `maintenance4` at the given index}
    /// @param index the index
    public @CType("VkBool32") int maintenance4At(long index) { return VkPhysicalDeviceVulkan13Features.get_maintenance4(this.segment(), index); }
    /// {@return `maintenance4`}
    public @CType("VkBool32") int maintenance4() { return VkPhysicalDeviceVulkan13Features.get_maintenance4(this.segment()); }
    /// Sets `maintenance4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maintenance4(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_maintenance4.set(segment, 0L, index, value); }
    /// Sets `maintenance4` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maintenance4(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_maintenance4(segment, 0L, value); }
    /// Sets `maintenance4` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features maintenance4At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_maintenance4(this.segment(), index, value); return this; }
    /// Sets `maintenance4` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Features maintenance4(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Features.set_maintenance4(this.segment(), value); return this; }

}
