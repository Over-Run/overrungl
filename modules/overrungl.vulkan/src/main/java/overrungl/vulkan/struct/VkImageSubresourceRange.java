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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### aspectMask
/// [VarHandle][#VH_aspectMask] - [Getter][#aspectMask()] - [Setter][#aspectMask(int)]
/// ### baseMipLevel
/// [VarHandle][#VH_baseMipLevel] - [Getter][#baseMipLevel()] - [Setter][#baseMipLevel(int)]
/// ### levelCount
/// [VarHandle][#VH_levelCount] - [Getter][#levelCount()] - [Setter][#levelCount(int)]
/// ### baseArrayLayer
/// [VarHandle][#VH_baseArrayLayer] - [Getter][#baseArrayLayer()] - [Setter][#baseArrayLayer(int)]
/// ### layerCount
/// [VarHandle][#VH_layerCount] - [Getter][#layerCount()] - [Setter][#layerCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageSubresourceRange {
///     VkImageAspectFlags aspectMask;
///     uint32_t baseMipLevel;
///     uint32_t levelCount;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// } VkImageSubresourceRange;
/// ```
public final class VkImageSubresourceRange extends Struct {
    /// The struct layout of `VkImageSubresourceRange`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("baseMipLevel"),
        ValueLayout.JAVA_INT.withName("levelCount"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `baseMipLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_baseMipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseMipLevel"));
    /// The [VarHandle] of `levelCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_levelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("levelCount"));
    /// The [VarHandle] of `baseArrayLayer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    /// Creates `VkImageSubresourceRange` with the given segment.
    /// @param segment the memory segment
    public VkImageSubresourceRange(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageSubresourceRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceRange of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment); }

    /// Creates `VkImageSubresourceRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceRange ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageSubresourceRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceRange ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresourceRange(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange alloc(SegmentAllocator allocator) { return new VkImageSubresourceRange(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageSubresourceRange` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresourceRange`
    public static VkImageSubresourceRange alloc(SegmentAllocator allocator, long count) { return new VkImageSubresourceRange(allocator.allocate(LAYOUT, count)); }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment) { return VkImageSubresourceRange.get_aspectMask(segment, 0L); }
    /// {@return `aspectMask` at the given index}
    /// @param index the index
    public @CType("VkImageAspectFlags") int aspectMaskAt(long index) { return VkImageSubresourceRange.get_aspectMask(this.segment(), index); }
    /// {@return `aspectMask`}
    public @CType("VkImageAspectFlags") int aspectMask() { return VkImageSubresourceRange.get_aspectMask(this.segment()); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, long index, @CType("VkImageAspectFlags") int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, @CType("VkImageAspectFlags") int value) { VkImageSubresourceRange.set_aspectMask(segment, 0L, value); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange aspectMaskAt(long index, @CType("VkImageAspectFlags") int value) { VkImageSubresourceRange.set_aspectMask(this.segment(), index, value); return this; }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange aspectMask(@CType("VkImageAspectFlags") int value) { VkImageSubresourceRange.set_aspectMask(this.segment(), value); return this; }

    /// {@return `baseMipLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_baseMipLevel(MemorySegment segment, long index) { return (int) VH_baseMipLevel.get(segment, 0L, index); }
    /// {@return `baseMipLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_baseMipLevel(MemorySegment segment) { return VkImageSubresourceRange.get_baseMipLevel(segment, 0L); }
    /// {@return `baseMipLevel` at the given index}
    /// @param index the index
    public @CType("uint32_t") int baseMipLevelAt(long index) { return VkImageSubresourceRange.get_baseMipLevel(this.segment(), index); }
    /// {@return `baseMipLevel`}
    public @CType("uint32_t") int baseMipLevel() { return VkImageSubresourceRange.get_baseMipLevel(this.segment()); }
    /// Sets `baseMipLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_baseMipLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_baseMipLevel.set(segment, 0L, index, value); }
    /// Sets `baseMipLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_baseMipLevel(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresourceRange.set_baseMipLevel(segment, 0L, value); }
    /// Sets `baseMipLevel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange baseMipLevelAt(long index, @CType("uint32_t") int value) { VkImageSubresourceRange.set_baseMipLevel(this.segment(), index, value); return this; }
    /// Sets `baseMipLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange baseMipLevel(@CType("uint32_t") int value) { VkImageSubresourceRange.set_baseMipLevel(this.segment(), value); return this; }

    /// {@return `levelCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_levelCount(MemorySegment segment, long index) { return (int) VH_levelCount.get(segment, 0L, index); }
    /// {@return `levelCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_levelCount(MemorySegment segment) { return VkImageSubresourceRange.get_levelCount(segment, 0L); }
    /// {@return `levelCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int levelCountAt(long index) { return VkImageSubresourceRange.get_levelCount(this.segment(), index); }
    /// {@return `levelCount`}
    public @CType("uint32_t") int levelCount() { return VkImageSubresourceRange.get_levelCount(this.segment()); }
    /// Sets `levelCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_levelCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_levelCount.set(segment, 0L, index, value); }
    /// Sets `levelCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_levelCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresourceRange.set_levelCount(segment, 0L, value); }
    /// Sets `levelCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange levelCountAt(long index, @CType("uint32_t") int value) { VkImageSubresourceRange.set_levelCount(this.segment(), index, value); return this; }
    /// Sets `levelCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange levelCount(@CType("uint32_t") int value) { VkImageSubresourceRange.set_levelCount(this.segment(), value); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_baseArrayLayer(MemorySegment segment, long index) { return (int) VH_baseArrayLayer.get(segment, 0L, index); }
    /// {@return `baseArrayLayer`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_baseArrayLayer(MemorySegment segment) { return VkImageSubresourceRange.get_baseArrayLayer(segment, 0L); }
    /// {@return `baseArrayLayer` at the given index}
    /// @param index the index
    public @CType("uint32_t") int baseArrayLayerAt(long index) { return VkImageSubresourceRange.get_baseArrayLayer(this.segment(), index); }
    /// {@return `baseArrayLayer`}
    public @CType("uint32_t") int baseArrayLayer() { return VkImageSubresourceRange.get_baseArrayLayer(this.segment()); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_baseArrayLayer(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_baseArrayLayer.set(segment, 0L, index, value); }
    /// Sets `baseArrayLayer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_baseArrayLayer(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresourceRange.set_baseArrayLayer(segment, 0L, value); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange baseArrayLayerAt(long index, @CType("uint32_t") int value) { VkImageSubresourceRange.set_baseArrayLayer(this.segment(), index, value); return this; }
    /// Sets `baseArrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange baseArrayLayer(@CType("uint32_t") int value) { VkImageSubresourceRange.set_baseArrayLayer(this.segment(), value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment) { return VkImageSubresourceRange.get_layerCount(segment, 0L); }
    /// {@return `layerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layerCountAt(long index) { return VkImageSubresourceRange.get_layerCount(this.segment(), index); }
    /// {@return `layerCount`}
    public @CType("uint32_t") int layerCount() { return VkImageSubresourceRange.get_layerCount(this.segment()); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresourceRange.set_layerCount(segment, 0L, value); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange layerCountAt(long index, @CType("uint32_t") int value) { VkImageSubresourceRange.set_layerCount(this.segment(), index, value); return this; }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceRange layerCount(@CType("uint32_t") int value) { VkImageSubresourceRange.set_layerCount(this.segment(), value); return this; }

}
