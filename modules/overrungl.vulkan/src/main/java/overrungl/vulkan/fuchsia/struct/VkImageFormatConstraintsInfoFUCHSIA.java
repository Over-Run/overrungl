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
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImageFormatConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageCreateInfo imageCreateInfo;
///     VkFormatFeatureFlags requiredFormatFeatures;
///     VkImageFormatConstraintsFlagsFUCHSIA flags;
///     uint64_t sysmemPixelFormat;
///     uint32_t colorSpaceCount;
///     const VkSysmemColorSpaceFUCHSIA* pColorSpaces;
/// };
/// ```
public sealed class VkImageFormatConstraintsInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkImageFormatConstraintsInfoFUCHSIA`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageCreateInfo.LAYOUT.withName("imageCreateInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("sysmemPixelFormat"),
        ValueLayout.JAVA_INT.withName("colorSpaceCount"),
        ValueLayout.ADDRESS.withName("pColorSpaces")
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
    /// The byte offset of `imageCreateInfo`.
    public static final long OFFSET_imageCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("imageCreateInfo"));
    /// The memory layout of `imageCreateInfo`.
    public static final MemoryLayout LAYOUT_imageCreateInfo = LAYOUT.select(PathElement.groupElement("imageCreateInfo"));
    /// The byte offset of `requiredFormatFeatures`.
    public static final long OFFSET_requiredFormatFeatures = LAYOUT.byteOffset(PathElement.groupElement("requiredFormatFeatures"));
    /// The memory layout of `requiredFormatFeatures`.
    public static final MemoryLayout LAYOUT_requiredFormatFeatures = LAYOUT.select(PathElement.groupElement("requiredFormatFeatures"));
    /// The [VarHandle] of `requiredFormatFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_requiredFormatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredFormatFeatures"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `sysmemPixelFormat`.
    public static final long OFFSET_sysmemPixelFormat = LAYOUT.byteOffset(PathElement.groupElement("sysmemPixelFormat"));
    /// The memory layout of `sysmemPixelFormat`.
    public static final MemoryLayout LAYOUT_sysmemPixelFormat = LAYOUT.select(PathElement.groupElement("sysmemPixelFormat"));
    /// The [VarHandle] of `sysmemPixelFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sysmemPixelFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemPixelFormat"));
    /// The byte offset of `colorSpaceCount`.
    public static final long OFFSET_colorSpaceCount = LAYOUT.byteOffset(PathElement.groupElement("colorSpaceCount"));
    /// The memory layout of `colorSpaceCount`.
    public static final MemoryLayout LAYOUT_colorSpaceCount = LAYOUT.select(PathElement.groupElement("colorSpaceCount"));
    /// The [VarHandle] of `colorSpaceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorSpaceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpaceCount"));
    /// The byte offset of `pColorSpaces`.
    public static final long OFFSET_pColorSpaces = LAYOUT.byteOffset(PathElement.groupElement("pColorSpaces"));
    /// The memory layout of `pColorSpaces`.
    public static final MemoryLayout LAYOUT_pColorSpaces = LAYOUT.select(PathElement.groupElement("pColorSpaces"));
    /// The [VarHandle] of `pColorSpaces` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorSpaces = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorSpaces"));

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkImageFormatConstraintsInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatConstraintsInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageFormatConstraintsInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatConstraintsInfoFUCHSIA`
    public static VkImageFormatConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImageFormatConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageFormatConstraintsInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageFormatConstraintsInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA copyFrom(VkImageFormatConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkImageFormatConstraintsInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageFormatConstraintsInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageCreateInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageCreateInfo, index), LAYOUT_imageCreateInfo); }
    /// {@return `imageCreateInfo`}
    public MemorySegment imageCreateInfo() { return imageCreateInfo(this.segment(), 0L); }
    /// Sets `imageCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageCreateInfo(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageCreateInfo, index), LAYOUT_imageCreateInfo.byteSize()); }
    /// Sets `imageCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo(MemorySegment value) { imageCreateInfo(this.segment(), 0L, value); return this; }

    /// {@return `requiredFormatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiredFormatFeatures(MemorySegment segment, long index) { return (int) VH_requiredFormatFeatures.get(segment, 0L, index); }
    /// {@return `requiredFormatFeatures`}
    public int requiredFormatFeatures() { return requiredFormatFeatures(this.segment(), 0L); }
    /// Sets `requiredFormatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiredFormatFeatures(MemorySegment segment, long index, int value) { VH_requiredFormatFeatures.set(segment, 0L, index, value); }
    /// Sets `requiredFormatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA requiredFormatFeatures(int value) { requiredFormatFeatures(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `sysmemPixelFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sysmemPixelFormat(MemorySegment segment, long index) { return (long) VH_sysmemPixelFormat.get(segment, 0L, index); }
    /// {@return `sysmemPixelFormat`}
    public long sysmemPixelFormat() { return sysmemPixelFormat(this.segment(), 0L); }
    /// Sets `sysmemPixelFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sysmemPixelFormat(MemorySegment segment, long index, long value) { VH_sysmemPixelFormat.set(segment, 0L, index, value); }
    /// Sets `sysmemPixelFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA sysmemPixelFormat(long value) { sysmemPixelFormat(this.segment(), 0L, value); return this; }

    /// {@return `colorSpaceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorSpaceCount(MemorySegment segment, long index) { return (int) VH_colorSpaceCount.get(segment, 0L, index); }
    /// {@return `colorSpaceCount`}
    public int colorSpaceCount() { return colorSpaceCount(this.segment(), 0L); }
    /// Sets `colorSpaceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorSpaceCount(MemorySegment segment, long index, int value) { VH_colorSpaceCount.set(segment, 0L, index, value); }
    /// Sets `colorSpaceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA colorSpaceCount(int value) { colorSpaceCount(this.segment(), 0L, value); return this; }

    /// {@return `pColorSpaces` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorSpaces(MemorySegment segment, long index) { return (MemorySegment) VH_pColorSpaces.get(segment, 0L, index); }
    /// {@return `pColorSpaces`}
    public MemorySegment pColorSpaces() { return pColorSpaces(this.segment(), 0L); }
    /// Sets `pColorSpaces` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorSpaces(MemorySegment segment, long index, MemorySegment value) { VH_pColorSpaces.set(segment, 0L, index, value); }
    /// Sets `pColorSpaces` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA pColorSpaces(MemorySegment value) { pColorSpaces(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageFormatConstraintsInfoFUCHSIA].
    public static final class Buffer extends VkImageFormatConstraintsInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkImageFormatConstraintsInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageFormatConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageFormatConstraintsInfoFUCHSIA`
        public VkImageFormatConstraintsInfoFUCHSIA asSlice(long index) { return new VkImageFormatConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageFormatConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageFormatConstraintsInfoFUCHSIA`
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

        /// {@return `imageCreateInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment imageCreateInfoAt(long index) { return imageCreateInfo(this.segment(), index); }
        /// Sets `imageCreateInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageCreateInfoAt(long index, MemorySegment value) { imageCreateInfo(this.segment(), index, value); return this; }

        /// {@return `requiredFormatFeatures` at the given index}
        /// @param index the index of the struct buffer
        public int requiredFormatFeaturesAt(long index) { return requiredFormatFeatures(this.segment(), index); }
        /// Sets `requiredFormatFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer requiredFormatFeaturesAt(long index, int value) { requiredFormatFeatures(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `sysmemPixelFormat` at the given index}
        /// @param index the index of the struct buffer
        public long sysmemPixelFormatAt(long index) { return sysmemPixelFormat(this.segment(), index); }
        /// Sets `sysmemPixelFormat` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sysmemPixelFormatAt(long index, long value) { sysmemPixelFormat(this.segment(), index, value); return this; }

        /// {@return `colorSpaceCount` at the given index}
        /// @param index the index of the struct buffer
        public int colorSpaceCountAt(long index) { return colorSpaceCount(this.segment(), index); }
        /// Sets `colorSpaceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer colorSpaceCountAt(long index, int value) { colorSpaceCount(this.segment(), index, value); return this; }

        /// {@return `pColorSpaces` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pColorSpacesAt(long index) { return pColorSpaces(this.segment(), index); }
        /// Sets `pColorSpaces` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pColorSpacesAt(long index, MemorySegment value) { pColorSpaces(this.segment(), index, value); return this; }

    }
}
