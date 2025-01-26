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
/// struct VkLayerSettingEXT {
///     const char* pLayerName;
///     const char* pSettingName;
///     (int) VkLayerSettingTypeEXT type;
///     uint32_t valueCount;
///     const void* pValues;
/// };
/// ```
public sealed class VkLayerSettingEXT extends GroupType {
    /// The struct layout of `VkLayerSettingEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("pLayerName"),
        ValueLayout.ADDRESS.withName("pSettingName"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("valueCount"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    /// The byte offset of `pLayerName`.
    public static final long OFFSET_pLayerName = LAYOUT.byteOffset(PathElement.groupElement("pLayerName"));
    /// The memory layout of `pLayerName`.
    public static final MemoryLayout LAYOUT_pLayerName = LAYOUT.select(PathElement.groupElement("pLayerName"));
    /// The [VarHandle] of `pLayerName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLayerName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayerName"));
    /// The byte offset of `pSettingName`.
    public static final long OFFSET_pSettingName = LAYOUT.byteOffset(PathElement.groupElement("pSettingName"));
    /// The memory layout of `pSettingName`.
    public static final MemoryLayout LAYOUT_pSettingName = LAYOUT.select(PathElement.groupElement("pSettingName"));
    /// The [VarHandle] of `pSettingName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSettingName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSettingName"));
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `valueCount`.
    public static final long OFFSET_valueCount = LAYOUT.byteOffset(PathElement.groupElement("valueCount"));
    /// The memory layout of `valueCount`.
    public static final MemoryLayout LAYOUT_valueCount = LAYOUT.select(PathElement.groupElement("valueCount"));
    /// The [VarHandle] of `valueCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_valueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueCount"));
    /// The byte offset of `pValues`.
    public static final long OFFSET_pValues = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
    /// The memory layout of `pValues`.
    public static final MemoryLayout LAYOUT_pValues = LAYOUT.select(PathElement.groupElement("pValues"));
    /// The [VarHandle] of `pValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues"));

    /// Creates `VkLayerSettingEXT` with the given segment.
    /// @param segment the memory segment
    public VkLayerSettingEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLayerSettingEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLayerSettingEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLayerSettingEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLayerSettingEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkLayerSettingEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerSettingEXT`
    public static VkLayerSettingEXT alloc(SegmentAllocator allocator) { return new VkLayerSettingEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLayerSettingEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLayerSettingEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLayerSettingEXT copyFrom(VkLayerSettingEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `pLayerName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLayerName(MemorySegment segment, long index) { return (MemorySegment) VH_pLayerName.get(segment, 0L, index); }
    /// {@return `pLayerName`}
    public MemorySegment pLayerName() { return pLayerName(this.segment(), 0L); }
    /// Sets `pLayerName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLayerName(MemorySegment segment, long index, MemorySegment value) { VH_pLayerName.set(segment, 0L, index, value); }
    /// Sets `pLayerName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pLayerName(MemorySegment value) { pLayerName(this.segment(), 0L, value); return this; }

    /// {@return `pSettingName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSettingName(MemorySegment segment, long index) { return (MemorySegment) VH_pSettingName.get(segment, 0L, index); }
    /// {@return `pSettingName`}
    public MemorySegment pSettingName() { return pSettingName(this.segment(), 0L); }
    /// Sets `pSettingName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSettingName(MemorySegment segment, long index, MemorySegment value) { VH_pSettingName.set(segment, 0L, index, value); }
    /// Sets `pSettingName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pSettingName(MemorySegment value) { pSettingName(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `valueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int valueCount(MemorySegment segment, long index) { return (int) VH_valueCount.get(segment, 0L, index); }
    /// {@return `valueCount`}
    public int valueCount() { return valueCount(this.segment(), 0L); }
    /// Sets `valueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void valueCount(MemorySegment segment, long index, int value) { VH_valueCount.set(segment, 0L, index, value); }
    /// Sets `valueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT valueCount(int value) { valueCount(this.segment(), 0L, value); return this; }

    /// {@return `pValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pValues(MemorySegment segment, long index) { return (MemorySegment) VH_pValues.get(segment, 0L, index); }
    /// {@return `pValues`}
    public MemorySegment pValues() { return pValues(this.segment(), 0L); }
    /// Sets `pValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pValues(MemorySegment segment, long index, MemorySegment value) { VH_pValues.set(segment, 0L, index, value); }
    /// Sets `pValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pValues(MemorySegment value) { pValues(this.segment(), 0L, value); return this; }

    /// A buffer of [VkLayerSettingEXT].
    public static final class Buffer extends VkLayerSettingEXT {
        private final long elementCount;

        /// Creates `VkLayerSettingEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkLayerSettingEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkLayerSettingEXT`
        public VkLayerSettingEXT asSlice(long index) { return new VkLayerSettingEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkLayerSettingEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkLayerSettingEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `pLayerName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pLayerNameAt(long index) { return pLayerName(this.segment(), index); }
        /// Sets `pLayerName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pLayerNameAt(long index, MemorySegment value) { pLayerName(this.segment(), index, value); return this; }

        /// {@return `pSettingName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSettingNameAt(long index) { return pSettingName(this.segment(), index); }
        /// Sets `pSettingName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSettingNameAt(long index, MemorySegment value) { pSettingName(this.segment(), index, value); return this; }

        /// {@return `type` at the given index}
        /// @param index the index of the struct buffer
        public int typeAt(long index) { return type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, int value) { type(this.segment(), index, value); return this; }

        /// {@return `valueCount` at the given index}
        /// @param index the index of the struct buffer
        public int valueCountAt(long index) { return valueCount(this.segment(), index); }
        /// Sets `valueCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer valueCountAt(long index, int value) { valueCount(this.segment(), index, value); return this; }

        /// {@return `pValues` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pValuesAt(long index) { return pValues(this.segment(), index); }
        /// Sets `pValues` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pValuesAt(long index, MemorySegment value) { pValues(this.segment(), index, value); return this; }

    }
}
