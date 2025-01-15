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
/// ### drmFormatModifierCount
/// [VarHandle][#VH_drmFormatModifierCount] - [Getter][#drmFormatModifierCount()] - [Setter][#drmFormatModifierCount(int)]
/// ### pDrmFormatModifierProperties
/// [VarHandle][#VH_pDrmFormatModifierProperties] - [Getter][#pDrmFormatModifierProperties()] - [Setter][#pDrmFormatModifierProperties(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDrmFormatModifierPropertiesListEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t drmFormatModifierCount;
///     VkDrmFormatModifierPropertiesEXT * pDrmFormatModifierProperties;
/// } VkDrmFormatModifierPropertiesListEXT;
/// ```
public sealed class VkDrmFormatModifierPropertiesListEXT extends Struct {
    /// The struct layout of `VkDrmFormatModifierPropertiesListEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withName("pDrmFormatModifierProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `drmFormatModifierCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_drmFormatModifierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierCount"));
    /// The [VarHandle] of `pDrmFormatModifierProperties` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDrmFormatModifierProperties = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrmFormatModifierProperties"));

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    /// @param segment the memory segment
    public VkDrmFormatModifierPropertiesListEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierPropertiesListEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesListEXT(segment); }

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierPropertiesListEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesListEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDrmFormatModifierPropertiesListEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrmFormatModifierPropertiesListEXT`
    public static VkDrmFormatModifierPropertiesListEXT alloc(SegmentAllocator allocator) { return new VkDrmFormatModifierPropertiesListEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrmFormatModifierPropertiesListEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrmFormatModifierPropertiesListEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDrmFormatModifierPropertiesListEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrmFormatModifierPropertiesListEXT`
    public static VkDrmFormatModifierPropertiesListEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int drmFormatModifierCount, @CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment pDrmFormatModifierProperties) { return alloc(allocator).sType(sType).pNext(pNext).drmFormatModifierCount(drmFormatModifierCount).pDrmFormatModifierProperties(pDrmFormatModifierProperties); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrmFormatModifierPropertiesListEXT copyFrom(VkDrmFormatModifierPropertiesListEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDrmFormatModifierPropertiesListEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDrmFormatModifierPropertiesListEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDrmFormatModifierPropertiesListEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierPropertiesListEXT sType(@CType("VkStructureType") int value) { VkDrmFormatModifierPropertiesListEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDrmFormatModifierPropertiesListEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkDrmFormatModifierPropertiesListEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDrmFormatModifierPropertiesListEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierPropertiesListEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkDrmFormatModifierPropertiesListEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `drmFormatModifierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_drmFormatModifierCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierCount.get(segment, 0L, index); }
    /// {@return `drmFormatModifierCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_drmFormatModifierCount(MemorySegment segment) { return VkDrmFormatModifierPropertiesListEXT.get_drmFormatModifierCount(segment, 0L); }
    /// {@return `drmFormatModifierCount`}
    public @CType("uint32_t") int drmFormatModifierCount() { return VkDrmFormatModifierPropertiesListEXT.get_drmFormatModifierCount(this.segment()); }
    /// Sets `drmFormatModifierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drmFormatModifierCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_drmFormatModifierCount.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drmFormatModifierCount(MemorySegment segment, @CType("uint32_t") int value) { VkDrmFormatModifierPropertiesListEXT.set_drmFormatModifierCount(segment, 0L, value); }
    /// Sets `drmFormatModifierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierPropertiesListEXT drmFormatModifierCount(@CType("uint32_t") int value) { VkDrmFormatModifierPropertiesListEXT.set_drmFormatModifierCount(this.segment(), value); return this; }

    /// {@return `pDrmFormatModifierProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment get_pDrmFormatModifierProperties(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDrmFormatModifierProperties.get(segment, 0L, index); }
    /// {@return `pDrmFormatModifierProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment get_pDrmFormatModifierProperties(MemorySegment segment) { return VkDrmFormatModifierPropertiesListEXT.get_pDrmFormatModifierProperties(segment, 0L); }
    /// {@return `pDrmFormatModifierProperties`}
    public @CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment pDrmFormatModifierProperties() { return VkDrmFormatModifierPropertiesListEXT.get_pDrmFormatModifierProperties(this.segment()); }
    /// Sets `pDrmFormatModifierProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDrmFormatModifierProperties(MemorySegment segment, long index, @CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment value) { VH_pDrmFormatModifierProperties.set(segment, 0L, index, value); }
    /// Sets `pDrmFormatModifierProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDrmFormatModifierProperties(MemorySegment segment, @CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment value) { VkDrmFormatModifierPropertiesListEXT.set_pDrmFormatModifierProperties(segment, 0L, value); }
    /// Sets `pDrmFormatModifierProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierPropertiesListEXT pDrmFormatModifierProperties(@CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment value) { VkDrmFormatModifierPropertiesListEXT.set_pDrmFormatModifierProperties(this.segment(), value); return this; }

    /// A buffer of [VkDrmFormatModifierPropertiesListEXT].
    public static final class Buffer extends VkDrmFormatModifierPropertiesListEXT {
        private final long elementCount;

        /// Creates `VkDrmFormatModifierPropertiesListEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDrmFormatModifierPropertiesListEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDrmFormatModifierPropertiesListEXT`
        public VkDrmFormatModifierPropertiesListEXT asSlice(long index) { return new VkDrmFormatModifierPropertiesListEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDrmFormatModifierPropertiesListEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDrmFormatModifierPropertiesListEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDrmFormatModifierPropertiesListEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDrmFormatModifierPropertiesListEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDrmFormatModifierPropertiesListEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDrmFormatModifierPropertiesListEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `drmFormatModifierCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int drmFormatModifierCountAt(long index) { return VkDrmFormatModifierPropertiesListEXT.get_drmFormatModifierCount(this.segment(), index); }
        /// Sets `drmFormatModifierCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierCountAt(long index, @CType("uint32_t") int value) { VkDrmFormatModifierPropertiesListEXT.set_drmFormatModifierCount(this.segment(), index, value); return this; }

        /// {@return `pDrmFormatModifierProperties` at the given index}
        /// @param index the index
        public @CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment pDrmFormatModifierPropertiesAt(long index) { return VkDrmFormatModifierPropertiesListEXT.get_pDrmFormatModifierProperties(this.segment(), index); }
        /// Sets `pDrmFormatModifierProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDrmFormatModifierPropertiesAt(long index, @CType("VkDrmFormatModifierPropertiesEXT *") java.lang.foreign.MemorySegment value) { VkDrmFormatModifierPropertiesListEXT.set_pDrmFormatModifierProperties(this.segment(), index, value); return this; }

    }
}
