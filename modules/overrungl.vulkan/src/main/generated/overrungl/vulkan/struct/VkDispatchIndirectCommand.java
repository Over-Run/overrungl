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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDispatchIndirectCommand {
///     uint32_t x;
///     uint32_t y;
///     uint32_t z;
/// };
/// ```
public final class VkDispatchIndirectCommand extends GroupType {
    /// The struct layout of `VkDispatchIndirectCommand`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z")
    );
    /// The byte offset of `x`.
    public static final long OFFSET_x = LAYOUT.byteOffset(PathElement.groupElement("x"));
    /// The memory layout of `x`.
    public static final MemoryLayout LAYOUT_x = LAYOUT.select(PathElement.groupElement("x"));
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The byte offset of `y`.
    public static final long OFFSET_y = LAYOUT.byteOffset(PathElement.groupElement("y"));
    /// The memory layout of `y`.
    public static final MemoryLayout LAYOUT_y = LAYOUT.select(PathElement.groupElement("y"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The byte offset of `z`.
    public static final long OFFSET_z = LAYOUT.byteOffset(PathElement.groupElement("z"));
    /// The memory layout of `z`.
    public static final MemoryLayout LAYOUT_z = LAYOUT.select(PathElement.groupElement("z"));
    /// The [VarHandle] of `z` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("z"));

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDispatchIndirectCommand(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchIndirectCommand of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchIndirectCommand(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchIndirectCommand ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchIndirectCommand(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchIndirectCommand ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchIndirectCommand(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDispatchIndirectCommand` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchIndirectCommand`
    public static VkDispatchIndirectCommand alloc(SegmentAllocator allocator) { return new VkDispatchIndirectCommand(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDispatchIndirectCommand` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDispatchIndirectCommand`
    public static VkDispatchIndirectCommand alloc(SegmentAllocator allocator, long count) { return new VkDispatchIndirectCommand(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDispatchIndirectCommand` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param x `x`
    /// @param y `y`
    /// @param z `z`
    /// @return the allocated `VkDispatchIndirectCommand`
    public static VkDispatchIndirectCommand allocInit(SegmentAllocator allocator, int x, int y, int z) {
        return alloc(allocator).x(x).y(y).z(z);
    }

    /// Allocates a `VkDispatchIndirectCommand` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param x `x`
    /// @param y `y`
    /// @return the allocated `VkDispatchIndirectCommand`
    public static VkDispatchIndirectCommand allocInit(SegmentAllocator allocator, int x, int y) {
        return alloc(allocator).x(x).y(y);
    }

    /// Allocates a `VkDispatchIndirectCommand` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param x `x`
    /// @return the allocated `VkDispatchIndirectCommand`
    public static VkDispatchIndirectCommand allocInit(SegmentAllocator allocator, int x) {
        return alloc(allocator).x(x);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDispatchIndirectCommand copyFrom(VkDispatchIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDispatchIndirectCommand reinterpret(long count) { return new VkDispatchIndirectCommand(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    public int x() { return x(this.segment(), 0L); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void x(MemorySegment segment, long index, int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand x(int value) { x(this.segment(), 0L, value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    public int y() { return y(this.segment(), 0L); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void y(MemorySegment segment, long index, int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand y(int value) { y(this.segment(), 0L, value); return this; }

    /// {@return `z` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int z(MemorySegment segment, long index) { return (int) VH_z.get(segment, 0L, index); }
    /// {@return `z`}
    public int z() { return z(this.segment(), 0L); }
    /// Sets `z` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void z(MemorySegment segment, long index, int value) { VH_z.set(segment, 0L, index, value); }
    /// Sets `z` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand z(int value) { z(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDispatchIndirectCommand`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDispatchIndirectCommand`
    public VkDispatchIndirectCommand asSlice(long index) { return new VkDispatchIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDispatchIndirectCommand`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDispatchIndirectCommand`
    public VkDispatchIndirectCommand asSlice(long index, long count) { return new VkDispatchIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDispatchIndirectCommand` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDispatchIndirectCommand at(long index, Consumer<VkDispatchIndirectCommand> func) { func.accept(asSlice(index)); return this; }

    /// {@return `x` at the given index}
    /// @param index the index of the struct buffer
    public int xAt(long index) { return x(this.segment(), index); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand xAt(long index, int value) { x(this.segment(), index, value); return this; }

    /// {@return `y` at the given index}
    /// @param index the index of the struct buffer
    public int yAt(long index) { return y(this.segment(), index); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand yAt(long index, int value) { y(this.segment(), index, value); return this; }

    /// {@return `z` at the given index}
    /// @param index the index of the struct buffer
    public int zAt(long index) { return z(this.segment(), index); }
    /// Sets `z` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand zAt(long index, int value) { z(this.segment(), index, value); return this; }

}
