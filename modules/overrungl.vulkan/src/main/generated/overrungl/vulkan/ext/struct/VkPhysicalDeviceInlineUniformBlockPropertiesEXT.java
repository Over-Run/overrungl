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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceInlineUniformBlockPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxInlineUniformBlockSize;
///     uint32_t maxPerStageDescriptorInlineUniformBlocks;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxDescriptorSetInlineUniformBlocks;
///     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
/// };
/// ```
public final class VkPhysicalDeviceInlineUniformBlockPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockSize"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks")
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
    /// The byte offset of `maxInlineUniformBlockSize`.
    public static final long OFFSET_maxInlineUniformBlockSize = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformBlockSize"));
    /// The memory layout of `maxInlineUniformBlockSize`.
    public static final MemoryLayout LAYOUT_maxInlineUniformBlockSize = LAYOUT.select(PathElement.groupElement("maxInlineUniformBlockSize"));
    /// The [VarHandle] of `maxInlineUniformBlockSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxInlineUniformBlockSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockSize"));
    /// The byte offset of `maxPerStageDescriptorInlineUniformBlocks`.
    public static final long OFFSET_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    /// The memory layout of `maxPerStageDescriptorInlineUniformBlocks`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    /// The [VarHandle] of `maxPerStageDescriptorInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    /// The byte offset of `maxDescriptorSetInlineUniformBlocks`.
    public static final long OFFSET_maxDescriptorSetInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    /// The memory layout of `maxDescriptorSetInlineUniformBlocks`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    /// The [VarHandle] of `maxDescriptorSetInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));

    /// Creates `VkPhysicalDeviceInlineUniformBlockPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceInlineUniformBlockPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceInlineUniformBlockPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`
    public static VkPhysicalDeviceInlineUniformBlockPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT copyFrom(VkPhysicalDeviceInlineUniformBlockPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxInlineUniformBlockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxInlineUniformBlockSize(MemorySegment segment, long index) { return (int) VH_maxInlineUniformBlockSize.get(segment, 0L, index); }
    /// {@return `maxInlineUniformBlockSize`}
    public int maxInlineUniformBlockSize() { return maxInlineUniformBlockSize(this.segment(), 0L); }
    /// Sets `maxInlineUniformBlockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInlineUniformBlockSize(MemorySegment segment, long index, int value) { VH_maxInlineUniformBlockSize.set(segment, 0L, index, value); }
    /// Sets `maxInlineUniformBlockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxInlineUniformBlockSize(int value) { maxInlineUniformBlockSize(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorInlineUniformBlocks`}
    public int maxPerStageDescriptorInlineUniformBlocks() { return maxPerStageDescriptorInlineUniformBlocks(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxPerStageDescriptorInlineUniformBlocks(int value) { maxPerStageDescriptorInlineUniformBlocks(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`}
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int value) { maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetInlineUniformBlocks`}
    public int maxDescriptorSetInlineUniformBlocks() { return maxDescriptorSetInlineUniformBlocks(this.segment(), 0L); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetInlineUniformBlocks(MemorySegment segment, long index, int value) { VH_maxDescriptorSetInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxDescriptorSetInlineUniformBlocks(int value) { maxDescriptorSetInlineUniformBlocks(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`}
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int value) { maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceInlineUniformBlockPropertiesEXT`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceInlineUniformBlockPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceInlineUniformBlockPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT at(long index, Consumer<VkPhysicalDeviceInlineUniformBlockPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxInlineUniformBlockSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxInlineUniformBlockSizeAt(long index) { return maxInlineUniformBlockSize(this.segment(), index); }
    /// Sets `maxInlineUniformBlockSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxInlineUniformBlockSizeAt(long index, int value) { maxInlineUniformBlockSize(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorInlineUniformBlocks` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorInlineUniformBlocksAt(long index) { return maxPerStageDescriptorInlineUniformBlocks(this.segment(), index); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxPerStageDescriptorInlineUniformBlocksAt(long index, int value) { maxPerStageDescriptorInlineUniformBlocks(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index) { return maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), index); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetInlineUniformBlocks` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetInlineUniformBlocksAt(long index) { return maxDescriptorSetInlineUniformBlocks(this.segment(), index); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxDescriptorSetInlineUniformBlocksAt(long index, int value) { maxDescriptorSetInlineUniformBlocks(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index) { return maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), index); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index, int value) { maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), index, value); return this; }

}
