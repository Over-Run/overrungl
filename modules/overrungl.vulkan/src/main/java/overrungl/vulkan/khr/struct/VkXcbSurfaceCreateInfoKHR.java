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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### connection
/// [VarHandle][#VH_connection] - [Getter][#connection()] - [Setter][#connection(java.lang.foreign.MemorySegment)]
/// ### window
/// [VarHandle][#VH_window] - [Getter][#window()] - [Setter][#window(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkXcbSurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkXcbSurfaceCreateFlagsKHR flags;
///     xcb_connection_t * connection;
///     xcb_window_t window;
/// } VkXcbSurfaceCreateInfoKHR;
/// ```
public sealed class VkXcbSurfaceCreateInfoKHR extends Struct {
    /// The struct layout of `VkXcbSurfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("connection"),
        ValueLayout.JAVA_INT.withName("window")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `connection` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_connection = LAYOUT.arrayElementVarHandle(PathElement.groupElement("connection"));
    /// The [VarHandle] of `window` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_window = LAYOUT.arrayElementVarHandle(PathElement.groupElement("window"));

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkXcbSurfaceCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkXcbSurfaceCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkXcbSurfaceCreateInfoKHR(segment); }

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkXcbSurfaceCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkXcbSurfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkXcbSurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkXcbSurfaceCreateInfoKHR`
    public static VkXcbSurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkXcbSurfaceCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkXcbSurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkXcbSurfaceCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkXcbSurfaceCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkXcbSurfaceCreateInfoKHR`
    public static VkXcbSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkXcbSurfaceCreateFlagsKHR") int flags, @CType("xcb_connection_t *") java.lang.foreign.MemorySegment connection, @CType("xcb_window_t") int window) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).connection(connection).window(window); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR copyFrom(VkXcbSurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkXcbSurfaceCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkXcbSurfaceCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkXcbSurfaceCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR sType(@CType("VkStructureType") int value) { VkXcbSurfaceCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkXcbSurfaceCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkXcbSurfaceCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkXcbSurfaceCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkXcbSurfaceCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkXcbSurfaceCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkXcbSurfaceCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkXcbSurfaceCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkXcbSurfaceCreateFlagsKHR") int flags() { return VkXcbSurfaceCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkXcbSurfaceCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkXcbSurfaceCreateFlagsKHR") int value) { VkXcbSurfaceCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR flags(@CType("VkXcbSurfaceCreateFlagsKHR") int value) { VkXcbSurfaceCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `connection` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("xcb_connection_t *") java.lang.foreign.MemorySegment get_connection(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_connection.get(segment, 0L, index); }
    /// {@return `connection`}
    /// @param segment the segment of the struct
    public static @CType("xcb_connection_t *") java.lang.foreign.MemorySegment get_connection(MemorySegment segment) { return VkXcbSurfaceCreateInfoKHR.get_connection(segment, 0L); }
    /// {@return `connection`}
    public @CType("xcb_connection_t *") java.lang.foreign.MemorySegment connection() { return VkXcbSurfaceCreateInfoKHR.get_connection(this.segment()); }
    /// Sets `connection` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_connection(MemorySegment segment, long index, @CType("xcb_connection_t *") java.lang.foreign.MemorySegment value) { VH_connection.set(segment, 0L, index, value); }
    /// Sets `connection` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_connection(MemorySegment segment, @CType("xcb_connection_t *") java.lang.foreign.MemorySegment value) { VkXcbSurfaceCreateInfoKHR.set_connection(segment, 0L, value); }
    /// Sets `connection` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR connection(@CType("xcb_connection_t *") java.lang.foreign.MemorySegment value) { VkXcbSurfaceCreateInfoKHR.set_connection(this.segment(), value); return this; }

    /// {@return `window` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("xcb_window_t") int get_window(MemorySegment segment, long index) { return (int) VH_window.get(segment, 0L, index); }
    /// {@return `window`}
    /// @param segment the segment of the struct
    public static @CType("xcb_window_t") int get_window(MemorySegment segment) { return VkXcbSurfaceCreateInfoKHR.get_window(segment, 0L); }
    /// {@return `window`}
    public @CType("xcb_window_t") int window() { return VkXcbSurfaceCreateInfoKHR.get_window(this.segment()); }
    /// Sets `window` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_window(MemorySegment segment, long index, @CType("xcb_window_t") int value) { VH_window.set(segment, 0L, index, value); }
    /// Sets `window` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_window(MemorySegment segment, @CType("xcb_window_t") int value) { VkXcbSurfaceCreateInfoKHR.set_window(segment, 0L, value); }
    /// Sets `window` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR window(@CType("xcb_window_t") int value) { VkXcbSurfaceCreateInfoKHR.set_window(this.segment(), value); return this; }

    /// A buffer of [VkXcbSurfaceCreateInfoKHR].
    public static final class Buffer extends VkXcbSurfaceCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkXcbSurfaceCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkXcbSurfaceCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkXcbSurfaceCreateInfoKHR`
        public VkXcbSurfaceCreateInfoKHR asSlice(long index) { return new VkXcbSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkXcbSurfaceCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkXcbSurfaceCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkXcbSurfaceCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkXcbSurfaceCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkXcbSurfaceCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkXcbSurfaceCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkXcbSurfaceCreateFlagsKHR") int flagsAt(long index) { return VkXcbSurfaceCreateInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkXcbSurfaceCreateFlagsKHR") int value) { VkXcbSurfaceCreateInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `connection` at the given index}
        /// @param index the index
        public @CType("xcb_connection_t *") java.lang.foreign.MemorySegment connectionAt(long index) { return VkXcbSurfaceCreateInfoKHR.get_connection(this.segment(), index); }
        /// Sets `connection` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer connectionAt(long index, @CType("xcb_connection_t *") java.lang.foreign.MemorySegment value) { VkXcbSurfaceCreateInfoKHR.set_connection(this.segment(), index, value); return this; }

        /// {@return `window` at the given index}
        /// @param index the index
        public @CType("xcb_window_t") int windowAt(long index) { return VkXcbSurfaceCreateInfoKHR.get_window(this.segment(), index); }
        /// Sets `window` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer windowAt(long index, @CType("xcb_window_t") int value) { VkXcbSurfaceCreateInfoKHR.set_window(this.segment(), index, value); return this; }

    }
}
