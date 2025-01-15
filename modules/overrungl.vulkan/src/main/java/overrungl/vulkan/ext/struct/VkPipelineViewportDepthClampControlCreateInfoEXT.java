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
/// ### depthClampMode
/// [VarHandle][#VH_depthClampMode] - [Getter][#depthClampMode()] - [Setter][#depthClampMode(int)]
/// ### pDepthClampRange
/// [VarHandle][#VH_pDepthClampRange] - [Getter][#pDepthClampRange()] - [Setter][#pDepthClampRange(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineViewportDepthClampControlCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDepthClampModeEXT depthClampMode;
///     const VkDepthClampRangeEXT * pDepthClampRange;
/// } VkPipelineViewportDepthClampControlCreateInfoEXT;
/// ```
public sealed class VkPipelineViewportDepthClampControlCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineViewportDepthClampControlCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthClampMode"),
        ValueLayout.ADDRESS.withName("pDepthClampRange")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `depthClampMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthClampMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClampMode"));
    /// The [VarHandle] of `pDepthClampRange` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDepthClampRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthClampRange"));

    /// Creates `VkPipelineViewportDepthClampControlCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineViewportDepthClampControlCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineViewportDepthClampControlCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportDepthClampControlCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportDepthClampControlCreateInfoEXT(segment); }

    /// Creates `VkPipelineViewportDepthClampControlCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineViewportDepthClampControlCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportDepthClampControlCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportDepthClampControlCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineViewportDepthClampControlCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineViewportDepthClampControlCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportDepthClampControlCreateInfoEXT`
    public static VkPipelineViewportDepthClampControlCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineViewportDepthClampControlCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineViewportDepthClampControlCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportDepthClampControlCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineViewportDepthClampControlCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportDepthClampControlCreateInfoEXT`
    public static VkPipelineViewportDepthClampControlCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDepthClampModeEXT") int depthClampMode, @CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment pDepthClampRange) { return alloc(allocator).sType(sType).pNext(pNext).depthClampMode(depthClampMode).pDepthClampRange(pDepthClampRange); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineViewportDepthClampControlCreateInfoEXT copyFrom(VkPipelineViewportDepthClampControlCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportDepthClampControlCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportDepthClampControlCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `depthClampMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDepthClampModeEXT") int get_depthClampMode(MemorySegment segment, long index) { return (int) VH_depthClampMode.get(segment, 0L, index); }
    /// {@return `depthClampMode`}
    /// @param segment the segment of the struct
    public static @CType("VkDepthClampModeEXT") int get_depthClampMode(MemorySegment segment) { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_depthClampMode(segment, 0L); }
    /// {@return `depthClampMode`}
    public @CType("VkDepthClampModeEXT") int depthClampMode() { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_depthClampMode(this.segment()); }
    /// Sets `depthClampMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthClampMode(MemorySegment segment, long index, @CType("VkDepthClampModeEXT") int value) { VH_depthClampMode.set(segment, 0L, index, value); }
    /// Sets `depthClampMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthClampMode(MemorySegment segment, @CType("VkDepthClampModeEXT") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_depthClampMode(segment, 0L, value); }
    /// Sets `depthClampMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportDepthClampControlCreateInfoEXT depthClampMode(@CType("VkDepthClampModeEXT") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_depthClampMode(this.segment(), value); return this; }

    /// {@return `pDepthClampRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment get_pDepthClampRange(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDepthClampRange.get(segment, 0L, index); }
    /// {@return `pDepthClampRange`}
    /// @param segment the segment of the struct
    public static @CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment get_pDepthClampRange(MemorySegment segment) { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_pDepthClampRange(segment, 0L); }
    /// {@return `pDepthClampRange`}
    public @CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment pDepthClampRange() { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_pDepthClampRange(this.segment()); }
    /// Sets `pDepthClampRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDepthClampRange(MemorySegment segment, long index, @CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment value) { VH_pDepthClampRange.set(segment, 0L, index, value); }
    /// Sets `pDepthClampRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDepthClampRange(MemorySegment segment, @CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_pDepthClampRange(segment, 0L, value); }
    /// Sets `pDepthClampRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportDepthClampControlCreateInfoEXT pDepthClampRange(@CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_pDepthClampRange(this.segment(), value); return this; }

    /// A buffer of [VkPipelineViewportDepthClampControlCreateInfoEXT].
    public static final class Buffer extends VkPipelineViewportDepthClampControlCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineViewportDepthClampControlCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineViewportDepthClampControlCreateInfoEXT`
        public VkPipelineViewportDepthClampControlCreateInfoEXT asSlice(long index) { return new VkPipelineViewportDepthClampControlCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineViewportDepthClampControlCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineViewportDepthClampControlCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `depthClampMode` at the given index}
        /// @param index the index
        public @CType("VkDepthClampModeEXT") int depthClampModeAt(long index) { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_depthClampMode(this.segment(), index); }
        /// Sets `depthClampMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthClampModeAt(long index, @CType("VkDepthClampModeEXT") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_depthClampMode(this.segment(), index, value); return this; }

        /// {@return `pDepthClampRange` at the given index}
        /// @param index the index
        public @CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment pDepthClampRangeAt(long index) { return VkPipelineViewportDepthClampControlCreateInfoEXT.get_pDepthClampRange(this.segment(), index); }
        /// Sets `pDepthClampRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDepthClampRangeAt(long index, @CType("const VkDepthClampRangeEXT *") java.lang.foreign.MemorySegment value) { VkPipelineViewportDepthClampControlCreateInfoEXT.set_pDepthClampRange(this.segment(), index, value); return this; }

    }
}
