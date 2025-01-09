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
/// ### srcBuffer
/// [VarHandle][#VH_srcBuffer] - [Getter][#srcBuffer()] - [Setter][#srcBuffer(java.lang.foreign.MemorySegment)]
/// ### srcBufferOffset
/// [VarHandle][#VH_srcBufferOffset] - [Getter][#srcBufferOffset()] - [Setter][#srcBufferOffset(long)]
/// ### srcBufferRange
/// [VarHandle][#VH_srcBufferRange] - [Getter][#srcBufferRange()] - [Setter][#srcBufferRange(long)]
/// ### dstPictureResource
/// [Byte offset][#OFFSET_dstPictureResource] - [Memory layout][#ML_dstPictureResource] - [Getter][#dstPictureResource()] - [Setter][#dstPictureResource(java.lang.foreign.MemorySegment)]
/// ### pSetupReferenceSlot
/// [VarHandle][#VH_pSetupReferenceSlot] - [Getter][#pSetupReferenceSlot()] - [Setter][#pSetupReferenceSlot(java.lang.foreign.MemorySegment)]
/// ### referenceSlotCount
/// [VarHandle][#VH_referenceSlotCount] - [Getter][#referenceSlotCount()] - [Setter][#referenceSlotCount(int)]
/// ### pReferenceSlots
/// [VarHandle][#VH_pReferenceSlots] - [Getter][#pReferenceSlots()] - [Setter][#pReferenceSlots(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoDecodeFlagsKHR flags;
///     VkBuffer srcBuffer;
///     VkDeviceSize srcBufferOffset;
///     VkDeviceSize srcBufferRange;
///     VkVideoPictureResourceInfoKHR dstPictureResource;
///     const VkVideoReferenceSlotInfoKHR * pSetupReferenceSlot;
///     uint32_t referenceSlotCount;
///     const VkVideoReferenceSlotInfoKHR * pReferenceSlots;
/// } VkVideoDecodeInfoKHR;
/// ```
public final class VkVideoDecodeInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("srcBuffer"),
        ValueLayout.JAVA_LONG.withName("srcBufferOffset"),
        ValueLayout.JAVA_LONG.withName("srcBufferRange"),
        overrungl.vulkan.khr.struct.VkVideoPictureResourceInfoKHR.LAYOUT.withName("dstPictureResource"),
        ValueLayout.ADDRESS.withName("pSetupReferenceSlot"),
        ValueLayout.JAVA_INT.withName("referenceSlotCount"),
        ValueLayout.ADDRESS.withName("pReferenceSlots")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `srcBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_srcBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBuffer"));
    /// The [VarHandle] of `srcBufferOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_srcBufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBufferOffset"));
    /// The [VarHandle] of `srcBufferRange` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_srcBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBufferRange"));
    /// The byte offset of `dstPictureResource`.
    public static final long OFFSET_dstPictureResource = LAYOUT.byteOffset(PathElement.groupElement("dstPictureResource"));
    /// The memory layout of `dstPictureResource`.
    public static final MemoryLayout ML_dstPictureResource = LAYOUT.select(PathElement.groupElement("dstPictureResource"));
    /// The [VarHandle] of `pSetupReferenceSlot` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSetupReferenceSlot = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetupReferenceSlot"));
    /// The [VarHandle] of `referenceSlotCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_referenceSlotCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceSlotCount"));
    /// The [VarHandle] of `pReferenceSlots` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pReferenceSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReferenceSlots"));

    /// Creates `VkVideoDecodeInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeInfoKHR(segment); }

    /// Creates `VkVideoDecodeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoDecodeInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeInfoKHR`
    public static VkVideoDecodeInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeInfoKHR`
    public static VkVideoDecodeInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoDecodeInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeInfoKHR`
    public VkVideoDecodeInfoKHR asSlice(long index) { return new VkVideoDecodeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoDecodeInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeInfoKHR`
    public VkVideoDecodeInfoKHR asSlice(long index, long count) { return new VkVideoDecodeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoDecodeFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoDecodeFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkVideoDecodeFlagsKHR") int flagsAt(long index) { return VkVideoDecodeInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkVideoDecodeFlagsKHR") int flags() { return VkVideoDecodeInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoDecodeFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoDecodeFlagsKHR") int value) { VkVideoDecodeInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR flagsAt(long index, @CType("VkVideoDecodeFlagsKHR") int value) { VkVideoDecodeInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR flags(@CType("VkVideoDecodeFlagsKHR") int value) { VkVideoDecodeInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `srcBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_srcBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_srcBuffer.get(segment, 0L, index); }
    /// {@return `srcBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_srcBuffer(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_srcBuffer(segment, 0L); }
    /// {@return `srcBuffer` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment srcBufferAt(long index) { return VkVideoDecodeInfoKHR.get_srcBuffer(this.segment(), index); }
    /// {@return `srcBuffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment srcBuffer() { return VkVideoDecodeInfoKHR.get_srcBuffer(this.segment()); }
    /// Sets `srcBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcBuffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_srcBuffer.set(segment, 0L, index, value); }
    /// Sets `srcBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcBuffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_srcBuffer(segment, 0L, value); }
    /// Sets `srcBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_srcBuffer(this.segment(), index, value); return this; }
    /// Sets `srcBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBuffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_srcBuffer(this.segment(), value); return this; }

    /// {@return `srcBufferOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_srcBufferOffset(MemorySegment segment, long index) { return (long) VH_srcBufferOffset.get(segment, 0L, index); }
    /// {@return `srcBufferOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_srcBufferOffset(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_srcBufferOffset(segment, 0L); }
    /// {@return `srcBufferOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long srcBufferOffsetAt(long index) { return VkVideoDecodeInfoKHR.get_srcBufferOffset(this.segment(), index); }
    /// {@return `srcBufferOffset`}
    public @CType("VkDeviceSize") long srcBufferOffset() { return VkVideoDecodeInfoKHR.get_srcBufferOffset(this.segment()); }
    /// Sets `srcBufferOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcBufferOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_srcBufferOffset.set(segment, 0L, index, value); }
    /// Sets `srcBufferOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcBufferOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.set_srcBufferOffset(segment, 0L, value); }
    /// Sets `srcBufferOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBufferOffsetAt(long index, @CType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.set_srcBufferOffset(this.segment(), index, value); return this; }
    /// Sets `srcBufferOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBufferOffset(@CType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.set_srcBufferOffset(this.segment(), value); return this; }

    /// {@return `srcBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_srcBufferRange(MemorySegment segment, long index) { return (long) VH_srcBufferRange.get(segment, 0L, index); }
    /// {@return `srcBufferRange`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_srcBufferRange(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_srcBufferRange(segment, 0L); }
    /// {@return `srcBufferRange` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long srcBufferRangeAt(long index) { return VkVideoDecodeInfoKHR.get_srcBufferRange(this.segment(), index); }
    /// {@return `srcBufferRange`}
    public @CType("VkDeviceSize") long srcBufferRange() { return VkVideoDecodeInfoKHR.get_srcBufferRange(this.segment()); }
    /// Sets `srcBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcBufferRange(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_srcBufferRange.set(segment, 0L, index, value); }
    /// Sets `srcBufferRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcBufferRange(MemorySegment segment, @CType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.set_srcBufferRange(segment, 0L, value); }
    /// Sets `srcBufferRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBufferRangeAt(long index, @CType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.set_srcBufferRange(this.segment(), index, value); return this; }
    /// Sets `srcBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR srcBufferRange(@CType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.set_srcBufferRange(this.segment(), value); return this; }

    /// {@return `dstPictureResource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment get_dstPictureResource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstPictureResource, index), ML_dstPictureResource); }
    /// {@return `dstPictureResource`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment get_dstPictureResource(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_dstPictureResource(segment, 0L); }
    /// {@return `dstPictureResource` at the given index}
    /// @param index the index
    public @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment dstPictureResourceAt(long index) { return VkVideoDecodeInfoKHR.get_dstPictureResource(this.segment(), index); }
    /// {@return `dstPictureResource`}
    public @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment dstPictureResource() { return VkVideoDecodeInfoKHR.get_dstPictureResource(this.segment()); }
    /// Sets `dstPictureResource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstPictureResource(MemorySegment segment, long index, @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstPictureResource, index), ML_dstPictureResource.byteSize()); }
    /// Sets `dstPictureResource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstPictureResource(MemorySegment segment, @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_dstPictureResource(segment, 0L, value); }
    /// Sets `dstPictureResource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR dstPictureResourceAt(long index, @CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_dstPictureResource(this.segment(), index, value); return this; }
    /// Sets `dstPictureResource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR dstPictureResource(@CType("VkVideoPictureResourceInfoKHR") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_dstPictureResource(this.segment(), value); return this; }

    /// {@return `pSetupReferenceSlot` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment get_pSetupReferenceSlot(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSetupReferenceSlot.get(segment, 0L, index); }
    /// {@return `pSetupReferenceSlot`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment get_pSetupReferenceSlot(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_pSetupReferenceSlot(segment, 0L); }
    /// {@return `pSetupReferenceSlot` at the given index}
    /// @param index the index
    public @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment pSetupReferenceSlotAt(long index) { return VkVideoDecodeInfoKHR.get_pSetupReferenceSlot(this.segment(), index); }
    /// {@return `pSetupReferenceSlot`}
    public @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment pSetupReferenceSlot() { return VkVideoDecodeInfoKHR.get_pSetupReferenceSlot(this.segment()); }
    /// Sets `pSetupReferenceSlot` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSetupReferenceSlot(MemorySegment segment, long index, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pSetupReferenceSlot.set(segment, 0L, index, value); }
    /// Sets `pSetupReferenceSlot` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSetupReferenceSlot(MemorySegment segment, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pSetupReferenceSlot(segment, 0L, value); }
    /// Sets `pSetupReferenceSlot` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR pSetupReferenceSlotAt(long index, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pSetupReferenceSlot(this.segment(), index, value); return this; }
    /// Sets `pSetupReferenceSlot` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR pSetupReferenceSlot(@CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pSetupReferenceSlot(this.segment(), value); return this; }

    /// {@return `referenceSlotCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_referenceSlotCount(MemorySegment segment, long index) { return (int) VH_referenceSlotCount.get(segment, 0L, index); }
    /// {@return `referenceSlotCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_referenceSlotCount(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_referenceSlotCount(segment, 0L); }
    /// {@return `referenceSlotCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int referenceSlotCountAt(long index) { return VkVideoDecodeInfoKHR.get_referenceSlotCount(this.segment(), index); }
    /// {@return `referenceSlotCount`}
    public @CType("uint32_t") int referenceSlotCount() { return VkVideoDecodeInfoKHR.get_referenceSlotCount(this.segment()); }
    /// Sets `referenceSlotCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_referenceSlotCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_referenceSlotCount.set(segment, 0L, index, value); }
    /// Sets `referenceSlotCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_referenceSlotCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoDecodeInfoKHR.set_referenceSlotCount(segment, 0L, value); }
    /// Sets `referenceSlotCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR referenceSlotCountAt(long index, @CType("uint32_t") int value) { VkVideoDecodeInfoKHR.set_referenceSlotCount(this.segment(), index, value); return this; }
    /// Sets `referenceSlotCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR referenceSlotCount(@CType("uint32_t") int value) { VkVideoDecodeInfoKHR.set_referenceSlotCount(this.segment(), value); return this; }

    /// {@return `pReferenceSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment get_pReferenceSlots(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pReferenceSlots.get(segment, 0L, index); }
    /// {@return `pReferenceSlots`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment get_pReferenceSlots(MemorySegment segment) { return VkVideoDecodeInfoKHR.get_pReferenceSlots(segment, 0L); }
    /// {@return `pReferenceSlots` at the given index}
    /// @param index the index
    public @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment pReferenceSlotsAt(long index) { return VkVideoDecodeInfoKHR.get_pReferenceSlots(this.segment(), index); }
    /// {@return `pReferenceSlots`}
    public @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment pReferenceSlots() { return VkVideoDecodeInfoKHR.get_pReferenceSlots(this.segment()); }
    /// Sets `pReferenceSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pReferenceSlots(MemorySegment segment, long index, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pReferenceSlots.set(segment, 0L, index, value); }
    /// Sets `pReferenceSlots` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pReferenceSlots(MemorySegment segment, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pReferenceSlots(segment, 0L, value); }
    /// Sets `pReferenceSlots` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR pReferenceSlotsAt(long index, @CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pReferenceSlots(this.segment(), index, value); return this; }
    /// Sets `pReferenceSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeInfoKHR pReferenceSlots(@CType("const VkVideoReferenceSlotInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoDecodeInfoKHR.set_pReferenceSlots(this.segment(), value); return this; }

}
