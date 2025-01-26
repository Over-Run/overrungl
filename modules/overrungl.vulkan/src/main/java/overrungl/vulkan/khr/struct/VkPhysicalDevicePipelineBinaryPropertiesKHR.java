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
/// struct VkPhysicalDevicePipelineBinaryPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineBinaryInternalCache;
///     VkBool32 pipelineBinaryInternalCacheControl;
///     VkBool32 pipelineBinaryPrefersInternalCache;
///     VkBool32 pipelineBinaryPrecompiledInternalCache;
///     VkBool32 pipelineBinaryCompressedData;
/// };
/// ```
public sealed class VkPhysicalDevicePipelineBinaryPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDevicePipelineBinaryPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCacheControl"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrefersInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrecompiledInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCompressedData")
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
    /// The byte offset of `pipelineBinaryInternalCache`.
    public static final long OFFSET_pipelineBinaryInternalCache = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryInternalCache"));
    /// The memory layout of `pipelineBinaryInternalCache`.
    public static final MemoryLayout LAYOUT_pipelineBinaryInternalCache = LAYOUT.select(PathElement.groupElement("pipelineBinaryInternalCache"));
    /// The [VarHandle] of `pipelineBinaryInternalCache` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBinaryInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryInternalCache"));
    /// The byte offset of `pipelineBinaryInternalCacheControl`.
    public static final long OFFSET_pipelineBinaryInternalCacheControl = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
    /// The memory layout of `pipelineBinaryInternalCacheControl`.
    public static final MemoryLayout LAYOUT_pipelineBinaryInternalCacheControl = LAYOUT.select(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
    /// The [VarHandle] of `pipelineBinaryInternalCacheControl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBinaryInternalCacheControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
    /// The byte offset of `pipelineBinaryPrefersInternalCache`.
    public static final long OFFSET_pipelineBinaryPrefersInternalCache = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
    /// The memory layout of `pipelineBinaryPrefersInternalCache`.
    public static final MemoryLayout LAYOUT_pipelineBinaryPrefersInternalCache = LAYOUT.select(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
    /// The [VarHandle] of `pipelineBinaryPrefersInternalCache` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBinaryPrefersInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
    /// The byte offset of `pipelineBinaryPrecompiledInternalCache`.
    public static final long OFFSET_pipelineBinaryPrecompiledInternalCache = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
    /// The memory layout of `pipelineBinaryPrecompiledInternalCache`.
    public static final MemoryLayout LAYOUT_pipelineBinaryPrecompiledInternalCache = LAYOUT.select(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
    /// The [VarHandle] of `pipelineBinaryPrecompiledInternalCache` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBinaryPrecompiledInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
    /// The byte offset of `pipelineBinaryCompressedData`.
    public static final long OFFSET_pipelineBinaryCompressedData = LAYOUT.byteOffset(PathElement.groupElement("pipelineBinaryCompressedData"));
    /// The memory layout of `pipelineBinaryCompressedData`.
    public static final MemoryLayout LAYOUT_pipelineBinaryCompressedData = LAYOUT.select(PathElement.groupElement("pipelineBinaryCompressedData"));
    /// The [VarHandle] of `pipelineBinaryCompressedData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBinaryCompressedData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryCompressedData"));

    /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePipelineBinaryPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePipelineBinaryPropertiesKHR`
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePipelineBinaryPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR copyFrom(VkPhysicalDevicePipelineBinaryPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDevicePipelineBinaryPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBinaryInternalCache` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBinaryInternalCache(MemorySegment segment, long index) { return (int) VH_pipelineBinaryInternalCache.get(segment, 0L, index); }
    /// {@return `pipelineBinaryInternalCache`}
    public int pipelineBinaryInternalCache() { return pipelineBinaryInternalCache(this.segment(), 0L); }
    /// Sets `pipelineBinaryInternalCache` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBinaryInternalCache(MemorySegment segment, long index, int value) { VH_pipelineBinaryInternalCache.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryInternalCache` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCache(int value) { pipelineBinaryInternalCache(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBinaryInternalCacheControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBinaryInternalCacheControl(MemorySegment segment, long index) { return (int) VH_pipelineBinaryInternalCacheControl.get(segment, 0L, index); }
    /// {@return `pipelineBinaryInternalCacheControl`}
    public int pipelineBinaryInternalCacheControl() { return pipelineBinaryInternalCacheControl(this.segment(), 0L); }
    /// Sets `pipelineBinaryInternalCacheControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBinaryInternalCacheControl(MemorySegment segment, long index, int value) { VH_pipelineBinaryInternalCacheControl.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryInternalCacheControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCacheControl(int value) { pipelineBinaryInternalCacheControl(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBinaryPrefersInternalCache` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBinaryPrefersInternalCache(MemorySegment segment, long index) { return (int) VH_pipelineBinaryPrefersInternalCache.get(segment, 0L, index); }
    /// {@return `pipelineBinaryPrefersInternalCache`}
    public int pipelineBinaryPrefersInternalCache() { return pipelineBinaryPrefersInternalCache(this.segment(), 0L); }
    /// Sets `pipelineBinaryPrefersInternalCache` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBinaryPrefersInternalCache(MemorySegment segment, long index, int value) { VH_pipelineBinaryPrefersInternalCache.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryPrefersInternalCache` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrefersInternalCache(int value) { pipelineBinaryPrefersInternalCache(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBinaryPrecompiledInternalCache` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBinaryPrecompiledInternalCache(MemorySegment segment, long index) { return (int) VH_pipelineBinaryPrecompiledInternalCache.get(segment, 0L, index); }
    /// {@return `pipelineBinaryPrecompiledInternalCache`}
    public int pipelineBinaryPrecompiledInternalCache() { return pipelineBinaryPrecompiledInternalCache(this.segment(), 0L); }
    /// Sets `pipelineBinaryPrecompiledInternalCache` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBinaryPrecompiledInternalCache(MemorySegment segment, long index, int value) { VH_pipelineBinaryPrecompiledInternalCache.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryPrecompiledInternalCache` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrecompiledInternalCache(int value) { pipelineBinaryPrecompiledInternalCache(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBinaryCompressedData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBinaryCompressedData(MemorySegment segment, long index) { return (int) VH_pipelineBinaryCompressedData.get(segment, 0L, index); }
    /// {@return `pipelineBinaryCompressedData`}
    public int pipelineBinaryCompressedData() { return pipelineBinaryCompressedData(this.segment(), 0L); }
    /// Sets `pipelineBinaryCompressedData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBinaryCompressedData(MemorySegment segment, long index, int value) { VH_pipelineBinaryCompressedData.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryCompressedData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryCompressedData(int value) { pipelineBinaryCompressedData(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDevicePipelineBinaryPropertiesKHR].
    public static final class Buffer extends VkPhysicalDevicePipelineBinaryPropertiesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevicePipelineBinaryPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevicePipelineBinaryPropertiesKHR`
        public VkPhysicalDevicePipelineBinaryPropertiesKHR asSlice(long index) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevicePipelineBinaryPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevicePipelineBinaryPropertiesKHR`
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

        /// {@return `pipelineBinaryInternalCache` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineBinaryInternalCacheAt(long index) { return pipelineBinaryInternalCache(this.segment(), index); }
        /// Sets `pipelineBinaryInternalCache` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBinaryInternalCacheAt(long index, int value) { pipelineBinaryInternalCache(this.segment(), index, value); return this; }

        /// {@return `pipelineBinaryInternalCacheControl` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineBinaryInternalCacheControlAt(long index) { return pipelineBinaryInternalCacheControl(this.segment(), index); }
        /// Sets `pipelineBinaryInternalCacheControl` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBinaryInternalCacheControlAt(long index, int value) { pipelineBinaryInternalCacheControl(this.segment(), index, value); return this; }

        /// {@return `pipelineBinaryPrefersInternalCache` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineBinaryPrefersInternalCacheAt(long index) { return pipelineBinaryPrefersInternalCache(this.segment(), index); }
        /// Sets `pipelineBinaryPrefersInternalCache` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBinaryPrefersInternalCacheAt(long index, int value) { pipelineBinaryPrefersInternalCache(this.segment(), index, value); return this; }

        /// {@return `pipelineBinaryPrecompiledInternalCache` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineBinaryPrecompiledInternalCacheAt(long index) { return pipelineBinaryPrecompiledInternalCache(this.segment(), index); }
        /// Sets `pipelineBinaryPrecompiledInternalCache` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBinaryPrecompiledInternalCacheAt(long index, int value) { pipelineBinaryPrecompiledInternalCache(this.segment(), index, value); return this; }

        /// {@return `pipelineBinaryCompressedData` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineBinaryCompressedDataAt(long index) { return pipelineBinaryCompressedData(this.segment(), index); }
        /// Sets `pipelineBinaryCompressedData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBinaryCompressedDataAt(long index, int value) { pipelineBinaryCompressedData(this.segment(), index, value); return this; }

    }
}
