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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkExternalImageFormatProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkExternalMemoryProperties) VkExternalMemoryProperties externalMemoryProperties;
/// };
/// ```
public final class VkExternalImageFormatProperties extends GroupType {
    /// The struct layout of `VkExternalImageFormatProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExternalMemoryProperties.LAYOUT.withName("externalMemoryProperties")
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
    /// The byte offset of `externalMemoryProperties`.
    public static final long OFFSET_externalMemoryProperties = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryProperties"));
    /// The memory layout of `externalMemoryProperties`.
    public static final MemoryLayout LAYOUT_externalMemoryProperties = LAYOUT.select(PathElement.groupElement("externalMemoryProperties"));

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalImageFormatProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalImageFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalImageFormatProperties`
    public static VkExternalImageFormatProperties alloc(SegmentAllocator allocator) { return new VkExternalImageFormatProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalImageFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalImageFormatProperties`
    public static VkExternalImageFormatProperties alloc(SegmentAllocator allocator, long count) { return new VkExternalImageFormatProperties(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExternalImageFormatProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param externalMemoryProperties `externalMemoryProperties`
    /// @return the allocated `VkExternalImageFormatProperties`
    public static VkExternalImageFormatProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment externalMemoryProperties) {
        return alloc(allocator).sType(sType).pNext(pNext).externalMemoryProperties(externalMemoryProperties);
    }

    /// Allocates a `VkExternalImageFormatProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkExternalImageFormatProperties`
    public static VkExternalImageFormatProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkExternalImageFormatProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkExternalImageFormatProperties`
    public static VkExternalImageFormatProperties allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalImageFormatProperties copyFrom(VkExternalImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalImageFormatProperties reinterpret(long count) { return new VkExternalImageFormatProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExternalImageFormatProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExternalImageFormatProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `externalMemoryProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment externalMemoryProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_externalMemoryProperties, index), LAYOUT_externalMemoryProperties); }
    /// {@return `externalMemoryProperties`}
    public MemorySegment externalMemoryProperties() { return externalMemoryProperties(this.segment(), 0L); }
    /// Sets `externalMemoryProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalMemoryProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_externalMemoryProperties, index), LAYOUT_externalMemoryProperties.byteSize()); }
    /// Sets `externalMemoryProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatProperties externalMemoryProperties(MemorySegment value) { externalMemoryProperties(this.segment(), 0L, value); return this; }
    /// Accepts `externalMemoryProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkExternalImageFormatProperties externalMemoryProperties(Consumer<overrungl.vulkan.struct.VkExternalMemoryProperties> func) { func.accept(overrungl.vulkan.struct.VkExternalMemoryProperties.of(externalMemoryProperties())); return this; }

    /// Creates a slice of `VkExternalImageFormatProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalImageFormatProperties`
    public VkExternalImageFormatProperties asSlice(long index) { return new VkExternalImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalImageFormatProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalImageFormatProperties`
    public VkExternalImageFormatProperties asSlice(long index, long count) { return new VkExternalImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalImageFormatProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalImageFormatProperties at(long index, Consumer<VkExternalImageFormatProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `externalMemoryProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment externalMemoryPropertiesAt(long index) { return externalMemoryProperties(this.segment(), index); }
    /// Sets `externalMemoryProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatProperties externalMemoryPropertiesAt(long index, MemorySegment value) { externalMemoryProperties(this.segment(), index, value); return this; }
    /// Accepts `externalMemoryProperties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkExternalImageFormatProperties externalMemoryPropertiesAt(long index, Consumer<overrungl.vulkan.struct.VkExternalMemoryProperties> func) { func.accept(overrungl.vulkan.struct.VkExternalMemoryProperties.of(externalMemoryPropertiesAt(index))); return this; }

}
