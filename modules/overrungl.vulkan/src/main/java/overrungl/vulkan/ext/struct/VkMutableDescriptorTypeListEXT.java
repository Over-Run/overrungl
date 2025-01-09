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
/// ### descriptorTypeCount
/// [VarHandle][#VH_descriptorTypeCount] - [Getter][#descriptorTypeCount()] - [Setter][#descriptorTypeCount(int)]
/// ### pDescriptorTypes
/// [VarHandle][#VH_pDescriptorTypes] - [Getter][#pDescriptorTypes()] - [Setter][#pDescriptorTypes(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMutableDescriptorTypeListEXT {
///     uint32_t descriptorTypeCount;
///     const VkDescriptorType * pDescriptorTypes;
/// } VkMutableDescriptorTypeListEXT;
/// ```
public final class VkMutableDescriptorTypeListEXT extends Struct {
    /// The struct layout of `VkMutableDescriptorTypeListEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("descriptorTypeCount"),
        ValueLayout.ADDRESS.withName("pDescriptorTypes")
    );
    /// The [VarHandle] of `descriptorTypeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorTypeCount"));
    /// The [VarHandle] of `pDescriptorTypes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDescriptorTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorTypes"));

    /// Creates `VkMutableDescriptorTypeListEXT` with the given segment.
    /// @param segment the memory segment
    public VkMutableDescriptorTypeListEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMutableDescriptorTypeListEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeListEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListEXT(segment); }

    /// Creates `VkMutableDescriptorTypeListEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeListEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMutableDescriptorTypeListEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeListEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMutableDescriptorTypeListEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMutableDescriptorTypeListEXT`
    public static VkMutableDescriptorTypeListEXT alloc(SegmentAllocator allocator) { return new VkMutableDescriptorTypeListEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMutableDescriptorTypeListEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMutableDescriptorTypeListEXT`
    public static VkMutableDescriptorTypeListEXT alloc(SegmentAllocator allocator, long count) { return new VkMutableDescriptorTypeListEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMutableDescriptorTypeListEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMutableDescriptorTypeListEXT`
    public VkMutableDescriptorTypeListEXT asSlice(long index) { return new VkMutableDescriptorTypeListEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMutableDescriptorTypeListEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMutableDescriptorTypeListEXT`
    public VkMutableDescriptorTypeListEXT asSlice(long index, long count) { return new VkMutableDescriptorTypeListEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `descriptorTypeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorTypeCount(MemorySegment segment, long index) { return (int) VH_descriptorTypeCount.get(segment, 0L, index); }
    /// {@return `descriptorTypeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorTypeCount(MemorySegment segment) { return VkMutableDescriptorTypeListEXT.get_descriptorTypeCount(segment, 0L); }
    /// {@return `descriptorTypeCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorTypeCountAt(long index) { return VkMutableDescriptorTypeListEXT.get_descriptorTypeCount(this.segment(), index); }
    /// {@return `descriptorTypeCount`}
    public @CType("uint32_t") int descriptorTypeCount() { return VkMutableDescriptorTypeListEXT.get_descriptorTypeCount(this.segment()); }
    /// Sets `descriptorTypeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorTypeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorTypeCount.set(segment, 0L, index, value); }
    /// Sets `descriptorTypeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorTypeCount(MemorySegment segment, @CType("uint32_t") int value) { VkMutableDescriptorTypeListEXT.set_descriptorTypeCount(segment, 0L, value); }
    /// Sets `descriptorTypeCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeListEXT descriptorTypeCountAt(long index, @CType("uint32_t") int value) { VkMutableDescriptorTypeListEXT.set_descriptorTypeCount(this.segment(), index, value); return this; }
    /// Sets `descriptorTypeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeListEXT descriptorTypeCount(@CType("uint32_t") int value) { VkMutableDescriptorTypeListEXT.set_descriptorTypeCount(this.segment(), value); return this; }

    /// {@return `pDescriptorTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorType *") java.lang.foreign.MemorySegment get_pDescriptorTypes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDescriptorTypes.get(segment, 0L, index); }
    /// {@return `pDescriptorTypes`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorType *") java.lang.foreign.MemorySegment get_pDescriptorTypes(MemorySegment segment) { return VkMutableDescriptorTypeListEXT.get_pDescriptorTypes(segment, 0L); }
    /// {@return `pDescriptorTypes` at the given index}
    /// @param index the index
    public @CType("const VkDescriptorType *") java.lang.foreign.MemorySegment pDescriptorTypesAt(long index) { return VkMutableDescriptorTypeListEXT.get_pDescriptorTypes(this.segment(), index); }
    /// {@return `pDescriptorTypes`}
    public @CType("const VkDescriptorType *") java.lang.foreign.MemorySegment pDescriptorTypes() { return VkMutableDescriptorTypeListEXT.get_pDescriptorTypes(this.segment()); }
    /// Sets `pDescriptorTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDescriptorTypes(MemorySegment segment, long index, @CType("const VkDescriptorType *") java.lang.foreign.MemorySegment value) { VH_pDescriptorTypes.set(segment, 0L, index, value); }
    /// Sets `pDescriptorTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDescriptorTypes(MemorySegment segment, @CType("const VkDescriptorType *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeListEXT.set_pDescriptorTypes(segment, 0L, value); }
    /// Sets `pDescriptorTypes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeListEXT pDescriptorTypesAt(long index, @CType("const VkDescriptorType *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeListEXT.set_pDescriptorTypes(this.segment(), index, value); return this; }
    /// Sets `pDescriptorTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeListEXT pDescriptorTypes(@CType("const VkDescriptorType *") java.lang.foreign.MemorySegment value) { VkMutableDescriptorTypeListEXT.set_pDescriptorTypes(this.segment(), value); return this; }

}
