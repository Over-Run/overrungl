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
/// ### bindingCount
/// [VarHandle][#VH_bindingCount] - [Getter][#bindingCount()] - [Setter][#bindingCount(int)]
/// ### pBindingFlags
/// [VarHandle][#VH_pBindingFlags] - [Getter][#pBindingFlags()] - [Setter][#pBindingFlags(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorSetLayoutBindingFlagsCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t bindingCount;
///     const VkDescriptorBindingFlags * pBindingFlags;
/// } VkDescriptorSetLayoutBindingFlagsCreateInfo;
/// ```
public final class VkDescriptorSetLayoutBindingFlagsCreateInfo extends Struct {
    /// The struct layout of `VkDescriptorSetLayoutBindingFlagsCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withName("pBindingFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `bindingCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bindingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindingCount"));
    /// The [VarHandle] of `pBindingFlags` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBindingFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBindingFlags"));

    /// Creates `VkDescriptorSetLayoutBindingFlagsCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetLayoutBindingFlagsCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetLayoutBindingFlagsCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfo(segment); }

    /// Creates `VkDescriptorSetLayoutBindingFlagsCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetLayoutBindingFlagsCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDescriptorSetLayoutBindingFlagsCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutBindingFlagsCreateInfo`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetLayoutBindingFlagsCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetLayoutBindingFlagsCreateInfo`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDescriptorSetLayoutBindingFlagsCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorSetLayoutBindingFlagsCreateInfo`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo asSlice(long index) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDescriptorSetLayoutBindingFlagsCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorSetLayoutBindingFlagsCreateInfo`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo asSlice(long index, long count) { return new VkDescriptorSetLayoutBindingFlagsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo sType(@CType("VkStructureType") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `bindingCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bindingCount(MemorySegment segment, long index) { return (int) VH_bindingCount.get(segment, 0L, index); }
    /// {@return `bindingCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bindingCount(MemorySegment segment) { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_bindingCount(segment, 0L); }
    /// {@return `bindingCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bindingCountAt(long index) { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_bindingCount(this.segment(), index); }
    /// {@return `bindingCount`}
    public @CType("uint32_t") int bindingCount() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_bindingCount(this.segment()); }
    /// Sets `bindingCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bindingCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bindingCount.set(segment, 0L, index, value); }
    /// Sets `bindingCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bindingCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_bindingCount(segment, 0L, value); }
    /// Sets `bindingCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCountAt(long index, @CType("uint32_t") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_bindingCount(this.segment(), index, value); return this; }
    /// Sets `bindingCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCount(@CType("uint32_t") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_bindingCount(this.segment(), value); return this; }

    /// {@return `pBindingFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorBindingFlags *") java.lang.foreign.MemorySegment get_pBindingFlags(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBindingFlags.get(segment, 0L, index); }
    /// {@return `pBindingFlags`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorBindingFlags *") java.lang.foreign.MemorySegment get_pBindingFlags(MemorySegment segment) { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_pBindingFlags(segment, 0L); }
    /// {@return `pBindingFlags` at the given index}
    /// @param index the index
    public @CType("const VkDescriptorBindingFlags *") java.lang.foreign.MemorySegment pBindingFlagsAt(long index) { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_pBindingFlags(this.segment(), index); }
    /// {@return `pBindingFlags`}
    public @CType("const VkDescriptorBindingFlags *") java.lang.foreign.MemorySegment pBindingFlags() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.get_pBindingFlags(this.segment()); }
    /// Sets `pBindingFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBindingFlags(MemorySegment segment, long index, @CType("const VkDescriptorBindingFlags *") java.lang.foreign.MemorySegment value) { VH_pBindingFlags.set(segment, 0L, index, value); }
    /// Sets `pBindingFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBindingFlags(MemorySegment segment, @CType("const VkDescriptorBindingFlags *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_pBindingFlags(segment, 0L, value); }
    /// Sets `pBindingFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlagsAt(long index, @CType("const VkDescriptorBindingFlags *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_pBindingFlags(this.segment(), index, value); return this; }
    /// Sets `pBindingFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlags(@CType("const VkDescriptorBindingFlags *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.set_pBindingFlags(this.segment(), value); return this; }

}
