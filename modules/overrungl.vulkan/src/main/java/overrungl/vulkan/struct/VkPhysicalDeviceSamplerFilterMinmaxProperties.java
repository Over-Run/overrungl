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
/// ### filterMinmaxSingleComponentFormats
/// [VarHandle][#VH_filterMinmaxSingleComponentFormats] - [Getter][#filterMinmaxSingleComponentFormats()] - [Setter][#filterMinmaxSingleComponentFormats(int)]
/// ### filterMinmaxImageComponentMapping
/// [VarHandle][#VH_filterMinmaxImageComponentMapping] - [Getter][#filterMinmaxImageComponentMapping()] - [Setter][#filterMinmaxImageComponentMapping(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSamplerFilterMinmaxProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 filterMinmaxSingleComponentFormats;
///     VkBool32 filterMinmaxImageComponentMapping;
/// } VkPhysicalDeviceSamplerFilterMinmaxProperties;
/// ```
public sealed class VkPhysicalDeviceSamplerFilterMinmaxProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceSamplerFilterMinmaxProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterMinmaxSingleComponentFormats"),
        ValueLayout.JAVA_INT.withName("filterMinmaxImageComponentMapping")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `filterMinmaxSingleComponentFormats` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_filterMinmaxSingleComponentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
    /// The [VarHandle] of `filterMinmaxImageComponentMapping` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_filterMinmaxImageComponentMapping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterMinmaxImageComponentMapping"));

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSamplerFilterMinmaxProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment); }

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSamplerFilterMinmaxProperties`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSamplerFilterMinmaxProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSamplerFilterMinmaxProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSamplerFilterMinmaxProperties`
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int filterMinmaxSingleComponentFormats, @CType("VkBool32") int filterMinmaxImageComponentMapping) { return alloc(allocator).sType(sType).pNext(pNext).filterMinmaxSingleComponentFormats(filterMinmaxSingleComponentFormats).filterMinmaxImageComponentMapping(filterMinmaxImageComponentMapping); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties copyFrom(VkPhysicalDeviceSamplerFilterMinmaxProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `filterMinmaxSingleComponentFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_filterMinmaxSingleComponentFormats(MemorySegment segment, long index) { return (int) VH_filterMinmaxSingleComponentFormats.get(segment, 0L, index); }
    /// {@return `filterMinmaxSingleComponentFormats`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_filterMinmaxSingleComponentFormats(MemorySegment segment) { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_filterMinmaxSingleComponentFormats(segment, 0L); }
    /// {@return `filterMinmaxSingleComponentFormats`}
    public @CType("VkBool32") int filterMinmaxSingleComponentFormats() { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_filterMinmaxSingleComponentFormats(this.segment()); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterMinmaxSingleComponentFormats(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_filterMinmaxSingleComponentFormats.set(segment, 0L, index, value); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterMinmaxSingleComponentFormats(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_filterMinmaxSingleComponentFormats(segment, 0L, value); }
    /// Sets `filterMinmaxSingleComponentFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxSingleComponentFormats(@CType("VkBool32") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_filterMinmaxSingleComponentFormats(this.segment(), value); return this; }

    /// {@return `filterMinmaxImageComponentMapping` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_filterMinmaxImageComponentMapping(MemorySegment segment, long index) { return (int) VH_filterMinmaxImageComponentMapping.get(segment, 0L, index); }
    /// {@return `filterMinmaxImageComponentMapping`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_filterMinmaxImageComponentMapping(MemorySegment segment) { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_filterMinmaxImageComponentMapping(segment, 0L); }
    /// {@return `filterMinmaxImageComponentMapping`}
    public @CType("VkBool32") int filterMinmaxImageComponentMapping() { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_filterMinmaxImageComponentMapping(this.segment()); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterMinmaxImageComponentMapping(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_filterMinmaxImageComponentMapping.set(segment, 0L, index, value); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterMinmaxImageComponentMapping(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_filterMinmaxImageComponentMapping(segment, 0L, value); }
    /// Sets `filterMinmaxImageComponentMapping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxImageComponentMapping(@CType("VkBool32") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_filterMinmaxImageComponentMapping(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceSamplerFilterMinmaxProperties].
    public static final class Buffer extends VkPhysicalDeviceSamplerFilterMinmaxProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceSamplerFilterMinmaxProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceSamplerFilterMinmaxProperties`
        public VkPhysicalDeviceSamplerFilterMinmaxProperties asSlice(long index) { return new VkPhysicalDeviceSamplerFilterMinmaxProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceSamplerFilterMinmaxProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceSamplerFilterMinmaxProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `filterMinmaxSingleComponentFormats` at the given index}
        /// @param index the index
        public @CType("VkBool32") int filterMinmaxSingleComponentFormatsAt(long index) { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_filterMinmaxSingleComponentFormats(this.segment(), index); }
        /// Sets `filterMinmaxSingleComponentFormats` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterMinmaxSingleComponentFormatsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_filterMinmaxSingleComponentFormats(this.segment(), index, value); return this; }

        /// {@return `filterMinmaxImageComponentMapping` at the given index}
        /// @param index the index
        public @CType("VkBool32") int filterMinmaxImageComponentMappingAt(long index) { return VkPhysicalDeviceSamplerFilterMinmaxProperties.get_filterMinmaxImageComponentMapping(this.segment(), index); }
        /// Sets `filterMinmaxImageComponentMapping` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterMinmaxImageComponentMappingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.set_filterMinmaxImageComponentMapping(this.segment(), index, value); return this; }

    }
}
