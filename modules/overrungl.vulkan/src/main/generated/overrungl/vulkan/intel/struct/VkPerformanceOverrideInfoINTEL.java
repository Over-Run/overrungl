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
package overrungl.vulkan.intel.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPerformanceOverrideInfoINTEL {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkPerformanceOverrideTypeINTEL type;
///     (uint32_t) VkBool32 enable;
///     uint64_t parameter;
/// };
/// ```
public final class VkPerformanceOverrideInfoINTEL extends GroupType {
    /// The struct layout of `VkPerformanceOverrideInfoINTEL`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("enable"),
        ValueLayout.JAVA_LONG.withName("parameter")
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
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `enable`.
    public static final long OFFSET_enable = LAYOUT.byteOffset(PathElement.groupElement("enable"));
    /// The memory layout of `enable`.
    public static final MemoryLayout LAYOUT_enable = LAYOUT.select(PathElement.groupElement("enable"));
    /// The [VarHandle] of `enable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable"));
    /// The byte offset of `parameter`.
    public static final long OFFSET_parameter = LAYOUT.byteOffset(PathElement.groupElement("parameter"));
    /// The memory layout of `parameter`.
    public static final MemoryLayout LAYOUT_parameter = LAYOUT.select(PathElement.groupElement("parameter"));
    /// The [VarHandle] of `parameter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_parameter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameter"));

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPerformanceOverrideInfoINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceOverrideInfoINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceOverrideInfoINTEL(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceOverrideInfoINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceOverrideInfoINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceOverrideInfoINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceOverrideInfoINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceOverrideInfoINTEL(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL alloc(SegmentAllocator allocator, long count) { return new VkPerformanceOverrideInfoINTEL(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param enable `enable`
    /// @param parameter `parameter`
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int enable, long parameter) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).enable(enable).parameter(parameter);
    }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param enable `enable`
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int enable) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).enable(enable);
    }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type);
    }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL copyFrom(VkPerformanceOverrideInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPerformanceOverrideInfoINTEL reinterpret(long count) { return new VkPerformanceOverrideInfoINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPerformanceOverrideInfoINTEL sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPerformanceOverrideInfoINTEL pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `enable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enable(MemorySegment segment, long index) { return (int) VH_enable.get(segment, 0L, index); }
    /// {@return `enable`}
    public int enable() { return enable(this.segment(), 0L); }
    /// Sets `enable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enable(MemorySegment segment, long index, int value) { VH_enable.set(segment, 0L, index, value); }
    /// Sets `enable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL enable(int value) { enable(this.segment(), 0L, value); return this; }

    /// {@return `parameter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long parameter(MemorySegment segment, long index) { return (long) VH_parameter.get(segment, 0L, index); }
    /// {@return `parameter`}
    public long parameter() { return parameter(this.segment(), 0L); }
    /// Sets `parameter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void parameter(MemorySegment segment, long index, long value) { VH_parameter.set(segment, 0L, index, value); }
    /// Sets `parameter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL parameter(long value) { parameter(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPerformanceOverrideInfoINTEL`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPerformanceOverrideInfoINTEL`
    public VkPerformanceOverrideInfoINTEL asSlice(long index) { return new VkPerformanceOverrideInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPerformanceOverrideInfoINTEL`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPerformanceOverrideInfoINTEL`
    public VkPerformanceOverrideInfoINTEL asSlice(long index, long count) { return new VkPerformanceOverrideInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPerformanceOverrideInfoINTEL` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL at(long index, Consumer<VkPerformanceOverrideInfoINTEL> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `enable` at the given index}
    /// @param index the index of the struct buffer
    public int enableAt(long index) { return enable(this.segment(), index); }
    /// Sets `enable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL enableAt(long index, int value) { enable(this.segment(), index, value); return this; }

    /// {@return `parameter` at the given index}
    /// @param index the index of the struct buffer
    public long parameterAt(long index) { return parameter(this.segment(), index); }
    /// Sets `parameter` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL parameterAt(long index, long value) { parameter(this.segment(), index, value); return this; }

}
