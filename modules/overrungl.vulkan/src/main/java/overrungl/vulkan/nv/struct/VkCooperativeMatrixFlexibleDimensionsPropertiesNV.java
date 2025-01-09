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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### MGranularity
/// [VarHandle][#VH_MGranularity] - [Getter][#MGranularity()] - [Setter][#MGranularity(int)]
/// ### NGranularity
/// [VarHandle][#VH_NGranularity] - [Getter][#NGranularity()] - [Setter][#NGranularity(int)]
/// ### KGranularity
/// [VarHandle][#VH_KGranularity] - [Getter][#KGranularity()] - [Setter][#KGranularity(int)]
/// ### AType
/// [VarHandle][#VH_AType] - [Getter][#AType()] - [Setter][#AType(int)]
/// ### BType
/// [VarHandle][#VH_BType] - [Getter][#BType()] - [Setter][#BType(int)]
/// ### CType
/// [VarHandle][#VH_CType] - [Getter][#CType()] - [Setter][#CType(int)]
/// ### ResultType
/// [VarHandle][#VH_ResultType] - [Getter][#ResultType()] - [Setter][#ResultType(int)]
/// ### saturatingAccumulation
/// [VarHandle][#VH_saturatingAccumulation] - [Getter][#saturatingAccumulation()] - [Setter][#saturatingAccumulation(int)]
/// ### scope
/// [VarHandle][#VH_scope] - [Getter][#scope()] - [Setter][#scope(int)]
/// ### workgroupInvocations
/// [VarHandle][#VH_workgroupInvocations] - [Getter][#workgroupInvocations()] - [Setter][#workgroupInvocations(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCooperativeMatrixFlexibleDimensionsPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t MGranularity;
///     uint32_t NGranularity;
///     uint32_t KGranularity;
///     VkComponentTypeKHR AType;
///     VkComponentTypeKHR BType;
///     VkComponentTypeKHR CType;
///     VkComponentTypeKHR ResultType;
///     VkBool32 saturatingAccumulation;
///     VkScopeKHR scope;
///     uint32_t workgroupInvocations;
/// } VkCooperativeMatrixFlexibleDimensionsPropertiesNV;
/// ```
public final class VkCooperativeMatrixFlexibleDimensionsPropertiesNV extends Struct {
    /// The struct layout of `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `MGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_MGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MGranularity"));
    /// The [VarHandle] of `NGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_NGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NGranularity"));
    /// The [VarHandle] of `KGranularity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_KGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("KGranularity"));
    /// The [VarHandle] of `AType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_AType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("AType"));
    /// The [VarHandle] of `BType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_BType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("BType"));
    /// The [VarHandle] of `CType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_CType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("CType"));
    /// The [VarHandle] of `ResultType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ResultType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ResultType"));
    /// The [VarHandle] of `saturatingAccumulation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_saturatingAccumulation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("saturatingAccumulation"));
    /// The [VarHandle] of `scope` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));
    /// The [VarHandle] of `workgroupInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_workgroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupInvocations"));

