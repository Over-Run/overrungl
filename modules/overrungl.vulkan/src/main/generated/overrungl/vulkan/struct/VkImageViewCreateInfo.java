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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImageViewCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkImageViewCreateFlags flags;
///     (uint64_t) VkImage image;
///     (int) VkImageViewType viewType;
///     (int) VkFormat format;
///     (struct VkComponentMapping) VkComponentMapping components;
///     (struct VkImageSubresourceRange) VkImageSubresourceRange subresourceRange;
/// };
/// ```
public sealed class VkImageViewCreateInfo extends GroupType {
    /// The struct layout of `VkImageViewCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_INT.withName("viewType"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("components"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `image`.
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    /// The memory layout of `image`.
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The byte offset of `viewType`.
    public static final long OFFSET_viewType = LAYOUT.byteOffset(PathElement.groupElement("viewType"));
    /// The memory layout of `viewType`.
    public static final MemoryLayout LAYOUT_viewType = LAYOUT.select(PathElement.groupElement("viewType"));
    /// The [VarHandle] of `viewType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewType"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `components`.
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    /// The memory layout of `components`.
    public static final MemoryLayout LAYOUT_components = LAYOUT.select(PathElement.groupElement("components"));
    /// The byte offset of `subresourceRange`.
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    /// The memory layout of `subresourceRange`.
    public static final MemoryLayout LAYOUT_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));

    /// Creates `VkImageViewCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkImageViewCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageViewCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageViewCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewCreateInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkImageViewCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo alloc(SegmentAllocator allocator) { return new VkImageViewCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param image `image`
    /// @param viewType `viewType`
    /// @param format `format`
    /// @param components `components`
    /// @param subresourceRange `subresourceRange`
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long image, int viewType, int format, MemorySegment components, MemorySegment subresourceRange) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).image(image).viewType(viewType).format(format).components(components).subresourceRange(subresourceRange);
    }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param image `image`
    /// @param viewType `viewType`
    /// @param format `format`
    /// @param components `components`
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long image, int viewType, int format, MemorySegment components) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).image(image).viewType(viewType).format(format).components(components);
    }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param image `image`
    /// @param viewType `viewType`
    /// @param format `format`
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long image, int viewType, int format) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).image(image).viewType(viewType).format(format);
    }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param image `image`
    /// @param viewType `viewType`
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long image, int viewType) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).image(image).viewType(viewType);
    }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param image `image`
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long image) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).image(image);
    }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageViewCreateInfo copyFrom(VkImageViewCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkImageViewCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageViewCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkImageViewCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long image(MemorySegment segment, long index) { return (long) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    public long image() { return image(this.segment(), 0L); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void image(MemorySegment segment, long index, long value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo image(long value) { image(this.segment(), 0L, value); return this; }

    /// {@return `viewType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewType(MemorySegment segment, long index) { return (int) VH_viewType.get(segment, 0L, index); }
    /// {@return `viewType`}
    public int viewType() { return viewType(this.segment(), 0L); }
    /// Sets `viewType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewType(MemorySegment segment, long index, int value) { VH_viewType.set(segment, 0L, index, value); }
    /// Sets `viewType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo viewType(int value) { viewType(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `components` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment components(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_components, index), LAYOUT_components); }
    /// {@return `components`}
    public MemorySegment components() { return components(this.segment(), 0L); }
    /// Sets `components` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void components(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_components, index), LAYOUT_components.byteSize()); }
    /// Sets `components` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo components(MemorySegment value) { components(this.segment(), 0L, value); return this; }

    /// {@return `subresourceRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment subresourceRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange); }
    /// {@return `subresourceRange`}
    public MemorySegment subresourceRange() { return subresourceRange(this.segment(), 0L); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subresourceRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange.byteSize()); }
    /// Sets `subresourceRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo subresourceRange(MemorySegment value) { subresourceRange(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImageViewCreateInfo].
    public static final class Buffer extends VkImageViewCreateInfo {
        private final long elementCount;

        /// Creates `VkImageViewCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageViewCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageViewCreateInfo`
        public VkImageViewCreateInfo asSlice(long index) { return new VkImageViewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageViewCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageViewCreateInfo`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `image` at the given index}
        /// @param index the index of the struct buffer
        public long imageAt(long index) { return image(this.segment(), index); }
        /// Sets `image` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageAt(long index, long value) { image(this.segment(), index, value); return this; }

        /// {@return `viewType` at the given index}
        /// @param index the index of the struct buffer
        public int viewTypeAt(long index) { return viewType(this.segment(), index); }
        /// Sets `viewType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer viewTypeAt(long index, int value) { viewType(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index of the struct buffer
        public int formatAt(long index) { return format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, int value) { format(this.segment(), index, value); return this; }

        /// {@return `components` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment componentsAt(long index) { return components(this.segment(), index); }
        /// Sets `components` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer componentsAt(long index, MemorySegment value) { components(this.segment(), index, value); return this; }

        /// {@return `subresourceRange` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment subresourceRangeAt(long index) { return subresourceRange(this.segment(), index); }
        /// Sets `subresourceRange` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subresourceRangeAt(long index, MemorySegment value) { subresourceRange(this.segment(), index, value); return this; }

    }
}
