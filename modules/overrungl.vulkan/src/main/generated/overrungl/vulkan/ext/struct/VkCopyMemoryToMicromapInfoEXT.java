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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkCopyMemoryToMicromapInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR src;
///     (uint64_t) VkMicromapEXT dst;
///     (int) VkCopyMicromapModeEXT mode;
/// };
/// ```
public final class VkCopyMemoryToMicromapInfoEXT extends GroupType {
    /// The struct layout of `VkCopyMemoryToMicromapInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("src"),
        ValueLayout.JAVA_LONG.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
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
    /// The byte offset of `src`.
    public static final long OFFSET_src = LAYOUT.byteOffset(PathElement.groupElement("src"));
    /// The memory layout of `src`.
    public static final MemoryLayout LAYOUT_src = LAYOUT.select(PathElement.groupElement("src"));
    /// The byte offset of `dst`.
    public static final long OFFSET_dst = LAYOUT.byteOffset(PathElement.groupElement("dst"));
    /// The memory layout of `dst`.
    public static final MemoryLayout LAYOUT_dst = LAYOUT.select(PathElement.groupElement("dst"));
    /// The [VarHandle] of `dst` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dst = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst"));
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkCopyMemoryToMicromapInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCopyMemoryToMicromapInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCopyMemoryToMicromapInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToMicromapInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyMemoryToMicromapInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToMicromapInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCopyMemoryToMicromapInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToMicromapInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT alloc(SegmentAllocator allocator) { return new VkCopyMemoryToMicromapInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryToMicromapInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param src `src`
    /// @param dst `dst`
    /// @param mode `mode`
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment src, long dst, int mode) {
        return alloc(allocator).sType(sType).pNext(pNext).src(src).dst(dst).mode(mode);
    }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param src `src`
    /// @param dst `dst`
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment src, long dst) {
        return alloc(allocator).sType(sType).pNext(pNext).src(src).dst(dst);
    }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param src `src`
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment src) {
        return alloc(allocator).sType(sType).pNext(pNext).src(src);
    }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkCopyMemoryToMicromapInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkCopyMemoryToMicromapInfoEXT`
    public static VkCopyMemoryToMicromapInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT copyFrom(VkCopyMemoryToMicromapInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCopyMemoryToMicromapInfoEXT reinterpret(long count) { return new VkCopyMemoryToMicromapInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCopyMemoryToMicromapInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCopyMemoryToMicromapInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `src` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment src(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_src, index), LAYOUT_src); }
    /// {@return `src`}
    public MemorySegment src() { return src(this.segment(), 0L); }
    /// Sets `src` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void src(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_src, index), LAYOUT_src.byteSize()); }
    /// Sets `src` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT src(MemorySegment value) { src(this.segment(), 0L, value); return this; }
    /// Accepts `src` with the given function.
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT src(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(src())); return this; }

    /// {@return `dst` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dst(MemorySegment segment, long index) { return (long) VH_dst.get(segment, 0L, index); }
    /// {@return `dst`}
    public long dst() { return dst(this.segment(), 0L); }
    /// Sets `dst` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dst(MemorySegment segment, long index, long value) { VH_dst.set(segment, 0L, index, value); }
    /// Sets `dst` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT dst(long value) { dst(this.segment(), 0L, value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCopyMemoryToMicromapInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyMemoryToMicromapInfoEXT`
    public VkCopyMemoryToMicromapInfoEXT asSlice(long index) { return new VkCopyMemoryToMicromapInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCopyMemoryToMicromapInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyMemoryToMicromapInfoEXT`
    public VkCopyMemoryToMicromapInfoEXT asSlice(long index, long count) { return new VkCopyMemoryToMicromapInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCopyMemoryToMicromapInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT at(long index, Consumer<VkCopyMemoryToMicromapInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `src` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment srcAt(long index) { return src(this.segment(), index); }
    /// Sets `src` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT srcAt(long index, MemorySegment value) { src(this.segment(), index, value); return this; }
    /// Accepts `src` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT srcAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(srcAt(index))); return this; }

    /// {@return `dst` at the given index}
    /// @param index the index of the struct buffer
    public long dstAt(long index) { return dst(this.segment(), index); }
    /// Sets `dst` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT dstAt(long index, long value) { dst(this.segment(), index, value); return this; }

    /// {@return `mode` at the given index}
    /// @param index the index of the struct buffer
    public int modeAt(long index) { return mode(this.segment(), index); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToMicromapInfoEXT modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

}
