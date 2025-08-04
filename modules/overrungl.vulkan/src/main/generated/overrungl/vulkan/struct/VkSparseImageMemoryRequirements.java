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
/// struct VkSparseImageMemoryRequirements {
///     (struct VkSparseImageFormatProperties) VkSparseImageFormatProperties formatProperties;
///     uint32_t imageMipTailFirstLod;
///     (uint64_t) VkDeviceSize imageMipTailSize;
///     (uint64_t) VkDeviceSize imageMipTailOffset;
///     (uint64_t) VkDeviceSize imageMipTailStride;
/// };
/// ```
public final class VkSparseImageMemoryRequirements extends GroupType {
    /// The struct layout of `VkSparseImageMemoryRequirements`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkSparseImageFormatProperties.LAYOUT.withName("formatProperties"),
        ValueLayout.JAVA_INT.withName("imageMipTailFirstLod"),
        ValueLayout.JAVA_LONG.withName("imageMipTailSize"),
        ValueLayout.JAVA_LONG.withName("imageMipTailOffset"),
        ValueLayout.JAVA_LONG.withName("imageMipTailStride")
    );
    /// The byte offset of `formatProperties`.
    public static final long OFFSET_formatProperties = LAYOUT.byteOffset(PathElement.groupElement("formatProperties"));
    /// The memory layout of `formatProperties`.
    public static final MemoryLayout LAYOUT_formatProperties = LAYOUT.select(PathElement.groupElement("formatProperties"));
    /// The byte offset of `imageMipTailFirstLod`.
    public static final long OFFSET_imageMipTailFirstLod = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailFirstLod"));
    /// The memory layout of `imageMipTailFirstLod`.
    public static final MemoryLayout LAYOUT_imageMipTailFirstLod = LAYOUT.select(PathElement.groupElement("imageMipTailFirstLod"));
    /// The [VarHandle] of `imageMipTailFirstLod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageMipTailFirstLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailFirstLod"));
    /// The byte offset of `imageMipTailSize`.
    public static final long OFFSET_imageMipTailSize = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailSize"));
    /// The memory layout of `imageMipTailSize`.
    public static final MemoryLayout LAYOUT_imageMipTailSize = LAYOUT.select(PathElement.groupElement("imageMipTailSize"));
    /// The [VarHandle] of `imageMipTailSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageMipTailSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailSize"));
    /// The byte offset of `imageMipTailOffset`.
    public static final long OFFSET_imageMipTailOffset = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailOffset"));
    /// The memory layout of `imageMipTailOffset`.
    public static final MemoryLayout LAYOUT_imageMipTailOffset = LAYOUT.select(PathElement.groupElement("imageMipTailOffset"));
    /// The [VarHandle] of `imageMipTailOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageMipTailOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailOffset"));
    /// The byte offset of `imageMipTailStride`.
    public static final long OFFSET_imageMipTailStride = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailStride"));
    /// The memory layout of `imageMipTailStride`.
    public static final MemoryLayout LAYOUT_imageMipTailStride = LAYOUT.select(PathElement.groupElement("imageMipTailStride"));
    /// The [VarHandle] of `imageMipTailStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageMipTailStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageMipTailStride"));

    /// Creates `VkSparseImageMemoryRequirements` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSparseImageMemoryRequirements(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSparseImageMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryRequirements of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseImageMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryRequirements ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSparseImageMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageMemoryRequirements ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseImageMemoryRequirements(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSparseImageMemoryRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageMemoryRequirements`
    public static VkSparseImageMemoryRequirements alloc(SegmentAllocator allocator) { return new VkSparseImageMemoryRequirements(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSparseImageMemoryRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageMemoryRequirements`
    public static VkSparseImageMemoryRequirements alloc(SegmentAllocator allocator, long count) { return new VkSparseImageMemoryRequirements(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseImageMemoryRequirements copyFrom(VkSparseImageMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSparseImageMemoryRequirements reinterpret(long count) { return new VkSparseImageMemoryRequirements(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `formatProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment formatProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_formatProperties, index), LAYOUT_formatProperties); }
    /// {@return `formatProperties`}
    public MemorySegment formatProperties() { return formatProperties(this.segment(), 0L); }
    /// Sets `formatProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void formatProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_formatProperties, index), LAYOUT_formatProperties.byteSize()); }
    /// Sets `formatProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements formatProperties(MemorySegment value) { formatProperties(this.segment(), 0L, value); return this; }
    /// Accepts `formatProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSparseImageMemoryRequirements formatProperties(Consumer<overrungl.vulkan.struct.VkSparseImageFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkSparseImageFormatProperties.of(formatProperties())); return this; }

    /// {@return `imageMipTailFirstLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageMipTailFirstLod(MemorySegment segment, long index) { return (int) VH_imageMipTailFirstLod.get(segment, 0L, index); }
    /// {@return `imageMipTailFirstLod`}
    public int imageMipTailFirstLod() { return imageMipTailFirstLod(this.segment(), 0L); }
    /// Sets `imageMipTailFirstLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageMipTailFirstLod(MemorySegment segment, long index, int value) { VH_imageMipTailFirstLod.set(segment, 0L, index, value); }
    /// Sets `imageMipTailFirstLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailFirstLod(int value) { imageMipTailFirstLod(this.segment(), 0L, value); return this; }

    /// {@return `imageMipTailSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageMipTailSize(MemorySegment segment, long index) { return (long) VH_imageMipTailSize.get(segment, 0L, index); }
    /// {@return `imageMipTailSize`}
    public long imageMipTailSize() { return imageMipTailSize(this.segment(), 0L); }
    /// Sets `imageMipTailSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageMipTailSize(MemorySegment segment, long index, long value) { VH_imageMipTailSize.set(segment, 0L, index, value); }
    /// Sets `imageMipTailSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailSize(long value) { imageMipTailSize(this.segment(), 0L, value); return this; }

    /// {@return `imageMipTailOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageMipTailOffset(MemorySegment segment, long index) { return (long) VH_imageMipTailOffset.get(segment, 0L, index); }
    /// {@return `imageMipTailOffset`}
    public long imageMipTailOffset() { return imageMipTailOffset(this.segment(), 0L); }
    /// Sets `imageMipTailOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageMipTailOffset(MemorySegment segment, long index, long value) { VH_imageMipTailOffset.set(segment, 0L, index, value); }
    /// Sets `imageMipTailOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailOffset(long value) { imageMipTailOffset(this.segment(), 0L, value); return this; }

    /// {@return `imageMipTailStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageMipTailStride(MemorySegment segment, long index) { return (long) VH_imageMipTailStride.get(segment, 0L, index); }
    /// {@return `imageMipTailStride`}
    public long imageMipTailStride() { return imageMipTailStride(this.segment(), 0L); }
    /// Sets `imageMipTailStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageMipTailStride(MemorySegment segment, long index, long value) { VH_imageMipTailStride.set(segment, 0L, index, value); }
    /// Sets `imageMipTailStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailStride(long value) { imageMipTailStride(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSparseImageMemoryRequirements`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSparseImageMemoryRequirements`
    public VkSparseImageMemoryRequirements asSlice(long index) { return new VkSparseImageMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSparseImageMemoryRequirements`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSparseImageMemoryRequirements`
    public VkSparseImageMemoryRequirements asSlice(long index, long count) { return new VkSparseImageMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSparseImageMemoryRequirements` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSparseImageMemoryRequirements at(long index, Consumer<VkSparseImageMemoryRequirements> func) { func.accept(asSlice(index)); return this; }

    /// {@return `formatProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment formatPropertiesAt(long index) { return formatProperties(this.segment(), index); }
    /// Sets `formatProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements formatPropertiesAt(long index, MemorySegment value) { formatProperties(this.segment(), index, value); return this; }
    /// Accepts `formatProperties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSparseImageMemoryRequirements formatPropertiesAt(long index, Consumer<overrungl.vulkan.struct.VkSparseImageFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkSparseImageFormatProperties.of(formatPropertiesAt(index))); return this; }

    /// {@return `imageMipTailFirstLod` at the given index}
    /// @param index the index of the struct buffer
    public int imageMipTailFirstLodAt(long index) { return imageMipTailFirstLod(this.segment(), index); }
    /// Sets `imageMipTailFirstLod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailFirstLodAt(long index, int value) { imageMipTailFirstLod(this.segment(), index, value); return this; }

    /// {@return `imageMipTailSize` at the given index}
    /// @param index the index of the struct buffer
    public long imageMipTailSizeAt(long index) { return imageMipTailSize(this.segment(), index); }
    /// Sets `imageMipTailSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailSizeAt(long index, long value) { imageMipTailSize(this.segment(), index, value); return this; }

    /// {@return `imageMipTailOffset` at the given index}
    /// @param index the index of the struct buffer
    public long imageMipTailOffsetAt(long index) { return imageMipTailOffset(this.segment(), index); }
    /// Sets `imageMipTailOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailOffsetAt(long index, long value) { imageMipTailOffset(this.segment(), index, value); return this; }

    /// {@return `imageMipTailStride` at the given index}
    /// @param index the index of the struct buffer
    public long imageMipTailStrideAt(long index) { return imageMipTailStride(this.segment(), index); }
    /// Sets `imageMipTailStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSparseImageMemoryRequirements imageMipTailStrideAt(long index, long value) { imageMipTailStride(this.segment(), index, value); return this; }

}
