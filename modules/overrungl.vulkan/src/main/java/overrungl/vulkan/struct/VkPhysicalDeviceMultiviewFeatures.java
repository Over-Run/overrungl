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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiviewFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 multiview;
///     VkBool32 multiviewGeometryShader;
///     VkBool32 multiviewTessellationShader;
/// };
/// ```
public sealed class VkPhysicalDeviceMultiviewFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMultiviewFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader")
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
    /// The byte offset of `multiview`.
    public static final long OFFSET_multiview = LAYOUT.byteOffset(PathElement.groupElement("multiview"));
    /// The memory layout of `multiview`.
    public static final MemoryLayout LAYOUT_multiview = LAYOUT.select(PathElement.groupElement("multiview"));
    /// The [VarHandle] of `multiview` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiview = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiview"));
    /// The byte offset of `multiviewGeometryShader`.
    public static final long OFFSET_multiviewGeometryShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewGeometryShader"));
    /// The memory layout of `multiviewGeometryShader`.
    public static final MemoryLayout LAYOUT_multiviewGeometryShader = LAYOUT.select(PathElement.groupElement("multiviewGeometryShader"));
    /// The [VarHandle] of `multiviewGeometryShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiviewGeometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewGeometryShader"));
    /// The byte offset of `multiviewTessellationShader`.
    public static final long OFFSET_multiviewTessellationShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewTessellationShader"));
    /// The memory layout of `multiviewTessellationShader`.
    public static final MemoryLayout LAYOUT_multiviewTessellationShader = LAYOUT.select(PathElement.groupElement("multiviewTessellationShader"));
    /// The [VarHandle] of `multiviewTessellationShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiviewTessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewTessellationShader"));

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMultiviewFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMultiviewFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMultiviewFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewFeatures`
    public static VkPhysicalDeviceMultiviewFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMultiviewFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMultiviewFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures copyFrom(VkPhysicalDeviceMultiviewFeatures src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceMultiviewFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMultiviewFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `multiview` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiview(MemorySegment segment, long index) { return (int) VH_multiview.get(segment, 0L, index); }
    /// {@return `multiview`}
    public int multiview() { return multiview(this.segment(), 0L); }
    /// Sets `multiview` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiview(MemorySegment segment, long index, int value) { VH_multiview.set(segment, 0L, index, value); }
    /// Sets `multiview` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures multiview(int value) { multiview(this.segment(), 0L, value); return this; }

    /// {@return `multiviewGeometryShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiviewGeometryShader(MemorySegment segment, long index) { return (int) VH_multiviewGeometryShader.get(segment, 0L, index); }
    /// {@return `multiviewGeometryShader`}
    public int multiviewGeometryShader() { return multiviewGeometryShader(this.segment(), 0L); }
    /// Sets `multiviewGeometryShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiviewGeometryShader(MemorySegment segment, long index, int value) { VH_multiviewGeometryShader.set(segment, 0L, index, value); }
    /// Sets `multiviewGeometryShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures multiviewGeometryShader(int value) { multiviewGeometryShader(this.segment(), 0L, value); return this; }

    /// {@return `multiviewTessellationShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiviewTessellationShader(MemorySegment segment, long index) { return (int) VH_multiviewTessellationShader.get(segment, 0L, index); }
    /// {@return `multiviewTessellationShader`}
    public int multiviewTessellationShader() { return multiviewTessellationShader(this.segment(), 0L); }
    /// Sets `multiviewTessellationShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiviewTessellationShader(MemorySegment segment, long index, int value) { VH_multiviewTessellationShader.set(segment, 0L, index, value); }
    /// Sets `multiviewTessellationShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewFeatures multiviewTessellationShader(int value) { multiviewTessellationShader(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceMultiviewFeatures].
    public static final class Buffer extends VkPhysicalDeviceMultiviewFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMultiviewFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMultiviewFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMultiviewFeatures`
        public VkPhysicalDeviceMultiviewFeatures asSlice(long index) { return new VkPhysicalDeviceMultiviewFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMultiviewFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMultiviewFeatures`
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

        /// {@return `multiview` at the given index}
        /// @param index the index of the struct buffer
        public int multiviewAt(long index) { return multiview(this.segment(), index); }
        /// Sets `multiview` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer multiviewAt(long index, int value) { multiview(this.segment(), index, value); return this; }

        /// {@return `multiviewGeometryShader` at the given index}
        /// @param index the index of the struct buffer
        public int multiviewGeometryShaderAt(long index) { return multiviewGeometryShader(this.segment(), index); }
        /// Sets `multiviewGeometryShader` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer multiviewGeometryShaderAt(long index, int value) { multiviewGeometryShader(this.segment(), index, value); return this; }

        /// {@return `multiviewTessellationShader` at the given index}
        /// @param index the index of the struct buffer
        public int multiviewTessellationShaderAt(long index) { return multiviewTessellationShader(this.segment(), index); }
        /// Sets `multiviewTessellationShader` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer multiviewTessellationShaderAt(long index, int value) { multiviewTessellationShader(this.segment(), index, value); return this; }

    }
}
