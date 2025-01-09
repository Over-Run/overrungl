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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### descriptorCount
/// [VarHandle][#VH_descriptorCount] - [Getter][#descriptorCount()] - [Setter][#descriptorCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorPoolSize {
///     VkDescriptorType type;
///     uint32_t descriptorCount;
/// } VkDescriptorPoolSize;
/// ```
public final class VkDescriptorPoolSize extends Struct {
    /// The struct layout of `VkDescriptorPoolSize`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
    );
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `descriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));

    /// Creates `VkDescriptorPoolSize` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorPoolSize(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorPoolSize` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolSize of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorPoolSize(segment); }

    /// Creates `VkDescriptorPoolSize` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolSize ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorPoolSize(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorPoolSize` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolSize ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorPoolSize(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDescriptorPoolSize` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorPoolSize`
    public static VkDescriptorPoolSize alloc(SegmentAllocator allocator) { return new VkDescriptorPoolSize(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorPoolSize` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorPoolSize`
    public static VkDescriptorPoolSize alloc(SegmentAllocator allocator, long count) { return new VkDescriptorPoolSize(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDescriptorPoolSize`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorPoolSize`
    public VkDescriptorPoolSize asSlice(long index) { return new VkDescriptorPoolSize(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDescriptorPoolSize`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorPoolSize`
    public VkDescriptorPoolSize asSlice(long index, long count) { return new VkDescriptorPoolSize(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorType") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorType") int get_type(MemorySegment segment) { return VkDescriptorPoolSize.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkDescriptorType") int typeAt(long index) { return VkDescriptorPoolSize.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkDescriptorType") int type() { return VkDescriptorPoolSize.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkDescriptorType") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkDescriptorType") int value) { VkDescriptorPoolSize.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolSize typeAt(long index, @CType("VkDescriptorType") int value) { VkDescriptorPoolSize.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolSize type(@CType("VkDescriptorType") int value) { VkDescriptorPoolSize.set_type(this.segment(), value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment) { return VkDescriptorPoolSize.get_descriptorCount(segment, 0L); }
    /// {@return `descriptorCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorCountAt(long index) { return VkDescriptorPoolSize.get_descriptorCount(this.segment(), index); }
    /// {@return `descriptorCount`}
    public @CType("uint32_t") int descriptorCount() { return VkDescriptorPoolSize.get_descriptorCount(this.segment()); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorPoolSize.set_descriptorCount(segment, 0L, value); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolSize descriptorCountAt(long index, @CType("uint32_t") int value) { VkDescriptorPoolSize.set_descriptorCount(this.segment(), index, value); return this; }
    /// Sets `descriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolSize descriptorCount(@CType("uint32_t") int value) { VkDescriptorPoolSize.set_descriptorCount(this.segment(), value); return this; }

}
