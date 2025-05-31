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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkCudaLaunchInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkCudaFunctionNV function;
///     uint32_t gridDimX;
///     uint32_t gridDimY;
///     uint32_t gridDimZ;
///     uint32_t blockDimX;
///     uint32_t blockDimY;
///     uint32_t blockDimZ;
///     uint32_t sharedMemBytes;
///     size_t paramCount;
///     const void* const * pParams;
///     size_t extraCount;
///     const void* const * pExtras;
/// };
/// ```
public sealed class VkCudaLaunchInfoNV extends GroupType {
    /// The struct layout of `VkCudaLaunchInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("function"),
        ValueLayout.JAVA_INT.withName("gridDimX"),
        ValueLayout.JAVA_INT.withName("gridDimY"),
        ValueLayout.JAVA_INT.withName("gridDimZ"),
        ValueLayout.JAVA_INT.withName("blockDimX"),
        ValueLayout.JAVA_INT.withName("blockDimY"),
        ValueLayout.JAVA_INT.withName("blockDimZ"),
        ValueLayout.JAVA_INT.withName("sharedMemBytes"),
        CanonicalTypes.SIZE_T.withName("paramCount"),
        ValueLayout.ADDRESS.withName("pParams"),
        CanonicalTypes.SIZE_T.withName("extraCount"),
        ValueLayout.ADDRESS.withName("pExtras")
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
    /// The byte offset of `function`.
    public static final long OFFSET_function = LAYOUT.byteOffset(PathElement.groupElement("function"));
    /// The memory layout of `function`.
    public static final MemoryLayout LAYOUT_function = LAYOUT.select(PathElement.groupElement("function"));
    /// The [VarHandle] of `function` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_function = LAYOUT.arrayElementVarHandle(PathElement.groupElement("function"));
    /// The byte offset of `gridDimX`.
    public static final long OFFSET_gridDimX = LAYOUT.byteOffset(PathElement.groupElement("gridDimX"));
    /// The memory layout of `gridDimX`.
    public static final MemoryLayout LAYOUT_gridDimX = LAYOUT.select(PathElement.groupElement("gridDimX"));
    /// The [VarHandle] of `gridDimX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gridDimX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimX"));
    /// The byte offset of `gridDimY`.
    public static final long OFFSET_gridDimY = LAYOUT.byteOffset(PathElement.groupElement("gridDimY"));
    /// The memory layout of `gridDimY`.
    public static final MemoryLayout LAYOUT_gridDimY = LAYOUT.select(PathElement.groupElement("gridDimY"));
    /// The [VarHandle] of `gridDimY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gridDimY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimY"));
    /// The byte offset of `gridDimZ`.
    public static final long OFFSET_gridDimZ = LAYOUT.byteOffset(PathElement.groupElement("gridDimZ"));
    /// The memory layout of `gridDimZ`.
    public static final MemoryLayout LAYOUT_gridDimZ = LAYOUT.select(PathElement.groupElement("gridDimZ"));
    /// The [VarHandle] of `gridDimZ` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gridDimZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimZ"));
    /// The byte offset of `blockDimX`.
    public static final long OFFSET_blockDimX = LAYOUT.byteOffset(PathElement.groupElement("blockDimX"));
    /// The memory layout of `blockDimX`.
    public static final MemoryLayout LAYOUT_blockDimX = LAYOUT.select(PathElement.groupElement("blockDimX"));
    /// The [VarHandle] of `blockDimX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blockDimX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimX"));
    /// The byte offset of `blockDimY`.
    public static final long OFFSET_blockDimY = LAYOUT.byteOffset(PathElement.groupElement("blockDimY"));
    /// The memory layout of `blockDimY`.
    public static final MemoryLayout LAYOUT_blockDimY = LAYOUT.select(PathElement.groupElement("blockDimY"));
    /// The [VarHandle] of `blockDimY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blockDimY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimY"));
    /// The byte offset of `blockDimZ`.
    public static final long OFFSET_blockDimZ = LAYOUT.byteOffset(PathElement.groupElement("blockDimZ"));
    /// The memory layout of `blockDimZ`.
    public static final MemoryLayout LAYOUT_blockDimZ = LAYOUT.select(PathElement.groupElement("blockDimZ"));
    /// The [VarHandle] of `blockDimZ` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blockDimZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimZ"));
    /// The byte offset of `sharedMemBytes`.
    public static final long OFFSET_sharedMemBytes = LAYOUT.byteOffset(PathElement.groupElement("sharedMemBytes"));
    /// The memory layout of `sharedMemBytes`.
    public static final MemoryLayout LAYOUT_sharedMemBytes = LAYOUT.select(PathElement.groupElement("sharedMemBytes"));
    /// The [VarHandle] of `sharedMemBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sharedMemBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharedMemBytes"));
    /// The byte offset of `paramCount`.
    public static final long OFFSET_paramCount = LAYOUT.byteOffset(PathElement.groupElement("paramCount"));
    /// The memory layout of `paramCount`.
    public static final MemoryLayout LAYOUT_paramCount = LAYOUT.select(PathElement.groupElement("paramCount"));
    /// The [VarHandle] of `paramCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_paramCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("paramCount"));
    /// The byte offset of `pParams`.
    public static final long OFFSET_pParams = LAYOUT.byteOffset(PathElement.groupElement("pParams"));
    /// The memory layout of `pParams`.
    public static final MemoryLayout LAYOUT_pParams = LAYOUT.select(PathElement.groupElement("pParams"));
    /// The [VarHandle] of `pParams` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pParams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pParams"));
    /// The byte offset of `extraCount`.
    public static final long OFFSET_extraCount = LAYOUT.byteOffset(PathElement.groupElement("extraCount"));
    /// The memory layout of `extraCount`.
    public static final MemoryLayout LAYOUT_extraCount = LAYOUT.select(PathElement.groupElement("extraCount"));
    /// The [VarHandle] of `extraCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extraCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraCount"));
    /// The byte offset of `pExtras`.
    public static final long OFFSET_pExtras = LAYOUT.byteOffset(PathElement.groupElement("pExtras"));
    /// The memory layout of `pExtras`.
    public static final MemoryLayout LAYOUT_pExtras = LAYOUT.select(PathElement.groupElement("pExtras"));
    /// The [VarHandle] of `pExtras` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pExtras = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtras"));

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkCudaLaunchInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCudaLaunchInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCudaLaunchInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCudaLaunchInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCudaLaunchInfoNV`
    public static VkCudaLaunchInfoNV alloc(SegmentAllocator allocator) { return new VkCudaLaunchInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCudaLaunchInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCudaLaunchInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCudaLaunchInfoNV copyFrom(VkCudaLaunchInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkCudaLaunchInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCudaLaunchInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `function` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long function(MemorySegment segment, long index) { return (long) VH_function.get(segment, 0L, index); }
    /// {@return `function`}
    public long function() { return function(this.segment(), 0L); }
    /// Sets `function` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void function(MemorySegment segment, long index, long value) { VH_function.set(segment, 0L, index, value); }
    /// Sets `function` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV function(long value) { function(this.segment(), 0L, value); return this; }

    /// {@return `gridDimX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gridDimX(MemorySegment segment, long index) { return (int) VH_gridDimX.get(segment, 0L, index); }
    /// {@return `gridDimX`}
    public int gridDimX() { return gridDimX(this.segment(), 0L); }
    /// Sets `gridDimX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gridDimX(MemorySegment segment, long index, int value) { VH_gridDimX.set(segment, 0L, index, value); }
    /// Sets `gridDimX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV gridDimX(int value) { gridDimX(this.segment(), 0L, value); return this; }

