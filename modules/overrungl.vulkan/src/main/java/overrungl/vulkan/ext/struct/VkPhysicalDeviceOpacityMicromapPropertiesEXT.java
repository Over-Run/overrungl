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
/// ### maxOpacity2StateSubdivisionLevel
/// [VarHandle][#VH_maxOpacity2StateSubdivisionLevel] - [Getter][#maxOpacity2StateSubdivisionLevel()] - [Setter][#maxOpacity2StateSubdivisionLevel(int)]
/// ### maxOpacity4StateSubdivisionLevel
/// [VarHandle][#VH_maxOpacity4StateSubdivisionLevel] - [Getter][#maxOpacity4StateSubdivisionLevel()] - [Setter][#maxOpacity4StateSubdivisionLevel(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceOpacityMicromapPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxOpacity2StateSubdivisionLevel;
///     uint32_t maxOpacity4StateSubdivisionLevel;
/// } VkPhysicalDeviceOpacityMicromapPropertiesEXT;
/// ```
public sealed class VkPhysicalDeviceOpacityMicromapPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxOpacity2StateSubdivisionLevel"),
        ValueLayout.JAVA_INT.withName("maxOpacity4StateSubdivisionLevel")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxOpacity2StateSubdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxOpacity2StateSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
    /// The [VarHandle] of `maxOpacity4StateSubdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxOpacity4StateSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapPropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int maxOpacity2StateSubdivisionLevel, @CType("uint32_t") int maxOpacity4StateSubdivisionLevel) { return alloc(allocator).sType(sType).pNext(pNext).maxOpacity2StateSubdivisionLevel(maxOpacity2StateSubdivisionLevel).maxOpacity4StateSubdivisionLevel(maxOpacity4StateSubdivisionLevel); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT copyFrom(VkPhysicalDeviceOpacityMicromapPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `maxOpacity2StateSubdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxOpacity2StateSubdivisionLevel(MemorySegment segment, long index) { return (int) VH_maxOpacity2StateSubdivisionLevel.get(segment, 0L, index); }
    /// {@return `maxOpacity2StateSubdivisionLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxOpacity2StateSubdivisionLevel(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_maxOpacity2StateSubdivisionLevel(segment, 0L); }
    /// {@return `maxOpacity2StateSubdivisionLevel`}
    public @CType("uint32_t") int maxOpacity2StateSubdivisionLevel() { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_maxOpacity2StateSubdivisionLevel(this.segment()); }
    /// Sets `maxOpacity2StateSubdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxOpacity2StateSubdivisionLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxOpacity2StateSubdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `maxOpacity2StateSubdivisionLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxOpacity2StateSubdivisionLevel(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_maxOpacity2StateSubdivisionLevel(segment, 0L, value); }
    /// Sets `maxOpacity2StateSubdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity2StateSubdivisionLevel(@CType("uint32_t") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_maxOpacity2StateSubdivisionLevel(this.segment(), value); return this; }

    /// {@return `maxOpacity4StateSubdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxOpacity4StateSubdivisionLevel(MemorySegment segment, long index) { return (int) VH_maxOpacity4StateSubdivisionLevel.get(segment, 0L, index); }
    /// {@return `maxOpacity4StateSubdivisionLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxOpacity4StateSubdivisionLevel(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_maxOpacity4StateSubdivisionLevel(segment, 0L); }
    /// {@return `maxOpacity4StateSubdivisionLevel`}
    public @CType("uint32_t") int maxOpacity4StateSubdivisionLevel() { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_maxOpacity4StateSubdivisionLevel(this.segment()); }
    /// Sets `maxOpacity4StateSubdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxOpacity4StateSubdivisionLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxOpacity4StateSubdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `maxOpacity4StateSubdivisionLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxOpacity4StateSubdivisionLevel(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_maxOpacity4StateSubdivisionLevel(segment, 0L, value); }
    /// Sets `maxOpacity4StateSubdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity4StateSubdivisionLevel(@CType("uint32_t") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_maxOpacity4StateSubdivisionLevel(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceOpacityMicromapPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceOpacityMicromapPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceOpacityMicromapPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
        public VkPhysicalDeviceOpacityMicromapPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceOpacityMicromapPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxOpacity2StateSubdivisionLevel` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxOpacity2StateSubdivisionLevelAt(long index) { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_maxOpacity2StateSubdivisionLevel(this.segment(), index); }
        /// Sets `maxOpacity2StateSubdivisionLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxOpacity2StateSubdivisionLevelAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_maxOpacity2StateSubdivisionLevel(this.segment(), index, value); return this; }

        /// {@return `maxOpacity4StateSubdivisionLevel` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxOpacity4StateSubdivisionLevelAt(long index) { return VkPhysicalDeviceOpacityMicromapPropertiesEXT.get_maxOpacity4StateSubdivisionLevel(this.segment(), index); }
        /// Sets `maxOpacity4StateSubdivisionLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxOpacity4StateSubdivisionLevelAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceOpacityMicromapPropertiesEXT.set_maxOpacity4StateSubdivisionLevel(this.segment(), index, value); return this; }

    }
}
