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
package overrungl.vulkan.khr.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### dstBuffer
/// [VarHandle][#VH_dstBuffer] - [Getter][#dstBuffer()] - [Setter][#dstBuffer(java.lang.foreign.MemorySegment)]
/// ### dstBufferOffset
/// [VarHandle][#VH_dstBufferOffset] - [Getter][#dstBufferOffset()] - [Setter][#dstBufferOffset(long)]
/// ### dstBufferRange
/// [VarHandle][#VH_dstBufferRange] - [Getter][#dstBufferRange()] - [Setter][#dstBufferRange(long)]
/// ### srcPictureResource
/// [Byte offset][#OFFSET_srcPictureResource] - [Memory layout][#ML_srcPictureResource] - [Getter][#srcPictureResource()] - [Setter][#srcPictureResource(java.lang.foreign.MemorySegment)]
/// ### pSetupReferenceSlot
/// [VarHandle][#VH_pSetupReferenceSlot] - [Getter][#pSetupReferenceSlot()] - [Setter][#pSetupReferenceSlot(java.lang.foreign.MemorySegment)]
/// ### referenceSlotCount
/// [VarHandle][#VH_referenceSlotCount] - [Getter][#referenceSlotCount()] - [Setter][#referenceSlotCount(int)]
/// ### pReferenceSlots
/// [VarHandle][#VH_pReferenceSlots] - [Getter][#pReferenceSlots()] - [Setter][#pReferenceSlots(java.lang.foreign.MemorySegment)]
/// ### precedingExternallyEncodedBytes
/// [VarHandle][#VH_precedingExternallyEncodedBytes] - [Getter][#precedingExternallyEncodedBytes()] - [Setter][#precedingExternallyEncodedBytes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoEncodeFlagsKHR flags;
///     VkBuffer dstBuffer;
///     VkDeviceSize dstBufferOffset;
///     VkDeviceSize dstBufferRange;
///     VkVideoPictureResourceInfoKHR srcPictureResource;
///     const VkVideoReferenceSlotInfoKHR * pSetupReferenceSlot;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR * pReferenceSlots;
///     uint32_t precedingExternallyEncodedBytes;
/// } VkVideoEncodeInfoKHR;
/// ```
public final class VkVideoEncodeInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("dstBuffer"),
        ValueLayout.JAVA_LONG.withName("dstBufferOffset"),
        ValueLayout.JAVA_LONG.withName("dstBufferRange"),
        overrungl.vulkan.khr.struct.VkVideoPictureResourceInfoKHR.LAYOUT.withName("srcPictureResource"),
        ValueLayout.ADDRESS.withName("pSetupReferenceSlot"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots"),
        ValueLayout.JAVA_INT.withName("precedingExternallyEncodedBytes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `dstBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dstBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBuffer"));
    /// The [VarHandle] of `dstBufferOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dstBufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBufferOffset"));
    /// The [VarHandle] of `dstBufferRange` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dstBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBufferRange"));
    /// The byte offset of `srcPictureResource`.
    public static final long OFFSET_srcPictureResource = LAYOUT.byteOffset(PathElement.groupElement("srcPictureResource"));
    /// The memory layout of `srcPictureResource`.
    public static final MemoryLayout ML_srcPictureResource = LAYOUT.select(PathElement.groupElement("srcPictureResource"));
    /// The [VarHandle] of `pSetupReferenceSlot` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSetupReferenceSlot = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetupReferenceSlot"));
    /// The [VarHandle] of `referenceSlotCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_referenceSlotCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceSlotCount"));
    /// The [VarHandle] of `pReferenceSlots` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pReferenceSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReferenceSlots"));
    /// The [VarHandle] of `precedingExternallyEncodedBytes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_precedingExternallyEncodedBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("precedingExternallyEncodedBytes"));

    /// Creates `VkVideoEncodeInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeInfoKHR(segment); }

    /// Creates `VkVideoEncodeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeInfoKHR`
    public static VkVideoEncodeInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeInfoKHR`
    public static VkVideoEncodeInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeFlagsKHR") int flagsAt(long index) { return VkVideoEncodeInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkVideoEncodeFlagsKHR") int flags() { return VkVideoEncodeInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoEncodeFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoEncodeFlagsKHR") int value) { VkVideoEncodeInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR flagsAt(long index, @CType("VkVideoEncodeFlagsKHR") int value) { VkVideoEncodeInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR flags(@CType("VkVideoEncodeFlagsKHR") int value) { VkVideoEncodeInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `dstBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_dstBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dstBuffer.get(segment, 0L, index); }
    /// {@return `dstBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_dstBuffer(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_dstBuffer(segment, 0L); }
    /// {@return `dstBuffer` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment dstBufferAt(long index) { return VkVideoEncodeInfoKHR.get_dstBuffer(this.segment(), index); }
    /// {@return `dstBuffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment dstBuffer() { return VkVideoEncodeInfoKHR.get_dstBuffer(this.segment()); }
    /// Sets `dstBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstBuffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_dstBuffer.set(segment, 0L, index, value); }
    /// Sets `dstBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstBuffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_dstBuffer(segment, 0L, value); }
    /// Sets `dstBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_dstBuffer(this.segment(), index, value); return this; }
    /// Sets `dstBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBuffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_dstBuffer(this.segment(), value); return this; }

    /// {@return `dstBufferOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_dstBufferOffset(MemorySegment segment, long index) { return (long) VH_dstBufferOffset.get(segment, 0L, index); }
    /// {@return `dstBufferOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_dstBufferOffset(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_dstBufferOffset(segment, 0L); }
    /// {@return `dstBufferOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long dstBufferOffsetAt(long index) { return VkVideoEncodeInfoKHR.get_dstBufferOffset(this.segment(), index); }
    /// {@return `dstBufferOffset`}
    public @CType("VkDeviceSize") long dstBufferOffset() { return VkVideoEncodeInfoKHR.get_dstBufferOffset(this.segment()); }
    /// Sets `dstBufferOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstBufferOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_dstBufferOffset.set(segment, 0L, index, value); }
    /// Sets `dstBufferOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstBufferOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.set_dstBufferOffset(segment, 0L, value); }
    /// Sets `dstBufferOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBufferOffsetAt(long index, @CType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.set_dstBufferOffset(this.segment(), index, value); return this; }
    /// Sets `dstBufferOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBufferOffset(@CType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.set_dstBufferOffset(this.segment(), value); return this; }

    /// {@return `dstBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_dstBufferRange(MemorySegment segment, long index) { return (long) VH_dstBufferRange.get(segment, 0L, index); }
    /// {@return `dstBufferRange`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_dstBufferRange(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_dstBufferRange(segment, 0L); }
    /// {@return `dstBufferRange` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long dstBufferRangeAt(long index) { return VkVideoEncodeInfoKHR.get_dstBufferRange(this.segment(), index); }
    /// {@return `dstBufferRange`}
    public @CType("VkDeviceSize") long dstBufferRange() { return VkVideoEncodeInfoKHR.get_dstBufferRange(this.segment()); }
    /// Sets `dstBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstBufferRange(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_dstBufferRange.set(segment, 0L, index, value); }
    /// Sets `dstBufferRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstBufferRange(MemorySegment segment, @CType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.set_dstBufferRange(segment, 0L, value); }
    /// Sets `dstBufferRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBufferRangeAt(long index, @CType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.set_dstBufferRange(this.segment(), index, value); return this; }
    /// Sets `dstBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR dstBufferRange(@CType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.set_dstBufferRange(this.segment(), value); return this; }

    /// {@return `srcPictureResource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment get_srcPictureResource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcPictureResource, index), ML_srcPictureResource); }
    /// {@return `srcPictureResource`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment get_srcPictureResource(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_srcPictureResource(segment, 0L); }
    /// {@return `srcPictureResource` at the given index}
    /// @param index the index
    public @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment srcPictureResourceAt(long index) { return VkVideoEncodeInfoKHR.get_srcPictureResource(this.segment(), index); }
    /// {@return `srcPictureResource`}
    public @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment srcPictureResource() { return VkVideoEncodeInfoKHR.get_srcPictureResource(this.segment()); }
    /// Sets `srcPictureResource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcPictureResource(MemorySegment segment, long index, @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcPictureResource, index), ML_srcPictureResource.byteSize()); }
    /// Sets `srcPictureResource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcPictureResource(MemorySegment segment, @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_srcPictureResource(segment, 0L, value); }
    /// Sets `srcPictureResource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR srcPictureResourceAt(long index, @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_srcPictureResource(this.segment(), index, value); return this; }
    /// Sets `srcPictureResource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR srcPictureResource(@CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_srcPictureResource(this.segment(), value); return this; }

    /// {@return `pSetupReferenceSlot` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment get_pSetupReferenceSlot(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSetupReferenceSlot.get(segment, 0L, index); }
    /// {@return `pSetupReferenceSlot`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment get_pSetupReferenceSlot(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_pSetupReferenceSlot(segment, 0L); }
    /// {@return `pSetupReferenceSlot` at the given index}
    /// @param index the index
    public @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment pSetupReferenceSlotAt(long index) { return VkVideoEncodeInfoKHR.get_pSetupReferenceSlot(this.segment(), index); }
    /// {@return `pSetupReferenceSlot`}
    public @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment pSetupReferenceSlot() { return VkVideoEncodeInfoKHR.get_pSetupReferenceSlot(this.segment()); }
    /// Sets `pSetupReferenceSlot` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSetupReferenceSlot(MemorySegment segment, long index, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pSetupReferenceSlot.set(segment, 0L, index, value); }
    /// Sets `pSetupReferenceSlot` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSetupReferenceSlot(MemorySegment segment, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pSetupReferenceSlot(segment, 0L, value); }
    /// Sets `pSetupReferenceSlot` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR pSetupReferenceSlotAt(long index, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pSetupReferenceSlot(this.segment(), index, value); return this; }
    /// Sets `pSetupReferenceSlot` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR pSetupReferenceSlot(@CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pSetupReferenceSlot(this.segment(), value); return this; }

    /// {@return `referenceSlotCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_referenceSlotCount(MemorySegment segment, long index) { return (int) VH_referenceSlotCount.get(segment, 0L, index); }
    /// {@return `referenceSlotCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_referenceSlotCount(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_referenceSlotCount(segment, 0L); }
    /// {@return `referenceSlotCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int referenceSlotCountAt(long index) { return VkVideoEncodeInfoKHR.get_referenceSlotCount(this.segment(), index); }
    /// {@return `referenceSlotCount`}
    public @CType("uint32_t") int referenceSlotCount() { return VkVideoEncodeInfoKHR.get_referenceSlotCount(this.segment()); }
    /// Sets `referenceSlotCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_referenceSlotCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_referenceSlotCount.set(segment, 0L, index, value); }
    /// Sets `referenceSlotCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_referenceSlotCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeInfoKHR.set_referenceSlotCount(segment, 0L, value); }
    /// Sets `referenceSlotCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR referenceSlotCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeInfoKHR.set_referenceSlotCount(this.segment(), index, value); return this; }
    /// Sets `referenceSlotCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR referenceSlotCount(@CType("uint32_t") int value) { VkVideoEncodeInfoKHR.set_referenceSlotCount(this.segment(), value); return this; }

    /// {@return `pReferenceSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment get_pReferenceSlots(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pReferenceSlots.get(segment, 0L, index); }
    /// {@return `pReferenceSlots`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment get_pReferenceSlots(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_pReferenceSlots(segment, 0L); }
    /// {@return `pReferenceSlots` at the given index}
    /// @param index the index
    public @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment pReferenceSlotsAt(long index) { return VkVideoEncodeInfoKHR.get_pReferenceSlots(this.segment(), index); }
    /// {@return `pReferenceSlots`}
    public @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment pReferenceSlots() { return VkVideoEncodeInfoKHR.get_pReferenceSlots(this.segment()); }
    /// Sets `pReferenceSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pReferenceSlots(MemorySegment segment, long index, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pReferenceSlots.set(segment, 0L, index, value); }
    /// Sets `pReferenceSlots` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pReferenceSlots(MemorySegment segment, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pReferenceSlots(segment, 0L, value); }
    /// Sets `pReferenceSlots` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR pReferenceSlotsAt(long index, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pReferenceSlots(this.segment(), index, value); return this; }
    /// Sets `pReferenceSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR pReferenceSlots(@CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeInfoKHR.set_pReferenceSlots(this.segment(), value); return this; }

    /// {@return `precedingExternallyEncodedBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_precedingExternallyEncodedBytes(MemorySegment segment, long index) { return (int) VH_precedingExternallyEncodedBytes.get(segment, 0L, index); }
    /// {@return `precedingExternallyEncodedBytes`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_precedingExternallyEncodedBytes(MemorySegment segment) { return VkVideoEncodeInfoKHR.get_precedingExternallyEncodedBytes(segment, 0L); }
    /// {@return `precedingExternallyEncodedBytes` at the given index}
    /// @param index the index
    public @CType("uint32_t") int precedingExternallyEncodedBytesAt(long index) { return VkVideoEncodeInfoKHR.get_precedingExternallyEncodedBytes(this.segment(), index); }
    /// {@return `precedingExternallyEncodedBytes`}
    public @CType("uint32_t") int precedingExternallyEncodedBytes() { return VkVideoEncodeInfoKHR.get_precedingExternallyEncodedBytes(this.segment()); }
    /// Sets `precedingExternallyEncodedBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_precedingExternallyEncodedBytes(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_precedingExternallyEncodedBytes.set(segment, 0L, index, value); }
    /// Sets `precedingExternallyEncodedBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_precedingExternallyEncodedBytes(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeInfoKHR.set_precedingExternallyEncodedBytes(segment, 0L, value); }
    /// Sets `precedingExternallyEncodedBytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytesAt(long index, @CType("uint32_t") int value) { VkVideoEncodeInfoKHR.set_precedingExternallyEncodedBytes(this.segment(), index, value); return this; }
    /// Sets `precedingExternallyEncodedBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytes(@CType("uint32_t") int value) { VkVideoEncodeInfoKHR.set_precedingExternallyEncodedBytes(this.segment(), value); return this; }

}
