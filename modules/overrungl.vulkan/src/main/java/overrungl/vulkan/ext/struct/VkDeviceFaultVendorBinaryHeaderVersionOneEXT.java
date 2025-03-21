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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDeviceFaultVendorBinaryHeaderVersionOneEXT {
///     uint32_t headerSize;
///     (int) VkDeviceFaultVendorBinaryHeaderVersionEXT headerVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint32_t driverVersion;
///     uint8_t pipelineCacheUUID[16];
///     uint32_t applicationNameOffset;
///     uint32_t applicationVersion;
///     uint32_t engineNameOffset;
///     uint32_t engineVersion;
///     uint32_t apiVersion;
/// };
/// ```
public sealed class VkDeviceFaultVendorBinaryHeaderVersionOneEXT extends GroupType {
    /// The struct layout of `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        MemoryLayout.sequenceLayout(16L, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID"),
        ValueLayout.JAVA_INT.withName("applicationNameOffset"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.JAVA_INT.withName("engineNameOffset"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );
    /// The byte offset of `headerSize`.
    public static final long OFFSET_headerSize = LAYOUT.byteOffset(PathElement.groupElement("headerSize"));
    /// The memory layout of `headerSize`.
    public static final MemoryLayout LAYOUT_headerSize = LAYOUT.select(PathElement.groupElement("headerSize"));
    /// The [VarHandle] of `headerSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_headerSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerSize"));
    /// The byte offset of `headerVersion`.
    public static final long OFFSET_headerVersion = LAYOUT.byteOffset(PathElement.groupElement("headerVersion"));
    /// The memory layout of `headerVersion`.
    public static final MemoryLayout LAYOUT_headerVersion = LAYOUT.select(PathElement.groupElement("headerVersion"));
    /// The [VarHandle] of `headerVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_headerVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerVersion"));
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
    /// The byte offset of `driverVersion`.
    public static final long OFFSET_driverVersion = LAYOUT.byteOffset(PathElement.groupElement("driverVersion"));
    /// The memory layout of `driverVersion`.
    public static final MemoryLayout LAYOUT_driverVersion = LAYOUT.select(PathElement.groupElement("driverVersion"));
    /// The [VarHandle] of `driverVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_driverVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverVersion"));
    /// The byte offset of `pipelineCacheUUID`.
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    /// The memory layout of `pipelineCacheUUID`.
    public static final MemoryLayout LAYOUT_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));
    /// The [VarHandle] of `pipelineCacheUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_pipelineCacheUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());
    /// The byte offset of `applicationNameOffset`.
    public static final long OFFSET_applicationNameOffset = LAYOUT.byteOffset(PathElement.groupElement("applicationNameOffset"));
    /// The memory layout of `applicationNameOffset`.
    public static final MemoryLayout LAYOUT_applicationNameOffset = LAYOUT.select(PathElement.groupElement("applicationNameOffset"));
    /// The [VarHandle] of `applicationNameOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_applicationNameOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationNameOffset"));
    /// The byte offset of `applicationVersion`.
    public static final long OFFSET_applicationVersion = LAYOUT.byteOffset(PathElement.groupElement("applicationVersion"));
    /// The memory layout of `applicationVersion`.
    public static final MemoryLayout LAYOUT_applicationVersion = LAYOUT.select(PathElement.groupElement("applicationVersion"));
    /// The [VarHandle] of `applicationVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_applicationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationVersion"));
    /// The byte offset of `engineNameOffset`.
    public static final long OFFSET_engineNameOffset = LAYOUT.byteOffset(PathElement.groupElement("engineNameOffset"));
    /// The memory layout of `engineNameOffset`.
    public static final MemoryLayout LAYOUT_engineNameOffset = LAYOUT.select(PathElement.groupElement("engineNameOffset"));
    /// The [VarHandle] of `engineNameOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_engineNameOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineNameOffset"));
    /// The byte offset of `engineVersion`.
    public static final long OFFSET_engineVersion = LAYOUT.byteOffset(PathElement.groupElement("engineVersion"));
    /// The memory layout of `engineVersion`.
    public static final MemoryLayout LAYOUT_engineVersion = LAYOUT.select(PathElement.groupElement("engineVersion"));
    /// The [VarHandle] of `engineVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_engineVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineVersion"));
    /// The byte offset of `apiVersion`.
    public static final long OFFSET_apiVersion = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
    /// The memory layout of `apiVersion`.
    public static final MemoryLayout LAYOUT_apiVersion = LAYOUT.select(PathElement.groupElement("apiVersion"));
    /// The [VarHandle] of `apiVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceFaultVendorBinaryHeaderVersionOneEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT copyFrom(VkDeviceFaultVendorBinaryHeaderVersionOneEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `headerSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int headerSize(MemorySegment segment, long index) { return (int) VH_headerSize.get(segment, 0L, index); }
    /// {@return `headerSize`}
    public int headerSize() { return headerSize(this.segment(), 0L); }
    /// Sets `headerSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void headerSize(MemorySegment segment, long index, int value) { VH_headerSize.set(segment, 0L, index, value); }
    /// Sets `headerSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerSize(int value) { headerSize(this.segment(), 0L, value); return this; }

    /// {@return `headerVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int headerVersion(MemorySegment segment, long index) { return (int) VH_headerVersion.get(segment, 0L, index); }
    /// {@return `headerVersion`}
    public int headerVersion() { return headerVersion(this.segment(), 0L); }
    /// Sets `headerVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void headerVersion(MemorySegment segment, long index, int value) { VH_headerVersion.set(segment, 0L, index, value); }
    /// Sets `headerVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerVersion(int value) { headerVersion(this.segment(), 0L, value); return this; }

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
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT vendorID(int value) { vendorID(this.segment(), 0L, value); return this; }

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
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT deviceID(int value) { deviceID(this.segment(), 0L, value); return this; }

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
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT driverVersion(int value) { driverVersion(this.segment(), 0L, value); return this; }

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
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(MemorySegment value) { pipelineCacheUUID(this.segment(), 0L, value); return this; }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(long index0, byte value) { pipelineCacheUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `applicationNameOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int applicationNameOffset(MemorySegment segment, long index) { return (int) VH_applicationNameOffset.get(segment, 0L, index); }
    /// {@return `applicationNameOffset`}
    public int applicationNameOffset() { return applicationNameOffset(this.segment(), 0L); }
    /// Sets `applicationNameOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void applicationNameOffset(MemorySegment segment, long index, int value) { VH_applicationNameOffset.set(segment, 0L, index, value); }
    /// Sets `applicationNameOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationNameOffset(int value) { applicationNameOffset(this.segment(), 0L, value); return this; }

    /// {@return `applicationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int applicationVersion(MemorySegment segment, long index) { return (int) VH_applicationVersion.get(segment, 0L, index); }
    /// {@return `applicationVersion`}
    public int applicationVersion() { return applicationVersion(this.segment(), 0L); }
    /// Sets `applicationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void applicationVersion(MemorySegment segment, long index, int value) { VH_applicationVersion.set(segment, 0L, index, value); }
    /// Sets `applicationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationVersion(int value) { applicationVersion(this.segment(), 0L, value); return this; }

    /// {@return `engineNameOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int engineNameOffset(MemorySegment segment, long index) { return (int) VH_engineNameOffset.get(segment, 0L, index); }
    /// {@return `engineNameOffset`}
    public int engineNameOffset() { return engineNameOffset(this.segment(), 0L); }
    /// Sets `engineNameOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void engineNameOffset(MemorySegment segment, long index, int value) { VH_engineNameOffset.set(segment, 0L, index, value); }
    /// Sets `engineNameOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineNameOffset(int value) { engineNameOffset(this.segment(), 0L, value); return this; }

    /// {@return `engineVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int engineVersion(MemorySegment segment, long index) { return (int) VH_engineVersion.get(segment, 0L, index); }
    /// {@return `engineVersion`}
    public int engineVersion() { return engineVersion(this.segment(), 0L); }
    /// Sets `engineVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void engineVersion(MemorySegment segment, long index, int value) { VH_engineVersion.set(segment, 0L, index, value); }
    /// Sets `engineVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineVersion(int value) { engineVersion(this.segment(), 0L, value); return this; }

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
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT apiVersion(int value) { apiVersion(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int headerSizeAt(long index) { return headerSize(this.segment(), index); }
        /// Sets `headerSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer headerSizeAt(long index, int value) { headerSize(this.segment(), index, value); return this; }

        /// {@return `headerVersion` at the given index}
        /// @param index the index of the struct buffer
        public int headerVersionAt(long index) { return headerVersion(this.segment(), index); }
        /// Sets `headerVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer headerVersionAt(long index, int value) { headerVersion(this.segment(), index, value); return this; }

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

        /// {@return `driverVersion` at the given index}
        /// @param index the index of the struct buffer
        public int driverVersionAt(long index) { return driverVersion(this.segment(), index); }
        /// Sets `driverVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer driverVersionAt(long index, int value) { driverVersion(this.segment(), index, value); return this; }

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

        /// {@return `applicationNameOffset` at the given index}
        /// @param index the index of the struct buffer
        public int applicationNameOffsetAt(long index) { return applicationNameOffset(this.segment(), index); }
        /// Sets `applicationNameOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer applicationNameOffsetAt(long index, int value) { applicationNameOffset(this.segment(), index, value); return this; }

        /// {@return `applicationVersion` at the given index}
        /// @param index the index of the struct buffer
        public int applicationVersionAt(long index) { return applicationVersion(this.segment(), index); }
        /// Sets `applicationVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer applicationVersionAt(long index, int value) { applicationVersion(this.segment(), index, value); return this; }

        /// {@return `engineNameOffset` at the given index}
        /// @param index the index of the struct buffer
        public int engineNameOffsetAt(long index) { return engineNameOffset(this.segment(), index); }
        /// Sets `engineNameOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer engineNameOffsetAt(long index, int value) { engineNameOffset(this.segment(), index, value); return this; }

        /// {@return `engineVersion` at the given index}
        /// @param index the index of the struct buffer
        public int engineVersionAt(long index) { return engineVersion(this.segment(), index); }
        /// Sets `engineVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer engineVersionAt(long index, int value) { engineVersion(this.segment(), index, value); return this; }

        /// {@return `apiVersion` at the given index}
        /// @param index the index of the struct buffer
        public int apiVersionAt(long index) { return apiVersion(this.segment(), index); }
        /// Sets `apiVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer apiVersionAt(long index, int value) { apiVersion(this.segment(), index, value); return this; }

    }
}
