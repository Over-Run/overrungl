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
package overrungl.vulkan.arm.struct;

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
/// ### schedulingControlsFlags
/// [VarHandle][#VH_schedulingControlsFlags] - [Getter][#schedulingControlsFlags()] - [Setter][#schedulingControlsFlags(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSchedulingControlsPropertiesARM {
///     VkStructureType sType;
///     void * pNext;
///     VkPhysicalDeviceSchedulingControlsFlagsARM schedulingControlsFlags;
/// } VkPhysicalDeviceSchedulingControlsPropertiesARM;
/// ```
public sealed class VkPhysicalDeviceSchedulingControlsPropertiesARM extends Struct {
    /// The struct layout of `VkPhysicalDeviceSchedulingControlsPropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("schedulingControlsFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `schedulingControlsFlags` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_schedulingControlsFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("schedulingControlsFlags"));

    /// Creates `VkPhysicalDeviceSchedulingControlsPropertiesARM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSchedulingControlsPropertiesARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSchedulingControlsPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSchedulingControlsPropertiesARM(segment); }

    /// Creates `VkPhysicalDeviceSchedulingControlsPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSchedulingControlsPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSchedulingControlsPropertiesARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSchedulingControlsPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceSchedulingControlsPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSchedulingControlsPropertiesARM`
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSchedulingControlsPropertiesARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSchedulingControlsPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSchedulingControlsPropertiesARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSchedulingControlsPropertiesARM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSchedulingControlsPropertiesARM`
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long schedulingControlsFlags) { return alloc(allocator).sType(sType).pNext(pNext).schedulingControlsFlags(schedulingControlsFlags); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsPropertiesARM copyFrom(VkPhysicalDeviceSchedulingControlsPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsPropertiesARM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsPropertiesARM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_pNext(this.segment(), value); return this; }

    /// {@return `schedulingControlsFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long get_schedulingControlsFlags(MemorySegment segment, long index) { return (long) VH_schedulingControlsFlags.get(segment, 0L, index); }
    /// {@return `schedulingControlsFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long get_schedulingControlsFlags(MemorySegment segment) { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_schedulingControlsFlags(segment, 0L); }
    /// {@return `schedulingControlsFlags`}
    public @CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long schedulingControlsFlags() { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_schedulingControlsFlags(this.segment()); }
    /// Sets `schedulingControlsFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_schedulingControlsFlags(MemorySegment segment, long index, @CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long value) { VH_schedulingControlsFlags.set(segment, 0L, index, value); }
    /// Sets `schedulingControlsFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_schedulingControlsFlags(MemorySegment segment, @CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_schedulingControlsFlags(segment, 0L, value); }
    /// Sets `schedulingControlsFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsPropertiesARM schedulingControlsFlags(@CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_schedulingControlsFlags(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceSchedulingControlsPropertiesARM].
    public static final class Buffer extends VkPhysicalDeviceSchedulingControlsPropertiesARM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceSchedulingControlsPropertiesARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceSchedulingControlsPropertiesARM`
        public VkPhysicalDeviceSchedulingControlsPropertiesARM asSlice(long index) { return new VkPhysicalDeviceSchedulingControlsPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceSchedulingControlsPropertiesARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceSchedulingControlsPropertiesARM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `schedulingControlsFlags` at the given index}
        /// @param index the index
        public @CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long schedulingControlsFlagsAt(long index) { return VkPhysicalDeviceSchedulingControlsPropertiesARM.get_schedulingControlsFlags(this.segment(), index); }
        /// Sets `schedulingControlsFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer schedulingControlsFlagsAt(long index, @CType("VkPhysicalDeviceSchedulingControlsFlagsARM") long value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.set_schedulingControlsFlags(this.segment(), index, value); return this; }

    }
}
