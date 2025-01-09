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
package overrungl.vulkan.qnx.struct;

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
/// ### context
/// [VarHandle][#VH_context] - [Getter][#context()] - [Setter][#context(java.lang.foreign.MemorySegment)]
/// ### window
/// [VarHandle][#VH_window] - [Getter][#window()] - [Setter][#window(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkScreenSurfaceCreateInfoQNX {
///     VkStructureType sType;
///     const void * pNext;
///     VkScreenSurfaceCreateFlagsQNX flags;
///     struct _screen_context * context;
///     struct _screen_window * window;
/// } VkScreenSurfaceCreateInfoQNX;
/// ```
public final class VkScreenSurfaceCreateInfoQNX extends Struct {
    /// The struct layout of `VkScreenSurfaceCreateInfoQNX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("context"),
        ValueLayout.ADDRESS.withName("window")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `context` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_context = LAYOUT.arrayElementVarHandle(PathElement.groupElement("context"));
    /// The [VarHandle] of `window` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_window = LAYOUT.arrayElementVarHandle(PathElement.groupElement("window"));

    /// Creates `VkScreenSurfaceCreateInfoQNX` with the given segment.
    /// @param segment the memory segment
    public VkScreenSurfaceCreateInfoQNX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkScreenSurfaceCreateInfoQNX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkScreenSurfaceCreateInfoQNX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment); }

    /// Creates `VkScreenSurfaceCreateInfoQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkScreenSurfaceCreateInfoQNX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkScreenSurfaceCreateInfoQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkScreenSurfaceCreateInfoQNX ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkScreenSurfaceCreateInfoQNX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkScreenSurfaceCreateInfoQNX`
    public static VkScreenSurfaceCreateInfoQNX alloc(SegmentAllocator allocator) { return new VkScreenSurfaceCreateInfoQNX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkScreenSurfaceCreateInfoQNX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkScreenSurfaceCreateInfoQNX`
    public static VkScreenSurfaceCreateInfoQNX alloc(SegmentAllocator allocator, long count) { return new VkScreenSurfaceCreateInfoQNX(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkScreenSurfaceCreateInfoQNX.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkScreenSurfaceCreateInfoQNX.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkScreenSurfaceCreateInfoQNX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkScreenSurfaceCreateInfoQNX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX sTypeAt(long index, @CType("VkStructureType") int value) { VkScreenSurfaceCreateInfoQNX.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX sType(@CType("VkStructureType") int value) { VkScreenSurfaceCreateInfoQNX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkScreenSurfaceCreateInfoQNX.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkScreenSurfaceCreateInfoQNX.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkScreenSurfaceCreateInfoQNX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkScreenSurfaceCreateFlagsQNX") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkScreenSurfaceCreateFlagsQNX") int get_flags(MemorySegment segment) { return VkScreenSurfaceCreateInfoQNX.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkScreenSurfaceCreateFlagsQNX") int flagsAt(long index) { return VkScreenSurfaceCreateInfoQNX.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkScreenSurfaceCreateFlagsQNX") int flags() { return VkScreenSurfaceCreateInfoQNX.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkScreenSurfaceCreateFlagsQNX") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkScreenSurfaceCreateFlagsQNX") int value) { VkScreenSurfaceCreateInfoQNX.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX flagsAt(long index, @CType("VkScreenSurfaceCreateFlagsQNX") int value) { VkScreenSurfaceCreateInfoQNX.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX flags(@CType("VkScreenSurfaceCreateFlagsQNX") int value) { VkScreenSurfaceCreateInfoQNX.set_flags(this.segment(), value); return this; }

    /// {@return `context` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("struct _screen_context *") java.lang.foreign.MemorySegment get_context(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_context.get(segment, 0L, index); }
    /// {@return `context`}
    /// @param segment the segment of the struct
    public static @CType("struct _screen_context *") java.lang.foreign.MemorySegment get_context(MemorySegment segment) { return VkScreenSurfaceCreateInfoQNX.get_context(segment, 0L); }
    /// {@return `context` at the given index}
    /// @param index the index
    public @CType("struct _screen_context *") java.lang.foreign.MemorySegment contextAt(long index) { return VkScreenSurfaceCreateInfoQNX.get_context(this.segment(), index); }
    /// {@return `context`}
    public @CType("struct _screen_context *") java.lang.foreign.MemorySegment context() { return VkScreenSurfaceCreateInfoQNX.get_context(this.segment()); }
    /// Sets `context` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_context(MemorySegment segment, long index, @CType("struct _screen_context *") java.lang.foreign.MemorySegment value) { VH_context.set(segment, 0L, index, value); }
    /// Sets `context` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_context(MemorySegment segment, @CType("struct _screen_context *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_context(segment, 0L, value); }
    /// Sets `context` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX contextAt(long index, @CType("struct _screen_context *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_context(this.segment(), index, value); return this; }
    /// Sets `context` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX context(@CType("struct _screen_context *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_context(this.segment(), value); return this; }

    /// {@return `window` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("struct _screen_window *") java.lang.foreign.MemorySegment get_window(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_window.get(segment, 0L, index); }
    /// {@return `window`}
    /// @param segment the segment of the struct
    public static @CType("struct _screen_window *") java.lang.foreign.MemorySegment get_window(MemorySegment segment) { return VkScreenSurfaceCreateInfoQNX.get_window(segment, 0L); }
    /// {@return `window` at the given index}
    /// @param index the index
    public @CType("struct _screen_window *") java.lang.foreign.MemorySegment windowAt(long index) { return VkScreenSurfaceCreateInfoQNX.get_window(this.segment(), index); }
    /// {@return `window`}
    public @CType("struct _screen_window *") java.lang.foreign.MemorySegment window() { return VkScreenSurfaceCreateInfoQNX.get_window(this.segment()); }
    /// Sets `window` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_window(MemorySegment segment, long index, @CType("struct _screen_window *") java.lang.foreign.MemorySegment value) { VH_window.set(segment, 0L, index, value); }
    /// Sets `window` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_window(MemorySegment segment, @CType("struct _screen_window *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_window(segment, 0L, value); }
    /// Sets `window` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX windowAt(long index, @CType("struct _screen_window *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_window(this.segment(), index, value); return this; }
    /// Sets `window` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX window(@CType("struct _screen_window *") java.lang.foreign.MemorySegment value) { VkScreenSurfaceCreateInfoQNX.set_window(this.segment(), value); return this; }

}
