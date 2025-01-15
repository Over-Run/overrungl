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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### headerSize
/// [VarHandle][#VH_headerSize] - [Getter][#headerSize()] - [Setter][#headerSize(int)]
/// ### headerVersion
/// [VarHandle][#VH_headerVersion] - [Getter][#headerVersion()] - [Setter][#headerVersion(int)]
/// ### vendorID
/// [VarHandle][#VH_vendorID] - [Getter][#vendorID()] - [Setter][#vendorID(int)]
/// ### deviceID
/// [VarHandle][#VH_deviceID] - [Getter][#deviceID()] - [Setter][#deviceID(int)]
/// ### driverVersion
/// [VarHandle][#VH_driverVersion] - [Getter][#driverVersion()] - [Setter][#driverVersion(int)]
/// ### pipelineCacheUUID
/// [Byte offset][#OFFSET_pipelineCacheUUID] - [Memory layout][#ML_pipelineCacheUUID] - [Getter][#pipelineCacheUUID()] - [Setter][#pipelineCacheUUID(java.lang.foreign.MemorySegment)]
/// ### applicationNameOffset
/// [VarHandle][#VH_applicationNameOffset] - [Getter][#applicationNameOffset()] - [Setter][#applicationNameOffset(int)]
/// ### applicationVersion
/// [VarHandle][#VH_applicationVersion] - [Getter][#applicationVersion()] - [Setter][#applicationVersion(int)]
/// ### engineNameOffset
/// [VarHandle][#VH_engineNameOffset] - [Getter][#engineNameOffset()] - [Setter][#engineNameOffset(int)]
/// ### engineVersion
/// [VarHandle][#VH_engineVersion] - [Getter][#engineVersion()] - [Setter][#engineVersion(int)]
/// ### apiVersion
/// [VarHandle][#VH_apiVersion] - [Getter][#apiVersion()] - [Setter][#apiVersion(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceFaultVendorBinaryHeaderVersionOneEXT {
///     uint32_t headerSize;
///     VkDeviceFaultVendorBinaryHeaderVersionEXT headerVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint32_t driverVersion;
///     uint8_t[VK_UUID_SIZE] pipelineCacheUUID;
///     uint32_t applicationNameOffset;
///     uint32_t applicationVersion;
///     uint32_t engineNameOffset;
///     uint32_t engineVersion;
///     uint32_t apiVersion;
/// } VkDeviceFaultVendorBinaryHeaderVersionOneEXT;
/// ```
public sealed class VkDeviceFaultVendorBinaryHeaderVersionOneEXT extends Struct {
    /// The struct layout of `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID"),
        ValueLayout.JAVA_INT.withName("applicationNameOffset"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.JAVA_INT.withName("engineNameOffset"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );
    /// The [VarHandle] of `headerSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_headerSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerSize"));
    /// The [VarHandle] of `headerVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_headerVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerVersion"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `driverVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_driverVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverVersion"));
    /// The byte offset of `pipelineCacheUUID`.
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    /// The memory layout of `pipelineCacheUUID`.
    public static final MemoryLayout ML_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));
    /// The [VarHandle] of `applicationNameOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_applicationNameOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationNameOffset"));
    /// The [VarHandle] of `applicationVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_applicationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationVersion"));
    /// The [VarHandle] of `engineNameOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_engineNameOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineNameOffset"));
    /// The [VarHandle] of `engineVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_engineVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineVersion"));
    /// The [VarHandle] of `apiVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment); }

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT allocInit(SegmentAllocator allocator, @CType("uint32_t") int headerSize, @CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int headerVersion, @CType("uint32_t") int vendorID, @CType("uint32_t") int deviceID, @CType("uint32_t") int driverVersion, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUID, @CType("uint32_t") int applicationNameOffset, @CType("uint32_t") int applicationVersion, @CType("uint32_t") int engineNameOffset, @CType("uint32_t") int engineVersion, @CType("uint32_t") int apiVersion) { return alloc(allocator).headerSize(headerSize).headerVersion(headerVersion).vendorID(vendorID).deviceID(deviceID).driverVersion(driverVersion).pipelineCacheUUID(pipelineCacheUUID).applicationNameOffset(applicationNameOffset).applicationVersion(applicationVersion).engineNameOffset(engineNameOffset).engineVersion(engineVersion).apiVersion(apiVersion); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT copyFrom(VkDeviceFaultVendorBinaryHeaderVersionOneEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `headerSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_headerSize(MemorySegment segment, long index) { return (int) VH_headerSize.get(segment, 0L, index); }
    /// {@return `headerSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_headerSize(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_headerSize(segment, 0L); }
    /// {@return `headerSize`}
    public @CType("uint32_t") int headerSize() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_headerSize(this.segment()); }
    /// Sets `headerSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_headerSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_headerSize.set(segment, 0L, index, value); }
    /// Sets `headerSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_headerSize(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_headerSize(segment, 0L, value); }
    /// Sets `headerSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerSize(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_headerSize(this.segment(), value); return this; }

    /// {@return `headerVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int get_headerVersion(MemorySegment segment, long index) { return (int) VH_headerVersion.get(segment, 0L, index); }
    /// {@return `headerVersion`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int get_headerVersion(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_headerVersion(segment, 0L); }
    /// {@return `headerVersion`}
    public @CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int headerVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_headerVersion(this.segment()); }
    /// Sets `headerVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_headerVersion(MemorySegment segment, long index, @CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int value) { VH_headerVersion.set(segment, 0L, index, value); }
    /// Sets `headerVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_headerVersion(MemorySegment segment, @CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_headerVersion(segment, 0L, value); }
    /// Sets `headerVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerVersion(@CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_headerVersion(this.segment(), value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get(segment, 0L, index); }
    /// {@return `vendorID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_vendorID(segment, 0L); }
    /// {@return `vendorID`}
    public @CType("uint32_t") int vendorID() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_vendorID(this.segment()); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vendorID.set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_vendorID(segment, 0L, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT vendorID(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_vendorID(this.segment(), value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get(segment, 0L, index); }
    /// {@return `deviceID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_deviceID(segment, 0L); }
    /// {@return `deviceID`}
    public @CType("uint32_t") int deviceID() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_deviceID(this.segment()); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceID.set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_deviceID(segment, 0L, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT deviceID(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_deviceID(this.segment(), value); return this; }

    /// {@return `driverVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_driverVersion(MemorySegment segment, long index) { return (int) VH_driverVersion.get(segment, 0L, index); }
    /// {@return `driverVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_driverVersion(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_driverVersion(segment, 0L); }
    /// {@return `driverVersion`}
    public @CType("uint32_t") int driverVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_driverVersion(this.segment()); }
    /// Sets `driverVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_driverVersion.set(segment, 0L, index, value); }
    /// Sets `driverVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverVersion(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_driverVersion(segment, 0L, value); }
    /// Sets `driverVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT driverVersion(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_driverVersion(this.segment(), value); return this; }

    /// {@return `pipelineCacheUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineCacheUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pipelineCacheUUID, index), ML_pipelineCacheUUID); }
    /// {@return `pipelineCacheUUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineCacheUUID(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_pipelineCacheUUID(segment, 0L); }
    /// {@return `pipelineCacheUUID`}
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUID() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_pipelineCacheUUID(this.segment()); }
    /// Sets `pipelineCacheUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineCacheUUID(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pipelineCacheUUID, index), ML_pipelineCacheUUID.byteSize()); }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineCacheUUID(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_pipelineCacheUUID(segment, 0L, value); }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(@CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_pipelineCacheUUID(this.segment(), value); return this; }

    /// {@return `applicationNameOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_applicationNameOffset(MemorySegment segment, long index) { return (int) VH_applicationNameOffset.get(segment, 0L, index); }
    /// {@return `applicationNameOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_applicationNameOffset(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_applicationNameOffset(segment, 0L); }
    /// {@return `applicationNameOffset`}
    public @CType("uint32_t") int applicationNameOffset() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_applicationNameOffset(this.segment()); }
    /// Sets `applicationNameOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_applicationNameOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_applicationNameOffset.set(segment, 0L, index, value); }
    /// Sets `applicationNameOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_applicationNameOffset(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_applicationNameOffset(segment, 0L, value); }
    /// Sets `applicationNameOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationNameOffset(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_applicationNameOffset(this.segment(), value); return this; }

    /// {@return `applicationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_applicationVersion(MemorySegment segment, long index) { return (int) VH_applicationVersion.get(segment, 0L, index); }
    /// {@return `applicationVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_applicationVersion(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_applicationVersion(segment, 0L); }
    /// {@return `applicationVersion`}
    public @CType("uint32_t") int applicationVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_applicationVersion(this.segment()); }
    /// Sets `applicationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_applicationVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_applicationVersion.set(segment, 0L, index, value); }
    /// Sets `applicationVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_applicationVersion(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_applicationVersion(segment, 0L, value); }
    /// Sets `applicationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationVersion(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_applicationVersion(this.segment(), value); return this; }

    /// {@return `engineNameOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_engineNameOffset(MemorySegment segment, long index) { return (int) VH_engineNameOffset.get(segment, 0L, index); }
    /// {@return `engineNameOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_engineNameOffset(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_engineNameOffset(segment, 0L); }
    /// {@return `engineNameOffset`}
    public @CType("uint32_t") int engineNameOffset() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_engineNameOffset(this.segment()); }
    /// Sets `engineNameOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_engineNameOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_engineNameOffset.set(segment, 0L, index, value); }
    /// Sets `engineNameOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_engineNameOffset(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_engineNameOffset(segment, 0L, value); }
    /// Sets `engineNameOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineNameOffset(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_engineNameOffset(this.segment(), value); return this; }

    /// {@return `engineVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_engineVersion(MemorySegment segment, long index) { return (int) VH_engineVersion.get(segment, 0L, index); }
    /// {@return `engineVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_engineVersion(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_engineVersion(segment, 0L); }
    /// {@return `engineVersion`}
    public @CType("uint32_t") int engineVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_engineVersion(this.segment()); }
    /// Sets `engineVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_engineVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_engineVersion.set(segment, 0L, index, value); }
    /// Sets `engineVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_engineVersion(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_engineVersion(segment, 0L, value); }
    /// Sets `engineVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineVersion(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_engineVersion(this.segment(), value); return this; }

    /// {@return `apiVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_apiVersion(MemorySegment segment, long index) { return (int) VH_apiVersion.get(segment, 0L, index); }
    /// {@return `apiVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_apiVersion(MemorySegment segment) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_apiVersion(segment, 0L); }
    /// {@return `apiVersion`}
    public @CType("uint32_t") int apiVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_apiVersion(this.segment()); }
    /// Sets `apiVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_apiVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_apiVersion.set(segment, 0L, index, value); }
    /// Sets `apiVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_apiVersion(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_apiVersion(segment, 0L, value); }
    /// Sets `apiVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT apiVersion(@CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_apiVersion(this.segment(), value); return this; }

    /// A buffer of [VkDeviceFaultVendorBinaryHeaderVersionOneEXT].
    public static final class Buffer extends VkDeviceFaultVendorBinaryHeaderVersionOneEXT {
        private final long elementCount;

        /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT asSlice(long index) { return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `headerSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int headerSizeAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_headerSize(this.segment(), index); }
        /// Sets `headerSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer headerSizeAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_headerSize(this.segment(), index, value); return this; }

        /// {@return `headerVersion` at the given index}
        /// @param index the index
        public @CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int headerVersionAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_headerVersion(this.segment(), index); }
        /// Sets `headerVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer headerVersionAt(long index, @CType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_headerVersion(this.segment(), index, value); return this; }

        /// {@return `vendorID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vendorIDAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_vendorID(this.segment(), index); }
        /// Sets `vendorID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorIDAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_vendorID(this.segment(), index, value); return this; }

        /// {@return `deviceID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceIDAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_deviceID(this.segment(), index); }
        /// Sets `deviceID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceIDAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_deviceID(this.segment(), index, value); return this; }

        /// {@return `driverVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int driverVersionAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_driverVersion(this.segment(), index); }
        /// Sets `driverVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverVersionAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_driverVersion(this.segment(), index, value); return this; }

        /// {@return `pipelineCacheUUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUIDAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_pipelineCacheUUID(this.segment(), index); }
        /// Sets `pipelineCacheUUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineCacheUUIDAt(long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_pipelineCacheUUID(this.segment(), index, value); return this; }

        /// {@return `applicationNameOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int applicationNameOffsetAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_applicationNameOffset(this.segment(), index); }
        /// Sets `applicationNameOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer applicationNameOffsetAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_applicationNameOffset(this.segment(), index, value); return this; }

        /// {@return `applicationVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int applicationVersionAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_applicationVersion(this.segment(), index); }
        /// Sets `applicationVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer applicationVersionAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_applicationVersion(this.segment(), index, value); return this; }

        /// {@return `engineNameOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int engineNameOffsetAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_engineNameOffset(this.segment(), index); }
        /// Sets `engineNameOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer engineNameOffsetAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_engineNameOffset(this.segment(), index, value); return this; }

        /// {@return `engineVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int engineVersionAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_engineVersion(this.segment(), index); }
        /// Sets `engineVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer engineVersionAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_engineVersion(this.segment(), index, value); return this; }

        /// {@return `apiVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int apiVersionAt(long index) { return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.get_apiVersion(this.segment(), index); }
        /// Sets `apiVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer apiVersionAt(long index, @CType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.set_apiVersion(this.segment(), index, value); return this; }

    }
}
