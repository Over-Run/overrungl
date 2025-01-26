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
/// struct VkDrmFormatModifierPropertiesListEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t drmFormatModifierCount;
///     VkDrmFormatModifierPropertiesEXT* pDrmFormatModifierProperties;
/// };
/// ```
public sealed class VkDrmFormatModifierPropertiesListEXT extends GroupType {
    /// The struct layout of `VkDrmFormatModifierPropertiesListEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withName("pDrmFormatModifierProperties")
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
    /// The byte offset of `drmFormatModifierCount`.
    public static final long OFFSET_drmFormatModifierCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierCount"));
    /// The memory layout of `drmFormatModifierCount`.
    public static final MemoryLayout LAYOUT_drmFormatModifierCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierCount"));
    /// The [VarHandle] of `drmFormatModifierCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drmFormatModifierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierCount"));
    /// The byte offset of `pDrmFormatModifierProperties`.
    public static final long OFFSET_pDrmFormatModifierProperties = LAYOUT.byteOffset(PathElement.groupElement("pDrmFormatModifierProperties"));
    /// The memory layout of `pDrmFormatModifierProperties`.
    public static final MemoryLayout LAYOUT_pDrmFormatModifierProperties = LAYOUT.select(PathElement.groupElement("pDrmFormatModifierProperties"));
    /// The [VarHandle] of `pDrmFormatModifierProperties` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDrmFormatModifierProperties = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrmFormatModifierProperties"));

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    /// @param segment the memory segment
    public VkDrmFormatModifierPropertiesListEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierPropertiesListEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesListEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrmFormatModifierPropertiesListEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDrmFormatModifierPropertiesListEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrmFormatModifierPropertiesListEXT`
    public static VkDrmFormatModifierPropertiesListEXT alloc(SegmentAllocator allocator) { return new VkDrmFormatModifierPropertiesListEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrmFormatModifierPropertiesListEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrmFormatModifierPropertiesListEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrmFormatModifierPropertiesListEXT copyFrom(VkDrmFormatModifierPropertiesListEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDrmFormatModifierPropertiesListEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDrmFormatModifierPropertiesListEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int drmFormatModifierCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierCount.get(segment, 0L, index); }
    /// {@return `drmFormatModifierCount`}
    public int drmFormatModifierCount() { return drmFormatModifierCount(this.segment(), 0L); }
    /// Sets `drmFormatModifierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifierCount(MemorySegment segment, long index, int value) { VH_drmFormatModifierCount.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierPropertiesListEXT drmFormatModifierCount(int value) { drmFormatModifierCount(this.segment(), 0L, value); return this; }

    /// {@return `pDrmFormatModifierProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDrmFormatModifierProperties(MemorySegment segment, long index) { return (MemorySegment) VH_pDrmFormatModifierProperties.get(segment, 0L, index); }
    /// {@return `pDrmFormatModifierProperties`}
    public MemorySegment pDrmFormatModifierProperties() { return pDrmFormatModifierProperties(this.segment(), 0L); }
    /// Sets `pDrmFormatModifierProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDrmFormatModifierProperties(MemorySegment segment, long index, MemorySegment value) { VH_pDrmFormatModifierProperties.set(segment, 0L, index, value); }
    /// Sets `pDrmFormatModifierProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierPropertiesListEXT pDrmFormatModifierProperties(MemorySegment value) { pDrmFormatModifierProperties(this.segment(), 0L, value); return this; }

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

        /// {@return `drmFormatModifierCount` at the given index}
        /// @param index the index of the struct buffer
        public int drmFormatModifierCountAt(long index) { return drmFormatModifierCount(this.segment(), index); }
        /// Sets `drmFormatModifierCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierCountAt(long index, int value) { drmFormatModifierCount(this.segment(), index, value); return this; }

        /// {@return `pDrmFormatModifierProperties` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDrmFormatModifierPropertiesAt(long index) { return pDrmFormatModifierProperties(this.segment(), index); }
        /// Sets `pDrmFormatModifierProperties` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDrmFormatModifierPropertiesAt(long index, MemorySegment value) { pDrmFormatModifierProperties(this.segment(), index, value); return this; }

    }
}
