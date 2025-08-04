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
/// struct VkCooperativeMatrixPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t MSize;
///     uint32_t NSize;
///     uint32_t KSize;
///     (int) VkComponentTypeKHR AType;
///     (int) VkComponentTypeKHR BType;
///     (int) VkComponentTypeKHR CType;
///     (int) VkComponentTypeKHR ResultType;
///     (uint32_t) VkBool32 saturatingAccumulation;
///     (int) VkScopeKHR scope;
/// };
/// ```
public final class VkCooperativeMatrixPropertiesKHR extends GroupType {
    /// The struct layout of `VkCooperativeMatrixPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MSize"),
        ValueLayout.JAVA_INT.withName("NSize"),
        ValueLayout.JAVA_INT.withName("KSize"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("ResultType"),
        ValueLayout.JAVA_INT.withName("saturatingAccumulation"),
        ValueLayout.JAVA_INT.withName("scope")
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
    /// The byte offset of `MSize`.
    public static final long OFFSET_MSize = LAYOUT.byteOffset(PathElement.groupElement("MSize"));
    /// The memory layout of `MSize`.
    public static final MemoryLayout LAYOUT_MSize = LAYOUT.select(PathElement.groupElement("MSize"));
    /// The [VarHandle] of `MSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_MSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MSize"));
    /// The byte offset of `NSize`.
    public static final long OFFSET_NSize = LAYOUT.byteOffset(PathElement.groupElement("NSize"));
    /// The memory layout of `NSize`.
    public static final MemoryLayout LAYOUT_NSize = LAYOUT.select(PathElement.groupElement("NSize"));
    /// The [VarHandle] of `NSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_NSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NSize"));
    /// The byte offset of `KSize`.
    public static final long OFFSET_KSize = LAYOUT.byteOffset(PathElement.groupElement("KSize"));
    /// The memory layout of `KSize`.
    public static final MemoryLayout LAYOUT_KSize = LAYOUT.select(PathElement.groupElement("KSize"));
    /// The [VarHandle] of `KSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_KSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("KSize"));
    /// The byte offset of `AType`.
    public static final long OFFSET_AType = LAYOUT.byteOffset(PathElement.groupElement("AType"));
    /// The memory layout of `AType`.
    public static final MemoryLayout LAYOUT_AType = LAYOUT.select(PathElement.groupElement("AType"));
    /// The [VarHandle] of `AType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_AType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("AType"));
    /// The byte offset of `BType`.
    public static final long OFFSET_BType = LAYOUT.byteOffset(PathElement.groupElement("BType"));
    /// The memory layout of `BType`.
    public static final MemoryLayout LAYOUT_BType = LAYOUT.select(PathElement.groupElement("BType"));
    /// The [VarHandle] of `BType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_BType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("BType"));
    /// The byte offset of `CType`.
    public static final long OFFSET_CType = LAYOUT.byteOffset(PathElement.groupElement("CType"));
    /// The memory layout of `CType`.
    public static final MemoryLayout LAYOUT_CType = LAYOUT.select(PathElement.groupElement("CType"));
    /// The [VarHandle] of `CType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_CType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("CType"));
    /// The byte offset of `ResultType`.
    public static final long OFFSET_ResultType = LAYOUT.byteOffset(PathElement.groupElement("ResultType"));
    /// The memory layout of `ResultType`.
    public static final MemoryLayout LAYOUT_ResultType = LAYOUT.select(PathElement.groupElement("ResultType"));
    /// The [VarHandle] of `ResultType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ResultType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ResultType"));
    /// The byte offset of `saturatingAccumulation`.
    public static final long OFFSET_saturatingAccumulation = LAYOUT.byteOffset(PathElement.groupElement("saturatingAccumulation"));
    /// The memory layout of `saturatingAccumulation`.
    public static final MemoryLayout LAYOUT_saturatingAccumulation = LAYOUT.select(PathElement.groupElement("saturatingAccumulation"));
    /// The [VarHandle] of `saturatingAccumulation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_saturatingAccumulation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("saturatingAccumulation"));
    /// The byte offset of `scope`.
    public static final long OFFSET_scope = LAYOUT.byteOffset(PathElement.groupElement("scope"));
    /// The memory layout of `scope`.
    public static final MemoryLayout LAYOUT_scope = LAYOUT.select(PathElement.groupElement("scope"));
    /// The [VarHandle] of `scope` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));

    /// Creates `VkCooperativeMatrixPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCooperativeMatrixPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCooperativeMatrixPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCooperativeMatrixPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCooperativeMatrixPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCooperativeMatrixPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCooperativeMatrixPropertiesKHR`
    public static VkCooperativeMatrixPropertiesKHR alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCooperativeMatrixPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCooperativeMatrixPropertiesKHR`
    public static VkCooperativeMatrixPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkCooperativeMatrixPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR copyFrom(VkCooperativeMatrixPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCooperativeMatrixPropertiesKHR reinterpret(long count) { return new VkCooperativeMatrixPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCooperativeMatrixPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCooperativeMatrixPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `MSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int MSize(MemorySegment segment, long index) { return (int) VH_MSize.get(segment, 0L, index); }
    /// {@return `MSize`}
    public int MSize() { return MSize(this.segment(), 0L); }
    /// Sets `MSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void MSize(MemorySegment segment, long index, int value) { VH_MSize.set(segment, 0L, index, value); }
    /// Sets `MSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR MSize(int value) { MSize(this.segment(), 0L, value); return this; }

    /// {@return `NSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int NSize(MemorySegment segment, long index) { return (int) VH_NSize.get(segment, 0L, index); }
    /// {@return `NSize`}
    public int NSize() { return NSize(this.segment(), 0L); }
    /// Sets `NSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void NSize(MemorySegment segment, long index, int value) { VH_NSize.set(segment, 0L, index, value); }
    /// Sets `NSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR NSize(int value) { NSize(this.segment(), 0L, value); return this; }

    /// {@return `KSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int KSize(MemorySegment segment, long index) { return (int) VH_KSize.get(segment, 0L, index); }
    /// {@return `KSize`}
    public int KSize() { return KSize(this.segment(), 0L); }
    /// Sets `KSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void KSize(MemorySegment segment, long index, int value) { VH_KSize.set(segment, 0L, index, value); }
    /// Sets `KSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR KSize(int value) { KSize(this.segment(), 0L, value); return this; }

    /// {@return `AType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int AType(MemorySegment segment, long index) { return (int) VH_AType.get(segment, 0L, index); }
    /// {@return `AType`}
    public int AType() { return AType(this.segment(), 0L); }
    /// Sets `AType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void AType(MemorySegment segment, long index, int value) { VH_AType.set(segment, 0L, index, value); }
    /// Sets `AType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR AType(int value) { AType(this.segment(), 0L, value); return this; }

    /// {@return `BType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int BType(MemorySegment segment, long index) { return (int) VH_BType.get(segment, 0L, index); }
    /// {@return `BType`}
    public int BType() { return BType(this.segment(), 0L); }
    /// Sets `BType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void BType(MemorySegment segment, long index, int value) { VH_BType.set(segment, 0L, index, value); }
    /// Sets `BType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR BType(int value) { BType(this.segment(), 0L, value); return this; }

    /// {@return `CType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int CType(MemorySegment segment, long index) { return (int) VH_CType.get(segment, 0L, index); }
    /// {@return `CType`}
    public int CType() { return CType(this.segment(), 0L); }
    /// Sets `CType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void CType(MemorySegment segment, long index, int value) { VH_CType.set(segment, 0L, index, value); }
    /// Sets `CType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR CType(int value) { CType(this.segment(), 0L, value); return this; }

    /// {@return `ResultType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int ResultType(MemorySegment segment, long index) { return (int) VH_ResultType.get(segment, 0L, index); }
    /// {@return `ResultType`}
    public int ResultType() { return ResultType(this.segment(), 0L); }
    /// Sets `ResultType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ResultType(MemorySegment segment, long index, int value) { VH_ResultType.set(segment, 0L, index, value); }
    /// Sets `ResultType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR ResultType(int value) { ResultType(this.segment(), 0L, value); return this; }

    /// {@return `saturatingAccumulation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int saturatingAccumulation(MemorySegment segment, long index) { return (int) VH_saturatingAccumulation.get(segment, 0L, index); }
    /// {@return `saturatingAccumulation`}
    public int saturatingAccumulation() { return saturatingAccumulation(this.segment(), 0L); }
    /// Sets `saturatingAccumulation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void saturatingAccumulation(MemorySegment segment, long index, int value) { VH_saturatingAccumulation.set(segment, 0L, index, value); }
    /// Sets `saturatingAccumulation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR saturatingAccumulation(int value) { saturatingAccumulation(this.segment(), 0L, value); return this; }

    /// {@return `scope` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int scope(MemorySegment segment, long index) { return (int) VH_scope.get(segment, 0L, index); }
    /// {@return `scope`}
    public int scope() { return scope(this.segment(), 0L); }
    /// Sets `scope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scope(MemorySegment segment, long index, int value) { VH_scope.set(segment, 0L, index, value); }
    /// Sets `scope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR scope(int value) { scope(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCooperativeMatrixPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCooperativeMatrixPropertiesKHR`
    public VkCooperativeMatrixPropertiesKHR asSlice(long index) { return new VkCooperativeMatrixPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCooperativeMatrixPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCooperativeMatrixPropertiesKHR`
    public VkCooperativeMatrixPropertiesKHR asSlice(long index, long count) { return new VkCooperativeMatrixPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCooperativeMatrixPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR at(long index, Consumer<VkCooperativeMatrixPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `MSize` at the given index}
    /// @param index the index of the struct buffer
    public int MSizeAt(long index) { return MSize(this.segment(), index); }
    /// Sets `MSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR MSizeAt(long index, int value) { MSize(this.segment(), index, value); return this; }

    /// {@return `NSize` at the given index}
    /// @param index the index of the struct buffer
    public int NSizeAt(long index) { return NSize(this.segment(), index); }
    /// Sets `NSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR NSizeAt(long index, int value) { NSize(this.segment(), index, value); return this; }

    /// {@return `KSize` at the given index}
    /// @param index the index of the struct buffer
    public int KSizeAt(long index) { return KSize(this.segment(), index); }
    /// Sets `KSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR KSizeAt(long index, int value) { KSize(this.segment(), index, value); return this; }

    /// {@return `AType` at the given index}
    /// @param index the index of the struct buffer
    public int ATypeAt(long index) { return AType(this.segment(), index); }
    /// Sets `AType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR ATypeAt(long index, int value) { AType(this.segment(), index, value); return this; }

    /// {@return `BType` at the given index}
    /// @param index the index of the struct buffer
    public int BTypeAt(long index) { return BType(this.segment(), index); }
    /// Sets `BType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR BTypeAt(long index, int value) { BType(this.segment(), index, value); return this; }

    /// {@return `CType` at the given index}
    /// @param index the index of the struct buffer
    public int CTypeAt(long index) { return CType(this.segment(), index); }
    /// Sets `CType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR CTypeAt(long index, int value) { CType(this.segment(), index, value); return this; }

    /// {@return `ResultType` at the given index}
    /// @param index the index of the struct buffer
    public int ResultTypeAt(long index) { return ResultType(this.segment(), index); }
    /// Sets `ResultType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR ResultTypeAt(long index, int value) { ResultType(this.segment(), index, value); return this; }

    /// {@return `saturatingAccumulation` at the given index}
    /// @param index the index of the struct buffer
    public int saturatingAccumulationAt(long index) { return saturatingAccumulation(this.segment(), index); }
    /// Sets `saturatingAccumulation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR saturatingAccumulationAt(long index, int value) { saturatingAccumulation(this.segment(), index, value); return this; }

    /// {@return `scope` at the given index}
    /// @param index the index of the struct buffer
    public int scopeAt(long index) { return scope(this.segment(), index); }
    /// Sets `scope` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR scopeAt(long index, int value) { scope(this.segment(), index, value); return this; }

}
