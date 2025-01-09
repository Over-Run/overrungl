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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### deviceUUID
/// [Byte offset handle][#MH_deviceUUID] - [Memory layout][#ML_deviceUUID] - [Getter][#deviceUUID(long)] - [Setter][#deviceUUID(long, java.lang.foreign.MemorySegment)]
/// ### driverUUID
/// [Byte offset handle][#MH_driverUUID] - [Memory layout][#ML_driverUUID] - [Getter][#driverUUID(long)] - [Setter][#driverUUID(long, java.lang.foreign.MemorySegment)]
/// ### deviceLUID
/// [Byte offset handle][#MH_deviceLUID] - [Memory layout][#ML_deviceLUID] - [Getter][#deviceLUID(long)] - [Setter][#deviceLUID(long, java.lang.foreign.MemorySegment)]
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
public final class VkPhysicalDeviceIDProperties extends Struct {
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset handle of `deviceUUID` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_deviceUUID = LAYOUT.byteOffsetHandle(PathElement.groupElement("deviceUUID"), PathElement.sequenceElement());
    /// The memory layout of `deviceUUID`.
    public static final MemoryLayout ML_deviceUUID = LAYOUT.select(PathElement.groupElement("deviceUUID"));
    /// The byte offset handle of `driverUUID` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_driverUUID = LAYOUT.byteOffsetHandle(PathElement.groupElement("driverUUID"), PathElement.sequenceElement());
    /// The memory layout of `driverUUID`.
    public static final MemoryLayout ML_driverUUID = LAYOUT.select(PathElement.groupElement("driverUUID"));
    /// The byte offset handle of `deviceLUID` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_deviceLUID = LAYOUT.byteOffsetHandle(PathElement.groupElement("deviceLUID"), PathElement.sequenceElement());
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
    public static VkPhysicalDeviceIDProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceIDProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceIDProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceIDProperties`
    public static VkPhysicalDeviceIDProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceIDProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceIDProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceIDProperties`
    public static VkPhysicalDeviceIDProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceIDProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceIDProperties.get_sType(this.segment(), index); }
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
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceIDProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceIDProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceIDProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceIDProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceUUID` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_deviceUUID(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_deviceUUID.invokeExact(0L, elementIndex), index), ML_deviceUUID); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `deviceUUID`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_deviceUUID(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceIDProperties.get_deviceUUID(segment, 0L, elementIndex); }
    /// {@return `deviceUUID` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment deviceUUIDAt(long index, long elementIndex) { return VkPhysicalDeviceIDProperties.get_deviceUUID(this.segment(), index, elementIndex); }
    /// {@return `deviceUUID`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment deviceUUID(long elementIndex) { return VkPhysicalDeviceIDProperties.get_deviceUUID(this.segment(), elementIndex); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_deviceUUID(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_deviceUUID.invokeExact(0L, elementIndex), index), ML_deviceUUID.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `deviceUUID` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_deviceUUID(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceUUID(segment, 0L, elementIndex, value); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceUUIDAt(long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceUUID(this.segment(), index, elementIndex, value); return this; }
    /// Sets `deviceUUID` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceUUID(long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceUUID(this.segment(), elementIndex, value); return this; }

    /// {@return `driverUUID` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_driverUUID(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_driverUUID.invokeExact(0L, elementIndex), index), ML_driverUUID); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `driverUUID`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_driverUUID(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceIDProperties.get_driverUUID(segment, 0L, elementIndex); }
    /// {@return `driverUUID` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment driverUUIDAt(long index, long elementIndex) { return VkPhysicalDeviceIDProperties.get_driverUUID(this.segment(), index, elementIndex); }
    /// {@return `driverUUID`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment driverUUID(long elementIndex) { return VkPhysicalDeviceIDProperties.get_driverUUID(this.segment(), elementIndex); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_driverUUID(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_driverUUID.invokeExact(0L, elementIndex), index), ML_driverUUID.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `driverUUID` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_driverUUID(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_driverUUID(segment, 0L, elementIndex, value); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties driverUUIDAt(long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_driverUUID(this.segment(), index, elementIndex, value); return this; }
    /// Sets `driverUUID` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties driverUUID(long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_driverUUID(this.segment(), elementIndex, value); return this; }

    /// {@return `deviceLUID` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment get_deviceLUID(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_deviceLUID.invokeExact(0L, elementIndex), index), ML_deviceLUID); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `deviceLUID`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment get_deviceLUID(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceIDProperties.get_deviceLUID(segment, 0L, elementIndex); }
    /// {@return `deviceLUID` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment deviceLUIDAt(long index, long elementIndex) { return VkPhysicalDeviceIDProperties.get_deviceLUID(this.segment(), index, elementIndex); }
    /// {@return `deviceLUID`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment deviceLUID(long elementIndex) { return VkPhysicalDeviceIDProperties.get_deviceLUID(this.segment(), elementIndex); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_deviceLUID(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_deviceLUID.invokeExact(0L, elementIndex), index), ML_deviceLUID.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `deviceLUID` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_deviceLUID(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceLUID(segment, 0L, elementIndex, value); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceLUIDAt(long index, long elementIndex, @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceLUID(this.segment(), index, elementIndex, value); return this; }
    /// Sets `deviceLUID` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceLUID(long elementIndex, @CType("uint8_t[VK_LUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceIDProperties.set_deviceLUID(this.segment(), elementIndex, value); return this; }

    /// {@return `deviceNodeMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceNodeMask(MemorySegment segment, long index) { return (int) VH_deviceNodeMask.get(segment, 0L, index); }
    /// {@return `deviceNodeMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceNodeMask(MemorySegment segment) { return VkPhysicalDeviceIDProperties.get_deviceNodeMask(segment, 0L); }
    /// {@return `deviceNodeMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceNodeMaskAt(long index) { return VkPhysicalDeviceIDProperties.get_deviceNodeMask(this.segment(), index); }
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
    /// Sets `deviceNodeMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceNodeMaskAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceIDProperties.set_deviceNodeMask(this.segment(), index, value); return this; }
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
    /// {@return `deviceLUIDValid` at the given index}
    /// @param index the index
    public @CType("VkBool32") int deviceLUIDValidAt(long index) { return VkPhysicalDeviceIDProperties.get_deviceLUIDValid(this.segment(), index); }
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
    /// Sets `deviceLUIDValid` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceLUIDValidAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceIDProperties.set_deviceLUIDValid(this.segment(), index, value); return this; }
    /// Sets `deviceLUIDValid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDProperties deviceLUIDValid(@CType("VkBool32") int value) { VkPhysicalDeviceIDProperties.set_deviceLUIDValid(this.segment(), value); return this; }

}