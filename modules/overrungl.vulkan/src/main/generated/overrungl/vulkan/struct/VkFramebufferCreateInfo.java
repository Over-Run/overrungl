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
/// struct VkFramebufferCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkFramebufferCreateFlags flags;
///     (uint64_t) VkRenderPass renderPass;
///     uint32_t attachmentCount;
///     const VkImageView* pAttachments;
///     uint32_t width;
///     uint32_t height;
///     uint32_t layers;
/// };
/// ```
public sealed class VkFramebufferCreateInfo extends GroupType {
    /// The struct layout of `VkFramebufferCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("layers")
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
    /// The byte offset of `renderPass`.
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    /// The memory layout of `renderPass`.
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The byte offset of `attachmentCount`.
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    /// The memory layout of `attachmentCount`.
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    /// The byte offset of `pAttachments`.
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    /// The memory layout of `pAttachments`.
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    /// The [VarHandle] of `pAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    /// The byte offset of `width`.
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    /// The memory layout of `width`.
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The byte offset of `height`.
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    /// The memory layout of `height`.
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The byte offset of `layers`.
    public static final long OFFSET_layers = LAYOUT.byteOffset(PathElement.groupElement("layers"));
    /// The memory layout of `layers`.
    public static final MemoryLayout LAYOUT_layers = LAYOUT.select(PathElement.groupElement("layers"));
    /// The [VarHandle] of `layers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layers"));

    /// Creates `VkFramebufferCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkFramebufferCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFramebufferCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFramebufferCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFramebufferCreateInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkFramebufferCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo alloc(SegmentAllocator allocator) { return new VkFramebufferCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFramebufferCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param renderPass `renderPass`
    /// @param attachmentCount `attachmentCount`
    /// @param pAttachments `pAttachments`
    /// @param width `width`
    /// @param height `height`
    /// @param layers `layers`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long renderPass, int attachmentCount, MemorySegment pAttachments, int width, int height, int layers) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).renderPass(renderPass).attachmentCount(attachmentCount).pAttachments(pAttachments).width(width).height(height).layers(layers);
    }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param renderPass `renderPass`
    /// @param attachmentCount `attachmentCount`
    /// @param pAttachments `pAttachments`
    /// @param width `width`
    /// @param height `height`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long renderPass, int attachmentCount, MemorySegment pAttachments, int width, int height) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).renderPass(renderPass).attachmentCount(attachmentCount).pAttachments(pAttachments).width(width).height(height);
    }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param renderPass `renderPass`
    /// @param attachmentCount `attachmentCount`
    /// @param pAttachments `pAttachments`
    /// @param width `width`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long renderPass, int attachmentCount, MemorySegment pAttachments, int width) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).renderPass(renderPass).attachmentCount(attachmentCount).pAttachments(pAttachments).width(width);
    }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param renderPass `renderPass`
    /// @param attachmentCount `attachmentCount`
    /// @param pAttachments `pAttachments`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long renderPass, int attachmentCount, MemorySegment pAttachments) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).renderPass(renderPass).attachmentCount(attachmentCount).pAttachments(pAttachments);
    }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param renderPass `renderPass`
    /// @param attachmentCount `attachmentCount`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long renderPass, int attachmentCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).renderPass(renderPass).attachmentCount(attachmentCount);
    }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param renderPass `renderPass`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long renderPass) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).renderPass(renderPass);
    }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFramebufferCreateInfo copyFrom(VkFramebufferCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkFramebufferCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFramebufferCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkFramebufferCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long renderPass(MemorySegment segment, long index) { return (long) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    public long renderPass() { return renderPass(this.segment(), 0L); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderPass(MemorySegment segment, long index, long value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo renderPass(long value) { renderPass(this.segment(), 0L, value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    public int attachmentCount() { return attachmentCount(this.segment(), 0L); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentCount(MemorySegment segment, long index, int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo attachmentCount(int value) { attachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachments.get(segment, 0L, index); }
    /// {@return `pAttachments`}
    public MemorySegment pAttachments() { return pAttachments(this.segment(), 0L); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pAttachments.set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo pAttachments(MemorySegment value) { pAttachments(this.segment(), 0L, value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    public int width() { return width(this.segment(), 0L); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void width(MemorySegment segment, long index, int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo width(int value) { width(this.segment(), 0L, value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    public int height() { return height(this.segment(), 0L); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void height(MemorySegment segment, long index, int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo height(int value) { height(this.segment(), 0L, value); return this; }

    /// {@return `layers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layers(MemorySegment segment, long index) { return (int) VH_layers.get(segment, 0L, index); }
    /// {@return `layers`}
    public int layers() { return layers(this.segment(), 0L); }
    /// Sets `layers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layers(MemorySegment segment, long index, int value) { VH_layers.set(segment, 0L, index, value); }
    /// Sets `layers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo layers(int value) { layers(this.segment(), 0L, value); return this; }

    /// A buffer of [VkFramebufferCreateInfo].
    public static final class Buffer extends VkFramebufferCreateInfo {
        private final long elementCount;

        /// Creates `VkFramebufferCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFramebufferCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFramebufferCreateInfo`
        public VkFramebufferCreateInfo asSlice(long index) { return new VkFramebufferCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFramebufferCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFramebufferCreateInfo`
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

        /// {@return `renderPass` at the given index}
        /// @param index the index of the struct buffer
        public long renderPassAt(long index) { return renderPass(this.segment(), index); }
        /// Sets `renderPass` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer renderPassAt(long index, long value) { renderPass(this.segment(), index, value); return this; }

        /// {@return `attachmentCount` at the given index}
        /// @param index the index of the struct buffer
        public int attachmentCountAt(long index) { return attachmentCount(this.segment(), index); }
        /// Sets `attachmentCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer attachmentCountAt(long index, int value) { attachmentCount(this.segment(), index, value); return this; }

        /// {@return `pAttachments` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pAttachmentsAt(long index) { return pAttachments(this.segment(), index); }
        /// Sets `pAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pAttachmentsAt(long index, MemorySegment value) { pAttachments(this.segment(), index, value); return this; }

        /// {@return `width` at the given index}
        /// @param index the index of the struct buffer
        public int widthAt(long index) { return width(this.segment(), index); }
        /// Sets `width` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer widthAt(long index, int value) { width(this.segment(), index, value); return this; }

        /// {@return `height` at the given index}
        /// @param index the index of the struct buffer
        public int heightAt(long index) { return height(this.segment(), index); }
        /// Sets `height` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer heightAt(long index, int value) { height(this.segment(), index, value); return this; }

        /// {@return `layers` at the given index}
        /// @param index the index of the struct buffer
        public int layersAt(long index) { return layers(this.segment(), index); }
        /// Sets `layers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layersAt(long index, int value) { layers(this.segment(), index, value); return this; }

    }
}
