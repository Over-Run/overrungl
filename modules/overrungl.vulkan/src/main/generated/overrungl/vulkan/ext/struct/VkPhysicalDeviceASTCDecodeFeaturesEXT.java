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
/// struct VkPhysicalDeviceASTCDecodeFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 decodeModeSharedExponent;
/// };
/// ```
public final class VkPhysicalDeviceASTCDecodeFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceASTCDecodeFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("decodeModeSharedExponent")
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
    /// The byte offset of `decodeModeSharedExponent`.
    public static final long OFFSET_decodeModeSharedExponent = LAYOUT.byteOffset(PathElement.groupElement("decodeModeSharedExponent"));
    /// The memory layout of `decodeModeSharedExponent`.
    public static final MemoryLayout LAYOUT_decodeModeSharedExponent = LAYOUT.select(PathElement.groupElement("decodeModeSharedExponent"));
    /// The [VarHandle] of `decodeModeSharedExponent` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_decodeModeSharedExponent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decodeModeSharedExponent"));

    /// Creates `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceASTCDecodeFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param decodeModeSharedExponent `decodeModeSharedExponent`
    /// @return the allocated `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int decodeModeSharedExponent) {
        return alloc(allocator).sType(sType).pNext(pNext).decodeModeSharedExponent(decodeModeSharedExponent);
    }

    /// Allocates a `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceASTCDecodeFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT copyFrom(VkPhysicalDeviceASTCDecodeFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceASTCDecodeFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceASTCDecodeFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceASTCDecodeFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `decodeModeSharedExponent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int decodeModeSharedExponent(MemorySegment segment, long index) { return (int) VH_decodeModeSharedExponent.get(segment, 0L, index); }
    /// {@return `decodeModeSharedExponent`}
    public int decodeModeSharedExponent() { return decodeModeSharedExponent(this.segment(), 0L); }
    /// Sets `decodeModeSharedExponent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void decodeModeSharedExponent(MemorySegment segment, long index, int value) { VH_decodeModeSharedExponent.set(segment, 0L, index, value); }
    /// Sets `decodeModeSharedExponent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT decodeModeSharedExponent(int value) { decodeModeSharedExponent(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceASTCDecodeFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceASTCDecodeFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceASTCDecodeFeaturesEXT`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceASTCDecodeFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT at(long index, Consumer<VkPhysicalDeviceASTCDecodeFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `decodeModeSharedExponent` at the given index}
    /// @param index the index of the struct buffer
    public int decodeModeSharedExponentAt(long index) { return decodeModeSharedExponent(this.segment(), index); }
    /// Sets `decodeModeSharedExponent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceASTCDecodeFeaturesEXT decodeModeSharedExponentAt(long index, int value) { decodeModeSharedExponent(this.segment(), index, value); return this; }

}
