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
/// ### display
/// [VarHandle][#VH_display] - [Getter][#display()] - [Setter][#display(java.lang.foreign.MemorySegment)]
/// ### surface
/// [VarHandle][#VH_surface] - [Getter][#surface()] - [Setter][#surface(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWaylandSurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkWaylandSurfaceCreateFlagsKHR flags;
///     struct wl_display * display;
///     struct wl_surface * surface;
/// } VkWaylandSurfaceCreateInfoKHR;
/// ```
public final class VkWaylandSurfaceCreateInfoKHR extends Struct {
    /// The struct layout of `VkWaylandSurfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withName("surface")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `display` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_display = LAYOUT.arrayElementVarHandle(PathElement.groupElement("display"));
    /// The [VarHandle] of `surface` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));

    /// Creates `VkWaylandSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkWaylandSurfaceCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWaylandSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWaylandSurfaceCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment); }

    /// Creates `VkWaylandSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWaylandSurfaceCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWaylandSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWaylandSurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkWaylandSurfaceCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkWaylandSurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkWaylandSurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWaylandSurfaceCreateInfoKHR`
    public VkWaylandSurfaceCreateInfoKHR asSlice(long index) { return new VkWaylandSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkWaylandSurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWaylandSurfaceCreateInfoKHR`
    public VkWaylandSurfaceCreateInfoKHR asSlice(long index, long count) { return new VkWaylandSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWaylandSurfaceCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkWaylandSurfaceCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWaylandSurfaceCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWaylandSurfaceCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkWaylandSurfaceCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR sType(@CType("VkStructureType") int value) { VkWaylandSurfaceCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWaylandSurfaceCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWaylandSurfaceCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWaylandSurfaceCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkWaylandSurfaceCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkWaylandSurfaceCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkWaylandSurfaceCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkWaylandSurfaceCreateFlagsKHR") int flagsAt(long index) { return VkWaylandSurfaceCreateInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkWaylandSurfaceCreateFlagsKHR") int flags() { return VkWaylandSurfaceCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkWaylandSurfaceCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkWaylandSurfaceCreateFlagsKHR") int value) { VkWaylandSurfaceCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR flagsAt(long index, @CType("VkWaylandSurfaceCreateFlagsKHR") int value) { VkWaylandSurfaceCreateInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR flags(@CType("VkWaylandSurfaceCreateFlagsKHR") int value) { VkWaylandSurfaceCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `display` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("struct wl_display *") java.lang.foreign.MemorySegment get_display(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_display.get(segment, 0L, index); }
    /// {@return `display`}
    /// @param segment the segment of the struct
    public static @CType("struct wl_display *") java.lang.foreign.MemorySegment get_display(MemorySegment segment) { return VkWaylandSurfaceCreateInfoKHR.get_display(segment, 0L); }
    /// {@return `display` at the given index}
    /// @param index the index
    public @CType("struct wl_display *") java.lang.foreign.MemorySegment displayAt(long index) { return VkWaylandSurfaceCreateInfoKHR.get_display(this.segment(), index); }
    /// {@return `display`}
    public @CType("struct wl_display *") java.lang.foreign.MemorySegment display() { return VkWaylandSurfaceCreateInfoKHR.get_display(this.segment()); }
    /// Sets `display` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_display(MemorySegment segment, long index, @CType("struct wl_display *") java.lang.foreign.MemorySegment value) { VH_display.set(segment, 0L, index, value); }
    /// Sets `display` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_display(MemorySegment segment, @CType("struct wl_display *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_display(segment, 0L, value); }
    /// Sets `display` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR displayAt(long index, @CType("struct wl_display *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_display(this.segment(), index, value); return this; }
    /// Sets `display` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR display(@CType("struct wl_display *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_display(this.segment(), value); return this; }

    /// {@return `surface` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("struct wl_surface *") java.lang.foreign.MemorySegment get_surface(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_surface.get(segment, 0L, index); }
    /// {@return `surface`}
    /// @param segment the segment of the struct
    public static @CType("struct wl_surface *") java.lang.foreign.MemorySegment get_surface(MemorySegment segment) { return VkWaylandSurfaceCreateInfoKHR.get_surface(segment, 0L); }
    /// {@return `surface` at the given index}
    /// @param index the index
    public @CType("struct wl_surface *") java.lang.foreign.MemorySegment surfaceAt(long index) { return VkWaylandSurfaceCreateInfoKHR.get_surface(this.segment(), index); }
    /// {@return `surface`}
    public @CType("struct wl_surface *") java.lang.foreign.MemorySegment surface() { return VkWaylandSurfaceCreateInfoKHR.get_surface(this.segment()); }
    /// Sets `surface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_surface(MemorySegment segment, long index, @CType("struct wl_surface *") java.lang.foreign.MemorySegment value) { VH_surface.set(segment, 0L, index, value); }
    /// Sets `surface` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_surface(MemorySegment segment, @CType("struct wl_surface *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_surface(segment, 0L, value); }
    /// Sets `surface` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR surfaceAt(long index, @CType("struct wl_surface *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_surface(this.segment(), index, value); return this; }
    /// Sets `surface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR surface(@CType("struct wl_surface *") java.lang.foreign.MemorySegment value) { VkWaylandSurfaceCreateInfoKHR.set_surface(this.segment(), value); return this; }

}
