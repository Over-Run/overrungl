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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### extendedSparseAddressSpaceSize
/// [VarHandle][#VH_extendedSparseAddressSpaceSize] - [Getter][#extendedSparseAddressSpaceSize()] - [Setter][#extendedSparseAddressSpaceSize(long)]
/// ### extendedSparseImageUsageFlags
/// [VarHandle][#VH_extendedSparseImageUsageFlags] - [Getter][#extendedSparseImageUsageFlags()] - [Setter][#extendedSparseImageUsageFlags(int)]
/// ### extendedSparseBufferUsageFlags
/// [VarHandle][#VH_extendedSparseBufferUsageFlags] - [Getter][#extendedSparseBufferUsageFlags()] - [Setter][#extendedSparseBufferUsageFlags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceSize extendedSparseAddressSpaceSize;
///     VkImageUsageFlags extendedSparseImageUsageFlags;
///     VkBufferUsageFlags extendedSparseBufferUsageFlags;
/// } VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV;
/// ```
public sealed class VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("extendedSparseAddressSpaceSize"),
        ValueLayout.JAVA_INT.withName("extendedSparseImageUsageFlags"),
        ValueLayout.JAVA_INT.withName("extendedSparseBufferUsageFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `extendedSparseAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_extendedSparseAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseAddressSpaceSize"));
    /// The [VarHandle] of `extendedSparseImageUsageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_extendedSparseImageUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseImageUsageFlags"));
    /// The [VarHandle] of `extendedSparseBufferUsageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_extendedSparseBufferUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedSparseBufferUsageFlags"));

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkDeviceSize") long extendedSparseAddressSpaceSize, @CType("VkImageUsageFlags") int extendedSparseImageUsageFlags, @CType("VkBufferUsageFlags") int extendedSparseBufferUsageFlags) { return alloc(allocator).sType(sType).pNext(pNext).extendedSparseAddressSpaceSize(extendedSparseAddressSpaceSize).extendedSparseImageUsageFlags(extendedSparseImageUsageFlags).extendedSparseBufferUsageFlags(extendedSparseBufferUsageFlags); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV copyFrom(VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `extendedSparseAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_extendedSparseAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_extendedSparseAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `extendedSparseAddressSpaceSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_extendedSparseAddressSpaceSize(MemorySegment segment) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseAddressSpaceSize(segment, 0L); }
    /// {@return `extendedSparseAddressSpaceSize`}
    public @CType("VkDeviceSize") long extendedSparseAddressSpaceSize() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseAddressSpaceSize(this.segment()); }
    /// Sets `extendedSparseAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extendedSparseAddressSpaceSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_extendedSparseAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `extendedSparseAddressSpaceSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extendedSparseAddressSpaceSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseAddressSpaceSize(segment, 0L, value); }
    /// Sets `extendedSparseAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseAddressSpaceSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseAddressSpaceSize(this.segment(), value); return this; }

    /// {@return `extendedSparseImageUsageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_extendedSparseImageUsageFlags(MemorySegment segment, long index) { return (int) VH_extendedSparseImageUsageFlags.get(segment, 0L, index); }
    /// {@return `extendedSparseImageUsageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_extendedSparseImageUsageFlags(MemorySegment segment) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseImageUsageFlags(segment, 0L); }
    /// {@return `extendedSparseImageUsageFlags`}
    public @CType("VkImageUsageFlags") int extendedSparseImageUsageFlags() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseImageUsageFlags(this.segment()); }
    /// Sets `extendedSparseImageUsageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extendedSparseImageUsageFlags(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_extendedSparseImageUsageFlags.set(segment, 0L, index, value); }
    /// Sets `extendedSparseImageUsageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extendedSparseImageUsageFlags(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseImageUsageFlags(segment, 0L, value); }
    /// Sets `extendedSparseImageUsageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseImageUsageFlags(@CType("VkImageUsageFlags") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseImageUsageFlags(this.segment(), value); return this; }

    /// {@return `extendedSparseBufferUsageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferUsageFlags") int get_extendedSparseBufferUsageFlags(MemorySegment segment, long index) { return (int) VH_extendedSparseBufferUsageFlags.get(segment, 0L, index); }
    /// {@return `extendedSparseBufferUsageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferUsageFlags") int get_extendedSparseBufferUsageFlags(MemorySegment segment) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseBufferUsageFlags(segment, 0L); }
    /// {@return `extendedSparseBufferUsageFlags`}
    public @CType("VkBufferUsageFlags") int extendedSparseBufferUsageFlags() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseBufferUsageFlags(this.segment()); }
    /// Sets `extendedSparseBufferUsageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extendedSparseBufferUsageFlags(MemorySegment segment, long index, @CType("VkBufferUsageFlags") int value) { VH_extendedSparseBufferUsageFlags.set(segment, 0L, index, value); }
    /// Sets `extendedSparseBufferUsageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extendedSparseBufferUsageFlags(MemorySegment segment, @CType("VkBufferUsageFlags") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseBufferUsageFlags(segment, 0L, value); }
    /// Sets `extendedSparseBufferUsageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseBufferUsageFlags(@CType("VkBufferUsageFlags") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseBufferUsageFlags(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
        public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV asSlice(long index) { return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `extendedSparseAddressSpaceSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long extendedSparseAddressSpaceSizeAt(long index) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseAddressSpaceSize(this.segment(), index); }
        /// Sets `extendedSparseAddressSpaceSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extendedSparseAddressSpaceSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseAddressSpaceSize(this.segment(), index, value); return this; }

        /// {@return `extendedSparseImageUsageFlags` at the given index}
        /// @param index the index
        public @CType("VkImageUsageFlags") int extendedSparseImageUsageFlagsAt(long index) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseImageUsageFlags(this.segment(), index); }
        /// Sets `extendedSparseImageUsageFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extendedSparseImageUsageFlagsAt(long index, @CType("VkImageUsageFlags") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseImageUsageFlags(this.segment(), index, value); return this; }

        /// {@return `extendedSparseBufferUsageFlags` at the given index}
        /// @param index the index
        public @CType("VkBufferUsageFlags") int extendedSparseBufferUsageFlagsAt(long index) { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.get_extendedSparseBufferUsageFlags(this.segment(), index); }
        /// Sets `extendedSparseBufferUsageFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extendedSparseBufferUsageFlagsAt(long index, @CType("VkBufferUsageFlags") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.set_extendedSparseBufferUsageFlags(this.segment(), index, value); return this; }

    }
}