    /// {@return `gridDimY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gridDimY(MemorySegment segment, long index) { return (int) VH_gridDimY.get(segment, 0L, index); }
    /// {@return `gridDimY`}
    public int gridDimY() { return gridDimY(this.segment(), 0L); }
    /// Sets `gridDimY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gridDimY(MemorySegment segment, long index, int value) { VH_gridDimY.set(segment, 0L, index, value); }
    /// Sets `gridDimY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV gridDimY(int value) { gridDimY(this.segment(), 0L, value); return this; }

    /// {@return `gridDimZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gridDimZ(MemorySegment segment, long index) { return (int) VH_gridDimZ.get(segment, 0L, index); }
    /// {@return `gridDimZ`}
    public int gridDimZ() { return gridDimZ(this.segment(), 0L); }
    /// Sets `gridDimZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gridDimZ(MemorySegment segment, long index, int value) { VH_gridDimZ.set(segment, 0L, index, value); }
    /// Sets `gridDimZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV gridDimZ(int value) { gridDimZ(this.segment(), 0L, value); return this; }

    /// {@return `blockDimX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blockDimX(MemorySegment segment, long index) { return (int) VH_blockDimX.get(segment, 0L, index); }
    /// {@return `blockDimX`}
    public int blockDimX() { return blockDimX(this.segment(), 0L); }
    /// Sets `blockDimX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockDimX(MemorySegment segment, long index, int value) { VH_blockDimX.set(segment, 0L, index, value); }
    /// Sets `blockDimX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV blockDimX(int value) { blockDimX(this.segment(), 0L, value); return this; }

