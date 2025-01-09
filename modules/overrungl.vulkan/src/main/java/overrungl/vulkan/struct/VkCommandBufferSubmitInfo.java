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
package overrungl.vulkan.struct;

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
/// ### commandBuffer
/// [VarHandle][#VH_commandBuffer] - [Getter][#commandBuffer()] - [Setter][#commandBuffer(java.lang.foreign.MemorySegment)]
/// ### deviceMask
/// [VarHandle][#VH_deviceMask] - [Getter][#deviceMask()] - [Setter][#deviceMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandBufferSubmitInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkCommandBuffer commandBuffer;
///     uint32_t deviceMask;
/// } VkCommandBufferSubmitInfo;
/// ```
public final class VkCommandBufferSubmitInfo extends Struct {
    /// The struct layout of `VkCommandBufferSubmitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandBuffer"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `commandBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_commandBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBuffer"));
    /// The [VarHandle] of `deviceMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferSubmitInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferSubmitInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferSubmitInfo(segment); }

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferSubmitInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferSubmitInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCommandBufferSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferSubmitInfo`
    public static VkCommandBufferSubmitInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferSubmitInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferSubmitInfo`
    public static VkCommandBufferSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferSubmitInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandBufferSubmitInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandBufferSubmitInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandBufferSubmitInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandBufferSubmitInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandBufferSubmitInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo sType(@CType("VkStructureType") int value) { VkCommandBufferSubmitInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCommandBufferSubmitInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCommandBufferSubmitInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCommandBufferSubmitInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferSubmitInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferSubmitInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferSubmitInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `commandBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCommandBuffer") java.lang.foreign.MemorySegment get_commandBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_commandBuffer.get(segment, 0L, index); }
    /// {@return `commandBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkCommandBuffer") java.lang.foreign.MemorySegment get_commandBuffer(MemorySegment segment) { return VkCommandBufferSubmitInfo.get_commandBuffer(segment, 0L); }
    /// {@return `commandBuffer` at the given index}
    /// @param index the index
    public @CType("VkCommandBuffer") java.lang.foreign.MemorySegment commandBufferAt(long index) { return VkCommandBufferSubmitInfo.get_commandBuffer(this.segment(), index); }
    /// {@return `commandBuffer`}
    public @CType("VkCommandBuffer") java.lang.foreign.MemorySegment commandBuffer() { return VkCommandBufferSubmitInfo.get_commandBuffer(this.segment()); }
    /// Sets `commandBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBuffer(MemorySegment segment, long index, @CType("VkCommandBuffer") java.lang.foreign.MemorySegment value) { VH_commandBuffer.set(segment, 0L, index, value); }
    /// Sets `commandBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBuffer(MemorySegment segment, @CType("VkCommandBuffer") java.lang.foreign.MemorySegment value) { VkCommandBufferSubmitInfo.set_commandBuffer(segment, 0L, value); }
    /// Sets `commandBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo commandBufferAt(long index, @CType("VkCommandBuffer") java.lang.foreign.MemorySegment value) { VkCommandBufferSubmitInfo.set_commandBuffer(this.segment(), index, value); return this; }
    /// Sets `commandBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo commandBuffer(@CType("VkCommandBuffer") java.lang.foreign.MemorySegment value) { VkCommandBufferSubmitInfo.set_commandBuffer(this.segment(), value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment, long index) { return (int) VH_deviceMask.get(segment, 0L, index); }
    /// {@return `deviceMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment) { return VkCommandBufferSubmitInfo.get_deviceMask(segment, 0L); }
    /// {@return `deviceMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceMaskAt(long index) { return VkCommandBufferSubmitInfo.get_deviceMask(this.segment(), index); }
    /// {@return `deviceMask`}
    public @CType("uint32_t") int deviceMask() { return VkCommandBufferSubmitInfo.get_deviceMask(this.segment()); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceMask.set(segment, 0L, index, value); }
    /// Sets `deviceMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, @CType("uint32_t") int value) { VkCommandBufferSubmitInfo.set_deviceMask(segment, 0L, value); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo deviceMaskAt(long index, @CType("uint32_t") int value) { VkCommandBufferSubmitInfo.set_deviceMask(this.segment(), index, value); return this; }
    /// Sets `deviceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferSubmitInfo deviceMask(@CType("uint32_t") int value) { VkCommandBufferSubmitInfo.set_deviceMask(this.segment(), value); return this; }

}
