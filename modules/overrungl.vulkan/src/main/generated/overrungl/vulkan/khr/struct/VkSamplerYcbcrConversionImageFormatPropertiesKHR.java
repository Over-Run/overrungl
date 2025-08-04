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
/// struct VkSamplerYcbcrConversionImageFormatPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t combinedImageSamplerDescriptorCount;
/// };
/// ```
public final class VkSamplerYcbcrConversionImageFormatPropertiesKHR extends GroupType {
    /// The struct layout of `VkSamplerYcbcrConversionImageFormatPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("combinedImageSamplerDescriptorCount")
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
    /// The byte offset of `combinedImageSamplerDescriptorCount`.
    public static final long OFFSET_combinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorCount"));
    /// The memory layout of `combinedImageSamplerDescriptorCount`.
    public static final MemoryLayout LAYOUT_combinedImageSamplerDescriptorCount = LAYOUT.select(PathElement.groupElement("combinedImageSamplerDescriptorCount"));
    /// The [VarHandle] of `combinedImageSamplerDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_combinedImageSamplerDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorCount"));

    /// Creates `VkSamplerYcbcrConversionImageFormatPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerYcbcrConversionImageFormatPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerYcbcrConversionImageFormatPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerYcbcrConversionImageFormatPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerYcbcrConversionImageFormatPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerYcbcrConversionImageFormatPropertiesKHR`
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerYcbcrConversionImageFormatPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerYcbcrConversionImageFormatPropertiesKHR`
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR copyFrom(VkSamplerYcbcrConversionImageFormatPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR reinterpret(long count) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `combinedImageSamplerDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int combinedImageSamplerDescriptorCount(MemorySegment segment, long index) { return (int) VH_combinedImageSamplerDescriptorCount.get(segment, 0L, index); }
    /// {@return `combinedImageSamplerDescriptorCount`}
    public int combinedImageSamplerDescriptorCount() { return combinedImageSamplerDescriptorCount(this.segment(), 0L); }
    /// Sets `combinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void combinedImageSamplerDescriptorCount(MemorySegment segment, long index, int value) { VH_combinedImageSamplerDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `combinedImageSamplerDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR combinedImageSamplerDescriptorCount(int value) { combinedImageSamplerDescriptorCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerYcbcrConversionImageFormatPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerYcbcrConversionImageFormatPropertiesKHR`
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR asSlice(long index) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerYcbcrConversionImageFormatPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerYcbcrConversionImageFormatPropertiesKHR`
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR asSlice(long index, long count) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerYcbcrConversionImageFormatPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR at(long index, Consumer<VkSamplerYcbcrConversionImageFormatPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `combinedImageSamplerDescriptorCount` at the given index}
    /// @param index the index of the struct buffer
    public int combinedImageSamplerDescriptorCountAt(long index) { return combinedImageSamplerDescriptorCount(this.segment(), index); }
    /// Sets `combinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR combinedImageSamplerDescriptorCountAt(long index, int value) { combinedImageSamplerDescriptorCount(this.segment(), index, value); return this; }

}
