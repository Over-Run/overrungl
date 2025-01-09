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
/// ### dstBinding
/// [VarHandle][#VH_dstBinding] - [Getter][#dstBinding()] - [Setter][#dstBinding(int)]
/// ### dstArrayElement
/// [VarHandle][#VH_dstArrayElement] - [Getter][#dstArrayElement()] - [Setter][#dstArrayElement(int)]
/// ### descriptorCount
/// [VarHandle][#VH_descriptorCount] - [Getter][#descriptorCount()] - [Setter][#descriptorCount(int)]
/// ### descriptorType
/// [VarHandle][#VH_descriptorType] - [Getter][#descriptorType()] - [Setter][#descriptorType(int)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorUpdateTemplateEntry {
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
///     VkDescriptorType descriptorType;
///     size_t offset;
///     size_t stride;
/// } VkDescriptorUpdateTemplateEntry;
/// ```
public final class VkDescriptorUpdateTemplateEntry extends Struct {
    /// The struct layout of `VkDescriptorUpdateTemplateEntry`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    /// The [VarHandle] of `dstBinding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBinding"));
    /// The [VarHandle] of `dstArrayElement` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstArrayElement"));
    /// The [VarHandle] of `descriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));
    /// The [VarHandle] of `descriptorType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    /// Creates `VkDescriptorUpdateTemplateEntry` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorUpdateTemplateEntry(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorUpdateTemplateEntry` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateEntry of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateEntry(segment); }

