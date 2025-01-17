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
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK11.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### deviceUUID
/// [Byte offset][#OFFSET_deviceUUID] - [Memory layout][#ML_deviceUUID] - [Getter][#deviceUUID()] - [Setter][#deviceUUID(java.lang.foreign.MemorySegment)]
/// ### driverUUID
/// [Byte offset][#OFFSET_driverUUID] - [Memory layout][#ML_driverUUID] - [Getter][#driverUUID()] - [Setter][#driverUUID(java.lang.foreign.MemorySegment)]
/// ### deviceLUID
/// [Byte offset][#OFFSET_deviceLUID] - [Memory layout][#ML_deviceLUID] - [Getter][#deviceLUID()] - [Setter][#deviceLUID(java.lang.foreign.MemorySegment)]
/// ### deviceNodeMask
/// [VarHandle][#VH_deviceNodeMask] - [Getter][#deviceNodeMask()] - [Setter][#deviceNodeMask(int)]
/// ### deviceLUIDValid
/// [VarHandle][#VH_deviceLUIDValid] - [Getter][#deviceLUIDValid()] - [Setter][#deviceLUIDValid(int)]
/// ### subgroupSize
/// [VarHandle][#VH_subgroupSize] - [Getter][#subgroupSize()] - [Setter][#subgroupSize(int)]
/// ### subgroupSupportedStages
/// [VarHandle][#VH_subgroupSupportedStages] - [Getter][#subgroupSupportedStages()] - [Setter][#subgroupSupportedStages(int)]
/// ### subgroupSupportedOperations
/// [VarHandle][#VH_subgroupSupportedOperations] - [Getter][#subgroupSupportedOperations()] - [Setter][#subgroupSupportedOperations(int)]
/// ### subgroupQuadOperationsInAllStages
/// [VarHandle][#VH_subgroupQuadOperationsInAllStages] - [Getter][#subgroupQuadOperationsInAllStages()] - [Setter][#subgroupQuadOperationsInAllStages(int)]
/// ### pointClippingBehavior
/// [VarHandle][#VH_pointClippingBehavior] - [Getter][#pointClippingBehavior()] - [Setter][#pointClippingBehavior(int)]
/// ### maxMultiviewViewCount
/// [VarHandle][#VH_maxMultiviewViewCount] - [Getter][#maxMultiviewViewCount()] - [Setter][#maxMultiviewViewCount(int)]
/// ### maxMultiviewInstanceIndex
/// [VarHandle][#VH_maxMultiviewInstanceIndex] - [Getter][#maxMultiviewInstanceIndex()] - [Setter][#maxMultiviewInstanceIndex(int)]
/// ### protectedNoFault
/// [VarHandle][#VH_protectedNoFault] - [Getter][#protectedNoFault()] - [Setter][#protectedNoFault(int)]
/// ### maxPerSetDescriptors
/// [VarHandle][#VH_maxPerSetDescriptors] - [Getter][#maxPerSetDescriptors()] - [Setter][#maxPerSetDescriptors(int)]
/// ### maxMemoryAllocationSize
/// [VarHandle][#VH_maxMemoryAllocationSize] - [Getter][#maxMemoryAllocationSize()] - [Setter][#maxMemoryAllocationSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkan11Properties {
///     VkStructureType sType;
///     void * pNext;
///     uint8_t[VK_UUID_SIZE] deviceUUID;
///     uint8_t[VK_UUID_SIZE] driverUUID;
///     uint8_t[VK_LUID_SIZE] deviceLUID;
///     uint32_t deviceNodeMask;
///     VkBool32 deviceLUIDValid;
///     uint32_t subgroupSize;
///     VkShaderStageFlags subgroupSupportedStages;
///     VkSubgroupFeatureFlags subgroupSupportedOperations;
///     VkBool32 subgroupQuadOperationsInAllStages;
///     VkPointClippingBehavior pointClippingBehavior;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
///     VkBool32 protectedNoFault;
///     uint32_t maxPerSetDescriptors;
///     VkDeviceSize maxMemoryAllocationSize;
/// } VkPhysicalDeviceVulkan11Properties;
/// ```
public sealed class VkPhysicalDeviceVulkan11Properties extends Struct {
    /// The struct layout of `VkPhysicalDeviceVulkan11Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(VK_LUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid"),
        ValueLayout.JAVA_INT.withName("subgroupSize"),
        ValueLayout.JAVA_INT.withName("subgroupSupportedStages"),
        ValueLayout.JAVA_INT.withName("subgroupSupportedOperations"),
        ValueLayout.JAVA_INT.withName("subgroupQuadOperationsInAllStages"),
        ValueLayout.JAVA_INT.withName("pointClippingBehavior"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex"),
        ValueLayout.JAVA_INT.withName("protectedNoFault"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `deviceUUID`.
    public static final long OFFSET_deviceUUID = LAYOUT.byteOffset(PathElement.groupElement("deviceUUID"));
    /// The memory layout of `deviceUUID`.
    public static final MemoryLayout ML_deviceUUID = LAYOUT.select(PathElement.groupElement("deviceUUID"));
    /// The byte offset of `driverUUID`.
    public static final long OFFSET_driverUUID = LAYOUT.byteOffset(PathElement.groupElement("driverUUID"));
    /// The memory layout of `driverUUID`.
    public static final MemoryLayout ML_driverUUID = LAYOUT.select(PathElement.groupElement("driverUUID"));
    /// The byte offset of `deviceLUID`.
    public static final long OFFSET_deviceLUID = LAYOUT.byteOffset(PathElement.groupElement("deviceLUID"));
    /// The memory layout of `deviceLUID`.
    public static final MemoryLayout ML_deviceLUID = LAYOUT.select(PathElement.groupElement("deviceLUID"));
    /// The [VarHandle] of `deviceNodeMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceNodeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceNodeMask"));
    /// The [VarHandle] of `deviceLUIDValid` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceLUIDValid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUIDValid"));
    /// The [VarHandle] of `subgroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSize"));
    /// The [VarHandle] of `subgroupSupportedStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupSupportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSupportedStages"));
    /// The [VarHandle] of `subgroupSupportedOperations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupSupportedOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSupportedOperations"));
    /// The [VarHandle] of `subgroupQuadOperationsInAllStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupQuadOperationsInAllStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
    /// The [VarHandle] of `pointClippingBehavior` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pointClippingBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointClippingBehavior"));
    /// The [VarHandle] of `maxMultiviewViewCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewViewCount"));
    /// The [VarHandle] of `maxMultiviewInstanceIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMultiviewInstanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewInstanceIndex"));
    /// The [VarHandle] of `protectedNoFault` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_protectedNoFault = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedNoFault"));
    /// The [VarHandle] of `maxPerSetDescriptors` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerSetDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerSetDescriptors"));
    /// The [VarHandle] of `maxMemoryAllocationSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxMemoryAllocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationSize"));

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan11Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Properties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Properties(segment); }

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Properties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVulkan11Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan11Properties`
    public static VkPhysicalDeviceVulkan11Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan11Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan11Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan11Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVulkan11Properties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan11Properties`
    public static VkPhysicalDeviceVulkan11Properties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment deviceUUID, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment driverUUID, @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment deviceLUID, @CType("uint32_t") int deviceNodeMask, @CType("VkBool32") int deviceLUIDValid, @CType("uint32_t") int subgroupSize, @CType("VkShaderStageFlags") int subgroupSupportedStages, @CType("VkSubgroupFeatureFlags") int subgroupSupportedOperations, @CType("VkBool32") int subgroupQuadOperationsInAllStages, @CType("VkPointClippingBehavior") int pointClippingBehavior, @CType("uint32_t") int maxMultiviewViewCount, @CType("uint32_t") int maxMultiviewInstanceIndex, @CType("VkBool32") int protectedNoFault, @CType("uint32_t") int maxPerSetDescriptors, @CType("VkDeviceSize") long maxMemoryAllocationSize) { return alloc(allocator).sType(sType).pNext(pNext).deviceUUID(deviceUUID).driverUUID(driverUUID).deviceLUID(deviceLUID).deviceNodeMask(deviceNodeMask).deviceLUIDValid(deviceLUIDValid).subgroupSize(subgroupSize).subgroupSupportedStages(subgroupSupportedStages).subgroupSupportedOperations(subgroupSupportedOperations).subgroupQuadOperationsInAllStages(subgroupQuadOperationsInAllStages).pointClippingBehavior(pointClippingBehavior).maxMultiviewViewCount(maxMultiviewViewCount).maxMultiviewInstanceIndex(maxMultiviewInstanceIndex).protectedNoFault(protectedNoFault).maxPerSetDescriptors(maxPerSetDescriptors).maxMemoryAllocationSize(maxMemoryAllocationSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties copyFrom(VkPhysicalDeviceVulkan11Properties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkan11Properties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Properties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Properties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVulkan11Properties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_deviceUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceUUID, index), ML_deviceUUID); }
    /// {@return `deviceUUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_deviceUUID(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_deviceUUID(segment, 0L); }
    /// {@return `deviceUUID`}
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment deviceUUID() { return VkPhysicalDeviceVulkan11Properties.get_deviceUUID(this.segment()); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceUUID(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceUUID, index), ML_deviceUUID.byteSize()); }
    /// Sets `deviceUUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceUUID(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_deviceUUID(segment, 0L, value); }
    /// Sets `deviceUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceUUID(@CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_deviceUUID(this.segment(), value); return this; }

    /// {@return `driverUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_driverUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverUUID, index), ML_driverUUID); }
    /// {@return `driverUUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_driverUUID(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_driverUUID(segment, 0L); }
    /// {@return `driverUUID`}
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment driverUUID() { return VkPhysicalDeviceVulkan11Properties.get_driverUUID(this.segment()); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverUUID(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverUUID, index), ML_driverUUID.byteSize()); }
    /// Sets `driverUUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverUUID(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_driverUUID(segment, 0L, value); }
    /// Sets `driverUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties driverUUID(@CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_driverUUID(this.segment(), value); return this; }

    /// {@return `deviceLUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment get_deviceLUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceLUID, index), ML_deviceLUID); }
    /// {@return `deviceLUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment get_deviceLUID(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_deviceLUID(segment, 0L); }
    /// {@return `deviceLUID`}
    public @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment deviceLUID() { return VkPhysicalDeviceVulkan11Properties.get_deviceLUID(this.segment()); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceLUID(MemorySegment segment, long index, @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceLUID, index), ML_deviceLUID.byteSize()); }
    /// Sets `deviceLUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceLUID(MemorySegment segment, @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_deviceLUID(segment, 0L, value); }
    /// Sets `deviceLUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceLUID(@CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_deviceLUID(this.segment(), value); return this; }

    /// {@return `deviceNodeMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceNodeMask(MemorySegment segment, long index) { return (int) VH_deviceNodeMask.get(segment, 0L, index); }
    /// {@return `deviceNodeMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceNodeMask(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_deviceNodeMask(segment, 0L); }
    /// {@return `deviceNodeMask`}
    public @CType("uint32_t") int deviceNodeMask() { return VkPhysicalDeviceVulkan11Properties.get_deviceNodeMask(this.segment()); }
    /// Sets `deviceNodeMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceNodeMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceNodeMask.set(segment, 0L, index, value); }
    /// Sets `deviceNodeMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceNodeMask(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_deviceNodeMask(segment, 0L, value); }
    /// Sets `deviceNodeMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceNodeMask(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_deviceNodeMask(this.segment(), value); return this; }

    /// {@return `deviceLUIDValid` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceLUIDValid(MemorySegment segment, long index) { return (int) VH_deviceLUIDValid.get(segment, 0L, index); }
    /// {@return `deviceLUIDValid`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceLUIDValid(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_deviceLUIDValid(segment, 0L); }
    /// {@return `deviceLUIDValid`}
    public @CType("VkBool32") int deviceLUIDValid() { return VkPhysicalDeviceVulkan11Properties.get_deviceLUIDValid(this.segment()); }
    /// Sets `deviceLUIDValid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceLUIDValid(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceLUIDValid.set(segment, 0L, index, value); }
    /// Sets `deviceLUIDValid` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceLUIDValid(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_deviceLUIDValid(segment, 0L, value); }
    /// Sets `deviceLUIDValid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceLUIDValid(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_deviceLUIDValid(this.segment(), value); return this; }

    /// {@return `subgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subgroupSize(MemorySegment segment, long index) { return (int) VH_subgroupSize.get(segment, 0L, index); }
    /// {@return `subgroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subgroupSize(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_subgroupSize(segment, 0L); }
    /// {@return `subgroupSize`}
    public @CType("uint32_t") int subgroupSize() { return VkPhysicalDeviceVulkan11Properties.get_subgroupSize(this.segment()); }
    /// Sets `subgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subgroupSize.set(segment, 0L, index, value); }
    /// Sets `subgroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSize(segment, 0L, value); }
    /// Sets `subgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties subgroupSize(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSize(this.segment(), value); return this; }

    /// {@return `subgroupSupportedStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_subgroupSupportedStages(MemorySegment segment, long index) { return (int) VH_subgroupSupportedStages.get(segment, 0L, index); }
    /// {@return `subgroupSupportedStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_subgroupSupportedStages(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_subgroupSupportedStages(segment, 0L); }
    /// {@return `subgroupSupportedStages`}
    public @CType("VkShaderStageFlags") int subgroupSupportedStages() { return VkPhysicalDeviceVulkan11Properties.get_subgroupSupportedStages(this.segment()); }
    /// Sets `subgroupSupportedStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupSupportedStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_subgroupSupportedStages.set(segment, 0L, index, value); }
    /// Sets `subgroupSupportedStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupSupportedStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSupportedStages(segment, 0L, value); }
    /// Sets `subgroupSupportedStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedStages(@CType("VkShaderStageFlags") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSupportedStages(this.segment(), value); return this; }

    /// {@return `subgroupSupportedOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSubgroupFeatureFlags") int get_subgroupSupportedOperations(MemorySegment segment, long index) { return (int) VH_subgroupSupportedOperations.get(segment, 0L, index); }
    /// {@return `subgroupSupportedOperations`}
    /// @param segment the segment of the struct
    public static @CType("VkSubgroupFeatureFlags") int get_subgroupSupportedOperations(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_subgroupSupportedOperations(segment, 0L); }
    /// {@return `subgroupSupportedOperations`}
    public @CType("VkSubgroupFeatureFlags") int subgroupSupportedOperations() { return VkPhysicalDeviceVulkan11Properties.get_subgroupSupportedOperations(this.segment()); }
    /// Sets `subgroupSupportedOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupSupportedOperations(MemorySegment segment, long index, @CType("VkSubgroupFeatureFlags") int value) { VH_subgroupSupportedOperations.set(segment, 0L, index, value); }
    /// Sets `subgroupSupportedOperations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupSupportedOperations(MemorySegment segment, @CType("VkSubgroupFeatureFlags") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSupportedOperations(segment, 0L, value); }
    /// Sets `subgroupSupportedOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedOperations(@CType("VkSubgroupFeatureFlags") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSupportedOperations(this.segment(), value); return this; }

    /// {@return `subgroupQuadOperationsInAllStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_subgroupQuadOperationsInAllStages(MemorySegment segment, long index) { return (int) VH_subgroupQuadOperationsInAllStages.get(segment, 0L, index); }
    /// {@return `subgroupQuadOperationsInAllStages`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_subgroupQuadOperationsInAllStages(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_subgroupQuadOperationsInAllStages(segment, 0L); }
    /// {@return `subgroupQuadOperationsInAllStages`}
    public @CType("VkBool32") int subgroupQuadOperationsInAllStages() { return VkPhysicalDeviceVulkan11Properties.get_subgroupQuadOperationsInAllStages(this.segment()); }
    /// Sets `subgroupQuadOperationsInAllStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupQuadOperationsInAllStages(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_subgroupQuadOperationsInAllStages.set(segment, 0L, index, value); }
    /// Sets `subgroupQuadOperationsInAllStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupQuadOperationsInAllStages(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupQuadOperationsInAllStages(segment, 0L, value); }
    /// Sets `subgroupQuadOperationsInAllStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties subgroupQuadOperationsInAllStages(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupQuadOperationsInAllStages(this.segment(), value); return this; }

    /// {@return `pointClippingBehavior` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPointClippingBehavior") int get_pointClippingBehavior(MemorySegment segment, long index) { return (int) VH_pointClippingBehavior.get(segment, 0L, index); }
    /// {@return `pointClippingBehavior`}
    /// @param segment the segment of the struct
    public static @CType("VkPointClippingBehavior") int get_pointClippingBehavior(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_pointClippingBehavior(segment, 0L); }
    /// {@return `pointClippingBehavior`}
    public @CType("VkPointClippingBehavior") int pointClippingBehavior() { return VkPhysicalDeviceVulkan11Properties.get_pointClippingBehavior(this.segment()); }
    /// Sets `pointClippingBehavior` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pointClippingBehavior(MemorySegment segment, long index, @CType("VkPointClippingBehavior") int value) { VH_pointClippingBehavior.set(segment, 0L, index, value); }
    /// Sets `pointClippingBehavior` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pointClippingBehavior(MemorySegment segment, @CType("VkPointClippingBehavior") int value) { VkPhysicalDeviceVulkan11Properties.set_pointClippingBehavior(segment, 0L, value); }
    /// Sets `pointClippingBehavior` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties pointClippingBehavior(@CType("VkPointClippingBehavior") int value) { VkPhysicalDeviceVulkan11Properties.set_pointClippingBehavior(this.segment(), value); return this; }

    /// {@return `maxMultiviewViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMultiviewViewCount(MemorySegment segment, long index) { return (int) VH_maxMultiviewViewCount.get(segment, 0L, index); }
    /// {@return `maxMultiviewViewCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMultiviewViewCount(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_maxMultiviewViewCount(segment, 0L); }
    /// {@return `maxMultiviewViewCount`}
    public @CType("uint32_t") int maxMultiviewViewCount() { return VkPhysicalDeviceVulkan11Properties.get_maxMultiviewViewCount(this.segment()); }
    /// Sets `maxMultiviewViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMultiviewViewCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMultiviewViewCount.set(segment, 0L, index, value); }
    /// Sets `maxMultiviewViewCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMultiviewViewCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxMultiviewViewCount(segment, 0L, value); }
    /// Sets `maxMultiviewViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties maxMultiviewViewCount(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxMultiviewViewCount(this.segment(), value); return this; }

    /// {@return `maxMultiviewInstanceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMultiviewInstanceIndex(MemorySegment segment, long index) { return (int) VH_maxMultiviewInstanceIndex.get(segment, 0L, index); }
    /// {@return `maxMultiviewInstanceIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMultiviewInstanceIndex(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_maxMultiviewInstanceIndex(segment, 0L); }
    /// {@return `maxMultiviewInstanceIndex`}
    public @CType("uint32_t") int maxMultiviewInstanceIndex() { return VkPhysicalDeviceVulkan11Properties.get_maxMultiviewInstanceIndex(this.segment()); }
    /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMultiviewInstanceIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMultiviewInstanceIndex.set(segment, 0L, index, value); }
    /// Sets `maxMultiviewInstanceIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMultiviewInstanceIndex(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxMultiviewInstanceIndex(segment, 0L, value); }
    /// Sets `maxMultiviewInstanceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties maxMultiviewInstanceIndex(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxMultiviewInstanceIndex(this.segment(), value); return this; }

    /// {@return `protectedNoFault` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_protectedNoFault(MemorySegment segment, long index) { return (int) VH_protectedNoFault.get(segment, 0L, index); }
    /// {@return `protectedNoFault`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_protectedNoFault(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_protectedNoFault(segment, 0L); }
    /// {@return `protectedNoFault`}
    public @CType("VkBool32") int protectedNoFault() { return VkPhysicalDeviceVulkan11Properties.get_protectedNoFault(this.segment()); }
    /// Sets `protectedNoFault` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_protectedNoFault(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_protectedNoFault.set(segment, 0L, index, value); }
    /// Sets `protectedNoFault` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_protectedNoFault(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_protectedNoFault(segment, 0L, value); }
    /// Sets `protectedNoFault` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties protectedNoFault(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_protectedNoFault(this.segment(), value); return this; }

    /// {@return `maxPerSetDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerSetDescriptors(MemorySegment segment, long index) { return (int) VH_maxPerSetDescriptors.get(segment, 0L, index); }
    /// {@return `maxPerSetDescriptors`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerSetDescriptors(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_maxPerSetDescriptors(segment, 0L); }
    /// {@return `maxPerSetDescriptors`}
    public @CType("uint32_t") int maxPerSetDescriptors() { return VkPhysicalDeviceVulkan11Properties.get_maxPerSetDescriptors(this.segment()); }
    /// Sets `maxPerSetDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerSetDescriptors(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerSetDescriptors.set(segment, 0L, index, value); }
    /// Sets `maxPerSetDescriptors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerSetDescriptors(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxPerSetDescriptors(segment, 0L, value); }
    /// Sets `maxPerSetDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties maxPerSetDescriptors(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxPerSetDescriptors(this.segment(), value); return this; }

    /// {@return `maxMemoryAllocationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxMemoryAllocationSize(MemorySegment segment, long index) { return (long) VH_maxMemoryAllocationSize.get(segment, 0L, index); }
    /// {@return `maxMemoryAllocationSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxMemoryAllocationSize(MemorySegment segment) { return VkPhysicalDeviceVulkan11Properties.get_maxMemoryAllocationSize(segment, 0L); }
    /// {@return `maxMemoryAllocationSize`}
    public @CType("VkDeviceSize") long maxMemoryAllocationSize() { return VkPhysicalDeviceVulkan11Properties.get_maxMemoryAllocationSize(this.segment()); }
    /// Sets `maxMemoryAllocationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMemoryAllocationSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxMemoryAllocationSize.set(segment, 0L, index, value); }
    /// Sets `maxMemoryAllocationSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMemoryAllocationSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan11Properties.set_maxMemoryAllocationSize(segment, 0L, value); }
    /// Sets `maxMemoryAllocationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties maxMemoryAllocationSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan11Properties.set_maxMemoryAllocationSize(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceVulkan11Properties].
    public static final class Buffer extends VkPhysicalDeviceVulkan11Properties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVulkan11Properties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVulkan11Properties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVulkan11Properties`
        public VkPhysicalDeviceVulkan11Properties asSlice(long index) { return new VkPhysicalDeviceVulkan11Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVulkan11Properties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVulkan11Properties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Properties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `deviceUUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment deviceUUIDAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_deviceUUID(this.segment(), index); }
        /// Sets `deviceUUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceUUIDAt(long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_deviceUUID(this.segment(), index, value); return this; }

        /// {@return `driverUUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment driverUUIDAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_driverUUID(this.segment(), index); }
        /// Sets `driverUUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverUUIDAt(long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_driverUUID(this.segment(), index, value); return this; }

        /// {@return `deviceLUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment deviceLUIDAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_deviceLUID(this.segment(), index); }
        /// Sets `deviceLUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceLUIDAt(long index, @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Properties.set_deviceLUID(this.segment(), index, value); return this; }

        /// {@return `deviceNodeMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceNodeMaskAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_deviceNodeMask(this.segment(), index); }
        /// Sets `deviceNodeMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceNodeMaskAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_deviceNodeMask(this.segment(), index, value); return this; }

        /// {@return `deviceLUIDValid` at the given index}
        /// @param index the index
        public @CType("VkBool32") int deviceLUIDValidAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_deviceLUIDValid(this.segment(), index); }
        /// Sets `deviceLUIDValid` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceLUIDValidAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_deviceLUIDValid(this.segment(), index, value); return this; }

        /// {@return `subgroupSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subgroupSizeAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_subgroupSize(this.segment(), index); }
        /// Sets `subgroupSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subgroupSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSize(this.segment(), index, value); return this; }

        /// {@return `subgroupSupportedStages` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int subgroupSupportedStagesAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_subgroupSupportedStages(this.segment(), index); }
        /// Sets `subgroupSupportedStages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subgroupSupportedStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSupportedStages(this.segment(), index, value); return this; }

        /// {@return `subgroupSupportedOperations` at the given index}
        /// @param index the index
        public @CType("VkSubgroupFeatureFlags") int subgroupSupportedOperationsAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_subgroupSupportedOperations(this.segment(), index); }
        /// Sets `subgroupSupportedOperations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subgroupSupportedOperationsAt(long index, @CType("VkSubgroupFeatureFlags") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupSupportedOperations(this.segment(), index, value); return this; }

        /// {@return `subgroupQuadOperationsInAllStages` at the given index}
        /// @param index the index
        public @CType("VkBool32") int subgroupQuadOperationsInAllStagesAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_subgroupQuadOperationsInAllStages(this.segment(), index); }
        /// Sets `subgroupQuadOperationsInAllStages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subgroupQuadOperationsInAllStagesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_subgroupQuadOperationsInAllStages(this.segment(), index, value); return this; }

        /// {@return `pointClippingBehavior` at the given index}
        /// @param index the index
        public @CType("VkPointClippingBehavior") int pointClippingBehaviorAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_pointClippingBehavior(this.segment(), index); }
        /// Sets `pointClippingBehavior` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pointClippingBehaviorAt(long index, @CType("VkPointClippingBehavior") int value) { VkPhysicalDeviceVulkan11Properties.set_pointClippingBehavior(this.segment(), index, value); return this; }

        /// {@return `maxMultiviewViewCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxMultiviewViewCountAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_maxMultiviewViewCount(this.segment(), index); }
        /// Sets `maxMultiviewViewCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMultiviewViewCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxMultiviewViewCount(this.segment(), index, value); return this; }

        /// {@return `maxMultiviewInstanceIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxMultiviewInstanceIndexAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_maxMultiviewInstanceIndex(this.segment(), index); }
        /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMultiviewInstanceIndexAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxMultiviewInstanceIndex(this.segment(), index, value); return this; }

        /// {@return `protectedNoFault` at the given index}
        /// @param index the index
        public @CType("VkBool32") int protectedNoFaultAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_protectedNoFault(this.segment(), index); }
        /// Sets `protectedNoFault` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer protectedNoFaultAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Properties.set_protectedNoFault(this.segment(), index, value); return this; }

        /// {@return `maxPerSetDescriptors` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerSetDescriptorsAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_maxPerSetDescriptors(this.segment(), index); }
        /// Sets `maxPerSetDescriptors` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerSetDescriptorsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan11Properties.set_maxPerSetDescriptors(this.segment(), index, value); return this; }

        /// {@return `maxMemoryAllocationSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long maxMemoryAllocationSizeAt(long index) { return VkPhysicalDeviceVulkan11Properties.get_maxMemoryAllocationSize(this.segment(), index); }
        /// Sets `maxMemoryAllocationSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMemoryAllocationSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan11Properties.set_maxMemoryAllocationSize(this.segment(), index, value); return this; }

    }
}
