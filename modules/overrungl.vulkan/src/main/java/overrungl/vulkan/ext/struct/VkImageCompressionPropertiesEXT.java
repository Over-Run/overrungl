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
/// ### imageCompressionFlags
/// [VarHandle][#VH_imageCompressionFlags] - [Getter][#imageCompressionFlags()] - [Setter][#imageCompressionFlags(int)]
/// ### imageCompressionFixedRateFlags
/// [VarHandle][#VH_imageCompressionFixedRateFlags] - [Getter][#imageCompressionFixedRateFlags()] - [Setter][#imageCompressionFixedRateFlags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageCompressionPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkImageCompressionFlagsEXT imageCompressionFlags;
///     VkImageCompressionFixedRateFlagsEXT imageCompressionFixedRateFlags;
/// } VkImageCompressionPropertiesEXT;
/// ```
public sealed class VkImageCompressionPropertiesEXT extends Struct {
    /// The struct layout of `VkImageCompressionPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionFlags"),
        ValueLayout.JAVA_INT.withName("imageCompressionFixedRateFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `imageCompressionFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageCompressionFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionFlags"));
    /// The [VarHandle] of `imageCompressionFixedRateFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageCompressionFixedRateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionFixedRateFlags"));

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkImageCompressionPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageCompressionPropertiesEXT(segment); }

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageCompressionPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageCompressionPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageCompressionPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageCompressionPropertiesEXT`
    public static VkImageCompressionPropertiesEXT alloc(SegmentAllocator allocator) { return new VkImageCompressionPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageCompressionPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageCompressionPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageCompressionPropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageCompressionPropertiesEXT`
    public static VkImageCompressionPropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkImageCompressionFlagsEXT") int imageCompressionFlags, @CType("VkImageCompressionFixedRateFlagsEXT") int imageCompressionFixedRateFlags) { return alloc(allocator).sType(sType).pNext(pNext).imageCompressionFlags(imageCompressionFlags).imageCompressionFixedRateFlags(imageCompressionFixedRateFlags); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageCompressionPropertiesEXT copyFrom(VkImageCompressionPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageCompressionPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageCompressionPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageCompressionPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionPropertiesEXT sType(@CType("VkStructureType") int value) { VkImageCompressionPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkImageCompressionPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkImageCompressionPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkImageCompressionPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionPropertiesEXT pNext(@CType("void *") MemorySegment value) { VkImageCompressionPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `imageCompressionFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCompressionFlagsEXT") int get_imageCompressionFlags(MemorySegment segment, long index) { return (int) VH_imageCompressionFlags.get(segment, 0L, index); }
    /// {@return `imageCompressionFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCompressionFlagsEXT") int get_imageCompressionFlags(MemorySegment segment) { return VkImageCompressionPropertiesEXT.get_imageCompressionFlags(segment, 0L); }
    /// {@return `imageCompressionFlags`}
    public @CType("VkImageCompressionFlagsEXT") int imageCompressionFlags() { return VkImageCompressionPropertiesEXT.get_imageCompressionFlags(this.segment()); }
    /// Sets `imageCompressionFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageCompressionFlags(MemorySegment segment, long index, @CType("VkImageCompressionFlagsEXT") int value) { VH_imageCompressionFlags.set(segment, 0L, index, value); }
    /// Sets `imageCompressionFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageCompressionFlags(MemorySegment segment, @CType("VkImageCompressionFlagsEXT") int value) { VkImageCompressionPropertiesEXT.set_imageCompressionFlags(segment, 0L, value); }
    /// Sets `imageCompressionFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionPropertiesEXT imageCompressionFlags(@CType("VkImageCompressionFlagsEXT") int value) { VkImageCompressionPropertiesEXT.set_imageCompressionFlags(this.segment(), value); return this; }

    /// {@return `imageCompressionFixedRateFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCompressionFixedRateFlagsEXT") int get_imageCompressionFixedRateFlags(MemorySegment segment, long index) { return (int) VH_imageCompressionFixedRateFlags.get(segment, 0L, index); }
    /// {@return `imageCompressionFixedRateFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCompressionFixedRateFlagsEXT") int get_imageCompressionFixedRateFlags(MemorySegment segment) { return VkImageCompressionPropertiesEXT.get_imageCompressionFixedRateFlags(segment, 0L); }
    /// {@return `imageCompressionFixedRateFlags`}
    public @CType("VkImageCompressionFixedRateFlagsEXT") int imageCompressionFixedRateFlags() { return VkImageCompressionPropertiesEXT.get_imageCompressionFixedRateFlags(this.segment()); }
    /// Sets `imageCompressionFixedRateFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageCompressionFixedRateFlags(MemorySegment segment, long index, @CType("VkImageCompressionFixedRateFlagsEXT") int value) { VH_imageCompressionFixedRateFlags.set(segment, 0L, index, value); }
    /// Sets `imageCompressionFixedRateFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageCompressionFixedRateFlags(MemorySegment segment, @CType("VkImageCompressionFixedRateFlagsEXT") int value) { VkImageCompressionPropertiesEXT.set_imageCompressionFixedRateFlags(segment, 0L, value); }
    /// Sets `imageCompressionFixedRateFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionPropertiesEXT imageCompressionFixedRateFlags(@CType("VkImageCompressionFixedRateFlagsEXT") int value) { VkImageCompressionPropertiesEXT.set_imageCompressionFixedRateFlags(this.segment(), value); return this; }

    /// A buffer of [VkImageCompressionPropertiesEXT].
    public static final class Buffer extends VkImageCompressionPropertiesEXT {
        private final long elementCount;

        /// Creates `VkImageCompressionPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageCompressionPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageCompressionPropertiesEXT`
        public VkImageCompressionPropertiesEXT asSlice(long index) { return new VkImageCompressionPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageCompressionPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageCompressionPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageCompressionPropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageCompressionPropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkImageCompressionPropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkImageCompressionPropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `imageCompressionFlags` at the given index}
        /// @param index the index
        public @CType("VkImageCompressionFlagsEXT") int imageCompressionFlagsAt(long index) { return VkImageCompressionPropertiesEXT.get_imageCompressionFlags(this.segment(), index); }
        /// Sets `imageCompressionFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageCompressionFlagsAt(long index, @CType("VkImageCompressionFlagsEXT") int value) { VkImageCompressionPropertiesEXT.set_imageCompressionFlags(this.segment(), index, value); return this; }

        /// {@return `imageCompressionFixedRateFlags` at the given index}
        /// @param index the index
        public @CType("VkImageCompressionFixedRateFlagsEXT") int imageCompressionFixedRateFlagsAt(long index) { return VkImageCompressionPropertiesEXT.get_imageCompressionFixedRateFlags(this.segment(), index); }
        /// Sets `imageCompressionFixedRateFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageCompressionFixedRateFlagsAt(long index, @CType("VkImageCompressionFixedRateFlagsEXT") int value) { VkImageCompressionPropertiesEXT.set_imageCompressionFixedRateFlags(this.segment(), index, value); return this; }

    }
}
