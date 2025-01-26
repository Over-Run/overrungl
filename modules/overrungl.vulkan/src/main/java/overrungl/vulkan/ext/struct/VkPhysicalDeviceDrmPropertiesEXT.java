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
/// struct VkPhysicalDeviceDrmPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 hasPrimary;
///     VkBool32 hasRender;
///     int64_t primaryMajor;
///     int64_t primaryMinor;
///     int64_t renderMajor;
///     int64_t renderMinor;
/// };
/// ```
public sealed class VkPhysicalDeviceDrmPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDrmPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasPrimary"),
        ValueLayout.JAVA_INT.withName("hasRender"),
        ValueLayout.JAVA_LONG.withName("primaryMajor"),
        ValueLayout.JAVA_LONG.withName("primaryMinor"),
        ValueLayout.JAVA_LONG.withName("renderMajor"),
        ValueLayout.JAVA_LONG.withName("renderMinor")
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
    /// The byte offset of `hasPrimary`.
    public static final long OFFSET_hasPrimary = LAYOUT.byteOffset(PathElement.groupElement("hasPrimary"));
    /// The memory layout of `hasPrimary`.
    public static final MemoryLayout LAYOUT_hasPrimary = LAYOUT.select(PathElement.groupElement("hasPrimary"));
    /// The [VarHandle] of `hasPrimary` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hasPrimary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasPrimary"));
    /// The byte offset of `hasRender`.
    public static final long OFFSET_hasRender = LAYOUT.byteOffset(PathElement.groupElement("hasRender"));
    /// The memory layout of `hasRender`.
    public static final MemoryLayout LAYOUT_hasRender = LAYOUT.select(PathElement.groupElement("hasRender"));
    /// The [VarHandle] of `hasRender` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hasRender = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasRender"));
    /// The byte offset of `primaryMajor`.
    public static final long OFFSET_primaryMajor = LAYOUT.byteOffset(PathElement.groupElement("primaryMajor"));
    /// The memory layout of `primaryMajor`.
    public static final MemoryLayout LAYOUT_primaryMajor = LAYOUT.select(PathElement.groupElement("primaryMajor"));
    /// The [VarHandle] of `primaryMajor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primaryMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryMajor"));
    /// The byte offset of `primaryMinor`.
    public static final long OFFSET_primaryMinor = LAYOUT.byteOffset(PathElement.groupElement("primaryMinor"));
    /// The memory layout of `primaryMinor`.
    public static final MemoryLayout LAYOUT_primaryMinor = LAYOUT.select(PathElement.groupElement("primaryMinor"));
    /// The [VarHandle] of `primaryMinor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primaryMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryMinor"));
    /// The byte offset of `renderMajor`.
    public static final long OFFSET_renderMajor = LAYOUT.byteOffset(PathElement.groupElement("renderMajor"));
    /// The memory layout of `renderMajor`.
    public static final MemoryLayout LAYOUT_renderMajor = LAYOUT.select(PathElement.groupElement("renderMajor"));
    /// The [VarHandle] of `renderMajor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderMajor"));
    /// The byte offset of `renderMinor`.
    public static final long OFFSET_renderMinor = LAYOUT.byteOffset(PathElement.groupElement("renderMinor"));
    /// The memory layout of `renderMinor`.
    public static final MemoryLayout LAYOUT_renderMinor = LAYOUT.select(PathElement.groupElement("renderMinor"));
    /// The [VarHandle] of `renderMinor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderMinor"));

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDrmPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDrmPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDrmPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDrmPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDrmPropertiesEXT`
    public static VkPhysicalDeviceDrmPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDrmPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDrmPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDrmPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT copyFrom(VkPhysicalDeviceDrmPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDrmPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDrmPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `hasPrimary` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hasPrimary(MemorySegment segment, long index) { return (int) VH_hasPrimary.get(segment, 0L, index); }
    /// {@return `hasPrimary`}
    public int hasPrimary() { return hasPrimary(this.segment(), 0L); }
    /// Sets `hasPrimary` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hasPrimary(MemorySegment segment, long index, int value) { VH_hasPrimary.set(segment, 0L, index, value); }
    /// Sets `hasPrimary` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT hasPrimary(int value) { hasPrimary(this.segment(), 0L, value); return this; }

    /// {@return `hasRender` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hasRender(MemorySegment segment, long index) { return (int) VH_hasRender.get(segment, 0L, index); }
    /// {@return `hasRender`}
    public int hasRender() { return hasRender(this.segment(), 0L); }
    /// Sets `hasRender` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hasRender(MemorySegment segment, long index, int value) { VH_hasRender.set(segment, 0L, index, value); }
    /// Sets `hasRender` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT hasRender(int value) { hasRender(this.segment(), 0L, value); return this; }

    /// {@return `primaryMajor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long primaryMajor(MemorySegment segment, long index) { return (long) VH_primaryMajor.get(segment, 0L, index); }
    /// {@return `primaryMajor`}
    public long primaryMajor() { return primaryMajor(this.segment(), 0L); }
    /// Sets `primaryMajor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primaryMajor(MemorySegment segment, long index, long value) { VH_primaryMajor.set(segment, 0L, index, value); }
    /// Sets `primaryMajor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT primaryMajor(long value) { primaryMajor(this.segment(), 0L, value); return this; }

    /// {@return `primaryMinor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long primaryMinor(MemorySegment segment, long index) { return (long) VH_primaryMinor.get(segment, 0L, index); }
    /// {@return `primaryMinor`}
    public long primaryMinor() { return primaryMinor(this.segment(), 0L); }
    /// Sets `primaryMinor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primaryMinor(MemorySegment segment, long index, long value) { VH_primaryMinor.set(segment, 0L, index, value); }
    /// Sets `primaryMinor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT primaryMinor(long value) { primaryMinor(this.segment(), 0L, value); return this; }

    /// {@return `renderMajor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long renderMajor(MemorySegment segment, long index) { return (long) VH_renderMajor.get(segment, 0L, index); }
    /// {@return `renderMajor`}
    public long renderMajor() { return renderMajor(this.segment(), 0L); }
    /// Sets `renderMajor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderMajor(MemorySegment segment, long index, long value) { VH_renderMajor.set(segment, 0L, index, value); }
    /// Sets `renderMajor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT renderMajor(long value) { renderMajor(this.segment(), 0L, value); return this; }

    /// {@return `renderMinor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long renderMinor(MemorySegment segment, long index) { return (long) VH_renderMinor.get(segment, 0L, index); }
    /// {@return `renderMinor`}
    public long renderMinor() { return renderMinor(this.segment(), 0L); }
    /// Sets `renderMinor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderMinor(MemorySegment segment, long index, long value) { VH_renderMinor.set(segment, 0L, index, value); }
    /// Sets `renderMinor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT renderMinor(long value) { renderMinor(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDrmPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceDrmPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDrmPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDrmPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDrmPropertiesEXT`
        public VkPhysicalDeviceDrmPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDrmPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDrmPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDrmPropertiesEXT`
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

        /// {@return `hasPrimary` at the given index}
        /// @param index the index of the struct buffer
        public int hasPrimaryAt(long index) { return hasPrimary(this.segment(), index); }
        /// Sets `hasPrimary` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer hasPrimaryAt(long index, int value) { hasPrimary(this.segment(), index, value); return this; }

        /// {@return `hasRender` at the given index}
        /// @param index the index of the struct buffer
        public int hasRenderAt(long index) { return hasRender(this.segment(), index); }
        /// Sets `hasRender` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer hasRenderAt(long index, int value) { hasRender(this.segment(), index, value); return this; }

        /// {@return `primaryMajor` at the given index}
        /// @param index the index of the struct buffer
        public long primaryMajorAt(long index) { return primaryMajor(this.segment(), index); }
        /// Sets `primaryMajor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primaryMajorAt(long index, long value) { primaryMajor(this.segment(), index, value); return this; }

        /// {@return `primaryMinor` at the given index}
        /// @param index the index of the struct buffer
        public long primaryMinorAt(long index) { return primaryMinor(this.segment(), index); }
        /// Sets `primaryMinor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primaryMinorAt(long index, long value) { primaryMinor(this.segment(), index, value); return this; }

        /// {@return `renderMajor` at the given index}
        /// @param index the index of the struct buffer
        public long renderMajorAt(long index) { return renderMajor(this.segment(), index); }
        /// Sets `renderMajor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer renderMajorAt(long index, long value) { renderMajor(this.segment(), index, value); return this; }

        /// {@return `renderMinor` at the given index}
        /// @param index the index of the struct buffer
        public long renderMinorAt(long index) { return renderMinor(this.segment(), index); }
        /// Sets `renderMinor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer renderMinorAt(long index, long value) { renderMinor(this.segment(), index, value); return this; }

    }
}
