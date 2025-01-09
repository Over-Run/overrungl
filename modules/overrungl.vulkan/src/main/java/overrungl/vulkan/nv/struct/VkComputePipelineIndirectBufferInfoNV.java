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
package overrungl.vulkan.nv.struct;

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
/// ### deviceAddress
/// [VarHandle][#VH_deviceAddress] - [Getter][#deviceAddress()] - [Setter][#deviceAddress(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### pipelineDeviceAddressCaptureReplay
/// [VarHandle][#VH_pipelineDeviceAddressCaptureReplay] - [Getter][#pipelineDeviceAddressCaptureReplay()] - [Setter][#pipelineDeviceAddressCaptureReplay(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkComputePipelineIndirectBufferInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceAddress deviceAddress;
///     VkDeviceSize size;
///     VkDeviceAddress pipelineDeviceAddressCaptureReplay;
/// } VkComputePipelineIndirectBufferInfoNV;
/// ```
public final class VkComputePipelineIndirectBufferInfoNV extends Struct {
    /// The struct layout of `VkComputePipelineIndirectBufferInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("pipelineDeviceAddressCaptureReplay")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `pipelineDeviceAddressCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_pipelineDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineDeviceAddressCaptureReplay"));

    /// Creates `VkComputePipelineIndirectBufferInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkComputePipelineIndirectBufferInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkComputePipelineIndirectBufferInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineIndirectBufferInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment); }

    /// Creates `VkComputePipelineIndirectBufferInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineIndirectBufferInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkComputePipelineIndirectBufferInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineIndirectBufferInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkComputePipelineIndirectBufferInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV alloc(SegmentAllocator allocator) { return new VkComputePipelineIndirectBufferInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkComputePipelineIndirectBufferInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkComputePipelineIndirectBufferInfoNV`
    public static VkComputePipelineIndirectBufferInfoNV alloc(SegmentAllocator allocator, long count) { return new VkComputePipelineIndirectBufferInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkComputePipelineIndirectBufferInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkComputePipelineIndirectBufferInfoNV`
    public VkComputePipelineIndirectBufferInfoNV asSlice(long index) { return new VkComputePipelineIndirectBufferInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkComputePipelineIndirectBufferInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkComputePipelineIndirectBufferInfoNV`
    public VkComputePipelineIndirectBufferInfoNV asSlice(long index, long count) { return new VkComputePipelineIndirectBufferInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkComputePipelineIndirectBufferInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkComputePipelineIndirectBufferInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkComputePipelineIndirectBufferInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkComputePipelineIndirectBufferInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkComputePipelineIndirectBufferInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV sType(@CType("VkStructureType") int value) { VkComputePipelineIndirectBufferInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkComputePipelineIndirectBufferInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkComputePipelineIndirectBufferInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkComputePipelineIndirectBufferInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkComputePipelineIndirectBufferInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkComputePipelineIndirectBufferInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkComputePipelineIndirectBufferInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment, long index) { return (long) VH_deviceAddress.get(segment, 0L, index); }
    /// {@return `deviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_deviceAddress(MemorySegment segment) { return VkComputePipelineIndirectBufferInfoNV.get_deviceAddress(segment, 0L); }
    /// {@return `deviceAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long deviceAddressAt(long index) { return VkComputePipelineIndirectBufferInfoNV.get_deviceAddress(this.segment(), index); }
    /// {@return `deviceAddress`}
    public @CType("VkDeviceAddress") long deviceAddress() { return VkComputePipelineIndirectBufferInfoNV.get_deviceAddress(this.segment()); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_deviceAddress.set(segment, 0L, index, value); }
    /// Sets `deviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkComputePipelineIndirectBufferInfoNV.set_deviceAddress(segment, 0L, value); }
    /// Sets `deviceAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV deviceAddressAt(long index, @CType("VkDeviceAddress") long value) { VkComputePipelineIndirectBufferInfoNV.set_deviceAddress(this.segment(), index, value); return this; }
    /// Sets `deviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV deviceAddress(@CType("VkDeviceAddress") long value) { VkComputePipelineIndirectBufferInfoNV.set_deviceAddress(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkComputePipelineIndirectBufferInfoNV.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkComputePipelineIndirectBufferInfoNV.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkComputePipelineIndirectBufferInfoNV.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkComputePipelineIndirectBufferInfoNV.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV sizeAt(long index, @CType("VkDeviceSize") long value) { VkComputePipelineIndirectBufferInfoNV.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV size(@CType("VkDeviceSize") long value) { VkComputePipelineIndirectBufferInfoNV.set_size(this.segment(), value); return this; }

    /// {@return `pipelineDeviceAddressCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_pipelineDeviceAddressCaptureReplay(MemorySegment segment, long index) { return (long) VH_pipelineDeviceAddressCaptureReplay.get(segment, 0L, index); }
    /// {@return `pipelineDeviceAddressCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_pipelineDeviceAddressCaptureReplay(MemorySegment segment) { return VkComputePipelineIndirectBufferInfoNV.get_pipelineDeviceAddressCaptureReplay(segment, 0L); }
    /// {@return `pipelineDeviceAddressCaptureReplay` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long pipelineDeviceAddressCaptureReplayAt(long index) { return VkComputePipelineIndirectBufferInfoNV.get_pipelineDeviceAddressCaptureReplay(this.segment(), index); }
    /// {@return `pipelineDeviceAddressCaptureReplay`}
    public @CType("VkDeviceAddress") long pipelineDeviceAddressCaptureReplay() { return VkComputePipelineIndirectBufferInfoNV.get_pipelineDeviceAddressCaptureReplay(this.segment()); }
    /// Sets `pipelineDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineDeviceAddressCaptureReplay(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_pipelineDeviceAddressCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `pipelineDeviceAddressCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineDeviceAddressCaptureReplay(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkComputePipelineIndirectBufferInfoNV.set_pipelineDeviceAddressCaptureReplay(segment, 0L, value); }
    /// Sets `pipelineDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV pipelineDeviceAddressCaptureReplayAt(long index, @CType("VkDeviceAddress") long value) { VkComputePipelineIndirectBufferInfoNV.set_pipelineDeviceAddressCaptureReplay(this.segment(), index, value); return this; }
    /// Sets `pipelineDeviceAddressCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineIndirectBufferInfoNV pipelineDeviceAddressCaptureReplay(@CType("VkDeviceAddress") long value) { VkComputePipelineIndirectBufferInfoNV.set_pipelineDeviceAddressCaptureReplay(this.segment(), value); return this; }

}
