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
package overrungl.vulkan.sec.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceAmigoProfilingFeaturesSEC {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 amigoProfiling;
/// };
/// ```
public sealed class VkPhysicalDeviceAmigoProfilingFeaturesSEC extends GroupType {
    /// The struct layout of `VkPhysicalDeviceAmigoProfilingFeaturesSEC`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("amigoProfiling")
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
    /// The byte offset of `amigoProfiling`.
    public static final long OFFSET_amigoProfiling = LAYOUT.byteOffset(PathElement.groupElement("amigoProfiling"));
    /// The memory layout of `amigoProfiling`.
    public static final MemoryLayout LAYOUT_amigoProfiling = LAYOUT.select(PathElement.groupElement("amigoProfiling"));
    /// The [VarHandle] of `amigoProfiling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_amigoProfiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("amigoProfiling"));

    /// Creates `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAmigoProfilingFeaturesSEC(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAmigoProfilingFeaturesSEC`
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAmigoProfilingFeaturesSEC`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param amigoProfiling `amigoProfiling`
    /// @return the allocated `VkPhysicalDeviceAmigoProfilingFeaturesSEC`
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int amigoProfiling) {
        return alloc(allocator).sType(sType).pNext(pNext).amigoProfiling(amigoProfiling);
    }

    /// Allocates a `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceAmigoProfilingFeaturesSEC`
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceAmigoProfilingFeaturesSEC` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceAmigoProfilingFeaturesSEC`
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC copyFrom(VkPhysicalDeviceAmigoProfilingFeaturesSEC src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `amigoProfiling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int amigoProfiling(MemorySegment segment, long index) { return (int) VH_amigoProfiling.get(segment, 0L, index); }
    /// {@return `amigoProfiling`}
    public int amigoProfiling() { return amigoProfiling(this.segment(), 0L); }
    /// Sets `amigoProfiling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void amigoProfiling(MemorySegment segment, long index, int value) { VH_amigoProfiling.set(segment, 0L, index, value); }
    /// Sets `amigoProfiling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC amigoProfiling(int value) { amigoProfiling(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceAmigoProfilingFeaturesSEC].
    public static final class Buffer extends VkPhysicalDeviceAmigoProfilingFeaturesSEC {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceAmigoProfilingFeaturesSEC`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceAmigoProfilingFeaturesSEC`
        public VkPhysicalDeviceAmigoProfilingFeaturesSEC asSlice(long index) { return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceAmigoProfilingFeaturesSEC`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceAmigoProfilingFeaturesSEC`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `amigoProfiling` at the given index}
        /// @param index the index of the struct buffer
        public int amigoProfilingAt(long index) { return amigoProfiling(this.segment(), index); }
        /// Sets `amigoProfiling` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer amigoProfilingAt(long index, int value) { amigoProfiling(this.segment(), index, value); return this; }

    }
}
