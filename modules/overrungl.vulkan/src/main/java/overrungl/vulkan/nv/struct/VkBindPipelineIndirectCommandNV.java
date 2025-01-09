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
/// ### pipelineAddress
/// [VarHandle][#VH_pipelineAddress] - [Getter][#pipelineAddress()] - [Setter][#pipelineAddress(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindPipelineIndirectCommandNV {
///     VkDeviceAddress pipelineAddress;
/// } VkBindPipelineIndirectCommandNV;
/// ```
public final class VkBindPipelineIndirectCommandNV extends Struct {
    /// The struct layout of `VkBindPipelineIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("pipelineAddress")
    );
    /// The [VarHandle] of `pipelineAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_pipelineAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineAddress"));

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkBindPipelineIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindPipelineIndirectCommandNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindPipelineIndirectCommandNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindPipelineIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindPipelineIndirectCommandNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBindPipelineIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindPipelineIndirectCommandNV`
    public static VkBindPipelineIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindPipelineIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindPipelineIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindPipelineIndirectCommandNV`
    public static VkBindPipelineIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBindPipelineIndirectCommandNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `pipelineAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_pipelineAddress(MemorySegment segment, long index) { return (long) VH_pipelineAddress.get(segment, 0L, index); }
    /// {@return `pipelineAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_pipelineAddress(MemorySegment segment) { return VkBindPipelineIndirectCommandNV.get_pipelineAddress(segment, 0L); }
    /// {@return `pipelineAddress` at the given index}
    /// @param index the index
    public @CType("VkDeviceAddress") long pipelineAddressAt(long index) { return VkBindPipelineIndirectCommandNV.get_pipelineAddress(this.segment(), index); }
    /// {@return `pipelineAddress`}
    public @CType("VkDeviceAddress") long pipelineAddress() { return VkBindPipelineIndirectCommandNV.get_pipelineAddress(this.segment()); }
    /// Sets `pipelineAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_pipelineAddress.set(segment, 0L, index, value); }
    /// Sets `pipelineAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkBindPipelineIndirectCommandNV.set_pipelineAddress(segment, 0L, value); }
    /// Sets `pipelineAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBindPipelineIndirectCommandNV pipelineAddressAt(long index, @CType("VkDeviceAddress") long value) { VkBindPipelineIndirectCommandNV.set_pipelineAddress(this.segment(), index, value); return this; }
    /// Sets `pipelineAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindPipelineIndirectCommandNV pipelineAddress(@CType("VkDeviceAddress") long value) { VkBindPipelineIndirectCommandNV.set_pipelineAddress(this.segment(), value); return this; }

}
