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
/// struct VkPhysicalDevice4444FormatsFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 formatA4R4G4B4;
///     (uint32_t) VkBool32 formatA4B4G4R4;
/// };
/// ```
public sealed class VkPhysicalDevice4444FormatsFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDevice4444FormatsFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatA4R4G4B4"),
        ValueLayout.JAVA_INT.withName("formatA4B4G4R4")
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
    /// The byte offset of `formatA4R4G4B4`.
    public static final long OFFSET_formatA4R4G4B4 = LAYOUT.byteOffset(PathElement.groupElement("formatA4R4G4B4"));
    /// The memory layout of `formatA4R4G4B4`.
    public static final MemoryLayout LAYOUT_formatA4R4G4B4 = LAYOUT.select(PathElement.groupElement("formatA4R4G4B4"));
    /// The [VarHandle] of `formatA4R4G4B4` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_formatA4R4G4B4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatA4R4G4B4"));
    /// The byte offset of `formatA4B4G4R4`.
    public static final long OFFSET_formatA4B4G4R4 = LAYOUT.byteOffset(PathElement.groupElement("formatA4B4G4R4"));
    /// The memory layout of `formatA4B4G4R4`.
    public static final MemoryLayout LAYOUT_formatA4B4G4R4 = LAYOUT.select(PathElement.groupElement("formatA4B4G4R4"));
    /// The [VarHandle] of `formatA4B4G4R4` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_formatA4B4G4R4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatA4B4G4R4"));

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevice4444FormatsFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice4444FormatsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice4444FormatsFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevice4444FormatsFeaturesEXT`
    public static VkPhysicalDevice4444FormatsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevice4444FormatsFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevice4444FormatsFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevice4444FormatsFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevice4444FormatsFeaturesEXT copyFrom(VkPhysicalDevice4444FormatsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDevice4444FormatsFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevice4444FormatsFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `formatA4R4G4B4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int formatA4R4G4B4(MemorySegment segment, long index) { return (int) VH_formatA4R4G4B4.get(segment, 0L, index); }
    /// {@return `formatA4R4G4B4`}
    public int formatA4R4G4B4() { return formatA4R4G4B4(this.segment(), 0L); }
    /// Sets `formatA4R4G4B4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void formatA4R4G4B4(MemorySegment segment, long index, int value) { VH_formatA4R4G4B4.set(segment, 0L, index, value); }
    /// Sets `formatA4R4G4B4` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4R4G4B4(int value) { formatA4R4G4B4(this.segment(), 0L, value); return this; }

    /// {@return `formatA4B4G4R4` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int formatA4B4G4R4(MemorySegment segment, long index) { return (int) VH_formatA4B4G4R4.get(segment, 0L, index); }
    /// {@return `formatA4B4G4R4`}
    public int formatA4B4G4R4() { return formatA4B4G4R4(this.segment(), 0L); }
    /// Sets `formatA4B4G4R4` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void formatA4B4G4R4(MemorySegment segment, long index, int value) { VH_formatA4B4G4R4.set(segment, 0L, index, value); }
    /// Sets `formatA4B4G4R4` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4B4G4R4(int value) { formatA4B4G4R4(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDevice4444FormatsFeaturesEXT].
    public static final class Buffer extends VkPhysicalDevice4444FormatsFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDevice4444FormatsFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevice4444FormatsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevice4444FormatsFeaturesEXT`
        public VkPhysicalDevice4444FormatsFeaturesEXT asSlice(long index) { return new VkPhysicalDevice4444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevice4444FormatsFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevice4444FormatsFeaturesEXT`
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

        /// {@return `formatA4R4G4B4` at the given index}
        /// @param index the index of the struct buffer
        public int formatA4R4G4B4At(long index) { return formatA4R4G4B4(this.segment(), index); }
        /// Sets `formatA4R4G4B4` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer formatA4R4G4B4At(long index, int value) { formatA4R4G4B4(this.segment(), index, value); return this; }

        /// {@return `formatA4B4G4R4` at the given index}
        /// @param index the index of the struct buffer
        public int formatA4B4G4R4At(long index) { return formatA4B4G4R4(this.segment(), index); }
        /// Sets `formatA4B4G4R4` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer formatA4B4G4R4At(long index, int value) { formatA4B4G4R4(this.segment(), index, value); return this; }

    }
}
