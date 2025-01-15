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
/// ### x
/// [VarHandle][#VH_x] - [Getter][#x()] - [Setter][#x(int)]
/// ### y
/// [VarHandle][#VH_y] - [Getter][#y()] - [Setter][#y(int)]
/// ### z
/// [VarHandle][#VH_z] - [Getter][#z()] - [Setter][#z(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDispatchIndirectCommand {
///     uint32_t x;
///     uint32_t y;
///     uint32_t z;
/// } VkDispatchIndirectCommand;
/// ```
public sealed class VkDispatchIndirectCommand extends Struct {
    /// The struct layout of `VkDispatchIndirectCommand`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z")
    );
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The [VarHandle] of `z` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_z = LAYOUT.arrayElementVarHandle(PathElement.groupElement("z"));

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    /// @param segment the memory segment
    public VkDispatchIndirectCommand(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchIndirectCommand of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDispatchIndirectCommand(segment); }

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchIndirectCommand ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDispatchIndirectCommand(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDispatchIndirectCommand` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDispatchIndirectCommand` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchIndirectCommand`
    public static VkDispatchIndirectCommand alloc(SegmentAllocator allocator) { return new VkDispatchIndirectCommand(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDispatchIndirectCommand` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDispatchIndirectCommand`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDispatchIndirectCommand` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchIndirectCommand`
    public static VkDispatchIndirectCommand allocInit(SegmentAllocator allocator, @CType("uint32_t") int x, @CType("uint32_t") int y, @CType("uint32_t") int z) { return alloc(allocator).x(x).y(y).z(z); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDispatchIndirectCommand copyFrom(VkDispatchIndirectCommand src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_x(MemorySegment segment, long index) { return (int) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_x(MemorySegment segment) { return VkDispatchIndirectCommand.get_x(segment, 0L); }
    /// {@return `x`}
    public @CType("uint32_t") int x() { return VkDispatchIndirectCommand.get_x(this.segment()); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x(MemorySegment segment, @CType("uint32_t") int value) { VkDispatchIndirectCommand.set_x(segment, 0L, value); }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand x(@CType("uint32_t") int value) { VkDispatchIndirectCommand.set_x(this.segment(), value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_y(MemorySegment segment, long index) { return (int) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_y(MemorySegment segment) { return VkDispatchIndirectCommand.get_y(segment, 0L); }
    /// {@return `y`}
    public @CType("uint32_t") int y() { return VkDispatchIndirectCommand.get_y(this.segment()); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y(MemorySegment segment, @CType("uint32_t") int value) { VkDispatchIndirectCommand.set_y(segment, 0L, value); }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand y(@CType("uint32_t") int value) { VkDispatchIndirectCommand.set_y(this.segment(), value); return this; }

    /// {@return `z` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_z(MemorySegment segment, long index) { return (int) VH_z.get(segment, 0L, index); }
    /// {@return `z`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_z(MemorySegment segment) { return VkDispatchIndirectCommand.get_z(segment, 0L); }
    /// {@return `z`}
    public @CType("uint32_t") int z() { return VkDispatchIndirectCommand.get_z(this.segment()); }
    /// Sets `z` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_z(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_z.set(segment, 0L, index, value); }
    /// Sets `z` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_z(MemorySegment segment, @CType("uint32_t") int value) { VkDispatchIndirectCommand.set_z(segment, 0L, value); }
    /// Sets `z` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchIndirectCommand z(@CType("uint32_t") int value) { VkDispatchIndirectCommand.set_z(this.segment(), value); return this; }

    /// A buffer of [VkDispatchIndirectCommand].
    public static final class Buffer extends VkDispatchIndirectCommand {
        private final long elementCount;

        /// Creates `VkDispatchIndirectCommand.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDispatchIndirectCommand`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDispatchIndirectCommand`
        public VkDispatchIndirectCommand asSlice(long index) { return new VkDispatchIndirectCommand(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDispatchIndirectCommand`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDispatchIndirectCommand`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `x` at the given index}
        /// @param index the index
        public @CType("uint32_t") int xAt(long index) { return VkDispatchIndirectCommand.get_x(this.segment(), index); }
        /// Sets `x` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer xAt(long index, @CType("uint32_t") int value) { VkDispatchIndirectCommand.set_x(this.segment(), index, value); return this; }

        /// {@return `y` at the given index}
        /// @param index the index
        public @CType("uint32_t") int yAt(long index) { return VkDispatchIndirectCommand.get_y(this.segment(), index); }
        /// Sets `y` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer yAt(long index, @CType("uint32_t") int value) { VkDispatchIndirectCommand.set_y(this.segment(), index, value); return this; }

        /// {@return `z` at the given index}
        /// @param index the index
        public @CType("uint32_t") int zAt(long index) { return VkDispatchIndirectCommand.get_z(this.segment(), index); }
        /// Sets `z` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer zAt(long index, @CType("uint32_t") int value) { VkDispatchIndirectCommand.set_z(this.segment(), index, value); return this; }

    }
}
