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
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImageDrmFormatModifierPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint64_t drmFormatModifier;
/// };
/// ```
public sealed class VkImageDrmFormatModifierPropertiesEXT extends GroupType {
    /// The struct layout of `VkImageDrmFormatModifierPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifier")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `drmFormatModifier`.
    public static final long OFFSET_drmFormatModifier = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
    /// The memory layout of `drmFormatModifier`.
    public static final MemoryLayout LAYOUT_drmFormatModifier = LAYOUT.select(PathElement.groupElement("drmFormatModifier"));
    /// The [VarHandle] of `drmFormatModifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));

    /// Creates `VkImageDrmFormatModifierPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkImageDrmFormatModifierPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageDrmFormatModifierPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageDrmFormatModifierPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageDrmFormatModifierPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageDrmFormatModifierPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageDrmFormatModifierPropertiesEXT`
    public static VkImageDrmFormatModifierPropertiesEXT alloc(SegmentAllocator allocator) { return new VkImageDrmFormatModifierPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageDrmFormatModifierPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageDrmFormatModifierPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageDrmFormatModifierPropertiesEXT copyFrom(VkImageDrmFormatModifierPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long drmFormatModifier(MemorySegment segment, long index) { return (long) VH_drmFormatModifier.get(segment, 0L, index); }
    /// {@return `drmFormatModifier`}
    public long drmFormatModifier() { return drmFormatModifier(this.segment(), 0L); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifier(MemorySegment segment, long index, long value) { VH_drmFormatModifier.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierPropertiesEXT drmFormatModifier(long value) { drmFormatModifier(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageDrmFormatModifierPropertiesEXT].
    public static final class Buffer extends VkImageDrmFormatModifierPropertiesEXT {
        private final long elementCount;

        /// Creates `VkImageDrmFormatModifierPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageDrmFormatModifierPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageDrmFormatModifierPropertiesEXT`
        public VkImageDrmFormatModifierPropertiesEXT asSlice(long index) { return new VkImageDrmFormatModifierPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageDrmFormatModifierPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageDrmFormatModifierPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `drmFormatModifier` at the given index}
        /// @param index the index of the struct buffer
        public long drmFormatModifierAt(long index) { return drmFormatModifier(this.segment(), index); }
        /// Sets `drmFormatModifier` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierAt(long index, long value) { drmFormatModifier(this.segment(), index, value); return this; }

    }
}
