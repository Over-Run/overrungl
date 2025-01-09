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
/// ### mipLevel
/// [VarHandle][#VH_mipLevel] - [Getter][#mipLevel()] - [Setter][#mipLevel(int)]
/// ### baseArrayLayer
/// [VarHandle][#VH_baseArrayLayer] - [Getter][#baseArrayLayer()] - [Setter][#baseArrayLayer(int)]
/// ### layerCount
/// [VarHandle][#VH_layerCount] - [Getter][#layerCount()] - [Setter][#layerCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageSubresourceLayers {
///     VkImageAspectFlags aspectMask;
///     uint32_t mipLevel;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// } VkImageSubresourceLayers;
/// ```
public final class VkImageSubresourceLayers extends Struct {
    /// The struct layout of `VkImageSubresourceLayers`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `mipLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevel"));
    /// The [VarHandle] of `baseArrayLayer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));

    /// Creates `VkImageSubresourceLayers` with the given segment.
    /// @param segment the memory segment
    public VkImageSubresourceLayers(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageSubresourceLayers` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceLayers of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresourceLayers(segment); }

    /// Creates `VkImageSubresourceLayers` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceLayers ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresourceLayers(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageSubresourceLayers` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresourceLayers ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresourceLayers(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageSubresourceLayers` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresourceLayers`
    public static VkImageSubresourceLayers alloc(SegmentAllocator allocator) { return new VkImageSubresourceLayers(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageSubresourceLayers` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresourceLayers`
    public static VkImageSubresourceLayers alloc(SegmentAllocator allocator, long count) { return new VkImageSubresourceLayers(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkImageSubresourceLayers`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageSubresourceLayers`
    public VkImageSubresourceLayers asSlice(long index) { return new VkImageSubresourceLayers(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkImageSubresourceLayers`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageSubresourceLayers`
    public VkImageSubresourceLayers asSlice(long index, long count) { return new VkImageSubresourceLayers(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment) { return VkImageSubresourceLayers.get_aspectMask(segment, 0L); }
    /// {@return `aspectMask` at the given index}
    /// @param index the index
    public @CType("VkImageAspectFlags") int aspectMaskAt(long index) { return VkImageSubresourceLayers.get_aspectMask(this.segment(), index); }
    /// {@return `aspectMask`}
    public @CType("VkImageAspectFlags") int aspectMask() { return VkImageSubresourceLayers.get_aspectMask(this.segment()); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, long index, @CType("VkImageAspectFlags") int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, @CType("VkImageAspectFlags") int value) { VkImageSubresourceLayers.set_aspectMask(segment, 0L, value); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers aspectMaskAt(long index, @CType("VkImageAspectFlags") int value) { VkImageSubresourceLayers.set_aspectMask(this.segment(), index, value); return this; }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers aspectMask(@CType("VkImageAspectFlags") int value) { VkImageSubresourceLayers.set_aspectMask(this.segment(), value); return this; }

    /// {@return `mipLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mipLevel(MemorySegment segment, long index) { return (int) VH_mipLevel.get(segment, 0L, index); }
    /// {@return `mipLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mipLevel(MemorySegment segment) { return VkImageSubresourceLayers.get_mipLevel(segment, 0L); }
    /// {@return `mipLevel` at the given index}
    /// @param index the index
    public @CType("uint32_t") int mipLevelAt(long index) { return VkImageSubresourceLayers.get_mipLevel(this.segment(), index); }
    /// {@return `mipLevel`}
    public @CType("uint32_t") int mipLevel() { return VkImageSubresourceLayers.get_mipLevel(this.segment()); }
    /// Sets `mipLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mipLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mipLevel.set(segment, 0L, index, value); }
    /// Sets `mipLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mipLevel(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresourceLayers.set_mipLevel(segment, 0L, value); }
    /// Sets `mipLevel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers mipLevelAt(long index, @CType("uint32_t") int value) { VkImageSubresourceLayers.set_mipLevel(this.segment(), index, value); return this; }
    /// Sets `mipLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers mipLevel(@CType("uint32_t") int value) { VkImageSubresourceLayers.set_mipLevel(this.segment(), value); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_baseArrayLayer(MemorySegment segment, long index) { return (int) VH_baseArrayLayer.get(segment, 0L, index); }
    /// {@return `baseArrayLayer`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_baseArrayLayer(MemorySegment segment) { return VkImageSubresourceLayers.get_baseArrayLayer(segment, 0L); }
    /// {@return `baseArrayLayer` at the given index}
    /// @param index the index
    public @CType("uint32_t") int baseArrayLayerAt(long index) { return VkImageSubresourceLayers.get_baseArrayLayer(this.segment(), index); }
    /// {@return `baseArrayLayer`}
    public @CType("uint32_t") int baseArrayLayer() { return VkImageSubresourceLayers.get_baseArrayLayer(this.segment()); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_baseArrayLayer(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_baseArrayLayer.set(segment, 0L, index, value); }
    /// Sets `baseArrayLayer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_baseArrayLayer(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresourceLayers.set_baseArrayLayer(segment, 0L, value); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers baseArrayLayerAt(long index, @CType("uint32_t") int value) { VkImageSubresourceLayers.set_baseArrayLayer(this.segment(), index, value); return this; }
    /// Sets `baseArrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers baseArrayLayer(@CType("uint32_t") int value) { VkImageSubresourceLayers.set_baseArrayLayer(this.segment(), value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment) { return VkImageSubresourceLayers.get_layerCount(segment, 0L); }
    /// {@return `layerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layerCountAt(long index) { return VkImageSubresourceLayers.get_layerCount(this.segment(), index); }
    /// {@return `layerCount`}
    public @CType("uint32_t") int layerCount() { return VkImageSubresourceLayers.get_layerCount(this.segment()); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresourceLayers.set_layerCount(segment, 0L, value); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers layerCountAt(long index, @CType("uint32_t") int value) { VkImageSubresourceLayers.set_layerCount(this.segment(), index, value); return this; }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresourceLayers layerCount(@CType("uint32_t") int value) { VkImageSubresourceLayers.set_layerCount(this.segment(), value); return this; }

}
