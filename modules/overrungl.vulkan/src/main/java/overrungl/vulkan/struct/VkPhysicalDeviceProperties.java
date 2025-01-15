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

/// ## Members
/// ### apiVersion
/// [VarHandle][#VH_apiVersion] - [Getter][#apiVersion()] - [Setter][#apiVersion(int)]
/// ### driverVersion
/// [VarHandle][#VH_driverVersion] - [Getter][#driverVersion()] - [Setter][#driverVersion(int)]
/// ### vendorID
/// [VarHandle][#VH_vendorID] - [Getter][#vendorID()] - [Setter][#vendorID(int)]
/// ### deviceID
/// [VarHandle][#VH_deviceID] - [Getter][#deviceID()] - [Setter][#deviceID(int)]
/// ### deviceType
/// [VarHandle][#VH_deviceType] - [Getter][#deviceType()] - [Setter][#deviceType(int)]
/// ### deviceName
/// [Byte offset][#OFFSET_deviceName] - [Memory layout][#ML_deviceName] - [Getter][#deviceName()] - [Setter][#deviceName(java.lang.foreign.MemorySegment)]
/// ### pipelineCacheUUID
/// [Byte offset][#OFFSET_pipelineCacheUUID] - [Memory layout][#ML_pipelineCacheUUID] - [Getter][#pipelineCacheUUID()] - [Setter][#pipelineCacheUUID(java.lang.foreign.MemorySegment)]
/// ### limits
/// [Byte offset][#OFFSET_limits] - [Memory layout][#ML_limits] - [Getter][#limits()] - [Setter][#limits(java.lang.foreign.MemorySegment)]
/// ### sparseProperties
/// [Byte offset][#OFFSET_sparseProperties] - [Memory layout][#ML_sparseProperties] - [Getter][#sparseProperties()] - [Setter][#sparseProperties(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceProperties {
///     uint32_t apiVersion;
///     uint32_t driverVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     VkPhysicalDeviceType deviceType;
///     char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE] deviceName;
///     uint8_t[VK_UUID_SIZE] pipelineCacheUUID;
///     VkPhysicalDeviceLimits limits;
///     VkPhysicalDeviceSparseProperties sparseProperties;
/// } VkPhysicalDeviceProperties;
/// ```
public sealed class VkPhysicalDeviceProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("apiVersion"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("deviceType"),
        MemoryLayout.sequenceLayout(VK_MAX_PHYSICAL_DEVICE_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("deviceName"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID"),
        overrungl.vulkan.struct.VkPhysicalDeviceLimits.LAYOUT.withName("limits"),
        overrungl.vulkan.struct.VkPhysicalDeviceSparseProperties.LAYOUT.withName("sparseProperties")
    );
    /// The [VarHandle] of `apiVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));
    /// The [VarHandle] of `driverVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_driverVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverVersion"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `deviceType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceType"));
    /// The byte offset of `deviceName`.
    public static final long OFFSET_deviceName = LAYOUT.byteOffset(PathElement.groupElement("deviceName"));
    /// The memory layout of `deviceName`.
    public static final MemoryLayout ML_deviceName = LAYOUT.select(PathElement.groupElement("deviceName"));
    /// The byte offset of `pipelineCacheUUID`.
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    /// The memory layout of `pipelineCacheUUID`.
    public static final MemoryLayout ML_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));
    /// The byte offset of `limits`.
    public static final long OFFSET_limits = LAYOUT.byteOffset(PathElement.groupElement("limits"));
    /// The memory layout of `limits`.
    public static final MemoryLayout ML_limits = LAYOUT.select(PathElement.groupElement("limits"));
    /// The byte offset of `sparseProperties`.
    public static final long OFFSET_sparseProperties = LAYOUT.byteOffset(PathElement.groupElement("sparseProperties"));
    /// The memory layout of `sparseProperties`.
    public static final MemoryLayout ML_sparseProperties = LAYOUT.select(PathElement.groupElement("sparseProperties"));

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties(segment); }

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProperties`
    public static VkPhysicalDeviceProperties allocInit(SegmentAllocator allocator, @CType("uint32_t") int apiVersion, @CType("uint32_t") int driverVersion, @CType("uint32_t") int vendorID, @CType("uint32_t") int deviceID, @CType("VkPhysicalDeviceType") int deviceType, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment deviceName, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUID, @CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment limits, @CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment sparseProperties) { return alloc(allocator).apiVersion(apiVersion).driverVersion(driverVersion).vendorID(vendorID).deviceID(deviceID).deviceType(deviceType).deviceName(deviceName).pipelineCacheUUID(pipelineCacheUUID).limits(limits).sparseProperties(sparseProperties); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceProperties copyFrom(VkPhysicalDeviceProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `apiVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_apiVersion(MemorySegment segment, long index) { return (int) VH_apiVersion.get(segment, 0L, index); }
    /// {@return `apiVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_apiVersion(MemorySegment segment) { return VkPhysicalDeviceProperties.get_apiVersion(segment, 0L); }
    /// {@return `apiVersion`}
    public @CType("uint32_t") int apiVersion() { return VkPhysicalDeviceProperties.get_apiVersion(this.segment()); }
    /// Sets `apiVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_apiVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_apiVersion.set(segment, 0L, index, value); }
    /// Sets `apiVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_apiVersion(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_apiVersion(segment, 0L, value); }
    /// Sets `apiVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties apiVersion(@CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_apiVersion(this.segment(), value); return this; }

    /// {@return `driverVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_driverVersion(MemorySegment segment, long index) { return (int) VH_driverVersion.get(segment, 0L, index); }
    /// {@return `driverVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_driverVersion(MemorySegment segment) { return VkPhysicalDeviceProperties.get_driverVersion(segment, 0L); }
    /// {@return `driverVersion`}
    public @CType("uint32_t") int driverVersion() { return VkPhysicalDeviceProperties.get_driverVersion(this.segment()); }
    /// Sets `driverVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_driverVersion.set(segment, 0L, index, value); }
    /// Sets `driverVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverVersion(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_driverVersion(segment, 0L, value); }
    /// Sets `driverVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties driverVersion(@CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_driverVersion(this.segment(), value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get(segment, 0L, index); }
    /// {@return `vendorID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment) { return VkPhysicalDeviceProperties.get_vendorID(segment, 0L); }
    /// {@return `vendorID`}
    public @CType("uint32_t") int vendorID() { return VkPhysicalDeviceProperties.get_vendorID(this.segment()); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vendorID.set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_vendorID(segment, 0L, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties vendorID(@CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_vendorID(this.segment(), value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get(segment, 0L, index); }
    /// {@return `deviceID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment) { return VkPhysicalDeviceProperties.get_deviceID(segment, 0L); }
    /// {@return `deviceID`}
    public @CType("uint32_t") int deviceID() { return VkPhysicalDeviceProperties.get_deviceID(this.segment()); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceID.set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_deviceID(segment, 0L, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties deviceID(@CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_deviceID(this.segment(), value); return this; }

    /// {@return `deviceType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPhysicalDeviceType") int get_deviceType(MemorySegment segment, long index) { return (int) VH_deviceType.get(segment, 0L, index); }
    /// {@return `deviceType`}
    /// @param segment the segment of the struct
    public static @CType("VkPhysicalDeviceType") int get_deviceType(MemorySegment segment) { return VkPhysicalDeviceProperties.get_deviceType(segment, 0L); }
    /// {@return `deviceType`}
    public @CType("VkPhysicalDeviceType") int deviceType() { return VkPhysicalDeviceProperties.get_deviceType(this.segment()); }
    /// Sets `deviceType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceType(MemorySegment segment, long index, @CType("VkPhysicalDeviceType") int value) { VH_deviceType.set(segment, 0L, index, value); }
    /// Sets `deviceType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceType(MemorySegment segment, @CType("VkPhysicalDeviceType") int value) { VkPhysicalDeviceProperties.set_deviceType(segment, 0L, value); }
    /// Sets `deviceType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties deviceType(@CType("VkPhysicalDeviceType") int value) { VkPhysicalDeviceProperties.set_deviceType(this.segment(), value); return this; }

    /// {@return `deviceName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment get_deviceName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceName, index), ML_deviceName); }
    /// {@return `deviceName`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment get_deviceName(MemorySegment segment) { return VkPhysicalDeviceProperties.get_deviceName(segment, 0L); }
    /// {@return `deviceName`}
    public @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment deviceName() { return VkPhysicalDeviceProperties.get_deviceName(this.segment()); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceName(MemorySegment segment, long index, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceName, index), ML_deviceName.byteSize()); }
    /// Sets `deviceName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceName(MemorySegment segment, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_deviceName(segment, 0L, value); }
    /// Sets `deviceName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties deviceName(@CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_deviceName(this.segment(), value); return this; }

    /// {@return `pipelineCacheUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineCacheUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pipelineCacheUUID, index), ML_pipelineCacheUUID); }
    /// {@return `pipelineCacheUUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineCacheUUID(MemorySegment segment) { return VkPhysicalDeviceProperties.get_pipelineCacheUUID(segment, 0L); }
    /// {@return `pipelineCacheUUID`}
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUID() { return VkPhysicalDeviceProperties.get_pipelineCacheUUID(this.segment()); }
    /// Sets `pipelineCacheUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineCacheUUID(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pipelineCacheUUID, index), ML_pipelineCacheUUID.byteSize()); }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineCacheUUID(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_pipelineCacheUUID(segment, 0L, value); }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties pipelineCacheUUID(@CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_pipelineCacheUUID(this.segment(), value); return this; }

    /// {@return `limits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment get_limits(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_limits, index), ML_limits); }
    /// {@return `limits`}
    /// @param segment the segment of the struct
    public static @CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment get_limits(MemorySegment segment) { return VkPhysicalDeviceProperties.get_limits(segment, 0L); }
    /// {@return `limits`}
    public @CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment limits() { return VkPhysicalDeviceProperties.get_limits(this.segment()); }
    /// Sets `limits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_limits(MemorySegment segment, long index, @CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_limits, index), ML_limits.byteSize()); }
    /// Sets `limits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_limits(MemorySegment segment, @CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_limits(segment, 0L, value); }
    /// Sets `limits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties limits(@CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_limits(this.segment(), value); return this; }

    /// {@return `sparseProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment get_sparseProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sparseProperties, index), ML_sparseProperties); }
    /// {@return `sparseProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment get_sparseProperties(MemorySegment segment) { return VkPhysicalDeviceProperties.get_sparseProperties(segment, 0L); }
    /// {@return `sparseProperties`}
    public @CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment sparseProperties() { return VkPhysicalDeviceProperties.get_sparseProperties(this.segment()); }
    /// Sets `sparseProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseProperties(MemorySegment segment, long index, @CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sparseProperties, index), ML_sparseProperties.byteSize()); }
    /// Sets `sparseProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseProperties(MemorySegment segment, @CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_sparseProperties(segment, 0L, value); }
    /// Sets `sparseProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties sparseProperties(@CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_sparseProperties(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("uint32_t") int apiVersionAt(long index) { return VkPhysicalDeviceProperties.get_apiVersion(this.segment(), index); }
        /// Sets `apiVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer apiVersionAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_apiVersion(this.segment(), index, value); return this; }

        /// {@return `driverVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int driverVersionAt(long index) { return VkPhysicalDeviceProperties.get_driverVersion(this.segment(), index); }
        /// Sets `driverVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverVersionAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_driverVersion(this.segment(), index, value); return this; }

        /// {@return `vendorID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vendorIDAt(long index) { return VkPhysicalDeviceProperties.get_vendorID(this.segment(), index); }
        /// Sets `vendorID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorIDAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_vendorID(this.segment(), index, value); return this; }

        /// {@return `deviceID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceIDAt(long index) { return VkPhysicalDeviceProperties.get_deviceID(this.segment(), index); }
        /// Sets `deviceID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceIDAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceProperties.set_deviceID(this.segment(), index, value); return this; }

        /// {@return `deviceType` at the given index}
        /// @param index the index
        public @CType("VkPhysicalDeviceType") int deviceTypeAt(long index) { return VkPhysicalDeviceProperties.get_deviceType(this.segment(), index); }
        /// Sets `deviceType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceTypeAt(long index, @CType("VkPhysicalDeviceType") int value) { VkPhysicalDeviceProperties.set_deviceType(this.segment(), index, value); return this; }

        /// {@return `deviceName` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment deviceNameAt(long index) { return VkPhysicalDeviceProperties.get_deviceName(this.segment(), index); }
        /// Sets `deviceName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceNameAt(long index, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_deviceName(this.segment(), index, value); return this; }

        /// {@return `pipelineCacheUUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUIDAt(long index) { return VkPhysicalDeviceProperties.get_pipelineCacheUUID(this.segment(), index); }
        /// Sets `pipelineCacheUUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineCacheUUIDAt(long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_pipelineCacheUUID(this.segment(), index, value); return this; }

        /// {@return `limits` at the given index}
        /// @param index the index
        public @CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment limitsAt(long index) { return VkPhysicalDeviceProperties.get_limits(this.segment(), index); }
        /// Sets `limits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer limitsAt(long index, @CType("VkPhysicalDeviceLimits") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_limits(this.segment(), index, value); return this; }

        /// {@return `sparseProperties` at the given index}
        /// @param index the index
        public @CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment sparsePropertiesAt(long index) { return VkPhysicalDeviceProperties.get_sparseProperties(this.segment(), index); }
        /// Sets `sparseProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sparsePropertiesAt(long index, @CType("VkPhysicalDeviceSparseProperties") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceProperties.set_sparseProperties(this.segment(), index, value); return this; }

    }
}
