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
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAntiLagDataAMD {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkAntiLagModeAMD mode;
///     uint32_t maxFPS;
///     const VkAntiLagPresentationInfoAMD* pPresentationInfo;
/// };
/// ```
public final class VkAntiLagDataAMD extends GroupType {
    /// The struct layout of `VkAntiLagDataAMD`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("maxFPS"),
        ValueLayout.ADDRESS.withName("pPresentationInfo")
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
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The byte offset of `maxFPS`.
    public static final long OFFSET_maxFPS = LAYOUT.byteOffset(PathElement.groupElement("maxFPS"));
    /// The memory layout of `maxFPS`.
    public static final MemoryLayout LAYOUT_maxFPS = LAYOUT.select(PathElement.groupElement("maxFPS"));
    /// The [VarHandle] of `maxFPS` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxFPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFPS"));
    /// The byte offset of `pPresentationInfo`.
    public static final long OFFSET_pPresentationInfo = LAYOUT.byteOffset(PathElement.groupElement("pPresentationInfo"));
    /// The memory layout of `pPresentationInfo`.
    public static final MemoryLayout LAYOUT_pPresentationInfo = LAYOUT.select(PathElement.groupElement("pPresentationInfo"));
    /// The [VarHandle] of `pPresentationInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPresentationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentationInfo"));

    /// Creates `VkAntiLagDataAMD` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAntiLagDataAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAntiLagDataAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAntiLagDataAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagDataAMD(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAntiLagDataAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAntiLagDataAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagDataAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAntiLagDataAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAntiLagDataAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagDataAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAntiLagDataAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAntiLagDataAMD`
    public static VkAntiLagDataAMD alloc(SegmentAllocator allocator) { return new VkAntiLagDataAMD(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAntiLagDataAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAntiLagDataAMD`
    public static VkAntiLagDataAMD alloc(SegmentAllocator allocator, long count) { return new VkAntiLagDataAMD(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAntiLagDataAMD copyFrom(VkAntiLagDataAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAntiLagDataAMD reinterpret(long count) { return new VkAntiLagDataAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAntiLagDataAMD sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAntiLagDataAMD pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// {@return `maxFPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFPS(MemorySegment segment, long index) { return (int) VH_maxFPS.get(segment, 0L, index); }
    /// {@return `maxFPS`}
    public int maxFPS() { return maxFPS(this.segment(), 0L); }
    /// Sets `maxFPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFPS(MemorySegment segment, long index, int value) { VH_maxFPS.set(segment, 0L, index, value); }
    /// Sets `maxFPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD maxFPS(int value) { maxFPS(this.segment(), 0L, value); return this; }

    /// {@return `pPresentationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPresentationInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pPresentationInfo.get(segment, 0L, index); }
    /// {@return `pPresentationInfo`}
    public MemorySegment pPresentationInfo() { return pPresentationInfo(this.segment(), 0L); }
    /// Sets `pPresentationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPresentationInfo(MemorySegment segment, long index, MemorySegment value) { VH_pPresentationInfo.set(segment, 0L, index, value); }
    /// Sets `pPresentationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD pPresentationInfo(MemorySegment value) { pPresentationInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAntiLagDataAMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAntiLagDataAMD`
    public VkAntiLagDataAMD asSlice(long index) { return new VkAntiLagDataAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAntiLagDataAMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAntiLagDataAMD`
    public VkAntiLagDataAMD asSlice(long index, long count) { return new VkAntiLagDataAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAntiLagDataAMD` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAntiLagDataAMD at(long index, Consumer<VkAntiLagDataAMD> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `mode` at the given index}
    /// @param index the index of the struct buffer
    public int modeAt(long index) { return mode(this.segment(), index); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

    /// {@return `maxFPS` at the given index}
    /// @param index the index of the struct buffer
    public int maxFPSAt(long index) { return maxFPS(this.segment(), index); }
    /// Sets `maxFPS` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD maxFPSAt(long index, int value) { maxFPS(this.segment(), index, value); return this; }

    /// {@return `pPresentationInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPresentationInfoAt(long index) { return pPresentationInfo(this.segment(), index); }
    /// Sets `pPresentationInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD pPresentationInfoAt(long index, MemorySegment value) { pPresentationInfo(this.segment(), index, value); return this; }

}
