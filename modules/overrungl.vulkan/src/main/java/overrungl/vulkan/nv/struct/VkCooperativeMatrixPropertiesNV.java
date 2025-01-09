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
/// ### DType
/// [VarHandle][#VH_DType] - [Getter][#DType()] - [Setter][#DType(int)]
/// ### scope
/// [VarHandle][#VH_scope] - [Getter][#scope()] - [Setter][#scope(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCooperativeMatrixPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t MSize;
///     uint32_t NSize;
///     uint32_t KSize;
///     VkComponentTypeNV AType;
///     VkComponentTypeNV BType;
///     VkComponentTypeNV CType;
///     VkComponentTypeNV DType;
///     VkScopeNV scope;
/// } VkCooperativeMatrixPropertiesNV;
/// ```
public final class VkCooperativeMatrixPropertiesNV extends Struct {
    /// The struct layout of `VkCooperativeMatrixPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MSize"),
        ValueLayout.JAVA_INT.withName("NSize"),
        ValueLayout.JAVA_INT.withName("KSize"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("DType"),
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
    /// The [VarHandle] of `DType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_DType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("DType"));
    /// The [VarHandle] of `scope` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));

    /// Creates `VkCooperativeMatrixPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkCooperativeMatrixPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCooperativeMatrixPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment); }

    /// Creates `VkCooperativeMatrixPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCooperativeMatrixPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeMatrixPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCooperativeMatrixPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCooperativeMatrixPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCooperativeMatrixPropertiesNV`
    public static VkCooperativeMatrixPropertiesNV alloc(SegmentAllocator allocator) { return new VkCooperativeMatrixPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCooperativeMatrixPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCooperativeMatrixPropertiesNV`
    public static VkCooperativeMatrixPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkCooperativeMatrixPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCooperativeMatrixPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCooperativeMatrixPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkCooperativeMatrixPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV sType(@CType("VkStructureType") int value) { VkCooperativeMatrixPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCooperativeMatrixPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkCooperativeMatrixPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkCooperativeMatrixPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `MSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_MSize(MemorySegment segment, long index) { return (int) VH_MSize.get(segment, 0L, index); }
    /// {@return `MSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_MSize(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_MSize(segment, 0L); }
    /// {@return `MSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int MSizeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_MSize(this.segment(), index); }
    /// {@return `MSize`}
    public @CType("uint32_t") int MSize() { return VkCooperativeMatrixPropertiesNV.get_MSize(this.segment()); }
    /// Sets `MSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_MSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_MSize.set(segment, 0L, index, value); }
    /// Sets `MSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_MSize(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_MSize(segment, 0L, value); }
    /// Sets `MSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV MSizeAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_MSize(this.segment(), index, value); return this; }
    /// Sets `MSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV MSize(@CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_MSize(this.segment(), value); return this; }

    /// {@return `NSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_NSize(MemorySegment segment, long index) { return (int) VH_NSize.get(segment, 0L, index); }
    /// {@return `NSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_NSize(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_NSize(segment, 0L); }
    /// {@return `NSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int NSizeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_NSize(this.segment(), index); }
    /// {@return `NSize`}
    public @CType("uint32_t") int NSize() { return VkCooperativeMatrixPropertiesNV.get_NSize(this.segment()); }
    /// Sets `NSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_NSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_NSize.set(segment, 0L, index, value); }
    /// Sets `NSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_NSize(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_NSize(segment, 0L, value); }
    /// Sets `NSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV NSizeAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_NSize(this.segment(), index, value); return this; }
    /// Sets `NSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV NSize(@CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_NSize(this.segment(), value); return this; }

    /// {@return `KSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_KSize(MemorySegment segment, long index) { return (int) VH_KSize.get(segment, 0L, index); }
    /// {@return `KSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_KSize(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_KSize(segment, 0L); }
    /// {@return `KSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int KSizeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_KSize(this.segment(), index); }
    /// {@return `KSize`}
    public @CType("uint32_t") int KSize() { return VkCooperativeMatrixPropertiesNV.get_KSize(this.segment()); }
    /// Sets `KSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_KSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_KSize.set(segment, 0L, index, value); }
    /// Sets `KSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_KSize(MemorySegment segment, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_KSize(segment, 0L, value); }
    /// Sets `KSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV KSizeAt(long index, @CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_KSize(this.segment(), index, value); return this; }
    /// Sets `KSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV KSize(@CType("uint32_t") int value) { VkCooperativeMatrixPropertiesNV.set_KSize(this.segment(), value); return this; }

    /// {@return `AType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeNV") int get_AType(MemorySegment segment, long index) { return (int) VH_AType.get(segment, 0L, index); }
    /// {@return `AType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeNV") int get_AType(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_AType(segment, 0L); }
    /// {@return `AType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeNV") int ATypeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_AType(this.segment(), index); }
    /// {@return `AType`}
    public @CType("VkComponentTypeNV") int AType() { return VkCooperativeMatrixPropertiesNV.get_AType(this.segment()); }
    /// Sets `AType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_AType(MemorySegment segment, long index, @CType("VkComponentTypeNV") int value) { VH_AType.set(segment, 0L, index, value); }
    /// Sets `AType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_AType(MemorySegment segment, @CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_AType(segment, 0L, value); }
    /// Sets `AType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV ATypeAt(long index, @CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_AType(this.segment(), index, value); return this; }
    /// Sets `AType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV AType(@CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_AType(this.segment(), value); return this; }

    /// {@return `BType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeNV") int get_BType(MemorySegment segment, long index) { return (int) VH_BType.get(segment, 0L, index); }
    /// {@return `BType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeNV") int get_BType(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_BType(segment, 0L); }
    /// {@return `BType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeNV") int BTypeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_BType(this.segment(), index); }
    /// {@return `BType`}
    public @CType("VkComponentTypeNV") int BType() { return VkCooperativeMatrixPropertiesNV.get_BType(this.segment()); }
    /// Sets `BType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_BType(MemorySegment segment, long index, @CType("VkComponentTypeNV") int value) { VH_BType.set(segment, 0L, index, value); }
    /// Sets `BType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_BType(MemorySegment segment, @CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_BType(segment, 0L, value); }
    /// Sets `BType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV BTypeAt(long index, @CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_BType(this.segment(), index, value); return this; }
    /// Sets `BType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV BType(@CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_BType(this.segment(), value); return this; }

    /// {@return `CType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeNV") int get_CType(MemorySegment segment, long index) { return (int) VH_CType.get(segment, 0L, index); }
    /// {@return `CType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeNV") int get_CType(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_CType(segment, 0L); }
    /// {@return `CType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeNV") int CTypeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_CType(this.segment(), index); }
    /// {@return `CType`}
    public @CType("VkComponentTypeNV") int CType() { return VkCooperativeMatrixPropertiesNV.get_CType(this.segment()); }
    /// Sets `CType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_CType(MemorySegment segment, long index, @CType("VkComponentTypeNV") int value) { VH_CType.set(segment, 0L, index, value); }
    /// Sets `CType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_CType(MemorySegment segment, @CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_CType(segment, 0L, value); }
    /// Sets `CType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV CTypeAt(long index, @CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_CType(this.segment(), index, value); return this; }
    /// Sets `CType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV CType(@CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_CType(this.segment(), value); return this; }

    /// {@return `DType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentTypeNV") int get_DType(MemorySegment segment, long index) { return (int) VH_DType.get(segment, 0L, index); }
    /// {@return `DType`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentTypeNV") int get_DType(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_DType(segment, 0L); }
    /// {@return `DType` at the given index}
    /// @param index the index
    public @CType("VkComponentTypeNV") int DTypeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_DType(this.segment(), index); }
    /// {@return `DType`}
    public @CType("VkComponentTypeNV") int DType() { return VkCooperativeMatrixPropertiesNV.get_DType(this.segment()); }
    /// Sets `DType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_DType(MemorySegment segment, long index, @CType("VkComponentTypeNV") int value) { VH_DType.set(segment, 0L, index, value); }
    /// Sets `DType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_DType(MemorySegment segment, @CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_DType(segment, 0L, value); }
    /// Sets `DType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV DTypeAt(long index, @CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_DType(this.segment(), index, value); return this; }
    /// Sets `DType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV DType(@CType("VkComponentTypeNV") int value) { VkCooperativeMatrixPropertiesNV.set_DType(this.segment(), value); return this; }

    /// {@return `scope` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkScopeNV") int get_scope(MemorySegment segment, long index) { return (int) VH_scope.get(segment, 0L, index); }
    /// {@return `scope`}
    /// @param segment the segment of the struct
    public static @CType("VkScopeNV") int get_scope(MemorySegment segment) { return VkCooperativeMatrixPropertiesNV.get_scope(segment, 0L); }
    /// {@return `scope` at the given index}
    /// @param index the index
    public @CType("VkScopeNV") int scopeAt(long index) { return VkCooperativeMatrixPropertiesNV.get_scope(this.segment(), index); }
    /// {@return `scope`}
    public @CType("VkScopeNV") int scope() { return VkCooperativeMatrixPropertiesNV.get_scope(this.segment()); }
    /// Sets `scope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scope(MemorySegment segment, long index, @CType("VkScopeNV") int value) { VH_scope.set(segment, 0L, index, value); }
    /// Sets `scope` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scope(MemorySegment segment, @CType("VkScopeNV") int value) { VkCooperativeMatrixPropertiesNV.set_scope(segment, 0L, value); }
    /// Sets `scope` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV scopeAt(long index, @CType("VkScopeNV") int value) { VkCooperativeMatrixPropertiesNV.set_scope(this.segment(), index, value); return this; }
    /// Sets `scope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeMatrixPropertiesNV scope(@CType("VkScopeNV") int value) { VkCooperativeMatrixPropertiesNV.set_scope(this.segment(), value); return this; }

}
