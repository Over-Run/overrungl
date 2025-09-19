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
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkNativeBufferANDROID`.
/// ## Layout
/// ```
/// struct VkNativeBufferANDROID {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const void* handle;
///     int stride;
///     int format;
///     int usage;
///     (struct VkNativeBufferUsage2ANDROID) VkNativeBufferUsage2ANDROID usage2;
/// };
/// ```
public final class VkNativeBufferANDROID extends GroupType {
    /// The struct layout of `VkNativeBufferANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("handle"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("usage"),
        overrungl.vulkan.android.struct.VkNativeBufferUsage2ANDROID.LAYOUT.withName("usage2")
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
    /// The byte offset of `handle`.
    public static final long OFFSET_handle = LAYOUT.byteOffset(PathElement.groupElement("handle"));
    /// The memory layout of `handle`.
    public static final MemoryLayout LAYOUT_handle = LAYOUT.select(PathElement.groupElement("handle"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));
    /// The byte offset of `stride`.
    public static final long OFFSET_stride = LAYOUT.byteOffset(PathElement.groupElement("stride"));
    /// The memory layout of `stride`.
    public static final MemoryLayout LAYOUT_stride = LAYOUT.select(PathElement.groupElement("stride"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `usage`.
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    /// The memory layout of `usage`.
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The byte offset of `usage2`.
    public static final long OFFSET_usage2 = LAYOUT.byteOffset(PathElement.groupElement("usage2"));
    /// The memory layout of `usage2`.
    public static final MemoryLayout LAYOUT_usage2 = LAYOUT.select(PathElement.groupElement("usage2"));

    /// Creates `VkNativeBufferANDROID` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkNativeBufferANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkNativeBufferANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferANDROID(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkNativeBufferANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkNativeBufferANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkNativeBufferANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkNativeBufferANDROID`
    public static VkNativeBufferANDROID alloc(SegmentAllocator allocator) { return new VkNativeBufferANDROID(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkNativeBufferANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkNativeBufferANDROID`
    public static VkNativeBufferANDROID alloc(SegmentAllocator allocator, long count) { return new VkNativeBufferANDROID(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkNativeBufferANDROID copyFrom(VkNativeBufferANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkNativeBufferANDROID reinterpret(long count) { return new VkNativeBufferANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkNativeBufferANDROID sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkNativeBufferANDROID pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment handle(MemorySegment segment, long index) { return (MemorySegment) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    public MemorySegment handle() { return handle(this.segment(), 0L); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handle(MemorySegment segment, long index, MemorySegment value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID handle(MemorySegment value) { handle(this.segment(), 0L, value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    public int stride() { return stride(this.segment(), 0L); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stride(MemorySegment segment, long index, int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID stride(int value) { stride(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    public int usage() { return usage(this.segment(), 0L); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usage(MemorySegment segment, long index, int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID usage(int value) { usage(this.segment(), 0L, value); return this; }

    /// {@return `usage2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment usage2(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_usage2, index), LAYOUT_usage2); }
    /// {@return `usage2`}
    public MemorySegment usage2() { return usage2(this.segment(), 0L); }
    /// Sets `usage2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usage2(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_usage2, index), LAYOUT_usage2.byteSize()); }
    /// Sets `usage2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID usage2(MemorySegment value) { usage2(this.segment(), 0L, value); return this; }
    /// Accepts `usage2` with the given function.
    /// @param func the function
    /// @return `this`
    public VkNativeBufferANDROID usage2(Consumer<overrungl.vulkan.android.struct.VkNativeBufferUsage2ANDROID> func) { func.accept(overrungl.vulkan.android.struct.VkNativeBufferUsage2ANDROID.of(usage2())); return this; }

    /// Creates a slice of `VkNativeBufferANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkNativeBufferANDROID`
    public VkNativeBufferANDROID asSlice(long index) { return new VkNativeBufferANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkNativeBufferANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkNativeBufferANDROID`
    public VkNativeBufferANDROID asSlice(long index, long count) { return new VkNativeBufferANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkNativeBufferANDROID` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkNativeBufferANDROID at(long index, Consumer<VkNativeBufferANDROID> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `handle` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment handleAt(long index) { return handle(this.segment(), index); }
    /// Sets `handle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID handleAt(long index, MemorySegment value) { handle(this.segment(), index, value); return this; }

    /// {@return `stride` at the given index}
    /// @param index the index of the struct buffer
    public int strideAt(long index) { return stride(this.segment(), index); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID strideAt(long index, int value) { stride(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `usage` at the given index}
    /// @param index the index of the struct buffer
    public int usageAt(long index) { return usage(this.segment(), index); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID usageAt(long index, int value) { usage(this.segment(), index, value); return this; }

    /// {@return `usage2` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment usage2At(long index) { return usage2(this.segment(), index); }
    /// Sets `usage2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID usage2At(long index, MemorySegment value) { usage2(this.segment(), index, value); return this; }
    /// Accepts `usage2` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkNativeBufferANDROID usage2At(long index, Consumer<overrungl.vulkan.android.struct.VkNativeBufferUsage2ANDROID> func) { func.accept(overrungl.vulkan.android.struct.VkNativeBufferUsage2ANDROID.of(usage2At(index))); return this; }

}
