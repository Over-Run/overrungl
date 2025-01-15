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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### aspectReferenceCount
/// [VarHandle][#VH_aspectReferenceCount] - [Getter][#aspectReferenceCount()] - [Setter][#aspectReferenceCount(int)]
/// ### pAspectReferences
/// [VarHandle][#VH_pAspectReferences] - [Getter][#pAspectReferences()] - [Setter][#pAspectReferences(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassInputAttachmentAspectCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t aspectReferenceCount;
///     const VkInputAttachmentAspectReference * pAspectReferences;
/// } VkRenderPassInputAttachmentAspectCreateInfo;
/// ```
public sealed class VkRenderPassInputAttachmentAspectCreateInfo extends Struct {
    /// The struct layout of `VkRenderPassInputAttachmentAspectCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("aspectReferenceCount"),
        ValueLayout.ADDRESS.withName("pAspectReferences")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `aspectReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspectReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectReferenceCount"));
    /// The [VarHandle] of `pAspectReferences` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAspectReferences = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAspectReferences"));

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassInputAttachmentAspectCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassInputAttachmentAspectCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfo(segment); }

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassInputAttachmentAspectCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassInputAttachmentAspectCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassInputAttachmentAspectCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassInputAttachmentAspectCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassInputAttachmentAspectCreateInfo`
    public static VkRenderPassInputAttachmentAspectCreateInfo alloc(SegmentAllocator allocator) { return new VkRenderPassInputAttachmentAspectCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassInputAttachmentAspectCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassInputAttachmentAspectCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassInputAttachmentAspectCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassInputAttachmentAspectCreateInfo`
    public static VkRenderPassInputAttachmentAspectCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int aspectReferenceCount, @CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment pAspectReferences) { return alloc(allocator).sType(sType).pNext(pNext).aspectReferenceCount(aspectReferenceCount).pAspectReferences(pAspectReferences); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfo copyFrom(VkRenderPassInputAttachmentAspectCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassInputAttachmentAspectCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassInputAttachmentAspectCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassInputAttachmentAspectCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfo sType(@CType("VkStructureType") int value) { VkRenderPassInputAttachmentAspectCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassInputAttachmentAspectCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassInputAttachmentAspectCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassInputAttachmentAspectCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassInputAttachmentAspectCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `aspectReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_aspectReferenceCount(MemorySegment segment, long index) { return (int) VH_aspectReferenceCount.get(segment, 0L, index); }
    /// {@return `aspectReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_aspectReferenceCount(MemorySegment segment) { return VkRenderPassInputAttachmentAspectCreateInfo.get_aspectReferenceCount(segment, 0L); }
    /// {@return `aspectReferenceCount`}
    public @CType("uint32_t") int aspectReferenceCount() { return VkRenderPassInputAttachmentAspectCreateInfo.get_aspectReferenceCount(this.segment()); }
    /// Sets `aspectReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspectReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_aspectReferenceCount.set(segment, 0L, index, value); }
    /// Sets `aspectReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspectReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassInputAttachmentAspectCreateInfo.set_aspectReferenceCount(segment, 0L, value); }
    /// Sets `aspectReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfo aspectReferenceCount(@CType("uint32_t") int value) { VkRenderPassInputAttachmentAspectCreateInfo.set_aspectReferenceCount(this.segment(), value); return this; }

    /// {@return `pAspectReferences` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment get_pAspectReferences(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAspectReferences.get(segment, 0L, index); }
    /// {@return `pAspectReferences`}
    /// @param segment the segment of the struct
    public static @CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment get_pAspectReferences(MemorySegment segment) { return VkRenderPassInputAttachmentAspectCreateInfo.get_pAspectReferences(segment, 0L); }
    /// {@return `pAspectReferences`}
    public @CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment pAspectReferences() { return VkRenderPassInputAttachmentAspectCreateInfo.get_pAspectReferences(this.segment()); }
    /// Sets `pAspectReferences` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAspectReferences(MemorySegment segment, long index, @CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment value) { VH_pAspectReferences.set(segment, 0L, index, value); }
    /// Sets `pAspectReferences` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAspectReferences(MemorySegment segment, @CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment value) { VkRenderPassInputAttachmentAspectCreateInfo.set_pAspectReferences(segment, 0L, value); }
    /// Sets `pAspectReferences` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassInputAttachmentAspectCreateInfo pAspectReferences(@CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment value) { VkRenderPassInputAttachmentAspectCreateInfo.set_pAspectReferences(this.segment(), value); return this; }

    /// A buffer of [VkRenderPassInputAttachmentAspectCreateInfo].
    public static final class Buffer extends VkRenderPassInputAttachmentAspectCreateInfo {
        private final long elementCount;

        /// Creates `VkRenderPassInputAttachmentAspectCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassInputAttachmentAspectCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassInputAttachmentAspectCreateInfo`
        public VkRenderPassInputAttachmentAspectCreateInfo asSlice(long index) { return new VkRenderPassInputAttachmentAspectCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassInputAttachmentAspectCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassInputAttachmentAspectCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassInputAttachmentAspectCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassInputAttachmentAspectCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassInputAttachmentAspectCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassInputAttachmentAspectCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `aspectReferenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int aspectReferenceCountAt(long index) { return VkRenderPassInputAttachmentAspectCreateInfo.get_aspectReferenceCount(this.segment(), index); }
        /// Sets `aspectReferenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer aspectReferenceCountAt(long index, @CType("uint32_t") int value) { VkRenderPassInputAttachmentAspectCreateInfo.set_aspectReferenceCount(this.segment(), index, value); return this; }

        /// {@return `pAspectReferences` at the given index}
        /// @param index the index
        public @CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment pAspectReferencesAt(long index) { return VkRenderPassInputAttachmentAspectCreateInfo.get_pAspectReferences(this.segment(), index); }
        /// Sets `pAspectReferences` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAspectReferencesAt(long index, @CType("const VkInputAttachmentAspectReference *") java.lang.foreign.MemorySegment value) { VkRenderPassInputAttachmentAspectCreateInfo.set_pAspectReferences(this.segment(), index, value); return this; }

    }
}
