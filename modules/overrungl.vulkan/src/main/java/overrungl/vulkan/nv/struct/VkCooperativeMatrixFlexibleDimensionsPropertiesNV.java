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
/// struct VkCooperativeMatrixFlexibleDimensionsPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t MGranularity;
///     uint32_t NGranularity;
///     uint32_t KGranularity;
///     (int) VkComponentTypeKHR AType;
///     (int) VkComponentTypeKHR BType;
///     (int) VkComponentTypeKHR CType;
///     (int) VkComponentTypeKHR ResultType;
///     (uint32_t) VkBool32 saturatingAccumulation;
///     (int) VkScopeKHR scope;
///     uint32_t workgroupInvocations;
/// };
/// ```
public sealed class VkCooperativeMatrixFlexibleDimensionsPropertiesNV extends GroupType {
    /// The struct layout of `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MGranularity"),
        ValueLayout.JAVA_INT.withName("NGranularity"),
        ValueLayout.JAVA_INT.withName("KGranularity"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("ResultType"),
        ValueLayout.JAVA_INT.withName("saturatingAccumulation"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("workgroupInvocations")
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
    /// The byte offset of `MGranularity`.
    public static final long OFFSET_MGranularity = LAYOUT.byteOffset(PathElement.groupElement("MGranularity"));
    /// The memory layout of `MGranularity`.
    public static final MemoryLayout LAYOUT_MGranularity = LAYOUT.select(PathElement.groupElement("MGranularity"));
    /// The [VarHandle] of `MGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_MGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MGranularity"));
    /// The byte offset of `NGranularity`.
    public static final long OFFSET_NGranularity = LAYOUT.byteOffset(PathElement.groupElement("NGranularity"));
    /// The memory layout of `NGranularity`.
    public static final MemoryLayout LAYOUT_NGranularity = LAYOUT.select(PathElement.groupElement("NGranularity"));
    /// The [VarHandle] of `NGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_NGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NGranularity"));
    /// The byte offset of `KGranularity`.
    public static final long OFFSET_KGranularity = LAYOUT.byteOffset(PathElement.groupElement("KGranularity"));
    /// The memory layout of `KGranularity`.
    public static final MemoryLayout LAYOUT_KGranularity = LAYOUT.select(PathElement.groupElement("KGranularity"));
    /// The [VarHandle] of `KGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_KGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("KGranularity"));
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
    /// The byte offset of `workgroupInvocations`.
    public static final long OFFSET_workgroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("workgroupInvocations"));
    /// The memory layout of `workgroupInvocations`.
    public static final MemoryLayout LAYOUT_workgroupInvocations = LAYOUT.select(PathElement.groupElement("workgroupInvocations"));
    /// The [VarHandle] of `workgroupInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_workgroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupInvocations"));

    /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV copyFrom(VkCooperativeMatrixFlexibleDimensionsPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `MGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int MGranularity(MemorySegment segment, long index) { return (int) VH_MGranularity.get(segment, 0L, index); }
    /// {@return `MGranularity`}
    public int MGranularity() { return MGranularity(this.segment(), 0L); }
    /// Sets `MGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void MGranularity(MemorySegment segment, long index, int value) { VH_MGranularity.set(segment, 0L, index, value); }
    /// Sets `MGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV MGranularity(int value) { MGranularity(this.segment(), 0L, value); return this; }

    /// {@return `NGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int NGranularity(MemorySegment segment, long index) { return (int) VH_NGranularity.get(segment, 0L, index); }
    /// {@return `NGranularity`}
    public int NGranularity() { return NGranularity(this.segment(), 0L); }
    /// Sets `NGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void NGranularity(MemorySegment segment, long index, int value) { VH_NGranularity.set(segment, 0L, index, value); }
    /// Sets `NGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV NGranularity(int value) { NGranularity(this.segment(), 0L, value); return this; }

    /// {@return `KGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int KGranularity(MemorySegment segment, long index) { return (int) VH_KGranularity.get(segment, 0L, index); }
    /// {@return `KGranularity`}
    public int KGranularity() { return KGranularity(this.segment(), 0L); }
    /// Sets `KGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void KGranularity(MemorySegment segment, long index, int value) { VH_KGranularity.set(segment, 0L, index, value); }
    /// Sets `KGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV KGranularity(int value) { KGranularity(this.segment(), 0L, value); return this; }

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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV AType(int value) { AType(this.segment(), 0L, value); return this; }

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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV BType(int value) { BType(this.segment(), 0L, value); return this; }

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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV CType(int value) { CType(this.segment(), 0L, value); return this; }

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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV ResultType(int value) { ResultType(this.segment(), 0L, value); return this; }

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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV saturatingAccumulation(int value) { saturatingAccumulation(this.segment(), 0L, value); return this; }

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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV scope(int value) { scope(this.segment(), 0L, value); return this; }

    /// {@return `workgroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int workgroupInvocations(MemorySegment segment, long index) { return (int) VH_workgroupInvocations.get(segment, 0L, index); }
    /// {@return `workgroupInvocations`}
    public int workgroupInvocations() { return workgroupInvocations(this.segment(), 0L); }
    /// Sets `workgroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void workgroupInvocations(MemorySegment segment, long index, int value) { VH_workgroupInvocations.set(segment, 0L, index, value); }
    /// Sets `workgroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV workgroupInvocations(int value) { workgroupInvocations(this.segment(), 0L, value); return this; }

    /// A buffer of [VkCooperativeMatrixFlexibleDimensionsPropertiesNV].
    public static final class Buffer extends VkCooperativeMatrixFlexibleDimensionsPropertiesNV {
        private final long elementCount;

        /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`
        public VkCooperativeMatrixFlexibleDimensionsPropertiesNV asSlice(long index) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`
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

        /// {@return `MGranularity` at the given index}
        /// @param index the index of the struct buffer
        public int MGranularityAt(long index) { return MGranularity(this.segment(), index); }
        /// Sets `MGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer MGranularityAt(long index, int value) { MGranularity(this.segment(), index, value); return this; }

        /// {@return `NGranularity` at the given index}
        /// @param index the index of the struct buffer
        public int NGranularityAt(long index) { return NGranularity(this.segment(), index); }
        /// Sets `NGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer NGranularityAt(long index, int value) { NGranularity(this.segment(), index, value); return this; }

        /// {@return `KGranularity` at the given index}
        /// @param index the index of the struct buffer
        public int KGranularityAt(long index) { return KGranularity(this.segment(), index); }
        /// Sets `KGranularity` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer KGranularityAt(long index, int value) { KGranularity(this.segment(), index, value); return this; }

        /// {@return `AType` at the given index}
        /// @param index the index of the struct buffer
        public int ATypeAt(long index) { return AType(this.segment(), index); }
        /// Sets `AType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ATypeAt(long index, int value) { AType(this.segment(), index, value); return this; }

        /// {@return `BType` at the given index}
        /// @param index the index of the struct buffer
        public int BTypeAt(long index) { return BType(this.segment(), index); }
        /// Sets `BType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer BTypeAt(long index, int value) { BType(this.segment(), index, value); return this; }

        /// {@return `CType` at the given index}
        /// @param index the index of the struct buffer
        public int CTypeAt(long index) { return CType(this.segment(), index); }
        /// Sets `CType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer CTypeAt(long index, int value) { CType(this.segment(), index, value); return this; }

        /// {@return `ResultType` at the given index}
        /// @param index the index of the struct buffer
        public int ResultTypeAt(long index) { return ResultType(this.segment(), index); }
        /// Sets `ResultType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ResultTypeAt(long index, int value) { ResultType(this.segment(), index, value); return this; }

        /// {@return `saturatingAccumulation` at the given index}
        /// @param index the index of the struct buffer
        public int saturatingAccumulationAt(long index) { return saturatingAccumulation(this.segment(), index); }
        /// Sets `saturatingAccumulation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer saturatingAccumulationAt(long index, int value) { saturatingAccumulation(this.segment(), index, value); return this; }

        /// {@return `scope` at the given index}
        /// @param index the index of the struct buffer
        public int scopeAt(long index) { return scope(this.segment(), index); }
        /// Sets `scope` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer scopeAt(long index, int value) { scope(this.segment(), index, value); return this; }

        /// {@return `workgroupInvocations` at the given index}
        /// @param index the index of the struct buffer
        public int workgroupInvocationsAt(long index) { return workgroupInvocations(this.segment(), index); }
        /// Sets `workgroupInvocations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer workgroupInvocationsAt(long index, int value) { workgroupInvocations(this.segment(), index, value); return this; }

    }
}
