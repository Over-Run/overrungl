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
/// struct VkPipelineDepthStencilStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineDepthStencilStateCreateFlags flags;
///     (uint32_t) VkBool32 depthTestEnable;
///     (uint32_t) VkBool32 depthWriteEnable;
///     (int) VkCompareOp depthCompareOp;
///     (uint32_t) VkBool32 depthBoundsTestEnable;
///     (uint32_t) VkBool32 stencilTestEnable;
///     (struct VkStencilOpState) VkStencilOpState front;
///     (struct VkStencilOpState) VkStencilOpState back;
///     float minDepthBounds;
///     float maxDepthBounds;
/// };
/// ```
public sealed class VkPipelineDepthStencilStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineDepthStencilStateCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthTestEnable"),
        ValueLayout.JAVA_INT.withName("depthWriteEnable"),
        ValueLayout.JAVA_INT.withName("depthCompareOp"),
        ValueLayout.JAVA_INT.withName("depthBoundsTestEnable"),
        ValueLayout.JAVA_INT.withName("stencilTestEnable"),
        overrungl.vulkan.struct.VkStencilOpState.LAYOUT.withName("front"),
        overrungl.vulkan.struct.VkStencilOpState.LAYOUT.withName("back"),
        ValueLayout.JAVA_FLOAT.withName("minDepthBounds"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthBounds")
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
    /// The byte offset of `depthTestEnable`.
    public static final long OFFSET_depthTestEnable = LAYOUT.byteOffset(PathElement.groupElement("depthTestEnable"));
    /// The memory layout of `depthTestEnable`.
    public static final MemoryLayout LAYOUT_depthTestEnable = LAYOUT.select(PathElement.groupElement("depthTestEnable"));
    /// The [VarHandle] of `depthTestEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthTestEnable"));
    /// The byte offset of `depthWriteEnable`.
    public static final long OFFSET_depthWriteEnable = LAYOUT.byteOffset(PathElement.groupElement("depthWriteEnable"));
    /// The memory layout of `depthWriteEnable`.
    public static final MemoryLayout LAYOUT_depthWriteEnable = LAYOUT.select(PathElement.groupElement("depthWriteEnable"));
    /// The [VarHandle] of `depthWriteEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthWriteEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthWriteEnable"));
    /// The byte offset of `depthCompareOp`.
    public static final long OFFSET_depthCompareOp = LAYOUT.byteOffset(PathElement.groupElement("depthCompareOp"));
    /// The memory layout of `depthCompareOp`.
    public static final MemoryLayout LAYOUT_depthCompareOp = LAYOUT.select(PathElement.groupElement("depthCompareOp"));
    /// The [VarHandle] of `depthCompareOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthCompareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthCompareOp"));
    /// The byte offset of `depthBoundsTestEnable`.
    public static final long OFFSET_depthBoundsTestEnable = LAYOUT.byteOffset(PathElement.groupElement("depthBoundsTestEnable"));
    /// The memory layout of `depthBoundsTestEnable`.
    public static final MemoryLayout LAYOUT_depthBoundsTestEnable = LAYOUT.select(PathElement.groupElement("depthBoundsTestEnable"));
    /// The [VarHandle] of `depthBoundsTestEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBoundsTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBoundsTestEnable"));
    /// The byte offset of `stencilTestEnable`.
    public static final long OFFSET_stencilTestEnable = LAYOUT.byteOffset(PathElement.groupElement("stencilTestEnable"));
    /// The memory layout of `stencilTestEnable`.
    public static final MemoryLayout LAYOUT_stencilTestEnable = LAYOUT.select(PathElement.groupElement("stencilTestEnable"));
    /// The [VarHandle] of `stencilTestEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilTestEnable"));
    /// The byte offset of `front`.
    public static final long OFFSET_front = LAYOUT.byteOffset(PathElement.groupElement("front"));
    /// The memory layout of `front`.
    public static final MemoryLayout LAYOUT_front = LAYOUT.select(PathElement.groupElement("front"));
    /// The byte offset of `back`.
    public static final long OFFSET_back = LAYOUT.byteOffset(PathElement.groupElement("back"));
    /// The memory layout of `back`.
    public static final MemoryLayout LAYOUT_back = LAYOUT.select(PathElement.groupElement("back"));
    /// The byte offset of `minDepthBounds`.
    public static final long OFFSET_minDepthBounds = LAYOUT.byteOffset(PathElement.groupElement("minDepthBounds"));
    /// The memory layout of `minDepthBounds`.
    public static final MemoryLayout LAYOUT_minDepthBounds = LAYOUT.select(PathElement.groupElement("minDepthBounds"));
    /// The [VarHandle] of `minDepthBounds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minDepthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepthBounds"));
    /// The byte offset of `maxDepthBounds`.
    public static final long OFFSET_maxDepthBounds = LAYOUT.byteOffset(PathElement.groupElement("maxDepthBounds"));
    /// The memory layout of `maxDepthBounds`.
    public static final MemoryLayout LAYOUT_maxDepthBounds = LAYOUT.select(PathElement.groupElement("maxDepthBounds"));
    /// The [VarHandle] of `maxDepthBounds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDepthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepthBounds"));

    /// Creates `VkPipelineDepthStencilStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineDepthStencilStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineDepthStencilStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineDepthStencilStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDepthStencilStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDepthStencilStateCreateInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPipelineDepthStencilStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineDepthStencilStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @param depthWriteEnable `depthWriteEnable`
    /// @param depthCompareOp `depthCompareOp`
    /// @param depthBoundsTestEnable `depthBoundsTestEnable`
    /// @param stencilTestEnable `stencilTestEnable`
    /// @param front `front`
    /// @param back `back`
    /// @param minDepthBounds `minDepthBounds`
    /// @param maxDepthBounds `maxDepthBounds`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable, int depthWriteEnable, int depthCompareOp, int depthBoundsTestEnable, int stencilTestEnable, MemorySegment front, MemorySegment back, float minDepthBounds, float maxDepthBounds) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable).depthWriteEnable(depthWriteEnable).depthCompareOp(depthCompareOp).depthBoundsTestEnable(depthBoundsTestEnable).stencilTestEnable(stencilTestEnable).front(front).back(back).minDepthBounds(minDepthBounds).maxDepthBounds(maxDepthBounds);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @param depthWriteEnable `depthWriteEnable`
    /// @param depthCompareOp `depthCompareOp`
    /// @param depthBoundsTestEnable `depthBoundsTestEnable`
    /// @param stencilTestEnable `stencilTestEnable`
    /// @param front `front`
    /// @param back `back`
    /// @param minDepthBounds `minDepthBounds`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable, int depthWriteEnable, int depthCompareOp, int depthBoundsTestEnable, int stencilTestEnable, MemorySegment front, MemorySegment back, float minDepthBounds) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable).depthWriteEnable(depthWriteEnable).depthCompareOp(depthCompareOp).depthBoundsTestEnable(depthBoundsTestEnable).stencilTestEnable(stencilTestEnable).front(front).back(back).minDepthBounds(minDepthBounds);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @param depthWriteEnable `depthWriteEnable`
    /// @param depthCompareOp `depthCompareOp`
    /// @param depthBoundsTestEnable `depthBoundsTestEnable`
    /// @param stencilTestEnable `stencilTestEnable`
    /// @param front `front`
    /// @param back `back`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable, int depthWriteEnable, int depthCompareOp, int depthBoundsTestEnable, int stencilTestEnable, MemorySegment front, MemorySegment back) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable).depthWriteEnable(depthWriteEnable).depthCompareOp(depthCompareOp).depthBoundsTestEnable(depthBoundsTestEnable).stencilTestEnable(stencilTestEnable).front(front).back(back);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @param depthWriteEnable `depthWriteEnable`
    /// @param depthCompareOp `depthCompareOp`
    /// @param depthBoundsTestEnable `depthBoundsTestEnable`
    /// @param stencilTestEnable `stencilTestEnable`
    /// @param front `front`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable, int depthWriteEnable, int depthCompareOp, int depthBoundsTestEnable, int stencilTestEnable, MemorySegment front) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable).depthWriteEnable(depthWriteEnable).depthCompareOp(depthCompareOp).depthBoundsTestEnable(depthBoundsTestEnable).stencilTestEnable(stencilTestEnable).front(front);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @param depthWriteEnable `depthWriteEnable`
    /// @param depthCompareOp `depthCompareOp`
    /// @param depthBoundsTestEnable `depthBoundsTestEnable`
    /// @param stencilTestEnable `stencilTestEnable`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable, int depthWriteEnable, int depthCompareOp, int depthBoundsTestEnable, int stencilTestEnable) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable).depthWriteEnable(depthWriteEnable).depthCompareOp(depthCompareOp).depthBoundsTestEnable(depthBoundsTestEnable).stencilTestEnable(stencilTestEnable);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @param depthWriteEnable `depthWriteEnable`
    /// @param depthCompareOp `depthCompareOp`
    /// @param depthBoundsTestEnable `depthBoundsTestEnable`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable, int depthWriteEnable, int depthCompareOp, int depthBoundsTestEnable) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable).depthWriteEnable(depthWriteEnable).depthCompareOp(depthCompareOp).depthBoundsTestEnable(depthBoundsTestEnable);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @param depthWriteEnable `depthWriteEnable`
    /// @param depthCompareOp `depthCompareOp`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable, int depthWriteEnable, int depthCompareOp) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable).depthWriteEnable(depthWriteEnable).depthCompareOp(depthCompareOp);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @param depthWriteEnable `depthWriteEnable`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable, int depthWriteEnable) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable).depthWriteEnable(depthWriteEnable);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param depthTestEnable `depthTestEnable`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int depthTestEnable) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).depthTestEnable(depthTestEnable);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo copyFrom(VkPipelineDepthStencilStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineDepthStencilStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineDepthStencilStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineDepthStencilStateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `depthTestEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthTestEnable(MemorySegment segment, long index) { return (int) VH_depthTestEnable.get(segment, 0L, index); }
    /// {@return `depthTestEnable`}
    public int depthTestEnable() { return depthTestEnable(this.segment(), 0L); }
    /// Sets `depthTestEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthTestEnable(MemorySegment segment, long index, int value) { VH_depthTestEnable.set(segment, 0L, index, value); }
    /// Sets `depthTestEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthTestEnable(int value) { depthTestEnable(this.segment(), 0L, value); return this; }

    /// {@return `depthWriteEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthWriteEnable(MemorySegment segment, long index) { return (int) VH_depthWriteEnable.get(segment, 0L, index); }
    /// {@return `depthWriteEnable`}
    public int depthWriteEnable() { return depthWriteEnable(this.segment(), 0L); }
    /// Sets `depthWriteEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthWriteEnable(MemorySegment segment, long index, int value) { VH_depthWriteEnable.set(segment, 0L, index, value); }
    /// Sets `depthWriteEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthWriteEnable(int value) { depthWriteEnable(this.segment(), 0L, value); return this; }

    /// {@return `depthCompareOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthCompareOp(MemorySegment segment, long index) { return (int) VH_depthCompareOp.get(segment, 0L, index); }
    /// {@return `depthCompareOp`}
    public int depthCompareOp() { return depthCompareOp(this.segment(), 0L); }
    /// Sets `depthCompareOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthCompareOp(MemorySegment segment, long index, int value) { VH_depthCompareOp.set(segment, 0L, index, value); }
    /// Sets `depthCompareOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthCompareOp(int value) { depthCompareOp(this.segment(), 0L, value); return this; }

    /// {@return `depthBoundsTestEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthBoundsTestEnable(MemorySegment segment, long index) { return (int) VH_depthBoundsTestEnable.get(segment, 0L, index); }
    /// {@return `depthBoundsTestEnable`}
    public int depthBoundsTestEnable() { return depthBoundsTestEnable(this.segment(), 0L); }
    /// Sets `depthBoundsTestEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBoundsTestEnable(MemorySegment segment, long index, int value) { VH_depthBoundsTestEnable.set(segment, 0L, index, value); }
    /// Sets `depthBoundsTestEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(int value) { depthBoundsTestEnable(this.segment(), 0L, value); return this; }

    /// {@return `stencilTestEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilTestEnable(MemorySegment segment, long index) { return (int) VH_stencilTestEnable.get(segment, 0L, index); }
    /// {@return `stencilTestEnable`}
    public int stencilTestEnable() { return stencilTestEnable(this.segment(), 0L); }
    /// Sets `stencilTestEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilTestEnable(MemorySegment segment, long index, int value) { VH_stencilTestEnable.set(segment, 0L, index, value); }
    /// Sets `stencilTestEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo stencilTestEnable(int value) { stencilTestEnable(this.segment(), 0L, value); return this; }

    /// {@return `front` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment front(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_front, index), LAYOUT_front); }
    /// {@return `front`}
    public MemorySegment front() { return front(this.segment(), 0L); }
    /// Sets `front` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void front(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_front, index), LAYOUT_front.byteSize()); }
    /// Sets `front` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo front(MemorySegment value) { front(this.segment(), 0L, value); return this; }

    /// {@return `back` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment back(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_back, index), LAYOUT_back); }
    /// {@return `back`}
    public MemorySegment back() { return back(this.segment(), 0L); }
    /// Sets `back` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void back(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_back, index), LAYOUT_back.byteSize()); }
    /// Sets `back` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo back(MemorySegment value) { back(this.segment(), 0L, value); return this; }

    /// {@return `minDepthBounds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minDepthBounds(MemorySegment segment, long index) { return (float) VH_minDepthBounds.get(segment, 0L, index); }
    /// {@return `minDepthBounds`}
    public float minDepthBounds() { return minDepthBounds(this.segment(), 0L); }
    /// Sets `minDepthBounds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minDepthBounds(MemorySegment segment, long index, float value) { VH_minDepthBounds.set(segment, 0L, index, value); }
    /// Sets `minDepthBounds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo minDepthBounds(float value) { minDepthBounds(this.segment(), 0L, value); return this; }

    /// {@return `maxDepthBounds` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxDepthBounds(MemorySegment segment, long index) { return (float) VH_maxDepthBounds.get(segment, 0L, index); }
    /// {@return `maxDepthBounds`}
    public float maxDepthBounds() { return maxDepthBounds(this.segment(), 0L); }
    /// Sets `maxDepthBounds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDepthBounds(MemorySegment segment, long index, float value) { VH_maxDepthBounds.set(segment, 0L, index, value); }
    /// Sets `maxDepthBounds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo maxDepthBounds(float value) { maxDepthBounds(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineDepthStencilStateCreateInfo].
    public static final class Buffer extends VkPipelineDepthStencilStateCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineDepthStencilStateCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineDepthStencilStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineDepthStencilStateCreateInfo`
        public VkPipelineDepthStencilStateCreateInfo asSlice(long index) { return new VkPipelineDepthStencilStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineDepthStencilStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineDepthStencilStateCreateInfo`
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

        /// {@return `depthTestEnable` at the given index}
        /// @param index the index of the struct buffer
        public int depthTestEnableAt(long index) { return depthTestEnable(this.segment(), index); }
        /// Sets `depthTestEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthTestEnableAt(long index, int value) { depthTestEnable(this.segment(), index, value); return this; }

        /// {@return `depthWriteEnable` at the given index}
        /// @param index the index of the struct buffer
        public int depthWriteEnableAt(long index) { return depthWriteEnable(this.segment(), index); }
        /// Sets `depthWriteEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthWriteEnableAt(long index, int value) { depthWriteEnable(this.segment(), index, value); return this; }

        /// {@return `depthCompareOp` at the given index}
        /// @param index the index of the struct buffer
        public int depthCompareOpAt(long index) { return depthCompareOp(this.segment(), index); }
        /// Sets `depthCompareOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthCompareOpAt(long index, int value) { depthCompareOp(this.segment(), index, value); return this; }

        /// {@return `depthBoundsTestEnable` at the given index}
        /// @param index the index of the struct buffer
        public int depthBoundsTestEnableAt(long index) { return depthBoundsTestEnable(this.segment(), index); }
        /// Sets `depthBoundsTestEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBoundsTestEnableAt(long index, int value) { depthBoundsTestEnable(this.segment(), index, value); return this; }

        /// {@return `stencilTestEnable` at the given index}
        /// @param index the index of the struct buffer
        public int stencilTestEnableAt(long index) { return stencilTestEnable(this.segment(), index); }
        /// Sets `stencilTestEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stencilTestEnableAt(long index, int value) { stencilTestEnable(this.segment(), index, value); return this; }

        /// {@return `front` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment frontAt(long index) { return front(this.segment(), index); }
        /// Sets `front` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frontAt(long index, MemorySegment value) { front(this.segment(), index, value); return this; }

        /// {@return `back` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment backAt(long index) { return back(this.segment(), index); }
        /// Sets `back` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer backAt(long index, MemorySegment value) { back(this.segment(), index, value); return this; }

        /// {@return `minDepthBounds` at the given index}
        /// @param index the index of the struct buffer
        public float minDepthBoundsAt(long index) { return minDepthBounds(this.segment(), index); }
        /// Sets `minDepthBounds` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minDepthBoundsAt(long index, float value) { minDepthBounds(this.segment(), index, value); return this; }

        /// {@return `maxDepthBounds` at the given index}
        /// @param index the index of the struct buffer
        public float maxDepthBoundsAt(long index) { return maxDepthBounds(this.segment(), index); }
        /// Sets `maxDepthBounds` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDepthBoundsAt(long index, float value) { maxDepthBounds(this.segment(), index, value); return this; }

    }
}
