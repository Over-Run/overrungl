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
/// struct VkDrmFormatModifierPropertiesEXT {
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     VkFormatFeatureFlags drmFormatModifierTilingFeatures;
/// };
/// ```
public sealed class VkDrmFormatModifierPropertiesEXT extends GroupType {
    /// The struct layout of `VkDrmFormatModifierPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierTilingFeatures")
    );
    /// The byte offset of `drmFormatModifier`.
    public static final long OFFSET_drmFormatModifier = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
    /// The memory layout of `drmFormatModifier`.
    public static final MemoryLayout LAYOUT_drmFormatModifier = LAYOUT.select(PathElement.groupElement("drmFormatModifier"));
    /// The [VarHandle] of `drmFormatModifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    /// The byte offset of `drmFormatModifierPlaneCount`.
    public static final long OFFSET_drmFormatModifierPlaneCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The memory layout of `drmFormatModifierPlaneCount`.
    public static final MemoryLayout LAYOUT_drmFormatModifierPlaneCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The [VarHandle] of `drmFormatModifierPlaneCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drmFormatModifierPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The byte offset of `drmFormatModifierTilingFeatures`.
    public static final long OFFSET_drmFormatModifierTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierTilingFeatures"));
    /// The memory layout of `drmFormatModifierTilingFeatures`.
    public static final MemoryLayout LAYOUT_drmFormatModifierTilingFeatures = LAYOUT.select(PathElement.groupElement("drmFormatModifierTilingFeatures"));
    /// The [VarHandle] of `drmFormatModifierTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drmFormatModifierTilingFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierTilingFeatures"));

    /// Creates `VkDrmFormatModifierPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkDrmFormatModifierPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDrmFormatModifierPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrmFormatModifierPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDrmFormatModifierPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDrmFormatModifierPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrmFormatModifierPropertiesEXT`
    public static VkDrmFormatModifierPropertiesEXT alloc(SegmentAllocator allocator) { return new VkDrmFormatModifierPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDrmFormatModifierPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrmFormatModifierPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrmFormatModifierPropertiesEXT copyFrom(VkDrmFormatModifierPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkDrmFormatModifierPropertiesEXT drmFormatModifier(long value) { drmFormatModifier(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifierPlaneCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int drmFormatModifierPlaneCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierPlaneCount.get(segment, 0L, index); }
    /// {@return `drmFormatModifierPlaneCount`}
    public int drmFormatModifierPlaneCount() { return drmFormatModifierPlaneCount(this.segment(), 0L); }
    /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifierPlaneCount(MemorySegment segment, long index, int value) { VH_drmFormatModifierPlaneCount.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierPlaneCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierPlaneCount(int value) { drmFormatModifierPlaneCount(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifierTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int drmFormatModifierTilingFeatures(MemorySegment segment, long index) { return (int) VH_drmFormatModifierTilingFeatures.get(segment, 0L, index); }
    /// {@return `drmFormatModifierTilingFeatures`}
    public int drmFormatModifierTilingFeatures() { return drmFormatModifierTilingFeatures(this.segment(), 0L); }
    /// Sets `drmFormatModifierTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifierTilingFeatures(MemorySegment segment, long index, int value) { VH_drmFormatModifierTilingFeatures.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierPropertiesEXT drmFormatModifierTilingFeatures(int value) { drmFormatModifierTilingFeatures(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDrmFormatModifierPropertiesEXT].
    public static final class Buffer extends VkDrmFormatModifierPropertiesEXT {
        private final long elementCount;

        /// Creates `VkDrmFormatModifierPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDrmFormatModifierPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDrmFormatModifierPropertiesEXT`
        public VkDrmFormatModifierPropertiesEXT asSlice(long index) { return new VkDrmFormatModifierPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDrmFormatModifierPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDrmFormatModifierPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `drmFormatModifier` at the given index}
        /// @param index the index of the struct buffer
        public long drmFormatModifierAt(long index) { return drmFormatModifier(this.segment(), index); }
        /// Sets `drmFormatModifier` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierAt(long index, long value) { drmFormatModifier(this.segment(), index, value); return this; }

        /// {@return `drmFormatModifierPlaneCount` at the given index}
        /// @param index the index of the struct buffer
        public int drmFormatModifierPlaneCountAt(long index) { return drmFormatModifierPlaneCount(this.segment(), index); }
        /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierPlaneCountAt(long index, int value) { drmFormatModifierPlaneCount(this.segment(), index, value); return this; }

        /// {@return `drmFormatModifierTilingFeatures` at the given index}
        /// @param index the index of the struct buffer
        public int drmFormatModifierTilingFeaturesAt(long index) { return drmFormatModifierTilingFeatures(this.segment(), index); }
        /// Sets `drmFormatModifierTilingFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer drmFormatModifierTilingFeaturesAt(long index, int value) { drmFormatModifierTilingFeatures(this.segment(), index, value); return this; }

    }
}
