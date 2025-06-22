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
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceProperties {
///     uint32_t apiVersion;
///     uint32_t driverVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     (int) VkPhysicalDeviceType deviceType;
///     char deviceName[256];
///     uint8_t pipelineCacheUUID[16];
///     (struct VkPhysicalDeviceLimits) VkPhysicalDeviceLimits limits;
///     (struct VkPhysicalDeviceSparseProperties) VkPhysicalDeviceSparseProperties sparseProperties;
/// };
/// ```
public sealed class VkPhysicalDeviceProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("apiVersion"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("deviceType"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("deviceName"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID"),
        overrungl.vulkan.struct.VkPhysicalDeviceLimits.LAYOUT.withName("limits"),
        overrungl.vulkan.struct.VkPhysicalDeviceSparseProperties.LAYOUT.withName("sparseProperties")
    );
    /// The byte offset of `apiVersion`.
    public static final long OFFSET_apiVersion = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
    /// The memory layout of `apiVersion`.
    public static final MemoryLayout LAYOUT_apiVersion = LAYOUT.select(PathElement.groupElement("apiVersion"));
    /// The [VarHandle] of `apiVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));
    /// The byte offset of `driverVersion`.
    public static final long OFFSET_driverVersion = LAYOUT.byteOffset(PathElement.groupElement("driverVersion"));
    /// The memory layout of `driverVersion`.
    public static final MemoryLayout LAYOUT_driverVersion = LAYOUT.select(PathElement.groupElement("driverVersion"));
    /// The [VarHandle] of `driverVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_driverVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverVersion"));
    /// The byte offset of `vendorID`.
    public static final long OFFSET_vendorID = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
    /// The memory layout of `vendorID`.
    public static final MemoryLayout LAYOUT_vendorID = LAYOUT.select(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    /// The byte offset of `deviceID`.
    public static final long OFFSET_deviceID = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
    /// The memory layout of `deviceID`.
    public static final MemoryLayout LAYOUT_deviceID = LAYOUT.select(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    /// The byte offset of `deviceType`.
    public static final long OFFSET_deviceType = LAYOUT.byteOffset(PathElement.groupElement("deviceType"));
    /// The memory layout of `deviceType`.
    public static final MemoryLayout LAYOUT_deviceType = LAYOUT.select(PathElement.groupElement("deviceType"));
    /// The [VarHandle] of `deviceType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceType"));
    /// The byte offset of `deviceName`.
    public static final long OFFSET_deviceName = LAYOUT.byteOffset(PathElement.groupElement("deviceName"));
    /// The memory layout of `deviceName`.
    public static final MemoryLayout LAYOUT_deviceName = LAYOUT.select(PathElement.groupElement("deviceName"));
    /// The [VarHandle] of `deviceName` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_deviceName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceName"), PathElement.sequenceElement());
    /// The byte offset of `pipelineCacheUUID`.
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    /// The memory layout of `pipelineCacheUUID`.
    public static final MemoryLayout LAYOUT_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));
    /// The [VarHandle] of `pipelineCacheUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_pipelineCacheUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());
    /// The byte offset of `limits`.
    public static final long OFFSET_limits = LAYOUT.byteOffset(PathElement.groupElement("limits"));
    /// The memory layout of `limits`.
    public static final MemoryLayout LAYOUT_limits = LAYOUT.select(PathElement.groupElement("limits"));
    /// The byte offset of `sparseProperties`.
    public static final long OFFSET_sparseProperties = LAYOUT.byteOffset(PathElement.groupElement("sparseProperties"));
    /// The memory layout of `sparseProperties`.
    public static final MemoryLayout LAYOUT_sparseProperties = LAYOUT.select(PathElement.groupElement("sparseProperties"));

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @param driverVersion `driverVersion`
    /// @param vendorID `vendorID`
    /// @param deviceID `deviceID`
    /// @param deviceType `deviceType`
    /// @param deviceName `deviceName`
    /// @param pipelineCacheUUID `pipelineCacheUUID`
    /// @param limits `limits`
    /// @param sparseProperties `sparseProperties`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion, int driverVersion, int vendorID, int deviceID, int deviceType, MemorySegment deviceName, MemorySegment pipelineCacheUUID, MemorySegment limits, MemorySegment sparseProperties) {
        return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion).vendorID(vendorID).deviceID(deviceID).deviceType(deviceType).deviceName(deviceName).pipelineCacheUUID(pipelineCacheUUID).limits(limits).sparseProperties(sparseProperties);
    }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @param driverVersion `driverVersion`
    /// @param vendorID `vendorID`
    /// @param deviceID `deviceID`
    /// @param deviceType `deviceType`
    /// @param deviceName `deviceName`
    /// @param pipelineCacheUUID `pipelineCacheUUID`
    /// @param limits `limits`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion, int driverVersion, int vendorID, int deviceID, int deviceType, MemorySegment deviceName, MemorySegment pipelineCacheUUID, MemorySegment limits) {
        return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion).vendorID(vendorID).deviceID(deviceID).deviceType(deviceType).deviceName(deviceName).pipelineCacheUUID(pipelineCacheUUID).limits(limits);
    }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @param driverVersion `driverVersion`
    /// @param vendorID `vendorID`
    /// @param deviceID `deviceID`
    /// @param deviceType `deviceType`
    /// @param deviceName `deviceName`
    /// @param pipelineCacheUUID `pipelineCacheUUID`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion, int driverVersion, int vendorID, int deviceID, int deviceType, MemorySegment deviceName, MemorySegment pipelineCacheUUID) {
        return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion).vendorID(vendorID).deviceID(deviceID).deviceType(deviceType).deviceName(deviceName).pipelineCacheUUID(pipelineCacheUUID);
    }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @param driverVersion `driverVersion`
    /// @param vendorID `vendorID`
    /// @param deviceID `deviceID`
    /// @param deviceType `deviceType`
    /// @param deviceName `deviceName`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion, int driverVersion, int vendorID, int deviceID, int deviceType, MemorySegment deviceName) {
        return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion).vendorID(vendorID).deviceID(deviceID).deviceType(deviceType).deviceName(deviceName);
    }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @param driverVersion `driverVersion`
    /// @param vendorID `vendorID`
    /// @param deviceID `deviceID`
    /// @param deviceType `deviceType`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion, int driverVersion, int vendorID, int deviceID, int deviceType) {
        return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion).vendorID(vendorID).deviceID(deviceID).deviceType(deviceType);
    }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @param driverVersion `driverVersion`
    /// @param vendorID `vendorID`
    /// @param deviceID `deviceID`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion, int driverVersion, int vendorID, int deviceID) {
        return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion).vendorID(vendorID).deviceID(deviceID);
    }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @param driverVersion `driverVersion`
    /// @param vendorID `vendorID`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion, int driverVersion, int vendorID) {
        return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion).vendorID(vendorID);
    }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @param driverVersion `driverVersion`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion, int driverVersion) {
        return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion);
    }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param apiVersion `apiVersion`
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, int apiVersion) {
        return alloc(allocator).apiVersion(apiVersion);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceProperties copyFrom(VkPhysicalDeviceProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `apiVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int apiVersion(MemorySegment segment, long index) { return (int) VH_apiVersion.get(segment, 0L, index); }
    /// {@return `apiVersion`}
    public int apiVersion() { return apiVersion(this.segment(), 0L); }
    /// Sets `apiVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void apiVersion(MemorySegment segment, long index, int value) { VH_apiVersion.set(segment, 0L, index, value); }
    /// Sets `apiVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties apiVersion(int value) { apiVersion(this.segment(), 0L, value); return this; }

    /// {@return `driverVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int driverVersion(MemorySegment segment, long index) { return (int) VH_driverVersion.get(segment, 0L, index); }
    /// {@return `driverVersion`}
    public int driverVersion() { return driverVersion(this.segment(), 0L); }
    /// Sets `driverVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverVersion(MemorySegment segment, long index, int value) { VH_driverVersion.set(segment, 0L, index, value); }
    /// Sets `driverVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties driverVersion(int value) { driverVersion(this.segment(), 0L, value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get(segment, 0L, index); }
    /// {@return `vendorID`}
    public int vendorID() { return vendorID(this.segment(), 0L); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorID(MemorySegment segment, long index, int value) { VH_vendorID.set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties vendorID(int value) { vendorID(this.segment(), 0L, value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get(segment, 0L, index); }
    /// {@return `deviceID`}
    public int deviceID() { return deviceID(this.segment(), 0L); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceID(MemorySegment segment, long index, int value) { VH_deviceID.set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties deviceID(int value) { deviceID(this.segment(), 0L, value); return this; }

    /// {@return `deviceType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceType(MemorySegment segment, long index) { return (int) VH_deviceType.get(segment, 0L, index); }
    /// {@return `deviceType`}
    public int deviceType() { return deviceType(this.segment(), 0L); }
    /// Sets `deviceType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceType(MemorySegment segment, long index, int value) { VH_deviceType.set(segment, 0L, index, value); }
    /// Sets `deviceType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties deviceType(int value) { deviceType(this.segment(), 0L, value); return this; }

    /// {@return `deviceName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment deviceName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceName, index), LAYOUT_deviceName); }
    /// {@return `deviceName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte deviceName(MemorySegment segment, long index, long index0) { return (byte) VH_deviceName.get(segment, 0L, index, index0); }
    /// {@return `deviceName`}
    public MemorySegment deviceName() { return deviceName(this.segment(), 0L); }
    /// {@return `deviceName`}
    /// @param index0 the Index 0 of the array
    public byte deviceName(long index0) { return deviceName(this.segment(), 0L, index0); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceName(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceName, index), LAYOUT_deviceName.byteSize()); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void deviceName(MemorySegment segment, long index, long index0, byte value) { VH_deviceName.set(segment, 0L, index, index0, value); }
    /// Sets `deviceName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties deviceName(MemorySegment value) { deviceName(this.segment(), 0L, value); return this; }
    /// Sets `deviceName` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties deviceName(long index0, byte value) { deviceName(this.segment(), 0L, index0, value); return this; }

    /// {@return `pipelineCacheUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pipelineCacheUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pipelineCacheUUID, index), LAYOUT_pipelineCacheUUID); }
    /// {@return `pipelineCacheUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte pipelineCacheUUID(MemorySegment segment, long index, long index0) { return (byte) VH_pipelineCacheUUID.get(segment, 0L, index, index0); }
    /// {@return `pipelineCacheUUID`}
    public MemorySegment pipelineCacheUUID() { return pipelineCacheUUID(this.segment(), 0L); }
    /// {@return `pipelineCacheUUID`}
    /// @param index0 the Index 0 of the array
    public byte pipelineCacheUUID(long index0) { return pipelineCacheUUID(this.segment(), 0L, index0); }
    /// Sets `pipelineCacheUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineCacheUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pipelineCacheUUID, index), LAYOUT_pipelineCacheUUID.byteSize()); }
    /// Sets `pipelineCacheUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void pipelineCacheUUID(MemorySegment segment, long index, long index0, byte value) { VH_pipelineCacheUUID.set(segment, 0L, index, index0, value); }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties pipelineCacheUUID(MemorySegment value) { pipelineCacheUUID(this.segment(), 0L, value); return this; }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties pipelineCacheUUID(long index0, byte value) { pipelineCacheUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `limits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment limits(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_limits, index), LAYOUT_limits); }
    /// {@return `limits`}
    public MemorySegment limits() { return limits(this.segment(), 0L); }
    /// Sets `limits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void limits(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_limits, index), LAYOUT_limits.byteSize()); }
    /// Sets `limits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties limits(MemorySegment value) { limits(this.segment(), 0L, value); return this; }
    /// Accepts `limits` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceProperties limits(Consumer<overrungl.vulkan.struct.VkPhysicalDeviceLimits> func) { func.accept(overrungl.vulkan.struct.VkPhysicalDeviceLimits.of(limits())); return this; }

    /// {@return `sparseProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment sparseProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sparseProperties, index), LAYOUT_sparseProperties); }
    /// {@return `sparseProperties`}
    public MemorySegment sparseProperties() { return sparseProperties(this.segment(), 0L); }
    /// Sets `sparseProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sparseProperties, index), LAYOUT_sparseProperties.byteSize()); }
    /// Sets `sparseProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties sparseProperties(MemorySegment value) { sparseProperties(this.segment(), 0L, value); return this; }
    /// Accepts `sparseProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceProperties sparseProperties(Consumer<overrungl.vulkan.struct.VkPhysicalDeviceSparseProperties> func) { func.accept(overrungl.vulkan.struct.VkPhysicalDeviceSparseProperties.of(sparseProperties())); return this; }

    /// A buffer of [VkPhysicalDeviceProperties].
    public static final class Buffer extends VkPhysicalDeviceProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceProperties`
        public VkPhysicalDeviceProperties asSlice(long index) { return new VkPhysicalDeviceProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `apiVersion` at the given index}
        /// @param index the index of the struct buffer
        public int apiVersionAt(long index) { return apiVersion(this.segment(), index); }
        /// Sets `apiVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer apiVersionAt(long index, int value) { apiVersion(this.segment(), index, value); return this; }

        /// {@return `driverVersion` at the given index}
        /// @param index the index of the struct buffer
        public int driverVersionAt(long index) { return driverVersion(this.segment(), index); }
        /// Sets `driverVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer driverVersionAt(long index, int value) { driverVersion(this.segment(), index, value); return this; }

        /// {@return `vendorID` at the given index}
        /// @param index the index of the struct buffer
        public int vendorIDAt(long index) { return vendorID(this.segment(), index); }
        /// Sets `vendorID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer vendorIDAt(long index, int value) { vendorID(this.segment(), index, value); return this; }

        /// {@return `deviceID` at the given index}
        /// @param index the index of the struct buffer
        public int deviceIDAt(long index) { return deviceID(this.segment(), index); }
        /// Sets `deviceID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceIDAt(long index, int value) { deviceID(this.segment(), index, value); return this; }

        /// {@return `deviceType` at the given index}
        /// @param index the index of the struct buffer
        public int deviceTypeAt(long index) { return deviceType(this.segment(), index); }
        /// Sets `deviceType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceTypeAt(long index, int value) { deviceType(this.segment(), index, value); return this; }

        /// {@return `deviceName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment deviceNameAt(long index) { return deviceName(this.segment(), index); }
        /// {@return `deviceName` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte deviceNameAt(long index, long index0) { return deviceName(this.segment(), index, index0); }
        /// Sets `deviceName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceNameAt(long index, MemorySegment value) { deviceName(this.segment(), index, value); return this; }
        /// Sets `deviceName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer deviceNameAt(long index, long index0, byte value) { deviceName(this.segment(), index, index0, value); return this; }

        /// {@return `pipelineCacheUUID` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pipelineCacheUUIDAt(long index) { return pipelineCacheUUID(this.segment(), index); }
        /// {@return `pipelineCacheUUID` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte pipelineCacheUUIDAt(long index, long index0) { return pipelineCacheUUID(this.segment(), index, index0); }
        /// Sets `pipelineCacheUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineCacheUUIDAt(long index, MemorySegment value) { pipelineCacheUUID(this.segment(), index, value); return this; }
        /// Sets `pipelineCacheUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer pipelineCacheUUIDAt(long index, long index0, byte value) { pipelineCacheUUID(this.segment(), index, index0, value); return this; }

        /// {@return `limits` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment limitsAt(long index) { return limits(this.segment(), index); }
        /// Sets `limits` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer limitsAt(long index, MemorySegment value) { limits(this.segment(), index, value); return this; }
        /// Accepts `limits` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer limitsAt(long index, Consumer<overrungl.vulkan.struct.VkPhysicalDeviceLimits> func) { func.accept(overrungl.vulkan.struct.VkPhysicalDeviceLimits.of(limitsAt(index))); return this; }

        /// {@return `sparseProperties` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment sparsePropertiesAt(long index) { return sparseProperties(this.segment(), index); }
        /// Sets `sparseProperties` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sparsePropertiesAt(long index, MemorySegment value) { sparseProperties(this.segment(), index, value); return this; }
        /// Accepts `sparseProperties` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer sparsePropertiesAt(long index, Consumer<overrungl.vulkan.struct.VkPhysicalDeviceSparseProperties> func) { func.accept(overrungl.vulkan.struct.VkPhysicalDeviceSparseProperties.of(sparsePropertiesAt(index))); return this; }

    }
}
