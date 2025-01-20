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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### deviceMask
/// [VarHandle][#VH_deviceMask] - [Getter][#deviceMask()] - [Setter][#deviceMask(int)]
/// ### deviceRenderAreaCount
/// [VarHandle][#VH_deviceRenderAreaCount] - [Getter][#deviceRenderAreaCount()] - [Setter][#deviceRenderAreaCount(int)]
/// ### pDeviceRenderAreas
/// [VarHandle][#VH_pDeviceRenderAreas] - [Getter][#pDeviceRenderAreas()] - [Setter][#pDeviceRenderAreas(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceGroupRenderPassBeginInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t deviceMask;
///     uint32_t deviceRenderAreaCount;
///     const VkRect2D * pDeviceRenderAreas;
/// } VkDeviceGroupRenderPassBeginInfo;
/// ```
public sealed class VkDeviceGroupRenderPassBeginInfo extends Struct {
    /// The struct layout of `VkDeviceGroupRenderPassBeginInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMask"),
        ValueLayout.JAVA_INT.withName("deviceRenderAreaCount"),
        ValueLayout.ADDRESS.withName("pDeviceRenderAreas")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));
    /// The [VarHandle] of `deviceRenderAreaCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceRenderAreaCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceRenderAreaCount"));
    /// The [VarHandle] of `pDeviceRenderAreas` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDeviceRenderAreas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceRenderAreas"));

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupRenderPassBeginInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupRenderPassBeginInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfo(segment); }

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupRenderPassBeginInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceGroupRenderPassBeginInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupRenderPassBeginInfo`
    public static VkDeviceGroupRenderPassBeginInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupRenderPassBeginInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupRenderPassBeginInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupRenderPassBeginInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceGroupRenderPassBeginInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupRenderPassBeginInfo`
    public static VkDeviceGroupRenderPassBeginInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int deviceMask, @CType("uint32_t") int deviceRenderAreaCount, @CType("const VkRect2D *") MemorySegment pDeviceRenderAreas) { return alloc(allocator).sType(sType).pNext(pNext).deviceMask(deviceMask).deviceRenderAreaCount(deviceRenderAreaCount).pDeviceRenderAreas(pDeviceRenderAreas); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo copyFrom(VkDeviceGroupRenderPassBeginInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceGroupRenderPassBeginInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo sType(@CType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDeviceGroupRenderPassBeginInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo pNext(@CType("const void *") MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment, long index) { return (int) VH_deviceMask.get(segment, 0L, index); }
    /// {@return `deviceMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_deviceMask(segment, 0L); }
    /// {@return `deviceMask`}
    public @CType("uint32_t") int deviceMask() { return VkDeviceGroupRenderPassBeginInfo.get_deviceMask(this.segment()); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceMask.set(segment, 0L, index, value); }
    /// Sets `deviceMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceMask(segment, 0L, value); }
    /// Sets `deviceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo deviceMask(@CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceMask(this.segment(), value); return this; }

    /// {@return `deviceRenderAreaCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceRenderAreaCount(MemorySegment segment, long index) { return (int) VH_deviceRenderAreaCount.get(segment, 0L, index); }
    /// {@return `deviceRenderAreaCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceRenderAreaCount(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_deviceRenderAreaCount(segment, 0L); }
    /// {@return `deviceRenderAreaCount`}
    public @CType("uint32_t") int deviceRenderAreaCount() { return VkDeviceGroupRenderPassBeginInfo.get_deviceRenderAreaCount(this.segment()); }
    /// Sets `deviceRenderAreaCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceRenderAreaCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceRenderAreaCount.set(segment, 0L, index, value); }
    /// Sets `deviceRenderAreaCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceRenderAreaCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceRenderAreaCount(segment, 0L, value); }
    /// Sets `deviceRenderAreaCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo deviceRenderAreaCount(@CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceRenderAreaCount(this.segment(), value); return this; }

    /// {@return `pDeviceRenderAreas` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") MemorySegment get_pDeviceRenderAreas(MemorySegment segment, long index) { return (MemorySegment) VH_pDeviceRenderAreas.get(segment, 0L, index); }
    /// {@return `pDeviceRenderAreas`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") MemorySegment get_pDeviceRenderAreas(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_pDeviceRenderAreas(segment, 0L); }
    /// {@return `pDeviceRenderAreas`}
    public @CType("const VkRect2D *") MemorySegment pDeviceRenderAreas() { return VkDeviceGroupRenderPassBeginInfo.get_pDeviceRenderAreas(this.segment()); }
    /// Sets `pDeviceRenderAreas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDeviceRenderAreas(MemorySegment segment, long index, @CType("const VkRect2D *") MemorySegment value) { VH_pDeviceRenderAreas.set(segment, 0L, index, value); }
    /// Sets `pDeviceRenderAreas` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDeviceRenderAreas(MemorySegment segment, @CType("const VkRect2D *") MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pDeviceRenderAreas(segment, 0L, value); }
    /// Sets `pDeviceRenderAreas` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo pDeviceRenderAreas(@CType("const VkRect2D *") MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pDeviceRenderAreas(this.segment(), value); return this; }

    /// A buffer of [VkDeviceGroupRenderPassBeginInfo].
    public static final class Buffer extends VkDeviceGroupRenderPassBeginInfo {
        private final long elementCount;

        /// Creates `VkDeviceGroupRenderPassBeginInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceGroupRenderPassBeginInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceGroupRenderPassBeginInfo`
        public VkDeviceGroupRenderPassBeginInfo asSlice(long index) { return new VkDeviceGroupRenderPassBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceGroupRenderPassBeginInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceGroupRenderPassBeginInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `deviceMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceMaskAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_deviceMask(this.segment(), index); }
        /// Sets `deviceMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceMaskAt(long index, @CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceMask(this.segment(), index, value); return this; }

        /// {@return `deviceRenderAreaCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int deviceRenderAreaCountAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_deviceRenderAreaCount(this.segment(), index); }
        /// Sets `deviceRenderAreaCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer deviceRenderAreaCountAt(long index, @CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceRenderAreaCount(this.segment(), index, value); return this; }

        /// {@return `pDeviceRenderAreas` at the given index}
        /// @param index the index
        public @CType("const VkRect2D *") MemorySegment pDeviceRenderAreasAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_pDeviceRenderAreas(this.segment(), index); }
        /// Sets `pDeviceRenderAreas` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDeviceRenderAreasAt(long index, @CType("const VkRect2D *") MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pDeviceRenderAreas(this.segment(), index, value); return this; }

    }
}
