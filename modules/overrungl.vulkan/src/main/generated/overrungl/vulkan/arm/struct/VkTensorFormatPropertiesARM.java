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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkTensorFormatPropertiesARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 optimalTilingTensorFeatures;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 linearTilingTensorFeatures;
/// };
/// ```
public sealed class VkTensorFormatPropertiesARM extends GroupType {
    /// The struct layout of `VkTensorFormatPropertiesARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("optimalTilingTensorFeatures"),
        ValueLayout.JAVA_LONG.withName("linearTilingTensorFeatures")
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
    /// The byte offset of `optimalTilingTensorFeatures`.
    public static final long OFFSET_optimalTilingTensorFeatures = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingTensorFeatures"));
    /// The memory layout of `optimalTilingTensorFeatures`.
    public static final MemoryLayout LAYOUT_optimalTilingTensorFeatures = LAYOUT.select(PathElement.groupElement("optimalTilingTensorFeatures"));
    /// The [VarHandle] of `optimalTilingTensorFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_optimalTilingTensorFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingTensorFeatures"));
    /// The byte offset of `linearTilingTensorFeatures`.
    public static final long OFFSET_linearTilingTensorFeatures = LAYOUT.byteOffset(PathElement.groupElement("linearTilingTensorFeatures"));
    /// The memory layout of `linearTilingTensorFeatures`.
    public static final MemoryLayout LAYOUT_linearTilingTensorFeatures = LAYOUT.select(PathElement.groupElement("linearTilingTensorFeatures"));
    /// The [VarHandle] of `linearTilingTensorFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_linearTilingTensorFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingTensorFeatures"));

    /// Creates `VkTensorFormatPropertiesARM` with the given segment.
    /// @param segment the memory segment
    public VkTensorFormatPropertiesARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTensorFormatPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTensorFormatPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorFormatPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorFormatPropertiesARM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkTensorFormatPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTensorFormatPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTensorFormatPropertiesARM`
    public static VkTensorFormatPropertiesARM alloc(SegmentAllocator allocator) { return new VkTensorFormatPropertiesARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTensorFormatPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTensorFormatPropertiesARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkTensorFormatPropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param optimalTilingTensorFeatures `optimalTilingTensorFeatures`
    /// @param linearTilingTensorFeatures `linearTilingTensorFeatures`
    /// @return the allocated `VkTensorFormatPropertiesARM`
    public static VkTensorFormatPropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long optimalTilingTensorFeatures, long linearTilingTensorFeatures) {
        return alloc(allocator).sType(sType).pNext(pNext).optimalTilingTensorFeatures(optimalTilingTensorFeatures).linearTilingTensorFeatures(linearTilingTensorFeatures);
    }

    /// Allocates a `VkTensorFormatPropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param optimalTilingTensorFeatures `optimalTilingTensorFeatures`
    /// @return the allocated `VkTensorFormatPropertiesARM`
    public static VkTensorFormatPropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long optimalTilingTensorFeatures) {
        return alloc(allocator).sType(sType).pNext(pNext).optimalTilingTensorFeatures(optimalTilingTensorFeatures);
    }

    /// Allocates a `VkTensorFormatPropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkTensorFormatPropertiesARM`
    public static VkTensorFormatPropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkTensorFormatPropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkTensorFormatPropertiesARM`
    public static VkTensorFormatPropertiesARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTensorFormatPropertiesARM copyFrom(VkTensorFormatPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkTensorFormatPropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTensorFormatPropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `optimalTilingTensorFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long optimalTilingTensorFeatures(MemorySegment segment, long index) { return (long) VH_optimalTilingTensorFeatures.get(segment, 0L, index); }
    /// {@return `optimalTilingTensorFeatures`}
    public long optimalTilingTensorFeatures() { return optimalTilingTensorFeatures(this.segment(), 0L); }
    /// Sets `optimalTilingTensorFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalTilingTensorFeatures(MemorySegment segment, long index, long value) { VH_optimalTilingTensorFeatures.set(segment, 0L, index, value); }
    /// Sets `optimalTilingTensorFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorFormatPropertiesARM optimalTilingTensorFeatures(long value) { optimalTilingTensorFeatures(this.segment(), 0L, value); return this; }

    /// {@return `linearTilingTensorFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long linearTilingTensorFeatures(MemorySegment segment, long index) { return (long) VH_linearTilingTensorFeatures.get(segment, 0L, index); }
    /// {@return `linearTilingTensorFeatures`}
    public long linearTilingTensorFeatures() { return linearTilingTensorFeatures(this.segment(), 0L); }
    /// Sets `linearTilingTensorFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void linearTilingTensorFeatures(MemorySegment segment, long index, long value) { VH_linearTilingTensorFeatures.set(segment, 0L, index, value); }
    /// Sets `linearTilingTensorFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorFormatPropertiesARM linearTilingTensorFeatures(long value) { linearTilingTensorFeatures(this.segment(), 0L, value); return this; }

    /// A buffer of [VkTensorFormatPropertiesARM].
    public static final class Buffer extends VkTensorFormatPropertiesARM {
        private final long elementCount;

        /// Creates `VkTensorFormatPropertiesARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkTensorFormatPropertiesARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkTensorFormatPropertiesARM`
        public VkTensorFormatPropertiesARM asSlice(long index) { return new VkTensorFormatPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkTensorFormatPropertiesARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkTensorFormatPropertiesARM`
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

        /// {@return `optimalTilingTensorFeatures` at the given index}
        /// @param index the index of the struct buffer
        public long optimalTilingTensorFeaturesAt(long index) { return optimalTilingTensorFeatures(this.segment(), index); }
        /// Sets `optimalTilingTensorFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer optimalTilingTensorFeaturesAt(long index, long value) { optimalTilingTensorFeatures(this.segment(), index, value); return this; }

        /// {@return `linearTilingTensorFeatures` at the given index}
        /// @param index the index of the struct buffer
        public long linearTilingTensorFeaturesAt(long index) { return linearTilingTensorFeatures(this.segment(), index); }
        /// Sets `linearTilingTensorFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer linearTilingTensorFeaturesAt(long index, long value) { linearTilingTensorFeatures(this.segment(), index, value); return this; }

    }
}
