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
/// struct VkPhysicalDeviceNestedCommandBufferFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 nestedCommandBuffer;
///     (uint32_t) VkBool32 nestedCommandBufferRendering;
///     (uint32_t) VkBool32 nestedCommandBufferSimultaneousUse;
/// };
/// ```
public sealed class VkPhysicalDeviceNestedCommandBufferFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nestedCommandBuffer"),
        ValueLayout.JAVA_INT.withName("nestedCommandBufferRendering"),
        ValueLayout.JAVA_INT.withName("nestedCommandBufferSimultaneousUse")
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
    /// The byte offset of `nestedCommandBuffer`.
    public static final long OFFSET_nestedCommandBuffer = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBuffer"));
    /// The memory layout of `nestedCommandBuffer`.
    public static final MemoryLayout LAYOUT_nestedCommandBuffer = LAYOUT.select(PathElement.groupElement("nestedCommandBuffer"));
    /// The [VarHandle] of `nestedCommandBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nestedCommandBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBuffer"));
    /// The byte offset of `nestedCommandBufferRendering`.
    public static final long OFFSET_nestedCommandBufferRendering = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBufferRendering"));
    /// The memory layout of `nestedCommandBufferRendering`.
    public static final MemoryLayout LAYOUT_nestedCommandBufferRendering = LAYOUT.select(PathElement.groupElement("nestedCommandBufferRendering"));
    /// The [VarHandle] of `nestedCommandBufferRendering` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nestedCommandBufferRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBufferRendering"));
    /// The byte offset of `nestedCommandBufferSimultaneousUse`.
    public static final long OFFSET_nestedCommandBufferSimultaneousUse = LAYOUT.byteOffset(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));
    /// The memory layout of `nestedCommandBufferSimultaneousUse`.
    public static final MemoryLayout LAYOUT_nestedCommandBufferSimultaneousUse = LAYOUT.select(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));
    /// The [VarHandle] of `nestedCommandBufferSimultaneousUse` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nestedCommandBufferSimultaneousUse = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT copyFrom(VkPhysicalDeviceNestedCommandBufferFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `nestedCommandBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nestedCommandBuffer(MemorySegment segment, long index) { return (int) VH_nestedCommandBuffer.get(segment, 0L, index); }
    /// {@return `nestedCommandBuffer`}
    public int nestedCommandBuffer() { return nestedCommandBuffer(this.segment(), 0L); }
    /// Sets `nestedCommandBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nestedCommandBuffer(MemorySegment segment, long index, int value) { VH_nestedCommandBuffer.set(segment, 0L, index, value); }
    /// Sets `nestedCommandBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBuffer(int value) { nestedCommandBuffer(this.segment(), 0L, value); return this; }

    /// {@return `nestedCommandBufferRendering` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nestedCommandBufferRendering(MemorySegment segment, long index) { return (int) VH_nestedCommandBufferRendering.get(segment, 0L, index); }
    /// {@return `nestedCommandBufferRendering`}
    public int nestedCommandBufferRendering() { return nestedCommandBufferRendering(this.segment(), 0L); }
    /// Sets `nestedCommandBufferRendering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nestedCommandBufferRendering(MemorySegment segment, long index, int value) { VH_nestedCommandBufferRendering.set(segment, 0L, index, value); }
    /// Sets `nestedCommandBufferRendering` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferRendering(int value) { nestedCommandBufferRendering(this.segment(), 0L, value); return this; }

    /// {@return `nestedCommandBufferSimultaneousUse` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nestedCommandBufferSimultaneousUse(MemorySegment segment, long index) { return (int) VH_nestedCommandBufferSimultaneousUse.get(segment, 0L, index); }
    /// {@return `nestedCommandBufferSimultaneousUse`}
    public int nestedCommandBufferSimultaneousUse() { return nestedCommandBufferSimultaneousUse(this.segment(), 0L); }
    /// Sets `nestedCommandBufferSimultaneousUse` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nestedCommandBufferSimultaneousUse(MemorySegment segment, long index, int value) { VH_nestedCommandBufferSimultaneousUse.set(segment, 0L, index, value); }
    /// Sets `nestedCommandBufferSimultaneousUse` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferSimultaneousUse(int value) { nestedCommandBufferSimultaneousUse(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceNestedCommandBufferFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceNestedCommandBufferFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
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

        /// {@return `nestedCommandBuffer` at the given index}
        /// @param index the index of the struct buffer
        public int nestedCommandBufferAt(long index) { return nestedCommandBuffer(this.segment(), index); }
        /// Sets `nestedCommandBuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer nestedCommandBufferAt(long index, int value) { nestedCommandBuffer(this.segment(), index, value); return this; }

        /// {@return `nestedCommandBufferRendering` at the given index}
        /// @param index the index of the struct buffer
        public int nestedCommandBufferRenderingAt(long index) { return nestedCommandBufferRendering(this.segment(), index); }
        /// Sets `nestedCommandBufferRendering` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer nestedCommandBufferRenderingAt(long index, int value) { nestedCommandBufferRendering(this.segment(), index, value); return this; }

        /// {@return `nestedCommandBufferSimultaneousUse` at the given index}
        /// @param index the index of the struct buffer
        public int nestedCommandBufferSimultaneousUseAt(long index) { return nestedCommandBufferSimultaneousUse(this.segment(), index); }
        /// Sets `nestedCommandBufferSimultaneousUse` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer nestedCommandBufferSimultaneousUseAt(long index, int value) { nestedCommandBufferSimultaneousUse(this.segment(), index, value); return this; }

    }
}
