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

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### name
/// [Byte offset][#OFFSET_name] - [Memory layout][#ML_name] - [Getter][#name()] - [Setter][#name(java.lang.foreign.MemorySegment)]
/// ### description
/// [Byte offset][#OFFSET_description] - [Memory layout][#ML_description] - [Getter][#description()] - [Setter][#description(java.lang.foreign.MemorySegment)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### value
/// [Byte offset][#OFFSET_value] - [Memory layout][#ML_value] - [Getter][#value()] - [Setter][#value(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineExecutableStatisticKHR {
///     VkStructureType sType;
///     void * pNext;
///     char[VK_MAX_DESCRIPTION_SIZE] name;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
///     VkPipelineExecutableStatisticFormatKHR format;
///     VkPipelineExecutableStatisticValueKHR value;
/// } VkPipelineExecutableStatisticKHR;
/// ```
public sealed class VkPipelineExecutableStatisticKHR extends Struct {
    /// The struct layout of `VkPipelineExecutableStatisticKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.khr.union.VkPipelineExecutableStatisticValueKHR.LAYOUT.withName("value")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout ML_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout ML_value = LAYOUT.select(PathElement.groupElement("value"));

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineExecutableStatisticKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticKHR(segment); }

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableStatisticKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment name, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description, @CType("VkPipelineExecutableStatisticFormatKHR") int format, @CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment value) { return alloc(allocator).sType(sType).pNext(pNext).name(name).description(description).format(format).value(value); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineExecutableStatisticKHR copyFrom(VkPipelineExecutableStatisticKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineExecutableStatisticKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineExecutableStatisticKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineExecutableStatisticKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR sType(@CType("VkStructureType") int value) { VkPipelineExecutableStatisticKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineExecutableStatisticKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineExecutableStatisticKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_name, index), ML_name); }
    /// {@return `name`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_name(MemorySegment segment) { return VkPipelineExecutableStatisticKHR.get_name(segment, 0L); }
    /// {@return `name`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment name() { return VkPipelineExecutableStatisticKHR.get_name(this.segment()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_name(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_name, index), ML_name.byteSize()); }
    /// Sets `name` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_name(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_name(segment, 0L, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR name(@CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_name(this.segment(), value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), ML_description); }
    /// {@return `description`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment) { return VkPipelineExecutableStatisticKHR.get_description(segment, 0L); }
    /// {@return `description`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description() { return VkPipelineExecutableStatisticKHR.get_description(this.segment()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_description(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), ML_description.byteSize()); }
    /// Sets `description` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_description(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_description(segment, 0L, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR description(@CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_description(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineExecutableStatisticFormatKHR") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineExecutableStatisticFormatKHR") int get_format(MemorySegment segment) { return VkPipelineExecutableStatisticKHR.get_format(segment, 0L); }
    /// {@return `format`}
    public @CType("VkPipelineExecutableStatisticFormatKHR") int format() { return VkPipelineExecutableStatisticKHR.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkPipelineExecutableStatisticFormatKHR") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkPipelineExecutableStatisticFormatKHR") int value) { VkPipelineExecutableStatisticKHR.set_format(segment, 0L, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR format(@CType("VkPipelineExecutableStatisticFormatKHR") int value) { VkPipelineExecutableStatisticKHR.set_format(this.segment(), value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment get_value(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_value, index), ML_value); }
    /// {@return `value`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment get_value(MemorySegment segment) { return VkPipelineExecutableStatisticKHR.get_value(segment, 0L); }
    /// {@return `value`}
    public @CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment value() { return VkPipelineExecutableStatisticKHR.get_value(this.segment()); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_value(MemorySegment segment, long index, @CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_value, index), ML_value.byteSize()); }
    /// Sets `value` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_value(MemorySegment segment, @CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_value(segment, 0L, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR value(@CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_value(this.segment(), value); return this; }

    /// A buffer of [VkPipelineExecutableStatisticKHR].
    public static final class Buffer extends VkPipelineExecutableStatisticKHR {
        private final long elementCount;

        /// Creates `VkPipelineExecutableStatisticKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineExecutableStatisticKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineExecutableStatisticKHR`
        public VkPipelineExecutableStatisticKHR asSlice(long index) { return new VkPipelineExecutableStatisticKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineExecutableStatisticKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineExecutableStatisticKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineExecutableStatisticKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineExecutableStatisticKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineExecutableStatisticKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `name` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment nameAt(long index) { return VkPipelineExecutableStatisticKHR.get_name(this.segment(), index); }
        /// Sets `name` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nameAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_name(this.segment(), index, value); return this; }

        /// {@return `description` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment descriptionAt(long index) { return VkPipelineExecutableStatisticKHR.get_description(this.segment(), index); }
        /// Sets `description` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptionAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_description(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index
        public @CType("VkPipelineExecutableStatisticFormatKHR") int formatAt(long index) { return VkPipelineExecutableStatisticKHR.get_format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, @CType("VkPipelineExecutableStatisticFormatKHR") int value) { VkPipelineExecutableStatisticKHR.set_format(this.segment(), index, value); return this; }

        /// {@return `value` at the given index}
        /// @param index the index
        public @CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment valueAt(long index) { return VkPipelineExecutableStatisticKHR.get_value(this.segment(), index); }
        /// Sets `value` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer valueAt(long index, @CType("VkPipelineExecutableStatisticValueKHR") java.lang.foreign.MemorySegment value) { VkPipelineExecutableStatisticKHR.set_value(this.segment(), index, value); return this; }

    }
}
