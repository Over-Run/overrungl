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
/// struct VkPipelineColorBlendAdvancedStateCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 srcPremultiplied;
///     (uint32_t) VkBool32 dstPremultiplied;
///     (int) VkBlendOverlapEXT blendOverlap;
/// };
/// ```
public final class VkPipelineColorBlendAdvancedStateCreateInfoEXT extends GroupType {
    /// The struct layout of `VkPipelineColorBlendAdvancedStateCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap")
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
    /// The byte offset of `srcPremultiplied`.
    public static final long OFFSET_srcPremultiplied = LAYOUT.byteOffset(PathElement.groupElement("srcPremultiplied"));
    /// The memory layout of `srcPremultiplied`.
    public static final MemoryLayout LAYOUT_srcPremultiplied = LAYOUT.select(PathElement.groupElement("srcPremultiplied"));
    /// The [VarHandle] of `srcPremultiplied` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPremultiplied"));
    /// The byte offset of `dstPremultiplied`.
    public static final long OFFSET_dstPremultiplied = LAYOUT.byteOffset(PathElement.groupElement("dstPremultiplied"));
    /// The memory layout of `dstPremultiplied`.
    public static final MemoryLayout LAYOUT_dstPremultiplied = LAYOUT.select(PathElement.groupElement("dstPremultiplied"));
    /// The [VarHandle] of `dstPremultiplied` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPremultiplied"));
    /// The byte offset of `blendOverlap`.
    public static final long OFFSET_blendOverlap = LAYOUT.byteOffset(PathElement.groupElement("blendOverlap"));
    /// The memory layout of `blendOverlap`.
    public static final MemoryLayout LAYOUT_blendOverlap = LAYOUT.select(PathElement.groupElement("blendOverlap"));
    /// The [VarHandle] of `blendOverlap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blendOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendOverlap"));

    /// Creates `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcPremultiplied `srcPremultiplied`
    /// @param dstPremultiplied `dstPremultiplied`
    /// @param blendOverlap `blendOverlap`
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int srcPremultiplied, int dstPremultiplied, int blendOverlap) {
        return alloc(allocator).sType(sType).pNext(pNext).srcPremultiplied(srcPremultiplied).dstPremultiplied(dstPremultiplied).blendOverlap(blendOverlap);
    }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcPremultiplied `srcPremultiplied`
    /// @param dstPremultiplied `dstPremultiplied`
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int srcPremultiplied, int dstPremultiplied) {
        return alloc(allocator).sType(sType).pNext(pNext).srcPremultiplied(srcPremultiplied).dstPremultiplied(dstPremultiplied);
    }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcPremultiplied `srcPremultiplied`
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int srcPremultiplied) {
        return alloc(allocator).sType(sType).pNext(pNext).srcPremultiplied(srcPremultiplied);
    }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT copyFrom(VkPipelineColorBlendAdvancedStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT reinterpret(long count) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcPremultiplied` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcPremultiplied(MemorySegment segment, long index) { return (int) VH_srcPremultiplied.get(segment, 0L, index); }
    /// {@return `srcPremultiplied`}
    public int srcPremultiplied() { return srcPremultiplied(this.segment(), 0L); }
    /// Sets `srcPremultiplied` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcPremultiplied(MemorySegment segment, long index, int value) { VH_srcPremultiplied.set(segment, 0L, index, value); }
    /// Sets `srcPremultiplied` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultiplied(int value) { srcPremultiplied(this.segment(), 0L, value); return this; }

    /// {@return `dstPremultiplied` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstPremultiplied(MemorySegment segment, long index) { return (int) VH_dstPremultiplied.get(segment, 0L, index); }
    /// {@return `dstPremultiplied`}
    public int dstPremultiplied() { return dstPremultiplied(this.segment(), 0L); }
    /// Sets `dstPremultiplied` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstPremultiplied(MemorySegment segment, long index, int value) { VH_dstPremultiplied.set(segment, 0L, index, value); }
    /// Sets `dstPremultiplied` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultiplied(int value) { dstPremultiplied(this.segment(), 0L, value); return this; }

    /// {@return `blendOverlap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blendOverlap(MemorySegment segment, long index) { return (int) VH_blendOverlap.get(segment, 0L, index); }
    /// {@return `blendOverlap`}
    public int blendOverlap() { return blendOverlap(this.segment(), 0L); }
    /// Sets `blendOverlap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blendOverlap(MemorySegment segment, long index, int value) { VH_blendOverlap.set(segment, 0L, index, value); }
    /// Sets `blendOverlap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlap(int value) { blendOverlap(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineColorBlendAdvancedStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT asSlice(long index) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineColorBlendAdvancedStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineColorBlendAdvancedStateCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT at(long index, Consumer<VkPipelineColorBlendAdvancedStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcPremultiplied` at the given index}
    /// @param index the index of the struct buffer
    public int srcPremultipliedAt(long index) { return srcPremultiplied(this.segment(), index); }
    /// Sets `srcPremultiplied` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultipliedAt(long index, int value) { srcPremultiplied(this.segment(), index, value); return this; }

    /// {@return `dstPremultiplied` at the given index}
    /// @param index the index of the struct buffer
    public int dstPremultipliedAt(long index) { return dstPremultiplied(this.segment(), index); }
    /// Sets `dstPremultiplied` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultipliedAt(long index, int value) { dstPremultiplied(this.segment(), index, value); return this; }

    /// {@return `blendOverlap` at the given index}
    /// @param index the index of the struct buffer
    public int blendOverlapAt(long index) { return blendOverlap(this.segment(), index); }
    /// Sets `blendOverlap` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlapAt(long index, int value) { blendOverlap(this.segment(), index, value); return this; }

}
