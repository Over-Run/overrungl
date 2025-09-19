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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageFormatProperties2KHR`.
/// ## Layout
/// ```
/// struct VkImageFormatProperties2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkImageFormatProperties) VkImageFormatProperties imageFormatProperties;
/// };
/// ```
public final class VkImageFormatProperties2KHR extends GroupType {
    /// The struct layout of `VkImageFormatProperties2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageFormatProperties.LAYOUT.withName("imageFormatProperties")
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
    /// The byte offset of `imageFormatProperties`.
    public static final long OFFSET_imageFormatProperties = LAYOUT.byteOffset(PathElement.groupElement("imageFormatProperties"));
    /// The memory layout of `imageFormatProperties`.
    public static final MemoryLayout LAYOUT_imageFormatProperties = LAYOUT.select(PathElement.groupElement("imageFormatProperties"));

    /// Creates `VkImageFormatProperties2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageFormatProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageFormatProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageFormatProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageFormatProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageFormatProperties2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatProperties2KHR`
    public static VkImageFormatProperties2KHR alloc(SegmentAllocator allocator) { return new VkImageFormatProperties2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageFormatProperties2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageFormatProperties2KHR`
    public static VkImageFormatProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkImageFormatProperties2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageFormatProperties2KHR copyFrom(VkImageFormatProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageFormatProperties2KHR reinterpret(long count) { return new VkImageFormatProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageFormatProperties2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageFormatProperties2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageFormatProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageFormatProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageFormatProperties, index), LAYOUT_imageFormatProperties); }
    /// {@return `imageFormatProperties`}
    public MemorySegment imageFormatProperties() { return imageFormatProperties(this.segment(), 0L); }
    /// Sets `imageFormatProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageFormatProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageFormatProperties, index), LAYOUT_imageFormatProperties.byteSize()); }
    /// Sets `imageFormatProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties2KHR imageFormatProperties(MemorySegment value) { imageFormatProperties(this.segment(), 0L, value); return this; }
    /// Accepts `imageFormatProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageFormatProperties2KHR imageFormatProperties(Consumer<overrungl.vulkan.struct.VkImageFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkImageFormatProperties.of(imageFormatProperties())); return this; }

    /// Creates a slice of `VkImageFormatProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageFormatProperties2KHR`
    public VkImageFormatProperties2KHR asSlice(long index) { return new VkImageFormatProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageFormatProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageFormatProperties2KHR`
    public VkImageFormatProperties2KHR asSlice(long index, long count) { return new VkImageFormatProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageFormatProperties2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageFormatProperties2KHR at(long index, Consumer<VkImageFormatProperties2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageFormatProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageFormatPropertiesAt(long index) { return imageFormatProperties(this.segment(), index); }
    /// Sets `imageFormatProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties2KHR imageFormatPropertiesAt(long index, MemorySegment value) { imageFormatProperties(this.segment(), index, value); return this; }
    /// Accepts `imageFormatProperties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageFormatProperties2KHR imageFormatPropertiesAt(long index, Consumer<overrungl.vulkan.struct.VkImageFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkImageFormatProperties.of(imageFormatPropertiesAt(index))); return this; }

}
