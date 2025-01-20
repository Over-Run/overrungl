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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### discardRectangleMode
/// [VarHandle][#VH_discardRectangleMode] - [Getter][#discardRectangleMode()] - [Setter][#discardRectangleMode(int)]
/// ### discardRectangleCount
/// [VarHandle][#VH_discardRectangleCount] - [Getter][#discardRectangleCount()] - [Setter][#discardRectangleCount(int)]
/// ### pDiscardRectangles
/// [VarHandle][#VH_pDiscardRectangles] - [Getter][#pDiscardRectangles()] - [Setter][#pDiscardRectangles(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineDiscardRectangleStateCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineDiscardRectangleStateCreateFlagsEXT flags;
///     VkDiscardRectangleModeEXT discardRectangleMode;
///     uint32_t discardRectangleCount;
///     const VkRect2D * pDiscardRectangles;
/// } VkPipelineDiscardRectangleStateCreateInfoEXT;
/// ```
public sealed class VkPipelineDiscardRectangleStateCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineDiscardRectangleStateCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("discardRectangleMode"),
        ValueLayout.JAVA_INT.withName("discardRectangleCount"),
        ValueLayout.ADDRESS.withName("pDiscardRectangles")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `discardRectangleMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_discardRectangleMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardRectangleMode"));
    /// The [VarHandle] of `discardRectangleCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_discardRectangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardRectangleCount"));
    /// The [VarHandle] of `pDiscardRectangles` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDiscardRectangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDiscardRectangles"));

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineDiscardRectangleStateCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(segment); }

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineDiscardRectangleStateCreateInfoEXT`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineDiscardRectangleStateCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineDiscardRectangleStateCreateInfoEXT`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int flags, @CType("VkDiscardRectangleModeEXT") int discardRectangleMode, @CType("uint32_t") int discardRectangleCount, @CType("const VkRect2D *") MemorySegment pDiscardRectangles) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).discardRectangleMode(discardRectangleMode).discardRectangleCount(discardRectangleCount).pDiscardRectangles(pDiscardRectangles); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT copyFrom(VkPipelineDiscardRectangleStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT pNext(@CType("const void *") MemorySegment value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int flags() { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT flags(@CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `discardRectangleMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDiscardRectangleModeEXT") int get_discardRectangleMode(MemorySegment segment, long index) { return (int) VH_discardRectangleMode.get(segment, 0L, index); }
    /// {@return `discardRectangleMode`}
    /// @param segment the segment of the struct
    public static @CType("VkDiscardRectangleModeEXT") int get_discardRectangleMode(MemorySegment segment) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_discardRectangleMode(segment, 0L); }
    /// {@return `discardRectangleMode`}
    public @CType("VkDiscardRectangleModeEXT") int discardRectangleMode() { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_discardRectangleMode(this.segment()); }
    /// Sets `discardRectangleMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_discardRectangleMode(MemorySegment segment, long index, @CType("VkDiscardRectangleModeEXT") int value) { VH_discardRectangleMode.set(segment, 0L, index, value); }
    /// Sets `discardRectangleMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_discardRectangleMode(MemorySegment segment, @CType("VkDiscardRectangleModeEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_discardRectangleMode(segment, 0L, value); }
    /// Sets `discardRectangleMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleMode(@CType("VkDiscardRectangleModeEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_discardRectangleMode(this.segment(), value); return this; }

    /// {@return `discardRectangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_discardRectangleCount(MemorySegment segment, long index) { return (int) VH_discardRectangleCount.get(segment, 0L, index); }
    /// {@return `discardRectangleCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_discardRectangleCount(MemorySegment segment) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_discardRectangleCount(segment, 0L); }
    /// {@return `discardRectangleCount`}
    public @CType("uint32_t") int discardRectangleCount() { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_discardRectangleCount(this.segment()); }
    /// Sets `discardRectangleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_discardRectangleCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_discardRectangleCount.set(segment, 0L, index, value); }
    /// Sets `discardRectangleCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_discardRectangleCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_discardRectangleCount(segment, 0L, value); }
    /// Sets `discardRectangleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCount(@CType("uint32_t") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_discardRectangleCount(this.segment(), value); return this; }

    /// {@return `pDiscardRectangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") MemorySegment get_pDiscardRectangles(MemorySegment segment, long index) { return (MemorySegment) VH_pDiscardRectangles.get(segment, 0L, index); }
    /// {@return `pDiscardRectangles`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") MemorySegment get_pDiscardRectangles(MemorySegment segment) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_pDiscardRectangles(segment, 0L); }
    /// {@return `pDiscardRectangles`}
    public @CType("const VkRect2D *") MemorySegment pDiscardRectangles() { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_pDiscardRectangles(this.segment()); }
    /// Sets `pDiscardRectangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDiscardRectangles(MemorySegment segment, long index, @CType("const VkRect2D *") MemorySegment value) { VH_pDiscardRectangles.set(segment, 0L, index, value); }
    /// Sets `pDiscardRectangles` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDiscardRectangles(MemorySegment segment, @CType("const VkRect2D *") MemorySegment value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_pDiscardRectangles(segment, 0L, value); }
    /// Sets `pDiscardRectangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectangles(@CType("const VkRect2D *") MemorySegment value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_pDiscardRectangles(this.segment(), value); return this; }

    /// A buffer of [VkPipelineDiscardRectangleStateCreateInfoEXT].
    public static final class Buffer extends VkPipelineDiscardRectangleStateCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineDiscardRectangleStateCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineDiscardRectangleStateCreateInfoEXT`
        public VkPipelineDiscardRectangleStateCreateInfoEXT asSlice(long index) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineDiscardRectangleStateCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineDiscardRectangleStateCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int flagsAt(long index) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `discardRectangleMode` at the given index}
        /// @param index the index
        public @CType("VkDiscardRectangleModeEXT") int discardRectangleModeAt(long index) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_discardRectangleMode(this.segment(), index); }
        /// Sets `discardRectangleMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer discardRectangleModeAt(long index, @CType("VkDiscardRectangleModeEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_discardRectangleMode(this.segment(), index, value); return this; }

        /// {@return `discardRectangleCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int discardRectangleCountAt(long index) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_discardRectangleCount(this.segment(), index); }
        /// Sets `discardRectangleCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer discardRectangleCountAt(long index, @CType("uint32_t") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_discardRectangleCount(this.segment(), index, value); return this; }

        /// {@return `pDiscardRectangles` at the given index}
        /// @param index the index
        public @CType("const VkRect2D *") MemorySegment pDiscardRectanglesAt(long index) { return VkPipelineDiscardRectangleStateCreateInfoEXT.get_pDiscardRectangles(this.segment(), index); }
        /// Sets `pDiscardRectangles` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDiscardRectanglesAt(long index, @CType("const VkRect2D *") MemorySegment value) { VkPipelineDiscardRectangleStateCreateInfoEXT.set_pDiscardRectangles(this.segment(), index, value); return this; }

    }
}
