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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceIDPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint8_t deviceUUID[16];
///     uint8_t driverUUID[16];
///     uint8_t deviceLUID[8];
///     uint32_t deviceNodeMask;
///     (uint32_t) VkBool32 deviceLUIDValid;
/// };
/// ```
public final class VkPhysicalDeviceIDPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceIDPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(8, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `deviceUUID`.
    public static final long OFFSET_deviceUUID = LAYOUT.byteOffset(PathElement.groupElement("deviceUUID"));
    /// The memory layout of `deviceUUID`.
    public static final MemoryLayout LAYOUT_deviceUUID = LAYOUT.select(PathElement.groupElement("deviceUUID"));
    /// The [VarHandle] of `deviceUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_deviceUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceUUID"), PathElement.sequenceElement());
    /// The byte offset of `driverUUID`.
    public static final long OFFSET_driverUUID = LAYOUT.byteOffset(PathElement.groupElement("driverUUID"));
    /// The memory layout of `driverUUID`.
    public static final MemoryLayout LAYOUT_driverUUID = LAYOUT.select(PathElement.groupElement("driverUUID"));
    /// The [VarHandle] of `driverUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_driverUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverUUID"), PathElement.sequenceElement());
    /// The byte offset of `deviceLUID`.
    public static final long OFFSET_deviceLUID = LAYOUT.byteOffset(PathElement.groupElement("deviceLUID"));
    /// The memory layout of `deviceLUID`.
    public static final MemoryLayout LAYOUT_deviceLUID = LAYOUT.select(PathElement.groupElement("deviceLUID"));
    /// The [VarHandle] of `deviceLUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_deviceLUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUID"), PathElement.sequenceElement());
    /// The byte offset of `deviceNodeMask`.
    public static final long OFFSET_deviceNodeMask = LAYOUT.byteOffset(PathElement.groupElement("deviceNodeMask"));
    /// The memory layout of `deviceNodeMask`.
    public static final MemoryLayout LAYOUT_deviceNodeMask = LAYOUT.select(PathElement.groupElement("deviceNodeMask"));
    /// The [VarHandle] of `deviceNodeMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceNodeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceNodeMask"));
    /// The byte offset of `deviceLUIDValid`.
    public static final long OFFSET_deviceLUIDValid = LAYOUT.byteOffset(PathElement.groupElement("deviceLUIDValid"));
    /// The memory layout of `deviceLUIDValid`.
    public static final MemoryLayout LAYOUT_deviceLUIDValid = LAYOUT.select(PathElement.groupElement("deviceLUIDValid"));
    /// The [VarHandle] of `deviceLUIDValid` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceLUIDValid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceLUIDValid"));

    /// Creates `VkPhysicalDeviceIDPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceIDPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceIDPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceIDPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIDPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceIDPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceIDPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIDPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceIDPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceIDPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceIDPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceIDPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceIDPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceUUID `deviceUUID`
    /// @param driverUUID `driverUUID`
    /// @param deviceLUID `deviceLUID`
    /// @param deviceNodeMask `deviceNodeMask`
    /// @param deviceLUIDValid `deviceLUIDValid`
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment deviceUUID, MemorySegment driverUUID, MemorySegment deviceLUID, int deviceNodeMask, int deviceLUIDValid) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceUUID(deviceUUID).driverUUID(driverUUID).deviceLUID(deviceLUID).deviceNodeMask(deviceNodeMask).deviceLUIDValid(deviceLUIDValid);
    }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceUUID `deviceUUID`
    /// @param driverUUID `driverUUID`
    /// @param deviceLUID `deviceLUID`
    /// @param deviceNodeMask `deviceNodeMask`
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment deviceUUID, MemorySegment driverUUID, MemorySegment deviceLUID, int deviceNodeMask) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceUUID(deviceUUID).driverUUID(driverUUID).deviceLUID(deviceLUID).deviceNodeMask(deviceNodeMask);
    }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceUUID `deviceUUID`
    /// @param driverUUID `driverUUID`
    /// @param deviceLUID `deviceLUID`
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment deviceUUID, MemorySegment driverUUID, MemorySegment deviceLUID) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceUUID(deviceUUID).driverUUID(driverUUID).deviceLUID(deviceLUID);
    }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceUUID `deviceUUID`
    /// @param driverUUID `driverUUID`
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment deviceUUID, MemorySegment driverUUID) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceUUID(deviceUUID).driverUUID(driverUUID);
    }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceUUID `deviceUUID`
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment deviceUUID) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceUUID(deviceUUID);
    }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceIDPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceIDPropertiesKHR`
    public static VkPhysicalDeviceIDPropertiesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR copyFrom(VkPhysicalDeviceIDPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceIDPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceIDPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment deviceUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceUUID, index), LAYOUT_deviceUUID); }
    /// {@return `deviceUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte deviceUUID(MemorySegment segment, long index, long index0) { return (byte) VH_deviceUUID.get(segment, 0L, index, index0); }
    /// {@return `deviceUUID`}
    public MemorySegment deviceUUID() { return deviceUUID(this.segment(), 0L); }
    /// {@return `deviceUUID`}
    /// @param index0 the Index 0 of the array
    public byte deviceUUID(long index0) { return deviceUUID(this.segment(), 0L, index0); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceUUID, index), LAYOUT_deviceUUID.byteSize()); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void deviceUUID(MemorySegment segment, long index, long index0, byte value) { VH_deviceUUID.set(segment, 0L, index, index0, value); }
    /// Sets `deviceUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceUUID(MemorySegment value) { deviceUUID(this.segment(), 0L, value); return this; }
    /// Sets `deviceUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceUUID(long index0, byte value) { deviceUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `driverUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment driverUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverUUID, index), LAYOUT_driverUUID); }
    /// {@return `driverUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte driverUUID(MemorySegment segment, long index, long index0) { return (byte) VH_driverUUID.get(segment, 0L, index, index0); }
    /// {@return `driverUUID`}
    public MemorySegment driverUUID() { return driverUUID(this.segment(), 0L); }
    /// {@return `driverUUID`}
    /// @param index0 the Index 0 of the array
    public byte driverUUID(long index0) { return driverUUID(this.segment(), 0L, index0); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverUUID, index), LAYOUT_driverUUID.byteSize()); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void driverUUID(MemorySegment segment, long index, long index0, byte value) { VH_driverUUID.set(segment, 0L, index, index0, value); }
    /// Sets `driverUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR driverUUID(MemorySegment value) { driverUUID(this.segment(), 0L, value); return this; }
    /// Sets `driverUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR driverUUID(long index0, byte value) { driverUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `deviceLUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment deviceLUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_deviceLUID, index), LAYOUT_deviceLUID); }
    /// {@return `deviceLUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte deviceLUID(MemorySegment segment, long index, long index0) { return (byte) VH_deviceLUID.get(segment, 0L, index, index0); }
    /// {@return `deviceLUID`}
    public MemorySegment deviceLUID() { return deviceLUID(this.segment(), 0L); }
    /// {@return `deviceLUID`}
    /// @param index0 the Index 0 of the array
    public byte deviceLUID(long index0) { return deviceLUID(this.segment(), 0L, index0); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceLUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_deviceLUID, index), LAYOUT_deviceLUID.byteSize()); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void deviceLUID(MemorySegment segment, long index, long index0, byte value) { VH_deviceLUID.set(segment, 0L, index, index0, value); }
    /// Sets `deviceLUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceLUID(MemorySegment value) { deviceLUID(this.segment(), 0L, value); return this; }
    /// Sets `deviceLUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceLUID(long index0, byte value) { deviceLUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `deviceNodeMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceNodeMask(MemorySegment segment, long index) { return (int) VH_deviceNodeMask.get(segment, 0L, index); }
    /// {@return `deviceNodeMask`}
    public int deviceNodeMask() { return deviceNodeMask(this.segment(), 0L); }
    /// Sets `deviceNodeMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceNodeMask(MemorySegment segment, long index, int value) { VH_deviceNodeMask.set(segment, 0L, index, value); }
    /// Sets `deviceNodeMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceNodeMask(int value) { deviceNodeMask(this.segment(), 0L, value); return this; }

    /// {@return `deviceLUIDValid` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceLUIDValid(MemorySegment segment, long index) { return (int) VH_deviceLUIDValid.get(segment, 0L, index); }
    /// {@return `deviceLUIDValid`}
    public int deviceLUIDValid() { return deviceLUIDValid(this.segment(), 0L); }
    /// Sets `deviceLUIDValid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceLUIDValid(MemorySegment segment, long index, int value) { VH_deviceLUIDValid.set(segment, 0L, index, value); }
    /// Sets `deviceLUIDValid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceLUIDValid(int value) { deviceLUIDValid(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceIDPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceIDPropertiesKHR`
    public VkPhysicalDeviceIDPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceIDPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceIDPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceIDPropertiesKHR`
    public VkPhysicalDeviceIDPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceIDPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceIDPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR at(long index, Consumer<VkPhysicalDeviceIDPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `deviceUUID` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment deviceUUIDAt(long index) { return deviceUUID(this.segment(), index); }
    /// {@return `deviceUUID` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte deviceUUIDAt(long index, long index0) { return deviceUUID(this.segment(), index, index0); }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceUUIDAt(long index, MemorySegment value) { deviceUUID(this.segment(), index, value); return this; }
    /// Sets `deviceUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceUUIDAt(long index, long index0, byte value) { deviceUUID(this.segment(), index, index0, value); return this; }

    /// {@return `driverUUID` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment driverUUIDAt(long index) { return driverUUID(this.segment(), index); }
    /// {@return `driverUUID` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte driverUUIDAt(long index, long index0) { return driverUUID(this.segment(), index, index0); }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR driverUUIDAt(long index, MemorySegment value) { driverUUID(this.segment(), index, value); return this; }
    /// Sets `driverUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR driverUUIDAt(long index, long index0, byte value) { driverUUID(this.segment(), index, index0, value); return this; }

    /// {@return `deviceLUID` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment deviceLUIDAt(long index) { return deviceLUID(this.segment(), index); }
    /// {@return `deviceLUID` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte deviceLUIDAt(long index, long index0) { return deviceLUID(this.segment(), index, index0); }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceLUIDAt(long index, MemorySegment value) { deviceLUID(this.segment(), index, value); return this; }
    /// Sets `deviceLUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceLUIDAt(long index, long index0, byte value) { deviceLUID(this.segment(), index, index0, value); return this; }

    /// {@return `deviceNodeMask` at the given index}
    /// @param index the index of the struct buffer
    public int deviceNodeMaskAt(long index) { return deviceNodeMask(this.segment(), index); }
    /// Sets `deviceNodeMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceNodeMaskAt(long index, int value) { deviceNodeMask(this.segment(), index, value); return this; }

    /// {@return `deviceLUIDValid` at the given index}
    /// @param index the index of the struct buffer
    public int deviceLUIDValidAt(long index) { return deviceLUIDValid(this.segment(), index); }
    /// Sets `deviceLUIDValid` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceIDPropertiesKHR deviceLUIDValidAt(long index, int value) { deviceLUIDValid(this.segment(), index, value); return this; }

}
