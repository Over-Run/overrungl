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

/// ## Members
/// ### headerSize
/// [VarHandle][#VH_headerSize] - [Getter][#headerSize()] - [Setter][#headerSize(int)]
/// ### headerVersion
/// [VarHandle][#VH_headerVersion] - [Getter][#headerVersion()] - [Setter][#headerVersion(int)]
/// ### vendorID
/// [VarHandle][#VH_vendorID] - [Getter][#vendorID()] - [Setter][#vendorID(int)]
/// ### deviceID
/// [VarHandle][#VH_deviceID] - [Getter][#deviceID()] - [Setter][#deviceID(int)]
/// ### pipelineCacheUUID
/// [Byte offset][#OFFSET_pipelineCacheUUID] - [Memory layout][#ML_pipelineCacheUUID] - [Getter][#pipelineCacheUUID()] - [Setter][#pipelineCacheUUID(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCacheHeaderVersionOne {
///     uint32_t headerSize;
///     VkPipelineCacheHeaderVersion headerVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint8_t[VK_UUID_SIZE] pipelineCacheUUID;
/// } VkPipelineCacheHeaderVersionOne;
/// ```
public sealed class VkPipelineCacheHeaderVersionOne extends Struct {
    /// The struct layout of `VkPipelineCacheHeaderVersionOne`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID")
    );
    /// The [VarHandle] of `headerSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_headerSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerSize"));
    /// The [VarHandle] of `headerVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_headerVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerVersion"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    /// The byte offset of `pipelineCacheUUID`.
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    /// The memory layout of `pipelineCacheUUID`.
    public static final MemoryLayout ML_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCacheHeaderVersionOne(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionOne of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionOne(segment); }

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionOne ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionOne(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCacheHeaderVersionOne` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineCacheHeaderVersionOne` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheHeaderVersionOne`
    public static VkPipelineCacheHeaderVersionOne alloc(SegmentAllocator allocator) { return new VkPipelineCacheHeaderVersionOne(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCacheHeaderVersionOne` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheHeaderVersionOne`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineCacheHeaderVersionOne` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheHeaderVersionOne`
    public static VkPipelineCacheHeaderVersionOne allocInit(SegmentAllocator allocator, @CType("uint32_t") int headerSize, @CType("VkPipelineCacheHeaderVersion") int headerVersion, @CType("uint32_t") int vendorID, @CType("uint32_t") int deviceID, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUID) { return alloc(allocator).headerSize(headerSize).headerVersion(headerVersion).vendorID(vendorID).deviceID(deviceID).pipelineCacheUUID(pipelineCacheUUID); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne copyFrom(VkPipelineCacheHeaderVersionOne src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `headerSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_headerSize(MemorySegment segment, long index) { return (int) VH_headerSize.get(segment, 0L, index); }
    /// {@return `headerSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_headerSize(MemorySegment segment) { return VkPipelineCacheHeaderVersionOne.get_headerSize(segment, 0L); }
    /// {@return `headerSize`}
    public @CType("uint32_t") int headerSize() { return VkPipelineCacheHeaderVersionOne.get_headerSize(this.segment()); }
    /// Sets `headerSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_headerSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_headerSize.set(segment, 0L, index, value); }
    /// Sets `headerSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_headerSize(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_headerSize(segment, 0L, value); }
    /// Sets `headerSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne headerSize(@CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_headerSize(this.segment(), value); return this; }

    /// {@return `headerVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCacheHeaderVersion") int get_headerVersion(MemorySegment segment, long index) { return (int) VH_headerVersion.get(segment, 0L, index); }
    /// {@return `headerVersion`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCacheHeaderVersion") int get_headerVersion(MemorySegment segment) { return VkPipelineCacheHeaderVersionOne.get_headerVersion(segment, 0L); }
    /// {@return `headerVersion`}
    public @CType("VkPipelineCacheHeaderVersion") int headerVersion() { return VkPipelineCacheHeaderVersionOne.get_headerVersion(this.segment()); }
    /// Sets `headerVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_headerVersion(MemorySegment segment, long index, @CType("VkPipelineCacheHeaderVersion") int value) { VH_headerVersion.set(segment, 0L, index, value); }
    /// Sets `headerVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_headerVersion(MemorySegment segment, @CType("VkPipelineCacheHeaderVersion") int value) { VkPipelineCacheHeaderVersionOne.set_headerVersion(segment, 0L, value); }
    /// Sets `headerVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne headerVersion(@CType("VkPipelineCacheHeaderVersion") int value) { VkPipelineCacheHeaderVersionOne.set_headerVersion(this.segment(), value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get(segment, 0L, index); }
    /// {@return `vendorID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment) { return VkPipelineCacheHeaderVersionOne.get_vendorID(segment, 0L); }
    /// {@return `vendorID`}
    public @CType("uint32_t") int vendorID() { return VkPipelineCacheHeaderVersionOne.get_vendorID(this.segment()); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vendorID.set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_vendorID(segment, 0L, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne vendorID(@CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_vendorID(this.segment(), value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get(segment, 0L, index); }
    /// {@return `deviceID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment) { return VkPipelineCacheHeaderVersionOne.get_deviceID(segment, 0L); }
    /// {@return `deviceID`}
    public @CType("uint32_t") int deviceID() { return VkPipelineCacheHeaderVersionOne.get_deviceID(this.segment()); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceID.set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_deviceID(segment, 0L, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne deviceID(@CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_deviceID(this.segment(), value); return this; }

    /// {@return `pipelineCacheUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineCacheUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pipelineCacheUUID, index), ML_pipelineCacheUUID); }
    /// {@return `pipelineCacheUUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineCacheUUID(MemorySegment segment) { return VkPipelineCacheHeaderVersionOne.get_pipelineCacheUUID(segment, 0L); }
    /// {@return `pipelineCacheUUID`}
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUID() { return VkPipelineCacheHeaderVersionOne.get_pipelineCacheUUID(this.segment()); }
    /// Sets `pipelineCacheUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineCacheUUID(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pipelineCacheUUID, index), ML_pipelineCacheUUID.byteSize()); }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineCacheUUID(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineCacheHeaderVersionOne.set_pipelineCacheUUID(segment, 0L, value); }
    /// Sets `pipelineCacheUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(@CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineCacheHeaderVersionOne.set_pipelineCacheUUID(this.segment(), value); return this; }

    /// A buffer of [VkPipelineCacheHeaderVersionOne].
    public static final class Buffer extends VkPipelineCacheHeaderVersionOne {
        private final long elementCount;

        /// Creates `VkPipelineCacheHeaderVersionOne.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineCacheHeaderVersionOne`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineCacheHeaderVersionOne`
        public VkPipelineCacheHeaderVersionOne asSlice(long index) { return new VkPipelineCacheHeaderVersionOne(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineCacheHeaderVersionOne`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineCacheHeaderVersionOne`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `headerSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int headerSizeAt(long index) { return VkPipelineCacheHeaderVersionOne.get_headerSize(this.segment(), index); }
        /// Sets `headerSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer headerSizeAt(long index, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_headerSize(this.segment(), index, value); return this; }

        /// {@return `headerVersion` at the given index}
        /// @param index the index
        public @CType("VkPipelineCacheHeaderVersion") int headerVersionAt(long index) { return VkPipelineCacheHeaderVersionOne.get_headerVersion(this.segment(), index); }
        /// Sets `headerVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer headerVersionAt(long index, @CType("VkPipelineCacheHeaderVersion") int value) { VkPipelineCacheHeaderVersionOne.set_headerVersion(this.segment(), index, value); return this; }

        /// {@return `vendorID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vendorIDAt(long index) { return VkPipelineCacheHeaderVersionOne.get_vendorID(this.segment(), index); }
        /// Sets `vendorID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorIDAt(long index, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_vendorID(this.segment(), index, value); return this; }

        /// {@return `deviceID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceIDAt(long index) { return VkPipelineCacheHeaderVersionOne.get_deviceID(this.segment(), index); }
        /// Sets `deviceID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceIDAt(long index, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.set_deviceID(this.segment(), index, value); return this; }

        /// {@return `pipelineCacheUUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineCacheUUIDAt(long index) { return VkPipelineCacheHeaderVersionOne.get_pipelineCacheUUID(this.segment(), index); }
        /// Sets `pipelineCacheUUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineCacheUUIDAt(long index, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineCacheHeaderVersionOne.set_pipelineCacheUUID(this.segment(), index, value); return this; }

    }
}
