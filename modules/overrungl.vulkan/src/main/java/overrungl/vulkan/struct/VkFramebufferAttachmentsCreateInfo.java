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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### attachmentImageInfoCount
/// [VarHandle][#VH_attachmentImageInfoCount] - [Getter][#attachmentImageInfoCount()] - [Setter][#attachmentImageInfoCount(int)]
/// ### pAttachmentImageInfos
/// [VarHandle][#VH_pAttachmentImageInfos] - [Getter][#pAttachmentImageInfos()] - [Setter][#pAttachmentImageInfos(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFramebufferAttachmentsCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t attachmentImageInfoCount;
///     const VkFramebufferAttachmentImageInfo * pAttachmentImageInfos;
/// } VkFramebufferAttachmentsCreateInfo;
/// ```
public sealed class VkFramebufferAttachmentsCreateInfo extends Struct {
    /// The struct layout of `VkFramebufferAttachmentsCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentImageInfoCount"),
        ValueLayout.ADDRESS.withName("pAttachmentImageInfos")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `attachmentImageInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentImageInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentImageInfoCount"));
    /// The [VarHandle] of `pAttachmentImageInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachmentImageInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachmentImageInfos"));

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkFramebufferAttachmentsCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentsCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfo(segment); }

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentsCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferAttachmentsCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFramebufferAttachmentsCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static VkFramebufferAttachmentsCreateInfo alloc(SegmentAllocator allocator) { return new VkFramebufferAttachmentsCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFramebufferAttachmentsCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferAttachmentsCreateInfo`
    public static VkFramebufferAttachmentsCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int attachmentImageInfoCount, @CType("const VkFramebufferAttachmentImageInfo *") MemorySegment pAttachmentImageInfos) { return alloc(allocator).sType(sType).pNext(pNext).attachmentImageInfoCount(attachmentImageInfoCount).pAttachmentImageInfos(pAttachmentImageInfos); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo copyFrom(VkFramebufferAttachmentsCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFramebufferAttachmentsCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFramebufferAttachmentsCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFramebufferAttachmentsCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo sType(@CType("VkStructureType") int value) { VkFramebufferAttachmentsCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkFramebufferAttachmentsCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkFramebufferAttachmentsCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkFramebufferAttachmentsCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo pNext(@CType("const void *") MemorySegment value) { VkFramebufferAttachmentsCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `attachmentImageInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentImageInfoCount(MemorySegment segment, long index) { return (int) VH_attachmentImageInfoCount.get(segment, 0L, index); }
    /// {@return `attachmentImageInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentImageInfoCount(MemorySegment segment) { return VkFramebufferAttachmentsCreateInfo.get_attachmentImageInfoCount(segment, 0L); }
    /// {@return `attachmentImageInfoCount`}
    public @CType("uint32_t") int attachmentImageInfoCount() { return VkFramebufferAttachmentsCreateInfo.get_attachmentImageInfoCount(this.segment()); }
    /// Sets `attachmentImageInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentImageInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentImageInfoCount.set(segment, 0L, index, value); }
    /// Sets `attachmentImageInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentImageInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferAttachmentsCreateInfo.set_attachmentImageInfoCount(segment, 0L, value); }
    /// Sets `attachmentImageInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo attachmentImageInfoCount(@CType("uint32_t") int value) { VkFramebufferAttachmentsCreateInfo.set_attachmentImageInfoCount(this.segment(), value); return this; }

    /// {@return `pAttachmentImageInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkFramebufferAttachmentImageInfo *") MemorySegment get_pAttachmentImageInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachmentImageInfos.get(segment, 0L, index); }
    /// {@return `pAttachmentImageInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkFramebufferAttachmentImageInfo *") MemorySegment get_pAttachmentImageInfos(MemorySegment segment) { return VkFramebufferAttachmentsCreateInfo.get_pAttachmentImageInfos(segment, 0L); }
    /// {@return `pAttachmentImageInfos`}
    public @CType("const VkFramebufferAttachmentImageInfo *") MemorySegment pAttachmentImageInfos() { return VkFramebufferAttachmentsCreateInfo.get_pAttachmentImageInfos(this.segment()); }
    /// Sets `pAttachmentImageInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttachmentImageInfos(MemorySegment segment, long index, @CType("const VkFramebufferAttachmentImageInfo *") MemorySegment value) { VH_pAttachmentImageInfos.set(segment, 0L, index, value); }
    /// Sets `pAttachmentImageInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttachmentImageInfos(MemorySegment segment, @CType("const VkFramebufferAttachmentImageInfo *") MemorySegment value) { VkFramebufferAttachmentsCreateInfo.set_pAttachmentImageInfos(segment, 0L, value); }
    /// Sets `pAttachmentImageInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentsCreateInfo pAttachmentImageInfos(@CType("const VkFramebufferAttachmentImageInfo *") MemorySegment value) { VkFramebufferAttachmentsCreateInfo.set_pAttachmentImageInfos(this.segment(), value); return this; }

    /// A buffer of [VkFramebufferAttachmentsCreateInfo].
    public static final class Buffer extends VkFramebufferAttachmentsCreateInfo {
        private final long elementCount;

        /// Creates `VkFramebufferAttachmentsCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFramebufferAttachmentsCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFramebufferAttachmentsCreateInfo`
        public VkFramebufferAttachmentsCreateInfo asSlice(long index) { return new VkFramebufferAttachmentsCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFramebufferAttachmentsCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFramebufferAttachmentsCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkFramebufferAttachmentsCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkFramebufferAttachmentsCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkFramebufferAttachmentsCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkFramebufferAttachmentsCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `attachmentImageInfoCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int attachmentImageInfoCountAt(long index) { return VkFramebufferAttachmentsCreateInfo.get_attachmentImageInfoCount(this.segment(), index); }
        /// Sets `attachmentImageInfoCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer attachmentImageInfoCountAt(long index, @CType("uint32_t") int value) { VkFramebufferAttachmentsCreateInfo.set_attachmentImageInfoCount(this.segment(), index, value); return this; }

        /// {@return `pAttachmentImageInfos` at the given index}
        /// @param index the index
        public @CType("const VkFramebufferAttachmentImageInfo *") MemorySegment pAttachmentImageInfosAt(long index) { return VkFramebufferAttachmentsCreateInfo.get_pAttachmentImageInfos(this.segment(), index); }
        /// Sets `pAttachmentImageInfos` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAttachmentImageInfosAt(long index, @CType("const VkFramebufferAttachmentImageInfo *") MemorySegment value) { VkFramebufferAttachmentsCreateInfo.set_pAttachmentImageInfos(this.segment(), index, value); return this; }

    }
}
