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
/// ### src
/// [VarHandle][#VH_src] - [Getter][#src()] - [Setter][#src(java.lang.foreign.MemorySegment)]
/// ### dst
/// [VarHandle][#VH_dst] - [Getter][#dst()] - [Setter][#dst(java.lang.foreign.MemorySegment)]
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyMicromapInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkMicromapEXT src;
///     VkMicromapEXT dst;
///     VkCopyMicromapModeEXT mode;
/// } VkCopyMicromapInfoEXT;
/// ```
public sealed class VkCopyMicromapInfoEXT extends Struct {
    /// The struct layout of `VkCopyMicromapInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("src"),
        ValueLayout.ADDRESS.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `src` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_src = LAYOUT.arrayElementVarHandle(PathElement.groupElement("src"));
    /// The [VarHandle] of `dst` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dst = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkCopyMicromapInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMicromapInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMicromapInfoEXT(segment); }

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMicromapInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMicromapInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCopyMicromapInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMicromapInfoEXT`
    public static VkCopyMicromapInfoEXT alloc(SegmentAllocator allocator) { return new VkCopyMicromapInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyMicromapInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMicromapInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyMicromapInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMicromapInfoEXT`
    public static VkCopyMicromapInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment src, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment dst, @CType("VkCopyMicromapModeEXT") int mode) { return alloc(allocator).sType(sType).pNext(pNext).src(src).dst(dst).mode(mode); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyMicromapInfoEXT copyFrom(VkCopyMicromapInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyMicromapInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyMicromapInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyMicromapInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT sType(@CType("VkStructureType") int value) { VkCopyMicromapInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCopyMicromapInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCopyMicromapInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `src` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_src(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_src.get(segment, 0L, index); }
    /// {@return `src`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_src(MemorySegment segment) { return VkCopyMicromapInfoEXT.get_src(segment, 0L); }
    /// {@return `src`}
    public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment src() { return VkCopyMicromapInfoEXT.get_src(this.segment()); }
    /// Sets `src` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_src(MemorySegment segment, long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VH_src.set(segment, 0L, index, value); }
    /// Sets `src` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_src(MemorySegment segment, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_src(segment, 0L, value); }
    /// Sets `src` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT src(@CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_src(this.segment(), value); return this; }

    /// {@return `dst` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_dst(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dst.get(segment, 0L, index); }
    /// {@return `dst`}
    /// @param segment the segment of the struct
    public static @CType("VkMicromapEXT") java.lang.foreign.MemorySegment get_dst(MemorySegment segment) { return VkCopyMicromapInfoEXT.get_dst(segment, 0L); }
    /// {@return `dst`}
    public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment dst() { return VkCopyMicromapInfoEXT.get_dst(this.segment()); }
    /// Sets `dst` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dst(MemorySegment segment, long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VH_dst.set(segment, 0L, index, value); }
    /// Sets `dst` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dst(MemorySegment segment, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_dst(segment, 0L, value); }
    /// Sets `dst` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT dst(@CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_dst(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCopyMicromapModeEXT") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkCopyMicromapModeEXT") int get_mode(MemorySegment segment) { return VkCopyMicromapInfoEXT.get_mode(segment, 0L); }
    /// {@return `mode`}
    public @CType("VkCopyMicromapModeEXT") int mode() { return VkCopyMicromapInfoEXT.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkCopyMicromapModeEXT") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkCopyMicromapModeEXT") int value) { VkCopyMicromapInfoEXT.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT mode(@CType("VkCopyMicromapModeEXT") int value) { VkCopyMicromapInfoEXT.set_mode(this.segment(), value); return this; }

    /// A buffer of [VkCopyMicromapInfoEXT].
    public static final class Buffer extends VkCopyMicromapInfoEXT {
        private final long elementCount;

        /// Creates `VkCopyMicromapInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCopyMicromapInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCopyMicromapInfoEXT`
        public VkCopyMicromapInfoEXT asSlice(long index) { return new VkCopyMicromapInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCopyMicromapInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCopyMicromapInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyMicromapInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyMicromapInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCopyMicromapInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `src` at the given index}
        /// @param index the index
        public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment srcAt(long index) { return VkCopyMicromapInfoEXT.get_src(this.segment(), index); }
        /// Sets `src` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcAt(long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_src(this.segment(), index, value); return this; }

        /// {@return `dst` at the given index}
        /// @param index the index
        public @CType("VkMicromapEXT") java.lang.foreign.MemorySegment dstAt(long index) { return VkCopyMicromapInfoEXT.get_dst(this.segment(), index); }
        /// Sets `dst` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstAt(long index, @CType("VkMicromapEXT") java.lang.foreign.MemorySegment value) { VkCopyMicromapInfoEXT.set_dst(this.segment(), index, value); return this; }

        /// {@return `mode` at the given index}
        /// @param index the index
        public @CType("VkCopyMicromapModeEXT") int modeAt(long index) { return VkCopyMicromapInfoEXT.get_mode(this.segment(), index); }
        /// Sets `mode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer modeAt(long index, @CType("VkCopyMicromapModeEXT") int value) { VkCopyMicromapInfoEXT.set_mode(this.segment(), index, value); return this; }

    }
}
