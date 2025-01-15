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
/// [Byte offset][#OFFSET_driverName] - [Memory layout][#ML_driverName] - [Getter][#driverName()] - [Setter][#driverName(java.lang.foreign.MemorySegment)]
/// ### driverInfo
/// [Byte offset][#OFFSET_driverInfo] - [Memory layout][#ML_driverInfo] - [Getter][#driverInfo()] - [Setter][#driverInfo(java.lang.foreign.MemorySegment)]
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
public sealed class VkPhysicalDeviceDriverProperties extends Struct {
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
    /// The byte offset of `driverName`.
    public static final long OFFSET_driverName = LAYOUT.byteOffset(PathElement.groupElement("driverName"));
    /// The memory layout of `driverName`.
    public static final MemoryLayout ML_driverName = LAYOUT.select(PathElement.groupElement("driverName"));
    /// The byte offset of `driverInfo`.
    public static final long OFFSET_driverInfo = LAYOUT.byteOffset(PathElement.groupElement("driverInfo"));
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDriverProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDriverProperties`
    public static VkPhysicalDeviceDriverProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDriverProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDriverProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDriverProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDriverProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDriverProperties`
    public static VkPhysicalDeviceDriverProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkDriverId") int driverID, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment driverName, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment driverInfo, @CType("VkConformanceVersion") java.lang.foreign.MemorySegment conformanceVersion) { return alloc(allocator).sType(sType).pNext(pNext).driverID(driverID).driverName(driverName).driverInfo(driverInfo).conformanceVersion(conformanceVersion); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDriverProperties copyFrom(VkPhysicalDeviceDriverProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDriverProperties.get_sType(segment, 0L); }
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
    /// Sets `driverID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverID(@CType("VkDriverId") int value) { VkPhysicalDeviceDriverProperties.set_driverID(this.segment(), value); return this; }

    /// {@return `driverName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment get_driverName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverName, index), ML_driverName); }
    /// {@return `driverName`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment get_driverName(MemorySegment segment) { return VkPhysicalDeviceDriverProperties.get_driverName(segment, 0L); }
    /// {@return `driverName`}
    public @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment driverName() { return VkPhysicalDeviceDriverProperties.get_driverName(this.segment()); }
    /// Sets `driverName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverName(MemorySegment segment, long index, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverName, index), ML_driverName.byteSize()); }
    /// Sets `driverName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverName(MemorySegment segment, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverName(segment, 0L, value); }
    /// Sets `driverName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverName(@CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverName(this.segment(), value); return this; }

    /// {@return `driverInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment get_driverInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_driverInfo, index), ML_driverInfo); }
    /// {@return `driverInfo`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment get_driverInfo(MemorySegment segment) { return VkPhysicalDeviceDriverProperties.get_driverInfo(segment, 0L); }
    /// {@return `driverInfo`}
    public @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment driverInfo() { return VkPhysicalDeviceDriverProperties.get_driverInfo(this.segment()); }
    /// Sets `driverInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverInfo(MemorySegment segment, long index, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_driverInfo, index), ML_driverInfo.byteSize()); }
    /// Sets `driverInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverInfo(MemorySegment segment, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverInfo(segment, 0L, value); }
    /// Sets `driverInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties driverInfo(@CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverInfo(this.segment(), value); return this; }

    /// {@return `conformanceVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkConformanceVersion") java.lang.foreign.MemorySegment get_conformanceVersion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_conformanceVersion, index), ML_conformanceVersion); }
    /// {@return `conformanceVersion`}
    /// @param segment the segment of the struct
    public static @CType("VkConformanceVersion") java.lang.foreign.MemorySegment get_conformanceVersion(MemorySegment segment) { return VkPhysicalDeviceDriverProperties.get_conformanceVersion(segment, 0L); }
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
    /// Sets `conformanceVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDriverProperties conformanceVersion(@CType("VkConformanceVersion") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_conformanceVersion(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceDriverProperties].
    public static final class Buffer extends VkPhysicalDeviceDriverProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDriverProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDriverProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDriverProperties`
        public VkPhysicalDeviceDriverProperties asSlice(long index) { return new VkPhysicalDeviceDriverProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDriverProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDriverProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDriverProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDriverProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDriverProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `driverID` at the given index}
        /// @param index the index
        public @CType("VkDriverId") int driverIDAt(long index) { return VkPhysicalDeviceDriverProperties.get_driverID(this.segment(), index); }
        /// Sets `driverID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverIDAt(long index, @CType("VkDriverId") int value) { VkPhysicalDeviceDriverProperties.set_driverID(this.segment(), index, value); return this; }

        /// {@return `driverName` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment driverNameAt(long index) { return VkPhysicalDeviceDriverProperties.get_driverName(this.segment(), index); }
        /// Sets `driverName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverNameAt(long index, @CType("char[VK_MAX_DRIVER_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverName(this.segment(), index, value); return this; }

        /// {@return `driverInfo` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment driverInfoAt(long index) { return VkPhysicalDeviceDriverProperties.get_driverInfo(this.segment(), index); }
        /// Sets `driverInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer driverInfoAt(long index, @CType("char[VK_MAX_DRIVER_INFO_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_driverInfo(this.segment(), index, value); return this; }

        /// {@return `conformanceVersion` at the given index}
        /// @param index the index
        public @CType("VkConformanceVersion") java.lang.foreign.MemorySegment conformanceVersionAt(long index) { return VkPhysicalDeviceDriverProperties.get_conformanceVersion(this.segment(), index); }
        /// Sets `conformanceVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer conformanceVersionAt(long index, @CType("VkConformanceVersion") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDriverProperties.set_conformanceVersion(this.segment(), index, value); return this; }

    }
}
