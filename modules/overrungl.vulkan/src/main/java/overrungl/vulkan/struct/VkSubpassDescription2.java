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
/// struct VkSubpassDescription2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkSubpassDescriptionFlags flags;
///     (int) VkPipelineBindPoint pipelineBindPoint;
///     uint32_t viewMask;
///     uint32_t inputAttachmentCount;
///     const VkAttachmentReference2* pInputAttachments;
///     uint32_t colorAttachmentCount;
///     const VkAttachmentReference2* pColorAttachments;
///     const VkAttachmentReference2* pResolveAttachments;
///     const VkAttachmentReference2* pDepthStencilAttachment;
///     uint32_t preserveAttachmentCount;
///     const uint32_t* pPreserveAttachments;
/// };
/// ```
public sealed class VkSubpassDescription2 extends GroupType {
    /// The struct layout of `VkSubpassDescription2`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("inputAttachmentCount"),
        ValueLayout.ADDRESS.withName("pInputAttachments"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachments"),
        ValueLayout.ADDRESS.withName("pResolveAttachments"),
        ValueLayout.ADDRESS.withName("pDepthStencilAttachment"),
        ValueLayout.JAVA_INT.withName("preserveAttachmentCount"),
        ValueLayout.ADDRESS.withName("pPreserveAttachments")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `pipelineBindPoint`.
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    /// The memory layout of `pipelineBindPoint`.
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The byte offset of `viewMask`.
    public static final long OFFSET_viewMask = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
    /// The memory layout of `viewMask`.
    public static final MemoryLayout LAYOUT_viewMask = LAYOUT.select(PathElement.groupElement("viewMask"));
    /// The [VarHandle] of `viewMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask"));
    /// The byte offset of `inputAttachmentCount`.
    public static final long OFFSET_inputAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentCount"));
    /// The memory layout of `inputAttachmentCount`.
    public static final MemoryLayout LAYOUT_inputAttachmentCount = LAYOUT.select(PathElement.groupElement("inputAttachmentCount"));
    /// The [VarHandle] of `inputAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inputAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentCount"));
    /// The byte offset of `pInputAttachments`.
    public static final long OFFSET_pInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("pInputAttachments"));
    /// The memory layout of `pInputAttachments`.
    public static final MemoryLayout LAYOUT_pInputAttachments = LAYOUT.select(PathElement.groupElement("pInputAttachments"));
    /// The [VarHandle] of `pInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAttachments"));
    /// The byte offset of `colorAttachmentCount`.
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    /// The memory layout of `colorAttachmentCount`.
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The byte offset of `pColorAttachments`.
    public static final long OFFSET_pColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachments"));
    /// The memory layout of `pColorAttachments`.
    public static final MemoryLayout LAYOUT_pColorAttachments = LAYOUT.select(PathElement.groupElement("pColorAttachments"));
    /// The [VarHandle] of `pColorAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachments"));
    /// The byte offset of `pResolveAttachments`.
    public static final long OFFSET_pResolveAttachments = LAYOUT.byteOffset(PathElement.groupElement("pResolveAttachments"));
    /// The memory layout of `pResolveAttachments`.
    public static final MemoryLayout LAYOUT_pResolveAttachments = LAYOUT.select(PathElement.groupElement("pResolveAttachments"));
    /// The [VarHandle] of `pResolveAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pResolveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResolveAttachments"));
    /// The byte offset of `pDepthStencilAttachment`.
    public static final long OFFSET_pDepthStencilAttachment = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilAttachment"));
    /// The memory layout of `pDepthStencilAttachment`.
    public static final MemoryLayout LAYOUT_pDepthStencilAttachment = LAYOUT.select(PathElement.groupElement("pDepthStencilAttachment"));
    /// The [VarHandle] of `pDepthStencilAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDepthStencilAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilAttachment"));
    /// The byte offset of `preserveAttachmentCount`.
    public static final long OFFSET_preserveAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("preserveAttachmentCount"));
    /// The memory layout of `preserveAttachmentCount`.
    public static final MemoryLayout LAYOUT_preserveAttachmentCount = LAYOUT.select(PathElement.groupElement("preserveAttachmentCount"));
    /// The [VarHandle] of `preserveAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preserveAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preserveAttachmentCount"));
    /// The byte offset of `pPreserveAttachments`.
    public static final long OFFSET_pPreserveAttachments = LAYOUT.byteOffset(PathElement.groupElement("pPreserveAttachments"));
    /// The memory layout of `pPreserveAttachments`.
    public static final MemoryLayout LAYOUT_pPreserveAttachments = LAYOUT.select(PathElement.groupElement("pPreserveAttachments"));
    /// The [VarHandle] of `pPreserveAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPreserveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPreserveAttachments"));

    /// Creates `VkSubpassDescription2` with the given segment.
    /// @param segment the memory segment
    public VkSubpassDescription2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassDescription2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassDescription2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescription2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescription2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassDescription2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubpassDescription2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDescription2`
    public static VkSubpassDescription2 alloc(SegmentAllocator allocator) { return new VkSubpassDescription2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassDescription2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassDescription2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassDescription2 copyFrom(VkSubpassDescription2 src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkSubpassDescription2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSubpassDescription2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    public int pipelineBindPoint() { return pipelineBindPoint(this.segment(), 0L); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBindPoint(MemorySegment segment, long index, int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pipelineBindPoint(int value) { pipelineBindPoint(this.segment(), 0L, value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewMask(MemorySegment segment, long index) { return (int) VH_viewMask.get(segment, 0L, index); }
    /// {@return `viewMask`}
    public int viewMask() { return viewMask(this.segment(), 0L); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewMask(MemorySegment segment, long index, int value) { VH_viewMask.set(segment, 0L, index, value); }
    /// Sets `viewMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 viewMask(int value) { viewMask(this.segment(), 0L, value); return this; }

    /// {@return `inputAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inputAttachmentCount(MemorySegment segment, long index) { return (int) VH_inputAttachmentCount.get(segment, 0L, index); }
    /// {@return `inputAttachmentCount`}
    public int inputAttachmentCount() { return inputAttachmentCount(this.segment(), 0L); }
    /// Sets `inputAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inputAttachmentCount(MemorySegment segment, long index, int value) { VH_inputAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `inputAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 inputAttachmentCount(int value) { inputAttachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pInputAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pInputAttachments.get(segment, 0L, index); }
    /// {@return `pInputAttachments`}
    public MemorySegment pInputAttachments() { return pInputAttachments(this.segment(), 0L); }
    /// Sets `pInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pInputAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pInputAttachments.set(segment, 0L, index, value); }
    /// Sets `pInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pInputAttachments(MemorySegment value) { pInputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    public int colorAttachmentCount() { return colorAttachmentCount(this.segment(), 0L); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorAttachmentCount(MemorySegment segment, long index, int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 colorAttachmentCount(int value) { colorAttachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pColorAttachments.get(segment, 0L, index); }
    /// {@return `pColorAttachments`}
    public MemorySegment pColorAttachments() { return pColorAttachments(this.segment(), 0L); }
    /// Sets `pColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pColorAttachments.set(segment, 0L, index, value); }
    /// Sets `pColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pColorAttachments(MemorySegment value) { pColorAttachments(this.segment(), 0L, value); return this; }

    /// {@return `pResolveAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pResolveAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pResolveAttachments.get(segment, 0L, index); }
    /// {@return `pResolveAttachments`}
    public MemorySegment pResolveAttachments() { return pResolveAttachments(this.segment(), 0L); }
    /// Sets `pResolveAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pResolveAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pResolveAttachments.set(segment, 0L, index, value); }
    /// Sets `pResolveAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pResolveAttachments(MemorySegment value) { pResolveAttachments(this.segment(), 0L, value); return this; }

    /// {@return `pDepthStencilAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDepthStencilAttachment(MemorySegment segment, long index) { return (MemorySegment) VH_pDepthStencilAttachment.get(segment, 0L, index); }
    /// {@return `pDepthStencilAttachment`}
    public MemorySegment pDepthStencilAttachment() { return pDepthStencilAttachment(this.segment(), 0L); }
    /// Sets `pDepthStencilAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDepthStencilAttachment(MemorySegment segment, long index, MemorySegment value) { VH_pDepthStencilAttachment.set(segment, 0L, index, value); }
    /// Sets `pDepthStencilAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pDepthStencilAttachment(MemorySegment value) { pDepthStencilAttachment(this.segment(), 0L, value); return this; }

    /// {@return `preserveAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preserveAttachmentCount(MemorySegment segment, long index) { return (int) VH_preserveAttachmentCount.get(segment, 0L, index); }
    /// {@return `preserveAttachmentCount`}
    public int preserveAttachmentCount() { return preserveAttachmentCount(this.segment(), 0L); }
    /// Sets `preserveAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preserveAttachmentCount(MemorySegment segment, long index, int value) { VH_preserveAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `preserveAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 preserveAttachmentCount(int value) { preserveAttachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pPreserveAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPreserveAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pPreserveAttachments.get(segment, 0L, index); }
    /// {@return `pPreserveAttachments`}
    public MemorySegment pPreserveAttachments() { return pPreserveAttachments(this.segment(), 0L); }
    /// Sets `pPreserveAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPreserveAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pPreserveAttachments.set(segment, 0L, index, value); }
    /// Sets `pPreserveAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pPreserveAttachments(MemorySegment value) { pPreserveAttachments(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSubpassDescription2].
    public static final class Buffer extends VkSubpassDescription2 {
        private final long elementCount;

        /// Creates `VkSubpassDescription2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubpassDescription2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubpassDescription2`
        public VkSubpassDescription2 asSlice(long index) { return new VkSubpassDescription2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubpassDescription2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubpassDescription2`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `pipelineBindPoint` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineBindPointAt(long index) { return pipelineBindPoint(this.segment(), index); }
        /// Sets `pipelineBindPoint` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBindPointAt(long index, int value) { pipelineBindPoint(this.segment(), index, value); return this; }

        /// {@return `viewMask` at the given index}
        /// @param index the index of the struct buffer
        public int viewMaskAt(long index) { return viewMask(this.segment(), index); }
        /// Sets `viewMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer viewMaskAt(long index, int value) { viewMask(this.segment(), index, value); return this; }

        /// {@return `inputAttachmentCount` at the given index}
        /// @param index the index of the struct buffer
        public int inputAttachmentCountAt(long index) { return inputAttachmentCount(this.segment(), index); }
        /// Sets `inputAttachmentCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer inputAttachmentCountAt(long index, int value) { inputAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pInputAttachments` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pInputAttachmentsAt(long index) { return pInputAttachments(this.segment(), index); }
        /// Sets `pInputAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pInputAttachmentsAt(long index, MemorySegment value) { pInputAttachments(this.segment(), index, value); return this; }

        /// {@return `colorAttachmentCount` at the given index}
        /// @param index the index of the struct buffer
        public int colorAttachmentCountAt(long index) { return colorAttachmentCount(this.segment(), index); }
        /// Sets `colorAttachmentCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer colorAttachmentCountAt(long index, int value) { colorAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pColorAttachments` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pColorAttachmentsAt(long index) { return pColorAttachments(this.segment(), index); }
        /// Sets `pColorAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pColorAttachmentsAt(long index, MemorySegment value) { pColorAttachments(this.segment(), index, value); return this; }

        /// {@return `pResolveAttachments` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pResolveAttachmentsAt(long index) { return pResolveAttachments(this.segment(), index); }
        /// Sets `pResolveAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pResolveAttachmentsAt(long index, MemorySegment value) { pResolveAttachments(this.segment(), index, value); return this; }

        /// {@return `pDepthStencilAttachment` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDepthStencilAttachmentAt(long index) { return pDepthStencilAttachment(this.segment(), index); }
        /// Sets `pDepthStencilAttachment` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDepthStencilAttachmentAt(long index, MemorySegment value) { pDepthStencilAttachment(this.segment(), index, value); return this; }

        /// {@return `preserveAttachmentCount` at the given index}
        /// @param index the index of the struct buffer
        public int preserveAttachmentCountAt(long index) { return preserveAttachmentCount(this.segment(), index); }
        /// Sets `preserveAttachmentCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preserveAttachmentCountAt(long index, int value) { preserveAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pPreserveAttachments` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pPreserveAttachmentsAt(long index) { return pPreserveAttachments(this.segment(), index); }
        /// Sets `pPreserveAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pPreserveAttachmentsAt(long index, MemorySegment value) { pPreserveAttachments(this.segment(), index, value); return this; }

    }
}
