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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkComputePipelineIndirectBufferInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceAddress deviceAddress;
///     (uint64_t) VkDeviceSize size;
///     (uint64_t) VkDeviceAddress pipelineDeviceAddressCaptureReplay;
/// };
/// ```
public final class VkComputePipelineIndirectBufferInfoNV extends GroupType {
    /// The struct layout of `VkComputePipelineIndirectBufferInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("pipelineDeviceAddressCaptureReplay")
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
    /// The byte offset of `deviceAddress`.
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    /// The memory layout of `deviceAddress`.
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The byte offset of `pipelineDeviceAddressCaptureReplay`.
    public static final long OFFSET_pipelineDeviceAddressCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("pipelineDeviceAddressCaptureReplay"));
    /// The memory layout of `pipelineDeviceAddressCaptureReplay`.
    public static final MemoryLayout LAYOUT_pipelineDeviceAddressCaptureReplay = LAYOUT.select(PathElement.groupElement("pipelineDeviceAddressCaptureReplay"));
    /// The [VarHandle] of `pipelineDeviceAddressCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineDeviceAddressCaptureReplay"));

    /// Creates `VkComputePipelineIndirectBufferInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkComputePipelineIndirectBufferInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkComputePipelineIndirectBufferInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineIndirectBufferInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkComputePipelineIndirectBufferInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineIndirectBufferInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkComputePipelineIndirectBufferInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineIndirectBufferInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV alloc(SegmentAllocator allocator) { return new VkComputePipelineIndirectBufferInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV alloc(SegmentAllocator allocator, long count) { return new VkComputePipelineIndirectBufferInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceAddress `deviceAddress`
    /// @param size `size`
    /// @param pipelineDeviceAddressCaptureReplay `pipelineDeviceAddressCaptureReplay`
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long deviceAddress, long size, long pipelineDeviceAddressCaptureReplay) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceAddress(deviceAddress).size(size).pipelineDeviceAddressCaptureReplay(pipelineDeviceAddressCaptureReplay);
    }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceAddress `deviceAddress`
    /// @param size `size`
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long deviceAddress, long size) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceAddress(deviceAddress).size(size);
    }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param deviceAddress `deviceAddress`
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long deviceAddress) {
        return alloc(allocator).sType(sType).pNext(pNext).deviceAddress(deviceAddress);
    }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV copyFrom(VkComputePipelineIndirectBufferInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkComputePipelineIndirectBufferInfoNV reinterpret(long count) { return new VkComputePipelineIndirectBufferInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkComputePipelineIndirectBufferInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkComputePipelineIndirectBufferInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    public long deviceAddress() { return deviceAddress(this.segment(), 0L); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceAddress(MemorySegment segment, long index, long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV deviceAddress(long value) { deviceAddress(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    public long size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV size(long value) { size(this.segment(), 0L, value); return this; }

    /// {@return `pipelineDeviceAddressCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipelineDeviceAddressCaptureReplay(MemorySegment segment, long index) { return (long) VH_pipelineDeviceAddressCaptureReplay.get(segment, 0L, index); }
    /// {@return `pipelineDeviceAddressCaptureReplay`}
    public long pipelineDeviceAddressCaptureReplay() { return pipelineDeviceAddressCaptureReplay(this.segment(), 0L); }
    /// Sets `pipelineDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineDeviceAddressCaptureReplay(MemorySegment segment, long index, long value) { VH_pipelineDeviceAddressCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `pipelineDeviceAddressCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV pipelineDeviceAddressCaptureReplay(long value) { pipelineDeviceAddressCaptureReplay(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkComputePipelineIndirectBufferInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkComputePipelineIndirectBufferInfoNV`
    public VkComputePipelineIndirectBufferInfoNV asSlice(long index) { return new VkComputePipelineIndirectBufferInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkComputePipelineIndirectBufferInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkComputePipelineIndirectBufferInfoNV`
    public VkComputePipelineIndirectBufferInfoNV asSlice(long index, long count) { return new VkComputePipelineIndirectBufferInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkComputePipelineIndirectBufferInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV at(long index, Consumer<VkComputePipelineIndirectBufferInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param index the index of the struct buffer
    public long deviceAddressAt(long index) { return deviceAddress(this.segment(), index); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV deviceAddressAt(long index, long value) { deviceAddress(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public long sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV sizeAt(long index, long value) { size(this.segment(), index, value); return this; }

    /// {@return `pipelineDeviceAddressCaptureReplay` at the given index}
    /// @param index the index of the struct buffer
    public long pipelineDeviceAddressCaptureReplayAt(long index) { return pipelineDeviceAddressCaptureReplay(this.segment(), index); }
    /// Sets `pipelineDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV pipelineDeviceAddressCaptureReplayAt(long index, long value) { pipelineDeviceAddressCaptureReplay(this.segment(), index, value); return this; }

}
