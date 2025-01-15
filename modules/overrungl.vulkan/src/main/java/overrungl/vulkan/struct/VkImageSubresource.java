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
/// ### arrayLayer
/// [VarHandle][#VH_arrayLayer] - [Getter][#arrayLayer()] - [Setter][#arrayLayer(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageSubresource {
///     VkImageAspectFlags aspectMask;
///     uint32_t mipLevel;
///     uint32_t arrayLayer;
/// } VkImageSubresource;
/// ```
public sealed class VkImageSubresource extends Struct {
    /// The struct layout of `VkImageSubresource`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("arrayLayer")
    );
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `mipLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mipLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevel"));
    /// The [VarHandle] of `arrayLayer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_arrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayLayer"));

    /// Creates `VkImageSubresource` with the given segment.
    /// @param segment the memory segment
    public VkImageSubresource(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageSubresource` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresource(segment); }

    /// Creates `VkImageSubresource` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageSubresource` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresource(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageSubresource` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageSubresource` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresource`
    public static VkImageSubresource alloc(SegmentAllocator allocator) { return new VkImageSubresource(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageSubresource` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresource`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageSubresource` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresource`
    public static VkImageSubresource allocInit(SegmentAllocator allocator, @CType("VkImageAspectFlags") int aspectMask, @CType("uint32_t") int mipLevel, @CType("uint32_t") int arrayLayer) { return alloc(allocator).aspectMask(aspectMask).mipLevel(mipLevel).arrayLayer(arrayLayer); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageSubresource copyFrom(VkImageSubresource src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment) { return VkImageSubresource.get_aspectMask(segment, 0L); }
    /// {@return `aspectMask`}
    public @CType("VkImageAspectFlags") int aspectMask() { return VkImageSubresource.get_aspectMask(this.segment()); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, long index, @CType("VkImageAspectFlags") int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, @CType("VkImageAspectFlags") int value) { VkImageSubresource.set_aspectMask(segment, 0L, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource aspectMask(@CType("VkImageAspectFlags") int value) { VkImageSubresource.set_aspectMask(this.segment(), value); return this; }

    /// {@return `mipLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mipLevel(MemorySegment segment, long index) { return (int) VH_mipLevel.get(segment, 0L, index); }
    /// {@return `mipLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mipLevel(MemorySegment segment) { return VkImageSubresource.get_mipLevel(segment, 0L); }
    /// {@return `mipLevel`}
    public @CType("uint32_t") int mipLevel() { return VkImageSubresource.get_mipLevel(this.segment()); }
    /// Sets `mipLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mipLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mipLevel.set(segment, 0L, index, value); }
    /// Sets `mipLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mipLevel(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresource.set_mipLevel(segment, 0L, value); }
    /// Sets `mipLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource mipLevel(@CType("uint32_t") int value) { VkImageSubresource.set_mipLevel(this.segment(), value); return this; }

    /// {@return `arrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_arrayLayer(MemorySegment segment, long index) { return (int) VH_arrayLayer.get(segment, 0L, index); }
    /// {@return `arrayLayer`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_arrayLayer(MemorySegment segment) { return VkImageSubresource.get_arrayLayer(segment, 0L); }
    /// {@return `arrayLayer`}
    public @CType("uint32_t") int arrayLayer() { return VkImageSubresource.get_arrayLayer(this.segment()); }
    /// Sets `arrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_arrayLayer(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_arrayLayer.set(segment, 0L, index, value); }
    /// Sets `arrayLayer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_arrayLayer(MemorySegment segment, @CType("uint32_t") int value) { VkImageSubresource.set_arrayLayer(segment, 0L, value); }
    /// Sets `arrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource arrayLayer(@CType("uint32_t") int value) { VkImageSubresource.set_arrayLayer(this.segment(), value); return this; }

    /// A buffer of [VkImageSubresource].
    public static final class Buffer extends VkImageSubresource {
        private final long elementCount;

        /// Creates `VkImageSubresource.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageSubresource`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageSubresource`
        public VkImageSubresource asSlice(long index) { return new VkImageSubresource(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageSubresource`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageSubresource`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `aspectMask` at the given index}
        /// @param index the index
        public @CType("VkImageAspectFlags") int aspectMaskAt(long index) { return VkImageSubresource.get_aspectMask(this.segment(), index); }
        /// Sets `aspectMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer aspectMaskAt(long index, @CType("VkImageAspectFlags") int value) { VkImageSubresource.set_aspectMask(this.segment(), index, value); return this; }

        /// {@return `mipLevel` at the given index}
        /// @param index the index
        public @CType("uint32_t") int mipLevelAt(long index) { return VkImageSubresource.get_mipLevel(this.segment(), index); }
        /// Sets `mipLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mipLevelAt(long index, @CType("uint32_t") int value) { VkImageSubresource.set_mipLevel(this.segment(), index, value); return this; }

        /// {@return `arrayLayer` at the given index}
        /// @param index the index
        public @CType("uint32_t") int arrayLayerAt(long index) { return VkImageSubresource.get_arrayLayer(this.segment(), index); }
        /// Sets `arrayLayer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer arrayLayerAt(long index, @CType("uint32_t") int value) { VkImageSubresource.set_arrayLayer(this.segment(), index, value); return this; }

    }
}
