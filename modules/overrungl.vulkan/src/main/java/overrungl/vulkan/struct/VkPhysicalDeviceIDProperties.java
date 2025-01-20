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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### deviceUUID
/// [Byte offset][#OFFSET_deviceUUID] - [Memory layout][#ML_deviceUUID] - [Getter][#deviceUUID()] - [Setter][#deviceUUID(MemorySegment)]
/// ### driverUUID
/// [Byte offset][#OFFSET_driverUUID] - [Memory layout][#ML_driverUUID] - [Getter][#driverUUID()] - [Setter][#driverUUID(MemorySegment)]
/// ### deviceLUID
/// [Byte offset][#OFFSET_deviceLUID] - [Memory layout][#ML_deviceLUID] - [Getter][#deviceLUID()] - [Setter][#deviceLUID(MemorySegment)]
/// ### deviceNodeMask
/// [VarHandle][#VH_deviceNodeMask] - [Getter][#deviceNodeMask()] - [Setter][#deviceNodeMask(int)]
/// ### deviceLUIDValid
/// [VarHandle][#VH_deviceLUIDValid] - [Getter][#deviceLUIDValid()] - [Setter][#deviceLUIDValid(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceIDProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint8_t[VK_UUID_SIZE] deviceUUID;
///     uint8_t[VK_UUID_SIZE] driverUUID;
///     uint8_t[VK_LUID_SIZE] deviceLUID;
///     uint32_t deviceNodeMask;
///     VkBool32 deviceLUIDValid;
/// } VkPhysicalDeviceIDProperties;
/// ```
public sealed class VkPhysicalDeviceIDProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceIDProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(VK_LUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
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

    /// Creates `VkPhysicalDeviceIDProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceIDProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceIDProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceIDProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceIDProperties(segment); }

    /// Creates `VkPhysicalDeviceIDProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceIDProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceIDProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceIDProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceIDProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceIDProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceIDProperties`
    public static VkPhysicalDeviceIDProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceIDProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceIDProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceIDProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceIDProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceIDProperties`
    public static VkPhysicalDeviceIDProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment deviceUUID, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment driverUUID, @CType("uint8_t[VK_LUID_SIZE]") MemorySegment deviceLUID, @CType("uint32_t") int deviceNodeMask, @CType("VkBool32") int deviceLUIDValid) { return alloc(allocator).sType(sType).pNext(pNext).deviceUUID(deviceUUID).driverUUID(driverUUID).deviceLUID(deviceLUID).deviceNodeMask(deviceNodeMask).deviceLUIDValid(deviceLUIDValid); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceIDProperties copyFrom(VkPhysicalDeviceIDProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceIDProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceIDProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceIDProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceIDProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceIDProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceIDProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") MemorySegment get_deviceUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceUUID, index), ML_deviceUUID); }
    /// {@return `deviceUUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") MemorySegment get_deviceUUID(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_deviceUUID(segment, 0L); }
    /// {@return `deviceUUID`}
    public @CType("uint8_t[VK_UUID_SIZE]") MemorySegment deviceUUID() { return VkPhysicalDeviceIDProperties.get_deviceUUID(this.segment()); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceUUID(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceUUID, index), ML_deviceUUID.byteSize()); }
    /// Sets `deviceUUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceUUID(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceUUID(segment, 0L, value); }
    /// Sets `deviceUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceUUID(@CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceUUID(this.segment(), value); return this; }

    /// {@return `driverUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") MemorySegment get_driverUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverUUID, index), ML_driverUUID); }
    /// {@return `driverUUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") MemorySegment get_driverUUID(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_driverUUID(segment, 0L); }
    /// {@return `driverUUID`}
    public @CType("uint8_t[VK_UUID_SIZE]") MemorySegment driverUUID() { return VkPhysicalDeviceIDProperties.get_driverUUID(this.segment()); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverUUID(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverUUID, index), ML_driverUUID.byteSize()); }
    /// Sets `driverUUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverUUID(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_driverUUID(segment, 0L, value); }
    /// Sets `driverUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties driverUUID(@CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_driverUUID(this.segment(), value); return this; }

    /// {@return `deviceLUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_LUID_SIZE]") MemorySegment get_deviceLUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceLUID, index), ML_deviceLUID); }
    /// {@return `deviceLUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_LUID_SIZE]") MemorySegment get_deviceLUID(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_deviceLUID(segment, 0L); }
    /// {@return `deviceLUID`}
    public @CType("uint8_t[VK_LUID_SIZE]") MemorySegment deviceLUID() { return VkPhysicalDeviceIDProperties.get_deviceLUID(this.segment()); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceLUID(MemorySegment segment, long index, @CType("uint8_t[VK_LUID_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceLUID, index), ML_deviceLUID.byteSize()); }
    /// Sets `deviceLUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceLUID(MemorySegment segment, @CType("uint8_t[VK_LUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceLUID(segment, 0L, value); }
    /// Sets `deviceLUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceLUID(@CType("uint8_t[VK_LUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceLUID(this.segment(), value); return this; }

    /// {@return `deviceNodeMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceNodeMask(MemorySegment segment, long index) { return (int) VH_deviceNodeMask.get(segment, 0L, index); }
    /// {@return `deviceNodeMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceNodeMask(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_deviceNodeMask(segment, 0L); }
    /// {@return `deviceNodeMask`}
    public @CType("uint32_t") int deviceNodeMask() { return VkPhysicalDeviceIDProperties.get_deviceNodeMask(this.segment()); }
    /// Sets `deviceNodeMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceNodeMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceNodeMask.set(segment, 0L, index, value); }
    /// Sets `deviceNodeMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceNodeMask(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceIDProperties.set_deviceNodeMask(segment, 0L, value); }
    /// Sets `deviceNodeMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceNodeMask(@CType("uint32_t") int value) { VkPhysicalDeviceIDProperties.set_deviceNodeMask(this.segment(), value); return this; }

    /// {@return `deviceLUIDValid` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceLUIDValid(MemorySegment segment, long index) { return (int) VH_deviceLUIDValid.get(segment, 0L, index); }
    /// {@return `deviceLUIDValid`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceLUIDValid(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_deviceLUIDValid(segment, 0L); }
    /// {@return `deviceLUIDValid`}
    public @CType("VkBool32") int deviceLUIDValid() { return VkPhysicalDeviceIDProperties.get_deviceLUIDValid(this.segment()); }
    /// Sets `deviceLUIDValid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceLUIDValid(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceLUIDValid.set(segment, 0L, index, value); }
    /// Sets `deviceLUIDValid` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceLUIDValid(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceIDProperties.set_deviceLUIDValid(segment, 0L, value); }
    /// Sets `deviceLUIDValid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceLUIDValid(@CType("VkBool32") int value) { VkPhysicalDeviceIDProperties.set_deviceLUIDValid(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceIDProperties].
    public static final class Buffer extends VkPhysicalDeviceIDProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceIDProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceIDProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceIDProperties`
        public VkPhysicalDeviceIDProperties asSlice(long index) { return new VkPhysicalDeviceIDProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceIDProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceIDProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceIDProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceIDProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceIDProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceIDProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `deviceUUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") MemorySegment deviceUUIDAt(long index) { return VkPhysicalDeviceIDProperties.get_deviceUUID(this.segment(), index); }
        /// Sets `deviceUUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceUUIDAt(long index, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceUUID(this.segment(), index, value); return this; }

        /// {@return `driverUUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") MemorySegment driverUUIDAt(long index) { return VkPhysicalDeviceIDProperties.get_driverUUID(this.segment(), index); }
        /// Sets `driverUUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverUUIDAt(long index, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_driverUUID(this.segment(), index, value); return this; }

        /// {@return `deviceLUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_LUID_SIZE]") MemorySegment deviceLUIDAt(long index) { return VkPhysicalDeviceIDProperties.get_deviceLUID(this.segment(), index); }
        /// Sets `deviceLUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceLUIDAt(long index, @CType("uint8_t[VK_LUID_SIZE]") MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceLUID(this.segment(), index, value); return this; }

        /// {@return `deviceNodeMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceNodeMaskAt(long index) { return VkPhysicalDeviceIDProperties.get_deviceNodeMask(this.segment(), index); }
        /// Sets `deviceNodeMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceNodeMaskAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceIDProperties.set_deviceNodeMask(this.segment(), index, value); return this; }

        /// {@return `deviceLUIDValid` at the given index}
        /// @param index the index
        public @CType("VkBool32") int deviceLUIDValidAt(long index) { return VkPhysicalDeviceIDProperties.get_deviceLUIDValid(this.segment(), index); }
        /// Sets `deviceLUIDValid` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceLUIDValidAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceIDProperties.set_deviceLUIDValid(this.segment(), index, value); return this; }

    }
}
