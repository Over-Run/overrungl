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
package overrungl.vulkan.android.struct;

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
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportAndroidHardwareBufferInfoANDROID {
///     VkStructureType sType;
///     const void * pNext;
///     struct AHardwareBuffer * buffer;
/// } VkImportAndroidHardwareBufferInfoANDROID;
/// ```
public final class VkImportAndroidHardwareBufferInfoANDROID extends Struct {
    /// The struct layout of `VkImportAndroidHardwareBufferInfoANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("buffer")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    /// @param segment the memory segment
    public VkImportAndroidHardwareBufferInfoANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportAndroidHardwareBufferInfoANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportAndroidHardwareBufferInfoANDROID(segment); }

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportAndroidHardwareBufferInfoANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportAndroidHardwareBufferInfoANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportAndroidHardwareBufferInfoANDROID ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImportAndroidHardwareBufferInfoANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImportAndroidHardwareBufferInfoANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportAndroidHardwareBufferInfoANDROID`
    public static VkImportAndroidHardwareBufferInfoANDROID alloc(SegmentAllocator allocator) { return new VkImportAndroidHardwareBufferInfoANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportAndroidHardwareBufferInfoANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportAndroidHardwareBufferInfoANDROID`
    public static VkImportAndroidHardwareBufferInfoANDROID alloc(SegmentAllocator allocator, long count) { return new VkImportAndroidHardwareBufferInfoANDROID(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportAndroidHardwareBufferInfoANDROID.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImportAndroidHardwareBufferInfoANDROID.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportAndroidHardwareBufferInfoANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportAndroidHardwareBufferInfoANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID sTypeAt(long index, @CType("VkStructureType") int value) { VkImportAndroidHardwareBufferInfoANDROID.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID sType(@CType("VkStructureType") int value) { VkImportAndroidHardwareBufferInfoANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImportAndroidHardwareBufferInfoANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImportAndroidHardwareBufferInfoANDROID.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImportAndroidHardwareBufferInfoANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("struct AHardwareBuffer *") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("struct AHardwareBuffer *") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment) { return VkImportAndroidHardwareBufferInfoANDROID.get_buffer(segment, 0L); }
    /// {@return `buffer` at the given index}
    /// @param index the index
    public @CType("struct AHardwareBuffer *") java.lang.foreign.MemorySegment bufferAt(long index) { return VkImportAndroidHardwareBufferInfoANDROID.get_buffer(this.segment(), index); }
    /// {@return `buffer`}
    public @CType("struct AHardwareBuffer *") java.lang.foreign.MemorySegment buffer() { return VkImportAndroidHardwareBufferInfoANDROID.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("struct AHardwareBuffer *") java.lang.foreign.MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("struct AHardwareBuffer *") java.lang.foreign.MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID bufferAt(long index, @CType("struct AHardwareBuffer *") java.lang.foreign.MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_buffer(this.segment(), index, value); return this; }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID buffer(@CType("struct AHardwareBuffer *") java.lang.foreign.MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_buffer(this.segment(), value); return this; }

}