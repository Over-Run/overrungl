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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAttachmentDescriptionStencilLayout {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkImageLayout stencilInitialLayout;
///     (int) VkImageLayout stencilFinalLayout;
/// };
/// ```
public sealed class VkAttachmentDescriptionStencilLayout extends GroupType {
    /// The struct layout of `VkAttachmentDescriptionStencilLayout`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilInitialLayout"),
        ValueLayout.JAVA_INT.withName("stencilFinalLayout")
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
    /// The byte offset of `stencilInitialLayout`.
    public static final long OFFSET_stencilInitialLayout = LAYOUT.byteOffset(PathElement.groupElement("stencilInitialLayout"));
    /// The memory layout of `stencilInitialLayout`.
    public static final MemoryLayout LAYOUT_stencilInitialLayout = LAYOUT.select(PathElement.groupElement("stencilInitialLayout"));
    /// The [VarHandle] of `stencilInitialLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilInitialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilInitialLayout"));
    /// The byte offset of `stencilFinalLayout`.
    public static final long OFFSET_stencilFinalLayout = LAYOUT.byteOffset(PathElement.groupElement("stencilFinalLayout"));
    /// The memory layout of `stencilFinalLayout`.
    public static final MemoryLayout LAYOUT_stencilFinalLayout = LAYOUT.select(PathElement.groupElement("stencilFinalLayout"));
    /// The [VarHandle] of `stencilFinalLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilFinalLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilFinalLayout"));

    /// Creates `VkAttachmentDescriptionStencilLayout` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentDescriptionStencilLayout(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentDescriptionStencilLayout` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentDescriptionStencilLayout` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescriptionStencilLayout ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayout(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkAttachmentDescriptionStencilLayout` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAttachmentDescriptionStencilLayout` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentDescriptionStencilLayout`
    public static VkAttachmentDescriptionStencilLayout alloc(SegmentAllocator allocator) { return new VkAttachmentDescriptionStencilLayout(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentDescriptionStencilLayout` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentDescriptionStencilLayout`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAttachmentDescriptionStencilLayout` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stencilInitialLayout `stencilInitialLayout`
    /// @param stencilFinalLayout `stencilFinalLayout`
    /// @return the allocated `VkAttachmentDescriptionStencilLayout`
    public static VkAttachmentDescriptionStencilLayout allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stencilInitialLayout, int stencilFinalLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).stencilInitialLayout(stencilInitialLayout).stencilFinalLayout(stencilFinalLayout);
    }

    /// Allocates a `VkAttachmentDescriptionStencilLayout` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stencilInitialLayout `stencilInitialLayout`
    /// @return the allocated `VkAttachmentDescriptionStencilLayout`
    public static VkAttachmentDescriptionStencilLayout allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stencilInitialLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).stencilInitialLayout(stencilInitialLayout);
    }

    /// Allocates a `VkAttachmentDescriptionStencilLayout` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAttachmentDescriptionStencilLayout`
    public static VkAttachmentDescriptionStencilLayout allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAttachmentDescriptionStencilLayout` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAttachmentDescriptionStencilLayout`
    public static VkAttachmentDescriptionStencilLayout allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout copyFrom(VkAttachmentDescriptionStencilLayout src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkAttachmentDescriptionStencilLayout sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAttachmentDescriptionStencilLayout pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stencilInitialLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilInitialLayout(MemorySegment segment, long index) { return (int) VH_stencilInitialLayout.get(segment, 0L, index); }
    /// {@return `stencilInitialLayout`}
    public int stencilInitialLayout() { return stencilInitialLayout(this.segment(), 0L); }
    /// Sets `stencilInitialLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilInitialLayout(MemorySegment segment, long index, int value) { VH_stencilInitialLayout.set(segment, 0L, index, value); }
    /// Sets `stencilInitialLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout stencilInitialLayout(int value) { stencilInitialLayout(this.segment(), 0L, value); return this; }

    /// {@return `stencilFinalLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilFinalLayout(MemorySegment segment, long index) { return (int) VH_stencilFinalLayout.get(segment, 0L, index); }
    /// {@return `stencilFinalLayout`}
    public int stencilFinalLayout() { return stencilFinalLayout(this.segment(), 0L); }
    /// Sets `stencilFinalLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilFinalLayout(MemorySegment segment, long index, int value) { VH_stencilFinalLayout.set(segment, 0L, index, value); }
    /// Sets `stencilFinalLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout stencilFinalLayout(int value) { stencilFinalLayout(this.segment(), 0L, value); return this; }

    /// A buffer of [VkAttachmentDescriptionStencilLayout].
    public static final class Buffer extends VkAttachmentDescriptionStencilLayout {
        private final long elementCount;

        /// Creates `VkAttachmentDescriptionStencilLayout.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAttachmentDescriptionStencilLayout`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAttachmentDescriptionStencilLayout`
        public VkAttachmentDescriptionStencilLayout asSlice(long index) { return new VkAttachmentDescriptionStencilLayout(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAttachmentDescriptionStencilLayout`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAttachmentDescriptionStencilLayout`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `stencilInitialLayout` at the given index}
        /// @param index the index of the struct buffer
        public int stencilInitialLayoutAt(long index) { return stencilInitialLayout(this.segment(), index); }
        /// Sets `stencilInitialLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stencilInitialLayoutAt(long index, int value) { stencilInitialLayout(this.segment(), index, value); return this; }

        /// {@return `stencilFinalLayout` at the given index}
        /// @param index the index of the struct buffer
        public int stencilFinalLayoutAt(long index) { return stencilFinalLayout(this.segment(), index); }
        /// Sets `stencilFinalLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stencilFinalLayoutAt(long index, int value) { stencilFinalLayout(this.segment(), index, value); return this; }

    }
}
