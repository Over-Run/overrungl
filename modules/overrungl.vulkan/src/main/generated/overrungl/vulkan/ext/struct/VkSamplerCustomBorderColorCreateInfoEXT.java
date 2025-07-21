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
/// struct VkSamplerCustomBorderColorCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (union VkClearColorValue) VkClearColorValue customBorderColor;
///     (int) VkFormat format;
/// };
/// ```
public final class VkSamplerCustomBorderColorCreateInfoEXT extends GroupType {
    /// The struct layout of `VkSamplerCustomBorderColorCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.union.VkClearColorValue.LAYOUT.withName("customBorderColor"),
        ValueLayout.JAVA_INT.withName("format")
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
    /// The byte offset of `customBorderColor`.
    public static final long OFFSET_customBorderColor = LAYOUT.byteOffset(PathElement.groupElement("customBorderColor"));
    /// The memory layout of `customBorderColor`.
    public static final MemoryLayout LAYOUT_customBorderColor = LAYOUT.select(PathElement.groupElement("customBorderColor"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerCustomBorderColorCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCustomBorderColorCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCustomBorderColorCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCustomBorderColorCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCustomBorderColorCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCustomBorderColorCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCustomBorderColorCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static VkSamplerCustomBorderColorCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerCustomBorderColorCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static VkSamplerCustomBorderColorCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSamplerCustomBorderColorCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param customBorderColor `customBorderColor`
    /// @param format `format`
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static VkSamplerCustomBorderColorCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment customBorderColor, int format) {
        return alloc(allocator).sType(sType).pNext(pNext).customBorderColor(customBorderColor).format(format);
    }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param customBorderColor `customBorderColor`
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static VkSamplerCustomBorderColorCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment customBorderColor) {
        return alloc(allocator).sType(sType).pNext(pNext).customBorderColor(customBorderColor);
    }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static VkSamplerCustomBorderColorCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSamplerCustomBorderColorCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSamplerCustomBorderColorCreateInfoEXT`
    public static VkSamplerCustomBorderColorCreateInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT copyFrom(VkSamplerCustomBorderColorCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerCustomBorderColorCreateInfoEXT reinterpret(long count) { return new VkSamplerCustomBorderColorCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerCustomBorderColorCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerCustomBorderColorCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `customBorderColor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment customBorderColor(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_customBorderColor, index), LAYOUT_customBorderColor); }
    /// {@return `customBorderColor`}
    public MemorySegment customBorderColor() { return customBorderColor(this.segment(), 0L); }
    /// Sets `customBorderColor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void customBorderColor(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_customBorderColor, index), LAYOUT_customBorderColor.byteSize()); }
    /// Sets `customBorderColor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(MemorySegment value) { customBorderColor(this.segment(), 0L, value); return this; }
    /// Accepts `customBorderColor` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(Consumer<overrungl.vulkan.union.VkClearColorValue> func) { func.accept(overrungl.vulkan.union.VkClearColorValue.of(customBorderColor())); return this; }

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
    public VkSamplerCustomBorderColorCreateInfoEXT format(int value) { format(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerCustomBorderColorCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerCustomBorderColorCreateInfoEXT`
    public VkSamplerCustomBorderColorCreateInfoEXT asSlice(long index) { return new VkSamplerCustomBorderColorCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerCustomBorderColorCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerCustomBorderColorCreateInfoEXT`
    public VkSamplerCustomBorderColorCreateInfoEXT asSlice(long index, long count) { return new VkSamplerCustomBorderColorCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerCustomBorderColorCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT at(long index, Consumer<VkSamplerCustomBorderColorCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `customBorderColor` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment customBorderColorAt(long index) { return customBorderColor(this.segment(), index); }
    /// Sets `customBorderColor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColorAt(long index, MemorySegment value) { customBorderColor(this.segment(), index, value); return this; }
    /// Accepts `customBorderColor` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColorAt(long index, Consumer<overrungl.vulkan.union.VkClearColorValue> func) { func.accept(overrungl.vulkan.union.VkClearColorValue.of(customBorderColorAt(index))); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCustomBorderColorCreateInfoEXT formatAt(long index, int value) { format(this.segment(), index, value); return this; }

}
