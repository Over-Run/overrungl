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
/// struct VkDepthBiasInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     float depthBiasConstantFactor;
///     float depthBiasClamp;
///     float depthBiasSlopeFactor;
/// };
/// ```
public sealed class VkDepthBiasInfoEXT extends GroupType {
    /// The struct layout of `VkDepthBiasInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasConstantFactor"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasClamp"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeFactor")
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
    /// The byte offset of `depthBiasConstantFactor`.
    public static final long OFFSET_depthBiasConstantFactor = LAYOUT.byteOffset(PathElement.groupElement("depthBiasConstantFactor"));
    /// The memory layout of `depthBiasConstantFactor`.
    public static final MemoryLayout LAYOUT_depthBiasConstantFactor = LAYOUT.select(PathElement.groupElement("depthBiasConstantFactor"));
    /// The [VarHandle] of `depthBiasConstantFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasConstantFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasConstantFactor"));
    /// The byte offset of `depthBiasClamp`.
    public static final long OFFSET_depthBiasClamp = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
    /// The memory layout of `depthBiasClamp`.
    public static final MemoryLayout LAYOUT_depthBiasClamp = LAYOUT.select(PathElement.groupElement("depthBiasClamp"));
    /// The [VarHandle] of `depthBiasClamp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    /// The byte offset of `depthBiasSlopeFactor`.
    public static final long OFFSET_depthBiasSlopeFactor = LAYOUT.byteOffset(PathElement.groupElement("depthBiasSlopeFactor"));
    /// The memory layout of `depthBiasSlopeFactor`.
    public static final MemoryLayout LAYOUT_depthBiasSlopeFactor = LAYOUT.select(PathElement.groupElement("depthBiasSlopeFactor"));
    /// The [VarHandle] of `depthBiasSlopeFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasSlopeFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasSlopeFactor"));

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDepthBiasInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthBiasInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasInfoEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static VkDepthBiasInfoEXT alloc(SegmentAllocator allocator) { return new VkDepthBiasInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param depthBiasConstantFactor `depthBiasConstantFactor`
    /// @param depthBiasClamp `depthBiasClamp`
    /// @param depthBiasSlopeFactor `depthBiasSlopeFactor`
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static VkDepthBiasInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor) {
        return alloc(allocator).sType(sType).pNext(pNext).depthBiasConstantFactor(depthBiasConstantFactor).depthBiasClamp(depthBiasClamp).depthBiasSlopeFactor(depthBiasSlopeFactor);
    }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param depthBiasConstantFactor `depthBiasConstantFactor`
    /// @param depthBiasClamp `depthBiasClamp`
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static VkDepthBiasInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, float depthBiasConstantFactor, float depthBiasClamp) {
        return alloc(allocator).sType(sType).pNext(pNext).depthBiasConstantFactor(depthBiasConstantFactor).depthBiasClamp(depthBiasClamp);
    }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param depthBiasConstantFactor `depthBiasConstantFactor`
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static VkDepthBiasInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, float depthBiasConstantFactor) {
        return alloc(allocator).sType(sType).pNext(pNext).depthBiasConstantFactor(depthBiasConstantFactor);
    }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static VkDepthBiasInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static VkDepthBiasInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDepthBiasInfoEXT copyFrom(VkDepthBiasInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDepthBiasInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDepthBiasInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasConstantFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float depthBiasConstantFactor(MemorySegment segment, long index) { return (float) VH_depthBiasConstantFactor.get(segment, 0L, index); }
    /// {@return `depthBiasConstantFactor`}
    public float depthBiasConstantFactor() { return depthBiasConstantFactor(this.segment(), 0L); }
    /// Sets `depthBiasConstantFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasConstantFactor(MemorySegment segment, long index, float value) { VH_depthBiasConstantFactor.set(segment, 0L, index, value); }
    /// Sets `depthBiasConstantFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasInfoEXT depthBiasConstantFactor(float value) { depthBiasConstantFactor(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float depthBiasClamp(MemorySegment segment, long index) { return (float) VH_depthBiasClamp.get(segment, 0L, index); }
    /// {@return `depthBiasClamp`}
    public float depthBiasClamp() { return depthBiasClamp(this.segment(), 0L); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasClamp(MemorySegment segment, long index, float value) { VH_depthBiasClamp.set(segment, 0L, index, value); }
    /// Sets `depthBiasClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasInfoEXT depthBiasClamp(float value) { depthBiasClamp(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasSlopeFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float depthBiasSlopeFactor(MemorySegment segment, long index) { return (float) VH_depthBiasSlopeFactor.get(segment, 0L, index); }
    /// {@return `depthBiasSlopeFactor`}
    public float depthBiasSlopeFactor() { return depthBiasSlopeFactor(this.segment(), 0L); }
    /// Sets `depthBiasSlopeFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasSlopeFactor(MemorySegment segment, long index, float value) { VH_depthBiasSlopeFactor.set(segment, 0L, index, value); }
    /// Sets `depthBiasSlopeFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasInfoEXT depthBiasSlopeFactor(float value) { depthBiasSlopeFactor(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDepthBiasInfoEXT].
    public static final class Buffer extends VkDepthBiasInfoEXT {
        private final long elementCount;

        /// Creates `VkDepthBiasInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDepthBiasInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDepthBiasInfoEXT`
        public VkDepthBiasInfoEXT asSlice(long index) { return new VkDepthBiasInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDepthBiasInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDepthBiasInfoEXT`
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

        /// {@return `depthBiasConstantFactor` at the given index}
        /// @param index the index of the struct buffer
        public float depthBiasConstantFactorAt(long index) { return depthBiasConstantFactor(this.segment(), index); }
        /// Sets `depthBiasConstantFactor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasConstantFactorAt(long index, float value) { depthBiasConstantFactor(this.segment(), index, value); return this; }

        /// {@return `depthBiasClamp` at the given index}
        /// @param index the index of the struct buffer
        public float depthBiasClampAt(long index) { return depthBiasClamp(this.segment(), index); }
        /// Sets `depthBiasClamp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasClampAt(long index, float value) { depthBiasClamp(this.segment(), index, value); return this; }

        /// {@return `depthBiasSlopeFactor` at the given index}
        /// @param index the index of the struct buffer
        public float depthBiasSlopeFactorAt(long index) { return depthBiasSlopeFactor(this.segment(), index); }
        /// Sets `depthBiasSlopeFactor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasSlopeFactorAt(long index, float value) { depthBiasSlopeFactor(this.segment(), index, value); return this; }

    }
}
