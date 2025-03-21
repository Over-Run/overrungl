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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkTilePropertiesQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkExtent3D) VkExtent3D tileSize;
///     (struct VkExtent2D) VkExtent2D apronSize;
///     (struct VkOffset2D) VkOffset2D origin;
/// };
/// ```
public sealed class VkTilePropertiesQCOM extends GroupType {
    /// The struct layout of `VkTilePropertiesQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("tileSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("apronSize"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("origin")
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
    /// The byte offset of `tileSize`.
    public static final long OFFSET_tileSize = LAYOUT.byteOffset(PathElement.groupElement("tileSize"));
    /// The memory layout of `tileSize`.
    public static final MemoryLayout LAYOUT_tileSize = LAYOUT.select(PathElement.groupElement("tileSize"));
    /// The byte offset of `apronSize`.
    public static final long OFFSET_apronSize = LAYOUT.byteOffset(PathElement.groupElement("apronSize"));
    /// The memory layout of `apronSize`.
    public static final MemoryLayout LAYOUT_apronSize = LAYOUT.select(PathElement.groupElement("apronSize"));
    /// The byte offset of `origin`.
    public static final long OFFSET_origin = LAYOUT.byteOffset(PathElement.groupElement("origin"));
    /// The memory layout of `origin`.
    public static final MemoryLayout LAYOUT_origin = LAYOUT.select(PathElement.groupElement("origin"));

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkTilePropertiesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTilePropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTilePropertiesQCOM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkTilePropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTilePropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTilePropertiesQCOM`
    public static VkTilePropertiesQCOM alloc(SegmentAllocator allocator) { return new VkTilePropertiesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTilePropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTilePropertiesQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTilePropertiesQCOM copyFrom(VkTilePropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkTilePropertiesQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTilePropertiesQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tileSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment tileSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_tileSize, index), LAYOUT_tileSize); }
    /// {@return `tileSize`}
    public MemorySegment tileSize() { return tileSize(this.segment(), 0L); }
    /// Sets `tileSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_tileSize, index), LAYOUT_tileSize.byteSize()); }
    /// Sets `tileSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTilePropertiesQCOM tileSize(MemorySegment value) { tileSize(this.segment(), 0L, value); return this; }

    /// {@return `apronSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment apronSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_apronSize, index), LAYOUT_apronSize); }
    /// {@return `apronSize`}
    public MemorySegment apronSize() { return apronSize(this.segment(), 0L); }
    /// Sets `apronSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void apronSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_apronSize, index), LAYOUT_apronSize.byteSize()); }
    /// Sets `apronSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTilePropertiesQCOM apronSize(MemorySegment value) { apronSize(this.segment(), 0L, value); return this; }

    /// {@return `origin` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment origin(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_origin, index), LAYOUT_origin); }
    /// {@return `origin`}
    public MemorySegment origin() { return origin(this.segment(), 0L); }
    /// Sets `origin` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void origin(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_origin, index), LAYOUT_origin.byteSize()); }
    /// Sets `origin` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTilePropertiesQCOM origin(MemorySegment value) { origin(this.segment(), 0L, value); return this; }

    /// A buffer of [VkTilePropertiesQCOM].
    public static final class Buffer extends VkTilePropertiesQCOM {
        private final long elementCount;

        /// Creates `VkTilePropertiesQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkTilePropertiesQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkTilePropertiesQCOM`
        public VkTilePropertiesQCOM asSlice(long index) { return new VkTilePropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkTilePropertiesQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkTilePropertiesQCOM`
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

        /// {@return `tileSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment tileSizeAt(long index) { return tileSize(this.segment(), index); }
        /// Sets `tileSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer tileSizeAt(long index, MemorySegment value) { tileSize(this.segment(), index, value); return this; }

        /// {@return `apronSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment apronSizeAt(long index) { return apronSize(this.segment(), index); }
        /// Sets `apronSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer apronSizeAt(long index, MemorySegment value) { apronSize(this.segment(), index, value); return this; }

        /// {@return `origin` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment originAt(long index) { return origin(this.segment(), index); }
        /// Sets `origin` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer originAt(long index, MemorySegment value) { origin(this.segment(), index, value); return this; }

    }
}
