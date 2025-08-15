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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassSampleLocationsBeginInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassSampleLocationsBeginInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentInitialSampleLocationsCount;
///     const VkAttachmentSampleLocationsEXT* pAttachmentInitialSampleLocations;
///     uint32_t postSubpassSampleLocationsCount;
///     const VkSubpassSampleLocationsEXT* pPostSubpassSampleLocations;
/// };
/// ```
public final class VkRenderPassSampleLocationsBeginInfoEXT extends GroupType {
    /// The struct layout of `VkRenderPassSampleLocationsBeginInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentInitialSampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pAttachmentInitialSampleLocations"),
        ValueLayout.JAVA_INT.withName("postSubpassSampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pPostSubpassSampleLocations")
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
    /// The byte offset of `attachmentInitialSampleLocationsCount`.
    public static final long OFFSET_attachmentInitialSampleLocationsCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
    /// The memory layout of `attachmentInitialSampleLocationsCount`.
    public static final MemoryLayout LAYOUT_attachmentInitialSampleLocationsCount = LAYOUT.select(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
    /// The [VarHandle] of `attachmentInitialSampleLocationsCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentInitialSampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
    /// The byte offset of `pAttachmentInitialSampleLocations`.
    public static final long OFFSET_pAttachmentInitialSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("pAttachmentInitialSampleLocations"));
    /// The memory layout of `pAttachmentInitialSampleLocations`.
    public static final MemoryLayout LAYOUT_pAttachmentInitialSampleLocations = LAYOUT.select(PathElement.groupElement("pAttachmentInitialSampleLocations"));
    /// The [VarHandle] of `pAttachmentInitialSampleLocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachmentInitialSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachmentInitialSampleLocations"));
    /// The byte offset of `postSubpassSampleLocationsCount`.
    public static final long OFFSET_postSubpassSampleLocationsCount = LAYOUT.byteOffset(PathElement.groupElement("postSubpassSampleLocationsCount"));
    /// The memory layout of `postSubpassSampleLocationsCount`.
    public static final MemoryLayout LAYOUT_postSubpassSampleLocationsCount = LAYOUT.select(PathElement.groupElement("postSubpassSampleLocationsCount"));
    /// The [VarHandle] of `postSubpassSampleLocationsCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_postSubpassSampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("postSubpassSampleLocationsCount"));
    /// The byte offset of `pPostSubpassSampleLocations`.
    public static final long OFFSET_pPostSubpassSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("pPostSubpassSampleLocations"));
    /// The memory layout of `pPostSubpassSampleLocations`.
    public static final MemoryLayout LAYOUT_pPostSubpassSampleLocations = LAYOUT.select(PathElement.groupElement("pPostSubpassSampleLocations"));
    /// The [VarHandle] of `pPostSubpassSampleLocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPostSubpassSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPostSubpassSampleLocations"));

    /// Creates `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassSampleLocationsBeginInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSampleLocationsBeginInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSampleLocationsBeginInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSampleLocationsBeginInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassSampleLocationsBeginInfoEXT`
    public static VkRenderPassSampleLocationsBeginInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassSampleLocationsBeginInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassSampleLocationsBeginInfoEXT`
    public static VkRenderPassSampleLocationsBeginInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassSampleLocationsBeginInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT copyFrom(VkRenderPassSampleLocationsBeginInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassSampleLocationsBeginInfoEXT reinterpret(long count) { return new VkRenderPassSampleLocationsBeginInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderPassSampleLocationsBeginInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassSampleLocationsBeginInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `attachmentInitialSampleLocationsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentInitialSampleLocationsCount(MemorySegment segment, long index) { return (int) VH_attachmentInitialSampleLocationsCount.get(segment, 0L, index); }
    /// {@return `attachmentInitialSampleLocationsCount`}
    public int attachmentInitialSampleLocationsCount() { return attachmentInitialSampleLocationsCount(this.segment(), 0L); }
    /// Sets `attachmentInitialSampleLocationsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentInitialSampleLocationsCount(MemorySegment segment, long index, int value) { VH_attachmentInitialSampleLocationsCount.set(segment, 0L, index, value); }
    /// Sets `attachmentInitialSampleLocationsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT attachmentInitialSampleLocationsCount(int value) { attachmentInitialSampleLocationsCount(this.segment(), 0L, value); return this; }

    /// {@return `pAttachmentInitialSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttachmentInitialSampleLocations(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachmentInitialSampleLocations.get(segment, 0L, index); }
    /// {@return `pAttachmentInitialSampleLocations`}
    public MemorySegment pAttachmentInitialSampleLocations() { return pAttachmentInitialSampleLocations(this.segment(), 0L); }
    /// Sets `pAttachmentInitialSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttachmentInitialSampleLocations(MemorySegment segment, long index, MemorySegment value) { VH_pAttachmentInitialSampleLocations.set(segment, 0L, index, value); }
    /// Sets `pAttachmentInitialSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocations(MemorySegment value) { pAttachmentInitialSampleLocations(this.segment(), 0L, value); return this; }

    /// {@return `postSubpassSampleLocationsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int postSubpassSampleLocationsCount(MemorySegment segment, long index) { return (int) VH_postSubpassSampleLocationsCount.get(segment, 0L, index); }
    /// {@return `postSubpassSampleLocationsCount`}
    public int postSubpassSampleLocationsCount() { return postSubpassSampleLocationsCount(this.segment(), 0L); }
    /// Sets `postSubpassSampleLocationsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void postSubpassSampleLocationsCount(MemorySegment segment, long index, int value) { VH_postSubpassSampleLocationsCount.set(segment, 0L, index, value); }
    /// Sets `postSubpassSampleLocationsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT postSubpassSampleLocationsCount(int value) { postSubpassSampleLocationsCount(this.segment(), 0L, value); return this; }

    /// {@return `pPostSubpassSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPostSubpassSampleLocations(MemorySegment segment, long index) { return (MemorySegment) VH_pPostSubpassSampleLocations.get(segment, 0L, index); }
    /// {@return `pPostSubpassSampleLocations`}
    public MemorySegment pPostSubpassSampleLocations() { return pPostSubpassSampleLocations(this.segment(), 0L); }
    /// Sets `pPostSubpassSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPostSubpassSampleLocations(MemorySegment segment, long index, MemorySegment value) { VH_pPostSubpassSampleLocations.set(segment, 0L, index, value); }
    /// Sets `pPostSubpassSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocations(MemorySegment value) { pPostSubpassSampleLocations(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassSampleLocationsBeginInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassSampleLocationsBeginInfoEXT`
    public VkRenderPassSampleLocationsBeginInfoEXT asSlice(long index) { return new VkRenderPassSampleLocationsBeginInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassSampleLocationsBeginInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassSampleLocationsBeginInfoEXT`
    public VkRenderPassSampleLocationsBeginInfoEXT asSlice(long index, long count) { return new VkRenderPassSampleLocationsBeginInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassSampleLocationsBeginInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT at(long index, Consumer<VkRenderPassSampleLocationsBeginInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `attachmentInitialSampleLocationsCount` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentInitialSampleLocationsCountAt(long index) { return attachmentInitialSampleLocationsCount(this.segment(), index); }
    /// Sets `attachmentInitialSampleLocationsCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT attachmentInitialSampleLocationsCountAt(long index, int value) { attachmentInitialSampleLocationsCount(this.segment(), index, value); return this; }

    /// {@return `pAttachmentInitialSampleLocations` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAttachmentInitialSampleLocationsAt(long index) { return pAttachmentInitialSampleLocations(this.segment(), index); }
    /// Sets `pAttachmentInitialSampleLocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocationsAt(long index, MemorySegment value) { pAttachmentInitialSampleLocations(this.segment(), index, value); return this; }

    /// {@return `postSubpassSampleLocationsCount` at the given index}
    /// @param index the index of the struct buffer
    public int postSubpassSampleLocationsCountAt(long index) { return postSubpassSampleLocationsCount(this.segment(), index); }
    /// Sets `postSubpassSampleLocationsCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT postSubpassSampleLocationsCountAt(long index, int value) { postSubpassSampleLocationsCount(this.segment(), index, value); return this; }

    /// {@return `pPostSubpassSampleLocations` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPostSubpassSampleLocationsAt(long index) { return pPostSubpassSampleLocations(this.segment(), index); }
    /// Sets `pPostSubpassSampleLocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocationsAt(long index, MemorySegment value) { pPostSubpassSampleLocations(this.segment(), index, value); return this; }

}