    /// {@return `blockDimY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blockDimY(MemorySegment segment, long index) { return (int) VH_blockDimY.get(segment, 0L, index); }
    /// {@return `blockDimY`}
    public int blockDimY() { return blockDimY(this.segment(), 0L); }
    /// Sets `blockDimY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockDimY(MemorySegment segment, long index, int value) { VH_blockDimY.set(segment, 0L, index, value); }
    /// Sets `blockDimY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV blockDimY(int value) { blockDimY(this.segment(), 0L, value); return this; }

    /// {@return `blockDimZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blockDimZ(MemorySegment segment, long index) { return (int) VH_blockDimZ.get(segment, 0L, index); }
    /// {@return `blockDimZ`}
    public int blockDimZ() { return blockDimZ(this.segment(), 0L); }
    /// Sets `blockDimZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockDimZ(MemorySegment segment, long index, int value) { VH_blockDimZ.set(segment, 0L, index, value); }
    /// Sets `blockDimZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV blockDimZ(int value) { blockDimZ(this.segment(), 0L, value); return this; }

    /// {@return `sharedMemBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sharedMemBytes(MemorySegment segment, long index) { return (int) VH_sharedMemBytes.get(segment, 0L, index); }
    /// {@return `sharedMemBytes`}
    public int sharedMemBytes() { return sharedMemBytes(this.segment(), 0L); }
    /// Sets `sharedMemBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sharedMemBytes(MemorySegment segment, long index, int value) { VH_sharedMemBytes.set(segment, 0L, index, value); }
    /// Sets `sharedMemBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV sharedMemBytes(int value) { sharedMemBytes(this.segment(), 0L, value); return this; }

    /// {@return `paramCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long paramCount(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_paramCount.get(segment, 0L, index)); }
    /// {@return `paramCount`}
    public long paramCount() { return paramCount(this.segment(), 0L); }
    /// Sets `paramCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void paramCount(MemorySegment segment, long index, long value) { VH_paramCount.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `paramCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV paramCount(long value) { paramCount(this.segment(), 0L, value); return this; }

    /// {@return `pParams` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pParams(MemorySegment segment, long index) { return (MemorySegment) VH_pParams.get(segment, 0L, index); }
    /// {@return `pParams`}
    public MemorySegment pParams() { return pParams(this.segment(), 0L); }
    /// Sets `pParams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pParams(MemorySegment segment, long index, MemorySegment value) { VH_pParams.set(segment, 0L, index, value); }
    /// Sets `pParams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV pParams(MemorySegment value) { pParams(this.segment(), 0L, value); return this; }

    /// {@return `extraCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long extraCount(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_extraCount.get(segment, 0L, index)); }
    /// {@return `extraCount`}
    public long extraCount() { return extraCount(this.segment(), 0L); }
    /// Sets `extraCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extraCount(MemorySegment segment, long index, long value) { VH_extraCount.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `extraCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV extraCount(long value) { extraCount(this.segment(), 0L, value); return this; }

