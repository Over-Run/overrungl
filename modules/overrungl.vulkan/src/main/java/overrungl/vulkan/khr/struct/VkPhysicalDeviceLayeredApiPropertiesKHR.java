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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### vendorID
/// [VarHandle][#VH_vendorID] - [Getter][#vendorID()] - [Setter][#vendorID(int)]
/// ### deviceID
/// [VarHandle][#VH_deviceID] - [Getter][#deviceID()] - [Setter][#deviceID(int)]
/// ### layeredAPI
/// [VarHandle][#VH_layeredAPI] - [Getter][#layeredAPI()] - [Setter][#layeredAPI(int)]
/// ### deviceName
/// [Byte offset handle][#MH_deviceName] - [Memory layout][#ML_deviceName] - [Getter][#deviceName(long)] - [Setter][#deviceName(long, java.lang.foreign.MemorySegment)]
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
public final class VkPhysicalDeviceLayeredApiPropertiesKHR extends Struct {
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `layeredAPI` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layeredAPI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredAPI"));
    /// The byte offset handle of `deviceName` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_deviceName = LAYOUT.byteOffsetHandle(PathElement.groupElement("deviceName"), PathElement.sequenceElement());
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
    public static VkPhysicalDeviceLayeredApiPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLayeredApiPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_sType(this.segment(), index); }
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
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get(segment, 0L, index); }
    /// {@return `vendorID`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_vendorID(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_vendorID(segment, 0L); }
    /// {@return `vendorID` at the given index}
    /// @param index the index
    public @CType("uint32_t") int vendorIDAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_vendorID(this.segment(), index); }
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
    /// Sets `vendorID` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR vendorIDAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_vendorID(this.segment(), index, value); return this; }
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
    /// {@return `deviceID` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceIDAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceID(this.segment(), index); }
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
    /// Sets `deviceID` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceIDAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceID(this.segment(), index, value); return this; }
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
    /// {@return `layeredAPI` at the given index}
    /// @param index the index
    public @CType("VkPhysicalDeviceLayeredApiKHR") int layeredAPIAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_layeredAPI(this.segment(), index); }
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
    /// Sets `layeredAPI` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR layeredAPIAt(long index, @CType("VkPhysicalDeviceLayeredApiKHR") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_layeredAPI(this.segment(), index, value); return this; }
    /// Sets `layeredAPI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR layeredAPI(@CType("VkPhysicalDeviceLayeredApiKHR") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_layeredAPI(this.segment(), value); return this; }

    /// {@return `deviceName` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment get_deviceName(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_deviceName.invokeExact(0L, elementIndex), index), ML_deviceName); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `deviceName`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment get_deviceName(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceName(segment, 0L, elementIndex); }
    /// {@return `deviceName` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment deviceNameAt(long index, long elementIndex) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceName(this.segment(), index, elementIndex); }
    /// {@return `deviceName`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment deviceName(long elementIndex) { return VkPhysicalDeviceLayeredApiPropertiesKHR.get_deviceName(this.segment(), elementIndex); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_deviceName(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_deviceName.invokeExact(0L, elementIndex), index), ML_deviceName.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `deviceName` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_deviceName(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceName(segment, 0L, elementIndex, value); }
    /// Sets `deviceName` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceNameAt(long index, long elementIndex, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceName(this.segment(), index, elementIndex, value); return this; }
    /// Sets `deviceName` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceName(long elementIndex, @CType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesKHR.set_deviceName(this.segment(), elementIndex, value); return this; }

}