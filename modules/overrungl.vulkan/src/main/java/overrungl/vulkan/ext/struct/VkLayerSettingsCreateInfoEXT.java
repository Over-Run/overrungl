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
public sealed class VkLayerSettingsCreateInfoEXT extends Struct {
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkLayerSettingsCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkLayerSettingsCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerSettingsCreateInfoEXT`
    public static VkLayerSettingsCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int settingCount, @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment pSettings) { return alloc(allocator).sType(sType).pNext(pNext).settingCount(settingCount).pSettings(pSettings); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT copyFrom(VkLayerSettingsCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkLayerSettingsCreateInfoEXT.get_sType(segment, 0L); }
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
    /// Sets `pSettings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingsCreateInfoEXT pSettings(@CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pSettings(this.segment(), value); return this; }

    /// A buffer of [VkLayerSettingsCreateInfoEXT].
    public static final class Buffer extends VkLayerSettingsCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkLayerSettingsCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkLayerSettingsCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkLayerSettingsCreateInfoEXT`
        public VkLayerSettingsCreateInfoEXT asSlice(long index) { return new VkLayerSettingsCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkLayerSettingsCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkLayerSettingsCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkLayerSettingsCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkLayerSettingsCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkLayerSettingsCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `settingCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int settingCountAt(long index) { return VkLayerSettingsCreateInfoEXT.get_settingCount(this.segment(), index); }
        /// Sets `settingCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer settingCountAt(long index, @CType("uint32_t") int value) { VkLayerSettingsCreateInfoEXT.set_settingCount(this.segment(), index, value); return this; }

        /// {@return `pSettings` at the given index}
        /// @param index the index
        public @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment pSettingsAt(long index) { return VkLayerSettingsCreateInfoEXT.get_pSettings(this.segment(), index); }
        /// Sets `pSettings` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSettingsAt(long index, @CType("const VkLayerSettingEXT *") java.lang.foreign.MemorySegment value) { VkLayerSettingsCreateInfoEXT.set_pSettings(this.segment(), index, value); return this; }

    }
}
