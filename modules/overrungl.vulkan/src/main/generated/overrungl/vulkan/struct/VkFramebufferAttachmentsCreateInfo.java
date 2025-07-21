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
/// struct VkFramebufferAttachmentsCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentImageInfoCount;
///     const VkFramebufferAttachmentImageInfo* pAttachmentImageInfos;
/// };
/// ```
public final class VkFramebufferAttachmentsCreateInfo extends GroupType {
    /// The struct layout of `VkFramebufferAttachmentsCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentImageInfoCount"),
        ValueLayout.ADDRESS.withName("pAttachmentImageInfos")
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
    /// The byte offset of `attachmentImageInfoCount`.
    public static final long OFFSET_attachmentImageInfoCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentImageInfoCount"));
    /// The memory layout of `attachmentImageInfoCount`.
    public static final MemoryLayout LAYOUT_attachmentImageInfoCount = LAYOUT.select(PathElement.groupElement("attachmentImageInfoCount"));
    /// The [VarHandle] of `attachmentImageInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentImageInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentImageInfoCount"));
    /// The byte offset of `pAttachmentImageInfos`.
    public static final long OFFSET_pAttachmentImageInfos = LAYOUT.byteOffset(PathElement.groupElement("pAttachmentImageInfos"));
    /// The memory layout of `pAttachmentImageInfos`.
    public static final MemoryLayout LAYOUT_pAttachmentImageInfos = LAYOUT.select(PathElement.groupElement("pAttachmentImageInfos"));
    /// The [VarHandle] of `pAttachmentImageInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachmentImageInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachmentImageInfos"));

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFramebufferAttachmentsCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentsCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentsCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentsCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static VkFramebufferAttachmentsCreateInfo alloc(SegmentAllocator allocator) { return new VkFramebufferAttachmentsCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static VkFramebufferAttachmentsCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkFramebufferAttachmentsCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param attachmentImageInfoCount `attachmentImageInfoCount`
    /// @param pAttachmentImageInfos `pAttachmentImageInfos`
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static VkFramebufferAttachmentsCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int attachmentImageInfoCount, MemorySegment pAttachmentImageInfos) {
        return alloc(allocator).sType(sType).pNext(pNext).attachmentImageInfoCount(attachmentImageInfoCount).pAttachmentImageInfos(pAttachmentImageInfos);
    }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param attachmentImageInfoCount `attachmentImageInfoCount`
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static VkFramebufferAttachmentsCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int attachmentImageInfoCount) {
        return alloc(allocator).sType(sType).pNext(pNext).attachmentImageInfoCount(attachmentImageInfoCount);
    }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static VkFramebufferAttachmentsCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static VkFramebufferAttachmentsCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo copyFrom(VkFramebufferAttachmentsCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFramebufferAttachmentsCreateInfo reinterpret(long count) { return new VkFramebufferAttachmentsCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkFramebufferAttachmentsCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFramebufferAttachmentsCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `attachmentImageInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentImageInfoCount(MemorySegment segment, long index) { return (int) VH_attachmentImageInfoCount.get(segment, 0L, index); }
    /// {@return `attachmentImageInfoCount`}
    public int attachmentImageInfoCount() { return attachmentImageInfoCount(this.segment(), 0L); }
    /// Sets `attachmentImageInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentImageInfoCount(MemorySegment segment, long index, int value) { VH_attachmentImageInfoCount.set(segment, 0L, index, value); }
    /// Sets `attachmentImageInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo attachmentImageInfoCount(int value) { attachmentImageInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pAttachmentImageInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttachmentImageInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachmentImageInfos.get(segment, 0L, index); }
    /// {@return `pAttachmentImageInfos`}
    public MemorySegment pAttachmentImageInfos() { return pAttachmentImageInfos(this.segment(), 0L); }
    /// Sets `pAttachmentImageInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttachmentImageInfos(MemorySegment segment, long index, MemorySegment value) { VH_pAttachmentImageInfos.set(segment, 0L, index, value); }
    /// Sets `pAttachmentImageInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo pAttachmentImageInfos(MemorySegment value) { pAttachmentImageInfos(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkFramebufferAttachmentsCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFramebufferAttachmentsCreateInfo`
    public VkFramebufferAttachmentsCreateInfo asSlice(long index) { return new VkFramebufferAttachmentsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFramebufferAttachmentsCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFramebufferAttachmentsCreateInfo`
    public VkFramebufferAttachmentsCreateInfo asSlice(long index, long count) { return new VkFramebufferAttachmentsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFramebufferAttachmentsCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo at(long index, Consumer<VkFramebufferAttachmentsCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `attachmentImageInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentImageInfoCountAt(long index) { return attachmentImageInfoCount(this.segment(), index); }
    /// Sets `attachmentImageInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo attachmentImageInfoCountAt(long index, int value) { attachmentImageInfoCount(this.segment(), index, value); return this; }

    /// {@return `pAttachmentImageInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAttachmentImageInfosAt(long index) { return pAttachmentImageInfos(this.segment(), index); }
    /// Sets `pAttachmentImageInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo pAttachmentImageInfosAt(long index, MemorySegment value) { pAttachmentImageInfos(this.segment(), index, value); return this; }

}
