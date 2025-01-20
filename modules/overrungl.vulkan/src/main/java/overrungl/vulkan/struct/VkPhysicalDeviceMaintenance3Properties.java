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
/// ### maxPerSetDescriptors
/// [VarHandle][#VH_maxPerSetDescriptors] - [Getter][#maxPerSetDescriptors()] - [Setter][#maxPerSetDescriptors(int)]
/// ### maxMemoryAllocationSize
/// [VarHandle][#VH_maxMemoryAllocationSize] - [Getter][#maxMemoryAllocationSize()] - [Setter][#maxMemoryAllocationSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMaintenance3Properties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxPerSetDescriptors;
///     VkDeviceSize maxMemoryAllocationSize;
/// } VkPhysicalDeviceMaintenance3Properties;
/// ```
public sealed class VkPhysicalDeviceMaintenance3Properties extends Struct {
    /// The struct layout of `VkPhysicalDeviceMaintenance3Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxPerSetDescriptors` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerSetDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerSetDescriptors"));
    /// The [VarHandle] of `maxMemoryAllocationSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxMemoryAllocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationSize"));

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMaintenance3Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance3Properties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance3Properties(segment); }

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance3Properties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance3Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMaintenance3Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static VkPhysicalDeviceMaintenance3Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance3Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance3Properties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance3Properties`
    public static VkPhysicalDeviceMaintenance3Properties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int maxPerSetDescriptors, @CType("VkDeviceSize") long maxMemoryAllocationSize) { return alloc(allocator).sType(sType).pNext(pNext).maxPerSetDescriptors(maxPerSetDescriptors).maxMemoryAllocationSize(maxMemoryAllocationSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties copyFrom(VkPhysicalDeviceMaintenance3Properties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMaintenance3Properties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMaintenance3Properties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance3Properties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance3Properties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMaintenance3Properties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceMaintenance3Properties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceMaintenance3Properties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceMaintenance3Properties.set_pNext(this.segment(), value); return this; }

    /// {@return `maxPerSetDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerSetDescriptors(MemorySegment segment, long index) { return (int) VH_maxPerSetDescriptors.get(segment, 0L, index); }
    /// {@return `maxPerSetDescriptors`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerSetDescriptors(MemorySegment segment) { return VkPhysicalDeviceMaintenance3Properties.get_maxPerSetDescriptors(segment, 0L); }
    /// {@return `maxPerSetDescriptors`}
    public @CType("uint32_t") int maxPerSetDescriptors() { return VkPhysicalDeviceMaintenance3Properties.get_maxPerSetDescriptors(this.segment()); }
    /// Sets `maxPerSetDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerSetDescriptors(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerSetDescriptors.set(segment, 0L, index, value); }
    /// Sets `maxPerSetDescriptors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerSetDescriptors(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance3Properties.set_maxPerSetDescriptors(segment, 0L, value); }
    /// Sets `maxPerSetDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties maxPerSetDescriptors(@CType("uint32_t") int value) { VkPhysicalDeviceMaintenance3Properties.set_maxPerSetDescriptors(this.segment(), value); return this; }

    /// {@return `maxMemoryAllocationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxMemoryAllocationSize(MemorySegment segment, long index) { return (long) VH_maxMemoryAllocationSize.get(segment, 0L, index); }
    /// {@return `maxMemoryAllocationSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxMemoryAllocationSize(MemorySegment segment) { return VkPhysicalDeviceMaintenance3Properties.get_maxMemoryAllocationSize(segment, 0L); }
    /// {@return `maxMemoryAllocationSize`}
    public @CType("VkDeviceSize") long maxMemoryAllocationSize() { return VkPhysicalDeviceMaintenance3Properties.get_maxMemoryAllocationSize(this.segment()); }
    /// Sets `maxMemoryAllocationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMemoryAllocationSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxMemoryAllocationSize.set(segment, 0L, index, value); }
    /// Sets `maxMemoryAllocationSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMemoryAllocationSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceMaintenance3Properties.set_maxMemoryAllocationSize(segment, 0L, value); }
    /// Sets `maxMemoryAllocationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance3Properties maxMemoryAllocationSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceMaintenance3Properties.set_maxMemoryAllocationSize(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceMaintenance3Properties].
    public static final class Buffer extends VkPhysicalDeviceMaintenance3Properties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMaintenance3Properties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMaintenance3Properties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMaintenance3Properties`
        public VkPhysicalDeviceMaintenance3Properties asSlice(long index) { return new VkPhysicalDeviceMaintenance3Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMaintenance3Properties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMaintenance3Properties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMaintenance3Properties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance3Properties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceMaintenance3Properties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceMaintenance3Properties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxPerSetDescriptors` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerSetDescriptorsAt(long index) { return VkPhysicalDeviceMaintenance3Properties.get_maxPerSetDescriptors(this.segment(), index); }
        /// Sets `maxPerSetDescriptors` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerSetDescriptorsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance3Properties.set_maxPerSetDescriptors(this.segment(), index, value); return this; }

        /// {@return `maxMemoryAllocationSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long maxMemoryAllocationSizeAt(long index) { return VkPhysicalDeviceMaintenance3Properties.get_maxMemoryAllocationSize(this.segment(), index); }
        /// Sets `maxMemoryAllocationSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMemoryAllocationSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceMaintenance3Properties.set_maxMemoryAllocationSize(this.segment(), index, value); return this; }

    }
}
