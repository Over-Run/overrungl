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
/// ### handle
/// [VarHandle][#VH_handle] - [Getter][#handle()] - [Setter][#handle(java.lang.foreign.MemorySegment)]
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(int)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(int)]
/// ### usage2
/// [Byte offset][#OFFSET_usage2] - [Memory layout][#ML_usage2] - [Getter][#usage2()] - [Setter][#usage2(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkNativeBufferANDROID {
///     VkStructureType sType;
///     const void * pNext;
///     const void * handle;
///     int stride;
///     int format;
///     int usage;
///     VkNativeBufferUsage2ANDROID usage2;
/// } VkNativeBufferANDROID;
/// ```
public final class VkNativeBufferANDROID extends Struct {
    /// The struct layout of `VkNativeBufferANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("handle"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("usage"),
        overrungl.vulkan.android.struct.VkNativeBufferUsage2ANDROID.LAYOUT.withName("usage2")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The byte offset of `usage2`.
    public static final long OFFSET_usage2 = LAYOUT.byteOffset(PathElement.groupElement("usage2"));
    /// The memory layout of `usage2`.
    public static final MemoryLayout ML_usage2 = LAYOUT.select(PathElement.groupElement("usage2"));

    /// Creates `VkNativeBufferANDROID` with the given segment.
    /// @param segment the memory segment
    public VkNativeBufferANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkNativeBufferANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkNativeBufferANDROID(segment); }

    /// Creates `VkNativeBufferANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkNativeBufferANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkNativeBufferANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferANDROID ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkNativeBufferANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkNativeBufferANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkNativeBufferANDROID`
    public static VkNativeBufferANDROID alloc(SegmentAllocator allocator) { return new VkNativeBufferANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkNativeBufferANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkNativeBufferANDROID`
    public static VkNativeBufferANDROID alloc(SegmentAllocator allocator, long count) { return new VkNativeBufferANDROID(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkNativeBufferANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkNativeBufferANDROID`
    public VkNativeBufferANDROID asSlice(long index) { return new VkNativeBufferANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkNativeBufferANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkNativeBufferANDROID`
    public VkNativeBufferANDROID asSlice(long index, long count) { return new VkNativeBufferANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkNativeBufferANDROID.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkNativeBufferANDROID.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkNativeBufferANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkNativeBufferANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID sTypeAt(long index, @CType("VkStructureType") int value) { VkNativeBufferANDROID.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID sType(@CType("VkStructureType") int value) { VkNativeBufferANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkNativeBufferANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkNativeBufferANDROID.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkNativeBufferANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_handle(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_handle(MemorySegment segment) { return VkNativeBufferANDROID.get_handle(segment, 0L); }
    /// {@return `handle` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment handleAt(long index) { return VkNativeBufferANDROID.get_handle(this.segment(), index); }
    /// {@return `handle`}
    public @CType("const void *") java.lang.foreign.MemorySegment handle() { return VkNativeBufferANDROID.get_handle(this.segment()); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handle(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handle(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_handle(segment, 0L, value); }
    /// Sets `handle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID handleAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_handle(this.segment(), index, value); return this; }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID handle(@CType("const void *") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_handle(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_stride(MemorySegment segment, long index) { return (int) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_stride(MemorySegment segment) { return VkNativeBufferANDROID.get_stride(segment, 0L); }
    /// {@return `stride` at the given index}
    /// @param index the index
    public @CType("int") int strideAt(long index) { return VkNativeBufferANDROID.get_stride(this.segment(), index); }
    /// {@return `stride`}
    public @CType("int") int stride() { return VkNativeBufferANDROID.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("int") int value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("int") int value) { VkNativeBufferANDROID.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID strideAt(long index, @CType("int") int value) { VkNativeBufferANDROID.set_stride(this.segment(), index, value); return this; }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID stride(@CType("int") int value) { VkNativeBufferANDROID.set_stride(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_format(MemorySegment segment) { return VkNativeBufferANDROID.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("int") int formatAt(long index) { return VkNativeBufferANDROID.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("int") int format() { return VkNativeBufferANDROID.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("int") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("int") int value) { VkNativeBufferANDROID.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID formatAt(long index, @CType("int") int value) { VkNativeBufferANDROID.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID format(@CType("int") int value) { VkNativeBufferANDROID.set_format(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int") int get_usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("int") int get_usage(MemorySegment segment) { return VkNativeBufferANDROID.get_usage(segment, 0L); }
    /// {@return `usage` at the given index}
    /// @param index the index
    public @CType("int") int usageAt(long index) { return VkNativeBufferANDROID.get_usage(this.segment(), index); }
    /// {@return `usage`}
    public @CType("int") int usage() { return VkNativeBufferANDROID.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("int") int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("int") int value) { VkNativeBufferANDROID.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID usageAt(long index, @CType("int") int value) { VkNativeBufferANDROID.set_usage(this.segment(), index, value); return this; }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID usage(@CType("int") int value) { VkNativeBufferANDROID.set_usage(this.segment(), value); return this; }

    /// {@return `usage2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkNativeBufferUsage2ANDROID") java.lang.foreign.MemorySegment get_usage2(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_usage2, index), ML_usage2); }
    /// {@return `usage2`}
    /// @param segment the segment of the struct
    public static @CType("VkNativeBufferUsage2ANDROID") java.lang.foreign.MemorySegment get_usage2(MemorySegment segment) { return VkNativeBufferANDROID.get_usage2(segment, 0L); }
    /// {@return `usage2` at the given index}
    /// @param index the index
    public @CType("VkNativeBufferUsage2ANDROID") java.lang.foreign.MemorySegment usage2At(long index) { return VkNativeBufferANDROID.get_usage2(this.segment(), index); }
    /// {@return `usage2`}
    public @CType("VkNativeBufferUsage2ANDROID") java.lang.foreign.MemorySegment usage2() { return VkNativeBufferANDROID.get_usage2(this.segment()); }
    /// Sets `usage2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage2(MemorySegment segment, long index, @CType("VkNativeBufferUsage2ANDROID") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_usage2, index), ML_usage2.byteSize()); }
    /// Sets `usage2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage2(MemorySegment segment, @CType("VkNativeBufferUsage2ANDROID") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_usage2(segment, 0L, value); }
    /// Sets `usage2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID usage2At(long index, @CType("VkNativeBufferUsage2ANDROID") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_usage2(this.segment(), index, value); return this; }
    /// Sets `usage2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferANDROID usage2(@CType("VkNativeBufferUsage2ANDROID") java.lang.foreign.MemorySegment value) { VkNativeBufferANDROID.set_usage2(this.segment(), value); return this; }

}
