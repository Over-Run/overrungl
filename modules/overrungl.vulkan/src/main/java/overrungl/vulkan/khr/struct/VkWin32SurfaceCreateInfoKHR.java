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
/// ### hinstance
/// [VarHandle][#VH_hinstance] - [Getter][#hinstance()] - [Setter][#hinstance(java.lang.foreign.MemorySegment)]
/// ### hwnd
/// [VarHandle][#VH_hwnd] - [Getter][#hwnd()] - [Setter][#hwnd(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWin32SurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkWin32SurfaceCreateFlagsKHR flags;
///     HINSTANCE hinstance;
///     HWND hwnd;
/// } VkWin32SurfaceCreateInfoKHR;
/// ```
public final class VkWin32SurfaceCreateInfoKHR extends Struct {
    /// The struct layout of `VkWin32SurfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("hinstance"),
        ValueLayout.ADDRESS.withName("hwnd")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `hinstance` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_hinstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hinstance"));
    /// The [VarHandle] of `hwnd` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_hwnd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hwnd"));

    /// Creates `VkWin32SurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkWin32SurfaceCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWin32SurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32SurfaceCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment); }

    /// Creates `VkWin32SurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32SurfaceCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWin32SurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32SurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkWin32SurfaceCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkWin32SurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkWin32SurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWin32SurfaceCreateInfoKHR`
    public VkWin32SurfaceCreateInfoKHR asSlice(long index) { return new VkWin32SurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkWin32SurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWin32SurfaceCreateInfoKHR`
    public VkWin32SurfaceCreateInfoKHR asSlice(long index, long count) { return new VkWin32SurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWin32SurfaceCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkWin32SurfaceCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWin32SurfaceCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWin32SurfaceCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkWin32SurfaceCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR sType(@CType("VkStructureType") int value) { VkWin32SurfaceCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWin32SurfaceCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWin32SurfaceCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWin32SurfaceCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkWin32SurfaceCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkWin32SurfaceCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkWin32SurfaceCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkWin32SurfaceCreateFlagsKHR") int flagsAt(long index) { return VkWin32SurfaceCreateInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkWin32SurfaceCreateFlagsKHR") int flags() { return VkWin32SurfaceCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkWin32SurfaceCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkWin32SurfaceCreateFlagsKHR") int value) { VkWin32SurfaceCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR flagsAt(long index, @CType("VkWin32SurfaceCreateFlagsKHR") int value) { VkWin32SurfaceCreateInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR flags(@CType("VkWin32SurfaceCreateFlagsKHR") int value) { VkWin32SurfaceCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `hinstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("HINSTANCE") java.lang.foreign.MemorySegment get_hinstance(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_hinstance.get(segment, 0L, index); }
    /// {@return `hinstance`}
    /// @param segment the segment of the struct
    public static @CType("HINSTANCE") java.lang.foreign.MemorySegment get_hinstance(MemorySegment segment) { return VkWin32SurfaceCreateInfoKHR.get_hinstance(segment, 0L); }
    /// {@return `hinstance` at the given index}
    /// @param index the index
    public @CType("HINSTANCE") java.lang.foreign.MemorySegment hinstanceAt(long index) { return VkWin32SurfaceCreateInfoKHR.get_hinstance(this.segment(), index); }
    /// {@return `hinstance`}
    public @CType("HINSTANCE") java.lang.foreign.MemorySegment hinstance() { return VkWin32SurfaceCreateInfoKHR.get_hinstance(this.segment()); }
    /// Sets `hinstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hinstance(MemorySegment segment, long index, @CType("HINSTANCE") java.lang.foreign.MemorySegment value) { VH_hinstance.set(segment, 0L, index, value); }
    /// Sets `hinstance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hinstance(MemorySegment segment, @CType("HINSTANCE") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_hinstance(segment, 0L, value); }
    /// Sets `hinstance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR hinstanceAt(long index, @CType("HINSTANCE") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_hinstance(this.segment(), index, value); return this; }
    /// Sets `hinstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR hinstance(@CType("HINSTANCE") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_hinstance(this.segment(), value); return this; }

    /// {@return `hwnd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("HWND") java.lang.foreign.MemorySegment get_hwnd(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_hwnd.get(segment, 0L, index); }
    /// {@return `hwnd`}
    /// @param segment the segment of the struct
    public static @CType("HWND") java.lang.foreign.MemorySegment get_hwnd(MemorySegment segment) { return VkWin32SurfaceCreateInfoKHR.get_hwnd(segment, 0L); }
    /// {@return `hwnd` at the given index}
    /// @param index the index
    public @CType("HWND") java.lang.foreign.MemorySegment hwndAt(long index) { return VkWin32SurfaceCreateInfoKHR.get_hwnd(this.segment(), index); }
    /// {@return `hwnd`}
    public @CType("HWND") java.lang.foreign.MemorySegment hwnd() { return VkWin32SurfaceCreateInfoKHR.get_hwnd(this.segment()); }
    /// Sets `hwnd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hwnd(MemorySegment segment, long index, @CType("HWND") java.lang.foreign.MemorySegment value) { VH_hwnd.set(segment, 0L, index, value); }
    /// Sets `hwnd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hwnd(MemorySegment segment, @CType("HWND") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_hwnd(segment, 0L, value); }
    /// Sets `hwnd` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR hwndAt(long index, @CType("HWND") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_hwnd(this.segment(), index, value); return this; }
    /// Sets `hwnd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR hwnd(@CType("HWND") java.lang.foreign.MemorySegment value) { VkWin32SurfaceCreateInfoKHR.set_hwnd(this.segment(), value); return this; }

}
