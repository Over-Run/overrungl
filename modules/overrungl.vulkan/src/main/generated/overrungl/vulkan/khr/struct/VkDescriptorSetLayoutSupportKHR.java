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
/// struct VkDescriptorSetLayoutSupportKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 supported;
/// };
/// ```
public final class VkDescriptorSetLayoutSupportKHR extends GroupType {
    /// The struct layout of `VkDescriptorSetLayoutSupportKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supported")
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
    /// The byte offset of `supported`.
    public static final long OFFSET_supported = LAYOUT.byteOffset(PathElement.groupElement("supported"));
    /// The memory layout of `supported`.
    public static final MemoryLayout LAYOUT_supported = LAYOUT.select(PathElement.groupElement("supported"));
    /// The [VarHandle] of `supported` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supported"));

    /// Creates `VkDescriptorSetLayoutSupportKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDescriptorSetLayoutSupportKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorSetLayoutSupportKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutSupportKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutSupportKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetLayoutSupportKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutSupportKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutSupportKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorSetLayoutSupportKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutSupportKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutSupportKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorSetLayoutSupportKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutSupportKHR`
    public static VkDescriptorSetLayoutSupportKHR alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutSupportKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorSetLayoutSupportKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetLayoutSupportKHR`
    public static VkDescriptorSetLayoutSupportKHR alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutSupportKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorSetLayoutSupportKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supported `supported`
    /// @return the allocated `VkDescriptorSetLayoutSupportKHR`
    public static VkDescriptorSetLayoutSupportKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supported) {
        return alloc(allocator).sType(sType).pNext(pNext).supported(supported);
    }

    /// Allocates a `VkDescriptorSetLayoutSupportKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDescriptorSetLayoutSupportKHR`
    public static VkDescriptorSetLayoutSupportKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDescriptorSetLayoutSupportKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDescriptorSetLayoutSupportKHR`
    public static VkDescriptorSetLayoutSupportKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetLayoutSupportKHR copyFrom(VkDescriptorSetLayoutSupportKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorSetLayoutSupportKHR reinterpret(long count) { return new VkDescriptorSetLayoutSupportKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDescriptorSetLayoutSupportKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorSetLayoutSupportKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `supported` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supported(MemorySegment segment, long index) { return (int) VH_supported.get(segment, 0L, index); }
    /// {@return `supported`}
    public int supported() { return supported(this.segment(), 0L); }
    /// Sets `supported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supported(MemorySegment segment, long index, int value) { VH_supported.set(segment, 0L, index, value); }
    /// Sets `supported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutSupportKHR supported(int value) { supported(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorSetLayoutSupportKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorSetLayoutSupportKHR`
    public VkDescriptorSetLayoutSupportKHR asSlice(long index) { return new VkDescriptorSetLayoutSupportKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorSetLayoutSupportKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorSetLayoutSupportKHR`
    public VkDescriptorSetLayoutSupportKHR asSlice(long index, long count) { return new VkDescriptorSetLayoutSupportKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorSetLayoutSupportKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorSetLayoutSupportKHR at(long index, Consumer<VkDescriptorSetLayoutSupportKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutSupportKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutSupportKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `supported` at the given index}
    /// @param index the index of the struct buffer
    public int supportedAt(long index) { return supported(this.segment(), index); }
    /// Sets `supported` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutSupportKHR supportedAt(long index, int value) { supported(this.segment(), index, value); return this; }

}
