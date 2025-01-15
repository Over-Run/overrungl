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
/// ### planeAspect
/// [VarHandle][#VH_planeAspect] - [Getter][#planeAspect()] - [Setter][#planeAspect(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBindImagePlaneMemoryInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageAspectFlagBits planeAspect;
/// } VkBindImagePlaneMemoryInfo;
/// ```
public sealed class VkBindImagePlaneMemoryInfo extends Struct {
    /// The struct layout of `VkBindImagePlaneMemoryInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("planeAspect")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `planeAspect` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_planeAspect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeAspect"));

    /// Creates `VkBindImagePlaneMemoryInfo` with the given segment.
    /// @param segment the memory segment
    public VkBindImagePlaneMemoryInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBindImagePlaneMemoryInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImagePlaneMemoryInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindImagePlaneMemoryInfo(segment); }

    /// Creates `VkBindImagePlaneMemoryInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindImagePlaneMemoryInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImagePlaneMemoryInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBindImagePlaneMemoryInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBindImagePlaneMemoryInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBindImagePlaneMemoryInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImagePlaneMemoryInfo`
    public static VkBindImagePlaneMemoryInfo alloc(SegmentAllocator allocator) { return new VkBindImagePlaneMemoryInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBindImagePlaneMemoryInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindImagePlaneMemoryInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBindImagePlaneMemoryInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImagePlaneMemoryInfo`
    public static VkBindImagePlaneMemoryInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkImageAspectFlagBits") int planeAspect) { return alloc(allocator).sType(sType).pNext(pNext).planeAspect(planeAspect); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindImagePlaneMemoryInfo copyFrom(VkBindImagePlaneMemoryInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBindImagePlaneMemoryInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBindImagePlaneMemoryInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBindImagePlaneMemoryInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImagePlaneMemoryInfo sType(@CType("VkStructureType") int value) { VkBindImagePlaneMemoryInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBindImagePlaneMemoryInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBindImagePlaneMemoryInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindImagePlaneMemoryInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImagePlaneMemoryInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBindImagePlaneMemoryInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `planeAspect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlagBits") int get_planeAspect(MemorySegment segment, long index) { return (int) VH_planeAspect.get(segment, 0L, index); }
    /// {@return `planeAspect`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlagBits") int get_planeAspect(MemorySegment segment) { return VkBindImagePlaneMemoryInfo.get_planeAspect(segment, 0L); }
    /// {@return `planeAspect`}
    public @CType("VkImageAspectFlagBits") int planeAspect() { return VkBindImagePlaneMemoryInfo.get_planeAspect(this.segment()); }
    /// Sets `planeAspect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_planeAspect(MemorySegment segment, long index, @CType("VkImageAspectFlagBits") int value) { VH_planeAspect.set(segment, 0L, index, value); }
    /// Sets `planeAspect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_planeAspect(MemorySegment segment, @CType("VkImageAspectFlagBits") int value) { VkBindImagePlaneMemoryInfo.set_planeAspect(segment, 0L, value); }
    /// Sets `planeAspect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImagePlaneMemoryInfo planeAspect(@CType("VkImageAspectFlagBits") int value) { VkBindImagePlaneMemoryInfo.set_planeAspect(this.segment(), value); return this; }

    /// A buffer of [VkBindImagePlaneMemoryInfo].
    public static final class Buffer extends VkBindImagePlaneMemoryInfo {
        private final long elementCount;

        /// Creates `VkBindImagePlaneMemoryInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBindImagePlaneMemoryInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBindImagePlaneMemoryInfo`
        public VkBindImagePlaneMemoryInfo asSlice(long index) { return new VkBindImagePlaneMemoryInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBindImagePlaneMemoryInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBindImagePlaneMemoryInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBindImagePlaneMemoryInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBindImagePlaneMemoryInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBindImagePlaneMemoryInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBindImagePlaneMemoryInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `planeAspect` at the given index}
        /// @param index the index
        public @CType("VkImageAspectFlagBits") int planeAspectAt(long index) { return VkBindImagePlaneMemoryInfo.get_planeAspect(this.segment(), index); }
        /// Sets `planeAspect` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer planeAspectAt(long index, @CType("VkImageAspectFlagBits") int value) { VkBindImagePlaneMemoryInfo.set_planeAspect(this.segment(), index, value); return this; }

    }
}
