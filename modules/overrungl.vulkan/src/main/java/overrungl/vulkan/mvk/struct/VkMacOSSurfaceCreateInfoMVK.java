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
package overrungl.vulkan.mvk.struct;

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
/// ### pView
/// [VarHandle][#VH_pView] - [Getter][#pView()] - [Setter][#pView(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMacOSSurfaceCreateInfoMVK {
///     VkStructureType sType;
///     const void * pNext;
///     VkMacOSSurfaceCreateFlagsMVK flags;
///     const void * pView;
/// } VkMacOSSurfaceCreateInfoMVK;
/// ```
public final class VkMacOSSurfaceCreateInfoMVK extends Struct {
    /// The struct layout of `VkMacOSSurfaceCreateInfoMVK`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pView")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pView"));

    /// Creates `VkMacOSSurfaceCreateInfoMVK` with the given segment.
    /// @param segment the memory segment
    public VkMacOSSurfaceCreateInfoMVK(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMacOSSurfaceCreateInfoMVK` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMacOSSurfaceCreateInfoMVK of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment); }

    /// Creates `VkMacOSSurfaceCreateInfoMVK` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMacOSSurfaceCreateInfoMVK ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMacOSSurfaceCreateInfoMVK` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMacOSSurfaceCreateInfoMVK ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMacOSSurfaceCreateInfoMVK` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMacOSSurfaceCreateInfoMVK`
    public static VkMacOSSurfaceCreateInfoMVK alloc(SegmentAllocator allocator) { return new VkMacOSSurfaceCreateInfoMVK(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMacOSSurfaceCreateInfoMVK` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMacOSSurfaceCreateInfoMVK`
    public static VkMacOSSurfaceCreateInfoMVK alloc(SegmentAllocator allocator, long count) { return new VkMacOSSurfaceCreateInfoMVK(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMacOSSurfaceCreateInfoMVK.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMacOSSurfaceCreateInfoMVK.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMacOSSurfaceCreateInfoMVK.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMacOSSurfaceCreateInfoMVK.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK sTypeAt(long index, @CType("VkStructureType") int value) { VkMacOSSurfaceCreateInfoMVK.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK sType(@CType("VkStructureType") int value) { VkMacOSSurfaceCreateInfoMVK.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMacOSSurfaceCreateInfoMVK.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMacOSSurfaceCreateInfoMVK.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMacOSSurfaceCreateInfoMVK.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMacOSSurfaceCreateInfoMVK.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMacOSSurfaceCreateInfoMVK.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMacOSSurfaceCreateInfoMVK.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMacOSSurfaceCreateFlagsMVK") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkMacOSSurfaceCreateFlagsMVK") int get_flags(MemorySegment segment) { return VkMacOSSurfaceCreateInfoMVK.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkMacOSSurfaceCreateFlagsMVK") int flagsAt(long index) { return VkMacOSSurfaceCreateInfoMVK.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkMacOSSurfaceCreateFlagsMVK") int flags() { return VkMacOSSurfaceCreateInfoMVK.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkMacOSSurfaceCreateFlagsMVK") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkMacOSSurfaceCreateFlagsMVK") int value) { VkMacOSSurfaceCreateInfoMVK.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK flagsAt(long index, @CType("VkMacOSSurfaceCreateFlagsMVK") int value) { VkMacOSSurfaceCreateInfoMVK.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK flags(@CType("VkMacOSSurfaceCreateFlagsMVK") int value) { VkMacOSSurfaceCreateInfoMVK.set_flags(this.segment(), value); return this; }

    /// {@return `pView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pView.get(segment, 0L, index); }
    /// {@return `pView`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pView(MemorySegment segment) { return VkMacOSSurfaceCreateInfoMVK.get_pView(segment, 0L); }
    /// {@return `pView` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pViewAt(long index) { return VkMacOSSurfaceCreateInfoMVK.get_pView(this.segment(), index); }
    /// {@return `pView`}
    public @CType("const void *") java.lang.foreign.MemorySegment pView() { return VkMacOSSurfaceCreateInfoMVK.get_pView(this.segment()); }
    /// Sets `pView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pView(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pView.set(segment, 0L, index, value); }
    /// Sets `pView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pView(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMacOSSurfaceCreateInfoMVK.set_pView(segment, 0L, value); }
    /// Sets `pView` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK pViewAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMacOSSurfaceCreateInfoMVK.set_pView(this.segment(), index, value); return this; }
    /// Sets `pView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK pView(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMacOSSurfaceCreateInfoMVK.set_pView(this.segment(), value); return this; }

}