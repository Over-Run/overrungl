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
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceAntiLagFeaturesAMD`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceAntiLagFeaturesAMD {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 antiLag;
/// };
/// ```
public final class VkPhysicalDeviceAntiLagFeaturesAMD extends GroupType {
    /// The struct layout of `VkPhysicalDeviceAntiLagFeaturesAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("antiLag")
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
    /// The byte offset of `antiLag`.
    public static final long OFFSET_antiLag = LAYOUT.byteOffset(PathElement.groupElement("antiLag"));
    /// The memory layout of `antiLag`.
    public static final MemoryLayout LAYOUT_antiLag = LAYOUT.select(PathElement.groupElement("antiLag"));
    /// The [VarHandle] of `antiLag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_antiLag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("antiLag"));

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceAntiLagFeaturesAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAntiLagFeaturesAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAntiLagFeaturesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAntiLagFeaturesAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAntiLagFeaturesAMD`
    public static VkPhysicalDeviceAntiLagFeaturesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAntiLagFeaturesAMD(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAntiLagFeaturesAMD`
    public static VkPhysicalDeviceAntiLagFeaturesAMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAntiLagFeaturesAMD(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD copyFrom(VkPhysicalDeviceAntiLagFeaturesAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceAntiLagFeaturesAMD reinterpret(long count) { return new VkPhysicalDeviceAntiLagFeaturesAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceAntiLagFeaturesAMD sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceAntiLagFeaturesAMD pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `antiLag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int antiLag(MemorySegment segment, long index) { return (int) VH_antiLag.get(segment, 0L, index); }
    /// {@return `antiLag`}
    public int antiLag() { return antiLag(this.segment(), 0L); }
    /// Sets `antiLag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void antiLag(MemorySegment segment, long index, int value) { VH_antiLag.set(segment, 0L, index, value); }
    /// Sets `antiLag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD antiLag(int value) { antiLag(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceAntiLagFeaturesAMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceAntiLagFeaturesAMD`
    public VkPhysicalDeviceAntiLagFeaturesAMD asSlice(long index) { return new VkPhysicalDeviceAntiLagFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceAntiLagFeaturesAMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceAntiLagFeaturesAMD`
    public VkPhysicalDeviceAntiLagFeaturesAMD asSlice(long index, long count) { return new VkPhysicalDeviceAntiLagFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceAntiLagFeaturesAMD` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD at(long index, Consumer<VkPhysicalDeviceAntiLagFeaturesAMD> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `antiLag` at the given index}
    /// @param index the index of the struct buffer
    public int antiLagAt(long index) { return antiLag(this.segment(), index); }
    /// Sets `antiLag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD antiLagAt(long index, int value) { antiLag(this.segment(), index, value); return this; }

}
