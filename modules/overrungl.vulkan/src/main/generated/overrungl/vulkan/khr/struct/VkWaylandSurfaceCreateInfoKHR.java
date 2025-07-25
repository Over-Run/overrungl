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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkWaylandSurfaceCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkWaylandSurfaceCreateFlagsKHR flags;
///     struct wl_display * display;
///     struct wl_surface * surface;
/// };
/// ```
public final class VkWaylandSurfaceCreateInfoKHR extends GroupType {
    /// The struct layout of `VkWaylandSurfaceCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withName("surface")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `display`.
    public static final long OFFSET_display = LAYOUT.byteOffset(PathElement.groupElement("display"));
    /// The memory layout of `display`.
    public static final MemoryLayout LAYOUT_display = LAYOUT.select(PathElement.groupElement("display"));
    /// The [VarHandle] of `display` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_display = LAYOUT.arrayElementVarHandle(PathElement.groupElement("display"));
    /// The byte offset of `surface`.
    public static final long OFFSET_surface = LAYOUT.byteOffset(PathElement.groupElement("surface"));
    /// The memory layout of `surface`.
    public static final MemoryLayout LAYOUT_surface = LAYOUT.select(PathElement.groupElement("surface"));
    /// The [VarHandle] of `surface` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_surface = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surface"));

    /// Creates `VkWaylandSurfaceCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkWaylandSurfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkWaylandSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWaylandSurfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWaylandSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWaylandSurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkWaylandSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWaylandSurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWaylandSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkWaylandSurfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkWaylandSurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param display `display`
    /// @param surface `surface`
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment display, MemorySegment surface) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).display(display).surface(surface);
    }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param display `display`
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment display) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).display(display);
    }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkWaylandSurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkWaylandSurfaceCreateInfoKHR`
    public static VkWaylandSurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR copyFrom(VkWaylandSurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkWaylandSurfaceCreateInfoKHR reinterpret(long count) { return new VkWaylandSurfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `display` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment display(MemorySegment segment, long index) { return (MemorySegment) VH_display.get(segment, 0L, index); }
    /// {@return `display`}
    public MemorySegment display() { return display(this.segment(), 0L); }
    /// Sets `display` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void display(MemorySegment segment, long index, MemorySegment value) { VH_display.set(segment, 0L, index, value); }
    /// Sets `display` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR display(MemorySegment value) { display(this.segment(), 0L, value); return this; }

    /// {@return `surface` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment surface(MemorySegment segment, long index) { return (MemorySegment) VH_surface.get(segment, 0L, index); }
    /// {@return `surface`}
    public MemorySegment surface() { return surface(this.segment(), 0L); }
    /// Sets `surface` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void surface(MemorySegment segment, long index, MemorySegment value) { VH_surface.set(segment, 0L, index, value); }
    /// Sets `surface` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR surface(MemorySegment value) { surface(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkWaylandSurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWaylandSurfaceCreateInfoKHR`
    public VkWaylandSurfaceCreateInfoKHR asSlice(long index) { return new VkWaylandSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkWaylandSurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWaylandSurfaceCreateInfoKHR`
    public VkWaylandSurfaceCreateInfoKHR asSlice(long index, long count) { return new VkWaylandSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkWaylandSurfaceCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR at(long index, Consumer<VkWaylandSurfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `display` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment displayAt(long index) { return display(this.segment(), index); }
    /// Sets `display` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR displayAt(long index, MemorySegment value) { display(this.segment(), index, value); return this; }

    /// {@return `surface` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment surfaceAt(long index) { return surface(this.segment(), index); }
    /// Sets `surface` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWaylandSurfaceCreateInfoKHR surfaceAt(long index, MemorySegment value) { surface(this.segment(), index, value); return this; }

}
