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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeFlagsKHR flags;
///     (uint64_t) VkBuffer dstBuffer;
///     (uint64_t) VkDeviceSize dstBufferOffset;
///     (uint64_t) VkDeviceSize dstBufferRange;
///     (struct VkVideoPictureResourceInfoKHR) VkVideoPictureResourceInfoKHR srcPictureResource;
///     const VkVideoReferenceSlotInfoKHR* pSetupReferenceSlot;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR* pReferenceSlots;
///     uint32_t precedingExternallyEncodedBytes;
/// };
/// ```
public sealed class VkVideoEncodeInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("dstBuffer"),
        ValueLayout.JAVA_LONG.withName("dstBufferOffset"),
        ValueLayout.JAVA_LONG.withName("dstBufferRange"),
        overrungl.vulkan.khr.struct.VkVideoPictureResourceInfoKHR.LAYOUT.withName("srcPictureResource"),
        ValueLayout.ADDRESS.withName("pSetupReferenceSlot"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots"),
        ValueLayout.JAVA_INT.withName("precedingExternallyEncodedBytes")
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
    /// The byte offset of `dstBuffer`.
    public static final long OFFSET_dstBuffer = LAYOUT.byteOffset(PathElement.groupElement("dstBuffer"));
    /// The memory layout of `dstBuffer`.
    public static final MemoryLayout LAYOUT_dstBuffer = LAYOUT.select(PathElement.groupElement("dstBuffer"));
    /// The [VarHandle] of `dstBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBuffer"));
    /// The byte offset of `dstBufferOffset`.
    public static final long OFFSET_dstBufferOffset = LAYOUT.byteOffset(PathElement.groupElement("dstBufferOffset"));
    /// The memory layout of `dstBufferOffset`.
    public static final MemoryLayout LAYOUT_dstBufferOffset = LAYOUT.select(PathElement.groupElement("dstBufferOffset"));
    /// The [VarHandle] of `dstBufferOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstBufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBufferOffset"));
    /// The byte offset of `dstBufferRange`.
    public static final long OFFSET_dstBufferRange = LAYOUT.byteOffset(PathElement.groupElement("dstBufferRange"));
    /// The memory layout of `dstBufferRange`.
    public static final MemoryLayout LAYOUT_dstBufferRange = LAYOUT.select(PathElement.groupElement("dstBufferRange"));
    /// The [VarHandle] of `dstBufferRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBufferRange"));
    /// The byte offset of `srcPictureResource`.
    public static final long OFFSET_srcPictureResource = LAYOUT.byteOffset(PathElement.groupElement("srcPictureResource"));
    /// The memory layout of `srcPictureResource`.
    public static final MemoryLayout LAYOUT_srcPictureResource = LAYOUT.select(PathElement.groupElement("srcPictureResource"));
    /// The byte offset of `pSetupReferenceSlot`.
    public static final long OFFSET_pSetupReferenceSlot = LAYOUT.byteOffset(PathElement.groupElement("pSetupReferenceSlot"));
    /// The memory layout of `pSetupReferenceSlot`.
    public static final MemoryLayout LAYOUT_pSetupReferenceSlot = LAYOUT.select(PathElement.groupElement("pSetupReferenceSlot"));
    /// The [VarHandle] of `pSetupReferenceSlot` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSetupReferenceSlot = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetupReferenceSlot"));
    /// The byte offset of `referenceSlotCount`.
    public static final long OFFSET_referenceSlotCount = LAYOUT.byteOffset(PathElement.groupElement("referenceSlotCount"));
    /// The memory layout of `referenceSlotCount`.
    public static final MemoryLayout LAYOUT_referenceSlotCount = LAYOUT.select(PathElement.groupElement("referenceSlotCount"));
    /// The [VarHandle] of `referenceSlotCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_referenceSlotCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceSlotCount"));
    /// The byte offset of `pReferenceSlots`.
    public static final long OFFSET_pReferenceSlots = LAYOUT.byteOffset(PathElement.groupElement("pReferenceSlots"));
    /// The memory layout of `pReferenceSlots`.
    public static final MemoryLayout LAYOUT_pReferenceSlots = LAYOUT.select(PathElement.groupElement("pReferenceSlots"));
    /// The [VarHandle] of `pReferenceSlots` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pReferenceSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReferenceSlots"));
    /// The byte offset of `precedingExternallyEncodedBytes`.
    public static final long OFFSET_precedingExternallyEncodedBytes = LAYOUT.byteOffset(PathElement.groupElement("precedingExternallyEncodedBytes"));
    /// The memory layout of `precedingExternallyEncodedBytes`.
    public static final MemoryLayout LAYOUT_precedingExternallyEncodedBytes = LAYOUT.select(PathElement.groupElement("precedingExternallyEncodedBytes"));
    /// The [VarHandle] of `precedingExternallyEncodedBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_precedingExternallyEncodedBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("precedingExternallyEncodedBytes"));

    /// Creates `VkVideoEncodeInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeInfoKHR`
    public static VkVideoEncodeInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeInfoKHR copyFrom(VkVideoEncodeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `dstBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstBuffer(MemorySegment segment, long index) { return (long) VH_dstBuffer.get(segment, 0L, index); }
    /// {@return `dstBuffer`}
    public long dstBuffer() { return dstBuffer(this.segment(), 0L); }
    /// Sets `dstBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstBuffer(MemorySegment segment, long index, long value) { VH_dstBuffer.set(segment, 0L, index, value); }
    /// Sets `dstBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBuffer(long value) { dstBuffer(this.segment(), 0L, value); return this; }

    /// {@return `dstBufferOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstBufferOffset(MemorySegment segment, long index) { return (long) VH_dstBufferOffset.get(segment, 0L, index); }
    /// {@return `dstBufferOffset`}
    public long dstBufferOffset() { return dstBufferOffset(this.segment(), 0L); }
    /// Sets `dstBufferOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstBufferOffset(MemorySegment segment, long index, long value) { VH_dstBufferOffset.set(segment, 0L, index, value); }
    /// Sets `dstBufferOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBufferOffset(long value) { dstBufferOffset(this.segment(), 0L, value); return this; }

    /// {@return `dstBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstBufferRange(MemorySegment segment, long index) { return (long) VH_dstBufferRange.get(segment, 0L, index); }
    /// {@return `dstBufferRange`}
    public long dstBufferRange() { return dstBufferRange(this.segment(), 0L); }
    /// Sets `dstBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstBufferRange(MemorySegment segment, long index, long value) { VH_dstBufferRange.set(segment, 0L, index, value); }
    /// Sets `dstBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBufferRange(long value) { dstBufferRange(this.segment(), 0L, value); return this; }

    /// {@return `srcPictureResource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcPictureResource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcPictureResource, index), LAYOUT_srcPictureResource); }
    /// {@return `srcPictureResource`}
    public MemorySegment srcPictureResource() { return srcPictureResource(this.segment(), 0L); }
    /// Sets `srcPictureResource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcPictureResource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcPictureResource, index), LAYOUT_srcPictureResource.byteSize()); }
    /// Sets `srcPictureResource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR srcPictureResource(MemorySegment value) { srcPictureResource(this.segment(), 0L, value); return this; }

    /// {@return `pSetupReferenceSlot` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSetupReferenceSlot(MemorySegment segment, long index) { return (MemorySegment) VH_pSetupReferenceSlot.get(segment, 0L, index); }
    /// {@return `pSetupReferenceSlot`}
    public MemorySegment pSetupReferenceSlot() { return pSetupReferenceSlot(this.segment(), 0L); }
    /// Sets `pSetupReferenceSlot` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSetupReferenceSlot(MemorySegment segment, long index, MemorySegment value) { VH_pSetupReferenceSlot.set(segment, 0L, index, value); }
    /// Sets `pSetupReferenceSlot` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR pSetupReferenceSlot(MemorySegment value) { pSetupReferenceSlot(this.segment(), 0L, value); return this; }

    /// {@return `referenceSlotCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int referenceSlotCount(MemorySegment segment, long index) { return (int) VH_referenceSlotCount.get(segment, 0L, index); }
    /// {@return `referenceSlotCount`}
    public int referenceSlotCount() { return referenceSlotCount(this.segment(), 0L); }
    /// Sets `referenceSlotCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void referenceSlotCount(MemorySegment segment, long index, int value) { VH_referenceSlotCount.set(segment, 0L, index, value); }
    /// Sets `referenceSlotCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR referenceSlotCount(int value) { referenceSlotCount(this.segment(), 0L, value); return this; }

    /// {@return `pReferenceSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pReferenceSlots(MemorySegment segment, long index) { return (MemorySegment) VH_pReferenceSlots.get(segment, 0L, index); }
    /// {@return `pReferenceSlots`}
    public MemorySegment pReferenceSlots() { return pReferenceSlots(this.segment(), 0L); }
    /// Sets `pReferenceSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pReferenceSlots(MemorySegment segment, long index, MemorySegment value) { VH_pReferenceSlots.set(segment, 0L, index, value); }
    /// Sets `pReferenceSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR pReferenceSlots(MemorySegment value) { pReferenceSlots(this.segment(), 0L, value); return this; }

    /// {@return `precedingExternallyEncodedBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int precedingExternallyEncodedBytes(MemorySegment segment, long index) { return (int) VH_precedingExternallyEncodedBytes.get(segment, 0L, index); }
    /// {@return `precedingExternallyEncodedBytes`}
    public int precedingExternallyEncodedBytes() { return precedingExternallyEncodedBytes(this.segment(), 0L); }
    /// Sets `precedingExternallyEncodedBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void precedingExternallyEncodedBytes(MemorySegment segment, long index, int value) { VH_precedingExternallyEncodedBytes.set(segment, 0L, index, value); }
    /// Sets `precedingExternallyEncodedBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytes(int value) { precedingExternallyEncodedBytes(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeInfoKHR].
    public static final class Buffer extends VkVideoEncodeInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeInfoKHR`
        public VkVideoEncodeInfoKHR asSlice(long index) { return new VkVideoEncodeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeInfoKHR`
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

        /// {@return `dstBuffer` at the given index}
        /// @param index the index of the struct buffer
        public long dstBufferAt(long index) { return dstBuffer(this.segment(), index); }
        /// Sets `dstBuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstBufferAt(long index, long value) { dstBuffer(this.segment(), index, value); return this; }

        /// {@return `dstBufferOffset` at the given index}
        /// @param index the index of the struct buffer
        public long dstBufferOffsetAt(long index) { return dstBufferOffset(this.segment(), index); }
        /// Sets `dstBufferOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstBufferOffsetAt(long index, long value) { dstBufferOffset(this.segment(), index, value); return this; }

        /// {@return `dstBufferRange` at the given index}
        /// @param index the index of the struct buffer
        public long dstBufferRangeAt(long index) { return dstBufferRange(this.segment(), index); }
        /// Sets `dstBufferRange` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstBufferRangeAt(long index, long value) { dstBufferRange(this.segment(), index, value); return this; }

        /// {@return `srcPictureResource` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment srcPictureResourceAt(long index) { return srcPictureResource(this.segment(), index); }
        /// Sets `srcPictureResource` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcPictureResourceAt(long index, MemorySegment value) { srcPictureResource(this.segment(), index, value); return this; }

        /// {@return `pSetupReferenceSlot` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSetupReferenceSlotAt(long index) { return pSetupReferenceSlot(this.segment(), index); }
        /// Sets `pSetupReferenceSlot` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSetupReferenceSlotAt(long index, MemorySegment value) { pSetupReferenceSlot(this.segment(), index, value); return this; }

        /// {@return `referenceSlotCount` at the given index}
        /// @param index the index of the struct buffer
        public int referenceSlotCountAt(long index) { return referenceSlotCount(this.segment(), index); }
        /// Sets `referenceSlotCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer referenceSlotCountAt(long index, int value) { referenceSlotCount(this.segment(), index, value); return this; }

        /// {@return `pReferenceSlots` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pReferenceSlotsAt(long index) { return pReferenceSlots(this.segment(), index); }
        /// Sets `pReferenceSlots` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pReferenceSlotsAt(long index, MemorySegment value) { pReferenceSlots(this.segment(), index, value); return this; }

        /// {@return `precedingExternallyEncodedBytes` at the given index}
        /// @param index the index of the struct buffer
        public int precedingExternallyEncodedBytesAt(long index) { return precedingExternallyEncodedBytes(this.segment(), index); }
        /// Sets `precedingExternallyEncodedBytes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer precedingExternallyEncodedBytesAt(long index, int value) { precedingExternallyEncodedBytes(this.segment(), index, value); return this; }

    }
}
