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
package overrungl.vulkan.ext.struct;

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
/// ### robustStorageBufferAccessSizeAlignment
/// [VarHandle][#VH_robustStorageBufferAccessSizeAlignment] - [Getter][#robustStorageBufferAccessSizeAlignment()] - [Setter][#robustStorageBufferAccessSizeAlignment(long)]
/// ### robustUniformBufferAccessSizeAlignment
/// [VarHandle][#VH_robustUniformBufferAccessSizeAlignment] - [Getter][#robustUniformBufferAccessSizeAlignment()] - [Setter][#robustUniformBufferAccessSizeAlignment(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRobustness2PropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceSize robustStorageBufferAccessSizeAlignment;
///     VkDeviceSize robustUniformBufferAccessSizeAlignment;
/// } VkPhysicalDeviceRobustness2PropertiesEXT;
/// ```
public sealed class VkPhysicalDeviceRobustness2PropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceRobustness2PropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment"),
        ValueLayout.JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `robustStorageBufferAccessSizeAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_robustStorageBufferAccessSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
    /// The [VarHandle] of `robustUniformBufferAccessSizeAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_robustUniformBufferAccessSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));

    /// Creates `VkPhysicalDeviceRobustness2PropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRobustness2PropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRobustness2PropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2PropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceRobustness2PropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRobustness2PropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2PropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRobustness2PropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRobustness2PropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRobustness2PropertiesEXT`
    public static VkPhysicalDeviceRobustness2PropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRobustness2PropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRobustness2PropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRobustness2PropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceRobustness2PropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRobustness2PropertiesEXT`
    public static VkPhysicalDeviceRobustness2PropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceSize") long robustStorageBufferAccessSizeAlignment, @CType("VkDeviceSize") long robustUniformBufferAccessSizeAlignment) { return alloc(allocator).sType(sType).pNext(pNext).robustStorageBufferAccessSizeAlignment(robustStorageBufferAccessSizeAlignment).robustUniformBufferAccessSizeAlignment(robustUniformBufferAccessSizeAlignment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesEXT copyFrom(VkPhysicalDeviceRobustness2PropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRobustness2PropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRobustness2PropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRobustness2PropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceRobustness2PropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `robustStorageBufferAccessSizeAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_robustStorageBufferAccessSizeAlignment(MemorySegment segment, long index) { return (long) VH_robustStorageBufferAccessSizeAlignment.get(segment, 0L, index); }
    /// {@return `robustStorageBufferAccessSizeAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_robustStorageBufferAccessSizeAlignment(MemorySegment segment) { return VkPhysicalDeviceRobustness2PropertiesEXT.get_robustStorageBufferAccessSizeAlignment(segment, 0L); }
    /// {@return `robustStorageBufferAccessSizeAlignment`}
    public @CType("VkDeviceSize") long robustStorageBufferAccessSizeAlignment() { return VkPhysicalDeviceRobustness2PropertiesEXT.get_robustStorageBufferAccessSizeAlignment(this.segment()); }
    /// Sets `robustStorageBufferAccessSizeAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustStorageBufferAccessSizeAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_robustStorageBufferAccessSizeAlignment.set(segment, 0L, index, value); }
    /// Sets `robustStorageBufferAccessSizeAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustStorageBufferAccessSizeAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_robustStorageBufferAccessSizeAlignment(segment, 0L, value); }
    /// Sets `robustStorageBufferAccessSizeAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesEXT robustStorageBufferAccessSizeAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_robustStorageBufferAccessSizeAlignment(this.segment(), value); return this; }

    /// {@return `robustUniformBufferAccessSizeAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_robustUniformBufferAccessSizeAlignment(MemorySegment segment, long index) { return (long) VH_robustUniformBufferAccessSizeAlignment.get(segment, 0L, index); }
    /// {@return `robustUniformBufferAccessSizeAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_robustUniformBufferAccessSizeAlignment(MemorySegment segment) { return VkPhysicalDeviceRobustness2PropertiesEXT.get_robustUniformBufferAccessSizeAlignment(segment, 0L); }
    /// {@return `robustUniformBufferAccessSizeAlignment`}
    public @CType("VkDeviceSize") long robustUniformBufferAccessSizeAlignment() { return VkPhysicalDeviceRobustness2PropertiesEXT.get_robustUniformBufferAccessSizeAlignment(this.segment()); }
    /// Sets `robustUniformBufferAccessSizeAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustUniformBufferAccessSizeAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_robustUniformBufferAccessSizeAlignment.set(segment, 0L, index, value); }
    /// Sets `robustUniformBufferAccessSizeAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustUniformBufferAccessSizeAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_robustUniformBufferAccessSizeAlignment(segment, 0L, value); }
    /// Sets `robustUniformBufferAccessSizeAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesEXT robustUniformBufferAccessSizeAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_robustUniformBufferAccessSizeAlignment(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceRobustness2PropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceRobustness2PropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRobustness2PropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRobustness2PropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRobustness2PropertiesEXT`
        public VkPhysicalDeviceRobustness2PropertiesEXT asSlice(long index) { return new VkPhysicalDeviceRobustness2PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRobustness2PropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRobustness2PropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRobustness2PropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceRobustness2PropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `robustStorageBufferAccessSizeAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long robustStorageBufferAccessSizeAlignmentAt(long index) { return VkPhysicalDeviceRobustness2PropertiesEXT.get_robustStorageBufferAccessSizeAlignment(this.segment(), index); }
        /// Sets `robustStorageBufferAccessSizeAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer robustStorageBufferAccessSizeAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_robustStorageBufferAccessSizeAlignment(this.segment(), index, value); return this; }

        /// {@return `robustUniformBufferAccessSizeAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long robustUniformBufferAccessSizeAlignmentAt(long index) { return VkPhysicalDeviceRobustness2PropertiesEXT.get_robustUniformBufferAccessSizeAlignment(this.segment(), index); }
        /// Sets `robustUniformBufferAccessSizeAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer robustUniformBufferAccessSizeAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceRobustness2PropertiesEXT.set_robustUniformBufferAccessSizeAlignment(this.segment(), index, value); return this; }

    }
}
