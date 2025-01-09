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
package overrungl.vulkan.huawei.struct;

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
/// ### dynamicMetadataSize
/// [VarHandle][#VH_dynamicMetadataSize] - [Getter][#dynamicMetadataSize()] - [Setter][#dynamicMetadataSize(long)]
/// ### pDynamicMetadata
/// [VarHandle][#VH_pDynamicMetadata] - [Getter][#pDynamicMetadata()] - [Setter][#pDynamicMetadata(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkHdrVividDynamicMetadataHUAWEI {
///     VkStructureType sType;
///     const void * pNext;
///     size_t dynamicMetadataSize;
///     const void * pDynamicMetadata;
/// } VkHdrVividDynamicMetadataHUAWEI;
/// ```
public final class VkHdrVividDynamicMetadataHUAWEI extends Struct {
    /// The struct layout of `VkHdrVividDynamicMetadataHUAWEI`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("dynamicMetadataSize"),
        ValueLayout.ADDRESS.withName("pDynamicMetadata")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `dynamicMetadataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_dynamicMetadataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicMetadataSize"));
    /// The [VarHandle] of `pDynamicMetadata` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDynamicMetadata = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicMetadata"));

    /// Creates `VkHdrVividDynamicMetadataHUAWEI` with the given segment.
    /// @param segment the memory segment
    public VkHdrVividDynamicMetadataHUAWEI(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkHdrVividDynamicMetadataHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrVividDynamicMetadataHUAWEI of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment); }

    /// Creates `VkHdrVividDynamicMetadataHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrVividDynamicMetadataHUAWEI ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkHdrVividDynamicMetadataHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrVividDynamicMetadataHUAWEI ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkHdrVividDynamicMetadataHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHdrVividDynamicMetadataHUAWEI`
    public static VkHdrVividDynamicMetadataHUAWEI alloc(SegmentAllocator allocator) { return new VkHdrVividDynamicMetadataHUAWEI(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkHdrVividDynamicMetadataHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkHdrVividDynamicMetadataHUAWEI`
    public static VkHdrVividDynamicMetadataHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkHdrVividDynamicMetadataHUAWEI(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkHdrVividDynamicMetadataHUAWEI.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkHdrVividDynamicMetadataHUAWEI.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkHdrVividDynamicMetadataHUAWEI.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkHdrVividDynamicMetadataHUAWEI.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI sTypeAt(long index, @CType("VkStructureType") int value) { VkHdrVividDynamicMetadataHUAWEI.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI sType(@CType("VkStructureType") int value) { VkHdrVividDynamicMetadataHUAWEI.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkHdrVividDynamicMetadataHUAWEI.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkHdrVividDynamicMetadataHUAWEI.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkHdrVividDynamicMetadataHUAWEI.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrVividDynamicMetadataHUAWEI.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrVividDynamicMetadataHUAWEI.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrVividDynamicMetadataHUAWEI.set_pNext(this.segment(), value); return this; }

    /// {@return `dynamicMetadataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_dynamicMetadataSize(MemorySegment segment, long index) { return (long) VH_dynamicMetadataSize.get(segment, 0L, index); }
    /// {@return `dynamicMetadataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_dynamicMetadataSize(MemorySegment segment) { return VkHdrVividDynamicMetadataHUAWEI.get_dynamicMetadataSize(segment, 0L); }
    /// {@return `dynamicMetadataSize` at the given index}
    /// @param index the index
    public @CType("size_t") long dynamicMetadataSizeAt(long index) { return VkHdrVividDynamicMetadataHUAWEI.get_dynamicMetadataSize(this.segment(), index); }
    /// {@return `dynamicMetadataSize`}
    public @CType("size_t") long dynamicMetadataSize() { return VkHdrVividDynamicMetadataHUAWEI.get_dynamicMetadataSize(this.segment()); }
    /// Sets `dynamicMetadataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicMetadataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_dynamicMetadataSize.set(segment, 0L, index, value); }
    /// Sets `dynamicMetadataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicMetadataSize(MemorySegment segment, @CType("size_t") long value) { VkHdrVividDynamicMetadataHUAWEI.set_dynamicMetadataSize(segment, 0L, value); }
    /// Sets `dynamicMetadataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI dynamicMetadataSizeAt(long index, @CType("size_t") long value) { VkHdrVividDynamicMetadataHUAWEI.set_dynamicMetadataSize(this.segment(), index, value); return this; }
    /// Sets `dynamicMetadataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI dynamicMetadataSize(@CType("size_t") long value) { VkHdrVividDynamicMetadataHUAWEI.set_dynamicMetadataSize(this.segment(), value); return this; }

    /// {@return `pDynamicMetadata` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pDynamicMetadata(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDynamicMetadata.get(segment, 0L, index); }
    /// {@return `pDynamicMetadata`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pDynamicMetadata(MemorySegment segment) { return VkHdrVividDynamicMetadataHUAWEI.get_pDynamicMetadata(segment, 0L); }
    /// {@return `pDynamicMetadata` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pDynamicMetadataAt(long index) { return VkHdrVividDynamicMetadataHUAWEI.get_pDynamicMetadata(this.segment(), index); }
    /// {@return `pDynamicMetadata`}
    public @CType("const void *") java.lang.foreign.MemorySegment pDynamicMetadata() { return VkHdrVividDynamicMetadataHUAWEI.get_pDynamicMetadata(this.segment()); }
    /// Sets `pDynamicMetadata` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDynamicMetadata(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pDynamicMetadata.set(segment, 0L, index, value); }
    /// Sets `pDynamicMetadata` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDynamicMetadata(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrVividDynamicMetadataHUAWEI.set_pDynamicMetadata(segment, 0L, value); }
    /// Sets `pDynamicMetadata` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadataAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrVividDynamicMetadataHUAWEI.set_pDynamicMetadata(this.segment(), index, value); return this; }
    /// Sets `pDynamicMetadata` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadata(@CType("const void *") java.lang.foreign.MemorySegment value) { VkHdrVividDynamicMetadataHUAWEI.set_pDynamicMetadata(this.segment(), value); return this; }

}