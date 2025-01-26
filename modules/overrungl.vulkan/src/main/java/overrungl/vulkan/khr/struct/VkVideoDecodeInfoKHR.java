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
/// struct VkVideoDecodeInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkVideoDecodeFlagsKHR flags;
///     VkBuffer srcBuffer;
///     VkDeviceSize srcBufferOffset;
///     VkDeviceSize srcBufferRange;
///     VkVideoPictureResourceInfoKHR dstPictureResource;
///     const VkVideoReferenceSlotInfoKHR* pSetupReferenceSlot;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR* pReferenceSlots;
/// };
/// ```
public sealed class VkVideoDecodeInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("srcBuffer"),
        ValueLayout.JAVA_LONG.withName("srcBufferOffset"),
        ValueLayout.JAVA_LONG.withName("srcBufferRange"),
        overrungl.vulkan.khr.struct.VkVideoPictureResourceInfoKHR.LAYOUT.withName("dstPictureResource"),
        ValueLayout.ADDRESS.withName("pSetupReferenceSlot"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots")
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
    /// The byte offset of `srcBuffer`.
    public static final long OFFSET_srcBuffer = LAYOUT.byteOffset(PathElement.groupElement("srcBuffer"));
    /// The memory layout of `srcBuffer`.
    public static final MemoryLayout LAYOUT_srcBuffer = LAYOUT.select(PathElement.groupElement("srcBuffer"));
    /// The [VarHandle] of `srcBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBuffer"));
    /// The byte offset of `srcBufferOffset`.
    public static final long OFFSET_srcBufferOffset = LAYOUT.byteOffset(PathElement.groupElement("srcBufferOffset"));
    /// The memory layout of `srcBufferOffset`.
    public static final MemoryLayout LAYOUT_srcBufferOffset = LAYOUT.select(PathElement.groupElement("srcBufferOffset"));
    /// The [VarHandle] of `srcBufferOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcBufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBufferOffset"));
    /// The byte offset of `srcBufferRange`.
    public static final long OFFSET_srcBufferRange = LAYOUT.byteOffset(PathElement.groupElement("srcBufferRange"));
    /// The memory layout of `srcBufferRange`.
    public static final MemoryLayout LAYOUT_srcBufferRange = LAYOUT.select(PathElement.groupElement("srcBufferRange"));
    /// The [VarHandle] of `srcBufferRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBufferRange"));
    /// The byte offset of `dstPictureResource`.
    public static final long OFFSET_dstPictureResource = LAYOUT.byteOffset(PathElement.groupElement("dstPictureResource"));
    /// The memory layout of `dstPictureResource`.
    public static final MemoryLayout LAYOUT_dstPictureResource = LAYOUT.select(PathElement.groupElement("dstPictureResource"));
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

    /// Creates `VkVideoDecodeInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeInfoKHR`
    public static VkVideoDecodeInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeInfoKHR copyFrom(VkVideoDecodeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoDecodeInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `srcBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcBuffer(MemorySegment segment, long index) { return (long) VH_srcBuffer.get(segment, 0L, index); }
    /// {@return `srcBuffer`}
    public long srcBuffer() { return srcBuffer(this.segment(), 0L); }
    /// Sets `srcBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcBuffer(MemorySegment segment, long index, long value) { VH_srcBuffer.set(segment, 0L, index, value); }
    /// Sets `srcBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBuffer(long value) { srcBuffer(this.segment(), 0L, value); return this; }

    /// {@return `srcBufferOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcBufferOffset(MemorySegment segment, long index) { return (long) VH_srcBufferOffset.get(segment, 0L, index); }
    /// {@return `srcBufferOffset`}
    public long srcBufferOffset() { return srcBufferOffset(this.segment(), 0L); }
    /// Sets `srcBufferOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcBufferOffset(MemorySegment segment, long index, long value) { VH_srcBufferOffset.set(segment, 0L, index, value); }
    /// Sets `srcBufferOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBufferOffset(long value) { srcBufferOffset(this.segment(), 0L, value); return this; }

    /// {@return `srcBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcBufferRange(MemorySegment segment, long index) { return (long) VH_srcBufferRange.get(segment, 0L, index); }
    /// {@return `srcBufferRange`}
    public long srcBufferRange() { return srcBufferRange(this.segment(), 0L); }
    /// Sets `srcBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcBufferRange(MemorySegment segment, long index, long value) { VH_srcBufferRange.set(segment, 0L, index, value); }
    /// Sets `srcBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBufferRange(long value) { srcBufferRange(this.segment(), 0L, value); return this; }

    /// {@return `dstPictureResource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstPictureResource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstPictureResource, index), LAYOUT_dstPictureResource); }
    /// {@return `dstPictureResource`}
    public MemorySegment dstPictureResource() { return dstPictureResource(this.segment(), 0L); }
    /// Sets `dstPictureResource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstPictureResource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstPictureResource, index), LAYOUT_dstPictureResource.byteSize()); }
    /// Sets `dstPictureResource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR dstPictureResource(MemorySegment value) { dstPictureResource(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeInfoKHR pSetupReferenceSlot(MemorySegment value) { pSetupReferenceSlot(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeInfoKHR referenceSlotCount(int value) { referenceSlotCount(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeInfoKHR pReferenceSlots(MemorySegment value) { pReferenceSlots(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoDecodeInfoKHR].
    public static final class Buffer extends VkVideoDecodeInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeInfoKHR`
        public VkVideoDecodeInfoKHR asSlice(long index) { return new VkVideoDecodeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeInfoKHR`
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

        /// {@return `srcBuffer` at the given index}
        /// @param index the index of the struct buffer
        public long srcBufferAt(long index) { return srcBuffer(this.segment(), index); }
        /// Sets `srcBuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcBufferAt(long index, long value) { srcBuffer(this.segment(), index, value); return this; }

        /// {@return `srcBufferOffset` at the given index}
        /// @param index the index of the struct buffer
        public long srcBufferOffsetAt(long index) { return srcBufferOffset(this.segment(), index); }
        /// Sets `srcBufferOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcBufferOffsetAt(long index, long value) { srcBufferOffset(this.segment(), index, value); return this; }

        /// {@return `srcBufferRange` at the given index}
        /// @param index the index of the struct buffer
        public long srcBufferRangeAt(long index) { return srcBufferRange(this.segment(), index); }
        /// Sets `srcBufferRange` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcBufferRangeAt(long index, long value) { srcBufferRange(this.segment(), index, value); return this; }

        /// {@return `dstPictureResource` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment dstPictureResourceAt(long index) { return dstPictureResource(this.segment(), index); }
        /// Sets `dstPictureResource` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstPictureResourceAt(long index, MemorySegment value) { dstPictureResource(this.segment(), index, value); return this; }

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

    }
}