    /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment); }

    /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCooperativeMatrixFlexibleDimensionsPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCooperativeMatrixFlexibleDimensionsPropertiesNV`
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sType(@CType("VkStructureType") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `MGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_MGranularity(MemorySegment segment, long index) { return (int) VH_MGranularity.get(segment, 0L, index); }
    /// {@return `MGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_MGranularity(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_MGranularity(segment, 0L); }
    /// {@return `MGranularity` at the given index}
    /// @param index the index
    public @CType("uint32_t") int MGranularityAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_MGranularity(this.segment(), index); }
    /// {@return `MGranularity`}
    public @CType("uint32_t") int MGranularity() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_MGranularity(this.segment()); }
    /// Sets `MGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_MGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_MGranularity.set(segment, 0L, index, value); }
    /// Sets `MGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_MGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_MGranularity(segment, 0L, value); }
    /// Sets `MGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV MGranularityAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_MGranularity(this.segment(), index, value); return this; }
    /// Sets `MGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV MGranularity(@CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_MGranularity(this.segment(), value); return this; }

    /// {@return `NGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_NGranularity(MemorySegment segment, long index) { return (int) VH_NGranularity.get(segment, 0L, index); }
    /// {@return `NGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_NGranularity(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_NGranularity(segment, 0L); }
    /// {@return `NGranularity` at the given index}
    /// @param index the index
    public @CType("uint32_t") int NGranularityAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_NGranularity(this.segment(), index); }
    /// {@return `NGranularity`}
    public @CType("uint32_t") int NGranularity() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_NGranularity(this.segment()); }
    /// Sets `NGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_NGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_NGranularity.set(segment, 0L, index, value); }
    /// Sets `NGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_NGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_NGranularity(segment, 0L, value); }
    /// Sets `NGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV NGranularityAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_NGranularity(this.segment(), index, value); return this; }
    /// Sets `NGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV NGranularity(@CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_NGranularity(this.segment(), value); return this; }

    /// {@return `KGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_KGranularity(MemorySegment segment, long index) { return (int) VH_KGranularity.get(segment, 0L, index); }
    /// {@return `KGranularity`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_KGranularity(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_KGranularity(segment, 0L); }
    /// {@return `KGranularity` at the given index}
    /// @param index the index
    public @CType("uint32_t") int KGranularityAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_KGranularity(this.segment(), index); }
    /// {@return `KGranularity`}
    public @CType("uint32_t") int KGranularity() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_KGranularity(this.segment()); }
    /// Sets `KGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_KGranularity(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_KGranularity.set(segment, 0L, index, value); }
    /// Sets `KGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_KGranularity(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_KGranularity(segment, 0L, value); }
    /// Sets `KGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV KGranularityAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_KGranularity(this.segment(), index, value); return this; }
    /// Sets `KGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV KGranularity(@CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_KGranularity(this.segment(), value); return this; }

    /// {@return `AType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeKHR") int get_AType(MemorySegment segment, long index) { return (int) VH_AType.get(segment, 0L, index); }
    /// {@return `AType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeKHR") int get_AType(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_AType(segment, 0L); }
    /// {@return `AType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeKHR") int ATypeAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_AType(this.segment(), index); }
    /// {@return `AType`}
    public @CType("VkComponentTypeKHR") int AType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_AType(this.segment()); }
    /// Sets `AType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_AType(MemorySegment segment, long index, @CType("VkComponentTypeKHR") int value) { VH_AType.set(segment, 0L, index, value); }
    /// Sets `AType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_AType(MemorySegment segment, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_AType(segment, 0L, value); }
    /// Sets `AType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV ATypeAt(long index, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_AType(this.segment(), index, value); return this; }
    /// Sets `AType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV AType(@CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_AType(this.segment(), value); return this; }

    /// {@return `BType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeKHR") int get_BType(MemorySegment segment, long index) { return (int) VH_BType.get(segment, 0L, index); }
    /// {@return `BType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeKHR") int get_BType(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_BType(segment, 0L); }
    /// {@return `BType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeKHR") int BTypeAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_BType(this.segment(), index); }
    /// {@return `BType`}
    public @CType("VkComponentTypeKHR") int BType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_BType(this.segment()); }
    /// Sets `BType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_BType(MemorySegment segment, long index, @CType("VkComponentTypeKHR") int value) { VH_BType.set(segment, 0L, index, value); }
    /// Sets `BType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_BType(MemorySegment segment, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_BType(segment, 0L, value); }
    /// Sets `BType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV BTypeAt(long index, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_BType(this.segment(), index, value); return this; }
    /// Sets `BType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV BType(@CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_BType(this.segment(), value); return this; }

    /// {@return `CType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeKHR") int get_CType(MemorySegment segment, long index) { return (int) VH_CType.get(segment, 0L, index); }
    /// {@return `CType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeKHR") int get_CType(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_CType(segment, 0L); }
    /// {@return `CType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeKHR") int CTypeAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_CType(this.segment(), index); }
    /// {@return `CType`}
    public @CType("VkComponentTypeKHR") int CType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_CType(this.segment()); }
    /// Sets `CType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_CType(MemorySegment segment, long index, @CType("VkComponentTypeKHR") int value) { VH_CType.set(segment, 0L, index, value); }
    /// Sets `CType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_CType(MemorySegment segment, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_CType(segment, 0L, value); }
    /// Sets `CType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV CTypeAt(long index, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_CType(this.segment(), index, value); return this; }
    /// Sets `CType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV CType(@CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_CType(this.segment(), value); return this; }

    /// {@return `ResultType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeKHR") int get_ResultType(MemorySegment segment, long index) { return (int) VH_ResultType.get(segment, 0L, index); }
    /// {@return `ResultType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeKHR") int get_ResultType(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_ResultType(segment, 0L); }
    /// {@return `ResultType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeKHR") int ResultTypeAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_ResultType(this.segment(), index); }
    /// {@return `ResultType`}
    public @CType("VkComponentTypeKHR") int ResultType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_ResultType(this.segment()); }
    /// Sets `ResultType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ResultType(MemorySegment segment, long index, @CType("VkComponentTypeKHR") int value) { VH_ResultType.set(segment, 0L, index, value); }
    /// Sets `ResultType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ResultType(MemorySegment segment, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_ResultType(segment, 0L, value); }
    /// Sets `ResultType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV ResultTypeAt(long index, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_ResultType(this.segment(), index, value); return this; }
    /// Sets `ResultType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV ResultType(@CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_ResultType(this.segment(), value); return this; }

    /// {@return `saturatingAccumulation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_saturatingAccumulation(MemorySegment segment, long index) { return (int) VH_saturatingAccumulation.get(segment, 0L, index); }
    /// {@return `saturatingAccumulation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_saturatingAccumulation(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_saturatingAccumulation(segment, 0L); }
    /// {@return `saturatingAccumulation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int saturatingAccumulationAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_saturatingAccumulation(this.segment(), index); }
    /// {@return `saturatingAccumulation`}
    public @CType("VkBool32") int saturatingAccumulation() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_saturatingAccumulation(this.segment()); }
    /// Sets `saturatingAccumulation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_saturatingAccumulation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_saturatingAccumulation.set(segment, 0L, index, value); }
    /// Sets `saturatingAccumulation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_saturatingAccumulation(MemorySegment segment, @CType("VkBool32") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_saturatingAccumulation(segment, 0L, value); }
    /// Sets `saturatingAccumulation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV saturatingAccumulationAt(long index, @CType("VkBool32") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_saturatingAccumulation(this.segment(), index, value); return this; }
    /// Sets `saturatingAccumulation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV saturatingAccumulation(@CType("VkBool32") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_saturatingAccumulation(this.segment(), value); return this; }

    /// {@return `scope` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkScopeKHR") int get_scope(MemorySegment segment, long index) { return (int) VH_scope.get(segment, 0L, index); }
    /// {@return `scope`}
    /// @param segment the segment of the struct
    public static @CType("VkScopeKHR") int get_scope(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_scope(segment, 0L); }
    /// {@return `scope` at the given index}
    /// @param index the index
    public @CType("VkScopeKHR") int scopeAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_scope(this.segment(), index); }
    /// {@return `scope`}
    public @CType("VkScopeKHR") int scope() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_scope(this.segment()); }
    /// Sets `scope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scope(MemorySegment segment, long index, @CType("VkScopeKHR") int value) { VH_scope.set(segment, 0L, index, value); }
    /// Sets `scope` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scope(MemorySegment segment, @CType("VkScopeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_scope(segment, 0L, value); }
    /// Sets `scope` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV scopeAt(long index, @CType("VkScopeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_scope(this.segment(), index, value); return this; }
    /// Sets `scope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV scope(@CType("VkScopeKHR") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_scope(this.segment(), value); return this; }

    /// {@return `workgroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_workgroupInvocations(MemorySegment segment, long index) { return (int) VH_workgroupInvocations.get(segment, 0L, index); }
    /// {@return `workgroupInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_workgroupInvocations(MemorySegment segment) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_workgroupInvocations(segment, 0L); }
    /// {@return `workgroupInvocations` at the given index}
    /// @param index the index
    public @CType("uint32_t") int workgroupInvocationsAt(long index) { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_workgroupInvocations(this.segment(), index); }
    /// {@return `workgroupInvocations`}
    public @CType("uint32_t") int workgroupInvocations() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.get_workgroupInvocations(this.segment()); }
    /// Sets `workgroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_workgroupInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_workgroupInvocations.set(segment, 0L, index, value); }
    /// Sets `workgroupInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_workgroupInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_workgroupInvocations(segment, 0L, value); }
    /// Sets `workgroupInvocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV workgroupInvocationsAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_workgroupInvocations(this.segment(), index, value); return this; }
    /// Sets `workgroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV workgroupInvocations(@CType("uint32_t") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.set_workgroupInvocations(this.segment(), value); return this; }

}
