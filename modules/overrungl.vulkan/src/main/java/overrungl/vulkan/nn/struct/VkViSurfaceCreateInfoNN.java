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
package overrungl.vulkan.nn.struct;

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
/// ### window
/// [VarHandle][#VH_window] - [Getter][#window()] - [Setter][#window(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkViSurfaceCreateInfoNN {
///     VkStructureType sType;
///     const void * pNext;
///     VkViSurfaceCreateFlagsNN flags;
///     void * window;
/// } VkViSurfaceCreateInfoNN;
/// ```
public final class VkViSurfaceCreateInfoNN extends Struct {
    /// The struct layout of `VkViSurfaceCreateInfoNN`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("window")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `window` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_window = LAYOUT.arrayElementVarHandle(PathElement.groupElement("window"));

    /// Creates `VkViSurfaceCreateInfoNN` with the given segment.
    /// @param segment the memory segment
    public VkViSurfaceCreateInfoNN(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkViSurfaceCreateInfoNN` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViSurfaceCreateInfoNN of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkViSurfaceCreateInfoNN(segment); }

    /// Creates `VkViSurfaceCreateInfoNN` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViSurfaceCreateInfoNN ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkViSurfaceCreateInfoNN(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkViSurfaceCreateInfoNN` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViSurfaceCreateInfoNN ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkViSurfaceCreateInfoNN(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkViSurfaceCreateInfoNN` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViSurfaceCreateInfoNN`
    public static VkViSurfaceCreateInfoNN alloc(SegmentAllocator allocator) { return new VkViSurfaceCreateInfoNN(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkViSurfaceCreateInfoNN` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViSurfaceCreateInfoNN`
    public static VkViSurfaceCreateInfoNN alloc(SegmentAllocator allocator, long count) { return new VkViSurfaceCreateInfoNN(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkViSurfaceCreateInfoNN`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkViSurfaceCreateInfoNN`
    public VkViSurfaceCreateInfoNN asSlice(long index) { return new VkViSurfaceCreateInfoNN(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkViSurfaceCreateInfoNN`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkViSurfaceCreateInfoNN`
    public VkViSurfaceCreateInfoNN asSlice(long index, long count) { return new VkViSurfaceCreateInfoNN(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkViSurfaceCreateInfoNN.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkViSurfaceCreateInfoNN.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkViSurfaceCreateInfoNN.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkViSurfaceCreateInfoNN.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN sTypeAt(long index, @CType("VkStructureType") int value) { VkViSurfaceCreateInfoNN.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN sType(@CType("VkStructureType") int value) { VkViSurfaceCreateInfoNN.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkViSurfaceCreateInfoNN.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkViSurfaceCreateInfoNN.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkViSurfaceCreateInfoNN.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkViSurfaceCreateInfoNN.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkViSurfaceCreateInfoNN.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkViSurfaceCreateInfoNN.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkViSurfaceCreateFlagsNN") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkViSurfaceCreateFlagsNN") int get_flags(MemorySegment segment) { return VkViSurfaceCreateInfoNN.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkViSurfaceCreateFlagsNN") int flagsAt(long index) { return VkViSurfaceCreateInfoNN.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkViSurfaceCreateFlagsNN") int flags() { return VkViSurfaceCreateInfoNN.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkViSurfaceCreateFlagsNN") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkViSurfaceCreateFlagsNN") int value) { VkViSurfaceCreateInfoNN.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN flagsAt(long index, @CType("VkViSurfaceCreateFlagsNN") int value) { VkViSurfaceCreateInfoNN.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN flags(@CType("VkViSurfaceCreateFlagsNN") int value) { VkViSurfaceCreateInfoNN.set_flags(this.segment(), value); return this; }

    /// {@return `window` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_window(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_window.get(segment, 0L, index); }
    /// {@return `window`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_window(MemorySegment segment) { return VkViSurfaceCreateInfoNN.get_window(segment, 0L); }
    /// {@return `window` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment windowAt(long index) { return VkViSurfaceCreateInfoNN.get_window(this.segment(), index); }
    /// {@return `window`}
    public @CType("void *") java.lang.foreign.MemorySegment window() { return VkViSurfaceCreateInfoNN.get_window(this.segment()); }
    /// Sets `window` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_window(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_window.set(segment, 0L, index, value); }
    /// Sets `window` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_window(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkViSurfaceCreateInfoNN.set_window(segment, 0L, value); }
    /// Sets `window` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN windowAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkViSurfaceCreateInfoNN.set_window(this.segment(), index, value); return this; }
    /// Sets `window` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN window(@CType("void *") java.lang.foreign.MemorySegment value) { VkViSurfaceCreateInfoNN.set_window(this.segment(), value); return this; }

}
