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

/// ## Members
/// ### qpI
/// [VarHandle][#VH_qpI] - [Getter][#qpI()] - [Setter][#qpI(int)]
/// ### qpP
/// [VarHandle][#VH_qpP] - [Getter][#qpP()] - [Setter][#qpP(int)]
/// ### qpB
/// [VarHandle][#VH_qpB] - [Getter][#qpB()] - [Setter][#qpB(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265QpKHR {
///     int32_t qpI;
///     int32_t qpP;
///     int32_t qpB;
/// } VkVideoEncodeH265QpKHR;
/// ```
public final class VkVideoEncodeH265QpKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265QpKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("qpI"),
        ValueLayout.JAVA_INT.withName("qpP"),
        ValueLayout.JAVA_INT.withName("qpB")
    );
    /// The [VarHandle] of `qpI` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_qpI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpI"));
    /// The [VarHandle] of `qpP` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_qpP = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpP"));
    /// The [VarHandle] of `qpB` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_qpB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qpB"));

    /// Creates `VkVideoEncodeH265QpKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265QpKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265QpKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QpKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QpKHR(segment); }

    /// Creates `VkVideoEncodeH265QpKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QpKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QpKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265QpKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QpKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QpKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH265QpKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265QpKHR`
    public static VkVideoEncodeH265QpKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265QpKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265QpKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265QpKHR`
    public static VkVideoEncodeH265QpKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265QpKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `qpI` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_qpI(MemorySegment segment, long index) { return (int) VH_qpI.get(segment, 0L, index); }
    /// {@return `qpI`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_qpI(MemorySegment segment) { return VkVideoEncodeH265QpKHR.get_qpI(segment, 0L); }
    /// {@return `qpI` at the given index}
    /// @param index the index
    public @CType("int32_t") int qpIAt(long index) { return VkVideoEncodeH265QpKHR.get_qpI(this.segment(), index); }
    /// {@return `qpI`}
    public @CType("int32_t") int qpI() { return VkVideoEncodeH265QpKHR.get_qpI(this.segment()); }
    /// Sets `qpI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qpI(MemorySegment segment, long index, @CType("int32_t") int value) { VH_qpI.set(segment, 0L, index, value); }
    /// Sets `qpI` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qpI(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpI(segment, 0L, value); }
    /// Sets `qpI` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpIAt(long index, @CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpI(this.segment(), index, value); return this; }
    /// Sets `qpI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpI(@CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpI(this.segment(), value); return this; }

    /// {@return `qpP` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_qpP(MemorySegment segment, long index) { return (int) VH_qpP.get(segment, 0L, index); }
    /// {@return `qpP`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_qpP(MemorySegment segment) { return VkVideoEncodeH265QpKHR.get_qpP(segment, 0L); }
    /// {@return `qpP` at the given index}
    /// @param index the index
    public @CType("int32_t") int qpPAt(long index) { return VkVideoEncodeH265QpKHR.get_qpP(this.segment(), index); }
    /// {@return `qpP`}
    public @CType("int32_t") int qpP() { return VkVideoEncodeH265QpKHR.get_qpP(this.segment()); }
    /// Sets `qpP` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qpP(MemorySegment segment, long index, @CType("int32_t") int value) { VH_qpP.set(segment, 0L, index, value); }
    /// Sets `qpP` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qpP(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpP(segment, 0L, value); }
    /// Sets `qpP` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpPAt(long index, @CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpP(this.segment(), index, value); return this; }
    /// Sets `qpP` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpP(@CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpP(this.segment(), value); return this; }

    /// {@return `qpB` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_qpB(MemorySegment segment, long index) { return (int) VH_qpB.get(segment, 0L, index); }
    /// {@return `qpB`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_qpB(MemorySegment segment) { return VkVideoEncodeH265QpKHR.get_qpB(segment, 0L); }
    /// {@return `qpB` at the given index}
    /// @param index the index
    public @CType("int32_t") int qpBAt(long index) { return VkVideoEncodeH265QpKHR.get_qpB(this.segment(), index); }
    /// {@return `qpB`}
    public @CType("int32_t") int qpB() { return VkVideoEncodeH265QpKHR.get_qpB(this.segment()); }
    /// Sets `qpB` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qpB(MemorySegment segment, long index, @CType("int32_t") int value) { VH_qpB.set(segment, 0L, index, value); }
    /// Sets `qpB` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qpB(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpB(segment, 0L, value); }
    /// Sets `qpB` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpBAt(long index, @CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpB(this.segment(), index, value); return this; }
    /// Sets `qpB` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QpKHR qpB(@CType("int32_t") int value) { VkVideoEncodeH265QpKHR.set_qpB(this.segment(), value); return this; }

}
