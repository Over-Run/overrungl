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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkLayerSettingsCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t settingCount;
///     const VkLayerSettingEXT* pSettings;
/// };
/// ```
public final class VkLayerSettingsCreateInfoEXT extends GroupType {
    /// The struct layout of `VkLayerSettingsCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("settingCount"),
        ValueLayout.ADDRESS.withName("pSettings")
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
    /// The byte offset of `settingCount`.
    public static final long OFFSET_settingCount = LAYOUT.byteOffset(PathElement.groupElement("settingCount"));
    /// The memory layout of `settingCount`.
    public static final MemoryLayout LAYOUT_settingCount = LAYOUT.select(PathElement.groupElement("settingCount"));
    /// The [VarHandle] of `settingCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_settingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("settingCount"));
    /// The byte offset of `pSettings`.
    public static final long OFFSET_pSettings = LAYOUT.byteOffset(PathElement.groupElement("pSettings"));
    /// The memory layout of `pSettings`.
    public static final MemoryLayout LAYOUT_pSettings = LAYOUT.select(PathElement.groupElement("pSettings"));
    /// The [VarHandle] of `pSettings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSettings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSettings"));

    /// Creates `VkLayerSettingsCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkLayerSettingsCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkLayerSettingsCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingsCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLayerSettingsCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingsCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkLayerSettingsCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingsCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkLayerSettingsCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkLayerSettingsCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param settingCount `settingCount`
    /// @param pSettings `pSettings`
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int settingCount, MemorySegment pSettings) {
        return alloc(allocator).sType(sType).pNext(pNext).settingCount(settingCount).pSettings(pSettings);
    }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param settingCount `settingCount`
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int settingCount) {
        return alloc(allocator).sType(sType).pNext(pNext).settingCount(settingCount);
    }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT copyFrom(VkLayerSettingsCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkLayerSettingsCreateInfoEXT reinterpret(long count) { return new VkLayerSettingsCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkLayerSettingsCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkLayerSettingsCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `settingCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int settingCount(MemorySegment segment, long index) { return (int) VH_settingCount.get(segment, 0L, index); }
    /// {@return `settingCount`}
    public int settingCount() { return settingCount(this.segment(), 0L); }
    /// Sets `settingCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void settingCount(MemorySegment segment, long index, int value) { VH_settingCount.set(segment, 0L, index, value); }
    /// Sets `settingCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT settingCount(int value) { settingCount(this.segment(), 0L, value); return this; }

    /// {@return `pSettings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSettings(MemorySegment segment, long index) { return (MemorySegment) VH_pSettings.get(segment, 0L, index); }
    /// {@return `pSettings`}
    public MemorySegment pSettings() { return pSettings(this.segment(), 0L); }
    /// Sets `pSettings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSettings(MemorySegment segment, long index, MemorySegment value) { VH_pSettings.set(segment, 0L, index, value); }
    /// Sets `pSettings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT pSettings(MemorySegment value) { pSettings(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkLayerSettingsCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkLayerSettingsCreateInfoEXT`
    public VkLayerSettingsCreateInfoEXT asSlice(long index) { return new VkLayerSettingsCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkLayerSettingsCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkLayerSettingsCreateInfoEXT`
    public VkLayerSettingsCreateInfoEXT asSlice(long index, long count) { return new VkLayerSettingsCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkLayerSettingsCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT at(long index, Consumer<VkLayerSettingsCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `settingCount` at the given index}
    /// @param index the index of the struct buffer
    public int settingCountAt(long index) { return settingCount(this.segment(), index); }
    /// Sets `settingCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT settingCountAt(long index, int value) { settingCount(this.segment(), index, value); return this; }

    /// {@return `pSettings` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSettingsAt(long index) { return pSettings(this.segment(), index); }
    /// Sets `pSettings` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT pSettingsAt(long index, MemorySegment value) { pSettings(this.segment(), index, value); return this; }

}
