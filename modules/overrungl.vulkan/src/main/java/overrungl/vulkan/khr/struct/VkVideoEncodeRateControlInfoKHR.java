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
/// struct VkVideoEncodeRateControlInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeRateControlFlagsKHR flags;
///     (int) VkVideoEncodeRateControlModeFlagBitsKHR rateControlMode;
///     uint32_t layerCount;
///     const VkVideoEncodeRateControlLayerInfoKHR* pLayers;
///     uint32_t virtualBufferSizeInMs;
///     uint32_t initialVirtualBufferSizeInMs;
/// };
/// ```
public sealed class VkVideoEncodeRateControlInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeRateControlInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rateControlMode"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.ADDRESS.withName("pLayers"),
        ValueLayout.JAVA_INT.withName("virtualBufferSizeInMs"),
        ValueLayout.JAVA_INT.withName("initialVirtualBufferSizeInMs")
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
    /// The byte offset of `rateControlMode`.
    public static final long OFFSET_rateControlMode = LAYOUT.byteOffset(PathElement.groupElement("rateControlMode"));
    /// The memory layout of `rateControlMode`.
    public static final MemoryLayout LAYOUT_rateControlMode = LAYOUT.select(PathElement.groupElement("rateControlMode"));
    /// The [VarHandle] of `rateControlMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rateControlMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlMode"));
    /// The byte offset of `layerCount`.
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    /// The memory layout of `layerCount`.
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));
    /// The byte offset of `pLayers`.
    public static final long OFFSET_pLayers = LAYOUT.byteOffset(PathElement.groupElement("pLayers"));
    /// The memory layout of `pLayers`.
    public static final MemoryLayout LAYOUT_pLayers = LAYOUT.select(PathElement.groupElement("pLayers"));
    /// The [VarHandle] of `pLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayers"));
    /// The byte offset of `virtualBufferSizeInMs`.
    public static final long OFFSET_virtualBufferSizeInMs = LAYOUT.byteOffset(PathElement.groupElement("virtualBufferSizeInMs"));
    /// The memory layout of `virtualBufferSizeInMs`.
    public static final MemoryLayout LAYOUT_virtualBufferSizeInMs = LAYOUT.select(PathElement.groupElement("virtualBufferSizeInMs"));
    /// The [VarHandle] of `virtualBufferSizeInMs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_virtualBufferSizeInMs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("virtualBufferSizeInMs"));
    /// The byte offset of `initialVirtualBufferSizeInMs`.
    public static final long OFFSET_initialVirtualBufferSizeInMs = LAYOUT.byteOffset(PathElement.groupElement("initialVirtualBufferSizeInMs"));
    /// The memory layout of `initialVirtualBufferSizeInMs`.
    public static final MemoryLayout LAYOUT_initialVirtualBufferSizeInMs = LAYOUT.select(PathElement.groupElement("initialVirtualBufferSizeInMs"));
    /// The [VarHandle] of `initialVirtualBufferSizeInMs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initialVirtualBufferSizeInMs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialVirtualBufferSizeInMs"));

    /// Creates `VkVideoEncodeRateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeRateControlInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeRateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeRateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRateControlInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeRateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeRateControlInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeRateControlInfoKHR`
    public static VkVideoEncodeRateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeRateControlInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeRateControlInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeRateControlInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR copyFrom(VkVideoEncodeRateControlInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeRateControlInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeRateControlInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeRateControlInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `rateControlMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rateControlMode(MemorySegment segment, long index) { return (int) VH_rateControlMode.get(segment, 0L, index); }
    /// {@return `rateControlMode`}
    public int rateControlMode() { return rateControlMode(this.segment(), 0L); }
    /// Sets `rateControlMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rateControlMode(MemorySegment segment, long index, int value) { VH_rateControlMode.set(segment, 0L, index, value); }
    /// Sets `rateControlMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR rateControlMode(int value) { rateControlMode(this.segment(), 0L, value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    public int layerCount() { return layerCount(this.segment(), 0L); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layerCount(MemorySegment segment, long index, int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR layerCount(int value) { layerCount(this.segment(), 0L, value); return this; }

    /// {@return `pLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLayers(MemorySegment segment, long index) { return (MemorySegment) VH_pLayers.get(segment, 0L, index); }
    /// {@return `pLayers`}
    public MemorySegment pLayers() { return pLayers(this.segment(), 0L); }
    /// Sets `pLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLayers(MemorySegment segment, long index, MemorySegment value) { VH_pLayers.set(segment, 0L, index, value); }
    /// Sets `pLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR pLayers(MemorySegment value) { pLayers(this.segment(), 0L, value); return this; }

    /// {@return `virtualBufferSizeInMs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int virtualBufferSizeInMs(MemorySegment segment, long index) { return (int) VH_virtualBufferSizeInMs.get(segment, 0L, index); }
    /// {@return `virtualBufferSizeInMs`}
    public int virtualBufferSizeInMs() { return virtualBufferSizeInMs(this.segment(), 0L); }
    /// Sets `virtualBufferSizeInMs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void virtualBufferSizeInMs(MemorySegment segment, long index, int value) { VH_virtualBufferSizeInMs.set(segment, 0L, index, value); }
    /// Sets `virtualBufferSizeInMs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMs(int value) { virtualBufferSizeInMs(this.segment(), 0L, value); return this; }

    /// {@return `initialVirtualBufferSizeInMs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int initialVirtualBufferSizeInMs(MemorySegment segment, long index) { return (int) VH_initialVirtualBufferSizeInMs.get(segment, 0L, index); }
    /// {@return `initialVirtualBufferSizeInMs`}
    public int initialVirtualBufferSizeInMs() { return initialVirtualBufferSizeInMs(this.segment(), 0L); }
    /// Sets `initialVirtualBufferSizeInMs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initialVirtualBufferSizeInMs(MemorySegment segment, long index, int value) { VH_initialVirtualBufferSizeInMs.set(segment, 0L, index, value); }
    /// Sets `initialVirtualBufferSizeInMs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMs(int value) { initialVirtualBufferSizeInMs(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeRateControlInfoKHR].
    public static final class Buffer extends VkVideoEncodeRateControlInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeRateControlInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeRateControlInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeRateControlInfoKHR`
        public VkVideoEncodeRateControlInfoKHR asSlice(long index) { return new VkVideoEncodeRateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeRateControlInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeRateControlInfoKHR`
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

        /// {@return `rateControlMode` at the given index}
        /// @param index the index of the struct buffer
        public int rateControlModeAt(long index) { return rateControlMode(this.segment(), index); }
        /// Sets `rateControlMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rateControlModeAt(long index, int value) { rateControlMode(this.segment(), index, value); return this; }

        /// {@return `layerCount` at the given index}
        /// @param index the index of the struct buffer
        public int layerCountAt(long index) { return layerCount(this.segment(), index); }
        /// Sets `layerCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layerCountAt(long index, int value) { layerCount(this.segment(), index, value); return this; }

        /// {@return `pLayers` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pLayersAt(long index) { return pLayers(this.segment(), index); }
        /// Sets `pLayers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pLayersAt(long index, MemorySegment value) { pLayers(this.segment(), index, value); return this; }

        /// {@return `virtualBufferSizeInMs` at the given index}
        /// @param index the index of the struct buffer
        public int virtualBufferSizeInMsAt(long index) { return virtualBufferSizeInMs(this.segment(), index); }
        /// Sets `virtualBufferSizeInMs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer virtualBufferSizeInMsAt(long index, int value) { virtualBufferSizeInMs(this.segment(), index, value); return this; }

        /// {@return `initialVirtualBufferSizeInMs` at the given index}
        /// @param index the index of the struct buffer
        public int initialVirtualBufferSizeInMsAt(long index) { return initialVirtualBufferSizeInMs(this.segment(), index); }
        /// Sets `initialVirtualBufferSizeInMs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer initialVirtualBufferSizeInMsAt(long index, int value) { initialVirtualBufferSizeInMs(this.segment(), index, value); return this; }

    }
}
