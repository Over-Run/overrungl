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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFormatProperties3`.
/// ## Layout
/// ```
/// struct VkFormatProperties3 {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 linearTilingFeatures;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 optimalTilingFeatures;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 bufferFeatures;
/// };
/// ```
public final class VkFormatProperties3 extends GroupType {
    /// The struct layout of `VkFormatProperties3`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("linearTilingFeatures"),
        ValueLayout.JAVA_LONG.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_LONG.withName("bufferFeatures")
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
    /// The byte offset of `linearTilingFeatures`.
    public static final long OFFSET_linearTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("linearTilingFeatures"));
    /// The memory layout of `linearTilingFeatures`.
    public static final MemoryLayout LAYOUT_linearTilingFeatures = LAYOUT.select(PathElement.groupElement("linearTilingFeatures"));
    /// The [VarHandle] of `linearTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_linearTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingFeatures"));
    /// The byte offset of `optimalTilingFeatures`.
    public static final long OFFSET_optimalTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingFeatures"));
    /// The memory layout of `optimalTilingFeatures`.
    public static final MemoryLayout LAYOUT_optimalTilingFeatures = LAYOUT.select(PathElement.groupElement("optimalTilingFeatures"));
    /// The [VarHandle] of `optimalTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_optimalTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingFeatures"));
    /// The byte offset of `bufferFeatures`.
    public static final long OFFSET_bufferFeatures = LAYOUT.byteOffset(PathElement.groupElement("bufferFeatures"));
    /// The memory layout of `bufferFeatures`.
    public static final MemoryLayout LAYOUT_bufferFeatures = LAYOUT.select(PathElement.groupElement("bufferFeatures"));
    /// The [VarHandle] of `bufferFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferFeatures"));

    /// Creates `VkFormatProperties3` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFormatProperties3(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFormatProperties3` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties3 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties3(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFormatProperties3` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties3 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties3(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFormatProperties3` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFormatProperties3 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFormatProperties3(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFormatProperties3` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFormatProperties3`
    public static VkFormatProperties3 alloc(SegmentAllocator allocator) { return new VkFormatProperties3(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFormatProperties3` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFormatProperties3`
    public static VkFormatProperties3 alloc(SegmentAllocator allocator, long count) { return new VkFormatProperties3(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFormatProperties3 copyFrom(VkFormatProperties3 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFormatProperties3 reinterpret(long count) { return new VkFormatProperties3(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkFormatProperties3 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFormatProperties3 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `linearTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long linearTilingFeatures(MemorySegment segment, long index) { return (long) VH_linearTilingFeatures.get(segment, 0L, index); }
    /// {@return `linearTilingFeatures`}
    public long linearTilingFeatures() { return linearTilingFeatures(this.segment(), 0L); }
    /// Sets `linearTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void linearTilingFeatures(MemorySegment segment, long index, long value) { VH_linearTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `linearTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 linearTilingFeatures(long value) { linearTilingFeatures(this.segment(), 0L, value); return this; }

    /// {@return `optimalTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long optimalTilingFeatures(MemorySegment segment, long index) { return (long) VH_optimalTilingFeatures.get(segment, 0L, index); }
    /// {@return `optimalTilingFeatures`}
    public long optimalTilingFeatures() { return optimalTilingFeatures(this.segment(), 0L); }
    /// Sets `optimalTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalTilingFeatures(MemorySegment segment, long index, long value) { VH_optimalTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `optimalTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 optimalTilingFeatures(long value) { optimalTilingFeatures(this.segment(), 0L, value); return this; }

    /// {@return `bufferFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferFeatures(MemorySegment segment, long index) { return (long) VH_bufferFeatures.get(segment, 0L, index); }
    /// {@return `bufferFeatures`}
    public long bufferFeatures() { return bufferFeatures(this.segment(), 0L); }
    /// Sets `bufferFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferFeatures(MemorySegment segment, long index, long value) { VH_bufferFeatures.set(segment, 0L, index, value); }
    /// Sets `bufferFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 bufferFeatures(long value) { bufferFeatures(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkFormatProperties3`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFormatProperties3`
    public VkFormatProperties3 asSlice(long index) { return new VkFormatProperties3(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFormatProperties3`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFormatProperties3`
    public VkFormatProperties3 asSlice(long index, long count) { return new VkFormatProperties3(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFormatProperties3` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFormatProperties3 at(long index, Consumer<VkFormatProperties3> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `linearTilingFeatures` at the given index}
    /// @param index the index of the struct buffer
    public long linearTilingFeaturesAt(long index) { return linearTilingFeatures(this.segment(), index); }
    /// Sets `linearTilingFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 linearTilingFeaturesAt(long index, long value) { linearTilingFeatures(this.segment(), index, value); return this; }

    /// {@return `optimalTilingFeatures` at the given index}
    /// @param index the index of the struct buffer
    public long optimalTilingFeaturesAt(long index) { return optimalTilingFeatures(this.segment(), index); }
    /// Sets `optimalTilingFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 optimalTilingFeaturesAt(long index, long value) { optimalTilingFeatures(this.segment(), index, value); return this; }

    /// {@return `bufferFeatures` at the given index}
    /// @param index the index of the struct buffer
    public long bufferFeaturesAt(long index) { return bufferFeatures(this.segment(), index); }
    /// Sets `bufferFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFormatProperties3 bufferFeaturesAt(long index, long value) { bufferFeatures(this.segment(), index, value); return this; }

}
