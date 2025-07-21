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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeH265SessionParametersGetInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 writeStdVPS;
///     (uint32_t) VkBool32 writeStdSPS;
///     (uint32_t) VkBool32 writeStdPPS;
///     uint32_t stdVPSId;
///     uint32_t stdSPSId;
///     uint32_t stdPPSId;
/// };
/// ```
public final class VkVideoEncodeH265SessionParametersGetInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265SessionParametersGetInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("writeStdVPS"),
        ValueLayout.JAVA_INT.withName("writeStdSPS"),
        ValueLayout.JAVA_INT.withName("writeStdPPS"),
        ValueLayout.JAVA_INT.withName("stdVPSId"),
        ValueLayout.JAVA_INT.withName("stdSPSId"),
        ValueLayout.JAVA_INT.withName("stdPPSId")
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
    /// The byte offset of `writeStdVPS`.
    public static final long OFFSET_writeStdVPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdVPS"));
    /// The memory layout of `writeStdVPS`.
    public static final MemoryLayout LAYOUT_writeStdVPS = LAYOUT.select(PathElement.groupElement("writeStdVPS"));
    /// The [VarHandle] of `writeStdVPS` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_writeStdVPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdVPS"));
    /// The byte offset of `writeStdSPS`.
    public static final long OFFSET_writeStdSPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdSPS"));
    /// The memory layout of `writeStdSPS`.
    public static final MemoryLayout LAYOUT_writeStdSPS = LAYOUT.select(PathElement.groupElement("writeStdSPS"));
    /// The [VarHandle] of `writeStdSPS` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_writeStdSPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdSPS"));
    /// The byte offset of `writeStdPPS`.
    public static final long OFFSET_writeStdPPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdPPS"));
    /// The memory layout of `writeStdPPS`.
    public static final MemoryLayout LAYOUT_writeStdPPS = LAYOUT.select(PathElement.groupElement("writeStdPPS"));
    /// The [VarHandle] of `writeStdPPS` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_writeStdPPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdPPS"));
    /// The byte offset of `stdVPSId`.
    public static final long OFFSET_stdVPSId = LAYOUT.byteOffset(PathElement.groupElement("stdVPSId"));
    /// The memory layout of `stdVPSId`.
    public static final MemoryLayout LAYOUT_stdVPSId = LAYOUT.select(PathElement.groupElement("stdVPSId"));
    /// The [VarHandle] of `stdVPSId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdVPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdVPSId"));
    /// The byte offset of `stdSPSId`.
    public static final long OFFSET_stdSPSId = LAYOUT.byteOffset(PathElement.groupElement("stdSPSId"));
    /// The memory layout of `stdSPSId`.
    public static final MemoryLayout LAYOUT_stdSPSId = LAYOUT.select(PathElement.groupElement("stdSPSId"));
    /// The [VarHandle] of `stdSPSId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdSPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSId"));
    /// The byte offset of `stdPPSId`.
    public static final long OFFSET_stdPPSId = LAYOUT.byteOffset(PathElement.groupElement("stdPPSId"));
    /// The memory layout of `stdPPSId`.
    public static final MemoryLayout LAYOUT_stdPPSId = LAYOUT.select(PathElement.groupElement("stdPPSId"));
    /// The [VarHandle] of `stdPPSId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdPPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSId"));

    /// Creates `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265SessionParametersGetInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersGetInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param writeStdVPS `writeStdVPS`
    /// @param writeStdSPS `writeStdSPS`
    /// @param writeStdPPS `writeStdPPS`
    /// @param stdVPSId `stdVPSId`
    /// @param stdSPSId `stdSPSId`
    /// @param stdPPSId `stdPPSId`
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int writeStdVPS, int writeStdSPS, int writeStdPPS, int stdVPSId, int stdSPSId, int stdPPSId) {
        return alloc(allocator).sType(sType).pNext(pNext).writeStdVPS(writeStdVPS).writeStdSPS(writeStdSPS).writeStdPPS(writeStdPPS).stdVPSId(stdVPSId).stdSPSId(stdSPSId).stdPPSId(stdPPSId);
    }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param writeStdVPS `writeStdVPS`
    /// @param writeStdSPS `writeStdSPS`
    /// @param writeStdPPS `writeStdPPS`
    /// @param stdVPSId `stdVPSId`
    /// @param stdSPSId `stdSPSId`
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int writeStdVPS, int writeStdSPS, int writeStdPPS, int stdVPSId, int stdSPSId) {
        return alloc(allocator).sType(sType).pNext(pNext).writeStdVPS(writeStdVPS).writeStdSPS(writeStdSPS).writeStdPPS(writeStdPPS).stdVPSId(stdVPSId).stdSPSId(stdSPSId);
    }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param writeStdVPS `writeStdVPS`
    /// @param writeStdSPS `writeStdSPS`
    /// @param writeStdPPS `writeStdPPS`
    /// @param stdVPSId `stdVPSId`
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int writeStdVPS, int writeStdSPS, int writeStdPPS, int stdVPSId) {
        return alloc(allocator).sType(sType).pNext(pNext).writeStdVPS(writeStdVPS).writeStdSPS(writeStdSPS).writeStdPPS(writeStdPPS).stdVPSId(stdVPSId);
    }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param writeStdVPS `writeStdVPS`
    /// @param writeStdSPS `writeStdSPS`
    /// @param writeStdPPS `writeStdPPS`
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int writeStdVPS, int writeStdSPS, int writeStdPPS) {
        return alloc(allocator).sType(sType).pNext(pNext).writeStdVPS(writeStdVPS).writeStdSPS(writeStdSPS).writeStdPPS(writeStdPPS);
    }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param writeStdVPS `writeStdVPS`
    /// @param writeStdSPS `writeStdSPS`
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int writeStdVPS, int writeStdSPS) {
        return alloc(allocator).sType(sType).pNext(pNext).writeStdVPS(writeStdVPS).writeStdSPS(writeStdSPS);
    }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param writeStdVPS `writeStdVPS`
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int writeStdVPS) {
        return alloc(allocator).sType(sType).pNext(pNext).writeStdVPS(writeStdVPS);
    }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoEncodeH265SessionParametersGetInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR copyFrom(VkVideoEncodeH265SessionParametersGetInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265SessionParametersGetInfoKHR reinterpret(long count) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH265SessionParametersGetInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265SessionParametersGetInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `writeStdVPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int writeStdVPS(MemorySegment segment, long index) { return (int) VH_writeStdVPS.get(segment, 0L, index); }
    /// {@return `writeStdVPS`}
    public int writeStdVPS() { return writeStdVPS(this.segment(), 0L); }
    /// Sets `writeStdVPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void writeStdVPS(MemorySegment segment, long index, int value) { VH_writeStdVPS.set(segment, 0L, index, value); }
    /// Sets `writeStdVPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdVPS(int value) { writeStdVPS(this.segment(), 0L, value); return this; }

    /// {@return `writeStdSPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int writeStdSPS(MemorySegment segment, long index) { return (int) VH_writeStdSPS.get(segment, 0L, index); }
    /// {@return `writeStdSPS`}
    public int writeStdSPS() { return writeStdSPS(this.segment(), 0L); }
    /// Sets `writeStdSPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void writeStdSPS(MemorySegment segment, long index, int value) { VH_writeStdSPS.set(segment, 0L, index, value); }
    /// Sets `writeStdSPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdSPS(int value) { writeStdSPS(this.segment(), 0L, value); return this; }

    /// {@return `writeStdPPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int writeStdPPS(MemorySegment segment, long index) { return (int) VH_writeStdPPS.get(segment, 0L, index); }
    /// {@return `writeStdPPS`}
    public int writeStdPPS() { return writeStdPPS(this.segment(), 0L); }
    /// Sets `writeStdPPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void writeStdPPS(MemorySegment segment, long index, int value) { VH_writeStdPPS.set(segment, 0L, index, value); }
    /// Sets `writeStdPPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdPPS(int value) { writeStdPPS(this.segment(), 0L, value); return this; }

    /// {@return `stdVPSId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdVPSId(MemorySegment segment, long index) { return (int) VH_stdVPSId.get(segment, 0L, index); }
    /// {@return `stdVPSId`}
    public int stdVPSId() { return stdVPSId(this.segment(), 0L); }
    /// Sets `stdVPSId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdVPSId(MemorySegment segment, long index, int value) { VH_stdVPSId.set(segment, 0L, index, value); }
    /// Sets `stdVPSId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdVPSId(int value) { stdVPSId(this.segment(), 0L, value); return this; }

    /// {@return `stdSPSId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdSPSId(MemorySegment segment, long index) { return (int) VH_stdSPSId.get(segment, 0L, index); }
    /// {@return `stdSPSId`}
    public int stdSPSId() { return stdSPSId(this.segment(), 0L); }
    /// Sets `stdSPSId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdSPSId(MemorySegment segment, long index, int value) { VH_stdSPSId.set(segment, 0L, index, value); }
    /// Sets `stdSPSId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdSPSId(int value) { stdSPSId(this.segment(), 0L, value); return this; }

    /// {@return `stdPPSId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdPPSId(MemorySegment segment, long index) { return (int) VH_stdPPSId.get(segment, 0L, index); }
    /// {@return `stdPPSId`}
    public int stdPPSId() { return stdPPSId(this.segment(), 0L); }
    /// Sets `stdPPSId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdPPSId(MemorySegment segment, long index, int value) { VH_stdPPSId.set(segment, 0L, index, value); }
    /// Sets `stdPPSId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdPPSId(int value) { stdPPSId(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265SessionParametersGetInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public VkVideoEncodeH265SessionParametersGetInfoKHR asSlice(long index) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265SessionParametersGetInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265SessionParametersGetInfoKHR`
    public VkVideoEncodeH265SessionParametersGetInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265SessionParametersGetInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR at(long index, Consumer<VkVideoEncodeH265SessionParametersGetInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `writeStdVPS` at the given index}
    /// @param index the index of the struct buffer
    public int writeStdVPSAt(long index) { return writeStdVPS(this.segment(), index); }
    /// Sets `writeStdVPS` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdVPSAt(long index, int value) { writeStdVPS(this.segment(), index, value); return this; }

    /// {@return `writeStdSPS` at the given index}
    /// @param index the index of the struct buffer
    public int writeStdSPSAt(long index) { return writeStdSPS(this.segment(), index); }
    /// Sets `writeStdSPS` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdSPSAt(long index, int value) { writeStdSPS(this.segment(), index, value); return this; }

    /// {@return `writeStdPPS` at the given index}
    /// @param index the index of the struct buffer
    public int writeStdPPSAt(long index) { return writeStdPPS(this.segment(), index); }
    /// Sets `writeStdPPS` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdPPSAt(long index, int value) { writeStdPPS(this.segment(), index, value); return this; }

    /// {@return `stdVPSId` at the given index}
    /// @param index the index of the struct buffer
    public int stdVPSIdAt(long index) { return stdVPSId(this.segment(), index); }
    /// Sets `stdVPSId` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdVPSIdAt(long index, int value) { stdVPSId(this.segment(), index, value); return this; }

    /// {@return `stdSPSId` at the given index}
    /// @param index the index of the struct buffer
    public int stdSPSIdAt(long index) { return stdSPSId(this.segment(), index); }
    /// Sets `stdSPSId` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdSPSIdAt(long index, int value) { stdSPSId(this.segment(), index, value); return this; }

    /// {@return `stdPPSId` at the given index}
    /// @param index the index of the struct buffer
    public int stdPPSIdAt(long index) { return stdPPSId(this.segment(), index); }
    /// Sets `stdPPSId` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdPPSIdAt(long index, int value) { stdPPSId(this.segment(), index, value); return this; }

}
