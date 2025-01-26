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
/// struct VkVideoEncodeH264CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeH264CapabilityFlagsKHR flags;
///     StdVideoH264LevelIdc maxLevelIdc;
///     uint32_t maxSliceCount;
///     uint32_t maxPPictureL0ReferenceCount;
///     uint32_t maxBPictureL0ReferenceCount;
///     uint32_t maxL1ReferenceCount;
///     uint32_t maxTemporalLayerCount;
///     VkBool32 expectDyadicTemporalLayerPattern;
///     int32_t minQp;
///     int32_t maxQp;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags;
/// };
/// ```
public sealed class VkVideoEncodeH264CapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH264CapabilitiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxSliceCount"),
        ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxTemporalLayerCount"),
        ValueLayout.JAVA_INT.withName("expectDyadicTemporalLayerPattern"),
        ValueLayout.JAVA_INT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
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
    /// The byte offset of `maxLevelIdc`.
    public static final long OFFSET_maxLevelIdc = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
    /// The memory layout of `maxLevelIdc`.
    public static final MemoryLayout LAYOUT_maxLevelIdc = LAYOUT.select(PathElement.groupElement("maxLevelIdc"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    /// The byte offset of `maxSliceCount`.
    public static final long OFFSET_maxSliceCount = LAYOUT.byteOffset(PathElement.groupElement("maxSliceCount"));
    /// The memory layout of `maxSliceCount`.
    public static final MemoryLayout LAYOUT_maxSliceCount = LAYOUT.select(PathElement.groupElement("maxSliceCount"));
    /// The [VarHandle] of `maxSliceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSliceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSliceCount"));
    /// The byte offset of `maxPPictureL0ReferenceCount`.
    public static final long OFFSET_maxPPictureL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    /// The memory layout of `maxPPictureL0ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxPPictureL0ReferenceCount = LAYOUT.select(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    /// The [VarHandle] of `maxPPictureL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    /// The byte offset of `maxBPictureL0ReferenceCount`.
    public static final long OFFSET_maxBPictureL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    /// The memory layout of `maxBPictureL0ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxBPictureL0ReferenceCount = LAYOUT.select(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    /// The [VarHandle] of `maxBPictureL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxBPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    /// The byte offset of `maxL1ReferenceCount`.
    public static final long OFFSET_maxL1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxL1ReferenceCount"));
    /// The memory layout of `maxL1ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxL1ReferenceCount = LAYOUT.select(PathElement.groupElement("maxL1ReferenceCount"));
    /// The [VarHandle] of `maxL1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxL1ReferenceCount"));
    /// The byte offset of `maxTemporalLayerCount`.
    public static final long OFFSET_maxTemporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("maxTemporalLayerCount"));
    /// The memory layout of `maxTemporalLayerCount`.
    public static final MemoryLayout LAYOUT_maxTemporalLayerCount = LAYOUT.select(PathElement.groupElement("maxTemporalLayerCount"));
    /// The [VarHandle] of `maxTemporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTemporalLayerCount"));
    /// The byte offset of `expectDyadicTemporalLayerPattern`.
    public static final long OFFSET_expectDyadicTemporalLayerPattern = LAYOUT.byteOffset(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
    /// The memory layout of `expectDyadicTemporalLayerPattern`.
    public static final MemoryLayout LAYOUT_expectDyadicTemporalLayerPattern = LAYOUT.select(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
    /// The [VarHandle] of `expectDyadicTemporalLayerPattern` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_expectDyadicTemporalLayerPattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
    /// The byte offset of `minQp`.
    public static final long OFFSET_minQp = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
    /// The memory layout of `minQp`.
    public static final MemoryLayout LAYOUT_minQp = LAYOUT.select(PathElement.groupElement("minQp"));
    /// The [VarHandle] of `minQp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQp"));
    /// The byte offset of `maxQp`.
    public static final long OFFSET_maxQp = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
    /// The memory layout of `maxQp`.
    public static final MemoryLayout LAYOUT_maxQp = LAYOUT.select(PathElement.groupElement("maxQp"));
    /// The [VarHandle] of `maxQp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQp"));
    /// The byte offset of `prefersGopRemainingFrames`.
    public static final long OFFSET_prefersGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The memory layout of `prefersGopRemainingFrames`.
    public static final MemoryLayout LAYOUT_prefersGopRemainingFrames = LAYOUT.select(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The [VarHandle] of `prefersGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_prefersGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The byte offset of `requiresGopRemainingFrames`.
    public static final long OFFSET_requiresGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The memory layout of `requiresGopRemainingFrames`.
    public static final MemoryLayout LAYOUT_requiresGopRemainingFrames = LAYOUT.select(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The [VarHandle] of `requiresGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_requiresGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The byte offset of `stdSyntaxFlags`.
    public static final long OFFSET_stdSyntaxFlags = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
    /// The memory layout of `stdSyntaxFlags`.
    public static final MemoryLayout LAYOUT_stdSyntaxFlags = LAYOUT.select(PathElement.groupElement("stdSyntaxFlags"));
    /// The [VarHandle] of `stdSyntaxFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdSyntaxFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSyntaxFlags"));

    /// Creates `VkVideoEncodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264CapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH264CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264CapabilitiesKHR`
    public static VkVideoEncodeH264CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264CapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264CapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR copyFrom(VkVideoEncodeH264CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH264CapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264CapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264CapabilitiesKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    public int maxLevelIdc() { return maxLevelIdc(this.segment(), 0L); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLevelIdc(MemorySegment segment, long index, int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxLevelIdc(int value) { maxLevelIdc(this.segment(), 0L, value); return this; }

    /// {@return `maxSliceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSliceCount(MemorySegment segment, long index) { return (int) VH_maxSliceCount.get(segment, 0L, index); }
    /// {@return `maxSliceCount`}
    public int maxSliceCount() { return maxSliceCount(this.segment(), 0L); }
    /// Sets `maxSliceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSliceCount(MemorySegment segment, long index, int value) { VH_maxSliceCount.set(segment, 0L, index, value); }
    /// Sets `maxSliceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxSliceCount(int value) { maxSliceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxPPictureL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPPictureL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxPPictureL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxPPictureL0ReferenceCount`}
    public int maxPPictureL0ReferenceCount() { return maxPPictureL0ReferenceCount(this.segment(), 0L); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPPictureL0ReferenceCount(MemorySegment segment, long index, int value) { VH_maxPPictureL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxPPictureL0ReferenceCount(int value) { maxPPictureL0ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxBPictureL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxBPictureL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBPictureL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxBPictureL0ReferenceCount`}
    public int maxBPictureL0ReferenceCount() { return maxBPictureL0ReferenceCount(this.segment(), 0L); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBPictureL0ReferenceCount(MemorySegment segment, long index, int value) { VH_maxBPictureL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxBPictureL0ReferenceCount(int value) { maxBPictureL0ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxL1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxL1ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxL1ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxL1ReferenceCount`}
    public int maxL1ReferenceCount() { return maxL1ReferenceCount(this.segment(), 0L); }
    /// Sets `maxL1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxL1ReferenceCount(MemorySegment segment, long index, int value) { VH_maxL1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxL1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxL1ReferenceCount(int value) { maxL1ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxTemporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTemporalLayerCount(MemorySegment segment, long index) { return (int) VH_maxTemporalLayerCount.get(segment, 0L, index); }
    /// {@return `maxTemporalLayerCount`}
    public int maxTemporalLayerCount() { return maxTemporalLayerCount(this.segment(), 0L); }
    /// Sets `maxTemporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTemporalLayerCount(MemorySegment segment, long index, int value) { VH_maxTemporalLayerCount.set(segment, 0L, index, value); }
    /// Sets `maxTemporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxTemporalLayerCount(int value) { maxTemporalLayerCount(this.segment(), 0L, value); return this; }

    /// {@return `expectDyadicTemporalLayerPattern` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int expectDyadicTemporalLayerPattern(MemorySegment segment, long index) { return (int) VH_expectDyadicTemporalLayerPattern.get(segment, 0L, index); }
    /// {@return `expectDyadicTemporalLayerPattern`}
    public int expectDyadicTemporalLayerPattern() { return expectDyadicTemporalLayerPattern(this.segment(), 0L); }
    /// Sets `expectDyadicTemporalLayerPattern` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void expectDyadicTemporalLayerPattern(MemorySegment segment, long index, int value) { VH_expectDyadicTemporalLayerPattern.set(segment, 0L, index, value); }
    /// Sets `expectDyadicTemporalLayerPattern` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR expectDyadicTemporalLayerPattern(int value) { expectDyadicTemporalLayerPattern(this.segment(), 0L, value); return this; }

    /// {@return `minQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minQp(MemorySegment segment, long index) { return (int) VH_minQp.get(segment, 0L, index); }
    /// {@return `minQp`}
    public int minQp() { return minQp(this.segment(), 0L); }
    /// Sets `minQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minQp(MemorySegment segment, long index, int value) { VH_minQp.set(segment, 0L, index, value); }
    /// Sets `minQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR minQp(int value) { minQp(this.segment(), 0L, value); return this; }

    /// {@return `maxQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxQp(MemorySegment segment, long index) { return (int) VH_maxQp.get(segment, 0L, index); }
    /// {@return `maxQp`}
    public int maxQp() { return maxQp(this.segment(), 0L); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQp(MemorySegment segment, long index, int value) { VH_maxQp.set(segment, 0L, index, value); }
    /// Sets `maxQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxQp(int value) { maxQp(this.segment(), 0L, value); return this; }

    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int prefersGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_prefersGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `prefersGopRemainingFrames`}
    public int prefersGopRemainingFrames() { return prefersGopRemainingFrames(this.segment(), 0L); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void prefersGopRemainingFrames(MemorySegment segment, long index, int value) { VH_prefersGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR prefersGopRemainingFrames(int value) { prefersGopRemainingFrames(this.segment(), 0L, value); return this; }

    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiresGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_requiresGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `requiresGopRemainingFrames`}
    public int requiresGopRemainingFrames() { return requiresGopRemainingFrames(this.segment(), 0L); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiresGopRemainingFrames(MemorySegment segment, long index, int value) { VH_requiresGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR requiresGopRemainingFrames(int value) { requiresGopRemainingFrames(this.segment(), 0L, value); return this; }

    /// {@return `stdSyntaxFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdSyntaxFlags(MemorySegment segment, long index) { return (int) VH_stdSyntaxFlags.get(segment, 0L, index); }
    /// {@return `stdSyntaxFlags`}
    public int stdSyntaxFlags() { return stdSyntaxFlags(this.segment(), 0L); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdSyntaxFlags(MemorySegment segment, long index, int value) { VH_stdSyntaxFlags.set(segment, 0L, index, value); }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR stdSyntaxFlags(int value) { stdSyntaxFlags(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH264CapabilitiesKHR].
    public static final class Buffer extends VkVideoEncodeH264CapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264CapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264CapabilitiesKHR`
        public VkVideoEncodeH264CapabilitiesKHR asSlice(long index) { return new VkVideoEncodeH264CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264CapabilitiesKHR`
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

        /// {@return `maxLevelIdc` at the given index}
        /// @param index the index of the struct buffer
        public int maxLevelIdcAt(long index) { return maxLevelIdc(this.segment(), index); }
        /// Sets `maxLevelIdc` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxLevelIdcAt(long index, int value) { maxLevelIdc(this.segment(), index, value); return this; }

        /// {@return `maxSliceCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxSliceCountAt(long index) { return maxSliceCount(this.segment(), index); }
        /// Sets `maxSliceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxSliceCountAt(long index, int value) { maxSliceCount(this.segment(), index, value); return this; }

        /// {@return `maxPPictureL0ReferenceCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxPPictureL0ReferenceCountAt(long index) { return maxPPictureL0ReferenceCount(this.segment(), index); }
        /// Sets `maxPPictureL0ReferenceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPPictureL0ReferenceCountAt(long index, int value) { maxPPictureL0ReferenceCount(this.segment(), index, value); return this; }

        /// {@return `maxBPictureL0ReferenceCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxBPictureL0ReferenceCountAt(long index) { return maxBPictureL0ReferenceCount(this.segment(), index); }
        /// Sets `maxBPictureL0ReferenceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxBPictureL0ReferenceCountAt(long index, int value) { maxBPictureL0ReferenceCount(this.segment(), index, value); return this; }

        /// {@return `maxL1ReferenceCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxL1ReferenceCountAt(long index) { return maxL1ReferenceCount(this.segment(), index); }
        /// Sets `maxL1ReferenceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxL1ReferenceCountAt(long index, int value) { maxL1ReferenceCount(this.segment(), index, value); return this; }

        /// {@return `maxTemporalLayerCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxTemporalLayerCountAt(long index) { return maxTemporalLayerCount(this.segment(), index); }
        /// Sets `maxTemporalLayerCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxTemporalLayerCountAt(long index, int value) { maxTemporalLayerCount(this.segment(), index, value); return this; }

        /// {@return `expectDyadicTemporalLayerPattern` at the given index}
        /// @param index the index of the struct buffer
        public int expectDyadicTemporalLayerPatternAt(long index) { return expectDyadicTemporalLayerPattern(this.segment(), index); }
        /// Sets `expectDyadicTemporalLayerPattern` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer expectDyadicTemporalLayerPatternAt(long index, int value) { expectDyadicTemporalLayerPattern(this.segment(), index, value); return this; }

        /// {@return `minQp` at the given index}
        /// @param index the index of the struct buffer
        public int minQpAt(long index) { return minQp(this.segment(), index); }
        /// Sets `minQp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minQpAt(long index, int value) { minQp(this.segment(), index, value); return this; }

        /// {@return `maxQp` at the given index}
        /// @param index the index of the struct buffer
        public int maxQpAt(long index) { return maxQp(this.segment(), index); }
        /// Sets `maxQp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxQpAt(long index, int value) { maxQp(this.segment(), index, value); return this; }

        /// {@return `prefersGopRemainingFrames` at the given index}
        /// @param index the index of the struct buffer
        public int prefersGopRemainingFramesAt(long index) { return prefersGopRemainingFrames(this.segment(), index); }
        /// Sets `prefersGopRemainingFrames` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer prefersGopRemainingFramesAt(long index, int value) { prefersGopRemainingFrames(this.segment(), index, value); return this; }

        /// {@return `requiresGopRemainingFrames` at the given index}
        /// @param index the index of the struct buffer
        public int requiresGopRemainingFramesAt(long index) { return requiresGopRemainingFrames(this.segment(), index); }
        /// Sets `requiresGopRemainingFrames` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer requiresGopRemainingFramesAt(long index, int value) { requiresGopRemainingFrames(this.segment(), index, value); return this; }

        /// {@return `stdSyntaxFlags` at the given index}
        /// @param index the index of the struct buffer
        public int stdSyntaxFlagsAt(long index) { return stdSyntaxFlags(this.segment(), index); }
        /// Sets `stdSyntaxFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stdSyntaxFlagsAt(long index, int value) { stdSyntaxFlags(this.segment(), index, value); return this; }

    }
}
