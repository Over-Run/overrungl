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

/// Represents `VkAttachmentSampleLocationsEXT`.
/// ## Layout
/// ```
/// struct VkAttachmentSampleLocationsEXT {
///     uint32_t attachmentIndex;
///     (struct VkSampleLocationsInfoEXT) VkSampleLocationsInfoEXT sampleLocationsInfo;
/// };
/// ```
public final class VkAttachmentSampleLocationsEXT extends GroupType {
    /// The struct layout of `VkAttachmentSampleLocationsEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("attachmentIndex"),
        overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    /// The byte offset of `attachmentIndex`.
    public static final long OFFSET_attachmentIndex = LAYOUT.byteOffset(PathElement.groupElement("attachmentIndex"));
    /// The memory layout of `attachmentIndex`.
    public static final MemoryLayout LAYOUT_attachmentIndex = LAYOUT.select(PathElement.groupElement("attachmentIndex"));
    /// The [VarHandle] of `attachmentIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentIndex"));
    /// The byte offset of `sampleLocationsInfo`.
    public static final long OFFSET_sampleLocationsInfo = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
    /// The memory layout of `sampleLocationsInfo`.
    public static final MemoryLayout LAYOUT_sampleLocationsInfo = LAYOUT.select(PathElement.groupElement("sampleLocationsInfo"));

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAttachmentSampleLocationsEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleLocationsEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleLocationsEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleLocationsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleLocationsEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAttachmentSampleLocationsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleLocationsEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleLocationsEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAttachmentSampleLocationsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentSampleLocationsEXT`
    public static VkAttachmentSampleLocationsEXT alloc(SegmentAllocator allocator) { return new VkAttachmentSampleLocationsEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAttachmentSampleLocationsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentSampleLocationsEXT`
    public static VkAttachmentSampleLocationsEXT alloc(SegmentAllocator allocator, long count) { return new VkAttachmentSampleLocationsEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentSampleLocationsEXT copyFrom(VkAttachmentSampleLocationsEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAttachmentSampleLocationsEXT reinterpret(long count) { return new VkAttachmentSampleLocationsEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `attachmentIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentIndex(MemorySegment segment, long index) { return (int) VH_attachmentIndex.get(segment, 0L, index); }
    /// {@return `attachmentIndex`}
    public int attachmentIndex() { return attachmentIndex(this.segment(), 0L); }
    /// Sets `attachmentIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentIndex(MemorySegment segment, long index, int value) { VH_attachmentIndex.set(segment, 0L, index, value); }
    /// Sets `attachmentIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleLocationsEXT attachmentIndex(int value) { attachmentIndex(this.segment(), 0L, value); return this; }

    /// {@return `sampleLocationsInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment sampleLocationsInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo); }
    /// {@return `sampleLocationsInfo`}
    public MemorySegment sampleLocationsInfo() { return sampleLocationsInfo(this.segment(), 0L); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleLocationsInfo(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationsInfo, index), LAYOUT_sampleLocationsInfo.byteSize()); }
    /// Sets `sampleLocationsInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(MemorySegment value) { sampleLocationsInfo(this.segment(), 0L, value); return this; }
    /// Accepts `sampleLocationsInfo` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(Consumer<overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.of(sampleLocationsInfo())); return this; }

    /// Creates a slice of `VkAttachmentSampleLocationsEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAttachmentSampleLocationsEXT`
    public VkAttachmentSampleLocationsEXT asSlice(long index) { return new VkAttachmentSampleLocationsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAttachmentSampleLocationsEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAttachmentSampleLocationsEXT`
    public VkAttachmentSampleLocationsEXT asSlice(long index, long count) { return new VkAttachmentSampleLocationsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAttachmentSampleLocationsEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAttachmentSampleLocationsEXT at(long index, Consumer<VkAttachmentSampleLocationsEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `attachmentIndex` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentIndexAt(long index) { return attachmentIndex(this.segment(), index); }
    /// Sets `attachmentIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleLocationsEXT attachmentIndexAt(long index, int value) { attachmentIndex(this.segment(), index, value); return this; }

    /// {@return `sampleLocationsInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment sampleLocationsInfoAt(long index) { return sampleLocationsInfo(this.segment(), index); }
    /// Sets `sampleLocationsInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleLocationsEXT sampleLocationsInfoAt(long index, MemorySegment value) { sampleLocationsInfo(this.segment(), index, value); return this; }
    /// Accepts `sampleLocationsInfo` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAttachmentSampleLocationsEXT sampleLocationsInfoAt(long index, Consumer<overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkSampleLocationsInfoEXT.of(sampleLocationsInfoAt(index))); return this; }

}
