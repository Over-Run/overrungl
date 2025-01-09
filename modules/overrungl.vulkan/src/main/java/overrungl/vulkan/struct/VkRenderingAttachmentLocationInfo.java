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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### colorAttachmentCount
/// [VarHandle][#VH_colorAttachmentCount] - [Getter][#colorAttachmentCount()] - [Setter][#colorAttachmentCount(int)]
/// ### pColorAttachmentLocations
/// [VarHandle][#VH_pColorAttachmentLocations] - [Getter][#pColorAttachmentLocations()] - [Setter][#pColorAttachmentLocations(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderingAttachmentLocationInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t colorAttachmentCount;
///     const uint32_t * pColorAttachmentLocations;
/// } VkRenderingAttachmentLocationInfo;
/// ```
public final class VkRenderingAttachmentLocationInfo extends Struct {
    /// The struct layout of `VkRenderingAttachmentLocationInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentLocations")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `pColorAttachmentLocations` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorAttachmentLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentLocations"));

    /// Creates `VkRenderingAttachmentLocationInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderingAttachmentLocationInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderingAttachmentLocationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentLocationInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAttachmentLocationInfo(segment); }

    /// Creates `VkRenderingAttachmentLocationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentLocationInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAttachmentLocationInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderingAttachmentLocationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentLocationInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAttachmentLocationInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderingAttachmentLocationInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingAttachmentLocationInfo`
    public static VkRenderingAttachmentLocationInfo alloc(SegmentAllocator allocator) { return new VkRenderingAttachmentLocationInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderingAttachmentLocationInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingAttachmentLocationInfo`
    public static VkRenderingAttachmentLocationInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingAttachmentLocationInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkRenderingAttachmentLocationInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderingAttachmentLocationInfo`
    public VkRenderingAttachmentLocationInfo asSlice(long index) { return new VkRenderingAttachmentLocationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkRenderingAttachmentLocationInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderingAttachmentLocationInfo`
    public VkRenderingAttachmentLocationInfo asSlice(long index, long count) { return new VkRenderingAttachmentLocationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderingAttachmentLocationInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderingAttachmentLocationInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderingAttachmentLocationInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderingAttachmentLocationInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentLocationInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderingAttachmentLocationInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentLocationInfo sType(@CType("VkStructureType") int value) { VkRenderingAttachmentLocationInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderingAttachmentLocationInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderingAttachmentLocationInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderingAttachmentLocationInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentLocationInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentLocationInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentLocationInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentLocationInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentLocationInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment) { return VkRenderingAttachmentLocationInfo.get_colorAttachmentCount(segment, 0L); }
    /// {@return `colorAttachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int colorAttachmentCountAt(long index) { return VkRenderingAttachmentLocationInfo.get_colorAttachmentCount(this.segment(), index); }
    /// {@return `colorAttachmentCount`}
    public @CType("uint32_t") int colorAttachmentCount() { return VkRenderingAttachmentLocationInfo.get_colorAttachmentCount(this.segment()); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderingAttachmentLocationInfo.set_colorAttachmentCount(segment, 0L, value); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentLocationInfo colorAttachmentCountAt(long index, @CType("uint32_t") int value) { VkRenderingAttachmentLocationInfo.set_colorAttachmentCount(this.segment(), index, value); return this; }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentLocationInfo colorAttachmentCount(@CType("uint32_t") int value) { VkRenderingAttachmentLocationInfo.set_colorAttachmentCount(this.segment(), value); return this; }

    /// {@return `pColorAttachmentLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pColorAttachmentLocations(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorAttachmentLocations.get(segment, 0L, index); }
    /// {@return `pColorAttachmentLocations`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pColorAttachmentLocations(MemorySegment segment) { return VkRenderingAttachmentLocationInfo.get_pColorAttachmentLocations(segment, 0L); }
    /// {@return `pColorAttachmentLocations` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pColorAttachmentLocationsAt(long index) { return VkRenderingAttachmentLocationInfo.get_pColorAttachmentLocations(this.segment(), index); }
    /// {@return `pColorAttachmentLocations`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pColorAttachmentLocations() { return VkRenderingAttachmentLocationInfo.get_pColorAttachmentLocations(this.segment()); }
    /// Sets `pColorAttachmentLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorAttachmentLocations(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pColorAttachmentLocations.set(segment, 0L, index, value); }
    /// Sets `pColorAttachmentLocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorAttachmentLocations(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentLocationInfo.set_pColorAttachmentLocations(segment, 0L, value); }
    /// Sets `pColorAttachmentLocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentLocationInfo pColorAttachmentLocationsAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentLocationInfo.set_pColorAttachmentLocations(this.segment(), index, value); return this; }
    /// Sets `pColorAttachmentLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentLocationInfo pColorAttachmentLocations(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentLocationInfo.set_pColorAttachmentLocations(this.segment(), value); return this; }

}
