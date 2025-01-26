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
/// struct VkImportFenceFdInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkFence fence;
///     VkFenceImportFlags flags;
///     VkExternalFenceHandleTypeFlagBits handleType;
///     int fd;
/// };
/// ```
public sealed class VkImportFenceFdInfoKHR extends GroupType {
    /// The struct layout of `VkImportFenceFdInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("fence"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("fd")
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
    /// The byte offset of `fence`.
    public static final long OFFSET_fence = LAYOUT.byteOffset(PathElement.groupElement("fence"));
    /// The memory layout of `fence`.
    public static final MemoryLayout LAYOUT_fence = LAYOUT.select(PathElement.groupElement("fence"));
    /// The [VarHandle] of `fence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `handleType`.
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    /// The memory layout of `handleType`.
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    /// The byte offset of `fd`.
    public static final long OFFSET_fd = LAYOUT.byteOffset(PathElement.groupElement("fd"));
    /// The memory layout of `fd`.
    public static final MemoryLayout LAYOUT_fd = LAYOUT.select(PathElement.groupElement("fd"));
    /// The [VarHandle] of `fd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fd"));

    /// Creates `VkImportFenceFdInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkImportFenceFdInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportFenceFdInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportFenceFdInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportFenceFdInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportFenceFdInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportFenceFdInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportFenceFdInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportFenceFdInfoKHR`
    public static VkImportFenceFdInfoKHR alloc(SegmentAllocator allocator) { return new VkImportFenceFdInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportFenceFdInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportFenceFdInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportFenceFdInfoKHR copyFrom(VkImportFenceFdInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkImportFenceFdInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImportFenceFdInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fence` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long fence(MemorySegment segment, long index) { return (long) VH_fence.get(segment, 0L, index); }
    /// {@return `fence`}
    public long fence() { return fence(this.segment(), 0L); }
    /// Sets `fence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fence(MemorySegment segment, long index, long value) { VH_fence.set(segment, 0L, index, value); }
    /// Sets `fence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceFdInfoKHR fence(long value) { fence(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceFdInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    public int handleType() { return handleType(this.segment(), 0L); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handleType(MemorySegment segment, long index, int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceFdInfoKHR handleType(int value) { handleType(this.segment(), 0L, value); return this; }

    /// {@return `fd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fd(MemorySegment segment, long index) { return (int) VH_fd.get(segment, 0L, index); }
    /// {@return `fd`}
    public int fd() { return fd(this.segment(), 0L); }
    /// Sets `fd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fd(MemorySegment segment, long index, int value) { VH_fd.set(segment, 0L, index, value); }
    /// Sets `fd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceFdInfoKHR fd(int value) { fd(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImportFenceFdInfoKHR].
    public static final class Buffer extends VkImportFenceFdInfoKHR {
        private final long elementCount;

        /// Creates `VkImportFenceFdInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportFenceFdInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportFenceFdInfoKHR`
        public VkImportFenceFdInfoKHR asSlice(long index) { return new VkImportFenceFdInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportFenceFdInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportFenceFdInfoKHR`
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

        /// {@return `fence` at the given index}
        /// @param index the index of the struct buffer
        public long fenceAt(long index) { return fence(this.segment(), index); }
        /// Sets `fence` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fenceAt(long index, long value) { fence(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `handleType` at the given index}
        /// @param index the index of the struct buffer
        public int handleTypeAt(long index) { return handleType(this.segment(), index); }
        /// Sets `handleType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer handleTypeAt(long index, int value) { handleType(this.segment(), index, value); return this; }

        /// {@return `fd` at the given index}
        /// @param index the index of the struct buffer
        public int fdAt(long index) { return fd(this.segment(), index); }
        /// Sets `fd` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fdAt(long index, int value) { fd(this.segment(), index, value); return this; }

    }
}
