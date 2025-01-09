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

/// ## Members
/// ### maxExtent
/// [Byte offset][#OFFSET_maxExtent] - [Memory layout][#ML_maxExtent] - [Getter][#maxExtent()] - [Setter][#maxExtent(java.lang.foreign.MemorySegment)]
/// ### maxMipLevels
/// [VarHandle][#VH_maxMipLevels] - [Getter][#maxMipLevels()] - [Setter][#maxMipLevels(int)]
/// ### maxArrayLayers
/// [VarHandle][#VH_maxArrayLayers] - [Getter][#maxArrayLayers()] - [Setter][#maxArrayLayers(int)]
/// ### sampleCounts
/// [VarHandle][#VH_sampleCounts] - [Getter][#sampleCounts()] - [Setter][#sampleCounts(int)]
/// ### maxResourceSize
/// [VarHandle][#VH_maxResourceSize] - [Getter][#maxResourceSize()] - [Setter][#maxResourceSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageFormatProperties {
///     VkExtent3D maxExtent;
///     uint32_t maxMipLevels;
///     uint32_t maxArrayLayers;
///     VkSampleCountFlags sampleCounts;
///     VkDeviceSize maxResourceSize;
/// } VkImageFormatProperties;
/// ```
public final class VkImageFormatProperties extends Struct {
    /// The struct layout of `VkImageFormatProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("maxExtent"),
        ValueLayout.JAVA_INT.withName("maxMipLevels"),
        ValueLayout.JAVA_INT.withName("maxArrayLayers"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        ValueLayout.JAVA_LONG.withName("maxResourceSize")
    );
    /// The byte offset of `maxExtent`.
    public static final long OFFSET_maxExtent = LAYOUT.byteOffset(PathElement.groupElement("maxExtent"));
    /// The memory layout of `maxExtent`.
    public static final MemoryLayout ML_maxExtent = LAYOUT.select(PathElement.groupElement("maxExtent"));
    /// The [VarHandle] of `maxMipLevels` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMipLevels"));
    /// The [VarHandle] of `maxArrayLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxArrayLayers"));
    /// The [VarHandle] of `sampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCounts"));
    /// The [VarHandle] of `maxResourceSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxResourceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceSize"));

    /// Creates `VkImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    public VkImageFormatProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatProperties(segment); }

