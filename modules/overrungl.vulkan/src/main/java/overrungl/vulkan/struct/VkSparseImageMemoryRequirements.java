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
/// ### formatProperties
/// [Byte offset][#OFFSET_formatProperties] - [Memory layout][#ML_formatProperties] - [Getter][#formatProperties()] - [Setter][#formatProperties(java.lang.foreign.MemorySegment)]
/// ### imageMipTailFirstLod
/// [VarHandle][#VH_imageMipTailFirstLod] - [Getter][#imageMipTailFirstLod()] - [Setter][#imageMipTailFirstLod(int)]
/// ### imageMipTailSize
/// [VarHandle][#VH_imageMipTailSize] - [Getter][#imageMipTailSize()] - [Setter][#imageMipTailSize(long)]
/// ### imageMipTailOffset
/// [VarHandle][#VH_imageMipTailOffset] - [Getter][#imageMipTailOffset()] - [Setter][#imageMipTailOffset(long)]
/// ### imageMipTailStride
/// [VarHandle][#VH_imageMipTailStride] - [Getter][#imageMipTailStride()] - [Setter][#imageMipTailStride(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseImageMemoryRequirements {
///     VkSparseImageFormatProperties formatProperties;
///     uint32_t imageMipTailFirstLod;
///     VkDeviceSize imageMipTailSize;
///     VkDeviceSize imageMipTailOffset;
///     VkDeviceSize imageMipTailStride;
/// } VkSparseImageMemoryRequirements;
/// ```
public final class VkSparseImageMemoryRequirements extends Struct {
    /// The struct layout of `VkSparseImageMemoryRequirements`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkSparseImageFormatProperties.LAYOUT.withName("formatProperties"),
        ValueLayout.JAVA_INT.withName("imageMipTailFirstLod"),
        ValueLayout.JAVA_LONG.withName("imageMipTailSize"),
        ValueLayout.JAVA_LONG.withName("imageMipTailOffset"),
        ValueLayout.JAVA_LONG.withName("imageMipTailStride")
    );
    /// The byte offset of `formatProperties`.
    public static final long OFFSET_formatProperties = LAYOUT.byteOffset(PathElement.groupElement("formatProperties"));
    /// The memory layout of `formatProperties`.
    public static final MemoryLayout ML_formatProperties = LAYOUT.select(PathElement.groupElement("formatProperties"));
    /// The [VarHandle] of `imageMipTailFirstLod` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageMipTailFirstLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailFirstLod"));
    /// The [VarHandle] of `imageMipTailSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_imageMipTailSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailSize"));
    /// The [VarHandle] of `imageMipTailOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_imageMipTailOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailOffset"));
    /// The [VarHandle] of `imageMipTailStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_imageMipTailStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailStride"));

    /// Creates `VkSparseImageMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    public VkSparseImageMemoryRequirements(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseImageMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryRequirements of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment); }

    /// Creates `VkSparseImageMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryRequirements ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseImageMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryRequirements ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSparseImageMemoryRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageMemoryRequirements`
    public static VkSparseImageMemoryRequirements alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryRequirements(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseImageMemoryRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageMemoryRequirements`
    public static VkSparseImageMemoryRequirements alloc(SegmentAllocator allocator, long count) { return new VkSparseImageMemoryRequirements(allocator.allocate(LAYOUT, count)); }

    /// {@return `formatProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment get_formatProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_formatProperties, index), ML_formatProperties); }
    /// {@return `formatProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment get_formatProperties(MemorySegment segment) { return VkSparseImageMemoryRequirements.get_formatProperties(segment, 0L); }
    /// {@return `formatProperties` at the given index}
    /// @param index the index
    public @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment formatPropertiesAt(long index) { return VkSparseImageMemoryRequirements.get_formatProperties(this.segment(), index); }
    /// {@return `formatProperties`}
    public @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment formatProperties() { return VkSparseImageMemoryRequirements.get_formatProperties(this.segment()); }
    /// Sets `formatProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatProperties(MemorySegment segment, long index, @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_formatProperties, index), ML_formatProperties.byteSize()); }
    /// Sets `formatProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatProperties(MemorySegment segment, @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements.set_formatProperties(segment, 0L, value); }
    /// Sets `formatProperties` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements formatPropertiesAt(long index, @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements.set_formatProperties(this.segment(), index, value); return this; }
    /// Sets `formatProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements formatProperties(@CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment value) { VkSparseImageMemoryRequirements.set_formatProperties(this.segment(), value); return this; }

    /// {@return `imageMipTailFirstLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageMipTailFirstLod(MemorySegment segment, long index) { return (int) VH_imageMipTailFirstLod.get(segment, 0L, index); }
    /// {@return `imageMipTailFirstLod`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageMipTailFirstLod(MemorySegment segment) { return VkSparseImageMemoryRequirements.get_imageMipTailFirstLod(segment, 0L); }
    /// {@return `imageMipTailFirstLod` at the given index}
    /// @param index the index
    public @CType("uint32_t") int imageMipTailFirstLodAt(long index) { return VkSparseImageMemoryRequirements.get_imageMipTailFirstLod(this.segment(), index); }
    /// {@return `imageMipTailFirstLod`}
    public @CType("uint32_t") int imageMipTailFirstLod() { return VkSparseImageMemoryRequirements.get_imageMipTailFirstLod(this.segment()); }
    /// Sets `imageMipTailFirstLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageMipTailFirstLod(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageMipTailFirstLod.set(segment, 0L, index, value); }
    /// Sets `imageMipTailFirstLod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageMipTailFirstLod(MemorySegment segment, @CType("uint32_t") int value) { VkSparseImageMemoryRequirements.set_imageMipTailFirstLod(segment, 0L, value); }
    /// Sets `imageMipTailFirstLod` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailFirstLodAt(long index, @CType("uint32_t") int value) { VkSparseImageMemoryRequirements.set_imageMipTailFirstLod(this.segment(), index, value); return this; }
    /// Sets `imageMipTailFirstLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailFirstLod(@CType("uint32_t") int value) { VkSparseImageMemoryRequirements.set_imageMipTailFirstLod(this.segment(), value); return this; }

    /// {@return `imageMipTailSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_imageMipTailSize(MemorySegment segment, long index) { return (long) VH_imageMipTailSize.get(segment, 0L, index); }
    /// {@return `imageMipTailSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_imageMipTailSize(MemorySegment segment) { return VkSparseImageMemoryRequirements.get_imageMipTailSize(segment, 0L); }
    /// {@return `imageMipTailSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long imageMipTailSizeAt(long index) { return VkSparseImageMemoryRequirements.get_imageMipTailSize(this.segment(), index); }
    /// {@return `imageMipTailSize`}
    public @CType("VkDeviceSize") long imageMipTailSize() { return VkSparseImageMemoryRequirements.get_imageMipTailSize(this.segment()); }
    /// Sets `imageMipTailSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageMipTailSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_imageMipTailSize.set(segment, 0L, index, value); }
    /// Sets `imageMipTailSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageMipTailSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailSize(segment, 0L, value); }
    /// Sets `imageMipTailSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailSizeAt(long index, @CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailSize(this.segment(), index, value); return this; }
    /// Sets `imageMipTailSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailSize(@CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailSize(this.segment(), value); return this; }

    /// {@return `imageMipTailOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_imageMipTailOffset(MemorySegment segment, long index) { return (long) VH_imageMipTailOffset.get(segment, 0L, index); }
    /// {@return `imageMipTailOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_imageMipTailOffset(MemorySegment segment) { return VkSparseImageMemoryRequirements.get_imageMipTailOffset(segment, 0L); }
    /// {@return `imageMipTailOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long imageMipTailOffsetAt(long index) { return VkSparseImageMemoryRequirements.get_imageMipTailOffset(this.segment(), index); }
    /// {@return `imageMipTailOffset`}
    public @CType("VkDeviceSize") long imageMipTailOffset() { return VkSparseImageMemoryRequirements.get_imageMipTailOffset(this.segment()); }
    /// Sets `imageMipTailOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageMipTailOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_imageMipTailOffset.set(segment, 0L, index, value); }
    /// Sets `imageMipTailOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageMipTailOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailOffset(segment, 0L, value); }
    /// Sets `imageMipTailOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailOffsetAt(long index, @CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailOffset(this.segment(), index, value); return this; }
    /// Sets `imageMipTailOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailOffset(@CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailOffset(this.segment(), value); return this; }

    /// {@return `imageMipTailStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_imageMipTailStride(MemorySegment segment, long index) { return (long) VH_imageMipTailStride.get(segment, 0L, index); }
    /// {@return `imageMipTailStride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_imageMipTailStride(MemorySegment segment) { return VkSparseImageMemoryRequirements.get_imageMipTailStride(segment, 0L); }
    /// {@return `imageMipTailStride` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long imageMipTailStrideAt(long index) { return VkSparseImageMemoryRequirements.get_imageMipTailStride(this.segment(), index); }
    /// {@return `imageMipTailStride`}
    public @CType("VkDeviceSize") long imageMipTailStride() { return VkSparseImageMemoryRequirements.get_imageMipTailStride(this.segment()); }
    /// Sets `imageMipTailStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageMipTailStride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_imageMipTailStride.set(segment, 0L, index, value); }
    /// Sets `imageMipTailStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageMipTailStride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailStride(segment, 0L, value); }
    /// Sets `imageMipTailStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailStrideAt(long index, @CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailStride(this.segment(), index, value); return this; }
    /// Sets `imageMipTailStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailStride(@CType("VkDeviceSize") long value) { VkSparseImageMemoryRequirements.set_imageMipTailStride(this.segment(), value); return this; }

}
