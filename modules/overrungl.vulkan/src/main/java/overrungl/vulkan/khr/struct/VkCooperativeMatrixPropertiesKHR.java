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
package overrungl.vulkan.khr.struct;

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
/// ### MSize
/// [VarHandle][#VH_MSize] - [Getter][#MSize()] - [Setter][#MSize(int)]
/// ### NSize
/// [VarHandle][#VH_NSize] - [Getter][#NSize()] - [Setter][#NSize(int)]
/// ### KSize
/// [VarHandle][#VH_KSize] - [Getter][#KSize()] - [Setter][#KSize(int)]
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
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCooperativeMatrixPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t MSize;
///     uint32_t NSize;
///     uint32_t KSize;
///     VkComponentTypeKHR AType;
///     VkComponentTypeKHR BType;
///     VkComponentTypeKHR CType;
///     VkComponentTypeKHR ResultType;
///     VkBool32 saturatingAccumulation;
///     VkScopeKHR scope;
/// } VkCooperativeMatrixPropertiesKHR;
/// ```
public final class VkCooperativeMatrixPropertiesKHR extends Struct {
    /// The struct layout of `VkCooperativeMatrixPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `MSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_MSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("MSize"));
    /// The [VarHandle] of `NSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_NSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("NSize"));
    /// The [VarHandle] of `KSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_KSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("KSize"));
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

    /// Creates `VkCooperativeMatrixPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkCooperativeMatrixPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCooperativeMatrixPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment); }

    /// Creates `VkCooperativeMatrixPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCooperativeMatrixPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCooperativeMatrixPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCooperativeMatrixPropertiesKHR`
    public static VkCooperativeMatrixPropertiesKHR alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCooperativeMatrixPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCooperativeMatrixPropertiesKHR`
    public static VkCooperativeMatrixPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkCooperativeMatrixPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCooperativeMatrixPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCooperativeMatrixPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkCooperativeMatrixPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR sType(@CType("VkStructureType") int value) { VkCooperativeMatrixPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkCooperativeMatrixPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `MSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_MSize(MemorySegment segment, long index) { return (int) VH_MSize.get(segment, 0L, index); }
    /// {@return `MSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_MSize(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_MSize(segment, 0L); }
    /// {@return `MSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int MSizeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_MSize(this.segment(), index); }
    /// {@return `MSize`}
    public @CType("uint32_t") int MSize() { return VkCooperativeMatrixPropertiesKHR.get_MSize(this.segment()); }
    /// Sets `MSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_MSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_MSize.set(segment, 0L, index, value); }
    /// Sets `MSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_MSize(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_MSize(segment, 0L, value); }
    /// Sets `MSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR MSizeAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_MSize(this.segment(), index, value); return this; }
    /// Sets `MSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR MSize(@CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_MSize(this.segment(), value); return this; }

    /// {@return `NSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_NSize(MemorySegment segment, long index) { return (int) VH_NSize.get(segment, 0L, index); }
    /// {@return `NSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_NSize(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_NSize(segment, 0L); }
    /// {@return `NSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int NSizeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_NSize(this.segment(), index); }
    /// {@return `NSize`}
    public @CType("uint32_t") int NSize() { return VkCooperativeMatrixPropertiesKHR.get_NSize(this.segment()); }
    /// Sets `NSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_NSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_NSize.set(segment, 0L, index, value); }
    /// Sets `NSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_NSize(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_NSize(segment, 0L, value); }
    /// Sets `NSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR NSizeAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_NSize(this.segment(), index, value); return this; }
    /// Sets `NSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR NSize(@CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_NSize(this.segment(), value); return this; }

    /// {@return `KSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_KSize(MemorySegment segment, long index) { return (int) VH_KSize.get(segment, 0L, index); }
    /// {@return `KSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_KSize(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_KSize(segment, 0L); }
    /// {@return `KSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int KSizeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_KSize(this.segment(), index); }
    /// {@return `KSize`}
    public @CType("uint32_t") int KSize() { return VkCooperativeMatrixPropertiesKHR.get_KSize(this.segment()); }
    /// Sets `KSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_KSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_KSize.set(segment, 0L, index, value); }
    /// Sets `KSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_KSize(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_KSize(segment, 0L, value); }
    /// Sets `KSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR KSizeAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_KSize(this.segment(), index, value); return this; }
    /// Sets `KSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR KSize(@CType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.set_KSize(this.segment(), value); return this; }

    /// {@return `AType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeKHR") int get_AType(MemorySegment segment, long index) { return (int) VH_AType.get(segment, 0L, index); }
    /// {@return `AType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeKHR") int get_AType(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_AType(segment, 0L); }
    /// {@return `AType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeKHR") int ATypeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_AType(this.segment(), index); }
    /// {@return `AType`}
    public @CType("VkComponentTypeKHR") int AType() { return VkCooperativeMatrixPropertiesKHR.get_AType(this.segment()); }
    /// Sets `AType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_AType(MemorySegment segment, long index, @CType("VkComponentTypeKHR") int value) { VH_AType.set(segment, 0L, index, value); }
    /// Sets `AType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_AType(MemorySegment segment, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_AType(segment, 0L, value); }
    /// Sets `AType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR ATypeAt(long index, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_AType(this.segment(), index, value); return this; }
    /// Sets `AType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR AType(@CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_AType(this.segment(), value); return this; }

