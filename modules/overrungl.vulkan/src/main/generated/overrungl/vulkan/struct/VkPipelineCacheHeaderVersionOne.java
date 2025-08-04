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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineCacheHeaderVersionOne {
///     uint32_t headerSize;
///     (int) VkPipelineCacheHeaderVersion headerVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint8_t pipelineCacheUUID[16];
/// };
/// ```
public final class VkPipelineCacheHeaderVersionOne extends GroupType {
    /// The struct layout of `VkPipelineCacheHeaderVersionOne`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID")
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
    /// The byte offset of `pipelineCacheUUID`.
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    /// The memory layout of `pipelineCacheUUID`.
    public static final MemoryLayout LAYOUT_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));
    /// The [VarHandle] of `pipelineCacheUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_pipelineCacheUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCacheHeaderVersionOne(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionOne of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionOne(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionOne ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionOne(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionOne ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionOne(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCacheHeaderVersionOne` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheHeaderVersionOne`
    public static VkPipelineCacheHeaderVersionOne alloc(SegmentAllocator allocator) { return new VkPipelineCacheHeaderVersionOne(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCacheHeaderVersionOne` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheHeaderVersionOne`
    public static VkPipelineCacheHeaderVersionOne alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheHeaderVersionOne(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne copyFrom(VkPipelineCacheHeaderVersionOne src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCacheHeaderVersionOne reinterpret(long count) { return new VkPipelineCacheHeaderVersionOne(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineCacheHeaderVersionOne headerSize(int value) { headerSize(this.segment(), 0L, value); return this; }

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
    public VkPipelineCacheHeaderVersionOne headerVersion(int value) { headerVersion(this.segment(), 0L, value); return this; }

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
    public VkPipelineCacheHeaderVersionOne vendorID(int value) { vendorID(this.segment(), 0L, value); return this; }

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
    public VkPipelineCacheHeaderVersionOne deviceID(int value) { deviceID(this.segment(), 0L, value); return this; }

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
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(MemorySegment value) { pipelineCacheUUID(this.segment(), 0L, value); return this; }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(long index0, byte value) { pipelineCacheUUID(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPipelineCacheHeaderVersionOne`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCacheHeaderVersionOne`
    public VkPipelineCacheHeaderVersionOne asSlice(long index) { return new VkPipelineCacheHeaderVersionOne(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCacheHeaderVersionOne`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCacheHeaderVersionOne`
    public VkPipelineCacheHeaderVersionOne asSlice(long index, long count) { return new VkPipelineCacheHeaderVersionOne(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCacheHeaderVersionOne` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne at(long index, Consumer<VkPipelineCacheHeaderVersionOne> func) { func.accept(asSlice(index)); return this; }

    /// {@return `headerSize` at the given index}
    /// @param index the index of the struct buffer
    public int headerSizeAt(long index) { return headerSize(this.segment(), index); }
    /// Sets `headerSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne headerSizeAt(long index, int value) { headerSize(this.segment(), index, value); return this; }

    /// {@return `headerVersion` at the given index}
    /// @param index the index of the struct buffer
    public int headerVersionAt(long index) { return headerVersion(this.segment(), index); }
    /// Sets `headerVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne headerVersionAt(long index, int value) { headerVersion(this.segment(), index, value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param index the index of the struct buffer
    public int vendorIDAt(long index) { return vendorID(this.segment(), index); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne vendorIDAt(long index, int value) { vendorID(this.segment(), index, value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param index the index of the struct buffer
    public int deviceIDAt(long index) { return deviceID(this.segment(), index); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne deviceIDAt(long index, int value) { deviceID(this.segment(), index, value); return this; }

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
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUIDAt(long index, MemorySegment value) { pipelineCacheUUID(this.segment(), index, value); return this; }
    /// Sets `pipelineCacheUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUIDAt(long index, long index0, byte value) { pipelineCacheUUID(this.segment(), index, index0, value); return this; }

}
