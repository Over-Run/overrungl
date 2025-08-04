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
/// struct VkRenderPassInputAttachmentAspectCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t aspectReferenceCount;
///     const VkInputAttachmentAspectReference* pAspectReferences;
/// };
/// ```
public final class VkRenderPassInputAttachmentAspectCreateInfoKHR extends GroupType {
    /// The struct layout of `VkRenderPassInputAttachmentAspectCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("aspectReferenceCount"),
        ValueLayout.ADDRESS.withName("pAspectReferences")
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
    /// The byte offset of `aspectReferenceCount`.
    public static final long OFFSET_aspectReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("aspectReferenceCount"));
    /// The memory layout of `aspectReferenceCount`.
    public static final MemoryLayout LAYOUT_aspectReferenceCount = LAYOUT.select(PathElement.groupElement("aspectReferenceCount"));
    /// The [VarHandle] of `aspectReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspectReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectReferenceCount"));
    /// The byte offset of `pAspectReferences`.
    public static final long OFFSET_pAspectReferences = LAYOUT.byteOffset(PathElement.groupElement("pAspectReferences"));
    /// The memory layout of `pAspectReferences`.
    public static final MemoryLayout LAYOUT_pAspectReferences = LAYOUT.select(PathElement.groupElement("pAspectReferences"));
    /// The [VarHandle] of `pAspectReferences` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAspectReferences = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAspectReferences"));

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassInputAttachmentAspectCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassInputAttachmentAspectCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassInputAttachmentAspectCreateInfoKHR`
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassInputAttachmentAspectCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassInputAttachmentAspectCreateInfoKHR`
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR copyFrom(VkRenderPassInputAttachmentAspectCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassInputAttachmentAspectCreateInfoKHR reinterpret(long count) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `aspectReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspectReferenceCount(MemorySegment segment, long index) { return (int) VH_aspectReferenceCount.get(segment, 0L, index); }
    /// {@return `aspectReferenceCount`}
    public int aspectReferenceCount() { return aspectReferenceCount(this.segment(), 0L); }
    /// Sets `aspectReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspectReferenceCount(MemorySegment segment, long index, int value) { VH_aspectReferenceCount.set(segment, 0L, index, value); }
    /// Sets `aspectReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR aspectReferenceCount(int value) { aspectReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `pAspectReferences` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAspectReferences(MemorySegment segment, long index) { return (MemorySegment) VH_pAspectReferences.get(segment, 0L, index); }
    /// {@return `pAspectReferences`}
    public MemorySegment pAspectReferences() { return pAspectReferences(this.segment(), 0L); }
    /// Sets `pAspectReferences` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAspectReferences(MemorySegment segment, long index, MemorySegment value) { VH_pAspectReferences.set(segment, 0L, index, value); }
    /// Sets `pAspectReferences` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pAspectReferences(MemorySegment value) { pAspectReferences(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassInputAttachmentAspectCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassInputAttachmentAspectCreateInfoKHR`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR asSlice(long index) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassInputAttachmentAspectCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassInputAttachmentAspectCreateInfoKHR`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR asSlice(long index, long count) { return new VkRenderPassInputAttachmentAspectCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassInputAttachmentAspectCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR at(long index, Consumer<VkRenderPassInputAttachmentAspectCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `aspectReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int aspectReferenceCountAt(long index) { return aspectReferenceCount(this.segment(), index); }
    /// Sets `aspectReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR aspectReferenceCountAt(long index, int value) { aspectReferenceCount(this.segment(), index, value); return this; }

    /// {@return `pAspectReferences` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAspectReferencesAt(long index) { return pAspectReferences(this.segment(), index); }
    /// Sets `pAspectReferences` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pAspectReferencesAt(long index, MemorySegment value) { pAspectReferences(this.segment(), index, value); return this; }

}
