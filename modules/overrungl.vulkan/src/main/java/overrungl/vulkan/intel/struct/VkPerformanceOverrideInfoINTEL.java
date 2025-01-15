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
package overrungl.vulkan.intel.struct;

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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### enable
/// [VarHandle][#VH_enable] - [Getter][#enable()] - [Setter][#enable(int)]
/// ### parameter
/// [VarHandle][#VH_parameter] - [Getter][#parameter()] - [Setter][#parameter(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPerformanceOverrideInfoINTEL {
///     VkStructureType sType;
///     const void * pNext;
///     VkPerformanceOverrideTypeINTEL type;
///     VkBool32 enable;
///     uint64_t parameter;
/// } VkPerformanceOverrideInfoINTEL;
/// ```
public sealed class VkPerformanceOverrideInfoINTEL extends Struct {
    /// The struct layout of `VkPerformanceOverrideInfoINTEL`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("enable"),
        ValueLayout.JAVA_LONG.withName("parameter")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `enable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enable"));
    /// The [VarHandle] of `parameter` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_parameter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("parameter"));

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceOverrideInfoINTEL(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceOverrideInfoINTEL of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceOverrideInfoINTEL(segment); }

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceOverrideInfoINTEL ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceOverrideInfoINTEL(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceOverrideInfoINTEL` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL alloc(SegmentAllocator allocator) { return new VkPerformanceOverrideInfoINTEL(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPerformanceOverrideInfoINTEL` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceOverrideInfoINTEL`
    public static VkPerformanceOverrideInfoINTEL allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkPerformanceOverrideTypeINTEL") int type, @CType("VkBool32") int enable, @CType("uint64_t") long parameter) { return alloc(allocator).sType(sType).pNext(pNext).type(type).enable(enable).parameter(parameter); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL copyFrom(VkPerformanceOverrideInfoINTEL src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceOverrideInfoINTEL.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPerformanceOverrideInfoINTEL.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPerformanceOverrideInfoINTEL.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL sType(@CType("VkStructureType") int value) { VkPerformanceOverrideInfoINTEL.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceOverrideInfoINTEL.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPerformanceOverrideInfoINTEL.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceOverrideInfoINTEL.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceOverrideInfoINTEL.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceOverrideTypeINTEL") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceOverrideTypeINTEL") int get_type(MemorySegment segment) { return VkPerformanceOverrideInfoINTEL.get_type(segment, 0L); }
    /// {@return `type`}
    public @CType("VkPerformanceOverrideTypeINTEL") int type() { return VkPerformanceOverrideInfoINTEL.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkPerformanceOverrideTypeINTEL") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkPerformanceOverrideTypeINTEL") int value) { VkPerformanceOverrideInfoINTEL.set_type(segment, 0L, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL type(@CType("VkPerformanceOverrideTypeINTEL") int value) { VkPerformanceOverrideInfoINTEL.set_type(this.segment(), value); return this; }

    /// {@return `enable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_enable(MemorySegment segment, long index) { return (int) VH_enable.get(segment, 0L, index); }
    /// {@return `enable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_enable(MemorySegment segment) { return VkPerformanceOverrideInfoINTEL.get_enable(segment, 0L); }
    /// {@return `enable`}
    public @CType("VkBool32") int enable() { return VkPerformanceOverrideInfoINTEL.get_enable(this.segment()); }
    /// Sets `enable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_enable.set(segment, 0L, index, value); }
    /// Sets `enable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enable(MemorySegment segment, @CType("VkBool32") int value) { VkPerformanceOverrideInfoINTEL.set_enable(segment, 0L, value); }
    /// Sets `enable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL enable(@CType("VkBool32") int value) { VkPerformanceOverrideInfoINTEL.set_enable(this.segment(), value); return this; }

    /// {@return `parameter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_parameter(MemorySegment segment, long index) { return (long) VH_parameter.get(segment, 0L, index); }
    /// {@return `parameter`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_parameter(MemorySegment segment) { return VkPerformanceOverrideInfoINTEL.get_parameter(segment, 0L); }
    /// {@return `parameter`}
    public @CType("uint64_t") long parameter() { return VkPerformanceOverrideInfoINTEL.get_parameter(this.segment()); }
    /// Sets `parameter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_parameter(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_parameter.set(segment, 0L, index, value); }
    /// Sets `parameter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_parameter(MemorySegment segment, @CType("uint64_t") long value) { VkPerformanceOverrideInfoINTEL.set_parameter(segment, 0L, value); }
    /// Sets `parameter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceOverrideInfoINTEL parameter(@CType("uint64_t") long value) { VkPerformanceOverrideInfoINTEL.set_parameter(this.segment(), value); return this; }

    /// A buffer of [VkPerformanceOverrideInfoINTEL].
    public static final class Buffer extends VkPerformanceOverrideInfoINTEL {
        private final long elementCount;

        /// Creates `VkPerformanceOverrideInfoINTEL.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceOverrideInfoINTEL`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPerformanceOverrideInfoINTEL`
        public VkPerformanceOverrideInfoINTEL asSlice(long index) { return new VkPerformanceOverrideInfoINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceOverrideInfoINTEL`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceOverrideInfoINTEL`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceOverrideInfoINTEL.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceOverrideInfoINTEL.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPerformanceOverrideInfoINTEL.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPerformanceOverrideInfoINTEL.set_pNext(this.segment(), index, value); return this; }

        /// {@return `type` at the given index}
        /// @param index the index
        public @CType("VkPerformanceOverrideTypeINTEL") int typeAt(long index) { return VkPerformanceOverrideInfoINTEL.get_type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, @CType("VkPerformanceOverrideTypeINTEL") int value) { VkPerformanceOverrideInfoINTEL.set_type(this.segment(), index, value); return this; }

        /// {@return `enable` at the given index}
        /// @param index the index
        public @CType("VkBool32") int enableAt(long index) { return VkPerformanceOverrideInfoINTEL.get_enable(this.segment(), index); }
        /// Sets `enable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer enableAt(long index, @CType("VkBool32") int value) { VkPerformanceOverrideInfoINTEL.set_enable(this.segment(), index, value); return this; }

        /// {@return `parameter` at the given index}
        /// @param index the index
        public @CType("uint64_t") long parameterAt(long index) { return VkPerformanceOverrideInfoINTEL.get_parameter(this.segment(), index); }
        /// Sets `parameter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer parameterAt(long index, @CType("uint64_t") long value) { VkPerformanceOverrideInfoINTEL.set_parameter(this.segment(), index, value); return this; }

    }
}