    /// {@return `pExtras` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pExtras(MemorySegment segment, long index) { return (MemorySegment) VH_pExtras.get(segment, 0L, index); }
    /// {@return `pExtras`}
    public MemorySegment pExtras() { return pExtras(this.segment(), 0L); }
    /// Sets `pExtras` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pExtras(MemorySegment segment, long index, MemorySegment value) { VH_pExtras.set(segment, 0L, index, value); }
    /// Sets `pExtras` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV pExtras(MemorySegment value) { pExtras(this.segment(), 0L, value); return this; }

    /// A buffer of [VkCudaLaunchInfoNV].
    public static final class Buffer extends VkCudaLaunchInfoNV {
        private final long elementCount;

        /// Creates `VkCudaLaunchInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCudaLaunchInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCudaLaunchInfoNV`
        public VkCudaLaunchInfoNV asSlice(long index) { return new VkCudaLaunchInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCudaLaunchInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCudaLaunchInfoNV`
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

        /// {@return `function` at the given index}
        /// @param index the index of the struct buffer
        public long functionAt(long index) { return function(this.segment(), index); }
        /// Sets `function` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer functionAt(long index, long value) { function(this.segment(), index, value); return this; }

        /// {@return `gridDimX` at the given index}
        /// @param index the index of the struct buffer
        public int gridDimXAt(long index) { return gridDimX(this.segment(), index); }
        /// Sets `gridDimX` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gridDimXAt(long index, int value) { gridDimX(this.segment(), index, value); return this; }

        /// {@return `gridDimY` at the given index}
        /// @param index the index of the struct buffer
        public int gridDimYAt(long index) { return gridDimY(this.segment(), index); }
        /// Sets `gridDimY` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gridDimYAt(long index, int value) { gridDimY(this.segment(), index, value); return this; }

        /// {@return `gridDimZ` at the given index}
        /// @param index the index of the struct buffer
        public int gridDimZAt(long index) { return gridDimZ(this.segment(), index); }
        /// Sets `gridDimZ` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer gridDimZAt(long index, int value) { gridDimZ(this.segment(), index, value); return this; }

        /// {@return `blockDimX` at the given index}
        /// @param index the index of the struct buffer
        public int blockDimXAt(long index) { return blockDimX(this.segment(), index); }
        /// Sets `blockDimX` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer blockDimXAt(long index, int value) { blockDimX(this.segment(), index, value); return this; }

        /// {@return `blockDimY` at the given index}
        /// @param index the index of the struct buffer
        public int blockDimYAt(long index) { return blockDimY(this.segment(), index); }
        /// Sets `blockDimY` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer blockDimYAt(long index, int value) { blockDimY(this.segment(), index, value); return this; }

        /// {@return `blockDimZ` at the given index}
        /// @param index the index of the struct buffer
        public int blockDimZAt(long index) { return blockDimZ(this.segment(), index); }
        /// Sets `blockDimZ` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer blockDimZAt(long index, int value) { blockDimZ(this.segment(), index, value); return this; }

        /// {@return `sharedMemBytes` at the given index}
        /// @param index the index of the struct buffer
        public int sharedMemBytesAt(long index) { return sharedMemBytes(this.segment(), index); }
        /// Sets `sharedMemBytes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sharedMemBytesAt(long index, int value) { sharedMemBytes(this.segment(), index, value); return this; }

        /// {@return `paramCount` at the given index}
        /// @param index the index of the struct buffer
        public long paramCountAt(long index) { return paramCount(this.segment(), index); }
        /// Sets `paramCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer paramCountAt(long index, long value) { paramCount(this.segment(), index, value); return this; }

        /// {@return `pParams` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pParamsAt(long index) { return pParams(this.segment(), index); }
        /// Sets `pParams` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pParamsAt(long index, MemorySegment value) { pParams(this.segment(), index, value); return this; }

        /// {@return `extraCount` at the given index}
        /// @param index the index of the struct buffer
        public long extraCountAt(long index) { return extraCount(this.segment(), index); }
        /// Sets `extraCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extraCountAt(long index, long value) { extraCount(this.segment(), index, value); return this; }

        /// {@return `pExtras` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pExtrasAt(long index) { return pExtras(this.segment(), index); }
        /// Sets `pExtras` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pExtrasAt(long index, MemorySegment value) { pExtras(this.segment(), index, value); return this; }

    }
}
