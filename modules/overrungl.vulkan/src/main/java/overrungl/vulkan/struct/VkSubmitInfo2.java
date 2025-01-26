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
/// struct VkSubmitInfo2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkSubmitFlags flags;
///     uint32_t waitSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pWaitSemaphoreInfos;
///     uint32_t commandBufferInfoCount;
///     const VkCommandBufferSubmitInfo* pCommandBufferInfos;
///     uint32_t signalSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pSignalSemaphoreInfos;
/// };
/// ```
public sealed class VkSubmitInfo2 extends GroupType {
    /// The struct layout of `VkSubmitInfo2`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreInfos"),
        ValueLayout.JAVA_INT.withName("commandBufferInfoCount"),
        ValueLayout.ADDRESS.withName("pCommandBufferInfos"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreInfos")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `waitSemaphoreInfoCount`.
    public static final long OFFSET_waitSemaphoreInfoCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreInfoCount"));
    /// The memory layout of `waitSemaphoreInfoCount`.
    public static final MemoryLayout LAYOUT_waitSemaphoreInfoCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreInfoCount"));
    /// The [VarHandle] of `waitSemaphoreInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_waitSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreInfoCount"));
    /// The byte offset of `pWaitSemaphoreInfos`.
    public static final long OFFSET_pWaitSemaphoreInfos = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreInfos"));
    /// The memory layout of `pWaitSemaphoreInfos`.
    public static final MemoryLayout LAYOUT_pWaitSemaphoreInfos = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreInfos"));
    /// The [VarHandle] of `pWaitSemaphoreInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreInfos"));
    /// The byte offset of `commandBufferInfoCount`.
    public static final long OFFSET_commandBufferInfoCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferInfoCount"));
    /// The memory layout of `commandBufferInfoCount`.
    public static final MemoryLayout LAYOUT_commandBufferInfoCount = LAYOUT.select(PathElement.groupElement("commandBufferInfoCount"));
    /// The [VarHandle] of `commandBufferInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBufferInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferInfoCount"));
    /// The byte offset of `pCommandBufferInfos`.
    public static final long OFFSET_pCommandBufferInfos = LAYOUT.byteOffset(PathElement.groupElement("pCommandBufferInfos"));
    /// The memory layout of `pCommandBufferInfos`.
    public static final MemoryLayout LAYOUT_pCommandBufferInfos = LAYOUT.select(PathElement.groupElement("pCommandBufferInfos"));
    /// The [VarHandle] of `pCommandBufferInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCommandBufferInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCommandBufferInfos"));
    /// The byte offset of `signalSemaphoreInfoCount`.
    public static final long OFFSET_signalSemaphoreInfoCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreInfoCount"));
    /// The memory layout of `signalSemaphoreInfoCount`.
    public static final MemoryLayout LAYOUT_signalSemaphoreInfoCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreInfoCount"));
    /// The [VarHandle] of `signalSemaphoreInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_signalSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreInfoCount"));
    /// The byte offset of `pSignalSemaphoreInfos`.
    public static final long OFFSET_pSignalSemaphoreInfos = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreInfos"));
    /// The memory layout of `pSignalSemaphoreInfos`.
    public static final MemoryLayout LAYOUT_pSignalSemaphoreInfos = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreInfos"));
    /// The [VarHandle] of `pSignalSemaphoreInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreInfos"));

    /// Creates `VkSubmitInfo2` with the given segment.
    /// @param segment the memory segment
    public VkSubmitInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubmitInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubmitInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubmitInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubmitInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubmitInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubmitInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubmitInfo2`
    public static VkSubmitInfo2 alloc(SegmentAllocator allocator) { return new VkSubmitInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubmitInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubmitInfo2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubmitInfo2 copyFrom(VkSubmitInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkSubmitInfo2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSubmitInfo2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkSubmitInfo2 flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `waitSemaphoreInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int waitSemaphoreInfoCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreInfoCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreInfoCount`}
    public int waitSemaphoreInfoCount() { return waitSemaphoreInfoCount(this.segment(), 0L); }
    /// Sets `waitSemaphoreInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void waitSemaphoreInfoCount(MemorySegment segment, long index, int value) { VH_waitSemaphoreInfoCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 waitSemaphoreInfoCount(int value) { waitSemaphoreInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pWaitSemaphoreInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWaitSemaphoreInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitSemaphoreInfos.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreInfos`}
    public MemorySegment pWaitSemaphoreInfos() { return pWaitSemaphoreInfos(this.segment(), 0L); }
    /// Sets `pWaitSemaphoreInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWaitSemaphoreInfos(MemorySegment segment, long index, MemorySegment value) { VH_pWaitSemaphoreInfos.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 pWaitSemaphoreInfos(MemorySegment value) { pWaitSemaphoreInfos(this.segment(), 0L, value); return this; }

    /// {@return `commandBufferInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandBufferInfoCount(MemorySegment segment, long index) { return (int) VH_commandBufferInfoCount.get(segment, 0L, index); }
    /// {@return `commandBufferInfoCount`}
    public int commandBufferInfoCount() { return commandBufferInfoCount(this.segment(), 0L); }
    /// Sets `commandBufferInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandBufferInfoCount(MemorySegment segment, long index, int value) { VH_commandBufferInfoCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 commandBufferInfoCount(int value) { commandBufferInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pCommandBufferInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCommandBufferInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pCommandBufferInfos.get(segment, 0L, index); }
    /// {@return `pCommandBufferInfos`}
    public MemorySegment pCommandBufferInfos() { return pCommandBufferInfos(this.segment(), 0L); }
    /// Sets `pCommandBufferInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCommandBufferInfos(MemorySegment segment, long index, MemorySegment value) { VH_pCommandBufferInfos.set(segment, 0L, index, value); }
    /// Sets `pCommandBufferInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 pCommandBufferInfos(MemorySegment value) { pCommandBufferInfos(this.segment(), 0L, value); return this; }

    /// {@return `signalSemaphoreInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int signalSemaphoreInfoCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreInfoCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreInfoCount`}
    public int signalSemaphoreInfoCount() { return signalSemaphoreInfoCount(this.segment(), 0L); }
    /// Sets `signalSemaphoreInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void signalSemaphoreInfoCount(MemorySegment segment, long index, int value) { VH_signalSemaphoreInfoCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 signalSemaphoreInfoCount(int value) { signalSemaphoreInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pSignalSemaphoreInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSignalSemaphoreInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pSignalSemaphoreInfos.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreInfos`}
    public MemorySegment pSignalSemaphoreInfos() { return pSignalSemaphoreInfos(this.segment(), 0L); }
    /// Sets `pSignalSemaphoreInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSignalSemaphoreInfos(MemorySegment segment, long index, MemorySegment value) { VH_pSignalSemaphoreInfos.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubmitInfo2 pSignalSemaphoreInfos(MemorySegment value) { pSignalSemaphoreInfos(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSubmitInfo2].
    public static final class Buffer extends VkSubmitInfo2 {
        private final long elementCount;

        /// Creates `VkSubmitInfo2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubmitInfo2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubmitInfo2`
        public VkSubmitInfo2 asSlice(long index) { return new VkSubmitInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubmitInfo2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubmitInfo2`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `waitSemaphoreInfoCount` at the given index}
        /// @param index the index of the struct buffer
        public int waitSemaphoreInfoCountAt(long index) { return waitSemaphoreInfoCount(this.segment(), index); }
        /// Sets `waitSemaphoreInfoCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer waitSemaphoreInfoCountAt(long index, int value) { waitSemaphoreInfoCount(this.segment(), index, value); return this; }

        /// {@return `pWaitSemaphoreInfos` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pWaitSemaphoreInfosAt(long index) { return pWaitSemaphoreInfos(this.segment(), index); }
        /// Sets `pWaitSemaphoreInfos` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pWaitSemaphoreInfosAt(long index, MemorySegment value) { pWaitSemaphoreInfos(this.segment(), index, value); return this; }

        /// {@return `commandBufferInfoCount` at the given index}
        /// @param index the index of the struct buffer
        public int commandBufferInfoCountAt(long index) { return commandBufferInfoCount(this.segment(), index); }
        /// Sets `commandBufferInfoCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer commandBufferInfoCountAt(long index, int value) { commandBufferInfoCount(this.segment(), index, value); return this; }

        /// {@return `pCommandBufferInfos` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pCommandBufferInfosAt(long index) { return pCommandBufferInfos(this.segment(), index); }
        /// Sets `pCommandBufferInfos` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pCommandBufferInfosAt(long index, MemorySegment value) { pCommandBufferInfos(this.segment(), index, value); return this; }

        /// {@return `signalSemaphoreInfoCount` at the given index}
        /// @param index the index of the struct buffer
        public int signalSemaphoreInfoCountAt(long index) { return signalSemaphoreInfoCount(this.segment(), index); }
        /// Sets `signalSemaphoreInfoCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer signalSemaphoreInfoCountAt(long index, int value) { signalSemaphoreInfoCount(this.segment(), index, value); return this; }

        /// {@return `pSignalSemaphoreInfos` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pSignalSemaphoreInfosAt(long index) { return pSignalSemaphoreInfos(this.segment(), index); }
        /// Sets `pSignalSemaphoreInfos` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pSignalSemaphoreInfosAt(long index, MemorySegment value) { pSignalSemaphoreInfos(this.segment(), index, value); return this; }

    }
}
