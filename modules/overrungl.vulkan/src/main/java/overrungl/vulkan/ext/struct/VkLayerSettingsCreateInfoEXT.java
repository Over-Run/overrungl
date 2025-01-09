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
/// ### settingCount
/// [VarHandle][#VH_settingCount] - [Getter][#settingCount()] - [Setter][#settingCount(int)]
/// ### pSettings
/// [VarHandle][#VH_pSettings] - [Getter][#pSettings()] - [Setter][#pSettings(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLayerSettingsCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t settingCount;
///     const VkLayerSettingEXT * pSettings;
/// } VkLayerSettingsCreateInfoEXT;
/// ```
public final class VkLayerSettingsCreateInfoEXT extends Struct {
    /// The struct layout of `VkLayerSettingsCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("settingCount"),
        ValueLayout.ADDRESS.withName("pSettings")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `settingCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_settingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("settingCount"));
    /// The [VarHandle] of `pSettings` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSettings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSettings"));

    /// Creates `VkLayerSettingsCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkLayerSettingsCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLayerSettingsCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingsCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment); }

    /// Creates `VkLayerSettingsCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingsCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLayerSettingsCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingsCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerSettingsCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkLayerSettingsCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkLayerSettingsCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkLayerSettingsCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkLayerSettingsCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkLayerSettingsCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkLayerSettingsCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkLayerSettingsCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT sType(@CType("VkStructureType") int value) { VkLayerSettingsCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkLayerSettingsCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkLayerSettingsCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkLayerSettingsCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `settingCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_settingCount(MemorySegment segment, long index) { return (int) VH_settingCount.get(segment, 0L, index); }
    /// {@return `settingCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_settingCount(MemorySegment segment) { return VkLayerSettingsCreateInfoEXT.get_settingCount(segment, 0L); }
    /// {@return `settingCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int settingCountAt(long index) { return VkLayerSettingsCreateInfoEXT.get_settingCount(this.segment(), index); }
    /// {@return `settingCount`}
    public @CType("uint32_t") int settingCount() { return VkLayerSettingsCreateInfoEXT.get_settingCount(this.segment()); }
    /// Sets `settingCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_settingCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_settingCount.set(segment, 0L, index, value); }
    /// Sets `settingCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_settingCount(MemorySegment segment, @CType("uint32_t") int value) { VkLayerSettingsCreateInfoEXT.set_settingCount(segment, 0L, value); }
    /// Sets `settingCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT settingCountAt(long index, @CType("uint32_t") int value) { VkLayerSettingsCreateInfoEXT.set_settingCount(this.segment(), index, value); return this; }
    /// Sets `settingCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT settingCount(@CType("uint32_t") int value) { VkLayerSettingsCreateInfoEXT.set_settingCount(this.segment(), value); return this; }

    /// {@return `pSettings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment get_pSettings(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSettings.get(segment, 0L, index); }
    /// {@return `pSettings`}
    /// @param segment the segment of the struct
    public static @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment get_pSettings(MemorySegment segment) { return VkLayerSettingsCreateInfoEXT.get_pSettings(segment, 0L); }
    /// {@return `pSettings` at the given index}
    /// @param index the index
    public @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment pSettingsAt(long index) { return VkLayerSettingsCreateInfoEXT.get_pSettings(this.segment(), index); }
    /// {@return `pSettings`}
    public @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment pSettings() { return VkLayerSettingsCreateInfoEXT.get_pSettings(this.segment()); }
    /// Sets `pSettings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSettings(MemorySegment segment, long index, @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment value) { VH_pSettings.set(segment, 0L, index, value); }
    /// Sets `pSettings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSettings(MemorySegment segment, @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pSettings(segment, 0L, value); }
    /// Sets `pSettings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT pSettingsAt(long index, @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pSettings(this.segment(), index, value); return this; }
    /// Sets `pSettings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT pSettings(@CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pSettings(this.segment(), value); return this; }

}
