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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDisplayModeStereoPropertiesNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 hdmi3DSupported;
/// };
/// ```
public final class VkDisplayModeStereoPropertiesNV extends GroupType {
    /// The struct layout of `VkDisplayModeStereoPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hdmi3DSupported")
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
    /// The byte offset of `hdmi3DSupported`.
    public static final long OFFSET_hdmi3DSupported = LAYOUT.byteOffset(PathElement.groupElement("hdmi3DSupported"));
    /// The memory layout of `hdmi3DSupported`.
    public static final MemoryLayout LAYOUT_hdmi3DSupported = LAYOUT.select(PathElement.groupElement("hdmi3DSupported"));
    /// The [VarHandle] of `hdmi3DSupported` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hdmi3DSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hdmi3DSupported"));

    /// Creates `VkDisplayModeStereoPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDisplayModeStereoPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDisplayModeStereoPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeStereoPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeStereoPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayModeStereoPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeStereoPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeStereoPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDisplayModeStereoPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeStereoPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeStereoPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayModeStereoPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModeStereoPropertiesNV`
    public static VkDisplayModeStereoPropertiesNV alloc(SegmentAllocator allocator) { return new VkDisplayModeStereoPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDisplayModeStereoPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModeStereoPropertiesNV`
    public static VkDisplayModeStereoPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkDisplayModeStereoPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayModeStereoPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param hdmi3DSupported `hdmi3DSupported`
    /// @return the allocated `VkDisplayModeStereoPropertiesNV`
    public static VkDisplayModeStereoPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int hdmi3DSupported) {
        return alloc(allocator).sType(sType).pNext(pNext).hdmi3DSupported(hdmi3DSupported);
    }

    /// Allocates a `VkDisplayModeStereoPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDisplayModeStereoPropertiesNV`
    public static VkDisplayModeStereoPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDisplayModeStereoPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDisplayModeStereoPropertiesNV`
    public static VkDisplayModeStereoPropertiesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayModeStereoPropertiesNV copyFrom(VkDisplayModeStereoPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDisplayModeStereoPropertiesNV reinterpret(long count) { return new VkDisplayModeStereoPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDisplayModeStereoPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDisplayModeStereoPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `hdmi3DSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hdmi3DSupported(MemorySegment segment, long index) { return (int) VH_hdmi3DSupported.get(segment, 0L, index); }
    /// {@return `hdmi3DSupported`}
    public int hdmi3DSupported() { return hdmi3DSupported(this.segment(), 0L); }
    /// Sets `hdmi3DSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hdmi3DSupported(MemorySegment segment, long index, int value) { VH_hdmi3DSupported.set(segment, 0L, index, value); }
    /// Sets `hdmi3DSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeStereoPropertiesNV hdmi3DSupported(int value) { hdmi3DSupported(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDisplayModeStereoPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayModeStereoPropertiesNV`
    public VkDisplayModeStereoPropertiesNV asSlice(long index) { return new VkDisplayModeStereoPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDisplayModeStereoPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayModeStereoPropertiesNV`
    public VkDisplayModeStereoPropertiesNV asSlice(long index, long count) { return new VkDisplayModeStereoPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDisplayModeStereoPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDisplayModeStereoPropertiesNV at(long index, Consumer<VkDisplayModeStereoPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayModeStereoPropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayModeStereoPropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `hdmi3DSupported` at the given index}
    /// @param index the index of the struct buffer
    public int hdmi3DSupportedAt(long index) { return hdmi3DSupported(this.segment(), index); }
    /// Sets `hdmi3DSupported` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayModeStereoPropertiesNV hdmi3DSupportedAt(long index, int value) { hdmi3DSupported(this.segment(), index, value); return this; }

}
