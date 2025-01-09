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
/// ### image
/// [VarHandle][#VH_image] - [Getter][#image()] - [Setter][#image(java.lang.foreign.MemorySegment)]
/// ### bindCount
/// [VarHandle][#VH_bindCount] - [Getter][#bindCount()] - [Setter][#bindCount(int)]
/// ### pBinds
/// [VarHandle][#VH_pBinds] - [Getter][#pBinds()] - [Setter][#pBinds(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseImageMemoryBindInfo {
///     VkImage image;
///     uint32_t bindCount;
///     const VkSparseImageMemoryBind * pBinds;
/// } VkSparseImageMemoryBindInfo;
/// ```
public final class VkSparseImageMemoryBindInfo extends Struct {
    /// The struct layout of `VkSparseImageMemoryBindInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withName("pBinds")
    );
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The [VarHandle] of `bindCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindCount"));
    /// The [VarHandle] of `pBinds` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBinds"));

    /// Creates `VkSparseImageMemoryBindInfo` with the given segment.
    /// @param segment the memory segment
    public VkSparseImageMemoryBindInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseImageMemoryBindInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryBindInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryBindInfo(segment); }

    /// Creates `VkSparseImageMemoryBindInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryBindInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryBindInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseImageMemoryBindInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryBindInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryBindInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSparseImageMemoryBindInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageMemoryBindInfo`
    public static VkSparseImageMemoryBindInfo alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryBindInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseImageMemoryBindInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageMemoryBindInfo`
    public static VkSparseImageMemoryBindInfo alloc(SegmentAllocator allocator, long count) { return new VkSparseImageMemoryBindInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment) { return VkSparseImageMemoryBindInfo.get_image(segment, 0L); }
    /// {@return `image` at the given index}
    /// @param index the index
    public @CType("VkImage") java.lang.foreign.MemorySegment imageAt(long index) { return VkSparseImageMemoryBindInfo.get_image(this.segment(), index); }
    /// {@return `image`}
    public @CType("VkImage") java.lang.foreign.MemorySegment image() { return VkSparseImageMemoryBindInfo.get_image(this.segment()); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_image(MemorySegment segment, long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_image(MemorySegment segment, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBindInfo.set_image(segment, 0L, value); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBindInfo imageAt(long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBindInfo.set_image(this.segment(), index, value); return this; }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBindInfo image(@CType("VkImage") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBindInfo.set_image(this.segment(), value); return this; }

    /// {@return `bindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bindCount(MemorySegment segment, long index) { return (int) VH_bindCount.get(segment, 0L, index); }
    /// {@return `bindCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bindCount(MemorySegment segment) { return VkSparseImageMemoryBindInfo.get_bindCount(segment, 0L); }
    /// {@return `bindCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bindCountAt(long index) { return VkSparseImageMemoryBindInfo.get_bindCount(this.segment(), index); }
    /// {@return `bindCount`}
    public @CType("uint32_t") int bindCount() { return VkSparseImageMemoryBindInfo.get_bindCount(this.segment()); }
    /// Sets `bindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bindCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bindCount.set(segment, 0L, index, value); }
    /// Sets `bindCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bindCount(MemorySegment segment, @CType("uint32_t") int value) { VkSparseImageMemoryBindInfo.set_bindCount(segment, 0L, value); }
    /// Sets `bindCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBindInfo bindCountAt(long index, @CType("uint32_t") int value) { VkSparseImageMemoryBindInfo.set_bindCount(this.segment(), index, value); return this; }
    /// Sets `bindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBindInfo bindCount(@CType("uint32_t") int value) { VkSparseImageMemoryBindInfo.set_bindCount(this.segment(), value); return this; }

    /// {@return `pBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSparseImageMemoryBind *") java.lang.foreign.MemorySegment get_pBinds(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBinds.get(segment, 0L, index); }
    /// {@return `pBinds`}
    /// @param segment the segment of the struct
    public static @CType("const VkSparseImageMemoryBind *") java.lang.foreign.MemorySegment get_pBinds(MemorySegment segment) { return VkSparseImageMemoryBindInfo.get_pBinds(segment, 0L); }
    /// {@return `pBinds` at the given index}
    /// @param index the index
    public @CType("const VkSparseImageMemoryBind *") java.lang.foreign.MemorySegment pBindsAt(long index) { return VkSparseImageMemoryBindInfo.get_pBinds(this.segment(), index); }
    /// {@return `pBinds`}
    public @CType("const VkSparseImageMemoryBind *") java.lang.foreign.MemorySegment pBinds() { return VkSparseImageMemoryBindInfo.get_pBinds(this.segment()); }
    /// Sets `pBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBinds(MemorySegment segment, long index, @CType("const VkSparseImageMemoryBind *") java.lang.foreign.MemorySegment value) { VH_pBinds.set(segment, 0L, index, value); }
    /// Sets `pBinds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBinds(MemorySegment segment, @CType("const VkSparseImageMemoryBind *") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBindInfo.set_pBinds(segment, 0L, value); }
    /// Sets `pBinds` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBindInfo pBindsAt(long index, @CType("const VkSparseImageMemoryBind *") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBindInfo.set_pBinds(this.segment(), index, value); return this; }
    /// Sets `pBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryBindInfo pBinds(@CType("const VkSparseImageMemoryBind *") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryBindInfo.set_pBinds(this.segment(), value); return this; }

}
