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
/// struct VkPhysicalDeviceMultiviewFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 multiview;
///     (uint32_t) VkBool32 multiviewGeometryShader;
///     (uint32_t) VkBool32 multiviewTessellationShader;
/// };
/// ```
public final class VkPhysicalDeviceMultiviewFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMultiviewFeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader")
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
    /// The byte offset of `multiview`.
    public static final long OFFSET_multiview = LAYOUT.byteOffset(PathElement.groupElement("multiview"));
    /// The memory layout of `multiview`.
    public static final MemoryLayout LAYOUT_multiview = LAYOUT.select(PathElement.groupElement("multiview"));
    /// The [VarHandle] of `multiview` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiview = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiview"));
    /// The byte offset of `multiviewGeometryShader`.
    public static final long OFFSET_multiviewGeometryShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewGeometryShader"));
    /// The memory layout of `multiviewGeometryShader`.
    public static final MemoryLayout LAYOUT_multiviewGeometryShader = LAYOUT.select(PathElement.groupElement("multiviewGeometryShader"));
    /// The [VarHandle] of `multiviewGeometryShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiviewGeometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewGeometryShader"));
    /// The byte offset of `multiviewTessellationShader`.
    public static final long OFFSET_multiviewTessellationShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewTessellationShader"));
    /// The memory layout of `multiviewTessellationShader`.
    public static final MemoryLayout LAYOUT_multiviewTessellationShader = LAYOUT.select(PathElement.groupElement("multiviewTessellationShader"));
    /// The [VarHandle] of `multiviewTessellationShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiviewTessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewTessellationShader"));

    /// Creates `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMultiviewFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewFeaturesKHR`
    public static VkPhysicalDeviceMultiviewFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMultiviewFeaturesKHR`
    public static VkPhysicalDeviceMultiviewFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param multiview `multiview`
    /// @param multiviewGeometryShader `multiviewGeometryShader`
    /// @param multiviewTessellationShader `multiviewTessellationShader`
    /// @return the allocated `VkPhysicalDeviceMultiviewFeaturesKHR`
    public static VkPhysicalDeviceMultiviewFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int multiview, int multiviewGeometryShader, int multiviewTessellationShader) {
        return alloc(allocator).sType(sType).pNext(pNext).multiview(multiview).multiviewGeometryShader(multiviewGeometryShader).multiviewTessellationShader(multiviewTessellationShader);
    }

    /// Allocates a `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param multiview `multiview`
    /// @param multiviewGeometryShader `multiviewGeometryShader`
    /// @return the allocated `VkPhysicalDeviceMultiviewFeaturesKHR`
    public static VkPhysicalDeviceMultiviewFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int multiview, int multiviewGeometryShader) {
        return alloc(allocator).sType(sType).pNext(pNext).multiview(multiview).multiviewGeometryShader(multiviewGeometryShader);
    }

    /// Allocates a `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param multiview `multiview`
    /// @return the allocated `VkPhysicalDeviceMultiviewFeaturesKHR`
    public static VkPhysicalDeviceMultiviewFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int multiview) {
        return alloc(allocator).sType(sType).pNext(pNext).multiview(multiview);
    }

    /// Allocates a `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceMultiviewFeaturesKHR`
    public static VkPhysicalDeviceMultiviewFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceMultiviewFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceMultiviewFeaturesKHR`
    public static VkPhysicalDeviceMultiviewFeaturesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR copyFrom(VkPhysicalDeviceMultiviewFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMultiviewFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceMultiviewFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMultiviewFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMultiviewFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `multiview` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiview(MemorySegment segment, long index) { return (int) VH_multiview.get(segment, 0L, index); }
    /// {@return `multiview`}
    public int multiview() { return multiview(this.segment(), 0L); }
    /// Sets `multiview` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiview(MemorySegment segment, long index, int value) { VH_multiview.set(segment, 0L, index, value); }
    /// Sets `multiview` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR multiview(int value) { multiview(this.segment(), 0L, value); return this; }

    /// {@return `multiviewGeometryShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiviewGeometryShader(MemorySegment segment, long index) { return (int) VH_multiviewGeometryShader.get(segment, 0L, index); }
    /// {@return `multiviewGeometryShader`}
    public int multiviewGeometryShader() { return multiviewGeometryShader(this.segment(), 0L); }
    /// Sets `multiviewGeometryShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiviewGeometryShader(MemorySegment segment, long index, int value) { VH_multiviewGeometryShader.set(segment, 0L, index, value); }
    /// Sets `multiviewGeometryShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewGeometryShader(int value) { multiviewGeometryShader(this.segment(), 0L, value); return this; }

    /// {@return `multiviewTessellationShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiviewTessellationShader(MemorySegment segment, long index) { return (int) VH_multiviewTessellationShader.get(segment, 0L, index); }
    /// {@return `multiviewTessellationShader`}
    public int multiviewTessellationShader() { return multiviewTessellationShader(this.segment(), 0L); }
    /// Sets `multiviewTessellationShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiviewTessellationShader(MemorySegment segment, long index, int value) { VH_multiviewTessellationShader.set(segment, 0L, index, value); }
    /// Sets `multiviewTessellationShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewTessellationShader(int value) { multiviewTessellationShader(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMultiviewFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMultiviewFeaturesKHR`
    public VkPhysicalDeviceMultiviewFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceMultiviewFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMultiviewFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMultiviewFeaturesKHR`
    public VkPhysicalDeviceMultiviewFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMultiviewFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR at(long index, Consumer<VkPhysicalDeviceMultiviewFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `multiview` at the given index}
    /// @param index the index of the struct buffer
    public int multiviewAt(long index) { return multiview(this.segment(), index); }
    /// Sets `multiview` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewAt(long index, int value) { multiview(this.segment(), index, value); return this; }

    /// {@return `multiviewGeometryShader` at the given index}
    /// @param index the index of the struct buffer
    public int multiviewGeometryShaderAt(long index) { return multiviewGeometryShader(this.segment(), index); }
    /// Sets `multiviewGeometryShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewGeometryShaderAt(long index, int value) { multiviewGeometryShader(this.segment(), index, value); return this; }

    /// {@return `multiviewTessellationShader` at the given index}
    /// @param index the index of the struct buffer
    public int multiviewTessellationShaderAt(long index) { return multiviewTessellationShader(this.segment(), index); }
    /// Sets `multiviewTessellationShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewTessellationShaderAt(long index, int value) { multiviewTessellationShader(this.segment(), index, value); return this; }

}
