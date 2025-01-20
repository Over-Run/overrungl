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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### vendorID
/// [VarHandle][#VH_vendorID] - [Getter][#vendorID()] - [Setter][#vendorID(int)]
/// ### deviceID
/// [VarHandle][#VH_deviceID] - [Getter][#deviceID()] - [Setter][#deviceID(int)]
/// ### layeredAPI
/// [VarHandle][#VH_layeredAPI] - [Getter][#layeredAPI()] - [Setter][#layeredAPI(int)]
/// ### deviceName
/// [Byte offset][#OFFSET_deviceName] - [Memory layout][#ML_deviceName] - [Getter][#deviceName()] - [Setter][#deviceName(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceLayeredApiPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     VkPhysicalDeviceLayeredApiKHR layeredAPI;
///     char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE] deviceName;
/// } VkPhysicalDeviceLayeredApiPropertiesKHR;
/// ```
public sealed class VkPhysicalDeviceLayeredApiPropertiesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceLayeredApiPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("layeredAPI"),
        MemoryLayout.sequenceLayout(VK_MAX_PHYSICAL_DEVICE_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("deviceName")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `layeredAPI` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layeredAPI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredAPI"));
    /// The byte offset of `deviceName`.
    public static final long OFFSET_deviceName = LAYOUT.byteOffset(PathElement.groupElement("deviceName"));
    /// The memory layout of `deviceName`.
    public static final MemoryLayout ML_deviceName = LAYOUT.select(PathElement.groupElement("deviceName"));

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceLayeredApiPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int vendorID, @CType("uint32_t") int deviceID, @CType("VkPhysicalDeviceLayeredApiKHR") int layeredAPI, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment deviceName) { return alloc(allocator).sType(sType).pNext(pNext).vendorID(vendorID).deviceID(deviceID).layeredAPI(layeredAPI).deviceName(deviceName); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR copyFrom(VkPhysicalDeviceLayeredApiPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get(segment, 0L, index); }
    /// {@return `vendorID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_vendorID(segment, 0L); }
    /// {@return `vendorID`}
    public @CType("uint32_t") int vendorID() { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_vendorID(this.segment()); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_vendorID.set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vendorID(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_vendorID(segment, 0L, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR vendorID(@CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_vendorID(this.segment(), value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get(segment, 0L, index); }
    /// {@return `deviceID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceID(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceID(segment, 0L); }
    /// {@return `deviceID`}
    public @CType("uint32_t") int deviceID() { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceID(this.segment()); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceID.set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceID(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceID(segment, 0L, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceID(@CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceID(this.segment(), value); return this; }

    /// {@return `layeredAPI` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPhysicalDeviceLayeredApiKHR") int get_layeredAPI(MemorySegment segment, long index) { return (int) VH_layeredAPI.get(segment, 0L, index); }
    /// {@return `layeredAPI`}
    /// @param segment the segment of the struct
    public static @CType("VkPhysicalDeviceLayeredApiKHR") int get_layeredAPI(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_layeredAPI(segment, 0L); }
    /// {@return `layeredAPI`}
    public @CType("VkPhysicalDeviceLayeredApiKHR") int layeredAPI() { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_layeredAPI(this.segment()); }
    /// Sets `layeredAPI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layeredAPI(MemorySegment segment, long index, @CType("VkPhysicalDeviceLayeredApiKHR") int value) { VH_layeredAPI.set(segment, 0L, index, value); }
    /// Sets `layeredAPI` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layeredAPI(MemorySegment segment, @CType("VkPhysicalDeviceLayeredApiKHR") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_layeredAPI(segment, 0L, value); }
    /// Sets `layeredAPI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR layeredAPI(@CType("VkPhysicalDeviceLayeredApiKHR") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_layeredAPI(this.segment(), value); return this; }

    /// {@return `deviceName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment get_deviceName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceName, index), ML_deviceName); }
    /// {@return `deviceName`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment get_deviceName(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceName(segment, 0L); }
    /// {@return `deviceName`}
    public @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment deviceName() { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceName(this.segment()); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceName(MemorySegment segment, long index, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceName, index), ML_deviceName.byteSize()); }
    /// Sets `deviceName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceName(MemorySegment segment, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceName(segment, 0L, value); }
    /// Sets `deviceName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceName(@CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceName(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceLayeredApiPropertiesKHR].
    public static final class Buffer extends VkPhysicalDeviceLayeredApiPropertiesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceLayeredApiPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceLayeredApiPropertiesKHR`
        public VkPhysicalDeviceLayeredApiPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceLayeredApiPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceLayeredApiPropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `vendorID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int vendorIDAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_vendorID(this.segment(), index); }
        /// Sets `vendorID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vendorIDAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_vendorID(this.segment(), index, value); return this; }

        /// {@return `deviceID` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceIDAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceID(this.segment(), index); }
        /// Sets `deviceID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceIDAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceID(this.segment(), index, value); return this; }

        /// {@return `layeredAPI` at the given index}
        /// @param index the index
        public @CType("VkPhysicalDeviceLayeredApiKHR") int layeredAPIAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_layeredAPI(this.segment(), index); }
        /// Sets `layeredAPI` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layeredAPIAt(long index, @CType("VkPhysicalDeviceLayeredApiKHR") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_layeredAPI(this.segment(), index, value); return this; }

        /// {@return `deviceName` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment deviceNameAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceName(this.segment(), index); }
        /// Sets `deviceName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceNameAt(long index, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceName(this.segment(), index, value); return this; }

    }
}
