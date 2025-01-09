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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### bindingCount
/// [VarHandle][#VH_bindingCount] - [Getter][#bindingCount()] - [Setter][#bindingCount(int)]
/// ### pBindings
/// [VarHandle][#VH_pBindings] - [Getter][#pBindings()] - [Setter][#pBindings(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorSetLayoutCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDescriptorSetLayoutCreateFlags flags;
///     uint32_t bindingCount;
///     const VkDescriptorSetLayoutBinding * pBindings;
/// } VkDescriptorSetLayoutCreateInfo;
/// ```
public final class VkDescriptorSetLayoutCreateInfo extends Struct {
    /// The struct layout of `VkDescriptorSetLayoutCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withName("pBindings")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `bindingCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bindingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindingCount"));
    /// The [VarHandle] of `pBindings` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBindings"));

    /// Creates `VkDescriptorSetLayoutCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorSetLayoutCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorSetLayoutCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutCreateInfo(segment); }

    /// Creates `VkDescriptorSetLayoutCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorSetLayoutCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorSetLayoutCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDescriptorSetLayoutCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutCreateInfo`
    public static VkDescriptorSetLayoutCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorSetLayoutCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetLayoutCreateInfo`
    public static VkDescriptorSetLayoutCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorSetLayoutCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorSetLayoutCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorSetLayoutCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorSetLayoutCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorSetLayoutCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo sType(@CType("VkStructureType") int value) { VkDescriptorSetLayoutCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorSetLayoutCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDescriptorSetLayoutCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDescriptorSetLayoutCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorSetLayoutCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorSetLayoutCreateFlags") int get_flags(MemorySegment segment) { return VkDescriptorSetLayoutCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkDescriptorSetLayoutCreateFlags") int flagsAt(long index) { return VkDescriptorSetLayoutCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkDescriptorSetLayoutCreateFlags") int flags() { return VkDescriptorSetLayoutCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDescriptorSetLayoutCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDescriptorSetLayoutCreateFlags") int value) { VkDescriptorSetLayoutCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo flagsAt(long index, @CType("VkDescriptorSetLayoutCreateFlags") int value) { VkDescriptorSetLayoutCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo flags(@CType("VkDescriptorSetLayoutCreateFlags") int value) { VkDescriptorSetLayoutCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `bindingCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bindingCount(MemorySegment segment, long index) { return (int) VH_bindingCount.get(segment, 0L, index); }
    /// {@return `bindingCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bindingCount(MemorySegment segment) { return VkDescriptorSetLayoutCreateInfo.get_bindingCount(segment, 0L); }
    /// {@return `bindingCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bindingCountAt(long index) { return VkDescriptorSetLayoutCreateInfo.get_bindingCount(this.segment(), index); }
    /// {@return `bindingCount`}
    public @CType("uint32_t") int bindingCount() { return VkDescriptorSetLayoutCreateInfo.get_bindingCount(this.segment()); }
    /// Sets `bindingCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bindingCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bindingCount.set(segment, 0L, index, value); }
    /// Sets `bindingCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bindingCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorSetLayoutCreateInfo.set_bindingCount(segment, 0L, value); }
    /// Sets `bindingCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo bindingCountAt(long index, @CType("uint32_t") int value) { VkDescriptorSetLayoutCreateInfo.set_bindingCount(this.segment(), index, value); return this; }
    /// Sets `bindingCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo bindingCount(@CType("uint32_t") int value) { VkDescriptorSetLayoutCreateInfo.set_bindingCount(this.segment(), value); return this; }

    /// {@return `pBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorSetLayoutBinding *") java.lang.foreign.MemorySegment get_pBindings(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBindings.get(segment, 0L, index); }
    /// {@return `pBindings`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorSetLayoutBinding *") java.lang.foreign.MemorySegment get_pBindings(MemorySegment segment) { return VkDescriptorSetLayoutCreateInfo.get_pBindings(segment, 0L); }
    /// {@return `pBindings` at the given index}
    /// @param index the index
    public @CType("const VkDescriptorSetLayoutBinding *") java.lang.foreign.MemorySegment pBindingsAt(long index) { return VkDescriptorSetLayoutCreateInfo.get_pBindings(this.segment(), index); }
    /// {@return `pBindings`}
    public @CType("const VkDescriptorSetLayoutBinding *") java.lang.foreign.MemorySegment pBindings() { return VkDescriptorSetLayoutCreateInfo.get_pBindings(this.segment()); }
    /// Sets `pBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBindings(MemorySegment segment, long index, @CType("const VkDescriptorSetLayoutBinding *") java.lang.foreign.MemorySegment value) { VH_pBindings.set(segment, 0L, index, value); }
    /// Sets `pBindings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBindings(MemorySegment segment, @CType("const VkDescriptorSetLayoutBinding *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutCreateInfo.set_pBindings(segment, 0L, value); }
    /// Sets `pBindings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo pBindingsAt(long index, @CType("const VkDescriptorSetLayoutBinding *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutCreateInfo.set_pBindings(this.segment(), index, value); return this; }
    /// Sets `pBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutCreateInfo pBindings(@CType("const VkDescriptorSetLayoutBinding *") java.lang.foreign.MemorySegment value) { VkDescriptorSetLayoutCreateInfo.set_pBindings(this.segment(), value); return this; }

}