    /// {@return `BType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeKHR") int get_BType(MemorySegment segment, long index) { return (int) VH_BType.get(segment, 0L, index); }
    /// {@return `BType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeKHR") int get_BType(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_BType(segment, 0L); }
    /// {@return `BType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeKHR") int BTypeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_BType(this.segment(), index); }
    /// {@return `BType`}
    public @CType("VkComponentTypeKHR") int BType() { return VkCooperativeMatrixPropertiesKHR.get_BType(this.segment()); }
    /// Sets `BType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_BType(MemorySegment segment, long index, @CType("VkComponentTypeKHR") int value) { VH_BType.set(segment, 0L, index, value); }
    /// Sets `BType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_BType(MemorySegment segment, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_BType(segment, 0L, value); }
    /// Sets `BType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR BTypeAt(long index, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_BType(this.segment(), index, value); return this; }
    /// Sets `BType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR BType(@CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_BType(this.segment(), value); return this; }

    /// {@return `CType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeKHR") int get_CType(MemorySegment segment, long index) { return (int) VH_CType.get(segment, 0L, index); }
    /// {@return `CType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeKHR") int get_CType(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_CType(segment, 0L); }
    /// {@return `CType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeKHR") int CTypeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_CType(this.segment(), index); }
    /// {@return `CType`}
    public @CType("VkComponentTypeKHR") int CType() { return VkCooperativeMatrixPropertiesKHR.get_CType(this.segment()); }
    /// Sets `CType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_CType(MemorySegment segment, long index, @CType("VkComponentTypeKHR") int value) { VH_CType.set(segment, 0L, index, value); }
    /// Sets `CType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_CType(MemorySegment segment, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_CType(segment, 0L, value); }
    /// Sets `CType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR CTypeAt(long index, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_CType(this.segment(), index, value); return this; }
    /// Sets `CType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR CType(@CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_CType(this.segment(), value); return this; }

    /// {@return `ResultType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeKHR") int get_ResultType(MemorySegment segment, long index) { return (int) VH_ResultType.get(segment, 0L, index); }
    /// {@return `ResultType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeKHR") int get_ResultType(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_ResultType(segment, 0L); }
    /// {@return `ResultType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeKHR") int ResultTypeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_ResultType(this.segment(), index); }
    /// {@return `ResultType`}
    public @CType("VkComponentTypeKHR") int ResultType() { return VkCooperativeMatrixPropertiesKHR.get_ResultType(this.segment()); }
    /// Sets `ResultType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ResultType(MemorySegment segment, long index, @CType("VkComponentTypeKHR") int value) { VH_ResultType.set(segment, 0L, index, value); }
    /// Sets `ResultType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ResultType(MemorySegment segment, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_ResultType(segment, 0L, value); }
    /// Sets `ResultType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR ResultTypeAt(long index, @CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_ResultType(this.segment(), index, value); return this; }
    /// Sets `ResultType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR ResultType(@CType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_ResultType(this.segment(), value); return this; }

    /// {@return `saturatingAccumulation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_saturatingAccumulation(MemorySegment segment, long index) { return (int) VH_saturatingAccumulation.get(segment, 0L, index); }
    /// {@return `saturatingAccumulation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_saturatingAccumulation(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_saturatingAccumulation(segment, 0L); }
    /// {@return `saturatingAccumulation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int saturatingAccumulationAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_saturatingAccumulation(this.segment(), index); }
    /// {@return `saturatingAccumulation`}
    public @CType("VkBool32") int saturatingAccumulation() { return VkCooperativeMatrixPropertiesKHR.get_saturatingAccumulation(this.segment()); }
    /// Sets `saturatingAccumulation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_saturatingAccumulation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_saturatingAccumulation.set(segment, 0L, index, value); }
    /// Sets `saturatingAccumulation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_saturatingAccumulation(MemorySegment segment, @CType("VkBool32") int value) { VkCooperativeMatrixPropertiesKHR.set_saturatingAccumulation(segment, 0L, value); }
    /// Sets `saturatingAccumulation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR saturatingAccumulationAt(long index, @CType("VkBool32") int value) { VkCooperativeMatrixPropertiesKHR.set_saturatingAccumulation(this.segment(), index, value); return this; }
    /// Sets `saturatingAccumulation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR saturatingAccumulation(@CType("VkBool32") int value) { VkCooperativeMatrixPropertiesKHR.set_saturatingAccumulation(this.segment(), value); return this; }

    /// {@return `scope` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkScopeKHR") int get_scope(MemorySegment segment, long index) { return (int) VH_scope.get(segment, 0L, index); }
    /// {@return `scope`}
    /// @param segment the segment of the struct
    public static @CType("VkScopeKHR") int get_scope(MemorySegment segment) { return VkCooperativeMatrixPropertiesKHR.get_scope(segment, 0L); }
    /// {@return `scope` at the given index}
    /// @param index the index
    public @CType("VkScopeKHR") int scopeAt(long index) { return VkCooperativeMatrixPropertiesKHR.get_scope(this.segment(), index); }
    /// {@return `scope`}
    public @CType("VkScopeKHR") int scope() { return VkCooperativeMatrixPropertiesKHR.get_scope(this.segment()); }
    /// Sets `scope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scope(MemorySegment segment, long index, @CType("VkScopeKHR") int value) { VH_scope.set(segment, 0L, index, value); }
    /// Sets `scope` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scope(MemorySegment segment, @CType("VkScopeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_scope(segment, 0L, value); }
    /// Sets `scope` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR scopeAt(long index, @CType("VkScopeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_scope(this.segment(), index, value); return this; }
    /// Sets `scope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesKHR scope(@CType("VkScopeKHR") int value) { VkCooperativeMatrixPropertiesKHR.set_scope(this.segment(), value); return this; }

}
