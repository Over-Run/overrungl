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
/// struct VkWin32KeyedMutexAcquireReleaseInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t acquireCount;
///     const VkDeviceMemory* pAcquireSyncs;
///     const uint64_t* pAcquireKeys;
///     const uint32_t* pAcquireTimeouts;
///     uint32_t releaseCount;
///     const VkDeviceMemory* pReleaseSyncs;
///     const uint64_t* pReleaseKeys;
/// };
/// ```
public sealed class VkWin32KeyedMutexAcquireReleaseInfoKHR extends GroupType {
    /// The struct layout of `VkWin32KeyedMutexAcquireReleaseInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireCount"),
        ValueLayout.ADDRESS.withName("pAcquireSyncs"),
        ValueLayout.ADDRESS.withName("pAcquireKeys"),
        ValueLayout.ADDRESS.withName("pAcquireTimeouts"),
        ValueLayout.JAVA_INT.withName("releaseCount"),
        ValueLayout.ADDRESS.withName("pReleaseSyncs"),
        ValueLayout.ADDRESS.withName("pReleaseKeys")
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
    /// The byte offset of `acquireCount`.
    public static final long OFFSET_acquireCount = LAYOUT.byteOffset(PathElement.groupElement("acquireCount"));
    /// The memory layout of `acquireCount`.
    public static final MemoryLayout LAYOUT_acquireCount = LAYOUT.select(PathElement.groupElement("acquireCount"));
    /// The [VarHandle] of `acquireCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_acquireCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("acquireCount"));
    /// The byte offset of `pAcquireSyncs`.
    public static final long OFFSET_pAcquireSyncs = LAYOUT.byteOffset(PathElement.groupElement("pAcquireSyncs"));
    /// The memory layout of `pAcquireSyncs`.
    public static final MemoryLayout LAYOUT_pAcquireSyncs = LAYOUT.select(PathElement.groupElement("pAcquireSyncs"));
    /// The [VarHandle] of `pAcquireSyncs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAcquireSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireSyncs"));
    /// The byte offset of `pAcquireKeys`.
    public static final long OFFSET_pAcquireKeys = LAYOUT.byteOffset(PathElement.groupElement("pAcquireKeys"));
    /// The memory layout of `pAcquireKeys`.
    public static final MemoryLayout LAYOUT_pAcquireKeys = LAYOUT.select(PathElement.groupElement("pAcquireKeys"));
    /// The [VarHandle] of `pAcquireKeys` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAcquireKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireKeys"));
    /// The byte offset of `pAcquireTimeouts`.
    public static final long OFFSET_pAcquireTimeouts = LAYOUT.byteOffset(PathElement.groupElement("pAcquireTimeouts"));
    /// The memory layout of `pAcquireTimeouts`.
    public static final MemoryLayout LAYOUT_pAcquireTimeouts = LAYOUT.select(PathElement.groupElement("pAcquireTimeouts"));
    /// The [VarHandle] of `pAcquireTimeouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAcquireTimeouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireTimeouts"));
    /// The byte offset of `releaseCount`.
    public static final long OFFSET_releaseCount = LAYOUT.byteOffset(PathElement.groupElement("releaseCount"));
    /// The memory layout of `releaseCount`.
    public static final MemoryLayout LAYOUT_releaseCount = LAYOUT.select(PathElement.groupElement("releaseCount"));
    /// The [VarHandle] of `releaseCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_releaseCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("releaseCount"));
    /// The byte offset of `pReleaseSyncs`.
    public static final long OFFSET_pReleaseSyncs = LAYOUT.byteOffset(PathElement.groupElement("pReleaseSyncs"));
    /// The memory layout of `pReleaseSyncs`.
    public static final MemoryLayout LAYOUT_pReleaseSyncs = LAYOUT.select(PathElement.groupElement("pReleaseSyncs"));
    /// The [VarHandle] of `pReleaseSyncs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pReleaseSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseSyncs"));
    /// The byte offset of `pReleaseKeys`.
    public static final long OFFSET_pReleaseKeys = LAYOUT.byteOffset(PathElement.groupElement("pReleaseKeys"));
    /// The memory layout of `pReleaseKeys`.
    public static final MemoryLayout LAYOUT_pReleaseKeys = LAYOUT.select(PathElement.groupElement("pReleaseKeys"));
    /// The [VarHandle] of `pReleaseKeys` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pReleaseKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseKeys"));

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkWin32KeyedMutexAcquireReleaseInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoKHR`
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR alloc(SegmentAllocator allocator) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWin32KeyedMutexAcquireReleaseInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWin32KeyedMutexAcquireReleaseInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR copyFrom(VkWin32KeyedMutexAcquireReleaseInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkWin32KeyedMutexAcquireReleaseInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `acquireCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int acquireCount(MemorySegment segment, long index) { return (int) VH_acquireCount.get(segment, 0L, index); }
    /// {@return `acquireCount`}
    public int acquireCount() { return acquireCount(this.segment(), 0L); }
    /// Sets `acquireCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void acquireCount(MemorySegment segment, long index, int value) { VH_acquireCount.set(segment, 0L, index, value); }
    /// Sets `acquireCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR acquireCount(int value) { acquireCount(this.segment(), 0L, value); return this; }