    /// Creates `VkImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatProperties`
    public static VkImageFormatProperties alloc(SegmentAllocator allocator) { return new VkImageFormatProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageFormatProperties`
    public static VkImageFormatProperties alloc(SegmentAllocator allocator, long count) { return new VkImageFormatProperties(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkImageFormatProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageFormatProperties`
    public VkImageFormatProperties asSlice(long index) { return new VkImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkImageFormatProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageFormatProperties`
    public VkImageFormatProperties asSlice(long index, long count) { return new VkImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `maxExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_maxExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxExtent, index), ML_maxExtent); }
    /// {@return `maxExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_maxExtent(MemorySegment segment) { return VkImageFormatProperties.get_maxExtent(segment, 0L); }
    /// {@return `maxExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment maxExtentAt(long index) { return VkImageFormatProperties.get_maxExtent(this.segment(), index); }
    /// {@return `maxExtent`}
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment maxExtent() { return VkImageFormatProperties.get_maxExtent(this.segment()); }
    /// Sets `maxExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxExtent(MemorySegment segment, long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxExtent, index), ML_maxExtent.byteSize()); }
    /// Sets `maxExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxExtent(MemorySegment segment, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageFormatProperties.set_maxExtent(segment, 0L, value); }
    /// Sets `maxExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxExtentAt(long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageFormatProperties.set_maxExtent(this.segment(), index, value); return this; }
    /// Sets `maxExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxExtent(@CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageFormatProperties.set_maxExtent(this.segment(), value); return this; }

    /// {@return `maxMipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMipLevels(MemorySegment segment, long index) { return (int) VH_maxMipLevels.get(segment, 0L, index); }
    /// {@return `maxMipLevels`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMipLevels(MemorySegment segment) { return VkImageFormatProperties.get_maxMipLevels(segment, 0L); }
    /// {@return `maxMipLevels` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxMipLevelsAt(long index) { return VkImageFormatProperties.get_maxMipLevels(this.segment(), index); }
    /// {@return `maxMipLevels`}
    public @CType("uint32_t") int maxMipLevels() { return VkImageFormatProperties.get_maxMipLevels(this.segment()); }
    /// Sets `maxMipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMipLevels(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMipLevels.set(segment, 0L, index, value); }
    /// Sets `maxMipLevels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMipLevels(MemorySegment segment, @CType("uint32_t") int value) { VkImageFormatProperties.set_maxMipLevels(segment, 0L, value); }
    /// Sets `maxMipLevels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxMipLevelsAt(long index, @CType("uint32_t") int value) { VkImageFormatProperties.set_maxMipLevels(this.segment(), index, value); return this; }
    /// Sets `maxMipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxMipLevels(@CType("uint32_t") int value) { VkImageFormatProperties.set_maxMipLevels(this.segment(), value); return this; }

    /// {@return `maxArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxArrayLayers(MemorySegment segment, long index) { return (int) VH_maxArrayLayers.get(segment, 0L, index); }
    /// {@return `maxArrayLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxArrayLayers(MemorySegment segment) { return VkImageFormatProperties.get_maxArrayLayers(segment, 0L); }
    /// {@return `maxArrayLayers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxArrayLayersAt(long index) { return VkImageFormatProperties.get_maxArrayLayers(this.segment(), index); }
    /// {@return `maxArrayLayers`}
    public @CType("uint32_t") int maxArrayLayers() { return VkImageFormatProperties.get_maxArrayLayers(this.segment()); }
    /// Sets `maxArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxArrayLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxArrayLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxArrayLayers(MemorySegment segment, @CType("uint32_t") int value) { VkImageFormatProperties.set_maxArrayLayers(segment, 0L, value); }
    /// Sets `maxArrayLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxArrayLayersAt(long index, @CType("uint32_t") int value) { VkImageFormatProperties.set_maxArrayLayers(this.segment(), index, value); return this; }
    /// Sets `maxArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxArrayLayers(@CType("uint32_t") int value) { VkImageFormatProperties.set_maxArrayLayers(this.segment(), value); return this; }

    /// {@return `sampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_sampleCounts(MemorySegment segment, long index) { return (int) VH_sampleCounts.get(segment, 0L, index); }
    /// {@return `sampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_sampleCounts(MemorySegment segment) { return VkImageFormatProperties.get_sampleCounts(segment, 0L); }
    /// {@return `sampleCounts` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlags") int sampleCountsAt(long index) { return VkImageFormatProperties.get_sampleCounts(this.segment(), index); }
    /// {@return `sampleCounts`}
    public @CType("VkSampleCountFlags") int sampleCounts() { return VkImageFormatProperties.get_sampleCounts(this.segment()); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_sampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkImageFormatProperties.set_sampleCounts(segment, 0L, value); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties sampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkImageFormatProperties.set_sampleCounts(this.segment(), index, value); return this; }
    /// Sets `sampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties sampleCounts(@CType("VkSampleCountFlags") int value) { VkImageFormatProperties.set_sampleCounts(this.segment(), value); return this; }

    /// {@return `maxResourceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxResourceSize(MemorySegment segment, long index) { return (long) VH_maxResourceSize.get(segment, 0L, index); }
    /// {@return `maxResourceSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxResourceSize(MemorySegment segment) { return VkImageFormatProperties.get_maxResourceSize(segment, 0L); }
    /// {@return `maxResourceSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long maxResourceSizeAt(long index) { return VkImageFormatProperties.get_maxResourceSize(this.segment(), index); }
    /// {@return `maxResourceSize`}
    public @CType("VkDeviceSize") long maxResourceSize() { return VkImageFormatProperties.get_maxResourceSize(this.segment()); }
    /// Sets `maxResourceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxResourceSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxResourceSize.set(segment, 0L, index, value); }
    /// Sets `maxResourceSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxResourceSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkImageFormatProperties.set_maxResourceSize(segment, 0L, value); }
    /// Sets `maxResourceSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxResourceSizeAt(long index, @CType("VkDeviceSize") long value) { VkImageFormatProperties.set_maxResourceSize(this.segment(), index, value); return this; }
    /// Sets `maxResourceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxResourceSize(@CType("VkDeviceSize") long value) { VkImageFormatProperties.set_maxResourceSize(this.segment(), value); return this; }

}
