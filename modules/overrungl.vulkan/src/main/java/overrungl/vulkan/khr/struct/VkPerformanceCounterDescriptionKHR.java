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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### name
/// [Byte offset handle][#MH_name] - [Memory layout][#ML_name] - [Getter][#name(long)] - [Setter][#name(long, java.lang.foreign.MemorySegment)]
/// ### category
/// [Byte offset handle][#MH_category] - [Memory layout][#ML_category] - [Getter][#category(long)] - [Setter][#category(long, java.lang.foreign.MemorySegment)]
/// ### description
/// [Byte offset handle][#MH_description] - [Memory layout][#ML_description] - [Getter][#description(long)] - [Setter][#description(long, java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPerformanceCounterDescriptionKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkPerformanceCounterDescriptionFlagsKHR flags;
///     char[VK_MAX_DESCRIPTION_SIZE] name;
///     char[VK_MAX_DESCRIPTION_SIZE] category;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
/// } VkPerformanceCounterDescriptionKHR;
/// ```
public final class VkPerformanceCounterDescriptionKHR extends Struct {
    /// The struct layout of `VkPerformanceCounterDescriptionKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("category"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset handle of `name` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_name = LAYOUT.byteOffsetHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    /// The memory layout of `name`.
    public static final MemoryLayout ML_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The byte offset handle of `category` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_category = LAYOUT.byteOffsetHandle(PathElement.groupElement("category"), PathElement.sequenceElement());
    /// The memory layout of `category`.
    public static final MemoryLayout ML_category = LAYOUT.select(PathElement.groupElement("category"));
    /// The byte offset handle of `description` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_description = LAYOUT.byteOffsetHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));

    /// Creates `VkPerformanceCounterDescriptionKHR` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceCounterDescriptionKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceCounterDescriptionKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterDescriptionKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionKHR(segment); }

    /// Creates `VkPerformanceCounterDescriptionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterDescriptionKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceCounterDescriptionKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterDescriptionKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterDescriptionKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPerformanceCounterDescriptionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterDescriptionKHR`
    public static VkPerformanceCounterDescriptionKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterDescriptionKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceCounterDescriptionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceCounterDescriptionKHR`
    public static VkPerformanceCounterDescriptionKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterDescriptionKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceCounterDescriptionKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPerformanceCounterDescriptionKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPerformanceCounterDescriptionKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceCounterDescriptionKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR sType(@CType("VkStructureType") int value) { VkPerformanceCounterDescriptionKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPerformanceCounterDescriptionKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPerformanceCounterDescriptionKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceCounterDescriptionFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceCounterDescriptionFlagsKHR") int get_flags(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPerformanceCounterDescriptionFlagsKHR") int flagsAt(long index) { return VkPerformanceCounterDescriptionKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPerformanceCounterDescriptionFlagsKHR") int flags() { return VkPerformanceCounterDescriptionKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPerformanceCounterDescriptionFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPerformanceCounterDescriptionFlagsKHR") int value) { VkPerformanceCounterDescriptionKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR flagsAt(long index, @CType("VkPerformanceCounterDescriptionFlagsKHR") int value) { VkPerformanceCounterDescriptionKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR flags(@CType("VkPerformanceCounterDescriptionFlagsKHR") int value) { VkPerformanceCounterDescriptionKHR.set_flags(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_name.invokeExact(0L, elementIndex), index), ML_name); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `name`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_name(segment, 0L, elementIndex); }
    /// {@return `name` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment nameAt(long index, long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_name(this.segment(), index, elementIndex); }
    /// {@return `name`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment name(long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_name(this.segment(), elementIndex); }
    /// Sets `name` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_name(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_name.invokeExact(0L, elementIndex), index), ML_name.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `name` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_name(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_name(segment, 0L, elementIndex, value); }
    /// Sets `name` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR nameAt(long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_name(this.segment(), index, elementIndex, value); return this; }
    /// Sets `name` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR name(long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_name(this.segment(), elementIndex, value); return this; }

    /// {@return `category` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_category(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_category.invokeExact(0L, elementIndex), index), ML_category); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `category`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_category(MemorySegment segment, long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_category(segment, 0L, elementIndex); }
    /// {@return `category` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment categoryAt(long index, long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_category(this.segment(), index, elementIndex); }
    /// {@return `category`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment category(long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_category(this.segment(), elementIndex); }
    /// Sets `category` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_category(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_category.invokeExact(0L, elementIndex), index), ML_category.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `category` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_category(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_category(segment, 0L, elementIndex, value); }
    /// Sets `category` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR categoryAt(long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_category(this.segment(), index, elementIndex, value); return this; }
    /// Sets `category` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR category(long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_category(this.segment(), elementIndex, value); return this; }

    /// {@return `description` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_description.invokeExact(0L, elementIndex), index), ML_description); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `description`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_description(segment, 0L, elementIndex); }
    /// {@return `description` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment descriptionAt(long index, long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_description(this.segment(), index, elementIndex); }
    /// {@return `description`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description(long elementIndex) { return VkPerformanceCounterDescriptionKHR.get_description(this.segment(), elementIndex); }
    /// Sets `description` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_description(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_description.invokeExact(0L, elementIndex), index), ML_description.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `description` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_description(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_description(segment, 0L, elementIndex, value); }
    /// Sets `description` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR descriptionAt(long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_description(this.segment(), index, elementIndex, value); return this; }
    /// Sets `description` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR description(long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_description(this.segment(), elementIndex, value); return this; }

}
