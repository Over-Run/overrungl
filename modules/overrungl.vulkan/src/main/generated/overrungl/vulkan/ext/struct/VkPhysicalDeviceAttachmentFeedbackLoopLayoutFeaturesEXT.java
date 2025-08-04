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
/// struct VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 attachmentFeedbackLoopLayout;
/// };
/// ```
public final class VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentFeedbackLoopLayout")
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
    /// The byte offset of `attachmentFeedbackLoopLayout`.
    public static final long OFFSET_attachmentFeedbackLoopLayout = LAYOUT.byteOffset(PathElement.groupElement("attachmentFeedbackLoopLayout"));
    /// The memory layout of `attachmentFeedbackLoopLayout`.
    public static final MemoryLayout LAYOUT_attachmentFeedbackLoopLayout = LAYOUT.select(PathElement.groupElement("attachmentFeedbackLoopLayout"));
    /// The [VarHandle] of `attachmentFeedbackLoopLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentFeedbackLoopLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentFeedbackLoopLayout"));

    /// Creates `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT copyFrom(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `attachmentFeedbackLoopLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentFeedbackLoopLayout(MemorySegment segment, long index) { return (int) VH_attachmentFeedbackLoopLayout.get(segment, 0L, index); }
    /// {@return `attachmentFeedbackLoopLayout`}
    public int attachmentFeedbackLoopLayout() { return attachmentFeedbackLoopLayout(this.segment(), 0L); }
    /// Sets `attachmentFeedbackLoopLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentFeedbackLoopLayout(MemorySegment segment, long index, int value) { VH_attachmentFeedbackLoopLayout.set(segment, 0L, index, value); }
    /// Sets `attachmentFeedbackLoopLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT attachmentFeedbackLoopLayout(int value) { attachmentFeedbackLoopLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT at(long index, Consumer<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `attachmentFeedbackLoopLayout` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentFeedbackLoopLayoutAt(long index) { return attachmentFeedbackLoopLayout(this.segment(), index); }
    /// Sets `attachmentFeedbackLoopLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT attachmentFeedbackLoopLayoutAt(long index, int value) { attachmentFeedbackLoopLayout(this.segment(), index, value); return this; }

}