    /// {@return `pAcquireSyncs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAcquireSyncs(MemorySegment segment, long index) { return (MemorySegment) VH_pAcquireSyncs.get(segment, 0L, index); }
    /// {@return `pAcquireSyncs`}
    public MemorySegment pAcquireSyncs() { return pAcquireSyncs(this.segment(), 0L); }
    /// Sets `pAcquireSyncs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAcquireSyncs(MemorySegment segment, long index, MemorySegment value) { VH_pAcquireSyncs.set(segment, 0L, index, value); }
    /// Sets `pAcquireSyncs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireSyncs(MemorySegment value) { pAcquireSyncs(this.segment(), 0L, value); return this; }

    /// {@return `pAcquireKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAcquireKeys(MemorySegment segment, long index) { return (MemorySegment) VH_pAcquireKeys.get(segment, 0L, index); }
    /// {@return `pAcquireKeys`}
    public MemorySegment pAcquireKeys() { return pAcquireKeys(this.segment(), 0L); }
    /// Sets `pAcquireKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAcquireKeys(MemorySegment segment, long index, MemorySegment value) { VH_pAcquireKeys.set(segment, 0L, index, value); }
    /// Sets `pAcquireKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireKeys(MemorySegment value) { pAcquireKeys(this.segment(), 0L, value); return this; }

    /// {@return `pAcquireTimeouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAcquireTimeouts(MemorySegment segment, long index) { return (MemorySegment) VH_pAcquireTimeouts.get(segment, 0L, index); }
    /// {@return `pAcquireTimeouts`}
    public MemorySegment pAcquireTimeouts() { return pAcquireTimeouts(this.segment(), 0L); }
    /// Sets `pAcquireTimeouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAcquireTimeouts(MemorySegment segment, long index, MemorySegment value) { VH_pAcquireTimeouts.set(segment, 0L, index, value); }
    /// Sets `pAcquireTimeouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireTimeouts(MemorySegment value) { pAcquireTimeouts(this.segment(), 0L, value); return this; }

    /// {@return `releaseCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int releaseCount(MemorySegment segment, long index) { return (int) VH_releaseCount.get(segment, 0L, index); }
    /// {@return `releaseCount`}
    public int releaseCount() { return releaseCount(this.segment(), 0L); }
    /// Sets `releaseCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void releaseCount(MemorySegment segment, long index, int value) { VH_releaseCount.set(segment, 0L, index, value); }
    /// Sets `releaseCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR releaseCount(int value) { releaseCount(this.segment(), 0L, value); return this; }

