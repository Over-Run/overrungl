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
import static overrungl.vulkan.VK12.*;
import static overrungl.vulkan.VK12.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### driverID
/// [VarHandle][#VH_driverID] - [Getter][#driverID()] - [Setter][#driverID(int)]
/// ### driverName
/// [Byte offset handle][#MH_driverName] - [Memory layout][#ML_driverName] - [Getter][#driverName(long)] - [Setter][#driverName(long, java.lang.foreign.MemorySegment)]
/// ### driverInfo
/// [Byte offset handle][#MH_driverInfo] - [Memory layout][#ML_driverInfo] - [Getter][#driverInfo(long)] - [Setter][#driverInfo(long, java.lang.foreign.MemorySegment)]
/// ### conformanceVersion
/// [Byte offset][#OFFSET_conformanceVersion] - [Memory layout][#ML_conformanceVersion] - [Getter][#conformanceVersion()] - [Setter][#conformanceVersion(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDriverProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkDriverId driverID;
///     char[VK_MAX_DRIVER_NAME_SIZE] driverName;
///     char[VK_MAX_DRIVER_INFO_SIZE] driverInfo;
///     VkConformanceVersion conformanceVersion;
/// } VkPhysicalDeviceDriverProperties;
/// ```
public final class VkPhysicalDeviceDriverProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceDriverProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("driverID"),
        MemoryLayout.sequenceLayout(VK_MAX_DRIVER_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("driverName"),
        MemoryLayout.sequenceLayout(VK_MAX_DRIVER_INFO_SIZE, ValueLayout.JAVA_BYTE).withName("driverInfo"),
        overrungl.vulkan.struct.VkConformanceVersion.LAYOUT.withName("conformanceVersion")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `driverID` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_driverID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverID"));
    /// The byte offset handle of `driverName` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_driverName = LAYOUT.byteOffsetHandle(PathElement.groupElement("driverName"), PathElement.sequenceElement());
    /// The memory layout of `driverName`.
    public static final MemoryLayout ML_driverName = LAYOUT.select(PathElement.groupElement("driverName"));
    /// The byte offset handle of `driverInfo` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_driverInfo = LAYOUT.byteOffsetHandle(PathElement.groupElement("driverInfo"), PathElement.sequenceElement());
    /// The memory layout of `driverInfo`.
    public static final MemoryLayout ML_driverInfo = LAYOUT.select(PathElement.groupElement("driverInfo"));
    /// The byte offset of `conformanceVersion`.
    public static final long OFFSET_conformanceVersion = LAYOUT.byteOffset(PathElement.groupElement("conformanceVersion"));
    /// The memory layout of `conformanceVersion`.
    public static final MemoryLayout ML_conformanceVersion = LAYOUT.select(PathElement.groupElement("conformanceVersion"));

    /// Creates `VkPhysicalDeviceDriverProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDriverProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDriverProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDriverProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverProperties(segment); }

    /// Creates `VkPhysicalDeviceDriverProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDriverProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDriverProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDriverProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDriverProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceDriverProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDriverProperties`
    public static VkPhysicalDeviceDriverProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDriverProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDriverProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDriverProperties`
    public static VkPhysicalDeviceDriverProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDriverProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDriverProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDriverProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDriverProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDriverProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDriverProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDriverProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDriverProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDriverProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDriverProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `driverID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDriverId") int get_driverID(MemorySegment segment, long index) { return (int) VH_driverID.get(segment, 0L, index); }
    /// {@return `driverID`}
    /// @param segment the segment of the struct
    public static @CType("VkDriverId") int get_driverID(MemorySegment segment) { return VkPhysicalDeviceDriverProperties.get_driverID(segment, 0L); }
    /// {@return `driverID` at the given index}
    /// @param index the index
    public @CType("VkDriverId") int driverIDAt(long index) { return VkPhysicalDeviceDriverProperties.get_driverID(this.segment(), index); }
    /// {@return `driverID`}
    public @CType("VkDriverId") int driverID() { return VkPhysicalDeviceDriverProperties.get_driverID(this.segment()); }
    /// Sets `driverID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverID(MemorySegment segment, long index, @CType("VkDriverId") int value) { VH_driverID.set(segment, 0L, index, value); }
    /// Sets `driverID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverID(MemorySegment segment, @CType("VkDriverId") int value) { VkPhysicalDeviceDriverProperties.set_driverID(segment, 0L, value); }
    /// Sets `driverID` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverIDAt(long index, @CType("VkDriverId") int value) { VkPhysicalDeviceDriverProperties.set_driverID(this.segment(), index, value); return this; }
    /// Sets `driverID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverID(@CType("VkDriverId") int value) { VkPhysicalDeviceDriverProperties.set_driverID(this.segment(), value); return this; }

    /// {@return `driverName` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment get_driverName(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_driverName.invokeExact(0L, elementIndex), index), ML_driverName); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `driverName`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment get_driverName(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceDriverProperties.get_driverName(segment, 0L, elementIndex); }
    /// {@return `driverName` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment driverNameAt(long index, long elementIndex) { return VkPhysicalDeviceDriverProperties.get_driverName(this.segment(), index, elementIndex); }
    /// {@return `driverName`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment driverName(long elementIndex) { return VkPhysicalDeviceDriverProperties.get_driverName(this.segment(), elementIndex); }
    /// Sets `driverName` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_driverName(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_driverName.invokeExact(0L, elementIndex), index), ML_driverName.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `driverName` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_driverName(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverName(segment, 0L, elementIndex, value); }
    /// Sets `driverName` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverNameAt(long index, long elementIndex, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverName(this.segment(), index, elementIndex, value); return this; }
    /// Sets `driverName` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverName(long elementIndex, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverName(this.segment(), elementIndex, value); return this; }

    /// {@return `driverInfo` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment get_driverInfo(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_driverInfo.invokeExact(0L, elementIndex), index), ML_driverInfo); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `driverInfo`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment get_driverInfo(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceDriverProperties.get_driverInfo(segment, 0L, elementIndex); }
    /// {@return `driverInfo` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment driverInfoAt(long index, long elementIndex) { return VkPhysicalDeviceDriverProperties.get_driverInfo(this.segment(), index, elementIndex); }
    /// {@return `driverInfo`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment driverInfo(long elementIndex) { return VkPhysicalDeviceDriverProperties.get_driverInfo(this.segment(), elementIndex); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_driverInfo(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_driverInfo.invokeExact(0L, elementIndex), index), ML_driverInfo.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `driverInfo` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_driverInfo(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverInfo(segment, 0L, elementIndex, value); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverInfoAt(long index, long elementIndex, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverInfo(this.segment(), index, elementIndex, value); return this; }
    /// Sets `driverInfo` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverInfo(long elementIndex, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverInfo(this.segment(), elementIndex, value); return this; }

    /// {@return `conformanceVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkConformanceVersion") java.lang.foreign.MemorySegment get_conformanceVersion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_conformanceVersion, index), ML_conformanceVersion); }
    /// {@return `conformanceVersion`}
    /// @param segment the segment of the struct
    public static @CType("VkConformanceVersion") java.lang.foreign.MemorySegment get_conformanceVersion(MemorySegment segment) { return VkPhysicalDeviceDriverProperties.get_conformanceVersion(segment, 0L); }
    /// {@return `conformanceVersion` at the given index}
    /// @param index the index
    public @CType("VkConformanceVersion") java.lang.foreign.MemorySegment conformanceVersionAt(long index) { return VkPhysicalDeviceDriverProperties.get_conformanceVersion(this.segment(), index); }
    /// {@return `conformanceVersion`}
    public @CType("VkConformanceVersion") java.lang.foreign.MemorySegment conformanceVersion() { return VkPhysicalDeviceDriverProperties.get_conformanceVersion(this.segment()); }
    /// Sets `conformanceVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conformanceVersion(MemorySegment segment, long index, @CType("VkConformanceVersion") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_conformanceVersion, index), ML_conformanceVersion.byteSize()); }
    /// Sets `conformanceVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conformanceVersion(MemorySegment segment, @CType("VkConformanceVersion") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_conformanceVersion(segment, 0L, value); }
    /// Sets `conformanceVersion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties conformanceVersionAt(long index, @CType("VkConformanceVersion") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_conformanceVersion(this.segment(), index, value); return this; }
    /// Sets `conformanceVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties conformanceVersion(@CType("VkConformanceVersion") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_conformanceVersion(this.segment(), value); return this; }

}
