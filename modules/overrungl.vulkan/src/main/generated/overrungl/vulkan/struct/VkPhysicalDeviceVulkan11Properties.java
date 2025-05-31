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
/// struct VkPhysicalDeviceVulkan11Properties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint8_t deviceUUID[16];
///     uint8_t driverUUID[16];
///     uint8_t deviceLUID[8];
///     uint32_t deviceNodeMask;
///     (uint32_t) VkBool32 deviceLUIDValid;
///     uint32_t subgroupSize;
///     ((uint32_t) VkFlags) VkShaderStageFlags subgroupSupportedStages;
///     ((uint32_t) VkFlags) VkSubgroupFeatureFlags subgroupSupportedOperations;
///     (uint32_t) VkBool32 subgroupQuadOperationsInAllStages;
///     (int) VkPointClippingBehavior pointClippingBehavior;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
///     (uint32_t) VkBool32 protectedNoFault;
///     uint32_t maxPerSetDescriptors;
///     (uint64_t) VkDeviceSize maxMemoryAllocationSize;
/// };
/// ```
public sealed class VkPhysicalDeviceVulkan11Properties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkan11Properties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
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
    /// The byte offset of `deviceUUID`.
    public static final long OFFSET_deviceUUID = LAYOUT.byteOffset(PathElement.groupElement("deviceUUID"));
    /// The memory layout of `deviceUUID`.
    public static final MemoryLayout LAYOUT_deviceUUID = LAYOUT.select(PathElement.groupElement("deviceUUID"));
    /// The [VarHandle] of `deviceUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_deviceUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceUUID"), PathElement.sequenceElement());
    /// The byte offset of `driverUUID`.
    public static final long OFFSET_driverUUID = LAYOUT.byteOffset(PathElement.groupElement("driverUUID"));
    /// The memory layout of `driverUUID`.
    public static final MemoryLayout LAYOUT_driverUUID = LAYOUT.select(PathElement.groupElement("driverUUID"));
    /// The [VarHandle] of `driverUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_driverUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverUUID"), PathElement.sequenceElement());
    /// The byte offset of `deviceLUID`.
    public static final long OFFSET_deviceLUID = LAYOUT.byteOffset(PathElement.groupElement("deviceLUID"));
    /// The memory layout of `deviceLUID`.
    public static final MemoryLayout LAYOUT_deviceLUID = LAYOUT.select(PathElement.groupElement("deviceLUID"));
    /// The [VarHandle] of `deviceLUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_deviceLUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUID"), PathElement.sequenceElement());
    /// The byte offset of `deviceNodeMask`.
    public static final long OFFSET_deviceNodeMask = LAYOUT.byteOffset(PathElement.groupElement("deviceNodeMask"));
    /// The memory layout of `deviceNodeMask`.
    public static final MemoryLayout LAYOUT_deviceNodeMask = LAYOUT.select(PathElement.groupElement("deviceNodeMask"));
    /// The [VarHandle] of `deviceNodeMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceNodeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceNodeMask"));
    /// The byte offset of `deviceLUIDValid`.
    public static final long OFFSET_deviceLUIDValid = LAYOUT.byteOffset(PathElement.groupElement("deviceLUIDValid"));
    /// The memory layout of `deviceLUIDValid`.
    public static final MemoryLayout LAYOUT_deviceLUIDValid = LAYOUT.select(PathElement.groupElement("deviceLUIDValid"));
    /// The [VarHandle] of `deviceLUIDValid` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceLUIDValid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUIDValid"));
    /// The byte offset of `subgroupSize`.
    public static final long OFFSET_subgroupSize = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
    /// The memory layout of `subgroupSize`.
    public static final MemoryLayout LAYOUT_subgroupSize = LAYOUT.select(PathElement.groupElement("subgroupSize"));
    /// The [VarHandle] of `subgroupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSize"));
    /// The byte offset of `subgroupSupportedStages`.
    public static final long OFFSET_subgroupSupportedStages = LAYOUT.byteOffset(PathElement.groupElement("subgroupSupportedStages"));
    /// The memory layout of `subgroupSupportedStages`.
    public static final MemoryLayout LAYOUT_subgroupSupportedStages = LAYOUT.select(PathElement.groupElement("subgroupSupportedStages"));
    /// The [VarHandle] of `subgroupSupportedStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subgroupSupportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSupportedStages"));
    /// The byte offset of `subgroupSupportedOperations`.
    public static final long OFFSET_subgroupSupportedOperations = LAYOUT.byteOffset(PathElement.groupElement("subgroupSupportedOperations"));
    /// The memory layout of `subgroupSupportedOperations`.
    public static final MemoryLayout LAYOUT_subgroupSupportedOperations = LAYOUT.select(PathElement.groupElement("subgroupSupportedOperations"));
    /// The [VarHandle] of `subgroupSupportedOperations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subgroupSupportedOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSupportedOperations"));
    /// The byte offset of `subgroupQuadOperationsInAllStages`.
    public static final long OFFSET_subgroupQuadOperationsInAllStages = LAYOUT.byteOffset(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
    /// The memory layout of `subgroupQuadOperationsInAllStages`.
    public static final MemoryLayout LAYOUT_subgroupQuadOperationsInAllStages = LAYOUT.select(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
    /// The [VarHandle] of `subgroupQuadOperationsInAllStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subgroupQuadOperationsInAllStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupQuadOperationsInAllStages"));
    /// The byte offset of `pointClippingBehavior`.
    public static final long OFFSET_pointClippingBehavior = LAYOUT.byteOffset(PathElement.groupElement("pointClippingBehavior"));
    /// The memory layout of `pointClippingBehavior`.
    public static final MemoryLayout LAYOUT_pointClippingBehavior = LAYOUT.select(PathElement.groupElement("pointClippingBehavior"));
    /// The [VarHandle] of `pointClippingBehavior` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pointClippingBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointClippingBehavior"));
    /// The byte offset of `maxMultiviewViewCount`.
    public static final long OFFSET_maxMultiviewViewCount = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewViewCount"));
    /// The memory layout of `maxMultiviewViewCount`.
    public static final MemoryLayout LAYOUT_maxMultiviewViewCount = LAYOUT.select(PathElement.groupElement("maxMultiviewViewCount"));
    /// The [VarHandle] of `maxMultiviewViewCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMultiviewViewCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewViewCount"));
    /// The byte offset of `maxMultiviewInstanceIndex`.
    public static final long OFFSET_maxMultiviewInstanceIndex = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewInstanceIndex"));
    /// The memory layout of `maxMultiviewInstanceIndex`.
    public static final MemoryLayout LAYOUT_maxMultiviewInstanceIndex = LAYOUT.select(PathElement.groupElement("maxMultiviewInstanceIndex"));
    /// The [VarHandle] of `maxMultiviewInstanceIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMultiviewInstanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewInstanceIndex"));
    /// The byte offset of `protectedNoFault`.
    public static final long OFFSET_protectedNoFault = LAYOUT.byteOffset(PathElement.groupElement("protectedNoFault"));
    /// The memory layout of `protectedNoFault`.
    public static final MemoryLayout LAYOUT_protectedNoFault = LAYOUT.select(PathElement.groupElement("protectedNoFault"));
    /// The [VarHandle] of `protectedNoFault` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_protectedNoFault = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedNoFault"));
    /// The byte offset of `maxPerSetDescriptors`.
    public static final long OFFSET_maxPerSetDescriptors = LAYOUT.byteOffset(PathElement.groupElement("maxPerSetDescriptors"));
    /// The memory layout of `maxPerSetDescriptors`.
    public static final MemoryLayout LAYOUT_maxPerSetDescriptors = LAYOUT.select(PathElement.groupElement("maxPerSetDescriptors"));
    /// The [VarHandle] of `maxPerSetDescriptors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerSetDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerSetDescriptors"));
    /// The byte offset of `maxMemoryAllocationSize`.
    public static final long OFFSET_maxMemoryAllocationSize = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationSize"));
    /// The memory layout of `maxMemoryAllocationSize`.
    public static final MemoryLayout LAYOUT_maxMemoryAllocationSize = LAYOUT.select(PathElement.groupElement("maxMemoryAllocationSize"));
    /// The [VarHandle] of `maxMemoryAllocationSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMemoryAllocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationSize"));

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan11Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Properties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceVulkan11Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkan11Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan11Properties`
    public static VkPhysicalDeviceVulkan11Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan11Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan11Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan11Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties copyFrom(VkPhysicalDeviceVulkan11Properties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceVulkan11Properties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan11Properties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment deviceUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceUUID, index), LAYOUT_deviceUUID); }
    /// {@return `deviceUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte deviceUUID(MemorySegment segment, long index, long index0) { return (byte) VH_deviceUUID.get(segment, 0L, index, index0); }
    /// {@return `deviceUUID`}
    public MemorySegment deviceUUID() { return deviceUUID(this.segment(), 0L); }
    /// {@return `deviceUUID`}
    /// @param index0 the Index 0 of the array
    public byte deviceUUID(long index0) { return deviceUUID(this.segment(), 0L, index0); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceUUID, index), LAYOUT_deviceUUID.byteSize()); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void deviceUUID(MemorySegment segment, long index, long index0, byte value) { VH_deviceUUID.set(segment, 0L, index, index0, value); }
    /// Sets `deviceUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceUUID(MemorySegment value) { deviceUUID(this.segment(), 0L, value); return this; }
    /// Sets `deviceUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceUUID(long index0, byte value) { deviceUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `driverUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment driverUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverUUID, index), LAYOUT_driverUUID); }
    /// {@return `driverUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte driverUUID(MemorySegment segment, long index, long index0) { return (byte) VH_driverUUID.get(segment, 0L, index, index0); }
    /// {@return `driverUUID`}
    public MemorySegment driverUUID() { return driverUUID(this.segment(), 0L); }
    /// {@return `driverUUID`}
    /// @param index0 the Index 0 of the array
    public byte driverUUID(long index0) { return driverUUID(this.segment(), 0L, index0); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverUUID, index), LAYOUT_driverUUID.byteSize()); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void driverUUID(MemorySegment segment, long index, long index0, byte value) { VH_driverUUID.set(segment, 0L, index, index0, value); }
    /// Sets `driverUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties driverUUID(MemorySegment value) { driverUUID(this.segment(), 0L, value); return this; }
    /// Sets `driverUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties driverUUID(long index0, byte value) { driverUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `deviceLUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment deviceLUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceLUID, index), LAYOUT_deviceLUID); }
    /// {@return `deviceLUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte deviceLUID(MemorySegment segment, long index, long index0) { return (byte) VH_deviceLUID.get(segment, 0L, index, index0); }
    /// {@return `deviceLUID`}
    public MemorySegment deviceLUID() { return deviceLUID(this.segment(), 0L); }
    /// {@return `deviceLUID`}
    /// @param index0 the Index 0 of the array
    public byte deviceLUID(long index0) { return deviceLUID(this.segment(), 0L, index0); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceLUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceLUID, index), LAYOUT_deviceLUID.byteSize()); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void deviceLUID(MemorySegment segment, long index, long index0, byte value) { VH_deviceLUID.set(segment, 0L, index, index0, value); }
    /// Sets `deviceLUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceLUID(MemorySegment value) { deviceLUID(this.segment(), 0L, value); return this; }
    /// Sets `deviceLUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceLUID(long index0, byte value) { deviceLUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `deviceNodeMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceNodeMask(MemorySegment segment, long index) { return (int) VH_deviceNodeMask.get(segment, 0L, index); }
    /// {@return `deviceNodeMask`}
    public int deviceNodeMask() { return deviceNodeMask(this.segment(), 0L); }
    /// Sets `deviceNodeMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceNodeMask(MemorySegment segment, long index, int value) { VH_deviceNodeMask.set(segment, 0L, index, value); }
    /// Sets `deviceNodeMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceNodeMask(int value) { deviceNodeMask(this.segment(), 0L, value); return this; }

    /// {@return `deviceLUIDValid` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceLUIDValid(MemorySegment segment, long index) { return (int) VH_deviceLUIDValid.get(segment, 0L, index); }
    /// {@return `deviceLUIDValid`}
    public int deviceLUIDValid() { return deviceLUIDValid(this.segment(), 0L); }
    /// Sets `deviceLUIDValid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceLUIDValid(MemorySegment segment, long index, int value) { VH_deviceLUIDValid.set(segment, 0L, index, value); }
    /// Sets `deviceLUIDValid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties deviceLUIDValid(int value) { deviceLUIDValid(this.segment(), 0L, value); return this; }

    /// {@return `subgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subgroupSize(MemorySegment segment, long index) { return (int) VH_subgroupSize.get(segment, 0L, index); }
    /// {@return `subgroupSize`}
    public int subgroupSize() { return subgroupSize(this.segment(), 0L); }
    /// Sets `subgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subgroupSize(MemorySegment segment, long index, int value) { VH_subgroupSize.set(segment, 0L, index, value); }
    /// Sets `subgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties subgroupSize(int value) { subgroupSize(this.segment(), 0L, value); return this; }

    /// {@return `subgroupSupportedStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subgroupSupportedStages(MemorySegment segment, long index) { return (int) VH_subgroupSupportedStages.get(segment, 0L, index); }
    /// {@return `subgroupSupportedStages`}
    public int subgroupSupportedStages() { return subgroupSupportedStages(this.segment(), 0L); }
    /// Sets `subgroupSupportedStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subgroupSupportedStages(MemorySegment segment, long index, int value) { VH_subgroupSupportedStages.set(segment, 0L, index, value); }
    /// Sets `subgroupSupportedStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedStages(int value) { subgroupSupportedStages(this.segment(), 0L, value); return this; }

    /// {@return `subgroupSupportedOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subgroupSupportedOperations(MemorySegment segment, long index) { return (int) VH_subgroupSupportedOperations.get(segment, 0L, index); }
    /// {@return `subgroupSupportedOperations`}
    public int subgroupSupportedOperations() { return subgroupSupportedOperations(this.segment(), 0L); }
    /// Sets `subgroupSupportedOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subgroupSupportedOperations(MemorySegment segment, long index, int value) { VH_subgroupSupportedOperations.set(segment, 0L, index, value); }
    /// Sets `subgroupSupportedOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties subgroupSupportedOperations(int value) { subgroupSupportedOperations(this.segment(), 0L, value); return this; }

    /// {@return `subgroupQuadOperationsInAllStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subgroupQuadOperationsInAllStages(MemorySegment segment, long index) { return (int) VH_subgroupQuadOperationsInAllStages.get(segment, 0L, index); }
    /// {@return `subgroupQuadOperationsInAllStages`}
    public int subgroupQuadOperationsInAllStages() { return subgroupQuadOperationsInAllStages(this.segment(), 0L); }
    /// Sets `subgroupQuadOperationsInAllStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subgroupQuadOperationsInAllStages(MemorySegment segment, long index, int value) { VH_subgroupQuadOperationsInAllStages.set(segment, 0L, index, value); }
    /// Sets `subgroupQuadOperationsInAllStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties subgroupQuadOperationsInAllStages(int value) { subgroupQuadOperationsInAllStages(this.segment(), 0L, value); return this; }

    /// {@return `pointClippingBehavior` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pointClippingBehavior(MemorySegment segment, long index) { return (int) VH_pointClippingBehavior.get(segment, 0L, index); }
    /// {@return `pointClippingBehavior`}
    public int pointClippingBehavior() { return pointClippingBehavior(this.segment(), 0L); }
    /// Sets `pointClippingBehavior` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pointClippingBehavior(MemorySegment segment, long index, int value) { VH_pointClippingBehavior.set(segment, 0L, index, value); }
    /// Sets `pointClippingBehavior` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties pointClippingBehavior(int value) { pointClippingBehavior(this.segment(), 0L, value); return this; }

    /// {@return `maxMultiviewViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMultiviewViewCount(MemorySegment segment, long index) { return (int) VH_maxMultiviewViewCount.get(segment, 0L, index); }
    /// {@return `maxMultiviewViewCount`}
    public int maxMultiviewViewCount() { return maxMultiviewViewCount(this.segment(), 0L); }
    /// Sets `maxMultiviewViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMultiviewViewCount(MemorySegment segment, long index, int value) { VH_maxMultiviewViewCount.set(segment, 0L, index, value); }
    /// Sets `maxMultiviewViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties maxMultiviewViewCount(int value) { maxMultiviewViewCount(this.segment(), 0L, value); return this; }

    /// {@return `maxMultiviewInstanceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMultiviewInstanceIndex(MemorySegment segment, long index) { return (int) VH_maxMultiviewInstanceIndex.get(segment, 0L, index); }
    /// {@return `maxMultiviewInstanceIndex`}
    public int maxMultiviewInstanceIndex() { return maxMultiviewInstanceIndex(this.segment(), 0L); }
    /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMultiviewInstanceIndex(MemorySegment segment, long index, int value) { VH_maxMultiviewInstanceIndex.set(segment, 0L, index, value); }
    /// Sets `maxMultiviewInstanceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties maxMultiviewInstanceIndex(int value) { maxMultiviewInstanceIndex(this.segment(), 0L, value); return this; }

    /// {@return `protectedNoFault` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int protectedNoFault(MemorySegment segment, long index) { return (int) VH_protectedNoFault.get(segment, 0L, index); }
    /// {@return `protectedNoFault`}
    public int protectedNoFault() { return protectedNoFault(this.segment(), 0L); }
    /// Sets `protectedNoFault` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void protectedNoFault(MemorySegment segment, long index, int value) { VH_protectedNoFault.set(segment, 0L, index, value); }
    /// Sets `protectedNoFault` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties protectedNoFault(int value) { protectedNoFault(this.segment(), 0L, value); return this; }

    /// {@return `maxPerSetDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerSetDescriptors(MemorySegment segment, long index) { return (int) VH_maxPerSetDescriptors.get(segment, 0L, index); }
    /// {@return `maxPerSetDescriptors`}
    public int maxPerSetDescriptors() { return maxPerSetDescriptors(this.segment(), 0L); }
    /// Sets `maxPerSetDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerSetDescriptors(MemorySegment segment, long index, int value) { VH_maxPerSetDescriptors.set(segment, 0L, index, value); }
    /// Sets `maxPerSetDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties maxPerSetDescriptors(int value) { maxPerSetDescriptors(this.segment(), 0L, value); return this; }

    /// {@return `maxMemoryAllocationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxMemoryAllocationSize(MemorySegment segment, long index) { return (long) VH_maxMemoryAllocationSize.get(segment, 0L, index); }
    /// {@return `maxMemoryAllocationSize`}
    public long maxMemoryAllocationSize() { return maxMemoryAllocationSize(this.segment(), 0L); }
    /// Sets `maxMemoryAllocationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMemoryAllocationSize(MemorySegment segment, long index, long value) { VH_maxMemoryAllocationSize.set(segment, 0L, index, value); }
    /// Sets `maxMemoryAllocationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Properties maxMemoryAllocationSize(long value) { maxMemoryAllocationSize(this.segment(), 0L, value); return this; }

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

        /// {@return `deviceUUID` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment deviceUUIDAt(long index) { return deviceUUID(this.segment(), index); }
        /// {@return `deviceUUID` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte deviceUUIDAt(long index, long index0) { return deviceUUID(this.segment(), index, index0); }
        /// Sets `deviceUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceUUIDAt(long index, MemorySegment value) { deviceUUID(this.segment(), index, value); return this; }
        /// Sets `deviceUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer deviceUUIDAt(long index, long index0, byte value) { deviceUUID(this.segment(), index, index0, value); return this; }

        /// {@return `driverUUID` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment driverUUIDAt(long index) { return driverUUID(this.segment(), index); }
        /// {@return `driverUUID` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte driverUUIDAt(long index, long index0) { return driverUUID(this.segment(), index, index0); }
        /// Sets `driverUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer driverUUIDAt(long index, MemorySegment value) { driverUUID(this.segment(), index, value); return this; }
        /// Sets `driverUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer driverUUIDAt(long index, long index0, byte value) { driverUUID(this.segment(), index, index0, value); return this; }

        /// {@return `deviceLUID` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment deviceLUIDAt(long index) { return deviceLUID(this.segment(), index); }
        /// {@return `deviceLUID` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte deviceLUIDAt(long index, long index0) { return deviceLUID(this.segment(), index, index0); }
        /// Sets `deviceLUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceLUIDAt(long index, MemorySegment value) { deviceLUID(this.segment(), index, value); return this; }
        /// Sets `deviceLUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer deviceLUIDAt(long index, long index0, byte value) { deviceLUID(this.segment(), index, index0, value); return this; }

        /// {@return `deviceNodeMask` at the given index}
        /// @param index the index of the struct buffer
        public int deviceNodeMaskAt(long index) { return deviceNodeMask(this.segment(), index); }
        /// Sets `deviceNodeMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceNodeMaskAt(long index, int value) { deviceNodeMask(this.segment(), index, value); return this; }

        /// {@return `deviceLUIDValid` at the given index}
        /// @param index the index of the struct buffer
        public int deviceLUIDValidAt(long index) { return deviceLUIDValid(this.segment(), index); }
        /// Sets `deviceLUIDValid` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceLUIDValidAt(long index, int value) { deviceLUIDValid(this.segment(), index, value); return this; }

        /// {@return `subgroupSize` at the given index}
        /// @param index the index of the struct buffer
        public int subgroupSizeAt(long index) { return subgroupSize(this.segment(), index); }
        /// Sets `subgroupSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subgroupSizeAt(long index, int value) { subgroupSize(this.segment(), index, value); return this; }

        /// {@return `subgroupSupportedStages` at the given index}
        /// @param index the index of the struct buffer
        public int subgroupSupportedStagesAt(long index) { return subgroupSupportedStages(this.segment(), index); }
        /// Sets `subgroupSupportedStages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subgroupSupportedStagesAt(long index, int value) { subgroupSupportedStages(this.segment(), index, value); return this; }

        /// {@return `subgroupSupportedOperations` at the given index}
        /// @param index the index of the struct buffer
        public int subgroupSupportedOperationsAt(long index) { return subgroupSupportedOperations(this.segment(), index); }
        /// Sets `subgroupSupportedOperations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subgroupSupportedOperationsAt(long index, int value) { subgroupSupportedOperations(this.segment(), index, value); return this; }

        /// {@return `subgroupQuadOperationsInAllStages` at the given index}
        /// @param index the index of the struct buffer
        public int subgroupQuadOperationsInAllStagesAt(long index) { return subgroupQuadOperationsInAllStages(this.segment(), index); }
        /// Sets `subgroupQuadOperationsInAllStages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subgroupQuadOperationsInAllStagesAt(long index, int value) { subgroupQuadOperationsInAllStages(this.segment(), index, value); return this; }

        /// {@return `pointClippingBehavior` at the given index}
        /// @param index the index of the struct buffer
        public int pointClippingBehaviorAt(long index) { return pointClippingBehavior(this.segment(), index); }
        /// Sets `pointClippingBehavior` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pointClippingBehaviorAt(long index, int value) { pointClippingBehavior(this.segment(), index, value); return this; }

        /// {@return `maxMultiviewViewCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxMultiviewViewCountAt(long index) { return maxMultiviewViewCount(this.segment(), index); }
        /// Sets `maxMultiviewViewCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMultiviewViewCountAt(long index, int value) { maxMultiviewViewCount(this.segment(), index, value); return this; }

        /// {@return `maxMultiviewInstanceIndex` at the given index}
        /// @param index the index of the struct buffer
        public int maxMultiviewInstanceIndexAt(long index) { return maxMultiviewInstanceIndex(this.segment(), index); }
        /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMultiviewInstanceIndexAt(long index, int value) { maxMultiviewInstanceIndex(this.segment(), index, value); return this; }

        /// {@return `protectedNoFault` at the given index}
        /// @param index the index of the struct buffer
        public int protectedNoFaultAt(long index) { return protectedNoFault(this.segment(), index); }
        /// Sets `protectedNoFault` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer protectedNoFaultAt(long index, int value) { protectedNoFault(this.segment(), index, value); return this; }

        /// {@return `maxPerSetDescriptors` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerSetDescriptorsAt(long index) { return maxPerSetDescriptors(this.segment(), index); }
        /// Sets `maxPerSetDescriptors` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerSetDescriptorsAt(long index, int value) { maxPerSetDescriptors(this.segment(), index, value); return this; }

        /// {@return `maxMemoryAllocationSize` at the given index}
        /// @param index the index of the struct buffer
        public long maxMemoryAllocationSizeAt(long index) { return maxMemoryAllocationSize(this.segment(), index); }
        /// Sets `maxMemoryAllocationSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxMemoryAllocationSizeAt(long index, long value) { maxMemoryAllocationSize(this.segment(), index, value); return this; }

    }
}
