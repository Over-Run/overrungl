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
/// struct VkDescriptorSetLayoutBindingFlagsCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t bindingCount;
///     const VkDescriptorBindingFlags* pBindingFlags;
/// };
/// ```
public final class VkDescriptorSetLayoutBindingFlagsCreateInfoEXT extends GroupType {
    /// The struct layout of `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withName("pBindingFlags")
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
    /// The byte offset of `bindingCount`.
    public static final long OFFSET_bindingCount = LAYOUT.byteOffset(PathElement.groupElement("bindingCount"));
    /// The memory layout of `bindingCount`.
    public static final MemoryLayout LAYOUT_bindingCount = LAYOUT.select(PathElement.groupElement("bindingCount"));
    /// The [VarHandle] of `bindingCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bindingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindingCount"));
    /// The byte offset of `pBindingFlags`.
    public static final long OFFSET_pBindingFlags = LAYOUT.byteOffset(PathElement.groupElement("pBindingFlags"));
    /// The memory layout of `pBindingFlags`.
    public static final MemoryLayout LAYOUT_pBindingFlags = LAYOUT.select(PathElement.groupElement("pBindingFlags"));
    /// The [VarHandle] of `pBindingFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBindingFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBindingFlags"));

    /// Creates `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT`
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT copyFrom(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT reinterpret(long count) { return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `bindingCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bindingCount(MemorySegment segment, long index) { return (int) VH_bindingCount.get(segment, 0L, index); }
    /// {@return `bindingCount`}
    public int bindingCount() { return bindingCount(this.segment(), 0L); }
    /// Sets `bindingCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bindingCount(MemorySegment segment, long index, int value) { VH_bindingCount.set(segment, 0L, index, value); }
    /// Sets `bindingCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT bindingCount(int value) { bindingCount(this.segment(), 0L, value); return this; }

    /// {@return `pBindingFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBindingFlags(MemorySegment segment, long index) { return (MemorySegment) VH_pBindingFlags.get(segment, 0L, index); }
    /// {@return `pBindingFlags`}
    public MemorySegment pBindingFlags() { return pBindingFlags(this.segment(), 0L); }
    /// Sets `pBindingFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBindingFlags(MemorySegment segment, long index, MemorySegment value) { VH_pBindingFlags.set(segment, 0L, index, value); }
    /// Sets `pBindingFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pBindingFlags(MemorySegment value) { pBindingFlags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT asSlice(long index) { return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT asSlice(long index, long count) { return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorSetLayoutBindingFlagsCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT at(long index, Consumer<VkDescriptorSetLayoutBindingFlagsCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `bindingCount` at the given index}
    /// @param index the index of the struct buffer
    public int bindingCountAt(long index) { return bindingCount(this.segment(), index); }
    /// Sets `bindingCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT bindingCountAt(long index, int value) { bindingCount(this.segment(), index, value); return this; }

    /// {@return `pBindingFlags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pBindingFlagsAt(long index) { return pBindingFlags(this.segment(), index); }
    /// Sets `pBindingFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pBindingFlagsAt(long index, MemorySegment value) { pBindingFlags(this.segment(), index, value); return this; }

}
