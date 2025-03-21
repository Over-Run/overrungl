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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoSessionMemoryRequirementsKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t memoryBindIndex;
///     (struct VkMemoryRequirements) VkMemoryRequirements memoryRequirements;
/// };
/// ```
public sealed class VkVideoSessionMemoryRequirementsKHR extends GroupType {
    /// The struct layout of `VkVideoSessionMemoryRequirementsKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryBindIndex"),
        overrungl.vulkan.struct.VkMemoryRequirements.LAYOUT.withName("memoryRequirements")
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
    /// The byte offset of `memoryBindIndex`.
    public static final long OFFSET_memoryBindIndex = LAYOUT.byteOffset(PathElement.groupElement("memoryBindIndex"));
    /// The memory layout of `memoryBindIndex`.
    public static final MemoryLayout LAYOUT_memoryBindIndex = LAYOUT.select(PathElement.groupElement("memoryBindIndex"));
    /// The [VarHandle] of `memoryBindIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryBindIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryBindIndex"));
    /// The byte offset of `memoryRequirements`.
    public static final long OFFSET_memoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
    /// The memory layout of `memoryRequirements`.
    public static final MemoryLayout LAYOUT_memoryRequirements = LAYOUT.select(PathElement.groupElement("memoryRequirements"));

    /// Creates `VkVideoSessionMemoryRequirementsKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoSessionMemoryRequirementsKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoSessionMemoryRequirementsKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoSessionMemoryRequirementsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionMemoryRequirementsKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionMemoryRequirementsKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoSessionMemoryRequirementsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoSessionMemoryRequirementsKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoSessionMemoryRequirementsKHR`
    public static VkVideoSessionMemoryRequirementsKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionMemoryRequirementsKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoSessionMemoryRequirementsKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoSessionMemoryRequirementsKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR copyFrom(VkVideoSessionMemoryRequirementsKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoSessionMemoryRequirementsKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoSessionMemoryRequirementsKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `memoryBindIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryBindIndex(MemorySegment segment, long index) { return (int) VH_memoryBindIndex.get(segment, 0L, index); }
    /// {@return `memoryBindIndex`}
    public int memoryBindIndex() { return memoryBindIndex(this.segment(), 0L); }
    /// Sets `memoryBindIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryBindIndex(MemorySegment segment, long index, int value) { VH_memoryBindIndex.set(segment, 0L, index, value); }
    /// Sets `memoryBindIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR memoryBindIndex(int value) { memoryBindIndex(this.segment(), 0L, value); return this; }

    /// {@return `memoryRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment memoryRequirements(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryRequirements, index), LAYOUT_memoryRequirements); }
    /// {@return `memoryRequirements`}
    public MemorySegment memoryRequirements() { return memoryRequirements(this.segment(), 0L); }
    /// Sets `memoryRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryRequirements(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryRequirements, index), LAYOUT_memoryRequirements.byteSize()); }
    /// Sets `memoryRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements(MemorySegment value) { memoryRequirements(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoSessionMemoryRequirementsKHR].
    public static final class Buffer extends VkVideoSessionMemoryRequirementsKHR {
        private final long elementCount;

        /// Creates `VkVideoSessionMemoryRequirementsKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoSessionMemoryRequirementsKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoSessionMemoryRequirementsKHR`
        public VkVideoSessionMemoryRequirementsKHR asSlice(long index) { return new VkVideoSessionMemoryRequirementsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoSessionMemoryRequirementsKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoSessionMemoryRequirementsKHR`
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

        /// {@return `memoryBindIndex` at the given index}
        /// @param index the index of the struct buffer
        public int memoryBindIndexAt(long index) { return memoryBindIndex(this.segment(), index); }
        /// Sets `memoryBindIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryBindIndexAt(long index, int value) { memoryBindIndex(this.segment(), index, value); return this; }

        /// {@return `memoryRequirements` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment memoryRequirementsAt(long index) { return memoryRequirements(this.segment(), index); }
        /// Sets `memoryRequirements` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryRequirementsAt(long index, MemorySegment value) { memoryRequirements(this.segment(), index, value); return this; }

    }
}
