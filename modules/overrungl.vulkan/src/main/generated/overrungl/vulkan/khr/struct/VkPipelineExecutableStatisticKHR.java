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
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineExecutableStatisticKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     char name[256];
///     char description[256];
///     (int) VkPipelineExecutableStatisticFormatKHR format;
///     (union VkPipelineExecutableStatisticValueKHR) VkPipelineExecutableStatisticValueKHR value;
/// };
/// ```
public final class VkPipelineExecutableStatisticKHR extends GroupType {
    /// The struct layout of `VkPipelineExecutableStatisticKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.khr.union.VkPipelineExecutableStatisticValueKHR.LAYOUT.withName("value")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `description` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineExecutableStatisticKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineExecutableStatisticKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutableStatisticKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableStatisticKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableStatisticKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @param description `description`
    /// @param format `format`
    /// @param value `value`
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name, MemorySegment description, int format, MemorySegment value) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name).description(description).format(format).value(value);
    }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @param description `description`
    /// @param format `format`
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name, MemorySegment description, int format) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name).description(description).format(format);
    }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @param description `description`
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name, MemorySegment description) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name).description(description);
    }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name);
    }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineExecutableStatisticKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineExecutableStatisticKHR`
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineExecutableStatisticKHR copyFrom(VkPipelineExecutableStatisticKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineExecutableStatisticKHR reinterpret(long count) { return new VkPipelineExecutableStatisticKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment name(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte name(MemorySegment segment, long index, long index0) { return (byte) VH_name.get(segment, 0L, index, index0); }
    /// {@return `name`}
    public MemorySegment name() { return name(this.segment(), 0L); }
    /// {@return `name`}
    /// @param index0 the Index 0 of the array
    public byte name(long index0) { return name(this.segment(), 0L, index0); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void name(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_name, index), LAYOUT_name.byteSize()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void name(MemorySegment segment, long index, long index0, byte value) { VH_name.set(segment, 0L, index, index0, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR name(MemorySegment value) { name(this.segment(), 0L, value); return this; }
    /// Sets `name` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR name(long index0, byte value) { name(this.segment(), 0L, index0, value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte description(MemorySegment segment, long index, long index0) { return (byte) VH_description.get(segment, 0L, index, index0); }
    /// {@return `description`}
    public MemorySegment description() { return description(this.segment(), 0L); }
    /// {@return `description`}
    /// @param index0 the Index 0 of the array
    public byte description(long index0) { return description(this.segment(), 0L, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void description(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), LAYOUT_description.byteSize()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void description(MemorySegment segment, long index, long index0, byte value) { VH_description.set(segment, 0L, index, index0, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR description(MemorySegment value) { description(this.segment(), 0L, value); return this; }
    /// Sets `description` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR description(long index0, byte value) { description(this.segment(), 0L, index0, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment value(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_value, index), LAYOUT_value); }
    /// {@return `value`}
    public MemorySegment value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_value, index), LAYOUT_value.byteSize()); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR value(MemorySegment value) { value(this.segment(), 0L, value); return this; }
    /// Accepts `value` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPipelineExecutableStatisticKHR value(Consumer<overrungl.vulkan.khr.union.VkPipelineExecutableStatisticValueKHR> func) { func.accept(overrungl.vulkan.khr.union.VkPipelineExecutableStatisticValueKHR.of(value())); return this; }

    /// Creates a slice of `VkPipelineExecutableStatisticKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineExecutableStatisticKHR`
    public VkPipelineExecutableStatisticKHR asSlice(long index) { return new VkPipelineExecutableStatisticKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineExecutableStatisticKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineExecutableStatisticKHR`
    public VkPipelineExecutableStatisticKHR asSlice(long index, long count) { return new VkPipelineExecutableStatisticKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineExecutableStatisticKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineExecutableStatisticKHR at(long index, Consumer<VkPipelineExecutableStatisticKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `name` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment nameAt(long index) { return name(this.segment(), index); }
    /// {@return `name` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte nameAt(long index, long index0) { return name(this.segment(), index, index0); }
    /// Sets `name` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR nameAt(long index, MemorySegment value) { name(this.segment(), index, value); return this; }
    /// Sets `name` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR nameAt(long index, long index0, byte value) { name(this.segment(), index, index0, value); return this; }

    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment descriptionAt(long index) { return description(this.segment(), index); }
    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte descriptionAt(long index, long index0) { return description(this.segment(), index, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR descriptionAt(long index, MemorySegment value) { description(this.segment(), index, value); return this; }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR descriptionAt(long index, long index0, byte value) { description(this.segment(), index, index0, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `value` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment valueAt(long index) { return value(this.segment(), index); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutableStatisticKHR valueAt(long index, MemorySegment value) { value(this.segment(), index, value); return this; }
    /// Accepts `value` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPipelineExecutableStatisticKHR valueAt(long index, Consumer<overrungl.vulkan.khr.union.VkPipelineExecutableStatisticValueKHR> func) { func.accept(overrungl.vulkan.khr.union.VkPipelineExecutableStatisticValueKHR.of(valueAt(index))); return this; }

}
