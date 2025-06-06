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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAccelerationStructureBuildGeometryInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkAccelerationStructureTypeKHR type;
///     ((uint32_t) VkFlags) VkBuildAccelerationStructureFlagsKHR flags;
///     (int) VkBuildAccelerationStructureModeKHR mode;
///     (uint64_t) VkAccelerationStructureKHR srcAccelerationStructure;
///     (uint64_t) VkAccelerationStructureKHR dstAccelerationStructure;
///     uint32_t geometryCount;
///     const VkAccelerationStructureGeometryKHR* pGeometries;
///     const VkAccelerationStructureGeometryKHR* const * ppGeometries;
///     (union VkDeviceOrHostAddressKHR) VkDeviceOrHostAddressKHR scratchData;
/// };
/// ```
public sealed class VkAccelerationStructureBuildGeometryInfoKHR extends GroupType {
    /// The struct layout of `VkAccelerationStructureBuildGeometryInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_LONG.withName("srcAccelerationStructure"),
        ValueLayout.JAVA_LONG.withName("dstAccelerationStructure"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withName("pGeometries"),
        ValueLayout.ADDRESS.withName("ppGeometries"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData")
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
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The byte offset of `srcAccelerationStructure`.
    public static final long OFFSET_srcAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructure"));
    /// The memory layout of `srcAccelerationStructure`.
    public static final MemoryLayout LAYOUT_srcAccelerationStructure = LAYOUT.select(PathElement.groupElement("srcAccelerationStructure"));
    /// The [VarHandle] of `srcAccelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccelerationStructure"));
    /// The byte offset of `dstAccelerationStructure`.
    public static final long OFFSET_dstAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("dstAccelerationStructure"));
    /// The memory layout of `dstAccelerationStructure`.
    public static final MemoryLayout LAYOUT_dstAccelerationStructure = LAYOUT.select(PathElement.groupElement("dstAccelerationStructure"));
    /// The [VarHandle] of `dstAccelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccelerationStructure"));
    /// The byte offset of `geometryCount`.
    public static final long OFFSET_geometryCount = LAYOUT.byteOffset(PathElement.groupElement("geometryCount"));
    /// The memory layout of `geometryCount`.
    public static final MemoryLayout LAYOUT_geometryCount = LAYOUT.select(PathElement.groupElement("geometryCount"));
    /// The [VarHandle] of `geometryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_geometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryCount"));
    /// The byte offset of `pGeometries`.
    public static final long OFFSET_pGeometries = LAYOUT.byteOffset(PathElement.groupElement("pGeometries"));
    /// The memory layout of `pGeometries`.
    public static final MemoryLayout LAYOUT_pGeometries = LAYOUT.select(PathElement.groupElement("pGeometries"));
    /// The [VarHandle] of `pGeometries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGeometries"));
    /// The byte offset of `ppGeometries`.
    public static final long OFFSET_ppGeometries = LAYOUT.byteOffset(PathElement.groupElement("ppGeometries"));
    /// The memory layout of `ppGeometries`.
    public static final MemoryLayout LAYOUT_ppGeometries = LAYOUT.select(PathElement.groupElement("ppGeometries"));
    /// The [VarHandle] of `ppGeometries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ppGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppGeometries"));
    /// The byte offset of `scratchData`.
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    /// The memory layout of `scratchData`.
    public static final MemoryLayout LAYOUT_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));

    /// Creates `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureBuildGeometryInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildGeometryInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureBuildGeometryInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildGeometryInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param srcAccelerationStructure `srcAccelerationStructure`
    /// @param dstAccelerationStructure `dstAccelerationStructure`
    /// @param geometryCount `geometryCount`
    /// @param pGeometries `pGeometries`
    /// @param ppGeometries `ppGeometries`
    /// @param scratchData `scratchData`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long srcAccelerationStructure, long dstAccelerationStructure, int geometryCount, MemorySegment pGeometries, MemorySegment ppGeometries, MemorySegment scratchData) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).srcAccelerationStructure(srcAccelerationStructure).dstAccelerationStructure(dstAccelerationStructure).geometryCount(geometryCount).pGeometries(pGeometries).ppGeometries(ppGeometries).scratchData(scratchData);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param srcAccelerationStructure `srcAccelerationStructure`
    /// @param dstAccelerationStructure `dstAccelerationStructure`
    /// @param geometryCount `geometryCount`
    /// @param pGeometries `pGeometries`
    /// @param ppGeometries `ppGeometries`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long srcAccelerationStructure, long dstAccelerationStructure, int geometryCount, MemorySegment pGeometries, MemorySegment ppGeometries) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).srcAccelerationStructure(srcAccelerationStructure).dstAccelerationStructure(dstAccelerationStructure).geometryCount(geometryCount).pGeometries(pGeometries).ppGeometries(ppGeometries);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param srcAccelerationStructure `srcAccelerationStructure`
    /// @param dstAccelerationStructure `dstAccelerationStructure`
    /// @param geometryCount `geometryCount`
    /// @param pGeometries `pGeometries`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long srcAccelerationStructure, long dstAccelerationStructure, int geometryCount, MemorySegment pGeometries) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).srcAccelerationStructure(srcAccelerationStructure).dstAccelerationStructure(dstAccelerationStructure).geometryCount(geometryCount).pGeometries(pGeometries);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param srcAccelerationStructure `srcAccelerationStructure`
    /// @param dstAccelerationStructure `dstAccelerationStructure`
    /// @param geometryCount `geometryCount`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long srcAccelerationStructure, long dstAccelerationStructure, int geometryCount) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).srcAccelerationStructure(srcAccelerationStructure).dstAccelerationStructure(dstAccelerationStructure).geometryCount(geometryCount);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param srcAccelerationStructure `srcAccelerationStructure`
    /// @param dstAccelerationStructure `dstAccelerationStructure`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long srcAccelerationStructure, long dstAccelerationStructure) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).srcAccelerationStructure(srcAccelerationStructure).dstAccelerationStructure(dstAccelerationStructure);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @param srcAccelerationStructure `srcAccelerationStructure`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode, long srcAccelerationStructure) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode).srcAccelerationStructure(srcAccelerationStructure);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @param mode `mode`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags, int mode) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags).mode(mode);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param flags `flags`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).flags(flags);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR copyFrom(VkAccelerationStructureBuildGeometryInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkAccelerationStructureBuildGeometryInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureBuildGeometryInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// {@return `srcAccelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAccelerationStructure(MemorySegment segment, long index) { return (long) VH_srcAccelerationStructure.get(segment, 0L, index); }
    /// {@return `srcAccelerationStructure`}
    public long srcAccelerationStructure() { return srcAccelerationStructure(this.segment(), 0L); }
    /// Sets `srcAccelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccelerationStructure(MemorySegment segment, long index, long value) { VH_srcAccelerationStructure.set(segment, 0L, index, value); }
    /// Sets `srcAccelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructure(long value) { srcAccelerationStructure(this.segment(), 0L, value); return this; }

    /// {@return `dstAccelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAccelerationStructure(MemorySegment segment, long index) { return (long) VH_dstAccelerationStructure.get(segment, 0L, index); }
    /// {@return `dstAccelerationStructure`}
    public long dstAccelerationStructure() { return dstAccelerationStructure(this.segment(), 0L); }
    /// Sets `dstAccelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccelerationStructure(MemorySegment segment, long index, long value) { VH_dstAccelerationStructure.set(segment, 0L, index, value); }
    /// Sets `dstAccelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructure(long value) { dstAccelerationStructure(this.segment(), 0L, value); return this; }

    /// {@return `geometryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int geometryCount(MemorySegment segment, long index) { return (int) VH_geometryCount.get(segment, 0L, index); }
    /// {@return `geometryCount`}
    public int geometryCount() { return geometryCount(this.segment(), 0L); }
    /// Sets `geometryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometryCount(MemorySegment segment, long index, int value) { VH_geometryCount.set(segment, 0L, index, value); }
    /// Sets `geometryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR geometryCount(int value) { geometryCount(this.segment(), 0L, value); return this; }

    /// {@return `pGeometries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pGeometries(MemorySegment segment, long index) { return (MemorySegment) VH_pGeometries.get(segment, 0L, index); }
    /// {@return `pGeometries`}
    public MemorySegment pGeometries() { return pGeometries(this.segment(), 0L); }
    /// Sets `pGeometries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pGeometries(MemorySegment segment, long index, MemorySegment value) { VH_pGeometries.set(segment, 0L, index, value); }
    /// Sets `pGeometries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR pGeometries(MemorySegment value) { pGeometries(this.segment(), 0L, value); return this; }

    /// {@return `ppGeometries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ppGeometries(MemorySegment segment, long index) { return (MemorySegment) VH_ppGeometries.get(segment, 0L, index); }
    /// {@return `ppGeometries`}
    public MemorySegment ppGeometries() { return ppGeometries(this.segment(), 0L); }
    /// Sets `ppGeometries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ppGeometries(MemorySegment segment, long index, MemorySegment value) { VH_ppGeometries.set(segment, 0L, index, value); }
    /// Sets `ppGeometries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometries(MemorySegment value) { ppGeometries(this.segment(), 0L, value); return this; }

    /// {@return `scratchData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment scratchData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_scratchData, index), LAYOUT_scratchData); }
    /// {@return `scratchData`}
    public MemorySegment scratchData() { return scratchData(this.segment(), 0L); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scratchData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_scratchData, index), LAYOUT_scratchData.byteSize()); }
    /// Sets `scratchData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(MemorySegment value) { scratchData(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAccelerationStructureBuildGeometryInfoKHR].
    public static final class Buffer extends VkAccelerationStructureBuildGeometryInfoKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureBuildGeometryInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureBuildGeometryInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureBuildGeometryInfoKHR`
        public VkAccelerationStructureBuildGeometryInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildGeometryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureBuildGeometryInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureBuildGeometryInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `type` at the given index}
        /// @param index the index of the struct buffer
        public int typeAt(long index) { return type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, int value) { type(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `mode` at the given index}
        /// @param index the index of the struct buffer
        public int modeAt(long index) { return mode(this.segment(), index); }
        /// Sets `mode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

        /// {@return `srcAccelerationStructure` at the given index}
        /// @param index the index of the struct buffer
        public long srcAccelerationStructureAt(long index) { return srcAccelerationStructure(this.segment(), index); }
        /// Sets `srcAccelerationStructure` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcAccelerationStructureAt(long index, long value) { srcAccelerationStructure(this.segment(), index, value); return this; }

        /// {@return `dstAccelerationStructure` at the given index}
        /// @param index the index of the struct buffer
        public long dstAccelerationStructureAt(long index) { return dstAccelerationStructure(this.segment(), index); }
        /// Sets `dstAccelerationStructure` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstAccelerationStructureAt(long index, long value) { dstAccelerationStructure(this.segment(), index, value); return this; }

        /// {@return `geometryCount` at the given index}
        /// @param index the index of the struct buffer
        public int geometryCountAt(long index) { return geometryCount(this.segment(), index); }
        /// Sets `geometryCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer geometryCountAt(long index, int value) { geometryCount(this.segment(), index, value); return this; }

        /// {@return `pGeometries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pGeometriesAt(long index) { return pGeometries(this.segment(), index); }
        /// Sets `pGeometries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pGeometriesAt(long index, MemorySegment value) { pGeometries(this.segment(), index, value); return this; }

        /// {@return `ppGeometries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment ppGeometriesAt(long index) { return ppGeometries(this.segment(), index); }
        /// Sets `ppGeometries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ppGeometriesAt(long index, MemorySegment value) { ppGeometries(this.segment(), index, value); return this; }

        /// {@return `scratchData` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment scratchDataAt(long index) { return scratchData(this.segment(), index); }
        /// Sets `scratchData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer scratchDataAt(long index, MemorySegment value) { scratchData(this.segment(), index, value); return this; }

    }
}
