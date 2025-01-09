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
package overrungl.vulkan.fuchsia.struct;

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
/// ### formatConstraintsCount
/// [VarHandle][#VH_formatConstraintsCount] - [Getter][#formatConstraintsCount()] - [Setter][#formatConstraintsCount(int)]
/// ### pFormatConstraints
/// [VarHandle][#VH_pFormatConstraints] - [Getter][#pFormatConstraints()] - [Setter][#pFormatConstraints(java.lang.foreign.MemorySegment)]
/// ### bufferCollectionConstraints
/// [Byte offset][#OFFSET_bufferCollectionConstraints] - [Memory layout][#ML_bufferCollectionConstraints] - [Getter][#bufferCollectionConstraints()] - [Setter][#bufferCollectionConstraints(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t formatConstraintsCount;
///     const VkImageFormatConstraintsInfoFUCHSIA * pFormatConstraints;
///     VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints;
///     VkImageConstraintsInfoFlagsFUCHSIA flags;
/// } VkImageConstraintsInfoFUCHSIA;
/// ```
public final class VkImageConstraintsInfoFUCHSIA extends Struct {
    /// The struct layout of `VkImageConstraintsInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatConstraintsCount"),
        ValueLayout.ADDRESS.withName("pFormatConstraints"),
        overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `formatConstraintsCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_formatConstraintsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatConstraintsCount"));
    /// The [VarHandle] of `pFormatConstraints` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pFormatConstraints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFormatConstraints"));
    /// The byte offset of `bufferCollectionConstraints`.
    public static final long OFFSET_bufferCollectionConstraints = LAYOUT.byteOffset(PathElement.groupElement("bufferCollectionConstraints"));
    /// The memory layout of `bufferCollectionConstraints`.
    public static final MemoryLayout ML_bufferCollectionConstraints = LAYOUT.select(PathElement.groupElement("bufferCollectionConstraints"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkImageConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkImageConstraintsInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageConstraintsInfoFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment); }

    /// Creates `VkImageConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageConstraintsInfoFUCHSIA ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageConstraintsInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageConstraintsInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageConstraintsInfoFUCHSIA`
    public static VkImageConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImageConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageConstraintsInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageConstraintsInfoFUCHSIA`
    public static VkImageConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkImageConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkImageConstraintsInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageConstraintsInfoFUCHSIA`
    public VkImageConstraintsInfoFUCHSIA asSlice(long index) { return new VkImageConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkImageConstraintsInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageConstraintsInfoFUCHSIA`
    public VkImageConstraintsInfoFUCHSIA asSlice(long index, long count) { return new VkImageConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageConstraintsInfoFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageConstraintsInfoFUCHSIA.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageConstraintsInfoFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageConstraintsInfoFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA sTypeAt(long index, @CType("VkStructureType") int value) { VkImageConstraintsInfoFUCHSIA.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA sType(@CType("VkStructureType") int value) { VkImageConstraintsInfoFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageConstraintsInfoFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageConstraintsInfoFUCHSIA.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageConstraintsInfoFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `formatConstraintsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_formatConstraintsCount(MemorySegment segment, long index) { return (int) VH_formatConstraintsCount.get(segment, 0L, index); }
    /// {@return `formatConstraintsCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_formatConstraintsCount(MemorySegment segment) { return VkImageConstraintsInfoFUCHSIA.get_formatConstraintsCount(segment, 0L); }
    /// {@return `formatConstraintsCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int formatConstraintsCountAt(long index) { return VkImageConstraintsInfoFUCHSIA.get_formatConstraintsCount(this.segment(), index); }
    /// {@return `formatConstraintsCount`}
    public @CType("uint32_t") int formatConstraintsCount() { return VkImageConstraintsInfoFUCHSIA.get_formatConstraintsCount(this.segment()); }
    /// Sets `formatConstraintsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatConstraintsCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_formatConstraintsCount.set(segment, 0L, index, value); }
    /// Sets `formatConstraintsCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatConstraintsCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageConstraintsInfoFUCHSIA.set_formatConstraintsCount(segment, 0L, value); }
    /// Sets `formatConstraintsCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA formatConstraintsCountAt(long index, @CType("uint32_t") int value) { VkImageConstraintsInfoFUCHSIA.set_formatConstraintsCount(this.segment(), index, value); return this; }
    /// Sets `formatConstraintsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA formatConstraintsCount(@CType("uint32_t") int value) { VkImageConstraintsInfoFUCHSIA.set_formatConstraintsCount(this.segment(), value); return this; }

    /// {@return `pFormatConstraints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageFormatConstraintsInfoFUCHSIA *") java.lang.foreign.MemorySegment get_pFormatConstraints(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pFormatConstraints.get(segment, 0L, index); }
    /// {@return `pFormatConstraints`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageFormatConstraintsInfoFUCHSIA *") java.lang.foreign.MemorySegment get_pFormatConstraints(MemorySegment segment) { return VkImageConstraintsInfoFUCHSIA.get_pFormatConstraints(segment, 0L); }
    /// {@return `pFormatConstraints` at the given index}
    /// @param index the index
    public @CType("const VkImageFormatConstraintsInfoFUCHSIA *") java.lang.foreign.MemorySegment pFormatConstraintsAt(long index) { return VkImageConstraintsInfoFUCHSIA.get_pFormatConstraints(this.segment(), index); }
    /// {@return `pFormatConstraints`}
    public @CType("const VkImageFormatConstraintsInfoFUCHSIA *") java.lang.foreign.MemorySegment pFormatConstraints() { return VkImageConstraintsInfoFUCHSIA.get_pFormatConstraints(this.segment()); }
    /// Sets `pFormatConstraints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pFormatConstraints(MemorySegment segment, long index, @CType("const VkImageFormatConstraintsInfoFUCHSIA *") java.lang.foreign.MemorySegment value) { VH_pFormatConstraints.set(segment, 0L, index, value); }
    /// Sets `pFormatConstraints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pFormatConstraints(MemorySegment segment, @CType("const VkImageFormatConstraintsInfoFUCHSIA *") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_pFormatConstraints(segment, 0L, value); }
    /// Sets `pFormatConstraints` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA pFormatConstraintsAt(long index, @CType("const VkImageFormatConstraintsInfoFUCHSIA *") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_pFormatConstraints(this.segment(), index, value); return this; }
    /// Sets `pFormatConstraints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA pFormatConstraints(@CType("const VkImageFormatConstraintsInfoFUCHSIA *") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_pFormatConstraints(this.segment(), value); return this; }

    /// {@return `bufferCollectionConstraints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment get_bufferCollectionConstraints(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), ML_bufferCollectionConstraints); }
    /// {@return `bufferCollectionConstraints`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment get_bufferCollectionConstraints(MemorySegment segment) { return VkImageConstraintsInfoFUCHSIA.get_bufferCollectionConstraints(segment, 0L); }
    /// {@return `bufferCollectionConstraints` at the given index}
    /// @param index the index
    public @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment bufferCollectionConstraintsAt(long index) { return VkImageConstraintsInfoFUCHSIA.get_bufferCollectionConstraints(this.segment(), index); }
    /// {@return `bufferCollectionConstraints`}
    public @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment bufferCollectionConstraints() { return VkImageConstraintsInfoFUCHSIA.get_bufferCollectionConstraints(this.segment()); }
    /// Sets `bufferCollectionConstraints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferCollectionConstraints(MemorySegment segment, long index, @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), ML_bufferCollectionConstraints.byteSize()); }
    /// Sets `bufferCollectionConstraints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferCollectionConstraints(MemorySegment segment, @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_bufferCollectionConstraints(segment, 0L, value); }
    /// Sets `bufferCollectionConstraints` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraintsAt(long index, @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_bufferCollectionConstraints(this.segment(), index, value); return this; }
    /// Sets `bufferCollectionConstraints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA bufferCollectionConstraints(@CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment value) { VkImageConstraintsInfoFUCHSIA.set_bufferCollectionConstraints(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageConstraintsInfoFlagsFUCHSIA") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageConstraintsInfoFlagsFUCHSIA") int get_flags(MemorySegment segment) { return VkImageConstraintsInfoFUCHSIA.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkImageConstraintsInfoFlagsFUCHSIA") int flagsAt(long index) { return VkImageConstraintsInfoFUCHSIA.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkImageConstraintsInfoFlagsFUCHSIA") int flags() { return VkImageConstraintsInfoFUCHSIA.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkImageConstraintsInfoFlagsFUCHSIA") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkImageConstraintsInfoFlagsFUCHSIA") int value) { VkImageConstraintsInfoFUCHSIA.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA flagsAt(long index, @CType("VkImageConstraintsInfoFlagsFUCHSIA") int value) { VkImageConstraintsInfoFUCHSIA.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageConstraintsInfoFUCHSIA flags(@CType("VkImageConstraintsInfoFlagsFUCHSIA") int value) { VkImageConstraintsInfoFUCHSIA.set_flags(this.segment(), value); return this; }

}
