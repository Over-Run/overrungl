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
/// struct VkPhysicalDeviceBorderColorSwizzleFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 borderColorSwizzle;
///     VkBool32 borderColorSwizzleFromImage;
/// };
/// ```
public sealed class VkPhysicalDeviceBorderColorSwizzleFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzle"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzleFromImage")
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
    /// The byte offset of `borderColorSwizzle`.
    public static final long OFFSET_borderColorSwizzle = LAYOUT.byteOffset(PathElement.groupElement("borderColorSwizzle"));
    /// The memory layout of `borderColorSwizzle`.
    public static final MemoryLayout LAYOUT_borderColorSwizzle = LAYOUT.select(PathElement.groupElement("borderColorSwizzle"));
    /// The [VarHandle] of `borderColorSwizzle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_borderColorSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColorSwizzle"));
    /// The byte offset of `borderColorSwizzleFromImage`.
    public static final long OFFSET_borderColorSwizzleFromImage = LAYOUT.byteOffset(PathElement.groupElement("borderColorSwizzleFromImage"));
    /// The memory layout of `borderColorSwizzleFromImage`.
    public static final MemoryLayout LAYOUT_borderColorSwizzleFromImage = LAYOUT.select(PathElement.groupElement("borderColorSwizzleFromImage"));
    /// The [VarHandle] of `borderColorSwizzleFromImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_borderColorSwizzleFromImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColorSwizzleFromImage"));

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT copyFrom(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `borderColorSwizzle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int borderColorSwizzle(MemorySegment segment, long index) { return (int) VH_borderColorSwizzle.get(segment, 0L, index); }
    /// {@return `borderColorSwizzle`}
    public int borderColorSwizzle() { return borderColorSwizzle(this.segment(), 0L); }
    /// Sets `borderColorSwizzle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void borderColorSwizzle(MemorySegment segment, long index, int value) { VH_borderColorSwizzle.set(segment, 0L, index, value); }
    /// Sets `borderColorSwizzle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzle(int value) { borderColorSwizzle(this.segment(), 0L, value); return this; }

    /// {@return `borderColorSwizzleFromImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int borderColorSwizzleFromImage(MemorySegment segment, long index) { return (int) VH_borderColorSwizzleFromImage.get(segment, 0L, index); }
    /// {@return `borderColorSwizzleFromImage`}
    public int borderColorSwizzleFromImage() { return borderColorSwizzleFromImage(this.segment(), 0L); }
    /// Sets `borderColorSwizzleFromImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void borderColorSwizzleFromImage(MemorySegment segment, long index, int value) { VH_borderColorSwizzleFromImage.set(segment, 0L, index, value); }
    /// Sets `borderColorSwizzleFromImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImage(int value) { borderColorSwizzleFromImage(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceBorderColorSwizzleFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceBorderColorSwizzleFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
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

        /// {@return `borderColorSwizzle` at the given index}
        /// @param index the index of the struct buffer
        public int borderColorSwizzleAt(long index) { return borderColorSwizzle(this.segment(), index); }
        /// Sets `borderColorSwizzle` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer borderColorSwizzleAt(long index, int value) { borderColorSwizzle(this.segment(), index, value); return this; }

        /// {@return `borderColorSwizzleFromImage` at the given index}
        /// @param index the index of the struct buffer
        public int borderColorSwizzleFromImageAt(long index) { return borderColorSwizzleFromImage(this.segment(), index); }
        /// Sets `borderColorSwizzleFromImage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer borderColorSwizzleFromImageAt(long index, int value) { borderColorSwizzleFromImage(this.segment(), index, value); return this; }

    }
}
