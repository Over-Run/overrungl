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
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VmaVirtualBlockCreateInfo`.
/// ## Layout
/// ```
/// struct VmaVirtualBlockCreateInfo {
///     (uint64_t) VkDeviceSize size;
///     ((uint32_t) VkFlags) VmaVirtualBlockCreateFlags flags;
///     const VkAllocationCallbacks* pAllocationCallbacks;
/// };
/// ```
public final class VmaVirtualBlockCreateInfo extends GroupType {
    /// The struct layout of `VmaVirtualBlockCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pAllocationCallbacks")
    );
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `pAllocationCallbacks`.
    public static final long OFFSET_pAllocationCallbacks = LAYOUT.byteOffset(PathElement.groupElement("pAllocationCallbacks"));
    /// The memory layout of `pAllocationCallbacks`.
    public static final MemoryLayout LAYOUT_pAllocationCallbacks = LAYOUT.select(PathElement.groupElement("pAllocationCallbacks"));
    /// The [VarHandle] of `pAllocationCallbacks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAllocationCallbacks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAllocationCallbacks"));

    /// Creates `VmaVirtualBlockCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaVirtualBlockCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaVirtualBlockCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualBlockCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualBlockCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaVirtualBlockCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualBlockCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualBlockCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaVirtualBlockCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaVirtualBlockCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaVirtualBlockCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaVirtualBlockCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaVirtualBlockCreateInfo`
    public static VmaVirtualBlockCreateInfo alloc(SegmentAllocator allocator) { return new VmaVirtualBlockCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaVirtualBlockCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaVirtualBlockCreateInfo`
    public static VmaVirtualBlockCreateInfo alloc(SegmentAllocator allocator, long count) { return new VmaVirtualBlockCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaVirtualBlockCreateInfo copyFrom(VmaVirtualBlockCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaVirtualBlockCreateInfo reinterpret(long count) { return new VmaVirtualBlockCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVirtualBlockCreateInfo size(long value) { size(this.segment(), 0L, value); return this; }

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
    public VmaVirtualBlockCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pAllocationCallbacks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAllocationCallbacks(MemorySegment segment, long index) { return (MemorySegment) VH_pAllocationCallbacks.get(segment, 0L, index); }
    /// {@return `pAllocationCallbacks`}
    public MemorySegment pAllocationCallbacks() { return pAllocationCallbacks(this.segment(), 0L); }
    /// Sets `pAllocationCallbacks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAllocationCallbacks(MemorySegment segment, long index, MemorySegment value) { VH_pAllocationCallbacks.set(segment, 0L, index, value); }
    /// Sets `pAllocationCallbacks` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaVirtualBlockCreateInfo pAllocationCallbacks(MemorySegment value) { pAllocationCallbacks(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaVirtualBlockCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaVirtualBlockCreateInfo`
    public VmaVirtualBlockCreateInfo asSlice(long index) { return new VmaVirtualBlockCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaVirtualBlockCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaVirtualBlockCreateInfo`
    public VmaVirtualBlockCreateInfo asSlice(long index, long count) { return new VmaVirtualBlockCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaVirtualBlockCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaVirtualBlockCreateInfo at(long index, Consumer<VmaVirtualBlockCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualBlockCreateInfo sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualBlockCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pAllocationCallbacks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAllocationCallbacksAt(long index) { return pAllocationCallbacks(this.segment(), index); }
    /// Sets `pAllocationCallbacks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaVirtualBlockCreateInfo pAllocationCallbacksAt(long index, MemorySegment value) { pAllocationCallbacks(this.segment(), index, value); return this; }

}
