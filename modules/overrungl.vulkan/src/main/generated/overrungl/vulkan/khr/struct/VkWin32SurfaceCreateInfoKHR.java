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
/// struct VkWin32SurfaceCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkWin32SurfaceCreateFlagsKHR flags;
///     (void*) HINSTANCE hinstance;
///     (void*) HWND hwnd;
/// };
/// ```
public final class VkWin32SurfaceCreateInfoKHR extends GroupType {
    /// The struct layout of `VkWin32SurfaceCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("hinstance"),
        ValueLayout.ADDRESS.withName("hwnd")
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
    /// The byte offset of `hinstance`.
    public static final long OFFSET_hinstance = LAYOUT.byteOffset(PathElement.groupElement("hinstance"));
    /// The memory layout of `hinstance`.
    public static final MemoryLayout LAYOUT_hinstance = LAYOUT.select(PathElement.groupElement("hinstance"));
    /// The [VarHandle] of `hinstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hinstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hinstance"));
    /// The byte offset of `hwnd`.
    public static final long OFFSET_hwnd = LAYOUT.byteOffset(PathElement.groupElement("hwnd"));
    /// The memory layout of `hwnd`.
    public static final MemoryLayout LAYOUT_hwnd = LAYOUT.select(PathElement.groupElement("hwnd"));
    /// The [VarHandle] of `hwnd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hwnd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hwnd"));

    /// Creates `VkWin32SurfaceCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkWin32SurfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkWin32SurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32SurfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWin32SurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32SurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkWin32SurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32SurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32SurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkWin32SurfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkWin32SurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param hinstance `hinstance`
    /// @param hwnd `hwnd`
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment hinstance, MemorySegment hwnd) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).hinstance(hinstance).hwnd(hwnd);
    }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param hinstance `hinstance`
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment hinstance) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).hinstance(hinstance);
    }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkWin32SurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkWin32SurfaceCreateInfoKHR`
    public static VkWin32SurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR copyFrom(VkWin32SurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkWin32SurfaceCreateInfoKHR reinterpret(long count) { return new VkWin32SurfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkWin32SurfaceCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkWin32SurfaceCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkWin32SurfaceCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `hinstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment hinstance(MemorySegment segment, long index) { return (MemorySegment) VH_hinstance.get(segment, 0L, index); }
    /// {@return `hinstance`}
    public MemorySegment hinstance() { return hinstance(this.segment(), 0L); }
    /// Sets `hinstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hinstance(MemorySegment segment, long index, MemorySegment value) { VH_hinstance.set(segment, 0L, index, value); }
    /// Sets `hinstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR hinstance(MemorySegment value) { hinstance(this.segment(), 0L, value); return this; }

    /// {@return `hwnd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment hwnd(MemorySegment segment, long index) { return (MemorySegment) VH_hwnd.get(segment, 0L, index); }
    /// {@return `hwnd`}
    public MemorySegment hwnd() { return hwnd(this.segment(), 0L); }
    /// Sets `hwnd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hwnd(MemorySegment segment, long index, MemorySegment value) { VH_hwnd.set(segment, 0L, index, value); }
    /// Sets `hwnd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR hwnd(MemorySegment value) { hwnd(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkWin32SurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWin32SurfaceCreateInfoKHR`
    public VkWin32SurfaceCreateInfoKHR asSlice(long index) { return new VkWin32SurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkWin32SurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWin32SurfaceCreateInfoKHR`
    public VkWin32SurfaceCreateInfoKHR asSlice(long index, long count) { return new VkWin32SurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkWin32SurfaceCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR at(long index, Consumer<VkWin32SurfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `hinstance` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment hinstanceAt(long index) { return hinstance(this.segment(), index); }
    /// Sets `hinstance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR hinstanceAt(long index, MemorySegment value) { hinstance(this.segment(), index, value); return this; }

    /// {@return `hwnd` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment hwndAt(long index) { return hwnd(this.segment(), index); }
    /// Sets `hwnd` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWin32SurfaceCreateInfoKHR hwndAt(long index, MemorySegment value) { hwnd(this.segment(), index, value); return this; }

}