    /// {@return `pReleaseSyncs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pReleaseSyncs(MemorySegment segment, long index) { return (MemorySegment) VH_pReleaseSyncs.get(segment, 0L, index); }
    /// {@return `pReleaseSyncs`}
    public MemorySegment pReleaseSyncs() { return pReleaseSyncs(this.segment(), 0L); }
    /// Sets `pReleaseSyncs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pReleaseSyncs(MemorySegment segment, long index, MemorySegment value) { VH_pReleaseSyncs.set(segment, 0L, index, value); }
    /// Sets `pReleaseSyncs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseSyncs(MemorySegment value) { pReleaseSyncs(this.segment(), 0L, value); return this; }

    /// {@return `pReleaseKeys` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pReleaseKeys(MemorySegment segment, long index) { return (MemorySegment) VH_pReleaseKeys.get(segment, 0L, index); }
    /// {@return `pReleaseKeys`}
    public MemorySegment pReleaseKeys() { return pReleaseKeys(this.segment(), 0L); }
    /// Sets `pReleaseKeys` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pReleaseKeys(MemorySegment segment, long index, MemorySegment value) { VH_pReleaseKeys.set(segment, 0L, index, value); }
    /// Sets `pReleaseKeys` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseKeys(MemorySegment value) { pReleaseKeys(this.segment(), 0L, value); return this; }

    /// A buffer of [VkWin32KeyedMutexAcquireReleaseInfoKHR].
    public static final class Buffer extends VkWin32KeyedMutexAcquireReleaseInfoKHR {
        private final long elementCount;

        /// Creates `VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkWin32KeyedMutexAcquireReleaseInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkWin32KeyedMutexAcquireReleaseInfoKHR`
        public VkWin32KeyedMutexAcquireReleaseInfoKHR asSlice(long index) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkWin32KeyedMutexAcquireReleaseInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkWin32KeyedMutexAcquireReleaseInfoKHR`
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

        /// {@return `acquireCount` at the given index}
        /// @param index the index of the struct buffer
        public int acquireCountAt(long index) { return acquireCount(this.segment(), index); }
        /// Sets `acquireCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer acquireCountAt(long index, int value) { acquireCount(this.segment(), index, value); return this; }

        /// {@return `pAcquireSyncs` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pAcquireSyncsAt(long index) { return pAcquireSyncs(this.segment(), index); }
        /// Sets `pAcquireSyncs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pAcquireSyncsAt(long index, MemorySegment value) { pAcquireSyncs(this.segment(), index, value); return this; }

        /// {@return `pAcquireKeys` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pAcquireKeysAt(long index) { return pAcquireKeys(this.segment(), index); }
        /// Sets `pAcquireKeys` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pAcquireKeysAt(long index, MemorySegment value) { pAcquireKeys(this.segment(), index, value); return this; }

        /// {@return `pAcquireTimeouts` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pAcquireTimeoutsAt(long index) { return pAcquireTimeouts(this.segment(), index); }
        /// Sets `pAcquireTimeouts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pAcquireTimeoutsAt(long index, MemorySegment value) { pAcquireTimeouts(this.segment(), index, value); return this; }

        /// {@return `releaseCount` at the given index}
        /// @param index the index of the struct buffer
        public int releaseCountAt(long index) { return releaseCount(this.segment(), index); }
        /// Sets `releaseCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer releaseCountAt(long index, int value) { releaseCount(this.segment(), index, value); return this; }

        /// {@return `pReleaseSyncs` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pReleaseSyncsAt(long index) { return pReleaseSyncs(this.segment(), index); }
        /// Sets `pReleaseSyncs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pReleaseSyncsAt(long index, MemorySegment value) { pReleaseSyncs(this.segment(), index, value); return this; }

        /// {@return `pReleaseKeys` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pReleaseKeysAt(long index) { return pReleaseKeys(this.segment(), index); }
        /// Sets `pReleaseKeys` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pReleaseKeysAt(long index, MemorySegment value) { pReleaseKeys(this.segment(), index, value); return this; }

    }
}
