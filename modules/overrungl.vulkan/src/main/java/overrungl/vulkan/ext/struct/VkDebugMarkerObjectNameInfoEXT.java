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
/// struct VkDebugMarkerObjectNameInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkDebugReportObjectTypeEXT objectType;
///     uint64_t object;
///     const char* pObjectName;
/// };
/// ```
public sealed class VkDebugMarkerObjectNameInfoEXT extends GroupType {
    /// The struct layout of `VkDebugMarkerObjectNameInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("object"),
        ValueLayout.ADDRESS.withName("pObjectName")
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
    /// The byte offset of `objectType`.
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    /// The memory layout of `objectType`.
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The byte offset of `object`.
    public static final long OFFSET_object = LAYOUT.byteOffset(PathElement.groupElement("object"));
    /// The memory layout of `object`.
    public static final MemoryLayout LAYOUT_object = LAYOUT.select(PathElement.groupElement("object"));
    /// The [VarHandle] of `object` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_object = LAYOUT.arrayElementVarHandle(PathElement.groupElement("object"));
    /// The byte offset of `pObjectName`.
    public static final long OFFSET_pObjectName = LAYOUT.byteOffset(PathElement.groupElement("pObjectName"));
    /// The memory layout of `pObjectName`.
    public static final MemoryLayout LAYOUT_pObjectName = LAYOUT.select(PathElement.groupElement("pObjectName"));
    /// The [VarHandle] of `pObjectName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pObjectName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjectName"));

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugMarkerObjectNameInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugMarkerObjectNameInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugMarkerObjectNameInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugMarkerObjectNameInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDebugMarkerObjectNameInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugMarkerObjectNameInfoEXT`
    public static VkDebugMarkerObjectNameInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugMarkerObjectNameInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugMarkerObjectNameInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugMarkerObjectNameInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT copyFrom(VkDebugMarkerObjectNameInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDebugMarkerObjectNameInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDebugMarkerObjectNameInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    public int objectType() { return objectType(this.segment(), 0L); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectType(MemorySegment segment, long index, int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT objectType(int value) { objectType(this.segment(), 0L, value); return this; }

    /// {@return `object` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long object(MemorySegment segment, long index) { return (long) VH_object.get(segment, 0L, index); }
    /// {@return `object`}
    public long object() { return object(this.segment(), 0L); }
    /// Sets `object` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void object(MemorySegment segment, long index, long value) { VH_object.set(segment, 0L, index, value); }
    /// Sets `object` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT object(long value) { object(this.segment(), 0L, value); return this; }

    /// {@return `pObjectName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pObjectName(MemorySegment segment, long index) { return (MemorySegment) VH_pObjectName.get(segment, 0L, index); }
    /// {@return `pObjectName`}
    public MemorySegment pObjectName() { return pObjectName(this.segment(), 0L); }
    /// Sets `pObjectName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pObjectName(MemorySegment segment, long index, MemorySegment value) { VH_pObjectName.set(segment, 0L, index, value); }
    /// Sets `pObjectName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugMarkerObjectNameInfoEXT pObjectName(MemorySegment value) { pObjectName(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDebugMarkerObjectNameInfoEXT].
    public static final class Buffer extends VkDebugMarkerObjectNameInfoEXT {
        private final long elementCount;

        /// Creates `VkDebugMarkerObjectNameInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDebugMarkerObjectNameInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDebugMarkerObjectNameInfoEXT`
        public VkDebugMarkerObjectNameInfoEXT asSlice(long index) { return new VkDebugMarkerObjectNameInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDebugMarkerObjectNameInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDebugMarkerObjectNameInfoEXT`
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

        /// {@return `objectType` at the given index}
        /// @param index the index of the struct buffer
        public int objectTypeAt(long index) { return objectType(this.segment(), index); }
        /// Sets `objectType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer objectTypeAt(long index, int value) { objectType(this.segment(), index, value); return this; }

        /// {@return `object` at the given index}
        /// @param index the index of the struct buffer
        public long objectAt(long index) { return object(this.segment(), index); }
        /// Sets `object` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer objectAt(long index, long value) { object(this.segment(), index, value); return this; }

        /// {@return `pObjectName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pObjectNameAt(long index) { return pObjectName(this.segment(), index); }
        /// Sets `pObjectName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pObjectNameAt(long index, MemorySegment value) { pObjectName(this.segment(), index, value); return this; }

    }
}