    /// Creates `VkDescriptorUpdateTemplateEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateEntry ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorUpdateTemplateEntry` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateEntry ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateEntry(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry alloc(SegmentAllocator allocator) { return new VkDescriptorUpdateTemplateEntry(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorUpdateTemplateEntry` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorUpdateTemplateEntry`
    public static VkDescriptorUpdateTemplateEntry alloc(SegmentAllocator allocator, long count) { return new VkDescriptorUpdateTemplateEntry(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDescriptorUpdateTemplateEntry`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorUpdateTemplateEntry`
    public VkDescriptorUpdateTemplateEntry asSlice(long index) { return new VkDescriptorUpdateTemplateEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDescriptorUpdateTemplateEntry`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorUpdateTemplateEntry`
    public VkDescriptorUpdateTemplateEntry asSlice(long index, long count) { return new VkDescriptorUpdateTemplateEntry(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `dstBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstBinding(MemorySegment segment, long index) { return (int) VH_dstBinding.get(segment, 0L, index); }
    /// {@return `dstBinding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstBinding(MemorySegment segment) { return VkDescriptorUpdateTemplateEntry.get_dstBinding(segment, 0L); }
    /// {@return `dstBinding` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dstBindingAt(long index) { return VkDescriptorUpdateTemplateEntry.get_dstBinding(this.segment(), index); }
    /// {@return `dstBinding`}
    public @CType("uint32_t") int dstBinding() { return VkDescriptorUpdateTemplateEntry.get_dstBinding(this.segment()); }
    /// Sets `dstBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstBinding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstBinding.set(segment, 0L, index, value); }
    /// Sets `dstBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstBinding(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_dstBinding(segment, 0L, value); }
    /// Sets `dstBinding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry dstBindingAt(long index, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_dstBinding(this.segment(), index, value); return this; }
    /// Sets `dstBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry dstBinding(@CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_dstBinding(this.segment(), value); return this; }

    /// {@return `dstArrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstArrayElement(MemorySegment segment, long index) { return (int) VH_dstArrayElement.get(segment, 0L, index); }
    /// {@return `dstArrayElement`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstArrayElement(MemorySegment segment) { return VkDescriptorUpdateTemplateEntry.get_dstArrayElement(segment, 0L); }
    /// {@return `dstArrayElement` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dstArrayElementAt(long index) { return VkDescriptorUpdateTemplateEntry.get_dstArrayElement(this.segment(), index); }
    /// {@return `dstArrayElement`}
    public @CType("uint32_t") int dstArrayElement() { return VkDescriptorUpdateTemplateEntry.get_dstArrayElement(this.segment()); }
    /// Sets `dstArrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstArrayElement(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstArrayElement.set(segment, 0L, index, value); }
    /// Sets `dstArrayElement` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstArrayElement(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_dstArrayElement(segment, 0L, value); }
    /// Sets `dstArrayElement` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry dstArrayElementAt(long index, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_dstArrayElement(this.segment(), index, value); return this; }
    /// Sets `dstArrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry dstArrayElement(@CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_dstArrayElement(this.segment(), value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment) { return VkDescriptorUpdateTemplateEntry.get_descriptorCount(segment, 0L); }
    /// {@return `descriptorCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorCountAt(long index) { return VkDescriptorUpdateTemplateEntry.get_descriptorCount(this.segment(), index); }
    /// {@return `descriptorCount`}
    public @CType("uint32_t") int descriptorCount() { return VkDescriptorUpdateTemplateEntry.get_descriptorCount(this.segment()); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_descriptorCount(segment, 0L, value); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry descriptorCountAt(long index, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_descriptorCount(this.segment(), index, value); return this; }
    /// Sets `descriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry descriptorCount(@CType("uint32_t") int value) { VkDescriptorUpdateTemplateEntry.set_descriptorCount(this.segment(), value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorType") int get_descriptorType(MemorySegment segment, long index) { return (int) VH_descriptorType.get(segment, 0L, index); }
    /// {@return `descriptorType`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorType") int get_descriptorType(MemorySegment segment) { return VkDescriptorUpdateTemplateEntry.get_descriptorType(segment, 0L); }
    /// {@return `descriptorType` at the given index}
    /// @param index the index
    public @CType("VkDescriptorType") int descriptorTypeAt(long index) { return VkDescriptorUpdateTemplateEntry.get_descriptorType(this.segment(), index); }
    /// {@return `descriptorType`}
    public @CType("VkDescriptorType") int descriptorType() { return VkDescriptorUpdateTemplateEntry.get_descriptorType(this.segment()); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorType(MemorySegment segment, long index, @CType("VkDescriptorType") int value) { VH_descriptorType.set(segment, 0L, index, value); }
    /// Sets `descriptorType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorType(MemorySegment segment, @CType("VkDescriptorType") int value) { VkDescriptorUpdateTemplateEntry.set_descriptorType(segment, 0L, value); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry descriptorTypeAt(long index, @CType("VkDescriptorType") int value) { VkDescriptorUpdateTemplateEntry.set_descriptorType(this.segment(), index, value); return this; }
    /// Sets `descriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry descriptorType(@CType("VkDescriptorType") int value) { VkDescriptorUpdateTemplateEntry.set_descriptorType(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_offset(MemorySegment segment) { return VkDescriptorUpdateTemplateEntry.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("size_t") long offsetAt(long index) { return VkDescriptorUpdateTemplateEntry.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("size_t") long offset() { return VkDescriptorUpdateTemplateEntry.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("size_t") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("size_t") long value) { VkDescriptorUpdateTemplateEntry.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry offsetAt(long index, @CType("size_t") long value) { VkDescriptorUpdateTemplateEntry.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry offset(@CType("size_t") long value) { VkDescriptorUpdateTemplateEntry.set_offset(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_stride(MemorySegment segment, long index) { return (long) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_stride(MemorySegment segment) { return VkDescriptorUpdateTemplateEntry.get_stride(segment, 0L); }
    /// {@return `stride` at the given index}
    /// @param index the index
    public @CType("size_t") long strideAt(long index) { return VkDescriptorUpdateTemplateEntry.get_stride(this.segment(), index); }
    /// {@return `stride`}
    public @CType("size_t") long stride() { return VkDescriptorUpdateTemplateEntry.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("size_t") long value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("size_t") long value) { VkDescriptorUpdateTemplateEntry.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry strideAt(long index, @CType("size_t") long value) { VkDescriptorUpdateTemplateEntry.set_stride(this.segment(), index, value); return this; }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateEntry stride(@CType("size_t") long value) { VkDescriptorUpdateTemplateEntry.set_stride(this.segment(), value); return this; }

}
