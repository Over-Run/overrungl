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
/// struct VkIndirectExecutionSetShaderLayoutInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout* pSetLayouts;
/// };
/// ```
public sealed class VkIndirectExecutionSetShaderLayoutInfoEXT extends GroupType {
    /// The struct layout of `VkIndirectExecutionSetShaderLayoutInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts")
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
    /// The byte offset of `setLayoutCount`.
    public static final long OFFSET_setLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("setLayoutCount"));
    /// The memory layout of `setLayoutCount`.
    public static final MemoryLayout LAYOUT_setLayoutCount = LAYOUT.select(PathElement.groupElement("setLayoutCount"));
    /// The [VarHandle] of `setLayoutCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_setLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setLayoutCount"));
    /// The byte offset of `pSetLayouts`.
    public static final long OFFSET_pSetLayouts = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
    /// The memory layout of `pSetLayouts`.
    public static final MemoryLayout LAYOUT_pSetLayouts = LAYOUT.select(PathElement.groupElement("pSetLayouts"));
    /// The [VarHandle] of `pSetLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));

    /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetShaderLayoutInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderLayoutInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param setLayoutCount `setLayoutCount`
    /// @param pSetLayouts `pSetLayouts`
    /// @return the allocated `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int setLayoutCount, MemorySegment pSetLayouts) {
        return alloc(allocator).sType(sType).pNext(pNext).setLayoutCount(setLayoutCount).pSetLayouts(pSetLayouts);
    }

    /// Allocates a `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param setLayoutCount `setLayoutCount`
    /// @return the allocated `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int setLayoutCount) {
        return alloc(allocator).sType(sType).pNext(pNext).setLayoutCount(setLayoutCount);
    }

    /// Allocates a `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkIndirectExecutionSetShaderLayoutInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkIndirectExecutionSetShaderLayoutInfoEXT`
    public static VkIndirectExecutionSetShaderLayoutInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT copyFrom(VkIndirectExecutionSetShaderLayoutInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkIndirectExecutionSetShaderLayoutInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkIndirectExecutionSetShaderLayoutInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `setLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int setLayoutCount(MemorySegment segment, long index) { return (int) VH_setLayoutCount.get(segment, 0L, index); }
    /// {@return `setLayoutCount`}
    public int setLayoutCount() { return setLayoutCount(this.segment(), 0L); }
    /// Sets `setLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void setLayoutCount(MemorySegment segment, long index, int value) { VH_setLayoutCount.set(segment, 0L, index, value); }
    /// Sets `setLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT setLayoutCount(int value) { setLayoutCount(this.segment(), 0L, value); return this; }

    /// {@return `pSetLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSetLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pSetLayouts.get(segment, 0L, index); }
    /// {@return `pSetLayouts`}
    public MemorySegment pSetLayouts() { return pSetLayouts(this.segment(), 0L); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSetLayouts(MemorySegment segment, long index, MemorySegment value) { VH_pSetLayouts.set(segment, 0L, index, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayouts(MemorySegment value) { pSetLayouts(this.segment(), 0L, value); return this; }

    /// A buffer of [VkIndirectExecutionSetShaderLayoutInfoEXT].
    public static final class Buffer extends VkIndirectExecutionSetShaderLayoutInfoEXT {
        private final long elementCount;

        /// Creates `VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectExecutionSetShaderLayoutInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectExecutionSetShaderLayoutInfoEXT`
        public VkIndirectExecutionSetShaderLayoutInfoEXT asSlice(long index) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectExecutionSetShaderLayoutInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectExecutionSetShaderLayoutInfoEXT`
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

        /// {@return `setLayoutCount` at the given index}
        /// @param index the index of the struct buffer
        public int setLayoutCountAt(long index) { return setLayoutCount(this.segment(), index); }
        /// Sets `setLayoutCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer setLayoutCountAt(long index, int value) { setLayoutCount(this.segment(), index, value); return this; }

        /// {@return `pSetLayouts` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSetLayoutsAt(long index) { return pSetLayouts(this.segment(), index); }
        /// Sets `pSetLayouts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSetLayoutsAt(long index, MemorySegment value) { pSetLayouts(this.segment(), index, value); return this; }

    }
}
