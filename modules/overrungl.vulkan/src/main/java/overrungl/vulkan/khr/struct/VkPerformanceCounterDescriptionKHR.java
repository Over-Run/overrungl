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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### name
/// [Byte offset][#OFFSET_name] - [Memory layout][#ML_name] - [Getter][#name()] - [Setter][#name(MemorySegment)]
/// ### category
/// [Byte offset][#OFFSET_category] - [Memory layout][#ML_category] - [Getter][#category()] - [Setter][#category(MemorySegment)]
/// ### description
/// [Byte offset][#OFFSET_description] - [Memory layout][#ML_description] - [Getter][#description()] - [Setter][#description(MemorySegment)]
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
public sealed class VkPerformanceCounterDescriptionKHR extends Struct {
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout ML_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The byte offset of `category`.
    public static final long OFFSET_category = LAYOUT.byteOffset(PathElement.groupElement("category"));
    /// The memory layout of `category`.
    public static final MemoryLayout ML_category = LAYOUT.select(PathElement.groupElement("category"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPerformanceCounterDescriptionKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterDescriptionKHR`
    public static VkPerformanceCounterDescriptionKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterDescriptionKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceCounterDescriptionKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceCounterDescriptionKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPerformanceCounterDescriptionKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterDescriptionKHR`
    public static VkPerformanceCounterDescriptionKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkPerformanceCounterDescriptionFlagsKHR") int flags, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment name, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment category, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment description) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).name(name).category(category).description(description); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR copyFrom(VkPerformanceCounterDescriptionKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_sType(segment, 0L); }
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
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR sType(@CType("VkStructureType") int value) { VkPerformanceCounterDescriptionKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPerformanceCounterDescriptionKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR pNext(@CType("void *") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceCounterDescriptionFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceCounterDescriptionFlagsKHR") int get_flags(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_flags(segment, 0L); }
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
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR flags(@CType("VkPerformanceCounterDescriptionFlagsKHR") int value) { VkPerformanceCounterDescriptionKHR.set_flags(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_name(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_name, index), ML_name); }
    /// {@return `name`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_name(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_name(segment, 0L); }
    /// {@return `name`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment name() { return VkPerformanceCounterDescriptionKHR.get_name(this.segment()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_name(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_name, index), ML_name.byteSize()); }
    /// Sets `name` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_name(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_name(segment, 0L, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR name(@CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_name(this.segment(), value); return this; }

    /// {@return `category` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_category(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_category, index), ML_category); }
    /// {@return `category`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_category(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_category(segment, 0L); }
    /// {@return `category`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment category() { return VkPerformanceCounterDescriptionKHR.get_category(this.segment()); }
    /// Sets `category` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_category(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_category, index), ML_category.byteSize()); }
    /// Sets `category` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_category(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_category(segment, 0L, value); }
    /// Sets `category` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR category(@CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_category(this.segment(), value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), ML_description); }
    /// {@return `description`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment get_description(MemorySegment segment) { return VkPerformanceCounterDescriptionKHR.get_description(segment, 0L); }
    /// {@return `description`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment description() { return VkPerformanceCounterDescriptionKHR.get_description(this.segment()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_description(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), ML_description.byteSize()); }
    /// Sets `description` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_description(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_description(segment, 0L, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterDescriptionKHR description(@CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_description(this.segment(), value); return this; }

    /// A buffer of [VkPerformanceCounterDescriptionKHR].
    public static final class Buffer extends VkPerformanceCounterDescriptionKHR {
        private final long elementCount;

        /// Creates `VkPerformanceCounterDescriptionKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceCounterDescriptionKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPerformanceCounterDescriptionKHR`
        public VkPerformanceCounterDescriptionKHR asSlice(long index) { return new VkPerformanceCounterDescriptionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceCounterDescriptionKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceCounterDescriptionKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceCounterDescriptionKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceCounterDescriptionKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPerformanceCounterDescriptionKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPerformanceCounterDescriptionFlagsKHR") int flagsAt(long index) { return VkPerformanceCounterDescriptionKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPerformanceCounterDescriptionFlagsKHR") int value) { VkPerformanceCounterDescriptionKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `name` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment nameAt(long index) { return VkPerformanceCounterDescriptionKHR.get_name(this.segment(), index); }
        /// Sets `name` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nameAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_name(this.segment(), index, value); return this; }

        /// {@return `category` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment categoryAt(long index) { return VkPerformanceCounterDescriptionKHR.get_category(this.segment(), index); }
        /// Sets `category` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer categoryAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_category(this.segment(), index, value); return this; }

        /// {@return `description` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment descriptionAt(long index) { return VkPerformanceCounterDescriptionKHR.get_description(this.segment(), index); }
        /// Sets `description` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptionAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") MemorySegment value) { VkPerformanceCounterDescriptionKHR.set_description(this.segment(), index, value); return this; }

    }
}
