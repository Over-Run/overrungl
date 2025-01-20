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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### window
/// [VarHandle][#VH_window] - [Getter][#window()] - [Setter][#window(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAndroidSurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkAndroidSurfaceCreateFlagsKHR flags;
///     struct ANativeWindow * window;
/// } VkAndroidSurfaceCreateInfoKHR;
/// ```
public sealed class VkAndroidSurfaceCreateInfoKHR extends Struct {
    /// The struct layout of `VkAndroidSurfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("window")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `window` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_window = LAYOUT.arrayElementVarHandle(PathElement.groupElement("window"));

    /// Creates `VkAndroidSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAndroidSurfaceCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAndroidSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidSurfaceCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidSurfaceCreateInfoKHR(segment); }

    /// Creates `VkAndroidSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAndroidSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidSurfaceCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidSurfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAndroidSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAndroidSurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidSurfaceCreateInfoKHR`
    public static VkAndroidSurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkAndroidSurfaceCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAndroidSurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidSurfaceCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAndroidSurfaceCreateInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidSurfaceCreateInfoKHR`
    public static VkAndroidSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkAndroidSurfaceCreateFlagsKHR") int flags, @CType("struct ANativeWindow *") MemorySegment window) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).window(window); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAndroidSurfaceCreateInfoKHR copyFrom(VkAndroidSurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAndroidSurfaceCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAndroidSurfaceCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAndroidSurfaceCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidSurfaceCreateInfoKHR sType(@CType("VkStructureType") int value) { VkAndroidSurfaceCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkAndroidSurfaceCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkAndroidSurfaceCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkAndroidSurfaceCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidSurfaceCreateInfoKHR pNext(@CType("const void *") MemorySegment value) { VkAndroidSurfaceCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAndroidSurfaceCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkAndroidSurfaceCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkAndroidSurfaceCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkAndroidSurfaceCreateFlagsKHR") int flags() { return VkAndroidSurfaceCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkAndroidSurfaceCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkAndroidSurfaceCreateFlagsKHR") int value) { VkAndroidSurfaceCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidSurfaceCreateInfoKHR flags(@CType("VkAndroidSurfaceCreateFlagsKHR") int value) { VkAndroidSurfaceCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `window` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("struct ANativeWindow *") MemorySegment get_window(MemorySegment segment, long index) { return (MemorySegment) VH_window.get(segment, 0L, index); }
    /// {@return `window`}
    /// @param segment the segment of the struct
    public static @CType("struct ANativeWindow *") MemorySegment get_window(MemorySegment segment) { return VkAndroidSurfaceCreateInfoKHR.get_window(segment, 0L); }
    /// {@return `window`}
    public @CType("struct ANativeWindow *") MemorySegment window() { return VkAndroidSurfaceCreateInfoKHR.get_window(this.segment()); }
    /// Sets `window` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_window(MemorySegment segment, long index, @CType("struct ANativeWindow *") MemorySegment value) { VH_window.set(segment, 0L, index, value); }
    /// Sets `window` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_window(MemorySegment segment, @CType("struct ANativeWindow *") MemorySegment value) { VkAndroidSurfaceCreateInfoKHR.set_window(segment, 0L, value); }
    /// Sets `window` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidSurfaceCreateInfoKHR window(@CType("struct ANativeWindow *") MemorySegment value) { VkAndroidSurfaceCreateInfoKHR.set_window(this.segment(), value); return this; }

    /// A buffer of [VkAndroidSurfaceCreateInfoKHR].
    public static final class Buffer extends VkAndroidSurfaceCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkAndroidSurfaceCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAndroidSurfaceCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAndroidSurfaceCreateInfoKHR`
        public VkAndroidSurfaceCreateInfoKHR asSlice(long index) { return new VkAndroidSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAndroidSurfaceCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAndroidSurfaceCreateInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAndroidSurfaceCreateInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAndroidSurfaceCreateInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkAndroidSurfaceCreateInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkAndroidSurfaceCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkAndroidSurfaceCreateFlagsKHR") int flagsAt(long index) { return VkAndroidSurfaceCreateInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkAndroidSurfaceCreateFlagsKHR") int value) { VkAndroidSurfaceCreateInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `window` at the given index}
        /// @param index the index
        public @CType("struct ANativeWindow *") MemorySegment windowAt(long index) { return VkAndroidSurfaceCreateInfoKHR.get_window(this.segment(), index); }
        /// Sets `window` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer windowAt(long index, @CType("struct ANativeWindow *") MemorySegment value) { VkAndroidSurfaceCreateInfoKHR.set_window(this.segment(), index, value); return this; }

    }
}
