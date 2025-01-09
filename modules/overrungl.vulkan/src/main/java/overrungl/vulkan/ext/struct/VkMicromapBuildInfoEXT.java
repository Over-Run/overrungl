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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ### dstMicromap
/// [VarHandle][#VH_dstMicromap] - [Getter][#dstMicromap()] - [Setter][#dstMicromap(java.lang.foreign.MemorySegment)]
/// ### usageCountsCount
/// [VarHandle][#VH_usageCountsCount] - [Getter][#usageCountsCount()] - [Setter][#usageCountsCount(int)]
/// ### pUsageCounts
/// [VarHandle][#VH_pUsageCounts] - [Getter][#pUsageCounts()] - [Setter][#pUsageCounts(java.lang.foreign.MemorySegment)]
/// ### ppUsageCounts
/// [VarHandle][#VH_ppUsageCounts] - [Getter][#ppUsageCounts()] - [Setter][#ppUsageCounts(java.lang.foreign.MemorySegment)]
/// ### data
/// [Byte offset][#OFFSET_data] - [Memory layout][#ML_data] - [Getter][#data()] - [Setter][#data(java.lang.foreign.MemorySegment)]
/// ### scratchData
/// [Byte offset][#OFFSET_scratchData] - [Memory layout][#ML_scratchData] - [Getter][#scratchData()] - [Setter][#scratchData(java.lang.foreign.MemorySegment)]
/// ### triangleArray
/// [Byte offset][#OFFSET_triangleArray] - [Memory layout][#ML_triangleArray] - [Getter][#triangleArray()] - [Setter][#triangleArray(java.lang.foreign.MemorySegment)]
/// ### triangleArrayStride
/// [VarHandle][#VH_triangleArrayStride] - [Getter][#triangleArrayStride()] - [Setter][#triangleArrayStride(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMicromapBuildInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkMicromapTypeEXT type;
///     VkBuildMicromapFlagsEXT flags;
///     VkBuildMicromapModeEXT mode;
///     VkMicromapEXT dstMicromap;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT * pUsageCounts;
///     const VkMicromapUsageEXT * const* ppUsageCounts;
///     VkDeviceOrHostAddressConstKHR data;
///     VkDeviceOrHostAddressKHR scratchData;
///     VkDeviceOrHostAddressConstKHR triangleArray;
///     VkDeviceSize triangleArrayStride;
/// } VkMicromapBuildInfoEXT;
/// ```
public final class VkMicromapBuildInfoEXT extends Struct {
    /// The struct layout of `VkMicromapBuildInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.ADDRESS.withName("dstMicromap"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withName("pUsageCounts"),
        ValueLayout.ADDRESS.withName("ppUsageCounts"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("triangleArray"),
        ValueLayout.JAVA_LONG.withName("triangleArrayStride")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The [VarHandle] of `dstMicromap` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dstMicromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstMicromap"));
    /// The [VarHandle] of `usageCountsCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usageCountsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usageCountsCount"));
    /// The [VarHandle] of `pUsageCounts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUsageCounts"));
    /// The [VarHandle] of `ppUsageCounts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_ppUsageCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppUsageCounts"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout ML_data = LAYOUT.select(PathElement.groupElement("data"));
    /// The byte offset of `scratchData`.
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    /// The memory layout of `scratchData`.
    public static final MemoryLayout ML_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));
    /// The byte offset of `triangleArray`.
    public static final long OFFSET_triangleArray = LAYOUT.byteOffset(PathElement.groupElement("triangleArray"));
    /// The memory layout of `triangleArray`.
    public static final MemoryLayout ML_triangleArray = LAYOUT.select(PathElement.groupElement("triangleArray"));
    /// The [VarHandle] of `triangleArrayStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_triangleArrayStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("triangleArrayStride"));

    /// Creates `VkMicromapBuildInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMicromapBuildInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMicromapBuildInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment); }

    /// Creates `VkMicromapBuildInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMicromapBuildInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapBuildInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapBuildInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMicromapBuildInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapBuildInfoEXT`
    public static VkMicromapBuildInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapBuildInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMicromapBuildInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMicromapBuildInfoEXT`
    public VkMicromapBuildInfoEXT asSlice(long index) { return new VkMicromapBuildInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMicromapBuildInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMicromapBuildInfoEXT`
    public VkMicromapBuildInfoEXT asSlice(long index, long count) { return new VkMicromapBuildInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMicromapBuildInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMicromapBuildInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMicromapBuildInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkMicromapBuildInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT sType(@CType("VkStructureType") int value) { VkMicromapBuildInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMicromapBuildInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMicromapBuildInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapTypeEXT") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapTypeEXT") int get_type(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkMicromapTypeEXT") int typeAt(long index) { return VkMicromapBuildInfoEXT.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkMicromapTypeEXT") int type() { return VkMicromapBuildInfoEXT.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkMicromapTypeEXT") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkMicromapTypeEXT") int value) { VkMicromapBuildInfoEXT.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT typeAt(long index, @CType("VkMicromapTypeEXT") int value) { VkMicromapBuildInfoEXT.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT type(@CType("VkMicromapTypeEXT") int value) { VkMicromapBuildInfoEXT.set_type(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuildMicromapFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkBuildMicromapFlagsEXT") int get_flags(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkBuildMicromapFlagsEXT") int flagsAt(long index) { return VkMicromapBuildInfoEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkBuildMicromapFlagsEXT") int flags() { return VkMicromapBuildInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkBuildMicromapFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkBuildMicromapFlagsEXT") int value) { VkMicromapBuildInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT flagsAt(long index, @CType("VkBuildMicromapFlagsEXT") int value) { VkMicromapBuildInfoEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT flags(@CType("VkBuildMicromapFlagsEXT") int value) { VkMicromapBuildInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuildMicromapModeEXT") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkBuildMicromapModeEXT") int get_mode(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_mode(segment, 0L); }
    /// {@return `mode` at the given index}
    /// @param index the index
    public @CType("VkBuildMicromapModeEXT") int modeAt(long index) { return VkMicromapBuildInfoEXT.get_mode(this.segment(), index); }
    /// {@return `mode`}
    public @CType("VkBuildMicromapModeEXT") int mode() { return VkMicromapBuildInfoEXT.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkBuildMicromapModeEXT") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkBuildMicromapModeEXT") int value) { VkMicromapBuildInfoEXT.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT modeAt(long index, @CType("VkBuildMicromapModeEXT") int value) { VkMicromapBuildInfoEXT.set_mode(this.segment(), index, value); return this; }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT mode(@CType("VkBuildMicromapModeEXT") int value) { VkMicromapBuildInfoEXT.set_mode(this.segment(), value); return this; }

    /// {@return `dstMicromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_dstMicromap(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dstMicromap.get(segment, 0L, index); }
    /// {@return `dstMicromap`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_dstMicromap(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_dstMicromap(segment, 0L); }
    /// {@return `dstMicromap` at the given index}
    /// @param index the index
    public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment dstMicromapAt(long index) { return VkMicromapBuildInfoEXT.get_dstMicromap(this.segment(), index); }
    /// {@return `dstMicromap`}
    public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment dstMicromap() { return VkMicromapBuildInfoEXT.get_dstMicromap(this.segment()); }
    /// Sets `dstMicromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstMicromap(MemorySegment segment, long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VH_dstMicromap.set(segment, 0L, index, value); }
    /// Sets `dstMicromap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstMicromap(MemorySegment segment, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_dstMicromap(segment, 0L, value); }
    /// Sets `dstMicromap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT dstMicromapAt(long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_dstMicromap(this.segment(), index, value); return this; }
    /// Sets `dstMicromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT dstMicromap(@CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_dstMicromap(this.segment(), value); return this; }

    /// {@return `usageCountsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_usageCountsCount(MemorySegment segment, long index) { return (int) VH_usageCountsCount.get(segment, 0L, index); }
    /// {@return `usageCountsCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_usageCountsCount(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_usageCountsCount(segment, 0L); }
    /// {@return `usageCountsCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int usageCountsCountAt(long index) { return VkMicromapBuildInfoEXT.get_usageCountsCount(this.segment(), index); }
    /// {@return `usageCountsCount`}
    public @CType("uint32_t") int usageCountsCount() { return VkMicromapBuildInfoEXT.get_usageCountsCount(this.segment()); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usageCountsCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_usageCountsCount.set(segment, 0L, index, value); }
    /// Sets `usageCountsCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usageCountsCount(MemorySegment segment, @CType("uint32_t") int value) { VkMicromapBuildInfoEXT.set_usageCountsCount(segment, 0L, value); }
    /// Sets `usageCountsCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT usageCountsCountAt(long index, @CType("uint32_t") int value) { VkMicromapBuildInfoEXT.set_usageCountsCount(this.segment(), index, value); return this; }
    /// Sets `usageCountsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT usageCountsCount(@CType("uint32_t") int value) { VkMicromapBuildInfoEXT.set_usageCountsCount(this.segment(), value); return this; }

    /// {@return `pUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment get_pUsageCounts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pUsageCounts.get(segment, 0L, index); }
    /// {@return `pUsageCounts`}
    /// @param segment the segment of the struct
    public static @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment get_pUsageCounts(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_pUsageCounts(segment, 0L); }
    /// {@return `pUsageCounts` at the given index}
    /// @param index the index
    public @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment pUsageCountsAt(long index) { return VkMicromapBuildInfoEXT.get_pUsageCounts(this.segment(), index); }
    /// {@return `pUsageCounts`}
    public @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment pUsageCounts() { return VkMicromapBuildInfoEXT.get_pUsageCounts(this.segment()); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pUsageCounts(MemorySegment segment, long index, @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment value) { VH_pUsageCounts.set(segment, 0L, index, value); }
    /// Sets `pUsageCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pUsageCounts(MemorySegment segment, @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_pUsageCounts(segment, 0L, value); }
    /// Sets `pUsageCounts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT pUsageCountsAt(long index, @CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_pUsageCounts(this.segment(), index, value); return this; }
    /// Sets `pUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT pUsageCounts(@CType("const VkMicromapUsageEXT *") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_pUsageCounts(this.segment(), value); return this; }

    /// {@return `ppUsageCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment get_ppUsageCounts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_ppUsageCounts.get(segment, 0L, index); }
    /// {@return `ppUsageCounts`}
    /// @param segment the segment of the struct
    public static @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment get_ppUsageCounts(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_ppUsageCounts(segment, 0L); }
    /// {@return `ppUsageCounts` at the given index}
    /// @param index the index
    public @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment ppUsageCountsAt(long index) { return VkMicromapBuildInfoEXT.get_ppUsageCounts(this.segment(), index); }
    /// {@return `ppUsageCounts`}
    public @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment ppUsageCounts() { return VkMicromapBuildInfoEXT.get_ppUsageCounts(this.segment()); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ppUsageCounts(MemorySegment segment, long index, @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment value) { VH_ppUsageCounts.set(segment, 0L, index, value); }
    /// Sets `ppUsageCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ppUsageCounts(MemorySegment segment, @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_ppUsageCounts(segment, 0L, value); }
    /// Sets `ppUsageCounts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT ppUsageCountsAt(long index, @CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_ppUsageCounts(this.segment(), index, value); return this; }
    /// Sets `ppUsageCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT ppUsageCounts(@CType("const VkMicromapUsageEXT * const*") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_ppUsageCounts(this.segment(), value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), ML_data); }
    /// {@return `data`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_data(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_data(segment, 0L); }
    /// {@return `data` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment dataAt(long index) { return VkMicromapBuildInfoEXT.get_data(this.segment(), index); }
    /// {@return `data`}
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment data() { return VkMicromapBuildInfoEXT.get_data(this.segment()); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_data(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), ML_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_data(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_data(segment, 0L, value); }
    /// Sets `data` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT dataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_data(this.segment(), index, value); return this; }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT data(@CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_data(this.segment(), value); return this; }

    /// {@return `scratchData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment get_scratchData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_scratchData, index), ML_scratchData); }
    /// {@return `scratchData`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment get_scratchData(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_scratchData(segment, 0L); }
    /// {@return `scratchData` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment scratchDataAt(long index) { return VkMicromapBuildInfoEXT.get_scratchData(this.segment(), index); }
    /// {@return `scratchData`}
    public @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment scratchData() { return VkMicromapBuildInfoEXT.get_scratchData(this.segment()); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scratchData(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_scratchData, index), ML_scratchData.byteSize()); }
    /// Sets `scratchData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scratchData(MemorySegment segment, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_scratchData(segment, 0L, value); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT scratchDataAt(long index, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_scratchData(this.segment(), index, value); return this; }
    /// Sets `scratchData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT scratchData(@CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_scratchData(this.segment(), value); return this; }

    /// {@return `triangleArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_triangleArray(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_triangleArray, index), ML_triangleArray); }
    /// {@return `triangleArray`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_triangleArray(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_triangleArray(segment, 0L); }
    /// {@return `triangleArray` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment triangleArrayAt(long index) { return VkMicromapBuildInfoEXT.get_triangleArray(this.segment(), index); }
    /// {@return `triangleArray`}
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment triangleArray() { return VkMicromapBuildInfoEXT.get_triangleArray(this.segment()); }
    /// Sets `triangleArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_triangleArray(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_triangleArray, index), ML_triangleArray.byteSize()); }
    /// Sets `triangleArray` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_triangleArray(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_triangleArray(segment, 0L, value); }
    /// Sets `triangleArray` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArrayAt(long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_triangleArray(this.segment(), index, value); return this; }
    /// Sets `triangleArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArray(@CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkMicromapBuildInfoEXT.set_triangleArray(this.segment(), value); return this; }

    /// {@return `triangleArrayStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_triangleArrayStride(MemorySegment segment, long index) { return (long) VH_triangleArrayStride.get(segment, 0L, index); }
    /// {@return `triangleArrayStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_triangleArrayStride(MemorySegment segment) { return VkMicromapBuildInfoEXT.get_triangleArrayStride(segment, 0L); }
    /// {@return `triangleArrayStride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long triangleArrayStrideAt(long index) { return VkMicromapBuildInfoEXT.get_triangleArrayStride(this.segment(), index); }
    /// {@return `triangleArrayStride`}
    public @CType("VkDeviceSize") long triangleArrayStride() { return VkMicromapBuildInfoEXT.get_triangleArrayStride(this.segment()); }
    /// Sets `triangleArrayStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_triangleArrayStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_triangleArrayStride.set(segment, 0L, index, value); }
    /// Sets `triangleArrayStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_triangleArrayStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMicromapBuildInfoEXT.set_triangleArrayStride(segment, 0L, value); }
    /// Sets `triangleArrayStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArrayStrideAt(long index, @CType("VkDeviceSize") long value) { VkMicromapBuildInfoEXT.set_triangleArrayStride(this.segment(), index, value); return this; }
    /// Sets `triangleArrayStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildInfoEXT triangleArrayStride(@CType("VkDeviceSize") long value) { VkMicromapBuildInfoEXT.set_triangleArrayStride(this.segment(), value); return this; }

}
