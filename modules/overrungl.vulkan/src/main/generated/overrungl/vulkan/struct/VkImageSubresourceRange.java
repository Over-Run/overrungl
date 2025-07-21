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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImageSubresourceRange {
///     ((uint32_t) VkFlags) VkImageAspectFlags aspectMask;
///     uint32_t baseMipLevel;
///     uint32_t levelCount;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// };
/// ```
public final class VkImageSubresourceRange extends GroupType {
    /// The struct layout of `VkImageSubresourceRange`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("baseMipLevel"),
        ValueLayout.JAVA_INT.withName("levelCount"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    /// The byte offset of `aspectMask`.
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    /// The memory layout of `aspectMask`.
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The byte offset of `baseMipLevel`.
    public static final long OFFSET_baseMipLevel = LAYOUT.byteOffset(PathElement.groupElement("baseMipLevel"));
    /// The memory layout of `baseMipLevel`.
    public static final MemoryLayout LAYOUT_baseMipLevel = LAYOUT.select(PathElement.groupElement("baseMipLevel"));
    /// The [VarHandle] of `baseMipLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseMipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseMipLevel"));
    /// The byte offset of `levelCount`.
    public static final long OFFSET_levelCount = LAYOUT.byteOffset(PathElement.groupElement("levelCount"));
    /// The memory layout of `levelCount`.
    public static final MemoryLayout LAYOUT_levelCount = LAYOUT.select(PathElement.groupElement("levelCount"));
    /// The [VarHandle] of `levelCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_levelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("levelCount"));
    /// The byte offset of `baseArrayLayer`.
    public static final long OFFSET_baseArrayLayer = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
    /// The memory layout of `baseArrayLayer`.
    public static final MemoryLayout LAYOUT_baseArrayLayer = LAYOUT.select(PathElement.groupElement("baseArrayLayer"));
    /// The [VarHandle] of `baseArrayLayer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    /// The byte offset of `layerCount`.
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    /// The memory layout of `layerCount`.
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    /// Creates `VkImageSubresourceRange` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageSubresourceRange(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageSubresourceRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceRange of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageSubresourceRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceRange ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageSubresourceRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceRange ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange alloc(SegmentAllocator allocator) { return new VkImageSubresourceRange(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange alloc(SegmentAllocator allocator, long count) { return new VkImageSubresourceRange(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param baseMipLevel `baseMipLevel`
    /// @param levelCount `levelCount`
    /// @param baseArrayLayer `baseArrayLayer`
    /// @param layerCount `layerCount`
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange allocInit(SegmentAllocator allocator, int aspectMask, int baseMipLevel, int levelCount, int baseArrayLayer, int layerCount) {
        return alloc(allocator).aspectMask(aspectMask).baseMipLevel(baseMipLevel).levelCount(levelCount).baseArrayLayer(baseArrayLayer).layerCount(layerCount);
    }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param baseMipLevel `baseMipLevel`
    /// @param levelCount `levelCount`
    /// @param baseArrayLayer `baseArrayLayer`
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange allocInit(SegmentAllocator allocator, int aspectMask, int baseMipLevel, int levelCount, int baseArrayLayer) {
        return alloc(allocator).aspectMask(aspectMask).baseMipLevel(baseMipLevel).levelCount(levelCount).baseArrayLayer(baseArrayLayer);
    }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param baseMipLevel `baseMipLevel`
    /// @param levelCount `levelCount`
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange allocInit(SegmentAllocator allocator, int aspectMask, int baseMipLevel, int levelCount) {
        return alloc(allocator).aspectMask(aspectMask).baseMipLevel(baseMipLevel).levelCount(levelCount);
    }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @param baseMipLevel `baseMipLevel`
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange allocInit(SegmentAllocator allocator, int aspectMask, int baseMipLevel) {
        return alloc(allocator).aspectMask(aspectMask).baseMipLevel(baseMipLevel);
    }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param aspectMask `aspectMask`
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange allocInit(SegmentAllocator allocator, int aspectMask) {
        return alloc(allocator).aspectMask(aspectMask);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageSubresourceRange copyFrom(VkImageSubresourceRange src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageSubresourceRange reinterpret(long count) { return new VkImageSubresourceRange(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    public int aspectMask() { return aspectMask(this.segment(), 0L); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspectMask(MemorySegment segment, long index, int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

    /// {@return `baseMipLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseMipLevel(MemorySegment segment, long index) { return (int) VH_baseMipLevel.get(segment, 0L, index); }
    /// {@return `baseMipLevel`}
    public int baseMipLevel() { return baseMipLevel(this.segment(), 0L); }
    /// Sets `baseMipLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseMipLevel(MemorySegment segment, long index, int value) { VH_baseMipLevel.set(segment, 0L, index, value); }
    /// Sets `baseMipLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange baseMipLevel(int value) { baseMipLevel(this.segment(), 0L, value); return this; }

    /// {@return `levelCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int levelCount(MemorySegment segment, long index) { return (int) VH_levelCount.get(segment, 0L, index); }
    /// {@return `levelCount`}
    public int levelCount() { return levelCount(this.segment(), 0L); }
    /// Sets `levelCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void levelCount(MemorySegment segment, long index, int value) { VH_levelCount.set(segment, 0L, index, value); }
    /// Sets `levelCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange levelCount(int value) { levelCount(this.segment(), 0L, value); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseArrayLayer(MemorySegment segment, long index) { return (int) VH_baseArrayLayer.get(segment, 0L, index); }
    /// {@return `baseArrayLayer`}
    public int baseArrayLayer() { return baseArrayLayer(this.segment(), 0L); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseArrayLayer(MemorySegment segment, long index, int value) { VH_baseArrayLayer.set(segment, 0L, index, value); }
    /// Sets `baseArrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange baseArrayLayer(int value) { baseArrayLayer(this.segment(), 0L, value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    public int layerCount() { return layerCount(this.segment(), 0L); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layerCount(MemorySegment segment, long index, int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange layerCount(int value) { layerCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageSubresourceRange`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageSubresourceRange`
    public VkImageSubresourceRange asSlice(long index) { return new VkImageSubresourceRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageSubresourceRange`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageSubresourceRange`
    public VkImageSubresourceRange asSlice(long index, long count) { return new VkImageSubresourceRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageSubresourceRange` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageSubresourceRange at(long index, Consumer<VkImageSubresourceRange> func) { func.accept(asSlice(index)); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param index the index of the struct buffer
    public int aspectMaskAt(long index) { return aspectMask(this.segment(), index); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange aspectMaskAt(long index, int value) { aspectMask(this.segment(), index, value); return this; }

    /// {@return `baseMipLevel` at the given index}
    /// @param index the index of the struct buffer
    public int baseMipLevelAt(long index) { return baseMipLevel(this.segment(), index); }
    /// Sets `baseMipLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange baseMipLevelAt(long index, int value) { baseMipLevel(this.segment(), index, value); return this; }

    /// {@return `levelCount` at the given index}
    /// @param index the index of the struct buffer
    public int levelCountAt(long index) { return levelCount(this.segment(), index); }
    /// Sets `levelCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange levelCountAt(long index, int value) { levelCount(this.segment(), index, value); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param index the index of the struct buffer
    public int baseArrayLayerAt(long index) { return baseArrayLayer(this.segment(), index); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange baseArrayLayerAt(long index, int value) { baseArrayLayer(this.segment(), index, value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param index the index of the struct buffer
    public int layerCountAt(long index) { return layerCount(this.segment(), index); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange layerCountAt(long index, int value) { layerCount(this.segment(), index, value); return this; }

}
